package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.C0120a;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.widget.Toolbar.C0194e;
import p096e.p097a.C3858a;
import p096e.p097a.C3862e;
import p096e.p097a.C3863f;
import p096e.p097a.C3865h;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4143f0;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.u0 */
/* compiled from: ToolbarWidgetWrapper */
public class C0286u0 implements C0201a0 {

    /* renamed from: a */
    Toolbar f1244a;

    /* renamed from: b */
    private int f1245b;

    /* renamed from: c */
    private View f1246c;

    /* renamed from: d */
    private View f1247d;

    /* renamed from: e */
    private Drawable f1248e;

    /* renamed from: f */
    private Drawable f1249f;

    /* renamed from: g */
    private Drawable f1250g;

    /* renamed from: h */
    private boolean f1251h;

    /* renamed from: i */
    CharSequence f1252i;

    /* renamed from: j */
    private CharSequence f1253j;

    /* renamed from: k */
    private CharSequence f1254k;

    /* renamed from: l */
    Callback f1255l;

    /* renamed from: m */
    boolean f1256m;

    /* renamed from: n */
    private C0205c f1257n;

    /* renamed from: o */
    private int f1258o;

    /* renamed from: p */
    private int f1259p;

    /* renamed from: q */
    private Drawable f1260q;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0287a implements OnClickListener {

        /* renamed from: c */
        final C0120a f1262c;

        C0287a() {
            C0120a aVar = new C0120a(C0286u0.this.f1244a.getContext(), 0, 16908332, 0, 0, C0286u0.this.f1252i);
            this.f1262c = aVar;
        }

        public void onClick(View view) {
            C0286u0 u0Var = C0286u0.this;
            Callback callback = u0Var.f1255l;
            if (callback != null && u0Var.f1256m) {
                callback.onMenuItemSelected(0, this.f1262c);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0288b extends C4143f0 {

        /* renamed from: a */
        private boolean f1263a = false;

        /* renamed from: b */
        final /* synthetic */ int f1264b;

        C0288b(int i) {
            this.f1264b = i;
        }

        /* renamed from: a */
        public void mo1483a(View view) {
            this.f1263a = true;
        }

        /* renamed from: b */
        public void mo531b(View view) {
            if (!this.f1263a) {
                C0286u0.this.f1244a.setVisibility(this.f1264b);
            }
        }

        /* renamed from: c */
        public void mo532c(View view) {
            C0286u0.this.f1244a.setVisibility(0);
        }
    }

    public C0286u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C3865h.abc_action_bar_up_description, C3862e.abc_ic_ab_back_material);
    }

    /* renamed from: c */
    private void m1508c(CharSequence charSequence) {
        this.f1252i = charSequence;
        if ((this.f1245b & 8) != 0) {
            this.f1244a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m1509o() {
        if (this.f1244a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1260q = this.f1244a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m1510p() {
        if ((this.f1245b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1254k)) {
            this.f1244a.setNavigationContentDescription(this.f1259p);
        } else {
            this.f1244a.setNavigationContentDescription(this.f1254k);
        }
    }

    /* renamed from: q */
    private void m1511q() {
        if ((this.f1245b & 4) != 0) {
            Toolbar toolbar = this.f1244a;
            Drawable drawable = this.f1250g;
            if (drawable == null) {
                drawable = this.f1260q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1244a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: r */
    private void m1512r() {
        Drawable drawable;
        int i = this.f1245b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1249f;
            if (drawable == null) {
                drawable = this.f1248e;
            }
        } else {
            drawable = this.f1248e;
        }
        this.f1244a.setLogo(drawable);
    }

    /* renamed from: a */
    public void mo1925a(Drawable drawable) {
        this.f1249f = drawable;
        m1512r();
    }

    /* renamed from: a */
    public void mo1488a(boolean z) {
    }

    /* renamed from: b */
    public Context mo1490b() {
        return this.f1244a.getContext();
    }

    public void collapseActionView() {
        this.f1244a.mo1374c();
    }

    /* renamed from: d */
    public void mo1930d(int i) {
        if (i != this.f1259p) {
            this.f1259p = i;
            if (TextUtils.isEmpty(this.f1244a.getNavigationContentDescription())) {
                mo1931e(this.f1259p);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1497e() {
        return this.f1244a.mo1413h();
    }

    /* renamed from: f */
    public boolean mo1498f() {
        return this.f1244a.mo1379g();
    }

    /* renamed from: g */
    public boolean mo1499g() {
        return this.f1244a.mo1416k();
    }

    public CharSequence getTitle() {
        return this.f1244a.getTitle();
    }

    /* renamed from: h */
    public void mo1501h() {
        this.f1244a.mo1376d();
    }

    /* renamed from: i */
    public boolean mo1502i() {
        return this.f1244a.mo1378f();
    }

    /* renamed from: j */
    public int mo1503j() {
        return this.f1258o;
    }

    /* renamed from: k */
    public ViewGroup mo1504k() {
        return this.f1244a;
    }

    /* renamed from: l */
    public int mo1505l() {
        return this.f1245b;
    }

    /* renamed from: m */
    public void mo1506m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: n */
    public void mo1507n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C3868a.m12946c(mo1490b(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1251h = true;
        m1508c(charSequence);
    }

    public void setWindowCallback(Callback callback) {
        this.f1255l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1251h) {
            m1508c(charSequence);
        }
    }

    public C0286u0(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1258o = 0;
        this.f1259p = 0;
        this.f1244a = toolbar;
        this.f1252i = toolbar.getTitle();
        this.f1253j = toolbar.getSubtitle();
        this.f1251h = this.f1252i != null;
        this.f1250g = toolbar.getNavigationIcon();
        C0284t0 a = C0284t0.m1486a(toolbar.getContext(), null, C3867j.ActionBar, C3858a.actionBarStyle, 0);
        this.f1260q = a.mo1912b(C3867j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo1918e(C3867j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                setTitle(e);
            }
            CharSequence e2 = a.mo1918e(C3867j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo1929b(e2);
            }
            Drawable b = a.mo1912b(C3867j.ActionBar_logo);
            if (b != null) {
                mo1925a(b);
            }
            Drawable b2 = a.mo1912b(C3867j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1250g == null) {
                Drawable drawable = this.f1260q;
                if (drawable != null) {
                    mo1928b(drawable);
                }
            }
            mo1485a(a.mo1915d(C3867j.ActionBar_displayOptions, 0));
            int g = a.mo1921g(C3867j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo1926a(LayoutInflater.from(this.f1244a.getContext()).inflate(g, this.f1244a, false));
                mo1485a(this.f1245b | 16);
            }
            int f = a.mo1919f(C3867j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f1244a.getLayoutParams();
                layoutParams.height = f;
                this.f1244a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo1911b(C3867j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo1911b(C3867j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1244a.mo1369a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo1921g(C3867j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1244a;
                toolbar2.mo1372b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo1921g(C3867j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1244a;
                toolbar3.mo1370a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo1921g(C3867j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1244a.setPopupTheme(g4);
            }
        } else {
            this.f1245b = m1509o();
        }
        a.mo1908a();
        mo1930d(i);
        this.f1254k = this.f1244a.getNavigationContentDescription();
        this.f1244a.setNavigationOnClickListener(new C0287a());
    }

    /* renamed from: b */
    public void mo1929b(CharSequence charSequence) {
        this.f1253j = charSequence;
        if ((this.f1245b & 8) != 0) {
            this.f1244a.setSubtitle(charSequence);
        }
    }

    /* renamed from: e */
    public void mo1931e(int i) {
        mo1927a((CharSequence) i == 0 ? null : mo1490b().getString(i));
    }

    public void setIcon(Drawable drawable) {
        this.f1248e = drawable;
        m1512r();
    }

    /* renamed from: a */
    public boolean mo1489a() {
        return this.f1244a.mo1414i();
    }

    /* renamed from: a */
    public void mo1486a(Menu menu, C0149a aVar) {
        if (this.f1257n == null) {
            this.f1257n = new C0205c(this.f1244a.getContext());
            this.f1257n.mo707a(C3863f.action_menu_presenter);
        }
        this.f1257n.mo712a(aVar);
        this.f1244a.mo1371a((C0132g) menu, this.f1257n);
    }

    /* renamed from: c */
    public void mo1493c() {
        this.f1256m = true;
    }

    /* renamed from: b */
    public void mo1491b(int i) {
        mo1925a(i != 0 ? C3868a.m12946c(mo1490b(), i) : null);
    }

    /* renamed from: c */
    public void mo1494c(int i) {
        this.f1244a.setVisibility(i);
    }

    /* renamed from: d */
    public boolean mo1496d() {
        return this.f1244a.mo1373b();
    }

    /* renamed from: b */
    public void mo1492b(boolean z) {
        this.f1244a.setCollapsible(z);
    }

    /* renamed from: b */
    public void mo1928b(Drawable drawable) {
        this.f1250g = drawable;
        m1511q();
    }

    /* renamed from: a */
    public void mo1485a(int i) {
        int i2 = this.f1245b ^ i;
        this.f1245b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1510p();
                }
                m1511q();
            }
            if ((i2 & 3) != 0) {
                m1512r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1244a.setTitle(this.f1252i);
                    this.f1244a.setSubtitle(this.f1253j);
                } else {
                    this.f1244a.setTitle((CharSequence) null);
                    this.f1244a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f1247d;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f1244a.addView(view);
                } else {
                    this.f1244a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1487a(C0254m0 m0Var) {
        View view = this.f1246c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1244a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1246c);
            }
        }
        this.f1246c = m0Var;
        if (m0Var != null && this.f1258o == 2) {
            this.f1244a.addView(this.f1246c, 0);
            C0194e eVar = (C0194e) this.f1246c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f288a = 8388691;
            m0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo1926a(View view) {
        View view2 = this.f1247d;
        if (!(view2 == null || (this.f1245b & 16) == 0)) {
            this.f1244a.removeView(view2);
        }
        this.f1247d = view;
        if (view != null && (this.f1245b & 16) != 0) {
            this.f1244a.addView(this.f1247d);
        }
    }

    /* renamed from: a */
    public C4135d0 mo1484a(int i, long j) {
        C4135d0 a = C4187x.m14348a(this.f1244a);
        a.mo14704a(i == 0 ? 1.0f : 0.0f);
        a.mo14705a(j);
        a.mo14707a((C4140e0) new C0288b(i));
        return a;
    }

    /* renamed from: a */
    public void mo1927a(CharSequence charSequence) {
        this.f1254k = charSequence;
        m1510p();
    }
}
