package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0076a.C0078b;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0132g.C0133a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0163d;
import androidx.appcompat.widget.C0201a0;
import androidx.appcompat.widget.C0254m0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p096e.p097a.C3858a;
import p096e.p097a.C3863f;
import p096e.p097a.C3867j;
import p096e.p097a.p104o.C3888a;
import p096e.p097a.p104o.C3889b;
import p096e.p097a.p104o.C3889b.C3890a;
import p096e.p097a.p104o.C3896g;
import p096e.p097a.p104o.C3899h;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4143f0;
import p096e.p121h.p135s.C4145g0;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.app.m */
/* compiled from: WindowDecorActionBar */
public class C0113m extends C0076a implements C0163d {

    /* renamed from: B */
    private static final Interpolator f417B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f418C = new DecelerateInterpolator();

    /* renamed from: A */
    final C4145g0 f419A = new C0116c();

    /* renamed from: a */
    Context f420a;

    /* renamed from: b */
    private Context f421b;

    /* renamed from: c */
    ActionBarOverlayLayout f422c;

    /* renamed from: d */
    ActionBarContainer f423d;

    /* renamed from: e */
    C0201a0 f424e;

    /* renamed from: f */
    ActionBarContextView f425f;

    /* renamed from: g */
    View f426g;

    /* renamed from: h */
    C0254m0 f427h;

    /* renamed from: i */
    private boolean f428i;

    /* renamed from: j */
    C0117d f429j;

    /* renamed from: k */
    C3889b f430k;

    /* renamed from: l */
    C3890a f431l;

    /* renamed from: m */
    private boolean f432m;

    /* renamed from: n */
    private ArrayList<C0078b> f433n = new ArrayList<>();

    /* renamed from: o */
    private boolean f434o;

    /* renamed from: p */
    private int f435p = 0;

    /* renamed from: q */
    boolean f436q = true;

    /* renamed from: r */
    boolean f437r;

    /* renamed from: s */
    boolean f438s;

    /* renamed from: t */
    private boolean f439t;

    /* renamed from: u */
    private boolean f440u = true;

    /* renamed from: v */
    C3899h f441v;

    /* renamed from: w */
    private boolean f442w;

    /* renamed from: x */
    boolean f443x;

    /* renamed from: y */
    final C4140e0 f444y = new C0114a();

    /* renamed from: z */
    final C4140e0 f445z = new C0115b();

    /* renamed from: androidx.appcompat.app.m$a */
    /* compiled from: WindowDecorActionBar */
    class C0114a extends C4143f0 {
        C0114a() {
        }

