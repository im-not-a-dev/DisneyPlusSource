package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.b */
/* compiled from: Debug */
public class C0319b {
    /* renamed from: a */
    public static void m1808a(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        String str4 = str3;
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(".(");
            sb.append(stackTrace[i2].getFileName());
            sb.append(":");
            sb.append(stackTrace[i2].getLineNumber());
            sb.append(") ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(str3);
            str4 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(str4);
            sb4.append(sb2);
            sb4.append(str4);
            Log.v(str, sb4.toString());
        }
    }

    /* renamed from: a */
    public static String m1806a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public static String m1807a(MotionLayout motionLayout, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    /* renamed from: a */
    public static String m1805a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }
}
