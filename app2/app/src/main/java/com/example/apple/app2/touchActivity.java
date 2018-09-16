package com.example.apple.app2;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class touchActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView textView;
    private ImageView imageView;
    private CheckBox chkAndriod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch);

        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text_view);
        imageView.setOnTouchListener(this);



    }
    private float deletaX;
    private float deletaY;



    @Override
    public boolean onTouch(View v,MotionEvent event) {
        float x = event.getRawX();
        float y = event.getRawY();
        //更新坐标的值，显示在TextView
        textView.setText(getResources().getString(R.string.location,x,y));

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) v.getLayoutParams();
        Rect rect = new Rect();
        getWindow().findViewById(getWindow().ID_ANDROID_CONTENT).getDrawingRect(rect);
        //当触点按下时，计算所在点x,y
        //当触点移动时，计算与按下时的位置的偏移，将图片的参数LayoutParams更改为移动后的偏移，重绘图片
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                deletaX = x - params.leftMargin;
                deletaY = y - params.topMargin;
                break;
            case MotionEvent.ACTION_MOVE:
                float distanceX = x-deletaX;
                float distanceY = y- deletaY;
                if (distanceX>=rect.left&&distanceX <= rect.right && distanceY >= rect.top && distanceY <= rect.bottom){
                    params.leftMargin = (int)distanceX;
                    params.topMargin = (int)distanceY;
                    v.setLayoutParams(params);
                }
                break;
            case MotionEvent.ACTION_UP:
                break;

        }
        String location = x+","+y;
        v.invalidate();
        return true;
    }

    private long startTime;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if (System.currentTimeMillis() - startTime > 2000){
                Toast.makeText(touchActivity.this,"再按一次",Toast.LENGTH_LONG).show();
                startTime = System.currentTimeMillis();
            }else{
                finish();
                System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }


}
