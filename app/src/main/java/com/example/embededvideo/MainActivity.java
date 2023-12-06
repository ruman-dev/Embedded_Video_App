package com.example.embededvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText textInputVideoId;
    Button btnGetVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputVideoId = findViewById(R.id.textInputVideoId);

        btnGetVideo = findViewById(R.id.btnGetVideo);

        btnGetVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = textInputVideoId.getText().toString();

                WebViewActivity.video_id = url;

                if(url.isEmpty()){

                    textInputVideoId.setError("Enter valid YouTube Video Id");
                    Toast.makeText(MainActivity.this,"Enter valid YouTube Video Id",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent myIntent = new Intent(MainActivity.this, WebViewActivity.class);
                    startActivity(myIntent);
                }

            }
        });

    }
}