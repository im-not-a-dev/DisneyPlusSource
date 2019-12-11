package p163g.p449j.p450a.p451a.p457d.p464g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g.j.a.a.d.g.r1 */
public abstract class C11283r1<T> {

    /* renamed from: f */
    private static final Object f26452f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    private static Context f26453g;

    /* renamed from: h */
    private static final AtomicInteger f26454h = new AtomicInteger();

    /* renamed from: a */
    private final C11382y1 f26455a;

    /* renamed from: b */
    private final String f26456b;

    /* renamed from: c */
    private final T f26457c;

    /* renamed from: d */
    private volatile int f26458d;

    /* renamed from: e */
    private volatile T f26459e;

    private C11283r1(C11382y1 y1Var, String str, T t) {
        this.f26458d = -1;
        if (y1Var.f26647a != null) {
            this.f26455a = y1Var;
            this.f26456b = str;
            this.f26457c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public static void m36013a(Context context) {
        synchronized (f26452f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f26453g != context) {
                synchronized (C11108f1.class) {
                    C11108f1.f26189f.clear();
                }
                synchronized (C11369x1.class) {
                    C11369x1.f26596f.clear();
                }
                synchronized (C11241o1.class) {
                    C11241o1.f26384b = null;
                }
                f26454h.incrementAndGet();
                f26453g = context;
            }
        }
    }

    /* renamed from: c */
    static void m36018c() {
        f26454h.incrementAndGet();
    }

    /* renamed from: d */
    private final T m36019d() {
        String str = (String) C11241o1.m35815a(f26453g).mo28505a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C11087e1.f26147c.matcher(str).matches())) {
            C11164j1 j1Var = this.f26455a.f26647a != null ? C11255p1.m35922a(f26453g, this.f26455a.f26647a) ? C11108f1.m35126a(f26453g.getContentResolver(), this.f26455a.f26647a) : null : C11369x1.m36702a(f26453g, (String) null);
            if (j1Var != null) {
                Object a = j1Var.mo28505a(mo28865b());
                if (a != null) {
                    return mo28864a(a);
                }
            }
        } else {
            String str2 = "PhenotypeFlag";
            if (Log.isLoggable(str2, 3)) {
                String str3 = "Bypass reading Phenotype values for flag: ";
                String valueOf = String.valueOf(mo28865b());
                Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            }
        }
        return null;
    }

    /* renamed from: e */
    private final T m36020e() {
        Object a = C11241o1.m35815a(f26453g).mo28505a(m36012a(this.f26455a.f26648b));
        if (a != null) {
            return mo28864a(a);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo28864a(Object obj);

    /* renamed from: b */
    public final String mo28865b() {
        return m36012a(this.f26455a.f26649c);
    }

    /* synthetic */ C11283r1(C11382y1 y1Var, String str, Object obj, C11327u1 u1Var) {
        this(y1Var, str, obj);
    }

    /* renamed from: a */
    private final String m36012a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f26456b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f26456b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final T mo28863a() {
        int i = f26454h.get();
        if (this.f26458d < i) {
            synchronized (this) {
                if (this.f26458d < i) {
                    if (f26453g != null) {
                        T d = m36019d();
                        if (d == null) {
                            d = m36020e();
                            if (d == null) {
                                d = this.f26457c;
                            }
                        }
                        this.f26459e = d;
                        this.f26458d = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f26459e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C11283r1<Long> m36009a(C11382y1 y1Var, String str, long j) {
        return new C11327u1(y1Var, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C11283r1<Boolean> m36011a(C11382y1 y1Var, String str, boolean z) {
        return new C11312t1(y1Var, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C11283r1<Double> m36008a(C11382y1 y1Var, String str, double d) {
        return new C11355w1(y1Var, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C11283r1<String> m36010a(C11382y1 y1Var, String str, String str2) {
        return new C11341v1(y1Var, str, str2);
    }
}
