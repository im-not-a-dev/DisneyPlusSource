package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p126l.p127a.C4059a;
import p096e.p121h.p135s.C4124b;
import p096e.p121h.p135s.C4196y;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuBuilder */
public class C0132g implements C4059a {

    /* renamed from: A */
    private static final int[] f570A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f571a;

    /* renamed from: b */
    private final Resources f572b;

    /* renamed from: c */
    private boolean f573c;

    /* renamed from: d */
    private boolean f574d;

    /* renamed from: e */
    private C0133a f575e;

    /* renamed from: f */
    private ArrayList<C0137j> f576f;

    /* renamed from: g */
    private ArrayList<C0137j> f577g;

    /* renamed from: h */
    private boolean f578h;

    /* renamed from: i */
    private ArrayList<C0137j> f579i;

    /* renamed from: j */
    private ArrayList<C0137j> f580j;

    /* renamed from: k */
    private boolean f581k;

    /* renamed from: l */
    private int f582l = 0;

    /* renamed from: m */
    private ContextMenuInfo f583m;

    /* renamed from: n */
    CharSequence f584n;

    /* renamed from: o */
    Drawable f585o;

    /* renamed from: p */
    View f586p;

    /* renamed from: q */
    private boolean f587q = false;

    /* renamed from: r */
    private boolean f588r = false;

    /* renamed from: s */
    private boolean f589s = false;

    /* renamed from: t */
    private boolean f590t = false;

    /* renamed from: u */
    private boolean f591u = false;

    /* renamed from: v */
    private ArrayList<C0137j> f592v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0148n>> f593w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0137j f594x;

    /* renamed from: y */
    private boolean f595y = false;

    /* renamed from: z */
    private boolean f596z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0133a {
        /* renamed from: a */
        void mo497a(C0132g gVar);

        /* renamed from: a */
        boolean mo500a(C0132g gVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0134b {
        /* renamed from: a */
        boolean mo635a(C0137j jVar);
    }

    public C0132g(Context context) {
        this.f571a = context;
        this.f572b = context.getResources();
        this.f576f = new ArrayList<>();
        this.f577g = new ArrayList<>();
        this.f578h = true;
        this.f579i = new ArrayList<>();
        this.f580j = new ArrayList<>();
        this.f581k = true;
        m790e(true);
    }

    /* renamed from: d */
    private void m789d(boolean z) {
        if (!this.f593w.isEmpty()) {
            mo833s();
            Iterator it = this.f593w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0148n nVar = (C0148n) weakReference.get();
                if (nVar == null) {
                    this.f593w.remove(weakReference);
                } else {
                    nVar.mo713a(z);
                }
            }
            mo830r();
        }
    }

    /* renamed from: e */
    private void m790e(boolean z) {
        boolean z2 = true;
        if (!z || this.f572b.getConfiguration().keyboard == 1 || !C4196y.m14436d(ViewConfiguration.get(this.f571a), this.f571a)) {
            z2 = false;
        }
        this.f574d = z2;
    }

    /* renamed from: f */
    private static int m791f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f570A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void mo777a(C0148n nVar) {
        mo778a(nVar, this.f571a);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo768a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f571a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo797b(C0148n nVar) {
        Iterator it = this.f593w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0148n nVar2 = (C0148n) weakReference.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f593w.remove(weakReference);
            }
        }
    }

    /* renamed from: c */
    public C0132g mo800c(int i) {
        this.f582l = i;
        return this;
    }

    public void clear() {
        C0137j jVar = this.f594x;
        if (jVar != null) {
            mo784a(jVar);
        }
        this.f576f.clear();
        mo798b(true);
    }

    public void clearHeader() {
        this.f585o = null;
        this.f584n = null;
        this.f586p = null;
        mo798b(false);
    }

