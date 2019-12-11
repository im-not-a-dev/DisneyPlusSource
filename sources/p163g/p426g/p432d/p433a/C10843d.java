package p163g.p426g.p432d.p433a;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import p163g.p426g.p427a.C10790b.C10802l;
import p163g.p426g.p427a.p429j.C10832f;

/* renamed from: g.g.d.a.d */
/* compiled from: AndroidMetadataInterface */
public class C10843d implements C10832f {

    /* renamed from: a */
    private Context f25631a = null;

    public C10843d(Context context) {
        this.f25631a = context;
    }

    /* renamed from: a */
    public String mo27899a() {
        return Build.MANUFACTURER;
    }

    /* renamed from: b */
    public String mo27900b() {
        return Build.BRAND;
    }

    /* renamed from: c */
    public String mo27901c() {
        return VERSION.RELEASE;
    }

    /* renamed from: d */
    public String mo27902d() {
        return null;
    }

    /* renamed from: e */
    public String mo27903e() {
        return null;
    }

    /* renamed from: f */
    public String mo27904f() {
        return null;
    }

    /* renamed from: g */
    public String mo27905g() {
        return null;
    }

    /* renamed from: h */
    public String mo27906h() {
        return Build.MODEL;
    }

    /* renamed from: i */
    public C10802l mo27907i() {
        if (VERSION.SDK_INT >= 13) {
            Context context = this.f25631a;
            if (context != null) {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                    return C10802l.SETTOP;
                }
            }
        }
        return C10802l.UNKNOWN;
    }
}
