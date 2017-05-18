package dame.example.com.myrongn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.greenrobot.event.EventBus;


public class ConversationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
    }
    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();

    }
}
