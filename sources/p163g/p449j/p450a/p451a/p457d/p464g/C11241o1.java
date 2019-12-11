package p163g.p449j.p450a.p451a.p457d.p464g;

import android.content.Context;
import android.util.Log;
import p096e.p121h.p122j.C4027b;

/* renamed from: g.j.a.a.d.g.o1 */
final class C11241o1 implements C11164j1 {

    /* renamed from: b */
    static C11241o1 f26384b;

    /* renamed from: a */
    private final Context f26385a;

    private C11241o1(Context context) {
        this.f26385a = context;
        this.f26385a.getContentResolver().registerContentObserver(C11087e1.f26145a, true, new C11269q1(this, null));
    }

    /* renamed from: a */
    static C11241o1 m35815a(Context context) {
        C11241o1 o1Var;
        synchronized (C11241o1.class) {
            if (f26384b == null) {
                f26384b = C4027b.m13802b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C11241o1(context) : new C11241o1();
            }
            o1Var = f26384b;
        }
        return o1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo28505a(String str) {
        if (this.f26385a == null) {
            return null;
        }
        try {
            return (String) C11213m1.m35728a(new C11227n1(this, str));
        } catch (SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo28744b(String str) {
        return C11087e1.m35009a(this.f26385a.getContentResolver(), str, (String) null);
    }

    private C11241o1() {
        this.f26385a = null;
    }
}
