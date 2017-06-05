package com.example.android.hexxxmp3player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button startPlayerBT;
    Button stopPlayerBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startPlayerBT = (Button) findViewById(R.id.play_bt);
        startPlayerBT.setOnClickListener(this);

        stopPlayerBT = (Button) findViewById(R.id.stop_bt);
        stopPlayerBT.setOnClickListener(this);
    }

    private Intent getServiceIntent() {
        return new Intent(getBaseContext(), MP3Service.class);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play_bt:
                startService(getServiceIntent());
                break;
            case R.id.stop_bt:
                stopService(getServiceIntent());
                break;
            default:
                return;
        }

    }
}
