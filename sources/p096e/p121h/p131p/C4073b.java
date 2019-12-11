package p096e.p121h.p131p;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p096e.p113e.C3934g;
import p096e.p113e.C3941i;
import p096e.p121h.p122j.p124d.C4031c;
import p096e.p121h.p122j.p124d.C4039f.C4040a;
import p096e.p121h.p125k.C4049c;
import p096e.p121h.p125k.C4058i;
import p096e.p121h.p131p.C4081c.C4086d;
import p096e.p121h.p134r.C4117i;

/* renamed from: e.h.p.b */
/* compiled from: FontsContractCompat */
public class C4073b {

    /* renamed from: a */
    static final C3934g<String, Typeface> f10280a = new C3934g<>(16);

    /* renamed from: b */
    private static final C4081c f10281b = new C4081c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f10282c = new Object();

    /* renamed from: d */
    static final C3941i<String, ArrayList<C4086d<C4080g>>> f10283d = new C3941i<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f10284e = new C4077d();

    /* renamed from: e.h.p.b$a */
    /* compiled from: FontsContractCompat */
    static class C4074a implements Callable<C4080g> {

        /* renamed from: U */
        final /* synthetic */ C4072a f10285U;

        /* renamed from: V */
        final /* synthetic */ int f10286V;

        /* renamed from: W */
        final /* synthetic */ String f10287W;

        /* renamed from: c */
        final /* synthetic */ Context f10288c;

        C4074a(Context context, C4072a aVar, int i, String str) {
            this.f10288c = context;
            this.f10285U = aVar;
            this.f10286V = i;
            this.f10287W = str;
        }

        public C4080g call() throws Exception {
            C4080g a = C4073b.m13994a(this.f10288c, this.f10285U, this.f10286V);
            Typeface typeface = a.f10299a;
            if (typeface != null) {
                C4073b.f10280a.mo14073a(this.f10287W, typeface);
            }
            return a;
        }
    }

    /* renamed from: e.h.p.b$b */
    /* compiled from: FontsContractCompat */
    static class C4075b implements C4086d<C4080g> {

        /* renamed from: a */
        final /* synthetic */ C4040a f10289a;

        /* renamed from: b */
        final /* synthetic */ Handler f10290b;

        C4075b(C4040a aVar, Handler handler) {
            this.f10289a = aVar;
            this.f10290b = handler;
        }

        /* renamed from: a */
        public void mo14603a(C4080g gVar) {
            if (gVar == null) {
                this.f10289a.mo14557a(1, this.f10290b);
                return;
            }
            int i = gVar.f10300b;
            if (i == 0) {
                this.f10289a.mo14558a(gVar.f10299a, this.f10290b);
            } else {
                this.f10289a.mo14557a(i, this.f10290b);
            }
        }
    }

    /* renamed from: e.h.p.b$c */
    /* compiled from: FontsContractCompat */
    static class C4076c implements C4086d<C4080g> {

        /* renamed from: a */
        final /* synthetic */ String f10291a;

