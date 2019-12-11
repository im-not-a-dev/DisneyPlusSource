package p163g.p509o.p510a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0856f;
import androidx.recyclerview.widget.C0856f.C0858b;
import androidx.recyclerview.widget.C0856f.C0859c;
import androidx.recyclerview.widget.C0889n;
import androidx.recyclerview.widget.GridLayoutManager.C0781c;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p163g.p509o.p510a.C11863k;

/* renamed from: g.o.a.c */
/* compiled from: GroupAdapter */
public class C11848c<VH extends C11863k> extends C0797g<VH> implements C11852d {

    /* renamed from: U */
    private C11857g f27495U;

    /* renamed from: V */
    private C11858h f27496V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f27497W = 1;

    /* renamed from: X */
    private C11853e f27498X;

    /* renamed from: Y */
    private C11846a f27499Y = new C11849a();

    /* renamed from: Z */
    private final C0781c f27500Z;

    /* renamed from: c */
    private final List<C11847b> f27501c = new ArrayList();

    /* renamed from: g.o.a.c$a */
    /* compiled from: GroupAdapter */
    class C11849a implements C11846a {
        C11849a() {
        }

        /* renamed from: a */
        public void mo4949a(int i, int i2) {
            C11848c.this.notifyItemMoved(i, i2);
        }

        /* renamed from: b */
        public void mo4951b(int i, int i2) {
            C11848c.this.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: c */
        public void mo4952c(int i, int i2) {
            C11848c.this.notifyItemRangeRemoved(i, i2);
        }

        /* renamed from: a */
        public void mo4950a(int i, int i2, Object obj) {
            C11848c.this.notifyItemRangeChanged(i, i2, obj);
        }
    }

    /* renamed from: g.o.a.c$b */
    /* compiled from: GroupAdapter */
    class C11850b extends C0781c {
        C11850b() {
        }

        /* renamed from: b */
        public int mo4307b(int i) {
            try {
                return C11848c.this.mo13700a(i).getSpanSize(C11848c.this.f27497W, i);
            } catch (IndexOutOfBoundsException unused) {
                return C11848c.this.f27497W;
            }
        }
    }

    /* renamed from: g.o.a.c$c */
    /* compiled from: GroupAdapter */
    private static class C11851c extends C0858b {

        /* renamed from: a */
        private final int f27504a;

        /* renamed from: b */
        private final int f27505b;

        /* renamed from: c */
        private final Collection<? extends C11847b> f27506c;

        /* renamed from: d */
        private final Collection<? extends C11847b> f27507d;

        C11851c(int i, int i2, Collection<? extends C11847b> collection, Collection<? extends C11847b> collection2) {
            this.f27504a = i;
            this.f27505b = i2;
            this.f27506c = collection;
            this.f27507d = collection2;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return C11848c.m37999b(this.f27507d, i2).equals(C11848c.m37999b(this.f27506c, i));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return C11848c.m37999b(this.f27507d, i2).isSameAs(C11848c.m37999b(this.f27506c, i));
        }

        public Object getChangePayload(int i, int i2) {
            return C11848c.m37999b(this.f27506c, i).getChangePayload(C11848c.m37999b(this.f27507d, i2));
        }

        public int getNewListSize() {
            return this.f27505b;
        }

        public int getOldListSize() {
            return this.f27504a;
        }
    }

    public C11848c() {
        new C11845a(this.f27499Y);
        this.f27500Z = new C11850b();
    }

    /* renamed from: d */
    private C11853e<VH> mo13702d(int i) {
        C11853e eVar = this.f27498X;
        if (eVar != null && eVar.getViewType() == i) {
            return this.f27498X;
        }
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            C11853e<VH> a = mo13700a(i2);
            if (a.getViewType() == i) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find model for view type: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i) {
    }

    /* renamed from: b */
    public int mo29966b() {
        return this.f27497W;
    }

    /* renamed from: c */
    public C0781c mo29971c() {
        return this.f27500Z;
    }

    public int getItemCount() {
        return m37998b((Collection<? extends C11847b>) this.f27501c);
    }

    public long getItemId(int i) {
        return mo13700a(i).getId();
    }

