package com.apg.library.androidhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.apg.library.corehelper.Apg;
import com.apg.library.corehelper.InputServiceHelper;
import com.apg.library.corehelper.ToolbarHelper;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar now = Calendar.getInstance();
        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DATE, -1);
        Calendar monthAgo = Calendar.getInstance();
        monthAgo.add(Calendar.MONTH, -1);
        Calendar yearAgo = Calendar.getInstance();
        yearAgo.add(Calendar.YEAR, -1);

        Log.e("bankTest", "now: " + Apg.date().getNotificationTimeFacebookStyle(now.getTimeInMillis()));
        Log.e("bankTest", "yesterday: " + Apg.date().getNotificationTimeFacebookStyle(yesterday.getTimeInMillis()));
        Log.e("bankTest", "monthAgo: " + Apg.date().getNotificationTimeFacebookStyle(monthAgo.getTimeInMillis()));
        Log.e("bankTest", "yearAgo: " + Apg.date().getNotificationTimeFacebookStyle(yearAgo.getTimeInMillis()));
    }
}
