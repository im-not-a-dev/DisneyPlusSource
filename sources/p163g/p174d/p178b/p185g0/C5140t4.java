package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams.Builder;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Rational;
import android.view.View;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5317r;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 ,2\u00020\u0001:\u0002,-B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0007J\b\u0010%\u001a\u00020\"H\u0003J\b\u0010&\u001a\u00020\"H\u0007J\b\u0010'\u001a\u00020\u0012H\u0007J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\"H\u0007J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0007J\b\u0010+\u001a\u00020\u0012H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, mo31007d2 = {"Lcom/bamtech/player/delegates/PipViewDelegate;", "Lcom/bamtech/player/delegates/ClickableDelegate;", "view", "Landroid/view/View;", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "activity", "Landroid/app/Activity;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;Lcom/bamtech/player/VideoPlayer;Landroid/app/Activity;Lcom/bamtech/player/PlayerEvents;)V", "pipBroadcastReceiver", "Lcom/bamtech/player/delegates/PipViewDelegate$PipBroadcastReceiver;", "getPipBroadcastReceiver", "()Lcom/bamtech/player/delegates/PipViewDelegate$PipBroadcastReceiver;", "setPipBroadcastReceiver", "(Lcom/bamtech/player/delegates/PipViewDelegate$PipBroadcastReceiver;)V", "attachBroadcastReceiver", "", "detachBroadcastReceiver", "getActionButtons", "", "Landroid/app/RemoteAction;", "getActionForCodes", "requestCode", "", "controlCode", "buttonResId", "buttonText", "", "getPauseButtonAction", "getPlayButtonAction", "handleBroadcastReceiver", "inPipMode", "", "handleControls", "isInPipMode", "hasPipPermission", "isMinimizeEnabled", "minimizeWindow", "onPlaybackChanged", "playing", "updatePipMode", "updatePipView", "Companion", "PipBroadcastReceiver", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.t4 */
/* compiled from: PipViewDelegate.kt */
public final class C5140t4 extends C5170v3 {

    /* renamed from: X */
    private C5145e f12457X;

    /* renamed from: Y */
    private final C5326w f12458Y;

    /* renamed from: Z */
    private final Activity f12459Z;

    /* renamed from: g.d.b.g0.t4$a */
    /* compiled from: PipViewDelegate.kt */
    static final class C5141a<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5140t4 f12460c;

        C5141a(C5140t4 t4Var) {
            this.f12460c = t4Var;
        }

