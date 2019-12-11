package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6500a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6509d;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/upnext/TvDialogTypeResolver;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/DialogTypeResolver;", "onceCurrentProfileAutoplay", "Lio/reactivex/Single;", "", "autoPlayRules", "Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;)V", "nextDialogTypeOnce", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAutoPlayType;", "upNextState", "Lcom/bamtechmedia/dominguez/playback/common/UpNextState;", "nextPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "isMilestone", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.a */
/* compiled from: TvDialogTypeResolver.kt */
public final class C6577a implements C6500a {

    /* renamed from: a */
    private final Single<Boolean> f14868a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6512a f14869b;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.a$a */
    /* compiled from: TvDialogTypeResolver.kt */
    static final class C6578a<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6341e f14870U;

        /* renamed from: V */
        final /* synthetic */ boolean f14871V;

        /* renamed from: c */
        final /* synthetic */ C6577a f14872c;

        C6578a(C6577a aVar, C6341e eVar, boolean z) {
            this.f14872c = aVar;
            this.f14870U = eVar;
            this.f14871V = z;
        }

        /* renamed from: a */
        public final boolean mo19228a(Boolean bool) {
            if (!bool.booleanValue()) {
                return false;
            }
            return this.f14872c.f14869b.mo19172a(this.f14870U, this.f14871V);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo19228a((Boolean) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.a$b */
    /* compiled from: TvDialogTypeResolver.kt */
    static final class C6579b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C6579b f14873c = new C6579b();

        C6579b() {
        }

        /* renamed from: a */
        public final Single<C6509d> mo19229a(boolean z) {
            if (!z) {
                return Single.m38399b(C6509d.CLICK_TO_PLAY);
            }
            return Single.m38399b(C6509d.AUTOPLAY);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return mo19229a(((Boolean) obj).booleanValue());
        }
    }

    public C6577a(Single<Boolean> single, C6512a aVar) {
        this.f14868a = single;
        this.f14869b = aVar;
    }

    /* renamed from: a */
    public Single<C6509d> mo19159a(C6341e eVar, C3693o oVar, boolean z) {
        Single<C6509d> a = this.f14868a.mo30233g(new C6578a(this, eVar, z)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C6579b.f14873c);
        C12880j.m40222a((Object) a, "onceCurrentProfileAutopl…  }\n                    }");
        return a;
    }
}
