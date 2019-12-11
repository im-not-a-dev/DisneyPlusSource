package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.C2135a;
import com.bamtech.shadow.gson.internal.C2214e;
import java.math.BigInteger;

/* renamed from: com.bamtech.shadow.gson.l */
/* compiled from: JsonPrimitive */
public final class C2235l extends JsonElement {

    /* renamed from: b */
    private static final Class<?>[] f6336b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f6337a;

    public C2235l(Boolean bool) {
        mo11257a((Object) bool);
    }

    /* renamed from: b */
    private static boolean m8584b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f6336b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11257a(Object obj) {
        if (obj instanceof Character) {
            this.f6337a = String.valueOf(((Character) obj).charValue());
            return;
        }
        C2135a.m8283a((obj instanceof Number) || m8584b(obj));
        this.f6337a = obj;
    }

    /* renamed from: e */
    public String mo11074e() {
        if (mo11267q()) {
            return mo11265o().toString();
        }
        if (mo11266p()) {
            return mo11261k().toString();
        }
        return (String) this.f6337a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2235l.class != obj.getClass()) {
            return false;
        }
        C2235l lVar = (C2235l) obj;
        if (this.f6337a == null) {
            if (lVar.f6337a != null) {
                z = false;
            }
            return z;
        } else if (m8583a(this) && m8583a(lVar)) {
            if (mo11265o().longValue() != lVar.mo11265o().longValue()) {
                z = false;
            }
            return z;
        } else if (!(this.f6337a instanceof Number) || !(lVar.f6337a instanceof Number)) {
            return this.f6337a.equals(lVar.f6337a);
        } else {
            double doubleValue = mo11265o().doubleValue();
            double doubleValue2 = lVar.mo11265o().doubleValue();
            if (doubleValue != doubleValue2 && (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2))) {
                z = false;
            }
            return z;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f6337a == null) {
            return 31;
        }
        if (m8583a(this)) {
            doubleToLongBits = mo11265o().longValue();
        } else {
            Object obj = this.f6337a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo11265o().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public boolean mo11260j() {
        if (mo11266p()) {
            return mo11261k().booleanValue();
        }
        return Boolean.parseBoolean(mo11074e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Boolean mo11261k() {
        return (Boolean) this.f6337a;
    }

    /* renamed from: l */
    public double mo11262l() {
        return mo11267q() ? mo11265o().doubleValue() : Double.parseDouble(mo11074e());
    }

    /* renamed from: m */
    public int mo11263m() {
        return mo11267q() ? mo11265o().intValue() : Integer.parseInt(mo11074e());
    }

    /* renamed from: n */
    public long mo11264n() {
        return mo11267q() ? mo11265o().longValue() : Long.parseLong(mo11074e());
    }

    /* renamed from: o */
    public Number mo11265o() {
        Object obj = this.f6337a;
        return obj instanceof String ? new C2214e((String) obj) : (Number) obj;
    }

    /* renamed from: p */
    public boolean mo11266p() {
        return this.f6337a instanceof Boolean;
    }

    /* renamed from: q */
    public boolean mo11267q() {
        return this.f6337a instanceof Number;
    }

    /* renamed from: r */
    public boolean mo11268r() {
        return this.f6337a instanceof String;
    }

    public C2235l(Number number) {
        mo11257a((Object) number);
    }

    public C2235l(String str) {
        mo11257a((Object) str);
    }

    C2235l(Object obj) {
        mo11257a(obj);
    }

    /* renamed from: a */
    private static boolean m8583a(C2235l lVar) {
        Object obj = lVar.f6337a;
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
