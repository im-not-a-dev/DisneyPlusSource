package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9678a.C9689f;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
final class C9730e0 extends C9747i0 {

    /* renamed from: U */
    private final ArrayList<C9689f> f22826U;

    /* renamed from: V */
    private final /* synthetic */ C9802y f22827V;

    public C9730e0(C9802y yVar, ArrayList<C9689f> arrayList) {
        this.f22827V = yVar;
        super(yVar, null);
        this.f22826U = arrayList;
    }

    /* renamed from: a */
    public final void mo25116a() {
        this.f22827V.f22991a.f22971n.f22881q = this.f22827V.m30561i();
        ArrayList<C9689f> arrayList = this.f22826U;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C9689f) obj).mo25028a(this.f22827V.f23005o, this.f22827V.f22991a.f22971n.f22881q);
        }
    }
}
