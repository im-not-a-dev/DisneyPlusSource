package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.widget.C0300y0;
import androidx.core.app.C0460a;
import androidx.core.app.C0476g;
import androidx.core.app.C0490n;
import androidx.core.app.C0490n.C0491a;
import androidx.fragment.app.C0532d;
import p096e.p097a.p104o.C3889b;
import p096e.p097a.p104o.C3889b.C3890a;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: AppCompatActivity */
public class C0083d extends C0532d implements C0084e, C0491a, C0080b {

    /* renamed from: U */
    private Resources f292U;

    /* renamed from: c */
    private C0085f f293c;

    /* renamed from: a */
    public C3889b mo429a(C3890a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo431a(C0490n nVar) {
        nVar.mo2698a((Activity) this);
    }

    /* renamed from: a */
    public void mo432a(C3889b bVar) {
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo442f().mo474a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo442f().mo470a(context);
    }

    /* renamed from: b */
    public void mo435b(C0490n nVar) {
    }

    /* renamed from: b */
    public void mo436b(C3889b bVar) {
    }

    /* renamed from: b */
    public boolean mo437b(Intent intent) {
        return C0476g.m2518b((Activity) this, intent);
    }

    /* renamed from: c */
    public Intent mo438c() {
        return C0476g.m2513a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo439c(int i) {
    }

    public void closeOptionsMenu() {
        C0076a g = mo444g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo399e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0076a g = mo444g();
        if (keyCode != 82 || g == null || !g.mo394a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: f */
    public C0085f mo442f() {
        if (this.f293c == null) {
            this.f293c = C0085f.m482a((Activity) this, (C0084e) this);
        }
        return this.f293c;
    }

    public <T extends View> T findViewById(int i) {
        return mo442f().mo469a(i);
    }

    /* renamed from: g */
    public C0076a mo444g() {
        return mo442f().mo480c();
    }

    public MenuInflater getMenuInflater() {
        return mo442f().mo476b();
    }

    public Resources getResources() {
        if (this.f292U == null && C0300y0.m1623b()) {
            this.f292U = new C0300y0(this, super.getResources());
        }
        Resources resources = this.f292U;
        return resources == null ? super.getResources() : resources;
    }

    @Deprecated
    /* renamed from: h */
    public void mo447h() {
    }

    /* renamed from: i */
    public boolean mo448i() {
        Intent c = mo438c();
        if (c == null) {
            return false;
        }
        if (mo437b(c)) {
            C0490n a = C0490n.m2621a((Context) this);
            mo431a(a);
            mo435b(a);
            a.mo2702b();
            try {
                C0460a.m2489a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo430a(c);
        }
        return true;
    }

    public void invalidateOptionsMenu() {
        mo442f().mo485e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f292U != null) {
            this.f292U.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo442f().mo471a(configuration);
    }

    public void onContentChanged() {
        mo447h();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0085f f = mo442f();
        f.mo483d();
        f.mo472a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo442f().mo486f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m465a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0076a g = mo444g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.mo401g() & 4) == 0) {
            return false;
        }
        return mo448i();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo442f().mo477b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo442f().mo487g();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo442f().mo482c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo442f().mo488h();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo442f().mo489i();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo442f().mo475a(charSequence);
    }

    public void openOptionsMenu() {
        C0076a g = mo444g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo405k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo442f().mo481c(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo442f().mo484d(i);
    }

    public void supportInvalidateOptionsMenu() {
        mo442f().mo485e();
    }

    /* renamed from: a */
    public void mo430a(Intent intent) {
        C0476g.m2515a((Activity) this, intent);
    }

    public void setContentView(View view) {
        mo442f().mo473a(view);
    }

    /* renamed from: a */
    private boolean m465a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo442f().mo478b(view, layoutParams);
    }
}
