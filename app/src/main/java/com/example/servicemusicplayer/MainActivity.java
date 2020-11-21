package com.example.servicemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btnStart , btnStop ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnStart = (Button) findViewById(R.id.btnStart);
//        btnStop = (Button) findViewById(R.id.btnStop);
//
//        btnStart.setOnClickListener(this);
//        btnStop.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        if (btnStart.equals(v)) {
//            startService(new Intent(this , MusicService.class));
//        }else if(btnStop.equals(v)){
//            stopService(new Intent(this , MusicService.class));
//        }
//    }
}