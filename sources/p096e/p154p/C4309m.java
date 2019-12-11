package p096e.p154p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p096e.p113e.C3926a;
import p096e.p113e.C3933f;
import p096e.p113e.C3941i;
import p096e.p121h.p135s.C4187x;

/* renamed from: e.p.m */
/* compiled from: Transition */
public abstract class C4309m implements Cloneable {

    /* renamed from: A0 */
    private static final C4294g f10709A0 = new C4310a();

    /* renamed from: B0 */
    private static ThreadLocal<C3926a<Animator, C4313d>> f10710B0 = new ThreadLocal<>();

    /* renamed from: z0 */
    private static final int[] f10711z0 = {2, 1, 3, 4};

    /* renamed from: U */
    private long f10712U = -1;

    /* renamed from: V */
    long f10713V = -1;

    /* renamed from: W */
    private TimeInterpolator f10714W = null;

    /* renamed from: X */
    ArrayList<Integer> f10715X = new ArrayList<>();

    /* renamed from: Y */
    ArrayList<View> f10716Y = new ArrayList<>();

    /* renamed from: Z */
    private ArrayList<String> f10717Z = null;

    /* renamed from: a0 */
    private ArrayList<Class> f10718a0 = null;

    /* renamed from: b0 */
    private ArrayList<Integer> f10719b0 = null;

    /* renamed from: c */
    private String f10720c = getClass().getName();

    /* renamed from: c0 */
    private ArrayList<View> f10721c0 = null;

    /* renamed from: d0 */
    private ArrayList<Class> f10722d0 = null;

    /* renamed from: e0 */
    private ArrayList<String> f10723e0 = null;

    /* renamed from: f0 */
    private ArrayList<Integer> f10724f0 = null;

    /* renamed from: g0 */
    private ArrayList<View> f10725g0 = null;

    /* renamed from: h0 */
    private ArrayList<Class> f10726h0 = null;

    /* renamed from: i0 */
    private C4326t f10727i0 = new C4326t();

    /* renamed from: j0 */
    private C4326t f10728j0 = new C4326t();

    /* renamed from: k0 */
    C4321q f10729k0 = null;

    /* renamed from: l0 */
    private int[] f10730l0 = f10711z0;

    /* renamed from: m0 */
    private ArrayList<C4325s> f10731m0;

    /* renamed from: n0 */
    private ArrayList<C4325s> f10732n0;

    /* renamed from: o0 */
    boolean f10733o0 = false;

    /* renamed from: p0 */
    ArrayList<Animator> f10734p0 = new ArrayList<>();

    /* renamed from: q0 */
    private int f10735q0 = 0;

    /* renamed from: r0 */
    private boolean f10736r0 = false;

    /* renamed from: s0 */
    private boolean f10737s0 = false;

    /* renamed from: t0 */
    private ArrayList<C4315f> f10738t0 = null;

    /* renamed from: u0 */
    private ArrayList<Animator> f10739u0 = new ArrayList<>();

    /* renamed from: v0 */
    C4320p f10740v0;

    /* renamed from: w0 */
    private C4314e f10741w0;

    /* renamed from: x0 */
    private C3926a<String, String> f10742x0;

    /* renamed from: y0 */
    private C4294g f10743y0 = f10709A0;

    /* renamed from: e.p.m$a */
    /* compiled from: Transition */
    static class C4310a extends C4294g {
        C4310a() {
        }

        /* renamed from: a */
        public Path mo15061a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: e.p.m$b */
    /* compiled from: Transition */
    class C4311b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3926a f10744a;

        C4311b(C3926a aVar) {
            this.f10744a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10744a.remove(animator);
            C4309m.this.f10734p0.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C4309m.this.f10734p0.add(animator);
        }
    }

    /* renamed from: e.p.m$c */
    /* compiled from: Transition */
    class C4312c extends AnimatorListenerAdapter {
        C4312c() {
        }

        public void onAnimationEnd(Animator animator) {
            C4309m.this.mo15088a();
            animator.removeListener(this);
        }
    }

    /* renamed from: e.p.m$d */
    /* compiled from: Transition */
    private static class C4313d {

        /* renamed from: a */
        View f10747a;

        /* renamed from: b */
        String f10748b;

        /* renamed from: c */
        C4325s f10749c;

        /* renamed from: d */
        C4308l0 f10750d;

        /* renamed from: e */
        C4309m f10751e;

