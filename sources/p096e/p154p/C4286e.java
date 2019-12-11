package p096e.p154p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0577r;
import java.util.ArrayList;
import java.util.List;
import p096e.p154p.C4309m.C4314e;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.e */
/* compiled from: FragmentTransitionSupport */
public class C4286e extends C0577r {

    /* renamed from: e.p.e$a */
    /* compiled from: FragmentTransitionSupport */
    class C4287a extends C4314e {
        C4287a(C4286e eVar, Rect rect) {
        }
    }

    /* renamed from: e.p.e$b */
    /* compiled from: FragmentTransitionSupport */
    class C4288b implements C4315f {

        /* renamed from: a */
        final /* synthetic */ View f10663a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10664b;

        C4288b(C4286e eVar, View view, ArrayList arrayList) {
            this.f10663a = view;
            this.f10664b = arrayList;
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            mVar.mo15099b((C4315f) this);
            this.f10663a.setVisibility(8);
            int size = this.f10664b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f10664b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
        }
    }

    /* renamed from: e.p.e$c */
    /* compiled from: FragmentTransitionSupport */
    class C4289c implements C4315f {

        /* renamed from: a */
        final /* synthetic */ Object f10665a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10666b;

        /* renamed from: c */
        final /* synthetic */ Object f10667c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f10668d;

        /* renamed from: e */
        final /* synthetic */ Object f10669e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f10670f;

        C4289c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10665a = obj;
            this.f10666b = arrayList;
            this.f10667c = obj2;
            this.f10668d = arrayList2;
            this.f10669e = obj3;
            this.f10670f = arrayList3;
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
            Object obj = this.f10665a;
            if (obj != null) {
                C4286e.this.mo3332a(obj, this.f10666b, null);
            }
            Object obj2 = this.f10667c;
            if (obj2 != null) {
                C4286e.this.mo3332a(obj2, this.f10668d, null);
            }
            Object obj3 = this.f10669e;
            if (obj3 != null) {
                C4286e.this.mo3332a(obj3, this.f10670f, null);
            }
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
        }
    }

    /* renamed from: e.p.e$d */
    /* compiled from: FragmentTransitionSupport */
    class C4290d extends C4314e {
        C4290d(C4286e eVar, Rect rect) {
        }
    }

    /* renamed from: a */
    public boolean mo3333a(Object obj) {
        return obj instanceof C4309m;
    }

    /* renamed from: b */
    public Object mo3334b(Object obj) {
        if (obj != null) {
            return ((C4309m) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo3339c(Object obj) {
        if (obj == null) {
            return null;
        }
        C4321q qVar = new C4321q();
        qVar.mo15130a((C4309m) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo3331a(Object obj, ArrayList<View> arrayList) {
        C4309m mVar = (C4309m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C4321q) {
                C4321q qVar = (C4321q) mVar;
                int p = qVar.mo15132p();
                while (i < p) {
                    mo3331a((Object) qVar.mo15129a(i), arrayList);
                    i++;
                }
            } else if (!m14716a(mVar) && C0577r.m3140a(mVar.mo15116l())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo15084a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3337b(Object obj, View view, ArrayList<View> arrayList) {
        C4321q qVar = (C4321q) obj;
        List l = qVar.mo15116l();
        l.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0577r.m3139a(l, (View) arrayList.get(i));
        }
        l.add(view);
        arrayList.add(view);
        mo3331a((Object) qVar, arrayList);
    }

    /* renamed from: c */
    public void mo3340c(Object obj, View view) {
        if (view != null) {
            C4309m mVar = (C4309m) obj;
            Rect rect = new Rect();
            mo3354a(view, rect);
            mVar.mo15094a((C4314e) new C4287a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo3335b(Object obj, Object obj2, Object obj3) {
        C4321q qVar = new C4321q();
        if (obj != null) {
            qVar.mo15130a((C4309m) obj);
        }
        if (obj2 != null) {
            qVar.mo15130a((C4309m) obj2);
        }
        if (obj3 != null) {
            qVar.mo15130a((C4309m) obj3);
        }
        return qVar;
    }

    /* renamed from: a */
    private static boolean m14716a(C4309m mVar) {
        return !C0577r.m3140a(mVar.mo15113i()) || !C0577r.m3140a(mVar.mo15114j()) || !C0577r.m3140a(mVar.mo15115k());
    }

    /* renamed from: b */
    public void mo3338b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C4321q qVar = (C4321q) obj;
        if (qVar != null) {
            qVar.mo15116l().clear();
            qVar.mo15116l().addAll(arrayList2);
            mo3332a((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo3329a(Object obj, View view, ArrayList<View> arrayList) {
        ((C4309m) obj).mo15085a((C4315f) new C4288b(this, view, arrayList));
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo3325a(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            e.p.m r2 = (p096e.p154p.C4309m) r2
            e.p.m r3 = (p096e.p154p.C4309m) r3
            e.p.m r4 = (p096e.p154p.C4309m) r4
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            e.p.q r0 = new e.p.q
            r0.<init>()
            r0.mo15130a(r2)
            r0.mo15130a(r3)
            r2 = 1
            r0.mo15131b(r2)
            r2 = r0
            goto L_0x0023
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r4 == 0) goto L_0x0033
            e.p.q r3 = new e.p.q
            r3.<init>()
            if (r2 == 0) goto L_0x002f
            r3.mo15130a(r2)
        L_0x002f:
            r3.mo15130a(r4)
            return r3
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p154p.C4286e.mo3325a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public void mo3336b(Object obj, View view) {
        if (obj != null) {
            ((C4309m) obj).mo15107d(view);
        }
    }

    /* renamed from: a */
    public void mo3326a(ViewGroup viewGroup, Object obj) {
        C4317o.m14847a(viewGroup, (C4309m) obj);
    }

    /* renamed from: a */
    public void mo3330a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C4309m mVar = (C4309m) obj;
        C4289c cVar = new C4289c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        mVar.mo15085a((C4315f) cVar);
    }

    /* renamed from: a */
    public void mo3332a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C4309m mVar = (C4309m) obj;
        int i2 = 0;
        if (mVar instanceof C4321q) {
            C4321q qVar = (C4321q) mVar;
            int p = qVar.mo15132p();
            while (i2 < p) {
                mo3332a((Object) qVar.mo15129a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m14716a(mVar)) {
            List l = mVar.mo15116l();
            if (l.size() == arrayList.size() && l.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo15084a((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo15107d((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3328a(Object obj, View view) {
        if (obj != null) {
            ((C4309m) obj).mo15084a(view);
        }
    }

    /* renamed from: a */
    public void mo3327a(Object obj, Rect rect) {
        if (obj != null) {
            ((C4309m) obj).mo15094a((C4314e) new C4290d(this, rect));
        }
    }
}
