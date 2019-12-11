package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.C0492a;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p126l.p127a.C4060b;
import p096e.p121h.p135s.C4124b;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0120a implements C4060b {

    /* renamed from: a */
    private final int f486a;

    /* renamed from: b */
    private final int f487b;

    /* renamed from: c */
    private final int f488c;

    /* renamed from: d */
    private CharSequence f489d;

    /* renamed from: e */
    private CharSequence f490e;

    /* renamed from: f */
    private Intent f491f;

    /* renamed from: g */
    private char f492g;

    /* renamed from: h */
    private int f493h = 4096;

    /* renamed from: i */
    private char f494i;

    /* renamed from: j */
    private int f495j = 4096;

    /* renamed from: k */
    private Drawable f496k;

    /* renamed from: l */
    private Context f497l;

    /* renamed from: m */
    private CharSequence f498m;

    /* renamed from: n */
    private CharSequence f499n;

    /* renamed from: o */
    private ColorStateList f500o = null;

    /* renamed from: p */
    private Mode f501p = null;

    /* renamed from: q */
    private boolean f502q = false;

    /* renamed from: r */
    private boolean f503r = false;

    /* renamed from: s */
    private int f504s = 16;

    public C0120a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f497l = context;
        this.f486a = i2;
        this.f487b = i;
        this.f488c = i4;
        this.f489d = charSequence;
    }

    /* renamed from: b */
    private void m719b() {
        if (this.f496k == null) {
            return;
        }
        if (this.f502q || this.f503r) {
            this.f496k = C0492a.m2652i(this.f496k);
            this.f496k = this.f496k.mutate();
            if (this.f502q) {
                C0492a.m2637a(this.f496k, this.f500o);
            }
            if (this.f503r) {
                C0492a.m2640a(this.f496k, this.f501p);
            }
        }
    }

    /* renamed from: a */
    public C4060b mo649a(C4124b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C4124b mo650a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f495j;
    }

    public char getAlphabeticShortcut() {
        return this.f494i;
    }

    public CharSequence getContentDescription() {
        return this.f498m;
    }

    public int getGroupId() {
        return this.f487b;
    }

    public Drawable getIcon() {
        return this.f496k;
    }

    public ColorStateList getIconTintList() {
        return this.f500o;
    }

    public Mode getIconTintMode() {
        return this.f501p;
    }

    public Intent getIntent() {
        return this.f491f;
    }

    public int getItemId() {
        return this.f486a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f493h;
    }

    public char getNumericShortcut() {
        return this.f492g;
    }

    public int getOrder() {
        return this.f488c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f489d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f490e;
        return charSequence != null ? charSequence : this.f489d;
    }

    public CharSequence getTooltipText() {
        return this.f499n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f504s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f504s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f504s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f504s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f494i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f504s = z | (this.f504s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f504s = (z ? 2 : 0) | (this.f504s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f504s = (z ? 16 : 0) | (this.f504s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f496k = drawable;
        m719b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f500o = colorStateList;
        this.f502q = true;
        m719b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f501p = mode;
        this.f503r = true;
        m719b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f491f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f492g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f492g = c;
        this.f494i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f489d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f490e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f504s & 8;
        if (z) {
            i = 0;
        }
        this.f504s = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f494i = Character.toLowerCase(c);
        this.f495j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C4060b setContentDescription(CharSequence charSequence) {
        this.f498m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f492g = c;
        this.f493h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C4060b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f489d = this.f497l.getResources().getString(i);
        return this;
    }

    public C4060b setTooltipText(CharSequence charSequence) {
        this.f499n = charSequence;
        return this;
    }

    public C4060b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setIcon(int i) {
        this.f496k = C4025a.m13798c(this.f497l, i);
        m719b();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f492g = c;
        this.f493h = KeyEvent.normalizeMetaState(i);
        this.f494i = Character.toLowerCase(c2);
        this.f495j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C4060b setActionView(int i) {
        throw new UnsupportedOperationException();
    }
}
