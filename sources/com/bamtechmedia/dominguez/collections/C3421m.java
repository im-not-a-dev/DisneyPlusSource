package com.bamtechmedia.dominguez.collections;

import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import kotlin.C13145v;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11907a;
import p520io.reactivex.Flowable;
import p520io.reactivex.subjects.C11983e;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: com.bamtechmedia.dominguez.collections.m */
/* compiled from: CollectionInvalidatorImpl.kt */
public final class C3421m implements C3419l {

    /* renamed from: a */
    private final C11983e<C3676k> f8647a;

    /* renamed from: b */
    private final C11983e<ContentSetType> f8648b;

    /* renamed from: c */
    private final C11983e<C13145v> f8649c;

    public C3421m() {
        PublishSubject q = PublishSubject.m38553q();
        String str = "PublishSubject.create()";
        Intrinsics.checkReturnedValueIsNotNull((Object) q, str);
        this.f8647a = q;
        PublishSubject q2 = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q2, str);
        this.f8648b = q2;
        PublishSubject q3 = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q3, str);
        this.f8649c = q3;
    }

    /* renamed from: a */
    public void mo12594a(C3676k kVar) {
        this.f8647a.onNext(kVar);
    }

    /* renamed from: b */
    public Flowable<C13145v> mo12596b() {
        Flowable<C13145v> a = this.f8649c.mo30135a(C11907a.LATEST);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "evictAllSubject.toFlowable(LATEST)");
        return a;
    }

    /* renamed from: c */
    public Flowable<C3676k> mo12597c() {
        Flowable<C3676k> a = this.f8647a.mo30135a(C11907a.LATEST);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "slugSubject.toFlowable(LATEST)");
        return a;
    }

    /* renamed from: d */
    public void mo12598d() {
        this.f8649c.onNext(C13145v.f29587a);
    }

    /* renamed from: a */
    public void mo12595a(ContentSetType contentSetType) {
        this.f8648b.onNext(contentSetType);
    }

    /* renamed from: a */
    public Flowable<ContentSetType> mo12593a() {
        Flowable<ContentSetType> a = this.f8648b.mo30135a(C11907a.LATEST);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "setTypeSubject.toFlowable(LATEST)");
        return a;
    }
}
