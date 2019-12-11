package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0150o.C0151a;
import java.util.ArrayList;
import p096e.p097a.C3864g;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: ListMenuPresenter */
public class C0129e implements C0148n, OnItemClickListener {

    /* renamed from: U */
    LayoutInflater f553U;

    /* renamed from: V */
    C0132g f554V;

    /* renamed from: W */
    ExpandedMenuView f555W;

    /* renamed from: X */
    int f556X;

    /* renamed from: Y */
    int f557Y;

    /* renamed from: Z */
    int f558Z;

    /* renamed from: a0 */
    private C0149a f559a0;

    /* renamed from: b0 */
    C0130a f560b0;

    /* renamed from: c */
    Context f561c;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0130a extends BaseAdapter {

        /* renamed from: c */
        private int f563c = -1;

        public C0130a() {
            mo752a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo752a() {
            C0137j f = C0129e.this.f554V.mo812f();
            if (f != null) {
                ArrayList j = C0129e.this.f554V.mo820j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C0137j) j.get(i)) == f) {
                        this.f563c = i;
                        return;
                    }
                }
            }
            this.f563c = -1;
        }

        public int getCount() {
            int size = C0129e.this.f554V.mo820j().size() - C0129e.this.f556X;
            return this.f563c < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0129e eVar = C0129e.this;
                view = eVar.f553U.inflate(eVar.f558Z, viewGroup, false);
            }
            ((C0151a) view).mo612a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo752a();
            super.notifyDataSetChanged();
        }

        public C0137j getItem(int i) {
            ArrayList j = C0129e.this.f554V.mo820j();
            int i2 = i + C0129e.this.f556X;
            int i3 = this.f563c;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0137j) j.get(i2);
        }
    }

    public C0129e(Context context, int i) {
        this(i, 0);
        this.f561c = context;
        this.f553U = LayoutInflater.from(this.f561c);
    }

    /* renamed from: a */
    public void mo708a(Context context, C0132g gVar) {
        int i = this.f557Y;
        if (i != 0) {
            this.f561c = new ContextThemeWrapper(context, i);
            this.f553U = LayoutInflater.from(this.f561c);
        } else if (this.f561c != null) {
            this.f561c = context;
            if (this.f553U == null) {
                this.f553U = LayoutInflater.from(this.f561c);
            }
        }
        this.f554V = gVar;
        C0130a aVar = this.f560b0;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo730a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo716a(C0132g gVar, C0137j jVar) {
        return false;
    }

    /* renamed from: b */
    public ListAdapter mo750b() {
        if (this.f560b0 == null) {
            this.f560b0 = new C0130a();
        }
        return this.f560b0;
    }

    /* renamed from: b */
    public boolean mo720b(C0132g gVar, C0137j jVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f554V.mo782a((MenuItem) this.f560b0.getItem(i), (C0148n) this, 0);
    }

    public C0129e(int i, int i2) {
        this.f558Z = i;
        this.f557Y = i2;
    }

    /* renamed from: a */
    public C0150o mo749a(ViewGroup viewGroup) {
        if (this.f555W == null) {
            this.f555W = (ExpandedMenuView) this.f553U.inflate(C3864g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f560b0 == null) {
                this.f560b0 = new C0130a();
            }
            this.f555W.setAdapter(this.f560b0);
            this.f555W.setOnItemClickListener(this);
        }
        return this.f555W;
    }

    /* renamed from: a */
    public void mo713a(boolean z) {
        C0130a aVar = this.f560b0;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo712a(C0149a aVar) {
        this.f559a0 = aVar;
    }

    /* renamed from: a */
    public boolean mo717a(C0157s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new C0135h(sVar).mo841a((IBinder) null);
        C0149a aVar = this.f559a0;
        if (aVar != null) {
            aVar.mo534a(sVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo710a(C0132g gVar, boolean z) {
        C0149a aVar = this.f559a0;
        if (aVar != null) {
            aVar.mo533a(gVar, z);
        }
    }
}
