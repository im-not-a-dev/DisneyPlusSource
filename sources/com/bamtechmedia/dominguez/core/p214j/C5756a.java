package com.bamtechmedia.dominguez.core.p214j;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C12880j;
import okio.BufferedSource;
import okio.C14287m;
import okio.C14302x;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.bamtechmedia.dominguez.core.j.a */
/* compiled from: DocumentStore.kt */
public final class C5756a {

    /* renamed from: a */
    private final Context f13515a;

    /* renamed from: b */
    private final C11760v f13516b;

    public C5756a(Context context, C11760v vVar) {
        this.f13515a = context;
        this.f13516b = vVar;
    }

    /* renamed from: b */
    private final BufferedSource m18683b(String str) {
        File c = m18684c(str);
        if (!c.isFile()) {
            c = null;
        }
        if (c != null) {
            C14302x c2 = C14287m.m45728c(c);
            if (c2 != null) {
                BufferedSource a = C14287m.m45716a(c2);
                if (a != null) {
                    return a;
                }
            }
        }
        throw new FileNotFoundException("Nothing has been written to the document store");
    }

    /* renamed from: c */
    private final File m18684c(String str) {
        File filesDir = this.f13515a.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("documentStore");
        sb.append(File.separator);
        sb.append(str);
        File file = new File(filesDir, sb.toString());
        if (!file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
        }
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> void mo17636a(java.lang.String r5, T r6, java.lang.reflect.Type r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ".tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r0 = r4.m18684c(r0)
            r1 = 0
            r2 = 1
            r3 = 0
            okio.v r1 = okio.C14287m.m45721a(r0, r1, r2, r3)     // Catch:{ Exception -> 0x003d }
            okio.f r1 = okio.C14287m.m45717a(r1)     // Catch:{ Exception -> 0x003d }
            g.m.a.v r2 = r4.f13516b     // Catch:{ all -> 0x0036 }
            g.m.a.h r7 = r2.mo29867a(r7)     // Catch:{ all -> 0x0036 }
            r7.toJson(r1, r6)     // Catch:{ all -> 0x0036 }
            kotlin.v r6 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0036 }
            kotlin.p580c0.C12724b.m39863a(r1, r3)     // Catch:{ Exception -> 0x003d }
            java.io.File r5 = r4.m18684c(r5)     // Catch:{ Exception -> 0x003d }
            r0.renameTo(r5)     // Catch:{ Exception -> 0x003d }
            return
        L_0x0036:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r6 = move-exception
            kotlin.p580c0.C12724b.m39863a(r1, r5)     // Catch:{ Exception -> 0x003d }
            throw r6     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r5 = move-exception
            r0.deleteOnExit()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.p214j.C5756a.mo17636a(java.lang.String, java.lang.Object, java.lang.reflect.Type):void");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m18680a(C5756a aVar, Type type, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return aVar.mo17635a(type, str, num, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        kotlin.p580c0.C12724b.m39863a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        kotlin.p580c0.C12724b.m39863a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo17635a(java.lang.reflect.Type r5, java.lang.String r6, java.lang.Integer r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 0
            okio.BufferedSource r1 = r4.m18683b(r6)     // Catch:{ Exception -> 0x001a }
            g.m.a.v r2 = r4.f13516b     // Catch:{ all -> 0x0013 }
            g.m.a.h r2 = r2.mo29867a(r5)     // Catch:{ all -> 0x0013 }
            java.lang.Object r2 = r2.fromJson(r1)     // Catch:{ all -> 0x0013 }
            kotlin.p580c0.C12724b.m39863a(r1, r0)     // Catch:{ Exception -> 0x001a }
            goto L_0x0059
        L_0x0013:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3 = move-exception
            kotlin.p580c0.C12724b.m39863a(r1, r2)     // Catch:{ Exception -> 0x001a }
            throw r3     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            r1 = move-exception
            boolean r2 = r1 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L_0x0036
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse from "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p686n.p687a.C14100a.m44528b(r1, r6, r2)
        L_0x0036:
            okio.x r6 = r4.m18681a(r7, r8)
            if (r6 == 0) goto L_0x0058
            okio.BufferedSource r6 = okio.C14287m.m45716a(r6)
            if (r6 == 0) goto L_0x0058
            g.m.a.v r7 = r4.f13516b     // Catch:{ all -> 0x0051 }
            g.m.a.h r5 = r7.mo29867a(r5)     // Catch:{ all -> 0x0051 }
            java.lang.Object r5 = r5.fromJson(r6)     // Catch:{ all -> 0x0051 }
            kotlin.p580c0.C12724b.m39863a(r6, r0)
            r2 = r5
            goto L_0x0059
        L_0x0051:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r7 = move-exception
            kotlin.p580c0.C12724b.m39863a(r6, r5)
            throw r7
        L_0x0058:
            r2 = r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.p214j.C5756a.mo17635a(java.lang.reflect.Type, java.lang.String, java.lang.Integer, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    private final C14302x m18681a(Integer num, String str) {
        if (num != null) {
            InputStream openRawResource = this.f13515a.getResources().openRawResource(num.intValue());
            C12880j.m40222a((Object) openRawResource, "context.resources.openRawResource(it)");
            C14302x a = C14287m.m45724a(openRawResource);
            if (a != null) {
                return a;
            }
        }
        if (str != null) {
            return m18682a(str);
        }
        return null;
    }

    /* renamed from: a */
    private final C14302x m18682a(String str) {
        try {
            InputStream open = this.f13515a.getAssets().open(str);
            C12880j.m40222a((Object) open, "context.assets.open(it)");
            return C14287m.m45724a(open);
        } catch (IOException unused) {
            return null;
        }
    }
}
