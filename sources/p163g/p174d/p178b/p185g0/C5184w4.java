package p163g.p174d.p178b.p185g0;

import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/player/delegates/PlayerSpeedConrollerDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "()V", "previousLTriggerValue", "", "getPreviousLTriggerValue", "()F", "setPreviousLTriggerValue", "(F)V", "previousRTriggerValue", "getPreviousRTriggerValue", "setPreviousRTriggerValue", "endSeek", "", "void", "", "getSeekSpeedCount", "", "onFastForward", "onMotionEvent", "event", "Landroid/view/MotionEvent;", "onRewind", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.w4 */
/* compiled from: PlayerSpeedConrollerDelegate.kt */
public abstract class C5184w4 implements C5271z3 {

    /* renamed from: U */
    private float f12510U;

    /* renamed from: c */
    private float f12511c;

    /* renamed from: g.d.b.g0.w4$a */
    /* compiled from: PlayerSpeedConrollerDelegate.kt */
    public static final class C5185a {
        private C5185a() {
        }

        public /* synthetic */ C5185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5185a(null);
    }

    /* renamed from: a */
    public final void mo16683a(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(17);
        float axisValue2 = motionEvent.getAxisValue(18);
        float f = (float) 0;
        if (axisValue > f && axisValue2 == 0.0f && this.f12511c == 0.0f) {
            mo16490c(null);
        } else if (axisValue2 > f && axisValue == 0.0f && this.f12510U == 0.0f) {
            mo16487b(null);
        } else if (axisValue == 0.0f && axisValue2 == 0.0f) {
            mo16482a((Object) null);
        }
        this.f12511c = axisValue;
        this.f12510U = axisValue2;
    }

    /* renamed from: a */
    public abstract void mo16482a(Object obj);

    /* renamed from: b */
    public abstract void mo16487b(Object obj);

    /* renamed from: c */
    public abstract void mo16490c(Object obj);
}
