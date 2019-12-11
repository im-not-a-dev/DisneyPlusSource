package p096e.p097a.p104o;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0139k;
import androidx.appcompat.view.menu.C0152p;
import java.util.ArrayList;
import p096e.p097a.p104o.C3889b.C3890a;
import p096e.p113e.C3941i;
import p096e.p121h.p126l.p127a.C4059a;
import p096e.p121h.p126l.p127a.C4060b;

/* renamed from: e.a.o.f */
/* compiled from: SupportActionModeWrapper */
public class C3894f extends ActionMode {

    /* renamed from: a */
    final Context f9623a;

    /* renamed from: b */
    final C3889b f9624b;

    /* renamed from: e.a.o.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C3895a implements C3890a {

        /* renamed from: a */
        final Callback f9625a;

        /* renamed from: b */
        final Context f9626b;

        /* renamed from: c */
        final ArrayList<C3894f> f9627c = new ArrayList<>();

        /* renamed from: d */
        final C3941i<Menu, Menu> f9628d = new C3941i<>();

        public C3895a(Context context, Callback callback) {
            this.f9626b = context;
            this.f9625a = callback;
        }

        /* renamed from: a */
        public boolean mo536a(C3889b bVar, Menu menu) {
            return this.f9625a.onCreateActionMode(mo13936b(bVar), m13081a(menu));
        }

        /* renamed from: b */
        public boolean mo538b(C3889b bVar, Menu menu) {
            return this.f9625a.onPrepareActionMode(mo13936b(bVar), m13081a(menu));
        }

        /* renamed from: a */
        public boolean mo537a(C3889b bVar, MenuItem menuItem) {
            return this.f9625a.onActionItemClicked(mo13936b(bVar), new C0139k(this.f9626b, (C4060b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo13936b(C3889b bVar) {
            int size = this.f9627c.size();
            for (int i = 0; i < size; i++) {
                C3894f fVar = (C3894f) this.f9627c.get(i);
                if (fVar != null && fVar.f9624b == bVar) {
                    return fVar;
                }
            }
            C3894f fVar2 = new C3894f(this.f9626b, bVar);
            this.f9627c.add(fVar2);
            return fVar2;
        }

        /* renamed from: a */
        public void mo535a(C3889b bVar) {
            this.f9625a.onDestroyActionMode(mo13936b(bVar));
        }

        /* renamed from: a */
        private Menu m13081a(Menu menu) {
            Menu menu2 = (Menu) this.f9628d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0152p pVar = new C0152p(this.f9626b, (C4059a) menu);
            this.f9628d.put(menu, pVar);
            return pVar;
        }
    }

    public C3894f(Context context, C3889b bVar) {
        this.f9623a = context;
        this.f9624b = bVar;
    }

    public void finish() {
        this.f9624b.mo597a();
    }

    public View getCustomView() {
        return this.f9624b.mo602b();
    }

    public Menu getMenu() {
        return new C0152p(this.f9623a, (C4059a) this.f9624b.mo605c());
    }

    public MenuInflater getMenuInflater() {
        return this.f9624b.mo606d();
    }

    public CharSequence getSubtitle() {
        return this.f9624b.mo607e();
    }

    public Object getTag() {
        return this.f9624b.mo13909f();
    }

    public CharSequence getTitle() {
        return this.f9624b.mo608g();
    }

    public boolean getTitleOptionalHint() {
        return this.f9624b.mo13910h();
    }

    public void invalidate() {
        this.f9624b.mo609i();
    }

    public boolean isTitleOptional() {
        return this.f9624b.mo610j();
    }

    public void setCustomView(View view) {
        this.f9624b.mo599a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9624b.mo600a(charSequence);
    }

    public void setTag(Object obj) {
        this.f9624b.mo13908a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9624b.mo604b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f9624b.mo601a(z);
    }

    public void setSubtitle(int i) {
        this.f9624b.mo598a(i);
    }

    public void setTitle(int i) {
        this.f9624b.mo603b(i);
    }
}
