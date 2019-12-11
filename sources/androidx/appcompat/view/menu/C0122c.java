package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p096e.p113e.C3926a;
import p096e.p121h.p126l.p127a.C4060b;
import p096e.p121h.p126l.p127a.C4061c;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0122c {

    /* renamed from: a */
    final Context f513a;

    /* renamed from: b */
    private Map<C4060b, MenuItem> f514b;

    /* renamed from: c */
    private Map<C4061c, SubMenu> f515c;

    C0122c(Context context) {
        this.f513a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo721a(MenuItem menuItem) {
        if (!(menuItem instanceof C4060b)) {
            return menuItem;
        }
        C4060b bVar = (C4060b) menuItem;
        if (this.f514b == null) {
            this.f514b = new C3926a();
        }
        MenuItem menuItem2 = (MenuItem) this.f514b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0139k kVar = new C0139k(this.f513a, bVar);
        this.f514b.put(bVar, kVar);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo724b() {
        Map<C4060b, MenuItem> map = this.f514b;
        if (map != null) {
            map.clear();
        }
        Map<C4061c, SubMenu> map2 = this.f515c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo725b(int i) {
        Map<C4060b, MenuItem> map = this.f514b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo722a(SubMenu subMenu) {
        if (!(subMenu instanceof C4061c)) {
            return subMenu;
        }
        C4061c cVar = (C4061c) subMenu;
        if (this.f515c == null) {
            this.f515c = new C3926a();
        }
        SubMenu subMenu2 = (SubMenu) this.f515c.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = new C0158t(this.f513a, cVar);
            this.f515c.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo723a(int i) {
        Map<C4060b, MenuItem> map = this.f514b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }
}
