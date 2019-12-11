package com.bamtechmedia.dominguez.profiles.p258db;

import com.bamtechmedia.dominguez.profiles.C6659f0;
import java.util.List;
import p520io.reactivex.Completable;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.c */
/* compiled from: ProfilesDao.kt */
public abstract class C6639c {
    /* renamed from: a */
    public abstract Completable mo19312a(C6659f0 f0Var);

    /* renamed from: a */
    public abstract Completable mo19313a(String str);

    /* renamed from: a */
    public abstract Single<C6659f0> mo19314a();

    /* renamed from: a */
    public abstract void mo19315a(List<C6659f0> list);

    /* renamed from: b */
    public abstract Flowable<C6659f0> mo19316b();

    /* renamed from: b */
    public void mo19317b(List<C6659f0> list) {
        mo19318c();
        mo19315a(list);
    }

    /* renamed from: c */
    public abstract void mo19318c();

    /* renamed from: d */
    public abstract Flowable<List<C6659f0>> mo19319d();
}