        /* renamed from: b */
        public void mo531b(View view) {
            C0113m mVar = C0113m.this;
            if (mVar.f436q) {
                View view2 = mVar.f426g;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    C0113m.this.f423d.setTranslationY(0.0f);
                }
            }
            C0113m.this.f423d.setVisibility(8);
            C0113m.this.f423d.setTransitioning(false);
            C0113m mVar2 = C0113m.this;
            mVar2.f441v = null;
            mVar2.mo594l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0113m.this.f422c;
            if (actionBarOverlayLayout != null) {
                C4187x.m14345J(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    /* compiled from: WindowDecorActionBar */
    class C0115b extends C4143f0 {
        C0115b() {
        }

        /* renamed from: b */
        public void mo531b(View view) {
            C0113m mVar = C0113m.this;
            mVar.f441v = null;
            mVar.f423d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    /* compiled from: WindowDecorActionBar */
    class C0116c implements C4145g0 {
        C0116c() {
        }

        /* renamed from: a */
        public void mo596a(View view) {
            ((View) C0113m.this.f423d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    /* compiled from: WindowDecorActionBar */
    public class C0117d extends C3889b implements C0133a {

        /* renamed from: V */
        private final Context f449V;

        /* renamed from: W */
        private final C0132g f450W;

        /* renamed from: X */
        private C3890a f451X;

        /* renamed from: Y */
        private WeakReference<View> f452Y;

        public C0117d(Context context, C3890a aVar) {
            this.f449V = context;
            this.f451X = aVar;
            C0132g gVar = new C0132g(context);
            gVar.mo800c(1);
            this.f450W = gVar;
            this.f450W.mo776a((C0133a) this);
        }

        /* renamed from: a */
        public void mo597a() {
            C0113m mVar = C0113m.this;
            if (mVar.f429j == this) {
                if (!C0113m.m645a(mVar.f437r, mVar.f438s, false)) {
                    C0113m mVar2 = C0113m.this;
                    mVar2.f430k = this;
                    mVar2.f431l = this.f451X;
                } else {
                    this.f451X.mo535a(this);
                }
                this.f451X = null;
                C0113m.this.mo588e(false);
                C0113m.this.f425f.mo1052a();
                C0113m.this.f424e.mo1504k().sendAccessibilityEvent(32);
                C0113m mVar3 = C0113m.this;
                mVar3.f422c.setHideOnContentScrollEnabled(mVar3.f443x);
                C0113m.this.f429j = null;
            }
        }

        /* renamed from: b */
        public void mo604b(CharSequence charSequence) {
            C0113m.this.f425f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo605c() {
            return this.f450W;
        }

        /* renamed from: d */
        public MenuInflater mo606d() {
            return new C3896g(this.f449V);
        }

        /* renamed from: e */
        public CharSequence mo607e() {
            return C0113m.this.f425f.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo608g() {
            return C0113m.this.f425f.getTitle();
        }

        /* renamed from: i */
        public void mo609i() {
            if (C0113m.this.f429j == this) {
                this.f450W.mo833s();
                try {
                    this.f451X.mo538b(this, this.f450W);
                } finally {
                    this.f450W.mo830r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo610j() {
            return C0113m.this.f425f.mo1054b();
        }

        /* renamed from: k */
        public boolean mo611k() {
            this.f450W.mo833s();
            try {
                return this.f451X.mo536a((C3889b) this, (Menu) this.f450W);
            } finally {
                this.f450W.mo830r();
            }
        }

        /* renamed from: b */
        public void mo603b(int i) {
            mo604b((CharSequence) C0113m.this.f420a.getResources().getString(i));
        }

        /* renamed from: b */
        public View mo602b() {
            WeakReference<View> weakReference = this.f452Y;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: a */
        public void mo599a(View view) {
            C0113m.this.f425f.setCustomView(view);
            this.f452Y = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo600a(CharSequence charSequence) {
            C0113m.this.f425f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo598a(int i) {
            mo600a((CharSequence) C0113m.this.f420a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo601a(boolean z) {
            super.mo601a(z);
            C0113m.this.f425f.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo500a(C0132g gVar, MenuItem menuItem) {
            C3890a aVar = this.f451X;
            if (aVar != null) {
                return aVar.mo537a((C3889b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo497a(C0132g gVar) {
            if (this.f451X != null) {
                mo609i();
                C0113m.this.f425f.mo1056d();
            }
        }
    }

    public C0113m(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m646b(decorView);
        if (!z) {
            this.f426g = decorView.findViewById(16908290);
        }
    }

    /* renamed from: a */
    private C0201a0 m644a(View view) {
        if (view instanceof C0201a0) {
            return (C0201a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m645a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m646b(View view) {
        this.f422c = (ActionBarOverlayLayout) view.findViewById(C3863f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f422c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f424e = m644a(view.findViewById(C3863f.action_bar));
        this.f425f = (ActionBarContextView) view.findViewById(C3863f.action_context_bar);
        this.f423d = (ActionBarContainer) view.findViewById(C3863f.action_bar_container);
        C0201a0 a0Var = this.f424e;
        if (a0Var == null || this.f425f == null || this.f423d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0113m.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f420a = a0Var.mo1490b();
        boolean z = (this.f424e.mo1505l() & 4) != 0;
        if (z) {
            this.f428i = true;
        }
        C3888a a = C3888a.m13030a(this.f420a);
        mo593j(a.mo13901a() || z);
        m647k(a.mo13906f());
        TypedArray obtainStyledAttributes = this.f420a.obtainStyledAttributes(null, C3867j.ActionBar, C3858a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C3867j.ActionBar_hideOnContentScroll, false)) {
            mo592i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3867j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo581a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m647k(boolean z) {
        this.f434o = z;
        if (!this.f434o) {
            this.f424e.mo1487a((C0254m0) null);
            this.f423d.setTabContainer(this.f427h);
        } else {
            this.f423d.setTabContainer(null);
            this.f424e.mo1487a(this.f427h);
        }
        boolean z2 = true;
        boolean z3 = mo595m() == 2;
        C0254m0 m0Var = this.f427h;
        if (m0Var != null) {
            if (z3) {
                m0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f422c;
                if (actionBarOverlayLayout != null) {
                    C4187x.m14345J(actionBarOverlayLayout);
                }
            } else {
                m0Var.setVisibility(8);
            }
        }
        this.f424e.mo1492b(!this.f434o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f422c;
        if (this.f434o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: n */
    private void m649n() {
        if (this.f439t) {
            this.f439t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f422c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m648l(false);
        }
    }

    /* renamed from: o */
    private boolean m650o() {
        return C4187x.m14340E(this.f423d);
    }

    /* renamed from: p */
    private void m651p() {
        if (!this.f439t) {
            this.f439t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f422c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m648l(false);
        }
    }

    /* renamed from: b */
    public void mo585b() {
    }

    /* renamed from: c */
    public void mo586c() {
        if (!this.f438s) {
            this.f438s = true;
            m648l(true);
        }
    }

    /* renamed from: d */
    public void mo398d(boolean z) {
        this.f442w = z;
        if (!z) {
            C3899h hVar = this.f441v;
            if (hVar != null) {
                hVar.mo13951a();
            }
        }
    }

    /* renamed from: e */
    public void mo588e(boolean z) {
        C4135d0 d0Var;
        C4135d0 d0Var2;
        if (z) {
            m651p();
        } else {
            m649n();
        }
        if (m650o()) {
            if (z) {
                d0Var = this.f424e.mo1484a(4, 100);
                d0Var2 = this.f425f.mo1478a(0, 200);
            } else {
                d0Var2 = this.f424e.mo1484a(0, 200);
                d0Var = this.f425f.mo1478a(8, 100);
            }
            C3899h hVar = new C3899h();
            hVar.mo13949a(d0Var, d0Var2);
            hVar.mo13953c();
        } else if (z) {
            this.f424e.mo1494c(4);
            this.f425f.setVisibility(0);
        } else {
            this.f424e.mo1494c(0);
            this.f425f.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo589f(boolean z) {
        C3899h hVar = this.f441v;
        if (hVar != null) {
            hVar.mo13951a();
        }
        if (this.f435p != 0 || (!this.f442w && !z)) {
            this.f444y.mo531b(null);
            return;
        }
        this.f423d.setAlpha(1.0f);
        this.f423d.setTransitioning(true);
        C3899h hVar2 = new C3899h();
        float f = (float) (-this.f423d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f423d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C4135d0 a = C4187x.m14348a(this.f423d);
        a.mo14713c(f);
        a.mo14708a(this.f419A);
        hVar2.mo13948a(a);
        if (this.f436q) {
            View view = this.f426g;
            if (view != null) {
                C4135d0 a2 = C4187x.m14348a(view);
                a2.mo14713c(f);
                hVar2.mo13948a(a2);
            }
        }
        hVar2.mo13947a(f417B);
        hVar2.mo13946a(250);
        hVar2.mo13950a(this.f444y);
        this.f441v = hVar2;
        hVar2.mo13953c();
    }

    /* renamed from: g */
    public int mo401g() {
        return this.f424e.mo1505l();
    }

    /* renamed from: h */
    public void mo591h(boolean z) {
        mo583a(z ? 4 : 0, 4);
    }

    /* renamed from: i */
    public void mo592i(boolean z) {
        if (!z || this.f422c.mo1100i()) {
            this.f443x = z;
            this.f422c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public void mo593j(boolean z) {
        this.f424e.mo1488a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo594l() {
        C3890a aVar = this.f431l;
        if (aVar != null) {
            aVar.mo535a(this.f430k);
            this.f430k = null;
            this.f431l = null;
        }
    }

    /* renamed from: m */
    public int mo595m() {
        return this.f424e.mo1503j();
    }

    /* renamed from: g */
    public void mo590g(boolean z) {
        C3899h hVar = this.f441v;
        if (hVar != null) {
            hVar.mo13951a();
        }
        this.f423d.setVisibility(0);
        if (this.f435p != 0 || (!this.f442w && !z)) {
            this.f423d.setAlpha(1.0f);
            this.f423d.setTranslationY(0.0f);
            if (this.f436q) {
                View view = this.f426g;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f445z.mo531b(null);
        } else {
            this.f423d.setTranslationY(0.0f);
            float f = (float) (-this.f423d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f423d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f423d.setTranslationY(f);
            C3899h hVar2 = new C3899h();
            C4135d0 a = C4187x.m14348a(this.f423d);
            a.mo14713c(0.0f);
            a.mo14708a(this.f419A);
            hVar2.mo13948a(a);
            if (this.f436q) {
                View view2 = this.f426g;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    C4135d0 a2 = C4187x.m14348a(this.f426g);
                    a2.mo14713c(0.0f);
                    hVar2.mo13948a(a2);
                }
            }
            hVar2.mo13947a(f418C);
            hVar2.mo13946a(250);
            hVar2.mo13950a(this.f445z);
            this.f441v = hVar2;
            hVar2.mo13953c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f422c;
        if (actionBarOverlayLayout != null) {
            C4187x.m14345J(actionBarOverlayLayout);
        }
    }

    /* renamed from: h */
    public Context mo402h() {
        if (this.f421b == null) {
            TypedValue typedValue = new TypedValue();
            this.f420a.getTheme().resolveAttribute(C3858a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f421b = new ContextThemeWrapper(this.f420a, i);
            } else {
                this.f421b = this.f420a;
            }
        }
        return this.f421b;
    }

    /* renamed from: c */
    public void mo397c(boolean z) {
        if (!this.f428i) {
            mo591h(z);
        }
    }

    /* renamed from: d */
    public void mo587d() {
        C3899h hVar = this.f441v;
        if (hVar != null) {
            hVar.mo13951a();
            this.f441v = null;
        }
    }

    /* renamed from: l */
    private void m648l(boolean z) {
        if (m645a(this.f437r, this.f438s, this.f439t)) {
            if (!this.f440u) {
                this.f440u = true;
                mo590g(z);
            }
        } else if (this.f440u) {
            this.f440u = false;
            mo589f(z);
        }
    }

    /* renamed from: a */
    public void mo581a(float f) {
        C4187x.m14372b((View) this.f423d, f);
    }

    /* renamed from: a */
    public void mo391a(Configuration configuration) {
        m647k(C3888a.m13030a(this.f420a).mo13906f());
    }

    /* renamed from: a */
    public void mo582a(int i) {
        this.f435p = i;
    }

    /* renamed from: a */
    public void mo392a(CharSequence charSequence) {
        this.f424e.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo583a(int i, int i2) {
        int l = this.f424e.mo1505l();
        if ((i2 & 4) != 0) {
            this.f428i = true;
        }
        this.f424e.mo1485a((i & i2) | ((~i2) & l));
    }

    public C0113m(Dialog dialog) {
        new ArrayList();
        m646b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public C3889b mo390a(C3890a aVar) {
        C0117d dVar = this.f429j;
        if (dVar != null) {
            dVar.mo597a();
        }
        this.f422c.setHideOnContentScrollEnabled(false);
        this.f425f.mo1055c();
        C0117d dVar2 = new C0117d(this.f425f.getContext(), aVar);
        if (!dVar2.mo611k()) {
            return null;
        }
        this.f429j = dVar2;
        dVar2.mo609i();
        this.f425f.mo1053a(dVar2);
        mo588e(true);
        this.f425f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: b */
    public void mo396b(boolean z) {
        if (z != this.f432m) {
            this.f432m = z;
            int size = this.f433n.size();
            for (int i = 0; i < size; i++) {
                ((C0078b) this.f433n.get(i)).mo406a(z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo400f() {
        C0201a0 a0Var = this.f424e;
        if (a0Var == null || !a0Var.mo1502i()) {
            return false;
        }
        this.f424e.collapseActionView();
        return true;
    }

    /* renamed from: a */
    public void mo584a(boolean z) {
        this.f436q = z;
    }

    /* renamed from: b */
    public void mo395b(CharSequence charSequence) {
        this.f424e.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo580a() {
        if (this.f438s) {
            this.f438s = false;
            m648l(true);
        }
    }

    /* renamed from: a */
    public boolean mo393a(int i, KeyEvent keyEvent) {
        C0117d dVar = this.f429j;
        if (dVar == null) {
            return false;
        }
        Menu c = dVar.mo605c();
        if (c == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }
}
