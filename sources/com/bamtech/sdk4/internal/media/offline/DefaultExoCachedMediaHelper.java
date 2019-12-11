package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.TrackHelper.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadRequest;
import com.bamtech.sdk4.media.offline.LicenseRenewalResult;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.C9185f;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.upstream.C9455c0;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import com.google.android.exoplayer2.upstream.C9514q;
import com.google.android.exoplayer2.upstream.C9515r;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12860a0;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J2\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultExoCachedMediaHelper;", "Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;", "applicationContext", "Landroid/content/Context;", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "trackHelper", "Lcom/bamtech/sdk4/internal/media/offline/TrackHelper;", "userAgent", "", "(Landroid/content/Context;Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;Lcom/bamtech/sdk4/internal/media/offline/TrackHelper;Ljava/lang/String;)V", "downloadMediaLicense", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "media", "currentLicense", "", "currentAudioLicense", "renditionKeyCheck", "Lkotlin/Function0;", "", "downloadMediaLicenseAsync", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "getRenditions", "", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "dataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "isFatalError", "", "e", "", "releaseOldLicense", "oldLicense", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoCachedMediaHelper.kt */
public final class DefaultExoCachedMediaHelper implements ExoCachedMediaHelper {
    private final Context applicationContext;
    private final WidevineLicenseManager licenseManager;
    private final TrackHelper trackHelper;
    private final String userAgent;

    public DefaultExoCachedMediaHelper(Context context, WidevineLicenseManager widevineLicenseManager, TrackHelper trackHelper2, String str) {
        this.applicationContext = context;
        this.licenseManager = widevineLicenseManager;
        this.trackHelper = trackHelper2;
        this.userAgent = str;
    }

