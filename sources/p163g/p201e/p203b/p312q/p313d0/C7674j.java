package p163g.p201e.p203b.p312q.p313d0;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.playback.p236l.C6334b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p287k.p288j.p291j.C7341f;
import p163g.p201e.p203b.p287k.p293k.C7396f;
import p163g.p201e.p203b.p287k.p293k.C7397g;
import p163g.p201e.p203b.p312q.C7689j;
import p163g.p201e.p203b.p327y.p328g.C7931b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouterTvImpl;", "Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "viewModelNavigation", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;", "playableIntentFactory", "Lcom/bamtechmedia/dominguez/playback/api/PlaybackIntentFactory;", "seriesDetailFragmentFactory", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailFragmentFactory;", "collectionCache", "Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "serviceUnavailableFragmentFactory", "Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableFragmentFactory;", "(Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;Lcom/bamtechmedia/dominguez/playback/api/PlaybackIntentFactory;Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailFragmentFactory;Lcom/bamtechmedia/dominguez/collections/CollectionCache;Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableFragmentFactory;)V", "startInTabStack", "", "fragment", "Landroidx/fragment/app/Fragment;", "startMovieDetail", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "popCurrentFromStack", "", "startPlayback", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "requestCode", "", "contentId", "", "startPlaybackConnectivity", "startRootFragment", "item", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "startSeriesDetail", "series", "Lcom/bamtechmedia/dominguez/core/content/Series;", "encodedSeriesId", "startServiceUnavailableView", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.d0.j */
/* compiled from: TabRouterTvImpl.kt */
public final class C7674j implements C7673i, C3653c {

    /* renamed from: a */
    private final C5792f f16704a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6334b f16705b;

    /* renamed from: c */
    private final C7396f f16706c;

    /* renamed from: d */
    private final C3330h f16707d;

    /* renamed from: e */
    private final C7931b f16708e;

    /* renamed from: g.e.b.q.d0.j$a */
    /* compiled from: TabRouterTvImpl.kt */
    static final class C7675a extends C12881k implements Function1<Context, Intent> {

        /* renamed from: U */
        final /* synthetic */ C3693o f16709U;

        /* renamed from: c */
        final /* synthetic */ C7674j f16710c;

        C7675a(C7674j jVar, C3693o oVar) {
            this.f16710c = jVar;
            this.f16709U = oVar;
            super(1);
        }

        /* renamed from: a */
        public final Intent invoke(Context context) {
            return this.f16710c.f16705b.mo18947a(context, this.f16709U);
        }
    }

    public C7674j(C5792f fVar, C6334b bVar, C7396f fVar2, C3330h hVar, C7931b bVar2) {
        this.f16704a = fVar;
        this.f16705b = bVar;
        this.f16706c = fVar2;
        this.f16707d = hVar;
        this.f16708e = bVar2;
    }

    /* renamed from: b */
    public void mo20591b() {
    }

    /* renamed from: a */
    public void mo20590a(C7689j jVar) {
        C5792f fVar = this.f16704a;
        Object newInstance = jVar.mo20603Y().newInstance();
        Fragment fragment = (Fragment) newInstance;
        fragment.setArguments(jVar != null ? jVar.mo20602X() : null);
        C12880j.m40222a(newInstance, "item.fragmentClass.newIn…agmentArguments\n        }");
        fVar.mo17696a(fragment);
    }

    /* renamed from: a */
    public void mo13291a(C3692n nVar, C3690l lVar, boolean z) {
        C5792f.m18757a(this.f16704a, C7341f.f16127k0.mo20165a(nVar, lVar), z, null, null, null, 28, null);
    }

    /* renamed from: a */
    public void mo13293a(C3791v vVar, C3690l lVar, boolean z) {
        C5792f.m18757a(this.f16704a, C7397g.m22147a(this.f16706c, vVar, lVar), z, null, null, null, 28, null);
    }

    /* renamed from: a */
    public void mo13294a(String str, C3690l lVar, boolean z) {
        C5792f.m18757a(this.f16704a, C7397g.m22148a(this.f16706c, str, lVar), z, null, null, null, 28, null);
    }

    /* renamed from: a */
    public void mo13292a(C3693o oVar, int i) {
        this.f16707d.mo12345b(ContentSetType.ContinueWatchingSet);
        this.f16704a.mo17683a(i, (Function1<? super Context, ? extends Intent>) new C7675a<Object,Object>(this, oVar));
    }

    /* renamed from: a */
    public void mo20589a() {
        this.f16704a.mo17696a(this.f16708e.mo20837a(true));
    }
}
