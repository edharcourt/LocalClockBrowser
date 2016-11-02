package com.example.edharcourt.localbrowser;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TAG = "LocalBrowser";
    private WebView webView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Android controls on the screen
        webView = (WebView) findViewById(R.id.web_view);

        // Turn on JavaScript in the embedded browser
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the web page from a local asset
        webView.loadUrl("file:///android_asset/clock.html");

    }
}
