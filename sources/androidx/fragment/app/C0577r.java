package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p096e.p121h.p135s.C4183t;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.C4197z;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.r */
/* compiled from: FragmentTransitionImpl */
public abstract class C0577r {

    /* renamed from: androidx.fragment.app.r$a */
    /* compiled from: FragmentTransitionImpl */
    class C0578a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ArrayList f2515U;

        /* renamed from: V */
        final /* synthetic */ ArrayList f2516V;

        /* renamed from: W */
        final /* synthetic */ ArrayList f2517W;

        /* renamed from: X */
        final /* synthetic */ ArrayList f2518X;

        /* renamed from: c */
        final /* synthetic */ int f2519c;

        C0578a(C0577r rVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2519c = i;
            this.f2515U = arrayList;
            this.f2516V = arrayList2;
            this.f2517W = arrayList3;
            this.f2518X = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2519c; i++) {
                C4187x.m14365a((View) this.f2515U.get(i), (String) this.f2516V.get(i));
                C4187x.m14365a((View) this.f2517W.get(i), (String) this.f2518X.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    /* compiled from: FragmentTransitionImpl */
    class C0579b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f2520U;

        /* renamed from: c */
        final /* synthetic */ ArrayList f2521c;

        C0579b(C0577r rVar, ArrayList arrayList, Map map) {
            this.f2521c = arrayList;
            this.f2520U = map;
        }

        public void run() {
            int size = this.f2521c.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2521c.get(i);
                String t = C4187x.m14405t(view);
                if (t != null) {
                    C4187x.m14365a(view, C0577r.m3138a(this.f2520U, t));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$c */
    /* compiled from: FragmentTransitionImpl */
    class C0580c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f2522U;

        /* renamed from: c */
        final /* synthetic */ ArrayList f2523c;

        C0580c(C0577r rVar, ArrayList arrayList, Map map) {
            this.f2523c = arrayList;
            this.f2522U = map;
        }

        public void run() {
            int size = this.f2523c.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2523c.get(i);
                C4187x.m14365a(view, (String) this.f2522U.get(C4187x.m14405t(view)));
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo3325a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3354a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public abstract void mo3326a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo3327a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo3328a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo3329a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo3330a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo3331a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo3332a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo3333a(Object obj);

    /* renamed from: b */
    public abstract Object mo3334b(Object obj);

    /* renamed from: b */
    public abstract Object mo3335b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo3336b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3337b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo3338b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo3339c(Object obj);

    /* renamed from: c */
    public abstract void mo3340c(Object obj, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo3353a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C4187x.m14405t(view));
            C4187x.m14365a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3355a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String t = C4187x.m14405t(view2);
            arrayList4.add(t);
            if (t != null) {
                C4187x.m14365a(view2, (String) null);
                String str = (String) map.get(t);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C4187x.m14365a((View) arrayList2.get(i2), t);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0578a aVar = new C0578a(this, size, arrayList2, arrayList3, arrayList, arrayList4);
        C4183t.m14332a(view, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3358a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C4197z.m14437a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo3358a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3359a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String t = C4187x.m14405t(view);
            if (t != null) {
                map.put(t, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3359a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3356a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C4183t.m14332a(view, new C0579b(this, arrayList, map));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3357a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C4183t.m14332a(viewGroup, new C0580c(this, arrayList, map));
    }

    /* renamed from: a */
    protected static void m3139a(List<View> list, View view) {
        int size = list.size();
        if (!m3141a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3141a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m3141a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m3140a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m3138a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
