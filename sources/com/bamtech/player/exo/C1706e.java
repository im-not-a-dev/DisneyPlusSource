package com.bamtech.player.exo;

import android.graphics.Point;
import android.view.Surface;
import com.bamtech.player.exo.ExoSurfaceView.C1701a;
import com.bamtech.player.exo.p044l.C1732d;
import com.bamtech.player.exo.p045m.C1735c;
import com.bamtech.player.exo.p045m.C1736d;
import com.bamtech.player.exo.p046n.C1739a;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.metadata.C8743e;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p394w0.C9602q;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.C9295d.C9301e;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import java.util.ArrayList;
import org.joda.time.DateTime;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p183e0.C4952a;
import p163g.p174d.p178b.p184f0.C4958c;
import p163g.p174d.p178b.p193j0.C5290d;
import p163g.p174d.p178b.p193j0.C5291e;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

/* renamed from: com.bamtech.player.exo.e */
/* compiled from: ExoVideoPlayer */
public class C1706e implements C5326w {

    /* renamed from: a */
    protected C1708g f5951a;

    /* renamed from: b */
    public C4958c f5952b;

    /* renamed from: c */
    protected final C1739a f5953c;

    /* renamed from: d */
    protected C5300m f5954d;

    /* renamed from: e */
    private ExoSurfaceView f5955e;

    /* renamed from: f */
    protected long f5956f = -1;

    /* renamed from: g */
    protected DateTime f5957g = null;

    /* renamed from: h */
    C1735c f5958h;

    /* renamed from: i */
    protected final C1705d f5959i;

    /* renamed from: j */
    private C9602q f5960j;

    /* renamed from: k */
    C1701a f5961k;

    public C1706e(C1708g gVar, BandwidthMeter bandwidthMeter, C1732d dVar, C1739a aVar, DataSource aVar2, C5300m mVar, C4952a aVar3) {
        this.f5951a = gVar;
        this.f5953c = aVar;
        this.f5954d = mVar;
        this.f5958h = new C1736d(gVar, dVar, mVar);
        this.f5952b = new C4958c();
        C1705d dVar2 = new C1705d(gVar, this, this.f5958h, this.f5952b, mVar);
        this.f5959i = dVar2;
        gVar.addListener(this.f5959i);
        mo7619d(true);
    }

    /* renamed from: F */
    private void m7870F() {
        C1708g gVar = this.f5951a;
        if (gVar != null) {
            gVar.mo22620a((C9332k) this.f5961k);
            this.f5951a.mo22632b(this.f5960j);
            this.f5951a.mo22622a((Surface) null);
            this.f5951a.mo23002b((C8743e) this.f5959i);
        }
        this.f5956f = -1;
        this.f5957g = null;
    }

    /* renamed from: b */
    private void m7871b(ExoSurfaceView exoSurfaceView) {
        if (this.f5955e != exoSurfaceView) {
            this.f5955e = exoSurfaceView;
            m7870F();
            if (exoSurfaceView != null) {
                if (exoSurfaceView.getVideoSurfaceView() != null) {
                    this.f5951a.mo22623a(exoSurfaceView.getVideoSurfaceView());
                } else {
                    this.f5951a.mo22630b(exoSurfaceView.getTextureView());
                }
                this.f5960j = exoSurfaceView.getComponentListener();
                this.f5961k = exoSurfaceView.getComponentListener();
                this.f5951a.mo22626a(this.f5960j);
                this.f5951a.mo22997a((C8743e) this.f5959i);
                this.f5951a.mo22621b((C9332k) this.f5961k);
            }
        }
    }

    /* renamed from: A */
    public void mo7593A() {
        C5291e eVar = new C5291e(this, this.f5953c.mo7786f());
        eVar.mo16877b();
        this.f5954d.mo17007b(eVar);
        this.f5954d.mo17017c(this.f5953c.mo7790j());
        this.f5954d.mo17012b(this.f5953c.mo7789i());
    }

