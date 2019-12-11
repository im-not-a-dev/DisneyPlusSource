package p163g.p174d.p178b.p200z;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0004J\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0004J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0004J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0004J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/player/animation/ControlAnimation;", "", "durationHide", "", "durationShow", "(JJ)V", "getDurationHide", "()J", "getDurationShow", "animateIn", "", "containerView", "Landroid/view/View;", "animationGroup", "Lcom/bamtech/player/animation/ControlAnimation$AnimationGroup;", "animateOut", "fadeIn", "view", "visibility", "", "fadeOut", "measure", "setup", "AnimationGroup", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.z.b */
/* compiled from: ControlAnimation.kt */
public abstract class C5342b {

    /* renamed from: a */
    private final long f12822a;

    /* renamed from: b */
    private final long f12823b;

    /* renamed from: g.d.b.z.b$a */
    /* compiled from: ControlAnimation.kt */
    public interface C5343a {
        /* renamed from: a */
        C5342b mo17110a(long j, long j2);
    }

    /* renamed from: g.d.b.z.b$b */
    /* compiled from: ControlAnimation.kt */
    static final class C5344b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f12824c;

        C5344b(View view) {
            this.f12824c = view;
        }

        public final void run() {
            this.f12824c.setVisibility(8);
        }
    }

    /* renamed from: g.d.b.z.b$c */
    /* compiled from: ControlAnimation.kt */
    static final class C5345c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ int f12825U;

        /* renamed from: c */
        final /* synthetic */ View f12826c;

        C5345c(View view, int i) {
            this.f12826c = view;
            this.f12825U = i;
        }

        public final void run() {
            C5341a.m18082b(this.f12826c, this.f12825U, null, 4, null);
        }
    }

    /* renamed from: g.d.b.z.b$d */
    /* compiled from: ControlAnimation.kt */
    static final class C5346d implements Runnable {

        /* renamed from: U */
        final /* synthetic */ int f12827U;

        /* renamed from: c */
        final /* synthetic */ View f12828c;

        C5346d(View view, int i) {
            this.f12828c = view;
            this.f12827U = i;
        }

        public final void run() {
            C5341a.m18080a(this.f12828c, this.f12827U, null, 4, null);
        }
    }

    public C5342b(long j, long j2) {
        this.f12822a = j;
        this.f12823b = j2;
    }

    /* renamed from: a */
    public final long mo17102a() {
        return this.f12822a;
    }

    /* renamed from: a */
    public abstract void mo17106a(C5343a aVar);

    /* renamed from: b */
    public final long mo17107b() {
        return this.f12823b;
    }

    /* renamed from: a */
    public final void mo17103a(View view) {
        if (view != null && view.getHeight() == 0) {
            view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    /* renamed from: b */
    public void mo17109b(View view, C5343a aVar) {
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator duration = animate.setDuration(0);
                if (duration != null) {
                    ViewPropertyAnimator startDelay = duration.setStartDelay(this.f12822a);
                    if (startDelay != null) {
                        startDelay.withEndAction(new C5344b(view));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17108b(View view, int i) {
        if (view != null) {
            view.setAlpha(1.0f);
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(this.f12822a);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C5346d(view, i));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17105a(View view, C5343a aVar) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17104a(View view, int i) {
        if (view != null) {
            view.setAlpha(0.0f);
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(this.f12823b);
                    if (duration != null) {
                        ViewPropertyAnimator withStartAction = duration.withStartAction(new C5345c(view, i));
                        if (withStartAction != null) {
                            withStartAction.start();
                        }
                    }
                }
            }
        }
    }
}
