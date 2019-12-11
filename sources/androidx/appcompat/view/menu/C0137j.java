package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0150o.C0151a;
import androidx.core.graphics.drawable.C0492a;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3865h;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p126l.p127a.C4060b;
import p096e.p121h.p135s.C4124b;
import p096e.p121h.p135s.C4124b.C4126b;

/* renamed from: androidx.appcompat.view.menu.j */
/* compiled from: MenuItemImpl */
public final class C0137j implements C4060b {

    /* renamed from: A */
    private View f601A;

    /* renamed from: B */
    private C4124b f602B;

    /* renamed from: C */
    private OnActionExpandListener f603C;

    /* renamed from: D */
    private boolean f604D = false;

    /* renamed from: E */
    private ContextMenuInfo f605E;

    /* renamed from: a */
    private final int f606a;

    /* renamed from: b */
    private final int f607b;

    /* renamed from: c */
    private final int f608c;

    /* renamed from: d */
    private final int f609d;

    /* renamed from: e */
    private CharSequence f610e;

    /* renamed from: f */
    private CharSequence f611f;

    /* renamed from: g */
    private Intent f612g;

    /* renamed from: h */
    private char f613h;

    /* renamed from: i */
    private int f614i = 4096;

    /* renamed from: j */
    private char f615j;

    /* renamed from: k */
    private int f616k = 4096;

    /* renamed from: l */
    private Drawable f617l;

    /* renamed from: m */
    private int f618m = 0;

    /* renamed from: n */
    C0132g f619n;

    /* renamed from: o */
    private C0157s f620o;

    /* renamed from: p */
    private Runnable f621p;

    /* renamed from: q */
    private OnMenuItemClickListener f622q;

    /* renamed from: r */
    private CharSequence f623r;

    /* renamed from: s */
    private CharSequence f624s;

    /* renamed from: t */
    private ColorStateList f625t = null;

    /* renamed from: u */
    private Mode f626u = null;

    /* renamed from: v */
    private boolean f627v = false;

    /* renamed from: w */
    private boolean f628w = false;

    /* renamed from: x */
    private boolean f629x = false;

    /* renamed from: y */
    private int f630y = 16;

