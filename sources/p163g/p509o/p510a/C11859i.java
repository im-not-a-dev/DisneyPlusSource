package p163g.p509o.p510a;

import androidx.recyclerview.widget.C0856f;
import androidx.recyclerview.widget.C0856f.C0858b;
import androidx.recyclerview.widget.C0856f.C0859c;
import androidx.recyclerview.widget.C0889n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: g.o.a.i */
/* compiled from: Section */
public class C11859i extends C11854f {

    /* renamed from: U */
    private C11847b f27511U;

    /* renamed from: V */
    private C11847b f27512V;

    /* renamed from: W */
    private C11847b f27513W;

    /* renamed from: X */
    private final ArrayList<C11847b> f27514X;

    /* renamed from: Y */
    private boolean f27515Y;

    /* renamed from: Z */
    private boolean f27516Z;

    /* renamed from: a0 */
    private boolean f27517a0;

    /* renamed from: b0 */
    private C0889n f27518b0;

    /* renamed from: g.o.a.i$a */
    /* compiled from: Section */
    class C11860a extends C0858b {

        /* renamed from: a */
        final /* synthetic */ int f27519a;

        /* renamed from: b */
        final /* synthetic */ int f27520b;

        /* renamed from: c */
        final /* synthetic */ List f27521c;

        /* renamed from: d */
        final /* synthetic */ Collection f27522d;

        C11860a(C11859i iVar, int i, int i2, List list, Collection collection) {
            this.f27519a = i;
            this.f27520b = i2;
            this.f27521c = list;
            this.f27522d = collection;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return C11859i.m38063b(this.f27522d, i2).equals(C11859i.m38063b(this.f27521c, i));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return C11859i.m38063b(this.f27522d, i2).isSameAs(C11859i.m38063b(this.f27521c, i));
        }

        public Object getChangePayload(int i, int i2) {
            return C11859i.m38063b(this.f27521c, i).getChangePayload(C11859i.m38063b(this.f27522d, i2));
        }

        public int getNewListSize() {
            return this.f27520b;
        }

        public int getOldListSize() {
            return this.f27519a;
        }
    }

    /* renamed from: g.o.a.i$b */
    /* compiled from: Section */
    class C11861b implements C0889n {
        C11861b() {
        }

        /* renamed from: a */
        public void mo4949a(int i, int i2) {
            int a = C11859i.this.m38068h();
            C11859i.this.mo29989a(i + a, a + i2);
        }

        /* renamed from: b */
        public void mo4951b(int i, int i2) {
            C11859i iVar = C11859i.this;
            iVar.mo29995b(iVar.m38068h() + i, i2);
        }

        /* renamed from: c */
        public void mo4952c(int i, int i2) {
            C11859i iVar = C11859i.this;
            iVar.mo29996c(iVar.m38068h() + i, i2);
        }

        /* renamed from: a */
        public void mo4950a(int i, int i2, Object obj) {
            C11859i iVar = C11859i.this;
            iVar.mo29990a(iVar.m38068h() + i, i2, obj);
        }
    }

