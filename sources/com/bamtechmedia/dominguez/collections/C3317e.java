package com.bamtechmedia.dominguez.collections;

import androidx.lifecycle.C0710d;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.google.android.exoplayer2.p391ui.PlayerView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH&JF\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "attachHeroCollection", "", "view", "Lcom/google/android/exoplayer2/ui/PlayerView;", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "playbackEndAction", "Lkotlin/Function0;", "attachVideoArt", "loop", "", "playbackStartAction", "stopPlayback", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.e */
/* compiled from: AssetVideoArtHandler.kt */
public interface C3317e extends C0710d {

    /* renamed from: com.bamtechmedia.dominguez.collections.e$a */
    /* compiled from: AssetVideoArtHandler.kt */
    public static final class C3318a {
        /* renamed from: a */
        public static /* synthetic */ void m11423a(C3317e eVar, PlayerView playerView, C3680n nVar, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
            if (obj == null) {
                eVar.mo12321a(playerView, nVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function02);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachVideoArt");
        }
    }

    /* renamed from: a */
    void mo12320a(PlayerView playerView, C3680n nVar, Function0<C13145v> function0);

    /* renamed from: a */
    void mo12321a(PlayerView playerView, C3680n nVar, boolean z, Function0<C13145v> function0, Function0<C13145v> function02);

    /* renamed from: c */
    void mo12322c();
}
