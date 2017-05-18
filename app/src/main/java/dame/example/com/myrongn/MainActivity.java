package dame.example.com.myrongn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity {

 /*   private String tokenZhangSan = "S2dovLNGO4Nw7FOZBJEZYWe0UN+iKpFef3xOIg1V7wQQaFZRt0MK9IOAZQT6OPmRMiv59GOzfXgRN4Ta4Pvq1Q==";
    private String tokenLiSi = "HzdG+Br4JpVxzQlHK0pU1Ypj6FUkyMs+BqG1RU3tIDgTL4IYzWWAC0lBS96EggXtkm+kuggAvcJrcxf+h3f1bQ==";*/
   /* private String tokenZhangSan ="ExlfdTvTkey0CxCAeVD/+6vYZ79sSWzRtohOTHpEkJQJ81wxq9GUDmiC68XxBlY3ffhCwlIi3iCdn2f5rJm2OQ==";
    private String tokenLiSi ="oCseWHu6TflPqU2vxkjFF6vYZ79sSWzRtohOTHpEkJQJ81wxq9GUDtv8AGawXrhUPTvzWJQj+HaTrayHYq2kVQ=="*/;
    private String tokenLiSi ="OdUDBQ0Yt/V34RQftkgMTGe0UN+iKpFef3xOIg1V7wQQaFZRt0MK9PdUgnZ2RaOyzMBKtRxyNSdgnH9lin+TWg==";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // login(tokenZhangSan);
        login2(tokenLiSi);
        findViewById(R.id.m_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RongIM.getInstance() != null) {
                      RongIM.getInstance().startPrivateChat(MainActivity.this, "1111", "");
                  //  RongIM.getInstance().startPrivateChat(MainActivity.this, "2222", "");
                }
            }
        });
      findViewById(R.id.t_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RongIM.getInstance() != null) {
                         RongIM.getInstance().startPrivateChat(MainActivity.this, "1111", "");
          //   RongIM.getInstance().startPrivateChat(MainActivity.this, "2222", "");
                }
            }
        });
    }

    /*
* 登录融入
* */
  /*  private void login(String token) {
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                Log.e("融云登录：", "Token过期");
            }

            @Override
            public void onSuccess(String s) {
                Log.e("融云登录：", "登录成功");
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.e("融云登录：", "登录失败：" + errorCode);
            }
        });
    }*/
    private void login2(String token) {
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                Log.e("融云登录：", "Token过期");
            }

            @Override
            public void onSuccess(String s) {
                Log.e("融云登录：", "登录成功");
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.e("融云登录：", "登录失败：" + errorCode);
            }
        });
    }

}