    public C11859i() {
        this(null, new ArrayList());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C11853e m38063b(Collection<? extends C11847b> collection, int i) {
        int i2 = 0;
        for (C11847b bVar : collection) {
            int itemCount = bVar.getItemCount() + i2;
            if (itemCount > i) {
                return bVar.getItem(i - i2);
            }
            i2 = itemCount;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wanted item at ");
        sb.append(i);
        sb.append(" but there are only ");
        sb.append(i2);
        sb.append(" items");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: e */
    private int m38065e() {
        return (this.f27512V == null || !this.f27516Z) ? 0 : 1;
    }

    /* renamed from: f */
    private int m38066f() {
        if (m38065e() == 0) {
            return 0;
        }
        return this.f27512V.getItemCount();
    }

    /* renamed from: g */
    private int m38067g() {
        return (this.f27511U == null || !this.f27516Z) ? 0 : 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m38068h() {
        if (m38067g() == 0) {
            return 0;
        }
        return this.f27511U.getItemCount();
    }

    /* renamed from: i */
    private int m38069i() {
        return m38064d() + m38068h();
    }

    /* renamed from: j */
    private int m38070j() {
        return this.f27517a0 ? 1 : 0;
    }

    /* renamed from: k */
    private int m38071k() {
        if (this.f27517a0) {
            C11847b bVar = this.f27513W;
            if (bVar != null) {
                return bVar.getItemCount();
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m38072l() {
        if (this.f27516Z || this.f27517a0) {
            int h = m38068h() + m38071k() + m38066f();
            this.f27516Z = false;
            this.f27517a0 = false;
            mo29996c(0, h);
        }
    }

    /* renamed from: m */
    private void m38073m() {
        if (this.f27517a0 && this.f27513W != null) {
            this.f27517a0 = false;
            mo29996c(m38068h(), this.f27513W.getItemCount());
        }
    }

    /* renamed from: n */
    private boolean m38074n() {
        return m38065e() > 0;
    }

    /* renamed from: o */
    private boolean m38075o() {
        return m38067g() > 0;
    }

    /* renamed from: p */
    private boolean m38076p() {
        return m38070j() > 0;
    }

    /* renamed from: q */
    private void m38077q() {
        if (!this.f27516Z) {
            this.f27516Z = true;
            mo29995b(0, m38068h());
            mo29995b(m38069i(), m38066f());
        }
    }

    /* renamed from: r */
    private void m38078r() {
        if (!this.f27517a0 && this.f27513W != null) {
            this.f27517a0 = true;
            mo29995b(m38068h(), this.f27513W.getItemCount());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo30010c() {
        if (!mo30009b()) {
            m38073m();
            m38077q();
        } else if (this.f27515Y) {
            m38072l();
        } else {
            m38078r();
            m38077q();
        }
    }

    /* renamed from: d */
    public void mo30011d(Collection<? extends C11847b> collection) {
        mo30008a(collection, true);
    }

    public C11859i(C11847b bVar, Collection<? extends C11847b> collection) {
        this.f27514X = new ArrayList<>();
        this.f27515Y = false;
        this.f27516Z = true;
        this.f27517a0 = false;
        this.f27518b0 = new C11861b();
        this.f27511U = bVar;
        if (bVar != null) {
            bVar.registerGroupDataObserver(this);
        }
        mo29991a(collection);
    }

    /* renamed from: d */
    private int m38064d() {
        return this.f27517a0 ? m38071k() : mo29994b((Collection<? extends C11847b>) this.f27514X);
    }

    /* renamed from: a */
    public void mo29991a(Collection<? extends C11847b> collection) {
        if (!collection.isEmpty()) {
            super.mo29991a(collection);
            int i = m38069i();
            this.f27514X.addAll(collection);
            mo29995b(i, mo29994b(collection));
            mo30010c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30009b() {
        return this.f27514X.isEmpty() || mo29994b((Collection<? extends C11847b>) this.f27514X) == 0;
    }

    /* renamed from: b */
    public int mo29993b(C11847b bVar) {
        if (m38075o() && bVar == this.f27511U) {
            return 0;
        }
        int g = 0 + m38067g();
        if (m38076p() && bVar == this.f27513W) {
            return g;
        }
        int j = g + m38070j();
        int indexOf = this.f27514X.indexOf(bVar);
        if (indexOf >= 0) {
            return j + indexOf;
        }
        int size = j + this.f27514X.size();
        if (!m38074n() || this.f27512V != bVar) {
            return -1;
        }
        return size;
    }

    /* renamed from: a */
    public void mo30008a(Collection<? extends C11847b> collection, boolean z) {
        ArrayList arrayList = new ArrayList(this.f27514X);
        int b = mo29994b((Collection<? extends C11847b>) arrayList);
        int b2 = mo29994b(collection);
        C11860a aVar = new C11860a(this, b, b2, arrayList, collection);
        C0859c a = C0856f.m4802a(aVar, z);
        super.mo29997c(this.f27514X);
        this.f27514X.clear();
        this.f27514X.addAll(collection);
        super.mo29991a(collection);
        a.mo5013a(this.f27518b0);
        if (b2 == 0 || b == 0) {
            mo30010c();
        }
    }

    /* renamed from: b */
    public void mo29969b(C11847b bVar, int i, int i2) {
        super.mo29969b(bVar, i, i2);
        mo30010c();
    }

    /* renamed from: a */
    public C11847b mo29988a(int i) {
        if (m38075o() && i == 0) {
            return this.f27511U;
        }
        int g = i - m38067g();
        if (m38076p() && g == 0) {
            return this.f27513W;
        }
        int j = g - m38070j();
        if (j != this.f27514X.size()) {
            return (C11847b) this.f27514X.get(j);
        }
        if (m38074n()) {
            return this.f27512V;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wanted group at position ");
        sb.append(j);
        sb.append(" but there are only ");
        sb.append(mo29986a());
        sb.append(" groups");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public int mo29986a() {
        return m38067g() + m38065e() + m38070j() + this.f27514X.size();
    }

    /* renamed from: a */
    public void mo29959a(C11847b bVar, int i, int i2) {
        super.mo29959a(bVar, i, i2);
        mo30010c();
    }
}
