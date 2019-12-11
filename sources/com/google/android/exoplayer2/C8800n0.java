package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.n0 */
/* compiled from: RendererConfiguration */
public final class C8800n0 {

    /* renamed from: b */
    public static final C8800n0 f18680b = new C8800n0(0);

    /* renamed from: a */
    public final int f18681a;

    public C8800n0(int i) {
        this.f18681a = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8800n0.class != obj.getClass()) {
            return false;
        }
        if (this.f18681a != ((C8800n0) obj).f18681a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f18681a;
    }
}
