package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&Jp\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00030\u00042\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/TrackHelper;", "", "getMatchingMatchingAudioAndSubtitleTrackNames", "Lkotlin/Pair;", "", "", "candidate", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "getTracks", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "availableTrackGroups", "trackType", "languageFilter", "group", "renditionKeyType", "bypassEmpty", "", "bypassAudioVerification", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TrackHelper.kt */
public interface TrackHelper {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: TrackHelper.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ List getTracks$default(TrackHelper trackHelper, ServiceTransaction serviceTransaction, List list, int i, List list2, List list3, int i2, boolean z, boolean z2, int i3, Object obj) {
            if (obj == null) {
                return trackHelper.getTracks(serviceTransaction, list, i, list2, list3, i2, z, (i3 & 128) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTracks");
        }
    }

    Pair<List<String>, List<String>> getMatchingMatchingAudioAndSubtitleTrackNames(VariantCandidate variantCandidate);

    List<Pair<Integer, VariantCandidate>> getTracks(ServiceTransaction serviceTransaction, List<VariantCandidate> list, int i, List<String> list2, List<String> list3, int i2, boolean z, boolean z2);
}
