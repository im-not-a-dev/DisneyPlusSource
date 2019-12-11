package com.bamtechmedia.dominguez.detail.common.p230g0.p231i;

import com.bamtechmedia.dominguez.collections.items.ShelfItemLayoutWrapper;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.c */
/* compiled from: EmptyPlayableItem.kt */
public final class C5961c extends C11866a {

    /* renamed from: c */
    private final C3444j f13785c;

    public C5961c(C3444j jVar) {
        this.f13785c = jVar;
    }

    public int getLayout() {
        return C7312f.empty_playable_item;
    }

    public void bind(C11867b bVar, int i) {
        ((ShelfItemLayoutWrapper) bVar.mo20994a().findViewById(C7310d.shelfItemLayout)).setConfig(this.f13785c);
    }
}
