package com.google.firebase.components;

import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.firebase.components.n */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class C10447n {

    /* renamed from: a */
    private final Class<?> f24778a;

    /* renamed from: b */
    private final int f24779b;

    /* renamed from: c */
    private final int f24780c;

    private C10447n(Class<?> cls, int i, int i2) {
        C9908u.m30854a(cls, (Object) "Null dependency anInterface.");
        this.f24778a = cls;
        this.f24779b = i;
        this.f24780c = i2;
    }

    /* renamed from: a */
    public static C10447n m33011a(Class<?> cls) {
        return new C10447n(cls, 1, 0);
    }

    /* renamed from: b */
    public static C10447n m33012b(Class<?> cls) {
        return new C10447n(cls, 2, 0);
    }

    /* renamed from: c */
    public boolean mo27251c() {
        return this.f24779b == 1;
    }

    /* renamed from: d */
    public boolean mo27252d() {
        return this.f24779b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10447n)) {
            return false;
        }
        C10447n nVar = (C10447n) obj;
        if (this.f24778a == nVar.f24778a && this.f24779b == nVar.f24779b && this.f24780c == nVar.f24780c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24778a.hashCode() ^ 1000003) * 1000003) ^ this.f24779b) * 1000003) ^ this.f24780c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f24778a);
        sb.append(", type=");
        int i = this.f24779b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        sb.append(str);
        sb.append(", direct=");
        if (this.f24780c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public Class<?> mo27249a() {
        return this.f24778a;
    }

    /* renamed from: b */
    public boolean mo27250b() {
        return this.f24780c == 0;
    }
}
