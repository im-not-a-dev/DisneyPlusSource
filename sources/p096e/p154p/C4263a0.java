package p096e.p154p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p096e.p121h.p135s.C4187x;

/* renamed from: e.p.a0 */
/* compiled from: ViewOverlayApi14 */
class C4263a0 implements C4279c0 {

    /* renamed from: a */
    protected C4264a f10617a;

    /* renamed from: e.p.a0$a */
    /* compiled from: ViewOverlayApi14 */
    static class C4264a extends ViewGroup {

        /* renamed from: U */
        View f10618U;

        /* renamed from: V */
        ArrayList<Drawable> f10619V = null;

        /* renamed from: W */
        C4263a0 f10620W;

        /* renamed from: c */
        ViewGroup f10621c;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C4264a(Context context, ViewGroup viewGroup, View view, C4263a0 a0Var) {
            super(context);
            this.f10621c = viewGroup;
            this.f10618U = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f10620W = a0Var;
        }

        /* renamed from: a */
        public void mo14995a(Drawable drawable) {
            if (this.f10619V == null) {
                this.f10619V = new ArrayList<>();
            }
            if (!this.f10619V.contains(drawable)) {
                this.f10619V.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo14998b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f10619V;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f10621c.getLocationOnScreen(iArr);
            this.f10618U.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f10618U.getWidth(), this.f10618U.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f10619V;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f10619V.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f10621c != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f10621c instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m14660a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.f10619V;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo14999b(View view) {
            super.removeView(view);
            if (mo14997a()) {
                this.f10621c.removeView(this);
            }
        }

        /* renamed from: a */
        public void mo14996a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f10621c || viewGroup.getParent() == null || !C4187x.m14339D(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f10621c.getLocationOnScreen(iArr2);
                    C4187x.m14383d(view, iArr[0] - iArr2[0]);
                    C4187x.m14386e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo14997a() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f10619V;
                if (arrayList == null || arrayList.size() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m14660a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f10621c.getLocationOnScreen(iArr2);
            this.f10618U.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }
    }

    C4263a0(Context context, ViewGroup viewGroup, View view) {
        this.f10617a = new C4264a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C4263a0 m14656c(View view) {
        ViewGroup d = m14657d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C4264a) {
                return ((C4264a) childAt).f10620W;
            }
        }
        return new C4327u(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m14657d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo14993a(Drawable drawable) {
        this.f10617a.mo14995a(drawable);
    }

    /* renamed from: b */
    public void mo14994b(Drawable drawable) {
        this.f10617a.mo14998b(drawable);
    }
}
