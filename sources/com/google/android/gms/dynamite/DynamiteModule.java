package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9943g;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10957b;

public final class DynamiteModule {

    /* renamed from: b */
    private static Boolean f23236b = null;

    /* renamed from: c */
    private static C9977i f23237c = null;

    /* renamed from: d */
    private static C9979k f23238d = null;

    /* renamed from: e */
    private static String f23239e = null;

    /* renamed from: f */
    private static int f23240f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C9967c> f23241g = new ThreadLocal<>();

    /* renamed from: h */
    private static final C9965a f23242h = new C9969a();

    /* renamed from: i */
    public static final C9964b f23243i = new C9971c();

    /* renamed from: j */
    public static final C9964b f23244j = new C9973e();

    /* renamed from: k */
    public static final C9964b f23245k = new C9974f();

    /* renamed from: a */
    private final Context f23246a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C9963a extends Exception {
        private C9963a(String str) {
            super(str);
        }

        private C9963a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C9963a(String str, C9969a aVar) {
            this(str);
        }

        /* synthetic */ C9963a(String str, Throwable th, C9969a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C9964b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C9965a {
            /* renamed from: a */
            int mo25484a(Context context, String str);

            /* renamed from: a */
            int mo25485a(Context context, String str, boolean z) throws C9963a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C9966b {

            /* renamed from: a */
            public int f23247a = 0;

            /* renamed from: b */
            public int f23248b = 0;

            /* renamed from: c */
            public int f23249c = 0;
        }

        /* renamed from: a */
        C9966b mo25483a(Context context, String str, C9965a aVar) throws C9963a;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C9967c {

        /* renamed from: a */
        public Cursor f23250a;

        private C9967c() {
        }

        /* synthetic */ C9967c(C9969a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C9968d implements C9965a {

        /* renamed from: a */
        private final int f23251a;

        public C9968d(int i, int i2) {
            this.f23251a = i;
        }

        /* renamed from: a */
        public final int mo25484a(Context context, String str) {
            return this.f23251a;
        }

        /* renamed from: a */
        public final int mo25485a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new C9970b();
        new C9972d();
        new C9975g();
    }

    private DynamiteModule(Context context) {
        C9908u.m30853a(context);
        this.f23246a = context;
    }

    /* renamed from: a */
    public static DynamiteModule m31015a(Context context, C9964b bVar, String str) throws C9963a {
        C9966b a;
        String str2 = ":";
        String str3 = "DynamiteModule";
        C9967c cVar = (C9967c) f23241g.get();
        C9967c cVar2 = new C9967c(null);
        f23241g.set(cVar2);
        try {
            a = bVar.mo25483a(context, str, f23242h);
            int i = a.f23247a;
            int i2 = a.f23248b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i2);
            Log.i(str3, sb.toString());
            if (a.f23249c == 0 || ((a.f23249c == -1 && a.f23247a == 0) || (a.f23249c == 1 && a.f23248b == 0))) {
                int i3 = a.f23247a;
                int i4 = a.f23248b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new C9963a(sb2.toString(), (C9969a) null);
            } else if (a.f23249c == -1) {
                DynamiteModule c = m31024c(context, str);
                Cursor cursor = cVar2.f23250a;
                if (cursor != null) {
                    cursor.close();
                }
                f23241g.set(cVar);
                return c;
            } else if (a.f23249c == 1) {
                DynamiteModule a2 = m31016a(context, str, a.f23248b);
                Cursor cursor2 = cVar2.f23250a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f23241g.set(cVar);
                return a2;
            } else {
                int i5 = a.f23249c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new C9963a(sb3.toString(), (C9969a) null);
            }
        } catch (C9963a e) {
            String str4 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            if (a.f23247a == 0 || bVar.mo25483a(context, str, new C9968d(a.f23247a, 0)).f23249c != -1) {
                throw new C9963a("Remote load failed. No local fallback found.", e, null);
            }
            DynamiteModule c2 = m31024c(context, str);
            Cursor cursor3 = cVar2.f23250a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f23241g.set(cVar);
            return c2;
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.f23250a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f23241g.set(cVar);
            throw th;
        }
    }

    /* renamed from: b */
    private static int m31021b(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        C9977i a = m31017a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo25491h() >= 2) {
                return a.mo25487a(C10957b.m34643a(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo25489b(C10957b.m34643a(context), str, z);
        } catch (RemoteException e) {
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31023c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.C9963a {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007a }
            f23239e = r1     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007a }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007a }
            f23240f = r1     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f23241g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C9967c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r1 = r10.f23250a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007d
            r10.f23250a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C9963a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m31023c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    public static int m31020b(Context context, String str) {
        return m31014a(context, str, false);
    }

    /* renamed from: b */
    private static DynamiteModule m31022b(Context context, String str, int i) throws C9963a, RemoteException {
        C9979k kVar;
        C10954a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f23238d;
        }
        if (kVar != null) {
            C9967c cVar = (C9967c) f23241g.get();
            if (cVar == null || cVar.f23250a == null) {
                throw new C9963a("No result cursor", (C9969a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f23250a;
            C10957b.m34643a(null);
            if (m31018a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = kVar.mo25493b(C10957b.m34643a(applicationContext), str, i, C10957b.m34643a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = kVar.mo25492a(C10957b.m34643a(applicationContext), str, i, C10957b.m34643a(cursor));
            }
            Context context2 = (Context) C10957b.m34644a(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C9963a("Failed to get module context", (C9969a) null);
        }
        throw new C9963a("DynamiteLoaderV2 was not cached.", (C9969a) null);
    }

    /* renamed from: c */
    private static DynamiteModule m31024c(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    public static int m31013a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w(str2, sb3.toString());
            return 0;
        } catch (Exception e) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|52|53|54|55|(3:57|58|59)(2:69|70)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c5, code lost:
        return m31023c(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ec, code lost:
        return m31021b(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[SYNTHETIC, Splitter:B:57:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e8 A[Catch:{ a -> 0x00c6, all -> 0x00f0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31014a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r1 = f23236b     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m31019a(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m31023c(r8, r9, r10)     // Catch:{ a -> 0x007e }
            java.lang.String r5 = f23239e     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f23239e     // Catch:{ a -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ a -> 0x007e }
            java.lang.String r6 = f23239e     // Catch:{ a -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007e }
            m31019a(r5)     // Catch:{ a -> 0x007e }
            r2.set(r3, r5)     // Catch:{ a -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007e }
            f23236b = r5     // Catch:{ a -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b8
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x0092
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            int r3 = r3.length()     // Catch:{ all -> 0x00ed }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>(r3)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ed }
            r4.append(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ed }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ed }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ed }
        L_0x00b8:
            f23236b = r1     // Catch:{ all -> 0x00ed }
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00e8
            int r8 = m31023c(r8, r9, r10)     // Catch:{ a -> 0x00c6 }
            return r8
        L_0x00c6:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f0 }
            int r1 = r9.length()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00f0 }
            goto L_0x00e3
        L_0x00de:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00f0 }
            r9.<init>(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00e3:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00f0 }
            r8 = 0
            return r8
        L_0x00e8:
            int r8 = m31021b(r8, r9, r10)     // Catch:{ all -> 0x00f0 }
            return r8
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            com.google.android.gms.common.util.C9943g.m30975a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m31014a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static DynamiteModule m31016a(Context context, String str, int i) throws C9963a {
        Boolean bool;
        C10954a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f23236b;
            }
            if (bool == null) {
                throw new C9963a("Failed to determine which loading route to use.", (C9969a) null);
            } else if (bool.booleanValue()) {
                return m31022b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C9977i a = m31017a(context);
                if (a != null) {
                    if (a.mo25491h() >= 2) {
                        aVar = a.mo25490b(C10957b.m34643a(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a.mo25488a(C10957b.m34643a(context), str, i);
                    }
                    if (C10957b.m34644a(aVar) != null) {
                        return new DynamiteModule((Context) C10957b.m34644a(aVar));
                    }
                    throw new C9963a("Failed to load remote module.", (C9969a) null);
                }
                throw new C9963a("Failed to create IDynamiteLoader.", (C9969a) null);
            }
        } catch (RemoteException e) {
            throw new C9963a("Failed to load remote module.", e, null);
        } catch (C9963a e2) {
            throw e2;
        } catch (Throwable th) {
            C9943g.m30975a(context, th);
            throw new C9963a("Failed to load remote module.", th, null);
        }
    }

    /* renamed from: a */
    private static C9977i m31017a(Context context) {
        C9977i iVar;
        synchronized (DynamiteModule.class) {
            if (f23237c != null) {
                C9977i iVar2 = f23237c;
                return iVar2;
            } else if (C9826e.m30607a().mo24987c(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof C9977i) {
                            iVar = (C9977i) queryLocalInterface;
                        } else {
                            iVar = new C9978j(iBinder);
                        }
                    }
                    if (iVar != null) {
                        f23237c = iVar;
                        return iVar;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Boolean m31018a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f23240f >= 2);
        }
        return valueOf;
    }

    /* renamed from: a */
    private static void m31019a(ClassLoader classLoader) throws C9963a {
        C9979k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C9979k) {
                    kVar = (C9979k) queryLocalInterface;
                } else {
                    kVar = new C9980l(iBinder);
                }
            }
            f23238d = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C9963a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: a */
    public final IBinder mo25482a(String str) throws C9963a {
        try {
            return (IBinder) this.f23246a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new C9963a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }
}
