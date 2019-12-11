package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0802l.C0805c;
import p096e.p113e.C3926a;
import p096e.p113e.C3933f;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4115g;

/* renamed from: androidx.recyclerview.widget.w */
/* compiled from: ViewInfoStore */
class C0906w {

    /* renamed from: a */
    final C3926a<C0794d0, C0907a> f3646a = new C3926a<>();

    /* renamed from: b */
    final C3933f<C0794d0> f3647b = new C3933f<>();

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* compiled from: ViewInfoStore */
    static class C0907a {

        /* renamed from: d */
        static C4114f<C0907a> f3648d = new C4115g(20);

        /* renamed from: a */
        int f3649a;

        /* renamed from: b */
        C0805c f3650b;

        /* renamed from: c */
        C0805c f3651c;

        private C0907a() {
        }

        /* renamed from: a */
        static void m5069a(C0907a aVar) {
            aVar.f3649a = 0;
            aVar.f3650b = null;
            aVar.f3651c = null;
            f3648d.mo14667a(aVar);
        }

        /* renamed from: b */
        static C0907a m5070b() {
            C0907a aVar = (C0907a) f3648d.mo14666a();
            return aVar == null ? new C0907a() : aVar;
        }

        /* renamed from: a */
        static void m5068a() {
            do {
            } while (f3648d.mo14666a() != null);
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    /* compiled from: ViewInfoStore */
    interface C0908b {
        /* renamed from: a */
        void mo4551a(C0794d0 d0Var);

        /* renamed from: a */
        void mo4552a(C0794d0 d0Var, C0805c cVar, C0805c cVar2);

        /* renamed from: b */
        void mo4553b(C0794d0 d0Var, C0805c cVar, C0805c cVar2);

        /* renamed from: c */
        void mo4554c(C0794d0 d0Var, C0805c cVar, C0805c cVar2);
    }

    C0906w() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5159a() {
        this.f3646a.clear();
        this.f3647b.mo14058a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5166b(C0794d0 d0Var) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar == null || (aVar.f3649a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5167c(C0794d0 d0Var, C0805c cVar) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar == null) {
            aVar = C0907a.m5070b();
            this.f3646a.put(d0Var, aVar);
        }
        aVar.f3650b = cVar;
        aVar.f3649a |= 4;
    }

    /* renamed from: d */
    public void mo5169d(C0794d0 d0Var) {
        mo5172g(d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0805c mo5170e(C0794d0 d0Var) {
        return m5051a(d0Var, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C0805c mo5171f(C0794d0 d0Var) {
        return m5051a(d0Var, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5172g(C0794d0 d0Var) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar != null) {
            aVar.f3649a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5173h(C0794d0 d0Var) {
        int b = this.f3647b.mo14061b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (d0Var == this.f3647b.mo14065c(b)) {
                this.f3647b.mo14063b(b);
                break;
            } else {
                b--;
            }
        }
        C0907a aVar = (C0907a) this.f3646a.remove(d0Var);
        if (aVar != null) {
            C0907a.m5069a(aVar);
        }
    }

    /* renamed from: a */
    private C0805c m5051a(C0794d0 d0Var, int i) {
        C0805c cVar;
        int b = this.f3646a.mo14150b((Object) d0Var);
        if (b < 0) {
            return null;
        }
        C0907a aVar = (C0907a) this.f3646a.mo14157d(b);
        if (aVar != null) {
            int i2 = aVar.f3649a;
            if ((i2 & i) != 0) {
                aVar.f3649a = (~i) & i2;
                if (i == 4) {
                    cVar = aVar.f3650b;
                } else if (i == 8) {
                    cVar = aVar.f3651c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.f3649a & 12) == 0) {
                    this.f3646a.mo14153c(b);
                    C0907a.m5069a(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5165b(C0794d0 d0Var, C0805c cVar) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar == null) {
            aVar = C0907a.m5070b();
            this.f3646a.put(d0Var, aVar);
        }
        aVar.f3651c = cVar;
        aVar.f3649a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5168c(C0794d0 d0Var) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        return (aVar == null || (aVar.f3649a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5164b() {
        C0907a.m5068a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5160a(long j, C0794d0 d0Var) {
        this.f3647b.mo14067c(j, d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5162a(C0794d0 d0Var, C0805c cVar) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar == null) {
            aVar = C0907a.m5070b();
            this.f3646a.put(d0Var, aVar);
        }
        aVar.f3649a |= 2;
        aVar.f3650b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0794d0 mo5158a(long j) {
        return (C0794d0) this.f3647b.mo14066c(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5161a(C0794d0 d0Var) {
        C0907a aVar = (C0907a) this.f3646a.get(d0Var);
        if (aVar == null) {
            aVar = C0907a.m5070b();
            this.f3646a.put(d0Var, aVar);
        }
        aVar.f3649a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5163a(C0908b bVar) {
        for (int size = this.f3646a.size() - 1; size >= 0; size--) {
            C0794d0 d0Var = (C0794d0) this.f3646a.mo14151b(size);
            C0907a aVar = (C0907a) this.f3646a.mo14153c(size);
            int i = aVar.f3649a;
            if ((i & 3) == 3) {
                bVar.mo4551a(d0Var);
            } else if ((i & 1) != 0) {
                C0805c cVar = aVar.f3650b;
                if (cVar == null) {
                    bVar.mo4551a(d0Var);
                } else {
                    bVar.mo4553b(d0Var, cVar, aVar.f3651c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo4552a(d0Var, aVar.f3650b, aVar.f3651c);
            } else if ((i & 12) == 12) {
                bVar.mo4554c(d0Var, aVar.f3650b, aVar.f3651c);
            } else if ((i & 4) != 0) {
                bVar.mo4553b(d0Var, aVar.f3650b, null);
            } else if ((i & 8) != 0) {
                bVar.mo4552a(d0Var, aVar.f3650b, aVar.f3651c);
            }
            C0907a.m5069a(aVar);
        }
    }
}
