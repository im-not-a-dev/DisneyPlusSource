package com.google.android.exoplayer2.p391ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.C8727i0;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.C8898s;
import com.google.android.exoplayer2.C9269t;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.p391ui.C9418p.C9419a;
import com.google.android.exoplayer2.p393v0.C9528a0;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.ui.g */
/* compiled from: PlayerControlView */
public class C9405g extends FrameLayout {

    /* renamed from: A0 */
    private final String f21777A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public Player f21778B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public C8898s f21779C0;

    /* renamed from: D0 */
    private C9409d f21780D0;

    /* renamed from: E0 */
    private C9408c f21781E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public C8727i0 f21782F0;

    /* renamed from: G0 */
    private boolean f21783G0;

    /* renamed from: H0 */
    private boolean f21784H0;

    /* renamed from: I0 */
    private boolean f21785I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public boolean f21786J0;

    /* renamed from: K0 */
    private int f21787K0 = 5000;

    /* renamed from: L0 */
    private int f21788L0 = 15000;

    /* renamed from: M0 */
    private int f21789M0 = 5000;

    /* renamed from: N0 */
    private int f21790N0 = HttpStatus.HTTP_OK;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public int f21791O0 = 0;

    /* renamed from: P0 */
    private boolean f21792P0 = false;

    /* renamed from: Q0 */
    private long f21793Q0 = -9223372036854775807L;

    /* renamed from: R0 */
    private long[] f21794R0;

    /* renamed from: S0 */
    private boolean[] f21795S0;

    /* renamed from: T0 */
    private long[] f21796T0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final View f21797U;

    /* renamed from: U0 */
    private boolean[] f21798U0;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final View f21799V;

    /* renamed from: V0 */
    private long f21800V0;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final View f21801W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final View f21802a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final View f21803b0;

    /* renamed from: c */
    private final C9407b f21804c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final View f21805c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final ImageView f21806d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final ImageView f21807e0;

    /* renamed from: f0 */
    private final View f21808f0;

    /* renamed from: g0 */
    private final TextView f21809g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final TextView f21810h0;

    /* renamed from: i0 */
    private final C9418p f21811i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final StringBuilder f21812j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final Formatter f21813k0;

    /* renamed from: l0 */
    private final C8669b f21814l0;

    /* renamed from: m0 */
    private final C8670c f21815m0;

    /* renamed from: n0 */
    private final Runnable f21816n0;

    /* renamed from: o0 */
    private final Runnable f21817o0;

    /* renamed from: p0 */
    private final Drawable f21818p0;

    /* renamed from: q0 */
    private final Drawable f21819q0;

    /* renamed from: r0 */
    private final Drawable f21820r0;

    /* renamed from: s0 */
    private final String f21821s0;

    /* renamed from: t0 */
    private final String f21822t0;

    /* renamed from: u0 */
    private final String f21823u0;

    /* renamed from: v0 */
    private final Drawable f21824v0;

    /* renamed from: w0 */
    private final Drawable f21825w0;

    /* renamed from: x0 */
    private final float f21826x0;

    /* renamed from: y0 */
    private final float f21827y0;

    /* renamed from: z0 */
    private final String f21828z0;

    /* renamed from: com.google.android.exoplayer2.ui.g$b */
    /* compiled from: PlayerControlView */
    private final class C9407b implements EventListener, C9419a, OnClickListener {
        private C9407b() {
        }

