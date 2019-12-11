package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p096e.p121h.p122j.C4025a;

/* renamed from: androidx.core.app.a */
/* compiled from: ActivityCompat */
public class C0460a extends C4025a {

    /* renamed from: c */
    private static C0463c f2079c;

    /* renamed from: androidx.core.app.a$a */
    /* compiled from: ActivityCompat */
    static class C0461a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Activity f2080U;

        /* renamed from: V */
        final /* synthetic */ int f2081V;

        /* renamed from: c */
        final /* synthetic */ String[] f2082c;

        C0461a(String[] strArr, Activity activity, int i) {
            this.f2082c = strArr;
            this.f2080U = activity;
            this.f2081V = i;
        }

        public void run() {
            int[] iArr = new int[this.f2082c.length];
            PackageManager packageManager = this.f2080U.getPackageManager();
            String packageName = this.f2080U.getPackageName();
            int length = this.f2082c.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2082c[i], packageName);
            }
            ((C0462b) this.f2080U).onRequestPermissionsResult(this.f2081V, this.f2082c, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* compiled from: ActivityCompat */
    public interface C0462b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0463c {
        /* renamed from: a */
        boolean mo2609a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo2610a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$d */
    /* compiled from: ActivityCompat */
    public interface C0464d {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: a */
    public static C0463c m2488a() {
        return f2079c;
    }

    /* renamed from: b */
    public static void m2494b(Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0466c.m2500a(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: a */
    public static void m2490a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m2491a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2489a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m2492a(Activity activity, String[] strArr, int i) {
        C0463c cVar = f2079c;
        if (cVar == null || !cVar.mo2610a(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0464d) {
                    ((C0464d) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0462b) {
                new Handler(Looper.getMainLooper()).post(new C0461a(strArr, activity, i));
            }
        }
    }

    /* renamed from: a */
    public static boolean m2493a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
