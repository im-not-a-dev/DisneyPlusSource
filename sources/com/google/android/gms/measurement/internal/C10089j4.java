package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import java.io.IOException;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11022a1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11035b0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11035b0.C11036a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11037b1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11050c0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11050c0.C11051a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11052c1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11085e0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11085e0.C11086a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11193l0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11318t7;
import p163g.p449j.p450a.p451a.p457d.p464g.C11361w7;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
public final class C10089j4 extends C10138n8 implements C10105k9 {

    /* renamed from: j */
    private static int f23572j = 65535;

    /* renamed from: k */
    private static int f23573k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f23574d = new C3926a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f23575e = new C3926a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f23576f = new C3926a();

    /* renamed from: g */
    private final Map<String, C11037b1> f23577g = new C3926a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f23578h = new C3926a();

    /* renamed from: i */
    private final Map<String, String> f23579i = new C3926a();

    C10089j4(C10126m8 m8Var) {
        super(m8Var);
    }

    /* renamed from: i */
    private final void m31401i(String str) {
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        if (this.f23577g.get(str) == null) {
            byte[] d = mo25890p().mo26000d(str);
            if (d == null) {
                this.f23574d.put(str, null);
                this.f23575e.put(str, null);
                this.f23576f.put(str, null);
                this.f23577g.put(str, null);
                this.f23579i.put(str, null);
                this.f23578h.put(str, null);
                return;
            }
            C11037b1 a = m31398a(str, d);
            this.f23574d.put(str, m31399a(a));
            m31400a(str, a);
            this.f23577g.put(str, a);
            this.f23579i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11037b1 mo25845a(String str) {
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        m31401i(str);
        return (C11037b1) this.f23577g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo25848b(String str) {
        mo25662j();
        return (String) this.f23579i.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo25850c(String str) {
        mo25662j();
        this.f23579i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo25853d(String str) {
        mo25662j();
        this.f23577g.remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo25854e(String str) {
        mo25662j();
        C11037b1 a = mo25845a(str);
        if (a == null) {
            return false;
        }
        Boolean bool = a.f26073j;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo25855f(String str) {
        String a = mo25846a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo25898e().mo25877w().mo25910a("Unable to parse timezone offset. appId", C10099k3.m31423a(str), e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo25856g(String str) {
        return "1".equals(mo25846a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo25857h(String str) {
        return "1".equals(mo25846a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo25760u() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo25849b(String str, String str2) {
        mo25662j();
        m31401i(str);
        if (mo25856g(str) && C10251y8.m31988h(str2)) {
            return true;
        }
        if (mo25857h(str) && C10251y8.m31984e(str2)) {
            return true;
        }
        Map map = (Map) this.f23575e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo25851c(String str, String str2) {
        mo25662j();
        m31401i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f23576f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo25852d(String str, String str2) {
        mo25662j();
        m31401i(str);
        Map map = (Map) this.f23578h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final String mo25846a(String str, String str2) {
        mo25662j();
        m31401i(str);
        Map map = (Map) this.f23574d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m31399a(C11037b1 b1Var) {
        C3926a aVar = new C3926a();
        if (b1Var != null) {
            C11193l0[] l0VarArr = b1Var.f26069f;
            if (l0VarArr != null) {
                for (C11193l0 l0Var : l0VarArr) {
                    if (l0Var != null) {
                        aVar.put(l0Var.mo28653n(), l0Var.mo28654o());
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m31400a(String str, C11037b1 b1Var) {
        C3926a aVar = new C3926a();
        C3926a aVar2 = new C3926a();
        C3926a aVar3 = new C3926a();
        if (b1Var != null) {
            C11052c1[] c1VarArr = b1Var.f26070g;
            if (c1VarArr != null) {
                for (C11052c1 c1Var : c1VarArr) {
                    if (TextUtils.isEmpty(c1Var.f26094c)) {
                        mo25898e().mo25877w().mo25908a("EventConfig contained null event name");
                    } else {
                        String a = C10157p5.m31797a(c1Var.f26094c);
                        if (!TextUtils.isEmpty(a)) {
                            c1Var.f26094c = a;
                        }
                        aVar.put(c1Var.f26094c, c1Var.f26095d);
                        aVar2.put(c1Var.f26094c, c1Var.f26096e);
                        Integer num = c1Var.f26097f;
                        if (num != null) {
                            if (num.intValue() < f23573k || c1Var.f26097f.intValue() > f23572j) {
                                mo25898e().mo25877w().mo25910a("Invalid sampling rate. Event name, sample rate", c1Var.f26094c, c1Var.f26097f);
                            } else {
                                aVar3.put(c1Var.f26094c, c1Var.f26097f);
                            }
                        }
                    }
                }
            }
        }
        this.f23575e.put(str, aVar);
        this.f23576f.put(str, aVar2);
        this.f23578h.put(str, aVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25847a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        String str3 = str;
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        C11037b1 a = m31398a(str, bArr);
        if (a == null) {
            return false;
        }
        m31400a(str3, a);
        this.f23577g.put(str3, a);
        this.f23579i.put(str3, str2);
        this.f23574d.put(str3, m31399a(a));
        C10050f9 o = mo25889o();
        C11022a1[] a1VarArr = a.f26071h;
        C9908u.m30853a(a1VarArr);
        for (C11022a1 a1Var : a1VarArr) {
            if (a1Var.f26044e != null) {
                int i = 0;
                while (true) {
                    C11035b0[] b0VarArr = a1Var.f26044e;
                    if (i >= b0VarArr.length) {
                        break;
                    }
                    C11036a aVar = (C11036a) b0VarArr[i].mo28436j();
                    C11036a aVar2 = (C11036a) aVar.clone();
                    String a2 = C10157p5.m31797a(aVar.mo28309i());
                    if (a2 != null) {
                        aVar2.mo28307a(a2);
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    for (int i2 = 0; i2 < aVar.mo28310j(); i2++) {
                        C11050c0 a3 = aVar.mo28308a(i2);
                        String a4 = C10146o5.m31774a(a3.mo28338t());
                        if (a4 != null) {
                            C11051a aVar3 = (C11051a) a3.mo28436j();
                            aVar3.mo28339a(a4);
                            aVar2.mo28306a(i2, (C11050c0) aVar3.mo28446l0());
                            z2 = true;
                        }
                    }
                    if (z2) {
                        a1Var.f26044e[i] = (C11035b0) aVar2.mo28446l0();
                    }
                    i++;
                }
            }
            if (a1Var.f26043d != null) {
                int i3 = 0;
                while (true) {
                    C11085e0[] e0VarArr = a1Var.f26043d;
                    if (i3 >= e0VarArr.length) {
                        break;
                    }
                    C11085e0 e0Var = e0VarArr[i3];
                    String a5 = C10178r5.m31811a(e0Var.mo28416o());
                    if (a5 != null) {
                        C11085e0[] e0VarArr2 = a1Var.f26043d;
                        C11086a aVar4 = (C11086a) e0Var.mo28436j();
                        aVar4.mo28423a(a5);
                        e0VarArr2[i3] = (C11085e0) aVar4.mo28446l0();
                    }
                    i3++;
                }
            }
        }
        o.mo25890p().mo25987a(str3, a1VarArr);
        try {
            a.f26071h = null;
            bArr2 = new byte[a.mo28491b()];
            a.mo28252a(C11361w7.m36642a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo25898e().mo25877w().mo25910a("Unable to serialize reduced-size config. Storing full config instead. appId", C10099k3.m31423a(str), e);
            bArr2 = bArr;
        }
        C10139n9 p = mo25890p();
        C9908u.m30863b(str);
        p.mo25662j();
        p.mo25969t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) p.mo26011x().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                p.mo25898e().mo25874t().mo25909a("Failed to update remote config (got 0). appId", C10099k3.m31423a(str));
            }
        } catch (SQLiteException e2) {
            p.mo25898e().mo25874t().mo25910a("Error storing remote config. appId", C10099k3.m31423a(str), e2);
        }
        return true;
    }

    /* renamed from: a */
    private final C11037b1 m31398a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C11037b1();
        }
        C11318t7 a = C11318t7.m36376a(bArr, 0, bArr.length);
        C11037b1 b1Var = new C11037b1();
        try {
            b1Var.mo28251a(a);
            mo25898e().mo25869B().mo25910a("Parsed config. version, gmp_app_id", b1Var.f26066c, b1Var.f26067d);
            return b1Var;
        } catch (IOException e) {
            mo25898e().mo25877w().mo25910a("Unable to merge remote config. appId", C10099k3.m31423a(str), e);
            return new C11037b1();
        }
    }
}
