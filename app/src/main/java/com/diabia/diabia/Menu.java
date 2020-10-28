package com.diabia.diabia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goTest(View v){
        Intent i = new Intent(getApplicationContext(), Test.class);
        startActivity(i);
    }

    public void makeNotification(View v){

        Uri notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "ChIdNotification");
        builder.setSmallIcon(R.drawable.logo_diabetes);
        builder.setContentTitle(getResources().getString(R.string.str_notification_title));
        builder.setContentText(getResources().getString(R.string.str_notification_description));
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);
        builder.setCategory(NotificationCompat.CATEGORY_REMINDER);
        builder.setSound(notificationSound);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(100, builder.build());
    }

}
