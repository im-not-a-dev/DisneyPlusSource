package com.bamtechmedia.dominguez.core.p218n;

/* renamed from: com.bamtechmedia.dominguez.core.n.e */
/* compiled from: FragmentTransitionAnimations.kt */
public final class C5791e {

    /* renamed from: a */
    private final int f13561a;

    /* renamed from: b */
    private final int f13562b;

    /* renamed from: c */
    private final int f13563c;

    /* renamed from: d */
    private final int f13564d;

    public C5791e(int i, int i2, int i3, int i4) {
        this.f13561a = i;
        this.f13562b = i2;
        this.f13563c = i3;
        this.f13564d = i4;
    }

    /* renamed from: a */
    public final int mo17688a() {
        return this.f13561a;
    }

    /* renamed from: b */
    public final int mo17689b() {
        return this.f13562b;
    }

    /* renamed from: c */
    public final int mo17690c() {
        return this.f13563c;
    }

    /* renamed from: d */
    public final int mo17691d() {
        return this.f13564d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5791e) {
                C5791e eVar = (C5791e) obj;
                if (this.f13561a == eVar.f13561a) {
                    if (this.f13562b == eVar.f13562b) {
                        if (this.f13563c == eVar.f13563c) {
                            if (this.f13564d == eVar.f13564d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f13561a * 31) + this.f13562b) * 31) + this.f13563c) * 31) + this.f13564d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FragmentTransitionAnimations(enter=");
        sb.append(this.f13561a);
        sb.append(", exit=");
        sb.append(this.f13562b);
        sb.append(", popEnter=");
        sb.append(this.f13563c);
        sb.append(", popExit=");
        sb.append(this.f13564d);
        sb.append(")");
        return sb.toString();
    }
}
