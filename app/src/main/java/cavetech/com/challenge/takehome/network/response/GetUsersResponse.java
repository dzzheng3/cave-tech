package cavetech.com.challenge.takehome.network.response;

import cavetech.com.challenge.takehome.network.model.User;
import java.util.List;
import org.parceler.Parcel;

@Parcel
public class GetUsersResponse {

    public boolean success;
    public String reference;
    public String message;
    public List<User> Users;
}
