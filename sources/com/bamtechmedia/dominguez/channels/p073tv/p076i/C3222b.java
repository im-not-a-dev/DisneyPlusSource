package com.bamtechmedia.dominguez.channels.p073tv.p076i;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u0012\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/db/DeletedProgramsIdStoreImpl;", "Lcom/bamtechmedia/dominguez/channels/tv/db/DeletedProgramsIdStore;", "channelsPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "addDeletedProgramContentId", "", "contentId", "", "Lcom/bamtechmedia/dominguez/core/content/ContentId;", "getDeletedProgramsContentIds", "", "Companion", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.i.b */
/* compiled from: DeletedProgramsIdStoreImpl.kt */
public final class C3222b implements C3221a {

    /* renamed from: a */
    private final SharedPreferences f8194a;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.i.b$a */
    /* compiled from: DeletedProgramsIdStoreImpl.kt */
    public static final class C3223a {
        private C3223a() {
        }

        public /* synthetic */ C3223a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3223a(null);
    }

    public C3222b(SharedPreferences sharedPreferences) {
        this.f8194a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo12264a(String str) {
        String str2 = "content_ids";
        Set stringSet = this.f8194a.getStringSet(str2, C13188p0.m40531a());
        if (stringSet != null) {
            Editor edit = this.f8194a.edit();
            C12880j.m40222a((Object) edit, "editor");
            edit.putStringSet(str2, C13190q0.m40536b(stringSet, str));
            edit.apply();
        }
    }
}
