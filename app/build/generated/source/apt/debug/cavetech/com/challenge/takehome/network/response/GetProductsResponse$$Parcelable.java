
package cavetech.com.challenge.takehome.network.response;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;

import org.parceler.Generated;
import org.parceler.ParcelWrapper;
import org.parceler.Parcels;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-10-19T17:27-0500")
public class GetUsersResponse$$Parcelable
    implements Parcelable, ParcelWrapper<cavetech.com.challenge.takehome.network.response.GetUsersResponse>
{

    private cavetech.com.challenge.takehome.network.response.GetUsersResponse getUsersResponse$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static GetUsersResponse$$Parcelable.Creator$$1 CREATOR = new GetUsersResponse$$Parcelable.Creator$$1();

    public GetUsersResponse$$Parcelable(android.os.Parcel parcel$$3) {
        getUsersResponse$$0 = new cavetech.com.challenge.takehome.network.response.GetUsersResponse();
        getUsersResponse$$0 .reference = parcel$$3 .readString();
        getUsersResponse$$0 .success = parcel$$3 .createBooleanArray()[ 0 ];
        getUsersResponse$$0 .message = parcel$$3 .readString();
        int int$$0 = parcel$$3 .readInt();
        ArrayList<cavetech.com.challenge.takehome.network.model.User> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<cavetech.com.challenge.takehome.network.model.User>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                list$$0 .add(((ParcelWrapper<cavetech.com.challenge.takehome.network.model.User> ) parcel$$3 .readParcelable(GetUsersResponse$$Parcelable.class.getClassLoader())).getParcel());
            }
        }
        getUsersResponse$$0 .Users = list$$0;
    }

    public GetUsersResponse$$Parcelable(cavetech.com.challenge.takehome.network.response.GetUsersResponse getUsersResponse$$1) {
        getUsersResponse$$0 = getUsersResponse$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$4, int flags) {
        parcel$$4 .writeString(getUsersResponse$$0 .reference);
        parcel$$4 .writeBooleanArray(new boolean[] {getUsersResponse$$0 .success });
        parcel$$4 .writeString(getUsersResponse$$0 .message);
        if (getUsersResponse$$0 .Users == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(getUsersResponse$$0 .Users.size());
            for (cavetech.com.challenge.takehome.network.model.User User$$2 : ((List<cavetech.com.challenge.takehome.network.model.User> ) getUsersResponse$$0 .Users)) {
                parcel$$4 .writeParcelable(Parcels.wrap(User$$2), flags);
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public cavetech.com.challenge.takehome.network.response.GetUsersResponse getParcel() {
        return getUsersResponse$$0;
    }

    private final static class Creator$$1
        implements Creator<GetUsersResponse$$Parcelable>
    {


        @Override
        public GetUsersResponse$$Parcelable createFromParcel(android.os.Parcel parcel$$5) {
            return new GetUsersResponse$$Parcelable(parcel$$5);
        }

        @Override
        public GetUsersResponse$$Parcelable[] newArray(int size) {
            return new GetUsersResponse$$Parcelable[size] ;
        }

    }

}
