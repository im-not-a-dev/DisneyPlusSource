package com.bamtech.sdk4.internal.media.offline;

import android.net.Uri;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.VariantConstraints;
import com.bamtech.sdk4.service.NotFoundException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.source.hls.playlist.C9182e;
import com.google.android.exoplayer2.source.hls.playlist.C9182e.C9183a;
import com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13180m;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\u00020\u000bH\u0000¨\u0006\f"}, mo31007d2 = {"findBestVideoVariant", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "variantConstraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "getInferredPrimaryTrackType", "", "Lcom/google/android/exoplayer2/Format;", "getTrackCandidates", "Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: VariantCandidate.kt */
public final class VariantCandidateKt {
    public static final VariantCandidate findBestVideoVariant(List<VariantCandidate> list, ServiceTransaction serviceTransaction, VariantConstraints variantConstraints) {
        List a = C13199w.m40562a((Iterable) list, (Comparator) new VariantCandidateKt$findBestVideoVariant$$inlined$sortedBy$1());
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((VariantCandidate) next).getTrackType() != 2) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            VariantCandidate variantCandidate = (VariantCandidate) next2;
            if (variantCandidate.getFormat().f18356h0 <= variantConstraints.getMaxHeight() && variantCandidate.getFormat().f18355g0 <= variantConstraints.getMaxWidth()) {
                arrayList2.add(next2);
            }
        }
        VariantCandidate variantCandidate2 = (VariantCandidate) TrackHelperKt.findTargetBitrate(arrayList2, arrayList, variantConstraints.getBitrate());
        if (variantCandidate2 != null) {
            return variantCandidate2;
        }
        NotFoundException notFoundException = new NotFoundException(serviceTransaction.getId(), C13183n.m40498a(new ServiceError("variant-not-found", "No playlistVaraints were available.")), null, 4, null);
        throw notFoundException;
    }

    public static final int getInferredPrimaryTrackType(Format format) {
        int f = C9566t.m29513f(format.f18349b0);
        if (f != -1) {
            return f;
        }
        if (C9566t.m29516i(format.f18346Y) == null) {
            if (C9566t.m29508a(format.f18346Y) != null) {
                return 1;
            }
            if (format.f18355g0 == -1 && format.f18356h0 == -1) {
                if (format.f18363o0 == -1 && format.f18364p0 == -1) {
                    return -1;
                }
                return 1;
            }
        }
        return 2;
    }

    public static final List<VariantCandidate> getTrackCandidates(HlsPlaylist hlsPlaylist) {
        C9182e eVar = (C9182e) hlsPlaylist;
        List<C9184b> list = eVar.f20750e;
        Intrinsics.checkReturnedValueIsNotNull((Object) list, "variants");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            String str = "variant.format";
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C9184b bVar = (C9184b) next;
                    Uri uri = bVar.f20760a;
                    Intrinsics.checkReturnedValueIsNotNull((Object) uri, "variant.url");
                    Format format = bVar.f20761b;
                    Intrinsics.checkReturnedValueIsNotNull((Object) format, str);
                    StreamKey streamKey = new StreamKey(0, 0, i);
                    Format format2 = bVar.f20761b;
                    Intrinsics.checkReturnedValueIsNotNull((Object) format2, str);
                    VariantCandidate variantCandidate = new VariantCandidate(uri, format, streamKey, getInferredPrimaryTrackType(format2), bVar.f20763d);
                    arrayList.add(variantCandidate);
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            } else {
                List<C9183a> list2 = eVar.f20751f;
                Intrinsics.checkReturnedValueIsNotNull((Object) list2, "audios");
                ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list2, 10));
                int i3 = 0;
                for (Object next2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C9183a aVar = (C9183a) next2;
                        Uri uri2 = aVar.f20757a;
                        if (uri2 != null) {
                            Intrinsics.checkReturnedValueIsNotNull((Object) uri2, "variant.url!!");
                            Format format3 = aVar.f20758b;
                            Intrinsics.checkReturnedValueIsNotNull((Object) format3, str);
                            StreamKey streamKey2 = new StreamKey(0, 1, i3);
                            Format format4 = aVar.f20758b;
                            Intrinsics.checkReturnedValueIsNotNull((Object) format4, str);
                            VariantCandidate variantCandidate2 = r11;
                            VariantCandidate variantCandidate3 = new VariantCandidate(uri2, format3, streamKey2, getInferredPrimaryTrackType(format4), null, 16, null);
                            arrayList2.add(variantCandidate2);
                            i3 = i4;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    } else {
                        C13180m.m40455c();
                        throw null;
                    }
                }
                List<C9183a> list3 = eVar.f20752g;
                Intrinsics.checkReturnedValueIsNotNull((Object) list3, "subtitles");
                ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) list3, 10));
                int i5 = 0;
                for (Object next3 : list3) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        C9183a aVar2 = (C9183a) next3;
                        Uri uri3 = aVar2.f20757a;
                        if (uri3 != null) {
                            Intrinsics.checkReturnedValueIsNotNull((Object) uri3, "url.url!!");
                            Format format5 = aVar2.f20758b;
                            String str2 = "url.format";
                            Intrinsics.checkReturnedValueIsNotNull((Object) format5, str2);
                            StreamKey streamKey3 = new StreamKey(0, 2, i5);
                            Format format6 = aVar2.f20758b;
                            Intrinsics.checkReturnedValueIsNotNull((Object) format6, str2);
                            VariantCandidate variantCandidate4 = r9;
                            VariantCandidate variantCandidate5 = new VariantCandidate(uri3, format5, streamKey3, getInferredPrimaryTrackType(format6), null, 16, null);
                            arrayList3.add(variantCandidate4);
                            i5 = i6;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    } else {
                        C13180m.m40455c();
                        throw null;
                    }
                }
                return C13199w.m40583d((Collection) C13199w.m40583d((Collection) arrayList, (Iterable) arrayList2), (Iterable) arrayList3);
            }
        }
    }
}
