package p163g.p413f.p414a.p420u.p421l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p163g.p413f.p414a.C10658k;
import p163g.p413f.p414a.p420u.C10726d;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: g.f.a.u.l.c */
/* compiled from: CustomViewTarget */
public abstract class C10739c<T extends View, Z> implements C10747i<Z> {

    /* renamed from: Z */
    private static final int f25427Z = C10658k.glide_custom_view_target_tag;

    /* renamed from: U */
    protected final T f25428U;

    /* renamed from: V */
    private OnAttachStateChangeListener f25429V;

    /* renamed from: W */
    private boolean f25430W;

    /* renamed from: X */
    private boolean f25431X;

    /* renamed from: Y */
    private int f25432Y;

    /* renamed from: c */
    private final C10740a f25433c;

    /* renamed from: g.f.a.u.l.c$a */
    /* compiled from: CustomViewTarget */
    static final class C10740a {

        /* renamed from: e */
        static Integer f25434e;

        /* renamed from: a */
        private final View f25435a;

        /* renamed from: b */
        private final List<C10746h> f25436b = new ArrayList();

        /* renamed from: c */
        boolean f25437c;

        /* renamed from: d */
        private C10741a f25438d;

        /* renamed from: g.f.a.u.l.c$a$a */
        /* compiled from: CustomViewTarget */
        private static final class C10741a implements OnPreDrawListener {

            /* renamed from: c */
            private final WeakReference<C10740a> f25439c;

            C10741a(C10740a aVar) {
                this.f25439c = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "CustomViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C10740a aVar = (C10740a) this.f25439c.get();
                if (aVar != null) {
                    aVar.mo27757a();
                }
                return true;
            }
        }

        C10740a(View view) {
            this.f25435a = view;
        }

        /* renamed from: a */
        private static int m33910a(Context context) {
            if (f25434e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C10774j.m34012a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f25434e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f25434e.intValue();
        }

        /* renamed from: a */
        private boolean m33911a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private void m33913b(int i, int i2) {
            Iterator it = new ArrayList(this.f25436b).iterator();
            while (it.hasNext()) {
                ((C10746h) it.next()).mo27751a(i, i2);
            }
        }

        /* renamed from: c */
        private int m33914c() {
            int paddingTop = this.f25435a.getPaddingTop() + this.f25435a.getPaddingBottom();
            LayoutParams layoutParams = this.f25435a.getLayoutParams();
            return m33909a(this.f25435a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m33915d() {
            int paddingLeft = this.f25435a.getPaddingLeft() + this.f25435a.getPaddingRight();
            LayoutParams layoutParams = this.f25435a.getLayoutParams();
            return m33909a(this.f25435a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27760b(C10746h hVar) {
            this.f25436b.remove(hVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27759b() {
            ViewTreeObserver viewTreeObserver = this.f25435a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f25438d);
            }
            this.f25438d = null;
            this.f25436b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27757a() {
            if (!this.f25436b.isEmpty()) {
                int d = m33915d();
                int c = m33914c();
                if (m33912a(d, c)) {
                    m33913b(d, c);
                    mo27759b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27758a(C10746h hVar) {
            int d = m33915d();
            int c = m33914c();
            if (m33912a(d, c)) {
                hVar.mo27751a(d, c);
                return;
            }
            if (!this.f25436b.contains(hVar)) {
                this.f25436b.add(hVar);
            }
            if (this.f25438d == null) {
                ViewTreeObserver viewTreeObserver = this.f25435a.getViewTreeObserver();
                this.f25438d = new C10741a(this);
                viewTreeObserver.addOnPreDrawListener(this.f25438d);
            }
        }

        /* renamed from: a */
        private boolean m33912a(int i, int i2) {
            return m33911a(i) && m33911a(i2);
        }

        /* renamed from: a */
        private int m33909a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f25437c && this.f25435a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f25435a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "CustomViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m33910a(this.f25435a.getContext());
        }
    }

    public C10739c(T t) {
        C10774j.m34012a(t);
        this.f25428U = (View) t;
        this.f25433c = new C10740a(t);
    }

    /* renamed from: e */
    private Object m33895e() {
        T t = this.f25428U;
        int i = this.f25432Y;
        if (i == 0) {
            i = f25427Z;
        }
        return t.getTag(i);
    }

    /* renamed from: f */
    private void m33896f() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f25429V;
        if (onAttachStateChangeListener != null && !this.f25431X) {
            this.f25428U.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f25431X = true;
        }
    }

    /* renamed from: g */
    private void m33897g() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f25429V;
        if (onAttachStateChangeListener != null && this.f25431X) {
            this.f25428U.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f25431X = false;
        }
    }

    /* renamed from: a */
    public void mo27566a() {
    }

    /* renamed from: a */
    public final void mo27735a(C10746h hVar) {
        this.f25433c.mo27760b(hVar);
    }

    /* renamed from: b */
    public void mo27570b() {
    }

    /* renamed from: b */
    public final void mo27739b(C10746h hVar) {
        this.f25433c.mo27758a(hVar);
    }

    /* renamed from: c */
    public void mo27572c() {
    }

    /* renamed from: c */
    public final void mo27740c(Drawable drawable) {
        this.f25433c.mo27759b();
        mo20649d(drawable);
        if (!this.f25430W) {
            m33897g();
        }
    }

    /* renamed from: d */
    public final C10726d mo27742d() {
        Object e = m33895e();
        if (e == null) {
            return null;
        }
        if (e instanceof C10726d) {
            return (C10726d) e;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo20649d(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo27755e(Drawable drawable) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f25428U);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo27734a(C10726d dVar) {
        m33894a((Object) dVar);
    }

    /* renamed from: b */
    public final void mo27738b(Drawable drawable) {
        m33896f();
        mo27755e(drawable);
    }

    /* renamed from: a */
    private void m33894a(Object obj) {
        T t = this.f25428U;
        int i = this.f25432Y;
        if (i == 0) {
            i = f25427Z;
        }
        t.setTag(i, obj);
    }
}
