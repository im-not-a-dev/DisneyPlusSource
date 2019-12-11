package p096e.p114f.p117b.p118j.p119u;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.b.j.u.f */
/* compiled from: DependencyNode */
public class C4000f implements C3998d {

    /* renamed from: a */
    public C3998d f10177a = null;

    /* renamed from: b */
    public boolean f10178b = false;

    /* renamed from: c */
    public boolean f10179c = false;

    /* renamed from: d */
    C4010m f10180d;

    /* renamed from: e */
    C4001a f10181e = C4001a.UNKNOWN;

    /* renamed from: f */
    int f10182f;

    /* renamed from: g */
    public int f10183g;

    /* renamed from: h */
    int f10184h = 1;

    /* renamed from: i */
    C4002g f10185i = null;

    /* renamed from: j */
    public boolean f10186j = false;

    /* renamed from: k */
    List<C3998d> f10187k = new ArrayList();

    /* renamed from: l */
    List<C4000f> f10188l = new ArrayList();

    /* renamed from: e.f.b.j.u.f$a */
    /* compiled from: DependencyNode */
    enum C4001a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C4000f(C4010m mVar) {
        this.f10180d = mVar;
    }

    /* renamed from: a */
    public void mo14523a(int i) {
        if (!this.f10186j) {
            this.f10186j = true;
            this.f10183g = i;
            for (C3998d dVar : this.f10187k) {
                dVar.mo14508a(dVar);
            }
        }
    }

    /* renamed from: b */
    public void mo14524b(C3998d dVar) {
        this.f10187k.add(dVar);
        if (this.f10186j) {
            dVar.mo14508a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10180d.f10209b.mo14372g());
        sb.append(":");
        sb.append(this.f10181e);
        sb.append("(");
        sb.append(this.f10186j ? Integer.valueOf(this.f10183g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f10188l.size());
        sb.append(":d=");
        sb.append(this.f10187k.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo14508a(C3998d dVar) {
        for (C4000f fVar : this.f10188l) {
            if (!fVar.f10186j) {
                return;
            }
        }
        this.f10179c = true;
        C3998d dVar2 = this.f10177a;
        if (dVar2 != null) {
            dVar2.mo14508a(this);
        }
        if (this.f10178b) {
            this.f10180d.mo14508a((C3998d) this);
            return;
        }
        C4000f fVar2 = null;
        int i = 0;
        for (C4000f fVar3 : this.f10188l) {
            if (!(fVar3 instanceof C4002g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f10186j) {
            C4002g gVar = this.f10185i;
            if (gVar != null) {
                if (gVar.f10186j) {
                    this.f10182f = this.f10184h * gVar.f10183g;
                } else {
                    return;
                }
            }
            mo14523a(fVar2.f10183g + this.f10182f);
        }
        C3998d dVar3 = this.f10177a;
        if (dVar3 != null) {
            dVar3.mo14508a(this);
        }
    }

    /* renamed from: a */
    public void mo14522a() {
        this.f10188l.clear();
        this.f10187k.clear();
        this.f10186j = false;
        this.f10183g = 0;
        this.f10179c = false;
        this.f10178b = false;
    }
}
