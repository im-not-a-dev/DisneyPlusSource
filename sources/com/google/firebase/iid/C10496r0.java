package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p096e.p121h.p122j.C4025a;
import p163g.p449j.p450a.p451a.p457d.p463f.C11014m;

/* renamed from: com.google.firebase.iid.r0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10496r0 {
    C10496r0() {
    }

    /* renamed from: c */
    private final C10500t0 m33116c(Context context, String str) throws C10502u0 {
        try {
            C10500t0 d = m33117d(context, str);
            if (d != null) {
                m33110a(context, str, d);
                return d;
            }
            e = null;
            try {
                C10500t0 a = m33105a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m33104a(context, str, a, false);
                    return a;
                }
            } catch (C10502u0 e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C10502u0 e2) {
            e = e2;
        }
    }

    /* renamed from: d */
    private final C10500t0 m33117d(Context context, String str) throws C10502u0 {
        File e = m33118e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m33106a(e);
        } catch (C10502u0 | IOException e2) {
            String str2 = "FirebaseInstanceId";
            if (Log.isLoggable(str2, 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(valueOf);
                Log.d(str2, sb.toString());
            }
            try {
                return m33106a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w(str2, sb2.toString());
                throw new C10502u0((Exception) e3);
            }
        }
    }

    /* renamed from: e */
    private static File m33118e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes(Utf8Charset.NAME), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m33115b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10500t0 mo27337a(Context context, String str) throws C10502u0 {
        C10500t0 c = m33116c(context, str);
        if (c != null) {
            return c;
        }
        return mo27338b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C10500t0 mo27338b(Context context, String str) {
        C10500t0 t0Var = new C10500t0(C10477i.m33057a(C10464c.m33040a().getPublic()), System.currentTimeMillis());
        C10500t0 a = m33104a(context, str, t0Var, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(t0Var)) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Generated new key");
            }
            m33110a(context, str, t0Var);
            return t0Var;
        }
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    /* renamed from: a */
    static void m33109a(Context context) {
        File[] listFiles;
        for (File file : m33115b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static PublicKey m33108a(String str) throws C10502u0 {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C10502u0((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C10502u0((Exception) e2);
        }
    }

    /* renamed from: b */
    private static File m33115b(Context context) {
        File b = C4025a.m13796b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r9 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        m33113a(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        m33112a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        throw r11;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0095=Splitter:B:31:0x0095, B:19:0x0057=Splitter:B:19:0x0057} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C10500t0 m33104a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C10500t0 r11, boolean r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing ID to properties file"
            android.util.Log.d(r1, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r11.mo27349a()
            java.lang.String r4 = "id"
            r2.setProperty(r4, r3)
            long r3 = r11.f24885b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m33118e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00a9 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00a9 }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x00a2 }
            r9.lock()     // Catch:{ all -> 0x0099 }
            r4 = 0
            if (r12 == 0) goto L_0x0086
            long r6 = r9.size()     // Catch:{ all -> 0x0099 }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0086
            r9.position(r4)     // Catch:{ IOException -> 0x005d, u0 -> 0x005b }
            com.google.firebase.iid.t0 r11 = m33107a(r9)     // Catch:{ IOException -> 0x005d, u0 -> 0x005b }
            if (r9 == 0) goto L_0x0057
            m33113a(r10, r9)     // Catch:{ all -> 0x00a2 }
        L_0x0057:
            m33112a(r10, r3)     // Catch:{ IOException -> 0x00a9 }
            return r11
        L_0x005b:
            r12 = move-exception
            goto L_0x005e
        L_0x005d:
            r12 = move-exception
        L_0x005e:
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0086
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0099 }
            int r0 = r0.length()     // Catch:{ all -> 0x0099 }
            int r0 = r0 + 58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r6.<init>(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Tried reading ID before writing new one, but failed with: "
            r6.append(r0)     // Catch:{ all -> 0x0099 }
            r6.append(r12)     // Catch:{ all -> 0x0099 }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x0099 }
            android.util.Log.d(r1, r12)     // Catch:{ all -> 0x0099 }
        L_0x0086:
            r9.truncate(r4)     // Catch:{ all -> 0x0099 }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x0099 }
            r2.store(r12, r10)     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x0095
            m33113a(r10, r9)     // Catch:{ all -> 0x00a2 }
        L_0x0095:
            m33112a(r10, r3)     // Catch:{ IOException -> 0x00a9 }
            return r11
        L_0x0099:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x009b }
        L_0x009b:
            r12 = move-exception
            if (r9 == 0) goto L_0x00a1
            m33113a(r11, r9)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r12     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r11 = move-exception
            m33112a(r9, r3)     // Catch:{ IOException -> 0x00a9 }
            throw r11     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r1, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10496r0.m33104a(android.content.Context, java.lang.String, com.google.firebase.iid.t0, boolean):com.google.firebase.iid.t0");
    }

    /* renamed from: b */
    private static long m33114b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C10499t.m33126a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r8 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        m33113a(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        m33111a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C10500t0 m33106a(java.io.File r8) throws com.google.firebase.iid.C10502u0, java.io.IOException {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002c }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0023 }
            com.google.firebase.iid.t0 r1 = m33107a(r8)     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r8 == 0) goto L_0x001f
            m33113a(r2, r8)     // Catch:{ all -> 0x002c }
        L_0x001f:
            m33111a(r2, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            if (r8 == 0) goto L_0x002b
            m33113a(r1, r8)     // Catch:{ all -> 0x002c }
        L_0x002b:
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            m33111a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10496r0.m33106a(java.io.File):com.google.firebase.iid.t0");
    }

    /* renamed from: a */
    private static C10500t0 m33107a(FileChannel fileChannel) throws C10502u0, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C10477i.m33057a(m33108a(property2));
                } else {
                    throw new C10502u0("Invalid properties file");
                }
            }
            return new C10500t0(property, parseLong);
        } catch (NumberFormatException e) {
            throw new C10502u0((Exception) e);
        }
    }

    /* renamed from: a */
    private static C10500t0 m33105a(SharedPreferences sharedPreferences, String str) throws C10502u0 {
        long b = m33114b(sharedPreferences, str);
        String string = sharedPreferences.getString(C10499t.m33126a(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C10499t.m33126a(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = C10477i.m33057a(m33108a(string2));
        }
        return new C10500t0(string, b);
    }

    /* renamed from: a */
    private final void m33110a(Context context, String str, C10500t0 t0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (t0Var.equals(m33105a(sharedPreferences, str))) {
                return;
            }
        } catch (C10502u0 unused) {
        }
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C10499t.m33126a(str, "id"), t0Var.mo27349a());
        edit.putString(C10499t.m33126a(str, "cre"), String.valueOf(t0Var.f24885b));
        edit.commit();
    }

    /* renamed from: a */
    private static /* synthetic */ void m33113a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C11014m.m34728a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33112a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C11014m.m34728a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33111a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C11014m.m34728a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
