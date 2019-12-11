package p096e.p154p;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p113e.C3926a;
import p096e.p121h.p135s.C4187x;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.o */
/* compiled from: TransitionManager */
public class C4317o {

    /* renamed from: a */
    private static C4309m f10752a = new C4265b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3926a<ViewGroup, ArrayList<C4309m>>>> f10753b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f10754c = new ArrayList<>();

    /* renamed from: e.p.o$a */
    /* compiled from: TransitionManager */
    private static class C4318a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: U */
        ViewGroup f10755U;

        /* renamed from: c */
        C4309m f10756c;

        /* renamed from: e.p.o$a$a */
        /* compiled from: TransitionManager */
        class C4319a extends C4316n {

            /* renamed from: a */
            final /* synthetic */ C3926a f10757a;

            C4319a(C3926a aVar) {
                this.f10757a = aVar;
            }

            /* renamed from: c */
            public void mo15038c(C4309m mVar) {
                ((ArrayList) this.f10757a.get(C4318a.this.f10755U)).remove(mVar);
            }
        }

        C4318a(C4309m mVar, ViewGroup viewGroup) {
            this.f10756c = mVar;
            this.f10755U = viewGroup;
        }

        /* renamed from: a */
        private void m14850a() {
            this.f10755U.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10755U.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m14850a();
            if (!C4317o.f10754c.remove(this.f10755U)) {
                return true;
            }
            C3926a a = C4317o.m14846a();
            ArrayList arrayList = (ArrayList) a.get(this.f10755U);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f10755U, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f10756c);
            this.f10756c.mo15085a((C4315f) new C4319a(a));
            this.f10756c.mo15092a(this.f10755U, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C4309m) it.next()).mo15109e(this.f10755U);
                }
            }
            this.f10756c.mo15090a(this.f10755U);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m14850a();
            C4317o.f10754c.remove(this.f10755U);
            ArrayList arrayList = (ArrayList) C4317o.m14846a().get(this.f10755U);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C4309m) it.next()).mo15109e(this.f10755U);
                }
            }
            this.f10756c.mo15096a(true);
        }
    }

    /* renamed from: a */
    static C3926a<ViewGroup, ArrayList<C4309m>> m14846a() {
        WeakReference weakReference = (WeakReference) f10753b.get();
        if (weakReference != null) {
            C3926a<ViewGroup, ArrayList<C4309m>> aVar = (C3926a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C3926a<ViewGroup, ArrayList<C4309m>> aVar2 = new C3926a<>();
        f10753b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: b */
    private static void m14848b(ViewGroup viewGroup, C4309m mVar) {
        if (mVar != null && viewGroup != null) {
            C4318a aVar = new C4318a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m14849c(ViewGroup viewGroup, C4309m mVar) {
        ArrayList arrayList = (ArrayList) m14846a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4309m) it.next()).mo15104c((View) viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo15092a(viewGroup, true);
        }
        C4307l a = C4307l.m14783a(viewGroup);
        if (a != null) {
            a.mo15081a();
        }
    }

    /* renamed from: a */
    public static void m14847a(ViewGroup viewGroup, C4309m mVar) {
        if (!f10754c.contains(viewGroup) && C4187x.m14340E(viewGroup)) {
            f10754c.add(viewGroup);
            if (mVar == null) {
                mVar = f10752a;
            }
            C4309m clone = mVar.clone();
            m14849c(viewGroup, clone);
            C4307l.m14784a(viewGroup, null);
            m14848b(viewGroup, clone);
        }
    }
}
