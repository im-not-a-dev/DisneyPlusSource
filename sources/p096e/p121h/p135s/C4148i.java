package p096e.p121h.p135s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import p096e.p121h.p126l.p127a.C4060b;

/* renamed from: e.h.s.i */
/* compiled from: MenuItemCompat */
public final class C4148i {
    /* renamed from: a */
    public static MenuItem m14201a(MenuItem menuItem, C4124b bVar) {
        if (menuItem instanceof C4060b) {
            return ((C4060b) menuItem).mo649a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m14207b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m14205a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m14206b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m14202a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m14203a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m14204a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C4060b) {
            ((C4060b) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
