package com.google.android.exoplayer2.source.dash.p376k;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9549j0;

/* renamed from: com.google.android.exoplayer2.source.dash.k.h */
/* compiled from: RangedUri */
public final class C9122h {

    /* renamed from: a */
    public final long f20462a;

    /* renamed from: b */
    public final long f20463b;

    /* renamed from: c */
    private final String f20464c;

    /* renamed from: d */
    private int f20465d;

    public C9122h(String str, long j, long j2) {
        if (str == null) {
            str = "";
        }
        this.f20464c = str;
        this.f20462a = j;
        this.f20463b = j2;
    }

    /* renamed from: a */
    public Uri mo23724a(String str) {
        return C9549j0.m29368b(str, this.f20464c);
    }

    /* renamed from: b */
    public String mo23726b(String str) {
        return C9549j0.m29365a(str, this.f20464c);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9122h.class != obj.getClass()) {
            return false;
        }
        C9122h hVar = (C9122h) obj;
        if (!(this.f20462a == hVar.f20462a && this.f20463b == hVar.f20463b && this.f20464c.equals(hVar.f20464c))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f20465d == 0) {
            this.f20465d = ((((527 + ((int) this.f20462a)) * 31) + ((int) this.f20463b)) * 31) + this.f20464c.hashCode();
        }
        return this.f20465d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RangedUri(referenceUri=");
        sb.append(this.f20464c);
        sb.append(", start=");
        sb.append(this.f20462a);
        sb.append(", length=");
        sb.append(this.f20463b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public C9122h mo23725a(C9122h hVar, String str) {
        String b = mo23726b(str);
        if (hVar != null && b.equals(hVar.mo23726b(str))) {
            long j = this.f20463b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f20462a;
                if (j3 + j == hVar.f20462a) {
                    long j4 = hVar.f20463b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    C9122h hVar2 = new C9122h(b, j3, j2);
                    return hVar2;
                }
            }
            long j5 = hVar.f20463b;
            if (j5 != -1) {
                long j6 = hVar.f20462a;
                if (j6 + j5 == this.f20462a) {
                    long j7 = this.f20463b;
                    if (j7 != -1) {
                        j2 = j5 + j7;
                    }
                    C9122h hVar3 = new C9122h(b, j6, j2);
                    return hVar3;
                }
            }
        }
        return null;
    }
}
