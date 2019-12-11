package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.C8712n;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExoMediaDrm<T extends C8712n> {

    public static final class KeyRequest {

        /* renamed from: a */
        private final byte[] f18469a;

        /* renamed from: b */
        private final String f18470b;

        public KeyRequest(byte[] bArr, String str) {
            this.f18469a = bArr;
            this.f18470b = str;
        }

        /* renamed from: a */
        public byte[] mo22786a() {
            return this.f18469a;
        }

        /* renamed from: b */
        public String mo22787b() {
            return this.f18470b;
        }
    }

    public static final class ProvisionRequest {

        /* renamed from: a */
        private final byte[] f18471a;

        /* renamed from: b */
        private final String f18472b;

        public ProvisionRequest(byte[] bArr, String str) {
            this.f18471a = bArr;
            this.f18472b = str;
        }

        /* renamed from: a */
        public byte[] mo22788a() {
            return this.f18471a;
        }

        /* renamed from: b */
        public String mo22789b() {
            return this.f18472b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$a */
    public interface C8695a<T extends C8712n> {
        /* renamed from: a */
        void mo22747a(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: a */
    KeyRequest mo22775a(byte[] bArr, List<C8692b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: a */
    ProvisionRequest mo22776a();

    /* renamed from: a */
    Map<String, String> mo22777a(byte[] bArr);

    /* renamed from: a */
    void mo22778a(C8695a<? super T> aVar);

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
