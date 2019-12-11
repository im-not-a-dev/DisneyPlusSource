package p163g.p174d.p178b.p185g0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/player/delegates/ReconnectionDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/content/Context;Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "lifecycleStart", "", "lifecycleStop", "onReceive", "intent", "Landroid/content/Intent;", "register", "unregister", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.a5 */
/* compiled from: ReconnectionDelegate.kt */
public final class C4966a5 extends BroadcastReceiver implements C5271z3 {

    /* renamed from: U */
    private final C5326w f12203U;

    /* renamed from: c */
    private final Context f12204c;

    /* renamed from: g.d.b.g0.a5$a */
    /* compiled from: ReconnectionDelegate.kt */
    static final class C4967a<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C4966a5 f12205c;

        C4967a(C4966a5 a5Var) {
            this.f12205c = a5Var;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12205c.m17220c();
        }
    }

    /* renamed from: g.d.b.g0.a5$b */
    /* compiled from: ReconnectionDelegate.kt */
    static final class C4968b<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ C4966a5 f12206c;

        C4968b(C4966a5 a5Var) {
            this.f12206c = a5Var;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12206c.m17221d();
        }
    }

    public C4966a5(Context context, C5326w wVar, C5300m mVar) {
        this.f12204c = context;
        this.f12203U = wVar;
        mo16449a();
        mVar.mo16955L().mo30192f((Consumer<? super T>) new C4967a<Object>(this));
        mVar.mo16957M().mo30192f((Consumer<? super T>) new C4968b<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m17220c() {
        mo16449a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m17221d() {
        mo16450b();
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && (!intent.getBooleanExtra("noConnectivity", false)) && !this.f12203U.mo7632m()) {
            this.f12203U.mo7634o();
        }
    }

    /* renamed from: a */
    public final void mo16449a() {
        mo16450b();
        this.f12204c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: b */
    public final void mo16450b() {
        try {
            this.f12204c.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }
}
