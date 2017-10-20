
package org.parceler;

import java.util.HashMap;
import java.util.Map;
import cavetech.com.challenge.takehome.network.model.User;
import cavetech.com.challenge.takehome.network.model.User$$Parcelable;
import cavetech.com.challenge.takehome.network.response.GetUsersResponse;
import cavetech.com.challenge.takehome.network.response.GetUsersResponse$$Parcelable;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-10-20T09:08-0500")
public class Parceler$$Parcels
    implements Repository<org.parceler.Parcels.ParcelableFactory>
{

    private final Map<Class, org.parceler.Parcels.ParcelableFactory> map$$0 = new HashMap<Class, org.parceler.Parcels.ParcelableFactory>();

    public Parceler$$Parcels() {
        map$$0 .put(GetUsersResponse.class, new Parceler$$Parcels.GetUsersResponse$$Parcelable$$0());
        map$$0 .put(User.class, new Parceler$$Parcels.User$$Parcelable$$0());
    }

    public Map<Class, org.parceler.Parcels.ParcelableFactory> get() {
        return map$$0;
    }

    private final static class GetUsersResponse$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<GetUsersResponse>
    {


        @Override
        public GetUsersResponse$$Parcelable buildParcelable(GetUsersResponse input) {
            return new GetUsersResponse$$Parcelable(input);
        }

    }

    private final static class User$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<User>
    {


        @Override
        public User$$Parcelable buildParcelable(User input) {
            return new User$$Parcelable(input);
        }

    }

}
