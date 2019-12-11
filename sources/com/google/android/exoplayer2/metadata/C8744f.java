package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.f */
/* compiled from: MetadataRenderer */
public final class C8744f extends C8872q implements Callback {

    /* renamed from: c0 */
    private final C8740c f18558c0;

    /* renamed from: d0 */
    private final C8743e f18559d0;

    /* renamed from: e0 */
    private final Handler f18560e0;

    /* renamed from: f0 */
    private final C8679b0 f18561f0;

    /* renamed from: g0 */
    private final C8742d f18562g0;

    /* renamed from: h0 */
    private final Metadata[] f18563h0;

    /* renamed from: i0 */
    private final long[] f18564i0;

    /* renamed from: j0 */
    private int f18565j0;

    /* renamed from: k0 */
    private int f18566k0;

    /* renamed from: l0 */
    private C8739b f18567l0;

    /* renamed from: m0 */
    private boolean f18568m0;

    /* renamed from: n0 */
    private long f18569n0;

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.metadata.f$a */
    /* compiled from: MetadataRenderer */
    public interface C8745a extends C8743e {
    }

    public C8744f(C8743e eVar, Looper looper) {
        this(eVar, looper, C8740c.f18556a);
    }

    /* renamed from: b */
    private void m25367b(Metadata metadata) {
        this.f18559d0.mo7577a(metadata);
    }

    /* renamed from: x */
    private void m25368x() {
        Arrays.fill(this.f18563h0, null);
        this.f18565j0 = 0;
        this.f18566k0 = 0;
    }

    /* renamed from: a */
    public int mo22859a(Format format) {
        if (!this.f18558c0.mo22876a(format)) {
            return 0;
        }
        return C8872q.m25888a(null, format.f18353e0) ? 4 : 2;
    }

    /* renamed from: b */
    public boolean mo22843b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo22844c() {
        return this.f18568m0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m25367b((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        m25368x();
        this.f18567l0 = null;
    }

    public C8744f(C8743e eVar, Looper looper, C8740c cVar) {
        Handler handler;
        super(4);
        C9537e.m29296a(eVar);
        this.f18559d0 = eVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C9554k0.m29393a(looper, (Callback) this);
        }
        this.f18560e0 = handler;
        C9537e.m29296a(cVar);
        this.f18558c0 = cVar;
        this.f18561f0 = new C8679b0();
        this.f18562g0 = new C8742d();
        this.f18563h0 = new Metadata[5];
        this.f18564i0 = new long[5];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
        this.f18567l0 = this.f18558c0.mo22877b(formatArr[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) {
        m25368x();
        this.f18568m0 = false;
    }

    /* renamed from: a */
    public void mo22840a(long j, long j2) throws ExoPlaybackException {
        if (!this.f18568m0 && this.f18566k0 < 5) {
            this.f18562g0.mo23207b();
            int a = mo23201a(this.f18561f0, (C8879e) this.f18562g0, false);
            if (a == -4) {
                if (this.f18562g0.mo23211d()) {
                    this.f18568m0 = true;
                } else if (!this.f18562g0.mo23210c()) {
                    C8742d dVar = this.f18562g0;
                    dVar.f18557Y = this.f18569n0;
                    dVar.mo23223f();
                    Metadata a2 = this.f18567l0.mo22875a(this.f18562g0);
                    if (a2 != null) {
                        ArrayList arrayList = new ArrayList(a2.mo22862X());
                        m25366a(a2, (List<C8737b>) arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata((List<? extends C8737b>) arrayList);
                            int i = this.f18565j0;
                            int i2 = this.f18566k0;
                            int i3 = (i + i2) % 5;
                            this.f18563h0[i3] = metadata;
                            this.f18564i0[i3] = this.f18562g0.f19024W;
                            this.f18566k0 = i2 + 1;
                        }
                    }
                }
            } else if (a == -5) {
                this.f18569n0 = this.f18561f0.f18427a.f18354f0;
            }
        }
        if (this.f18566k0 > 0) {
            long[] jArr = this.f18564i0;
            int i4 = this.f18565j0;
            if (jArr[i4] <= j) {
                m25365a(this.f18563h0[i4]);
                Metadata[] metadataArr = this.f18563h0;
                int i5 = this.f18565j0;
                metadataArr[i5] = null;
                this.f18565j0 = (i5 + 1) % 5;
                this.f18566k0--;
            }
        }
    }

    /* renamed from: a */
    private void m25366a(Metadata metadata, List<C8737b> list) {
        for (int i = 0; i < metadata.mo22862X(); i++) {
            Format H = metadata.mo22863a(i).mo22873H();
            if (H == null || !this.f18558c0.mo22876a(H)) {
                list.add(metadata.mo22863a(i));
            } else {
                C8739b b = this.f18558c0.mo22877b(H);
                byte[] K = metadata.mo22863a(i).mo22874K();
                C9537e.m29296a(K);
                byte[] bArr = K;
                this.f18562g0.mo23207b();
                this.f18562g0.mo23224f(bArr.length);
                this.f18562g0.f19023V.put(bArr);
                this.f18562g0.mo23223f();
                Metadata a = b.mo22875a(this.f18562g0);
                if (a != null) {
                    m25366a(a, list);
                }
            }
        }
    }

    /* renamed from: a */
    private void m25365a(Metadata metadata) {
        Handler handler = this.f18560e0;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m25367b(metadata);
        }
    }
}
