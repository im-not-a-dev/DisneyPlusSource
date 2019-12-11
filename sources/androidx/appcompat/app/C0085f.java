package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p096e.p113e.C3928b;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: AppCompatDelegate */
public abstract class C0085f {

    /* renamed from: U */
    private static final C3928b<WeakReference<C0085f>> f294U = new C3928b<>();

    /* renamed from: V */
    private static final Object f295V = new Object();

    /* renamed from: c */
    private static int f296c = -100;

    C0085f() {
    }

    /* renamed from: a */
    public static C0085f m482a(Activity activity, C0084e eVar) {
        return new C0086g(activity, eVar);
    }

    /* renamed from: b */
    static void m485b(C0085f fVar) {
        synchronized (f295V) {
            m486c(fVar);
        }
    }

    /* renamed from: c */
    private static void m486c(C0085f fVar) {
        synchronized (f295V) {
            Iterator it = f294U.iterator();
            while (it.hasNext()) {
                C0085f fVar2 = (C0085f) ((WeakReference) it.next()).get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: j */
    public static int m487j() {
        return f296c;
    }

    /* renamed from: a */
    public int mo468a() {
        return -100;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo469a(int i);

    /* renamed from: a */
    public void mo470a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo471a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo472a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo473a(View view);

    /* renamed from: a */
    public abstract void mo474a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo475a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo476b();

    /* renamed from: b */
    public abstract void mo477b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo478b(View view, LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo479b(int i);

    /* renamed from: c */
    public abstract C0076a mo480c();

    /* renamed from: c */
    public abstract void mo481c(int i);

    /* renamed from: c */
    public abstract void mo482c(Bundle bundle);

    /* renamed from: d */
    public abstract void mo483d();

    /* renamed from: d */
    public void mo484d(int i) {
    }

    /* renamed from: e */
    public abstract void mo485e();

    /* renamed from: f */
    public abstract void mo486f();

    /* renamed from: g */
    public abstract void mo487g();

    /* renamed from: h */
    public abstract void mo488h();

    /* renamed from: i */
    public abstract void mo489i();

    /* renamed from: a */
    public static C0085f m483a(Dialog dialog, C0084e eVar) {
        return new C0086g(dialog, eVar);
    }

    /* renamed from: a */
    static void m484a(C0085f fVar) {
        synchronized (f295V) {
            m486c(fVar);
            f294U.add(new WeakReference(fVar));
        }
    }
}
