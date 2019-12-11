package com.bamtechmedia.dominguez.channels.p073tv.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.OneTimeWorkRequest.C1015a;
import androidx.work.RxWorker;
import androidx.work.WorkManager;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3216a;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3217b;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3219c;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p155q.p156a.p157a.C4339d;
import p096e.p155q.p156a.p157a.C4342e;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.p524d0.C11918b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/worker/HideChannelsWorker;", "Landroidx/work/RxWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "defaultChannelProvider", "Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;", "watchlistChannelProvider", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;Landroidx/tvprovider/media/tv/PreviewChannelHelper;Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;)V", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "Factory", "Helper", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.HideChannelsWorker */
/* compiled from: HideChannelsWorker.kt */
public final class HideChannelsWorker extends RxWorker {

    /* renamed from: c */
    private final C3216a f8224c;

    /* renamed from: d */
    private final C3216a f8225d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4342e f8226e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3204a f8227f;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.HideChannelsWorker$a */
    /* compiled from: HideChannelsWorker.kt */
    public static final class C3237a extends WorkerFactory {

        /* renamed from: b */
        private final C3217b f8228b;

        /* renamed from: c */
        private final C3219c f8229c;

        /* renamed from: d */
        private final C4342e f8230d;

        /* renamed from: e */
        private final C3204a f8231e;

        public C3237a(C3217b bVar, C3219c cVar, C4342e eVar, C3204a aVar) {
            this.f8228b = bVar;
            this.f8229c = cVar;
            this.f8230d = eVar;
            this.f8231e = aVar;
        }

        /* renamed from: a */
        public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
            if (!Intrinsics.areEqual((Object) str, (Object) HideChannelsWorker.class.getCanonicalName())) {
                return null;
            }
            HideChannelsWorker hideChannelsWorker = new HideChannelsWorker(context, workerParameters, this.f8228b, this.f8229c, this.f8230d, this.f8231e);
            return hideChannelsWorker;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.HideChannelsWorker$b */
    /* compiled from: HideChannelsWorker.kt */
    public static final class C3238b {

        /* renamed from: a */
        private final Provider<WorkManager> f8232a;

        public C3238b(Provider<WorkManager> provider) {
            this.f8232a = provider;
        }

        /* renamed from: b */
        private final WorkManager m11221b() {
            return (WorkManager) this.f8232a.get();
        }

        /* renamed from: a */
        public final void mo12290a() {
            m11221b().mo5636a(new C1015a(HideChannelsWorker.class).mo5958a());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.HideChannelsWorker$c */
    /* compiled from: Singles.kt */
    public static final class C3239c<T1, T2, R> implements C11947c<C4339d, C4339d, R> {

        /* renamed from: a */
        final /* synthetic */ HideChannelsWorker f8233a;

        public C3239c(HideChannelsWorker hideChannelsWorker) {
            this.f8233a = hideChannelsWorker;
        }

        public final R apply(C4339d dVar, C4339d dVar2) {
            C4339d dVar3 = dVar2;
            C4339d dVar4 = dVar;
            C3204a a = this.f8233a.f8227f;
            Intrinsics.checkReturnedValueIsNotNull((Object) dVar4, "defaultChannel");
            a.mo12253a(dVar4.mo15198a());
            C3204a a2 = this.f8233a.f8227f;
            Intrinsics.checkReturnedValueIsNotNull((Object) dVar3, "watchlistChannel");
            a2.mo12253a(dVar3.mo15198a());
            this.f8233a.f8226e.mo15226a(dVar3.mo15198a());
            this.f8233a.f8227f.mo12255a();
            return Result.m5470c();
        }
    }

    public HideChannelsWorker(Context context, WorkerParameters workerParameters, C3216a aVar, C3216a aVar2, C4342e eVar, C3204a aVar3) {
        super(context, workerParameters);
        this.f8224c = aVar;
        this.f8225d = aVar2;
        this.f8226e = eVar;
        this.f8227f = aVar3;
    }

    /* renamed from: a */
    public Single<Result> mo5623a() {
        C11918b bVar = C11918b.f27600a;
        Single<Result> a = Single.m38390a((SingleSource<? extends T1>) this.f8224c.mo12261a(), (SingleSource<? extends T2>) this.f8225d.mo12261a(), (C11947c<? super T1, ? super T2, ? extends R>) new C3239c<Object,Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return a;
    }
}
