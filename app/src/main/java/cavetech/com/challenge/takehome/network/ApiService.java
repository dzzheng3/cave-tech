package cavetech.com.challenge.takehome.network;

import cavetech.com.challenge.takehome.network.response.GetUsersResponse;
import retrofit.http.POST;
import rx.Observable;

public interface ApiService {
    @POST("/Users")
    Observable<GetUsersResponse> getUsers();
}
