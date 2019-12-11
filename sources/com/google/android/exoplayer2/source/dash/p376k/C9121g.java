package com.google.android.exoplayer2.source.dash.p376k;

import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.source.dash.k.g */
/* compiled from: ProgramInformation */
public class C9121g {

    /* renamed from: a */
    public final String f20457a;

    /* renamed from: b */
    public final String f20458b;

    /* renamed from: c */
    public final String f20459c;

    /* renamed from: d */
    public final String f20460d;

    /* renamed from: e */
    public final String f20461e;

    public C9121g(String str, String str2, String str3, String str4, String str5) {
        this.f20457a = str;
        this.f20458b = str2;
        this.f20459c = str3;
        this.f20460d = str4;
        this.f20461e = str5;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9121g.class != obj.getClass()) {
            return false;
        }
        C9121g gVar = (C9121g) obj;
        if (!C9554k0.m29414a((Object) this.f20457a, (Object) gVar.f20457a) || !C9554k0.m29414a((Object) this.f20458b, (Object) gVar.f20458b) || !C9554k0.m29414a((Object) this.f20459c, (Object) gVar.f20459c) || !C9554k0.m29414a((Object) this.f20460d, (Object) gVar.f20460d) || !C9554k0.m29414a((Object) this.f20461e, (Object) gVar.f20461e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f20457a;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20458b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20459c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f20460d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f20461e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
