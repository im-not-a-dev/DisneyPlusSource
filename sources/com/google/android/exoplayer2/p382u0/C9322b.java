package com.google.android.exoplayer2.p382u0;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;

/* renamed from: com.google.android.exoplayer2.u0.b */
/* compiled from: Cue */
public class C9322b {

    /* renamed from: h0 */
    public static final C9322b f21345h0 = new C9322b("");

    /* renamed from: U */
    public final Alignment f21346U;

    /* renamed from: V */
    public final Bitmap f21347V;

    /* renamed from: W */
    public final float f21348W;

    /* renamed from: X */
    public final int f21349X;

    /* renamed from: Y */
    public final int f21350Y;

    /* renamed from: Z */
    public final float f21351Z;

    /* renamed from: a0 */
    public final int f21352a0;

    /* renamed from: b0 */
    public final float f21353b0;

    /* renamed from: c */
    public final CharSequence f21354c;

    /* renamed from: c0 */
    public final float f21355c0;

    /* renamed from: d0 */
    public final boolean f21356d0;

    /* renamed from: e0 */
    public final int f21357e0;

    /* renamed from: f0 */
    public final int f21358f0;

    /* renamed from: g0 */
    public final float f21359g0;

    public C9322b(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public C9322b(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C9322b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C9322b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public C9322b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    private C9322b(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f21354c = charSequence;
        this.f21346U = alignment;
        this.f21347V = bitmap;
        this.f21348W = f;
        this.f21349X = i;
        this.f21350Y = i2;
        this.f21351Z = f2;
        this.f21352a0 = i3;
        this.f21353b0 = f4;
        this.f21355c0 = f5;
        this.f21356d0 = z;
        this.f21357e0 = i5;
        this.f21358f0 = i4;
        this.f21359g0 = f3;
    }
}
