package p163g.p449j.p450a.p451a.p457d.p464g;

import android.util.Log;

/* renamed from: g.j.a.a.d.g.u1 */
final class C11327u1 extends C11283r1<Long> {
    C11327u1(C11382y1 y1Var, String str, Long l) {
        super(y1Var, str, l, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo28864a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo28865b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
