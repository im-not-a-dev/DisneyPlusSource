package com.google.android.exoplayer2;

import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.C9565s;
import com.google.android.exoplayer2.source.C9141f0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.q */
/* compiled from: BaseRenderer */
public abstract class C8872q implements C8733l0, C8735m0 {

    /* renamed from: U */
    private C8800n0 f18996U;

    /* renamed from: V */
    private int f18997V;

    /* renamed from: W */
    private int f18998W;

    /* renamed from: X */
    private C9141f0 f18999X;

    /* renamed from: Y */
    private Format[] f19000Y;

    /* renamed from: Z */
    private long f19001Z;

    /* renamed from: a0 */
    private long f19002a0 = Long.MIN_VALUE;

    /* renamed from: b0 */
    private boolean f19003b0;

    /* renamed from: c */
    private final int f19004c;

    public C8872q(int i) {
        this.f19004c = i;
    }

    /* renamed from: a */
    public /* synthetic */ void mo22837a(float f) throws ExoPlaybackException {
        C8731k0.m25326a(this, f);
    }

    /* renamed from: a */
    public final void mo22838a(int i) {
        this.f18997V = i;
    }

    /* renamed from: a */
    public void mo22648a(int i, Object obj) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22878a(long j, boolean z) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23187a(boolean z) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo23202b(long j) {
        return this.f18999X.mo23576d(j - this.f19001Z);
    }

    /* renamed from: d */
    public final int mo22845d() {
        return this.f18998W;
    }

    /* renamed from: e */
    public final void mo22846e() {
        boolean z = true;
        if (this.f18998W != 1) {
            z = false;
        }
        Assertions.checkState(z);
        this.f18998W = 0;
        this.f18999X = null;
        this.f19000Y = null;
        this.f19003b0 = false;
        mo22881t();
    }

    /* renamed from: f */
    public final int mo22847f() {
        return this.f19004c;
    }

    /* renamed from: g */
    public final boolean mo22848g() {
        return this.f19002a0 == Long.MIN_VALUE;
    }

    /* renamed from: h */
    public final void mo22849h() {
        this.f19003b0 = true;
    }

    /* renamed from: i */
    public final C8735m0 mo22850i() {
        return this;
    }

    /* renamed from: j */
    public final C9141f0 mo22851j() {
        return this.f18999X;
    }

    /* renamed from: k */
    public final void mo22852k() throws IOException {
        this.f18999X.mo23574a();
    }

    /* renamed from: l */
    public final long mo22853l() {
        return this.f19002a0;
    }

    /* renamed from: m */
    public final boolean mo22854m() {
        return this.f19003b0;
    }

    /* renamed from: n */
    public C9565s mo22855n() {
        return null;
    }

    /* renamed from: o */
    public int mo22861o() throws ExoPlaybackException {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C8800n0 mo23203p() {
        return this.f18996U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo23204q() {
        return this.f18997V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Format[] mo23205r() {
        return this.f19000Y;
    }

    public final void reset() {
        Assertions.checkState(this.f18998W == 0);
        mo23196u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo23206s() {
        return mo22848g() ? this.f19003b0 : this.f18999X.mo23575b();
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f18998W != 1) {
            z = false;
        }
        Assertions.checkState(z);
        this.f18998W = 2;
        mo23197v();
    }

    public final void stop() throws ExoPlaybackException {
        Assertions.checkState(this.f18998W == 2);
        this.f18998W = 1;
        mo23198w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo22881t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo23196u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo23197v() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo23198w() throws ExoPlaybackException {
    }

    /* renamed from: a */
    public final void mo22841a(C8800n0 n0Var, Format[] formatArr, C9141f0 f0Var, long j, boolean z, long j2) throws ExoPlaybackException {
        Assertions.checkState(this.f18998W == 0);
        this.f18996U = n0Var;
        this.f18998W = 1;
        mo23187a(z);
        mo22842a(formatArr, f0Var, j2);
        mo22878a(j, z);
    }

    /* renamed from: a */
    public final void mo22842a(Format[] formatArr, C9141f0 f0Var, long j) throws ExoPlaybackException {
        Assertions.checkState(!this.f19003b0);
        this.f18999X = f0Var;
        this.f19002a0 = j;
        this.f19000Y = formatArr;
        this.f19001Z = j;
        mo22879a(formatArr, j);
    }

    /* renamed from: a */
    public final void mo22839a(long j) throws ExoPlaybackException {
        this.f19003b0 = false;
        this.f19002a0 = j;
        mo22878a(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo23201a(C8679b0 b0Var, C8879e eVar, boolean z) {
        int a = this.f18999X.mo23573a(b0Var, eVar, z);
        int i = -4;
        if (a == -4) {
            if (eVar.mo23211d()) {
                this.f19002a0 = Long.MIN_VALUE;
                if (!this.f19003b0) {
                    i = -3;
                }
                return i;
            }
            eVar.f19024W += this.f19001Z;
            this.f19002a0 = Math.max(this.f19002a0, eVar.f19024W);
        } else if (a == -5) {
            Format format = b0Var.f18427a;
            long j = format.f18354f0;
            if (j != Long.MAX_VALUE) {
                b0Var.f18427a = format.mo22606b(j + this.f19001Z);
            }
        }
        return a;
    }

    /* renamed from: a */
    protected static boolean m25888a(DrmSessionManager<?> lVar, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (lVar == null) {
            return false;
        }
        return lVar.canAcquireSession(drmInitData);
    }
}
