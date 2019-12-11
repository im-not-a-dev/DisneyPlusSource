package p096e.p121h.p135s;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.C4020e;
import p096e.p121h.p135s.p136i0.C4154d;

/* renamed from: e.h.s.x */
/* compiled from: ViewCompat */
public class C4187x {

    /* renamed from: a */
    private static Field f10481a;

    /* renamed from: b */
    private static boolean f10482b;

    /* renamed from: c */
    private static Field f10483c;

    /* renamed from: d */
    private static boolean f10484d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f10485e;

    /* renamed from: f */
    private static WeakHashMap<View, C4135d0> f10486f = null;

    /* renamed from: g */
    private static Field f10487g;

    /* renamed from: h */
    private static boolean f10488h = false;

    /* renamed from: i */
    private static ThreadLocal<Rect> f10489i;

    /* renamed from: e.h.s.x$a */
    /* compiled from: ViewCompat */
    static class C4188a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C4182s f10490a;

        C4188a(C4182s sVar) {
            this.f10490a = sVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C4147h0.m14193a(this.f10490a.onApplyWindowInsets(view, C4147h0.m14192a((Object) windowInsets)));
        }
    }

    /* renamed from: e.h.s.x$b */
    /* compiled from: ViewCompat */
    static class C4189b extends C4193f<Boolean> {
        C4189b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m14413a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    /* renamed from: e.h.s.x$c */
    /* compiled from: ViewCompat */
    static class C4190c extends C4193f<CharSequence> {
        C4190c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence m14415a(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    /* renamed from: e.h.s.x$d */
    /* compiled from: ViewCompat */
    static class C4191d extends C4193f<Boolean> {
        C4191d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m14417a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    /* renamed from: e.h.s.x$e */
    /* compiled from: ViewCompat */
    static class C4192e implements OnGlobalLayoutListener, OnAttachStateChangeListener {

        /* renamed from: c */
        private WeakHashMap<View, Boolean> f10491c = new WeakHashMap<>();

        C4192e() {
        }

        /* renamed from: a */
        private void m14419a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C4187x.m14379c(view, 16);
                }
                this.f10491c.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Entry entry : this.f10491c.entrySet()) {
                m14419a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m14418a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: a */
        private void m14418a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: e.h.s.x$f */
    /* compiled from: ViewCompat */
    static abstract class C4193f<T> {

        /* renamed from: a */
        private final int f10492a;

        /* renamed from: b */
        private final Class<T> f10493b;

        /* renamed from: c */
        private final int f10494c;

        C4193f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        private boolean m14420a() {
            return VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo14833a(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo14837b(View view) {
            if (m14421b()) {
                return mo14833a(view);
            }
            if (m14420a()) {
                T tag = view.getTag(this.f10492a);
                if (this.f10493b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        C4193f(int i, Class<T> cls, int i2, int i3) {
            this.f10492a = i;
            this.f10493b = cls;
            this.f10494c = i3;
        }

        /* renamed from: b */
        private boolean m14421b() {
            return VERSION.SDK_INT >= this.f10494c;
        }
    }

    /* renamed from: e.h.s.x$g */
    /* compiled from: ViewCompat */
    public interface C4194g {
        /* renamed from: a */
        boolean mo14838a(View view, KeyEvent keyEvent);
    }

    /* renamed from: e.h.s.x$h */
    /* compiled from: ViewCompat */
    static class C4195h {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f10495d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f10496a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f10497b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f10498c = null;

        C4195h() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m14425a() {
            if (this.f10497b == null) {
                this.f10497b = new SparseArray<>();
            }
            return this.f10497b;
        }

        /* renamed from: b */
        private View m14427b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f10496a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m14427b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m14429c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: c */
        private boolean m14429c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C4020e.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C4194g) arrayList.get(size)).mo14838a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        static C4195h m14426a(View view) {
            C4195h hVar = (C4195h) view.getTag(C4020e.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            C4195h hVar2 = new C4195h();
            view.setTag(C4020e.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        /* renamed from: b */
        private void m14428b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f10496a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f10495d.isEmpty()) {
                synchronized (f10495d) {
                    if (this.f10496a == null) {
                        this.f10496a = new WeakHashMap<>();
                    }
                    for (int size = f10495d.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f10495d.get(size)).get();
                        if (view == null) {
                            f10495d.remove(size);
                        } else {
                            this.f10496a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f10496a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo14840a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m14428b();
            }
            View b = m14427b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m14425a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo14839a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f10498c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f10498c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a = m14425a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C4187x.m14339D(view)) {
                m14429c(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {C4020e.accessibility_custom_action_0, C4020e.accessibility_custom_action_1, C4020e.accessibility_custom_action_2, C4020e.accessibility_custom_action_3, C4020e.accessibility_custom_action_4, C4020e.accessibility_custom_action_5, C4020e.accessibility_custom_action_6, C4020e.accessibility_custom_action_7, C4020e.accessibility_custom_action_8, C4020e.accessibility_custom_action_9, C4020e.accessibility_custom_action_10, C4020e.accessibility_custom_action_11, C4020e.accessibility_custom_action_12, C4020e.accessibility_custom_action_13, C4020e.accessibility_custom_action_14, C4020e.accessibility_custom_action_15, C4020e.accessibility_custom_action_16, C4020e.accessibility_custom_action_17, C4020e.accessibility_custom_action_18, C4020e.accessibility_custom_action_19, C4020e.accessibility_custom_action_20, C4020e.accessibility_custom_action_21, C4020e.accessibility_custom_action_22, C4020e.accessibility_custom_action_23, C4020e.accessibility_custom_action_24, C4020e.accessibility_custom_action_25, C4020e.accessibility_custom_action_26, C4020e.accessibility_custom_action_27, C4020e.accessibility_custom_action_28, C4020e.accessibility_custom_action_29, C4020e.accessibility_custom_action_30, C4020e.accessibility_custom_action_31};
        new C4192e();
    }

    /* renamed from: A */
    public static boolean m14336A(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: B */
    public static boolean m14337B(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m14338C(View view) {
        Boolean bool = (Boolean) m14350a().mo14837b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: D */
    public static boolean m14339D(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: E */
    public static boolean m14340E(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: F */
    public static boolean m14341F(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C4176m) {
            return ((C4176m) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m14342G(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m14343H(View view) {
        Boolean bool = (Boolean) m14380d().mo14837b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: I */
    public static void m14344I(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: J */
    public static void m14345J(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: K */
    public static void m14346K(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C4176m) {
            ((C4176m) view).stopNestedScroll();
        }
    }

    /* renamed from: L */
    private static void m14347L(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m14360a(View view, C4154d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.mo14791w());
    }

    /* renamed from: b */
    private static Rect m14369b() {
        if (f10489i == null) {
            f10489i = new ThreadLocal<>();
        }
        Rect rect = (Rect) f10489i.get();
        if (rect == null) {
            rect = new Rect();
            f10489i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: c */
    public static int m14376c(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: d */
    public static void m14382d(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    /* renamed from: e */
    public static float m14384e(View view) {
        return view.getAlpha();
    }

    /* renamed from: f */
    public static void m14388f(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: g */
    public static void m14390g(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: h */
    public static void m14392h(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: i */
    public static void m14394i(View view, int i) {
        if (view instanceof C4174k) {
            ((C4174k) view).mo2753a(i);
        } else if (i == 0) {
            m14346K(view);
        }
    }

    /* renamed from: j */
    public static float m14395j(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public static boolean m14396k(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: l */
    public static int m14397l(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: m */
    public static int m14398m(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: n */
    public static int m14399n(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: o */
    public static int m14400o(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f10484d) {
            try {
                f10483c = View.class.getDeclaredField("mMinHeight");
                f10483c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10484d = true;
        }
        Field field = f10483c;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: p */
    public static int m14401p(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f10482b) {
            try {
                f10481a = View.class.getDeclaredField("mMinWidth");
                f10481a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10482b = true;
        }
        Field field = f10481a;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: q */
    public static int m14402q(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: r */
    public static int m14403r(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: s */
    public static ViewParent m14404s(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: t */
    public static String m14405t(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f10485e;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: u */
    public static float m14406u(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    /* renamed from: v */
    public static float m14407v(View view) {
        return view.getTranslationY();
    }

    /* renamed from: w */
    public static int m14408w(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: x */
    public static float m14409x(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: y */
    public static boolean m14410y(View view) {
        return m14370b(view) != null;
    }

    /* renamed from: z */
    public static boolean m14411z(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: a */
    public static void m14359a(View view, C4119a aVar) {
        AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m14370b(view) instanceof C4120a)) {
            aVar = new C4119a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo14668a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: d */
    public static void m14383d(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect b = m14369b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m14352a(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m14352a(view, i);
        }
    }

    /* renamed from: e */
    public static void m14385e(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static void m14378c(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: f */
    public static ColorStateList m14387f(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C4186w ? ((C4186w) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: h */
    public static Rect m14391h(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: c */
    private static C4193f<CharSequence> m14377c() {
        return new C4190c(C4020e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: e */
    public static void m14386e(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect b = m14369b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m14373b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m14373b(view, i);
        }
    }

    /* renamed from: g */
    public static Mode m14389g(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C4186w ? ((C4186w) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: i */
    public static Display m14393i(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m14339D(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    public static void m14363a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: c */
    static void m14379c(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m14381d(view) != null;
            if (m14376c(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : DateUtils.FORMAT_NO_MIDNIGHT);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: b */
    private static AccessibilityDelegate m14370b(View view) {
        if (f10488h) {
            return null;
        }
        if (f10487g == null) {
            try {
                f10487g = View.class.getDeclaredField("mAccessibilityDelegate");
                f10487g.setAccessible(true);
            } catch (Throwable unused) {
                f10488h = true;
                return null;
            }
        }
        try {
            Object obj = f10487g.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f10488h = true;
            return null;
        }
    }

    /* renamed from: a */
    public static void m14364a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static boolean m14367a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public static void m14354a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static C4135d0 m14348a(View view) {
        if (f10486f == null) {
            f10486f = new WeakHashMap<>();
        }
        C4135d0 d0Var = (C4135d0) f10486f.get(view);
        if (d0Var != null) {
            return d0Var;
        }
        C4135d0 d0Var2 = new C4135d0(view);
        f10486f.put(view, d0Var2);
        return d0Var2;
    }

    /* renamed from: b */
    public static void m14374b(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: d */
    private static C4193f<Boolean> m14380d() {
        return new C4189b(C4020e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: b */
    public static void m14372b(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: d */
    public static CharSequence m14381d(View view) {
        return (CharSequence) m14377c().mo14837b(view);
    }

    @Deprecated
    /* renamed from: a */
    public static void m14351a(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: b */
    public static C4147h0 m14371b(View view, C4147h0 h0Var) {
        if (VERSION.SDK_INT < 21) {
            return h0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C4147h0.m14193a(h0Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C4147h0.m14192a((Object) windowInsets);
    }

    /* renamed from: a */
    public static void m14365a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f10485e == null) {
            f10485e = new WeakHashMap<>();
        }
        f10485e.put(view, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m14366a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    private static void m14373b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m14347L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14347L((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m14361a(View view, C4182s sVar) {
        if (VERSION.SDK_INT >= 21) {
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C4188a(sVar));
        }
    }

    /* renamed from: a */
    public static C4147h0 m14349a(View view, C4147h0 h0Var) {
        if (VERSION.SDK_INT < 21) {
            return h0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C4147h0.m14193a(h0Var);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C4147h0.m14192a((Object) windowInsets);
    }

    /* renamed from: b */
    static boolean m14375b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C4195h.m14426a(view).mo14839a(keyEvent);
    }

    /* renamed from: a */
    public static void m14358a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m14355a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C4186w) {
            ((C4186w) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m14356a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C4186w) {
            ((C4186w) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    private static void m14352a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m14347L(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14347L((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m14357a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m14353a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m14362a(View view, C4184u uVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (uVar != null ? uVar.mo14831a() : null));
        }
    }

    /* renamed from: a */
    static boolean m14368a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C4195h.m14426a(view).mo14840a(view, keyEvent);
    }

    /* renamed from: a */
    private static C4193f<Boolean> m14350a() {
        return new C4191d(C4020e.tag_accessibility_heading, Boolean.class, 28);
    }
}
