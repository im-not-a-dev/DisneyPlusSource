package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p096e.p121h.p126l.p127a.C4061c;

/* renamed from: androidx.appcompat.view.menu.t */
/* compiled from: SubMenuWrapperICS */
class C0158t extends C0152p implements SubMenu {

    /* renamed from: e */
    private final C4061c f683e;

    C0158t(Context context, C4061c cVar) {
        super(context, cVar);
        this.f683e = cVar;
    }

    public void clearHeader() {
        this.f683e.clearHeader();
    }

    public MenuItem getItem() {
        return mo721a(this.f683e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f683e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f683e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f683e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f683e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f683e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f683e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f683e.setIcon(drawable);
        return this;
    }
}
