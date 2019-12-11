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
import p163g.p413f.p414a.p420u.C10726d;
import p163g.p413f.p414a.p424w.C10774j;

@Deprecated
/* renamed from: g.f.a.u.l.j */
/* compiled from: ViewTarget */
public abstract class C10748j<T extends View, Z> extends C10737a<Z> {

    /* renamed from: Z */
    private static Integer f25443Z;

    /* renamed from: U */
    protected final T f25444U;

    /* renamed from: V */
    private final C10749a f25445V;

    /* renamed from: W */
    private OnAttachStateChangeListener f25446W;

    /* renamed from: X */
    private boolean f25447X;

    /* renamed from: Y */
    private boolean f25448Y;

    /* renamed from: g.f.a.u.l.j$a */
    /* compiled from: ViewTarget */
    static final class C10749a {

        /* renamed from: e */
        static Integer f25449e;

        /* renamed from: a */
        private final View f25450a;

        /* renamed from: b */
        private final List<C10746h> f25451b = new ArrayList();

        /* renamed from: c */
        boolean f25452c;

        /* renamed from: d */
        private C10750a f25453d;

        /* renamed from: g.f.a.u.l.j$a$a */
        /* compiled from: ViewTarget */
        private static final class C10750a implements OnPreDrawListener {

            /* renamed from: c */
            private final WeakReference<C10749a> f25454c;

            C10750a(C10749a aVar) {
                this.f25454c = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "ViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C10749a aVar = (C10749a) this.f25454c.get();
                if (aVar != null) {
                    aVar.mo27767a();
                }
                return true;
            }
        }

        C10749a(View view) {
            this.f25450a = view;
        }

        /* renamed from: a */
        private static int m33956a(Context context) {
            if (f25449e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C10774j.m34012a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f25449e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f25449e.intValue();
        }

        /* renamed from: a */
        private boolean m33957a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private void m33959b(int i, int i2) {
            Iterator it = new ArrayList(this.f25451b).iterator();
            while (it.hasNext()) {
                ((C10746h) it.next()).mo27751a(i, i2);
            }
        }

        /* renamed from: c */
        private int m33960c() {
            int paddingTop = this.f25450a.getPaddingTop() + this.f25450a.getPaddingBottom();
            LayoutParams layoutParams = this.f25450a.getLayoutParams();
            return m33955a(this.f25450a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m33961d() {
            int paddingLeft = this.f25450a.getPaddingLeft() + this.f25450a.getPaddingRight();
            LayoutParams layoutParams = this.f25450a.getLayoutParams();
            return m33955a(this.f25450a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27770b(C10746h hVar) {
            this.f25451b.remove(hVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27769b() {
            ViewTreeObserver viewTreeObserver = this.f25450a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f25453d);
            }
            this.f25453d = null;
            this.f25451b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27767a() {
            if (!this.f25451b.isEmpty()) {
                int d = m33961d();
                int c = m33960c();
                if (m33958a(d, c)) {
                    m33959b(d, c);
                    mo27769b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27768a(C10746h hVar) {
            int d = m33961d();
            int c = m33960c();
            if (m33958a(d, c)) {
                hVar.mo27751a(d, c);
                return;
            }
            if (!this.f25451b.contains(hVar)) {
                this.f25451b.add(hVar);
            }
            if (this.f25453d == null) {
                ViewTreeObserver viewTreeObserver = this.f25450a.getViewTreeObserver();
                this.f25453d = new C10750a(this);
                viewTreeObserver.addOnPreDrawListener(this.f25453d);
            }
        }

        /* renamed from: a */
        private boolean m33958a(int i, int i2) {
            return m33957a(i) && m33957a(i2);
        }

        /* renamed from: a */
        private int m33955a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f25452c && this.f25450a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f25450a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "ViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m33956a(this.f25450a.getContext());
        }
    }

    public C10748j(T t) {
        C10774j.m34012a(t);
        this.f25444U = (View) t;
        this.f25445V = new C10749a(t);
    }

    /* renamed from: f */
    private Object m33946f() {
        Integer num = f25443Z;
        if (num == null) {
            return this.f25444U.getTag();
        }
        return this.f25444U.getTag(num.intValue());
    }

    /* renamed from: g */
    private void m33947g() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f25446W;
        if (onAttachStateChangeListener != null && !this.f25448Y) {
            this.f25444U.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f25448Y = true;
        }
    }

    /* renamed from: h */
    private void m33948h() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f25446W;
        if (onAttachStateChangeListener != null && this.f25448Y) {
            this.f25444U.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f25448Y = false;
        }
    }

    /* renamed from: a */
    public void mo27735a(C10746h hVar) {
        this.f25445V.mo27770b(hVar);
    }

    /* renamed from: b */
    public void mo27738b(Drawable drawable) {
        super.mo27738b(drawable);
        m33947g();
    }

    /* renamed from: c */
    public void mo27740c(Drawable drawable) {
        super.mo27740c(drawable);
        this.f25445V.mo27769b();
        if (!this.f25447X) {
            m33948h();
        }
    }

    /* renamed from: d */
    public C10726d mo27742d() {
        Object f = m33946f();
        if (f == null) {
            return null;
        }
        if (f instanceof C10726d) {
            return (C10726d) f;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f25444U);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo27734a(C10726d dVar) {
        mo27754a((Object) dVar);
    }

    /* renamed from: a */
    private void mo27754a(Object obj) {
        Integer num = f25443Z;
        if (num == null) {
            this.f25444U.setTag(obj);
        } else {
            this.f25444U.setTag(num.intValue(), obj);
        }
    }

    /* renamed from: b */
    public void mo27739b(C10746h hVar) {
        this.f25445V.mo27768a(hVar);
    }
}