    /* renamed from: z */
    private int f631z = 0;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemImpl */
    class C0138a implements C4126b {
        C0138a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0137j jVar = C0137j.this;
            jVar.f619n.mo809d(jVar);
        }
    }

    C0137j(C0132g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f619n = gVar;
        this.f606a = i2;
        this.f607b = i;
        this.f608c = i3;
        this.f609d = i4;
        this.f610e = charSequence;
        this.f631z = i5;
    }

    /* renamed from: a */
    private static void m848a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo850b(boolean z) {
        int i = this.f630y;
        this.f630y = (z ? 2 : 0) | (i & -3);
        if (i != this.f630y) {
            this.f619n.mo798b(false);
        }
    }

    /* renamed from: c */
    public int mo851c() {
        return this.f609d;
    }

    public boolean collapseActionView() {
        if ((this.f631z & 8) == 0) {
            return false;
        }
        if (this.f601A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f603C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f619n.mo784a(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo853d() {
        return this.f619n.mo826p() ? this.f615j : this.f613h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo855e() {
        char d = mo853d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f619n.mo810e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f619n.mo810e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C3865h.abc_prepend_shortcut_label));
        }
        int i = this.f619n.mo826p() ? this.f616k : this.f614i;
        m848a(sb, i, DateUtils.FORMAT_ABBREV_MONTH, resources.getString(C3865h.abc_menu_meta_shortcut_label));
        m848a(sb, i, 4096, resources.getString(C3865h.abc_menu_ctrl_shortcut_label));
        m848a(sb, i, 2, resources.getString(C3865h.abc_menu_alt_shortcut_label));
        m848a(sb, i, 1, resources.getString(C3865h.abc_menu_shift_shortcut_label));
        m848a(sb, i, 4, resources.getString(C3865h.abc_menu_sym_shortcut_label));
        m848a(sb, i, 8, resources.getString(C3865h.abc_menu_function_shortcut_label));
        if (d == 8) {
            sb.append(resources.getString(C3865h.abc_menu_delete_shortcut_label));
        } else if (d == 10) {
            sb.append(resources.getString(C3865h.abc_menu_enter_shortcut_label));
        } else if (d != ' ') {
            sb.append(d);
        } else {
            sb.append(resources.getString(C3865h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean expandActionView() {
        if (!mo857f()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f603C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f619n.mo799b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo857f() {
        if ((this.f631z & 8) == 0) {
            return false;
        }
        if (this.f601A == null) {
            C4124b bVar = this.f602B;
            if (bVar != null) {
                this.f601A = bVar.mo960a((MenuItem) this);
            }
        }
        if (this.f601A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo858g() {
        OnMenuItemClickListener onMenuItemClickListener = this.f622q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0132g gVar = this.f619n;
        if (gVar.mo783a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f621p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f612g != null) {
            try {
                this.f619n.mo810e().startActivity(this.f612g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C4124b bVar = this.f602B;
        if (bVar == null || !bVar.mo959e()) {
            return false;
        }
        return true;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f601A;
        if (view != null) {
            return view;
        }
        C4124b bVar = this.f602B;
        if (bVar == null) {
            return null;
        }
        this.f601A = bVar.mo960a((MenuItem) this);
        return this.f601A;
    }

    public int getAlphabeticModifiers() {
        return this.f616k;
    }

    public char getAlphabeticShortcut() {
        return this.f615j;
    }

    public CharSequence getContentDescription() {
        return this.f623r;
    }

    public int getGroupId() {
        return this.f607b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f617l;
        if (drawable != null) {
            return m847a(drawable);
        }
        if (this.f618m == 0) {
            return null;
        }
        Drawable c = C3868a.m12946c(this.f619n.mo810e(), this.f618m);
        this.f618m = 0;
        this.f617l = c;
        return m847a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f625t;
    }

    public Mode getIconTintMode() {
        return this.f626u;
    }

    public Intent getIntent() {
        return this.f612g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f606a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f605E;
    }

    public int getNumericModifiers() {
        return this.f614i;
    }

    public char getNumericShortcut() {
        return this.f613h;
    }

    public int getOrder() {
        return this.f608c;
    }

    public SubMenu getSubMenu() {
        return this.f620o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f610e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f611f;
        if (charSequence == null) {
            charSequence = this.f610e;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f624s;
    }

    /* renamed from: h */
    public boolean mo871h() {
        return (this.f630y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f620o != null;
    }

    /* renamed from: i */
    public boolean mo873i() {
        return (this.f630y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f604D;
    }

    public boolean isCheckable() {
        return (this.f630y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f630y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f630y & 16) != 0;
    }

    public boolean isVisible() {
        C4124b bVar = this.f602B;
        boolean z = true;
        if (bVar == null || !bVar.mo963f()) {
            if ((this.f630y & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f630y & 8) != 0 || !this.f602B.mo962c()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo878j() {
        return (this.f631z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo879k() {
        return (this.f631z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo880l() {
        return this.f619n.mo821k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo881m() {
        return this.f619n.mo829q() && mo853d() != 0;
    }

    /* renamed from: n */
    public boolean mo882n() {
        return (this.f631z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f615j == c) {
            return this;
        }
        this.f615j = Character.toLowerCase(c);
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f630y;
        this.f630y = z | (i & true) ? 1 : 0;
        if (i != this.f630y) {
            this.f619n.mo798b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f630y & 4) != 0) {
            this.f619n.mo775a((MenuItem) this);
        } else {
            mo850b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f630y |= 16;
        } else {
            this.f630y &= -17;
        }
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f618m = 0;
        this.f617l = drawable;
        this.f629x = true;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f625t = colorStateList;
        this.f627v = true;
        this.f629x = true;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f626u = mode;
        this.f628w = true;
        this.f629x = true;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f612g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f613h == c) {
            return this;
        }
        this.f613h = c;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f603C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f622q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f613h = c;
        this.f615j = Character.toLowerCase(c2);
        this.f619n.mo798b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f631z = i;
            this.f619n.mo802c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f610e = charSequence;
        this.f619n.mo798b(false);
        C0157s sVar = this.f620o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f611f = charSequence;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo856e(z)) {
            this.f619n.mo809d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f610e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    public void mo847a(C0157s sVar) {
        this.f620o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    /* renamed from: c */
    public void mo852c(boolean z) {
        this.f630y = (z ? 4 : 0) | (this.f630y & -5);
    }

    /* renamed from: d */
    public void mo854d(boolean z) {
        if (z) {
            this.f630y |= 32;
        } else {
            this.f630y &= -33;
        }
    }

    public C4060b setContentDescription(CharSequence charSequence) {
        this.f623r = charSequence;
        this.f619n.mo798b(false);
        return this;
    }

    public C4060b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public C4060b setTooltipText(CharSequence charSequence) {
        this.f624s = charSequence;
        this.f619n.mo798b(false);
        return this;
    }

    public C4060b setActionView(View view) {
        this.f601A = view;
        this.f602B = null;
        if (view != null && view.getId() == -1) {
            int i = this.f606a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f619n.mo802c(this);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo845a(C0151a aVar) {
        if (aVar == null || !aVar.mo613a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f615j == c && this.f616k == i) {
            return this;
        }
        this.f615j = Character.toLowerCase(c);
        this.f616k = KeyEvent.normalizeMetaState(i);
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f613h == c && this.f614i == i) {
            return this;
        }
        this.f613h = c;
        this.f614i = KeyEvent.normalizeMetaState(i);
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f613h = c;
        this.f614i = KeyEvent.normalizeMetaState(i);
        this.f615j = Character.toLowerCase(c2);
        this.f616k = KeyEvent.normalizeMetaState(i2);
        this.f619n.mo798b(false);
        return this;
    }

    /* renamed from: b */
    public void mo849b() {
        this.f619n.mo802c(this);
    }

    public MenuItem setIcon(int i) {
        this.f617l = null;
        this.f618m = i;
        this.f629x = true;
        this.f619n.mo798b(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f619n.mo810e().getString(i));
        return this;
    }

    /* renamed from: a */
    private Drawable m847a(Drawable drawable) {
        if (drawable != null && this.f629x && (this.f627v || this.f628w)) {
            drawable = C0492a.m2652i(drawable).mutate();
            if (this.f627v) {
                C0492a.m2637a(drawable, this.f625t);
            }
            if (this.f628w) {
                C0492a.m2640a(drawable, this.f626u);
            }
            this.f629x = false;
        }
        return drawable;
    }

    public C4060b setActionView(int i) {
        Context e = this.f619n.mo810e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo846a(ContextMenuInfo contextMenuInfo) {
        this.f605E = contextMenuInfo;
    }

    /* renamed from: a */
    public C4124b mo650a() {
        return this.f602B;
    }

    /* renamed from: a */
    public C4060b mo649a(C4124b bVar) {
        C4124b bVar2 = this.f602B;
        if (bVar2 != null) {
            bVar2.mo14690g();
        }
        this.f601A = null;
        this.f602B = bVar;
        this.f619n.mo798b(true);
        C4124b bVar3 = this.f602B;
        if (bVar3 != null) {
            bVar3.mo961a((C4126b) new C0138a());
        }
        return this;
    }

    /* renamed from: a */
    public void mo848a(boolean z) {
        this.f604D = z;
        this.f619n.mo798b(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo856e(boolean z) {
        int i = this.f630y;
        this.f630y = (z ? 0 : 8) | (i & -9);
        if (i != this.f630y) {
            return true;
        }
        return false;
    }
}
