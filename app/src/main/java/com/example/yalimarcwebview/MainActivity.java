package com.example.yalimarcwebview;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView wV;
    String stringUrl;
    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV = (WebView) findViewById(R.id.wV);
        tv=findViewById(R.id.textView);
        bt=findViewById(R.id.button);
        wV.getSettings().setJavaScriptEnabled(true);
        stringUrl="https://www.ynet.co.il/home/0,7340,L-8,00.html";
        wV.loadUrl(stringUrl);
        wV.setWebViewClient(new MyWebViewClient());

    }

    public void show(View view) {
        wV.setVisibility(WebView.VISIBLE);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }

    }
}