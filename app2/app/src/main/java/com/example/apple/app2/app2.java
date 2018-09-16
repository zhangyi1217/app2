package com.example.apple.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class app2 extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private Button btnRegister;
    private Button btnTrue;
    private EditText password;
    private EditText username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);

        btnLogin = (Button)findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
        username = findViewById(R.id.ev_userName);
        password = findViewById(R.id.ev_password);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_register:
                break;
            case R.id.btn_confirm:
                personInfo();
                break;
        }
    }

    private void login(){
        String name = username.getText().toString().trim();
        String pwd = password.getText().toString().trim();
        if(name.equals("zhangyi")&&pwd.equals("123")){
            Toast.makeText(app2.this,"登录成功！",1).show();
            setContentView(R.layout.personal);
        }else{
            Toast.makeText(app2.this,"用户名或密码错误！",1).show();
        }

    }

    private void register(){

    }

    private void personInfo(){

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                float x = event.getX();
                float y = event.getY();
                String location = "X轴坐标"+x+"，y轴坐标"+y;
                Toast.makeText(app2.this,location,1).show();
        }

        return super.onTouchEvent(event);

    }

}
