package com.example.embededvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class WebViewActivity extends AppCompatActivity {

    WebView myWebView;
    public static String video_id = "";
    public static String video_url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);



        String iFrameLink = "<iframe width=\"100%\" height=\"35%\" src=\"https://www.youtube.com/embed/"+video_id+"\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        myWebView = findViewById(R.id.myWebView);

        myWebView.loadData(iFrameLink,"text/html","utf-8");

        myWebView.getWebViewClient();
        myWebView.setWebChromeClient(new WebChromeClient());

        myWebView.getSettings().setJavaScriptEnabled(true);


    }
}