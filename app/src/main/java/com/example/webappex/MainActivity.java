package com.example.webappex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String a,b,c,urls;
    EditText avar,bvar,cvar;
    WebView wv;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avar=(EditText)findViewById(R.id.avar);
        bvar=(EditText)findViewById(R.id.bvar);
        cvar=(EditText)findViewById(R.id.cvar);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        wv=(WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }



    private class MyWebViewClient extends WebViewClient{
       @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }


    public void solB(View view) {
        a=avar.getText().toString();
        b=bvar.getText().toString();
        c=cvar.getText().toString();
        urls="https://www.google.com/search?ei=E8xAXOLMO4fgkgXJkY4I&q="+a+"x%5E2%2B"+b+"x%2B"+c;
        wv.loadUrl(urls);
        btn2.setEnabled(false);
        btn1.setEnabled(true);


    }
    public void clearB(View view) {
        avar.setText("");
        bvar.setText("");
        cvar.setText("");
        btn2.setEnabled(true);
        btn1.setEnabled(false       );

    }


}
