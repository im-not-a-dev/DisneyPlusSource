package p163g.p413f.p414a.p417r;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10667n;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.r.l */
/* compiled from: RequestManagerRetriever */
public class C10700l implements Callback {

    /* renamed from: b0 */
    private static final C10702b f25307b0 = new C10701a();

    /* renamed from: U */
    final Map<FragmentManager, C10698k> f25308U = new HashMap();

    /* renamed from: V */
    final Map<C0538i, C10705o> f25309V = new HashMap();

    /* renamed from: W */
    private final Handler f25310W;

    /* renamed from: X */
    private final C10702b f25311X;

    /* renamed from: Y */
    private final C3926a<View, Fragment> f25312Y = new C3926a<>();

    /* renamed from: Z */
    private final C3926a<View, android.app.Fragment> f25313Z = new C3926a<>();

    /* renamed from: a0 */
    private final Bundle f25314a0 = new Bundle();

    /* renamed from: c */
    private volatile C10667n f25315c;

    /* renamed from: g.f.a.r.l$a */
    /* compiled from: RequestManagerRetriever */
    class C10701a implements C10702b {
        C10701a() {
        }

        /* renamed from: a */
        public C10667n mo27516a(C10652e eVar, C10695h hVar, C10703m mVar, Context context) {
            return new C10667n(eVar, hVar, mVar, context);
        }
    }

    /* renamed from: g.f.a.r.l$b */
    /* compiled from: RequestManagerRetriever */
    public interface C10702b {
        /* renamed from: a */
        C10667n mo27516a(C10652e eVar, C10695h hVar, C10703m mVar, Context context);
    }

