package com.example.coverflow;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class TechActivity extends AppCompatActivity {
    Window window;
    ImageView imageView;
   Button textsummary;


    String summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        imageView = findViewById(R.id.img);
        textsummary = findViewById(R.id.txtsummary);



        summary = getIntent().getStringExtra("summary");


        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        imageView.setImageResource(pic);


        textsummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(summary));
                startActivity(intent);

            }
        });


        if (Build.VERSION.SDK_INT >= 22) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
