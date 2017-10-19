package cavetech.com.challenge.takehome.network;

import android.text.TextUtils;
import cavetech.com.challenge.takehome.network.model.User;
import cavetech.com.challenge.takehome.network.response.GetUsersResponse;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class ApiClient {
    @Inject static ApiService sService;
    @Inject static Gson sGson;

    public static Observable<List<User>> getUsers() {
        final Observable<List<User>> getUsersResponseObservable =
            sService.getUsers().flatMap(new Func1<GetUsersResponse, Observable<List<User>>>() {
                @Override
                public Observable<List<User>> call(GetUsersResponse getUsersResponse) {
                    if (getUsersResponse.success) {
                        return Observable.just(getUsersResponse.Users);
                    } else {
                        final String errorMessage = getUsersResponse.message;
                        if (!TextUtils.isEmpty(errorMessage)) {
                            throw new NetworkError(errorMessage);
                        } else {
                            return null;
                        }
                    }
                }
            });
        return getUsersResponseObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
