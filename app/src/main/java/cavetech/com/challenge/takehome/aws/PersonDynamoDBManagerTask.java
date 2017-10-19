package cavetech.com.challenge.takehome.aws;

import android.os.AsyncTask;
import android.os.Bundle;

/**
 * Created by dzzheng3 on 10/18/17.
 */

public class PersonDynamoDBManagerTask extends
        AsyncTask<Bundle, Void, PersonDynamoDBManagerTask.DynamoDBManagerTaskResult> {

    protected DynamoDBManagerTaskResult doInBackground(
            Bundle... bundles) {
        Bundle bundle = bundles[0];
        DynamoDBManagerType  type = (DynamoDBManagerType) bundle.getSerializable("type");
        PersonDynamoDBManager.Person person = (PersonDynamoDBManager.Person) bundle.getSerializable("person");
        String tableStatus = PersonDynamoDBManager.getTestTableStatus();

        DynamoDBManagerTaskResult result = new DynamoDBManagerTaskResult();
        result.setTableStatus(tableStatus);
        result.setTaskType(type);

        if (type == DynamoDBManagerType.CREATE_TABLE) {
//            PersonDynamoDBManager.createTable();
            if (tableStatus.length() == 0) {
                PersonDynamoDBManager.createTable();
                System.out.print("111");
            }
        } else if (type == DynamoDBManagerType.INSERT_USER) {
            if (tableStatus.equalsIgnoreCase("ACTIVE")) {
                PersonDynamoDBManager.insertPersons(person);
            }
        } else if (type == DynamoDBManagerType.LIST_USERS) {
            if (tableStatus.equalsIgnoreCase("ACTIVE")) {
                PersonDynamoDBManager.getPersonList();
            }
        } else if (type == DynamoDBManagerType.CLEAN_UP) {
            if (tableStatus.equalsIgnoreCase("ACTIVE")) {
                PersonDynamoDBManager.cleanUp();
            }
        }

        return result;
    }

    protected void onPostExecute(DynamoDBManagerTaskResult result) {

        if (result.getTaskType() == DynamoDBManagerType.CREATE_TABLE) {

            if (result.getTableStatus().length() != 0) {
//                Toast.makeText(
//                        this,
//                        "The test table already exists.\nTable Status: "
//                                + result.getTableStatus(),
//                        Toast.LENGTH_LONG).show();
            }

        } else if (result.getTaskType() == DynamoDBManagerType.LIST_USERS
                && result.getTableStatus().equalsIgnoreCase("ACTIVE")) {

//            startActivity(new Intent(this,
//                    UserListActivity.class));

        } else if (!result.getTableStatus().equalsIgnoreCase("ACTIVE")) {

//            Toast.makeText(
//                    this,
//                    "The test table is not ready yet.\nTable Status: "
//                            + result.getTableStatus(), Toast.LENGTH_LONG)
//                    .show();
        } else if (result.getTableStatus().equalsIgnoreCase("ACTIVE")
                && result.getTaskType() == DynamoDBManagerType.INSERT_USER) {
//            Toast.makeText(this,
//                    "Users inserted successfully!", Toast.LENGTH_SHORT).show();
        }
    }
    public enum DynamoDBManagerType {
        GET_TABLE_STATUS, CREATE_TABLE, INSERT_USER, LIST_USERS, CLEAN_UP
    }

    public class DynamoDBManagerTaskResult {
        private DynamoDBManagerType taskType;
        private String tableStatus;

        public DynamoDBManagerType getTaskType() {
            return taskType;
        }

        public void setTaskType(DynamoDBManagerType taskType) {
            this.taskType = taskType;
        }

        public String getTableStatus() {
            return tableStatus;
        }

        public void setTableStatus(String tableStatus) {
            this.tableStatus = tableStatus;
        }
    }
}
