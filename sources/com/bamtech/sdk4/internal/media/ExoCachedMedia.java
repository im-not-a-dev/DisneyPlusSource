package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.ThumbnailPresentationType;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaItem;
import com.bamtech.sdk4.media.exoplayer.RenditionKeyProvider;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadRequest;
import com.bamtech.sdk4.media.offline.DownloadStatus;
import com.bamtech.sdk4.media.offline.DownloadStatus.Finished;
import com.bamtech.sdk4.media.offline.LicenseRenewalResult;
import com.bamtech.sdk4.media.offline.LicenseStatus;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020HJ\u001a\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020'H\u0002J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0016\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020'J\u000e\u0010U\u001a\u00020K2\u0006\u0010G\u001a\u00020HJ\b\u0010V\u001a\u00020WH\u0016J\u0016\u0010X\u001a\u00020\u00152\u0006\u0010G\u001a\u00020H2\u0006\u0010Y\u001a\u00020ZJ\u0012\u0010[\u001a\u00020?2\b\u0010\\\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010]\u001a\u00020K2\u0006\u0010G\u001a\u00020HJ\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00150-2\u0006\u0010G\u001a\u00020HJ\b\u0010_\u001a\u00020'H\u0016J!\u0010`\u001a\u0004\u0018\u00010N2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002060b¢\u0006\u0002\u0010cJ\u000e\u0010d\u001a\u00020e2\u0006\u0010G\u001a\u00020HJ\u000e\u0010f\u001a\u00020S2\u0006\u0010g\u001a\u00020\u0015J\b\u0010h\u001a\u00020\u0015H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002068VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00108\"\u0004\bD\u0010E¨\u0006i"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "Lcom/bamtech/sdk4/media/exoplayer/RenditionKeyProvider;", "request", "Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "downloadStatus", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "(Lcom/bamtech/sdk4/media/offline/DownloadRequest;Lcom/bamtech/sdk4/media/offline/DownloadStatus;)V", "audioLicense", "", "getAudioLicense", "()[B", "setAudioLicense", "([B)V", "expiration", "Lorg/joda/time/DateTime;", "getExpiration", "()Lorg/joda/time/DateTime;", "setExpiration", "(Lorg/joda/time/DateTime;)V", "id", "", "getId", "()Ljava/lang/String;", "lastLicenseRenewal", "getLastLicenseRenewal", "setLastLicenseRenewal", "lastLicenseRenewalResult", "Lcom/bamtech/sdk4/media/offline/LicenseRenewalResult;", "getLastLicenseRenewalResult", "()Lcom/bamtech/sdk4/media/offline/LicenseRenewalResult;", "setLastLicenseRenewalResult", "(Lcom/bamtech/sdk4/media/offline/LicenseRenewalResult;)V", "license", "getLicense", "setLicense", "masterPlaylist", "getMasterPlaylist", "orderNumber", "", "getOrderNumber", "()I", "setOrderNumber", "(I)V", "renditionKeys", "", "Lcom/google/android/exoplayer2/offline/StreamKey;", "getRenditionKeys", "()Ljava/util/List;", "setRenditionKeys", "(Ljava/util/List;)V", "getRequest", "()Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "size", "", "getSize", "()J", "status", "getStatus", "()Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "setStatus", "(Lcom/bamtech/sdk4/media/offline/DownloadStatus;)V", "thumbnailResolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getThumbnailResolution", "()Lcom/bamtech/sdk4/ThumbnailResolution;", "thumbnailsSize", "getThumbnailsSize", "setThumbnailsSize", "(J)V", "countBytesInFileLocation", "context", "Landroid/content/Context;", "countBytesRecursive", "file", "Ljava/io/File;", "maxDepth", "equals", "", "other", "", "generateThumbnailFileName", "set", "Lcom/bamtech/sdk4/BifThumbnailSet;", "presentationIdx", "getFileLocation", "getLicenseStatus", "Lcom/bamtech/sdk4/media/offline/LicenseStatus;", "getLocalBifFile", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getResolutionName", "resolutionName", "getThumbnailDirectory", "getThumbnailFileNames", "hashCode", "isCacheIncomplete", "bytesCounter", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "removeThumbnails", "", "thumbnailFileNameToSet", "name", "toString", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoCachedMedia.kt */
public final class ExoCachedMedia implements CachedMedia, RenditionKeyProvider {
    private byte[] audioLicense;
    private DateTime expiration;

    /* renamed from: id */
    private final String f6073id = this.request.getMediaItem().getDescriptor().getCachedMediaId();
    private DateTime lastLicenseRenewal;
    private LicenseRenewalResult lastLicenseRenewalResult;
    private byte[] license;
    private final String masterPlaylist;
    private int orderNumber;
    private List<StreamKey> renditionKeys;
    private final DownloadRequest request;
    private DownloadStatus status;
    private long thumbnailsSize;

