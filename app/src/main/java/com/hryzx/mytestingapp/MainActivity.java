package com.hryzx.mytestingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnSetValue;
    private TextView txText;
    private ArrayList<String> names;
    private ImageView imgPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = new ArrayList<>();
        names.add("haris1");
        names.add("haris2");
        names.add("haris3");

        txText = findViewById(R.id.tv_text);
        btnSetValue = findViewById(R.id.btn_set_value);
        btnSetValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txText.setText("coba");
                Log.d("MainActivity", "onClick: " + names.toString());
                StringBuilder name = new StringBuilder();
                for (int i=0;i<3;i++) {
                    name.append(names.get(i)).append("\n");
                }
                txText.setText(name.toString());
            }
        });

        imgPreview = findViewById(R.id.img_preview);
//        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big));
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview);
    }
}