package com.bamtechmedia.dominguez.channels.p073tv.worker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.OneTimeWorkRequest.C1015a;
import androidx.work.RxWorker;
import androidx.work.WorkManager;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3232c;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3233d;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p096e.p155q.p156a.p157a.C4342e;
import p096e.p155q.p156a.p157a.C4354j;
import p096e.p155q.p156a.p157a.C4354j.C4355a;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002!\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncPlayNextChannelWorker;", "Landroidx/work/RxWorker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "programCandidateProvider", "Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/bamtechmedia/dominguez/channels/tv/programs/ProgramCandidateProvider;Landroidx/tvprovider/media/tv/PreviewChannelHelper;Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;)V", "buildProgram", "Landroidx/tvprovider/media/tv/WatchNextProgram;", "program", "Lcom/bamtechmedia/dominguez/channels/tv/db/ProgramCandidate;", "watchNextType", "", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "deleteWatchNextProgramsPreviouslyAddedFromSets", "", "currentWatchNextProgramsSavedInPlayNextChannel", "", "filterProgramsForGivenType", "watchNextProgramsToFilter", "mapContentSetTypeToWatchNextType", "contentSetType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "prepareCandidates", "list", "Factory", "Helper", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncPlayNextChannelWorker */
/* compiled from: SyncPlayNextChannelWorker.kt */
public final class SyncPlayNextChannelWorker extends RxWorker {

    /* renamed from: c */
    private final C3233d f8249c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4342e f8250d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3204a f8251e;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncPlayNextChannelWorker$a */
    /* compiled from: SyncPlayNextChannelWorker.kt */
    public static final class C3246a extends WorkerFactory {

        /* renamed from: b */
        private final C3232c f8252b;

        /* renamed from: c */
        private final C4342e f8253c;

        /* renamed from: d */
        private final C3204a f8254d;

        public C3246a(C3232c cVar, C4342e eVar, C3204a aVar) {
            this.f8252b = cVar;
            this.f8253c = eVar;
            this.f8254d = aVar;
        }

        /* renamed from: a */
        public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
            if (!Intrinsics.areEqual((Object) str, (Object) SyncPlayNextChannelWorker.class.getCanonicalName())) {
                return null;
            }
            SyncPlayNextChannelWorker syncPlayNextChannelWorker = new SyncPlayNextChannelWorker(context, workerParameters, this.f8252b, this.f8253c, this.f8254d);
            return syncPlayNextChannelWorker;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncPlayNextChannelWorker$b */
    /* compiled from: SyncPlayNextChannelWorker.kt */
    public static final class C3247b {

        /* renamed from: a */
        private final Provider<WorkManager> f8255a;

        public C3247b(Provider<WorkManager> provider) {
            this.f8255a = provider;
        }

        /* renamed from: b */
        private final WorkManager m11248b() {
            return (WorkManager) this.f8255a.get();
        }

