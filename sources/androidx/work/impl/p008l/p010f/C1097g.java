package androidx.work.impl.p008l.p010f;

import android.content.Context;

/* renamed from: androidx.work.impl.l.f.g */
/* compiled from: Trackers */
public class C1097g {

    /* renamed from: e */
    private static C1097g f4260e;

    /* renamed from: a */
    private C1088a f4261a;

    /* renamed from: b */
    private C1089b f4262b;

    /* renamed from: c */
    private C1093e f4263c;

    /* renamed from: d */
    private C1096f f4264d;

    private C1097g(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4261a = new C1088a(applicationContext);
        this.f4262b = new C1089b(applicationContext);
        this.f4263c = new C1093e(applicationContext);
        this.f4264d = new C1096f(applicationContext);
    }

    /* renamed from: a */
    public static synchronized C1097g m5799a(Context context) {
        C1097g gVar;
        synchronized (C1097g.class) {
            if (f4260e == null) {
                f4260e = new C1097g(context);
            }
            gVar = f4260e;
        }
        return gVar;
    }

    /* renamed from: b */
    public C1089b mo5833b() {
        return this.f4262b;
    }

    /* renamed from: c */
    public C1093e mo5834c() {
        return this.f4263c;
    }

    /* renamed from: d */
    public C1096f mo5835d() {
        return this.f4264d;
    }

    /* renamed from: a */
    public C1088a mo5832a() {
        return this.f4261a;
    }
}
