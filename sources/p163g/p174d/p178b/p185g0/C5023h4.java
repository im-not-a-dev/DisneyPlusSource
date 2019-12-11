package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/player/delegates/HideViewsWhileSeekingDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "views", "", "Landroid/view/View;", "controlAnimationHideDuration", "", "controlAnimationShowDuration", "events", "Lcom/bamtech/player/PlayerEvents;", "(Ljava/util/List;JJLcom/bamtech/player/PlayerEvents;)V", "doAnimation", "", "newAlpha", "", "duration", "onSeekBarTouched", "touched", "", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.h4 */
/* compiled from: HideViewsWhileSeekingDelegate.kt */
public final class C5023h4 implements C5271z3 {

    /* renamed from: U */
    private final long f12296U;

    /* renamed from: V */
    private final long f12297V;

    /* renamed from: c */
    private final List<View> f12298c;

    /* renamed from: g.d.b.g0.h4$a */
    /* compiled from: HideViewsWhileSeekingDelegate.kt */
    static final /* synthetic */ class C5024a extends C12879i implements Function1<Boolean, C13145v> {
        C5024a(C5023h4 h4Var) {
            super(1, h4Var);
        }

        /* renamed from: a */
        public final void mo16519a(boolean z) {
            ((C5023h4) this.receiver).mo16518a(z);
        }

        public final String getName() {
            return "onSeekBarTouched";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5023h4.class);
        }

        public final String getSignature() {
            return "onSeekBarTouched(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16519a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    public C5023h4(List<? extends View> list, long j, long j2, C5300m mVar) {
        this.f12298c = list;
        this.f12296U = j;
        this.f12297V = j2;
        List<View> list2 = this.f12298c;
        if (list2 != null && !list2.isEmpty()) {
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5031i4<Object>(new C5024a(this)));
        }
    }

    /* renamed from: a */
    public final void mo16518a(boolean z) {
        if (z) {
            m17309a(0.0f, this.f12296U);
        } else {
            m17309a(1.0f, this.f12297V);
        }
    }

    /* renamed from: a */
    private final void m17309a(float f, long j) {
        List<View> list = this.f12298c;
        if (list != null) {
            for (View animate : list) {
                animate.animate().setDuration(j).alpha(f);
            }
        }
    }
}
