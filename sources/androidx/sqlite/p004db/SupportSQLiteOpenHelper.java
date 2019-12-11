package androidx.sqlite.p004db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper */
public interface SupportSQLiteOpenHelper {

    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$a */
    public static abstract class C0958a {

        /* renamed from: a */
        public final int f3789a;

        public C0958a(int i) {
            this.f3789a = i;
        }

        /* renamed from: a */
        private void m5195a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(str);
                String str2 = "SupportSQLite";
                Log.w(str2, sb.toString());
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not delete the database file ");
                            sb2.append(str);
                            Log.e(str2, sb2.toString());
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w(str2, "delete failed: ", e2);
                }
            }
        }

        /* renamed from: a */
        public void mo5261a(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: a */
        public abstract void mo5262a(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m5195a((java.lang.String) ((android.util.Pair) r3.next()).second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m5195a(r3.mo5310j0());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List) = (r0v3 java.util.List), (r0v4 java.util.List), (r0v4 java.util.List) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5318b(androidx.sqlite.p004db.SupportSQLiteDatabase r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.mo5310j0()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.mo5310j0()
                r2.m5195a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.mo5312n0()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m5195a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.mo5310j0()
                r2.m5195a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m5195a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.mo5310j0()
                r2.m5195a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a.mo5318b(androidx.sqlite.db.SupportSQLiteDatabase):void");
        }

        /* renamed from: b */
        public abstract void mo5263b(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        /* renamed from: c */
        public abstract void mo5264c(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: d */
        public void mo5265d(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$b */
    public static class C0959b {

        /* renamed from: a */
        public final Context f3790a;

        /* renamed from: b */
        public final String f3791b;

        /* renamed from: c */
        public final C0958a f3792c;

        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$b$a */
        public static class C0960a {

            /* renamed from: a */
            Context f3793a;

            /* renamed from: b */
            String f3794b;

            /* renamed from: c */
            C0958a f3795c;

            C0960a(Context context) {
                this.f3793a = context;
            }

            /* renamed from: a */
            public C0959b mo5321a() {
                C0958a aVar = this.f3795c;
                if (aVar != null) {
                    Context context = this.f3793a;
                    if (context != null) {
                        return new C0959b(context, this.f3794b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            /* renamed from: a */
            public C0960a mo5320a(String str) {
                this.f3794b = str;
                return this;
            }

            /* renamed from: a */
            public C0960a mo5319a(C0958a aVar) {
                this.f3795c = aVar;
                return this;
            }
        }

        C0959b(Context context, String str, C0958a aVar) {
            this.f3790a = context;
            this.f3791b = str;
            this.f3792c = aVar;
        }

        /* renamed from: a */
        public static C0960a m5202a(Context context) {
            return new C0960a(context);
        }
    }

    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$c */
    public interface C0961c {
        /* renamed from: a */
        SupportSQLiteOpenHelper mo5322a(C0959b bVar);
    }

    /* renamed from: a */
    void mo5316a(boolean z);

    SupportSQLiteDatabase getWritableDatabase();
}