    /* renamed from: B */
    public void mo7594B() {
        this.f5955e = null;
        mo7605a(C1736d.f6022b);
        m7870F();
        C1708g gVar = this.f5951a;
        if (gVar != null) {
            gVar.mo7651k();
        }
    }

    /* renamed from: C */
    public void mo7595C() {
        this.f5958h.reset();
        this.f5952b.mo16430a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo7596D() {
        this.f5958h.mo7753a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo7597E() {
        DateTime dateTime = this.f5957g;
        if (dateTime != null) {
            this.f5957g = null;
            mo7607a(dateTime);
        }
    }

    /* renamed from: Y */
    public void mo7598Y() {
        mo7619d(true);
    }

    /* renamed from: a */
    public void mo7603a(ExoSurfaceView exoSurfaceView) {
        m7871b(exoSurfaceView);
    }

    /* renamed from: c */
    public void mo7615c(long j) {
        mo7602a(this.f5951a.getCurrentPosition() + j);
    }

    /* renamed from: d */
    public void mo7619d(boolean z) {
        this.f5951a.setPlayWhenReady(z);
    }

    /* renamed from: e */
    public int mo7621e() {
        if (this.f5951a.mo23007h() != null) {
            return this.f5951a.mo23007h().f19019g;
        }
        return 0;
    }

    /* renamed from: f */
    public String mo7622f() {
        return this.f5953c.mo7787g();
    }

    /* renamed from: g */
    public boolean mo7623g() {
        return mo7620d(5000);
    }

    public long getBufferedPosition() {
        return this.f5951a.getBufferedPosition();
    }

    public long getCurrentPosition() {
        return this.f5951a.getCurrentPosition();
    }

    public long getDuration() {
        return this.f5951a.getDuration();
    }

    /* renamed from: h */
    public String mo7627h() {
        return this.f5953c.mo7788h();
    }

    /* renamed from: i */
    public void mo7628i() {
        mo7598Y();
    }

    /* renamed from: j */
    public void mo7629j() {
        this.f5953c.mo7795o();
    }

    /* renamed from: k */
    public float mo7630k() {
        return this.f5951a.mo23009j();
    }

    /* renamed from: l */
    public long mo7631l() {
        C8670c cVar = new C8670c();
        Timeline currentTimeline = this.f5951a.getCurrentTimeline();
        if (currentTimeline.mo22667b() > 0) {
            return C.usToMs(currentTimeline.mo22663a(this.f5951a.getCurrentWindowIndex(), cVar).f18403e);
        }
        return 0;
    }

    /* renamed from: m */
    public boolean mo7632m() {
        return this.f5951a.getPlaybackState() != 1;
    }

    /* renamed from: n */
    public Point mo7633n() {
        if (this.f5951a.mo23008i() != null) {
            return new Point(this.f5951a.mo23008i().f18355g0, this.f5951a.mo23008i().f18356h0);
        }
        ExoSurfaceView exoSurfaceView = this.f5955e;
        if (exoSurfaceView != null) {
            return new Point(exoSurfaceView.getWidth(), this.f5955e.getHeight());
        }
        return new Point(0, 0);
    }

    /* renamed from: o */
    public void mo7634o() {
        this.f5951a.mo7654n();
    }

    /* renamed from: p */
    public void mo7635p() {
        mo7602a(mo7631l());
    }

    /* renamed from: q */
    public boolean mo7636q() {
        return this.f5953c.mo7792l();
    }

    /* renamed from: r */
    public int mo7637r() {
        return (int) this.f5951a.getPlaybackParameters().f18372a;
    }

    /* renamed from: s */
    public boolean mo7638s() {
        return this.f5953c.mo7793m();
    }

    /* renamed from: t */
    public boolean mo7639t() {
        return this.f5953c.mo7790j();
    }

    /* renamed from: u */
    public void mo7640u() {
        this.f5951a.mo7653m();
    }

    /* renamed from: v */
    public void mo7641v() {
        this.f5951a.mo7652l();
    }

    /* renamed from: w */
    public boolean mo7642w() {
        return this.f5953c.mo7791k();
    }

    /* renamed from: x */
    public boolean mo7643x() {
        return !mo7620d(15000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public C1708g mo7644y() {
        return this.f5951a;
    }

    @Deprecated
    /* renamed from: z */
    public C9301e mo7645z() {
        return this.f5953c.mo24086d();
    }

    /* renamed from: a */
    public void mo7602a(long j) {
        boolean playWhenReady = this.f5951a.getPlayWhenReady();
        long currentPosition = getCurrentPosition();
        this.f5951a.mo23043a(j);
        mo7619d(playWhenReady);
        this.f5954d.mo16986a(currentPosition, j);
    }

    /* renamed from: d */
    public boolean mo7620d(long j) {
        long currentPosition = getCurrentPosition();
        long l = mo7631l();
        return currentPosition > l || l - currentPosition < j;
    }

    /* renamed from: c */
    public boolean mo7617c() {
        return this.f5951a.isCurrentWindowDynamic() || this.f5951a.getDuration() == -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo7616c(boolean z) {
        this.f5953c.mo7781b(z);
    }

    /* renamed from: d */
    public C5300m mo7618d() {
        return this.f5954d;
    }

    /* renamed from: a */
    public void mo7607a(DateTime dateTime) {
        long millis = dateTime.getMillis();
        long j = this.f5956f;
        if (j > -1) {
            mo7602a(millis - j);
        } else {
            this.f5957g = dateTime;
        }
    }

    /* renamed from: a */
    public boolean mo7609a() {
        return this.f5951a.getPlayWhenReady() && this.f5951a.getPlaybackState() == 3;
    }

    /* renamed from: b */
    public void mo7611b() {
        mo7619d(false);
    }

    /* renamed from: a */
    public void mo7599a(float f) {
        this.f5951a.mo22993a(f);
        this.f5954d.mo16983a(f);
    }

    /* renamed from: b */
    public void mo7612b(long j) {
        this.f5954d.mo17032f(j);
    }

    /* renamed from: b */
    public void mo7614b(boolean z) {
        if (this.f5955e == null) {
            Timber.m44526b("Attempting to enable Closed Captions on a null surface view!", new Object[0]);
            return;
        }
        if (!z) {
            this.f5961k.mo7574a(new ArrayList());
            this.f5953c.mo7783c((String) null);
            this.f5953c.mo7784c(false);
        }
        this.f5953c.mo7767a(z);
    }

    /* renamed from: a */
    public boolean mo7610a(C5290d dVar) {
        if (dVar == null) {
            return false;
        }
        return this.f5953c.mo7771a(dVar);
    }

    /* renamed from: a */
    public void mo7601a(int i, int i2, int i3) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        Integer num = null;
        if (i3 > 0) {
            num = Integer.valueOf(i3);
        }
        this.f5953c.mo7765a(i, i2, num);
    }

    /* renamed from: a */
    public void mo7606a(String str) {
        this.f5953c.mo7780b(str);
    }

    /* renamed from: a */
    public void mo7608a(boolean z) {
        this.f5953c.mo7784c(z);
    }

    @Deprecated
    /* renamed from: a */
    public void mo7604a(C9301e eVar) {
        this.f5953c.mo24085a(eVar);
    }

    /* renamed from: b */
    public void mo7613b(String str) {
        this.f5953c.mo7783c(str);
    }

    /* renamed from: a */
    public void mo7600a(int i) {
        this.f5951a.mo22995a(new PlaybackParameters((float) i, 1.0f));
    }

    /* renamed from: a */
    public void mo7605a(Function<MediaSource, MediaSource> function) {
        this.f5958h.mo7754a(function);
    }
}
