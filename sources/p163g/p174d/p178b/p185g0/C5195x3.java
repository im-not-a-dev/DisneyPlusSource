package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p135s.C4127b0;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5312n;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0007J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0012H\u0007J\b\u0010\u001d\u001a\u00020\u0019H\u0007J\u0017\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0019R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/player/delegates/ClosedCaptionViewDelegate;", "Lcom/bamtech/player/delegates/ClickableDelegate;", "view", "Landroid/view/View;", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "preferences", "Lcom/bamtech/player/PlayerPreferences;", "(Landroid/view/View;Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;Lcom/bamtech/player/PlayerPreferences;)V", "previousLanguage", "", "getPreviousLanguage", "()Ljava/lang/String;", "setPreviousLanguage", "(Ljava/lang/String;)V", "previousSDHState", "", "getPreviousSDHState", "()Ljava/lang/Boolean;", "setPreviousSDHState", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "onCaptionsExist", "", "captionsExist", "onClosedCaptionChanged", "closedCaptionsEnabled", "onClosedCaptionClicked", "onClosedCaptionsKeyDown", "keyCode", "", "(Ljava/lang/Integer;)V", "recordClosedCaptionState", "restoreClosedCaptionState", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.x3 */
/* compiled from: ClosedCaptionViewDelegate.kt */
public final class C5195x3 extends C5170v3 {

    /* renamed from: X */
    private Boolean f12521X;

    /* renamed from: Y */
    private String f12522Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C5326w f12523Z;

    /* renamed from: a0 */
    private final C5312n f12524a0;

    /* renamed from: g.d.b.g0.x3$a */
    /* compiled from: ClosedCaptionViewDelegate.kt */
    static final /* synthetic */ class C5196a extends C12879i implements Function1<Integer, C13145v> {
        C5196a(C5195x3 x3Var) {
            super(1, x3Var);
        }

        /* renamed from: a */
        public final void mo16694a(Integer num) {
            ((C5195x3) this.receiver).mo16688a(num);
        }

        public final String getName() {
            return "onClosedCaptionsKeyDown";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5195x3.class);
        }

        public final String getSignature() {
            return "onClosedCaptionsKeyDown(Ljava/lang/Integer;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16694a((Integer) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.x3$b */
    /* compiled from: ClosedCaptionViewDelegate.kt */
    static final /* synthetic */ class C5197b extends C12879i implements Function1<Boolean, C13145v> {
        C5197b(C5195x3 x3Var) {
            super(1, x3Var);
        }

        /* renamed from: a */
        public final void mo16695a(boolean z) {
            ((C5195x3) this.receiver).mo16691b(z);
        }

        public final String getName() {
            return "onClosedCaptionChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5195x3.class);
        }

        public final String getSignature() {
            return "onClosedCaptionChanged(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16695a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.x3$c */
    /* compiled from: ClosedCaptionViewDelegate.kt */
    static final /* synthetic */ class C5198c extends C12879i implements Function1<Boolean, C13145v> {
        C5198c(C5195x3 x3Var) {
            super(1, x3Var);
        }

        /* renamed from: a */
        public final void mo16696a(boolean z) {
            ((C5195x3) this.receiver).mo16689a(z);
        }

        public final String getName() {
            return "onCaptionsExist";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5195x3.class);
        }

        public final String getSignature() {
            return "onCaptionsExist(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16696a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.x3$d */
    /* compiled from: ClosedCaptionViewDelegate.kt */
    static final class C5199d<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5195x3 f12525c;

        C5199d(C5195x3 x3Var) {
            this.f12525c = x3Var;
        }

        public final void accept(Object obj) {
            this.f12525c.mo16690b();
        }
    }

    /* renamed from: g.d.b.g0.x3$e */
    /* compiled from: ClosedCaptionViewDelegate.kt */
    static final class C5200e<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C5195x3 f12526c;

        C5200e(C5195x3 x3Var) {
            this.f12526c = x3Var;
        }

        public final boolean apply(Object obj) {
            return this.f12526c.f12523Z.mo7639t();
        }
    }

    @SuppressLint({"CheckResult"})
    public C5195x3(View view, C5326w wVar, C5300m mVar, C5312n nVar) {
        super(view, mVar);
        this.f12523Z = wVar;
        this.f12524a0 = nVar;
        mVar.mo17000a(175);
        mVar.mo16951J().mo30192f((Consumer<? super T>) new C5222y3<Object>(new C5196a(this)));
        if (view != null) {
            mVar.mo17070u().mo30192f((Consumer<? super T>) new C5222y3<Object>(new C5197b(this)));
            mVar.mo17068t().mo30192f((Consumer<? super T>) new C5222y3<Object>(new C5198c(this)));
            this.f12488V.mo30192f((Consumer<? super T>) new C5199d<Object>(this));
            mVar.mo17030f().mo16895c(this.f12488V.mo30193g(new C5200e(this)));
        }
    }

    /* renamed from: b */
    public final void mo16690b() {
        boolean z = !this.f12523Z.mo7639t();
        if (!z) {
            mo16692c();
        }
        this.f12524a0.mo17090a(z);
        this.f12523Z.mo7614b(z);
        if (z) {
            mo16693d();
        }
    }

    /* renamed from: c */
    public final void mo16692c() {
        this.f12522Y = this.f12523Z.mo7627h();
        this.f12521X = Boolean.valueOf(this.f12523Z.mo7636q());
    }

    /* renamed from: d */
    public final void mo16693d() {
        Boolean bool = this.f12521X;
        if (bool != null) {
            this.f12523Z.mo7608a(bool.booleanValue());
        }
        String str = this.f12522Y;
        if (str != null) {
            this.f12523Z.mo7613b(str);
        }
    }

    /* renamed from: a */
    public final void mo16688a(Integer num) {
        if (num != null && num.intValue() == 175) {
            mo16690b();
        }
    }

    /* renamed from: a */
    public final void mo16689a(boolean z) {
        View view = this.f12489W;
        if (view != null) {
            C4127b0.m14131b(view, z);
        }
    }

    /* renamed from: b */
    public final void mo16691b(boolean z) {
        View view = this.f12489W;
        if (view != null) {
            view.setActivated(z);
        }
    }
}
