package androidx.work.impl.p008l.p010f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1034h;

/* renamed from: androidx.work.impl.l.f.c */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class C1090c<T> extends C1092d<T> {

    /* renamed from: g */
    private static final String f4245g = C1034h.m5551a("BrdcstRcvrCnstrntTrckr");

    /* renamed from: f */
    private final BroadcastReceiver f4246f = new C1091a();

    /* renamed from: androidx.work.impl.l.f.c$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    class C1091a extends BroadcastReceiver {
        C1091a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C1090c.this.mo5820a(context, intent);
            }
        }
    }

    public C1090c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract void mo5820a(Context context, Intent intent);

    /* renamed from: b */
    public void mo5822b() {
        C1034h.m5550a().mo5697a(f4245g, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f4249a.registerReceiver(this.f4246f, mo5821d());
    }

    /* renamed from: c */
    public void mo5823c() {
        C1034h.m5550a().mo5697a(f4245g, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f4249a.unregisterReceiver(this.f4246f);
    }

    /* renamed from: d */
    public abstract IntentFilter mo5821d();
}
