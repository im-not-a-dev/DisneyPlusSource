package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.database.C8684a;
import com.google.android.exoplayer2.database.C8686c;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.p393v0.C9530b0;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9539f;
import com.google.android.exoplayer2.p393v0.Util;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.exoplayer2.upstream.cache.m */
/* compiled from: CachedContentIndex */
class C9475m {

    /* renamed from: a */
    private final HashMap<String, C9474l> f22045a;

    /* renamed from: b */
    private final SparseArray<String> f22046b;

    /* renamed from: c */
    private final SparseBooleanArray f22047c;

    /* renamed from: d */
    private final SparseBooleanArray f22048d;

    /* renamed from: e */
    private C9478c f22049e;

    /* renamed from: f */
    private C9478c f22050f;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.m$a */
    /* compiled from: CachedContentIndex */
    private static final class C9476a implements C9478c {

        /* renamed from: e */
        private static final String[] f22051e = {"id", "key", "metadata"};

        /* renamed from: a */
        private final DatabaseProvider f22052a;

        /* renamed from: b */
        private final SparseArray<C9474l> f22053b = new SparseArray<>();

        /* renamed from: c */
        private String f22054c;

        /* renamed from: d */
        private String f22055d;

        public C9476a(DatabaseProvider databaseProvider) {
            this.f22052a = databaseProvider;
        }

        /* renamed from: a */
        public static void m29094a(DatabaseProvider databaseProvider, long j) throws C8684a {
            m29095a(databaseProvider, Long.toHexString(j));
        }

        /* renamed from: c */
        private Cursor m29096c() {
            return this.f22052a.getReadableDatabase().query(this.f22055d, f22051e, null, null, null, null, null);
        }

        /* renamed from: b */
        public void mo24540b() throws C8684a {
            m29095a(this.f22052a, this.f22054c);
        }

        /* renamed from: a */
        public void mo24534a(long j) {
            this.f22054c = Long.toHexString(j);
            this.f22055d = m29089a(this.f22054c);
        }

