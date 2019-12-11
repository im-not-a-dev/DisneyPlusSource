package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C10007c {
    /* renamed from: a */
    private static Set<String> m31161a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    static void m31163a(C10099k3 k3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        String str4 = "Monitor must not be null";
        if (k3Var != null) {
            if (!m31164a(k3Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (k3Var != null) {
                try {
                    Set a = m31161a(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String str5 = split[i];
                        if (a.remove(str5)) {
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str5).length());
                            sb.append("Table ");
                            sb.append(str);
                            sb.append(" is missing required column: ");
                            sb.append(str5);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!a.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        k3Var.mo25877w().mo25910a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                    }
                } catch (SQLiteException e) {
                    k3Var.mo25874t().mo25909a("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            } else {
                throw new IllegalArgumentException(str4);
            }
        } else {
            throw new IllegalArgumentException(str4);
        }
    }

    /* renamed from: a */
    private static boolean m31164a(C10099k3 k3Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (k3Var != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                k3Var.mo25877w().mo25910a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: a */
    static void m31162a(C10099k3 k3Var, SQLiteDatabase sQLiteDatabase) {
        if (k3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                k3Var.mo25877w().mo25908a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                k3Var.mo25877w().mo25908a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                k3Var.mo25877w().mo25908a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                k3Var.mo25877w().mo25908a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
