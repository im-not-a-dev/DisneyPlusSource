package p163g.p449j.p487c;

import java.math.BigInteger;
import p163g.p449j.p487c.p490y.C11579a;
import p163g.p449j.p487c.p490y.C11602f;

/* renamed from: g.j.c.q */
/* compiled from: JsonPrimitive */
public final class C11564q extends C11559l {

    /* renamed from: b */
    private static final Class<?>[] f27024b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f27025a;

    public C11564q(Boolean bool) {
        mo29552a((Object) bool);
    }

    /* renamed from: b */
    private static boolean m37309b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f27024b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29552a(Object obj) {
        if (obj instanceof Character) {
            this.f27025a = String.valueOf(((Character) obj).charValue());
            return;
        }
        C11579a.m37330a((obj instanceof Number) || m37309b(obj));
        this.f27025a = obj;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C11564q.class != obj.getClass()) {
            return false;
        }
        C11564q qVar = (C11564q) obj;
        if (this.f27025a == null) {
            if (qVar.f27025a != null) {
                z = false;
            }
            return z;
        } else if (m37308a(this) && m37308a(qVar)) {
            if (mo29560n().longValue() != qVar.mo29560n().longValue()) {
                z = false;
            }
            return z;
        } else if (!(this.f27025a instanceof Number) || !(qVar.f27025a instanceof Number)) {
            return this.f27025a.equals(qVar.f27025a);
        } else {
            double doubleValue = mo29560n().doubleValue();
            double doubleValue2 = qVar.mo29560n().doubleValue();
            if (doubleValue != doubleValue2 && (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2))) {
                z = false;
            }
            return z;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f27025a == null) {
            return 31;
        }
        if (m37308a(this)) {
            doubleToLongBits = mo29560n().longValue();
        } else {
            Object obj = this.f27025a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo29560n().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public boolean mo29555i() {
        if (mo29562p()) {
            return mo29556j().booleanValue();
        }
        return Boolean.parseBoolean(mo29561o());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Boolean mo29556j() {
        return (Boolean) this.f27025a;
    }

    /* renamed from: k */
    public double mo29557k() {
        return mo29563q() ? mo29560n().doubleValue() : Double.parseDouble(mo29561o());
    }

    /* renamed from: l */
    public int mo29558l() {
        return mo29563q() ? mo29560n().intValue() : Integer.parseInt(mo29561o());
    }

    /* renamed from: m */
    public long mo29559m() {
        return mo29563q() ? mo29560n().longValue() : Long.parseLong(mo29561o());
    }

    /* renamed from: n */
    public Number mo29560n() {
        Object obj = this.f27025a;
        return obj instanceof String ? new C11602f((String) obj) : (Number) obj;
    }

    /* renamed from: o */
    public String mo29561o() {
        if (mo29563q()) {
            return mo29560n().toString();
        }
        if (mo29562p()) {
            return mo29556j().toString();
        }
        return (String) this.f27025a;
    }

    /* renamed from: p */
    public boolean mo29562p() {
        return this.f27025a instanceof Boolean;
    }

    /* renamed from: q */
    public boolean mo29563q() {
        return this.f27025a instanceof Number;
    }

    /* renamed from: r */
    public boolean mo29564r() {
        return this.f27025a instanceof String;
    }

    public C11564q(Number number) {
        mo29552a((Object) number);
    }

    public C11564q(String str) {
        mo29552a((Object) str);
    }

    /* renamed from: a */
    private static boolean m37308a(C11564q qVar) {
        Object obj = qVar.f27025a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }
}
