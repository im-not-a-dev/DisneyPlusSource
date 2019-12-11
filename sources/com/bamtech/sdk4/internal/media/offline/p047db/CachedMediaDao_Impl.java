package com.bamtech.sdk4.internal.media.offline.p047db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.room.p003k.C0947c;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.DateTimeConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.DownloadErrorConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.HlsPlaylistVariantConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.RenditionKeysConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.StringListConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.StringMapAnyConverter;
import com.bamtech.sdk4.internal.media.offline.p047db.converters.ThumbnailLinksConverter;
import com.bamtech.sdk4.media.offline.DownloadError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/* renamed from: com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao_Impl */
public final class CachedMediaDao_Impl implements CachedMediaDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCachedMediaEntry;
    private final EntityInsertionAdapter __insertionAdapterOfCachedMediaEntry;
    private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

    public CachedMediaDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCachedMediaEntry = new EntityInsertionAdapter<CachedMediaEntry>(this, roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `cachedMedia`(`mediaId`,`playbackUrl`,`masterPlaylist`,`license`,`audioLicense`,`expiration`,`maxBitrate`,`maxHeight`,`maxWidth`,`audioLanguages`,`subtitleLanguages`,`alternateStorageDir`,`renditionKeys`,`playlistVariants`,`contentId`,`telemetry`,`adEngine`,`conviva`,`orderNumber`,`thumbnailResolution`,`thumbnails`,`thumbnailsSize`,`lastLicenseRenewal`,`lastLicenseRenewalResult`,`type`,`bytesDownloaded`,`percentageComplete`,`error`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, CachedMediaEntry cachedMediaEntry) {
                if (cachedMediaEntry.getMediaId() == null) {
                    supportSQLiteStatement.mo5235a(1);
                } else {
                    supportSQLiteStatement.mo5238a(1, cachedMediaEntry.getMediaId());
                }
                if (cachedMediaEntry.getPlaybackUrl() == null) {
                    supportSQLiteStatement.mo5235a(2);
                } else {
                    supportSQLiteStatement.mo5238a(2, cachedMediaEntry.getPlaybackUrl());
                }
                if (cachedMediaEntry.getMasterPlaylist() == null) {
                    supportSQLiteStatement.mo5235a(3);
                } else {
                    supportSQLiteStatement.mo5238a(3, cachedMediaEntry.getMasterPlaylist());
                }
                if (cachedMediaEntry.getLicense() == null) {
                    supportSQLiteStatement.mo5235a(4);
                } else {
                    supportSQLiteStatement.mo5239a(4, cachedMediaEntry.getLicense());
                }
                if (cachedMediaEntry.getAudioLicense() == null) {
                    supportSQLiteStatement.mo5235a(5);
                } else {
                    supportSQLiteStatement.mo5239a(5, cachedMediaEntry.getAudioLicense());
                }
                String timestamp = DateTimeConverter.toTimestamp(cachedMediaEntry.getExpiration());
                if (timestamp == null) {
                    supportSQLiteStatement.mo5235a(6);
                } else {
                    supportSQLiteStatement.mo5238a(6, timestamp);
                }
                if (cachedMediaEntry.getMaxBitrate() == null) {
                    supportSQLiteStatement.mo5235a(7);
                } else {
                    supportSQLiteStatement.mo5237a(7, (long) cachedMediaEntry.getMaxBitrate().intValue());
                }
                if (cachedMediaEntry.getMaxHeight() == null) {
                    supportSQLiteStatement.mo5235a(8);
                } else {
                    supportSQLiteStatement.mo5237a(8, (long) cachedMediaEntry.getMaxHeight().intValue());
                }
                if (cachedMediaEntry.getMaxWidth() == null) {
                    supportSQLiteStatement.mo5235a(9);
                } else {
                    supportSQLiteStatement.mo5237a(9, (long) cachedMediaEntry.getMaxWidth().intValue());
                }
                String fromList = StringListConverter.fromList(cachedMediaEntry.getAudioLanguages());
                if (fromList == null) {
                    supportSQLiteStatement.mo5235a(10);
                } else {
                    supportSQLiteStatement.mo5238a(10, fromList);
                }
                String fromList2 = StringListConverter.fromList(cachedMediaEntry.getSubtitleLanguages());
                if (fromList2 == null) {
                    supportSQLiteStatement.mo5235a(11);
                } else {
                    supportSQLiteStatement.mo5238a(11, fromList2);
                }
                if (cachedMediaEntry.getAlternateStorageDir() == null) {
                    supportSQLiteStatement.mo5235a(12);
                } else {
                    supportSQLiteStatement.mo5238a(12, cachedMediaEntry.getAlternateStorageDir());
                }
                String renditionKeysConverter = RenditionKeysConverter.toString(cachedMediaEntry.getRenditionKeys());
                if (renditionKeysConverter == null) {
                    supportSQLiteStatement.mo5235a(13);
                } else {
                    supportSQLiteStatement.mo5238a(13, renditionKeysConverter);
                }
                String hlsPlaylistVariantConverter = HlsPlaylistVariantConverter.toString(cachedMediaEntry.getPlaylistVariants());
                if (hlsPlaylistVariantConverter == null) {
                    supportSQLiteStatement.mo5235a(14);
                } else {
                    supportSQLiteStatement.mo5238a(14, hlsPlaylistVariantConverter);
                }
                if (cachedMediaEntry.getContentId() == null) {
                    supportSQLiteStatement.mo5235a(15);
                } else {
                    supportSQLiteStatement.mo5238a(15, cachedMediaEntry.getContentId());
                }
                String fromList3 = StringMapAnyConverter.fromList(cachedMediaEntry.getTelemetry());
                if (fromList3 == null) {
                    supportSQLiteStatement.mo5235a(16);
                } else {
                    supportSQLiteStatement.mo5238a(16, fromList3);
                }
                String fromList4 = StringMapAnyConverter.fromList(cachedMediaEntry.getAdEngine());
                if (fromList4 == null) {
                    supportSQLiteStatement.mo5235a(17);
                } else {
                    supportSQLiteStatement.mo5238a(17, fromList4);
                }
                String fromList5 = StringMapAnyConverter.fromList(cachedMediaEntry.getConviva());
                if (fromList5 == null) {
                    supportSQLiteStatement.mo5235a(18);
                } else {
                    supportSQLiteStatement.mo5238a(18, fromList5);
                }
                supportSQLiteStatement.mo5237a(19, (long) cachedMediaEntry.getOrderNumber());
                if (cachedMediaEntry.getThumbnailResolution() == null) {
                    supportSQLiteStatement.mo5235a(20);
                } else {
                    supportSQLiteStatement.mo5238a(20, cachedMediaEntry.getThumbnailResolution());
                }
                String jsonString = ThumbnailLinksConverter.toJsonString(cachedMediaEntry.getThumbnails());
                if (jsonString == null) {
                    supportSQLiteStatement.mo5235a(21);
                } else {
                    supportSQLiteStatement.mo5238a(21, jsonString);
                }
                supportSQLiteStatement.mo5237a(22, cachedMediaEntry.getThumbnailsSize());
                String timestamp2 = DateTimeConverter.toTimestamp(cachedMediaEntry.getLastLicenseRenewal());
                if (timestamp2 == null) {
                    supportSQLiteStatement.mo5235a(23);
                } else {
                    supportSQLiteStatement.mo5238a(23, timestamp2);
                }
                if (cachedMediaEntry.getLastLicenseRenewalResult() == null) {
                    supportSQLiteStatement.mo5235a(24);
                } else {
                    supportSQLiteStatement.mo5238a(24, cachedMediaEntry.getLastLicenseRenewalResult());
                }
                DownloadStatusEntry status = cachedMediaEntry.getStatus();
                if (status != null) {
                    if (status.getType() == null) {
                        supportSQLiteStatement.mo5235a(25);
                    } else {
                        supportSQLiteStatement.mo5238a(25, status.getType());
                    }
                    supportSQLiteStatement.mo5237a(26, status.getBytesDownloaded());
                    supportSQLiteStatement.mo5236a(27, (double) status.getPercentageComplete());
                    String downloadErrorConverter = DownloadErrorConverter.toString(status.getError());
                    if (downloadErrorConverter == null) {
                        supportSQLiteStatement.mo5235a(28);
                    } else {
                        supportSQLiteStatement.mo5238a(28, downloadErrorConverter);
                    }
                    String timestamp3 = DateTimeConverter.toTimestamp(status.getTimestamp());
                    if (timestamp3 == null) {
                        supportSQLiteStatement.mo5235a(29);
                    } else {
                        supportSQLiteStatement.mo5238a(29, timestamp3);
                    }
                } else {
                    supportSQLiteStatement.mo5235a(25);
                    supportSQLiteStatement.mo5235a(26);
                    supportSQLiteStatement.mo5235a(27);
                    supportSQLiteStatement.mo5235a(28);
                    supportSQLiteStatement.mo5235a(29);
                }
            }
        };
        this.__deletionAdapterOfCachedMediaEntry = new EntityDeletionOrUpdateAdapter<CachedMediaEntry>(this, roomDatabase) {
            public String createQuery() {
                return "DELETE FROM `cachedMedia` WHERE `mediaId` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, CachedMediaEntry cachedMediaEntry) {
                if (cachedMediaEntry.getMediaId() == null) {
                    supportSQLiteStatement.mo5235a(1);
                } else {
                    supportSQLiteStatement.mo5238a(1, cachedMediaEntry.getMediaId());
                }
            }
        };
        this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "UPDATE cachedMedia SET type = ?, bytesDownloaded = ?, percentageComplete = ?, error = ?, timestamp = ? WHERE mediaId = ?";
            }
        };
        new SharedSQLiteStatement(this, roomDatabase) {
            public String createQuery() {
                return "UPDATE cachedMedia SET orderNumber = ? WHERE mediaId = ?";
            }
        };
    }

    public void delete(CachedMediaEntry cachedMediaEntry) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfCachedMediaEntry.handle(cachedMediaEntry);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<CachedMediaEntry> getAll() {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        Integer num2;
        Integer num3;
        DownloadStatusEntry downloadStatusEntry;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM cachedMedia", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            int a2 = C0945a.m5155a(a, "mediaId");
            int a3 = C0945a.m5155a(a, "playbackUrl");
            int a4 = C0945a.m5155a(a, "masterPlaylist");
            int a5 = C0945a.m5155a(a, "license");
            int a6 = C0945a.m5155a(a, "audioLicense");
            int a7 = C0945a.m5155a(a, "expiration");
            int a8 = C0945a.m5155a(a, "maxBitrate");
            int a9 = C0945a.m5155a(a, "maxHeight");
            int a10 = C0945a.m5155a(a, "maxWidth");
            int a11 = C0945a.m5155a(a, "audioLanguages");
            int a12 = C0945a.m5155a(a, "subtitleLanguages");
            int a13 = C0945a.m5155a(a, "alternateStorageDir");
            int a14 = C0945a.m5155a(a, "renditionKeys");
            int a15 = C0945a.m5155a(a, "playlistVariants");
            roomSQLiteQuery = b;
            try {
                int a16 = C0945a.m5155a(a, "contentId");
                int a17 = C0945a.m5155a(a, "telemetry");
                int a18 = C0945a.m5155a(a, "adEngine");
                int a19 = C0945a.m5155a(a, "conviva");
                int a20 = C0945a.m5155a(a, "orderNumber");
                int a21 = C0945a.m5155a(a, "thumbnailResolution");
                int a22 = C0945a.m5155a(a, "thumbnails");
                int a23 = C0945a.m5155a(a, "thumbnailsSize");
                int a24 = C0945a.m5155a(a, "lastLicenseRenewal");
                int a25 = C0945a.m5155a(a, "lastLicenseRenewalResult");
                int a26 = C0945a.m5155a(a, "type");
                int a27 = C0945a.m5155a(a, "bytesDownloaded");
                int a28 = C0945a.m5155a(a, "percentageComplete");
                int a29 = C0945a.m5155a(a, "error");
                int a30 = C0945a.m5155a(a, StreamSampleTelemetryData.TIMESTAMP_KEY);
                int i10 = a15;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a2);
                    String string2 = a.getString(a3);
                    String string3 = a.getString(a4);
                    byte[] blob = a.getBlob(a5);
                    byte[] blob2 = a.getBlob(a6);
                    DateTime fromTimestamp = DateTimeConverter.fromTimestamp(a.getString(a7));
                    if (a.isNull(a8)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a.getInt(a8));
                    }
                    if (a.isNull(a9)) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(a.getInt(a9));
                    }
                    if (a.isNull(a10)) {
                        num3 = null;
                    } else {
                        num3 = Integer.valueOf(a.getInt(a10));
                    }
                    List fromString = StringListConverter.fromString(a.getString(a11));
                    List fromString2 = StringListConverter.fromString(a.getString(a12));
                    String string4 = a.getString(a13);
                    ArrayList renditionKeys = RenditionKeysConverter.toRenditionKeys(a.getString(a14));
                    int i11 = i10;
                    List hlsPlaylistVariants = HlsPlaylistVariantConverter.toHlsPlaylistVariants(a.getString(i11));
                    int i12 = a2;
                    int i13 = a16;
                    String string5 = a.getString(i13);
                    a16 = i13;
                    int i14 = a17;
                    Map fromString3 = StringMapAnyConverter.fromString(a.getString(i14));
                    a17 = i14;
                    int i15 = a18;
                    Map fromString4 = StringMapAnyConverter.fromString(a.getString(i15));
                    a18 = i15;
                    int i16 = a19;
                    Map fromString5 = StringMapAnyConverter.fromString(a.getString(i16));
                    a19 = i16;
                    int i17 = a20;
                    int i18 = a.getInt(i17);
                    a20 = i17;
                    int i19 = a21;
                    String string6 = a.getString(i19);
                    a21 = i19;
                    int i20 = a22;
                    MediaThumbnailLinks thumbnailLinks = ThumbnailLinksConverter.toThumbnailLinks(a.getString(i20));
                    a22 = i20;
                    int i21 = a23;
                    long j = a.getLong(i21);
                    a23 = i21;
                    int i22 = a24;
                    DateTime fromTimestamp2 = DateTimeConverter.fromTimestamp(a.getString(i22));
                    a24 = i22;
                    int i23 = a25;
                    String string7 = a.getString(i23);
                    a25 = i23;
                    int i24 = a26;
                    if (a.isNull(i24)) {
                        i5 = i11;
                        i9 = a27;
                        if (a.isNull(i9)) {
                            i4 = a3;
                            i8 = a28;
                            if (a.isNull(i8)) {
                                i3 = a4;
                                i7 = a29;
                                if (a.isNull(i7)) {
                                    i2 = a5;
                                    i6 = a30;
                                    if (!a.isNull(i6)) {
                                        DownloadStatusEntry downloadStatusEntry2 = new DownloadStatusEntry(a.getString(i24), a.getLong(i9), a.getFloat(i8), DownloadErrorConverter.toDownloadError(a.getString(i7)), DateTimeConverter.fromTimestamp(a.getString(i6)));
                                        downloadStatusEntry = downloadStatusEntry2;
                                        i = i24;
                                        CachedMediaEntry cachedMediaEntry = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i18, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                        arrayList.add(cachedMediaEntry);
                                        a2 = i12;
                                        i10 = i5;
                                        a26 = i;
                                        a30 = i6;
                                        a5 = i2;
                                        a29 = i7;
                                        a4 = i3;
                                        a28 = i8;
                                        a3 = i4;
                                        a27 = i9;
                                    } else {
                                        i = i24;
                                        downloadStatusEntry = null;
                                        CachedMediaEntry cachedMediaEntry2 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i18, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                        arrayList.add(cachedMediaEntry2);
                                        a2 = i12;
                                        i10 = i5;
                                        a26 = i;
                                        a30 = i6;
                                        a5 = i2;
                                        a29 = i7;
                                        a4 = i3;
                                        a28 = i8;
                                        a3 = i4;
                                        a27 = i9;
                                    }
                                }
                                i2 = a5;
                                i6 = a30;
                                DownloadStatusEntry downloadStatusEntry22 = new DownloadStatusEntry(a.getString(i24), a.getLong(i9), a.getFloat(i8), DownloadErrorConverter.toDownloadError(a.getString(i7)), DateTimeConverter.fromTimestamp(a.getString(i6)));
                                downloadStatusEntry = downloadStatusEntry22;
                                i = i24;
                                CachedMediaEntry cachedMediaEntry22 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i18, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                arrayList.add(cachedMediaEntry22);
                                a2 = i12;
                                i10 = i5;
                                a26 = i;
                                a30 = i6;
                                a5 = i2;
                                a29 = i7;
                                a4 = i3;
                                a28 = i8;
                                a3 = i4;
                                a27 = i9;
                            }
                            i3 = a4;
                            i7 = a29;
                            i2 = a5;
                            i6 = a30;
                            DownloadStatusEntry downloadStatusEntry222 = new DownloadStatusEntry(a.getString(i24), a.getLong(i9), a.getFloat(i8), DownloadErrorConverter.toDownloadError(a.getString(i7)), DateTimeConverter.fromTimestamp(a.getString(i6)));
                            downloadStatusEntry = downloadStatusEntry222;
                            i = i24;
                            CachedMediaEntry cachedMediaEntry222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i18, string6, thumbnailLinks, j, fromTimestamp2, string7);
                            arrayList.add(cachedMediaEntry222);
                            a2 = i12;
                            i10 = i5;
                            a26 = i;
                            a30 = i6;
                            a5 = i2;
                            a29 = i7;
                            a4 = i3;
                            a28 = i8;
                            a3 = i4;
                            a27 = i9;
                        }
                    } else {
                        i5 = i11;
                        i9 = a27;
                    }
                    i4 = a3;
                    i8 = a28;
                    i3 = a4;
                    i7 = a29;
                    i2 = a5;
                    i6 = a30;
                    DownloadStatusEntry downloadStatusEntry2222 = new DownloadStatusEntry(a.getString(i24), a.getLong(i9), a.getFloat(i8), DownloadErrorConverter.toDownloadError(a.getString(i7)), DateTimeConverter.fromTimestamp(a.getString(i6)));
                    downloadStatusEntry = downloadStatusEntry2222;
                    i = i24;
                    CachedMediaEntry cachedMediaEntry2222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i18, string6, thumbnailLinks, j, fromTimestamp2, string7);
                    arrayList.add(cachedMediaEntry2222);
                    a2 = i12;
                    i10 = i5;
                    a26 = i;
                    a30 = i6;
                    a5 = i2;
                    a29 = i7;
                    a4 = i3;
                    a28 = i8;
                    a3 = i4;
                    a27 = i9;
                }
                a.close();
                roomSQLiteQuery.mo5242b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            a.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    public CachedMediaEntry getById(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        Integer num2;
        Integer num3;
        DownloadStatusEntry downloadStatusEntry;
        int i;
        int i2;
        int i3;
        String str2 = str;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM cachedMedia WHERE mediaId = ?", 1);
        if (str2 == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor a = C0946b.m5157a(this.__db, b, false);
        try {
            int a2 = C0945a.m5155a(a, "mediaId");
            int a3 = C0945a.m5155a(a, "playbackUrl");
            int a4 = C0945a.m5155a(a, "masterPlaylist");
            int a5 = C0945a.m5155a(a, "license");
            int a6 = C0945a.m5155a(a, "audioLicense");
            int a7 = C0945a.m5155a(a, "expiration");
            int a8 = C0945a.m5155a(a, "maxBitrate");
            int a9 = C0945a.m5155a(a, "maxHeight");
            int a10 = C0945a.m5155a(a, "maxWidth");
            int a11 = C0945a.m5155a(a, "audioLanguages");
            int a12 = C0945a.m5155a(a, "subtitleLanguages");
            int a13 = C0945a.m5155a(a, "alternateStorageDir");
            int a14 = C0945a.m5155a(a, "renditionKeys");
            int a15 = C0945a.m5155a(a, "playlistVariants");
            roomSQLiteQuery = b;
            try {
                int a16 = C0945a.m5155a(a, "contentId");
                int a17 = C0945a.m5155a(a, "telemetry");
                int a18 = C0945a.m5155a(a, "adEngine");
                int a19 = C0945a.m5155a(a, "conviva");
                int a20 = C0945a.m5155a(a, "orderNumber");
                int a21 = C0945a.m5155a(a, "thumbnailResolution");
                int a22 = C0945a.m5155a(a, "thumbnails");
                int a23 = C0945a.m5155a(a, "thumbnailsSize");
                int a24 = C0945a.m5155a(a, "lastLicenseRenewal");
                int a25 = C0945a.m5155a(a, "lastLicenseRenewalResult");
                int a26 = C0945a.m5155a(a, "type");
                int a27 = C0945a.m5155a(a, "bytesDownloaded");
                int a28 = C0945a.m5155a(a, "percentageComplete");
                int a29 = C0945a.m5155a(a, "error");
                int a30 = C0945a.m5155a(a, StreamSampleTelemetryData.TIMESTAMP_KEY);
                CachedMediaEntry cachedMediaEntry = null;
                if (a.moveToFirst()) {
                    String string = a.getString(a2);
                    String string2 = a.getString(a3);
                    String string3 = a.getString(a4);
                    byte[] blob = a.getBlob(a5);
                    byte[] blob2 = a.getBlob(a6);
                    DateTime fromTimestamp = DateTimeConverter.fromTimestamp(a.getString(a7));
                    if (a.isNull(a8)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a.getInt(a8));
                    }
                    if (a.isNull(a9)) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(a.getInt(a9));
                    }
                    if (a.isNull(a10)) {
                        num3 = null;
                    } else {
                        num3 = Integer.valueOf(a.getInt(a10));
                    }
                    List fromString = StringListConverter.fromString(a.getString(a11));
                    List fromString2 = StringListConverter.fromString(a.getString(a12));
                    String string4 = a.getString(a13);
                    ArrayList renditionKeys = RenditionKeysConverter.toRenditionKeys(a.getString(a14));
                    List hlsPlaylistVariants = HlsPlaylistVariantConverter.toHlsPlaylistVariants(a.getString(a15));
                    String string5 = a.getString(a16);
                    Map fromString3 = StringMapAnyConverter.fromString(a.getString(a17));
                    Map fromString4 = StringMapAnyConverter.fromString(a.getString(a18));
                    Map fromString5 = StringMapAnyConverter.fromString(a.getString(a19));
                    int i4 = a.getInt(a20);
                    String string6 = a.getString(a21);
                    MediaThumbnailLinks thumbnailLinks = ThumbnailLinksConverter.toThumbnailLinks(a.getString(a22));
                    long j = a.getLong(a23);
                    DateTime fromTimestamp2 = DateTimeConverter.fromTimestamp(a.getString(a24));
                    String string7 = a.getString(a25);
                    int i5 = a26;
                    if (a.isNull(i5)) {
                        i3 = a27;
                        if (a.isNull(i3)) {
                            i2 = a28;
                            if (a.isNull(i2)) {
                                i = a29;
                                if (a.isNull(i)) {
                                    if (a.isNull(a30)) {
                                        downloadStatusEntry = null;
                                        CachedMediaEntry cachedMediaEntry2 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i4, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                        cachedMediaEntry = cachedMediaEntry2;
                                    }
                                }
                                DownloadStatusEntry downloadStatusEntry2 = new DownloadStatusEntry(a.getString(i5), a.getLong(i3), a.getFloat(i2), DownloadErrorConverter.toDownloadError(a.getString(i)), DateTimeConverter.fromTimestamp(a.getString(a30)));
                                downloadStatusEntry = downloadStatusEntry2;
                                CachedMediaEntry cachedMediaEntry22 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i4, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                cachedMediaEntry = cachedMediaEntry22;
                            }
                            i = a29;
                            DownloadStatusEntry downloadStatusEntry22 = new DownloadStatusEntry(a.getString(i5), a.getLong(i3), a.getFloat(i2), DownloadErrorConverter.toDownloadError(a.getString(i)), DateTimeConverter.fromTimestamp(a.getString(a30)));
                            downloadStatusEntry = downloadStatusEntry22;
                            CachedMediaEntry cachedMediaEntry222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i4, string6, thumbnailLinks, j, fromTimestamp2, string7);
                            cachedMediaEntry = cachedMediaEntry222;
                        }
                    } else {
                        i3 = a27;
                    }
                    i2 = a28;
                    i = a29;
                    DownloadStatusEntry downloadStatusEntry222 = new DownloadStatusEntry(a.getString(i5), a.getLong(i3), a.getFloat(i2), DownloadErrorConverter.toDownloadError(a.getString(i)), DateTimeConverter.fromTimestamp(a.getString(a30)));
                    downloadStatusEntry = downloadStatusEntry222;
                    CachedMediaEntry cachedMediaEntry2222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i4, string6, thumbnailLinks, j, fromTimestamp2, string7);
                    cachedMediaEntry = cachedMediaEntry2222;
                }
                a.close();
                roomSQLiteQuery.mo5242b();
                return cachedMediaEntry;
            } catch (Throwable th) {
                th = th;
                a.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            a.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    public List<CachedMediaEntry> getLicenseRenewalCandidates(List<String> list) {
        RoomSQLiteQuery roomSQLiteQuery;
        Integer num;
        Integer num2;
        Integer num3;
        DownloadStatusEntry downloadStatusEntry;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        StringBuilder a = C0947c.m5159a();
        a.append("SELECT * FROM cachedMedia ");
        String str = "\n";
        a.append(str);
        a.append("        WHERE (lastLicenseRenewalResult is NULL ");
        a.append(str);
        a.append("        OR lastLicenseRenewalResult NOT IN (");
        int size = list.size();
        C0947c.m5160a(a, size);
        a.append("))");
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b(a.toString(), size + 0);
        int i10 = 1;
        for (String str2 : list) {
            if (str2 == null) {
                b.mo5235a(i10);
            } else {
                b.mo5238a(i10, str2);
            }
            i10++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor a2 = C0946b.m5157a(this.__db, b, false);
        try {
            int a3 = C0945a.m5155a(a2, "mediaId");
            int a4 = C0945a.m5155a(a2, "playbackUrl");
            int a5 = C0945a.m5155a(a2, "masterPlaylist");
            int a6 = C0945a.m5155a(a2, "license");
            int a7 = C0945a.m5155a(a2, "audioLicense");
            int a8 = C0945a.m5155a(a2, "expiration");
            int a9 = C0945a.m5155a(a2, "maxBitrate");
            int a10 = C0945a.m5155a(a2, "maxHeight");
            int a11 = C0945a.m5155a(a2, "maxWidth");
            int a12 = C0945a.m5155a(a2, "audioLanguages");
            int a13 = C0945a.m5155a(a2, "subtitleLanguages");
            int a14 = C0945a.m5155a(a2, "alternateStorageDir");
            int a15 = C0945a.m5155a(a2, "renditionKeys");
            int a16 = C0945a.m5155a(a2, "playlistVariants");
            roomSQLiteQuery = b;
            try {
                int a17 = C0945a.m5155a(a2, "contentId");
                int a18 = C0945a.m5155a(a2, "telemetry");
                int a19 = C0945a.m5155a(a2, "adEngine");
                int a20 = C0945a.m5155a(a2, "conviva");
                int a21 = C0945a.m5155a(a2, "orderNumber");
                int a22 = C0945a.m5155a(a2, "thumbnailResolution");
                int a23 = C0945a.m5155a(a2, "thumbnails");
                int a24 = C0945a.m5155a(a2, "thumbnailsSize");
                int a25 = C0945a.m5155a(a2, "lastLicenseRenewal");
                int a26 = C0945a.m5155a(a2, "lastLicenseRenewalResult");
                int a27 = C0945a.m5155a(a2, "type");
                int a28 = C0945a.m5155a(a2, "bytesDownloaded");
                int a29 = C0945a.m5155a(a2, "percentageComplete");
                int a30 = C0945a.m5155a(a2, "error");
                int a31 = C0945a.m5155a(a2, StreamSampleTelemetryData.TIMESTAMP_KEY);
                int i11 = a16;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(a3);
                    String string2 = a2.getString(a4);
                    String string3 = a2.getString(a5);
                    byte[] blob = a2.getBlob(a6);
                    byte[] blob2 = a2.getBlob(a7);
                    DateTime fromTimestamp = DateTimeConverter.fromTimestamp(a2.getString(a8));
                    if (a2.isNull(a9)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(a2.getInt(a9));
                    }
                    if (a2.isNull(a10)) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(a2.getInt(a10));
                    }
                    if (a2.isNull(a11)) {
                        num3 = null;
                    } else {
                        num3 = Integer.valueOf(a2.getInt(a11));
                    }
                    List fromString = StringListConverter.fromString(a2.getString(a12));
                    List fromString2 = StringListConverter.fromString(a2.getString(a13));
                    String string4 = a2.getString(a14);
                    ArrayList renditionKeys = RenditionKeysConverter.toRenditionKeys(a2.getString(a15));
                    int i12 = i11;
                    List hlsPlaylistVariants = HlsPlaylistVariantConverter.toHlsPlaylistVariants(a2.getString(i12));
                    int i13 = a3;
                    int i14 = a17;
                    String string5 = a2.getString(i14);
                    a17 = i14;
                    int i15 = a18;
                    Map fromString3 = StringMapAnyConverter.fromString(a2.getString(i15));
                    a18 = i15;
                    int i16 = a19;
                    Map fromString4 = StringMapAnyConverter.fromString(a2.getString(i16));
                    a19 = i16;
                    int i17 = a20;
                    Map fromString5 = StringMapAnyConverter.fromString(a2.getString(i17));
                    a20 = i17;
                    int i18 = a21;
                    int i19 = a2.getInt(i18);
                    a21 = i18;
                    int i20 = a22;
                    String string6 = a2.getString(i20);
                    a22 = i20;
                    int i21 = a23;
                    MediaThumbnailLinks thumbnailLinks = ThumbnailLinksConverter.toThumbnailLinks(a2.getString(i21));
                    a23 = i21;
                    int i22 = a24;
                    long j = a2.getLong(i22);
                    a24 = i22;
                    int i23 = a25;
                    DateTime fromTimestamp2 = DateTimeConverter.fromTimestamp(a2.getString(i23));
                    a25 = i23;
                    int i24 = a26;
                    String string7 = a2.getString(i24);
                    a26 = i24;
                    int i25 = a27;
                    if (a2.isNull(i25)) {
                        i5 = i12;
                        i9 = a28;
                        if (a2.isNull(i9)) {
                            i4 = a4;
                            i8 = a29;
                            if (a2.isNull(i8)) {
                                i3 = a5;
                                i7 = a30;
                                if (a2.isNull(i7)) {
                                    i2 = a6;
                                    i6 = a31;
                                    if (!a2.isNull(i6)) {
                                        DownloadStatusEntry downloadStatusEntry2 = new DownloadStatusEntry(a2.getString(i25), a2.getLong(i9), a2.getFloat(i8), DownloadErrorConverter.toDownloadError(a2.getString(i7)), DateTimeConverter.fromTimestamp(a2.getString(i6)));
                                        downloadStatusEntry = downloadStatusEntry2;
                                        i = i25;
                                        CachedMediaEntry cachedMediaEntry = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i19, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                        arrayList.add(cachedMediaEntry);
                                        a3 = i13;
                                        i11 = i5;
                                        a27 = i;
                                        a31 = i6;
                                        a6 = i2;
                                        a30 = i7;
                                        a5 = i3;
                                        a29 = i8;
                                        a4 = i4;
                                        a28 = i9;
                                    } else {
                                        i = i25;
                                        downloadStatusEntry = null;
                                        CachedMediaEntry cachedMediaEntry2 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i19, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                        arrayList.add(cachedMediaEntry2);
                                        a3 = i13;
                                        i11 = i5;
                                        a27 = i;
                                        a31 = i6;
                                        a6 = i2;
                                        a30 = i7;
                                        a5 = i3;
                                        a29 = i8;
                                        a4 = i4;
                                        a28 = i9;
                                    }
                                }
                                i2 = a6;
                                i6 = a31;
                                DownloadStatusEntry downloadStatusEntry22 = new DownloadStatusEntry(a2.getString(i25), a2.getLong(i9), a2.getFloat(i8), DownloadErrorConverter.toDownloadError(a2.getString(i7)), DateTimeConverter.fromTimestamp(a2.getString(i6)));
                                downloadStatusEntry = downloadStatusEntry22;
                                i = i25;
                                CachedMediaEntry cachedMediaEntry22 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i19, string6, thumbnailLinks, j, fromTimestamp2, string7);
                                arrayList.add(cachedMediaEntry22);
                                a3 = i13;
                                i11 = i5;
                                a27 = i;
                                a31 = i6;
                                a6 = i2;
                                a30 = i7;
                                a5 = i3;
                                a29 = i8;
                                a4 = i4;
                                a28 = i9;
                            }
                            i3 = a5;
                            i7 = a30;
                            i2 = a6;
                            i6 = a31;
                            DownloadStatusEntry downloadStatusEntry222 = new DownloadStatusEntry(a2.getString(i25), a2.getLong(i9), a2.getFloat(i8), DownloadErrorConverter.toDownloadError(a2.getString(i7)), DateTimeConverter.fromTimestamp(a2.getString(i6)));
                            downloadStatusEntry = downloadStatusEntry222;
                            i = i25;
                            CachedMediaEntry cachedMediaEntry222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i19, string6, thumbnailLinks, j, fromTimestamp2, string7);
                            arrayList.add(cachedMediaEntry222);
                            a3 = i13;
                            i11 = i5;
                            a27 = i;
                            a31 = i6;
                            a6 = i2;
                            a30 = i7;
                            a5 = i3;
                            a29 = i8;
                            a4 = i4;
                            a28 = i9;
                        }
                    } else {
                        i5 = i12;
                        i9 = a28;
                    }
                    i4 = a4;
                    i8 = a29;
                    i3 = a5;
                    i7 = a30;
                    i2 = a6;
                    i6 = a31;
                    DownloadStatusEntry downloadStatusEntry2222 = new DownloadStatusEntry(a2.getString(i25), a2.getLong(i9), a2.getFloat(i8), DownloadErrorConverter.toDownloadError(a2.getString(i7)), DateTimeConverter.fromTimestamp(a2.getString(i6)));
                    downloadStatusEntry = downloadStatusEntry2222;
                    i = i25;
                    CachedMediaEntry cachedMediaEntry2222 = new CachedMediaEntry(string, string2, string3, blob, blob2, fromTimestamp, num, num2, num3, fromString, fromString2, string4, renditionKeys, downloadStatusEntry, hlsPlaylistVariants, string5, fromString3, fromString4, fromString5, i19, string6, thumbnailLinks, j, fromTimestamp2, string7);
                    arrayList.add(cachedMediaEntry2222);
                    a3 = i13;
                    i11 = i5;
                    a27 = i;
                    a31 = i6;
                    a6 = i2;
                    a30 = i7;
                    a5 = i3;
                    a29 = i8;
                    a4 = i4;
                    a28 = i9;
                }
                a2.close();
                roomSQLiteQuery.mo5242b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            a2.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    public void store(CachedMediaEntry cachedMediaEntry) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCachedMediaEntry.insert(cachedMediaEntry);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void updateStatus(String str, String str2, long j, float f, DownloadError downloadError, DateTime dateTime) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateStatus.acquire();
        if (str2 == null) {
            acquire.mo5235a(1);
        } else {
            acquire.mo5238a(1, str2);
        }
        acquire.mo5237a(2, j);
        acquire.mo5236a(3, (double) f);
        String downloadErrorConverter = DownloadErrorConverter.toString(downloadError);
        if (downloadErrorConverter == null) {
            acquire.mo5235a(4);
        } else {
            acquire.mo5238a(4, downloadErrorConverter);
        }
        String timestamp = DateTimeConverter.toTimestamp(dateTime);
        if (timestamp == null) {
            acquire.mo5235a(5);
        } else {
            acquire.mo5238a(5, timestamp);
        }
        if (str == null) {
            acquire.mo5235a(6);
        } else {
            acquire.mo5238a(6, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.mo5323k0();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateStatus.release(acquire);
        }
    }
}
