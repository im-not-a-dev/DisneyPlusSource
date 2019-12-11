package p096e.p097a.p104o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import p096e.p097a.C3858a;
import p096e.p097a.C3859b;
import p096e.p097a.C3861d;
import p096e.p097a.C3867j;

/* renamed from: e.a.o.a */
/* compiled from: ActionBarPolicy */
public class C3888a {

    /* renamed from: a */
    private Context f9609a;

    private C3888a(Context context) {
        this.f9609a = context;
    }

    /* renamed from: a */
    public static C3888a m13030a(Context context) {
        return new C3888a(context);
    }

    /* renamed from: b */
    public int mo13902b() {
        return this.f9609a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo13903c() {
        Configuration configuration = this.f9609a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: d */
    public int mo13904d() {
        return this.f9609a.getResources().getDimensionPixelSize(C3861d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo13905e() {
        TypedArray obtainStyledAttributes = this.f9609a.obtainStyledAttributes(null, C3867j.ActionBar, C3858a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C3867j.ActionBar_height, 0);
        Resources resources = this.f9609a.getResources();
        if (!mo13906f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C3861d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo13906f() {
        return this.f9609a.getResources().getBoolean(C3859b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo13907g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f9609a).hasPermanentMenuKey();
    }

    /* renamed from: a */
    public boolean mo13901a() {
        return this.f9609a.getApplicationInfo().targetSdkVersion < 14;
    }
}
