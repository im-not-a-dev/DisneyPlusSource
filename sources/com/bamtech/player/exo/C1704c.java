package com.bamtech.player.exo;

import android.app.Activity;
import android.content.Context;
import com.bamtech.player.exo.p042j.C1717a;
import com.bamtech.player.exo.p045m.C1734b;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.C5284j;
import p163g.p174d.p178b.C5300m;

/* renamed from: com.bamtech.player.exo.c */
/* compiled from: ExoMediaSessionPlugin */
public class C1704c implements C5284j {

    /* renamed from: a */
    private C1734b f5944a;

    /* renamed from: a */
    public void mo7575a(Context context, C5280i iVar) {
        if (context instanceof Activity) {
            C1708g y = ((C1706e) iVar.mo7539d()).mo7644y();
            C5300m b = iVar.mo7537b();
            this.f5944a = new C1734b((Activity) context, y);
            new C1717a(this.f5944a, b);
        }
    }
}
