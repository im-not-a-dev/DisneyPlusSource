package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0150o.C0151a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0121b implements C0148n {

    /* renamed from: U */
    protected Context f505U;

    /* renamed from: V */
    protected C0132g f506V;

    /* renamed from: W */
    protected LayoutInflater f507W;

    /* renamed from: X */
    private C0149a f508X;

    /* renamed from: Y */
    private int f509Y;

    /* renamed from: Z */
    private int f510Z;

    /* renamed from: a0 */
    protected C0150o f511a0;

    /* renamed from: c */
    protected Context f512c;

    public C0121b(Context context, int i, int i2) {
        this.f512c = context;
        this.f507W = LayoutInflater.from(context);
        this.f509Y = i;
        this.f510Z = i2;
    }

    /* renamed from: a */
    public void mo707a(int i) {
    }

    /* renamed from: a */
    public void mo708a(Context context, C0132g gVar) {
        this.f505U = context;
        LayoutInflater.from(this.f505U);
        this.f506V = gVar;
    }

    /* renamed from: a */
    public abstract void mo711a(C0137j jVar, C0151a aVar);

    /* renamed from: a */
    public abstract boolean mo714a(int i, C0137j jVar);

    /* renamed from: a */
    public boolean mo716a(C0132g gVar, C0137j jVar) {
        return false;
    }

    /* renamed from: b */
    public C0150o mo719b(ViewGroup viewGroup) {
        if (this.f511a0 == null) {
            this.f511a0 = (C0150o) this.f507W.inflate(this.f509Y, viewGroup, false);
            this.f511a0.mo634a(this.f506V);
            mo713a(true);
        }
        return this.f511a0;
    }

    /* renamed from: b */
    public boolean mo720b(C0132g gVar, C0137j jVar) {
        return false;
    }

    /* renamed from: a */
    public void mo713a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f511a0;
        if (viewGroup != null) {
            C0132g gVar = this.f506V;
            int i = 0;
            if (gVar != null) {
                gVar.mo795b();
                ArrayList n = this.f506V.mo824n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0137j jVar = (C0137j) n.get(i3);
                    if (mo714a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0137j itemData = childAt instanceof C0151a ? ((C0151a) childAt).getItemData() : null;
                        View a = mo705a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo709a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo715a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public C0149a mo718b() {
        return this.f508X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo709a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f511a0).addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo715a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo712a(C0149a aVar) {
        this.f508X = aVar;
    }

    /* renamed from: a */
    public C0151a mo706a(ViewGroup viewGroup) {
        return (C0151a) this.f507W.inflate(this.f510Z, viewGroup, false);
    }

    /* renamed from: a */
    public View mo705a(C0137j jVar, View view, ViewGroup viewGroup) {
        C0151a aVar;
        if (view instanceof C0151a) {
            aVar = (C0151a) view;
        } else {
            aVar = mo706a(viewGroup);
        }
        mo711a(jVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo710a(C0132g gVar, boolean z) {
        C0149a aVar = this.f508X;
        if (aVar != null) {
            aVar.mo533a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo717a(C0157s sVar) {
        C0149a aVar = this.f508X;
        if (aVar != null) {
            return aVar.mo534a(sVar);
        }
        return false;
    }
}
