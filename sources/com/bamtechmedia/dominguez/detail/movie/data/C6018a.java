package com.bamtechmedia.dominguez.detail.movie.data;

import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.detail.movie.data.a */
/* compiled from: DetailAnalyticsInfo.kt */
public final class C6018a {

    /* renamed from: a */
    private final int f13871a;

    /* renamed from: b */
    private final String f13872b;

    /* renamed from: c */
    private final int f13873c;

    public C6018a(int i, String str, int i2) {
        this.f13871a = i;
        this.f13872b = str;
        this.f13873c = i2;
    }

    /* renamed from: a */
    public final int mo18076a() {
        return this.f13871a;
    }

    /* renamed from: b */
    public final String mo18077b() {
        return this.f13872b;
    }

    /* renamed from: c */
    public final int mo18078c() {
        return this.f13873c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6018a) {
                C6018a aVar = (C6018a) obj;
                if ((this.f13871a == aVar.f13871a) && C12880j.m40224a((Object) this.f13872b, (Object) aVar.f13872b)) {
                    if (this.f13873c == aVar.f13873c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f13871a * 31;
        String str = this.f13872b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f13873c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetailAnalyticsInfo(itemPosition=");
        sb.append(this.f13871a);
        sb.append(", tabName=");
        sb.append(this.f13872b);
        sb.append(", tabPosition=");
        sb.append(this.f13873c);
        sb.append(")");
        return sb.toString();
    }
}
