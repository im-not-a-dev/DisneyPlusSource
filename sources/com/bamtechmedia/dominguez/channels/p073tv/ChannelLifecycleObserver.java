package com.bamtechmedia.dominguez.channels.p073tv;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11969r;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/ChannelLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainScheduler", "(Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "getMainScheduler", "()Lio/reactivex/Scheduler;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "Companion", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.ChannelLifecycleObserver */
/* compiled from: ChannelLifecycleObserver.kt */
public final class ChannelLifecycleObserver implements C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3204a f8165U;

    /* renamed from: V */
    private final C11969r f8166V;

    /* renamed from: W */
    private final C11969r f8167W;

    /* renamed from: c */
    private final C3419l f8168c;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.ChannelLifecycleObserver$a */
    /* compiled from: ChannelLifecycleObserver.kt */
    public static final class C3200a {
        private C3200a() {
        }

        public /* synthetic */ C3200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.ChannelLifecycleObserver$b */
    /* compiled from: ChannelLifecycleObserver.kt */
    static final class C3201b<T> implements C11952h<ContentSetType> {

        /* renamed from: c */
        public static final C3201b f8169c = new C3201b();

        C3201b() {
        }

        /* renamed from: a */
        public final boolean test(ContentSetType contentSetType) {
            return contentSetType == ContentSetType.ContinueWatchingSet || contentSetType == ContentSetType.WatchlistSet;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.ChannelLifecycleObserver$c */
    /* compiled from: ChannelLifecycleObserver.kt */
    static final class C3202c<T> implements Consumer<ContentSetType> {

        /* renamed from: c */
        final /* synthetic */ ChannelLifecycleObserver f8170c;

        C3202c(ChannelLifecycleObserver channelLifecycleObserver) {
            this.f8170c = channelLifecycleObserver;
        }

        /* renamed from: a */
        public final void accept(ContentSetType contentSetType) {
            StringBuilder sb = new StringBuilder();
            sb.append(contentSetType);
            sb.append(" invalidated , scheduling syncing Play Next Channel");
            C14100a.m44531d(sb.toString(), new Object[0]);
            if (contentSetType == ContentSetType.ContinueWatchingSet) {
                this.f8170c.f8165U.mo12259e();
            } else {
                this.f8170c.f8165U.mo12260f();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.ChannelLifecycleObserver$d */
    /* compiled from: ChannelLifecycleObserver.kt */
    static final class C3203d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3203d f8171c = new C3203d();

        C3203d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    static {
        new C3200a(null);
    }

    public ChannelLifecycleObserver(C3419l lVar, C3204a aVar, C11969r rVar, C11969r rVar2) {
        this.f8168c = lVar;
        this.f8165U = aVar;
        this.f8166V = rVar;
        this.f8167W = rVar2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        Flowable b = this.f8168c.mo12593a().mo30069a((C11952h<? super T>) C3201b.f8169c).mo30063a(200, TimeUnit.MILLISECONDS, this.f8166V).mo30086b(this.f8167W);
        C12880j.m40222a((Object) b, "collectionInvalidator.in…ubscribeOn(mainScheduler)");
        C0715i lifecycle = mVar.getLifecycle();
        C12880j.m40222a((Object) lifecycle, "owner.lifecycle");
        C10541b a = C10541b.m33252a(lifecycle, C0716a.ON_DESTROY);
        C12880j.m40222a((Object) a, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a2 = b.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a2).mo29927a(new C3202c(this), C3203d.f8171c);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }
}