        public final void accept(Object obj) {
            this.f12460c.mo16640h();
        }
    }

    /* renamed from: g.d.b.g0.t4$b */
    /* compiled from: PipViewDelegate.kt */
    static final /* synthetic */ class C5142b extends C12879i implements Function1<Boolean, C13145v> {
        C5142b(C5140t4 t4Var) {
            super(1, t4Var);
        }

        /* renamed from: a */
        public final void mo16642a(boolean z) {
            ((C5140t4) this.receiver).mo16634c(z);
        }

        public final String getName() {
            return "onPlaybackChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5140t4.class);
        }

        public final String getSignature() {
            return "onPlaybackChanged(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16642a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t4$c */
    /* compiled from: PipViewDelegate.kt */
    static final /* synthetic */ class C5143c extends C12879i implements Function1<Boolean, C13145v> {
        C5143c(C5140t4 t4Var) {
            super(1, t4Var);
        }

        /* renamed from: a */
        public final void mo16643a(boolean z) {
            ((C5140t4) this.receiver).mo16636d(z);
        }

        public final String getName() {
            return "updatePipMode";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5140t4.class);
        }

        public final String getSignature() {
            return "updatePipMode(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16643a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.t4$d */
    /* compiled from: PipViewDelegate.kt */
    public static final class C5144d {
        private C5144d() {
        }

        public /* synthetic */ C5144d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.d.b.g0.t4$e */
    /* compiled from: PipViewDelegate.kt */
    public static final class C5145e extends BroadcastReceiver {

        /* renamed from: a */
        private final C5326w f12461a;

        public C5145e(C5326w wVar) {
            this.f12461a = wVar;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if (!(!Intrinsics.areEqual((Object) "media_control", (Object) intent.getAction()))) {
                    int intExtra = intent.getIntExtra("control_type", 0);
                    if (intExtra == 1) {
                        this.f12461a.mo7598Y();
                    } else if (intExtra == 2) {
                        this.f12461a.mo7611b();
                    }
                }
            }
        }
    }

    static {
        new C5144d(null);
    }

    public C5140t4(View view, C5326w wVar, Activity activity, C5300m mVar) {
        super(view, mVar);
        this.f12458Y = wVar;
        this.f12459Z = activity;
        if (mo16639g()) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5141a<Object>(this));
            mVar.mo17030f().mo16903g(this.f12488V);
            mVar.mo17014b0().mo30192f((Consumer<? super T>) new C5164u4<Object>(new C5142b(this)));
            mVar.mo17002a0().mo30192f((Consumer<? super T>) new C5164u4<Object>(new C5143c(this)));
            return;
        }
        C5311f.m17965a(view, 8);
    }

    /* renamed from: j */
    private final boolean m17444j() {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        Object systemService = this.f12459Z.getSystemService("appops");
        if (systemService != null) {
            if (((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f12459Z.getPackageName()) == 0) {
                z = true;
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.AppOpsManager");
    }

    /* renamed from: a */
    public final void mo16630a(boolean z) {
        if (z) {
            mo16631b();
        } else {
            mo16633c();
        }
    }

    /* renamed from: b */
    public final void mo16632b(boolean z) {
        if (!this.f12458Y.mo7609a() && !z) {
            this.f12487U.mo16972T0();
        }
    }

    /* renamed from: c */
    public final void mo16634c(boolean z) {
        mo16641i();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public final void mo16636d(boolean z) {
        if (z && !this.f12459Z.isFinishing()) {
            mo16641i();
        }
        mo16630a(z);
        mo16632b(z);
    }

    /* renamed from: e */
    public final RemoteAction mo16637e() {
        return mo16629a(20, 2, C5317r.ic_icon_pause, "Pause");
    }

    /* renamed from: f */
    public final RemoteAction mo16638f() {
        return mo16629a(10, 1, C5317r.ic_icon_play, "Play");
    }

    /* renamed from: g */
    public final boolean mo16639g() {
        return this.f12489W != null && VERSION.SDK_INT >= 26 && this.f12459Z.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && m17444j();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public final void mo16640h() {
        this.f12459Z.enterPictureInPictureMode();
        this.f12487U.mo16970S0();
    }

    /* renamed from: i */
    public final void mo16641i() {
        Builder builder = new Builder();
        builder.setAspectRatio(new Rational(this.f12458Y.mo7633n().x, this.f12458Y.mo7633n().y)).setActions(mo16635d());
        this.f12459Z.setPictureInPictureParams(builder.build());
    }

    /* renamed from: c */
    public final void mo16633c() {
        this.f12459Z.unregisterReceiver(this.f12457X);
        this.f12457X = null;
    }

    /* renamed from: a */
    public final RemoteAction mo16629a(int i, int i2, int i3, String str) {
        return new RemoteAction(Icon.createWithResource(this.f12459Z, i3), str, str, PendingIntent.getBroadcast(this.f12459Z, i, new Intent("media_control").putExtra("control_type", i2), 0));
    }

    /* renamed from: b */
    public final void mo16631b() {
        if (this.f12457X == null) {
            this.f12457X = new C5145e(this.f12458Y);
        }
        this.f12459Z.registerReceiver(this.f12457X, new IntentFilter("media_control"));
    }

    /* renamed from: d */
    public final List<RemoteAction> mo16635d() {
        RemoteAction remoteAction;
        if (this.f12458Y.mo7609a()) {
            remoteAction = mo16637e();
        } else {
            remoteAction = mo16638f();
        }
        return C13183n.m40498a(remoteAction);
    }
}
