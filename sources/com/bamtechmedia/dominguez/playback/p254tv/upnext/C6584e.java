package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import com.bamtechmedia.dominguez.core.content.C3693o;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p283i.p284a.p285a.C7284a;
import p163g.p201e.p203b.p283i.p284a.p285a.C7285b;
import p520io.reactivex.Completable;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.e */
/* compiled from: TvUpNextRepositoryImpl.kt */
public final class C6584e implements C7285b, C7284a {
    /* renamed from: a */
    public Completable mo19231a(C3693o oVar) {
        Completable a = Completable.m38154a(new Throwable("No offline episodes for tv"));
        C12880j.m40222a((Object) a, "Completable.error(Throwa…ffline episodes for tv\"))");
        return a;
    }
}