    public ExoCachedMedia downloadMediaLicense(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia, byte[] bArr, byte[] bArr2, Function0<C13145v> function0) {
        StringBuilder sb = new StringBuilder();
        sb.append("Current media expiration date: ");
        sb.append(exoCachedMedia.getExpiration());
        String str = "ExoCachedMediaHelper";
        Log.d(str, sb.toString());
        if (exoCachedMedia.getRenditionKeys().isEmpty()) {
            function0.invoke();
        }
        C9514q a = new C9515r(this.applicationContext, this.userAgent).mo24448a();
        C12880j.m40222a((Object) a, "DefaultDataSourceFactory…Agent).createDataSource()");
        List<Pair> renditions = getRenditions(serviceTransaction, exoCachedMedia, a);
        if (renditions != null) {
            Object[] array = renditions.toArray(new Pair[0]);
            if (array != null) {
                Pair[] pairArr = (Pair[]) array;
                Pair downloadLicense = LicenseUtilsKt.downloadLicense(exoCachedMedia, C13173j0.m40356a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)), this.licenseManager, a, bArr, bArr2);
                exoCachedMedia.setLicense((byte[]) downloadLicense.mo31015c());
                exoCachedMedia.setAudioLicense((byte[]) downloadLicense.mo31016d());
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) renditions, 10));
                for (Pair b : renditions) {
                    VariantCandidate variantCandidate = (VariantCandidate) b.mo31014b();
                    arrayList.add(new StreamKey(variantCandidate.getTrackKey().f18722U, variantCandidate.getTrackKey().f18723V));
                }
                exoCachedMedia.setRenditionKeys(arrayList);
                exoCachedMedia.setExpiration(LicenseUtilsKt.getLicenseExpiration(exoCachedMedia, this.licenseManager));
                exoCachedMedia.setLastLicenseRenewal(DateTime.now(DateTimeZone.UTC));
                exoCachedMedia.setLastLicenseRenewalResult(LicenseRenewalResult.Success);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("New media expiration date: ");
                sb2.append(exoCachedMedia.getExpiration());
                Log.d(str, sb2.toString());
                return exoCachedMedia;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C13142s("null cannot be cast to non-null type java.util.Collection<T>");
    }

    public Single<CachedMedia> downloadMediaLicenseAsync(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia) {
        Single<CachedMedia> c = Single.m38401c((Callable<? extends T>) new DefaultExoCachedMediaHelper$downloadMediaLicenseAsync$1<Object>(this, serviceTransaction, exoCachedMedia));
        C12880j.m40222a((Object) c, "Single.fromCallable {\n  …ndException() }\n        }");
        return c;
    }

    public List<Pair<Integer, VariantCandidate>> getRenditions(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia, DataSource dataSource) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing renditions for media ");
        sb.append(exoCachedMedia.getId());
        sb.append('.');
        String str = "OfflineExoMediaHelper";
        Log.d(str, sb.toString());
        Object a = C9455c0.m28986a(dataSource, (C9456a<? extends T>) new C9185f<Object>(), Uri.parse(exoCachedMedia.getMasterPlaylist()), 4);
        C12880j.m40222a(a, "ParsingLoadable.load<Hls…t), C.DATA_TYPE_MANIFEST)");
        HlsPlaylist hlsPlaylist = (HlsPlaylist) a;
        DownloadRequest request = exoCachedMedia.getRequest();
        List trackCandidates = VariantCandidateKt.getTrackCandidates(hlsPlaylist);
        VariantCandidate findBestVideoVariant = VariantCandidateKt.findBestVideoVariant(trackCandidates, serviceTransaction, request.getVariantConstraints());
        Pair pair = new Pair(Integer.valueOf(2), findBestVideoVariant);
        Pair matchingMatchingAudioAndSubtitleTrackNames = this.trackHelper.getMatchingMatchingAudioAndSubtitleTrackNames(findBestVideoVariant);
        List list = (List) matchingMatchingAudioAndSubtitleTrackNames.mo31014b();
        Pair pair2 = pair;
        VariantCandidate variantCandidate = findBestVideoVariant;
        List tracks$default = DefaultImpls.getTracks$default(this.trackHelper, serviceTransaction, trackCandidates, 1, request.getAudioLanguages(), (List) matchingMatchingAudioAndSubtitleTrackNames.mo31013a(), 1, true, false, 128, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = tracks$default.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            VariantCandidate variantCandidate2 = (VariantCandidate) ((Pair) next).mo31016d();
            String audioGroupId = variantCandidate.getAudioGroupId();
            if (audioGroupId == null) {
                audioGroupId = "NoMatch";
            }
            if (variantCandidate2.matchesGroupId(audioGroupId)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List list2 = arrayList.isEmpty() ? tracks$default : arrayList;
        List audioLanguages = request.getAudioLanguages();
        List list3 = trackCandidates;
        List a2 = (!(audioLanguages == null || audioLanguages.isEmpty()) || list2.size() <= 1) ? list2 : C13183n.m40498a(C13199w.m40593h(list2));
        List tracks$default2 = DefaultImpls.getTracks$default(this.trackHelper, serviceTransaction, list3, 3, request.getSubtitleLanguages(), list, 3, false, false, 128, null);
        if (list2.isEmpty()) {
            Log.d(str, "Warning no audio tracks matched the requested audio language");
        }
        if (tracks$default2.isEmpty()) {
            Log.d(str, "Warning no subtitle tracks matched the requested subtitle language");
        }
        C12860a0 a0Var = new C12860a0(3);
        a0Var.mo31155a((Object) pair2);
        String str2 = "null cannot be cast to non-null type java.util.Collection<T>";
        if (a2 != null) {
            Object[] array = a2.toArray(new Pair[0]);
            String str3 = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array != null) {
                a0Var.mo31157b(array);
                if (tracks$default2 != null) {
                    Object[] array2 = tracks$default2.toArray(new Pair[0]);
                    if (array2 != null) {
                        a0Var.mo31157b(array2);
                        return C13185o.m40520c((Pair[]) a0Var.mo31156a((Object[]) new Pair[a0Var.mo31154a()]));
                    }
                    throw new C13142s(str3);
                }
                throw new C13142s(str2);
            }
            throw new C13142s(str3);
        }
        throw new C13142s(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0.isInstance((com.bamtech.sdk4.service.ServiceException) r3) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r0.isInstance((com.bamtech.sdk4.service.ServiceException) r3) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isFatalError(java.lang.Throwable r5) {
        /*
            r4 = this;
            java.lang.Throwable r0 = r5.getCause()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            boolean r0 = r0 instanceof com.bamtech.sdk4.service.InvalidRequestException
            java.lang.String r2 = "null cannot be cast to non-null type com.bamtech.sdk4.service.ServiceException"
            if (r0 == 0) goto L_0x0032
            com.bamtech.sdk4.service.ServiceExceptionCase$SecurityLevelInsufficient r0 = com.bamtech.sdk4.service.ServiceExceptionCase.SecurityLevelInsufficient.INSTANCE
            java.lang.Throwable r3 = r5.getCause()
            if (r3 == 0) goto L_0x0020
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 == 0) goto L_0x002c
            com.bamtech.sdk4.service.ServiceException r3 = (com.bamtech.sdk4.service.ServiceException) r3
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L_0x0086
            goto L_0x0032
        L_0x002c:
            kotlin.s r5 = new kotlin.s
            r5.<init>(r2)
            throw r5
        L_0x0032:
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x003d
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            boolean r0 = r0 instanceof com.bamtech.sdk4.service.InvalidRequestException
            if (r0 == 0) goto L_0x0061
            com.bamtech.sdk4.service.ServiceExceptionCase$AccountIdMissing r0 = com.bamtech.sdk4.service.ServiceExceptionCase.AccountIdMissing.INSTANCE
            java.lang.Throwable r3 = r5.getCause()
            if (r3 == 0) goto L_0x004f
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0050
        L_0x004f:
            r3 = r1
        L_0x0050:
            if (r3 == 0) goto L_0x005b
            com.bamtech.sdk4.service.ServiceException r3 = (com.bamtech.sdk4.service.ServiceException) r3
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L_0x0086
            goto L_0x0061
        L_0x005b:
            kotlin.s r5 = new kotlin.s
            r5.<init>(r2)
            throw r5
        L_0x0061:
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x006c
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            boolean r0 = r0 instanceof com.bamtech.sdk4.service.UnauthorizedException
            if (r0 != 0) goto L_0x0086
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x007b
            java.lang.Throwable r1 = r0.getCause()
        L_0x007b:
            boolean r0 = r1 instanceof com.bamtech.sdk4.service.ForbiddenException
            if (r0 != 0) goto L_0x0086
            boolean r5 = r5 instanceof com.bamtech.sdk4.internal.media.offline.UnrecoverableLicenseError
            if (r5 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r5 = 0
            goto L_0x0087
        L_0x0086:
            r5 = 1
        L_0x0087:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.DefaultExoCachedMediaHelper.isFatalError(java.lang.Throwable):boolean");
    }

    public void releaseOldLicense(byte[] bArr) {
        this.licenseManager.release(bArr, false);
    }
}
