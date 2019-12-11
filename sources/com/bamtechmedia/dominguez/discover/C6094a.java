package com.bamtechmedia.dominguez.discover;

import android.view.View;
import android.view.View.OnClickListener;
import com.bamnet.chromecast.views.CastMediaRouteButton;
import kotlin.Metadata;
import p163g.p201e.p202a.C5363f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/discover/DiscoverCastButtonHandler;", "", "fragment", "Lcom/bamtechmedia/dominguez/discover/DiscoverFragment;", "(Lcom/bamtechmedia/dominguez/discover/DiscoverFragment;)V", "bindOnClickListener", "", "bindOnClickListener$core_release", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.discover.a */
/* compiled from: DiscoverCastButtonHandler.kt */
public final class C6094a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6099e f14029a;

    /* renamed from: com.bamtechmedia.dominguez.discover.a$a */
    /* compiled from: DiscoverCastButtonHandler.kt */
    static final class C6095a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6094a f14030c;

        C6095a(C6094a aVar) {
            this.f14030c = aVar;
        }

        public final void onClick(View view) {
            this.f14030c.f14029a.mo12237v().mo18368a();
        }
    }

    /* renamed from: a */
    public final void mo18363a() {
        CastMediaRouteButton _$_findCachedViewById = this.f14029a._$_findCachedViewById(C5363f.castButton);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnClickListener(new C6095a(this));
        }
    }
}
