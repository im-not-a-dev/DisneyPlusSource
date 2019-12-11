package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p096e.p097a.C3867j;
import p096e.p097a.p104o.C3889b;
import p096e.p097a.p104o.C3889b.C3890a;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: ActionBar */
public abstract class C0076a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBar */
    public static class C0077a extends MarginLayoutParams {

        /* renamed from: a */
        public int f288a;

        public C0077a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f288a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ActionBarLayout);
            this.f288a = obtainStyledAttributes.getInt(C3867j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0077a(int i, int i2) {
            super(i, i2);
            this.f288a = 0;
            this.f288a = 8388627;
        }

        public C0077a(C0077a aVar) {
            super(aVar);
            this.f288a = 0;
            this.f288a = aVar.f288a;
        }

        public C0077a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f288a = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBar */
    public interface C0078b {
        /* renamed from: a */
        void mo406a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBar */
    public static abstract class C0079c {
        /* renamed from: a */
        public abstract CharSequence mo407a();

        /* renamed from: b */
        public abstract View mo408b();

        /* renamed from: c */
        public abstract Drawable mo409c();

        /* renamed from: d */
        public abstract CharSequence mo410d();

        /* renamed from: e */
        public abstract void mo411e();
    }

    /* renamed from: a */
    public abstract C3889b mo390a(C3890a aVar);

    /* renamed from: a */
    public abstract void mo391a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo392a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo393a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo394a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo395b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo396b(boolean z);

    /* renamed from: c */
    public abstract void mo397c(boolean z);

    /* renamed from: d */
    public abstract void mo398d(boolean z);

    /* renamed from: e */
    public boolean mo399e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo400f();

    /* renamed from: g */
    public abstract int mo401g();

    /* renamed from: h */
    public abstract Context mo402h();

    /* renamed from: i */
    public boolean mo403i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo404j() {
    }

    /* renamed from: k */
    public boolean mo405k() {
        return false;
    }
}
