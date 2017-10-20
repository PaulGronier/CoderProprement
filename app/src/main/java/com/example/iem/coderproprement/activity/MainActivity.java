package com.example.iem.coderproprement.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement.R;
import com.example.iem.coderproprement.manager.DataManager;
import com.example.iem.coderproprement.manager.DataManagerInterface;
import com.example.iem.coderproprement.objects.Device;

public class MainActivity extends AppCompatActivity {
    private Button btnConnect;
    private Button btnDetail;
    private TextView textView;
    private DataManagerInterface manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initManager();
        initButtons();
    }

    private void initManager (){
        manager = Application.application().getManager();
    }

    private void initButtons() {
        btnConnect = (Button) findViewById(R.id.buttonConnect);
        textView = (TextView)findViewById(R.id.text);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //textView.setText(DataManager.getInstance().getData());
                manager.connect(new Device(42, "OnePlus"));
                textView.setText(manager.getName());

            }
        });


        btnDetail = (Button) findViewById(R.id.buttonDetail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
