package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.collections.items.q */
/* compiled from: ShelfGridItem.kt */
public final class C3379q extends C3384s {

    /* renamed from: Y */
    private final C3392v f8520Y;

    /* renamed from: Z */
    private final int f8521Z;

    public C3379q(C3392v vVar, int i) {
        super(vVar);
        this.f8520Y = vVar;
        this.f8521Z = i;
    }

    /* renamed from: a */
    public boolean mo12491a() {
        return this.f8521Z == 0 && super.mo12491a();
    }

    /* renamed from: b */
    public boolean mo12492b() {
        return this.f8521Z == 0 && !mo12514g().mo12620a(C3788m.DISABLE_FIRST_GRID_ROW_TOP_PADDING);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3379q) {
                C3379q qVar = (C3379q) obj;
                if (C12880j.m40224a((Object) this.f8520Y, (Object) qVar.f8520Y)) {
                    if (this.f8521Z == qVar.f8521Z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C5364g.shelf_item_grid;
    }

    public int hashCode() {
        C3392v vVar = this.f8520Y;
        return ((vVar != null ? vVar.hashCode() : 0) * 31) + this.f8521Z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfGridItem(parameters=");
        sb.append(this.f8520Y);
        sb.append(", rowIndex=");
        sb.append(this.f8521Z);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        super.bind(bVar, i);
        bVar.itemView.setTag(C5363f.viewHelperIgnoreOffset, Boolean.valueOf(true));
    }
}
