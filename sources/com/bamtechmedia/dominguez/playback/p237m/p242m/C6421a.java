package com.bamtechmedia.dominguez.playback.p237m.p242m;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.lifecycle.C0722m;
import com.bamtech.player.exo.C1704c;
import com.bamtech.player.exo.C1706e;
import com.bamtech.player.exo.C1707f;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine.C1749a;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6330i;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.trackselection.C9295d.C9301e;
import com.google.android.exoplayer2.upstream.C9510p;
import com.google.android.exoplayer2.upstream.C9510p.C9512b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p174d.p178b.p183e0.C4952a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH&J\n\u0010\u001e\u001a\u00020\u001b*\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackEngineFactory;", "", "activity", "Landroid/app/Activity;", "playerView", "Lcom/bamtech/player/AbstractPlayerView;", "playbackEventBindings", "Lcom/bamtech/player/bindings/Bindings;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "config", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "startupBitrateProvider", "Lcom/bamtechmedia/dominguez/playback/common/engine/StartupBitrateProvider;", "debugPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Activity;Lcom/bamtech/player/AbstractPlayerView;Lcom/bamtech/player/bindings/Bindings;Landroidx/lifecycle/LifecycleOwner;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;Lcom/bamtechmedia/dominguez/playback/common/engine/StartupBitrateProvider;Landroid/content/SharedPreferences;)V", "applyEngineBuilderOptions", "", "builder", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine$Builder;", "applyTunneledPlayback", "context", "Landroid/content/Context;", "videoPlayer", "Lcom/bamtech/player/exo/ExoVideoPlayer;", "getEngine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "getEngineConfig", "Lcom/bamtech/player/config/PlaybackEngineConfig;", "customize", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.m.a */
/* compiled from: PlaybackEngineFactory.kt */
public abstract class C6421a {

    /* renamed from: a */
    private final Activity f14563a;

    /* renamed from: b */
    private final C5273h f14564b;

    /* renamed from: c */
    private final C4922v2 f14565c;

    /* renamed from: d */
    private final C0722m f14566d;

    /* renamed from: e */
    private final C6266a f14567e;

    /* renamed from: f */
    private final C6425d f14568f;

    /* renamed from: g */
    private final SharedPreferences f14569g;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.a$a */
    /* compiled from: PlaybackEngineFactory.kt */
    public static final class C6422a {
        private C6422a() {
        }

        public /* synthetic */ C6422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6422a(null);
    }

    public C6421a(Activity activity, C5273h hVar, C4922v2 v2Var, C0722m mVar, C6266a aVar, C6425d dVar, SharedPreferences sharedPreferences) {
        this.f14563a = activity;
        this.f14564b = hVar;
        this.f14565c = v2Var;
        this.f14566d = mVar;
        this.f14567e = aVar;
        this.f14568f = dVar;
        this.f14569g = sharedPreferences;
    }

    /* renamed from: a */
    public final SDK4ExoPlaybackEngine mo19071a() {
        String string = this.f14563a.getResources().getString(C6330i.app_name);
        C9512b bVar = new C9512b(this.f14563a.getApplicationContext());
        bVar.mo24578a((long) this.f14568f.mo19078b());
        C9510p a = bVar.mo24579a();
        C1749a a2 = new C1749a(string, this.f14563a, mo19074b(), this.f14564b).mo7550a(true);
        a2.mo7818e();
        C1749a a3 = a2.mo7549a(a);
        a3.mo7817b(true);
        mo19073a(a3);
        SDK4ExoPlaybackEngine b = a3.mo7553b();
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "SDK4ExoPlaybackEngine.Bu…ons)\n            .build()");
        mo19072a(b);
        return b;
    }

    /* renamed from: b */
    public abstract C4952a mo19074b();

    /* renamed from: a */
    public final SDK4ExoPlaybackEngine mo19072a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        this.f14566d.getLifecycle().mo4134a(sDK4ExoPlaybackEngine);
        sDK4ExoPlaybackEngine.mo7537b().mo16982a(this.f14565c);
        sDK4ExoPlaybackEngine.mo7528a((Context) this.f14563a, new C1704c());
        String str = "activity.debugOverlay";
        if (this.f14569g.getBoolean("DEBUG_PLAYER_OVERLAY", false)) {
            TextView textView = (TextView) this.f14563a.findViewById(C6327f.debugOverlay);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, str);
            textView.setVisibility(0);
            Activity activity = this.f14563a;
            sDK4ExoPlaybackEngine.mo7528a((Context) activity, new C1707f((TextView) activity.findViewById(C6327f.debugOverlay)));
        } else {
            TextView textView2 = (TextView) this.f14563a.findViewById(C6327f.debugOverlay);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str);
            textView2.setVisibility(8);
        }
        C5326w d = sDK4ExoPlaybackEngine.mo7539d();
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "this.videoPlayer");
        if (d instanceof C1706e) {
            m20074a(this.f14563a, (C1706e) d);
        }
        return sDK4ExoPlaybackEngine;
    }

    /* renamed from: a */
    private final void m20074a(Context context, C1706e eVar) {
        if (this.f14567e.mo18863n()) {
            Timber.m44522a("## Playback -> starting playback with tunneling enabled", new Object[0]);
            C9301e z = eVar.mo7645z();
            z.mo24112c(C.generateAudioSessionIdV21(context));
            eVar.mo7604a(z);
        }
    }

    /* renamed from: a */
    public void mo19073a(C1749a aVar) {
        Integer a = this.f14567e.mo18849a();
        if (a != null) {
            aVar.mo7552b(a.intValue() * 1024);
        }
        Integer o = this.f14567e.mo18864o();
        if (o != null) {
            aVar.mo7547a(o.intValue());
        }
    }
}
