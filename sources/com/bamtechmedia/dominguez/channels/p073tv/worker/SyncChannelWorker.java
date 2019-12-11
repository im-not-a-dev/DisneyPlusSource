package com.bamtechmedia.dominguez.channels.p073tv.worker;

import android.content.Context;
import android.net.Uri;
import androidx.work.Data;
import androidx.work.Data.C1011a;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.OneTimeWorkRequest.C1015a;
import androidx.work.RxWorker;
import androidx.work.WorkManager;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3216a;
import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3233d;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p155q.p156a.p157a.C4339d;
import p096e.p155q.p156a.p157a.C4342e;
import p096e.p155q.p156a.p157a.C4343f;
import p096e.p155q.p156a.p157a.C4343f.C4344a;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncChannelWorker;", "Landroidx/work/RxWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "channelProvider", "Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;", "programCandidateProvider", "Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;Landroidx/tvprovider/media/tv/PreviewChannelHelper;Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;)V", "buildProgram", "Landroidx/tvprovider/media/tv/PreviewProgram;", "channelId", "", "program", "Lcom/bamtechmedia/dominguez/channels/tv/db/ProgramCandidate;", "createPrograms", "", "programs", "", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "Companion", "Factory", "Helper", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker */
/* compiled from: SyncChannelWorker.kt */
public final class SyncChannelWorker extends RxWorker {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3216a f8234c;

    /* renamed from: d */
    private final C3233d f8235d;

    /* renamed from: e */
    private final C4342e f8236e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3204a f8237f;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$a */
    /* compiled from: SyncChannelWorker.kt */
    public static final class C3240a {
        private C3240a() {
        }

        public /* synthetic */ C3240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncChannelWorker$Factory;", "Landroidx/work/WorkerFactory;", "channelProviders", "Ljava/util/Map;", "", "Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;", "programProviders", "Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "(Ljava/util/Map;Ljava/util/Map;Landroidx/tvprovider/media/tv/PreviewChannelHelper;Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;)V", "createWorker", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "workerClassName", "workerParameters", "Landroidx/work/WorkerParameters;", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$b */
    /* compiled from: SyncChannelWorker.kt */
    public static final class C3241b extends WorkerFactory {

        /* renamed from: b */
        private final Map<String, C3216a> f8238b;

        /* renamed from: c */
        private final Map<String, C3233d> f8239c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C4342e f8240d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C3204a f8241e;

        /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$b$a */
        /* compiled from: SyncChannelWorker.kt */
        static final class C3242a extends C12881k implements Function2<C3216a, C3233d, SyncChannelWorker> {

            /* renamed from: U */
            final /* synthetic */ Context f8242U;

            /* renamed from: V */
            final /* synthetic */ WorkerParameters f8243V;

            /* renamed from: c */
            final /* synthetic */ C3241b f8244c;

            C3242a(C3241b bVar, Context context, WorkerParameters workerParameters) {
                this.f8244c = bVar;
                this.f8242U = context;
                this.f8243V = workerParameters;
                super(2);
            }

            /* renamed from: a */
            public final SyncChannelWorker invoke(C3216a aVar, C3233d dVar) {
                SyncChannelWorker syncChannelWorker = new SyncChannelWorker(this.f8242U, this.f8243V, aVar, dVar, this.f8244c.f8240d, this.f8244c.f8241e);
                return syncChannelWorker;
            }
        }

        public C3241b(Map<String, C3216a> map, Map<String, C3233d> map2, C4342e eVar, C3204a aVar) {
            this.f8238b = map;
            this.f8239c = map2;
            this.f8240d = eVar;
            this.f8241e = aVar;
        }

        /* renamed from: a */
        public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
            if (!Intrinsics.areEqual((Object) str, (Object) SyncChannelWorker.class.getCanonicalName())) {
                return null;
            }
            String a = workerParameters.mo5652c().mo5584a("channelId");
            return (ListenableWorker) C5884x.m18949a(this.f8238b.get(a), this.f8239c.get(a), new C3242a(this, context, workerParameters));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$c */
    /* compiled from: SyncChannelWorker.kt */
    public static final class C3243c {

        /* renamed from: a */
        private final Provider<WorkManager> f8245a;

        public C3243c(Provider<WorkManager> provider) {
            this.f8245a = provider;
        }