        /* renamed from: a */
        public void mo24404a(C9418p pVar, long j) {
            if (C9405g.this.f21810h0 != null) {
                C9405g.this.f21810h0.setText(C9554k0.m29398a(C9405g.this.f21812j0, C9405g.this.f21813k0, j));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo7578a(boolean z) {
            C8729j0.m25320a((EventListener) this, z);
        }

        /* renamed from: b */
        public void mo24406b(C9418p pVar, long j) {
            C9405g.this.f21786J0 = true;
            if (C9405g.this.f21810h0 != null) {
                C9405g.this.f21810h0.setText(C9554k0.m29398a(C9405g.this.f21812j0, C9405g.this.f21813k0, j));
            }
        }

        public void onClick(View view) {
            Player r = C9405g.this.f21778B0;
            if (r != null) {
                if (C9405g.this.f21799V == view) {
                    C9405g.this.m28842b(r);
                } else if (C9405g.this.f21797U == view) {
                    C9405g.this.m28846c(r);
                } else if (C9405g.this.f21803b0 == view) {
                    C9405g.this.m28832a(r);
                } else if (C9405g.this.f21805c0 == view) {
                    C9405g.this.m28851d(r);
                } else if (C9405g.this.f21801W == view) {
                    if (r.getPlaybackState() == 1) {
                        if (C9405g.this.f21782F0 != null) {
                            C9405g.this.f21782F0.mo22836a();
                        }
                    } else if (r.getPlaybackState() == 4) {
                        C9405g.this.f21779C0.mo23264a(r, r.getCurrentWindowIndex(), -9223372036854775807L);
                    }
                    C9405g.this.f21779C0.mo23267c(r, true);
                } else if (C9405g.this.f21802a0 == view) {
                    C9405g.this.f21779C0.mo23267c(r, false);
                } else if (C9405g.this.f21806d0 == view) {
                    C9405g.this.f21779C0.mo23263a(r, C9528a0.m29280a(r.getRepeatMode(), C9405g.this.f21791O0));
                } else if (C9405g.this.f21807e0 == view) {
                    C9405g.this.f21779C0.mo23266b(r, !r.getShuffleModeEnabled());
                }
            }
        }

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C8729j0.m25323b((EventListener) this, z);
        }

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C8729j0.m25317a((EventListener) this, playbackParameters);
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C8729j0.m25316a((EventListener) this, exoPlaybackException);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            C9405g.this.m28862i();
            C9405g.this.m28864j();
        }

        public void onPositionDiscontinuity(int i) {
            C9405g.this.m28860h();
            C9405g.this.m28870m();
        }

        public void onRepeatModeChanged(int i) {
            C9405g.this.m28866k();
            C9405g.this.m28860h();
        }

        public /* synthetic */ void onSeekProcessed() {
            C8729j0.m25314a(this);
        }

        public void onShuffleModeEnabledChanged(boolean z) {
            C9405g.this.m28868l();
            C9405g.this.m28860h();
        }

        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C9405g.this.m28860h();
            C9405g.this.m28870m();
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C8729j0.m25319a((EventListener) this, trackGroupArray, trackSelectionArray);
        }

