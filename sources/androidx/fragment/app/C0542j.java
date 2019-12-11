package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.C0060b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0538i.C0539a;
import androidx.fragment.app.C0538i.C0540b;
import androidx.fragment.app.C0538i.C0541c;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0715i.C0717b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p096e.p113e.C3928b;
import p096e.p121h.p134r.C4109a;
import p096e.p121h.p134r.C4110b;
import p096e.p121h.p135s.C4183t;

/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentManagerImpl */
final class C0542j extends C0538i implements Factory2 {

    /* renamed from: A0 */
    static boolean f2346A0 = false;

    /* renamed from: B0 */
    static final Interpolator f2347B0 = new DecelerateInterpolator(2.5f);

    /* renamed from: C0 */
    static final Interpolator f2348C0 = new DecelerateInterpolator(1.5f);

    /* renamed from: V */
    ArrayList<C0554k> f2349V;

    /* renamed from: W */
    boolean f2350W;

    /* renamed from: X */
    int f2351X = 0;

    /* renamed from: Y */
    final ArrayList<Fragment> f2352Y = new ArrayList<>();

    /* renamed from: Z */
    final HashMap<String, Fragment> f2353Z = new HashMap<>();

    /* renamed from: a0 */
    ArrayList<C0527a> f2354a0;

    /* renamed from: b0 */
    ArrayList<Fragment> f2355b0;

    /* renamed from: c0 */
    private OnBackPressedDispatcher f2356c0;

    /* renamed from: d0 */
    private final C0060b f2357d0 = new C0543a(false);

    /* renamed from: e0 */
    ArrayList<C0527a> f2358e0;

    /* renamed from: f0 */
    ArrayList<Integer> f2359f0;

    /* renamed from: g0 */
    ArrayList<C0541c> f2360g0;

    /* renamed from: h0 */
    private final CopyOnWriteArrayList<C0552i> f2361h0 = new CopyOnWriteArrayList<>();

    /* renamed from: i0 */
    int f2362i0 = 0;

    /* renamed from: j0 */
    C0537h f2363j0;

    /* renamed from: k0 */
    C0534e f2364k0;

    /* renamed from: l0 */
    Fragment f2365l0;

    /* renamed from: m0 */
    Fragment f2366m0;

    /* renamed from: n0 */
    boolean f2367n0;

    /* renamed from: o0 */
    boolean f2368o0;

    /* renamed from: p0 */
    boolean f2369p0;

    /* renamed from: q0 */
    boolean f2370q0;

    /* renamed from: r0 */
    boolean f2371r0;

    /* renamed from: s0 */
    ArrayList<C0527a> f2372s0;

    /* renamed from: t0 */
    ArrayList<Boolean> f2373t0;

    /* renamed from: u0 */
    ArrayList<Fragment> f2374u0;

    /* renamed from: v0 */
    Bundle f2375v0 = null;

    /* renamed from: w0 */
    SparseArray<Parcelable> f2376w0 = null;

    /* renamed from: x0 */
    ArrayList<C0556m> f2377x0;

    /* renamed from: y0 */
    private C0559l f2378y0;

    /* renamed from: z0 */
    Runnable f2379z0 = new C0544b();

