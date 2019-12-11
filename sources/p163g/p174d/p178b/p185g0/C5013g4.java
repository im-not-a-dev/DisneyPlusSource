package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/player/delegates/HDMIBroadcastDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/content/Context;Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "getContext", "()Landroid/content/Context;", "getVideoPlayer", "()Lcom/bamtech/player/VideoPlayer;", "onReceive", "", "intent", "Landroid/content/Intent;", "registerReceiver", "unregisterReceiver", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.g4 */
/* compiled from: HDMIBroadcastDelegate.kt */
public final class C5013g4 extends BroadcastReceiver implements C5271z3 {

    /* renamed from: U */
    private final C5326w f12287U;

    /* renamed from: c */
    private final Context f12288c;

    /* renamed from: g.d.b.g0.g4$a */
    /* compiled from: HDMIBroadcastDelegate.kt */
    static final class C5014a<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C5013g4 f12289c;

        C5014a(C5013g4 g4Var) {
            this.f12289c = g4Var;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12289c.mo16512a();
        }
    }

    /* renamed from: g.d.b.g0.g4$b */
    /* compiled from: HDMIBroadcastDelegate.kt */
    static final class C5015b<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C5013g4 f12290c;

        C5015b(C5013g4 g4Var) {
            this.f12290c = g4Var;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12290c.mo16513b();
        }
    }

    public C5013g4(Context context, C5326w wVar, C5300m mVar) {
        this.f12288c = context;
        this.f12287U = wVar;
        mVar.mo16955L().mo30192f((Consumer<? super T>) new C5014a<Object>(this));
        mVar.mo16957M().mo30192f((Consumer<? super T>) new C5015b<Object>(this));
    }

    /* renamed from: a */
    public final void mo16512a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
        this.f12288c.registerReceiver(this, intentFilter);
    }

    /* renamed from: b */
    public final void mo16513b() {
        this.f12288c.unregisterReceiver(this);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -469300177 && action.equals("android.media.action.HDMI_AUDIO_PLUG") && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1) == 0) {
            this.f12287U.mo7611b();
        }
    }
}
