package p163g.p449j.p450a.p468b.p470m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0513i;
import com.google.android.material.internal.C10320g;
import com.google.android.material.internal.C10321h;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11466j;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p477s.C11499a;

/* renamed from: g.j.a.b.m.a */
/* compiled from: MaterialButton */
public class C11478a extends AppCompatButton {

    /* renamed from: V */
    private final C11480c f26837V;

    /* renamed from: W */
    private int f26838W;

    /* renamed from: a0 */
    private Mode f26839a0;

    /* renamed from: b0 */
    private ColorStateList f26840b0;

    /* renamed from: c0 */
    private Drawable f26841c0;

    /* renamed from: d0 */
    private int f26842d0;

    /* renamed from: e0 */
    private int f26843e0;

    /* renamed from: f0 */
    private int f26844f0;

    public C11478a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11458b.materialButtonStyle);
    }

    /* renamed from: a */
    private boolean m37022a() {
        return C4187x.m14399n(this) == 1;
    }

    /* renamed from: b */
    private boolean m37023b() {
        C11480c cVar = this.f26837V;
        return cVar != null && !cVar.mo29371g();
    }

    /* renamed from: c */
    private void m37024c() {
        Drawable drawable = this.f26841c0;
        if (drawable != null) {
            this.f26841c0 = drawable.mutate();
            C0492a.m2637a(this.f26841c0, this.f26840b0);
            Mode mode = this.f26839a0;
            if (mode != null) {
                C0492a.m2640a(this.f26841c0, mode);
            }
            int i = this.f26842d0;
            if (i == 0) {
                i = this.f26841c0.getIntrinsicWidth();
            }
            int i2 = this.f26842d0;
            if (i2 == 0) {
                i2 = this.f26841c0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f26841c0;
            int i3 = this.f26843e0;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0513i.m2769a(this, this.f26841c0, null, null, null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m37023b()) {
            return this.f26837V.mo29355a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f26841c0;
    }

    public int getIconGravity() {
        return this.f26844f0;
    }

    public int getIconPadding() {
        return this.f26838W;
    }

    public int getIconSize() {
        return this.f26842d0;
    }

    public ColorStateList getIconTint() {
        return this.f26840b0;
    }

    public Mode getIconTintMode() {
        return this.f26839a0;
    }

    public ColorStateList getRippleColor() {
        if (m37023b()) {
            return this.f26837V.mo29362b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m37023b()) {
            return this.f26837V.mo29365c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m37023b()) {
            return this.f26837V.mo29368d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m37023b()) {
            return this.f26837V.mo29369e();
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (m37023b()) {
            return this.f26837V.mo29370f();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && m37023b()) {
            this.f26837V.mo29360a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            C11480c cVar = this.f26837V;
            if (cVar != null) {
                cVar.mo29357a(i4 - i2, i3 - i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f26841c0 != null && this.f26844f0 == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f26842d0;
            if (i3 == 0) {
                i3 = this.f26841c0.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C4187x.m14402q(this)) - i3) - this.f26838W) - C4187x.m14403r(this)) / 2;
            if (m37022a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f26843e0 != measuredWidth) {
                this.f26843e0 = measuredWidth;
                m37024c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m37023b()) {
            this.f26837V.mo29356a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m37023b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f26837V.mo29372h();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C3868a.m12946c(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i) {
        if (m37023b()) {
            this.f26837V.mo29363b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m37023b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f26841c0 != drawable) {
            this.f26841c0 = drawable;
            m37024c();
        }
    }

    public void setIconGravity(int i) {
        this.f26844f0 = i;
    }

    public void setIconPadding(int i) {
        if (this.f26838W != i) {
            this.f26838W = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C3868a.m12946c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f26842d0 != i) {
            this.f26842d0 = i;
            m37024c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f26840b0 != colorStateList) {
            this.f26840b0 = colorStateList;
            m37024c();
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f26839a0 != mode) {
            this.f26839a0 = mode;
            m37024c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C3868a.m12945b(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m37023b()) {
            this.f26837V.mo29358a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m37023b()) {
            setRippleColor(C3868a.m12945b(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m37023b()) {
            this.f26837V.mo29364b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m37023b()) {
            setStrokeColor(C3868a.m12945b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m37023b()) {
            this.f26837V.mo29366c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m37023b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m37023b()) {
            this.f26837V.mo29367c(colorStateList);
        } else if (this.f26837V != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (m37023b()) {
            this.f26837V.mo29361a(mode);
        } else if (this.f26837V != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public C11478a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray c = C10320g.m32558c(context, attributeSet, C11467k.MaterialButton, i, C11466j.Widget_MaterialComponents_Button, new int[0]);
        this.f26838W = c.getDimensionPixelSize(C11467k.MaterialButton_iconPadding, 0);
        this.f26839a0 = C10321h.m32560a(c.getInt(C11467k.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f26840b0 = C11499a.m37087a(getContext(), c, C11467k.MaterialButton_iconTint);
        this.f26841c0 = C11499a.m37088b(getContext(), c, C11467k.MaterialButton_icon);
        this.f26844f0 = c.getInteger(C11467k.MaterialButton_iconGravity, 1);
        this.f26842d0 = c.getDimensionPixelSize(C11467k.MaterialButton_iconSize, 0);
        this.f26837V = new C11480c(this);
        this.f26837V.mo29359a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f26838W);
        m37024c();
    }
}
