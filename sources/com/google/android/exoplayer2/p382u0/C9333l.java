package com.google.android.exoplayer2.p382u0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9566t;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.l */
/* compiled from: TextRenderer */
public final class C9333l extends C8872q implements Callback {

    /* renamed from: c0 */
    private final Handler f21365c0;

    /* renamed from: d0 */
    private final C9332k f21366d0;

    /* renamed from: e0 */
    private final C9328h f21367e0;

    /* renamed from: f0 */
    private final C8679b0 f21368f0;

    /* renamed from: g0 */
    private boolean f21369g0;

    /* renamed from: h0 */
    private boolean f21370h0;

    /* renamed from: i0 */
    private int f21371i0;

    /* renamed from: j0 */
    private Format f21372j0;

    /* renamed from: k0 */
    private C9326f f21373k0;

    /* renamed from: l0 */
    private C9330i f21374l0;

    /* renamed from: m0 */
    private C9331j f21375m0;

    /* renamed from: n0 */
    private C9331j f21376n0;

    /* renamed from: o0 */
    private int f21377o0;

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.u0.l$a */
    /* compiled from: TextRenderer */
    public interface C9334a extends C9332k {
    }

    public C9333l(C9332k kVar, Looper looper) {
        this(kVar, looper, C9328h.f21361a);
    }

    /* renamed from: A */
    private void m28375A() {
        m28381z();
        this.f21373k0.mo23217a();
        this.f21373k0 = null;
        this.f21371i0 = 0;
    }

    /* renamed from: B */
    private void m28376B() {
        m28375A();
        this.f21373k0 = this.f21367e0.mo24149b(this.f21372j0);
    }

    /* renamed from: b */
    private void m28378b(List<C9322b> list) {
        Handler handler = this.f21365c0;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m28377a(list);
        }
    }

    /* renamed from: x */
    private void m28379x() {
        m28378b(Collections.emptyList());
    }

    /* renamed from: y */
    private long m28380y() {
        int i = this.f21377o0;
        if (i == -1 || i >= this.f21375m0.mo24144a()) {
            return Long.MAX_VALUE;
        }
        return this.f21375m0.mo24146a(this.f21377o0);
    }

    /* renamed from: z */
    private void m28381z() {
        this.f21374l0 = null;
        this.f21377o0 = -1;
        C9331j jVar = this.f21375m0;
        if (jVar != null) {
            jVar.mo23227f();
            this.f21375m0 = null;
        }
        C9331j jVar2 = this.f21376n0;
        if (jVar2 != null) {
            jVar2.mo23227f();
            this.f21376n0 = null;
        }
    }

    /* renamed from: a */
    public int mo22859a(Format format) {
        if (!this.f21367e0.mo24148a(format)) {
            return C9566t.m29518k(format.f18349b0) ? 1 : 0;
        }
        return C8872q.m25888a(null, format.f18353e0) ? 4 : 2;
    }

    /* renamed from: b */
    public boolean mo22843b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo22844c() {
        return this.f21370h0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m28377a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        this.f21372j0 = null;
        m28379x();
        m28375A();
    }

    public C9333l(C9332k kVar, Looper looper, C9328h hVar) {
        Handler handler;
        super(3);
        Assertions.checkNotNull(kVar);
        this.f21366d0 = kVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = Util.m29393a(looper, (Callback) this);
        }
        this.f21365c0 = handler;
        this.f21367e0 = hVar;
        this.f21368f0 = new C8679b0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
        this.f21372j0 = formatArr[0];
        if (this.f21373k0 != null) {
            this.f21371i0 = 1;
        } else {
            this.f21373k0 = this.f21367e0.mo24149b(this.f21372j0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) {
        m28379x();
        this.f21369g0 = false;
        this.f21370h0 = false;
        if (this.f21371i0 != 0) {
            m28376B();
            return;
        }
        m28381z();
        this.f21373k0.flush();
    }

    /* renamed from: a */
    public void mo22840a(long j, long j2) throws ExoPlaybackException {
        boolean z;
        if (!this.f21370h0) {
            if (this.f21376n0 == null) {
                this.f21373k0.mo24142a(j);
                try {
                    this.f21376n0 = (C9331j) this.f21373k0.mo23219b();
                } catch (C9327g e) {
                    throw ExoPlaybackException.m24862a(e, mo23204q());
                }
            }
            if (mo22845d() == 2) {
                if (this.f21375m0 != null) {
                    long y = m28380y();
                    z = false;
                    while (y <= j) {
                        this.f21377o0++;
                        y = m28380y();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C9331j jVar = this.f21376n0;
                if (jVar != null) {
                    if (jVar.mo23211d()) {
                        if (!z && m28380y() == Long.MAX_VALUE) {
                            if (this.f21371i0 == 2) {
                                m28376B();
                            } else {
                                m28381z();
                                this.f21370h0 = true;
                            }
                        }
                    } else if (this.f21376n0.f19026U <= j) {
                        C9331j jVar2 = this.f21375m0;
                        if (jVar2 != null) {
                            jVar2.mo23227f();
                        }
                        this.f21375m0 = this.f21376n0;
                        this.f21376n0 = null;
                        this.f21377o0 = this.f21375m0.mo24145a(j);
                        z = true;
                    }
                }
                if (z) {
                    m28378b(this.f21375m0.mo24147b(j));
                }
                if (this.f21371i0 != 2) {
                    while (!this.f21369g0) {
                        try {
                            if (this.f21374l0 == null) {
                                this.f21374l0 = (C9330i) this.f21373k0.mo23220c();
                                if (this.f21374l0 == null) {
                                    return;
                                }
                            }
                            if (this.f21371i0 == 1) {
                                this.f21374l0.mo23213e(4);
                                this.f21373k0.mo23218a(this.f21374l0);
                                this.f21374l0 = null;
                                this.f21371i0 = 2;
                                return;
                            }
                            int a = mo23201a(this.f21368f0, (C8879e) this.f21374l0, false);
                            if (a == -4) {
                                if (this.f21374l0.mo23211d()) {
                                    this.f21369g0 = true;
                                } else {
                                    this.f21374l0.f21362Y = this.f21368f0.f18427a.f18354f0;
                                    this.f21374l0.mo23223f();
                                }
                                this.f21373k0.mo23218a(this.f21374l0);
                                this.f21374l0 = null;
                            } else if (a == -3) {
                                break;
                            }
                        } catch (C9327g e2) {
                            throw ExoPlaybackException.m24862a(e2, mo23204q());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m28377a(List<C9322b> list) {
        this.f21366d0.mo7574a(list);
    }
}
