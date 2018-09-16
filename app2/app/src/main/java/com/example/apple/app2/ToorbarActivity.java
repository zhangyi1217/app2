package com.example.apple.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class ToorbarActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        toolbar = findViewById(R.id.my_toorbar);
        toolbar.inflateMenu(R.menu.demo);
        toolbar.setTitle("详情页");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setLogo(R.mipmap.ic_notifications);

        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_search:
                        Toast.makeText(ToorbarActivity.this,"toolbar search",1).show();
                        break;
                }
                return false;
            }
        });

       // toolbar.inflateMenu(R.menu.demo);
    }
}
