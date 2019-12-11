package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0794d0;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4115g;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
class C0837a implements C0891a {

    /* renamed from: a */
    private C4114f<C0839b> f3408a;

    /* renamed from: b */
    final ArrayList<C0839b> f3409b;

    /* renamed from: c */
    final ArrayList<C0839b> f3410c;

    /* renamed from: d */
    final C0838a f3411d;

    /* renamed from: e */
    Runnable f3412e;

    /* renamed from: f */
    final boolean f3413f;

    /* renamed from: g */
    final C0890o f3414g;

    /* renamed from: h */
    private int f3415h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C0838a {
        /* renamed from: a */
        C0794d0 mo4603a(int i);

        /* renamed from: a */
        void mo4604a(int i, int i2);

        /* renamed from: a */
        void mo4605a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4606a(C0839b bVar);

        /* renamed from: b */
        void mo4607b(int i, int i2);

        /* renamed from: b */
        void mo4608b(C0839b bVar);

        /* renamed from: c */
        void mo4609c(int i, int i2);

        /* renamed from: d */
        void mo4611d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class C0839b {

        /* renamed from: a */
        int f3416a;

        /* renamed from: b */
        int f3417b;

        /* renamed from: c */
        Object f3418c;

        /* renamed from: d */
        int f3419d;

        C0839b(int i, int i2, int i3, Object obj) {
            this.f3416a = i;
            this.f3417b = i2;
            this.f3419d = i3;
            this.f3418c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo4945a() {
            int i = this.f3416a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0839b.class != obj.getClass()) {
                return false;
            }
            C0839b bVar = (C0839b) obj;
            int i = this.f3416a;
            if (i != bVar.f3416a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3419d - this.f3417b) == 1 && this.f3419d == bVar.f3417b && this.f3417b == bVar.f3419d) {
                return true;
            }
            if (this.f3419d != bVar.f3419d || this.f3417b != bVar.f3417b) {
                return false;
            }
            Object obj2 = this.f3418c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3418c)) {
                    return false;
                }
            } else if (bVar.f3418c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3416a * 31) + this.f3417b) * 31) + this.f3419d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo4945a());
            sb.append(",s:");
            sb.append(this.f3417b);
            sb.append("c:");
            sb.append(this.f3419d);
            sb.append(",p:");
            sb.append(this.f3418c);
            sb.append("]");
            return sb.toString();
        }
    }

    C0837a(C0838a aVar) {
        this(aVar, false);
    }

    /* renamed from: b */
    private void m4699b(C0839b bVar) {
        m4706g(bVar);
    }

    /* renamed from: c */
    private void m4700c(C0839b bVar) {
        m4706g(bVar);
    }

    /* renamed from: d */
    private void m4702d(C0839b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3417b;
        int i2 = bVar.f3419d + i;
        int i3 = 0;
        char c2 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f3411d.mo4603a(i4) != null || m4703d(i4)) {
                if (c2 == 0) {
                    m4705f(mo4929a(2, i, i3, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m4706g(mo4929a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c2 = c;
        }
        if (i3 != bVar.f3419d) {
            mo4931a(bVar);
            bVar = mo4929a(2, i, i3, null);
        }
        if (c2 == 0) {
            m4705f(bVar);
        } else {
            m4706g(bVar);
        }
    }

    /* renamed from: g */
    private void m4706g(C0839b bVar) {
        this.f3410c.add(bVar);
        int i = bVar.f3416a;
        if (i == 1) {
            this.f3411d.mo4609c(bVar.f3417b, bVar.f3419d);
        } else if (i == 2) {
            this.f3411d.mo4607b(bVar.f3417b, bVar.f3419d);
        } else if (i == 4) {
            this.f3411d.mo4605a(bVar.f3417b, bVar.f3419d, bVar.f3418c);
        } else if (i == 8) {
            this.f3411d.mo4604a(bVar.f3417b, bVar.f3419d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4930a() {
        int size = this.f3410c.size();
        for (int i = 0; i < size; i++) {
            this.f3411d.mo4608b((C0839b) this.f3410c.get(i));
        }
        mo4933a((List<C0839b>) this.f3410c);
        this.f3415h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4943e() {
        this.f3414g.mo5106a(this.f3409b);
        int size = this.f3409b.size();
        for (int i = 0; i < size; i++) {
            C0839b bVar = (C0839b) this.f3409b.get(i);
            int i2 = bVar.f3416a;
            if (i2 == 1) {
                m4699b(bVar);
            } else if (i2 == 2) {
                m4702d(bVar);
            } else if (i2 == 4) {
                m4704e(bVar);
            } else if (i2 == 8) {
                m4700c(bVar);
            }
            Runnable runnable = this.f3412e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3409b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4944f() {
        mo4933a((List<C0839b>) this.f3409b);
        mo4933a((List<C0839b>) this.f3410c);
        this.f3415h = 0;
    }

    C0837a(C0838a aVar, boolean z) {
        this.f3408a = new C4115g(30);
        this.f3409b = new ArrayList<>();
        this.f3410c = new ArrayList<>();
        this.f3415h = 0;
        this.f3411d = aVar;
        this.f3413f = z;
        this.f3414g = new C0890o(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4936b(int i) {
        return mo4928a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4939c() {
        return this.f3409b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4938b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3409b.add(mo4929a(1, i, i2, null));
        this.f3415h |= 1;
        if (this.f3409b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4940c(int i) {
        return (i & this.f3415h) != 0;
    }

    /* renamed from: f */
    private void m4705f(C0839b bVar) {
        int i;
        int i2 = bVar.f3416a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m4701d(bVar.f3417b, i2);
        int i3 = bVar.f3417b;
        int i4 = bVar.f3416a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = d;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f3419d; i8++) {
            int d2 = m4701d(bVar.f3417b + (i * i8), bVar.f3416a);
            int i9 = bVar.f3416a;
            if (i9 == 2 ? d2 == i5 : i9 == 4 && d2 == i5 + 1) {
                i7++;
            } else {
                C0839b a = mo4929a(bVar.f3416a, i5, i7, bVar.f3418c);
                mo4932a(a, i6);
                mo4931a(a);
                if (bVar.f3416a == 4) {
                    i6 += i7;
                }
                i5 = d2;
                i7 = 1;
            }
        }
        Object obj = bVar.f3418c;
        mo4931a(bVar);
        if (i7 > 0) {
            C0839b a2 = mo4929a(bVar.f3416a, i5, i7, obj);
            mo4932a(a2, i6);
            mo4931a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4941c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3409b.add(mo4929a(2, i, i2, null));
        this.f3415h |= 2;
        if (this.f3409b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4932a(C0839b bVar, int i) {
        this.f3411d.mo4606a(bVar);
        int i2 = bVar.f3416a;
        if (i2 == 2) {
            this.f3411d.mo4611d(i, bVar.f3419d);
        } else if (i2 == 4) {
            this.f3411d.mo4605a(i, bVar.f3419d, bVar.f3418c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4937b() {
        mo4930a();
        int size = this.f3409b.size();
        for (int i = 0; i < size; i++) {
            C0839b bVar = (C0839b) this.f3409b.get(i);
            int i2 = bVar.f3416a;
            if (i2 == 1) {
                this.f3411d.mo4608b(bVar);
                this.f3411d.mo4609c(bVar.f3417b, bVar.f3419d);
            } else if (i2 == 2) {
                this.f3411d.mo4608b(bVar);
                this.f3411d.mo4611d(bVar.f3417b, bVar.f3419d);
            } else if (i2 == 4) {
                this.f3411d.mo4608b(bVar);
                this.f3411d.mo4605a(bVar.f3417b, bVar.f3419d, bVar.f3418c);
            } else if (i2 == 8) {
                this.f3411d.mo4608b(bVar);
                this.f3411d.mo4604a(bVar.f3417b, bVar.f3419d);
            }
            Runnable runnable = this.f3412e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4933a((List<C0839b>) this.f3409b);
        this.f3415h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4928a(int i, int i2) {
        int size = this.f3410c.size();
        while (i2 < size) {
            C0839b bVar = (C0839b) this.f3410c.get(i2);
            int i3 = bVar.f3416a;
            if (i3 == 8) {
                int i4 = bVar.f3417b;
                if (i4 == i) {
                    i = bVar.f3419d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3419d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3417b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3419d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3419d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: e */
    private void m4704e(C0839b bVar) {
        int i = bVar.f3417b;
        int i2 = bVar.f3419d + i;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        while (i < i2) {
            if (this.f3411d.mo4603a(i) != null || m4703d(i)) {
                if (c == 0) {
                    m4705f(mo4929a(4, i3, i4, bVar.f3418c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m4706g(mo4929a(4, i3, i4, bVar.f3418c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3419d) {
            Object obj = bVar.f3418c;
            mo4931a(bVar);
            bVar = mo4929a(4, i3, i4, obj);
        }
        if (c == 0) {
            m4705f(bVar);
        } else {
            m4706g(bVar);
        }
    }

    /* renamed from: d */
    private int m4701d(int i, int i2) {
        for (int size = this.f3410c.size() - 1; size >= 0; size--) {
            C0839b bVar = (C0839b) this.f3410c.get(size);
            int i3 = bVar.f3416a;
            if (i3 == 8) {
                int i4 = bVar.f3417b;
                int i5 = bVar.f3419d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f3417b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f3417b = i7 + 1;
                            bVar.f3419d++;
                        } else if (i2 == 2) {
                            bVar.f3417b = i7 - 1;
                            bVar.f3419d--;
                        }
                    }
                } else {
                    int i8 = bVar.f3417b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f3419d++;
                        } else if (i2 == 2) {
                            bVar.f3419d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f3417b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f3417b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f3417b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f3419d;
                    } else if (i3 == 2) {
                        i += bVar.f3419d;
                    }
                } else if (i2 == 1) {
                    bVar.f3417b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f3417b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f3410c.size() - 1; size2 >= 0; size2--) {
            C0839b bVar2 = (C0839b) this.f3410c.get(size2);
            if (bVar2.f3416a == 8) {
                int i10 = bVar2.f3419d;
                if (i10 == bVar2.f3417b || i10 < 0) {
                    this.f3410c.remove(size2);
                    mo4931a(bVar2);
                }
            } else if (bVar2.f3419d <= 0) {
                this.f3410c.remove(size2);
                mo4931a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4935a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3409b.add(mo4929a(4, i, i2, obj));
        this.f3415h |= 4;
        if (this.f3409b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4934a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f3409b.add(mo4929a(8, i, i2, null));
            this.f3415h |= 8;
            if (this.f3409b.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: a */
    public int mo4927a(int i) {
        int size = this.f3409b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0839b bVar = (C0839b) this.f3409b.get(i2);
            int i3 = bVar.f3416a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3417b;
                    if (i4 <= i) {
                        int i5 = bVar.f3419d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3417b;
                    if (i6 == i) {
                        i = bVar.f3419d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3419d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3417b <= i) {
                i += bVar.f3419d;
            }
        }
        return i;
    }

    /* renamed from: a */
    public C0839b mo4929a(int i, int i2, int i3, Object obj) {
        C0839b bVar = (C0839b) this.f3408a.mo14666a();
        if (bVar == null) {
            return new C0839b(i, i2, i3, obj);
        }
        bVar.f3416a = i;
        bVar.f3417b = i2;
        bVar.f3419d = i3;
        bVar.f3418c = obj;
        return bVar;
    }

    /* renamed from: d */
    private boolean m4703d(int i) {
        int size = this.f3410c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0839b bVar = (C0839b) this.f3410c.get(i2);
            int i3 = bVar.f3416a;
            if (i3 == 8) {
                if (mo4928a(bVar.f3419d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3417b;
                int i5 = bVar.f3419d + i4;
                while (i4 < i5) {
                    if (mo4928a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo4931a(C0839b bVar) {
        if (!this.f3413f) {
            bVar.f3418c = null;
            this.f3408a.mo14667a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4933a(List<C0839b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4931a((C0839b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo4942d() {
        return !this.f3410c.isEmpty() && !this.f3409b.isEmpty();
    }
}