        /* renamed from: a */
        private final WorkManager m11233a() {
            return (WorkManager) this.f8245a.get();
        }

        /* renamed from: a */
        public final void mo12292a(String str) {
            WorkManager a = m11233a();
            C1015a aVar = new C1015a(SyncChannelWorker.class);
            Pair[] pairArr = {C12907r.m40244a("channelId", str)};
            C1011a aVar2 = new C1011a();
            for (Pair pair : pairArr) {
                aVar2.mo5591a((String) pair.mo31015c(), pair.mo31016d());
            }
            Data a2 = aVar2.mo5594a();
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "dataBuilder.build()");
            a.mo5636a(((C1015a) aVar.mo5954a(a2)).mo5958a());
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "programs", "", "Lcom/bamtechmedia/dominguez/channels/tv/db/ProgramCandidate;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$d */
    /* compiled from: SyncChannelWorker.kt */
    static final class C3244d<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ SyncChannelWorker f8246c;

        /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncChannelWorker$d$a */
        /* compiled from: SyncChannelWorker.kt */
        static final class C3245a<T, R> implements Function<T, MaybeSource<? extends R>> {

            /* renamed from: U */
            final /* synthetic */ List f8247U;

            /* renamed from: c */
            final /* synthetic */ C3244d f8248c;

            C3245a(C3244d dVar, List list) {
                this.f8248c = dVar;
                this.f8247U = list;
            }

            /* renamed from: a */
            public final Maybe<Result> apply(C4339d dVar) {
                this.f8248c.f8246c.f8237f.mo12253a(dVar.mo15198a());
                SyncChannelWorker syncChannelWorker = this.f8248c.f8246c;
                long a = dVar.mo15198a();
                List list = this.f8247U;
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "programs");
                syncChannelWorker.m11225a(a, list);
                return Maybe.m38258c(Result.m5470c());
            }
        }

        C3244d(SyncChannelWorker syncChannelWorker) {
            this.f8246c = syncChannelWorker;
        }

        /* renamed from: a */
        public final Maybe<Result> apply(List<C3224c> list) {
            if (!list.isEmpty()) {
                return this.f8246c.f8234c.mo12261a().mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C3245a<Object,Object>(this, list));
            }
            return Maybe.m38258c(Result.m5470c());
        }
    }

    static {
        new C3240a(null);
    }

    public SyncChannelWorker(Context context, WorkerParameters workerParameters, C3216a aVar, C3233d dVar, C4342e eVar, C3204a aVar2) {
        super(context, workerParameters);
        this.f8234c = aVar;
        this.f8235d = dVar;
        this.f8236e = eVar;
        this.f8237f = aVar2;
    }

    /* renamed from: a */
    public Single<Result> mo5623a() {
        Single<Result> a = this.f8235d.mo12288a().mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C3244d<Object,Object>(this)).mo30109a((SingleSource<? extends T>) Single.m38399b(Result.m5470c()));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "programCandidateProvider…e.just(Result.success()))");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11225a(long j, List<C3224c> list) {
        for (C3224c a : list) {
            long a2 = this.f8236e.mo15222a(m11224a(j, a));
            StringBuilder sb = new StringBuilder();
            sb.append("Inserted new program: ");
            sb.append(a2);
            Timber.m44522a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    private final C4343f m11224a(long j, C3224c cVar) {
        Uri parse = Uri.parse(cVar.mo12270e());
        Uri parse2 = Uri.parse(cVar.mo12272f());
        C4344a aVar = new C4344a();
        aVar.mo15232i(j);
        aVar.mo15166n(4);
        C4344a aVar2 = aVar;
        aVar2.mo15197g(cVar.mo12278k());
        C4344a aVar3 = aVar2;
        aVar3.mo15175a(cVar.mo12267b());
        C4344a aVar4 = aVar3;
        aVar4.mo15161k(cVar.mo12266a());
        C4344a aVar5 = aVar4;
        aVar5.mo15174a(parse);
        C4344a aVar6 = aVar5;
        aVar6.mo15162l(0);
        C4344a aVar7 = aVar6;
        aVar7.mo15183b(parse);
        aVar7.mo15143c(parse2);
        C4343f a = aVar.mo15231a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "builder.build()");
        return a;
    }
}