    public ExoCachedMedia(DownloadRequest downloadRequest, DownloadStatus downloadStatus) {
        String str;
        this.request = downloadRequest;
        if (this.request.getMediaItem() instanceof OfflineMediaItem) {
            str = this.request.getMediaItem().getDefaultPlaylist().getStreamUri();
        } else if (this.request.getMediaItem().getAvailablePlaylistTypes().contains(PlaylistType.COMPLETE)) {
            str = this.request.getMediaItem().tryGetPreferredPlaylist(PlaylistType.COMPLETE).getStreamUri();
        } else {
            throw new IllegalArgumentException("Complete playlist is not available from this media item. Only complete playlists can be used for offline playback.");
        }
        this.masterPlaylist = str;
        this.license = new byte[0];
        this.audioLicense = new byte[0];
        this.status = downloadStatus;
        this.renditionKeys = C13185o.m40513a();
        this.orderNumber = Integer.MAX_VALUE;
        ThumbnailResolution thumbnailResolution = ThumbnailResolution.LOW;
    }

    private final long countBytesRecursive(File file, int i) {
        long j = 0;
        if (i <= 0 || !file.isDirectory()) {
            return 0 + file.length();
        }
        File[] listFiles = file.listFiles();
        C12880j.m40222a((Object) listFiles, "file.listFiles()");
        for (File file2 : listFiles) {
            C12880j.m40222a((Object) file2, "it");
            j += countBytesRecursive(file2, i - 1);
        }
        return j;
    }

    static /* synthetic */ long countBytesRecursive$default(ExoCachedMedia exoCachedMedia, File file, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return exoCachedMedia.countBytesRecursive(file, i);
    }

    private final ThumbnailResolution getResolutionName(String str) {
        ThumbnailResolution thumbnailResolution;
        if (str != null) {
            try {
                thumbnailResolution = ThumbnailResolution.valueOf(str);
            } catch (IllegalArgumentException unused) {
                thumbnailResolution = ThumbnailResolution.NONE;
            }
            if (thumbnailResolution != null) {
                return thumbnailResolution;
            }
        }
        return ThumbnailResolution.NONE;
    }

    public final long countBytesInFileLocation(Context context) {
        Context applicationContext = context.getApplicationContext();
        C12880j.m40222a((Object) applicationContext, "context.applicationContext");
        return countBytesRecursive$default(this, new File(getFileLocation(applicationContext).getCanonicalPath()), 0, 2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExoCachedMedia) && !(C12880j.m40224a((Object) getId(), (Object) ((ExoCachedMedia) obj).getId()) ^ true);
    }

    public final String generateThumbnailFileName(BifThumbnailSet bifThumbnailSet, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(getId());
        sb.append('.');
        sb.append(bifThumbnailSet.getThumbnailWidth());
        sb.append('.');
        sb.append(bifThumbnailSet.getThumbnailHeight());
        sb.append('.');
        sb.append(bifThumbnailSet.getIntervalMilliseconds());
        sb.append('.');
        sb.append(bifThumbnailSet.getTotalBytes());
        sb.append('.');
        sb.append(((Presentation) bifThumbnailSet.getPresentations().get(i)).getOffsetMilliseconds());
        sb.append('.');
        sb.append(((Presentation) bifThumbnailSet.getPresentations().get(i)).getThumbnailCount());
        sb.append('.');
        sb.append(((Presentation) bifThumbnailSet.getPresentations().get(i)).getPresentationType().name());
        sb.append('.');
        sb.append(bifThumbnailSet.getResolution());
        return sb.toString();
    }

    public final byte[] getAudioLicense() {
        return this.audioLicense;
    }

    public DateTime getExpiration() {
        return this.expiration;
    }

    public final File getFileLocation(Context context) {
        File alternateStorageDir = this.request.getAlternateStorageDir();
        if (alternateStorageDir == null) {
            alternateStorageDir = context.getDir("media", 0);
        }
        return new File(alternateStorageDir, getId());
    }

    public String getId() {
        return this.f6073id;
    }

    public DateTime getLastLicenseRenewal() {
        return this.lastLicenseRenewal;
    }

    public LicenseRenewalResult getLastLicenseRenewalResult() {
        return this.lastLicenseRenewalResult;
    }

    public final byte[] getLicense() {
        return this.license;
    }

    public LicenseStatus getLicenseStatus() {
        boolean z = false;
        if (this.license.length == 0) {
            return LicenseStatus.REMOVED;
        }
        if (!(this.license.length == 0)) {
            DateTime expiration2 = getExpiration();
            if (expiration2 != null) {
                z = expiration2.isAfterNow();
            }
            if (z) {
                return LicenseStatus.ACTIVE;
            }
        }
        return LicenseStatus.EXPIRED;
    }

