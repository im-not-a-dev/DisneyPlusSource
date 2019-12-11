package com.bamtechmedia.dominguez.collections.caching;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import kotlin.Metadata;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/caching/CollectionRefreshManager;", "Lcom/bamtechmedia/dominguez/collections/caching/RefreshManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "cache", "Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "(Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/collections/CollectionCache;)V", "forceCollectionRefresh", "", "getForceCollectionRefresh", "()Z", "setForceCollectionRefresh", "(Z)V", "forceContentSetRefresh", "getForceContentSetRefresh", "setForceContentSetRefresh", "doRefreshCollectionsIfRequired", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "doRefreshContentSetIfRequired", "", "setType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "invalidateSet", "contentSetType", "isCollectionExpired", "refreshAllExpiredCollections", "updateSetLastFetched", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CollectionRefreshManager.kt */
public final class CollectionRefreshManager implements C3314g, C0710d {

    /* renamed from: U */
    private boolean f8331U;

    /* renamed from: V */
    private final C3419l f8332V;

    /* renamed from: W */
    private final C3330h f8333W;

    /* renamed from: c */
    private boolean f8334c;

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.CollectionRefreshManager$a */
    /* compiled from: CollectionRefreshManager.kt */
    public static final class C3290a {
        private C3290a() {
        }

        public /* synthetic */ C3290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3290a(null);
    }

    public CollectionRefreshManager(C3419l lVar, C3330h hVar) {
        this.f8332V = lVar;
        this.f8333W = hVar;
    }

    /* renamed from: c */
    private final boolean m11362c(ContentSetType contentSetType) {
        DateTime c = this.f8333W.mo12347c(contentSetType);
        if (c != null) {
            DateTime plusHours = c.plusHours(3);
            if (plusHours != null) {
                return plusHours.isBeforeNow();
            }
        }
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: a */
    public void mo12334a(C3676k kVar) {
        if (!mo12338b(kVar)) {
            mo12336b(ContentSetType.ContinueWatchingSet);
            mo12336b(ContentSetType.WatchlistSet);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: b */
    public boolean mo12337b() {
        return this.f8331U;
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: d */
    public boolean mo12339d() {
        return this.f8334c;
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: b */
    public boolean mo12338b(C3676k kVar) {
        if (!mo12337b()) {
            boolean c = m11361c(kVar);
            if (c) {
                this.f8332V.mo12594a(kVar);
            }
            if (!c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m11361c(C3676k kVar) {
        DateTime c = this.f8333W.mo12346c(kVar);
        if (c != null) {
            DateTime plusHours = c.plusHours(3);
            if (plusHours != null) {
                return plusHours.isBeforeNow();
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo12335a(ContentSetType contentSetType) {
        this.f8333W.mo12343a(contentSetType);
    }

    /* renamed from: b */
    public void mo12336b(ContentSetType contentSetType) {
        if (mo12339d() || m11362c(contentSetType)) {
            this.f8332V.mo12595a(contentSetType);
        }
    }
}
