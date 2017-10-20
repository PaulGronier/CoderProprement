package com.example.iem.coderproprement.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement.R;
import com.example.iem.coderproprement.manager.DataManager;
import com.example.iem.coderproprement.manager.DataManagerInterface;

/**
 * Created by iem on 20/10/2017.
 */

public class DetailActivity extends AppCompatActivity {
    DataManagerInterface manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        initManager();
        Button btnRate = (Button) findViewById(R.id.buttonRate);
        final TextView textView = (TextView)findViewById(R.id.text2);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(manager.getRate());

            }
        });
    }

    private void initManager (){
        manager = Application.application().getManager();
    }
}