    /* renamed from: androidx.fragment.app.j$a */
    /* compiled from: FragmentManagerImpl */
    class C0543a extends C0060b {
        C0543a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo336a() {
            C0542j.this.mo3260w();
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    /* compiled from: FragmentManagerImpl */
    class C0544b implements Runnable {
        C0544b() {
        }

        public void run() {
            C0542j.this.mo3258u();
        }
    }

    /* renamed from: androidx.fragment.app.j$c */
    /* compiled from: FragmentManagerImpl */
    class C0545c implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2382a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2383b;

        /* renamed from: androidx.fragment.app.j$c$a */
        /* compiled from: FragmentManagerImpl */
        class C0546a implements Runnable {
            C0546a() {
            }

            public void run() {
                if (C0545c.this.f2383b.getAnimatingAway() != null) {
                    C0545c.this.f2383b.setAnimatingAway(null);
                    C0545c cVar = C0545c.this;
                    C0542j jVar = C0542j.this;
                    Fragment fragment = cVar.f2383b;
                    jVar.mo3191a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        C0545c(ViewGroup viewGroup, Fragment fragment) {
            this.f2382a = viewGroup;
            this.f2383b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2382a.post(new C0546a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.j$d */
    /* compiled from: FragmentManagerImpl */
    class C0547d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2386a;

        /* renamed from: b */
        final /* synthetic */ View f2387b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2388c;

        C0547d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2386a = viewGroup;
            this.f2387b = view;
            this.f2388c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2386a.endViewTransition(this.f2387b);
            Animator animator2 = this.f2388c.getAnimator();
            this.f2388c.setAnimator(null);
            if (animator2 != null && this.f2386a.indexOfChild(this.f2387b) < 0) {
                C0542j jVar = C0542j.this;
                Fragment fragment = this.f2388c;
                jVar.mo3191a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    /* renamed from: androidx.fragment.app.j$e */
    /* compiled from: FragmentManagerImpl */
    class C0548e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2390a;

        /* renamed from: b */
        final /* synthetic */ View f2391b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2392c;

        C0548e(C0542j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2390a = viewGroup;
            this.f2391b = view;
            this.f2392c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2390a.endViewTransition(this.f2391b);
            animator.removeListener(this);
            Fragment fragment = this.f2392c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.j$f */
    /* compiled from: FragmentManagerImpl */
    class C0549f extends C0536g {
        C0549f() {
        }

        /* renamed from: a */
        public Fragment mo3141a(ClassLoader classLoader, String str) {
            C0537h hVar = C0542j.this.f2363j0;
            return hVar.mo3116a(hVar.mo3143c(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.j$g */
    /* compiled from: FragmentManagerImpl */
    private static class C0550g {

        /* renamed from: a */
        public final Animation f2394a;

        /* renamed from: b */
        public final Animator f2395b;

        C0550g(Animation animation) {
            this.f2394a = animation;
            this.f2395b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0550g(Animator animator) {
            this.f2394a = null;
            this.f2395b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.j$h */
    /* compiled from: FragmentManagerImpl */
    private static class C0551h extends AnimationSet implements Runnable {

        /* renamed from: U */
        private final View f2396U;

        /* renamed from: V */
        private boolean f2397V;

        /* renamed from: W */
        private boolean f2398W;

        /* renamed from: X */
        private boolean f2399X = true;

        /* renamed from: c */
        private final ViewGroup f2400c;

        C0551h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2400c = viewGroup;
            this.f2396U = view;
            addAnimation(animation);
            this.f2400c.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f2399X = true;
            if (this.f2397V) {
                return !this.f2398W;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2397V = true;
                C4183t.m14332a(this.f2400c, this);
            }
            return true;
        }

        public void run() {
            if (this.f2397V || !this.f2399X) {
                this.f2400c.endViewTransition(this.f2396U);
                this.f2398W = true;
                return;
            }
            this.f2399X = false;
            this.f2400c.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2399X = true;
            if (this.f2397V) {
                return !this.f2398W;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2397V = true;
                C4183t.m14332a(this.f2400c, this);
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.j$i */
    /* compiled from: FragmentManagerImpl */
    private static final class C0552i {

        /* renamed from: a */
        final C0540b f2401a;

        /* renamed from: b */
        final boolean f2402b;

        C0552i(C0540b bVar, boolean z) {
            this.f2401a = bVar;
            this.f2402b = z;
        }
    }

    /* renamed from: androidx.fragment.app.j$j */
    /* compiled from: FragmentManagerImpl */
    static class C0553j {

        /* renamed from: a */
        public static final int[] f2403a = {16842755, 16842960, 16842961};
    }

    /* renamed from: androidx.fragment.app.j$k */
    /* compiled from: FragmentManagerImpl */
    interface C0554k {
        /* renamed from: a */
        boolean mo3039a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.j$l */
    /* compiled from: FragmentManagerImpl */
    private class C0555l implements C0554k {

        /* renamed from: a */
        final String f2404a;

        /* renamed from: b */
        final int f2405b;

        /* renamed from: c */
        final int f2406c;

        C0555l(String str, int i, int i2) {
            this.f2404a = str;
            this.f2405b = i;
            this.f2406c = i2;
        }

        /* renamed from: a */
        public boolean mo3039a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0542j.this.f2366m0;
            if (fragment != null && this.f2405b < 0 && this.f2404a == null && fragment.getChildFragmentManager().mo3162h()) {
                return false;
            }
            return C0542j.this.mo3204a(arrayList, arrayList2, this.f2404a, this.f2405b, this.f2406c);
        }
    }

    /* renamed from: androidx.fragment.app.j$m */
    /* compiled from: FragmentManagerImpl */
    static class C0556m implements C0524f {

        /* renamed from: a */
        final boolean f2408a;

        /* renamed from: b */
        final C0527a f2409b;

        /* renamed from: c */
        private int f2410c;

        C0556m(C0527a aVar, boolean z) {
            this.f2408a = z;
            this.f2409b = aVar;
        }

        /* renamed from: a */
        public void mo3023a() {
            this.f2410c++;
        }

        /* renamed from: b */
        public void mo3024b() {
            this.f2410c--;
            if (this.f2410c == 0) {
                this.f2409b.f2317s.mo3180C();
            }
        }

        /* renamed from: c */
        public void mo3274c() {
            C0527a aVar = this.f2409b;
            aVar.f2317s.mo3198a(aVar, this.f2408a, false, false);
        }

        /* renamed from: d */
        public void mo3275d() {
            boolean z = this.f2410c > 0;
            C0542j jVar = this.f2409b.f2317s;
            int size = jVar.f2352Y.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) jVar.f2352Y.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0527a aVar = this.f2409b;
            aVar.f2317s.mo3198a(aVar, this.f2408a, !z, true);
        }

        /* renamed from: e */
        public boolean mo3276e() {
            return this.f2410c == 0;
        }
    }

    C0542j() {
    }

    /* renamed from: E */
    private void m2915E() {
        this.f2353Z.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: F */
    private void m2916F() {
        if (mo3262y()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: G */
    private void m2917G() {
        this.f2350W = false;
        this.f2373t0.clear();
        this.f2372s0.clear();
    }

    /* renamed from: H */
    private void m2918H() {
        for (Fragment fragment : this.f2353Z.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    mo3191a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    /* renamed from: I */
    private void m2919I() {
        if (this.f2377x0 != null) {
            while (!this.f2377x0.isEmpty()) {
                ((C0556m) this.f2377x0.remove(0)).mo3275d();
            }
        }
    }

    /* renamed from: J */
    private void m2920J() {
        ArrayList<C0554k> arrayList = this.f2349V;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            C0060b bVar = this.f2357d0;
            if (mo3157c() <= 0 || !mo3232i(this.f2365l0)) {
                z = false;
            }
            bVar.mo338a(z);
            return;
        }
        this.f2357d0.mo338a(true);
    }

    /* renamed from: a */
    private void m2926a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C4110b(str));
        C0537h hVar = this.f2363j0;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (hVar != null) {
            try {
                hVar.mo3108a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            try {
                mo3153a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public static int m2930b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: f */
    public static int m2937f(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: v */
    private Fragment m2939v(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f2352Y.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f2352Y.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo3178A() {
        if (this.f2360g0 != null) {
            for (int i = 0; i < this.f2360g0.size(); i++) {
                ((C0541c) this.f2360g0.get(i)).mo3177b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public Parcelable mo3179B() {
        ArrayList<String> arrayList;
        m2919I();
        m2918H();
        mo3258u();
        this.f2368o0 = true;
        C0528b[] bVarArr = null;
        if (this.f2353Z.isEmpty()) {
            return null;
        }
        ArrayList<C0562n> arrayList2 = new ArrayList<>(this.f2353Z.size());
        Iterator it = this.f2353Z.values().iterator();
        boolean z = false;
        while (true) {
            String str = ": ";
            String str2 = " was removed from the FragmentManager";
            String str3 = "Failure saving state: active ";
            String str4 = "FragmentManager";
            if (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment != null) {
                    if (fragment.mFragmentManager == this) {
                        C0562n nVar = new C0562n(fragment);
                        arrayList2.add(nVar);
                        if (fragment.mState <= 0 || nVar.f2439f0 != null) {
                            nVar.f2439f0 = fragment.mSavedFragmentState;
                        } else {
                            nVar.f2439f0 = mo3249q(fragment);
                            String str5 = fragment.mTargetWho;
                            if (str5 != null) {
                                Fragment fragment2 = (Fragment) this.f2353Z.get(str5);
                                if (fragment2 != null) {
                                    if (nVar.f2439f0 == null) {
                                        nVar.f2439f0 = new Bundle();
                                    }
                                    mo3187a(nVar.f2439f0, "android:target_state", fragment2);
                                    int i = fragment.mTargetRequestCode;
                                    if (i != 0) {
                                        nVar.f2439f0.putInt("android:target_req_state", i);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failure saving state: ");
                                    sb.append(fragment);
                                    sb.append(" has target not in fragment manager: ");
                                    sb.append(fragment.mTargetWho);
                                    m2926a((RuntimeException) new IllegalStateException(sb.toString()));
                                    throw null;
                                }
                            }
                        }
                        if (f2346A0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Saved state of ");
                            sb2.append(fragment);
                            sb2.append(str);
                            sb2.append(nVar.f2439f0);
                            Log.v(str4, sb2.toString());
                        }
                        z = true;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(fragment);
                        sb3.append(str2);
                        m2926a((RuntimeException) new IllegalStateException(sb3.toString()));
                        throw null;
                    }
                }
            } else if (!z) {
                if (f2346A0) {
                    Log.v(str4, "saveAllState: no fragments!");
                }
                return null;
            } else {
                int size = this.f2352Y.size();
                if (size > 0) {
                    arrayList = new ArrayList<>(size);
                    Iterator it2 = this.f2352Y.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = (Fragment) it2.next();
                        arrayList.add(fragment3.mWho);
                        if (fragment3.mFragmentManager != this) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(fragment3);
                            sb4.append(str2);
                            m2926a((RuntimeException) new IllegalStateException(sb4.toString()));
                            throw null;
                        } else if (f2346A0) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("saveAllState: adding fragment (");
                            sb5.append(fragment3.mWho);
                            sb5.append("): ");
                            sb5.append(fragment3);
                            Log.v(str4, sb5.toString());
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<C0527a> arrayList3 = this.f2354a0;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    if (size2 > 0) {
                        bVarArr = new C0528b[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            bVarArr[i2] = new C0528b((C0527a) this.f2354a0.get(i2));
                            if (f2346A0) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("saveAllState: adding back stack #");
                                sb6.append(i2);
                                sb6.append(str);
                                sb6.append(this.f2354a0.get(i2));
                                Log.v(str4, sb6.toString());
                            }
                        }
                    }
                }
                C0557k kVar = new C0557k();
                kVar.f2415c = arrayList2;
                kVar.f2411U = arrayList;
                kVar.f2412V = bVarArr;
                Fragment fragment4 = this.f2366m0;
                if (fragment4 != null) {
                    kVar.f2413W = fragment4.mWho;
                }
                kVar.f2414X = this.f2351X;
                return kVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo3180C() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f2377x0 != null && !this.f2377x0.isEmpty();
            if (this.f2349V != null && this.f2349V.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2363j0.mo3144d().removeCallbacks(this.f2379z0);
                this.f2363j0.mo3144d().post(this.f2379z0);
                m2920J();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo3181D() {
        for (Fragment fragment : this.f2353Z.values()) {
            if (fragment != null) {
                mo3242n(fragment);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3156b() {
        boolean u = mo3258u();
        m2919I();
        return u;
    }

    /* renamed from: c */
    public int mo3157c() {
        ArrayList<C0527a> arrayList = this.f2354a0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo3222d(int i) {
        return this.f2362i0 >= i;
    }

    /* renamed from: e */
    public List<Fragment> mo3159e() {
        List<Fragment> list;
        if (this.f2352Y.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2352Y) {
            list = (List) this.f2352Y.clone();
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C0559l mo3225f(Fragment fragment) {
        return this.f2378y0.mo3283c(fragment);
    }

    /* renamed from: g */
    public void mo3161g() {
        mo3200a((C0554k) new C0555l(null, -1, 0), false);
    }

    /* renamed from: h */
    public boolean mo3162h() {
        m2916F();
        return m2929a((String) null, -1, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo3232i(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        C0542j jVar = fragment.mFragmentManager;
        if (fragment != jVar.mo3160f() || !mo3232i(jVar.f2365l0)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3234j(Fragment fragment) {
        if (this.f2353Z.get(fragment.mWho) == null) {
            this.f2353Z.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    mo3190a(fragment);
                } else {
                    mo3248p(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo3236k(Fragment fragment) {
        if (this.f2353Z.get(fragment.mWho) != null) {
            if (f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removed fragment from active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
            for (Fragment fragment2 : this.f2353Z.values()) {
                if (fragment2 != null && fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
            this.f2353Z.put(fragment.mWho, null);
            mo3248p(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = (Fragment) this.f2353Z.get(str);
            }
            fragment.initState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo3238l(Fragment fragment) {
        if (fragment != null) {
            if (!this.f2353Z.containsKey(fragment.mWho)) {
                if (f2346A0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring moving ");
                    sb.append(fragment);
                    sb.append(" to state ");
                    sb.append(this.f2362i0);
                    sb.append("since it is not added to ");
                    sb.append(this);
                    Log.v("FragmentManager", sb.toString());
                }
                return;
            }
            int i = this.f2362i0;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            mo3191a(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment v = m2939v(fragment);
                if (v != null) {
                    View view = v.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    float f = fragment.mPostponedAlpha;
                    if (f > 0.0f) {
                        fragment.mView.setAlpha(f);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0550g a = mo3183a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        Animation animation = a.f2394a;
                        if (animation != null) {
                            fragment.mView.startAnimation(animation);
                        } else {
                            a.f2395b.setTarget(fragment.mView);
                            a.f2395b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                mo3216c(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo3240m(Fragment fragment) {
        mo3191a(fragment, this.f2362i0, 0, 0, false);
    }

    /* renamed from: n */
    public void mo3242n(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f2350W) {
                this.f2371r0 = true;
                return;
            }
            fragment.mDeferStart = false;
            mo3191a(fragment, this.f2362i0, 0, 0, false);
        }
    }

    /* renamed from: o */
    public void mo3244o(Fragment fragment) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f2352Y) {
                this.f2352Y.remove(fragment);
            }
            if (m2940w(fragment)) {
                this.f2367n0 = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        Fragment fragment2 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C0553j.f2403a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C0536g.m2861b(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment2 = mo3145a(resourceId);
        }
        if (fragment2 == null && string != null) {
            fragment2 = mo3146a(string);
        }
        if (fragment2 == null && i != -1) {
            fragment2 = mo3145a(i);
        }
        if (f2346A0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str3);
            sb2.append(" existing=");
            sb2.append(fragment2);
            Log.v("FragmentManager", sb2.toString());
        }
        if (fragment2 == null) {
            Fragment a = mo3158d().mo3141a(context.getClassLoader(), str3);
            a.mFromLayout = true;
            a.mFragmentId = resourceId != 0 ? resourceId : i;
            a.mContainerId = i;
            a.mTag = string;
            a.mInLayout = true;
            a.mFragmentManager = this;
            C0537h hVar = this.f2363j0;
            a.mHost = hVar;
            a.onInflate(hVar.mo3143c(), attributeSet2, a.mSavedFragmentState);
            mo3196a(a, true);
            fragment = a;
        } else if (!fragment2.mInLayout) {
            fragment2.mInLayout = true;
            C0537h hVar2 = this.f2363j0;
            fragment2.mHost = hVar2;
            fragment2.onInflate(hVar2.mo3143c(), attributeSet2, fragment2.mSavedFragmentState);
            fragment = fragment2;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.f2362i0 >= 1 || !fragment.mFromLayout) {
            mo3240m(fragment);
        } else {
            mo3191a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(str3);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo3248p(Fragment fragment) {
        String str = "FragmentManager";
        if (mo3262y()) {
            if (f2346A0) {
                Log.v(str, "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f2378y0.mo3285e(fragment) && f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public Bundle mo3249q(Fragment fragment) {
        Bundle bundle;
        if (this.f2375v0 == null) {
            this.f2375v0 = new Bundle();
        }
        fragment.performSaveInstanceState(this.f2375v0);
        mo3220d(fragment, this.f2375v0, false);
        if (!this.f2375v0.isEmpty()) {
            bundle = this.f2375v0;
            this.f2375v0 = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            mo3252r(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo3252r(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.f2376w0;
            if (sparseArray == null) {
                this.f2376w0 = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f2376w0);
            if (this.f2376w0.size() > 0) {
                fragment.mSavedViewState = this.f2376w0;
                this.f2376w0 = null;
            }
        }
    }

    /* renamed from: s */
    public void mo3253s() {
        this.f2369p0 = true;
        m2936e(2);
    }

    /* renamed from: t */
    public void mo3256t(Fragment fragment) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2365l0;
        if (fragment != null) {
            C4109a.m14083a(fragment, sb);
        } else {
            C4109a.m14083a(this.f2363j0, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    public boolean mo3258u() {
        m2935c(true);
        boolean z = false;
        while (m2933b(this.f2372s0, this.f2373t0)) {
            this.f2350W = true;
            try {
                m2934c(this.f2372s0, this.f2373t0);
                m2917G();
                z = true;
            } catch (Throwable th) {
                m2917G();
                throw th;
            }
        }
        m2920J();
        mo3255t();
        m2915E();
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public Factory2 mo3259v() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo3260w() {
        mo3258u();
        if (this.f2357d0.mo340b()) {
            mo3162h();
        } else {
            this.f2356c0.mo333a();
        }
    }

    /* renamed from: x */
    public boolean mo3261x() {
        return this.f2370q0;
    }

    /* renamed from: y */
    public boolean mo3262y() {
        return this.f2368o0 || this.f2369p0;
    }

    /* renamed from: z */
    public void mo3263z() {
        this.f2368o0 = false;
        this.f2369p0 = false;
        int size = this.f2352Y.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3216c(Fragment fragment) {
        if (fragment.mView != null) {
            C0550g a = mo3183a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a != null) {
                Animator animator = a.f2395b;
                if (animator != null) {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a.f2395b.addListener(new C0548e(this, viewGroup, view, fragment));
                    }
                    a.f2395b.start();
                }
            }
            if (a != null) {
                fragment.mView.startAnimation(a.f2394a);
                a.f2394a.start();
            }
            fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && m2940w(fragment)) {
            this.f2367n0 = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: d */
    public void mo3219d(Fragment fragment) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (f2346A0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f2352Y) {
                    this.f2352Y.remove(fragment);
                }
                if (m2940w(fragment)) {
                    this.f2367n0 = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: f */
    public Fragment mo3160f() {
        return this.f2366m0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C0707b0 mo3227g(Fragment fragment) {
        return this.f2378y0.mo3284d(fragment);
    }

    /* renamed from: m */
    public void mo3239m() {
        m2936e(1);
    }

    /* renamed from: b */
    public C0539a mo3154b(int i) {
        return (C0539a) this.f2354a0.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3226f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3226f(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3174e(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo3228g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3228g(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3175f(this, fragment);
            }
        }
    }

    /* renamed from: h */
    public void mo3229h(Fragment fragment) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: s */
    public void mo3254s(Fragment fragment) {
        if (fragment == null || (this.f2353Z.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.f2366m0;
            this.f2366m0 = fragment;
            m2938u(fragment2);
            m2938u(this.f2366m0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo3155b(C0541c cVar) {
        ArrayList<C0541c> arrayList = this.f2360g0;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    /* renamed from: w */
    private boolean m2940w(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo3231i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo3231i() {
        boolean z = false;
        for (Fragment fragment : this.f2353Z.values()) {
            if (fragment != null) {
                z = m2940w(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo3255t() {
        if (this.f2371r0) {
            this.f2371r0 = false;
            mo3181D();
        }
    }

    /* renamed from: b */
    public void mo3207b(Fragment fragment) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f2352Y.contains(fragment)) {
                if (f2346A0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f2352Y) {
                    this.f2352Y.add(fragment);
                }
                fragment.mAdded = true;
                if (m2940w(fragment)) {
                    this.f2367n0 = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(fragment);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3223e(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                mo3194a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: n */
    public void mo3241n() {
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo3230h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3230h(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3176g(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo3247p() {
        m2920J();
        m2938u(this.f2366m0);
    }

    /* renamed from: j */
    public void mo3233j() {
        this.f2368o0 = false;
        this.f2369p0 = false;
        m2936e(2);
    }

    /* renamed from: r */
    public void mo3251r() {
        this.f2368o0 = false;
        this.f2369p0 = false;
        m2936e(3);
    }

    /* renamed from: u */
    private void m2938u(Fragment fragment) {
        if (fragment != null && this.f2353Z.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: a */
    public C0564o mo3147a() {
        return new C0527a(this);
    }

    /* renamed from: a */
    public void mo3152a(String str, int i) {
        mo3200a((C0554k) new C0555l(str, -1, i), false);
    }

    /* renamed from: k */
    public void mo3235k() {
        this.f2368o0 = false;
        this.f2369p0 = false;
        m2936e(1);
    }

    /* renamed from: o */
    public void mo3243o() {
        m2936e(3);
    }

    /* renamed from: a */
    public void mo3148a(int i, int i2) {
        if (i >= 0) {
            mo3200a((C0554k) new C0555l(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public C0536g mo3158d() {
        if (super.mo3158d() == C0538i.f2344U) {
            Fragment fragment = this.f2365l0;
            if (fragment != null) {
                return fragment.mFragmentManager.mo3158d();
            }
            mo3149a((C0536g) new C0549f());
        }
        return super.mo3158d();
    }

    /* renamed from: a */
    private boolean m2929a(String str, int i, int i2) {
        mo3258u();
        m2935c(true);
        Fragment fragment = this.f2366m0;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo3162h()) {
            return true;
        }
        boolean a = mo3204a(this.f2372s0, this.f2373t0, str, i, i2);
        if (a) {
            this.f2350W = true;
            try {
                m2934c(this.f2372s0, this.f2373t0);
            } finally {
                m2917G();
            }
        }
        m2920J();
        mo3255t();
        m2915E();
        return a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m2936e(int i) {
        try {
            this.f2350W = true;
            mo3185a(i, false);
            this.f2350W = false;
            mo3258u();
        } catch (Throwable th) {
            this.f2350W = false;
            throw th;
        }
    }

    /* renamed from: q */
    public void mo3250q() {
        this.f2368o0 = false;
        this.f2369p0 = false;
        m2936e(4);
    }

    /* renamed from: b */
    public Fragment mo3206b(String str) {
        for (Fragment fragment : this.f2353Z.values()) {
            if (fragment != null) {
                Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                if (findFragmentByWho != null) {
                    return findFragmentByWho;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3221d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3221d(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3170c(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3224e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3224e(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3172d(this, fragment);
            }
        }
    }

    /* renamed from: b */
    public int mo3205b(C0527a aVar) {
        synchronized (this) {
            if (this.f2359f0 != null) {
                if (this.f2359f0.size() > 0) {
                    int intValue = ((Integer) this.f2359f0.remove(this.f2359f0.size() - 1)).intValue();
                    if (f2346A0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(aVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.f2358e0.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f2358e0 == null) {
                this.f2358e0 = new ArrayList<>();
            }
            int size = this.f2358e0.size();
            if (f2346A0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(aVar);
                Log.v("FragmentManager", sb2.toString());
            }
            this.f2358e0.add(aVar);
            return size;
        }
    }

    /* renamed from: c */
    public void mo3215c(int i) {
        synchronized (this) {
            this.f2358e0.set(i, null);
            if (this.f2359f0 == null) {
                this.f2359f0 = new ArrayList<>();
            }
            if (f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            this.f2359f0.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo3151a(C0541c cVar) {
        if (this.f2360g0 == null) {
            this.f2360g0 = new ArrayList<>();
        }
        this.f2360g0.add(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3220d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3220d(fragment, bundle, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3173d(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo3187a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        m2926a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: l */
    public void mo3237l() {
        this.f2370q0 = true;
        mo3258u();
        m2936e(0);
        this.f2363j0 = null;
        this.f2364k0 = null;
        this.f2365l0 = null;
        if (this.f2356c0 != null) {
            this.f2357d0.mo341c();
            this.f2356c0 = null;
        }
    }

    /* renamed from: c */
    private void m2935c(boolean z) {
        if (this.f2350W) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2363j0 == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2363j0.mo3144d().getLooper()) {
            if (!z) {
                m2916F();
            }
            if (this.f2372s0 == null) {
                this.f2372s0 = new ArrayList<>();
                this.f2373t0 = new ArrayList<>();
            }
            this.f2350W = true;
            try {
                m2927a(null, null);
            } finally {
                this.f2350W = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: a */
    public Fragment mo3182a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f2353Z.get(string);
        if (fragment != null) {
            return fragment;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        m2926a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: b */
    public void mo3211b(C0554k kVar, boolean z) {
        if (!z || (this.f2363j0 != null && !this.f2370q0)) {
            m2935c(z);
            if (kVar.mo3039a(this.f2372s0, this.f2373t0)) {
                this.f2350W = true;
                try {
                    m2934c(this.f2372s0, this.f2373t0);
                } finally {
                    m2917G();
                }
            }
            m2920J();
            mo3255t();
            m2915E();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3190a(Fragment fragment) {
        String str = "FragmentManager";
        if (mo3262y()) {
            if (f2346A0) {
                Log.v(str, "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f2378y0.mo3281a(fragment) && f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* renamed from: a */
    public void mo3153a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.f2353Z.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f2353Z.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.f2352Y.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment2 = (Fragment) this.f2352Y.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2355b0;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment3 = (Fragment) this.f2355b0.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        ArrayList<C0527a> arrayList2 = this.f2354a0;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0527a aVar = (C0527a) this.f2354a0.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo3036a(sb2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f2358e0 != null) {
                int size4 = this.f2358e0.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        C0527a aVar2 = (C0527a) this.f2358e0.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(aVar2);
                    }
                }
            }
            if (this.f2359f0 != null && this.f2359f0.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2359f0.toArray()));
            }
        }
        ArrayList<C0554k> arrayList3 = this.f2349V;
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            if (size5 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size5; i5++) {
                    C0554k kVar = (C0554k) this.f2349V.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(kVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2363j0);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2364k0);
        if (this.f2365l0 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2365l0);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2362i0);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2368o0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2369p0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2370q0);
        if (this.f2367n0) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2367n0);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: b */
    private void m2932b(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0527a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0527a) arrayList3.get(i4)).f2457q;
        ArrayList<Fragment> arrayList5 = this.f2374u0;
        if (arrayList5 == null) {
            this.f2374u0 = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f2374u0.addAll(this.f2352Y);
        Fragment f = mo3160f();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0527a aVar = (C0527a) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                f = aVar.mo3031a(this.f2374u0, f);
            } else {
                f = aVar.mo3042b(this.f2374u0, f);
            }
            z2 = z2 || aVar.f2448h;
        }
        this.f2374u0.clear();
        if (!z) {
            C0566p.m3108a(this, arrayList, arrayList2, i, i2, false);
        }
        m2928a(arrayList, arrayList2, i, i2);
        if (z) {
            C3928b bVar = new C3928b();
            m2925a(bVar);
            int a = m2921a(arrayList, arrayList2, i, i2, bVar);
            m2931b(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0566p.m3108a(this, arrayList, arrayList2, i, i3, true);
            mo3185a(this.f2362i0, true);
        }
        while (i4 < i5) {
            C0527a aVar2 = (C0527a) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                int i7 = aVar2.f2319u;
                if (i7 >= 0) {
                    mo3215c(i7);
                    aVar2.f2319u = -1;
                }
            }
            aVar2.mo3054i();
            i4++;
        }
        if (z2) {
            mo3178A();
        }
    }

    /* renamed from: c */
    private void m2934c(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m2927a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0527a) arrayList.get(i)).f2457q) {
                    if (i2 != i) {
                        m2932b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0527a) arrayList.get(i2)).f2457q) {
                            i2++;
                        }
                    }
                    m2932b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m2932b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3217c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3217c(fragment, bundle, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3171c(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3218c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3218c(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3167b(this, fragment);
            }
        }
    }

    /* renamed from: b */
    private void m2931b(C3928b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo14032h(i);
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2933b(java.util.ArrayList<androidx.fragment.app.C0527a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.j$k> r0 = r4.f2349V     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.fragment.app.j$k> r0 = r4.f2349V     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<androidx.fragment.app.j$k> r0 = r4.f2349V     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r4.f2349V     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            androidx.fragment.app.j$k r3 = (androidx.fragment.app.C0542j.C0554k) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo3039a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<androidx.fragment.app.j$k> r5 = r4.f2349V     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            androidx.fragment.app.h r5 = r4.f2363j0     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo3144d()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f2379z0     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0542j.m2933b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: b */
    public void mo3212b(boolean z) {
        for (int size = this.f2352Y.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2352Y.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3213b(Menu menu) {
        if (this.f2362i0 < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo3214b(MenuItem menuItem) {
        if (this.f2362i0 < 1) {
            return false;
        }
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3208b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3208b(fragment, context, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3168b((C0538i) this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    static C0550g m2923a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2347B0);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2348C0);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0550g((Animation) animationSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3209b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3209b(fragment, bundle, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3169b((C0538i) this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    static C0550g m2922a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2348C0);
        alphaAnimation.setDuration(220);
        return new C0550g((Animation) alphaAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3210b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3210b(fragment, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3163a(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0550g mo3183a(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C0550g(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C0550g(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f2363j0.mo3143c().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2363j0.mo3143c(), nextAnim);
                    if (loadAnimation != null) {
                        return new C0550g(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2363j0.mo3143c(), nextAnim);
                    if (loadAnimator != null) {
                        return new C0550g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2363j0.mo3143c(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new C0550g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b = m2930b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m2923a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m2923a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m2923a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m2923a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m2922a(0.0f, 1.0f);
            case 6:
                return m2922a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2363j0.mo3114h()) {
                    i2 = this.f2363j0.mo3113g();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d6;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v3
      assigns: []
      uses: []
      mth insns count: 492
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04db  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3191a(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r20
            goto L_0x0016
        L_0x0011:
            r0 = r20
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r19.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = 2
        L_0x0037:
            androidx.lifecycle.i$b r1 = r7.mMaxState
            androidx.lifecycle.i$b r2 = androidx.lifecycle.C0715i.C0717b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.mState
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x0325
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.setAnimatingAway(r14)
            r7.setAnimator(r14)
            int r2 = r19.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r1 = r19
            r0.mo3191a(r1, r2, r3, r4, r5)
        L_0x007c:
            int r0 = r7.mState
            if (r0 == 0) goto L_0x008e
            if (r0 == r8) goto L_0x01e7
            if (r0 == r10) goto L_0x008b
            if (r0 == r9) goto L_0x0088
            goto L_0x04d6
        L_0x0088:
            r0 = 3
            goto L_0x02ff
        L_0x008b:
            r0 = 2
            goto L_0x02dd
        L_0x008e:
            if (r11 <= 0) goto L_0x01e7
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x00a8:
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x0101
            androidx.fragment.app.h r1 = r6.f2363j0
            android.content.Context r1 = r1.mo3143c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.mo3182a(r0, r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.mWho
            goto L_0x00d1
        L_0x00d0:
            r0 = r14
        L_0x00d1:
            r7.mTargetWho = r0
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x00e1
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00e1:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r14
            goto L_0x00f8
        L_0x00ee:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00f8:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x0101
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x0101
            r11 = 2
        L_0x0101:
            androidx.fragment.app.h r0 = r6.f2363j0
            r7.mHost = r0
            androidx.fragment.app.Fragment r1 = r6.f2365l0
            r7.mParentFragment = r1
            if (r1 == 0) goto L_0x010e
            androidx.fragment.app.j r0 = r1.mChildFragmentManager
            goto L_0x0110
        L_0x010e:
            androidx.fragment.app.j r0 = r0.f2342X
        L_0x0110:
            r7.mFragmentManager = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r15 = " that does not belong to this FragmentManager!"
            java.lang.String r5 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            if (r0 == 0) goto L_0x016b
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f2353Z
            java.lang.String r0 = r0.mWho
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x0149
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x013e
            r2 = 1
            r3 = 0
            r16 = 0
            r17 = 1
            r0 = r18
            r9 = r4
            r4 = r16
            r10 = r5
            r5 = r17
            r0.mo3191a(r1, r2, r3, r4, r5)
            goto L_0x0140
        L_0x013e:
            r9 = r4
            r10 = r5
        L_0x0140:
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r0 = r0.mWho
            r7.mTargetWho = r0
            r7.mTarget = r14
            goto L_0x016d
        L_0x0149:
            r9 = r4
            r10 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            androidx.fragment.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016b:
            r9 = r4
            r10 = r5
        L_0x016d:
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x01aa
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f2353Z
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x018a
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x01aa
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r0.mo3191a(r1, r2, r3, r4, r5)
            goto L_0x01aa
        L_0x018a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r2 = r7.mTargetWho
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            androidx.fragment.app.h r0 = r6.f2363j0
            android.content.Context r0 = r0.mo3143c()
            r6.mo3208b(r7, r0, r13)
            r19.performAttach()
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x01c0
            androidx.fragment.app.h r0 = r6.f2363j0
            r0.mo3104a(r7)
            goto L_0x01c3
        L_0x01c0:
            r0.onAttachFragment(r7)
        L_0x01c3:
            androidx.fragment.app.h r0 = r6.f2363j0
            android.content.Context r0 = r0.mo3143c()
            r6.mo3192a(r7, r0, r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x01e0
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo3217c(r7, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo3209b(r7, r0, r13)
            goto L_0x01e7
        L_0x01e0:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x01e7:
            if (r11 <= 0) goto L_0x01ec
            r18.mo3223e(r19)
        L_0x01ec:
            if (r11 <= r8) goto L_0x008b
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x0206
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0206:
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x02c6
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x027c
            r1 = -1
            if (r0 == r1) goto L_0x025d
            androidx.fragment.app.e r1 = r6.f2364k0
            android.view.View r0 = r1.mo3021a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x027d
            boolean r1 = r7.mRestored
            if (r1 == 0) goto L_0x0220
            goto L_0x027d
        L_0x0220:
            android.content.res.Resources r0 = r19.getResources()     // Catch:{ NotFoundException -> 0x022b }
            int r1 = r7.mContainerId     // Catch:{ NotFoundException -> 0x022b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x022b }
            goto L_0x022d
        L_0x022b:
            java.lang.String r0 = "unknown"
        L_0x022d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.m2926a(r1)
            throw r14
        L_0x025d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m2926a(r0)
            throw r14
        L_0x027c:
            r0 = r14
        L_0x027d:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r7.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r7.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x02c4
            r7.mInnerView = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x029a
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x029a:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x02a5
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x02a5:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r7.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r6.mo3194a(r7, r0, r1, r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02c0
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x02c0
            goto L_0x02c1
        L_0x02c0:
            r8 = 0
        L_0x02c1:
            r7.mIsNewlyAdded = r8
            goto L_0x02c6
        L_0x02c4:
            r7.mInnerView = r14
        L_0x02c6:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo3193a(r7, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02d9
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreViewState(r0)
        L_0x02d9:
            r7.mSavedFragmentState = r14
            goto L_0x008b
        L_0x02dd:
            if (r11 <= r0) goto L_0x0088
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x02f7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02f7:
            r19.performStart()
            r6.mo3226f(r7, r13)
            goto L_0x0088
        L_0x02ff:
            if (r11 <= r0) goto L_0x04d6
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x0319
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0319:
            r19.performResume()
            r6.mo3224e(r7, r13)
            r7.mSavedFragmentState = r14
            r7.mSavedViewState = r14
            goto L_0x04d6
        L_0x0325:
            if (r0 <= r11) goto L_0x04d6
            if (r0 == r8) goto L_0x0405
            r1 = 2
            if (r0 == r1) goto L_0x0375
            r1 = 3
            if (r0 == r1) goto L_0x0354
            r1 = 4
            if (r0 == r1) goto L_0x0334
            goto L_0x04d6
        L_0x0334:
            if (r11 >= r1) goto L_0x0354
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x034e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x034e:
            r19.performPause()
            r6.mo3221d(r7, r13)
        L_0x0354:
            r0 = 3
            if (r11 >= r0) goto L_0x0375
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x036f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x036f:
            r19.performStop()
            r6.mo3228g(r7, r13)
        L_0x0375:
            r0 = 2
            if (r11 >= r0) goto L_0x0405
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x0390
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0390:
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x03a3
            androidx.fragment.app.h r0 = r6.f2363j0
            boolean r0 = r0.mo3110b(r7)
            if (r0 == 0) goto L_0x03a3
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x03a3
            r18.mo3252r(r19)
        L_0x03a3:
            r19.performDestroyView()
            r6.mo3230h(r7, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x03f6
            android.view.ViewGroup r1 = r7.mContainer
            if (r1 == 0) goto L_0x03f6
            r1.endViewTransition(r0)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r19.getParentFragment()
            if (r0 == 0) goto L_0x03c7
            androidx.fragment.app.Fragment r0 = r19.getParentFragment()
            boolean r0 = r0.mRemoving
            if (r0 != 0) goto L_0x03f6
        L_0x03c7:
            int r0 = r6.f2362i0
            r1 = 0
            if (r0 <= 0) goto L_0x03e7
            boolean r0 = r6.f2370q0
            if (r0 != 0) goto L_0x03e7
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03e7
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03e7
            r0 = r21
            r2 = r22
            androidx.fragment.app.j$g r0 = r6.mo3183a(r7, r0, r13, r2)
            goto L_0x03e8
        L_0x03e7:
            r0 = r14
        L_0x03e8:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x03ef
            r6.m2924a(r7, r0, r11)
        L_0x03ef:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x03f6:
            r7.mContainer = r14
            r7.mView = r14
            r7.mViewLifecycleOwner = r14
            androidx.lifecycle.s<androidx.lifecycle.m> r0 = r7.mViewLifecycleOwnerLiveData
            r0.mo4096b(r14)
            r7.mInnerView = r14
            r7.mInLayout = r13
        L_0x0405:
            if (r11 >= r8) goto L_0x04d6
            boolean r0 = r6.f2370q0
            if (r0 == 0) goto L_0x042c
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 == 0) goto L_0x041c
            android.view.View r0 = r19.getAnimatingAway()
            r7.setAnimatingAway(r14)
            r0.clearAnimation()
            goto L_0x042c
        L_0x041c:
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x042c
            android.animation.Animator r0 = r19.getAnimator()
            r7.setAnimator(r14)
            r0.cancel()
        L_0x042c:
            android.view.View r0 = r19.getAnimatingAway()
            if (r0 != 0) goto L_0x04d2
            android.animation.Animator r0 = r19.getAnimator()
            if (r0 == 0) goto L_0x043a
            goto L_0x04d2
        L_0x043a:
            boolean r0 = f2346A0
            if (r0 == 0) goto L_0x0452
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0452:
            boolean r0 = r7.mRemoving
            if (r0 == 0) goto L_0x045e
            boolean r0 = r19.isInBackStack()
            if (r0 != 0) goto L_0x045e
            r0 = 1
            goto L_0x045f
        L_0x045e:
            r0 = 0
        L_0x045f:
            if (r0 != 0) goto L_0x046d
            androidx.fragment.app.l r1 = r6.f2378y0
            boolean r1 = r1.mo3287f(r7)
            if (r1 == 0) goto L_0x046a
            goto L_0x046d
        L_0x046a:
            r7.mState = r13
            goto L_0x049e
        L_0x046d:
            androidx.fragment.app.h r1 = r6.f2363j0
            boolean r2 = r1 instanceof androidx.lifecycle.C0709c0
            if (r2 == 0) goto L_0x047a
            androidx.fragment.app.l r1 = r6.f2378y0
            boolean r8 = r1.mo3292z()
            goto L_0x048f
        L_0x047a:
            android.content.Context r1 = r1.mo3143c()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x048f
            androidx.fragment.app.h r1 = r6.f2363j0
            android.content.Context r1 = r1.mo3143c()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x048f:
            if (r0 != 0) goto L_0x0493
            if (r8 == 0) goto L_0x0498
        L_0x0493:
            androidx.fragment.app.l r1 = r6.f2378y0
            r1.mo3282b(r7)
        L_0x0498:
            r19.performDestroy()
            r6.mo3210b(r7, r13)
        L_0x049e:
            r19.performDetach()
            r6.mo3218c(r7, r13)
            if (r23 != 0) goto L_0x04d6
            if (r0 != 0) goto L_0x04ce
            androidx.fragment.app.l r0 = r6.f2378y0
            boolean r0 = r0.mo3287f(r7)
            if (r0 == 0) goto L_0x04b1
            goto L_0x04ce
        L_0x04b1:
            r7.mHost = r14
            r7.mParentFragment = r14
            r7.mFragmentManager = r14
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x04d6
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f2353Z
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x04d6
            boolean r1 = r0.getRetainInstance()
            if (r1 == 0) goto L_0x04d6
            r7.mTarget = r0
            goto L_0x04d6
        L_0x04ce:
            r18.mo3236k(r19)
            goto L_0x04d6
        L_0x04d2:
            r7.setStateAfterAnimating(r11)
            goto L_0x04d7
        L_0x04d6:
            r8 = r11
        L_0x04d7:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x0503
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.mState = r8
        L_0x0503:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0542j.mo3191a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m2924a(Fragment fragment, C0550g gVar, int i) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        Animation animation = gVar.f2394a;
        if (animation != null) {
            C0551h hVar = new C0551h(animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            hVar.setAnimationListener(new C0545c(viewGroup, fragment));
            fragment.mView.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f2395b;
        fragment.setAnimator(animator);
        animator.addListener(new C0547d(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3185a(int i, boolean z) {
        if (this.f2363j0 == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2362i0) {
            this.f2362i0 = i;
            int size = this.f2352Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo3238l((Fragment) this.f2352Y.get(i2));
            }
            for (Fragment fragment : this.f2353Z.values()) {
                if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                    mo3238l(fragment);
                }
            }
            mo3181D();
            if (this.f2367n0) {
                C0537h hVar = this.f2363j0;
                if (hVar != null && this.f2362i0 == 4) {
                    hVar.mo3115i();
                    this.f2367n0 = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3196a(Fragment fragment, boolean z) {
        if (f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        mo3234j(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f2352Y.contains(fragment)) {
            synchronized (this.f2352Y) {
                this.f2352Y.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2940w(fragment)) {
                this.f2367n0 = true;
            }
            if (z) {
                mo3240m(fragment);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(fragment);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: a */
    public Fragment mo3145a(int i) {
        for (int size = this.f2352Y.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2352Y.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f2353Z.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo3146a(String str) {
        if (str != null) {
            for (int size = this.f2352Y.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2352Y.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.f2353Z.values()) {
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3200a(C0554k kVar, boolean z) {
        if (!z) {
            m2916F();
        }
        synchronized (this) {
            if (!this.f2370q0) {
                if (this.f2363j0 != null) {
                    if (this.f2349V == null) {
                        this.f2349V = new ArrayList<>();
                    }
                    this.f2349V.add(kVar);
                    mo3180C();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo3184a(int i, C0527a aVar) {
        synchronized (this) {
            if (this.f2358e0 == null) {
                this.f2358e0 = new ArrayList<>();
            }
            int size = this.f2358e0.size();
            if (i < size) {
                if (f2346A0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(aVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.f2358e0.set(i, aVar);
            } else {
                while (size < i) {
                    this.f2358e0.add(null);
                    if (this.f2359f0 == null) {
                        this.f2359f0 = new ArrayList<>();
                    }
                    if (f2346A0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.f2359f0.add(Integer.valueOf(size));
                    size++;
                }
                if (f2346A0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(aVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.f2358e0.add(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m2927a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<C0556m> arrayList3 = this.f2377x0;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0556m mVar = (C0556m) this.f2377x0.get(i);
            if (arrayList != null && !mVar.f2408a) {
                int indexOf = arrayList.indexOf(mVar.f2409b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    this.f2377x0.remove(i);
                    i--;
                    size--;
                    mVar.mo3274c();
                    i++;
                }
            }
            if (mVar.mo3276e() || (arrayList != null && mVar.f2409b.mo3038a(arrayList, 0, arrayList.size()))) {
                this.f2377x0.remove(i);
                i--;
                size--;
                if (arrayList != null && !mVar.f2408a) {
                    int indexOf2 = arrayList.indexOf(mVar.f2409b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        mVar.mo3274c();
                    }
                }
                mVar.mo3275d();
            }
            i++;
        }
    }

    /* renamed from: a */
    private int m2921a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C3928b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0527a aVar = (C0527a) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (aVar.mo3053h() && !aVar.mo3038a(arrayList, i4 + 1, i2)) {
                if (this.f2377x0 == null) {
                    this.f2377x0 = new ArrayList<>();
                }
                C0556m mVar = new C0556m(aVar, booleanValue);
                this.f2377x0.add(mVar);
                aVar.mo3035a((C0524f) mVar);
                if (booleanValue) {
                    aVar.mo3050f();
                } else {
                    aVar.mo3047c(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2925a(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3198a(C0527a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3047c(z3);
        } else {
            aVar.mo3050f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0566p.m3108a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo3185a(this.f2362i0, true);
        }
        for (Fragment fragment : this.f2353Z.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.mo3044b(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2928a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0527a aVar = (C0527a) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo3033a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3047c(z);
            } else {
                aVar.mo3033a(1);
                aVar.mo3050f();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m2925a(C3928b<Fragment> bVar) {
        int i = this.f2362i0;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f2352Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f2352Y.get(i2);
                if (fragment.mState < min) {
                    mo3191a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3197a(C0527a aVar) {
        if (this.f2354a0 == null) {
            this.f2354a0 = new ArrayList<>();
        }
        this.f2354a0.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3204a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0527a> arrayList3 = this.f2354a0;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2354a0.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                i3 = this.f2354a0.size() - 1;
                while (i3 >= 0) {
                    C0527a aVar = (C0527a) this.f2354a0.get(i3);
                    if ((str != null && str.equals(aVar.mo3051g())) || (i >= 0 && i == aVar.f2319u)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0527a aVar2 = (C0527a) this.f2354a0.get(i3);
                        if ((str == null || !str.equals(aVar2.mo3051g())) && (i < 0 || i != aVar2.f2319u)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f2354a0.size() - 1) {
                return false;
            }
            for (int size2 = this.f2354a0.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f2354a0.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3188a(Parcelable parcelable) {
        C0562n nVar;
        if (parcelable != null) {
            C0557k kVar = (C0557k) parcelable;
            if (kVar.f2415c != null) {
                for (Fragment fragment : this.f2378y0.mo3291y()) {
                    if (f2346A0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                    Iterator it = kVar.f2415c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            nVar = null;
                            break;
                        }
                        nVar = (C0562n) it.next();
                        if (nVar.f2427U.equals(fragment.mWho)) {
                            break;
                        }
                    }
                    if (nVar == null) {
                        if (f2346A0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Discarding retained Fragment ");
                            sb2.append(fragment);
                            sb2.append(" that was not found in the set of active Fragments ");
                            sb2.append(kVar.f2415c);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        Fragment fragment2 = fragment;
                        mo3191a(fragment2, 1, 0, 0, false);
                        fragment.mRemoving = true;
                        mo3191a(fragment2, 0, 0, 0, false);
                    } else {
                        nVar.f2440g0 = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        Fragment fragment3 = fragment.mTarget;
                        fragment.mTargetWho = fragment3 != null ? fragment3.mWho : null;
                        fragment.mTarget = null;
                        Bundle bundle = nVar.f2439f0;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f2363j0.mo3143c().getClassLoader());
                            fragment.mSavedViewState = nVar.f2439f0.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = nVar.f2439f0;
                        }
                    }
                }
                this.f2353Z.clear();
                Iterator it2 = kVar.f2415c.iterator();
                while (it2.hasNext()) {
                    C0562n nVar2 = (C0562n) it2.next();
                    if (nVar2 != null) {
                        Fragment a = nVar2.mo3304a(this.f2363j0.mo3143c().getClassLoader(), mo3158d());
                        a.mFragmentManager = this;
                        if (f2346A0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreSaveState: active (");
                            sb3.append(a.mWho);
                            sb3.append("): ");
                            sb3.append(a);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.f2353Z.put(a.mWho, a);
                        nVar2.f2440g0 = null;
                    }
                }
                this.f2352Y.clear();
                ArrayList<String> arrayList = kVar.f2411U;
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Fragment fragment4 = (Fragment) this.f2353Z.get(str);
                        if (fragment4 != null) {
                            fragment4.mAdded = true;
                            if (f2346A0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("restoreSaveState: added (");
                                sb4.append(str);
                                sb4.append("): ");
                                sb4.append(fragment4);
                                Log.v("FragmentManager", sb4.toString());
                            }
                            if (!this.f2352Y.contains(fragment4)) {
                                synchronized (this.f2352Y) {
                                    this.f2352Y.add(fragment4);
                                }
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Already added ");
                                sb5.append(fragment4);
                                throw new IllegalStateException(sb5.toString());
                            }
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("No instantiated fragment for (");
                            sb6.append(str);
                            sb6.append(")");
                            m2926a((RuntimeException) new IllegalStateException(sb6.toString()));
                            throw null;
                        }
                    }
                }
                C0528b[] bVarArr = kVar.f2412V;
                if (bVarArr != null) {
                    this.f2354a0 = new ArrayList<>(bVarArr.length);
                    int i = 0;
                    while (true) {
                        C0528b[] bVarArr2 = kVar.f2412V;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        C0527a a2 = bVarArr2[i].mo3056a(this);
                        if (f2346A0) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i);
                            sb7.append(" (index ");
                            sb7.append(a2.f2319u);
                            sb7.append("): ");
                            sb7.append(a2);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new C4110b("FragmentManager"));
                            a2.mo3037a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2354a0.add(a2);
                        int i2 = a2.f2319u;
                        if (i2 >= 0) {
                            mo3184a(i2, a2);
                        }
                        i++;
                    }
                } else {
                    this.f2354a0 = null;
                }
                String str2 = kVar.f2413W;
                if (str2 != null) {
                    this.f2366m0 = (Fragment) this.f2353Z.get(str2);
                    m2938u(this.f2366m0);
                }
                this.f2351X = kVar.f2414X;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.lifecycle.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3199a(androidx.fragment.app.C0537h r3, androidx.fragment.app.C0534e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h r0 = r2.f2363j0
            if (r0 != 0) goto L_0x004d
            r2.f2363j0 = r3
            r2.f2364k0 = r4
            r2.f2365l0 = r5
            androidx.fragment.app.Fragment r4 = r2.f2365l0
            if (r4 == 0) goto L_0x0011
            r2.m2920J()
        L_0x0011:
            boolean r4 = r3 instanceof androidx.activity.C0061c
            if (r4 == 0) goto L_0x0028
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0061c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f2356c0 = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f2356c0
            androidx.activity.b r1 = r2.f2357d0
            r0.mo334a(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            androidx.fragment.app.j r3 = r5.mFragmentManager
            androidx.fragment.app.l r3 = r3.mo3225f(r5)
            r2.f2378y0 = r3
            goto L_0x004c
        L_0x0033:
            boolean r4 = r3 instanceof androidx.lifecycle.C0709c0
            if (r4 == 0) goto L_0x0044
            androidx.lifecycle.c0 r3 = (androidx.lifecycle.C0709c0) r3
            androidx.lifecycle.b0 r3 = r3.getViewModelStore()
            androidx.fragment.app.l r3 = androidx.fragment.app.C0559l.m3050a(r3)
            r2.f2378y0 = r3
            goto L_0x004c
        L_0x0044:
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r4 = 0
            r3.<init>(r4)
            r2.f2378y0 = r3
        L_0x004c:
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0542j.mo3199a(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public void mo3201a(boolean z) {
        for (int size = this.f2352Y.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2352Y.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public void mo3186a(Configuration configuration) {
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo3202a(Menu menu, MenuInflater menuInflater) {
        if (this.f2362i0 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2355b0 != null) {
            for (int i2 = 0; i2 < this.f2355b0.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f2355b0.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2355b0 = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo3203a(MenuItem menuItem) {
        if (this.f2362i0 < 1) {
            return false;
        }
        for (int i = 0; i < this.f2352Y.size(); i++) {
            Fragment fragment = (Fragment) this.f2352Y.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo3189a(Menu menu) {
        if (this.f2362i0 >= 1) {
            for (int i = 0; i < this.f2352Y.size(); i++) {
                Fragment fragment = (Fragment) this.f2352Y.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3195a(Fragment fragment, C0717b bVar) {
        if (this.f2353Z.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo3150a(C0540b bVar, boolean z) {
        this.f2361h0.add(new C0552i(bVar, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3192a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3192a(fragment, context, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3164a((C0538i) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3193a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3193a(fragment, bundle, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3165a((C0538i) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3194a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f2365l0;
        if (fragment2 != null) {
            C0538i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0542j) {
                ((C0542j) fragmentManager).mo3194a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f2361h0.iterator();
        while (it.hasNext()) {
            C0552i iVar = (C0552i) it.next();
            if (!z || iVar.f2402b) {
                iVar.f2401a.mo3166a(this, fragment, view, bundle);
            }
        }
    }
}
