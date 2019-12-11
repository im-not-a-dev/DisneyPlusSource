package p163g.p174d.p178b.p180b0;

import android.net.Uri;
import android.view.MotionEvent;
import java.util.List;
import p163g.p174d.p178b.C5300m.C5301a;
import p163g.p174d.p178b.p179a0.C4831f;
import p163g.p174d.p178b.p182d0.C4946g;
import p163g.p174d.p178b.p182d0.C4949i;
import p163g.p174d.p178b.p184f0.C4956a;
import p163g.p174d.p178b.p190h0.C5275b;
import p163g.p174d.p178b.p190h0.C5277d;
import p163g.p174d.p178b.p190h0.C5278e;
import p163g.p174d.p178b.p190h0.C5279f;
import p163g.p174d.p178b.p191i0.p192a.C5281a.C5283b;
import p163g.p174d.p178b.p193j0.C5291e;
import p163g.p174d.p178b.p194k0.C5295a;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p196m0.C5305c;
import p686n.p687a.C14100a;

/* renamed from: g.d.b.b0.w2 */
/* compiled from: DebugBindings */
public class C4926w2 implements C4922v2 {
    /* renamed from: A */
    public void mo16248A() {
        C14100a.m44529c("skipRecapClicked", new Object[0]);
    }

    /* renamed from: B */
    public void mo16249B() {
        C14100a.m44529c("closeClicked", new Object[0]);
    }