        /* renamed from: b */
        public void mo24541b(HashMap<String, C9474l> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            if (this.f22053b.size() != 0) {
                try {
                    writableDatabase = this.f22052a.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    for (int i = 0; i < this.f22053b.size(); i++) {
                        C9474l lVar = (C9474l) this.f22053b.valueAt(i);
                        if (lVar == null) {
                            m29091a(writableDatabase, this.f22053b.keyAt(i));
                        } else {
                            m29092a(writableDatabase, lVar);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f22053b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C8684a(e);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public boolean mo24539a() throws C8684a {
            if (C8686c.m25142a(this.f22052a.getReadableDatabase(), 1, this.f22054c) != -1) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
            if (r0 != null) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24538a(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.C9474l> r8, android.util.SparseArray<java.lang.String> r9) throws java.io.IOException {
            /*
                r7 = this;
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.l> r0 = r7.f22053b
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                com.google.android.exoplayer2.p393v0.C9537e.m29301b(r0)
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r7.f22052a     // Catch:{ SQLiteException -> 0x0081 }
                android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0081 }
                java.lang.String r3 = r7.f22054c     // Catch:{ SQLiteException -> 0x0081 }
                int r0 = com.google.android.exoplayer2.database.C8686c.m25142a(r0, r2, r3)     // Catch:{ SQLiteException -> 0x0081 }
                if (r0 == r2) goto L_0x0036
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r7.f22052a     // Catch:{ SQLiteException -> 0x0081 }
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0081 }
                r0.beginTransaction()     // Catch:{ SQLiteException -> 0x0081 }
                r7.m29090a(r0)     // Catch:{ all -> 0x0031 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x0031 }
                r0.endTransaction()     // Catch:{ SQLiteException -> 0x0081 }
                goto L_0x0036
            L_0x0031:
                r1 = move-exception
                r0.endTransaction()     // Catch:{ SQLiteException -> 0x0081 }
                throw r1     // Catch:{ SQLiteException -> 0x0081 }
            L_0x0036:
                android.database.Cursor r0 = r7.m29096c()     // Catch:{ SQLiteException -> 0x0081 }
            L_0x003a:
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x006d
                int r3 = r0.getInt(r1)     // Catch:{ all -> 0x0073 }
                java.lang.String r4 = r0.getString(r2)     // Catch:{ all -> 0x0073 }
                r5 = 2
                byte[] r5 = r0.getBlob(r5)     // Catch:{ all -> 0x0073 }
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0073 }
                r6.<init>(r5)     // Catch:{ all -> 0x0073 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0073 }
                r5.<init>(r6)     // Catch:{ all -> 0x0073 }
                com.google.android.exoplayer2.upstream.cache.q r5 = com.google.android.exoplayer2.upstream.cache.C9475m.m29072b(r5)     // Catch:{ all -> 0x0073 }
                com.google.android.exoplayer2.upstream.cache.l r6 = new com.google.android.exoplayer2.upstream.cache.l     // Catch:{ all -> 0x0073 }
                r6.<init>(r3, r4, r5)     // Catch:{ all -> 0x0073 }
                java.lang.String r3 = r6.f22041b     // Catch:{ all -> 0x0073 }
                r8.put(r3, r6)     // Catch:{ all -> 0x0073 }
                int r3 = r6.f22040a     // Catch:{ all -> 0x0073 }
                java.lang.String r4 = r6.f22041b     // Catch:{ all -> 0x0073 }
                r9.put(r3, r4)     // Catch:{ all -> 0x0073 }
                goto L_0x003a
            L_0x006d:
                if (r0 == 0) goto L_0x0072
                r0.close()     // Catch:{ SQLiteException -> 0x0081 }
            L_0x0072:
                return
            L_0x0073:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r2 = move-exception
                if (r0 == 0) goto L_0x0080
                r0.close()     // Catch:{ all -> 0x007c }
                goto L_0x0080
            L_0x007c:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0081 }
            L_0x0080:
                throw r2     // Catch:{ SQLiteException -> 0x0081 }
            L_0x0081:
                r0 = move-exception
                r8.clear()
                r9.clear()
                com.google.android.exoplayer2.database.a r8 = new com.google.android.exoplayer2.database.a
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9475m.C9476a.mo24538a(java.util.HashMap, android.util.SparseArray):void");
        }

        /* renamed from: a */
        public void mo24537a(HashMap<String, C9474l> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            try {
                writableDatabase = this.f22052a.getWritableDatabase();
                writableDatabase.beginTransaction();
                m29090a(writableDatabase);
                for (C9474l a : hashMap.values()) {
                    m29092a(writableDatabase, a);
                }
                writableDatabase.setTransactionSuccessful();
                this.f22053b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C8684a(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo24535a(C9474l lVar) {
            this.f22053b.put(lVar.f22040a, lVar);
        }

        /* renamed from: a */
        public void mo24536a(C9474l lVar, boolean z) {
            if (z) {
                this.f22053b.delete(lVar.f22040a);
            } else {
                this.f22053b.put(lVar.f22040a, null);
            }
        }

        /* renamed from: a */
        private void m29090a(SQLiteDatabase sQLiteDatabase) throws C8684a {
            C8686c.m25143a(sQLiteDatabase, 1, this.f22054c, 1);
            m29093a(sQLiteDatabase, this.f22055d);
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f22055d);
            sb.append(" ");
            sb.append("(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
            sQLiteDatabase.execSQL(sb.toString());
        }

        /* renamed from: a */
        private void m29091a(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete(this.f22055d, "id = ?", new String[]{Integer.toString(i)});
        }

        /* renamed from: a */
        private void m29092a(SQLiteDatabase sQLiteDatabase, C9474l lVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C9475m.m29073b(lVar.mo24511a(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(lVar.f22040a));
            contentValues.put("key", lVar.f22041b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.f22055d, null, contentValues);
        }

        /* renamed from: a */
        private static void m29095a(DatabaseProvider databaseProvider, String str) throws C8684a {
            SQLiteDatabase writableDatabase;
            try {
                String a = m29089a(str);
                writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransaction();
                C8686c.m25146b(writableDatabase, 1, str);
                m29093a(writableDatabase, a);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C8684a(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }

        /* renamed from: a */
        private static void m29093a(SQLiteDatabase sQLiteDatabase, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sQLiteDatabase.execSQL(sb.toString());
        }

        /* renamed from: a */
        private static String m29089a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExoPlayerCacheIndex");
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.m$b */
    /* compiled from: CachedContentIndex */
    private static class C9477b implements C9478c {

        /* renamed from: a */
        private final boolean f22056a;

        /* renamed from: b */
        private final Cipher f22057b;

        /* renamed from: c */
        private final SecretKeySpec f22058c;

        /* renamed from: d */
        private final Random f22059d;

        /* renamed from: e */
        private final C9539f f22060e;

        /* renamed from: f */
        private boolean f22061f;

        /* renamed from: g */
        private C9530b0 f22062g;

        public C9477b(File file, byte[] bArr, boolean z) {
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            Random random = null;
            if (bArr != null) {
                C9537e.m29299a(bArr.length == 16);
                try {
                    cipher = C9475m.m29075e();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C9537e.m29299a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f22056a = z;
            this.f22057b = cipher;
            this.f22058c = secretKeySpec;
            if (z) {
                random = new Random();
            }
            this.f22059d = random;
            this.f22060e = new C9539f(file);
        }

        /* renamed from: c */
        private void m29109c(HashMap<String, C9474l> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            try {
                OutputStream d = this.f22060e.mo24612d();
                if (this.f22062g == null) {
                    this.f22062g = new C9530b0(d);
                } else {
                    this.f22062g.mo24595a(d);
                }
                dataOutputStream = new DataOutputStream(this.f22062g);
                try {
                    dataOutputStream.writeInt(2);
                    int i = 0;
                    dataOutputStream.writeInt(this.f22056a ? 1 : 0);
                    if (this.f22056a) {
                        byte[] bArr = new byte[16];
                        this.f22059d.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        this.f22057b.init(1, this.f22058c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f22062g, this.f22057b));
                    }
                    dataOutputStream.writeInt(hashMap.size());
                    for (C9474l lVar : hashMap.values()) {
                        m29107a(lVar, dataOutputStream);
                        i += m29105a(lVar, 2);
                    }
                    dataOutputStream.writeInt(i);
                    this.f22060e.mo24609a(dataOutputStream);
                    Util.m29406a((Closeable) null);
                } catch (InvalidKeyException e) {
                    e = e;
                    throw new IllegalStateException(e);
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (Throwable th) {
                    th = th;
                    Util.m29406a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                Util.m29406a((Closeable) dataOutputStream);
                throw th;
            }
        }

        /* renamed from: a */
        public void mo24534a(long j) {
        }

        /* renamed from: a */
        public boolean mo24539a() {
            return this.f22060e.mo24610b();
        }

        /* renamed from: b */
        public void mo24540b() {
            this.f22060e.mo24608a();
        }

        /* renamed from: a */
        public void mo24538a(HashMap<String, C9474l> hashMap, SparseArray<String> sparseArray) {
            C9537e.m29301b(!this.f22061f);
            if (!m29108b(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f22060e.mo24608a();
            }
        }

        /* renamed from: b */
        public void mo24541b(HashMap<String, C9474l> hashMap) throws IOException {
            if (this.f22061f) {
                mo24537a(hashMap);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b4  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m29108b(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.C9474l> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
                r10 = this;
                com.google.android.exoplayer2.v0.f r0 = r10.f22060e
                boolean r0 = r0.mo24610b()
                r1 = 1
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 0
                r2 = 0
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                com.google.android.exoplayer2.v0.f r4 = r10.f22060e     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                java.io.InputStream r4 = r4.mo24611c()     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                r4.<init>(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00a9 }
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                if (r0 < 0) goto L_0x00a1
                r5 = 2
                if (r0 <= r5) goto L_0x0027
                goto L_0x00a1
            L_0x0027:
                int r6 = r4.readInt()     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r6 = r6 & r1
                if (r6 == 0) goto L_0x0060
                javax.crypto.Cipher r6 = r10.f22057b     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                if (r6 != 0) goto L_0x0036
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
                return r2
            L_0x0036:
                r6 = 16
                byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r4.readFully(r6)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r7.<init>(r6)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                javax.crypto.Cipher r6 = r10.f22057b     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                javax.crypto.spec.SecretKeySpec r8 = r10.f22058c     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                r6.init(r5, r8, r7)     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                javax.crypto.Cipher r7 = r10.f22057b     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r6.<init>(r3, r7)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r5.<init>(r6)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r4 = r5
                goto L_0x0066
            L_0x0057:
                r11 = move-exception
                goto L_0x005a
            L_0x0059:
                r11 = move-exception
            L_0x005a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r12.<init>(r11)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                throw r12     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
            L_0x0060:
                boolean r3 = r10.f22056a     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                if (r3 == 0) goto L_0x0066
                r10.f22061f = r1     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
            L_0x0066:
                int r3 = r4.readInt()     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r5 = 0
                r6 = 0
            L_0x006c:
                if (r5 >= r3) goto L_0x0086
                com.google.android.exoplayer2.upstream.cache.l r7 = r10.m29106a(r0, r4)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                java.lang.String r8 = r7.f22041b     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r11.put(r8, r7)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                int r8 = r7.f22040a     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                java.lang.String r9 = r7.f22041b     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r12.put(r8, r9)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                int r7 = r10.m29105a(r7, r0)     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                int r6 = r6 + r7
                int r5 = r5 + 1
                goto L_0x006c
            L_0x0086:
                int r11 = r4.readInt()     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                int r12 = r4.read()     // Catch:{ IOException -> 0x00a7, all -> 0x00a5 }
                r0 = -1
                if (r12 != r0) goto L_0x0093
                r12 = 1
                goto L_0x0094
            L_0x0093:
                r12 = 0
            L_0x0094:
                if (r11 != r6) goto L_0x009d
                if (r12 != 0) goto L_0x0099
                goto L_0x009d
            L_0x0099:
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
                return r1
            L_0x009d:
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
                return r2
            L_0x00a1:
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
                return r2
            L_0x00a5:
                r11 = move-exception
                goto L_0x00ab
            L_0x00a7:
                goto L_0x00b2
            L_0x00a9:
                r11 = move-exception
                r4 = r0
            L_0x00ab:
                if (r4 == 0) goto L_0x00b0
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
            L_0x00b0:
                throw r11
            L_0x00b1:
                r4 = r0
            L_0x00b2:
                if (r4 == 0) goto L_0x00b7
                com.google.android.exoplayer2.p393v0.Util.m29406a(r4)
            L_0x00b7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9475m.C9477b.m29108b(java.util.HashMap, android.util.SparseArray):boolean");
        }

        /* renamed from: a */
        public void mo24537a(HashMap<String, C9474l> hashMap) throws IOException {
            m29109c(hashMap);
            this.f22061f = false;
        }

        /* renamed from: a */
        public void mo24535a(C9474l lVar) {
            this.f22061f = true;
        }

        /* renamed from: a */
        public void mo24536a(C9474l lVar, boolean z) {
            this.f22061f = true;
        }

        /* renamed from: a */
        private int m29105a(C9474l lVar, int i) {
            int hashCode = (lVar.f22040a * 31) + lVar.f22041b.hashCode();
            if (i >= 2) {
                return (hashCode * 31) + lVar.mo24511a().hashCode();
            }
            long a = C9479n.m29126a(lVar.mo24511a());
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }

        /* renamed from: a */
        private C9474l m29106a(int i, DataInputStream dataInputStream) throws IOException {
            C9482q qVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                C9481p pVar = new C9481p();
                C9481p.m29130a(pVar, readLong);
                qVar = C9482q.f22065c.mo24549a(pVar);
            } else {
                qVar = C9475m.m29072b(dataInputStream);
            }
            return new C9474l(readInt, readUTF, qVar);
        }

        /* renamed from: a */
        private void m29107a(C9474l lVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(lVar.f22040a);
            dataOutputStream.writeUTF(lVar.f22041b);
            C9475m.m29073b(lVar.mo24511a(), dataOutputStream);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.m$c */
    /* compiled from: CachedContentIndex */
    private interface C9478c {
        /* renamed from: a */
        void mo24534a(long j);

        /* renamed from: a */
        void mo24535a(C9474l lVar);

        /* renamed from: a */
        void mo24536a(C9474l lVar, boolean z);

        /* renamed from: a */
        void mo24537a(HashMap<String, C9474l> hashMap) throws IOException;

        /* renamed from: a */
        void mo24538a(HashMap<String, C9474l> hashMap, SparseArray<String> sparseArray) throws IOException;

        /* renamed from: a */
        boolean mo24539a() throws IOException;

        /* renamed from: b */
        void mo24540b() throws IOException;

        /* renamed from: b */
        void mo24541b(HashMap<String, C9474l> hashMap) throws IOException;
    }

    public C9475m(DatabaseProvider databaseProvider, File file, byte[] bArr, boolean z, boolean z2) {
        C9537e.m29301b((databaseProvider == null && file == null) ? false : true);
        this.f22045a = new HashMap<>();
        this.f22046b = new SparseArray<>();
        this.f22047c = new SparseBooleanArray();
        this.f22048d = new SparseBooleanArray();
        C9477b bVar = null;
        C9478c aVar = databaseProvider != null ? new C9476a(databaseProvider) : null;
        if (file != null) {
            bVar = new C9477b(new File(file, "cached_content_index.exi"), bArr, z);
        }
        if (aVar == null || (bVar != null && z2)) {
            this.f22049e = bVar;
            this.f22050f = aVar;
            return;
        }
        this.f22049e = aVar;
        this.f22050f = bVar;
    }

    /* renamed from: f */
    private C9474l m29076f(String str) {
        int a = m29068a(this.f22046b);
        C9474l lVar = new C9474l(a, str);
        this.f22045a.put(str, lVar);
        this.f22046b.put(a, str);
        this.f22048d.put(a, true);
        this.f22049e.mo24535a(lVar);
        return lVar;
    }

    /* renamed from: g */
    public static final boolean m29077g(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* renamed from: b */
    public C9474l mo24528b(String str) {
        return (C9474l) this.f22045a.get(str);
    }

    /* renamed from: c */
    public void mo24531c() throws IOException {
        this.f22049e.mo24541b(this.f22045a);
        int size = this.f22047c.size();
        for (int i = 0; i < size; i++) {
            this.f22046b.remove(this.f22047c.keyAt(i));
        }
        this.f22047c.clear();
        this.f22048d.clear();
    }

    /* renamed from: e */
    public void mo24533e(String str) {
        C9474l lVar = (C9474l) this.f22045a.get(str);
        if (lVar != null && lVar.mo24519c() && !lVar.mo24520d()) {
            this.f22045a.remove(str);
            int i = lVar.f22040a;
            boolean z = this.f22048d.get(i);
            this.f22049e.mo24536a(lVar, z);
            if (z) {
                this.f22046b.remove(i);
                this.f22048d.delete(i);
                return;
            }
            this.f22046b.put(i, null);
            this.f22047c.put(i, true);
        }
    }

    /* renamed from: b */
    public void mo24529b() {
        String[] strArr = new String[this.f22045a.size()];
        this.f22045a.keySet().toArray(strArr);
        for (String e : strArr) {
            mo24533e(e);
        }
    }

    /* renamed from: d */
    public C9474l mo24532d(String str) {
        C9474l lVar = (C9474l) this.f22045a.get(str);
        return lVar == null ? m29076f(str) : lVar;
    }

    /* renamed from: a */
    public static void m29070a(DatabaseProvider databaseProvider, long j) throws C8684a {
        C9476a.m29094a(databaseProvider, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24526a(long r2) throws java.io.IOException {
        /*
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.m$c r0 = r1.f22049e
            r0.mo24534a(r2)
            com.google.android.exoplayer2.upstream.cache.m$c r0 = r1.f22050f
            if (r0 == 0) goto L_0x000c
            r0.mo24534a(r2)
        L_0x000c:
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22049e
            boolean r2 = r2.mo24539a()
            if (r2 != 0) goto L_0x002f
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22050f
            if (r2 == 0) goto L_0x002f
            boolean r2 = r2.mo24539a()
            if (r2 == 0) goto L_0x002f
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22050f
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r3 = r1.f22045a
            android.util.SparseArray<java.lang.String> r0 = r1.f22046b
            r2.mo24538a(r3, r0)
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22049e
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r3 = r1.f22045a
            r2.mo24537a(r3)
            goto L_0x0038
        L_0x002f:
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22049e
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r3 = r1.f22045a
            android.util.SparseArray<java.lang.String> r0 = r1.f22046b
            r2.mo24538a(r3, r0)
        L_0x0038:
            com.google.android.exoplayer2.upstream.cache.m$c r2 = r1.f22050f
            if (r2 == 0) goto L_0x0042
            r2.mo24540b()
            r2 = 0
            r1.f22050f = r2
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C9475m.mo24526a(long):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C9482q m29072b(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = Util.EMPTY_BYTE_ARRAY;
                int i2 = min;
                int i3 = 0;
                while (i3 != readInt2) {
                    int i4 = i3 + i2;
                    bArr = Arrays.copyOf(bArr, i4);
                    dataInputStream.readFully(bArr, i3, i2);
                    i2 = Math.min(readInt2 - i4, 10485760);
                    i3 = i4;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value size: ");
                sb.append(readInt2);
                throw new IOException(sb.toString());
            }
        }
        return new C9482q(hashMap);
    }

    /* renamed from: c */
    public C9480o mo24530c(String str) {
        C9474l b = mo24528b(str);
        return b != null ? b.mo24511a() : C9482q.f22065c;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"GetInstance"})
    /* renamed from: e */
    public static Cipher m29075e() throws NoSuchPaddingException, NoSuchAlgorithmException {
        String str = "AES/CBC/PKCS5PADDING";
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance(str, "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(str);
    }

    /* renamed from: a */
    public Collection<C9474l> mo24525a() {
        return this.f22045a.values();
    }

    /* renamed from: a */
    public int mo24523a(String str) {
        return mo24532d(str).f22040a;
    }

    /* renamed from: a */
    public String mo24524a(int i) {
        return (String) this.f22046b.get(i);
    }

    /* renamed from: a */
    public void mo24527a(String str, C9481p pVar) {
        C9474l d = mo24532d(str);
        if (d.mo24517a(pVar)) {
            this.f22049e.mo24535a(d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m29073b(C9482q qVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Entry> a = qVar.mo24550a();
        dataOutputStream.writeInt(a.size());
        for (Entry entry : a) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* renamed from: a */
    static int m29068a(SparseArray<String> sparseArray) {
        int i;
        int size = sparseArray.size();
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            int i2 = 0;
            while (i < size && i == sparseArray.keyAt(i)) {
                i2 = i + 1;
            }
        }
        return i;
    }
}