        C4313d(View view, String str, C4309m mVar, C4308l0 l0Var, C4325s sVar) {
            this.f10747a = view;
            this.f10748b = str;
            this.f10749c = sVar;
            this.f10750d = l0Var;
            this.f10751e = mVar;
        }
    }

    /* renamed from: e.p.m$e */
    /* compiled from: Transition */
    public static abstract class C4314e {
    }

    /* renamed from: e.p.m$f */
    /* compiled from: Transition */
    public interface C4315f {
        /* renamed from: a */
        void mo15054a(C4309m mVar);

        /* renamed from: b */
        void mo15037b(C4309m mVar);

        /* renamed from: c */
        void mo15038c(C4309m mVar);

        /* renamed from: d */
        void mo15039d(C4309m mVar);
    }

    /* renamed from: c */
    private void m14795c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f10719b0;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f10721c0;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f10722d0;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f10722d0.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C4325s sVar = new C4325s();
                        sVar.f10770b = view;
                        if (z) {
                            mo15008c(sVar);
                        } else {
                            mo15007a(sVar);
                        }
                        sVar.f10771c.add(this);
                        mo15101b(sVar);
                        if (z) {
                            m14791a(this.f10727i0, view, sVar);
                        } else {
                            m14791a(this.f10728j0, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f10724f0;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f10725g0;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f10726h0;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f10726h0.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m14795c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private static C3926a<Animator, C4313d> mo15132p() {
        C3926a<Animator, C4313d> aVar = (C3926a) f10710B0.get();
        if (aVar != null) {
            return aVar;
        }
        C3926a<Animator, C4313d> aVar2 = new C3926a<>();
        f10710B0.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo15006a(ViewGroup viewGroup, C4325s sVar, C4325s sVar2) {
        return null;
    }

    /* renamed from: a */
    public C4309m mo15082a(long j) {
        this.f10713V = j;
        return this;
    }

    /* renamed from: a */
    public abstract void mo15007a(C4325s sVar);

    /* renamed from: b */
    public long mo15097b() {
        return this.f10713V;
    }

    /* renamed from: c */
    public abstract void mo15008c(C4325s sVar);

    /* renamed from: d */
    public TimeInterpolator mo15106d() {
        return this.f10714W;
    }

    /* renamed from: e */
    public void mo15109e(View view) {
        if (this.f10736r0) {
            if (!this.f10737s0) {
                C3926a p = mo15132p();
                int size = p.size();
                C4308l0 d = C4283d0.m14710d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C4313d dVar = (C4313d) p.mo14157d(i);
                    if (dVar.f10747a != null && d.equals(dVar.f10750d)) {
                        C4261a.m14655b((Animator) p.mo14151b(i));
                    }
                }
                ArrayList<C4315f> arrayList = this.f10738t0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f10738t0.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C4315f) arrayList2.get(i2)).mo15039d(this);
                    }
                }
            }
            this.f10736r0 = false;
        }
    }

    /* renamed from: f */
    public C4294g mo15110f() {
        return this.f10743y0;
    }

    /* renamed from: g */
    public C4320p mo15111g() {
        return this.f10740v0;
    }

    /* renamed from: h */
    public long mo15112h() {
        return this.f10712U;
    }

    /* renamed from: i */
    public List<Integer> mo15113i() {
        return this.f10715X;
    }

    /* renamed from: j */
    public List<String> mo15114j() {
        return this.f10717Z;
    }

    /* renamed from: k */
    public List<Class> mo15115k() {
        return this.f10718a0;
    }

    /* renamed from: l */
    public List<View> mo15116l() {
        return this.f10716Y;
    }

    /* renamed from: m */
    public String[] mo15009m() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo15117n() {
        mo15118o();
        C3926a p = mo15132p();
        Iterator it = this.f10739u0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                mo15118o();
                m14786a(animator, p);
            }
        }
        this.f10739u0.clear();
        mo15088a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo15118o() {
        if (this.f10735q0 == 0) {
            ArrayList<C4315f> arrayList = this.f10738t0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10738t0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C4315f) arrayList2.get(i)).mo15054a(this);
                }
            }
            this.f10737s0 = false;
        }
        this.f10735q0++;
    }

    public String toString() {
        return mo15087a("");
    }

    /* renamed from: a */
    public C4309m mo15083a(TimeInterpolator timeInterpolator) {
        this.f10714W = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public C4309m mo15098b(long j) {
        this.f10712U = j;
        return this;
    }

    public C4309m clone() {
        try {
            C4309m mVar = (C4309m) super.clone();
            mVar.f10739u0 = new ArrayList<>();
            mVar.f10727i0 = new C4326t();
            mVar.f10728j0 = new C4326t();
            mVar.f10731m0 = null;
            mVar.f10732n0 = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C4309m mo15107d(View view) {
        this.f10716Y.remove(view);
        return this;
    }

    /* renamed from: a */
    private void m14790a(C3926a<View, C4325s> aVar, C3926a<View, C4325s> aVar2, C3933f<View> fVar, C3933f<View> fVar2) {
        int b = fVar.mo14061b();
        for (int i = 0; i < b; i++) {
            View view = (View) fVar.mo14065c(i);
            if (view != null && mo15102b(view)) {
                View view2 = (View) fVar2.mo14066c(fVar.mo14057a(i));
                if (view2 != null && mo15102b(view2)) {
                    C4325s sVar = (C4325s) aVar.get(view);
                    C4325s sVar2 = (C4325s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10731m0.add(sVar);
                        this.f10732n0.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m14794b(C3926a<View, C4325s> aVar, C3926a<View, C4325s> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo14151b(size);
            if (view != null && mo15102b(view)) {
                C4325s sVar = (C4325s) aVar2.remove(view);
                if (sVar != null) {
                    View view2 = sVar.f10770b;
                    if (view2 != null && mo15102b(view2)) {
                        this.f10731m0.add((C4325s) aVar.mo14153c(size));
                        this.f10732n0.add(sVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo15102b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f10719b0;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f10721c0;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList3 = this.f10722d0;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f10722d0.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f10723e0 != null && C4187x.m14405t(view) != null && this.f10723e0.contains(C4187x.m14405t(view))) {
            return false;
        }
        if (this.f10715X.size() == 0 && this.f10716Y.size() == 0) {
            ArrayList<Class> arrayList4 = this.f10718a0;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f10717Z;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f10715X.contains(Integer.valueOf(id)) || this.f10716Y.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f10717Z;
        if (arrayList6 != null && arrayList6.contains(C4187x.m14405t(view))) {
            return true;
        }
        if (this.f10718a0 != null) {
            for (int i2 = 0; i2 < this.f10718a0.size(); i2++) {
                if (((Class) this.f10718a0.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m14788a(C3926a<View, C4325s> aVar, C3926a<View, C4325s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo15102b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo15102b(view2)) {
                    C4325s sVar = (C4325s) aVar.get(view);
                    C4325s sVar2 = (C4325s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10731m0.add(sVar);
                        this.f10732n0.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public String mo15108e() {
        return this.f10720c;
    }

    /* renamed from: a */
    private void m14789a(C3926a<View, C4325s> aVar, C3926a<View, C4325s> aVar2, C3926a<String, View> aVar3, C3926a<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo14157d(i);
            if (view != null && mo15102b(view)) {
                View view2 = (View) aVar4.get(aVar3.mo14151b(i));
                if (view2 != null && mo15102b(view2)) {
                    C4325s sVar = (C4325s) aVar.get(view);
                    C4325s sVar2 = (C4325s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10731m0.add(sVar);
                        this.f10732n0.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo15104c(View view) {
        if (!this.f10737s0) {
            C3926a p = mo15132p();
            int size = p.size();
            C4308l0 d = C4283d0.m14710d(view);
            for (int i = size - 1; i >= 0; i--) {
                C4313d dVar = (C4313d) p.mo14157d(i);
                if (dVar.f10747a != null && d.equals(dVar.f10750d)) {
                    C4261a.m14653a((Animator) p.mo14151b(i));
                }
            }
            ArrayList<C4315f> arrayList = this.f10738t0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10738t0.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C4315f) arrayList2.get(i2)).mo15037b(this);
                }
            }
            this.f10736r0 = true;
        }
    }

    /* renamed from: b */
    public C4325s mo15100b(View view, boolean z) {
        C4321q qVar = this.f10729k0;
        if (qVar != null) {
            return qVar.mo15100b(view, z);
        }
        return (C4325s) (z ? this.f10727i0 : this.f10728j0).f10772a.get(view);
    }

    /* renamed from: b */
    public C4309m mo15099b(C4315f fVar) {
        ArrayList<C4315f> arrayList = this.f10738t0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f10738t0.size() == 0) {
            this.f10738t0 = null;
        }
        return this;
    }

    /* renamed from: a */
    private void m14787a(C3926a<View, C4325s> aVar, C3926a<View, C4325s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C4325s sVar = (C4325s) aVar.mo14157d(i);
            if (mo15102b(sVar.f10770b)) {
                this.f10731m0.add(sVar);
                this.f10732n0.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C4325s sVar2 = (C4325s) aVar2.mo14157d(i2);
            if (mo15102b(sVar2.f10770b)) {
                this.f10732n0.add(sVar2);
                this.f10731m0.add(null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15101b(C4325s sVar) {
        if (this.f10740v0 != null && !sVar.f10769a.isEmpty()) {
            String[] a = this.f10740v0.mo15128a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!sVar.f10769a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f10740v0.mo15127a(sVar);
                }
            }
        }
    }

    /* renamed from: c */
    public C4314e mo15103c() {
        return this.f10741w0;
    }

    /* renamed from: a */
    private void m14792a(C4326t tVar, C4326t tVar2) {
        C3926a aVar = new C3926a((C3941i) tVar.f10772a);
        C3926a aVar2 = new C3926a((C3941i) tVar2.f10772a);
        int i = 0;
        while (true) {
            int[] iArr = this.f10730l0;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m14794b(aVar, aVar2);
                } else if (i2 == 2) {
                    m14789a(aVar, aVar2, tVar.f10775d, tVar2.f10775d);
                } else if (i2 == 3) {
                    m14788a(aVar, aVar2, tVar.f10773b, tVar2.f10773b);
                } else if (i2 == 4) {
                    m14790a(aVar, aVar2, tVar.f10774c, tVar2.f10774c);
                }
                i++;
            } else {
                m14787a(aVar, aVar2);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15091a(ViewGroup viewGroup, C4326t tVar, C4326t tVar2, ArrayList<C4325s> arrayList, ArrayList<C4325s> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C4325s sVar;
        C4325s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C3926a p = mo15132p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C4325s sVar3 = (C4325s) arrayList.get(i3);
            C4325s sVar4 = (C4325s) arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f10771c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f10771c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo15068a(sVar3, sVar4)) {
                    Animator a = mo15006a(viewGroup2, sVar3, sVar4);
                    if (a != null) {
                        if (sVar4 != null) {
                            view = sVar4.f10770b;
                            String[] m = mo15009m();
                            if (view != null && m != null && m.length > 0) {
                                sVar2 = new C4325s();
                                sVar2.f10770b = view;
                                Animator animator3 = a;
                                i2 = size;
                                C4325s sVar5 = (C4325s) tVar2.f10772a.get(view);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < m.length) {
                                        int i5 = i3;
                                        C4325s sVar6 = sVar5;
                                        sVar2.f10769a.put(m[i4], sVar5.f10769a.get(m[i4]));
                                        i4++;
                                        ArrayList<C4325s> arrayList3 = arrayList2;
                                        i3 = i5;
                                        sVar5 = sVar6;
                                    }
                                }
                                i = i3;
                                int size2 = p.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C4313d dVar = (C4313d) p.get((Animator) p.mo14151b(i6));
                                    if (dVar.f10749c != null && dVar.f10747a == view && dVar.f10748b.equals(mo15108e()) && dVar.f10749c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                sVar2 = null;
                            }
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            Animator animator4 = a;
                            i2 = size;
                            i = i3;
                            view = sVar3.f10770b;
                            animator = animator4;
                            sVar = null;
                        }
                        if (animator != null) {
                            C4320p pVar = this.f10740v0;
                            if (pVar != null) {
                                long a2 = pVar.mo15126a(viewGroup2, this, sVar3, sVar4);
                                sparseIntArray.put(this.f10739u0.size(), (int) a2);
                                j = Math.min(a2, j);
                            }
                            long j2 = j;
                            C4313d dVar2 = new C4313d(view, mo15108e(), this, C4283d0.m14710d(viewGroup), sVar);
                            p.put(animator, dVar2);
                            this.f10739u0.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator5 = (Animator) this.f10739u0.get(sparseIntArray.keyAt(i7));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator5.getStartDelay());
            }
        }
    }

    /* renamed from: a */
    private void m14786a(Animator animator, C3926a<Animator, C4313d> aVar) {
        if (animator != null) {
            animator.addListener(new C4311b(aVar));
            mo15089a(animator);
        }
    }

    /* renamed from: a */
    public C4309m mo15084a(View view) {
        this.f10716Y.add(view);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15092a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            r5.mo15096a(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f10715X
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f10716Y
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f10717Z
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class> r0 = r5.f10718a0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m14795c(r6, r7)
            goto L_0x00aa
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f10715X
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0071
            java.util.ArrayList<java.lang.Integer> r2 = r5.f10715X
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x006e
            e.p.s r3 = new e.p.s
            r3.<init>()
            r3.f10770b = r2
            if (r7 == 0) goto L_0x0056
            r5.mo15008c(r3)
            goto L_0x0059
        L_0x0056:
            r5.mo15007a(r3)
        L_0x0059:
            java.util.ArrayList<e.p.m> r4 = r3.f10771c
            r4.add(r5)
            r5.mo15101b(r3)
            if (r7 == 0) goto L_0x0069
            e.p.t r4 = r5.f10727i0
            m14791a(r4, r2, r3)
            goto L_0x006e
        L_0x0069:
            e.p.t r4 = r5.f10728j0
            m14791a(r4, r2, r3)
        L_0x006e:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x0071:
            r6 = 0
        L_0x0072:
            java.util.ArrayList<android.view.View> r0 = r5.f10716Y
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00aa
            java.util.ArrayList<android.view.View> r0 = r5.f10716Y
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            e.p.s r2 = new e.p.s
            r2.<init>()
            r2.f10770b = r0
            if (r7 == 0) goto L_0x008f
            r5.mo15008c(r2)
            goto L_0x0092
        L_0x008f:
            r5.mo15007a(r2)
        L_0x0092:
            java.util.ArrayList<e.p.m> r3 = r2.f10771c
            r3.add(r5)
            r5.mo15101b(r2)
            if (r7 == 0) goto L_0x00a2
            e.p.t r3 = r5.f10727i0
            m14791a(r3, r0, r2)
            goto L_0x00a7
        L_0x00a2:
            e.p.t r3 = r5.f10728j0
            m14791a(r3, r0, r2)
        L_0x00a7:
            int r6 = r6 + 1
            goto L_0x0072
        L_0x00aa:
            if (r7 != 0) goto L_0x00ee
            e.e.a<java.lang.String, java.lang.String> r6 = r5.f10742x0
            if (r6 == 0) goto L_0x00ee
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00ba:
            if (r0 >= r6) goto L_0x00d2
            e.e.a<java.lang.String, java.lang.String> r2 = r5.f10742x0
            java.lang.Object r2 = r2.mo14151b(r0)
            java.lang.String r2 = (java.lang.String) r2
            e.p.t r3 = r5.f10727i0
            e.e.a<java.lang.String, android.view.View> r3 = r3.f10775d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00ba
        L_0x00d2:
            if (r1 >= r6) goto L_0x00ee
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00eb
            e.e.a<java.lang.String, java.lang.String> r2 = r5.f10742x0
            java.lang.Object r2 = r2.mo14157d(r1)
            java.lang.String r2 = (java.lang.String) r2
            e.p.t r3 = r5.f10727i0
            e.e.a<java.lang.String, android.view.View> r3 = r3.f10775d
            r3.put(r2, r0)
        L_0x00eb:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p154p.C4309m.mo15092a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    private static void m14791a(C4326t tVar, View view, C4325s sVar) {
        tVar.f10772a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f10773b.indexOfKey(id) >= 0) {
                tVar.f10773b.put(id, null);
            } else {
                tVar.f10773b.put(id, view);
            }
        }
        String t = C4187x.m14405t(view);
        if (t != null) {
            if (tVar.f10775d.containsKey(t)) {
                tVar.f10775d.put(t, null);
            } else {
                tVar.f10775d.put(t, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f10774c.mo14069d(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f10774c.mo14066c(itemIdAtPosition);
                    if (view2 != null) {
                        C4187x.m14374b(view2, false);
                        tVar.f10774c.mo14067c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C4187x.m14374b(view, true);
                tVar.f10774c.mo14067c(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15096a(boolean z) {
        if (z) {
            this.f10727i0.f10772a.clear();
            this.f10727i0.f10773b.clear();
            this.f10727i0.f10774c.mo14058a();
            return;
        }
        this.f10728j0.f10772a.clear();
        this.f10728j0.f10773b.clear();
        this.f10728j0.f10774c.mo14058a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4325s mo15086a(View view, boolean z) {
        C4321q qVar = this.f10729k0;
        if (qVar != null) {
            return qVar.mo15086a(view, z);
        }
        ArrayList<C4325s> arrayList = z ? this.f10731m0 : this.f10732n0;
        C4325s sVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C4325s sVar2 = (C4325s) arrayList.get(i2);
            if (sVar2 == null) {
                return null;
            }
            if (sVar2.f10770b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            sVar = (C4325s) (z ? this.f10732n0 : this.f10731m0).get(i);
        }
        return sVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15090a(ViewGroup viewGroup) {
        this.f10731m0 = new ArrayList<>();
        this.f10732n0 = new ArrayList<>();
        m14792a(this.f10727i0, this.f10728j0);
        C3926a p = mo15132p();
        int size = p.size();
        C4308l0 d = C4283d0.m14710d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) p.mo14151b(i);
            if (animator != null) {
                C4313d dVar = (C4313d) p.get(animator);
                if (!(dVar == null || dVar.f10747a == null || !d.equals(dVar.f10750d))) {
                    C4325s sVar = dVar.f10749c;
                    View view = dVar.f10747a;
                    C4325s b = mo15100b(view, true);
                    C4325s a = mo15086a(view, true);
                    if (!(b == null && a == null) && dVar.f10751e.mo15068a(sVar, a)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            p.remove(animator);
                        }
                    }
                }
            }
        }
        mo15091a(viewGroup, this.f10727i0, this.f10728j0, this.f10731m0, this.f10732n0);
        mo15117n();
    }

    /* renamed from: a */
    public boolean mo15068a(C4325s sVar, C4325s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] m = mo15009m();
        if (m != null) {
            int length = m.length;
            int i = 0;
            while (i < length) {
                if (!m14793a(sVar, sVar2, m[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : sVar.f10769a.keySet()) {
            if (m14793a(sVar, sVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m14793a(C4325s sVar, C4325s sVar2, String str) {
        Object obj = sVar.f10769a.get(str);
        Object obj2 = sVar2.f10769a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15089a(Animator animator) {
        if (animator == null) {
            mo15088a();
            return;
        }
        if (mo15097b() >= 0) {
            animator.setDuration(mo15097b());
        }
        if (mo15112h() >= 0) {
            animator.setStartDelay(mo15112h());
        }
        if (mo15106d() != null) {
            animator.setInterpolator(mo15106d());
        }
        animator.addListener(new C4312c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15088a() {
        this.f10735q0--;
        if (this.f10735q0 == 0) {
            ArrayList<C4315f> arrayList = this.f10738t0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10738t0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C4315f) arrayList2.get(i)).mo15038c(this);
                }
            }
            for (int i2 = 0; i2 < this.f10727i0.f10774c.mo14061b(); i2++) {
                View view = (View) this.f10727i0.f10774c.mo14065c(i2);
                if (view != null) {
                    C4187x.m14374b(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f10728j0.f10774c.mo14061b(); i3++) {
                View view2 = (View) this.f10728j0.f10774c.mo14065c(i3);
                if (view2 != null) {
                    C4187x.m14374b(view2, false);
                }
            }
            this.f10737s0 = true;
        }
    }

    /* renamed from: a */
    public C4309m mo15085a(C4315f fVar) {
        if (this.f10738t0 == null) {
            this.f10738t0 = new ArrayList<>();
        }
        this.f10738t0.add(fVar);
        return this;
    }

    /* renamed from: a */
    public void mo15093a(C4294g gVar) {
        if (gVar == null) {
            this.f10743y0 = f10709A0;
        } else {
            this.f10743y0 = gVar;
        }
    }

    /* renamed from: a */
    public void mo15094a(C4314e eVar) {
        this.f10741w0 = eVar;
    }

    /* renamed from: a */
    public void mo15095a(C4320p pVar) {
        this.f10740v0 = pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo15087a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f10713V != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f10713V);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.f10712U != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f10712U);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.f10714W != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f10714W);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.f10715X.size() <= 0 && this.f10716Y.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.f10715X.size() > 0) {
            String str4 = sb7;
            for (int i = 0; i < this.f10715X.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(str3);
                    str4 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str4);
                sb9.append(this.f10715X.get(i));
                str4 = sb9.toString();
            }
            sb7 = str4;
        }
        if (this.f10716Y.size() > 0) {
            for (int i2 = 0; i2 < this.f10716Y.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f10716Y.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }
}
