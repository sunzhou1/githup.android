package com.example.mynotification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {
    //设为全局变量
    private NotificationManager manger;
    private Notification notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实现 NotificationManager
        manger = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //版本判断 如果是8.0及之上 创建
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            //创建 NotificationChannel
            // id要和 channelId 一致
            NotificationChannel channel = new NotificationChannel("leo", "测试通知",
                    NotificationManager.IMPORTANCE_HIGH);
            manger.createNotificationChannel(channel);
        }
        // 设置点击通知后跳转意图
        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        //实现 Notification
        notification = new NotificationCompat.Builder(this,"leo")
                .setContentTitle("官方通知")
                .setContentText("世界那么大想去走走嘛！！！")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                 //设置上诉三个 就会有通知
                 //设置通知栏图片
                 .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.ceshi1))
                 //小图标颜色
                 .setColor(Color.parseColor("#ff0000"))
                // 设置点击通知后跳转意图
                 .setContentIntent(pendingIntent)
                //点击取消通知
                .setAutoCancel(true)
                .build();

    }
    public void sendNotification(View view){
        manger.notify(1, notification);
    }
    public void cace1Notification(View view){

    }
}