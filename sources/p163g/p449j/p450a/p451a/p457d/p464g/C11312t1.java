package p163g.p449j.p450a.p451a.p457d.p464g;

import android.util.Log;

/* renamed from: g.j.a.a.d.g.t1 */
final class C11312t1 extends C11283r1<Boolean> {
    C11312t1(C11382y1 y1Var, String str, Boolean bool) {
        super(y1Var, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo28864a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C11087e1.f26147c.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C11087e1.f26148d.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String b = super.mo28865b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
