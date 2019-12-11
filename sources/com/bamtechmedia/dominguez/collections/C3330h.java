package com.bamtechmedia.dominguez.collections;

import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import org.joda.time.DateTime;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.collections.h */
/* compiled from: CollectionCache.kt */
public interface C3330h {
    /* renamed from: a */
    Single<C3658a> mo12341a(C3676k kVar, Single<C3658a> single);

    /* renamed from: a */
    void mo12342a(C3676k kVar, C3658a aVar);

    /* renamed from: a */
    void mo12343a(ContentSetType contentSetType);

    /* renamed from: b */
    Maybe<C3658a> mo12344b(C3676k kVar);

    /* renamed from: b */
    void mo12345b(ContentSetType contentSetType);

    /* renamed from: c */
    DateTime mo12346c(C3676k kVar);

    /* renamed from: c */
    DateTime mo12347c(ContentSetType contentSetType);

    /* renamed from: d */
    String mo12348d(C3676k kVar);

    /* renamed from: e */
    Single<C3658a> mo12349e(C3676k kVar);

    /* renamed from: e */
    void mo12350e();
}
