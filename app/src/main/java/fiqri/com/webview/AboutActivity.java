package fiqri.com.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView wv_tampilweb21 = findViewById(R.id.wv_tampilweb2);

        // TODO Load file access
        wv_tampilweb21.loadUrl("file:///android_asset/tentang_pembuat.html");






    }
}