    /* renamed from: a */
    public void mo16270a(boolean z) {
        C14100a.m44529c("seekbarTouched %b", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo7663b() {
        C14100a.m44529c("playbackEnded", new Object[0]);
    }

    /* renamed from: c */
    public void mo7665c(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("playerBuffering and isPlaying: ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: d */
    public void mo16290d(boolean z) {
        C14100a.m44529c("closedCaptionsChanged %b", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo16294e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("closedCaptionsClicked ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: f */
    public void mo16297f(long j) {
    }

    /* renamed from: f */
    public void mo16298f(boolean z) {
        C14100a.m44529c("captionsExist %b", Boolean.valueOf(z));
    }

    /* renamed from: g */
    public void mo16300g(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("jumpClicked ");
        sb.append(i);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: h */
    public void mo16303h() {
        C14100a.m44529c("skipIntroClicked", new Object[0]);
    }

    /* renamed from: i */
    public void mo16308i(int i) {
        C14100a.m44529c("orientationChanged %d", Integer.valueOf(i));
    }

    /* renamed from: i */
    public void mo16309i(long j) {
    }

    /* renamed from: j */
    public void mo16313j(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("fullScreenClicked ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: k */
    public void mo16315k(long j) {
        C14100a.m44529c("seekbarTimeChanged %d", Long.valueOf(j));
    }

    /* renamed from: l */
    public void mo16316l() {
        C14100a.m44529c("minimizeForPipClicked", new Object[0]);
    }

    /* renamed from: m */
    public void mo16318m() {
        C14100a.m44529c("player stopped Buffering", new Object[0]);
    }

    /* renamed from: n */
    public void mo16320n() {
        C14100a.m44529c("jumpForward", new Object[0]);
    }

    /* renamed from: o */
    public void mo16322o() {
        C14100a.m44529c("farBehindLivePoint", new Object[0]);
    }

    /* renamed from: p */
    public void mo16325p(boolean z) {
        C14100a.m44529c("liveMedia %b", Boolean.valueOf(z));
    }

    /* renamed from: q */
    public void mo16326q(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("muteClicked ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: r */
    public void mo16327r() {
        C14100a.m44529c("startTimers", new Object[0]);
    }

    /* renamed from: s */
    public void mo16330s(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("playPauseClicked ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: t */
    public void mo7670t() {
        C14100a.m44529c("onEndAd", new Object[0]);
    }

    /* renamed from: u */
    public void mo16331u() {
        C14100a.m44529c("seekBarSeekForward", new Object[0]);
    }

    /* renamed from: v */
    public void mo16332v() {
        C14100a.m44529c("seekBarSeekBackward", new Object[0]);
    }

    /* renamed from: w */
    public void mo16333w() {
        C14100a.m44529c("fastForward", new Object[0]);
    }

    /* renamed from: x */
    public void mo7671x() {
        C14100a.m44529c("lifecycleStop", new Object[0]);
    }

    /* renamed from: y */
    public void mo16334y() {
        C14100a.m44529c("playerTapped", new Object[0]);
    }

    /* renamed from: z */
    public void mo16335z() {
        C14100a.m44529c("onPauseAd", new Object[0]);
    }

    /* renamed from: a */
    public void mo16254a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("onBrandLogoOverlayUriChanged: ");
        sb.append(uri);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16274b(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("onShutterImageUriChanged: ");
        sb.append(uri);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: c */
    public void mo16283c(long j) {
        C14100a.m44529c("bufferedTimeChanged %d", Long.valueOf(j));
    }

    /* renamed from: d */
    public void mo16286d() {
        C14100a.m44529c("seekToLiveClicked", new Object[0]);
    }

    /* renamed from: e */
    public void mo16293e(long j) {
        C14100a.m44529c("preSeek $d", Long.valueOf(j));
    }

    /* renamed from: f */
    public void mo16295f() {
        C14100a.m44529c("controlsShouldBeHidden", new Object[0]);
    }

    /* renamed from: g */
    public void mo16301g(long j) {
        C14100a.m44529c("endTimeOffsetMs $d", Long.valueOf(j));
    }

    /* renamed from: h */
    public void mo16306h(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onShutterViewVisible: ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: i */
    public void mo16310i(boolean z) {
        C14100a.m44529c("controlsVisible %b", Boolean.valueOf(z));
    }

    /* renamed from: j */
    public void mo16312j(long j) {
        C14100a.m44529c("startTimeOffsetMs %d", Long.valueOf(j));
    }

    /* renamed from: k */
    public void mo7668k(boolean z) {
        C14100a.m44529c("playbackChanged %b", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public void mo16317l(boolean z) {
        C14100a.m44529c("seekable %b", Boolean.valueOf(z));
    }

    /* renamed from: m */
    public void mo16319m(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pip mode changed: ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: n */
    public void mo16321n(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("TrickPlay Available ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: o */
    public void mo16323o(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("TrickPlay Active ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: p */
    public void mo16324p() {
        C14100a.m44529c("playbackIdle", new Object[0]);
    }

    /* renamed from: q */
    public void mo7669q() {
        C14100a.m44529c("onPlayAd", new Object[0]);
    }

    /* renamed from: r */
    public void mo16328r(boolean z) {
        C14100a.m44529c("livePoint %b", Boolean.valueOf(z));
    }

    /* renamed from: s */
    public void mo16329s() {
        C14100a.m44529c("backPressed", new Object[0]);
    }

    /* renamed from: a */
    public void mo16265a(C5295a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("New sprite sheet");
        sb.append(aVar);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16273b(long j) {
        C14100a.m44529c("estimatedMaxTimeMs $d", Long.valueOf(j));
    }

    /* renamed from: c */
    public void mo7664c(Uri uri) {
        C14100a.m44529c("newMedia %s", uri.toString());
    }

    /* renamed from: d */
    public void mo16288d(long j) {
        C14100a.m44529c("timeChanged %d", Long.valueOf(j));
    }

    /* renamed from: e */
    public void mo16292e(int i) {
        C14100a.m44529c("keyUp %d", Integer.valueOf(i));
    }

    /* renamed from: f */
    public void mo16296f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("multiJumpForward ");
        sb.append(i);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: g */
    public void mo16299g() {
        C14100a.m44529c("jumpBackward", new Object[0]);
    }

    /* renamed from: h */
    public void mo16305h(long j) {
        C14100a.m44529c("maxTimeChanged %d", Long.valueOf(j));
    }

    /* renamed from: i */
    public void mo16307i() {
        C14100a.m44529c("uiTouched", new Object[0]);
    }

    /* renamed from: j */
    public void mo16311j() {
        C14100a.m44529c("onAllAdsComplete", new Object[0]);
    }

    /* renamed from: k */
    public void mo16314k() {
        C14100a.m44529c("lifecycleStart", new Object[0]);
    }

    /* renamed from: a */
    public void mo16266a(C5298a aVar) {
        C14100a.m44529c("skipRecap %s", aVar.toString());
    }

    /* renamed from: b */
    public void mo16278b(C5298a aVar) {
        C14100a.m44529c("skipIntro %s", aVar.toString());
    }

    /* renamed from: c */
    public void mo16282c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("jump ");
        sb.append(i);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: d */
    public void mo16289d(C5283b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancelled Loading Track ");
        sb.append(bVar.f12650a.toString());
        sb.append(" Reason: ");
        sb.append(bVar.f12651b);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: e */
    public void mo16291e() {
        C14100a.m44529c("rewind", new Object[0]);
    }

    /* renamed from: g */
    public void mo16302g(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Wifi connectivity: ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: h */
    public void mo16304h(int i) {
        C14100a.m44529c("percentageComplete %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo16251a(float f) {
        C14100a.m44529c("volumeChanged %f", Float.valueOf(f));
    }

    /* renamed from: b */
    public void mo16279b(List<C4956a> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("DateRangeEvent: ");
        sb.append(list.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: c */
    public void mo16285c(C5298a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onUpNextSchedule");
        sb.append(aVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: d */
    public void mo16287d(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("multiJumpBackward ");
        sb.append(i);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: e */
    public void mo7666e(C5283b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Format changed ");
        sb.append(bVar.f12650a.toString());
        sb.append(" Reason: ");
        sb.append(bVar.f12651b);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16259a(C5275b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("id3Tag ");
        sb.append(bVar.mo16843b());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16277b(C5291e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Track Selection Changed: ");
        sb.append(eVar);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: c */
    public void mo16284c(C5283b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Completed Loading Track ");
        sb.append(bVar.f12650a.toString());
        sb.append(" Reason: ");
        sb.append(bVar.f12651b);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16260a(C5277d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivateFrame:  Owner: ");
        sb.append(dVar.mo16844c());
        sb.append(" data: ");
        sb.append(dVar.mo16845d());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16271b(float f) {
        C14100a.m44529c("playbackRate %f", Float.valueOf(f));
    }

    /* renamed from: c */
    public void mo16281c() {
        C14100a.m44529c("request Activity.finish()", new Object[0]);
    }

    /* renamed from: a */
    public void mo16262a(C5279f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("TextFrame ");
        sb.append(fVar.mo16847c());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16280b(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("onUpNextVisibility ");
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16261a(C5278e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("TIT2 ");
        sb.append(eVar.mo16846c());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16275b(C4946g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("playbackRange BUFFERING ");
        sb.append(gVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16269a(List<C4956a> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ranges updated: ");
        sb.append(list.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16276b(C5283b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error Loading Track ");
        sb.append(bVar.f12650a.toString());
        sb.append(" Reason: ");
        sb.append(bVar.f12651b);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16264a(C5291e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("New Tracks available: ");
        sb.append(eVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void mo16272b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dropped Decode buffers ");
        sb.append(i);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo7662a(Throwable th) {
        C14100a.m44523a(th);
    }

    /* renamed from: a */
    public void mo16267a(C5301a aVar) {
        C14100a.m44529c("controlsVisibilityLocked %s %b", aVar.f12781a, Boolean.valueOf(aVar.f12782b));
    }

    /* renamed from: a */
    public void mo16252a(int i) {
        C14100a.m44529c("keyDown %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo16250a() {
        C14100a.m44529c("backClicked", new Object[0]);
    }

    /* renamed from: a */
    public void mo16258a(C4949i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("playbackRangeList ");
        sb.append(iVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16256a(C4831f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("bifFile ");
        sb.append(fVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16253a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("TrickPlay Time ");
        sb.append(j);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16257a(C4946g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("playbackRange ");
        sb.append(gVar.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16268a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("titleChanged ");
        sb.append(str);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo7661a(C5305c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Seek Occurred from ");
        sb.append(cVar.mo17085c());
        sb.append(" to ");
        sb.append(cVar.mo17084b());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16263a(C5283b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Started Loading Track ");
        sb.append(bVar.f12650a.toString());
        sb.append(" Reason: ");
        sb.append(bVar.f12651b);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo16255a(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("MotionEvent");
        sb.append(motionEvent.toString());
        C14100a.m44529c(sb.toString(), new Object[0]);
    }
}