    public C10700l(C10702b bVar) {
        if (bVar == null) {
            bVar = f25307b0;
        }
        this.f25311X = bVar;
        this.f25310W = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    /* renamed from: b */
    private void m33658b(FragmentManager fragmentManager, C3926a<View, android.app.Fragment> aVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            String str = "key";
            this.f25314a0.putInt(str, i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f25314a0, str);
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    if (VERSION.SDK_INT >= 17) {
                        m33655a(fragment.getChildFragmentManager(), aVar);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private C10667n m33659c(Context context) {
        if (this.f25315c == null) {
            synchronized (this) {
                if (this.f25315c == null) {
                    this.f25315c = this.f25311X.mo27516a(C10652e.m33418b(context.getApplicationContext()), new C10687b(), new C10694g(), context.getApplicationContext());
                }
            }
        }
        return this.f25315c;
    }

    /* renamed from: d */
    private static boolean m33661d(Activity activity) {
        return !activity.isFinishing();
    }

    /* renamed from: a */
    public C10667n mo27643a(Context context) {
        if (context != null) {
            if (C10775k.m34036d() && !(context instanceof Application)) {
                if (context instanceof C0532d) {
                    return mo27646a((C0532d) context);
                }
                if (context instanceof Activity) {
                    return mo27641a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo27643a(((ContextWrapper) context).getBaseContext());
                }
            }
            return m33659c(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public boolean handleMessage(Message message) {
        Object obj;
        int i = message.what;
        Object obj2 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            obj = this.f25308U.remove(obj2);
        } else if (i != 2) {
            z = false;
            obj = null;
        } else {
            obj2 = (C0538i) message.obj;
            obj = this.f25309V.remove(obj2);
        }
        if (z && obj == null) {
            String str = "RMRetriever";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(obj2);
                Log.w(str, sb.toString());
            }
        }
        return z;
    }

    /* renamed from: b */
    private Activity m33657b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m33657b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m33660c(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: a */
    public C10667n mo27646a(C0532d dVar) {
        if (C10775k.m34035c()) {
            return mo27643a(dVar.getApplicationContext());
        }
        m33660c((Activity) dVar);
        return m33652a((Context) dVar, dVar.getSupportFragmentManager(), (Fragment) null, m33661d(dVar));
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: b */
    public C10698k mo27647b(Activity activity) {
        return m33653a(activity.getFragmentManager(), (android.app.Fragment) null, m33661d(activity));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10705o mo27648b(C0532d dVar) {
        return m33654a(dVar.getSupportFragmentManager(), (Fragment) null, m33661d(dVar));
    }

    /* renamed from: a */
    public C10667n mo27645a(Fragment fragment) {
        C10774j.m34013a(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C10775k.m34035c()) {
            return mo27643a(fragment.getActivity().getApplicationContext());
        }
        return m33652a((Context) fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: a */
    public C10667n mo27641a(Activity activity) {
        if (C10775k.m34035c()) {
            return mo27643a(activity.getApplicationContext());
        }
        m33660c(activity);
        return m33651a((Context) activity, activity.getFragmentManager(), (android.app.Fragment) null, m33661d(activity));
    }

    /* renamed from: a */
    public C10667n mo27644a(View view) {
        if (C10775k.m34035c()) {
            return mo27643a(view.getContext().getApplicationContext());
        }
        C10774j.m34012a(view);
        C10774j.m34013a(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity b = m33657b(view.getContext());
        if (b == null) {
            return mo27643a(view.getContext().getApplicationContext());
        }
        if (b instanceof C0532d) {
            Fragment a = m33650a(view, (C0532d) b);
            return a != null ? mo27645a(a) : mo27641a(b);
        }
        android.app.Fragment a2 = m33649a(view, b);
        if (a2 == null) {
            return mo27641a(b);
        }
        return mo27642a(a2);
    }

    /* renamed from: a */
    private static void m33656a(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    m33656a((Collection<Fragment>) fragment.getChildFragmentManager().mo3159e(), map);
                }
            }
        }
    }

    /* renamed from: a */
    private Fragment m33650a(View view, C0532d dVar) {
        this.f25312Y.clear();
        m33656a((Collection<Fragment>) dVar.getSupportFragmentManager().mo3159e(), (Map<View, Fragment>) this.f25312Y);
        View findViewById = dVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (Fragment) this.f25312Y.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f25312Y.clear();
        return fragment;
    }

    @Deprecated
    /* renamed from: a */
    private android.app.Fragment m33649a(View view, Activity activity) {
        this.f25313Z.clear();
        m33655a(activity.getFragmentManager(), this.f25313Z);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (android.app.Fragment) this.f25313Z.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f25313Z.clear();
        return fragment;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: a */
    private void m33655a(FragmentManager fragmentManager, C3926a<View, android.app.Fragment> aVar) {
        if (VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    m33655a(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        m33658b(fragmentManager, aVar);
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: a */
    public C10667n mo27642a(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C10775k.m34035c() || VERSION.SDK_INT < 17) {
            return mo27643a(fragment.getActivity().getApplicationContext());
        } else {
            return m33651a((Context) fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: a */
    private C10698k m33653a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C10698k kVar = (C10698k) fragmentManager.findFragmentByTag(str);
        if (kVar == null) {
            kVar = (C10698k) this.f25308U.get(fragmentManager);
            if (kVar == null) {
                kVar = new C10698k();
                kVar.mo27630a(fragment);
                if (z) {
                    kVar.mo27629a().mo27623b();
                }
                this.f25308U.put(fragmentManager, kVar);
                fragmentManager.beginTransaction().add(kVar, str).commitAllowingStateLoss();
                this.f25310W.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return kVar;
    }

    @Deprecated
    /* renamed from: a */
    private C10667n m33651a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C10698k a = m33653a(fragmentManager, fragment, z);
        C10667n b = a.mo27632b();
        if (b != null) {
            return b;
        }
        C10667n a2 = this.f25311X.mo27516a(C10652e.m33418b(context), a.mo27629a(), a.mo27633c(), context);
        a.mo27631a(a2);
        return a2;
    }

    /* renamed from: a */
    private C10705o m33654a(C0538i iVar, Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C10705o oVar = (C10705o) iVar.mo3146a(str);
        if (oVar == null) {
            oVar = (C10705o) this.f25309V.get(iVar);
            if (oVar == null) {
                oVar = new C10705o();
                oVar.mo27657a(fragment);
                if (z) {
                    oVar.mo27659o().mo27623b();
                }
                this.f25309V.put(iVar, oVar);
                C0564o a = iVar.mo3147a();
                a.mo3314a((Fragment) oVar, str);
                a.mo3040b();
                this.f25310W.obtainMessage(2, iVar).sendToTarget();
            }
        }
        return oVar;
    }

    /* renamed from: a */
    private C10667n m33652a(Context context, C0538i iVar, Fragment fragment, boolean z) {
        C10705o a = m33654a(iVar, fragment, z);
        C10667n p = a.mo27660p();
        if (p != null) {
            return p;
        }
        C10667n a2 = this.f25311X.mo27516a(C10652e.m33418b(context), a.mo27659o(), a.mo27661q(), context);
        a.mo27658a(a2);
        return a2;
    }
}
