package com.bamtech.player.exo.p041i;

import android.content.Context;
import java.util.HashMap;
import p163g.p426g.p427a.C10789a;
import p163g.p426g.p427a.C10790b;
import p163g.p426g.p427a.C10790b.C10799i;
import p163g.p426g.p427a.C10790b.C10800j;
import p163g.p426g.p427a.C10790b.C10801k;
import p163g.p426g.p427a.C10790b.C10810m;
import p163g.p426g.p427a.C10811c;
import p163g.p426g.p427a.C10812d;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p427a.C10817h;
import p163g.p426g.p427a.C10817h.C10818a;
import p163g.p426g.p427a.p428i.C10819a;
import p163g.p426g.p427a.p428i.C10821c;
import p163g.p426g.p427a.p428i.C10821c.C10826e;
import p163g.p426g.p427a.p429j.C10836j;
import p686n.p687a.C14100a;

/* renamed from: com.bamtech.player.exo.i.f */
/* compiled from: ConvivaSessionManager */
public class C1716f {

    /* renamed from: a */
    private final C1714e f5984a;

    /* renamed from: b */
    private final String f5985b;

    /* renamed from: c */
    private boolean f5986c = false;

    /* renamed from: d */
    private C10821c f5987d = null;

    /* renamed from: e */
    private C10836j f5988e;

    /* renamed from: f */
    private C10816g f5989f;

    /* renamed from: g */
    private C10817h f5990g;

    /* renamed from: h */
    private C10811c f5991h;

    /* renamed from: i */
    private C10790b f5992i = null;

    /* renamed from: j */
    private int f5993j = -1;

    /* renamed from: k */
    private C10812d f5994k;

    /* renamed from: l */
    private String f5995l;

    public C1716f(C1714e eVar, String str) {
        this.f5984a = eVar;
        this.f5985b = str;
    }

    /* renamed from: b */
    private C10812d m7966b(String str) {
        C10812d dVar = new C10812d();
        dVar.f25553a = this.f5984a.mo7676b();
        dVar.f25554b = this.f5984a.mo7678c();
        if (this.f5984a.mo7680e() != null) {
            dVar.f25556d = this.f5984a.mo7680e();
        }
        if (this.f5984a.mo7686k() != null) {
            dVar.f25557e = this.f5984a.mo7686k();
        }
        if (this.f5984a.mo7672a() != null) {
            dVar.f25558f = this.f5984a.mo7672a();
        }
        dVar.f25559g = str;
        dVar.f25561i = this.f5984a.mo7685j();
        dVar.f25562j = (int) this.f5984a.mo7681f();
        dVar.f25563k = this.f5984a.mo7682g();
        return dVar;
    }

    /* renamed from: e */
    private C10821c m7967e() {
        if (this.f5987d == null) {
            this.f5987d = new C10821c(this.f5989f);
            this.f5987d.mo27876a(this.f5984a.mo7684i());
            this.f5987d.mo27880b("53.0");
        }
        return this.f5987d;
    }

    /* renamed from: f */
    private void m7968f() {
        if (!mo7697d()) {
            String str = this.f5995l;
            if (str != null) {
                mo7693a(str);
            }
        }
    }

    /* renamed from: a */
    public C10790b mo7687a(Context context) {
        try {
            if (!this.f5986c) {
                this.f5988e = C10789a.m34059a(context);
                this.f5990g = new C10817h();
                this.f5990g.f25584a = C10818a.DEBUG;
                this.f5990g.f25585b = false;
                this.f5989f = new C10816g(this.f5988e, this.f5990g);
                this.f5991h = new C10811c(this.f5984a.mo7679d());
                if (this.f5985b != null) {
                    this.f5991h.f25552c = this.f5985b;
                }
                this.f5992i = new C10790b(this.f5991h, this.f5989f);
                this.f5986c = true;
            }
        } catch (Exception e) {
            C14100a.m44528b(e, "Failed to initialize LivePass", new Object[0]);
        }
        return this.f5992i;
    }

