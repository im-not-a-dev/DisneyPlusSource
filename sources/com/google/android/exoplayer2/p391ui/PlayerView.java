package com.google.android.exoplayer2.p391ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.C8727i0;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.C8898s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p357h.C8750a;
import com.google.android.exoplayer2.metadata.p359j.C8758b;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p391ui.AspectRatioFrameLayout.C9392b;
import com.google.android.exoplayer2.p391ui.C9405g.C9409d;
import com.google.android.exoplayer2.p391ui.p392r.C9429g;
import com.google.android.exoplayer2.p391ui.p392r.C9430h;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9555l;
import com.google.android.exoplayer2.p394w0.C9601p;
import com.google.android.exoplayer2.p394w0.C9602q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.p378l0.C9206b;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
public class PlayerView extends FrameLayout implements C9206b {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final View f21683U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final View f21684V;

    /* renamed from: W */
    private final ImageView f21685W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final SubtitleView f21686a0;

    /* renamed from: b0 */
    private final View f21687b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AspectRatioFrameLayout f21688c;

    /* renamed from: c0 */
    private final TextView f21689c0;

    /* renamed from: d0 */
    private final C9405g f21690d0;

    /* renamed from: e0 */
    private final C9395b f21691e0;

    /* renamed from: f0 */
    private final FrameLayout f21692f0;

    /* renamed from: g0 */
    private final FrameLayout f21693g0;

    /* renamed from: h0 */
    private Player f21694h0;

    /* renamed from: i0 */
    private boolean f21695i0;

    /* renamed from: j0 */
    private boolean f21696j0;

    /* renamed from: k0 */
    private Drawable f21697k0;

    /* renamed from: l0 */
    private int f21698l0;

    /* renamed from: m0 */
    private boolean f21699m0;

    /* renamed from: n0 */
    private C9555l<? super ExoPlaybackException> f21700n0;

    /* renamed from: o0 */
    private CharSequence f21701o0;

    /* renamed from: p0 */
    private int f21702p0;

    /* renamed from: q0 */
    private boolean f21703q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public boolean f21704r0;

    /* renamed from: s0 */
    private boolean f21705s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f21706t0;

    /* renamed from: u0 */
    private boolean f21707u0;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$b */
    private final class C9395b implements EventListener, C9332k, C9602q, OnLayoutChangeListener, C9429g {
        private C9395b() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo7572a(int i, int i2) {
            C9601p.m29700a(this, i, i2);
        }

        /* renamed from: a */
        public void mo7574a(List<C9322b> list) {
            if (PlayerView.this.f21686a0 != null) {
                PlayerView.this.f21686a0.mo7574a(list);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo7578a(boolean z) {
            C8729j0.m25320a((EventListener) this, z);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m28739b((TextureView) view, PlayerView.this.f21706t0);
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
            PlayerView.this.m28756j();
            PlayerView.this.m28758k();
            if (!PlayerView.this.m28751g() || !PlayerView.this.f21704r0) {
                PlayerView.this.m28734a(false);
            } else {
                PlayerView.this.mo24269a();
            }
        }

        public void onPositionDiscontinuity(int i) {
            if (PlayerView.this.m28751g() && PlayerView.this.f21704r0) {
                PlayerView.this.mo24269a();
            }
        }

        public /* synthetic */ void onRepeatModeChanged(int i) {
            C8729j0.m25322b((EventListener) this, i);
        }

        public /* synthetic */ void onSeekProcessed() {
            C8729j0.m25314a(this);
        }

        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C8729j0.m25324c(this, z);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.m28755i();
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C8729j0.m25318a(this, timeline, obj, i);
        }

        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            PlayerView.this.m28743c(false);
        }

        /* renamed from: a */
        public void mo7573a(int i, int i2, int i3, float f) {
            float f2 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f) / ((float) i2);
            if (PlayerView.this.f21684V instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (PlayerView.this.f21706t0 != 0) {
                    PlayerView.this.f21684V.removeOnLayoutChangeListener(this);
                }
                PlayerView.this.f21706t0 = i3;
                if (PlayerView.this.f21706t0 != 0) {
                    PlayerView.this.f21684V.addOnLayoutChangeListener(this);
                }
                PlayerView.m28739b((TextureView) PlayerView.this.f21684V, PlayerView.this.f21706t0);
            }
            PlayerView playerView = PlayerView.this;
            playerView.mo24270a(f2, playerView.f21688c, PlayerView.this.f21684V);
        }

