package p163g.p441i.p442a.p443a.p446s;

import p163g.p441i.p442a.p443a.C10902e;
import p163g.p441i.p442a.p443a.C10903f;
import p163g.p441i.p442a.p443a.C10908j;
import p163g.p441i.p442a.p443a.C10909k;

/* renamed from: g.i.a.a.s.c */
/* compiled from: JsonWriteContext */
public class C10926c extends C10909k {

    /* renamed from: c */
    protected final C10926c f25944c;

    /* renamed from: d */
    protected C10924a f25945d;

    /* renamed from: e */
    protected C10926c f25946e;

    /* renamed from: f */
    protected String f25947f;

    /* renamed from: g */
    protected boolean f25948g;

    protected C10926c(int i, C10926c cVar, C10924a aVar) {
        this.f25897a = i;
        this.f25944c = cVar;
        this.f25945d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10926c mo28142a(int i) {
        this.f25897a = i;
        this.f25898b = -1;
        this.f25947f = null;
        this.f25948g = false;
        C10924a aVar = this.f25945d;
        if (aVar != null) {
            aVar.mo28135c();
        }
        return this;
    }

    /* renamed from: b */
    public final String mo28082b() {
        return this.f25947f;
    }

    /* renamed from: g */
    public C10926c mo28143g() {
        return this.f25944c;
    }

    /* renamed from: h */
    public C10926c mo28144h() {
        C10926c cVar = this.f25946e;
        if (cVar == null) {
            C10924a aVar = this.f25945d;
            C10926c cVar2 = new C10926c(1, this, aVar == null ? null : aVar.mo28132a());
            this.f25946e = cVar2;
            return cVar2;
        }
        cVar.mo28142a(1);
        return cVar;
    }

    /* renamed from: i */
    public C10926c mo28145i() {
        C10926c cVar = this.f25946e;
        if (cVar == null) {
            C10924a aVar = this.f25945d;
            C10926c cVar2 = new C10926c(2, this, aVar == null ? null : aVar.mo28132a());
            this.f25946e = cVar2;
            return cVar2;
        }
        cVar.mo28142a(2);
        return cVar;
    }

    /* renamed from: j */
    public int mo28146j() {
        int i = this.f25897a;
        int i2 = 0;
        if (i == 2) {
            if (!this.f25948g) {
                return 5;
            }
            this.f25948g = false;
            this.f25898b++;
            return 2;
        } else if (i == 1) {
            int i3 = this.f25898b;
            this.f25898b = i3 + 1;
            if (i3 >= 0) {
                i2 = 1;
            }
            return i2;
        } else {
            this.f25898b++;
            if (this.f25898b != 0) {
                i2 = 3;
            }
            return i2;
        }
    }

    /* renamed from: a */
    public static C10926c m34500a(C10924a aVar) {
        return new C10926c(0, null, aVar);
    }

    /* renamed from: a */
    public int mo28141a(String str) throws C10908j {
        if (this.f25897a != 2 || this.f25948g) {
            return 4;
        }
        int i = 1;
        this.f25948g = true;
        this.f25947f = str;
        C10924a aVar = this.f25945d;
        if (aVar != null) {
            m34501a(aVar, str);
        }
        if (this.f25898b < 0) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    private final void m34501a(C10924a aVar, String str) throws C10908j {
        if (aVar.mo28133a(str)) {
            Object b = aVar.mo28134b();
            StringBuilder sb = new StringBuilder();
            sb.append("Duplicate field '");
            sb.append(str);
            sb.append("'");
            throw new C10902e(sb.toString(), b instanceof C10903f ? (C10903f) b : null);
        }
    }
}
