package cavetech.com.challenge.takehome.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dji.challenge.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cavetech.com.challenge.takehome.aws.PersonDynamoDBManager;
import cavetech.com.challenge.takehome.aws.PersonDynamoDBManagerTask;

public class AddPersonActivity extends AppCompatActivity {

    @InjectView(R.id.et_username)
    EditText etUsername;
    @InjectView(R.id.et_desc)
    EditText etDesc;
    @InjectView(R.id.fab_add)
    FloatingActionButton fabAdd;
    @InjectView(R.id.btn_create_table)
    Button btnCreateTable;
    @InjectView(R.id.et_num)
    EditText etNum;
    @InjectView(R.id.fab_delete)
    FloatingActionButton fabDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.fab_add)
    public void onAddClicked() {
        String username = etUsername.getText().toString();
        String desc = etDesc.getText().toString();
        int num = Integer.parseInt(etNum.getText().toString());
        PersonDynamoDBManager.Person person = new PersonDynamoDBManager.Person();
        person.setPersonNo(num);
        person.setUsername(username);
        person.setDescription(desc);
        Toast.makeText(this, "Add sucessfully", Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        bundle.putSerializable("type", PersonDynamoDBManagerTask.DynamoDBManagerType.INSERT_USER);
        bundle.putSerializable("person", person);
        new PersonDynamoDBManagerTask()
                .execute(bundle);
    }

    @OnClick(R.id.btn_create_table)
    public void onCreateClicked() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("type", PersonDynamoDBManagerTask.DynamoDBManagerType.CREATE_TABLE);
        new PersonDynamoDBManagerTask()
                .execute(bundle);
    }

    @OnClick(R.id.fab_delete)
    public void onViewClicked() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("type", PersonDynamoDBManagerTask.DynamoDBManagerType.CLEAN_UP);
        new PersonDynamoDBManagerTask()
                .execute(bundle);
    }
}
