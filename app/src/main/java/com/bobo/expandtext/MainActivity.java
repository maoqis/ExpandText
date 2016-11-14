package com.bobo.expandtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ExpandTextView tv_content = (ExpandTextView) findViewById(R.id.tv_content);


        tv_content.setText(getString(R.string.text2));
        tv_content.setClose();
        tv_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_content.isClose()) {
                    tv_content.setOpen();
                }else if (tv_content.isOpened()){
                    tv_content.setClose();

                }else {
                    tv_content.setOpen();
                }

            }
        });
        /**
         * change text content
         */
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_content.setTextContentAdd2LineListener(getString(R.string.text1));
            }
        });
    }
}
