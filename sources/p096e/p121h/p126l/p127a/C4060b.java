package p096e.p121h.p126l.p127a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import p096e.p121h.p135s.C4124b;

/* renamed from: e.h.l.a.b */
/* compiled from: SupportMenuItem */
public interface C4060b extends MenuItem {
    /* renamed from: a */
    C4060b mo649a(C4124b bVar);

    /* renamed from: a */
    C4124b mo650a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    C4060b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    C4060b setTooltipText(CharSequence charSequence);
}