    public void close() {
        mo780a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo808d() {
        return "android:menu:actionviewstates";
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0137j jVar = (C0137j) this.f576f.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu()) {
                MenuItem findItem = jVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo814g() {
        return this.f585o;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f576f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo816h() {
        return this.f584n;
    }

    public boolean hasVisibleItems() {
        if (this.f596z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0137j) this.f576f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo818i() {
        return this.f586p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo772a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0137j> mo820j() {
        mo795b();
        return this.f580j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo821k() {
        return this.f590t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Resources mo822l() {
        return this.f572b;
    }

    /* renamed from: m */
    public C0132g mo823m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0137j> mo824n() {
        if (!this.f578h) {
            return this.f577g;
        }
        this.f577g.clear();
        int size = this.f576f.size();
        for (int i = 0; i < size; i++) {
            C0137j jVar = (C0137j) this.f576f.get(i);
            if (jVar.isVisible()) {
                this.f577g.add(jVar);
            }
        }
        this.f578h = false;
        this.f581k = true;
        return this.f577g;
    }

    /* renamed from: o */
    public boolean mo825o() {
        return this.f595y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo826p() {
        return this.f573c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo781a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0137j a = mo772a(i, keyEvent);
        boolean a2 = a != null ? mo781a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo780a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo829q() {
        return this.f574d;
    }

    /* renamed from: r */
    public void mo830r() {
        this.f587q = false;
        if (this.f588r) {
            this.f588r = false;
            mo798b(this.f589s);
        }
    }

    public void removeGroup(int i) {
        int a = mo766a(i);
        if (a >= 0) {
            int size = this.f576f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0137j) this.f576f.get(a)).getGroupId() != i) {
                    mo798b(true);
                } else {
                    m787a(a, false);
                    i2 = i3;
                }
            }
            mo798b(true);
        }
    }

    public void removeItem(int i) {
        m787a(mo794b(i), true);
    }

    /* renamed from: s */
    public void mo833s() {
        if (!this.f587q) {
            this.f587q = true;
            this.f588r = false;
            this.f589s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f576f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0137j jVar = (C0137j) this.f576f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo852c(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f595y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f576f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0137j jVar = (C0137j) this.f576f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f576f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0137j jVar = (C0137j) this.f576f.get(i2);
            if (jVar.getGroupId() == i && jVar.mo856e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo798b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f573c = z;
        mo798b(false);
    }

    public int size() {
        return this.f576f.size();
    }

    /* renamed from: a */
    public void mo778a(C0148n nVar, Context context) {
        this.f593w.add(new WeakReference(nVar));
        nVar.mo708a(context, this);
        this.f581k = true;
    }

    public MenuItem add(int i) {
        return mo768a(0, 0, 0, this.f572b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f572b.getString(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo802c(C0137j jVar) {
        this.f581k = true;
        mo798b(true);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo768a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0137j jVar = (C0137j) mo768a(i, i2, i3, charSequence);
        C0157s sVar = new C0157s(this.f571a, this, jVar);
        jVar.mo847a(sVar);
        return sVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo768a(i, i2, i3, this.f572b.getString(i4));
    }

    /* renamed from: b */
    public void mo796b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0157s) item.getSubMenu()).mo796b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo808d(), sparseArray);
        }
    }

    /* renamed from: c */
    public ArrayList<C0137j> mo801c() {
        mo795b();
        return this.f579i;
    }

    /* renamed from: f */
    public C0137j mo812f() {
        return this.f594x;
    }

    /* renamed from: a */
    private boolean m788a(C0157s sVar, C0148n nVar) {
        boolean z = false;
        if (this.f593w.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.mo717a(sVar);
        }
        Iterator it = this.f593w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0148n nVar2 = (C0148n) weakReference.get();
            if (nVar2 == null) {
                this.f593w.remove(weakReference);
            } else if (!z) {
                z = nVar2.mo717a(sVar);
            }
        }
        return z;
    }

    /* renamed from: e */
    public Context mo810e() {
        return this.f571a;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f572b.getString(i4));
    }

    /* renamed from: c */
    public void mo803c(boolean z) {
        this.f596z = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0132g mo811e(int i) {
        m786a(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo809d(C0137j jVar) {
        this.f578h = true;
        mo798b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0132g mo807d(int i) {
        m786a(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    public void mo774a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo808d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0157s) item.getSubMenu()).mo774a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    public int mo794b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0137j) this.f576f.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo798b(boolean z) {
        if (!this.f587q) {
            if (z) {
                this.f578h = true;
                this.f581k = true;
            }
            m789d(z);
            return;
        }
        this.f588r = true;
        if (z) {
            this.f589s = true;
        }
    }

    /* renamed from: a */
    public void mo776a(C0133a aVar) {
        this.f575e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo768a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m791f(i3);
        C0137j a = m785a(i, i2, i3, f, charSequence, this.f582l);
        ContextMenuInfo contextMenuInfo = this.f583m;
        if (contextMenuInfo != null) {
            a.mo846a(contextMenuInfo);
        }
        ArrayList<C0137j> arrayList = this.f576f;
        arrayList.add(m784a(arrayList, f), a);
        mo798b(true);
        return a;
    }

    /* renamed from: b */
    public void mo795b() {
        ArrayList n = mo824n();
        if (this.f581k) {
            Iterator it = this.f593w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0148n nVar = (C0148n) weakReference.get();
                if (nVar == null) {
                    this.f593w.remove(weakReference);
                } else {
                    z |= nVar.mo730a();
                }
            }
            if (z) {
                this.f579i.clear();
                this.f580j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0137j jVar = (C0137j) n.get(i);
                    if (jVar.mo871h()) {
                        this.f579i.add(jVar);
                    } else {
                        this.f580j.add(jVar);
                    }
                }
            } else {
                this.f579i.clear();
                this.f580j.clear();
                this.f580j.addAll(mo824n());
            }
            this.f581k = false;
        }
    }

    /* renamed from: a */
    private C0137j m785a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0137j jVar = new C0137j(this, i, i2, i3, i4, charSequence, i5);
        return jVar;
    }

    /* renamed from: a */
    private void m787a(int i, boolean z) {
        if (i >= 0 && i < this.f576f.size()) {
            this.f576f.remove(i);
            if (z) {
                mo798b(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo775a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f576f.size();
        mo833s();
        for (int i = 0; i < size; i++) {
            C0137j jVar = (C0137j) this.f576f.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo873i() && jVar.isCheckable()) {
                jVar.mo850b(jVar == menuItem);
            }
        }
        mo830r();
    }

    /* renamed from: b */
    public boolean mo799b(C0137j jVar) {
        boolean z = false;
        if (this.f593w.isEmpty()) {
            return false;
        }
        mo833s();
        Iterator it = this.f593w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0148n nVar = (C0148n) weakReference.get();
            if (nVar == null) {
                this.f593w.remove(weakReference);
            } else {
                z = nVar.mo720b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo830r();
        if (z) {
            this.f594x = jVar;
        }
        return z;
    }

    /* renamed from: a */
    public int mo766a(int i) {
        return mo767a(i, 0);
    }

    /* renamed from: a */
    public int mo767a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0137j) this.f576f.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo783a(C0132g gVar, MenuItem menuItem) {
        C0133a aVar = this.f575e;
        return aVar != null && aVar.mo500a(gVar, menuItem);
    }

    /* renamed from: a */
    public void mo773a() {
        C0133a aVar = this.f575e;
        if (aVar != null) {
            aVar.mo497a(this);
        }
    }

    /* renamed from: a */
    private static int m784a(ArrayList<C0137j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0137j) arrayList.get(size)).mo851c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo779a(List<C0137j> list, int i, KeyEvent keyEvent) {
        boolean p = mo826p();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f576f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0137j jVar = (C0137j) this.f576f.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0132g) jVar.getSubMenu()).mo779a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0137j mo772a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0137j> arrayList = this.f592v;
        arrayList.clear();
        mo779a((List<C0137j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0137j) arrayList.get(0);
        }
        boolean p = mo826p();
        for (int i2 = 0; i2 < size; i2++) {
            C0137j jVar = (C0137j) arrayList.get(i2);
            if (p) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (p && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo781a(MenuItem menuItem, int i) {
        return mo782a(menuItem, (C0148n) null, i);
    }

    /* renamed from: a */
    public boolean mo782a(MenuItem menuItem, C0148n nVar, int i) {
        C0137j jVar = (C0137j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean g = jVar.mo858g();
        C4124b a = jVar.mo650a();
        boolean z = a != null && a.mo957b();
        if (jVar.mo857f()) {
            g |= jVar.expandActionView();
            if (g) {
                mo780a(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo780a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo847a(new C0157s(mo810e(), this, jVar));
            }
            C0157s sVar = (C0157s) jVar.getSubMenu();
            if (z) {
                a.mo956a((SubMenu) sVar);
            }
            g |= m788a(sVar, nVar);
            if (!g) {
                mo780a(true);
            }
        } else if ((i & 1) == 0) {
            mo780a(true);
        }
        return g;
    }

    /* renamed from: a */
    public final void mo780a(boolean z) {
        if (!this.f591u) {
            this.f591u = true;
            Iterator it = this.f593w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0148n nVar = (C0148n) weakReference.get();
                if (nVar == null) {
                    this.f593w.remove(weakReference);
                } else {
                    nVar.mo710a(this, z);
                }
            }
            this.f591u = false;
        }
    }

    /* renamed from: a */
    private void m786a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo822l();
        if (view != null) {
            this.f586p = view;
            this.f584n = null;
            this.f585o = null;
        } else {
            if (i > 0) {
                this.f584n = l.getText(i);
            } else if (charSequence != null) {
                this.f584n = charSequence;
            }
            if (i2 > 0) {
                this.f585o = C4025a.m13798c(mo810e(), i2);
            } else if (drawable != null) {
                this.f585o = drawable;
            }
            this.f586p = null;
        }
        mo798b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0132g mo771a(CharSequence charSequence) {
        m786a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0132g mo769a(Drawable drawable) {
        m786a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0132g mo770a(View view) {
        m786a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public boolean mo784a(C0137j jVar) {
        boolean z = false;
        if (!this.f593w.isEmpty() && this.f594x == jVar) {
            mo833s();
            Iterator it = this.f593w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0148n nVar = (C0148n) weakReference.get();
                if (nVar == null) {
                    this.f593w.remove(weakReference);
                } else {
                    z = nVar.mo716a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo830r();
            if (z) {
                this.f594x = null;
            }
        }
        return z;
    }
}
