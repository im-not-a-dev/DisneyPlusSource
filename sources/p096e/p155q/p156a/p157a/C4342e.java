package p096e.p155q.p156a.p157a;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p096e.p155q.p156a.p157a.C4339d.C4341b;
import p096e.p155q.p156a.p157a.C4345g.C4347b;
import p096e.p155q.p156a.p157a.C4345g.C4349d;
import p096e.p155q.p156a.p157a.C4345g.C4351f;

/* renamed from: e.q.a.a.e */
/* compiled from: PreviewChannelHelper */
public class C4342e {

    /* renamed from: a */
    private final int f10798a;

    /* renamed from: b */
    private final int f10799b;

    /* renamed from: c */
    private final Context f10800c;

    public C4342e(Context context) {
        this(context, 3000, 10000);
    }

    /* renamed from: a */
    public long mo15221a(C4339d dVar) throws IOException {
        try {
            Uri insert = this.f10800c.getContentResolver().insert(C4347b.f10801a, dVar.mo15203e());
            if (insert == null || insert.equals(Uri.EMPTY)) {
                throw new NullPointerException("Channel insertion failed");
            }
            long parseId = ContentUris.parseId(insert);
            if (m14990a(parseId, dVar)) {
                return parseId;
            }
            mo15226a(parseId);
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to add logo, so channel (ID=");
            sb.append(parseId);
            sb.append(") was not created");
            throw new IOException(sb.toString());
        } catch (SecurityException e) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e);
            return -1;
        }
    }

    /* renamed from: b */
    public long mo15227b(C4339d dVar) throws IOException {
        long a = mo15221a(dVar);
        C4345g.m15008a(this.f10800c, a);
        return a;
    }

    public C4342e(Context context, int i, int i2) {
        this.f10800c = context;
        this.f10798a = i;
        this.f10799b = i2;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r8v7, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r8v8, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [android.graphics.Bitmap, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.InputStream]
      mth insns count: 53
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[SYNTHETIC, Splitter:B:15:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC, Splitter:B:28:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC, Splitter:B:35:0x0069] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m14991b(android.net.Uri r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r8.normalizeScheme()
            java.lang.String r0 = r0.getScheme()
            r1 = 0
            java.lang.String r2 = "android.resource"
            boolean r2 = r2.equals(r0)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r0)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = "content"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            if (r0 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            android.graphics.Bitmap r8 = r7.mo15224a(r8)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            r0 = r1
            goto L_0x0036
        L_0x0028:
            android.content.Context r0 = r7.f10800c     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            java.io.InputStream r0 = r0.openInputStream(r8)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
        L_0x0036:
            r1 = r8
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0064
        L_0x003d:
            r8 = move-exception
            r1 = r0
            goto L_0x0067
        L_0x0040:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x0049
        L_0x0045:
            r8 = move-exception
            goto L_0x0067
        L_0x0047:
            r0 = move-exception
            r2 = r1
        L_0x0049:
            java.lang.String r3 = "PreviewChannelHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r4.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "Failed to get logo from the URI: "
            r4.append(r5)     // Catch:{ all -> 0x0065 }
            r4.append(r8)     // Catch:{ all -> 0x0065 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0065 }
            android.util.Log.e(r3, r8, r0)     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            return r1
        L_0x0065:
            r8 = move-exception
            r1 = r2
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p155q.p156a.p157a.C4342e.m14991b(android.net.Uri):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public List<C4339d> mo15225a() {
        Cursor query = this.f10800c.getContentResolver().query(C4347b.f10801a, C4341b.f10797a, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (query == null || !query.moveToFirst()) {
            return arrayList;
        }
        do {
            arrayList.add(C4339d.m14969a(query));
        } while (query.moveToNext());
        return arrayList;
    }

    /* renamed from: b */
    public C4343f mo15228b(long j) {
        Cursor query = this.f10800c.getContentResolver().query(C4345g.m15010c(j), null, null, null, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        return C4343f.m15000a(query);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r7 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14990a(long r5, p096e.p155q.p156a.p157a.C4339d r7) {
        /*
            r4 = this;
            boolean r0 = r7.mo15202d()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r4.f10800c
            android.graphics.Bitmap r0 = r7.mo15199a(r0)
            if (r0 != 0) goto L_0x0018
            android.net.Uri r7 = r7.mo15201c()
            android.graphics.Bitmap r0 = r4.m14991b(r7)
        L_0x0018:
            android.net.Uri r7 = p096e.p155q.p156a.p157a.C4345g.m15007a(r5)
            android.content.Context r2 = r4.f10800c     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
            java.io.OutputStream r7 = r2.openOutputStream(r7)     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0037 }
            r3 = 100
            boolean r1 = r0.compress(r2, r3, r7)     // Catch:{ all -> 0x0037 }
            r7.flush()     // Catch:{ all -> 0x0037 }
            if (r7 == 0) goto L_0x0065
            r7.close()     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
            goto L_0x0065
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r2 = move-exception
            if (r7 == 0) goto L_0x0044
            r7.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r7 = move-exception
            r0.addSuppressed(r7)     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
        L_0x0044:
            throw r2     // Catch:{ SQLiteException -> 0x0049, IOException -> 0x0047, NullPointerException -> 0x0045 }
        L_0x0045:
            r7 = move-exception
            goto L_0x004a
        L_0x0047:
            r7 = move-exception
            goto L_0x004a
        L_0x0049:
            r7 = move-exception
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to add logo to the published channel (ID= "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "PreviewChannelHelper"
            android.util.Log.i(r6, r5, r7)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p155q.p156a.p157a.C4342e.m14990a(long, e.q.a.a.d):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC, Splitter:B:17:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo15224a(android.net.Uri r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0033 }
            r1.<init>(r3)     // Catch:{ all -> 0x0033 }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x0033 }
            int r1 = r2.f10798a     // Catch:{ all -> 0x0031 }
            r3.setConnectTimeout(r1)     // Catch:{ all -> 0x0031 }
            int r1 = r2.f10799b     // Catch:{ all -> 0x0031 }
            r3.setReadTimeout(r1)     // Catch:{ all -> 0x0031 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x0031 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            boolean r0 = r3 instanceof java.net.HttpURLConnection
            if (r0 == 0) goto L_0x0030
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r3.disconnect()
        L_0x0030:
            return r1
        L_0x0031:
            r1 = move-exception
            goto L_0x0035
        L_0x0033:
            r1 = move-exception
            r3 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            boolean r0 = r3 instanceof java.net.HttpURLConnection
            if (r0 == 0) goto L_0x0045
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r3.disconnect()
        L_0x0045:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p155q.p156a.p157a.C4342e.mo15224a(android.net.Uri):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public void mo15226a(long j) {
        this.f10800c.getContentResolver().delete(C4345g.m15009b(j), null, null);
    }

    /* renamed from: a */
    public long mo15222a(C4343f fVar) {
        try {
            return ContentUris.parseId(this.f10800c.getContentResolver().insert(C4349d.f10803a, fVar.mo15170b()));
        } catch (SecurityException e) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e);
            return -1;
        }
    }

    /* renamed from: a */
    public long mo15223a(C4354j jVar) {
        try {
            return ContentUris.parseId(this.f10800c.getContentResolver().insert(C4351f.f10804a, jVar.mo15170b()));
        } catch (SecurityException e) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e);
            return -1;
        }
    }
}
