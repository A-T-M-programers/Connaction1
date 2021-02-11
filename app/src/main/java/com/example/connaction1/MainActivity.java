package com.example.connaction1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ListView lv;
    SimpleAdapter AD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,creataccount.class);
                startActivity(intent);
            }
        });
/*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Map<String,String>> Mydatalist=null;
                GetData myData = new GetData();
                Mydatalist= myData.getdata();

                String[] fromwhere = {"ID","Name","Email","Password","Description","Birthday","CheckEmail","Level"};

                int[] viewwhere = {R.id.ID,R.id.Name,R.id.Email,R.id.Password,R.id.Description,R.id.Birthday,R.id.CheckEmail,R.id.Level};

                AD = new SimpleAdapter(MainActivity.this,Mydatalist,R.layout.listtemplate,fromwhere,viewwhere);

                lv.setAdapter(AD);

            }
        });*/
    }
}