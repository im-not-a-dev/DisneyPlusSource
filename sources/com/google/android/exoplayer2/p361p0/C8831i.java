package com.google.android.exoplayer2.p361p0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

/* renamed from: com.google.android.exoplayer2.p0.i */
/* compiled from: AudioAttributes */
public final class C8831i {

    /* renamed from: e */
    public static final C8831i f18825e = new C8833b().mo23082a();

    /* renamed from: a */
    public final int f18826a;

    /* renamed from: b */
    public final int f18827b;

    /* renamed from: c */
    public final int f18828c;

    /* renamed from: d */
    private AudioAttributes f18829d;

    /* renamed from: com.google.android.exoplayer2.p0.i$b */
    /* compiled from: AudioAttributes */
    public static final class C8833b {

        /* renamed from: a */
        private int f18830a = 0;

        /* renamed from: b */
        private int f18831b = 0;

        /* renamed from: c */
        private int f18832c = 1;

        /* renamed from: a */
        public C8831i mo23082a() {
            return new C8831i(this.f18830a, this.f18831b, this.f18832c);
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public AudioAttributes mo23079a() {
        if (this.f18829d == null) {
            this.f18829d = new Builder().setContentType(this.f18826a).setFlags(this.f18827b).setUsage(this.f18828c).build();
        }
        return this.f18829d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8831i.class != obj.getClass()) {
            return false;
        }
        C8831i iVar = (C8831i) obj;
        if (!(this.f18826a == iVar.f18826a && this.f18827b == iVar.f18827b && this.f18828c == iVar.f18828c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + this.f18826a) * 31) + this.f18827b) * 31) + this.f18828c;
    }

    private C8831i(int i, int i2, int i3) {
        this.f18826a = i;
        this.f18827b = i2;
        this.f18828c = i3;
    }
}
