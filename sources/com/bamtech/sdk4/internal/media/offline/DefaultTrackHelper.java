package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.InvalidRequestException;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.source.hls.C9170n;
import com.google.android.exoplayer2.source.hls.C9170n.C9172b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J,\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016Jn\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0019J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0000¢\u0006\u0002\b\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\t*\u00020!H\u0000¢\u0006\u0002\b\"¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultTrackHelper;", "Lcom/bamtech/sdk4/internal/media/offline/TrackHelper;", "()V", "canDecodeAudio", "", "variant", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "getMatchingMatchingAudioAndSubtitleTrackNames", "Lkotlin/Pair;", "", "", "candidate", "getTracks", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "availableTrackGroups", "trackType", "languageFilter", "group", "renditionKeyType", "bypassEmpty", "bypassAudioVerification", "filterLanguages", "languages", "filterLanguages$plugin_offline_media_release", "filterMatchingIds", "matchingGroupIds", "filterMatchingIds$plugin_offline_media_release", "filterPlayableAudio", "filterPlayableAudio$plugin_offline_media_release", "toList", "Lcom/google/android/exoplayer2/source/hls/HlsTrackMetadataEntry$VariantInfo;", "Lcom/google/android/exoplayer2/metadata/Metadata;", "toList$plugin_offline_media_release", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TrackHelper.kt */
public final class DefaultTrackHelper implements TrackHelper {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean canDecodeAudio(com.bamtech.sdk4.internal.media.offline.VariantCandidate r8) {
        /*
            r7 = this;
            com.google.android.exoplayer2.Format r0 = r8.getFormat()
            java.lang.String r0 = r0.f18349b0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006e
            com.google.android.exoplayer2.Format r0 = r8.getFormat()
            java.lang.String r0 = r0.f18349b0
            com.google.android.exoplayer2.Format r3 = r8.getFormat()
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.f18353e0
            if (r3 == 0) goto L_0x0024
            com.google.android.exoplayer2.drm.DrmInitData$b r3 = r3.mo22750a(r1)
            if (r3 == 0) goto L_0x0024
            boolean r3 = r3.f18467Y
            if (r3 != r2) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            com.google.android.exoplayer2.Format r4 = r8.getFormat()
            com.google.android.exoplayer2.drm.DrmInitData r4 = r4.f18353e0
            if (r4 == 0) goto L_0x0039
            com.google.android.exoplayer2.drm.DrmInitData$b r4 = r4.mo22750a(r1)
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.f18467Y
            if (r4 != r2) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            java.util.List r0 = com.google.android.exoplayer2.p381t0.C9275d.m28139b(r0, r3, r4)
            java.lang.String r3 = "MediaCodecUtil.getDecode…SecureDecryption == true)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.google.android.exoplayer2.t0.a r5 = (com.google.android.exoplayer2.p381t0.C9270a) r5
            com.google.android.exoplayer2.Format r6 = r8.getFormat()
            boolean r5 = r5.mo24010a(r6)
            if (r5 == 0) goto L_0x004c
            r3.add(r4)
            goto L_0x004c
        L_0x0067:
            boolean r8 = r3.isEmpty()
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.DefaultTrackHelper.canDecodeAudio(com.bamtech.sdk4.internal.media.offline.VariantCandidate):boolean");
    }

    public final List<VariantCandidate> filterLanguages$plugin_offline_media_release(List<VariantCandidate> list, List<String> list2, boolean z) {
        if (list2.isEmpty() && z && (!list.isEmpty())) {
            return C13183n.m40498a(C13199w.m40589f((List) list));
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            VariantCandidate variantCandidate = (VariantCandidate) next;
            boolean z2 = false;
            if (!list2.isEmpty() && list2.contains(TrackHelperKt.getName(variantCandidate))) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bamtech.sdk4.internal.media.offline.VariantCandidate> filterMatchingIds$plugin_offline_media_release(java.util.List<com.bamtech.sdk4.internal.media.offline.VariantCandidate> r6, java.util.List<java.lang.String> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0009:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.bamtech.sdk4.internal.media.offline.VariantCandidate r2 = (com.bamtech.sdk4.internal.media.offline.VariantCandidate) r2
            if (r7 == 0) goto L_0x0030
            java.util.Iterator r3 = r7.iterator()
        L_0x001c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r2.matchesGroupId(r4)
            if (r4 == 0) goto L_0x001c
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.DefaultTrackHelper.filterMatchingIds$plugin_offline_media_release(java.util.List, java.util.List):java.util.List");
    }

    public final List<VariantCandidate> filterPlayableAudio$plugin_offline_media_release(List<VariantCandidate> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            VariantCandidate variantCandidate = (VariantCandidate) next;
            boolean z2 = true;
            if (variantCandidate.getTrackType() == 1 && !canDecodeAudio(variantCandidate) && !z) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.Pair<java.util.List<java.lang.String>, java.util.List<java.lang.String>> getMatchingMatchingAudioAndSubtitleTrackNames(com.bamtech.sdk4.internal.media.offline.VariantCandidate r6) {
        /*
            r5 = this;
            com.google.android.exoplayer2.Format r6 = r6.getFormat()
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.f18347Z
            r0 = 0
            if (r6 == 0) goto L_0x000e
            java.util.List r6 = r5.toList$plugin_offline_media_release(r6)
            goto L_0x000f
        L_0x000e:
            r6 = r0
        L_0x000f:
            r1 = 10
            if (r6 == 0) goto L_0x0043
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.p590y.C13187p.m40525a(r6, r1)
            r2.<init>(r3)
            java.util.Iterator r3 = r6.iterator()
        L_0x0020:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r3.next()
            com.google.android.exoplayer2.source.hls.n$b r4 = (com.google.android.exoplayer2.source.hls.C9170n.C9172b) r4
            java.lang.String r4 = r4.f20685V
            r2.add(r4)
            goto L_0x0020
        L_0x0032:
            java.util.List r2 = kotlin.p590y.C13199w.m40585e(r2)
            if (r2 == 0) goto L_0x0043
            java.util.Set r2 = kotlin.p590y.C13199w.m40609t(r2)
            if (r2 == 0) goto L_0x0043
            java.util.List r2 = kotlin.p590y.C13199w.m40606q(r2)
            goto L_0x0044
        L_0x0043:
            r2 = r0
        L_0x0044:
            if (r6 == 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = kotlin.p590y.C13187p.m40525a(r6, r1)
            r3.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0053:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r6.next()
            com.google.android.exoplayer2.source.hls.n$b r1 = (com.google.android.exoplayer2.source.hls.C9170n.C9172b) r1
            java.lang.String r1 = r1.f20686W
            r3.add(r1)
            goto L_0x0053
        L_0x0065:
            java.util.List r6 = kotlin.p590y.C13199w.m40585e(r3)
            if (r6 == 0) goto L_0x0075
            java.util.Set r6 = kotlin.p590y.C13199w.m40609t(r6)
            if (r6 == 0) goto L_0x0075
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r6)
        L_0x0075:
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.DefaultTrackHelper.getMatchingMatchingAudioAndSubtitleTrackNames(com.bamtech.sdk4.internal.media.offline.VariantCandidate):kotlin.Pair");
    }

    public List<Pair<Integer, VariantCandidate>> getTracks(ServiceTransaction serviceTransaction, List<VariantCandidate> list, int i, List<String> list2, List<String> list3, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((VariantCandidate) next).getTrackType() != i) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        List filterMatchingIds$plugin_offline_media_release = filterMatchingIds$plugin_offline_media_release(arrayList, list3);
        List<VariantCandidate> filterLanguages$plugin_offline_media_release = filterLanguages$plugin_offline_media_release(filterPlayableAudio$plugin_offline_media_release(filterMatchingIds$plugin_offline_media_release, z2), list2, z);
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) filterLanguages$plugin_offline_media_release, 10));
        for (VariantCandidate pair : filterLanguages$plugin_offline_media_release) {
            arrayList2.add(new Pair(Integer.valueOf(i2), pair));
        }
        if (!arrayList2.isEmpty() || !(!list2.isEmpty())) {
            return arrayList2;
        }
        UUID id = serviceTransaction.getId();
        StringBuilder sb = new StringBuilder();
        sb.append("No tracks were found to match from request( ");
        sb.append(list2);
        sb.append(" ).  Available tracks are ");
        sb.append(filterMatchingIds$plugin_offline_media_release);
        InvalidRequestException invalidRequestException = new InvalidRequestException(id, C13183n.m40498a(new ServiceError("tracks.not.found", sb.toString())), null, 4, null);
        throw invalidRequestException;
    }

    public final List<C9172b> toList$plugin_offline_media_release(com.google.android.exoplayer2.metadata.Metadata metadata) {
        ArrayList<C8737b> arrayList = new ArrayList<>();
        int X = metadata.mo22862X();
        for (int i = 0; i < X; i++) {
            C8737b a = metadata.mo22863a(i);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "this.get(i)");
            arrayList.add(a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C8737b bVar : arrayList) {
            if (bVar != null) {
                List<C9172b> list = ((C9170n) bVar).f20682V;
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "entry.variantInfos");
                for (C9172b bVar2 : list) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) bVar2, "it");
                    arrayList2.add(bVar2);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry");
            }
        }
        return arrayList2;
    }
}
