package p096e.p140j.p142b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p113e.C3942j;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4129c0;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4158e;
import p096e.p121h.p135s.p136i0.C4161f;
import p096e.p140j.p142b.C4211b.C4212a;
import p096e.p140j.p142b.C4211b.C4213b;

/* renamed from: e.j.b.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C4207a extends C4119a {

    /* renamed from: n */
    private static final Rect f10516n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C4212a<C4154d> f10517o = new C4208a();

    /* renamed from: p */
    private static final C4213b<C3942j<C4154d>, C4154d> f10518p = new C4209b();

    /* renamed from: d */
    private final Rect f10519d = new Rect();

    /* renamed from: e */
    private final Rect f10520e = new Rect();

    /* renamed from: f */
    private final Rect f10521f = new Rect();

    /* renamed from: g */
    private final int[] f10522g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f10523h;

    /* renamed from: i */
    private final View f10524i;

    /* renamed from: j */
    private C4210c f10525j;

    /* renamed from: k */
    int f10526k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f10527l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f10528m = Integer.MIN_VALUE;

    /* renamed from: e.j.b.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C4208a implements C4212a<C4154d> {
        C4208a() {
        }

        /* renamed from: a */
        public void mo14879a(C4154d dVar, Rect rect) {
            dVar.mo14735a(rect);
        }
    }

    /* renamed from: e.j.b.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C4209b implements C4213b<C3942j<C4154d>, C4154d> {
        C4209b() {
        }

        /* renamed from: a */
        public C4154d mo14883a(C3942j<C4154d> jVar, int i) {
            return (C4154d) jVar.mo14182e(i);
        }

        /* renamed from: a */
        public int mo14881a(C3942j<C4154d> jVar) {
            return jVar.mo14175b();
        }
    }

    /* renamed from: e.j.b.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C4210c extends C4158e {
        C4210c() {
        }

        /* renamed from: a */
        public C4154d mo14795a(int i) {
            return C4154d.m14214a(C4207a.this.mo14875b(i));
        }

        /* renamed from: b */
        public C4154d mo14799b(int i) {
            int i2 = i == 2 ? C4207a.this.f10526k : C4207a.this.f10527l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo14795a(i2);
        }

        /* renamed from: a */
        public boolean mo14798a(int i, int i2, Bundle bundle) {
            return C4207a.this.mo14876b(i, i2, bundle);
        }
    }

    public C4207a(View view) {
        if (view != null) {
            this.f10524i = view;
            this.f10523h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C4187x.m14397l(view) == 0) {
                C4187x.m14390g(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: b */
    private boolean m14460b(int i, Rect rect) {
        C4154d dVar;
        C4154d dVar2;
        C3942j d = m14464d();
        int i2 = this.f10527l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            dVar = null;
        } else {
            dVar = (C4154d) d.mo14172a(i2);
        }
        Object obj = dVar;
        if (i == 1 || i == 2) {
            dVar2 = (C4154d) C4211b.m14500a(d, f10518p, f10517o, obj, i, C4187x.m14399n(this.f10524i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f10527l;
            if (i4 != Integer.MIN_VALUE) {
                m14455a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m14454a(this.f10524i, i, rect2);
            }
            dVar2 = (C4154d) C4211b.m14501a(d, f10518p, f10517o, obj, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (dVar2 != null) {
            i3 = d.mo14178c(d.mo14171a(dVar2));
        }
        return mo14877c(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m14461c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C4154d b = mo14875b(i);
        obtain.getText().add(b.mo14769h());
        obtain.setContentDescription(b.mo14759e());
        obtain.setScrollable(b.mo14786s());
        obtain.setPassword(b.mo14785r());
        obtain.setEnabled(b.mo14781n());
        obtain.setChecked(b.mo14779l());
        mo14863a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo14755d());
            C4161f.m14294a(obtain, this.f10524i, i);
            obtain.setPackageName(this.f10524i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: d */
    private C3942j<C4154d> m14464d() {
        ArrayList arrayList = new ArrayList();
        mo14868a((List<Integer>) arrayList);
        C3942j<C4154d> jVar = new C3942j<>();
        for (int i = 0; i < arrayList.size(); i++) {
            jVar.mo14179c(i, m14467f(i));
        }
        return jVar;
    }

    /* renamed from: e */
    private AccessibilityEvent m14466e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f10524i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: f */
    private C4154d m14467f(int i) {
        C4154d z = C4154d.m14226z();
        z.mo14761e(true);
        z.mo14765f(true);
        z.mo14739a((CharSequence) "android.view.View");
        z.mo14751c(f10516n);
        z.mo14756d(f10516n);
        z.mo14736a(this.f10524i);
        mo14864a(i, z);
        if (z.mo14769h() == null && z.mo14759e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        z.mo14735a(this.f10520e);
        if (!this.f10520e.equals(f10516n)) {
            int b = z.mo14744b();
            if ((b & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((b & 128) == 0) {
                z.mo14760e((CharSequence) this.f10524i.getContext().getPackageName());
                z.mo14752c(this.f10524i, i);
                if (this.f10526k == i) {
                    z.mo14742a(true);
                    z.mo14734a(128);
                } else {
                    z.mo14742a(false);
                    z.mo14734a(64);
                }
                boolean z2 = this.f10527l == i;
                if (z2) {
                    z.mo14734a(2);
                } else if (z.mo14782o()) {
                    z.mo14734a(1);
                }
                z.mo14768g(z2);
                this.f10524i.getLocationOnScreen(this.f10522g);
                z.mo14745b(this.f10519d);
                if (this.f10519d.equals(f10516n)) {
                    z.mo14735a(this.f10519d);
                    if (z.f10454b != -1) {
                        C4154d z3 = C4154d.m14226z();
                        for (int i2 = z.f10454b; i2 != -1; i2 = z3.f10454b) {
                            z3.mo14746b(this.f10524i, -1);
                            z3.mo14751c(f10516n);
                            mo14864a(i2, z3);
                            z3.mo14735a(this.f10520e);
                            Rect rect = this.f10519d;
                            Rect rect2 = this.f10520e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        z3.mo14790v();
                    }
                    this.f10519d.offset(this.f10522g[0] - this.f10524i.getScrollX(), this.f10522g[1] - this.f10524i.getScrollY());
                }
                if (this.f10524i.getLocalVisibleRect(this.f10521f)) {
                    this.f10521f.offset(this.f10522g[0] - this.f10524i.getScrollX(), this.f10522g[1] - this.f10524i.getScrollY());
                    if (this.f10519d.intersect(this.f10521f)) {
                        z.mo14756d(this.f10519d);
                        if (m14457a(this.f10519d)) {
                            z.mo14778l(true);
                        }
                    }
                }
                return z;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: g */
    private static int m14468g(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: h */
    private boolean m14469h(int i) {
        if (this.f10523h.isEnabled() && this.f10523h.isTouchExplorationEnabled()) {
            int i2 = this.f10526k;
            if (i2 != i) {
                if (i2 != Integer.MIN_VALUE) {
                    m14465d(i2);
                }
                this.f10526k = i;
                this.f10524i.invalidate();
                mo14871a(i, (int) DateUtils.FORMAT_ABBREV_WEEKDAY);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m14470i(int i) {
        int i2 = this.f10528m;
        if (i2 != i) {
            this.f10528m = i;
            mo14871a(i, 128);
            mo14871a(i2, 256);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo14862a(float f, float f2);

    /* renamed from: a */
    public C4158e mo14669a(View view) {
        if (this.f10525j == null) {
            this.f10525j = new C4210c();
        }
        return this.f10525j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14863a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14864a(int i, C4154d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14865a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14866a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14867a(C4154d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14868a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo14872a(int i, int i2, Bundle bundle);

    /* renamed from: a */
    public final boolean mo14874a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f10523h.isEnabled() && this.f10523h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a = mo14862a(motionEvent.getX(), motionEvent.getY());
                m14470i(a);
                if (a != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.f10528m == Integer.MIN_VALUE) {
                return false;
            } else {
                m14470i(Integer.MIN_VALUE);
                return true;
            }
        }
        return z;
    }

    /* renamed from: d */
    private boolean m14465d(int i) {
        if (this.f10526k != i) {
            return false;
        }
        this.f10526k = Integer.MIN_VALUE;
        this.f10524i.invalidate();
        mo14871a(i, (int) DateUtils.FORMAT_ABBREV_MONTH);
        return true;
    }

    /* renamed from: a */
    public final boolean mo14873a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g = m14468g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m14460b(g, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m14459b();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m14460b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m14460b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: c */
    private C4154d m14462c() {
        C4154d d = C4154d.m14221d(this.f10524i);
        C4187x.m14360a(this.f10524i, d);
        ArrayList arrayList = new ArrayList();
        mo14868a((List<Integer>) arrayList);
        if (d.mo14750c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.mo14737a(this.f10524i, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: b */
    private boolean m14459b() {
        int i = this.f10527l;
        return i != Integer.MIN_VALUE && mo14872a(i, 16, (Bundle) null);
    }

    /* renamed from: b */
    private AccessibilityEvent m14458b(int i, int i2) {
        if (i != -1) {
            return m14461c(i, i2);
        }
        return m14466e(i2);
    }

    /* renamed from: b */
    public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2818b(view, accessibilityEvent);
        mo14866a(accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4154d mo14875b(int i) {
        if (i == -1) {
            return m14462c();
        }
        return m14467f(i);
    }

    /* renamed from: a */
    public final void mo14869a(boolean z, int i, Rect rect) {
        int i2 = this.f10527l;
        if (i2 != Integer.MIN_VALUE) {
            mo14870a(i2);
        }
        if (z) {
            m14460b(i, rect);
        }
    }

    /* renamed from: c */
    private boolean m14463c(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo14877c(i);
        }
        if (i2 == 2) {
            return mo14870a(i);
        }
        if (i2 == 64) {
            return m14469h(i);
        }
        if (i2 != 128) {
            return mo14872a(i, i2, bundle);
        }
        return m14465d(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo14876b(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m14463c(i, i2, bundle);
        }
        return m14456a(i2, bundle);
    }

    /* renamed from: a */
    private void m14455a(int i, Rect rect) {
        mo14875b(i).mo14735a(rect);
    }

    /* renamed from: a */
    private static Rect m14454a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: c */
    public final boolean mo14877c(int i) {
        if (!this.f10524i.isFocused() && !this.f10524i.requestFocus()) {
            return false;
        }
        int i2 = this.f10527l;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo14870a(i2);
        }
        this.f10527l = i;
        mo14865a(i, true);
        mo14871a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final boolean mo14871a(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f10523h.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f10524i.getParent();
        if (parent == null) {
            return false;
        }
        return C4129c0.m14143a(parent, this.f10524i, m14458b(i, i2));
    }

    /* renamed from: a */
    public void mo2816a(View view, C4154d dVar) {
        super.mo2816a(view, dVar);
        mo14867a(dVar);
    }

    /* renamed from: a */
    private boolean m14456a(int i, Bundle bundle) {
        return C4187x.m14367a(this.f10524i, i, bundle);
    }

    /* renamed from: a */
    private boolean m14457a(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.f10524i.getWindowVisibility() != 0) {
                return false;
            }
            ViewParent parent = this.f10524i.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                    return false;
                }
                parent = view.getParent();
            }
            if (parent != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo14870a(int i) {
        if (this.f10527l != i) {
            return false;
        }
        this.f10527l = Integer.MIN_VALUE;
        mo14865a(i, false);
        mo14871a(i, 8);
        return true;
    }
}
