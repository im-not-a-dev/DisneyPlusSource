package com.bamtechmedia.dominguez.config;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.C14287m;
import okio.C14302x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0002\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/OverrideConfigResolver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kotlin.jvm.PlatformType", "configSource", "Lokio/BufferedSource;", "configId", "", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.m0 */
/* compiled from: OverrideConfigResolver.kt */
public final class C3561m0 {

    /* renamed from: b */
    public static final C3562a f8895b = new C3562a(null);

    /* renamed from: a */
    private final Context f8896a;

    /* renamed from: com.bamtechmedia.dominguez.config.m0$a */
    /* compiled from: OverrideConfigResolver.kt */
    public static final class C3562a {
        private C3562a() {
        }

        /* renamed from: a */
        public final Uri mo12771a() {
            Uri parse = Uri.parse("content://com.disneystreaming.appconfigprovider.PROVIDER");
            Intrinsics.checkReturnedValueIsNotNull((Object) parse, "Uri.parse(\"content://com…configprovider.PROVIDER\")");
            return parse;
        }

        public /* synthetic */ C3562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3561m0(Context context) {
        this.f8896a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final BufferedSource mo12770a(String str) {
        try {
            Uri build = f8895b.mo12771a().buildUpon().appendPath(str).build();
            Context context = this.f8896a;
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(build, "r");
            if (openAssetFileDescriptor == null) {
                return null;
            }
            FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
            if (createInputStream == null) {
                return null;
            }
            C14302x a = C14287m.m45724a((InputStream) createInputStream);
            if (a != null) {
                return C14287m.m45716a(a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
