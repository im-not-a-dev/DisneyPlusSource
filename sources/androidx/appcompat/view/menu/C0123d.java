package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.widget.C0237h0;
import androidx.appcompat.widget.C0239i0;
import java.util.ArrayList;
import java.util.List;
import p096e.p097a.C3861d;
import p096e.p097a.C3864g;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: CascadingMenuPopup */
final class C0123d extends C0145l implements C0148n, OnKeyListener, OnDismissListener {

    /* renamed from: u0 */
    private static final int f516u0 = C3864g.abc_cascading_menu_item_layout;

    /* renamed from: U */
    private final Context f517U;

    /* renamed from: V */
    private final int f518V;

    /* renamed from: W */
    private final int f519W;

    /* renamed from: X */
    private final int f520X;

    /* renamed from: Y */
    private final boolean f521Y;

    /* renamed from: Z */
    final Handler f522Z;

    /* renamed from: a0 */
    private final List<C0132g> f523a0 = new ArrayList();

    /* renamed from: b0 */
    final List<C0128d> f524b0 = new ArrayList();

    /* renamed from: c0 */
    final OnGlobalLayoutListener f525c0 = new C0124a();

    /* renamed from: d0 */
    private final OnAttachStateChangeListener f526d0 = new C0125b();

    /* renamed from: e0 */
    private final C0237h0 f527e0 = new C0126c();

    /* renamed from: f0 */
    private int f528f0 = 0;

    /* renamed from: g0 */
    private int f529g0 = 0;

    /* renamed from: h0 */
    private View f530h0;

    /* renamed from: i0 */
    View f531i0;

    /* renamed from: j0 */
    private int f532j0;

    /* renamed from: k0 */
    private boolean f533k0;

    /* renamed from: l0 */
    private boolean f534l0;

    /* renamed from: m0 */
    private int f535m0;

    /* renamed from: n0 */
    private int f536n0;

    /* renamed from: o0 */
    private boolean f537o0;

    /* renamed from: p0 */
    private boolean f538p0;

    /* renamed from: q0 */
    private C0149a f539q0;

    /* renamed from: r0 */
    ViewTreeObserver f540r0;

    /* renamed from: s0 */
    private OnDismissListener f541s0;

