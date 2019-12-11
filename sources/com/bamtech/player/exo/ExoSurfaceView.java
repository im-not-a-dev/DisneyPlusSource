package com.bamtech.player.exo;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.bamtech.player.exo.scaling.ActiveAspectRatioFrameLayout;
import com.google.android.exoplayer2.p382u0.C9321a;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9333l.C9334a;
import com.google.android.exoplayer2.p391ui.SubtitleView;
import com.google.android.exoplayer2.p394w0.C9601p;
import com.google.android.exoplayer2.p394w0.C9602q;
import java.util.List;
import p163g.p174d.p178b.C5324u;
import p163g.p174d.p178b.p197x.p198a.C5327a;
import p163g.p174d.p178b.p197x.p198a.C5328b;
import p163g.p174d.p178b.p197x.p198a.C5329c;

@TargetApi(16)
public class ExoSurfaceView extends FrameLayout implements C5324u {

    /* renamed from: U */
    private int f5929U;

    /* renamed from: V */
    private SurfaceView f5930V;

    /* renamed from: W */
    private TextureView f5931W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public SubtitleView f5932a0;

    /* renamed from: b0 */
    private ActiveAspectRatioFrameLayout f5933b0;

    /* renamed from: c */
    private final C1701a f5934c;

    /* renamed from: c0 */
    private int f5935c0;

    /* renamed from: d0 */
    private boolean f5936d0;

    /* renamed from: e0 */
    private boolean f5937e0;

    /* renamed from: f0 */
    private int f5938f0;

    /* renamed from: g0 */
    private int f5939g0;

    /* renamed from: h0 */
    C9321a f5940h0;

    /* renamed from: com.bamtech.player.exo.ExoSurfaceView$a */
    public class C1701a implements C9602q, C9334a {
        public C1701a() {
        }

        /* renamed from: a */
        public void mo7571a() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo7572a(int i, int i2) {
            C9601p.m29700a(this, i, i2);
        }

        /* renamed from: a */
        public void mo7574a(List<C9322b> list) {
            ExoSurfaceView.this.f5932a0.mo7574a(list);
        }

        /* renamed from: a */
        public void mo7573a(int i, int i2, int i3, float f) {
            if (i2 != 0) {
                ExoSurfaceView.this.setAspectRatio((((float) i) * f) / ((float) i2));
            }
        }
    }

    public ExoSurfaceView(Context context) {
        this(context, null);
    }

    private LayoutParams getSurfaceViewLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: b */
    public void mo7558b() {
        this.f5933b0.setResizeMode(0);
    }

    /* renamed from: c */
    public boolean mo7559c() {
        return this.f5930V != null && this.f5936d0;
    }

    /* renamed from: d */
    public void mo7560d() {
        if (this.f5935c0 == 1) {
            this.f5931W = new TextureView(getContext());
            this.f5931W.setLayoutParams(getSurfaceViewLayoutParams());
            this.f5933b0.addView(this.f5931W, 0);
            return;
        }
        this.f5930V = new SurfaceView(getContext());
        this.f5930V.setLayoutParams(getSurfaceViewLayoutParams());
        this.f5930V.setSecure(this.f5936d0);
        this.f5933b0.addView(this.f5930V, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo7561e() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    public C1701a getComponentListener() {
        return this.f5934c;
    }

    public TextureView getTextureView() {
        return this.f5931W;
    }

    public SurfaceView getVideoSurfaceView() {
        return this.f5930V;
    }

    public float getViewAspectRatio() {
        return ((float) getWidth()) / ((float) getHeight());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            FrameLayout.inflate(getContext(), C5328b.view_exosurfaceview, this);
            this.f5933b0 = (ActiveAspectRatioFrameLayout) findViewById(C5327a.video_frame);
            this.f5932a0 = (SubtitleView) findViewById(C5327a.subtitles);
            this.f5933b0.setAspectRatio(1.7777778f);
            this.f5933b0.setResizeMode(this.f5929U);
            this.f5933b0.setEnableWidescreenDefaultDisplay(this.f5937e0);
            if (mo7561e()) {
                this.f5932a0.mo24320a();
                this.f5932a0.mo24322b();
            } else {
                this.f5932a0.setStyle(this.f5940h0);
            }
            mo7560d();
        }
    }

    public void setActiveAspectRatio(float f) {
        this.f5933b0.setActiveAspectRatio(f);
    }

    public void setAspectRatio(float f) {
        this.f5933b0.setAspectRatio(f);
    }

    public void setResizeMode(int i) {
        this.f5933b0.setResizeMode(i);
    }

    public void setScale(float f) {
        this.f5933b0.setScaleOverride(f);
    }

    public ExoSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m7849a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5329c.ExoSurfaceView, 0, 0);
        try {
            this.f5929U = obtainStyledAttributes.getInt(C5329c.ExoSurfaceView_exo_resize_mode, 0);
            this.f5935c0 = obtainStyledAttributes.getInt(C5329c.ExoSurfaceView_exo_surface_type, 0);
            this.f5936d0 = obtainStyledAttributes.getBoolean(C5329c.ExoSurfaceView_secure, false);
            this.f5937e0 = obtainStyledAttributes.getBoolean(C5329c.ExoSurfaceView_enable_widescreen_default_display, false);
            this.f5938f0 = obtainStyledAttributes.getColor(C5329c.ExoSurfaceView_caption_foreground_color, this.f5940h0.f21339a);
            this.f5939g0 = obtainStyledAttributes.getColor(C5329c.ExoSurfaceView_caption_background_color, this.f5940h0.f21340b);
            C9321a aVar = new C9321a(this.f5938f0, this.f5939g0, this.f5940h0.f21341c, this.f5940h0.f21342d, this.f5940h0.f21343e, this.f5940h0.f21344f);
            this.f5940h0 = aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ExoSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5934c = new C1701a();
        this.f5929U = 0;
        this.f5940h0 = C9321a.f21338g;
        if (attributeSet != null) {
            m7849a(context, attributeSet);
        }
    }

    /* renamed from: a */
    public void mo7557a(boolean z) {
        this.f5937e0 = z;
        this.f5933b0.setEnableWidescreenDefaultDisplay(z);
        if (!this.f5933b0.isInLayout()) {
            this.f5933b0.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo7556a() {
        this.f5933b0.setResizeMode(4);
    }
}
