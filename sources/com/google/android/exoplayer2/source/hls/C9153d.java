package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.upstream.C9508n;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.exoplayer2.source.hls.d */
/* compiled from: Aes128DataSource */
class C9153d implements DataSource {

    /* renamed from: a */
    private final DataSource f20558a;

    /* renamed from: b */
    private final byte[] f20559b;

    /* renamed from: c */
    private final byte[] f20560c;

    /* renamed from: d */
    private CipherInputStream f20561d;

    public C9153d(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f20558a = dataSource;
        this.f20559b = bArr;
        this.f20560c = bArr2;
    }

    /* renamed from: a */
    public final Map<String, List<String>> mo9243a() {
        return this.f20558a.mo9243a();
    }

    public final void addTransferListener(TransferListener transferListener) {
        this.f20558a.addTransferListener(transferListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Cipher mo23794b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public void close() throws IOException {
        if (this.f20561d != null) {
            this.f20561d = null;
            this.f20558a.close();
        }
    }

    public final Uri getUri() {
        return this.f20558a.getUri();
    }

    public final long open(DataSpec dataSpec) throws IOException {
        try {
            Cipher b = mo23794b();
            try {
                b.init(2, new SecretKeySpec(this.f20559b, "AES"), new IvParameterSpec(this.f20560c));
                C9508n nVar = new C9508n(this.f20558a, dataSpec);
                this.f20561d = new CipherInputStream(nVar, b);
                nVar.mo24570a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C9537e.m29296a(this.f20561d);
        int read = this.f20561d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
