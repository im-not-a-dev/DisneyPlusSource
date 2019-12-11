package com.bamtechmedia.dominguez.collections;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.collections.C3454q.C3455a;
import com.bamtechmedia.dominguez.collections.caching.C3314g;
import com.bamtechmedia.dominguez.collections.caching.CollectionRefreshManager;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;

/* renamed from: com.bamtechmedia.dominguez.collections.u */
/* compiled from: CollectionViewModelModule */
public abstract class C3489u {
    /* renamed from: a */
    static C3454q m11856a(C3455a aVar, Fragment fragment, C3676k kVar) {
        return aVar.mo12651a(fragment, kVar);
    }

    /* renamed from: a */
    static C3314g m11855a(C3419l lVar, C3330h hVar) {
        return new CollectionRefreshManager(lVar, hVar);
    }
}
