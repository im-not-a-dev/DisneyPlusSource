package com.bamtechmedia.dominguez.channels.p073tv.p077j;

import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3663f;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.google.common.base.C10368c;
import java.util.List;
import p520io.reactivex.Maybe;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.j.c */
/* compiled from: ContinueWatchingProgramCandidateProvider.kt */
public final class C3232c extends C3228b {

    /* renamed from: d */
    private final C3678l f8219d;

    public C3232c(C3663f fVar, C3765c cVar, C10368c<C3626b, C3224c> cVar2, C3678l lVar) {
        super(fVar, cVar, cVar2);
        this.f8219d = lVar;
    }

    /* renamed from: a */
    public Maybe<List<C3224c>> mo12288a() {
        return mo12284a(this.f8219d.mo13390c(), C13186o0.m40524a(ContentSetType.ContinueWatchingSet));
    }
}
