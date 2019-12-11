package com.bamtechmedia.dominguez.playback.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import kotlin.Metadata;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/receiver/HdmiBroadcastReceiver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "listener", "Lcom/bamtechmedia/dominguez/playback/common/receiver/HdmiBroadcastReceiver$OnHdmiStateChangeListener;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/playback/common/receiver/HdmiBroadcastReceiver$OnHdmiStateChangeListener;)V", "onReceive", "", "intent", "Landroid/content/Intent;", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "registerReceiver", "unregisterReceiver", "Companion", "OnHdmiStateChangeListener", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: HdmiBroadcastReceiver.kt */
public final class HdmiBroadcastReceiver extends BroadcastReceiver implements C0710d {

    /* renamed from: V */
    public static final C6295a f14366V = new C6295a(null);

    /* renamed from: U */
    private final C6296b f14367U;

    /* renamed from: c */
    private final Context f14368c;

    /* renamed from: com.bamtechmedia.dominguez.playback.common.receiver.HdmiBroadcastReceiver$a */
    /* compiled from: HdmiBroadcastReceiver.kt */
    public static final class C6295a {
        private C6295a() {
        }

        /* renamed from: a */
        public final void mo18910a(C0532d dVar, C6296b bVar) {
            dVar.getLifecycle().mo4134a(new HdmiBroadcastReceiver(dVar, bVar));
        }

        public /* synthetic */ C6295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.receiver.HdmiBroadcastReceiver$b */
    /* compiled from: HdmiBroadcastReceiver.kt */
    public interface C6296b {
        /* renamed from: a */
        void mo18911a();
    }

    public HdmiBroadcastReceiver(Context context, C6296b bVar) {
        this.f14368c = context;
        this.f14367U = bVar;
    }

    /* renamed from: b */
    private final void m19836b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
        this.f14368c.registerReceiver(this, intentFilter);
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        Timber.m44522a("## HDMI -> unregister receiver", new Object[0]);
        m19837d();
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        Timber.m44522a("## HDMI -> register receiver", new Object[0]);
        m19836b();
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || action.hashCode() != -469300177 || !action.equals("android.media.action.HDMI_AUDIO_PLUG")) {
            return;
        }
        if (intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1) == 0) {
            Timber.m44522a("## HDMI -> state changed = UNPLUGGED", new Object[0]);
            this.f14367U.mo18911a();
            return;
        }
        Timber.m44522a("## HDMI -> state changed = PLUGGED", new Object[0]);
    }

    /* renamed from: d */
    private final void m19837d() {
        this.f14368c.unregisterReceiver(this);
    }
}
