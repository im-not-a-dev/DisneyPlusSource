package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: MenuPopup */
abstract class C0145l implements C0153q, C0148n, OnItemClickListener {

    /* renamed from: c */
    private Rect f643c;

    C0145l() {
    }

    /* renamed from: b */
    protected static boolean m886b(C0132g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo726a(int i);

    /* renamed from: a */
    public void mo708a(Context context, C0132g gVar) {
    }

    /* renamed from: a */
    public void mo971a(Rect rect) {
        this.f643c = rect;
    }

    /* renamed from: a */
    public abstract void mo727a(View view);

    /* renamed from: a */
    public abstract void mo728a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo729a(C0132g gVar);

    /* renamed from: a */
    public boolean mo716a(C0132g gVar, C0137j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo731b(int i);

    /* renamed from: b */
    public abstract void mo732b(boolean z);

    /* renamed from: b */
    public boolean mo720b(C0132g gVar, C0137j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo734c(int i);

    /* renamed from: c */
    public abstract void mo735c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo736c() {
        return true;
    }

    /* renamed from: e */
    public Rect mo972e() {
        return this.f643c;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m885a(listAdapter).f569c.mo782a((MenuItem) listAdapter.getItem(i), (C0148n) this, mo736c() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m884a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0131f m885a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0131f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0131f) listAdapter;
    }
}
