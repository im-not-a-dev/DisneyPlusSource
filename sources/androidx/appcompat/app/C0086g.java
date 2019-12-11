package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0129e;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0132g.C0133a;
import androidx.appcompat.view.menu.C0148n;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0150o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0217d0;
import androidx.appcompat.widget.C0217d0.C0218a;
import androidx.appcompat.widget.C0235h;
import androidx.appcompat.widget.C0284t0;
import androidx.appcompat.widget.C0300y0;
import androidx.appcompat.widget.C0301z;
import androidx.appcompat.widget.C0302z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.C0170a;
import androidx.core.app.C0460a;
import androidx.core.app.C0476g;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0722m;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import net.danlew.android.joda.DateUtils;
import org.xmlpull.v1.XmlPullParser;
import p096e.p097a.C3858a;
import p096e.p097a.C3860c;
import p096e.p097a.C3863f;
import p096e.p097a.C3864g;
import p096e.p097a.C3866i;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p097a.p104o.C3889b;
import p096e.p097a.p104o.C3889b.C3890a;
import p096e.p097a.p104o.C3892d;
import p096e.p097a.p104o.C3894f.C3895a;
import p096e.p097a.p104o.C3896g;
import p096e.p097a.p104o.C3901i;
import p096e.p113e.C3926a;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4141f;
import p096e.p121h.p135s.C4141f.C4142a;
import p096e.p121h.p135s.C4143f0;
import p096e.p121h.p135s.C4144g;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4182s;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: AppCompatDelegateImpl */
class C0086g extends C0085f implements C0133a, Factory2 {

    /* renamed from: T0 */
    private static final Map<Class<?>, Integer> f297T0 = new C3926a();

    /* renamed from: U0 */
    private static final boolean f298U0 = (VERSION.SDK_INT < 21);

    /* renamed from: V0 */
    private static final int[] f299V0 = {16842836};

    /* renamed from: W0 */
    private static boolean f300W0 = true;

    /* renamed from: X0 */
    private static final boolean f301X0;

    /* renamed from: A0 */
    private C0104o f302A0;

    /* renamed from: B0 */
    private boolean f303B0;

    /* renamed from: C0 */
    private boolean f304C0;

    /* renamed from: D0 */
    private boolean f305D0;

    /* renamed from: E0 */
    private boolean f306E0;

    /* renamed from: F0 */
    boolean f307F0;

    /* renamed from: G0 */
    private int f308G0;

    /* renamed from: H0 */
    private int f309H0;

    /* renamed from: I0 */
    private boolean f310I0;

    /* renamed from: J0 */
    private boolean f311J0;

    /* renamed from: K0 */
    private C0100l f312K0;

    /* renamed from: L0 */
    private C0100l f313L0;

    /* renamed from: M0 */
    boolean f314M0;

    /* renamed from: N0 */
    int f315N0;

    /* renamed from: O0 */
    private final Runnable f316O0;

    /* renamed from: P0 */
    private boolean f317P0;

    /* renamed from: Q0 */
    private Rect f318Q0;

    /* renamed from: R0 */
    private Rect f319R0;

    /* renamed from: S0 */
    private AppCompatViewInflater f320S0;

    /* renamed from: W */
    final Object f321W;

    /* renamed from: X */
    final Context f322X;

    /* renamed from: Y */
    Window f323Y;

    /* renamed from: Z */
    private C0098j f324Z;

    /* renamed from: a0 */
    final C0084e f325a0;

    /* renamed from: b0 */
    C0076a f326b0;

    /* renamed from: c0 */
    MenuInflater f327c0;

    /* renamed from: d0 */
    private CharSequence f328d0;

    /* renamed from: e0 */
    private C0301z f329e0;

    /* renamed from: f0 */
    private C0095h f330f0;

    /* renamed from: g0 */
    private C0105p f331g0;

    /* renamed from: h0 */
    C3889b f332h0;

    /* renamed from: i0 */
    ActionBarContextView f333i0;

    /* renamed from: j0 */
    PopupWindow f334j0;

    /* renamed from: k0 */
    Runnable f335k0;

    /* renamed from: l0 */
    C4135d0 f336l0;

    /* renamed from: m0 */
    private boolean f337m0;

    /* renamed from: n0 */
    private boolean f338n0;

    /* renamed from: o0 */
    private ViewGroup f339o0;

    /* renamed from: p0 */
    private TextView f340p0;

    /* renamed from: q0 */
    private View f341q0;

    /* renamed from: r0 */
    private boolean f342r0;

    /* renamed from: s0 */
    private boolean f343s0;

    /* renamed from: t0 */
    boolean f344t0;

    /* renamed from: u0 */
    boolean f345u0;

    /* renamed from: v0 */
    boolean f346v0;

    /* renamed from: w0 */
    boolean f347w0;

    /* renamed from: x0 */
    boolean f348x0;

    /* renamed from: y0 */
    private boolean f349y0;

    /* renamed from: z0 */
    private C0104o[] f350z0;

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatDelegateImpl */
    static class C0087a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ UncaughtExceptionHandler f351a;

