package com.example.apple.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.ProgressDialog;

public class dialogActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    //1.单选dialog
    Button radioDlg  = (Button)findViewById(R.id.danxuan);


    @Override
    public void onClick(View v) {

    }
}
