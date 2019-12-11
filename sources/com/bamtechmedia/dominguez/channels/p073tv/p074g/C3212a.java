package com.bamtechmedia.dominguez.channels.p073tv.p074g;

import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c.C2794a;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/action/ChannelDeletionLogoutAction;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "mainScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;Lio/reactivex/Scheduler;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "getMainScheduler", "()Lio/reactivex/Scheduler;", "onLogout", "Lio/reactivex/Completable;", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.g.a */
/* compiled from: ChannelDeletionLogoutAction.kt */
public final class C3212a implements C2793c {

    /* renamed from: a */
    private final String f8181a = "androidChannels";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3204a f8182b;

    /* renamed from: c */
    private final C11969r f8183c;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.g.a$a */
    /* compiled from: ChannelDeletionLogoutAction.kt */
    static final class C3213a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C3212a f8184a;

        C3213a(C3212a aVar) {
            this.f8184a = aVar;
        }

        public final void run() {
            this.f8184a.f8182b.mo12257c();
        }
    }

    public C3212a(C3204a aVar, C11969r rVar) {
        this.f8182b = aVar;
        this.f8183c = rVar;
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f8181a;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        return C2794a.m10466a(this);
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable b = Completable.m38166c((C11945a) new C3213a(this)).mo30051b(this.f8183c);
        C12880j.m40222a((Object) b, "Completable.fromAction {…ubscribeOn(mainScheduler)");
        return b;
    }
}
