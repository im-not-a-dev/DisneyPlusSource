package p163g.p449j.p450a.p468b.p477s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p096e.p121h.p122j.p124d.C4039f;
import p096e.p121h.p122j.p124d.C4039f.C4040a;
import p163g.p449j.p450a.p468b.C11467k;

/* renamed from: g.j.a.b.s.b */
/* compiled from: TextAppearance */
public class C11500b {

    /* renamed from: a */
    public final float f26879a;

    /* renamed from: b */
    public final ColorStateList f26880b;

    /* renamed from: c */
    public final int f26881c;

    /* renamed from: d */
    public final int f26882d;

    /* renamed from: e */
    public final String f26883e;

    /* renamed from: f */
    public final ColorStateList f26884f;

    /* renamed from: g */
    public final float f26885g;

    /* renamed from: h */
    public final float f26886h;

    /* renamed from: i */
    public final float f26887i;

    /* renamed from: j */
    private final int f26888j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f26889k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Typeface f26890l;

    /* renamed from: g.j.a.b.s.b$a */
    /* compiled from: TextAppearance */
    class C11501a extends C4040a {

        /* renamed from: a */
        final /* synthetic */ TextPaint f26891a;

        /* renamed from: b */
        final /* synthetic */ C4040a f26892b;

        C11501a(TextPaint textPaint, C4040a aVar) {
            this.f26891a = textPaint;
            this.f26892b = aVar;
        }

        /* renamed from: a */
        public void mo1957a(Typeface typeface) {
            C11500b bVar = C11500b.this;
            bVar.f26890l = Typeface.create(typeface, bVar.f26881c);
            C11500b.this.mo29416a(this.f26891a, typeface);
            C11500b.this.f26889k = true;
            this.f26892b.mo1957a(typeface);
        }

        /* renamed from: a */
        public void mo1956a(int i) {
            C11500b.this.m37091a();
            C11500b.this.f26889k = true;
            this.f26892b.mo1956a(i);
        }
    }

    public C11500b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C11467k.TextAppearance);
        this.f26879a = obtainStyledAttributes.getDimension(C11467k.TextAppearance_android_textSize, 0.0f);
        this.f26880b = C11499a.m37087a(context, obtainStyledAttributes, C11467k.TextAppearance_android_textColor);
        C11499a.m37087a(context, obtainStyledAttributes, C11467k.TextAppearance_android_textColorHint);
        C11499a.m37087a(context, obtainStyledAttributes, C11467k.TextAppearance_android_textColorLink);
        this.f26881c = obtainStyledAttributes.getInt(C11467k.TextAppearance_android_textStyle, 0);
        this.f26882d = obtainStyledAttributes.getInt(C11467k.TextAppearance_android_typeface, 1);
        int a = C11499a.m37086a(obtainStyledAttributes, C11467k.TextAppearance_fontFamily, C11467k.TextAppearance_android_fontFamily);
        this.f26888j = obtainStyledAttributes.getResourceId(a, 0);
        this.f26883e = obtainStyledAttributes.getString(a);
        obtainStyledAttributes.getBoolean(C11467k.TextAppearance_textAllCaps, false);
        this.f26884f = C11499a.m37087a(context, obtainStyledAttributes, C11467k.TextAppearance_android_shadowColor);
        this.f26885g = obtainStyledAttributes.getFloat(C11467k.TextAppearance_android_shadowDx, 0.0f);
        this.f26886h = obtainStyledAttributes.getFloat(C11467k.TextAppearance_android_shadowDy, 0.0f);
        this.f26887i = obtainStyledAttributes.getFloat(C11467k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void mo29417b(Context context, TextPaint textPaint, C4040a aVar) {
        mo29418c(context, textPaint, aVar);
        ColorStateList colorStateList = this.f26880b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f26887i;
        float f2 = this.f26885g;
        float f3 = this.f26886h;
        ColorStateList colorStateList2 = this.f26884f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: c */
    public void mo29418c(Context context, TextPaint textPaint, C4040a aVar) {
        if (C11502c.m37101a()) {
            mo29416a(textPaint, mo29414a(context));
            return;
        }
        mo29415a(context, textPaint, aVar);
        if (!this.f26889k) {
            mo29416a(textPaint, this.f26890l);
        }
    }

    /* renamed from: a */
    public Typeface mo29414a(Context context) {
        if (this.f26889k) {
            return this.f26890l;
        }
        if (!context.isRestricted()) {
            try {
                this.f26890l = C4039f.m13847a(context, this.f26888j);
                if (this.f26890l != null) {
                    this.f26890l = Typeface.create(this.f26890l, this.f26881c);
                }
            } catch (NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f26883e);
                Log.d("TextAppearance", sb.toString(), e);
            }
        }
        m37091a();
        this.f26889k = true;
        return this.f26890l;
    }

    /* renamed from: a */
    public void mo29415a(Context context, TextPaint textPaint, C4040a aVar) {
        if (this.f26889k) {
            mo29416a(textPaint, this.f26890l);
            return;
        }
        m37091a();
        if (context.isRestricted()) {
            this.f26889k = true;
            mo29416a(textPaint, this.f26890l);
            return;
        }
        try {
            C4039f.m13852a(context, this.f26888j, new C11501a(textPaint, aVar), null);
        } catch (NotFoundException | UnsupportedOperationException unused) {
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f26883e);
            Log.d("TextAppearance", sb.toString(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m37091a() {
        if (this.f26890l == null) {
            this.f26890l = Typeface.create(this.f26883e, this.f26881c);
        }
        if (this.f26890l == null) {
            int i = this.f26882d;
            if (i == 1) {
                this.f26890l = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f26890l = Typeface.SERIF;
            } else if (i != 3) {
                this.f26890l = Typeface.DEFAULT;
            } else {
                this.f26890l = Typeface.MONOSPACE;
            }
            Typeface typeface = this.f26890l;
            if (typeface != null) {
                this.f26890l = Typeface.create(typeface, this.f26881c);
            }
        }
    }

    /* renamed from: a */
    public void mo29416a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f26881c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f26879a);
    }
}
