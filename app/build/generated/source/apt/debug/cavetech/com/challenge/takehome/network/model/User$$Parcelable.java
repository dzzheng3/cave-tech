
package cavetech.com.challenge.takehome.network.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-10-20T09:08-0500")
public class User$$Parcelable
    implements Parcelable, ParcelWrapper<cavetech.com.challenge.takehome.network.model.User>
{

    private cavetech.com.challenge.takehome.network.model.User user$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static User$$Parcelable.Creator$$0 CREATOR = new User$$Parcelable.Creator$$0();

    public User$$Parcelable(android.os.Parcel parcel$$0) {
        user$$0 = new cavetech.com.challenge.takehome.network.model.User();
        user$$0 .image = parcel$$0 .readString();
        user$$0 .name = parcel$$0 .readString();
        user$$0 .video = parcel$$0 .readString();
        user$$0 .descriptions = parcel$$0 .readString();
    }

    public User$$Parcelable(cavetech.com.challenge.takehome.network.model.User user$$1) {
        user$$0 = user$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        parcel$$1 .writeString(user$$0 .image);
        parcel$$1 .writeString(user$$0 .name);
        parcel$$1 .writeString(user$$0 .video);
        parcel$$1 .writeString(user$$0 .descriptions);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public cavetech.com.challenge.takehome.network.model.User getParcel() {
        return user$$0;
    }

    private final static class Creator$$0
        implements Creator<User$$Parcelable>
    {


        @Override
        public User$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new User$$Parcelable(parcel$$2);
        }

        @Override
        public User$$Parcelable[] newArray(int size) {
            return new User$$Parcelable[size] ;
        }

    }

}