    /* renamed from: c */
    public void mo7696c() {
        if (!this.f5986c || this.f5992i == null) {
            C14100a.m44532e("ConvivaSessionManager", "Unable to clean session since client not initialized");
            return;
        }
        if (mo7697d()) {
            StringBuilder sb = new StringBuilder();
            sb.append("cleanup session: ");
            sb.append(this.f5993j);
            C14100a.m44522a(sb.toString(), new Object[0]);
            try {
                this.f5992i.mo27829b(this.f5993j);
            } catch (Exception e) {
                C14100a.m44528b(e, "Failed to cleanup", new Object[0]);
            }
            this.f5993j = -1;
        }
    }

    /* renamed from: d */
    public boolean mo7697d() {
        return this.f5993j != -1;
    }

    /* renamed from: a */
    public void mo7693a(String str) {
        if (!this.f5986c || this.f5992i == null) {
            C14100a.m44526b("ConvivaSessionManager", "Unable to create session since client not initialized");
            return;
        }
        try {
            if (mo7697d()) {
                mo7696c();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to cleanup session: ");
            sb.append(e.toString());
            C14100a.m44528b(e, sb.toString(), new Object[0]);
        }
        try {
            new HashMap().put("key", "value");
            this.f5994k = m7966b(str);
            this.f5993j = this.f5992i.mo27824a(this.f5994k);
            this.f5992i.mo27827a(this.f5993j, this.f5987d);
            this.f5995l = str;
        } catch (Exception e2) {
            C14100a.m44528b(e2, "Failed to create session", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo7695b() {
        m7968f();
        String str = "ConvivaSessionManager";
        if (!this.f5986c || this.f5992i == null) {
            C14100a.m44526b(str, "Unable to start Ad since client not initialized");
        } else if (!mo7697d()) {
            C14100a.m44526b("adStart() requires a session", new Object[0]);
        } else {
            try {
                this.f5992i.mo27826a(this.f5993j, C10801k.SEPARATE, C10799i.SEPARATE, C10800j.PREROLL);
            } catch (Exception e) {
                C14100a.m44526b(str, "Failed to start Ad");
                C14100a.m44523a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo7694a(String str, boolean z) {
        if (z) {
            m7968f();
        }
        if (!this.f5986c || this.f5992i == null) {
            C14100a.m44526b("ConvivaSessionManager", "Unable to report error since client not initialized");
            return;
        }
        try {
            this.f5992i.mo27828a(this.f5993j, str, z ? C10810m.FATAL : C10810m.WARNING);
        } catch (Exception e) {
            C14100a.m44528b(e, "Failed to report error", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo7688a() {
        m7968f();
        if (!this.f5986c || this.f5992i == null) {
            C14100a.m44526b("ConvivaSessionManager", "Unable to stop Ad since client not initialized");
        } else if (!mo7697d()) {
            C14100a.m44526b("adEnd() requires a session", new Object[0]);
        } else {
            try {
                this.f5992i.mo27825a(this.f5993j);
            } catch (Exception e) {
                C14100a.m44528b(e, "Failed to end Ad", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo7690a(long j) {
        m7968f();
        try {
            if (m7967e() != null) {
                m7967e().mo27879b((int) j);
            }
        } catch (Exception e) {
            C14100a.m44523a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo7689a(int i) {
        m7968f();
        try {
            if (m7967e() != null) {
                m7967e().mo27873a(i);
            }
        } catch (Exception e) {
            C14100a.m44523a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo7691a(C10819a aVar) {
        m7967e().mo27874a(aVar);
    }

    /* renamed from: a */
    public void mo7692a(C10826e eVar) {
        m7968f();
        try {
            this.f5987d.mo27875a(eVar);
        } catch (Exception e) {
            C14100a.m44523a((Throwable) e);
        }
    }
}
