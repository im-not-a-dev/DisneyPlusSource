package p096e.p121h.p135s;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: e.h.s.b */
/* compiled from: ActionProvider */
public abstract class C4124b {

    /* renamed from: a */
    private final Context f10401a;

    /* renamed from: b */
    private C4126b f10402b;

    /* renamed from: e.h.s.b$a */
    /* compiled from: ActionProvider */
    public interface C4125a {
    }

    /* renamed from: e.h.s.b$b */
    /* compiled from: ActionProvider */
    public interface C4126b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C4124b(Context context) {
        this.f10401a = context;
    }

    /* renamed from: a */
    public Context mo14688a() {
        return this.f10401a;
    }

    /* renamed from: a */
    public void mo956a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo14689a(C4125a aVar) {
    }

    /* renamed from: b */
    public boolean mo957b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo962c() {
        return true;
    }

    /* renamed from: d */
    public abstract View mo958d();

    /* renamed from: e */
    public boolean mo959e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo963f() {
        return false;
    }

    /* renamed from: g */
    public void mo14690g() {
        this.f10402b = null;
    }

    /* renamed from: a */
    public View mo960a(MenuItem menuItem) {
        return mo958d();
    }

    /* renamed from: a */
    public void mo961a(C4126b bVar) {
        if (!(this.f10402b == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f10402b = bVar;
    }
}
