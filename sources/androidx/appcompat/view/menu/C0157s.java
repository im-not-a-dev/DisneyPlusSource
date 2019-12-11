package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0132g.C0133a;

/* renamed from: androidx.appcompat.view.menu.s */
/* compiled from: SubMenuBuilder */
public class C0157s extends C0132g implements SubMenu {

    /* renamed from: B */
    private C0132g f681B;

    /* renamed from: C */
    private C0137j f682C;

    public C0157s(Context context, C0132g gVar, C0137j jVar) {
        super(context);
        this.f681B = gVar;
        this.f682C = jVar;
    }

    /* renamed from: a */
    public void mo776a(C0133a aVar) {
        this.f681B.mo776a(aVar);
    }

    /* renamed from: b */
    public boolean mo799b(C0137j jVar) {
        return this.f681B.mo799b(jVar);
    }

    /* renamed from: d */
    public String mo808d() {
        C0137j jVar = this.f682C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo808d());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public MenuItem getItem() {
        return this.f682C;
    }

    /* renamed from: m */
    public C0132g mo823m() {
        return this.f681B.mo823m();
    }

    /* renamed from: o */
    public boolean mo825o() {
        return this.f681B.mo825o();
    }

    /* renamed from: p */
    public boolean mo826p() {
        return this.f681B.mo826p();
    }

    /* renamed from: q */
    public boolean mo829q() {
        return this.f681B.mo829q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f681B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo769a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo771a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo770a(view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f682C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f681B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo1024t() {
        return this.f681B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo783a(C0132g gVar, MenuItem menuItem) {
        return super.mo783a(gVar, menuItem) || this.f681B.mo783a(gVar, menuItem);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo807d(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo811e(i);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f682C.setIcon(i);
        return this;
    }

    /* renamed from: a */
    public boolean mo784a(C0137j jVar) {
        return this.f681B.mo784a(jVar);
    }
}
