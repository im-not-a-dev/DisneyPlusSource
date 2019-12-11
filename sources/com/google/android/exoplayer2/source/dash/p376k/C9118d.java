package com.google.android.exoplayer2.source.dash.p376k;

import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.source.dash.k.d */
/* compiled from: Descriptor */
public final class C9118d {

    /* renamed from: a */
    public final String f20446a;

    /* renamed from: b */
    public final String f20447b;

    /* renamed from: c */
    public final String f20448c;

    public C9118d(String str, String str2, String str3) {
        this.f20446a = str;
        this.f20447b = str2;
        this.f20448c = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9118d.class != obj.getClass()) {
            return false;
        }
        C9118d dVar = (C9118d) obj;
        if (!C9554k0.m29414a((Object) this.f20446a, (Object) dVar.f20446a) || !C9554k0.m29414a((Object) this.f20447b, (Object) dVar.f20447b) || !C9554k0.m29414a((Object) this.f20448c, (Object) dVar.f20448c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f20446a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20447b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20448c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
