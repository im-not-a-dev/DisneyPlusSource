package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentTransitionCompat21 */
class C0572q extends C0577r {

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C0573a extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2504a;

        C0573a(C0572q qVar, Rect rect) {
            this.f2504a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2504a;
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C0574b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2505a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2506b;

        C0574b(C0572q qVar, View view, ArrayList arrayList) {
            this.f2505a = view;
            this.f2506b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2505a.setVisibility(8);
            int size = this.f2506b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2506b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C0575c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2507a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2508b;

        /* renamed from: c */
        final /* synthetic */ Object f2509c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2510d;

        /* renamed from: e */
        final /* synthetic */ Object f2511e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2512f;

        C0575c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2507a = obj;
            this.f2508b = arrayList;
            this.f2509c = obj2;
            this.f2510d = arrayList2;
            this.f2511e = obj3;
            this.f2512f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2507a;
            if (obj != null) {
                C0572q.this.mo3332a(obj, this.f2508b, null);
            }
            Object obj2 = this.f2509c;
            if (obj2 != null) {
                C0572q.this.mo3332a(obj2, this.f2510d, null);
            }
            Object obj3 = this.f2511e;
            if (obj3 != null) {
                C0572q.this.mo3332a(obj3, this.f2512f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C0576d extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2514a;

        C0576d(C0572q qVar, Rect rect) {
            this.f2514a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2514a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2514a;
        }
    }

    C0572q() {
    }

    /* renamed from: a */
    public boolean mo3333a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo3334b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo3339c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo3331a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3331a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3121a(transition) && C0577r.m3140a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3337b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0577r.m3139a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3331a((Object) transitionSet, arrayList);
    }

    /* renamed from: c */
    public void mo3340c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo3354a(view, rect);
            transition.setEpicenterCallback(new C0573a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo3335b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m3121a(Transition transition) {
        return !C0577r.m3140a(transition.getTargetIds()) || !C0577r.m3140a(transition.getTargetNames()) || !C0577r.m3140a(transition.getTargetTypes());
    }

    /* renamed from: b */
    public void mo3338b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3332a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo3329a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0574b(this, view, arrayList));
    }

    /* renamed from: a */
    public Object mo3325a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: b */
    public void mo3336b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: a */
    public void mo3326a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo3330a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0575c cVar = new C0575c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: a */
    public void mo3332a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo3332a((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m3121a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.addTarget((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3328a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo3327a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0576d(this, rect));
        }
    }
}
