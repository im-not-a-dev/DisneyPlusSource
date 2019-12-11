package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
public final class C10099k3 extends C10101k5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f23591c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f23592d = -1;

    /* renamed from: e */
    private String f23593e;

    /* renamed from: f */
    private final C10121m3 f23594f = new C10121m3(this, 6, false, false);

    /* renamed from: g */
    private final C10121m3 f23595g = new C10121m3(this, 6, true, false);

    /* renamed from: h */
    private final C10121m3 f23596h = new C10121m3(this, 6, false, true);

    /* renamed from: i */
    private final C10121m3 f23597i = new C10121m3(this, 5, false, false);

    /* renamed from: j */
    private final C10121m3 f23598j = new C10121m3(this, 5, true, false);

    /* renamed from: k */
    private final C10121m3 f23599k = new C10121m3(this, 5, false, true);

    /* renamed from: l */
    private final C10121m3 f23600l = new C10121m3(this, 4, false, false);

    /* renamed from: m */
    private final C10121m3 f23601m = new C10121m3(this, 3, false, false);

    /* renamed from: n */
    private final C10121m3 f23602n = new C10121m3(this, 2, false, false);

    C10099k3(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: D */
    private final String m31419D() {
        String str;
        synchronized (this) {
            if (this.f23593e == null) {
                if (this.f23701a.mo26038p() != null) {
                    this.f23593e = this.f23701a.mo26038p();
                } else {
                    this.f23593e = C10083i9.m31360u();
                }
            }
            str = this.f23593e;
        }
        return str;
    }

    /* renamed from: a */
    protected static Object m31423a(String str) {
        if (str == null) {
            return null;
        }
        return new C10110l3(str);
    }

    /* renamed from: b */
    private static String m31427b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C10121m3 mo25868A() {
        return this.f23601m;
    }

    /* renamed from: B */
    public final C10121m3 mo25869B() {
        return this.f23602n;
    }

    /* renamed from: C */
    public final String mo25870C() {
        Pair<String, Long> a = mo25899f().f23932d.mo26180a();
        if (a == null || a == C10196t3.f23930A) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return false;
    }

    /* renamed from: t */
    public final C10121m3 mo25874t() {
        return this.f23594f;
    }

    /* renamed from: u */
    public final C10121m3 mo25875u() {
        return this.f23595g;
    }

    /* renamed from: v */
    public final C10121m3 mo25876v() {
        return this.f23596h;
    }

    /* renamed from: w */
    public final C10121m3 mo25877w() {
        return this.f23597i;
    }

    /* renamed from: x */
    public final C10121m3 mo25878x() {
        return this.f23598j;
    }

    /* renamed from: y */
    public final C10121m3 mo25879y() {
        return this.f23599k;
    }

    /* renamed from: z */
    public final C10121m3 mo25880z() {
        return this.f23600l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25872a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo25873a(i)) {
            mo25871a(i, m31425a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C9908u.m30853a(str);
            C10078i4 l = this.f23701a.mo26034l();
            if (l == null) {
                mo25871a(6, "Scheduler not set. Not logging error/warn");
            } else if (!l.mo25883o()) {
                mo25871a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                C10088j3 j3Var = new C10088j3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                l.mo25800a((Runnable) j3Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25873a(int i) {
        return Log.isLoggable(m31419D(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25871a(int i, String str) {
        Log.println(i, m31419D(), str);
    }

    /* renamed from: a */
    static String m31425a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m31424a(z, obj);
        String a2 = m31424a(z, obj2);
        String a3 = m31424a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m31424a(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m31427b(C10145o4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null && m31427b(className).equals(b)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C10110l3) {
                return ((C10110l3) obj).f23697a;
            } else {
                if (z) {
                    return str2;
                }
                return String.valueOf(obj);
            }
        }
    }
}