        C0087a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f351a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m591a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            if (message == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m591a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f351a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f351a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    /* compiled from: AppCompatDelegateImpl */
    class C0088b implements Runnable {
        C0088b() {
        }

        public void run() {
            C0086g gVar = C0086g.this;
            if ((gVar.f315N0 & 1) != 0) {
                gVar.mo506f(0);
            }
            C0086g gVar2 = C0086g.this;
            if ((gVar2.f315N0 & 4096) != 0) {
                gVar2.mo506f(108);
            }
            C0086g gVar3 = C0086g.this;
            gVar3.f314M0 = false;
            gVar3.f315N0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    /* compiled from: AppCompatDelegateImpl */
    class C0089c implements C4182s {
        C0089c() {
        }

        public C4147h0 onApplyWindowInsets(View view, C4147h0 h0Var) {
            int e = h0Var.mo14724e();
            int j = C0086g.this.mo510j(e);
            if (e != j) {
                h0Var = h0Var.mo14720a(h0Var.mo14722c(), j, h0Var.mo14723d(), h0Var.mo14721b());
            }
            return C4187x.m14371b(view, h0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    /* compiled from: AppCompatDelegateImpl */
    class C0090d implements C0218a {
        C0090d() {
        }

        /* renamed from: a */
        public void mo527a(Rect rect) {
            rect.top = C0086g.this.mo510j(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    /* compiled from: AppCompatDelegateImpl */
    class C0091e implements C0170a {
        C0091e() {
        }

        /* renamed from: a */
        public void mo528a() {
        }

        public void onDetachedFromWindow() {
            C0086g.this.mo512l();
        }
    }

    /* renamed from: androidx.appcompat.app.g$f */
    /* compiled from: AppCompatDelegateImpl */
    class C0092f implements Runnable {

        /* renamed from: androidx.appcompat.app.g$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0093a extends C4143f0 {
            C0093a() {
            }

            /* renamed from: b */
            public void mo531b(View view) {
                C0086g.this.f333i0.setAlpha(1.0f);
                C0086g.this.f336l0.mo14707a((C4140e0) null);
                C0086g.this.f336l0 = null;
            }

            /* renamed from: c */
            public void mo532c(View view) {
                C0086g.this.f333i0.setVisibility(0);
            }
        }

        C0092f() {
        }

        public void run() {
            C0086g gVar = C0086g.this;
            gVar.f334j0.showAtLocation(gVar.f333i0, 55, 0, 0);
            C0086g.this.mo513m();
            if (C0086g.this.mo523u()) {
                C0086g.this.f333i0.setAlpha(0.0f);
                C0086g gVar2 = C0086g.this;
                C4135d0 a = C4187x.m14348a(gVar2.f333i0);
                a.mo14704a(1.0f);
                gVar2.f336l0 = a;
                C0086g.this.f336l0.mo14707a((C4140e0) new C0093a());
                return;
            }
            C0086g.this.f333i0.setAlpha(1.0f);
            C0086g.this.f333i0.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    /* compiled from: AppCompatDelegateImpl */
    class C0094g extends C4143f0 {
        C0094g() {
        }

        /* renamed from: b */
        public void mo531b(View view) {
            C0086g.this.f333i0.setAlpha(1.0f);
            C0086g.this.f336l0.mo14707a((C4140e0) null);
            C0086g.this.f336l0 = null;
        }

        /* renamed from: c */
        public void mo532c(View view) {
            C0086g.this.f333i0.setVisibility(0);
            C0086g.this.f333i0.sendAccessibilityEvent(32);
            if (C0086g.this.f333i0.getParent() instanceof View) {
                C4187x.m14345J((View) C0086g.this.f333i0.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$h */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0095h implements C0149a {
        C0095h() {
        }

        /* renamed from: a */
        public boolean mo534a(C0132g gVar) {
            Callback q = C0086g.this.mo519q();
            if (q != null) {
                q.onMenuOpened(108, gVar);
            }
            return true;
        }

        /* renamed from: a */
        public void mo533a(C0132g gVar, boolean z) {
            C0086g.this.mo502b(gVar);
        }
    }

    /* renamed from: androidx.appcompat.app.g$i */
    /* compiled from: AppCompatDelegateImpl */
    class C0096i implements C3890a {

        /* renamed from: a */
        private C3890a f360a;

        /* renamed from: androidx.appcompat.app.g$i$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0097a extends C4143f0 {
            C0097a() {
            }

            /* renamed from: b */
            public void mo531b(View view) {
                C0086g.this.f333i0.setVisibility(8);
                C0086g gVar = C0086g.this;
                PopupWindow popupWindow = gVar.f334j0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f333i0.getParent() instanceof View) {
                    C4187x.m14345J((View) C0086g.this.f333i0.getParent());
                }
                C0086g.this.f333i0.removeAllViews();
                C0086g.this.f336l0.mo14707a((C4140e0) null);
                C0086g.this.f336l0 = null;
            }
        }

        public C0096i(C3890a aVar) {
            this.f360a = aVar;
        }

        /* renamed from: a */
        public boolean mo536a(C3889b bVar, Menu menu) {
            return this.f360a.mo536a(bVar, menu);
        }

        /* renamed from: b */
        public boolean mo538b(C3889b bVar, Menu menu) {
            return this.f360a.mo538b(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo537a(C3889b bVar, MenuItem menuItem) {
            return this.f360a.mo537a(bVar, menuItem);
        }

        /* renamed from: a */
        public void mo535a(C3889b bVar) {
            this.f360a.mo535a(bVar);
            C0086g gVar = C0086g.this;
            if (gVar.f334j0 != null) {
                gVar.f323Y.getDecorView().removeCallbacks(C0086g.this.f335k0);
            }
            C0086g gVar2 = C0086g.this;
            if (gVar2.f333i0 != null) {
                gVar2.mo513m();
                C0086g gVar3 = C0086g.this;
                C4135d0 a = C4187x.m14348a(gVar3.f333i0);
                a.mo14704a(0.0f);
                gVar3.f336l0 = a;
                C0086g.this.f336l0.mo14707a((C4140e0) new C0097a());
            }
            C0086g gVar4 = C0086g.this;
            C0084e eVar = gVar4.f325a0;
            if (eVar != null) {
                eVar.mo436b(gVar4.f332h0);
            }
            C0086g.this.f332h0 = null;
        }
    }

    /* renamed from: androidx.appcompat.app.g$j */
    /* compiled from: AppCompatDelegateImpl */
    class C0098j extends C3901i {
        C0098j(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo539a(ActionMode.Callback callback) {
            C3895a aVar = new C3895a(C0086g.this.f322X, callback);
            C3889b a = C0086g.this.mo493a((C3890a) aVar);
            if (a != null) {
                return aVar.mo13936b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0086g.this.mo499a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0086g.this.mo503b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0132g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0086g.this.mo508h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0086g.this.mo509i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0132g gVar = menu instanceof C0132g ? (C0132g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo803c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo803c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0104o a = C0086g.this.mo491a(0, true);
            if (a != null) {
                C0132g gVar = a.f381j;
                if (gVar != null) {
                    super.onProvideKeyboardShortcuts(list, gVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (C0086g.this.mo520r()) {
                return mo539a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C0086g.this.mo520r() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo539a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.g$k */
    /* compiled from: AppCompatDelegateImpl */
    private class C0099k extends C0100l {

        /* renamed from: c */
        private final PowerManager f364c;

        C0099k(Context context) {
            super();
            this.f364c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo550b() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo551c() {
            if (VERSION.SDK_INT < 21 || !this.f364c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo552d() {
            C0086g.this.mo511k();
        }
    }

    /* renamed from: androidx.appcompat.app.g$l */
    /* compiled from: AppCompatDelegateImpl */
    abstract class C0100l {

        /* renamed from: a */
        private BroadcastReceiver f366a;

        /* renamed from: androidx.appcompat.app.g$l$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0101a extends BroadcastReceiver {
            C0101a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0100l.this.mo552d();
            }
        }

        C0100l() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo553a() {
            BroadcastReceiver broadcastReceiver = this.f366a;
            if (broadcastReceiver != null) {
                try {
                    C0086g.this.f322X.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f366a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract IntentFilter mo550b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract int mo551c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo552d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo554e() {
            mo553a();
            IntentFilter b = mo550b();
            if (b != null && b.countActions() != 0) {
                if (this.f366a == null) {
                    this.f366a = new C0101a();
                }
                C0086g.this.f322X.registerReceiver(this.f366a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$m */
    /* compiled from: AppCompatDelegateImpl */
    private class C0102m extends C0100l {

        /* renamed from: c */
        private final C0111l f369c;

        C0102m(C0111l lVar) {
            super();
            this.f369c = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo550b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo551c() {
            return this.f369c.mo579a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo552d() {
            C0086g.this.mo511k();
        }
    }

    /* renamed from: androidx.appcompat.app.g$n */
    /* compiled from: AppCompatDelegateImpl */
    private class C0103n extends ContentFrameLayout {
        public C0103n(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m617a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0086g.this.mo499a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m617a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0086g.this.mo505e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3868a.m12946c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.g$o */
    /* compiled from: AppCompatDelegateImpl */
    protected static final class C0104o {

        /* renamed from: a */
        int f372a;

        /* renamed from: b */
        int f373b;

        /* renamed from: c */
        int f374c;

        /* renamed from: d */
        int f375d;

        /* renamed from: e */
        int f376e;

        /* renamed from: f */
        int f377f;

        /* renamed from: g */
        ViewGroup f378g;

        /* renamed from: h */
        View f379h;

        /* renamed from: i */
        View f380i;

        /* renamed from: j */
        C0132g f381j;

        /* renamed from: k */
        C0129e f382k;

        /* renamed from: l */
        Context f383l;

        /* renamed from: m */
        boolean f384m;

        /* renamed from: n */
        boolean f385n;

        /* renamed from: o */
        boolean f386o;

        /* renamed from: p */
        public boolean f387p;

        /* renamed from: q */
        boolean f388q = false;

        /* renamed from: r */
        boolean f389r;

        /* renamed from: s */
        Bundle f390s;

        C0104o(int i) {
            this.f372a = i;
        }

        /* renamed from: a */
        public boolean mo562a() {
            boolean z = false;
            if (this.f379h == null) {
                return false;
            }
            if (this.f380i != null) {
                return true;
            }
            if (this.f382k.mo750b().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo560a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C3858a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C3858a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C3866i.Theme_AppCompat_CompactMenu, true);
            }
            C3892d dVar = new C3892d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f383l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C3867j.AppCompatTheme);
            this.f373b = obtainStyledAttributes.getResourceId(C3867j.AppCompatTheme_panelBackground, 0);
            this.f377f = obtainStyledAttributes.getResourceId(C3867j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo561a(C0132g gVar) {
            C0132g gVar2 = this.f381j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo797b((C0148n) this.f382k);
                }
                this.f381j = gVar;
                if (gVar != null) {
                    C0129e eVar = this.f382k;
                    if (eVar != null) {
                        gVar.mo777a((C0148n) eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0150o mo559a(C0149a aVar) {
            if (this.f381j == null) {
                return null;
            }
            if (this.f382k == null) {
                this.f382k = new C0129e(this.f383l, C3864g.abc_list_menu_item_layout);
                this.f382k.mo712a(aVar);
                this.f381j.mo777a((C0148n) this.f382k);
            }
            return this.f382k.mo749a(this.f378g);
        }
    }

    /* renamed from: androidx.appcompat.app.g$p */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0105p implements C0149a {
        C0105p() {
        }

        /* renamed from: a */
        public void mo533a(C0132g gVar, boolean z) {
            C0132g m = gVar.mo823m();
            boolean z2 = m != gVar;
            C0086g gVar2 = C0086g.this;
            if (z2) {
                gVar = m;
            }
            C0104o a = gVar2.mo492a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0086g.this.mo494a(a.f372a, a, m);
                C0086g.this.mo496a(a, true);
                return;
            }
            C0086g.this.mo496a(a, z);
        }

        /* renamed from: a */
        public boolean mo534a(C0132g gVar) {
            if (gVar == null) {
                C0086g gVar2 = C0086g.this;
                if (gVar2.f344t0) {
                    Callback q = gVar2.mo519q();
                    if (q != null && !C0086g.this.f307F0) {
                        q.onMenuOpened(108, gVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        boolean z = false;
        int i = VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f301X0 = z;
        if (f298U0 && !f300W0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0087a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0086g(Activity activity, C0084e eVar) {
        this(activity, null, eVar, activity);
    }

    /* renamed from: A */
    private void m510A() {
        if (this.f323Y == null) {
            Object obj = this.f321W;
            if (obj instanceof Activity) {
                m516a(((Activity) obj).getWindow());
            }
        }
        if (this.f323Y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    private C0100l m511B() {
        if (this.f313L0 == null) {
            this.f313L0 = new C0099k(this.f322X);
        }
        return this.f313L0;
    }

    /* renamed from: C */
    private void m512C() {
        m536z();
        if (this.f344t0 && this.f326b0 == null) {
            Object obj = this.f321W;
            if (obj instanceof Activity) {
                this.f326b0 = new C0113m((Activity) obj, this.f345u0);
            } else if (obj instanceof Dialog) {
                this.f326b0 = new C0113m((Dialog) obj);
            }
            C0076a aVar = this.f326b0;
            if (aVar != null) {
                aVar.mo397c(this.f317P0);
            }
        }
    }

    /* renamed from: D */
    private boolean m513D() {
        if (!this.f311J0 && (this.f321W instanceof Activity)) {
            PackageManager packageManager = this.f322X.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f322X, this.f321W.getClass()), 0);
                this.f310I0 = (activityInfo == null || (activityInfo.configChanges & DateUtils.FORMAT_NO_NOON) == 0) ? false : true;
            } catch (NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f310I0 = false;
            }
        }
        this.f311J0 = true;
        return this.f310I0;
    }

    /* renamed from: E */
    private void m514E() {
        if (this.f338n0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: F */
    private C0083d m515F() {
        Context context = this.f322X;
        while (context != null) {
            if (!(context instanceof C0083d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0083d) context;
            }
        }
        return null;
    }

    /* renamed from: k */
    private void m530k(int i) {
        this.f315N0 = (1 << i) | this.f315N0;
        if (!this.f314M0) {
            C4187x.m14363a(this.f323Y.getDecorView(), this.f316O0);
            this.f314M0 = true;
        }
    }

    /* renamed from: l */
    private int m531l(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        return i;
    }

    /* renamed from: v */
    private void m532v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f339o0.findViewById(16908290);
        View decorView = this.f323Y.getDecorView();
        contentFrameLayout.mo1210a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f322X.obtainStyledAttributes(C3867j.AppCompatTheme);
        obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C3867j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private int m533w() {
        int i = this.f308G0;
        return i != -100 ? i : C0085f.m487j();
    }

    /* renamed from: x */
    private void m534x() {
        C0100l lVar = this.f312K0;
        if (lVar != null) {
            lVar.mo553a();
        }
        C0100l lVar2 = this.f313L0;
        if (lVar2 != null) {
            lVar2.mo553a();
        }
    }

    /* renamed from: y */
    private ViewGroup m535y() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f322X.obtainStyledAttributes(C3867j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C3867j.AppCompatTheme_windowNoTitle, false)) {
                mo479b(1);
            } else if (obtainStyledAttributes.getBoolean(C3867j.AppCompatTheme_windowActionBar, false)) {
                mo479b(108);
            }
            if (obtainStyledAttributes.getBoolean(C3867j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo479b(109);
            }
            if (obtainStyledAttributes.getBoolean(C3867j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo479b(10);
            }
            this.f347w0 = obtainStyledAttributes.getBoolean(C3867j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m510A();
            this.f323Y.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f322X);
            if (this.f348x0) {
                if (this.f346v0) {
                    viewGroup = (ViewGroup) from.inflate(C3864g.abc_screen_simple_overlay_action_mode, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C3864g.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C4187x.m14361a((View) viewGroup, (C4182s) new C0089c());
                } else {
                    ((C0217d0) viewGroup).setOnFitSystemWindowsListener(new C0090d());
                }
            } else if (this.f347w0) {
                viewGroup = (ViewGroup) from.inflate(C3864g.abc_dialog_title_material, null);
                this.f345u0 = false;
                this.f344t0 = false;
            } else if (this.f344t0) {
                TypedValue typedValue = new TypedValue();
                this.f322X.getTheme().resolveAttribute(C3858a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    context = new C3892d(this.f322X, i);
                } else {
                    context = this.f322X;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C3864g.abc_screen_toolbar, null);
                this.f329e0 = (C0301z) viewGroup.findViewById(C3863f.decor_content_parent);
                this.f329e0.setWindowCallback(mo519q());
                if (this.f345u0) {
                    this.f329e0.mo1075a(109);
                }
                if (this.f342r0) {
                    this.f329e0.mo1075a(2);
                }
                if (this.f343s0) {
                    this.f329e0.mo1075a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f329e0 == null) {
                    this.f340p0 = (TextView) viewGroup.findViewById(C3863f.title);
                }
                C0302z0.m1636b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C3863f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f323Y.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f323Y.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0091e());
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f344t0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f345u0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f347w0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f346v0);
            sb.append(", windowNoTitle: ");
            sb.append(this.f348x0);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m536z() {
        if (!this.f338n0) {
            this.f339o0 = m535y();
            CharSequence p = mo518p();
            if (!TextUtils.isEmpty(p)) {
                C0301z zVar = this.f329e0;
                if (zVar != null) {
                    zVar.setWindowTitle(p);
                } else if (mo522t() != null) {
                    mo522t().mo395b(p);
                } else {
                    TextView textView = this.f340p0;
                    if (textView != null) {
                        textView.setText(p);
                    }
                }
            }
            m532v();
            mo495a(this.f339o0);
            this.f338n0 = true;
            C0104o a = mo491a(0, false);
            if (this.f307F0) {
                return;
            }
            if (a == null || a.f381j == null) {
                m530k(108);
            }
        }
    }

    /* renamed from: a */
    public void mo470a(Context context) {
        m522a(false);
        this.f304C0 = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo495a(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo477b(Bundle bundle) {
        m536z();
    }

    /* renamed from: c */
    public C0076a mo480c() {
        m512C();
        return this.f326b0;
    }

    /* renamed from: d */
    public void mo484d(int i) {
        this.f309H0 = i;
    }

    /* renamed from: e */
    public void mo485e() {
        C0076a c = mo480c();
        if (c == null || !c.mo403i()) {
            m530k(0);
        }
    }

    /* renamed from: f */
    public void mo486f() {
        C0085f.m485b((C0085f) this);
        if (this.f314M0) {
            this.f323Y.getDecorView().removeCallbacks(this.f316O0);
        }
        this.f306E0 = false;
        this.f307F0 = true;
        C0076a aVar = this.f326b0;
        if (aVar != null) {
            aVar.mo404j();
        }
        m534x();
    }

    /* renamed from: g */
    public void mo487g() {
        C0076a c = mo480c();
        if (c != null) {
            c.mo398d(true);
        }
    }

    /* renamed from: h */
    public void mo488h() {
        this.f306E0 = true;
        mo511k();
        C0085f.m484a((C0085f) this);
    }

    /* renamed from: i */
    public void mo489i() {
        this.f306E0 = false;
        C0085f.m485b((C0085f) this);
        C0076a c = mo480c();
        if (c != null) {
            c.mo398d(false);
        }
        if (this.f321W instanceof Dialog) {
            m534x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo510j(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f333i0;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f333i0.getLayoutParams();
            z = true;
            if (this.f333i0.isShown()) {
                if (this.f318Q0 == null) {
                    this.f318Q0 = new Rect();
                    this.f319R0 = new Rect();
                }
                Rect rect = this.f318Q0;
                Rect rect2 = this.f319R0;
                rect.set(0, i, 0, 0);
                C0302z0.m1634a(this.f339o0, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f341q0;
                    if (view == null) {
                        this.f341q0 = new View(this.f322X);
                        this.f341q0.setBackgroundColor(this.f322X.getResources().getColor(C3860c.abc_input_method_navigation_guard));
                        this.f339o0.addView(this.f341q0, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f341q0.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f341q0 == null) {
                    z = false;
                }
                if (!this.f346v0 && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f333i0.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f341q0;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo513m() {
        C4135d0 d0Var = this.f336l0;
        if (d0Var != null) {
            d0Var.mo14709a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final Context mo514n() {
        C0076a c = mo480c();
        Context h = c != null ? c.mo402h() : null;
        return h == null ? this.f322X : h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final C0100l mo515o() {
        if (this.f312K0 == null) {
            this.f312K0 = new C0102m(C0111l.m639a(this.f322X));
        }
        return this.f312K0;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo490a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final CharSequence mo518p() {
        Object obj = this.f321W;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f328d0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final Callback mo519q() {
        return this.f323Y.getCallback();
    }

    /* renamed from: r */
    public boolean mo520r() {
        return this.f337m0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo521s() {
        C3889b bVar = this.f332h0;
        if (bVar != null) {
            bVar.mo597a();
            return true;
        }
        C0076a c = mo480c();
        if (c == null || !c.mo400f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final C0076a mo522t() {
        return this.f326b0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo523u() {
        if (this.f338n0) {
            ViewGroup viewGroup = this.f339o0;
            if (viewGroup != null && C4187x.m14340E(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    C0086g(Dialog dialog, C0084e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    /* renamed from: b */
    public MenuInflater mo476b() {
        if (this.f327c0 == null) {
            m512C();
            C0076a aVar = this.f326b0;
            this.f327c0 = new C3896g(aVar != null ? aVar.mo402h() : this.f322X);
        }
        return this.f327c0;
    }

    /* renamed from: d */
    public void mo483d() {
        LayoutInflater from = LayoutInflater.from(this.f322X);
        if (from.getFactory() == null) {
            C4144g.m14187b(from, this);
        } else if (!(from.getFactory2() instanceof C0086g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private C0086g(Context context, Window window, C0084e eVar, Object obj) {
        this.f336l0 = null;
        this.f337m0 = true;
        this.f308G0 = -100;
        this.f316O0 = new C0088b();
        this.f322X = context;
        this.f325a0 = eVar;
        this.f321W = obj;
        if (this.f308G0 == -100 && (this.f321W instanceof Dialog)) {
            C0083d F = m515F();
            if (F != null) {
                this.f308G0 = F.mo442f().mo468a();
            }
        }
        if (this.f308G0 == -100) {
            Integer num = (Integer) f297T0.get(this.f321W.getClass());
            if (num != null) {
                this.f308G0 = num.intValue();
                f297T0.remove(this.f321W.getClass());
            }
        }
        if (window != null) {
            m516a(window);
        }
        C0235h.m1314c();
    }

    /* renamed from: a */
    public void mo472a(Bundle bundle) {
        this.f304C0 = true;
        m522a(false);
        m510A();
        Object obj = this.f321W;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0476g.m2516b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0076a t = mo522t();
                if (t == null) {
                    this.f317P0 = true;
                } else {
                    t.mo397c(true);
                }
            }
        }
        this.f305D0 = true;
    }

    /* renamed from: c */
    public void mo481c(int i) {
        m536z();
        ViewGroup viewGroup = (ViewGroup) this.f339o0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f322X).inflate(i, viewGroup);
        this.f324Z.mo13955a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo507g(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m511B().mo551c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f322X.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                i = mo515o().mo551c();
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo512l() {
        C0301z zVar = this.f329e0;
        if (zVar != null) {
            zVar.mo1099h();
        }
        if (this.f334j0 != null) {
            this.f323Y.getDecorView().removeCallbacks(this.f335k0);
            if (this.f334j0.isShowing()) {
                try {
                    this.f334j0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f334j0 = null;
        }
        mo513m();
        C0104o a = mo491a(0, false);
        if (a != null) {
            C0132g gVar = a.f381j;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo505e(int i) {
        mo496a(mo491a(i, true), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo508h(int i) {
        if (i == 108) {
            C0076a c = mo480c();
            if (c != null) {
                c.mo396b(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m529e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            e.a.o.b r0 = r3.f332h0
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.g$o r2 = r3.mo491a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.z r4 = r3.f329e0
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo1087d()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f322X
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.z r4 = r3.f329e0
            boolean r4 = r4.mo1081a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f307F0
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m525b(r2, r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.z r4 = r3.f329e0
            boolean r4 = r4.mo1092g()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.z r4 = r3.f329e0
            boolean r4 = r4.mo1090f()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f386o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f385n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f384m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f389r
            if (r4 == 0) goto L_0x005b
            r2.f384m = r1
            boolean r4 = r3.m525b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m517a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f386o
            r3.mo496a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f322X
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0086g.m529e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: k */
    public boolean mo511k() {
        return m522a(true);
    }

    /* renamed from: d */
    private boolean m528d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0104o a = mo491a(i, true);
            if (!a.f386o) {
                return m525b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo478b(View view, LayoutParams layoutParams) {
        m536z();
        ViewGroup viewGroup = (ViewGroup) this.f339o0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f324Z.mo13955a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo509i(int i) {
        if (i == 108) {
            C0076a c = mo480c();
            if (c != null) {
                c.mo396b(false);
            }
        } else if (i == 0) {
            C0104o a = mo491a(i, true);
            if (a.f386o) {
                mo496a(a, false);
            }
        }
    }

    /* renamed from: c */
    public void mo482c(Bundle bundle) {
        if (this.f308G0 != -100) {
            f297T0.put(this.f321W.getClass(), Integer.valueOf(this.f308G0));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo506f(int i) {
        C0104o a = mo491a(i, true);
        if (a.f381j != null) {
            Bundle bundle = new Bundle();
            a.f381j.mo796b(bundle);
            if (bundle.size() > 0) {
                a.f390s = bundle;
            }
            a.f381j.mo833s();
            a.f381j.clear();
        }
        a.f389r = true;
        a.f388q = true;
        if ((i == 108 || i == 0) && this.f329e0 != null) {
            C0104o a2 = mo491a(0, false);
            if (a2 != null) {
                a2.f384m = false;
                m525b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo504c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f303B0;
            this.f303B0 = false;
            C0104o a = mo491a(0, false);
            if (a != null && a.f386o) {
                if (!z) {
                    mo496a(a, true);
                }
                return true;
            } else if (mo521s()) {
                return true;
            }
        } else if (i == 82) {
            m529e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public <T extends View> T mo469a(int i) {
        m536z();
        return this.f323Y.findViewById(i);
    }

    /* renamed from: b */
    public boolean mo479b(int i) {
        int l = m531l(i);
        if (this.f348x0 && l == 108) {
            return false;
        }
        if (this.f344t0 && l == 1) {
            this.f344t0 = false;
        }
        if (l == 1) {
            m514E();
            this.f348x0 = true;
            return true;
        } else if (l == 2) {
            m514E();
            this.f342r0 = true;
            return true;
        } else if (l == 5) {
            m514E();
            this.f343s0 = true;
            return true;
        } else if (l == 10) {
            m514E();
            this.f346v0 = true;
            return true;
        } else if (l == 108) {
            m514E();
            this.f344t0 = true;
            return true;
        } else if (l != 109) {
            return this.f323Y.requestFeature(l);
        } else {
            m514E();
            this.f345u0 = true;
            return true;
        }
    }

    /* renamed from: a */
    public void mo471a(Configuration configuration) {
        if (this.f344t0 && this.f338n0) {
            C0076a c = mo480c();
            if (c != null) {
                c.mo391a(configuration);
            }
        }
        C0235h.m1313b().mo1669a(this.f322X);
        m522a(false);
    }

    /* renamed from: c */
    private boolean m527c(C0104o oVar) {
        Context context = this.f322X;
        int i = oVar.f372a;
        if ((i == 0 || i == 108) && this.f329e0 != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C3858a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C3858a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C3858a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3892d dVar = new C3892d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0132g gVar = new C0132g(context);
        gVar.mo776a((C0133a) this);
        oVar.mo561a(gVar);
        return true;
    }

    /* renamed from: a */
    public void mo473a(View view) {
        m536z();
        ViewGroup viewGroup = (ViewGroup) this.f339o0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f324Z.mo13955a().onContentChanged();
    }

    /* renamed from: a */
    public void mo474a(View view, LayoutParams layoutParams) {
        m536z();
        ((ViewGroup) this.f339o0.findViewById(16908290)).addView(view, layoutParams);
        this.f324Z.mo13955a().onContentChanged();
    }

    /* renamed from: a */
    private void m516a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f323Y == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof C0098j)) {
                this.f324Z = new C0098j(callback);
                window.setCallback(this.f324Z);
                C0284t0 a = C0284t0.m1485a(this.f322X, (AttributeSet) null, f299V0);
                Drawable c = a.mo1914c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo1908a();
                this.f323Y = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p096e.p097a.p104o.C3889b mo501b(p096e.p097a.p104o.C3889b.C3890a r8) {
        /*
            r7 = this;
            r7.mo513m()
            e.a.o.b r0 = r7.f332h0
            if (r0 == 0) goto L_0x000a
            r0.mo597a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0086g.C0096i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.g$i r0 = new androidx.appcompat.app.g$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f325a0
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f307F0
            if (r2 != 0) goto L_0x0022
            e.a.o.b r0 = r0.mo429a(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f332h0 = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333i0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f347w0
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f322X
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p096e.p097a.C3858a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f322X
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            e.a.o.d r4 = new e.a.o.d
            android.content.Context r6 = r7.f322X
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f322X
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f333i0 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p096e.p097a.C3858a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f334j0 = r5
            android.widget.PopupWindow r5 = r7.f334j0
            r6 = 2
            androidx.core.widget.C0512h.m2759a(r5, r6)
            android.widget.PopupWindow r5 = r7.f334j0
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f333i0
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f334j0
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p096e.p097a.C3858a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f333i0
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f334j0
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.g$f r0 = new androidx.appcompat.app.g$f
            r0.<init>()
            r7.f335k0 = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f339o0
            int r4 = p096e.p097a.C3863f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo514n()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1463a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f333i0 = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333i0
            if (r0 == 0) goto L_0x0165
            r7.mo513m()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f333i0
            r0.mo1055c()
            e.a.o.e r0 = new e.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f333i0
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f333i0
            android.widget.PopupWindow r6 = r7.f334j0
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo605c()
            boolean r8 = r8.mo536a(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo609i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            r8.mo1053a(r0)
            r7.f332h0 = r0
            boolean r8 = r7.mo523u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            e.h.s.d0 r8 = p096e.p121h.p135s.C4187x.m14348a(r8)
            r8.mo14704a(r0)
            r7.f336l0 = r8
            e.h.s.d0 r8 = r7.f336l0
            androidx.appcompat.app.g$g r0 = new androidx.appcompat.app.g$g
            r0.<init>()
            r8.mo14707a(r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f333i0
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p096e.p121h.p135s.C4187x.m14345J(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f334j0
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f323Y
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f335k0
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f332h0 = r1
        L_0x0165:
            e.a.o.b r8 = r7.f332h0
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.e r0 = r7.f325a0
            if (r0 == 0) goto L_0x0170
            r0.mo432a(r8)
        L_0x0170:
            e.a.o.b r8 = r7.f332h0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0086g.mo501b(e.a.o.b$a):e.a.o.b");
    }

    /* renamed from: c */
    private void m526c(int i, boolean z) {
        Resources resources = this.f322X.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (VERSION.SDK_INT < 26) {
            C0109j.m631a(resources);
        }
        int i2 = this.f309H0;
        if (i2 != 0) {
            this.f322X.setTheme(i2);
            if (VERSION.SDK_INT >= 23) {
                this.f322X.getTheme().applyStyle(this.f309H0, true);
            }
        }
        if (z) {
            Object obj = this.f321W;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0722m) {
                    if (((C0722m) activity).getLifecycle().mo4133a().mo4136a(C0717b.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f306E0) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo475a(CharSequence charSequence) {
        this.f328d0 = charSequence;
        C0301z zVar = this.f329e0;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
        } else if (mo522t() != null) {
            mo522t().mo395b(charSequence);
        } else {
            TextView textView = this.f340p0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public boolean mo500a(C0132g gVar, MenuItem menuItem) {
        Callback q = mo519q();
        if (q != null && !this.f307F0) {
            C0104o a = mo492a((Menu) gVar.mo823m());
            if (a != null) {
                return q.onMenuItemSelected(a.f372a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo497a(C0132g gVar) {
        m518a(gVar, true);
    }

    /* renamed from: a */
    public C3889b mo493a(C3890a aVar) {
        if (aVar != null) {
            C3889b bVar = this.f332h0;
            if (bVar != null) {
                bVar.mo597a();
            }
            C0096i iVar = new C0096i(aVar);
            C0076a c = mo480c();
            if (c != null) {
                this.f332h0 = c.mo390a((C3890a) iVar);
                C3889b bVar2 = this.f332h0;
                if (bVar2 != null) {
                    C0084e eVar = this.f325a0;
                    if (eVar != null) {
                        eVar.mo432a(bVar2);
                    }
                }
            }
            if (this.f332h0 == null) {
                this.f332h0 = mo501b((C3890a) iVar);
            }
            return this.f332h0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo499a(KeyEvent keyEvent) {
        Object obj = this.f321W;
        boolean z = true;
        if ((obj instanceof C4142a) || (obj instanceof C0106h)) {
            View decorView = this.f323Y.getDecorView();
            if (decorView != null && C4141f.m14182a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f324Z.mo13955a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo498a(keyCode, keyEvent) : mo504c(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo498a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f303B0 = z;
        } else if (i == 82) {
            m528d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo490a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f320S0 == null) {
            String string = this.f322X.obtainStyledAttributes(C3867j.AppCompatTheme).getString(C3867j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f320S0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f320S0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.f320S0 = new AppCompatViewInflater();
                }
            }
        }
        if (f298U0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m519a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f320S0.createView(view, str, context, attributeSet, z, f298U0, true, C0300y0.m1623b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo503b(int i, KeyEvent keyEvent) {
        C0076a c = mo480c();
        if (c != null && c.mo393a(i, keyEvent)) {
            return true;
        }
        C0104o oVar = this.f302A0;
        if (oVar == null || !m521a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f302A0 == null) {
                C0104o a = mo491a(0, true);
                m525b(a, keyEvent);
                boolean a2 = m521a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f384m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0104o oVar2 = this.f302A0;
        if (oVar2 != null) {
            oVar2.f385n = true;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m519a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f323Y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C4187x.m14339D((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private void m517a(C0104o oVar, KeyEvent keyEvent) {
        int i;
        if (!oVar.f386o && !this.f307F0) {
            if (oVar.f372a == 0) {
                if ((this.f322X.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback q = mo519q();
            if (q == null || q.onMenuOpened(oVar.f372a, oVar.f381j)) {
                WindowManager windowManager = (WindowManager) this.f322X.getSystemService("window");
                if (windowManager != null && m525b(oVar, keyEvent)) {
                    if (oVar.f378g == null || oVar.f388q) {
                        ViewGroup viewGroup = oVar.f378g;
                        if (viewGroup == null) {
                            if (!m524b(oVar) || oVar.f378g == null) {
                                return;
                            }
                        } else if (oVar.f388q && viewGroup.getChildCount() > 0) {
                            oVar.f378g.removeAllViews();
                        }
                        if (m520a(oVar) && oVar.mo562a()) {
                            LayoutParams layoutParams = oVar.f379h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            oVar.f378g.setBackgroundResource(oVar.f373b);
                            ViewParent parent = oVar.f379h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f379h);
                            }
                            oVar.f378g.addView(oVar.f379h, layoutParams);
                            if (!oVar.f379h.hasFocus()) {
                                oVar.f379h.requestFocus();
                            }
                        }
                    } else {
                        View view = oVar.f380i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                oVar.f385n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, oVar.f375d, oVar.f376e, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                                layoutParams3.gravity = oVar.f374c;
                                layoutParams3.windowAnimations = oVar.f377f;
                                windowManager.addView(oVar.f378g, layoutParams3);
                                oVar.f386o = true;
                            }
                        }
                    }
                    i = -2;
                    oVar.f385n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, oVar.f375d, oVar.f376e, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                    layoutParams32.gravity = oVar.f374c;
                    layoutParams32.windowAnimations = oVar.f377f;
                    windowManager.addView(oVar.f378g, layoutParams32);
                    oVar.f386o = true;
                }
            } else {
                mo496a(oVar, true);
            }
        }
    }

    /* renamed from: b */
    private boolean m524b(C0104o oVar) {
        oVar.mo560a(mo514n());
        oVar.f378g = new C0103n(oVar.f383l);
        oVar.f374c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m525b(C0104o oVar, KeyEvent keyEvent) {
        if (this.f307F0) {
            return false;
        }
        if (oVar.f384m) {
            return true;
        }
        C0104o oVar2 = this.f302A0;
        if (!(oVar2 == null || oVar2 == oVar)) {
            mo496a(oVar2, false);
        }
        Callback q = mo519q();
        if (q != null) {
            oVar.f380i = q.onCreatePanelView(oVar.f372a);
        }
        int i = oVar.f372a;
        boolean z = i == 0 || i == 108;
        if (z) {
            C0301z zVar = this.f329e0;
            if (zVar != null) {
                zVar.mo1085c();
            }
        }
        if (oVar.f380i == null) {
            if (z) {
                mo522t();
            }
            if (oVar.f381j == null || oVar.f389r) {
                if (oVar.f381j == null && (!m527c(oVar) || oVar.f381j == null)) {
                    return false;
                }
                if (z && this.f329e0 != null) {
                    if (this.f330f0 == null) {
                        this.f330f0 = new C0095h();
                    }
                    this.f329e0.mo1076a(oVar.f381j, this.f330f0);
                }
                oVar.f381j.mo833s();
                if (!q.onCreatePanelMenu(oVar.f372a, oVar.f381j)) {
                    oVar.mo561a((C0132g) null);
                    if (z) {
                        C0301z zVar2 = this.f329e0;
                        if (zVar2 != null) {
                            zVar2.mo1076a(null, this.f330f0);
                        }
                    }
                    return false;
                }
                oVar.f389r = false;
            }
            oVar.f381j.mo833s();
            Bundle bundle = oVar.f390s;
            if (bundle != null) {
                oVar.f381j.mo774a(bundle);
                oVar.f390s = null;
            }
            if (!q.onPreparePanel(0, oVar.f380i, oVar.f381j)) {
                if (z) {
                    C0301z zVar3 = this.f329e0;
                    if (zVar3 != null) {
                        zVar3.mo1076a(null, this.f330f0);
                    }
                }
                oVar.f381j.mo830r();
                return false;
            }
            oVar.f387p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f381j.setQwertyMode(oVar.f387p);
            oVar.f381j.mo830r();
        }
        oVar.f384m = true;
        oVar.f385n = false;
        this.f302A0 = oVar;
        return true;
    }

    /* renamed from: a */
    private void m518a(C0132g gVar, boolean z) {
        C0301z zVar = this.f329e0;
        if (zVar == null || !zVar.mo1087d() || (ViewConfiguration.get(this.f322X).hasPermanentMenuKey() && !this.f329e0.mo1089e())) {
            C0104o a = mo491a(0, true);
            a.f388q = true;
            mo496a(a, false);
            m517a(a, (KeyEvent) null);
            return;
        }
        Callback q = mo519q();
        if (this.f329e0.mo1081a() && z) {
            this.f329e0.mo1090f();
            if (!this.f307F0) {
                q.onPanelClosed(108, mo491a(0, true).f381j);
            }
        } else if (q != null && !this.f307F0) {
            if (this.f314M0 && (this.f315N0 & 1) != 0) {
                this.f323Y.getDecorView().removeCallbacks(this.f316O0);
                this.f316O0.run();
            }
            C0104o a2 = mo491a(0, true);
            C0132g gVar2 = a2.f381j;
            if (gVar2 != null && !a2.f389r && q.onPreparePanel(0, a2.f380i, gVar2)) {
                q.onMenuOpened(108, a2.f381j);
                this.f329e0.mo1092g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo502b(C0132g gVar) {
        if (!this.f349y0) {
            this.f349y0 = true;
            this.f329e0.mo1099h();
            Callback q = mo519q();
            if (q != null && !this.f307F0) {
                q.onPanelClosed(108, gVar);
            }
            this.f349y0 = false;
        }
    }

    /* renamed from: b */
    private boolean m523b(int i, boolean z) {
        int i2 = this.f322X.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean D = m513D();
        boolean z3 = false;
        if ((f301X0 || i3 != i2) && !D && VERSION.SDK_INT >= 17 && !this.f304C0 && (this.f321W instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f321W).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f322X.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !D && this.f304C0 && (VERSION.SDK_INT >= 17 || this.f305D0)) {
            Object obj = this.f321W;
            if (obj instanceof Activity) {
                C0460a.m2494b((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m526c(i3, D);
        }
        if (z2) {
            Object obj2 = this.f321W;
            if (obj2 instanceof C0083d) {
                ((C0083d) obj2).mo439c(i);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m520a(C0104o oVar) {
        View view = oVar.f380i;
        boolean z = true;
        if (view != null) {
            oVar.f379h = view;
            return true;
        } else if (oVar.f381j == null) {
            return false;
        } else {
            if (this.f331g0 == null) {
                this.f331g0 = new C0105p();
            }
            oVar.f379h = (View) oVar.mo559a((C0149a) this.f331g0);
            if (oVar.f379h == null) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo496a(C0104o oVar, boolean z) {
        if (z && oVar.f372a == 0) {
            C0301z zVar = this.f329e0;
            if (zVar != null && zVar.mo1081a()) {
                mo502b(oVar.f381j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f322X.getSystemService("window");
        if (windowManager != null && oVar.f386o) {
            ViewGroup viewGroup = oVar.f378g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo494a(oVar.f372a, oVar, null);
                }
            }
        }
        oVar.f384m = false;
        oVar.f385n = false;
        oVar.f386o = false;
        oVar.f379h = null;
        oVar.f388q = true;
        if (this.f302A0 == oVar) {
            this.f302A0 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo494a(int i, C0104o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i >= 0) {
                C0104o[] oVarArr = this.f350z0;
                if (i < oVarArr.length) {
                    oVar = oVarArr[i];
                }
            }
            if (oVar != null) {
                menu = oVar.f381j;
            }
        }
        if ((oVar == null || oVar.f386o) && !this.f307F0) {
            this.f324Z.mo13955a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0104o mo492a(Menu menu) {
        C0104o[] oVarArr = this.f350z0;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0104o oVar = oVarArr[i];
            if (oVar != null && oVar.f381j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0104o mo491a(int i, boolean z) {
        C0104o[] oVarArr = this.f350z0;
        if (oVarArr == null || oVarArr.length <= i) {
            C0104o[] oVarArr2 = new C0104o[(i + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f350z0 = oVarArr2;
            oVarArr = oVarArr2;
        }
        C0104o oVar = oVarArr[i];
        if (oVar != null) {
            return oVar;
        }
        C0104o oVar2 = new C0104o(i);
        oVarArr[i] = oVar2;
        return oVar2;
    }

    /* renamed from: a */
    private boolean m521a(C0104o oVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (oVar.f384m || m525b(oVar, keyEvent)) {
            C0132g gVar = oVar.f381j;
            if (gVar != null) {
                z = gVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f329e0 == null) {
            mo496a(oVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m522a(boolean z) {
        if (this.f307F0) {
            return false;
        }
        int w = m533w();
        boolean b = m523b(mo507g(w), z);
        if (w == 0) {
            mo515o().mo554e();
        } else {
            C0100l lVar = this.f312K0;
            if (lVar != null) {
                lVar.mo553a();
            }
        }
        if (w == 3) {
            m511B().mo554e();
        } else {
            C0100l lVar2 = this.f313L0;
            if (lVar2 != null) {
                lVar2.mo553a();
            }
        }
        return b;
    }

    /* renamed from: a */
    public int mo468a() {
        return this.f308G0;
    }
}
