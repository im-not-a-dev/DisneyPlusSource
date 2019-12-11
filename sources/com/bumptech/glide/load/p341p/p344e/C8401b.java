package com.bumptech.glide.load.p341p.p344e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.p334n.C8253r;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p341p.p346g.C8412c;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.e.b */
/* compiled from: DrawableResource */
public abstract class C8401b<T extends Drawable> implements C8258v<T>, C8253r {

    /* renamed from: c */
    protected final T f17903c;

    public C8401b(T t) {
        C10774j.m34012a(t);
        this.f17903c = (Drawable) t;
    }

    public void initialize() {
        T t = this.f17903c;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C8412c) {
            ((C8412c) t).mo21598c().prepareToDraw();
        }
    }

    public final T get() {
        ConstantState constantState = this.f17903c.getConstantState();
        if (constantState == null) {
            return this.f17903c;
        }
        return constantState.newDrawable();
    }
}
