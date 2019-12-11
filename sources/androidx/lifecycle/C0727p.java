package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.p */
/* compiled from: LifecycleService */
public class C0727p extends Service implements C0722m {

    /* renamed from: c */
    private final C0739x f3011c = new C0739x(this);

    public C0715i getLifecycle() {
        return this.f3011c.mo4171a();
    }

    public IBinder onBind(Intent intent) {
        this.f3011c.mo4172b();
        return null;
    }

    public void onCreate() {
        this.f3011c.mo4173c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3011c.mo4174d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3011c.mo4175e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
