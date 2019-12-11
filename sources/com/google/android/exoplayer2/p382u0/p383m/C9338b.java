package com.google.android.exoplayer2.p382u0.p383m;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p382u0.C9322b;

/* renamed from: com.google.android.exoplayer2.u0.m.b */
/* compiled from: Cea708Cue */
final class C9338b extends C9322b implements Comparable<C9338b> {

    /* renamed from: i0 */
    public final int f21413i0;

    public C9338b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f21413i0 = i5;
    }

    /* renamed from: a */
    public int compareTo(C9338b bVar) {
        int i = bVar.f21413i0;
        int i2 = this.f21413i0;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