        /* renamed from: a */
        public final void mo12295a() {
            m11248b().mo5636a(new C1015a(SyncPlayNextChannelWorker.class).mo5958a());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.SyncPlayNextChannelWorker$c */
    /* compiled from: SyncPlayNextChannelWorker.kt */
    static final class C3248c<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ SyncPlayNextChannelWorker f8256c;

        C3248c(SyncPlayNextChannelWorker syncPlayNextChannelWorker) {
            this.f8256c = syncPlayNextChannelWorker;
        }

        /* renamed from: a */
        public final Result apply(List<C3224c> list) {
            List b = this.f8256c.f8251e.mo12256b();
            this.f8256c.m11245c(b);
            for (C4354j jVar : this.f8256c.m11241a(ContentSetType.ContinueWatchingSet, list)) {
                ArrayList<C4354j> arrayList = new ArrayList<>();
                for (Object next : b) {
                    if (Intrinsics.areEqual((Object) ((C4354j) next).mo15141d(), (Object) jVar.mo15141d())) {
                        arrayList.add(next);
                    }
                }
                ArrayList<Number> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) arrayList, 10));
                for (C4354j a : arrayList) {
                    arrayList2.add(Integer.valueOf(this.f8256c.f8251e.mo12254a(a)));
                }
                int i = 0;
                for (Number intValue : arrayList2) {
                    i += intValue.intValue();
                }
                this.f8256c.f8250d.mo15223a(jVar);
                StringBuilder sb = new StringBuilder();
                sb.append("Deleted candidates for continue watching ");
                sb.append(jVar.mo15140c());
                sb.append(" : count ");
                sb.append(i);
                Timber.m44531d(sb.toString(), new Object[0]);
            }
            return Result.m5470c();
        }
    }

    public SyncPlayNextChannelWorker(Context context, WorkerParameters workerParameters, C3233d dVar, C4342e eVar, C3204a aVar) {
        super(context, workerParameters);
        this.f8249c = dVar;
        this.f8250d = eVar;
        this.f8251e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m11245c(List<C4354j> list) {
        List<C4354j> a = m11242a(list, 3);
        List<C4354j> a2 = m11242a(list, 0);
        for (C4354j a3 : a) {
            this.f8251e.mo12254a(a3);
        }
        for (C4354j a4 : a2) {
            this.f8251e.mo12254a(a4);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public Single<Result> mo5623a() {
        Single<Result> a = this.f8249c.mo12288a().mo30131f(new C3248c(this)).mo30109a((SingleSource<? extends T>) Single.m38399b(Result.m5470c()));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "programCandidateProvider…e.just(Result.success()))");
        return a;
    }

    /* renamed from: a */
    private final int m11237a(ContentSetType contentSetType) {
        int i = C3251c.$EnumSwitchMapping$0[contentSetType.ordinal()];
        if (i != 1) {
            return i != 2 ? 2 : 3;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C4354j> m11241a(ContentSetType contentSetType, List<C3224c> list) {
        int a = m11237a(contentSetType);
        if (list == null) {
            return C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C3224c a2 : list) {
            arrayList.add(m11239a(a2, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final C4354j m11239a(C3224c cVar, int i) {
        Uri parse = Uri.parse(cVar.mo12270e());
        Uri parse2 = Uri.parse(cVar.mo12272f());
        C4355a aVar = new C4355a();
        aVar.mo15161k(cVar.mo12266a());
        C4355a aVar2 = aVar;
        aVar2.mo15157i(cVar.mo12266a());
        C4355a aVar3 = aVar2;
        aVar3.mo15166n(cVar.mo12274h());
        C4355a aVar4 = aVar3;
        aVar4.mo15239o(i);
        aVar4.mo15197g(cVar.mo12278k());
        C4355a aVar5 = aVar4;
        aVar5.mo15175a(cVar.mo12267b());
        C4355a aVar6 = aVar5;
        aVar6.mo15161k(cVar.mo12266a());
        C4355a aVar7 = aVar6;
        aVar7.mo15174a(parse);
        C4355a aVar8 = aVar7;
        int i2 = 0;
        aVar8.mo15160k(0);
        C4355a aVar9 = aVar8;
        aVar9.mo15183b(parse);
        C4355a aVar10 = aVar9;
        aVar10.mo15162l(0);
        C4355a aVar11 = aVar10;
        aVar11.mo15143c(parse2);
        C4355a aVar12 = aVar11;
        Date date = DateTime.now().toDate();
        Intrinsics.checkReturnedValueIsNotNull((Object) date, "DateTime.now().toDate()");
        aVar12.mo15238i(date.getTime());
        Integer c = cVar.mo12268c();
        aVar12.mo15151g(c != null ? c.intValue() : 0);
        C4355a aVar13 = aVar12;
        Integer g = cVar.mo12273g();
        aVar13.mo15158j(g != null ? g.intValue() : 0);
        C4355a aVar14 = aVar13;
        Integer i3 = cVar.mo12276i();
        aVar14.mo15187c(i3 != null ? i3.intValue() : 0);
        C4355a aVar15 = aVar14;
        Integer d = cVar.mo12269d();
        if (d != null) {
            i2 = d.intValue();
        }
        aVar15.mo15172a(i2);
        C4355a aVar16 = aVar15;
        aVar16.mo15184b(cVar.mo12277j());
        C4354j a = aVar16.mo15237a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "builder.build()");
        return a;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    private final List<C4354j> m11242a(List<C4354j> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C4354j jVar = (C4354j) next;
            if (jVar.mo15140c() != null && jVar.mo15234e() == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
