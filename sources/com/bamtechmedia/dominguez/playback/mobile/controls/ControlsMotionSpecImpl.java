package com.bamtechmedia.dominguez.playback.mobile.controls;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.playback.C6270c;
import com.bamtechmedia.dominguez.playback.C6325d;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p122j.C4025a;
import p163g.p174d.p178b.C5313o;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0003J\r\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010#\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/mobile/controls/ControlsMotionSpecImpl;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "(Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;)V", "seekAnimator", "Landroid/animation/ValueAnimator;", "animatedHeightScaler", "", "seekBar", "Landroid/widget/SeekBar;", "initLevel", "", "maxLevel", "durationMillis", "", "createSeekbarThumbScaler", "isMarshmallowOrGreater", "", "isMarshmallowOrGreater$playback_release", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "percentScaled", "animatedFraction", "removeAnimator", "scaleSeekDown", "scaleSeekUp", "scaleThumbAndBar", "context", "Landroid/content/Context;", "seekDrawables", "Lcom/bamtechmedia/dominguez/playback/mobile/controls/ControlsMotionSpecImpl$SeekBarDrawables;", "percentOfOriginalSize", "setInitialThumbSize", "Companion", "SeekBarDrawables", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ControlsMotionSpecImpl.kt */
public final class ControlsMotionSpecImpl implements C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final SDK4ExoPlaybackEngine f14732U;

    /* renamed from: c */
    private ValueAnimator f14733c;

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$a */
    /* compiled from: ControlsMotionSpecImpl.kt */
    public static final class C6515a {
        private C6515a() {
        }

        public /* synthetic */ C6515a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$b */
    /* compiled from: ControlsMotionSpecImpl.kt */
    private static final class C6516b {

        /* renamed from: a */
        private final LayerDrawable f14734a;

        /* renamed from: b */
        private final GradientDrawable f14735b;

        /* renamed from: c */
        private final GradientDrawable f14736c;

        public C6516b(LayerDrawable layerDrawable, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
            this.f14734a = layerDrawable;
            this.f14735b = gradientDrawable;
            this.f14736c = gradientDrawable2;
        }

        /* renamed from: a */
        public final GradientDrawable mo19179a() {
            return this.f14735b;
        }

        /* renamed from: b */
        public final GradientDrawable mo19180b() {
            return this.f14736c;
        }

        /* renamed from: c */
        public final LayerDrawable mo19181c() {
            return this.f14734a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$c */
    /* compiled from: ControlsMotionSpecImpl.kt */
    static final class C6517c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ControlsMotionSpecImpl f14737a;

        /* renamed from: b */
        final /* synthetic */ Context f14738b;

        /* renamed from: c */
        final /* synthetic */ LayerDrawable f14739c;

        /* renamed from: d */
        final /* synthetic */ GradientDrawable f14740d;

        /* renamed from: e */
        final /* synthetic */ Drawable f14741e;

        /* renamed from: f */
        final /* synthetic */ float f14742f;

        /* renamed from: g */
        final /* synthetic */ float f14743g;

        C6517c(ControlsMotionSpecImpl controlsMotionSpecImpl, long j, Context context, LayerDrawable layerDrawable, GradientDrawable gradientDrawable, Drawable drawable, float f, float f2) {
            this.f14737a = controlsMotionSpecImpl;
            this.f14738b = context;
            this.f14739c = layerDrawable;
            this.f14740d = gradientDrawable;
            this.f14741e = drawable;
            this.f14742f = f;
            this.f14743g = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ControlsMotionSpecImpl controlsMotionSpecImpl = this.f14737a;
            Context context = this.f14738b;
            C12880j.m40222a((Object) context, "context");
            LayerDrawable layerDrawable = this.f14739c;
            GradientDrawable gradientDrawable = this.f14740d;
            Drawable drawable = this.f14741e;
            if (drawable != null) {
                C6516b bVar = new C6516b(layerDrawable, gradientDrawable, (GradientDrawable) drawable);
                C12880j.m40222a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    controlsMotionSpecImpl.m20274a(context, bVar, ((Float) animatedValue).floatValue(), this.f14737a.m20271a(this.f14742f, this.f14743g, valueAnimator.getAnimatedFraction()));
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C13142s("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$d */
    /* compiled from: ControlsMotionSpecImpl.kt */
    static final class C6518d<T> implements C11952h<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ControlsMotionSpecImpl f14744c;

        C6518d(ControlsMotionSpecImpl controlsMotionSpecImpl) {
            this.f14744c = controlsMotionSpecImpl;
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            return this.f14744c.mo19178b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$e */
    /* compiled from: ControlsMotionSpecImpl.kt */
    static final class C6519e<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ControlsMotionSpecImpl f14745c;

        C6519e(ControlsMotionSpecImpl controlsMotionSpecImpl) {
            this.f14745c = controlsMotionSpecImpl;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C5313o f = this.f14745c.f14732U.mo7541f();
            if (f != null) {
                SeekBar r = f.mo16823r();
                if (r != null) {
                    C12880j.m40222a((Object) bool, "wasTouched");
                    String str = "it";
                    if (bool.booleanValue()) {
                        ControlsMotionSpecImpl controlsMotionSpecImpl = this.f14745c;
                        C12880j.m40222a((Object) r, str);
                        controlsMotionSpecImpl.m20278b(r);
                        return;
                    }
                    ControlsMotionSpecImpl controlsMotionSpecImpl2 = this.f14745c;
                    C12880j.m40222a((Object) r, str);
                    controlsMotionSpecImpl2.m20275a(r);
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$f */
    /* compiled from: ControlsMotionSpecImpl.kt */
    static final /* synthetic */ class C6520f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6520f f14746c = new C6520f();

        C6520f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19185a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19185a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6515a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final float m20271a(float f, float f2, float f3) {
        return f2 >= f ? f3 : ((float) 1) - f3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$f] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.mobile.controls.a] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.TargetApi(23)
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20280d() {
        /*
            r4 = this;
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r0 = r4.f14732U
            g.d.b.m r0 = r0.mo7537b()
            io.reactivex.Observable r0 = r0.mo17067s0()
            com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$d r1 = new com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$d
            r1.<init>(r4)
            io.reactivex.Observable r0 = r0.mo30150a(r1)
            com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$e r1 = new com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$e
            r1.<init>(r4)
            com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl$f r2 = com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl.C6520f.f14746c
            if (r2 == 0) goto L_0x0022
            com.bamtechmedia.dominguez.playback.mobile.controls.a r3 = new com.bamtechmedia.dominguez.playback.mobile.controls.a
            r3.<init>(r2)
            r2 = r3
        L_0x0022:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo30157a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.mobile.controls.ControlsMotionSpecImpl.m20280d():void");
    }

    /* renamed from: f */
    private final void m20282f() {
        C5313o f = this.f14732U.mo7541f();
        if (f != null) {
            SeekBar r = f.mo16823r();
            if (r != null) {
                Drawable thumb = r.getThumb();
                if (thumb != null) {
                    ((LayerDrawable) thumb).setLevel(1);
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        m20281e();
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: e */
    private final void m20281e() {
        ValueAnimator valueAnimator = this.f14733c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        m20280d();
        m20282f();
    }

    /* renamed from: b */
    public final boolean mo19178b() {
        return VERSION.SDK_INT >= 23;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20275a(SeekBar seekBar) {
        mo19177a(seekBar, 2.0f, 1.0f, 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20278b(SeekBar seekBar) {
        mo19177a(seekBar, 1.0f, 2.0f, 100);
    }

    /* renamed from: a */
    public final void mo19177a(SeekBar seekBar, float f, float f2, long j) {
        Context context = seekBar.getContext();
        Drawable thumb = seekBar.getThumb();
        String str = "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable";
        if (thumb != null) {
            LayerDrawable layerDrawable = (LayerDrawable) thumb;
            Drawable progressDrawable = seekBar.getProgressDrawable();
            if (progressDrawable != null) {
                LayerDrawable layerDrawable2 = (LayerDrawable) progressDrawable;
                Drawable drawable = layerDrawable2.getDrawable(0);
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    Drawable drawable2 = layerDrawable2.getDrawable(1);
                    if (drawable2 != null) {
                        Drawable drawable3 = ((ClipDrawable) drawable2).getDrawable();
                        m20281e();
                        this.f14733c = ValueAnimator.ofFloat(new float[]{f, f2});
                        ValueAnimator valueAnimator = this.f14733c;
                        if (valueAnimator != null) {
                            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                            long j2 = j;
                            valueAnimator.setDuration(j2);
                            C6517c cVar = new C6517c(this, j2, context, layerDrawable, gradientDrawable, drawable3, f, f2);
                            valueAnimator.addUpdateListener(cVar);
                            valueAnimator.start();
                            return;
                        }
                        return;
                    }
                    throw new C13142s("null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
                }
                throw new C13142s("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20274a(Context context, C6516b bVar, float f, float f2) {
        bVar.mo19181c().setLevel((int) (((float) 1) + (((float) 9999) * f2)));
        int dimension = (int) (context.getResources().getDimension(C6325d.seek_progress_height) * f);
        if (bVar.mo19180b() != null) {
            bVar.mo19179a().setStroke(dimension, C4025a.m13788a(context, C6270c.vader_grey6));
            bVar.mo19180b().setStroke(dimension, C4025a.m13788a(context, C6270c.vader_white));
        }
    }
}