    /* renamed from: t0 */
    boolean f542t0;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0124a implements OnGlobalLayoutListener {
        C0124a() {
        }

        public void onGlobalLayout() {
            if (C0123d.this.mo733b() && C0123d.this.f524b0.size() > 0 && !((C0128d) C0123d.this.f524b0.get(0)).f550a.mo1656l()) {
                View view = C0123d.this.f531i0;
                if (view == null || !view.isShown()) {
                    C0123d.this.dismiss();
                    return;
                }
                for (C0128d dVar : C0123d.this.f524b0) {
                    dVar.f550a.mo737d();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0125b implements OnAttachStateChangeListener {
        C0125b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0123d.this.f540r0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0123d.this.f540r0 = view.getViewTreeObserver();
                }
                C0123d dVar = C0123d.this;
                dVar.f540r0.removeGlobalOnLayoutListener(dVar.f525c0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0126c implements C0237h0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0127a implements Runnable {

            /* renamed from: U */
            final /* synthetic */ MenuItem f546U;

            /* renamed from: V */
            final /* synthetic */ C0132g f547V;

            /* renamed from: c */
            final /* synthetic */ C0128d f549c;

            C0127a(C0128d dVar, MenuItem menuItem, C0132g gVar) {
                this.f549c = dVar;
                this.f546U = menuItem;
                this.f547V = gVar;
            }

            public void run() {
                C0128d dVar = this.f549c;
                if (dVar != null) {
                    C0123d.this.f542t0 = true;
                    dVar.f551b.mo780a(false);
                    C0123d.this.f542t0 = false;
                }
                if (this.f546U.isEnabled() && this.f546U.hasSubMenu()) {
                    this.f547V.mo781a(this.f546U, 4);
                }
            }
        }

        C0126c() {
        }

        /* renamed from: a */
        public void mo745a(C0132g gVar, MenuItem menuItem) {
            C0128d dVar = null;
            C0123d.this.f522Z.removeCallbacksAndMessages(null);
            int size = C0123d.this.f524b0.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == ((C0128d) C0123d.this.f524b0.get(i)).f551b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0123d.this.f524b0.size()) {
                    dVar = (C0128d) C0123d.this.f524b0.get(i2);
                }
                C0123d.this.f522Z.postAtTime(new C0127a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo746b(C0132g gVar, MenuItem menuItem) {
            C0123d.this.f522Z.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0128d {

        /* renamed from: a */
        public final C0239i0 f550a;

        /* renamed from: b */
        public final C0132g f551b;

        /* renamed from: c */
        public final int f552c;

        public C0128d(C0239i0 i0Var, C0132g gVar, int i) {
            this.f550a = i0Var;
            this.f551b = gVar;
            this.f552c = i;
        }

        /* renamed from: a */
        public ListView mo748a() {
            return this.f550a.mo739f();
        }
    }

    public C0123d(Context context, View view, int i, int i2, boolean z) {
        this.f517U = context;
        this.f530h0 = view;
        this.f519W = i;
        this.f520X = i2;
        this.f521Y = z;
        this.f537o0 = false;
        this.f532j0 = m749h();
        Resources resources = context.getResources();
        this.f518V = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3861d.abc_config_prefDialogWidth));
        this.f522Z = new Handler();
    }

    /* renamed from: c */
    private int m745c(C0132g gVar) {
        int size = this.f524b0.size();
        for (int i = 0; i < size; i++) {
            if (gVar == ((C0128d) this.f524b0.get(i)).f551b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private C0239i0 m748g() {
        C0239i0 i0Var = new C0239i0(this.f517U, null, this.f519W, this.f520X);
        i0Var.mo1685a(this.f527e0);
        i0Var.mo1637a((OnItemClickListener) this);
        i0Var.mo1639a((OnDismissListener) this);
        i0Var.mo1636a(this.f530h0);
        i0Var.mo1646f(this.f529g0);
        i0Var.mo1640a(true);
        i0Var.mo1648g(2);
        return i0Var;
    }

    /* renamed from: h */
    private int m749h() {
        return C4187x.m14399n(this.f530h0) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo729a(C0132g gVar) {
        gVar.mo778a((C0148n) this, this.f517U);
        if (mo733b()) {
            m747d(gVar);
        } else {
            this.f523a0.add(gVar);
        }
    }

    /* renamed from: a */
    public boolean mo730a() {
        return false;
    }

    /* renamed from: b */
    public void mo732b(boolean z) {
        this.f537o0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo736c() {
        return false;
    }

    /* renamed from: d */
    public void mo737d() {
        if (!mo733b()) {
            for (C0132g d : this.f523a0) {
                m747d(d);
            }
            this.f523a0.clear();
            this.f531i0 = this.f530h0;
            if (this.f531i0 != null) {
                boolean z = this.f540r0 == null;
                this.f540r0 = this.f531i0.getViewTreeObserver();
                if (z) {
                    this.f540r0.addOnGlobalLayoutListener(this.f525c0);
                }
                this.f531i0.addOnAttachStateChangeListener(this.f526d0);
            }
        }
    }

    public void dismiss() {
        int size = this.f524b0.size();
        if (size > 0) {
            C0128d[] dVarArr = (C0128d[]) this.f524b0.toArray(new C0128d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0128d dVar = dVarArr[i];
                if (dVar.f550a.mo733b()) {
                    dVar.f550a.dismiss();
                }
            }
        }
    }

    /* renamed from: f */
    public ListView mo739f() {
        if (this.f524b0.isEmpty()) {
            return null;
        }
        List<C0128d> list = this.f524b0;
        return ((C0128d) list.get(list.size() - 1)).mo748a();
    }

    public void onDismiss() {
        C0128d dVar;
        int size = this.f524b0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0128d) this.f524b0.get(i);
            if (!dVar.f550a.mo733b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f551b.mo780a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: b */
    public boolean mo733b() {
        return this.f524b0.size() > 0 && ((C0128d) this.f524b0.get(0)).f550a.mo733b();
    }

    /* renamed from: b */
    public void mo731b(int i) {
        this.f533k0 = true;
        this.f535m0 = i;
    }

    /* renamed from: c */
    public void mo734c(int i) {
        this.f534l0 = true;
        this.f536n0 = i;
    }

    /* renamed from: a */
    private MenuItem m743a(C0132g gVar, C0132g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo735c(boolean z) {
        this.f538p0 = z;
    }

    /* renamed from: a */
    private View m744a(C0128d dVar, C0132g gVar) {
        int i;
        C0131f fVar;
        MenuItem a = m743a(dVar.f551b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo748a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0131f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0131f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: d */
    private int m746d(int i) {
        List<C0128d> list = this.f524b0;
        ListView a = ((C0128d) list.get(list.size() - 1)).mo748a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f531i0.getWindowVisibleDisplayFrame(rect);
        if (this.f532j0 == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: d */
    private void m747d(C0132g gVar) {
        View view;
        C0128d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f517U);
        C0131f fVar = new C0131f(gVar, from, this.f521Y, f516u0);
        if (!mo733b() && this.f537o0) {
            fVar.mo759a(true);
        } else if (mo733b()) {
            fVar.mo759a(C0145l.m886b(gVar));
        }
        int a = C0145l.m884a(fVar, null, this.f517U, this.f518V);
        C0239i0 g = m748g();
        g.mo1638a((ListAdapter) fVar);
        g.mo1645e(a);
        g.mo1646f(this.f529g0);
        if (this.f524b0.size() > 0) {
            List<C0128d> list = this.f524b0;
            dVar = (C0128d) list.get(list.size() - 1);
            view = m744a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            g.mo1688c(false);
            g.mo1686a((Object) null);
            int d = m746d(a);
            boolean z = d == 1;
            this.f532j0 = d;
            if (VERSION.SDK_INT >= 26) {
                g.mo1636a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f530h0.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f529g0 & 7) == 5) {
                    iArr[0] = iArr[0] + this.f530h0.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f529g0 & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                g.mo1633a(i3);
                g.mo1642b(true);
                g.mo1641b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                g.mo1633a(i3);
                g.mo1642b(true);
                g.mo1641b(i2);
            }
            i3 = i + a;
            g.mo1633a(i3);
            g.mo1642b(true);
            g.mo1641b(i2);
        } else {
            if (this.f533k0) {
                g.mo1633a(this.f535m0);
            }
            if (this.f534l0) {
                g.mo1641b(this.f536n0);
            }
            g.mo1634a(mo972e());
        }
        this.f524b0.add(new C0128d(g, gVar, this.f532j0));
        g.mo737d();
        ListView f = g.mo739f();
        f.setOnKeyListener(this);
        if (dVar == null && this.f538p0 && gVar.mo816h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C3864g.abc_popup_menu_header_item_layout, f, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.mo816h());
            f.addHeaderView(frameLayout, null, false);
            g.mo737d();
        }
    }

    /* renamed from: a */
    public void mo713a(boolean z) {
        for (C0128d a : this.f524b0) {
            C0145l.m885a(a.mo748a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo712a(C0149a aVar) {
        this.f539q0 = aVar;
    }

    /* renamed from: a */
    public boolean mo717a(C0157s sVar) {
        for (C0128d dVar : this.f524b0) {
            if (sVar == dVar.f551b) {
                dVar.mo748a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        mo729a((C0132g) sVar);
        C0149a aVar = this.f539q0;
        if (aVar != null) {
            aVar.mo534a(sVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo710a(C0132g gVar, boolean z) {
        int c = m745c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f524b0.size()) {
                ((C0128d) this.f524b0.get(i)).f551b.mo780a(false);
            }
            C0128d dVar = (C0128d) this.f524b0.remove(c);
            dVar.f551b.mo797b((C0148n) this);
            if (this.f542t0) {
                dVar.f550a.mo1687b(null);
                dVar.f550a.mo1643d(0);
            }
            dVar.f550a.dismiss();
            int size = this.f524b0.size();
            if (size > 0) {
                this.f532j0 = ((C0128d) this.f524b0.get(size - 1)).f552c;
            } else {
                this.f532j0 = m749h();
            }
            if (size == 0) {
                dismiss();
                C0149a aVar = this.f539q0;
                if (aVar != null) {
                    aVar.mo533a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f540r0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f540r0.removeGlobalOnLayoutListener(this.f525c0);
                    }
                    this.f540r0 = null;
                }
                this.f531i0.removeOnAttachStateChangeListener(this.f526d0);
                this.f541s0.onDismiss();
            } else if (z) {
                ((C0128d) this.f524b0.get(0)).f551b.mo780a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo726a(int i) {
        if (this.f528f0 != i) {
            this.f528f0 = i;
            this.f529g0 = C4139e.m14173a(i, C4187x.m14399n(this.f530h0));
        }
    }

    /* renamed from: a */
    public void mo727a(View view) {
        if (this.f530h0 != view) {
            this.f530h0 = view;
            this.f529g0 = C4139e.m14173a(this.f528f0, C4187x.m14399n(this.f530h0));
        }
    }

    /* renamed from: a */
    public void mo728a(OnDismissListener onDismissListener) {
        this.f541s0 = onDismissListener;
    }
}
