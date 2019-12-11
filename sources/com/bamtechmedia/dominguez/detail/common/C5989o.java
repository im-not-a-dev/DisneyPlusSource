package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.detail.common.o */
/* compiled from: Tab.kt */
public final class C5989o extends C6008x {

    /* renamed from: a */
    private final C3700c<C3626b> f13824a;

    /* renamed from: b */
    private final int f13825b;

    /* renamed from: c */
    private final String f13826c;

    /* renamed from: d */
    private final String f13827d;

    public /* synthetic */ C5989o(C3700c cVar, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        this(cVar, i, str, str2);
    }

    /* renamed from: b */
    public String mo18026b() {
        return this.f13827d;
    }

    /* renamed from: c */
    public String mo18027c() {
        return this.f13826c;
    }

    /* renamed from: d */
    public int mo18028d() {
        return this.f13825b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5989o) {
                C5989o oVar = (C5989o) obj;
                if (Intrinsics.areEqual((Object) m19184a(), (Object) oVar.m19184a())) {
                    if (!(mo18028d() == oVar.mo18028d()) || !Intrinsics.areEqual((Object) mo18027c(), (Object) oVar.mo18027c()) || !Intrinsics.areEqual((Object) mo18026b(), (Object) oVar.mo18026b())) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3700c a = m19184a();
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
        sb.append("PagedTab(contentList=");
        sb.append(m19184a());
        sb.append(", title=");
        sb.append(mo18028d());
        sb.append(", setContentClass=");
        sb.append(mo18027c());
        sb.append(", experimentToken=");
        sb.append(mo18026b());
        sb.append(")");
        return sb.toString();
    }

    public C5989o(C3700c<? extends C3626b> cVar, int i, String str, String str2) {
        super(null);
        this.f13824a = cVar;
        this.f13825b = i;
        this.f13826c = str;
        this.f13827d = str2;
    }

    /* renamed from: a */
    public C3700c<C3626b> m19184a() {
        return this.f13824a;
    }
}
