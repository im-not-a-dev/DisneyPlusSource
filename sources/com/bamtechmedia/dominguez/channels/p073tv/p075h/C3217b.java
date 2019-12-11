package com.bamtechmedia.dominguez.channels.p073tv.p075h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.C0493b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p122j.C4025a;
import p096e.p155q.p156a.p157a.C4339d;
import p096e.p155q.p156a.p157a.C4339d.C4340a;
import p096e.p155q.p156a.p157a.C4342e;
import p163g.p201e.p203b.p209f.C5555a;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\tH\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/channel/DefaultChannelProvider;", "Lcom/bamtechmedia/dominguez/channels/tv/channel/ChannelProvider;", "context", "Landroid/content/Context;", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "(Landroid/content/Context;Landroidx/tvprovider/media/tv/PreviewChannelHelper;)V", "channelOnce", "Lio/reactivex/Single;", "Landroidx/tvprovider/media/tv/PreviewChannel;", "createChannel", "getChannel", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.h.b */
/* compiled from: DefaultChannelProvider.kt */
public final class C3217b implements C3216a {

    /* renamed from: a */
    private final Context f8188a;

    /* renamed from: b */
    private final C4342e f8189b;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.h.b$a */
    /* compiled from: DefaultChannelProvider.kt */
    static final class C3218a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C3217b f8190c;

        C3218a(C3217b bVar) {
            this.f8190c = bVar;
        }

        public final C4339d call() {
            C4339d b = this.f8190c.m11173c();
            return b != null ? b : this.f8190c.m11171b();
        }
    }

    public C3217b(Context context, C4342e eVar) {
        this.f8188a = context;
        this.f8189b = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C4339d m11173c() {
        Object obj;
        List a = this.f8189b.mo15225a();
        C12880j.m40222a((Object) a, "previewChannelHelper.allChannels");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C4339d dVar = (C4339d) obj;
            C12880j.m40222a((Object) dVar, "it");
            if (C12880j.m40224a((Object) dVar.mo15200b(), (Object) "default_channel")) {
                break;
            }
        }
        return (C4339d) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C4339d m11171b() {
        Drawable c = C4025a.m13798c(this.f8188a, C5555a.disney_channel_logo);
        Bitmap a = c != null ? C0493b.m2654a(c, 0, 0, null, 7, null) : null;
        C4340a aVar = new C4340a();
        aVar.mo15215b((CharSequence) "Recommended For You");
        aVar.mo15210a((CharSequence) "Disneyplus content");
        aVar.mo15211a("default_channel");
        aVar.mo15209a(Uri.parse("https://disneyplus.com"));
        if (a != null) {
            aVar.mo15208a(a);
            this.f8189b.mo15227b(aVar.mo15213a());
            C4339d c2 = m11173c();
            C12880j.m40222a((Object) c2, "channel");
            return c2;
        }
        C12880j.m40220a();
        throw null;
    }

    /* renamed from: a */
    public Single<C4339d> mo12261a() {
        Single<C4339d> c = Single.m38401c((Callable<? extends T>) new C3218a<Object>(this));
        C12880j.m40222a((Object) c, "Single.fromCallable {\n  …createChannel()\n        }");
        return c;
    }
}
