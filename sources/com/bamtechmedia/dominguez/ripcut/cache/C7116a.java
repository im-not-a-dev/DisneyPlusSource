package com.bamtechmedia.dominguez.ripcut.cache;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/cache/CacheFileResolver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheDirPath", "Ljava/io/File;", "getCacheDirPath", "()Ljava/io/File;", "cacheDirPath$delegate", "Lkotlin/Lazy;", "localFile", "uri", "Landroid/net/Uri;", "localUri", "remoteUri", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ripcut.cache.a */
/* compiled from: CacheFileResolver.kt */
public final class C7116a {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f15745c = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7116a.class), "cacheDirPath", "getCacheDirPath()Ljava/io/File;"))};

    /* renamed from: a */
    private final Lazy f15746a = C12763i.m39921a(new C7118b(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f15747b;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.a$a */
    /* compiled from: CacheFileResolver.kt */
    public static final class C7117a {
        private C7117a() {
        }

        public /* synthetic */ C7117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ripcut.cache.a$b */
    /* compiled from: CacheFileResolver.kt */
    static final class C7118b extends C12881k implements Function0<File> {

        /* renamed from: c */
        final /* synthetic */ C7116a f15748c;

        C7118b(C7116a aVar) {
            this.f15748c = aVar;
            super(0);
        }

        public final File invoke() {
            return new File(this.f15748c.f15747b.getFilesDir(), "offline_images");
        }
    }

    static {
        new C7117a(null);
    }

    public C7116a(Context context) {
        this.f15747b = context;
    }

    /* renamed from: a */
    private final File m21517a() {
        Lazy lazy = this.f15746a;
        KProperty kProperty = f15745c[0];
        return (File) lazy.getValue();
    }

    /* renamed from: b */
    public final Uri mo19908b(Uri uri) {
        File a = mo19907a(uri);
        if (a.exists()) {
            return Uri.fromFile(a);
        }
        return null;
    }

    /* renamed from: a */
    public final File mo19907a(Uri uri) {
        File a = m21517a();
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(Math.abs(uri.hashCode())));
        sb.append(".png");
        return new File(a, sb.toString());
    }
}
