package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExoMediaDrm<T extends ExoMediaCrypto> {

    public static final class KeyRequest {

        /* renamed from: a */
        private final byte[] data;

        /* renamed from: b */
        private final String licenseServerUrl;

        public KeyRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.licenseServerUrl = str;
        }

        /* renamed from: a */
        public byte[] getData() {
            return this.data;
        }

        /* renamed from: b */
        public String getLicenseServerUrl() {
            return this.licenseServerUrl;
        }
    }

    public static final class ProvisionRequest {

        /* renamed from: a */
        private final byte[] data;

        /* renamed from: b */
        private final String defaultUrl;

        public ProvisionRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        /* renamed from: a */
        public byte[] getData() {
            return this.data;
        }

        /* renamed from: b */
        public String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$a */
    public interface OnKeyStatusChangeListener<T extends ExoMediaCrypto> {
        /* renamed from: a */
		/* original:
		void onKeyStatusChange(
        ExoMediaDrm<? extends T> mediaDrm,
        byte[] sessionId,
        List<KeyStatus> exoKeyInformation,
        boolean hasNewUsableKey);
  } */
        void onKeyStatusChange(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);
    }

	/

    /* renamed from: a */
    KeyRequest mo22775a(byte[] bArr, List<SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: a */
    ProvisionRequest mo22776a();

    /* renamed from: a */
    Map<String, String> mo22777a(byte[] bArr);

    /* renamed from: a */
    void mo22778a(OnKeyStatusChangeListener<? super T> aVar);

    /* renamed from: a */
    void mo22779a(String str, String str2);

    /* renamed from: a */
    void mo22780a(byte[] bArr, byte[] bArr2);

    /* renamed from: b */
    T mo22781b(byte[] bArr) throws MediaCryptoException;

    /* renamed from: b */
    byte[] mo22782b() throws MediaDrmException;

    /* renamed from: b */
    byte[] mo22783b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: c */
    void mo22784c(byte[] bArr);

    /* renamed from: d */
    void mo22785d(byte[] bArr) throws DeniedByServerException;
}
