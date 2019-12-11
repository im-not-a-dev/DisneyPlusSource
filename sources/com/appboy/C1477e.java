package com.appboy;

import com.appboy.p025o.C1499g;
import com.appboy.p025o.C1501h;
import com.appboy.p025o.C1502i;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1559e;
import com.appboy.p033s.C1564j;
import p161f.p162a.C4424d3;
import p161f.p162a.C4432e1;
import p161f.p162a.C4464h3;
import p161f.p162a.C4548p1;
import p161f.p162a.C4595u0;
import p161f.p162a.C4619x0;

/* renamed from: com.appboy.e */
public class C1477e {

    /* renamed from: f */
    private static final String f5318f = C1557c.m7461a(C1477e.class);

    /* renamed from: a */
    private final C4464h3 f5319a;

    /* renamed from: b */
    private final C4424d3 f5320b;

    /* renamed from: c */
    private final Object f5321c = new Object();

    /* renamed from: d */
    private volatile String f5322d;

    /* renamed from: e */
    private final C4595u0 f5323e;

    C1477e(C4464h3 h3Var, C4595u0 u0Var, String str, C4619x0 x0Var, C4424d3 d3Var) {
        this.f5322d = str;
        this.f5319a = h3Var;
        this.f5320b = d3Var;
        this.f5323e = u0Var;
    }

