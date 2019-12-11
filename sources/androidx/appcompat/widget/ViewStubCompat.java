package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p096e.p097a.C3867j;

public final class ViewStubCompat extends View {

    /* renamed from: U */
    private int f944U;

    /* renamed from: V */
    private WeakReference<View> f945V;

    /* renamed from: W */
    private LayoutInflater f946W;

    /* renamed from: a0 */
    private C0198a f947a0;

    /* renamed from: c */
    private int f948c;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0198a {
        /* renamed from: a */
        void mo1475a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1463a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f948c != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f946W;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f948c, viewGroup, false);
            int i = this.f944U;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f945V = new WeakReference<>(inflate);
            C0198a aVar = this.f947a0;
            if (aVar != null) {
                aVar.mo1475a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f944U;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f946W;
    }

    public int getLayoutResource() {
        return this.f948c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f944U = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f946W = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f948c = i;
    }

    public void setOnInflateListener(C0198a aVar) {
        this.f947a0 = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f945V;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1463a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f948c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ViewStubCompat, i, 0);
        this.f944U = obtainStyledAttributes.getResourceId(C3867j.ViewStubCompat_android_inflatedId, -1);
        this.f948c = obtainStyledAttributes.getResourceId(C3867j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C3867j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
