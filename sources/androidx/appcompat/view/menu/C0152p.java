package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p096e.p121h.p126l.p127a.C4059a;

/* renamed from: androidx.appcompat.view.menu.p */
/* compiled from: MenuWrapperICS */
public class C0152p extends C0122c implements Menu {

    /* renamed from: d */
    private final C4059a f657d;

    public C0152p(Context context, C4059a aVar) {
        super(context);
        if (aVar != null) {
            this.f657d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo721a(this.f657d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f657d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo721a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo722a(this.f657d.addSubMenu(charSequence));
    }

    public void clear() {
        mo724b();
        this.f657d.clear();
    }

    public void close() {
        this.f657d.close();
    }

    public MenuItem findItem(int i) {
        return mo721a(this.f657d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo721a(this.f657d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f657d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f657d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f657d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f657d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo723a(i);
        this.f657d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo725b(i);
        this.f657d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f657d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f657d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f657d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f657d.setQwertyMode(z);
    }

    public int size() {
        return this.f657d.size();
    }

    public MenuItem add(int i) {
        return mo721a(this.f657d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo722a(this.f657d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo721a(this.f657d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo722a(this.f657d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo721a(this.f657d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo722a(this.f657d.addSubMenu(i, i2, i3, i4));
    }
}
