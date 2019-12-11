package com.google.android.exoplayer2.p361p0;

/* renamed from: com.google.android.exoplayer2.p0.r */
/* compiled from: AuxEffectInfo */
public final class C8853r {

    /* renamed from: a */
    public final int f18886a;

    /* renamed from: b */
    public final float f18887b;

    public C8853r(int i, float f) {
        this.f18886a = i;
        this.f18887b = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8853r.class != obj.getClass()) {
            return false;
        }
        C8853r rVar = (C8853r) obj;
        if (!(this.f18886a == rVar.f18886a && Float.compare(rVar.f18887b, this.f18887b) == 0)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f18886a) * 31) + Float.floatToIntBits(this.f18887b);
    }
}
