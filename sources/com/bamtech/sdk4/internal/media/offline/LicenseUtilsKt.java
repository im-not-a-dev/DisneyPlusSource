package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.google.android.exoplayer2.source.hls.playlist.C9185f;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.C9455c0;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0000\u001aL\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0014"}, mo31007d2 = {"downloadLicense", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "tracks", "", "", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "dataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "currentLicense", "currentAudioLicense", "getLicenseExpiration", "Lorg/joda/time/DateTime;", "loadRequiredLicenses", "videoPlaylist", "Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;", "audioPlaylist", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: LicenseUtils.kt */
public final class LicenseUtilsKt {
    public static final Pair<byte[], byte[]> downloadLicense(ExoCachedMedia exoCachedMedia, Map<Integer, VariantCandidate> map, WidevineLicenseManager widevineLicenseManager, DataSource dataSource, byte[] bArr, byte[] bArr2) {
        HlsMediaPlaylist hlsMediaPlaylist;
        if ((!(exoCachedMedia.getLicense().length == 0)) && bArr == null) {
            return new Pair<>(exoCachedMedia.getLicense(), exoCachedMedia.getAudioLicense());
        }
        VariantCandidate variantCandidate = (VariantCandidate) map.get(Integer.valueOf(2));
        HlsMediaPlaylist hlsMediaPlaylist2 = null;
        if (variantCandidate != null) {
            Object a = C9455c0.m28986a(dataSource, (C9456a<? extends T>) new C9185f<Object>(), variantCandidate.getUrl(), 4);
            if (!(a instanceof HlsMediaPlaylist)) {
                a = null;
            }
            hlsMediaPlaylist = (HlsMediaPlaylist) a;
        } else {
            hlsMediaPlaylist = null;
        }
        VariantCandidate variantCandidate2 = (VariantCandidate) map.get(Integer.valueOf(1));
        if (variantCandidate2 != null) {
            Object a2 = C9455c0.m28986a(dataSource, (C9456a<? extends T>) new C9185f<Object>(), variantCandidate2.getUrl(), 4);
            if (!(a2 instanceof HlsMediaPlaylist)) {
                a2 = null;
            }
            hlsMediaPlaylist2 = (HlsMediaPlaylist) a2;
        }
        return loadRequiredLicenses(exoCachedMedia, hlsMediaPlaylist, hlsMediaPlaylist2, widevineLicenseManager, bArr, bArr2);
    }

    public static final DateTime getLicenseExpiration(ExoCachedMedia exoCachedMedia, WidevineLicenseManager widevineLicenseManager) {
        DateTime plusSeconds = DateTime.now(DateTimeZone.UTC).plusSeconds((int) widevineLicenseManager.getLicenseDuration(exoCachedMedia.getLicense()));
        C12880j.m40222a((Object) plusSeconds, "now.plusSeconds(expiration.toInt())");
        return plusSeconds;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<byte[], byte[]> loadRequiredLicenses(com.bamtech.sdk4.internal.media.ExoCachedMedia r1, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3, com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager r4, byte[] r5, byte[] r6) {
        /*
            r1 = 0
            r0 = 0
            if (r2 == 0) goto L_0x0013
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a> r2 = r2.f20701o
            if (r2 == 0) goto L_0x0013
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a) r2
            if (r2 == 0) goto L_0x0013
            com.google.android.exoplayer2.drm.DrmInitData r2 = r2.f20707Y
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            if (r3 == 0) goto L_0x0025
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a> r3 = r3.f20701o
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a) r3
            if (r3 == 0) goto L_0x0025
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.f20707Y
            goto L_0x0026
        L_0x0025:
            r3 = r1
        L_0x0026:
            if (r2 == 0) goto L_0x002d
            byte[] r5 = r4.download(r2, r5)
            goto L_0x002f
        L_0x002d:
            byte[] r5 = new byte[r0]
        L_0x002f:
            if (r2 == 0) goto L_0x003b
            if (r3 == 0) goto L_0x003b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0049
            if (r3 == 0) goto L_0x0045
            byte[] r1 = r4.download(r3, r6)
            goto L_0x004b
        L_0x0045:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r1
        L_0x0049:
            byte[] r1 = new byte[r0]
        L_0x004b:
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.LicenseUtilsKt.loadRequiredLicenses(com.bamtech.sdk4.internal.media.ExoCachedMedia, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist, com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager, byte[], byte[]):kotlin.Pair");
    }
}