        /* renamed from: a */
        public void mo7571a() {
            if (PlayerView.this.f21683U != null) {
                PlayerView.this.f21683U.setVisibility(4);
            }
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private boolean m28735a(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m28758k() {
        TextView textView = this.f21689c0;
        if (textView != null) {
            CharSequence charSequence = this.f21701o0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f21689c0.setVisibility(0);
                return;
            }
            ExoPlaybackException exoPlaybackException = null;
            Player player = this.f21694h0;
            if (!(player == null || player.getPlaybackState() != 1 || this.f21700n0 == null)) {
                exoPlaybackException = this.f21694h0.getPlaybackError();
            }
            if (exoPlaybackException != null) {
                this.f21689c0.setText((CharSequence) this.f21700n0.mo24646a(exoPlaybackException).second);
                this.f21689c0.setVisibility(0);
            } else {
                this.f21689c0.setVisibility(8);
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f21694h0;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z = true;
        boolean z2 = m28735a(keyEvent.getKeyCode()) && this.f21695i0;
        if (z2 && !this.f21690d0.mo24379b()) {
            m28734a(true);
        } else if (mo24271a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m28734a(true);
        } else {
            if (z2) {
                m28734a(true);
            }
            z = false;
        }
        return z;
    }

    public View[] getAdOverlayViews() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f21693g0;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        C9405g gVar = this.f21690d0;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f21692f0;
        Assertions.m29297a(frameLayout, (Object) "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f21703q0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f21705s0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f21702p0;
    }

    public Drawable getDefaultArtwork() {
        return this.f21697k0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f21693g0;
    }

    public Player getPlayer() {
        return this.f21694h0;
    }

    public int getResizeMode() {
        Assertions.checkState(this.f21688c != null);
        return this.f21688c.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f21686a0;
    }

    public boolean getUseArtwork() {
        return this.f21696j0;
    }

    public boolean getUseController() {
        return this.f21695i0;
    }

    public View getVideoSurfaceView() {
        return this.f21684V;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f21695i0 || this.f21694h0 == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21707u0 = true;
            return true;
        } else if (action != 1 || !this.f21707u0) {
            return false;
        } else {
            this.f21707u0 = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f21695i0 || this.f21694h0 == null) {
            return false;
        }
        m28734a(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return m28755i();
    }

    public void setAspectRatioListener(C9392b bVar) {
        Assertions.checkState(this.f21688c != null);
        this.f21688c.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(C8898s sVar) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setControlDispatcher(sVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f21703q0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f21704r0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21705s0 = z;
    }

    public void setControllerShowTimeoutMs(int i) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21702p0 = i;
        if (this.f21690d0.mo24379b()) {
            mo24274d();
        }
    }

    public void setControllerVisibilityListener(C9409d dVar) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setVisibilityListener(dVar);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        Assertions.checkState(this.f21689c0 != null);
        this.f21701o0 = charSequence;
        m28758k();
    }

    @Deprecated
    public void setDefaultArtwork(Bitmap bitmap) {
        Drawable drawable;
        if (bitmap == null) {
            drawable = null;
        } else {
            drawable = new BitmapDrawable(getResources(), bitmap);
        }
        setDefaultArtwork(drawable);
    }

    public void setErrorMessageProvider(C9555l<? super ExoPlaybackException> lVar) {
        if (this.f21700n0 != lVar) {
            this.f21700n0 = lVar;
            m28758k();
        }
    }

    public void setFastForwardIncrementMs(int i) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f21699m0 != z) {
            this.f21699m0 = z;
            m28743c(false);
        }
    }

