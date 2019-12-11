package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p195l0.C5298a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/player/delegates/SkipRecapViewDelegate;", "Lcom/bamtech/player/delegates/AbstractSkipViewDelegate;", "view", "Landroid/view/View;", "controlAnimationHideDuration", "", "controlAnimationShowDuration", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;JJLcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.i5 */
/* compiled from: SkipRecapViewDelegate.kt */
public final class C5032i5 extends C5094q3 {

    /* renamed from: g.d.b.g0.i5$a */
    /* compiled from: SkipRecapViewDelegate.kt */
    static final /* synthetic */ class C5033a extends C12879i implements Function1<C5298a, C13145v> {
        C5033a(C5032i5 i5Var) {
            super(1, i5Var);
        }

        /* renamed from: a */
        public final void mo16520a(C5298a aVar) {
            ((C5032i5) this.receiver).mo16575a(aVar);
        }

        public final String getName() {
            return "onSchedule";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5032i5.class);
        }

        public final String getSignature() {
            return "onSchedule(Lcom/bamtech/player/upnext/Schedule;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16520a((C5298a) obj);
            return C13145v.f29587a;
        }
    }

    @SuppressLint({"CheckResult"})
    public C5032i5(View view, long j, long j2, C5326w wVar, C5300m mVar) {
        super(view, j, j2, wVar, mVar);
        if (view != null) {
            mVar.mo17079y0().mo30192f((Consumer<? super T>) new C5040j5<Object>(new C5033a(this)));
            mVar.mo17030f().mo16917n(this.f12488V);
        }
    }
}
