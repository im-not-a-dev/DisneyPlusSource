package com.bamtechmedia.dominguez.playback.p254tv.p256d;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6421a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6425d;
import java.util.Arrays;
import kotlin.Metadata;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p174d.p178b.p183e0.C4952a;
import p163g.p174d.p178b.p183e0.C4952a.C4953a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/engine/TvPlaybackEngineFactory;", "Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackEngineFactory;", "activity", "Landroid/app/Activity;", "playerView", "Lcom/bamtech/player/AbstractPlayerView;", "playbackEventBindings", "Lcom/bamtech/player/bindings/Bindings;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "config", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "startupBitrateProvider", "Lcom/bamtechmedia/dominguez/playback/common/engine/StartupBitrateProvider;", "debugPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Activity;Lcom/bamtech/player/AbstractPlayerView;Lcom/bamtech/player/bindings/Bindings;Landroidx/lifecycle/LifecycleOwner;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;Lcom/bamtechmedia/dominguez/playback/common/engine/StartupBitrateProvider;Landroid/content/SharedPreferences;)V", "getEngineConfig", "Lcom/bamtech/player/config/PlaybackEngineConfig;", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.d.a */
/* compiled from: TvPlaybackEngineFactory.kt */
public final class C6556a extends C6421a {

    /* renamed from: h */
    private static final int[] f14817h = {2, 8, 16};

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.d.a$a */
    /* compiled from: TvPlaybackEngineFactory.kt */
    public static final class C6557a {
        private C6557a() {
        }

        public /* synthetic */ C6557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6557a(null);
    }

    public C6556a(Activity activity, C5273h hVar, C4922v2 v2Var, C0722m mVar, C6266a aVar, C6425d dVar, SharedPreferences sharedPreferences) {
        super(activity, hVar, v2Var, mVar, aVar, dVar, sharedPreferences);
    }

    /* renamed from: b */
    public C4952a mo19074b() {
        C4953a aVar = new C4953a();
        aVar.mo16381a(150);
        aVar.mo16380a(7);
        int[] iArr = f14817h;
        aVar.mo16384a(Arrays.copyOf(iArr, iArr.length));
        aVar.mo16388b(true);
        aVar.mo16380a(7);
        aVar.mo16391c(true);
        aVar.mo16387b(10);
        aVar.mo16382a(C13185o.m40520c(Integer.valueOf(10), Integer.valueOf(25), Integer.valueOf(50), Integer.valueOf(75), Integer.valueOf(90), Integer.valueOf(100)));
        aVar.mo16383a(true);
        aVar.mo16390c(0);
        return aVar.mo16385a();
    }
}
