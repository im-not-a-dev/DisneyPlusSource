package p096e.p097a.p104o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: e.a.o.b */
/* compiled from: ActionMode */
public abstract class C3889b {

    /* renamed from: U */
    private boolean f9610U;

    /* renamed from: c */
    private Object f9611c;

    /* renamed from: e.a.o.b$a */
    /* compiled from: ActionMode */
    public interface C3890a {
        /* renamed from: a */
        void mo535a(C3889b bVar);

        /* renamed from: a */
        boolean mo536a(C3889b bVar, Menu menu);

        /* renamed from: a */
        boolean mo537a(C3889b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo538b(C3889b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo597a();

    /* renamed from: a */
    public abstract void mo598a(int i);

    /* renamed from: a */
    public abstract void mo599a(View view);

    /* renamed from: a */
    public abstract void mo600a(CharSequence charSequence);

    /* renamed from: a */
    public void mo13908a(Object obj) {
        this.f9611c = obj;
    }

    /* renamed from: b */
    public abstract View mo602b();

    /* renamed from: b */
    public abstract void mo603b(int i);

    /* renamed from: b */
    public abstract void mo604b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo605c();

    /* renamed from: d */
    public abstract MenuInflater mo606d();

    /* renamed from: e */
    public abstract CharSequence mo607e();

    /* renamed from: f */
    public Object mo13909f() {
        return this.f9611c;
    }

    /* renamed from: g */
    public abstract CharSequence mo608g();

    /* renamed from: h */
    public boolean mo13910h() {
        return this.f9610U;
    }

    /* renamed from: i */
    public abstract void mo609i();

    /* renamed from: j */
    public abstract boolean mo610j();

    /* renamed from: a */
    public void mo601a(boolean z) {
        this.f9610U = z;
    }
}
