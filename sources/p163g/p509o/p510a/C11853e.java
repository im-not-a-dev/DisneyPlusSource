package p163g.p509o.p510a;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p163g.p509o.p510a.C11863k;

/* renamed from: g.o.a.e */
/* compiled from: Item */
public abstract class C11853e<VH extends C11863k> implements C11847b, C11862j {
    private static AtomicLong ID_COUNTER = new AtomicLong(0);
    private Map<String, Object> extras;

    /* renamed from: id */
    private final long f27508id;
    protected C11852d parentDataObserver;

    public C11853e() {
        this(ID_COUNTER.decrementAndGet());
    }

    public abstract void bind(VH vh, int i);

    public void bind(VH vh, int i, List<Object> list, C11857g gVar, C11858h hVar) {
        vh.mo30012a(this, gVar, hVar);
        bind(vh, i, list);
    }

    public VH createViewHolder(View view) {
        return new C11863k(view);
    }

    public Object getChangePayload(C11853e eVar) {
        return null;
    }

    public int getDragDirs() {
        return 0;
    }

    public Map<String, Object> getExtras() {
        return this.extras;
    }

    public long getId() {
        return this.f27508id;
    }

    public C11853e getItem(int i) {
        if (i == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wanted item at position ");
        sb.append(i);
        sb.append(" but an Item is a Group of size 1");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemCount() {
        return 1;
    }

    public abstract int getLayout();

    public int getPosition(C11853e eVar) {
        return this == eVar ? 0 : -1;
    }

    public int getSpanSize(int i, int i2) {
        return i;
    }

    public int getSwipeDirs() {
        return 0;
    }

    public int getViewType() {
        return getLayout();
    }

    public boolean isClickable() {
        return true;
    }

    public boolean isLongClickable() {
        return true;
    }

    public boolean isRecyclable() {
        return true;
    }

    public boolean isSameAs(C11853e eVar) {
        boolean z = false;
        if (getViewType() != eVar.getViewType()) {
            return false;
        }
        if (getId() == eVar.getId()) {
            z = true;
        }
        return z;
    }

    public void notifyChanged() {
        C11852d dVar = this.parentDataObserver;
        if (dVar != null) {
            dVar.mo29958a(this, 0);
        }
    }

    public void registerGroupDataObserver(C11852d dVar) {
        this.parentDataObserver = dVar;
    }

    public void unbind(VH vh) {
        vh.mo30015d();
    }

    public void unregisterGroupDataObserver(C11852d dVar) {
        this.parentDataObserver = null;
    }

    protected C11853e(long j) {
        this.extras = new HashMap();
        this.f27508id = j;
    }

    public void bind(VH vh, int i, List<Object> list) {
        bind(vh, i);
    }

    public void notifyChanged(Object obj) {
        C11852d dVar = this.parentDataObserver;
        if (dVar != null) {
            dVar.mo29961a((C11847b) this, 0, obj);
        }
    }
}
