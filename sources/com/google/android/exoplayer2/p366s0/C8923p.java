package com.google.android.exoplayer2.p366s0;

/* renamed from: com.google.android.exoplayer2.s0.p */
/* compiled from: SeekPoint */
public final class C8923p {

    /* renamed from: c */
    public static final C8923p f19168c = new C8923p(0, 0);

    /* renamed from: a */
    public final long f19169a;

    /* renamed from: b */
    public final long f19170b;

    public C8923p(long j, long j2) {
        this.f19169a = j;
        this.f19170b = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8923p.class != obj.getClass()) {
            return false;
        }
        C8923p pVar = (C8923p) obj;
        if (!(this.f19169a == pVar.f19169a && this.f19170b == pVar.f19170b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.f19169a) * 31) + ((int) this.f19170b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[timeUs=");
        sb.append(this.f19169a);
        sb.append(", position=");
        sb.append(this.f19170b);
        sb.append("]");
        return sb.toString();
    }
}