    public void setPlaybackPreparer(C8727i0 i0Var) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setPlaybackPreparer(i0Var);
    }

    public void setPlayer(Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m29299a(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.f21694h0;
        if (player2 != player) {
            if (player2 != null) {
                player2.removeListener(this.f21691e0);
                VideoComponent videoComponent = this.f21694h0.getVideoComponent();
                if (videoComponent != null) {
                    videoComponent.mo22632b((C9602q) this.f21691e0);
                    View view = this.f21684V;
                    if (view instanceof TextureView) {
                        videoComponent.mo22624a((TextureView) view);
                    } else if (view instanceof C9430h) {
                        ((C9430h) view).setVideoComponent(null);
                    } else if (view instanceof SurfaceView) {
                        videoComponent.mo22629b((SurfaceView) view);
                    }
                }
                TextComponent textComponent = this.f21694h0.getTextComponent();
                if (textComponent != null) {
                    textComponent.mo22620a(this.f21691e0);
                }
            }
            this.f21694h0 = player;
            if (this.f21695i0) {
                this.f21690d0.setPlayer(player);
            }
            SubtitleView subtitleView = this.f21686a0;
            if (subtitleView != null) {
                subtitleView.setCues(null);
            }
            m28756j();
            m28758k();
            m28743c(true);
            if (player != null) {
                VideoComponent videoComponent2 = player.getVideoComponent();
                if (videoComponent2 != null) {
                    View view2 = this.f21684V;
                    if (view2 instanceof TextureView) {
                        videoComponent2.mo22630b((TextureView) view2);
                    } else if (view2 instanceof C9430h) {
                        ((C9430h) view2).setVideoComponent(videoComponent2);
                    } else if (view2 instanceof SurfaceView) {
                        videoComponent2.mo22623a((SurfaceView) view2);
                    }
                    videoComponent2.mo22626a((C9602q) this.f21691e0);
                }
                TextComponent textComponent2 = player.getTextComponent();
                if (textComponent2 != null) {
                    textComponent2.mo22621b(this.f21691e0);
                }
                player.addListener(this.f21691e0);
                m28734a(false);
            } else {
                mo24269a();
            }
        }
    }

    public void setRepeatToggleModes(int i) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        Assertions.checkState(this.f21688c != null);
        this.f21688c.setResizeMode(i);
    }

    public void setRewindIncrementMs(int i) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setRewindIncrementMs(i);
    }

    @Deprecated
    public void setShowBuffering(boolean z) {
        setShowBuffering(z ? 1 : 0);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setShowMultiWindowTimeBar(z);
    }

    public void setShowShuffleButton(boolean z) {
        Assertions.checkState(this.f21690d0 != null);
        this.f21690d0.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f21683U;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        Assertions.checkState(!z || this.f21685W != null);
        if (this.f21696j0 != z) {
            this.f21696j0 = z;
            m28743c(false);
        }
    }

    public void setUseController(boolean z) {
        Assertions.checkState(!z || this.f21690d0 != null);
        if (this.f21695i0 != z) {
            this.f21695i0 = z;
            if (z) {
                this.f21690d0.setPlayer(this.f21694h0);
            } else {
                C9405g gVar = this.f21690d0;
                if (gVar != null) {
                    gVar.mo24377a();
                    this.f21690d0.setPlayer(null);
                }
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f21684V;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m28747e() {
        View view = this.f21683U;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m28749f() {
        ImageView imageView = this.f21685W;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f21685W.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m28751g() {
        Player player = this.f21694h0;
        return player != null && player.isPlayingAd() && this.f21694h0.getPlayWhenReady();
    }

    /* renamed from: h */
    private boolean m28753h() {
        Player player = this.f21694h0;
        boolean z = true;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        if (!this.f21703q0 || !(playbackState == 1 || playbackState == 4 || !this.f21694h0.getPlayWhenReady())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m28755i() {
        if (!this.f21695i0 || this.f21694h0 == null) {
            return false;
        }
        if (!this.f21690d0.mo24379b()) {
            m28734a(true);
        } else if (this.f21705s0) {
            this.f21690d0.mo24377a();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4.f21694h0.getPlayWhenReady() == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28756j() {
        /*
            r4 = this;
            android.view.View r0 = r4.f21687b0
            if (r0 == 0) goto L_0x002b
            com.google.android.exoplayer2.Player r0 = r4.f21694h0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.getPlaybackState()
            r3 = 2
            if (r0 != r3) goto L_0x0020
            int r0 = r4.f21698l0
            if (r0 == r3) goto L_0x0021
            if (r0 != r1) goto L_0x0020
            com.google.android.exoplayer2.Player r0 = r4.f21694h0
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            android.view.View r0 = r4.f21687b0
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 8
        L_0x0028:
            r0.setVisibility(r2)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p391ui.PlayerView.m28756j():void");
    }

    /* renamed from: c */
    public void mo24273c() {
        View view = this.f21684V;
        if (view instanceof C9430h) {
            ((C9430h) view).onResume();
        }
    }

    /* renamed from: d */
    public void mo24274d() {
        m28741b(m28753h());
    }

    public void setShowBuffering(int i) {
        if (this.f21698l0 != i) {
            this.f21698l0 = i;
            m28756j();
        }
    }

    /* JADX INFO: finally extract failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        super(context, attributeSet, i);
        if (isInEditMode()) {
            this.f21688c = null;
            this.f21683U = null;
            this.f21684V = null;
            this.f21685W = null;
            this.f21686a0 = null;
            this.f21687b0 = null;
            this.f21689c0 = null;
            this.f21690d0 = null;
            this.f21691e0 = null;
            this.f21692f0 = null;
            this.f21693g0 = null;
            ImageView imageView = new ImageView(context2);
            if (Util.SDK_INT >= 23) {
                m28738b(getResources(), imageView);
            } else {
                m28729a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = C9414l.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C9416n.PlayerView, 0, 0);
            try {
                z4 = obtainStyledAttributes.hasValue(C9416n.PlayerView_shutter_background_color);
                i5 = obtainStyledAttributes.getColor(C9416n.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C9416n.PlayerView_player_layout_id, i8);
                z3 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_use_artwork, true);
                i4 = obtainStyledAttributes.getResourceId(C9416n.PlayerView_default_artwork, 0);
                boolean z8 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_use_controller, true);
                i3 = obtainStyledAttributes.getInt(C9416n.PlayerView_surface_type, 1);
                i2 = obtainStyledAttributes.getInt(C9416n.PlayerView_resize_mode, 0);
                int i9 = obtainStyledAttributes.getInt(C9416n.PlayerView_show_timeout, 5000);
                boolean z9 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_hide_on_touch, true);
                boolean z10 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_auto_show, true);
                int i10 = resourceId;
                i7 = obtainStyledAttributes.getInteger(C9416n.PlayerView_show_buffering, 0);
                boolean z11 = z9;
                this.f21699m0 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_keep_content_on_player_reset, this.f21699m0);
                boolean z12 = obtainStyledAttributes.getBoolean(C9416n.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z5 = z10;
                z = z8;
                z2 = z12;
                i6 = i9;
                i8 = i10;
                z6 = z11;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z6 = true;
            i7 = 0;
            i6 = 5000;
            z5 = true;
            z4 = false;
            i5 = 0;
            z3 = true;
            i4 = 0;
            z2 = true;
            i3 = 1;
            i2 = 0;
            z = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        this.f21691e0 = new C9395b();
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        this.f21688c = (AspectRatioFrameLayout) findViewById(C9412j.exo_content_frame);
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f21688c;
        if (aspectRatioFrameLayout != null) {
            m28732a(aspectRatioFrameLayout, i2);
        }
        this.f21683U = findViewById(C9412j.exo_shutter);
        View view = this.f21683U;
        if (view != null && z4) {
            view.setBackgroundColor(i5);
        }
        if (this.f21688c == null || i3 == 0) {
            this.f21684V = null;
        } else {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f21684V = new TextureView(context2);
            } else if (i3 != 3) {
                this.f21684V = new SurfaceView(context2);
            } else {
                C9430h hVar = new C9430h(context2);
                hVar.setSingleTapListener(this.f21691e0);
                this.f21684V = hVar;
            }
            this.f21684V.setLayoutParams(layoutParams);
            this.f21688c.addView(this.f21684V, 0);
        }
        this.f21692f0 = (FrameLayout) findViewById(C9412j.exo_ad_overlay);
        this.f21693g0 = (FrameLayout) findViewById(C9412j.exo_overlay);
        this.f21685W = (ImageView) findViewById(C9412j.exo_artwork);
        this.f21696j0 = z3 && this.f21685W != null;
        if (i4 != 0) {
            this.f21697k0 = C4025a.m13798c(getContext(), i4);
        }
        this.f21686a0 = (SubtitleView) findViewById(C9412j.exo_subtitles);
        SubtitleView subtitleView = this.f21686a0;
        if (subtitleView != null) {
            subtitleView.mo24320a();
            this.f21686a0.mo24322b();
        }
        this.f21687b0 = findViewById(C9412j.exo_buffering);
        View view2 = this.f21687b0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.f21698l0 = i7;
        this.f21689c0 = (TextView) findViewById(C9412j.exo_error_message);
        TextView textView = this.f21689c0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C9405g gVar = (C9405g) findViewById(C9412j.exo_controller);
        View findViewById = findViewById(C9412j.exo_controller_placeholder);
        if (gVar != null) {
            this.f21690d0 = gVar;
            z7 = false;
        } else if (findViewById != null) {
            z7 = false;
            this.f21690d0 = new C9405g(context2, null, 0, attributeSet2);
            this.f21690d0.setId(C9412j.exo_controller);
            this.f21690d0.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(this.f21690d0, indexOfChild);
        } else {
            z7 = false;
            this.f21690d0 = null;
        }
        if (this.f21690d0 == null) {
            i6 = 0;
        }
        this.f21702p0 = i6;
        this.f21705s0 = z6;
        this.f21703q0 = z5;
        this.f21704r0 = z2;
        if (z && this.f21690d0 != null) {
            z7 = true;
        }
        this.f21695i0 = z7;
        mo24269a();
    }

    /* renamed from: b */
    public void mo24272b() {
        View view = this.f21684V;
        if (view instanceof C9430h) {
            ((C9430h) view).onPause();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28743c(boolean z) {
        Player player = this.f21694h0;
        if (player == null || player.getCurrentTrackGroups().mo23529X()) {
            if (!this.f21699m0) {
                m28749f();
                m28747e();
            }
            return;
        }
        if (z && !this.f21699m0) {
            m28747e();
        }
        TrackSelectionArray currentTrackSelections = this.f21694h0.getCurrentTrackSelections();
        int i = 0;
        while (i < currentTrackSelections.f21167a) {
            if (this.f21694h0.getRendererType(i) != 2 || currentTrackSelections.mo24040a(i) == null) {
                i++;
            } else {
                m28749f();
                return;
            }
        }
        m28747e();
        if (this.f21696j0) {
            for (int i2 = 0; i2 < currentTrackSelections.f21167a; i2++) {
                C9311j a = currentTrackSelections.mo24040a(i2);
                if (a != null) {
                    int i3 = 0;
                    while (i3 < a.length()) {
                        Metadata metadata = a.mo24066a(i3).f18347Z;
                        if (metadata == null || !m28737a(metadata)) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    continue;
                }
            }
            if (m28736a(this.f21697k0)) {
                return;
            }
        }
        m28749f();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f21697k0 != drawable) {
            this.f21697k0 = drawable;
            m28743c(false);
        }
    }

    /* renamed from: a */
    public static void m28731a(Player player, PlayerView playerView, PlayerView playerView2) {
        if (playerView != playerView2) {
            if (playerView2 != null) {
                playerView2.setPlayer(player);
            }
            if (playerView != null) {
                playerView.setPlayer(null);
            }
        }
    }

    /* renamed from: b */
    private void m28741b(boolean z) {
        if (this.f21695i0) {
            this.f21690d0.setShowTimeoutMs(z ? 0 : this.f21702p0);
            this.f21690d0.mo24380c();
        }
    }

    /* renamed from: a */
    public boolean mo24271a(KeyEvent keyEvent) {
        return this.f21695i0 && this.f21690d0.mo24378a(keyEvent);
    }

    @TargetApi(23)
    /* renamed from: b */
    private static void m28738b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C9411i.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(C9410h.exo_edit_mode_background_color, null));
    }

    /* renamed from: a */
    public void mo24269a() {
        C9405g gVar = this.f21690d0;
        if (gVar != null) {
            gVar.mo24377a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28739b(TextureView textureView, int i) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (width == 0.0f || height == 0.0f || i == 0) {
            textureView.setTransform(null);
            return;
        }
        Matrix matrix = new Matrix();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        matrix.postRotate((float) i, f, f2);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        textureView.setTransform(matrix);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24270a(float f, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof C9430h) {
                f = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28734a(boolean z) {
        if ((!m28751g() || !this.f21704r0) && this.f21695i0) {
            boolean z2 = this.f21690d0.mo24379b() && this.f21690d0.getShowTimeoutMs() <= 0;
            boolean h = m28753h();
            if (z || z2 || h) {
                m28741b(h);
            }
        }
    }

    /* renamed from: a */
    private boolean m28737a(Metadata metadata) {
        byte[] bArr;
        int i;
        int i2 = 0;
        int i3 = -1;
        boolean z = false;
        while (i2 < metadata.mo22862X()) {
            C8737b a = metadata.mo22863a(i2);
            if (a instanceof C8758b) {
                C8758b bVar = (C8758b) a;
                bArr = bVar.f18601X;
                i = bVar.f18600W;
            } else if (a instanceof C8750a) {
                C8750a aVar = (C8750a) a;
                bArr = aVar.f18586a0;
                i = aVar.f18587c;
            } else {
                continue;
                i2++;
            }
            if (i3 == -1 || i == 3) {
                z = m28736a((Drawable) new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i3 = i;
                i2++;
            } else {
                i2++;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m28736a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                mo24270a(((float) intrinsicWidth) / ((float) intrinsicHeight), this.f21688c, (View) this.f21685W);
                this.f21685W.setImageDrawable(drawable);
                this.f21685W.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m28729a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C9411i.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C9410h.exo_edit_mode_background_color));
    }

    /* renamed from: a */
    private static void m28732a(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }
}