    /* renamed from: a */
    public boolean mo6640a(C1499g gVar) {
        try {
            this.f5319a.mo15592a(gVar);
            return true;
        } catch (Exception e) {
            String str = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set gender to: ");
            sb.append(gVar);
            C1557c.m7474e(str, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo6647b(C1502i iVar) {
        try {
            this.f5319a.mo15600b(iVar);
            return true;
        } catch (Exception e) {
            String str = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set push notification subscription to: ");
            sb.append(iVar);
            C1557c.m7474e(str, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo6651c(String str) {
        try {
            this.f5319a.mo15607e(str);
            return true;
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set country to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo6653d(String str) {
        try {
            return this.f5319a.mo15605d(str);
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set email to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo6654e(String str) {
        try {
            this.f5319a.mo15601b(str);
            return true;
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set first name to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo6655f(String str) {
        try {
            this.f5319a.mo15609f(str);
            return true;
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set home city to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: g */
    public boolean mo6656g(String str) {
        try {
            this.f5319a.mo15610g(str);
            return true;
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set language to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo6657h(String str) {
        try {
            this.f5319a.mo15603c(str);
            return true;
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set last name to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo6658i(String str) {
        try {
            return this.f5319a.mo15611h(str);
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set phone number to: ");
            sb.append(str);
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6639a(int i, C1501h hVar, int i2) {
        try {
            return this.f5319a.mo15598a(i, hVar, i2);
        } catch (Exception e) {
            String str = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set date of birth to: ");
            sb.append(i);
            String str2 = "-";
            sb.append(str2);
            sb.append(hVar.mo6751a());
            sb.append(str2);
            sb.append(i2);
            C1557c.m7474e(str, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo6649b(String str, int i) {
        try {
            return this.f5319a.mo15599a(str, (Object) Integer.valueOf(i));
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom integer attribute ");
            sb.append(str);
            sb.append(".");
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo6652c(String str, String str2) {
        try {
            return this.f5319a.mo15599a(str, (Object) str2);
        } catch (Exception e) {
            String str3 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom string attribute ");
            sb.append(str);
            sb.append(".");
            C1557c.m7474e(str3, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6641a(C1502i iVar) {
        try {
            this.f5319a.mo15593a(iVar);
            return true;
        } catch (Exception e) {
            String str = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set email notification subscription to: ");
            sb.append(iVar);
            C1557c.m7474e(str, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo6650b(String str, String str2) {
        try {
            if (!C1559e.m7477a(str, this.f5320b.mo15505i())) {
                C1557c.m7473e(f5318f, "Custom attribute key was invalid. Not removing from attribute array.");
                return false;
            } else if (!C1559e.m7476a(str2)) {
                return false;
            } else {
                return this.f5323e.mo15772a((C4432e1) C4548p1.m15783c(C1564j.m7492a(str), C1564j.m7492a(str2)));
            }
        } catch (Exception e) {
            String str3 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove custom attribute with key '");
            sb.append(str);
            sb.append("'.");
            C1557c.m7474e(str3, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6645a(String str, boolean z) {
        try {
            return this.f5319a.mo15599a(str, (Object) Boolean.valueOf(z));
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom boolean attribute ");
            sb.append(str);
            sb.append(".");
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6642a(String str, float f) {
        try {
            return this.f5319a.mo15599a(str, (Object) Float.valueOf(f));
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom float attribute ");
            sb.append(str);
            sb.append(".");
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6644a(String str, String str2) {
        try {
            if (!C1559e.m7477a(str, this.f5320b.mo15505i())) {
                C1557c.m7473e(f5318f, "Custom attribute key was invalid. Not adding to attribute array.");
                return false;
            } else if (!C1559e.m7476a(str2)) {
                return false;
            } else {
                return this.f5323e.mo15772a((C4432e1) C4548p1.m15779b(C1564j.m7492a(str), C1564j.m7492a(str2)));
            }
        } catch (Exception e) {
            String str3 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to add custom attribute with key '");
            sb.append(str);
            sb.append("'.");
            C1557c.m7474e(str3, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo6648b(String str) {
        return mo6643a(str, 1);
    }

    /* renamed from: a */
    public boolean mo6646a(String str, String[] strArr) {
        try {
            if (!C1559e.m7477a(str, this.f5320b.mo15505i())) {
                return false;
            }
            String a = C1564j.m7492a(str);
            if (strArr != null) {
                C1559e.m7478a(strArr);
            }
            return this.f5323e.mo15772a((C4432e1) C4548p1.m15772a(a, strArr));
        } catch (Exception unused) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom attribute array with key: '");
            sb.append(str);
            sb.append("'.");
            C1557c.m7473e(str2, sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo6643a(String str, int i) {
        try {
            if (!C1559e.m7477a(str, this.f5320b.mo15505i())) {
                return false;
            }
            return this.f5323e.mo15772a((C4432e1) C4548p1.m15763a(C1564j.m7492a(str), i));
        } catch (Exception e) {
            String str2 = f5318f;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to increment custom attribute ");
            sb.append(str);
            sb.append(" by ");
            sb.append(i);
            sb.append(".");
            C1557c.m7474e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public String mo6636a() {
        String str;
        synchronized (this.f5321c) {
            str = this.f5322d;
        }
        return str;
    }

    /* renamed from: a */
    public void mo6638a(String str, double d, double d2) {
        String str2 = "'";
        try {
            if (!C1559e.m7477a(str, this.f5320b.mo15505i())) {
                C1557c.m7473e(f5318f, "Custom location attribute key was invalid. Not setting attribute.");
            } else if (!C1564j.m7493a(d, d2)) {
                String str3 = f5318f;
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot set custom location attribute due with invalid latitude '");
                sb.append(d);
                sb.append(" and longitude '");
                sb.append(d2);
                sb.append(str2);
                C1557c.m7473e(str3, sb.toString());
            } else {
                this.f5323e.mo15772a((C4432e1) C4548p1.m15762a(C1564j.m7492a(str), d, d2));
            }
        } catch (Exception e) {
            String str4 = f5318f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to set custom location attribute with key '");
            sb2.append(str);
            sb2.append("' and latitude '");
            sb2.append(d);
            sb2.append("' and longitude '");
            sb2.append(d2);
            sb2.append(str2);
            C1557c.m7474e(str4, sb2.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6637a(String str) {
        synchronized (this.f5321c) {
            if (!this.f5322d.equals("")) {
                if (!this.f5322d.equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [");
                    sb.append(this.f5322d);
                    sb.append("], tried to change to: [");
                    sb.append(str);
                    sb.append("]");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f5322d = str;
            this.f5319a.mo15596a(str);
        }
    }
}
