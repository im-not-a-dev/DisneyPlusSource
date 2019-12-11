package com.bamtechmedia.dominguez.channels.p073tv.receiver;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3221a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p155q.p156a.p157a.C4342e;
import p096e.p155q.p156a.p157a.C4343f;
import p512h.p513c.C11875e;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/receiver/DeletedProgramBroadcastReceiver;", "Ldagger/android/DaggerBroadcastReceiver;", "()V", "deletedProgramsIdStore", "Lcom/bamtechmedia/dominguez/channels/tv/db/DeletedProgramsIdStore;", "getDeletedProgramsIdStore", "()Lcom/bamtechmedia/dominguez/channels/tv/db/DeletedProgramsIdStore;", "setDeletedProgramsIdStore", "(Lcom/bamtechmedia/dominguez/channels/tv/db/DeletedProgramsIdStore;)V", "previewChannelHelper", "Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "getPreviewChannelHelper", "()Landroidx/tvprovider/media/tv/PreviewChannelHelper;", "setPreviewChannelHelper", "(Landroidx/tvprovider/media/tv/PreviewChannelHelper;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.receiver.DeletedProgramBroadcastReceiver */
/* compiled from: DeletedProgramBroadcastReceiver.kt */
public final class DeletedProgramBroadcastReceiver extends C11875e {

    /* renamed from: a */
    public C4342e f8222a;

    /* renamed from: b */
    public C3221a f8223b;

    @SuppressLint({"RestrictedApi"})
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive(): ");
        sb.append(intent);
        Timber.m44522a(sb.toString(), new Object[0]);
        String action = intent.getAction();
        if (action != null && action.hashCode() == 1568780589 && action.equals("android.media.tv.action.PREVIEW_PROGRAM_BROWSABLE_DISABLED")) {
            long longExtra = intent.getLongExtra("android.media.tv.extra.PREVIEW_PROGRAM_ID", -1);
            C4342e eVar = this.f8222a;
            if (eVar != null) {
                C4343f b = eVar.mo15228b(longExtra);
                C3221a aVar = this.f8223b;
                if (aVar != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) b, "program");
                    String d = b.mo15141d();
                    Intrinsics.checkReturnedValueIsNotNull((Object) d, "program.internalProviderId");
                    aVar.mo12264a(d);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onReceive: ACTION_PREVIEW_PROGRAM_BROWSABLE_DISABLED program: ");
                    sb2.append(b);
                    sb2.append(' ');
                    Timber.m44522a(sb2.toString(), new Object[0]);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("deletedProgramsIdStore");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("previewChannelHelper");
            throw null;
        }
    }
}
