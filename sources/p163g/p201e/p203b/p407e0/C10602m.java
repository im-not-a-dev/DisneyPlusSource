package p163g.p201e.p203b.p407e0;

import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepositoryImpl;", "Lcom/bamtechmedia/dominguez/watchlist/WatchlistRepository;", "remote", "Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "(Lcom/bamtechmedia/dominguez/watchlist/remote/RemoteWatchlistDataSource;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;)V", "addItem", "Lio/reactivex/Completable;", "contentId", "", "removeItem", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.e0.m */
/* compiled from: WatchlistRepositoryImpl.kt */
public final class C10602m implements C10601l {

    /* renamed from: a */
    private final RemoteWatchlistDataSource f25042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3419l f25043b;

    /* renamed from: g.e.b.e0.m$a */
    /* compiled from: WatchlistRepositoryImpl.kt */
    static final class C10603a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C10602m f25044a;

        C10603a(C10602m mVar) {
            this.f25044a = mVar;
        }

        public final void run() {
            this.f25044a.f25043b.mo12595a(ContentSetType.WatchlistSet);
        }
    }

    /* renamed from: g.e.b.e0.m$b */
    /* compiled from: WatchlistRepositoryImpl.kt */
    static final class C10604b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C10602m f25045a;

        C10604b(C10602m mVar) {
            this.f25045a = mVar;
        }

        public final void run() {
            this.f25045a.f25043b.mo12595a(ContentSetType.WatchlistSet);
        }
    }

    public C10602m(RemoteWatchlistDataSource remoteWatchlistDataSource, C3419l lVar) {
        this.f25042a = remoteWatchlistDataSource;
        this.f25043b = lVar;
    }

    /* renamed from: b */
    public Completable mo27468b(String str) {
        Completable b = this.f25042a.mo21109b(C13183n.m40498a(str)).mo30228e().mo30050b((C11945a) new C10604b(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "remote.removeItems(listO…etsOfType(WatchlistSet) }");
        return b;
    }

    /* renamed from: a */
    public Completable mo27467a(String str) {
        Completable b = this.f25042a.mo21108a(C13183n.m40498a(str)).mo30228e().mo30050b((C11945a) new C10603a(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "remote.add(listOf(conten…etsOfType(WatchlistSet) }");
        return b;
    }
}
