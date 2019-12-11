package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p122j.p124d.C4039f;
import p096e.p121h.p122j.p124d.C4039f.C4040a;

/* renamed from: androidx.appcompat.widget.t0 */
/* compiled from: TintTypedArray */
public class C0284t0 {

    /* renamed from: a */
    private final Context f1239a;

    /* renamed from: b */
    private final TypedArray f1240b;

    /* renamed from: c */
    private TypedValue f1241c;

    private C0284t0(Context context, TypedArray typedArray) {
        this.f1239a = context;
        this.f1240b = typedArray;
    }

    /* renamed from: a */
    public static C0284t0 m1485a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0284t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: b */
    public Drawable mo1912b(int i) {
        if (this.f1240b.hasValue(i)) {
            int resourceId = this.f1240b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C3868a.m12946c(this.f1239a, resourceId);
            }
        }
        return this.f1240b.getDrawable(i);
    }

    /* renamed from: c */
    public Drawable mo1914c(int i) {
        if (this.f1240b.hasValue(i)) {
            int resourceId = this.f1240b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0235h.m1313b().mo1668a(this.f1239a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public String mo1916d(int i) {
        return this.f1240b.getString(i);
    }

    /* renamed from: e */
    public CharSequence mo1918e(int i) {
        return this.f1240b.getText(i);
    }

    /* renamed from: f */
    public int mo1919f(int i, int i2) {
        return this.f1240b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo1921g(int i, int i2) {
        return this.f1240b.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static C0284t0 m1486a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0284t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: d */
    public int mo1915d(int i, int i2) {
        return this.f1240b.getInt(i, i2);
    }

    /* renamed from: e */
    public int mo1917e(int i, int i2) {
        return this.f1240b.getInteger(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo1920f(int i) {
        return this.f1240b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo1922g(int i) {
        return this.f1240b.hasValue(i);
    }

    /* renamed from: a */
    public static C0284t0 m1484a(Context context, int i, int[] iArr) {
        return new C0284t0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: c */
    public int mo1913c(int i, int i2) {
        return this.f1240b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: a */
    public Typeface mo1907a(int i, int i2, C4040a aVar) {
        int resourceId = this.f1240b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1241c == null) {
            this.f1241c = new TypedValue();
        }
        return C4039f.m13848a(this.f1239a, resourceId, this.f1241c, i2, aVar);
    }

    /* renamed from: b */
    public float mo1910b(int i, float f) {
        return this.f1240b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo1911b(int i, int i2) {
        return this.f1240b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: a */
    public boolean mo1909a(int i, boolean z) {
        return this.f1240b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo1905a(int i, int i2) {
        return this.f1240b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo1906a(int i) {
        if (this.f1240b.hasValue(i)) {
            int resourceId = this.f1240b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C3868a.m12945b(this.f1239a, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return this.f1240b.getColorStateList(i);
    }

    /* renamed from: a */
    public float mo1904a(int i, float f) {
        return this.f1240b.getDimension(i, f);
    }

    /* renamed from: a */
    public void mo1908a() {
        this.f1240b.recycle();
    }
}
