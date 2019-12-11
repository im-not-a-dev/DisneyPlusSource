package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseDao;
import com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
final class RoomMediaStorage$markLicenseForRemoval$1 implements C11945a {
    final /* synthetic */ byte[] $audioLicense;
    final /* synthetic */ byte[] $license;
    final /* synthetic */ String $mediaId;
    final /* synthetic */ boolean $permanently;
    final /* synthetic */ RoomMediaStorage this$0;

    RoomMediaStorage$markLicenseForRemoval$1(RoomMediaStorage roomMediaStorage, String str, byte[] bArr, byte[] bArr2, boolean z) {
        this.this$0 = roomMediaStorage;
        this.$mediaId = str;
        this.$license = bArr;
        this.$audioLicense = bArr2;
        this.$permanently = z;
    }

    public final void run() {
        OldMediaLicenseDao oldMediaLicenseDao = this.this$0.f6074db.oldMediaLicenseDao();
        OldMediaLicenseEntry oldMediaLicenseEntry = new OldMediaLicenseEntry(this.$mediaId, this.$license, this.$audioLicense, 0, null, this.$permanently, 24, null);
        oldMediaLicenseDao.store(oldMediaLicenseEntry);
    }
}
