package com.bamtech.player.exo.p040h;

import com.google.android.exoplayer2.metadata.p359j.C8758b;
import com.google.android.exoplayer2.metadata.p359j.C8760c;
import com.google.android.exoplayer2.metadata.p359j.C8762d;
import com.google.android.exoplayer2.metadata.p359j.C8764e;
import com.google.android.exoplayer2.metadata.p359j.C8766f;
import com.google.android.exoplayer2.metadata.p359j.C8768g;
import com.google.android.exoplayer2.metadata.p359j.C8773i;
import com.google.android.exoplayer2.metadata.p359j.C8778l;
import com.google.android.exoplayer2.metadata.p359j.C8780m;
import com.google.android.exoplayer2.metadata.p359j.C8782n;
import p163g.p174d.p178b.p190h0.C5275b;
import p163g.p174d.p178b.p190h0.C5277d;
import p163g.p174d.p178b.p190h0.C5278e;
import p163g.p174d.p178b.p190h0.C5279f;

/* renamed from: com.bamtech.player.exo.h.a */
/* compiled from: Id3Adpater */
public class C1709a {
    /* renamed from: a */
    public static C5275b m7933a(C8773i iVar) {
        if (iVar instanceof C8758b) {
            C8758b bVar = (C8758b) iVar;
            return new C5275b(bVar.f18626c, bVar);
        }
        String str = "TIT2";
        if (iVar instanceof C8760c) {
            C8760c cVar = (C8760c) iVar;
            if (str.equals(cVar.f18626c)) {
                return new C5278e(cVar.f18602U);
            }
            return new C5275b(cVar.f18626c, cVar);
        } else if (iVar instanceof C8762d) {
            C8762d dVar = (C8762d) iVar;
            return new C5275b(dVar.f18626c, dVar);
        } else if (iVar instanceof C8764e) {
            C8764e eVar = (C8764e) iVar;
            return new C5275b(eVar.f18626c, eVar);
        } else if (iVar instanceof C8766f) {
            C8766f fVar = (C8766f) iVar;
            return new C5275b(fVar.f18626c, fVar);
        } else if (iVar instanceof C8768g) {
            C8768g gVar = (C8768g) iVar;
            return new C5275b(gVar.f18626c, gVar);
        } else if (iVar instanceof C8778l) {
            C8778l lVar = (C8778l) iVar;
            return new C5277d(lVar.f18635U, lVar.f18636V);
        } else if (iVar instanceof C8780m) {
            C8780m mVar = (C8780m) iVar;
            if (!str.equals(mVar.f18626c)) {
                return new C5279f(mVar.f18638V);
            }
            String str2 = mVar.f18638V;
            if (str2 == null) {
                return new C5278e(mVar.f18637U);
            }
            return new C5278e(str2);
        } else if (!(iVar instanceof C8782n)) {
            return new C5275b(iVar.f18626c, iVar);
        } else {
            C8782n nVar = (C8782n) iVar;
            return new C5275b(nVar.f18626c, nVar);
        }
    }
}
