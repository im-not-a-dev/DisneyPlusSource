package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0741y;
import androidx.lifecycle.C0742z;
import androidx.lifecycle.C0742z.C0744b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.l */
/* compiled from: FragmentManagerViewModel */
class C0559l extends C0741y {

    /* renamed from: g */
    private static final C0744b f2416g = new C0560a();

    /* renamed from: a */
    private final HashSet<Fragment> f2417a = new HashSet<>();

    /* renamed from: b */
    private final HashMap<String, C0559l> f2418b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0707b0> f2419c = new HashMap<>();

    /* renamed from: d */
    private final boolean f2420d;

    /* renamed from: e */
    private boolean f2421e = false;

    /* renamed from: f */
    private boolean f2422f = false;

    /* renamed from: androidx.fragment.app.l$a */
    /* compiled from: FragmentManagerViewModel */
    static class C0560a implements C0744b {
        C0560a() {
        }

        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            return new C0559l(true);
        }
    }

    C0559l(boolean z) {
        this.f2420d = z;
    }

    /* renamed from: a */
    static C0559l m3050a(C0707b0 b0Var) {
        return (C0559l) new C0742z(b0Var, f2416g).mo4180a(C0559l.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3282b(Fragment fragment) {
        if (C0542j.f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        C0559l lVar = (C0559l) this.f2418b.get(fragment.mWho);
        if (lVar != null) {
            lVar.onCleared();
            this.f2418b.remove(fragment.mWho);
        }
        C0707b0 b0Var = (C0707b0) this.f2419c.get(fragment.mWho);
        if (b0Var != null) {
            b0Var.mo4119a();
            this.f2419c.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0559l mo3283c(Fragment fragment) {
        C0559l lVar = (C0559l) this.f2418b.get(fragment.mWho);
        if (lVar != null) {
            return lVar;
        }
        C0559l lVar2 = new C0559l(this.f2420d);
        this.f2418b.put(fragment.mWho, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0707b0 mo3284d(Fragment fragment) {
        C0707b0 b0Var = (C0707b0) this.f2419c.get(fragment.mWho);
        if (b0Var != null) {
            return b0Var;
        }
        C0707b0 b0Var2 = new C0707b0();
        this.f2419c.put(fragment.mWho, b0Var2);
        return b0Var2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo3285e(Fragment fragment) {
        return this.f2417a.remove(fragment);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0559l.class != obj.getClass()) {
            return false;
        }
        C0559l lVar = (C0559l) obj;
        if (!this.f2417a.equals(lVar.f2417a) || !this.f2418b.equals(lVar.f2418b) || !this.f2419c.equals(lVar.f2419c)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo3287f(Fragment fragment) {
        if (!this.f2417a.contains(fragment)) {
            return true;
        }
        if (this.f2420d) {
            return this.f2421e;
        }
        return !this.f2422f;
    }

    public int hashCode() {
        return (((this.f2417a.hashCode() * 31) + this.f2418b.hashCode()) * 31) + this.f2419c.hashCode();
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        if (C0542j.f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2421e = true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2417a.iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2418b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2419c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public Collection<Fragment> mo3291y() {
        return this.f2417a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public boolean mo3292z() {
        return this.f2421e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3281a(Fragment fragment) {
        return this.f2417a.add(fragment);
    }
}
