package com.bamtech.player.exo;

import android.content.Context;
import android.widget.TextView;
import com.bamtech.player.exo.p042j.C1722c;
import com.google.android.exoplayer2.p391ui.C9402d;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.C5284j;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;

/* renamed from: com.bamtech.player.exo.f */
/* compiled from: PerformanceMonitoringPlugin.kt */
public final class C1707f implements C5284j {

    /* renamed from: a */
    public C9402d f5962a;

    /* renamed from: b */
    private final TextView f5963b;

    public C1707f(TextView textView) {
        this.f5963b = textView;
    }

    /* renamed from: a */
    public void mo7575a(Context context, C5280i iVar) {
        C5326w d = iVar.mo7539d();
        if (d != null) {
            C1706e eVar = (C1706e) d;
            C1708g y = eVar.mo7644y();
            C5300m b = iVar.mo7537b();
            C12880j.m40222a((Object) b, "engine.getEvents()");
            new C1722c(eVar, b);
            TextView textView = this.f5963b;
            if (textView != null) {
                this.f5962a = new C9402d(y, textView);
                C9402d dVar = this.f5962a;
                if (dVar != null) {
                    dVar.mo24345e();
                } else {
                    C12880j.m40227c("debugTextHelper");
                    throw null;
                }
            }
        } else {
            throw new C13142s("null cannot be cast to non-null type com.bamtech.player.exo.ExoVideoPlayer");
        }
    }
}
