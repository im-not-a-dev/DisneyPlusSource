package p163g.p449j.p450a.p451a.p457d.p464g;

import android.util.Log;

/* renamed from: g.j.a.a.d.g.w1 */
final class C11355w1 extends C11283r1<Double> {
    C11355w1(C11382y1 y1Var, String str, Double d) {
        super(y1Var, str, d, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo28864a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo28865b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