        C4076c(String str) {
            this.f10291a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p096e.p121h.p131p.C4081c.C4086d) r1.get(r0)).mo14603a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo14603a(p096e.p121h.p131p.C4073b.C4080g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p096e.p121h.p131p.C4073b.f10282c
                monitor-enter(r0)
                e.e.i<java.lang.String, java.util.ArrayList<e.h.p.c$d<e.h.p.b$g>>> r1 = p096e.p121h.p131p.C4073b.f10283d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f10291a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                e.e.i<java.lang.String, java.util.ArrayList<e.h.p.c$d<e.h.p.b$g>>> r2 = p096e.p121h.p131p.C4073b.f10283d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f10291a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                e.h.p.c$d r2 = (p096e.p121h.p131p.C4081c.C4086d) r2
                r2.mo14603a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p131p.C4073b.C4076c.mo14603a(e.h.p.b$g):void");
        }
    }

    /* renamed from: e.h.p.b$d */
    /* compiled from: FontsContractCompat */
    static class C4077d implements Comparator<byte[]> {
        C4077d() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: e.h.p.b$e */
    /* compiled from: FontsContractCompat */
    public static class C4078e {

        /* renamed from: a */
        private final int f10292a;

        /* renamed from: b */
        private final C4079f[] f10293b;

        public C4078e(int i, C4079f[] fVarArr) {
            this.f10292a = i;
            this.f10293b = fVarArr;
        }

        /* renamed from: a */
        public C4079f[] mo14607a() {
            return this.f10293b;
        }

        /* renamed from: b */
        public int mo14608b() {
            return this.f10292a;
        }
    }

    /* renamed from: e.h.p.b$f */
    /* compiled from: FontsContractCompat */
    public static class C4079f {

        /* renamed from: a */
        private final Uri f10294a;

        /* renamed from: b */
        private final int f10295b;

        /* renamed from: c */
        private final int f10296c;

        /* renamed from: d */
        private final boolean f10297d;

        /* renamed from: e */
        private final int f10298e;

        public C4079f(Uri uri, int i, int i2, boolean z, int i3) {
            C4117i.m14095a(uri);
            this.f10294a = uri;
            this.f10295b = i;
            this.f10296c = i2;
            this.f10297d = z;
            this.f10298e = i3;
        }

        /* renamed from: a */
        public int mo14609a() {
            return this.f10298e;
        }

        /* renamed from: b */
        public int mo14610b() {
            return this.f10295b;
        }

        /* renamed from: c */
        public Uri mo14611c() {
            return this.f10294a;
        }

        /* renamed from: d */
        public int mo14612d() {
            return this.f10296c;
        }

        /* renamed from: e */
        public boolean mo14613e() {
            return this.f10297d;
        }
    }

    /* renamed from: e.h.p.b$g */
    /* compiled from: FontsContractCompat */
    private static final class C4080g {

        /* renamed from: a */
        final Typeface f10299a;

        /* renamed from: b */
        final int f10300b;

        C4080g(Typeface typeface, int i) {
            this.f10299a = typeface;
            this.f10300b = i;
        }
    }

    /* renamed from: a */
    static C4080g m13994a(Context context, C4072a aVar, int i) {
        try {
            C4078e a = m13993a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo14608b() == 0) {
                Typeface a2 = C4049c.m13900a(context, null, a.mo14607a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C4080g(a2, i2);
            }
            if (a.mo14608b() == 1) {
                i2 = -2;
            }
            return new C4080g(null, i2);
        } catch (NameNotFoundException unused) {
            return new C4080g(null, -1);
        }
    }

    /* JADX INFO: used method not loaded: e.h.p.c.a(java.util.concurrent.Callable, e.h.p.c$d):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        f10281b.mo14617a((java.util.concurrent.Callable) r1, (p096e.p121h.p131p.C4081c.C4086d) new p096e.p121h.p131p.C4073b.C4076c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m13992a(android.content.Context r2, p096e.p121h.p131p.C4072a r3, p096e.p121h.p122j.p124d.C4039f.C4040a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo14596c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            e.e.g<java.lang.String, android.graphics.Typeface> r1 = f10280a
            java.lang.Object r1 = r1.mo14079b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1957a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            e.h.p.b$g r2 = m13994a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f10300b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f10299a
            r4.mo14558a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo14557a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f10299a
            return r2
        L_0x0043:
            e.h.p.b$a r1 = new e.h.p.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            e.h.p.c r3 = f10281b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo14614a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            e.h.p.b$g r3 = (p096e.p121h.p131p.C4073b.C4080g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f10299a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            e.h.p.b$b r3 = new e.h.p.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f10282c
            monitor-enter(r4)
            e.e.i<java.lang.String, java.util.ArrayList<e.h.p.c$d<e.h.p.b$g>>> r5 = f10283d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            e.e.i<java.lang.String, java.util.ArrayList<e.h.p.c$d<e.h.p.b$g>>> r3 = f10283d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            e.h.p.c r3 = f10281b
            e.h.p.b$c r4 = new e.h.p.b$c
            r4.<init>(r0)
            r3.mo14617a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p131p.C4073b.m13992a(android.content.Context, e.h.p.a, e.h.j.d.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m13997a(Context context, C4079f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C4079f fVar : fVarArr) {
            if (fVar.mo14609a() == 0) {
                Uri c = fVar.mo14611c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C4058i.m13959a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C4078e m13993a(Context context, CancellationSignal cancellationSignal, C4072a aVar) throws NameNotFoundException {
        ProviderInfo a = m13991a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C4078e(1, null);
        }
        return new C4078e(0, m13999a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m13991a(PackageManager packageManager, C4072a aVar, Resources resources) throws NameNotFoundException {
        String d = aVar.mo14597d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(d);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.mo14598e())) {
            List a = m13996a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f10284e);
            List a2 = m13995a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f10284e);
                if (m13998a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(d);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo14598e());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m13995a(C4072a aVar, Resources resources) {
        if (aVar.mo14594a() != null) {
            return aVar.mo14594a();
        }
        return C4031c.m13824a(resources, aVar.mo14595b());
    }

    /* renamed from: a */
    private static boolean m13998a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m13996a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static C4079f[] m13999a(Context context, C4072a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = "content";
        Uri build = new Builder().scheme(str3).authority(str2).build();
        Uri build2 = new Builder().scheme(str3).authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo14599f()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo14599f()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    C4079f fVar = new C4079f(uri, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i);
                    arrayList2.add(fVar);
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (C4079f[]) arrayList.toArray(new C4079f[0]);
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
