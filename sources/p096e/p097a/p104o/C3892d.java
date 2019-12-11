package p096e.p097a.p104o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import p096e.p097a.C3866i;

/* renamed from: e.a.o.d */
/* compiled from: ContextThemeWrapper */
public class C3892d extends ContextWrapper {

    /* renamed from: a */
    private int f9612a;

    /* renamed from: b */
    private Theme f9613b;

    /* renamed from: c */
    private LayoutInflater f9614c;

    /* renamed from: d */
    private Configuration f9615d;

    /* renamed from: e */
    private Resources f9616e;

    public C3892d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m13061b() {
        if (this.f9616e == null) {
            Configuration configuration = this.f9615d;
            if (configuration == null) {
                this.f9616e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f9616e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f9616e;
    }

    /* renamed from: c */
    private void m13062c() {
        boolean z = this.f9613b == null;
        if (z) {
            this.f9613b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9613b.setTo(theme);
            }
        }
        mo13912a(this.f9613b, this.f9612a, z);
    }

    /* renamed from: a */
    public int mo13911a() {
        return this.f9612a;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m13061b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9614c == null) {
            this.f9614c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9614c;
    }

    public Theme getTheme() {
        Theme theme = this.f9613b;
        if (theme != null) {
            return theme;
        }
        if (this.f9612a == 0) {
            this.f9612a = C3866i.Theme_AppCompat_Light;
        }
        m13062c();
        return this.f9613b;
    }

    public void setTheme(int i) {
        if (this.f9612a != i) {
            this.f9612a = i;
            m13062c();
        }
    }

    public C3892d(Context context, int i) {
        super(context);
        this.f9612a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13912a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public C3892d(Context context, Theme theme) {
        super(context);
        this.f9613b = theme;
    }
}
