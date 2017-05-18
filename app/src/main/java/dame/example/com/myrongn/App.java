package dame.example.com.myrongn;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by 陈驰 on 2017/5/18.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(getApplicationContext());
    }
}
