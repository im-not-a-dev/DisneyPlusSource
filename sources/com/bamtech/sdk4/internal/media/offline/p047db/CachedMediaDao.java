package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.media.offline.DownloadError;
import com.bamtech.sdk4.media.offline.LicenseRenewalResult;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\t\u001a\u00020\nH'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0011H'J:\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH'J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\f2\u0006\u0010\t\u001a\u00020\nH'¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaDao;", "", "delete", "", "media", "Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaEntry;", "getAll", "", "getById", "mediaId", "", "getDownloadStatusFlowableById", "Lio/reactivex/Flowable;", "getLicenseRenewalCandidates", "excludedRenewalResults", "getMaxOrderNumber", "Lio/reactivex/Maybe;", "", "store", "updateOrder", "order", "updateStatus", "type", "bytesDownloaded", "", "percentageComplete", "", "error", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "timestamp", "Lorg/joda/time/DateTime;", "watchChangesById", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao */
/* compiled from: CachedMediaDao.kt */
public interface CachedMediaDao {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao$DefaultImpls */
    /* compiled from: CachedMediaDao.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ List getLicenseRenewalCandidates$default(CachedMediaDao cachedMediaDao, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    list = C13185o.m40520c(LicenseRenewalResult.FatalErrorSingle.name(), LicenseRenewalResult.FatalErrorAll.name());
                }
                return cachedMediaDao.getLicenseRenewalCandidates(list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLicenseRenewalCandidates");
        }
    }

    void delete(CachedMediaEntry cachedMediaEntry);

    List<CachedMediaEntry> getAll();

    CachedMediaEntry getById(String str);

    List<CachedMediaEntry> getLicenseRenewalCandidates(List<String> list);

    void store(CachedMediaEntry cachedMediaEntry);

    void updateStatus(String str, String str2, long j, float f, DownloadError downloadError, DateTime dateTime);
}
