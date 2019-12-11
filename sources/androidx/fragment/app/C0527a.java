package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0538i.C0539a;
import androidx.lifecycle.C0715i.C0717b;
import java.io.PrintWriter;
import java.util.ArrayList;
import p096e.p121h.p134r.C4110b;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C0527a extends C0564o implements C0539a, C0554k {

    /* renamed from: s */
    final C0542j f2317s;

    /* renamed from: t */
    boolean f2318t;

    /* renamed from: u */
    int f2319u = -1;

    public C0527a(C0542j jVar) {
        this.f2317s = jVar;
    }

    /* renamed from: a */
    public void mo3036a(String str, PrintWriter printWriter) {
        mo3037a(str, printWriter, true);
    }

    /* renamed from: b */
    public C0564o mo3043b(Fragment fragment) {
        C0542j jVar = fragment.mFragmentManager;
        if (jVar == null || jVar == this.f2317s) {
            super.mo3043b(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C0564o mo3045c(Fragment fragment) {
        C0542j jVar = fragment.mFragmentManager;
        if (jVar == null || jVar == this.f2317s) {
            super.mo3045c(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C0564o mo3048d(Fragment fragment) {
        if (fragment != null) {
            C0542j jVar = fragment.mFragmentManager;
            if (!(jVar == null || jVar == this.f2317s)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
                sb.append(fragment.toString());
                sb.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
        }
        super.mo3048d(fragment);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3050f() {
        int size = this.f2441a.size();
        for (int i = 0; i < size; i++) {
            C0565a aVar = (C0565a) this.f2441a.get(i);
            Fragment fragment = aVar.f2460b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2446f, this.f2447g);
            }
            switch (aVar.f2459a) {
                case 1:
                    fragment.setNextAnim(aVar.f2461c);
                    this.f2317s.mo3196a(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f2462d);
                    this.f2317s.mo3244o(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2462d);
                    this.f2317s.mo3229h(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2461c);
                    this.f2317s.mo3256t(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2462d);
                    this.f2317s.mo3219d(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2461c);
                    this.f2317s.mo3207b(fragment);
                    break;
                case 8:
                    this.f2317s.mo3254s(fragment);
                    break;
                case 9:
                    this.f2317s.mo3254s(null);
                    break;
                case 10:
                    this.f2317s.mo3195a(fragment, aVar.f2466h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2459a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f2457q || aVar.f2459a == 1 || fragment == null)) {
                this.f2317s.mo3238l(fragment);
            }
        }
        if (!this.f2457q) {
            C0542j jVar = this.f2317s;
            jVar.mo3185a(jVar.f2362i0, true);
        }
    }

    /* renamed from: g */
    public String mo3051g() {
        return this.f2450j;
    }

    public int getId() {
        return this.f2319u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo3053h() {
        for (int i = 0; i < this.f2441a.size(); i++) {
            if (m2792b((C0565a) this.f2441a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo3054i() {
        if (this.f2458r != null) {
            for (int i = 0; i < this.f2458r.size(); i++) {
                ((Runnable) this.f2458r.get(i)).run();
            }
            this.f2458r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2319u >= 0) {
            sb.append(" #");
            sb.append(this.f2319u);
        }
        if (this.f2450j != null) {
            sb.append(" ");
            sb.append(this.f2450j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo3037a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2450j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2319u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2318t);
            if (this.f2446f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2446f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2447g));
            }
            if (!(this.f2442b == 0 && this.f2443c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2442b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2443c));
            }
            if (!(this.f2444d == 0 && this.f2445e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2444d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2445e));
            }
            if (!(this.f2451k == 0 && this.f2452l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2451k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2452l);
            }
            if (!(this.f2453m == 0 && this.f2454n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2453m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2454n);
            }
        }
        if (!this.f2441a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2441a.size();
            for (int i = 0; i < size; i++) {
                C0565a aVar = (C0565a) this.f2441a.get(i);
                switch (aVar.f2459a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.f2459a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2460b);
                if (z) {
                    if (!(aVar.f2461c == 0 && aVar.f2462d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2461c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2462d));
                    }
                    if (aVar.f2463e != 0 || aVar.f2464f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2463e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2464f));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public int mo3040b() {
        return mo3041b(true);
    }

    /* renamed from: c */
    public void mo3046c() {
        mo3320e();
        this.f2317s.mo3211b((C0554k) this, false);
    }

    /* renamed from: d */
    public void mo3049d() {
        mo3320e();
        this.f2317s.mo3211b((C0554k) this, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo3041b(boolean z) {
        if (!this.f2318t) {
            if (C0542j.f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C4110b(str));
                mo3036a("  ", printWriter);
                printWriter.close();
            }
            this.f2318t = true;
            if (this.f2448h) {
                this.f2319u = this.f2317s.mo3205b(this);
            } else {
                this.f2319u = -1;
            }
            this.f2317s.mo3200a((C0554k) this, z);
            return this.f2319u;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3047c(boolean z) {
        for (int size = this.f2441a.size() - 1; size >= 0; size--) {
            C0565a aVar = (C0565a) this.f2441a.get(size);
            Fragment fragment = aVar.f2460b;
            if (fragment != null) {
                fragment.setNextTransition(C0542j.m2937f(this.f2446f), this.f2447g);
            }
            switch (aVar.f2459a) {
                case 1:
                    fragment.setNextAnim(aVar.f2464f);
                    this.f2317s.mo3244o(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f2463e);
                    this.f2317s.mo3196a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2463e);
                    this.f2317s.mo3256t(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2464f);
                    this.f2317s.mo3229h(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2463e);
                    this.f2317s.mo3207b(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2464f);
                    this.f2317s.mo3219d(fragment);
                    break;
                case 8:
                    this.f2317s.mo3254s(null);
                    break;
                case 9:
                    this.f2317s.mo3254s(fragment);
                    break;
                case 10:
                    this.f2317s.mo3195a(fragment, aVar.f2465g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2459a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f2457q || aVar.f2459a == 3 || fragment == null)) {
                this.f2317s.mo3238l(fragment);
            }
        }
        if (!this.f2457q && z) {
            C0542j jVar = this.f2317s;
            jVar.mo3185a(jVar.f2362i0, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3044b(int i) {
        int size = this.f2441a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C0565a) this.f2441a.get(i2)).f2460b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo3042b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2441a.size() - 1; size >= 0; size--) {
            C0565a aVar = (C0565a) this.f2441a.get(size);
            int i = aVar.f2459a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2460b;
                            break;
                        case 10:
                            aVar.f2466h = aVar.f2465g;
                            break;
                    }
                }
                arrayList.add(aVar.f2460b);
            }
            arrayList.remove(aVar.f2460b);
        }
        return fragment;
    }

    /* renamed from: b */
    private static boolean m2792b(C0565a aVar) {
        Fragment fragment = aVar.f2460b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3034a(int i, Fragment fragment, String str, int i2) {
        super.mo3034a(i, fragment, str, i2);
        fragment.mFragmentManager = this.f2317s;
    }

    /* renamed from: a */
    public C0564o mo3032a(Fragment fragment, C0717b bVar) {
        if (fragment.mFragmentManager != this.f2317s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.f2317s);
            throw new IllegalArgumentException(sb.toString());
        } else if (bVar.mo4136a(C0717b.CREATED)) {
            super.mo3032a(fragment, bVar);
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle below ");
            sb2.append(C0717b.CREATED);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3033a(int i) {
        if (this.f2448h) {
            String str = "FragmentManager";
            if (C0542j.f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f2441a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0565a aVar = (C0565a) this.f2441a.get(i2);
                Fragment fragment = aVar.f2460b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (C0542j.f2346A0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f2460b);
                        sb2.append(" to ");
                        sb2.append(aVar.f2460b.mBackStackNesting);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo3030a() {
        return mo3041b(false);
    }

    /* renamed from: a */
    public boolean mo3039a(ArrayList<C0527a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0542j.f2346A0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f2448h) {
            this.f2317s.mo3197a(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3038a(ArrayList<C0527a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2441a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C0565a) this.f2441a.get(i4)).f2460b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0527a aVar = (C0527a) arrayList.get(i6);
                    int size2 = aVar.f2441a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C0565a) aVar.f2441a.get(i7)).f2460b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo3031a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2441a.size()) {
            C0565a aVar = (C0565a) this.f2441a.get(i);
            int i2 = aVar.f2459a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2460b;
                    int i3 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList2.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f2441a.add(i4, new C0565a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C0565a aVar2 = new C0565a(3, fragment5);
                                aVar2.f2461c = aVar.f2461c;
                                aVar2.f2463e = aVar.f2463e;
                                aVar2.f2462d = aVar.f2462d;
                                aVar2.f2464f = aVar.f2464f;
                                this.f2441a.add(i4, aVar2);
                                arrayList2.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f2441a.remove(i4);
                        i4--;
                    } else {
                        aVar.f2459a = 1;
                        arrayList2.add(fragment3);
                    }
                    i = i4;
                    fragment2 = fragment4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2460b);
                    Fragment fragment6 = aVar.f2460b;
                    if (fragment6 == fragment2) {
                        this.f2441a.add(i, new C0565a(9, fragment6));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2441a.add(i, new C0565a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2460b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2460b);
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3035a(C0524f fVar) {
        for (int i = 0; i < this.f2441a.size(); i++) {
            C0565a aVar = (C0565a) this.f2441a.get(i);
            if (m2792b(aVar)) {
                aVar.f2460b.setOnStartEnterTransitionListener(fVar);
            }
        }
    }
}
