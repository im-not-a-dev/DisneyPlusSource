package com.bamtechmedia.dominguez.channels.p073tv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import com.bamtechmedia.dominguez.channels.p073tv.worker.HideChannelsWorker.C3238b;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncChannelWorker.C3243c;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncPlayNextChannelWorker.C3247b;
import kotlin.Metadata;
import p096e.p155q.p156a.p157a.C4345g;
import p096e.p155q.p156a.p157a.C4354j;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0007J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "", "context", "Landroid/content/Context;", "channelSyncHelper", "Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncChannelWorker$Helper;", "continueWatchingChannelSyncHelper", "Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncPlayNextChannelWorker$Helper;", "hideChannelsWorkerHelper", "Lcom/bamtechmedia/dominguez/channels/tv/worker/HideChannelsWorker$Helper;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncChannelWorker$Helper;Lcom/bamtechmedia/dominguez/channels/tv/worker/SyncPlayNextChannelWorker$Helper;Lcom/bamtechmedia/dominguez/channels/tv/worker/HideChannelsWorker$Helper;)V", "deleteAllProgramsFromChannel", "", "channelId", "", "deleteAllProgramsFromPlayNextChannel", "", "deleteWatchNextProgram", "watchNextProgram", "Landroidx/tvprovider/media/tv/WatchNextProgram;", "getAllWatchNextProgramsSavedInPlayNextChannel", "", "scheduleChannelDeletion", "scheduleSyncingChannels", "scheduleSyncingContinueWatchingForChannel", "scheduleSyncingWatchlistChannel", "Companion", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.a */
/* compiled from: ChannelManager.kt */
public final class C3204a {

    /* renamed from: a */
    private final Context f8172a;

    /* renamed from: b */
    private final C3243c f8173b;

    /* renamed from: c */
    private final C3247b f8174c;

    /* renamed from: d */
    private final C3238b f8175d;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.a$a */
    /* compiled from: ChannelManager.kt */
    public static final class C3205a {
        private C3205a() {
        }

        public /* synthetic */ C3205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3205a(null);
    }

    public C3204a(Context context, C3243c cVar, C3247b bVar, C3238b bVar2) {
        this.f8172a = context;
        this.f8173b = cVar;
        this.f8174c = bVar;
        this.f8175d = bVar2;
    }

    /* renamed from: a */
    public final int mo12253a(long j) {
        return this.f8172a.getContentResolver().delete(C4345g.m15011d(j), null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        kotlin.p580c0.C12724b.m39863a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        throw r2;
     */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p096e.p155q.p156a.p157a.C4354j> mo12256b() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = r8.f8172a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r3 = p096e.p155q.p156a.p157a.C4345g.C4351f.f10804a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0038
            r2 = 0
        L_0x0018:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x002b
            e.q.a.a.j r3 = p096e.p155q.p156a.p157a.C4354j.m15020a(r1)     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "watchNext"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)     // Catch:{ all -> 0x0031 }
            r0.add(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0018
        L_0x002b:
            kotlin.v r3 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0031 }
            kotlin.p580c0.C12724b.m39863a(r1, r2)
            goto L_0x0038
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            kotlin.p580c0.C12724b.m39863a(r1, r0)
            throw r2
        L_0x0038:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.channels.p073tv.C3204a.mo12256b():java.util.List");
    }

    /* renamed from: c */
    public final void mo12257c() {
        if (VERSION.SDK_INT >= 26) {
            Timber.m44522a("Scheduled channel deletion", new Object[0]);
            this.f8175d.mo12290a();
        }
    }

    /* renamed from: d */
    public final void mo12258d() {
        if (VERSION.SDK_INT >= 26) {
            Timber.m44522a("Scheduled channel creatiĽon.", new Object[0]);
            this.f8173b.mo12292a("default_channel");
            this.f8173b.mo12292a("watchlist_channel");
            this.f8174c.mo12295a();
        }
    }

    /* renamed from: e */
    public final void mo12259e() {
        if (VERSION.SDK_INT >= 26) {
            Timber.m44522a("Scheduled play next channel sync.", new Object[0]);
            this.f8174c.mo12295a();
        }
    }

    /* renamed from: f */
    public final void mo12260f() {
        if (VERSION.SDK_INT >= 26) {
            Timber.m44522a("Scheduled watchlist channel sync.", new Object[0]);
            this.f8173b.mo12292a("watchlist_channel");
        }
    }

    /* renamed from: a */
    public final void mo12255a() {
        for (C4354j a : mo12256b()) {
            mo12254a(a);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public final int mo12254a(C4354j jVar) {
        return this.f8172a.getContentResolver().delete(C4345g.m15012e(jVar.mo15169a()), null, null);
    }
}
