package p096e.p097a.p104o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0132g.C0133a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p096e.p097a.p104o.C3889b.C3890a;

/* renamed from: e.a.o.e */
/* compiled from: StandaloneActionMode */
public class C3893e extends C3889b implements C0133a {

    /* renamed from: V */
    private Context f9617V;

    /* renamed from: W */
    private ActionBarContextView f9618W;

    /* renamed from: X */
    private C3890a f9619X;

    /* renamed from: Y */
    private WeakReference<View> f9620Y;

    /* renamed from: Z */
    private boolean f9621Z;

    /* renamed from: a0 */
    private C0132g f9622a0;

    public C3893e(Context context, ActionBarContextView actionBarContextView, C3890a aVar, boolean z) {
        this.f9617V = context;
        this.f9618W = actionBarContextView;
        this.f9619X = aVar;
        C0132g gVar = new C0132g(actionBarContextView.getContext());
        gVar.mo800c(1);
        this.f9622a0 = gVar;
        this.f9622a0.mo776a((C0133a) this);
    }

    /* renamed from: a */
    public void mo600a(CharSequence charSequence) {
        this.f9618W.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public void mo604b(CharSequence charSequence) {
        this.f9618W.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo605c() {
        return this.f9622a0;
    }

    /* renamed from: d */
    public MenuInflater mo606d() {
        return new C3896g(this.f9618W.getContext());
    }

    /* renamed from: e */
    public CharSequence mo607e() {
        return this.f9618W.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo608g() {
        return this.f9618W.getTitle();
    }

    /* renamed from: i */
    public void mo609i() {
        this.f9619X.mo538b(this, this.f9622a0);
    }

    /* renamed from: j */
    public boolean mo610j() {
        return this.f9618W.mo1054b();
    }

    /* renamed from: a */
    public void mo598a(int i) {
        mo600a((CharSequence) this.f9617V.getString(i));
    }

    /* renamed from: b */
    public void mo603b(int i) {
        mo604b((CharSequence) this.f9617V.getString(i));
    }

    /* renamed from: a */
    public void mo601a(boolean z) {
        super.mo601a(z);
        this.f9618W.setTitleOptional(z);
    }

    /* renamed from: b */
    public View mo602b() {
        WeakReference<View> weakReference = this.f9620Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo599a(View view) {
        this.f9618W.setCustomView(view);
        this.f9620Y = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo597a() {
        if (!this.f9621Z) {
            this.f9621Z = true;
            this.f9618W.sendAccessibilityEvent(32);
            this.f9619X.mo535a(this);
        }
    }

    /* renamed from: a */
    public boolean mo500a(C0132g gVar, MenuItem menuItem) {
        return this.f9619X.mo537a((C3889b) this, menuItem);
    }

    /* renamed from: a */
    public void mo497a(C0132g gVar) {
        mo609i();
        this.f9618W.mo1056d();
    }
}
