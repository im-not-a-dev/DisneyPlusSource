package p163g.p201e.p203b.p286j;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;

/* renamed from: g.e.b.j.l */
/* compiled from: DeeplinkOriginChecker.kt */
public final class C7301l {
    /* renamed from: a */
    public final boolean mo20111a(HttpUrl httpUrl) {
        return httpUrl.mo35762m().contains("fromChannel");
    }

    /* renamed from: a */
    public final boolean mo20110a(Uri uri) {
        return uri.getQueryParameterNames().contains("fromChannel");
    }

    /* renamed from: a */
    public final boolean mo20109a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !C12880j.m40224a((Object) intent.getAction(), (Object) "android.intent.action.VIEW") || !mo20110a(data)) {
            return false;
        }
        return true;
    }
}
