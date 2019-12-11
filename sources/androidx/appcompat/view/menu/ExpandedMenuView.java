package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0132g.C0134b;
import androidx.appcompat.widget.C0284t0;

public final class ExpandedMenuView extends ListView implements C0134b, C0150o, OnItemClickListener {

    /* renamed from: V */
    private static final int[] f466V = {16842964, 16843049};

    /* renamed from: U */
    private int f467U;

    /* renamed from: c */
    private C0132g f468c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public void mo634a(C0132g gVar) {
        this.f468c = gVar;
    }

    public int getWindowAnimations() {
        return this.f467U;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo635a((C0137j) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0284t0 a = C0284t0.m1486a(context, attributeSet, f466V, i, 0);
        if (a.mo1922g(0)) {
            setBackgroundDrawable(a.mo1912b(0));
        }
        if (a.mo1922g(1)) {
            setDivider(a.mo1912b(1));
        }
        a.mo1908a();
    }

    /* renamed from: a */
    public boolean mo635a(C0137j jVar) {
        return this.f468c.mo781a((MenuItem) jVar, 0);
    }
}
