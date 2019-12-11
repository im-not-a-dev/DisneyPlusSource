package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p096e.p097a.p104o.C3891c;
import p096e.p121h.p126l.p127a.C4060b;
import p096e.p121h.p135s.C4124b;
import p096e.p121h.p135s.C4124b.C4126b;

/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: MenuItemWrapperICS */
public class C0139k extends C0122c implements MenuItem {

    /* renamed from: d */
    private final C4060b f633d;

    /* renamed from: e */
    private Method f634e;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0140a extends C4124b {

        /* renamed from: c */
        final ActionProvider f635c;

        C0140a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f635c = actionProvider;
        }

        /* renamed from: a */
        public void mo956a(SubMenu subMenu) {
            this.f635c.onPrepareSubMenu(C0139k.this.mo722a(subMenu));
        }

        /* renamed from: b */
        public boolean mo957b() {
            return this.f635c.hasSubMenu();
        }

        /* renamed from: d */
        public View mo958d() {
            return this.f635c.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo959e() {
            return this.f635c.onPerformDefaultAction();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0141b extends C0140a implements VisibilityListener {

        /* renamed from: e */
        private C4126b f637e;

        C0141b(C0139k kVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo960a(MenuItem menuItem) {
            return this.f635c.onCreateActionView(menuItem);
        }

        /* renamed from: c */
        public boolean mo962c() {
            return this.f635c.isVisible();
        }

        /* renamed from: f */
        public boolean mo963f() {
            return this.f635c.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C4126b bVar = this.f637e;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        /* renamed from: a */
        public void mo961a(C4126b bVar) {
            this.f637e = bVar;
            this.f635c.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0142c extends FrameLayout implements C3891c {

        /* renamed from: c */
        final CollapsibleActionView f638c;

        C0142c(View view) {
            super(view.getContext());
            this.f638c = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo965a() {
            return (View) this.f638c;
        }

        /* renamed from: b */
        public void mo966b() {
            this.f638c.onActionViewExpanded();
        }

        /* renamed from: c */
        public void mo967c() {
            this.f638c.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0143d implements OnActionExpandListener {

        /* renamed from: a */
        private final OnActionExpandListener f639a;

        C0143d(OnActionExpandListener onActionExpandListener) {
            this.f639a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f639a.onMenuItemActionCollapse(C0139k.this.mo721a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f639a.onMenuItemActionExpand(C0139k.this.mo721a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0144e implements OnMenuItemClickListener {

        /* renamed from: a */
        private final OnMenuItemClickListener f641a;

        C0144e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f641a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f641a.onMenuItemClick(C0139k.this.mo721a(menuItem));
        }
    }

    public C0139k(Context context, C4060b bVar) {
        super(context);
        if (bVar != null) {
            this.f633d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo901a(boolean z) {
        try {
            if (this.f634e == null) {
                this.f634e = this.f633d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f634e.invoke(this.f633d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f633d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f633d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C4124b a = this.f633d.mo650a();
        if (a instanceof C0140a) {
            return ((C0140a) a).f635c;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f633d.getActionView();
        return actionView instanceof C0142c ? ((C0142c) actionView).mo965a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f633d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f633d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f633d.getContentDescription();
    }

    public int getGroupId() {
        return this.f633d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f633d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f633d.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f633d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f633d.getIntent();
    }

    public int getItemId() {
        return this.f633d.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f633d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f633d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f633d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f633d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo722a(this.f633d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f633d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f633d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f633d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f633d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f633d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f633d.isCheckable();
    }

    public boolean isChecked() {
        return this.f633d.isChecked();
    }

    public boolean isEnabled() {
        return this.f633d.isEnabled();
    }

    public boolean isVisible() {
        return this.f633d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C4124b bVar;
        if (VERSION.SDK_INT >= 16) {
            bVar = new C0141b(this, this.f513a, actionProvider);
        } else {
            bVar = new C0140a(this.f513a, actionProvider);
        }
        C4060b bVar2 = this.f633d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo649a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0142c(view);
        }
        this.f633d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f633d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f633d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f633d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f633d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f633d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f633d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f633d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f633d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f633d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f633d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f633d.setOnActionExpandListener(onActionExpandListener != null ? new C0143d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f633d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0144e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f633d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f633d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f633d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f633d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f633d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f633d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f633d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f633d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f633d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f633d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f633d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f633d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f633d.setActionView(i);
        View actionView = this.f633d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f633d.setActionView((View) new C0142c(actionView));
        }
        return this;
    }
}
