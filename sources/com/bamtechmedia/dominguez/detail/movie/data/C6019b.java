package com.bamtechmedia.dominguez.detail.movie.data;

import com.bamtechmedia.dominguez.detail.movie.models.C6024b;
import com.bamtechmedia.dominguez.detail.movie.models.C6026d;
import p163g.p201e.p203b.p287k.p288j.C7319b;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.detail.movie.data.b */
/* compiled from: MovieDetailRepository.kt */
public final class C6019b implements C7319b {

    /* renamed from: a */
    private final MovieDetailRemoteDataSource f13874a;

    public C6019b(MovieDetailRemoteDataSource movieDetailRemoteDataSource) {
        this.f13874a = movieDetailRemoteDataSource;
    }

    /* renamed from: a */
    public Single<C6024b> mo18055a(String str, String str2) {
        return this.f13874a.mo18055a(str, str2);
    }

    /* renamed from: b */
    public Single<C6026d> mo18056b(String str, String str2) {
        return this.f13874a.mo18056b(str, str2);
    }
}
