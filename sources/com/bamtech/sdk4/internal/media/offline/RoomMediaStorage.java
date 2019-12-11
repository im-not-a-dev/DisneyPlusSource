package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0013H\u0016J \u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/RoomMediaStorage;", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "db", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;)V", "get", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "mediaId", "", "getAll", "Lio/reactivex/Single;", "", "getCachedMediaStatusChanges", "Lio/reactivex/Flowable;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getDownloadSettings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "getDownloadStatusFlowable", "getMaxOrderNumber", "", "markLicenseForRemoval", "Lio/reactivex/Completable;", "license", "", "audioLicense", "permanently", "", "remove", "store", "media", "updateDownloadSettings", "settings", "updateOrder", "", "orderNumber", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
public final class RoomMediaStorage implements MediaStorage {
    /* access modifiers changed from: private */

    /* renamed from: db */
    public final OfflineDatabase f6074db;

    public RoomMediaStorage(OfflineDatabase offlineDatabase) {
        this.f6074db = offlineDatabase;
    }

    public Maybe<CachedMedia> get(ServiceTransaction serviceTransaction, String str) {
        Maybe<CachedMedia> b = Maybe.m38256a((Callable<? extends MaybeSource<? extends T>>) new RoomMediaStorage$get$1<Object>(this, str)).mo30119b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Maybe.defer {\n          …scribeOn(Schedulers.io())");
        return b;
    }

    public Single<? extends List<CachedMedia>> getAll(ServiceTransaction serviceTransaction) {
        Single<? extends List<CachedMedia>> b = Single.m38401c((Callable<? extends T>) new RoomMediaStorage$getAll$1<Object>(this)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.fromCallable { db…scribeOn(Schedulers.io())");
        return b;
    }

    public Single<DownloadSettings> getDownloadSettings(ServiceTransaction serviceTransaction) {
        Single<DownloadSettings> b = Single.m38401c((Callable<? extends T>) new RoomMediaStorage$getDownloadSettings$1<Object>(this)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.fromCallable { db…scribeOn(Schedulers.io())");
        return b;
    }

    public Completable markLicenseForRemoval(ServiceTransaction serviceTransaction, String str, byte[] bArr, byte[] bArr2, boolean z) {
        RoomMediaStorage$markLicenseForRemoval$1 roomMediaStorage$markLicenseForRemoval$1 = new RoomMediaStorage$markLicenseForRemoval$1(this, str, bArr, bArr2, z);
        Completable c = Completable.m38166c((C11945a) roomMediaStorage$markLicenseForRemoval$1);
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.fromAction {…= permanently))\n        }");
        return c;
    }

    public Completable store(ServiceTransaction serviceTransaction, CachedMedia cachedMedia) {
        Completable b = Completable.m38166c((C11945a) new RoomMediaStorage$store$1(this, cachedMedia)).mo30051b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.fromAction {…scribeOn(Schedulers.io())");
        return b;
    }
}
