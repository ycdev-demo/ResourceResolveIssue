package me.ycdev.android.demo.resourceresolve;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView localeView = findViewById(R.id.locale);
        localeView.setText(getSystemLocaleInfo());
    }

    private String getSystemLocaleInfo() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            //noinspection deprecation
            return getResources().getConfiguration().locale.toString();
        } else {
            return getResources().getConfiguration().getLocales().toString();
        }
    }
}