    public final String getLocalBifFile(Context context, Presentation presentation) {
        String absolutePath = new File(getThumbnailDirectory(context), C12833x.m40139a((String) C13199w.m40589f(presentation.getPaths()), "file://", (String) null, 2, (Object) null)).getAbsolutePath();
        C12880j.m40222a((Object) absolutePath, "File(getThumbnailDirecto…            .absolutePath");
        return absolutePath;
    }

    public final String getMasterPlaylist() {
        return this.masterPlaylist;
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public List<StreamKey> getRenditionKeys() {
        return this.renditionKeys;
    }

    public final DownloadRequest getRequest() {
        return this.request;
    }

    public DownloadStatus getStatus() {
        return this.status;
    }

    public final File getThumbnailDirectory(Context context) {
        File file = new File(context.getFilesDir(), "thumbnails");
        if (!file.isDirectory()) {
            file.mkdir();
        }
        return file;
    }

    public final List<String> getThumbnailFileNames(Context context) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = getThumbnailDirectory(context).listFiles();
        C12880j.m40222a((Object) listFiles, "getThumbnailDirectory(co…             .listFiles()");
        ArrayList<File> arrayList2 = new ArrayList<>();
        int length = listFiles.length;
        int i = 0;
        while (true) {
            str = "it.name";
            str2 = "it";
            if (i >= length) {
                break;
            }
            File file = listFiles[i];
            C12880j.m40222a((Object) file, str2);
            String name = file.getName();
            C12880j.m40222a((Object) name, str);
            if (C12832w.m40123b(name, getId(), false, 2, null)) {
                arrayList2.add(file);
            }
            i++;
        }
        for (File file2 : arrayList2) {
            C12880j.m40222a((Object) file2, str2);
            String name2 = file2.getName();
            C12880j.m40222a((Object) name2, str);
            arrayList.add(name2);
        }
        return arrayList;
    }

    public final long getThumbnailsSize() {
        return this.thumbnailsSize;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public final Boolean isCacheIncomplete(Function1<? super ExoCachedMedia, Long> function1) {
        DownloadStatus status2 = getStatus();
        if (!(status2 instanceof Finished)) {
            status2 = null;
        }
        Finished finished = (Finished) status2;
        if (finished == null) {
            return null;
        }
        return Boolean.valueOf(finished.getBytesDownloaded() > ((Number) function1.invoke(this)).longValue());
    }

    public final void removeThumbnails(Context context) {
        File[] listFiles = getThumbnailDirectory(context).listFiles();
        C12880j.m40222a((Object) listFiles, "getThumbnailDirectory(co…             .listFiles()");
        for (File file : listFiles) {
            C12880j.m40222a((Object) file, "file");
            String name = file.getName();
            C12880j.m40222a((Object) name, "file.name");
            if (C12832w.m40123b(name, getId(), false, 2, null)) {
                file.delete();
            }
        }
    }

    public final void setAudioLicense(byte[] bArr) {
        this.audioLicense = bArr;
    }

    public void setExpiration(DateTime dateTime) {
        this.expiration = dateTime;
    }

    public void setLastLicenseRenewal(DateTime dateTime) {
        this.lastLicenseRenewal = dateTime;
    }

    public void setLastLicenseRenewalResult(LicenseRenewalResult licenseRenewalResult) {
        this.lastLicenseRenewalResult = licenseRenewalResult;
    }

    public final void setLicense(byte[] bArr) {
        this.license = bArr;
    }

    public void setOrderNumber(int i) {
        this.orderNumber = i;
    }

    public void setRenditionKeys(List<StreamKey> list) {
        this.renditionKeys = list;
    }

    public void setStatus(DownloadStatus downloadStatus) {
        this.status = downloadStatus;
    }

    public final void setThumbnailsSize(long j) {
        this.thumbnailsSize = j;
    }

    public final BifThumbnailSet thumbnailFileNameToSet(String str) {
        List a = C12833x.m40142a((CharSequence) C12833x.m40139a(str, "file://", (String) null, 2, (Object) null), new String[]{"."}, false, 0, 6, (Object) null);
        long parseLong = Long.parseLong((String) a.get(1));
        long parseLong2 = Long.parseLong((String) a.get(2));
        long parseLong3 = Long.parseLong((String) a.get(3));
        long parseLong4 = Long.parseLong((String) a.get(4));
        Presentation presentation = new Presentation(ThumbnailPresentationType.valueOf((String) a.get(7)), Long.parseLong((String) a.get(6)), Long.parseLong((String) a.get(5)), C13183n.m40498a(str));
        BifThumbnailSet bifThumbnailSet = new BifThumbnailSet(parseLong, parseLong2, parseLong3, parseLong4, C13185o.m40523e(presentation), getResolutionName((String) C13199w.m40578d(a, 8)));
        return bifThumbnailSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExoCachedMedia(id='");
        sb.append(getId());
        sb.append("', masterPlaylist='");
        sb.append(this.masterPlaylist);
        sb.append("')");
        return sb.toString();
    }
}
