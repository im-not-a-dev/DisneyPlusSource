package com.bumptech.glide.load.p341p.p342c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.C8258v;
import java.security.MessageDigest;
import p163g.p413f.p414a.C10652e;

/* renamed from: com.bumptech.glide.load.p.c.m */
/* compiled from: DrawableTransformation */
public class C8376m implements C8118l<Drawable> {

    /* renamed from: b */
    private final C8118l<Bitmap> f17866b;

    /* renamed from: c */
    private final boolean f17867c;

    public C8376m(C8118l<Bitmap> lVar, boolean z) {
        this.f17866b = lVar;
        this.f17867c = z;
    }

    /* renamed from: a */
    public C8118l<BitmapDrawable> mo21544a() {
        return this;
    }

    /* renamed from: a */
    public C8258v<Drawable> mo21168a(Context context, C8258v<Drawable> vVar, int i, int i2) {
        Drawable drawable = (Drawable) vVar.get();
        C8258v a = C8374l.m24344a(C10652e.m33418b(context).mo27523c(), drawable, i, i2);
        if (a != null) {
            C8258v a2 = this.f17866b.mo21168a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m24347a(context, a2);
            }
            a2.mo21407a();
            return vVar;
        } else if (!this.f17867c) {
            return vVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8376m)) {
            return false;
        }
        return this.f17866b.equals(((C8376m) obj).f17866b);
    }

    public int hashCode() {
        return this.f17866b.hashCode();
    }

    /* renamed from: a */
    private C8258v<Drawable> m24347a(Context context, C8258v<Bitmap> vVar) {
        return C8380q.m24359a(context.getResources(), vVar);
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        this.f17866b.mo21152a(messageDigest);
    }
}
