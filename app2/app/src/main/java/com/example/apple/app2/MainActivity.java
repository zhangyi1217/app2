package com.example.apple.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btnputong;
    private Button btnliebiao;
    private Button btndanxiang;
    private Button btnduoxiang;
    private Button btnjindutiao;
    private Button btnduquzhong;
    private Button btnzidingyi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.putong:
                System.out.println("putong");

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(Menu.NONE,1,Menu.NONE,"文件");
        SubMenu subMenu = menu.addSubMenu(Menu.NONE,100,Menu.NONE,"字体");
        subMenu.add(Menu.NONE,101,Menu.NONE,"12");
        subMenu.add(Menu.NONE,102,Menu.NONE,"123");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_info_maintain:
                Toast.makeText(MainActivity.this,"个人信息维护",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_setting:
                Toast.makeText(MainActivity.this,"设置",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_questionnaire:
                Toast.makeText(MainActivity.this,"问卷调查",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_about:
                Toast.makeText(MainActivity.this,"关于",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
