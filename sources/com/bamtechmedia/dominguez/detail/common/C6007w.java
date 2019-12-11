package com.bamtechmedia.dominguez.detail.common;

import java.util.List;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11847b;

/* renamed from: com.bamtechmedia.dominguez.detail.common.w */
/* compiled from: Tab.kt */
public final class C6007w extends C6008x {

    /* renamed from: a */
    private final List<C11847b> f13849a;

    /* renamed from: b */
    private final int f13850b;

    /* renamed from: c */
    private final String f13851c;

    /* renamed from: d */
    private final String f13852d;

    public /* synthetic */ C6007w(List list, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        this(list, i, str, str2);
    }

    /* renamed from: a */
    public List<C11847b> mo18025a() {
        return this.f13849a;
    }

    /* renamed from: b */
    public String mo18026b() {
        return this.f13852d;
    }

    /* renamed from: c */
    public String mo18027c() {
        return this.f13851c;
    }

    /* renamed from: d */
    public int mo18028d() {
        return this.f13850b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6007w) {
                C6007w wVar = (C6007w) obj;
                if (C12880j.m40224a((Object) mo18025a(), (Object) wVar.mo18025a())) {
                    if (!(mo18028d() == wVar.mo18028d()) || !C12880j.m40224a((Object) mo18027c(), (Object) wVar.mo18027c()) || !C12880j.m40224a((Object) mo18026b(), (Object) wVar.mo18026b())) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List a = mo18025a();
        int i = 0;
        int hashCode = (((a != null ? a.hashCode() : 0) * 31) + mo18028d()) * 31;
        String c = mo18027c();
        int hashCode2 = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
        String b = mo18026b();
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleTab(contentList=");
        sb.append(mo18025a());
        sb.append(", title=");
        sb.append(mo18028d());
        sb.append(", setContentClass=");
        sb.append(mo18027c());
        sb.append(", experimentToken=");
        sb.append(mo18026b());
        sb.append(")");
        return sb.toString();
    }

    public C6007w(List<? extends C11847b> list, int i, String str, String str2) {
        super(null);
        this.f13849a = list;
        this.f13850b = i;
        this.f13851c = str;
        this.f13852d = str2;
    }
}
