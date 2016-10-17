package com.test.tt101703;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void click1(View v)
    {
        Notification.Builder builder = new Notification.Builder(MainActivity.this);
        builder.setContentTitle("Test1")
                .setContentText("This is a test")
                .setSmallIcon(R.mipmap.ic_launcher);
        Notification notification = builder.build();
        nm.notify(123, notification);
    }
}
