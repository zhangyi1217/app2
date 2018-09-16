//package com.example.apple.app2;
//
//import android.app.Notification;
//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Intent;
//import android.graphics.BitmapFactory;
//import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.RadioGroup;
//import android.widget.RemoteViews;
//import android.widget.TextView;
//
//public class InfoActivity extends AppCompatActivity {
//    private ImageView imageView;
//    private EditText username;
//    private RadioGroup rgSex;
//    private CheckBox cnb_java;
//    private CheckBox cnb_english;
//    private CheckBox cnb_math;
//    private CheckBox cnb_chinese;
//    private Button btn_confirm;
//    private TextView tv_showIp;
//    private EditText et_ip;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_info);
//
//        imageView = findViewById(R.id.img_head);
//        username = findViewById(R.id.et_name);
//        rgSex = findViewById(R.id.rg);
//        cnb_java = findViewById(R.id.chb_java);
//        cnb_english = findViewById(R.id.chb_english);
//        cnb_math = findViewById(R.id.chb_math);
//        tv_showIp=findViewById(R.id.tv_showIp);
//        et_ip=findViewById(R.id.et_ip);
//        btn_confirm = findViewById(R.id.btn_confirm);
//    }
//
//    //自定义通知，针对Andriod 8.0
////    public void sentNormalNotification(){
////        //1.创建通知
////        Notification.Builder builder = null;
////        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
////        PendingIntent pendingIntent = PendingIntent.getActivities(this,0,,PendingIntent.FLAG_CANCEL_CURRENT);
////        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
////        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
////            String id = "normal";
////            NotificationChannel channel = new NotificationChannel("normal","正常通知", NotificationManager.IMPORTANCE_LOW);
////            builder = new Notification.Builder(InfoActivity.this,id);
////            builder.setSmallIcon(R.mipmap.ic_launcher)
////                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
////                    .setContentTitle("普通通知")
////                    .setContentText("通知内容")
////                    .setContentIntent(pendingIntent)
////                    .setAutoCancel(true);
////
////
////        }else{
////            builder = new Notification.Builder(InfoActivity.this);
////            builder.setSmallIcon(R.mipmap.ic_launcher)
////                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
////                    .setContentTitle("普通通知")
////                    .setContentText("通知内容")
////                    .setContentIntent(pendingIntent)
////                    .setAutoCancel(true);
////        }
////        //3.发送
////        manager.notify(1,builder.build());
////
////
////    }
//
//    public void sentFoldNotification(){
//        //1.创建通知
//        Notification.Builder builder = null;
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
//        PendingIntent pendingIntent = PendingIntent.getActivities(this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);
//        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            String id = "normal";
//            NotificationChannel channel = new NotificationChannel("normal","正常通知", NotificationManager.IMPORTANCE_LOW);
//            builder = new Notification.Builder(InfoActivity.this,id);
//            builder.setSmallIcon(R.mipmap.ic_launcher)
//                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
//                    .setContentTitle("折叠通知")
//                    .setContentText("通知内容")
//                    .setContentIntent(pendingIntent)
//                    .setAutoCancel(true);
//
//
//        }else{
//            builder = new Notification.Builder(InfoActivity.this);
//            builder.setSmallIcon(R.mipmap.ic_launcher)
//                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
//                    .setContentTitle("折叠通知")
//                    .setContentText("通知内容")
//                    .setContentIntent(pendingIntent)
//                    .setAutoCancel(true);
//        }
//        //3.发送
//        RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.notification_fold);
//        Notification notification = builder.build();
//        notification.bigContentView = remoteViews;
//        manager.notify(1,builder.build());
//
//
//    }
//
//    //自定义通知，针对Andriod 8.0
//    public void sentHangNotification(){
//        //1.创建通知
//        Notification.Builder builder = null;
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
//        PendingIntent pendingIntent = PendingIntent.getActivities(this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);
//        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            String id = "normal";
//            NotificationChannel channel = new NotificationChannel("normal","正常通知", NotificationManager.IMPORTANCE_LOW);
//            builder = new Notification.Builder(InfoActivity.this,id);
//            builder.setSmallIcon(R.mipmap.ic_launcher)
//                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
//                    .setContentTitle("普通通知")
//                    .setContentText("通知内容")
////                    .setContentIntent(pendingIntent)
//                    .setFullScreenIntent(pendingIntent,true)
//                    .setAutoCancel(true);
//
//
//        }else{
//            builder = new Notification.Builder(InfoActivity.this);
//            builder.setSmallIcon(R.mipmap.ic_launcher)
//                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
//                    .setContentTitle("普通通知")
//                    .setContentText("通知内容")
////                    .setContentIntent(pendingIntent)
//                    .setFullScreenIntent(pendingIntent,true)
//                    .setAutoCancel(true);
//        }
//        //3.发送
//        Intent hIntent = new Intent();
//        hIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        hIntent.setClass(this,app2.class);
//        PendingIntent hangIntent = PendingIntent.getActivity(InfoActivity.this,0,hIntent,PendingIntent.FLAG_CANCEL_CURRENT);
//        manager.notify(1,builder.build());
//
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
