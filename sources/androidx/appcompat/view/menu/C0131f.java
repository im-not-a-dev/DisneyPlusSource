package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0150o.C0151a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuAdapter */
public class C0131f extends BaseAdapter {

    /* renamed from: U */
    private int f564U = -1;

    /* renamed from: V */
    private boolean f565V;

    /* renamed from: W */
    private final boolean f566W;

    /* renamed from: X */
    private final LayoutInflater f567X;

    /* renamed from: Y */
    private final int f568Y;

    /* renamed from: c */
    C0132g f569c;

    public C0131f(C0132g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f566W = z;
        this.f567X = layoutInflater;
        this.f569c = gVar;
        this.f568Y = i;
        mo758a();
    }

    /* renamed from: a */
    public void mo759a(boolean z) {
        this.f565V = z;
    }

    /* renamed from: b */
    public C0132g mo760b() {
        return this.f569c;
    }

    public int getCount() {
        ArrayList j = this.f566W ? this.f569c.mo820j() : this.f569c.mo824n();
        if (this.f564U < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f567X.inflate(this.f568Y, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f569c.mo825o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0151a aVar = (C0151a) view;
        if (this.f565V) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo612a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo758a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo758a() {
        C0137j f = this.f569c.mo812f();
        if (f != null) {
            ArrayList j = this.f569c.mo820j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0137j) j.get(i)) == f) {
                    this.f564U = i;
                    return;
                }
            }
        }
        this.f564U = -1;
    }

    public C0137j getItem(int i) {
        ArrayList j = this.f566W ? this.f569c.mo820j() : this.f569c.mo824n();
        int i2 = this.f564U;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0137j) j.get(i);
    }
}
