package com.google.android.exoplayer2.p382u0;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.u0.a */
/* compiled from: CaptionStyleCompat */
public final class C9321a {

    /* renamed from: g */
    public static final C9321a f21338g;

    /* renamed from: a */
    public final int f21339a;

    /* renamed from: b */
    public final int f21340b;

    /* renamed from: c */
    public final int f21341c;

    /* renamed from: d */
    public final int f21342d;

    /* renamed from: e */
    public final int f21343e;

    /* renamed from: f */
    public final Typeface f21344f;

    static {
        C9321a aVar = new C9321a(-1, -16777216, 0, 0, -1, null);
        f21338g = aVar;
    }

    public C9321a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f21339a = i;
        this.f21340b = i2;
        this.f21341c = i3;
        this.f21342d = i4;
        this.f21343e = i5;
        this.f21344f = typeface;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C9321a m28344a(CaptionStyle captionStyle) {
        if (C9554k0.f22281a >= 21) {
            return m28346c(captionStyle);
        }
        return m28345b(captionStyle);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static C9321a m28345b(CaptionStyle captionStyle) {
        C9321a aVar = new C9321a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
        return aVar;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static C9321a m28346c(CaptionStyle captionStyle) {
        C9321a aVar = new C9321a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f21338g.f21339a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f21338g.f21340b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f21338g.f21341c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f21338g.f21342d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f21338g.f21343e, captionStyle.getTypeface());
        return aVar;
    }
}
