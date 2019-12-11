package com.bamtechmedia.dominguez.profiles.p258db;

import com.bamtechmedia.dominguez.profiles.C6669h;
import java.util.List;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.a */
/* compiled from: AvatarsDao.kt */
public abstract class C6632a {
    /* renamed from: a */
    public abstract Completable mo19302a(C6669h hVar);

    /* renamed from: a */
    public abstract Single<List<C6669h>> mo19303a();

    /* renamed from: a */
    public abstract void mo19304a(List<C6669h> list);

    /* renamed from: b */
    public abstract void mo19305b();

    /* renamed from: b */
    public void mo19306b(List<C6669h> list) {
        mo19305b();
        mo19304a(list);
    }
}
