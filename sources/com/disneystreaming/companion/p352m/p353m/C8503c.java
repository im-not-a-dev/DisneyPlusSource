package com.disneystreaming.companion.p352m.p353m;

import com.disneystreaming.companion.configuration.C8446a;

/* renamed from: com.disneystreaming.companion.m.m.c */
/* compiled from: SocketConfiguration.kt */
public final class C8503c implements C8446a {

    /* renamed from: a */
    private final int f18082a;

    /* renamed from: b */
    private final int f18083b;

    /* renamed from: c */
    private final int f18084c;

    /* renamed from: d */
    private int f18085d;

    public C8503c() {
        this(0, 0, 0, 0, 15, null);
    }

    public C8503c(int i, int i2, int i3, int i4) {
        this.f18082a = i;
        this.f18083b = i2;
        this.f18084c = i3;
        this.f18085d = i4;
    }

    /* renamed from: a */
    public final int mo21798a() {
        return this.f18084c;
    }

    /* renamed from: b */
    public final int mo21799b() {
        return this.f18083b;
    }

    /* renamed from: c */
    public final int mo21800c() {
        return this.f18082a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8503c) {
                C8503c cVar = (C8503c) obj;
                if (this.f18082a == cVar.f18082a) {
                    if (this.f18083b == cVar.f18083b) {
                        if (this.f18084c == cVar.f18084c) {
                            if (this.f18085d == cVar.f18085d) {
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
        return (((((Integer.valueOf(this.f18082a).hashCode() * 31) + Integer.valueOf(this.f18083b).hashCode()) * 31) + Integer.valueOf(this.f18084c).hashCode()) * 31) + Integer.valueOf(this.f18085d).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SocketConfiguration(version=");
        sb.append(this.f18082a);
        sb.append(", udpPort=");
        sb.append(this.f18083b);
        sb.append(", tcpPort=");
        sb.append(this.f18084c);
        sb.append(", timeout=");
        sb.append(this.f18085d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C8503c(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i5 & 1) != 0) {
            i = 1;
        }
        if ((i5 & 2) != 0) {
            i2 = 4077;
        }
        if ((i5 & 4) != 0) {
            i3 = 4078;
        }
        if ((i5 & 8) != 0) {
            i4 = 3;
        }
        this(i, i2, i3, i4);
    }
}
