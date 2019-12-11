package androidx.fragment.app;

import androidx.lifecycle.C0715i.C0717b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.o */
/* compiled from: FragmentTransaction */
public abstract class C0564o {

    /* renamed from: a */
    ArrayList<C0565a> f2441a = new ArrayList<>();

    /* renamed from: b */
    int f2442b;

    /* renamed from: c */
    int f2443c;

    /* renamed from: d */
    int f2444d;

    /* renamed from: e */
    int f2445e;

    /* renamed from: f */
    int f2446f;

    /* renamed from: g */
    int f2447g;

    /* renamed from: h */
    boolean f2448h;

    /* renamed from: i */
    boolean f2449i = true;

    /* renamed from: j */
    String f2450j;

    /* renamed from: k */
    int f2451k;

    /* renamed from: l */
    CharSequence f2452l;

    /* renamed from: m */
    int f2453m;

    /* renamed from: n */
    CharSequence f2454n;

    /* renamed from: o */
    ArrayList<String> f2455o;

    /* renamed from: p */
    ArrayList<String> f2456p;

    /* renamed from: q */
    boolean f2457q = false;

    /* renamed from: r */
    ArrayList<Runnable> f2458r;

    /* renamed from: androidx.fragment.app.o$a */
    /* compiled from: FragmentTransaction */
    static final class C0565a {

        /* renamed from: a */
        int f2459a;

        /* renamed from: b */
        Fragment f2460b;

        /* renamed from: c */
        int f2461c;

        /* renamed from: d */
        int f2462d;

        /* renamed from: e */
        int f2463e;

        /* renamed from: f */
        int f2464f;

        /* renamed from: g */
        C0717b f2465g;

        /* renamed from: h */
        C0717b f2466h;

        C0565a() {
        }

        C0565a(int i, Fragment fragment) {
            this.f2459a = i;
            this.f2460b = fragment;
            C0717b bVar = C0717b.RESUMED;
            this.f2465g = bVar;
            this.f2466h = bVar;
        }

        C0565a(int i, Fragment fragment, C0717b bVar) {
            this.f2459a = i;
            this.f2460b = fragment;
            this.f2465g = fragment.mMaxState;
            this.f2466h = bVar;
        }
    }

    /* renamed from: a */
    public abstract int mo3030a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3317a(C0565a aVar) {
        this.f2441a.add(aVar);
        aVar.f2461c = this.f2442b;
        aVar.f2462d = this.f2443c;
        aVar.f2463e = this.f2444d;
        aVar.f2464f = this.f2445e;
    }

    /* renamed from: b */
    public abstract int mo3040b();

    /* renamed from: b */
    public C0564o mo3318b(int i, Fragment fragment) {
        mo3319b(i, fragment, null);
        return this;
    }

    /* renamed from: c */
    public C0564o mo3045c(Fragment fragment) {
        mo3317a(new C0565a(3, fragment));
        return this;
    }

    /* renamed from: c */
    public abstract void mo3046c();

    /* renamed from: d */
    public C0564o mo3048d(Fragment fragment) {
        mo3317a(new C0565a(8, fragment));
        return this;
    }

    /* renamed from: d */
    public abstract void mo3049d();

    /* renamed from: e */
    public C0564o mo3320e() {
        if (!this.f2448h) {
            this.f2449i = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: b */
    public C0564o mo3319b(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3034a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0564o mo3043b(Fragment fragment) {
        mo3317a(new C0565a(6, fragment));
        return this;
    }

    /* renamed from: a */
    public C0564o mo3314a(Fragment fragment, String str) {
        mo3034a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0564o mo3311a(int i, Fragment fragment) {
        mo3034a(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0564o mo3312a(int i, Fragment fragment, String str) {
        mo3034a(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3034a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.mTag;
            if (str4 == null || str.equals(str4)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.mTag);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.mFragmentId);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo3317a(new C0565a(i2, fragment));
    }

    /* renamed from: a */
    public C0564o mo3313a(Fragment fragment) {
        mo3317a(new C0565a(7, fragment));
        return this;
    }

    /* renamed from: a */
    public C0564o mo3032a(Fragment fragment, C0717b bVar) {
        mo3317a(new C0565a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public C0564o mo3310a(int i, int i2, int i3, int i4) {
        this.f2442b = i;
        this.f2443c = i2;
        this.f2444d = i3;
        this.f2445e = i4;
        return this;
    }

    /* renamed from: a */
    public C0564o mo3315a(String str) {
        if (this.f2449i) {
            this.f2448h = true;
            this.f2450j = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: a */
    public C0564o mo3316a(boolean z) {
        this.f2457q = z;
        return this;
    }
}
