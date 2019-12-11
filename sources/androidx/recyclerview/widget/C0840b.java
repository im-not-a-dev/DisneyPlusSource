package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0797g;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: AdapterListUpdateCallback */
public final class C0840b implements C0889n {

    /* renamed from: a */
    private final C0797g f3420a;

    public C0840b(C0797g gVar) {
        this.f3420a = gVar;
    }

    /* renamed from: a */
    public void mo4949a(int i, int i2) {
        this.f3420a.notifyItemMoved(i, i2);
    }

    /* renamed from: b */
    public void mo4951b(int i, int i2) {
        this.f3420a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo4952c(int i, int i2) {
        this.f3420a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: a */
    public void mo4950a(int i, int i2, Object obj) {
        this.f3420a.notifyItemRangeChanged(i, i2, obj);
    }
}
