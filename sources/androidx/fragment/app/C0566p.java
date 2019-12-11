package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0489m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3926a;
import p096e.p121h.p135s.C4183t;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentTransition */
class C0566p {

    /* renamed from: a */
    private static final int[] f2467a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0577r f2468b = (VERSION.SDK_INT >= 21 ? new C0572q() : null);

    /* renamed from: c */
    private static final C0577r f2469c = m3094a();

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentTransition */
    static class C0567a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f2470c;

        C0567a(ArrayList arrayList) {
            this.f2470c = arrayList;
        }

        public void run() {
            C0566p.m3113a(this.f2470c, 4);
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    /* compiled from: FragmentTransition */
    static class C0568b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C0577r f2471U;

        /* renamed from: V */
        final /* synthetic */ View f2472V;

        /* renamed from: W */
        final /* synthetic */ Fragment f2473W;

        /* renamed from: X */
        final /* synthetic */ ArrayList f2474X;

        /* renamed from: Y */
        final /* synthetic */ ArrayList f2475Y;

        /* renamed from: Z */
        final /* synthetic */ ArrayList f2476Z;

        /* renamed from: a0 */
        final /* synthetic */ Object f2477a0;

        /* renamed from: c */
        final /* synthetic */ Object f2478c;

        C0568b(Object obj, C0577r rVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2478c = obj;
            this.f2471U = rVar;
            this.f2472V = view;
            this.f2473W = fragment;
            this.f2474X = arrayList;
            this.f2475Y = arrayList2;
            this.f2476Z = arrayList3;
            this.f2477a0 = obj2;
        }

        public void run() {
            Object obj = this.f2478c;
            if (obj != null) {
                this.f2471U.mo3336b(obj, this.f2472V);
                this.f2475Y.addAll(C0566p.m3103a(this.f2471U, this.f2478c, this.f2473W, this.f2474X, this.f2472V));
            }
            if (this.f2476Z != null) {
                if (this.f2477a0 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2472V);
                    this.f2471U.mo3332a(this.f2477a0, this.f2476Z, arrayList);
                }
                this.f2476Z.clear();
                this.f2476Z.add(this.f2472V);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    /* compiled from: FragmentTransition */
    static class C0569c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Fragment f2479U;

        /* renamed from: V */
        final /* synthetic */ boolean f2480V;

        /* renamed from: W */
        final /* synthetic */ C3926a f2481W;

        /* renamed from: X */
        final /* synthetic */ View f2482X;

        /* renamed from: Y */
        final /* synthetic */ C0577r f2483Y;

        /* renamed from: Z */
        final /* synthetic */ Rect f2484Z;

        /* renamed from: c */
        final /* synthetic */ Fragment f2485c;

        C0569c(Fragment fragment, Fragment fragment2, boolean z, C3926a aVar, View view, C0577r rVar, Rect rect) {
            this.f2485c = fragment;
            this.f2479U = fragment2;
            this.f2480V = z;
            this.f2481W = aVar;
            this.f2482X = view;
            this.f2483Y = rVar;
            this.f2484Z = rect;
        }

        public void run() {
            C0566p.m3104a(this.f2485c, this.f2479U, this.f2480V, this.f2481W, false);
            View view = this.f2482X;
            if (view != null) {
                this.f2483Y.mo3354a(view, this.f2484Z);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    /* compiled from: FragmentTransition */
    static class C0570d implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C3926a f2486U;

        /* renamed from: V */
        final /* synthetic */ Object f2487V;

        /* renamed from: W */
        final /* synthetic */ C0571e f2488W;

        /* renamed from: X */
        final /* synthetic */ ArrayList f2489X;

        /* renamed from: Y */
        final /* synthetic */ View f2490Y;

        /* renamed from: Z */
        final /* synthetic */ Fragment f2491Z;

        /* renamed from: a0 */
        final /* synthetic */ Fragment f2492a0;

        /* renamed from: b0 */
        final /* synthetic */ boolean f2493b0;

        /* renamed from: c */
        final /* synthetic */ C0577r f2494c;

        /* renamed from: c0 */
        final /* synthetic */ ArrayList f2495c0;

        /* renamed from: d0 */
        final /* synthetic */ Object f2496d0;

        /* renamed from: e0 */
        final /* synthetic */ Rect f2497e0;

        C0570d(C0577r rVar, C3926a aVar, Object obj, C0571e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2494c = rVar;
            this.f2486U = aVar;
            this.f2487V = obj;
            this.f2488W = eVar;
            this.f2489X = arrayList;
            this.f2490Y = view;
            this.f2491Z = fragment;
            this.f2492a0 = fragment2;
            this.f2493b0 = z;
            this.f2495c0 = arrayList2;
            this.f2496d0 = obj2;
            this.f2497e0 = rect;
        }

        public void run() {
            C3926a a = C0566p.m3097a(this.f2494c, this.f2486U, this.f2487V, this.f2488W);
            if (a != null) {
                this.f2489X.addAll(a.values());
                this.f2489X.add(this.f2490Y);
            }
            C0566p.m3104a(this.f2491Z, this.f2492a0, this.f2493b0, a, false);
            Object obj = this.f2487V;
            if (obj != null) {
                this.f2494c.mo3338b(obj, this.f2495c0, this.f2489X);
                View a2 = C0566p.m3092a(a, this.f2488W, this.f2496d0, this.f2493b0);
                if (a2 != null) {
                    this.f2494c.mo3354a(a2, this.f2497e0);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$e */
    /* compiled from: FragmentTransition */
    static class C0571e {

        /* renamed from: a */
        public Fragment f2498a;

        /* renamed from: b */
        public boolean f2499b;

        /* renamed from: c */
        public C0527a f2500c;

        /* renamed from: d */
        public Fragment f2501d;

        /* renamed from: e */
        public boolean f2502e;

        /* renamed from: f */
        public C0527a f2503f;

        C0571e() {
        }
    }

    /* renamed from: a */
    private static C0577r m3094a() {
        try {
            return (C0577r) Class.forName("e.p.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m3120b(C0542j jVar, int i, C0571e eVar, View view, C3926a<String, String> aVar) {
        Object obj;
        C0542j jVar2 = jVar;
        C0571e eVar2 = eVar;
        View view2 = view;
        ViewGroup viewGroup = jVar2.f2364k0.mo3022a() ? (ViewGroup) jVar2.f2364k0.mo3021a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = eVar2.f2498a;
            Fragment fragment2 = eVar2.f2501d;
            C0577r a = m3095a(fragment2, fragment);
            if (a != null) {
                boolean z = eVar2.f2499b;
                boolean z2 = eVar2.f2502e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m3100a(a, fragment, z);
                Object b = m3118b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object b2 = m3117b(a, viewGroup, view, aVar, eVar, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && b2 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a3 = m3103a(a, obj, fragment2, arrayList3, view2);
                ArrayList a4 = m3103a(a, obj3, fragment, arrayList, view2);
                m3113a(a4, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = a3;
                Object a5 = m3101a(a, obj3, obj, b2, fragment3, z);
                if (a5 != null) {
                    m3110a(a, obj, fragment2, arrayList4);
                    ArrayList a6 = a.mo3353a(arrayList);
                    a.mo3330a(a5, obj3, a4, obj, arrayList4, b2, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo3326a(viewGroup3, a5);
                    a.mo3355a(viewGroup3, arrayList3, arrayList, a6, aVar);
                    m3113a(a4, 0);
                    a.mo3338b(b2, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m3108a(C0542j jVar, ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.f2362i0 >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0527a aVar = (C0527a) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m3119b(aVar, sparseArray, z);
                } else {
                    m3105a(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar.f2363j0.mo3143c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C3926a a = m3096a(keyAt, arrayList, arrayList2, i, i2);
                    C0571e eVar = (C0571e) sparseArray.valueAt(i4);
                    if (z) {
                        m3120b(jVar, keyAt, eVar, view, a);
                    } else {
                        m3107a(jVar, keyAt, eVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C3926a<String, String> m3096a(int i, ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C3926a<String, String> aVar = new C3926a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0527a aVar2 = (C0527a) arrayList.get(i4);
            if (aVar2.mo3044b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2455o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2455o;
                        arrayList4 = aVar2.f2456p;
                    } else {
                        ArrayList arrayList6 = aVar2.f2455o;
                        arrayList3 = aVar2.f2456p;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static Object m3118b(C0577r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return rVar.mo3334b(obj);
    }

    /* renamed from: b */
    private static Object m3117b(C0577r rVar, ViewGroup viewGroup, View view, C3926a<String, String> aVar, C0571e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C0577r rVar2 = rVar;
        View view3 = view;
        C3926a<String, String> aVar2 = aVar;
        C0571e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = eVar2.f2498a;
        Fragment fragment2 = eVar2.f2501d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f2499b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m3099a(rVar, fragment, fragment2, z);
        }
        C3926a b = m3116b(rVar, aVar2, obj3, eVar2);
        C3926a a = m3097a(rVar, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m3114a(arrayList3, b, (Collection<String>) aVar.keySet());
            m3114a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m3104a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            rVar.mo3337b(obj4, view3, arrayList3);
            m3111a(rVar, obj4, obj2, b, eVar2.f2502e, eVar2.f2503f);
            Rect rect2 = new Rect();
            View a2 = m3092a(a, eVar2, obj5, z);
            if (a2 != null) {
                rVar.mo3327a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        C0569c cVar = new C0569c(fragment, fragment2, z, a, view2, rVar, rect);
        C4183t.m14332a(viewGroup, cVar);
        return obj4;
    }

    /* renamed from: a */
    private static void m3110a(C0577r rVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            rVar.mo3329a(obj, fragment.getView(), arrayList);
            C4183t.m14332a(fragment.mContainer, new C0567a(arrayList));
        }
    }

    /* renamed from: a */
    private static void m3107a(C0542j jVar, int i, C0571e eVar, View view, C3926a<String, String> aVar) {
        Object obj;
        C0542j jVar2 = jVar;
        C0571e eVar2 = eVar;
        View view2 = view;
        C3926a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = jVar2.f2364k0.mo3022a() ? (ViewGroup) jVar2.f2364k0.mo3021a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = eVar2.f2498a;
            Fragment fragment2 = eVar2.f2501d;
            C0577r a = m3095a(fragment2, fragment);
            if (a != null) {
                boolean z = eVar2.f2499b;
                boolean z2 = eVar2.f2502e;
                Object a2 = m3100a(a, fragment, z);
                Object b = m3118b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0577r rVar = a;
                Object a3 = m3098a(a, viewGroup, view, aVar, eVar, arrayList, arrayList2, a2, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a3 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList a4 = m3103a(rVar, obj, fragment2, arrayList3, view2);
                Object obj5 = (a4 == null || a4.isEmpty()) ? null : obj;
                rVar.mo3328a(obj4, view2);
                Object a5 = m3101a(rVar, obj4, obj5, a3, fragment, eVar2.f2499b);
                if (a5 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C0577r rVar2 = rVar;
                    rVar2.mo3330a(a5, obj4, arrayList4, obj5, a4, a3, arrayList2);
                    m3109a(rVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList4, obj5, a4);
                    ArrayList arrayList5 = arrayList2;
                    rVar.mo3356a((View) viewGroup, arrayList5, (Map<String, String>) aVar2);
                    rVar.mo3326a(viewGroup, a5);
                    rVar.mo3357a(viewGroup, arrayList5, (Map<String, String>) aVar2);
                }
            }
        }
    }

    /* renamed from: b */
    private static C3926a<String, View> m3116b(C0577r rVar, C3926a<String, String> aVar, Object obj, C0571e eVar) {
        C0489m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f2501d;
        C3926a<String, View> aVar2 = new C3926a<>();
        rVar.mo3359a((Map<String, View>) aVar2, fragment.requireView());
        C0527a aVar3 = eVar.f2503f;
        if (eVar.f2502e) {
            mVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2456p;
        } else {
            mVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f2455o;
        }
        aVar2.mo14010a(arrayList);
        if (mVar != null) {
            mVar.mo2696a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C4187x.m14405t(view))) {
                    aVar.put(C4187x.m14405t(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo14010a(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: a */
    private static void m3109a(C0577r rVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C0568b bVar = new C0568b(obj, rVar, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C4183t.m14332a(viewGroup, bVar);
    }

    /* renamed from: a */
    private static C0577r m3095a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0577r rVar = f2468b;
        if (rVar != null && m3115a(rVar, (List<Object>) arrayList)) {
            return f2468b;
        }
        C0577r rVar2 = f2469c;
        if (rVar2 != null && m3115a(rVar2, (List<Object>) arrayList)) {
            return f2469c;
        }
        if (f2468b == null && f2469c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: b */
    public static void m3119b(C0527a aVar, SparseArray<C0571e> sparseArray, boolean z) {
        if (aVar.f2317s.f2364k0.mo3022a()) {
            for (int size = aVar.f2441a.size() - 1; size >= 0; size--) {
                m3106a(aVar, (C0565a) aVar.f2441a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static boolean m3115a(C0577r rVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!rVar.mo3333a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m3099a(C0577r rVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return rVar.mo3339c(rVar.mo3334b(obj));
    }

    /* renamed from: a */
    private static Object m3100a(C0577r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return rVar.mo3334b(obj);
    }

    /* renamed from: a */
    private static void m3114a(ArrayList<View> arrayList, C3926a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo14157d(size);
            if (collection.contains(C4187x.m14405t(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static Object m3098a(C0577r rVar, ViewGroup viewGroup, View view, C3926a<String, String> aVar, C0571e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3926a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0577r rVar2 = rVar;
        C0571e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = eVar2.f2498a;
        Fragment fragment2 = eVar2.f2501d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f2499b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m3099a(rVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C3926a b = m3116b(rVar2, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m3104a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            rVar2.mo3337b(obj4, view, arrayList3);
            m3111a(rVar, obj4, obj2, b, eVar2.f2502e, eVar2.f2503f);
            if (obj5 != null) {
                rVar2.mo3327a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0570d dVar = r0;
        C0570d dVar2 = new C0570d(rVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C4183t.m14332a(viewGroup, dVar);
        return obj4;
    }

    /* renamed from: a */
    static C3926a<String, View> m3097a(C0577r rVar, C3926a<String, String> aVar, Object obj, C0571e eVar) {
        C0489m mVar;
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f2498a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C3926a<String, View> aVar2 = new C3926a<>();
        rVar.mo3359a((Map<String, View>) aVar2, view);
        C0527a aVar3 = eVar.f2500c;
        if (eVar.f2499b) {
            mVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f2455o;
        } else {
            mVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2456p;
        }
        if (arrayList != null) {
            aVar2.mo14010a(arrayList);
            aVar2.mo14010a(aVar.values());
        }
        if (mVar != null) {
            mVar.mo2696a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) aVar2.get(str);
                if (view2 == null) {
                    String a = m3102a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C4187x.m14405t(view2))) {
                    String a2 = m3102a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C4187x.m14405t(view2));
                    }
                }
            }
        } else {
            m3112a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static String m3102a(C3926a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo14157d(i))) {
                return (String) aVar.mo14151b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m3092a(C3926a<String, View> aVar, C0571e eVar, Object obj, boolean z) {
        String str;
        C0527a aVar2 = eVar.f2500c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar2.f2455o;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z) {
                    str = (String) aVar2.f2455o.get(0);
                } else {
                    str = (String) aVar2.f2456p.get(0);
                }
                return (View) aVar.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m3111a(C0577r rVar, Object obj, Object obj2, C3926a<String, View> aVar, boolean z, C0527a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f2455o;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = (String) aVar2.f2456p.get(0);
            } else {
                str = (String) aVar2.f2455o.get(0);
            }
            View view = (View) aVar.get(str);
            rVar.mo3340c(obj, view);
            if (obj2 != null) {
                rVar.mo3340c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m3112a(C3926a<String, String> aVar, C3926a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo14157d(size))) {
                aVar.mo14153c(size);
            }
        }
    }

    /* renamed from: a */
    static void m3104a(Fragment fragment, Fragment fragment2, boolean z, C3926a<String, View> aVar, boolean z2) {
        C0489m mVar;
        int i;
        if (z) {
            mVar = fragment2.getEnterTransitionCallback();
        } else {
            mVar = fragment.getEnterTransitionCallback();
        }
        if (mVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo14151b(i2));
                arrayList.add(aVar.mo14157d(i2));
            }
            if (z2) {
                mVar.mo2697b(arrayList2, arrayList, null);
            } else {
                mVar.mo2695a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m3103a(C0577r rVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            rVar.mo3358a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        rVar.mo3331a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m3113a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m3101a(C0577r rVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return rVar.mo3335b(obj2, obj, obj3);
        }
        return rVar.mo3325a(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m3105a(C0527a aVar, SparseArray<C0571e> sparseArray, boolean z) {
        int size = aVar.f2441a.size();
        for (int i = 0; i < size; i++) {
            m3106a(aVar, (C0565a) aVar.f2441a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r10.mPostponedAlpha >= 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0080, code lost:
        if (r10.mHidden == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3106a(androidx.fragment.app.C0527a r16, androidx.fragment.app.C0564o.C0565a r17, android.util.SparseArray<androidx.fragment.app.C0566p.C0571e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f2460b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.mContainerId
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f2467a
            int r1 = r1.f2459a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f2459a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.mHidden
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.mView
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.mPostponedAlpha
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.mIsNewlyAdded
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.p$e r6 = (androidx.fragment.app.C0566p.C0571e) r6
            if (r4 == 0) goto L_0x00ac
            androidx.fragment.app.p$e r6 = m3093a(r6, r2, r11)
            r6.f2498a = r10
            r6.f2499b = r3
            r6.f2500c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r1 = r14.f2501d
            if (r1 != r10) goto L_0x00ba
            r14.f2501d = r15
        L_0x00ba:
            androidx.fragment.app.j r4 = r0.f2317s
            int r1 = r10.mState
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.f2362i0
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.f2457q
            if (r1 != 0) goto L_0x00d3
            r4.mo3234j(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo3191a(r5, r6, r7, r8, r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r1 = r14.f2501d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            androidx.fragment.app.p$e r14 = m3093a(r14, r2, r11)
            r14.f2501d = r10
            r14.f2502e = r3
            r14.f2503f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r0 = r14.f2498a
            if (r0 != r10) goto L_0x00f1
            r14.f2498a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0566p.m3106a(androidx.fragment.app.a, androidx.fragment.app.o$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0571e m3093a(C0571e eVar, SparseArray<C0571e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        C0571e eVar2 = new C0571e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }
}
