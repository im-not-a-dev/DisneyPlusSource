package net.danlew.android.joda;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

public class TimeZoneChangedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "\"";
        String str2 = "joda-time-android";
        String stringExtra = intent.getStringExtra("time-zone");
        try {
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
            StringBuilder sb = new StringBuilder();
            sb.append("TIMEZONE_CHANGED received, changed default timezone to \"");
            sb.append(stringExtra);
            sb.append(str);
            Log.d(str2, sb.toString());
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not recognize timezone id \"");
            sb2.append(stringExtra);
            sb2.append(str);
            Log.e(str2, sb2.toString(), e);
        }
    }
}
