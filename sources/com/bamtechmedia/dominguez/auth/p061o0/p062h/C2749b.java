package com.bamtechmedia.dominguez.auth.p061o0.p062h;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.auth.o0.h.b */
/* compiled from: PasswordStrength.kt */
public final class C2749b {

    /* renamed from: a */
    private final int f7494a;

    /* renamed from: b */
    private final int f7495b;

    /* renamed from: c */
    private final String f7496c;

    public C2749b() {
        this(0, 0, null, 7, null);
    }

    public C2749b(int i, int i2, String str) {
        this.f7494a = i;
        this.f7495b = i2;
        this.f7496c = str;
    }

    /* renamed from: a */
    public final int mo11756a() {
        return this.f7495b;
    }

    /* renamed from: b */
    public final int mo11757b() {
        return this.f7494a;
    }

    /* renamed from: c */
    public final String mo11758c() {
        return this.f7496c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2749b) {
                C2749b bVar = (C2749b) obj;
                if (this.f7494a == bVar.f7494a) {
                    if (!(this.f7495b == bVar.f7495b) || !Intrinsics.areEqual((Object) this.f7496c, (Object) bVar.f7496c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.f7494a * 31) + this.f7495b) * 31;
        String str = this.f7496c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PasswordStrength(percent=");
        sb.append(this.f7494a);
        sb.append(", color=");
        sb.append(this.f7495b);
        sb.append(", text=");
        sb.append(this.f7496c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2749b(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        this(i, i2, str);
    }
}
