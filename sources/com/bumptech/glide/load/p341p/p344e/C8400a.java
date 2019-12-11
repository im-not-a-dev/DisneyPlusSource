package com.bumptech.glide.load.p341p.p344e;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p097a.p104o.C3892d;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p122j.p124d.C4039f;

/* renamed from: com.bumptech.glide.load.p.e.a */
/* compiled from: DrawableDecoderCompat */
public final class C8400a {

    /* renamed from: a */
    private static volatile boolean f17902a = true;

    /* renamed from: a */
    public static Drawable m24419a(Context context, Context context2, int i) {
        return m24420a(context, context2, i, null);
    }

    /* renamed from: b */
    private static Drawable m24421b(Context context, int i, Theme theme) {
        return C4039f.m13851a(context.getResources(), i, theme);
    }

    /* renamed from: c */
    private static Drawable m24422c(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new C3892d(context, theme);
        }
        return C3868a.m12946c(context, i);
    }

    /* renamed from: a */
    public static Drawable m24418a(Context context, int i, Theme theme) {
        return m24420a(context, context, i, theme);
    }

    /* renamed from: a */
    private static Drawable m24420a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f17902a) {
                return m24422c(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f17902a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C4025a.m13798c(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m24421b(context2, i, theme);
    }
}
