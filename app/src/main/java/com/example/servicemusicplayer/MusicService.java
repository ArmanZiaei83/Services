package com.example.servicemusicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.provider.Settings;

import androidx.annotation.Nullable;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MusicService extends Service {
//    private MediaPlayer player ;
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        player.stop();
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        player = MediaPlayer.create(this , Settings.System.DEFAULT_RINGTONE_URI);
//        player.setLooping(true);
//        player.start();
//
//        return START_STICKY;
//    }
}