    public int getItemViewType(int i) {
        this.f27498X = mo13700a(i);
        C11853e eVar = this.f27498X;
        if (eVar != null) {
            return eVar.getViewType();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid position ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public void onViewRecycled(VH vh) {
        vh.mo30013b().unbind(vh);
    }

    /* renamed from: c */
    public void mo29972c(int i) {
        this.f27497W = i;
    }

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C11853e d = mo13702d(i);
        return d.createViewHolder(from.inflate(d.getLayout(), viewGroup, false));
    }

    /* renamed from: c */
    private void m38000c(Collection<? extends C11847b> collection) {
        for (C11847b unregisterGroupDataObserver : this.f27501c) {
            unregisterGroupDataObserver.unregisterGroupDataObserver(this);
        }
        this.f27501c.clear();
        this.f27501c.addAll(collection);
        for (C11847b registerGroupDataObserver : collection) {
            registerGroupDataObserver.registerGroupDataObserver(this);
        }
    }

    /* renamed from: a */
    public void mo29963a(Collection<? extends C11847b> collection) {
        mo29964a(collection, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C11853e m37999b(Collection<? extends C11847b> collection, int i) {
        int i2 = 0;
        for (C11847b bVar : collection) {
            if (i < bVar.getItemCount() + i2) {
                return bVar.getItem(i - i2);
            }
            i2 += bVar.getItemCount();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested position ");
        sb.append(i);
        sb.append("in group adapter but there are only ");
        sb.append(i2);
        sb.append(" items");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public void mo29964a(Collection<? extends C11847b> collection, boolean z) {
        ArrayList arrayList = new ArrayList(this.f27501c);
        C0859c a = C0856f.m4802a(new C11851c(m37998b((Collection<? extends C11847b>) arrayList), m37998b(collection), arrayList, collection), z);
        m38000c(collection);
        a.mo5013a((C0889n) this.f27499Y);
    }

    /* renamed from: b */
    public int mo29968b(C11847b bVar) {
        int indexOf = this.f27501c.indexOf(bVar);
        if (indexOf == -1) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < indexOf; i2++) {
            i += ((C11847b) this.f27501c.get(i2)).getItemCount();
        }
        return i;
    }

    /* renamed from: c */
    public void mo29973c(C11847b bVar, int i, int i2) {
        int b = mo29968b(bVar);
        notifyItemMoved(i + b, b + i2);
    }

    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        mo13700a(i).bind(vh, i, list, this.f27495U, this.f27496V);
    }

    /* renamed from: b */
    private static int m37998b(Collection<? extends C11847b> collection) {
        int i = 0;
        for (C11847b itemCount : collection) {
            i += itemCount.getItemCount();
        }
        return i;
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(VH vh) {
        return vh.mo30013b().isRecyclable();
    }

    /* renamed from: b */
    public int mo29967b(int i) {
        if (i < this.f27501c.size()) {
            return ((C11847b) this.f27501c.get(i)).getItemCount();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested group index ");
        sb.append(i);
        sb.append(" but there are ");
        sb.append(this.f27501c.size());
        sb.append(" groups");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public C11853e mo13700a(int i) {
        return m37999b(this.f27501c, i);
    }

    /* renamed from: a */
    public int mo29956a() {
        return this.f27501c.size();
    }

    /* renamed from: a */
    public void mo29957a(C11847b bVar) {
        if (bVar != null) {
            int itemCount = getItemCount();
            bVar.registerGroupDataObserver(this);
            this.f27501c.add(bVar);
            notifyItemRangeInserted(itemCount, bVar.getItemCount());
            return;
        }
        throw new RuntimeException("Group cannot be null");
    }

    /* renamed from: b */
    public void mo29969b(C11847b bVar, int i, int i2) {
        notifyItemRangeRemoved(mo29968b(bVar) + i, i2);
    }

    /* renamed from: a */
    public void mo29958a(C11847b bVar, int i) {
        notifyItemChanged(mo29968b(bVar) + i);
    }

    /* renamed from: a */
    public void mo29961a(C11847b bVar, int i, Object obj) {
        notifyItemChanged(mo29968b(bVar) + i, obj);
    }

    /* renamed from: a */
    public void mo29960a(C11847b bVar, int i, int i2, Object obj) {
        notifyItemRangeChanged(mo29968b(bVar) + i, i2, obj);
    }

    /* renamed from: a */
    public void mo29959a(C11847b bVar, int i, int i2) {
        notifyItemRangeInserted(mo29968b(bVar) + i, i2);
    }
}