        /* renamed from: a */
        public void mo24405a(C9418p pVar, long j, boolean z) {
            C9405g.this.f21786J0 = false;
            if (!z && C9405g.this.f21778B0 != null) {
                C9405g gVar = C9405g.this;
                gVar.m28843b(gVar.f21778B0, j);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.g$c */
    /* compiled from: PlayerControlView */
    public interface C9408c {
        /* renamed from: a */
        void mo24408a(long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.ui.g$d */
    /* compiled from: PlayerControlView */
    public interface C9409d {
        /* renamed from: a */
        void mo24409a(int i);
    }

    static {
        C8672a0.m24990a("goog.exo.ui");
    }

    public C9405g(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C9414l.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C9416n.PlayerControlView, 0, 0);
            try {
                this.f21787K0 = obtainStyledAttributes.getInt(C9416n.PlayerControlView_rewind_increment, this.f21787K0);
                this.f21788L0 = obtainStyledAttributes.getInt(C9416n.PlayerControlView_fastforward_increment, this.f21788L0);
                this.f21789M0 = obtainStyledAttributes.getInt(C9416n.PlayerControlView_show_timeout, this.f21789M0);
                i2 = obtainStyledAttributes.getResourceId(C9416n.PlayerControlView_controller_layout_id, i2);
                this.f21791O0 = m28831a(obtainStyledAttributes, this.f21791O0);
                this.f21792P0 = obtainStyledAttributes.getBoolean(C9416n.PlayerControlView_show_shuffle_button, this.f21792P0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C9416n.PlayerControlView_time_bar_min_update_interval, this.f21790N0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f21814l0 = new C8669b();
        this.f21815m0 = new C8670c();
        this.f21812j0 = new StringBuilder();
        this.f21813k0 = new Formatter(this.f21812j0, Locale.getDefault());
        this.f21794R0 = new long[0];
        this.f21795S0 = new boolean[0];
        this.f21796T0 = new long[0];
        this.f21798U0 = new boolean[0];
        this.f21804c = new C9407b();
        this.f21779C0 = new C9269t();
        this.f21816n0 = new C9401c(this);
        this.f21817o0 = new C9399a(this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        C9418p pVar = (C9418p) findViewById(C9412j.exo_progress);
        View findViewById = findViewById(C9412j.exo_progress_placeholder);
        if (pVar != null) {
            this.f21811i0 = pVar;
        } else if (findViewById != null) {
            C9403e eVar = new C9403e(context, null, 0, attributeSet2);
            eVar.setId(C9412j.exo_progress);
            eVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(eVar, indexOfChild);
            this.f21811i0 = eVar;
        } else {
            this.f21811i0 = null;
        }
        this.f21809g0 = (TextView) findViewById(C9412j.exo_duration);
        this.f21810h0 = (TextView) findViewById(C9412j.exo_position);
        C9418p pVar2 = this.f21811i0;
        if (pVar2 != null) {
            pVar2.mo24349a(this.f21804c);
        }
        this.f21801W = findViewById(C9412j.exo_play);
        View view = this.f21801W;
        if (view != null) {
            view.setOnClickListener(this.f21804c);
        }
        this.f21802a0 = findViewById(C9412j.exo_pause);
        View view2 = this.f21802a0;
        if (view2 != null) {
            view2.setOnClickListener(this.f21804c);
        }
        this.f21797U = findViewById(C9412j.exo_prev);
        View view3 = this.f21797U;
        if (view3 != null) {
            view3.setOnClickListener(this.f21804c);
        }
        this.f21799V = findViewById(C9412j.exo_next);
        View view4 = this.f21799V;
        if (view4 != null) {
            view4.setOnClickListener(this.f21804c);
        }
        this.f21805c0 = findViewById(C9412j.exo_rew);
        View view5 = this.f21805c0;
        if (view5 != null) {
            view5.setOnClickListener(this.f21804c);
        }
        this.f21803b0 = findViewById(C9412j.exo_ffwd);
        View view6 = this.f21803b0;
        if (view6 != null) {
            view6.setOnClickListener(this.f21804c);
        }
        this.f21806d0 = (ImageView) findViewById(C9412j.exo_repeat_toggle);
        ImageView imageView = this.f21806d0;
        if (imageView != null) {
            imageView.setOnClickListener(this.f21804c);
        }
        this.f21807e0 = (ImageView) findViewById(C9412j.exo_shuffle);
        ImageView imageView2 = this.f21807e0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f21804c);
        }
        this.f21808f0 = findViewById(C9412j.exo_vr);
        setShowVrButton(false);
        Resources resources = context.getResources();
        this.f21826x0 = ((float) resources.getInteger(C9413k.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f21827y0 = ((float) resources.getInteger(C9413k.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f21818p0 = resources.getDrawable(C9411i.exo_controls_repeat_off);
        this.f21819q0 = resources.getDrawable(C9411i.exo_controls_repeat_one);
        this.f21820r0 = resources.getDrawable(C9411i.exo_controls_repeat_all);
        this.f21824v0 = resources.getDrawable(C9411i.exo_controls_shuffle_on);
        this.f21825w0 = resources.getDrawable(C9411i.exo_controls_shuffle_off);
        this.f21821s0 = resources.getString(C9415m.exo_controls_repeat_off_description);
        this.f21822t0 = resources.getString(C9415m.exo_controls_repeat_one_description);
        this.f21823u0 = resources.getString(C9415m.exo_controls_repeat_all_description);
        this.f21828z0 = resources.getString(C9415m.exo_controls_shuffle_on_description);
        this.f21777A0 = resources.getString(C9415m.exo_controls_shuffle_off_description);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static boolean m28838a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo24378a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f21817o0);
        } else if (motionEvent.getAction() == 1) {
            m28850d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.f21778B0;
    }

    public int getRepeatToggleModes() {
        return this.f21791O0;
    }

    public boolean getShowShuffleButton() {
        return this.f21792P0;
    }

    public int getShowTimeoutMs() {
        return this.f21789M0;
    }

    public boolean getShowVrButton() {
        View view = this.f21808f0;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21783G0 = true;
        long j = this.f21793Q0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo24377a();
            } else {
                postDelayed(this.f21817o0, uptimeMillis);
            }
        } else if (mo24379b()) {
            m28850d();
        }
        m28858g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21783G0 = false;
        removeCallbacks(this.f21816n0);
        removeCallbacks(this.f21817o0);
    }

    public void setControlDispatcher(C8898s sVar) {
        if (sVar == null) {
            sVar = new C9269t();
        }
        this.f21779C0 = sVar;
    }

    public void setFastForwardIncrementMs(int i) {
        this.f21788L0 = i;
        m28860h();
    }

    public void setPlaybackPreparer(C8727i0 i0Var) {
        this.f21782F0 = i0Var;
    }

    public void setPlayer(Player player) {
        boolean z = true;
        C9537e.m29301b(Looper.myLooper() == Looper.getMainLooper());
        if (!(player == null || player.getApplicationLooper() == Looper.getMainLooper())) {
            z = false;
        }
        C9537e.m29299a(z);
        Player player2 = this.f21778B0;
        if (player2 != player) {
            if (player2 != null) {
                player2.removeListener(this.f21804c);
            }
            this.f21778B0 = player;
            if (player != null) {
                player.addListener(this.f21804c);
            }
            m28858g();
        }
    }

    public void setProgressUpdateListener(C9408c cVar) {
        this.f21781E0 = cVar;
    }

    public void setRepeatToggleModes(int i) {
        this.f21791O0 = i;
        Player player = this.f21778B0;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f21779C0.mo23263a(this.f21778B0, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.f21779C0.mo23263a(this.f21778B0, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.f21779C0.mo23263a(this.f21778B0, 2);
            }
        }
        m28866k();
    }

    public void setRewindIncrementMs(int i) {
        this.f21787K0 = i;
        m28860h();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f21784H0 = z;
        m28870m();
    }

    public void setShowShuffleButton(boolean z) {
        this.f21792P0 = z;
        m28868l();
    }

    public void setShowTimeoutMs(int i) {
        this.f21789M0 = i;
        if (mo24379b()) {
            m28850d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f21808f0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f21790N0 = C9554k0.m29382a(i, 16, 1000);
    }

    public void setVisibilityListener(C9409d dVar) {
        this.f21780D0 = dVar;
    }

    public void setVrButtonListener(OnClickListener onClickListener) {
        View view = this.f21808f0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: e */
    private boolean m28854e() {
        Player player = this.f21778B0;
        if (player == null || player.getPlaybackState() == 4 || this.f21778B0.getPlaybackState() == 1 || !this.f21778B0.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m28856f() {
        boolean e = m28854e();
        if (!e) {
            View view = this.f21801W;
            if (view != null) {
                view.requestFocus();
                return;
            }
        }
        if (e) {
            View view2 = this.f21802a0;
            if (view2 != null) {
                view2.requestFocus();
            }
        }
    }

    /* renamed from: g */
    private void m28858g() {
        m28862i();
        m28860h();
        m28866k();
        m28868l();
        m28870m();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28860h() {
        /*
            r7 = this;
            boolean r0 = r7.mo24379b()
            if (r0 == 0) goto L_0x0089
            boolean r0 = r7.f21783G0
            if (r0 != 0) goto L_0x000c
            goto L_0x0089
        L_0x000c:
            com.google.android.exoplayer2.Player r0 = r7.f21778B0
            r1 = 0
            if (r0 == 0) goto L_0x006a
            com.google.android.exoplayer2.Timeline r0 = r0.getCurrentTimeline()
            boolean r2 = r0.mo22671c()
            if (r2 != 0) goto L_0x006a
            com.google.android.exoplayer2.Player r2 = r7.f21778B0
            boolean r2 = r2.isPlayingAd()
            if (r2 != 0) goto L_0x006a
            com.google.android.exoplayer2.Player r2 = r7.f21778B0
            int r2 = r2.getCurrentWindowIndex()
            com.google.android.exoplayer2.Timeline$c r3 = r7.f21815m0
            r0.mo22663a(r2, r3)
            com.google.android.exoplayer2.Timeline$c r0 = r7.f21815m0
            boolean r2 = r0.f18399a
            r3 = 1
            if (r2 != 0) goto L_0x0044
            boolean r0 = r0.f18400b
            if (r0 == 0) goto L_0x0044
            com.google.android.exoplayer2.Player r0 = r7.f21778B0
            boolean r0 = r0.hasPrevious()
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            if (r2 == 0) goto L_0x004d
            int r4 = r7.f21787K0
            if (r4 <= 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f21788L0
            if (r5 <= 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            com.google.android.exoplayer2.Timeline$c r6 = r7.f21815m0
            boolean r6 = r6.f18400b
            if (r6 != 0) goto L_0x0065
            com.google.android.exoplayer2.Player r6 = r7.f21778B0
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L_0x0066
        L_0x0065:
            r1 = 1
        L_0x0066:
            r3 = r2
            r2 = r1
            r1 = r4
            goto L_0x006e
        L_0x006a:
            r0 = 0
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x006e:
            android.view.View r4 = r7.f21797U
            r7.m28837a(r0, r4)
            android.view.View r0 = r7.f21805c0
            r7.m28837a(r1, r0)
            android.view.View r0 = r7.f21803b0
            r7.m28837a(r5, r0)
            android.view.View r0 = r7.f21799V
            r7.m28837a(r2, r0)
            com.google.android.exoplayer2.ui.p r0 = r7.f21811i0
            if (r0 == 0) goto L_0x0089
            r0.setEnabled(r3)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9405g.m28860h():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m28862i() {
        boolean z;
        if (mo24379b() && this.f21783G0) {
            boolean e = m28854e();
            View view = this.f21801W;
            int i = 8;
            boolean z2 = true;
            if (view != null) {
                z = (e && view.isFocused()) | false;
                this.f21801W.setVisibility(e ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f21802a0;
            if (view2 != null) {
                if (e || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.f21802a0;
                if (e) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                m28856f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m28864j() {
        long j;
        if (mo24379b() && this.f21783G0) {
            Player player = this.f21778B0;
            long j2 = 0;
            if (player != null) {
                j2 = this.f21800V0 + player.getContentPosition();
                j = this.f21800V0 + this.f21778B0.getContentBufferedPosition();
            } else {
                j = 0;
            }
            TextView textView = this.f21810h0;
            if (textView != null && !this.f21786J0) {
                textView.setText(C9554k0.m29398a(this.f21812j0, this.f21813k0, j2));
            }
            C9418p pVar = this.f21811i0;
            if (pVar != null) {
                pVar.setPosition(j2);
                this.f21811i0.setBufferedPosition(j);
            }
            C9408c cVar = this.f21781E0;
            if (cVar != null) {
                cVar.mo24408a(j2, j);
            }
            removeCallbacks(this.f21816n0);
            Player player2 = this.f21778B0;
            int playbackState = player2 == null ? 1 : player2.getPlaybackState();
            long j3 = 1000;
            if (playbackState == 3 && this.f21778B0.getPlayWhenReady()) {
                C9418p pVar2 = this.f21811i0;
                long min = Math.min(pVar2 != null ? pVar2.getPreferredUpdateDelay() : 1000, 1000 - (j2 % 1000));
                float f = this.f21778B0.getPlaybackParameters().f18372a;
                if (f > 0.0f) {
                    j3 = (long) (((float) min) / f);
                }
                postDelayed(this.f21816n0, C9554k0.m29431b(j3, (long) this.f21790N0, 1000));
            } else if (playbackState != 4 && playbackState != 1) {
                postDelayed(this.f21816n0, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m28866k() {
        if (mo24379b() && this.f21783G0) {
            ImageView imageView = this.f21806d0;
            if (imageView != null) {
                if (this.f21791O0 == 0) {
                    imageView.setVisibility(8);
                } else if (this.f21778B0 == null) {
                    m28837a(false, (View) imageView);
                    this.f21806d0.setImageDrawable(this.f21818p0);
                    this.f21806d0.setContentDescription(this.f21821s0);
                } else {
                    m28837a(true, (View) imageView);
                    int repeatMode = this.f21778B0.getRepeatMode();
                    if (repeatMode == 0) {
                        this.f21806d0.setImageDrawable(this.f21818p0);
                        this.f21806d0.setContentDescription(this.f21821s0);
                    } else if (repeatMode == 1) {
                        this.f21806d0.setImageDrawable(this.f21819q0);
                        this.f21806d0.setContentDescription(this.f21822t0);
                    } else if (repeatMode == 2) {
                        this.f21806d0.setImageDrawable(this.f21820r0);
                        this.f21806d0.setContentDescription(this.f21823u0);
                    }
                    this.f21806d0.setVisibility(0);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m28868l() {
        if (mo24379b() && this.f21783G0) {
            ImageView imageView = this.f21807e0;
            if (imageView != null) {
                if (!this.f21792P0) {
                    imageView.setVisibility(8);
                } else if (this.f21778B0 == null) {
                    m28837a(false, (View) imageView);
                    this.f21807e0.setImageDrawable(this.f21825w0);
                    this.f21807e0.setContentDescription(this.f21777A0);
                } else {
                    m28837a(true, (View) imageView);
                    this.f21807e0.setImageDrawable(this.f21778B0.getShuffleModeEnabled() ? this.f21824v0 : this.f21825w0);
                    this.f21807e0.setContentDescription(this.f21778B0.getShuffleModeEnabled() ? this.f21828z0 : this.f21777A0);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m28870m() {
        int i;
        C8670c cVar;
        Player player = this.f21778B0;
        if (player != null) {
            boolean z = true;
            this.f21785I0 = this.f21784H0 && m28840a(player.getCurrentTimeline(), this.f21815m0);
            long j = 0;
            this.f21800V0 = 0;
            Timeline currentTimeline = this.f21778B0.getCurrentTimeline();
            if (!currentTimeline.mo22671c()) {
                int currentWindowIndex = this.f21778B0.getCurrentWindowIndex();
                int i2 = this.f21785I0 ? 0 : currentWindowIndex;
                int b = this.f21785I0 ? currentTimeline.mo22667b() - 1 : currentWindowIndex;
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > b) {
                        break;
                    }
                    if (i2 == currentWindowIndex) {
                        this.f21800V0 = C8883r.m25968b(j2);
                    }
                    currentTimeline.mo22663a(i2, this.f21815m0);
                    C8670c cVar2 = this.f21815m0;
                    if (cVar2.f18404f == -9223372036854775807L) {
                        C9537e.m29301b(this.f21785I0 ^ z);
                        break;
                    }
                    int i3 = cVar2.f18401c;
                    while (true) {
                        cVar = this.f21815m0;
                        if (i3 > cVar.f18402d) {
                            break;
                        }
                        currentTimeline.mo22660a(i3, this.f21814l0);
                        int a = this.f21814l0.mo22672a();
                        int i4 = i;
                        for (int i5 = 0; i5 < a; i5++) {
                            long b2 = this.f21814l0.mo22681b(i5);
                            if (b2 == Long.MIN_VALUE) {
                                long j3 = this.f21814l0.f18396c;
                                if (j3 == -9223372036854775807L) {
                                } else {
                                    b2 = j3;
                                }
                            }
                            long f = b2 + this.f21814l0.mo22688f();
                            if (f >= 0 && f <= this.f21815m0.f18404f) {
                                long[] jArr = this.f21794R0;
                                if (i4 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f21794R0 = Arrays.copyOf(this.f21794R0, length);
                                    this.f21795S0 = Arrays.copyOf(this.f21795S0, length);
                                }
                                this.f21794R0[i4] = C8883r.m25968b(j2 + f);
                                this.f21795S0[i4] = this.f21814l0.mo22686d(i5);
                                i4++;
                            }
                        }
                        i3++;
                        i = i4;
                    }
                    j2 += cVar.f18404f;
                    i2++;
                    z = true;
                }
                j = j2;
            } else {
                i = 0;
            }
            long b3 = C8883r.m25968b(j);
            TextView textView = this.f21809g0;
            if (textView != null) {
                textView.setText(C9554k0.m29398a(this.f21812j0, this.f21813k0, b3));
            }
            C9418p pVar = this.f21811i0;
            if (pVar != null) {
                pVar.setDuration(b3);
                int length2 = this.f21796T0.length;
                int i6 = i + length2;
                long[] jArr2 = this.f21794R0;
                if (i6 > jArr2.length) {
                    this.f21794R0 = Arrays.copyOf(jArr2, i6);
                    this.f21795S0 = Arrays.copyOf(this.f21795S0, i6);
                }
                System.arraycopy(this.f21796T0, 0, this.f21794R0, i, length2);
                System.arraycopy(this.f21798U0, 0, this.f21795S0, i, length2);
                this.f21811i0.mo24350a(this.f21794R0, this.f21795S0, i6);
            }
            m28864j();
        }
    }

    /* renamed from: d */
    private void m28850d() {
        removeCallbacks(this.f21817o0);
        if (this.f21789M0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f21789M0;
            this.f21793Q0 = uptimeMillis + ((long) i);
            if (this.f21783G0) {
                postDelayed(this.f21817o0, (long) i);
                return;
            }
            return;
        }
        this.f21793Q0 = -9223372036854775807L;
    }

    /* renamed from: b */
    public boolean mo24379b() {
        return getVisibility() == 0;
    }

    /* renamed from: c */
    public void mo24380c() {
        if (!mo24379b()) {
            setVisibility(0);
            C9409d dVar = this.f21780D0;
            if (dVar != null) {
                dVar.mo24409a(getVisibility());
            }
            m28858g();
            m28856f();
        }
        m28850d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28842b(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (!currentTimeline.mo22671c() && !player.isPlayingAd()) {
            int currentWindowIndex = player.getCurrentWindowIndex();
            int nextWindowIndex = player.getNextWindowIndex();
            if (nextWindowIndex != -1) {
                m28839a(player, nextWindowIndex, -9223372036854775807L);
            } else if (currentTimeline.mo22663a(currentWindowIndex, this.f21815m0).f18400b) {
                m28839a(player, currentWindowIndex, -9223372036854775807L);
            }
        }
    }

    /* renamed from: a */
    private static int m28831a(TypedArray typedArray, int i) {
        return typedArray.getInt(C9416n.PlayerControlView_repeat_toggle_modes, i);
    }

    /* renamed from: a */
    public void mo24377a() {
        if (mo24379b()) {
            setVisibility(8);
            C9409d dVar = this.f21780D0;
            if (dVar != null) {
                dVar.mo24409a(getVisibility());
            }
            removeCallbacks(this.f21816n0);
            removeCallbacks(this.f21817o0);
            this.f21793Q0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28851d(Player player) {
        if (player.isCurrentWindowSeekable() && this.f21787K0 > 0) {
            m28833a(player, player.getCurrentPosition() - ((long) this.f21787K0));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1.f18399a == false) goto L_0x0035;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28846c(com.google.android.exoplayer2.Player r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.Timeline r0 = r7.getCurrentTimeline()
            boolean r1 = r0.mo22671c()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r7.isPlayingAd()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r7.getCurrentWindowIndex()
            com.google.android.exoplayer2.Timeline$c r2 = r6.f21815m0
            r0.mo22663a(r1, r2)
            int r0 = r7.getPreviousWindowIndex()
            r1 = -1
            if (r0 == r1) goto L_0x003e
            long r1 = r7.getCurrentPosition()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0035
            com.google.android.exoplayer2.Timeline$c r1 = r6.f21815m0
            boolean r2 = r1.f18400b
            if (r2 == 0) goto L_0x003e
            boolean r1 = r1.f18399a
            if (r1 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.m28839a(r7, r0, r1)
            goto L_0x0043
        L_0x003e:
            r0 = 0
            r6.m28833a(r7, r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.C9405g.m28846c(com.google.android.exoplayer2.Player):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28843b(Player player, long j) {
        int i;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.f21785I0 && !currentTimeline.mo22671c()) {
            int b = currentTimeline.mo22667b();
            i = 0;
            while (true) {
                long c = currentTimeline.mo22663a(i, this.f21815m0).mo22692c();
                if (j < c) {
                    break;
                } else if (i == b - 1) {
                    j = c;
                    break;
                } else {
                    j -= c;
                    i++;
                }
            }
        } else {
            i = player.getCurrentWindowIndex();
        }
        if (!m28839a(player, i, j)) {
            m28864j();
        }
    }

    /* renamed from: a */
    private void m28837a(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? this.f21826x0 : this.f21827y0);
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28832a(Player player) {
        if (player.isCurrentWindowSeekable() && this.f21788L0 > 0) {
            m28833a(player, player.getCurrentPosition() + ((long) this.f21788L0));
        }
    }

    /* renamed from: a */
    private void m28833a(Player player, long j) {
        m28839a(player, player.getCurrentWindowIndex(), j);
    }

    /* renamed from: a */
    private boolean m28839a(Player player, int i, long j) {
        long duration = player.getDuration();
        if (duration != -9223372036854775807L) {
            j = Math.min(j, duration);
        }
        return this.f21779C0.mo23264a(player, i, Math.max(j, 0));
    }

    /* renamed from: a */
    public boolean mo24378a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f21778B0 == null || !m28838a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                m28832a(this.f21778B0);
            } else if (keyCode == 89) {
                m28851d(this.f21778B0);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    C8898s sVar = this.f21779C0;
                    Player player = this.f21778B0;
                    sVar.mo23267c(player, !player.getPlayWhenReady());
                } else if (keyCode == 87) {
                    m28842b(this.f21778B0);
                } else if (keyCode == 88) {
                    m28846c(this.f21778B0);
                } else if (keyCode == 126) {
                    this.f21779C0.mo23267c(this.f21778B0, true);
                } else if (keyCode == 127) {
                    this.f21779C0.mo23267c(this.f21778B0, false);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m28840a(Timeline timeline, C8670c cVar) {
        if (timeline.mo22667b() > 100) {
            return false;
        }
        int b = timeline.mo22667b();
        for (int i = 0; i < b; i++) {
            if (timeline.mo22663a(i, cVar).f18404f == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }
}
