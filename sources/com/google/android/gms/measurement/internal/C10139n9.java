package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.google.android.gms.common.internal.C9908u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11022a1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11035b0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11085e0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11285r3;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.C11311a;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
final class C10139n9 extends C10138n8 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f23778f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f23779g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f23780h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f23781i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f23782j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f23783k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f23784l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f23785m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C10150o9 f23786d = new C10150o9(this, mo25895b(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10093j8 f23787e = new C10093j8(mo25896c());

    static {
        String str = "session_scoped";
        f23783k = new String[]{str, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        f23784l = new String[]{str, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    }

    C10139n9(C10126m8 m8Var) {
        super(m8Var);
    }

    /* renamed from: H */
    private final boolean m31660H() {
        return mo25895b().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: a */
    private final long m31669a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo26011x().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private final long m31676b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo26011x().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final boolean mo25970A() {
        return m31676b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final void mo25971B() {
        mo25662j();
        mo25969t();
        if (m31660H()) {
            long a = mo25899f().f23936h.mo26196a();
            long a2 = mo25896c().mo25472a();
            if (Math.abs(a2 - a) > ((Long) C10106l.f23616D.mo26194a(null)).longValue()) {
                mo25899f().f23936h.mo26197a(a2);
                mo25662j();
                mo25969t();
                if (m31660H()) {
                    int delete = mo26011x().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo25896c().mo25474c()), String.valueOf(C10083i9.m31362w())});
                    if (delete > 0) {
                        mo25898e().mo25869B().mo25909a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public final long mo25972C() {
        return m31669a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: D */
    public final long mo25973D() {
        return m31669a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: E */
    public final boolean mo25974E() {
        return m31676b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: F */
    public final boolean mo25975F() {
        return m31676b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: G */
    public final long mo25976G() {
        Cursor cursor = null;
        try {
            cursor = mo26011x().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25909a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo25998c(String str, String str2) {
        C9908u.m30863b(str);
        C9908u.m30863b(str2);
        mo25662j();
        mo25969t();
        try {
            mo25898e().mo25869B().mo25909a("Deleted user attribute rows", Integer.valueOf(mo26011x().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25911a("Error deleting user attribute. appId", C10099k3.m31423a(str), mo25902l().mo25797c(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10221v8 mo25999d(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C9908u.m30863b(r19)
            com.google.android.gms.common.internal.C9908u.m30863b(r20)
            r18.mo25662j()
            r18.mo25969t()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo26011x()     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.m31671a(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.v8 r0 = new com.google.android.gms.measurement.internal.v8     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.k3 r1 = r18.mo25898e()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.mo25909a(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0087
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a7
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0087:
            com.google.android.gms.measurement.internal.k3 r1 = r18.mo25898e()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r19)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.i3 r4 = r18.mo25902l()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = r4.mo25797c(r8)     // Catch:{ all -> 0x00a6 }
            r1.mo25911a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a5
            r10.close()
        L_0x00a5:
            return r9
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            if (r10 == 0) goto L_0x00ac
            r10.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25999d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.v8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10061g9 mo26001e(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C9908u.m30863b(r30)
            com.google.android.gms.common.internal.C9908u.m30863b(r31)
            r29.mo25662j()
            r29.mo25969t()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo26011x()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.m31671a(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.u8 r0 = r29.mo25888n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.j> r2 = com.google.android.gms.measurement.internal.C10084j.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo26114a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.j r22 = (com.google.android.gms.measurement.internal.C10084j) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.u8 r0 = r29.mo25888n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.j> r2 = com.google.android.gms.measurement.internal.C10084j.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo26114a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.j r25 = (com.google.android.gms.measurement.internal.C10084j) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.u8 r0 = r29.mo25888n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.j> r2 = com.google.android.gms.measurement.internal.C10084j.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo26114a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.j r28 = (com.google.android.gms.measurement.internal.C10084j) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.t8 r17 = new com.google.android.gms.measurement.internal.t8     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.g9 r0 = new com.google.android.gms.measurement.internal.g9     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.k3 r1 = r29.mo25898e()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.i3 r4 = r29.mo25902l()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.mo25797c(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.mo25910a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0103
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            r9 = r8
            goto L_0x0123
        L_0x00ff:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0103:
            com.google.android.gms.measurement.internal.k3 r1 = r29.mo25898e()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r30)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.i3 r4 = r29.mo25902l()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r4.mo25797c(r7)     // Catch:{ all -> 0x0122 }
            r1.mo25911a(r2, r3, r4, r0)     // Catch:{ all -> 0x0122 }
            if (r9 == 0) goto L_0x0121
            r9.close()
        L_0x0121:
            return r8
        L_0x0122:
            r0 = move-exception
        L_0x0123:
            if (r9 == 0) goto L_0x0128
            r9.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26001e(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g9");
    }

    /* renamed from: f */
    public final int mo26003f(String str, String str2) {
        C9908u.m30863b(str);
        C9908u.m30863b(str2);
        mo25662j();
        mo25969t();
        try {
            return mo26011x().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25911a("Error deleting conditional property", C10099k3.m31423a(str), mo25902l().mo25797c(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p163g.p449j.p450a.p451a.p457d.p464g.C11035b0>> mo26006g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo25969t()
            r12.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r13)
            com.google.android.gms.common.internal.C9908u.m30863b(r14)
            e.e.a r0 = new e.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo26011x()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x008c }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x008c }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x008c }
            g.j.a.a.d.g.r3 r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x006e }
            g.j.a.a.d.g.b0 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11035b0.m34762a(r1, r2)     // Catch:{ IOException -> 0x006e }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x008c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x008c }
            if (r3 != 0) goto L_0x006a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x008c }
            r3.<init>()     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x008c }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x008c }
        L_0x006a:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x008c }
            goto L_0x0080
        L_0x006e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.k3 r2 = r12.mo25898e()     // Catch:{ SQLiteException -> 0x008c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()     // Catch:{ SQLiteException -> 0x008c }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ SQLiteException -> 0x008c }
            r2.mo25910a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x008c }
        L_0x0080:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x008c }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x008b
            r14.close()
        L_0x008b:
            return r0
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r13 = move-exception
            r14 = r9
            goto L_0x00ab
        L_0x0091:
            r0 = move-exception
            r14 = r9
        L_0x0093:
            com.google.android.gms.measurement.internal.k3 r1 = r12.mo25898e()     // Catch:{ all -> 0x00aa }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ all -> 0x00aa }
            r1.mo25910a(r2, r13, r0)     // Catch:{ all -> 0x00aa }
            if (r14 == 0) goto L_0x00a9
            r14.close()
        L_0x00a9:
            return r9
        L_0x00aa:
            r13 = move-exception
        L_0x00ab:
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26006g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p163g.p449j.p450a.p451a.p457d.p464g.C11085e0>> mo26007h(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo25969t()
            r12.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r13)
            com.google.android.gms.common.internal.C9908u.m30863b(r14)
            e.e.a r0 = new e.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo26011x()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008e }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x008c }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x008c }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x008c }
            g.j.a.a.d.g.r3 r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x006e }
            g.j.a.a.d.g.e0 r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11085e0.m34994a(r1, r2)     // Catch:{ IOException -> 0x006e }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x008c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x008c }
            if (r3 != 0) goto L_0x006a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x008c }
            r3.<init>()     // Catch:{ SQLiteException -> 0x008c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x008c }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x008c }
        L_0x006a:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x008c }
            goto L_0x0080
        L_0x006e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.k3 r2 = r12.mo25898e()     // Catch:{ SQLiteException -> 0x008c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()     // Catch:{ SQLiteException -> 0x008c }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ SQLiteException -> 0x008c }
            r2.mo25910a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x008c }
        L_0x0080:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x008c }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x008b
            r14.close()
        L_0x008b:
            return r0
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r13 = move-exception
            r14 = r9
            goto L_0x00ab
        L_0x0091:
            r0 = move-exception
            r14 = r9
        L_0x0093:
            com.google.android.gms.measurement.internal.k3 r1 = r12.mo25898e()     // Catch:{ all -> 0x00aa }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ all -> 0x00aa }
            r1.mo25910a(r2, r13, r0)     // Catch:{ all -> 0x00aa }
            if (r14 == 0) goto L_0x00a9
            r14.close()
        L_0x00a9:
            return r9
        L_0x00aa:
            r13 = move-exception
        L_0x00ab:
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26007h(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final long mo26008i(String str, String str2) {
        long j;
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        C9908u.m30863b(str);
        C9908u.m30863b(str2);
        mo25662j();
        mo25969t();
        SQLiteDatabase x = mo26011x();
        x.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str6);
            sb.append(" from app2 where app_id=?");
            try {
                j = m31669a(sb.toString(), new String[]{str5}, -1);
                str3 = "app2";
                str4 = "app_id";
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str4, str5);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (x.insertWithOnConflict(str3, null, contentValues, 5) == -1) {
                        mo25898e().mo25874t().mo25910a("Failed to insert column (got -1). appId", C10099k3.m31423a(str), str6);
                        x.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                j = 0;
                try {
                    mo25898e().mo25874t().mo25911a("Error inserting column. appId", C10099k3.m31423a(str), str6, e);
                    x.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    x.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str4, str5);
                contentValues2.put(str6, Long.valueOf(1 + j));
                if (((long) x.update(str3, contentValues2, "app_id = ?", new String[]{str5})) == 0) {
                    mo25898e().mo25874t().mo25910a("Failed to update column (got 0). appId", C10099k3.m31423a(str), str6);
                    x.endTransaction();
                    return -1;
                }
                x.setTransactionSuccessful();
                x.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                mo25898e().mo25874t().mo25911a("Error inserting column. appId", C10099k3.m31423a(str), str6, e);
                x.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            j = 0;
            mo25898e().mo25874t().mo25911a("Error inserting column. appId", C10099k3.m31423a(str), str6, e);
            x.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            x.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo25760u() {
        return false;
    }

    /* renamed from: v */
    public final void mo26009v() {
        mo25969t();
        mo26011x().beginTransaction();
    }

    /* renamed from: w */
    public final void mo26010w() {
        mo25969t();
        mo26011x().endTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final SQLiteDatabase mo26011x() {
        mo25662j();
        try {
            return this.f23786d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo25898e().mo25877w().mo25909a("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: y */
    public final void mo26012y() {
        mo25969t();
        mo26011x().setTransactionSuccessful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo26013z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo26011x()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo25898e()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo25909a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26013z():java.lang.String");
    }

    /* renamed from: a */
    public final void mo25986a(C10040f fVar) {
        C9908u.m30853a(fVar);
        mo25662j();
        mo25969t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", fVar.f23413a);
        contentValues.put("name", fVar.f23414b);
        contentValues.put("lifetime_count", Long.valueOf(fVar.f23415c));
        contentValues.put("current_bundle_count", Long.valueOf(fVar.f23416d));
        contentValues.put("last_fire_timestamp", Long.valueOf(fVar.f23418f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(fVar.f23419g));
        contentValues.put("last_bundled_day", fVar.f23420h);
        contentValues.put("last_sampled_complex_event_id", fVar.f23421i);
        contentValues.put("last_sampling_rate", fVar.f23422j);
        if (mo25900g().mo25821e(fVar.f23413a, C10106l.f23691y0)) {
            contentValues.put("current_session_count", Long.valueOf(fVar.f23417e));
        }
        Boolean bool = fVar.f23423k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo26011x().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo25898e().mo25874t().mo25909a("Failed to insert/update event aggregates (got -1). appId", C10099k3.m31423a(fVar.f23413a));
            }
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing event aggregates. appId", C10099k3.m31423a(fVar.f23413a), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10040f mo25995b(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r15 = r27
            r14 = r28
            com.google.android.gms.common.internal.C9908u.m30863b(r27)
            com.google.android.gms.common.internal.C9908u.m30863b(r28)
            r26.mo25662j()
            r26.mo25969t()
            com.google.android.gms.measurement.internal.i9 r0 = r26.mo25900g()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C10106l.f23691y0
            boolean r0 = r0.mo25821e(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = "current_session_count"
            r1.add(r2)
        L_0x003e:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r2 = r26.mo26011x()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r4 = r1
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.String r5 = "app_id=? and name=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r6[r10] = r15     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r11 = 1
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 != 0) goto L_0x006d
            if (r12 == 0) goto L_0x006c
            r12.close()
        L_0x006c:
            return r18
        L_0x006d:
            long r4 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            long r6 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            long r16 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r1 = 3
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r8 = 0
            if (r2 == 0) goto L_0x0085
            r19 = r8
            goto L_0x008b
        L_0x0085:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r19 = r1
        L_0x008b:
            r1 = 4
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x0095
            r21 = r18
            goto L_0x009f
        L_0x0095:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r21 = r1
        L_0x009f:
            r1 = 5
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x00a9
            r22 = r18
            goto L_0x00b3
        L_0x00a9:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r22 = r1
        L_0x00b3:
            r1 = 6
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x00bd
            r23 = r18
            goto L_0x00c7
        L_0x00bd:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r23 = r1
        L_0x00c7:
            r1 = 7
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 != 0) goto L_0x00e0
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r24 = 1
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            r10 = 1
        L_0x00d9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r24 = r1
            goto L_0x00e2
        L_0x00e0:
            r24 = r18
        L_0x00e2:
            if (r0 == 0) goto L_0x00f1
            r0 = 8
            boolean r1 = r12.isNull(r0)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r1 != 0) goto L_0x00f1
            long r0 = r12.getLong(r0)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r8 = r0
        L_0x00f1:
            com.google.android.gms.measurement.internal.f r0 = new com.google.android.gms.measurement.internal.f     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r1 = r0
            r2 = r27
            r3 = r28
            r10 = r16
            r25 = r12
            r12 = r19
            r14 = r21
            r15 = r22
            r16 = r23
            r17 = r24
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0126 }
            boolean r1 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0126 }
            if (r1 == 0) goto L_0x0120
            com.google.android.gms.measurement.internal.k3 r1 = r26.mo25898e()     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ SQLiteException -> 0x0126 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r27)     // Catch:{ SQLiteException -> 0x0126 }
            r1.mo25909a(r2, r3)     // Catch:{ SQLiteException -> 0x0126 }
        L_0x0120:
            if (r25 == 0) goto L_0x0125
            r25.close()
        L_0x0125:
            return r0
        L_0x0126:
            r0 = move-exception
            goto L_0x0137
        L_0x0128:
            r0 = move-exception
            r25 = r12
            goto L_0x0159
        L_0x012c:
            r0 = move-exception
            r25 = r12
            goto L_0x0137
        L_0x0130:
            r0 = move-exception
            r25 = r18
            goto L_0x0159
        L_0x0134:
            r0 = move-exception
            r25 = r18
        L_0x0137:
            com.google.android.gms.measurement.internal.k3 r1 = r26.mo25898e()     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r27)     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.i3 r4 = r26.mo25902l()     // Catch:{ all -> 0x0158 }
            r5 = r28
            java.lang.String r4 = r4.mo25795a(r5)     // Catch:{ all -> 0x0158 }
            r1.mo25911a(r2, r3, r4, r0)     // Catch:{ all -> 0x0158 }
            if (r25 == 0) goto L_0x0157
            r25.close()
        L_0x0157:
            return r18
        L_0x0158:
            r0 = move-exception
        L_0x0159:
            if (r25 == 0) goto L_0x015e
            r25.close()
        L_0x015e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25995b(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.f");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, p163g.p449j.p450a.p451a.p457d.p464g.C11339v0> mo26004f(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo25969t()
            r11.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo26011x()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 != 0) goto L_0x0033
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r8
        L_0x0033:
            e.e.a r1 = new e.e.a     // Catch:{ SQLiteException -> 0x0072 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0038:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0072 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0072 }
            g.j.a.a.d.g.r3 r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x0050 }
            g.j.a.a.d.g.v0 r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11339v0.m36485a(r3, r4)     // Catch:{ IOException -> 0x0050 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0072 }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x0066
        L_0x0050:
            r3 = move-exception
            com.google.android.gms.measurement.internal.k3 r4 = r11.mo25898e()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r12)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0072 }
            r4.mo25911a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0072 }
        L_0x0066:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0071
            r0.close()
        L_0x0071:
            return r1
        L_0x0072:
            r1 = move-exception
            goto L_0x0079
        L_0x0074:
            r12 = move-exception
            r0 = r8
            goto L_0x0091
        L_0x0077:
            r1 = move-exception
            r0 = r8
        L_0x0079:
            com.google.android.gms.measurement.internal.k3 r2 = r11.mo25898e()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r12)     // Catch:{ all -> 0x0090 }
            r2.mo25910a(r3, r12, r1)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            return r8
        L_0x0090:
            r12 = move-exception
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26004f(java.lang.String):java.util.Map");
    }

    /* renamed from: c */
    public final long mo25997c(String str) {
        C9908u.m30863b(str);
        mo25662j();
        mo25969t();
        try {
            return (long) mo26011x().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo25900g().mo25814b(str, C10106l.f23682u))))});
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error deleting over the limit events. appId", C10099k3.m31423a(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo26000d(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C9908u.m30863b(r11)
            r10.mo25662j()
            r10.mo25969t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.mo26011x()     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.k3 r3 = r10.mo25898e()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.mo25909a(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0059
        L_0x0054:
            r11 = move-exception
            r1 = r0
            goto L_0x0071
        L_0x0057:
            r2 = move-exception
            r1 = r0
        L_0x0059:
            com.google.android.gms.measurement.internal.k3 r3 = r10.mo25898e()     // Catch:{ all -> 0x0070 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r11)     // Catch:{ all -> 0x0070 }
            r3.mo25910a(r4, r11, r2)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x006f
            r1.close()
        L_0x006f:
            return r0
        L_0x0070:
            r11 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26000d(java.lang.String):byte[]");
    }

    /* renamed from: g */
    public final long mo26005g(String str) {
        C9908u.m30863b(str);
        return m31669a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo26002e(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo25969t()
            r7.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r8)
            e.e.a r0 = new e.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.mo26011x()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006c
        L_0x0067:
            r8 = move-exception
            r1 = r2
            goto L_0x0084
        L_0x006a:
            r0 = move-exception
            r1 = r2
        L_0x006c:
            com.google.android.gms.measurement.internal.k3 r3 = r7.mo25898e()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r8)     // Catch:{ all -> 0x0083 }
            r3.mo25910a(r4, r8, r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r2
        L_0x0083:
            r8 = move-exception
        L_0x0084:
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo26002e(java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    public final boolean mo25991a(C10221v8 v8Var) {
        C9908u.m30853a(v8Var);
        mo25662j();
        mo25969t();
        if (mo25999d(v8Var.f24004a, v8Var.f24006c) == null) {
            if (C10251y8.m31984e(v8Var.f24006c)) {
                if (m31676b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{v8Var.f24004a}) >= 25) {
                    return false;
                }
            } else {
                String str = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
                if (mo25900g().mo25821e(v8Var.f24004a, C10106l.f23661j0)) {
                    if (!"_npa".equals(v8Var.f24006c)) {
                        if (m31676b(str, new String[]{v8Var.f24004a, v8Var.f24005b}) >= 25) {
                            return false;
                        }
                    }
                } else {
                    if (m31676b(str, new String[]{v8Var.f24004a, v8Var.f24005b}) >= 25) {
                        return false;
                    }
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", v8Var.f24004a);
        contentValues.put("origin", v8Var.f24005b);
        contentValues.put("name", v8Var.f24006c);
        contentValues.put("set_timestamp", Long.valueOf(v8Var.f24007d));
        m31672a(contentValues, "value", v8Var.f24008e);
        try {
            if (mo26011x().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo25898e().mo25874t().mo25909a("Failed to insert/update user property (got -1). appId", C10099k3.m31423a(v8Var.f24004a));
            }
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing user property. appId", C10099k3.m31423a(v8Var.f24004a), e);
        }
        return true;
    }

    /* renamed from: b */
    public final List<C10061g9> mo25996b(String str, String str2, String str3) {
        C9908u.m30863b(str);
        mo25662j();
        mo25969t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo25984a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0119 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011d A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0153 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0155 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0164 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0179 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0195 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a5 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c0 A[Catch:{ SQLiteException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0204  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10045f4 mo25994b(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r34
            com.google.android.gms.common.internal.C9908u.m30863b(r34)
            r33.mo25662j()
            r33.mo25969t()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r33.mo26011x()     // Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x01e6, all -> 0x01e1 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01d9 }
            if (r4 != 0) goto L_0x0069
            if (r3 == 0) goto L_0x0068
            r3.close()
        L_0x0068:
            return r2
        L_0x0069:
            com.google.android.gms.measurement.internal.f4 r4 = new com.google.android.gms.measurement.internal.f4     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01d9 }
            r5 = r33
            com.google.android.gms.measurement.internal.m8 r6 = r5.f23609b     // Catch:{ SQLiteException -> 0x01d7 }
            com.google.android.gms.measurement.internal.o4 r6 = r6.mo25945r()     // Catch:{ SQLiteException -> 0x01d7 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x01d7 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25700a(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25705b(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25712d(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25721g(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25698a(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25704b(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25719f(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25722g(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25711d(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25715e(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r7 != 0) goto L_0x00d7
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r6 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r6 = 0
            goto L_0x00d8
        L_0x00d7:
            r6 = 1
        L_0x00d8:
            r4.mo25702a(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25729j(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25731k(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25733l(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25735m(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25724h(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25727i(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r7 == 0) goto L_0x011d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0122
        L_0x011d:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01d7 }
        L_0x0122:
            r4.mo25708c(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25716e(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25739o(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25737n(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25725h(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r8 = 0
            if (r7 == 0) goto L_0x0155
            r6 = r8
            goto L_0x0159
        L_0x0155:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d7 }
        L_0x0159:
            r4.mo25741p(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r7 != 0) goto L_0x016d
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r6 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r6 = 0
            goto L_0x016e
        L_0x016d:
            r6 = 1
        L_0x016e:
            r4.mo25706b(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r7 != 0) goto L_0x0181
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r6 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r0 = 0
        L_0x0181:
            r4.mo25710c(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25709c(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r6 == 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            long r8 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x01d7 }
        L_0x019a:
            r4.mo25718f(r8)     // Catch:{ SQLiteException -> 0x01d7 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            if (r6 != 0) goto L_0x01b7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01d7 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01d7 }
            r4.mo25701a(r0)     // Catch:{ SQLiteException -> 0x01d7 }
        L_0x01b7:
            r4.mo25714e()     // Catch:{ SQLiteException -> 0x01d7 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01d7 }
            if (r0 == 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.k3 r0 = r33.mo25898e()     // Catch:{ SQLiteException -> 0x01d7 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()     // Catch:{ SQLiteException -> 0x01d7 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r34)     // Catch:{ SQLiteException -> 0x01d7 }
            r0.mo25909a(r6, r7)     // Catch:{ SQLiteException -> 0x01d7 }
        L_0x01d1:
            if (r3 == 0) goto L_0x01d6
            r3.close()
        L_0x01d6:
            return r4
        L_0x01d7:
            r0 = move-exception
            goto L_0x01ea
        L_0x01d9:
            r0 = move-exception
            r5 = r33
            goto L_0x0202
        L_0x01dd:
            r0 = move-exception
            r5 = r33
            goto L_0x01ea
        L_0x01e1:
            r0 = move-exception
            r5 = r33
            r3 = r2
            goto L_0x0202
        L_0x01e6:
            r0 = move-exception
            r5 = r33
            r3 = r2
        L_0x01ea:
            com.google.android.gms.measurement.internal.k3 r4 = r33.mo25898e()     // Catch:{ all -> 0x0201 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ all -> 0x0201 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r34)     // Catch:{ all -> 0x0201 }
            r4.mo25910a(r6, r1, r0)     // Catch:{ all -> 0x0201 }
            if (r3 == 0) goto L_0x0200
            r3.close()
        L_0x0200:
            return r2
        L_0x0201:
            r0 = move-exception
        L_0x0202:
            if (r3 == 0) goto L_0x0207
            r3.close()
        L_0x0207:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25994b(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C10221v8> mo25981a(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C9908u.m30863b(r14)
            r13.mo25662j()
            r13.mo25969t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo26011x()     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.m31671a(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.k3 r3 = r13.mo25898e()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.mo25909a(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.v8 r3 = new com.google.android.gms.measurement.internal.v8     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0087
        L_0x0082:
            r14 = move-exception
            r2 = r1
            goto L_0x009f
        L_0x0085:
            r0 = move-exception
            r2 = r1
        L_0x0087:
            com.google.android.gms.measurement.internal.k3 r3 = r13.mo25898e()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r14)     // Catch:{ all -> 0x009e }
            r3.mo25910a(r4, r14, r0)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x009d
            r2.close()
        L_0x009d:
            return r1
        L_0x009e:
            r14 = move-exception
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.close()
        L_0x00a4:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25981a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C10221v8> mo25983a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C9908u.m30863b(r22)
            r21.mo25662j()
            r21.mo25969t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo26011x()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            return r0
        L_0x0088:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a4
            com.google.android.gms.measurement.internal.k3 r3 = r21.mo25898e()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r3.mo25909a(r4, r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r12 = r21
            goto L_0x00e3
        L_0x00a4:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.m31671a(r2, r4)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r10 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.k3 r4 = r21.mo25898e()     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r22)     // Catch:{ SQLiteException -> 0x00eb }
            r14 = r24
            r4.mo25911a(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00dd
        L_0x00cf:
            r14 = r24
            com.google.android.gms.measurement.internal.v8 r15 = new com.google.android.gms.measurement.internal.v8     // Catch:{ SQLiteException -> 0x00eb }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00eb }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00dd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r0
        L_0x00e9:
            r5 = r13
            goto L_0x0088
        L_0x00eb:
            r0 = move-exception
            r5 = r13
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            goto L_0x010c
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0124
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x010c
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x010b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0109
        L_0x0100:
            r0 = move-exception
            r12 = r21
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0109:
            r5 = r23
        L_0x010b:
            r2 = r1
        L_0x010c:
            com.google.android.gms.measurement.internal.k3 r3 = r21.mo25898e()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r22)     // Catch:{ all -> 0x0123 }
            r3.mo25911a(r4, r6, r5, r0)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0122
            r2.close()
        L_0x0122:
            return r1
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r1 = r2
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r1.close()
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25983a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo25989a(C10061g9 g9Var) {
        C9908u.m30853a(g9Var);
        mo25662j();
        mo25969t();
        if (mo25999d(g9Var.f23502c, g9Var.f23495V.f23959U) == null) {
            if (m31676b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{g9Var.f23502c}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g9Var.f23502c);
        contentValues.put("origin", g9Var.f23494U);
        contentValues.put("name", g9Var.f23495V.f23959U);
        m31672a(contentValues, "value", g9Var.f23495V.mo26106c());
        contentValues.put("active", Boolean.valueOf(g9Var.f23497X));
        contentValues.put("trigger_event_name", g9Var.f23498Y);
        contentValues.put("trigger_timeout", Long.valueOf(g9Var.f23500a0));
        mo25903m();
        contentValues.put("timed_out_event", C10251y8.m31978a((Parcelable) g9Var.f23499Z));
        contentValues.put("creation_timestamp", Long.valueOf(g9Var.f23496W));
        mo25903m();
        contentValues.put("triggered_event", C10251y8.m31978a((Parcelable) g9Var.f23501b0));
        contentValues.put("triggered_timestamp", Long.valueOf(g9Var.f23495V.f23960V));
        contentValues.put("time_to_live", Long.valueOf(g9Var.f23503c0));
        mo25903m();
        contentValues.put("expired_event", C10251y8.m31978a((Parcelable) g9Var.f23504d0));
        try {
            if (mo26011x().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo25898e().mo25874t().mo25909a("Failed to insert/update conditional user property (got -1)", C10099k3.m31423a(g9Var.f23502c));
            }
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing conditional user property", C10099k3.m31423a(g9Var.f23502c), e);
        }
        return true;
    }

    /* renamed from: a */
    public final List<C10061g9> mo25984a(String str, String[] strArr) {
        mo25662j();
        mo25969t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo26011x().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = m31671a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    C10084j jVar = (C10084j) mo25888n().mo26114a(cursor.getBlob(7), C10084j.CREATOR);
                    long j2 = cursor.getLong(8);
                    C10084j jVar2 = (C10084j) mo25888n().mo26114a(cursor.getBlob(9), C10084j.CREATOR);
                    long j3 = cursor.getLong(10);
                    long j4 = cursor.getLong(11);
                    C10084j jVar3 = (C10084j) mo25888n().mo26114a(cursor.getBlob(12), C10084j.CREATOR);
                    C10201t8 t8Var = new C10201t8(string3, j3, a, string2);
                    boolean z2 = z;
                    C10061g9 g9Var = r3;
                    C10061g9 g9Var2 = new C10061g9(string, string2, t8Var, j2, z2, string4, jVar, j, jVar2, j4, jVar3);
                    arrayList.add(g9Var);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo25898e().mo25874t().mo25909a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25909a("Error querying conditional user property value", e);
            List<C10061g9> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo25985a(C10045f4 f4Var) {
        String str = "apps";
        C9908u.m30853a(f4Var);
        mo25662j();
        mo25969t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.mo25717f());
        contentValues.put("app_instance_id", f4Var.mo25697a());
        contentValues.put("gmp_app_id", f4Var.mo25707c());
        contentValues.put("resettable_device_id_hash", f4Var.mo25723h());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.mo25742q()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.mo25726i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.mo25728j()));
        contentValues.put("app_version", f4Var.mo25730k());
        contentValues.put("app_store", f4Var.mo25734m());
        contentValues.put("gmp_version", Long.valueOf(f4Var.mo25736n()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.mo25738o()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.mo25713d()));
        contentValues.put("day", Long.valueOf(f4Var.mo25746u()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.mo25747v()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.mo25748w()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.mo25749x()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.mo25743r()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.mo25744s()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.mo25732l()));
        contentValues.put("firebase_instance_id", f4Var.mo25703b());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.mo25751z()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.mo25750y()));
        contentValues.put("health_monitor_sample", f4Var.mo25690A());
        contentValues.put("android_id", Long.valueOf(f4Var.mo25692C()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.mo25693D()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.mo25694E()));
        contentValues.put("admob_app_id", f4Var.mo25720g());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.mo25740p()));
        if (f4Var.mo25696G() != null) {
            if (f4Var.mo25696G().size() == 0) {
                mo25898e().mo25877w().mo25909a("Safelisted events should not be an empty list. appId", f4Var.mo25717f());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.mo25696G()));
            }
        }
        try {
            SQLiteDatabase x = mo26011x();
            if (((long) x.update(str, contentValues, "app_id = ?", new String[]{f4Var.mo25717f()})) == 0 && x.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                mo25898e().mo25874t().mo25909a("Failed to insert/update app (got -1). appId", C10099k3.m31423a(f4Var.mo25717f()));
            }
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing app. appId", C10099k3.m31423a(f4Var.mo25717f()), e);
        }
    }

    /* renamed from: a */
    public final C10128m9 mo25979a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C9908u.m30863b(str);
        mo25662j();
        mo25969t();
        String[] strArr = {str};
        C10128m9 m9Var = new C10128m9();
        Cursor cursor = null;
        try {
            SQLiteDatabase x = mo26011x();
            SQLiteDatabase sQLiteDatabase = x;
            cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                mo25898e().mo25877w().mo25909a("Not updating daily counts, app is not known. appId", C10099k3.m31423a(str));
                if (cursor != null) {
                    cursor.close();
                }
                return m9Var;
            }
            if (cursor.getLong(0) == j) {
                m9Var.f23762b = cursor.getLong(1);
                m9Var.f23761a = cursor.getLong(2);
                m9Var.f23763c = cursor.getLong(3);
                m9Var.f23764d = cursor.getLong(4);
                m9Var.f23765e = cursor.getLong(5);
            }
            if (z) {
                m9Var.f23762b++;
            }
            if (z2) {
                m9Var.f23761a++;
            }
            if (z3) {
                m9Var.f23763c++;
            }
            if (z4) {
                m9Var.f23764d++;
            }
            if (z5) {
                m9Var.f23765e++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(m9Var.f23761a));
            contentValues.put("daily_events_count", Long.valueOf(m9Var.f23762b));
            contentValues.put("daily_conversions_count", Long.valueOf(m9Var.f23763c));
            contentValues.put("daily_error_events_count", Long.valueOf(m9Var.f23764d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(m9Var.f23765e));
            x.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return m9Var;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error updating daily counts. appId", C10099k3.m31423a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return m9Var;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo25992a(C11310t0 t0Var, boolean z) {
        mo25662j();
        mo25969t();
        C9908u.m30853a(t0Var);
        C9908u.m30863b(t0Var.mo28944r());
        C9908u.m30864b(t0Var.mo28908K());
        mo25971B();
        long c = mo25896c().mo25474c();
        if (t0Var.mo28902E() < c - C10083i9.m31362w() || t0Var.mo28902E() > C10083i9.m31362w() + c) {
            mo25898e().mo25877w().mo25911a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C10099k3.m31423a(t0Var.mo28944r()), Long.valueOf(c), Long.valueOf(t0Var.mo28902E()));
        }
        try {
            byte[] c2 = mo25888n().mo26124c(t0Var.mo28656f());
            mo25898e().mo25869B().mo25909a("Saving bundle, size", Integer.valueOf(c2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", t0Var.mo28944r());
            contentValues.put("bundle_end_timestamp", Long.valueOf(t0Var.mo28902E()));
            contentValues.put("data", c2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (t0Var.mo28943q0()) {
                contentValues.put("retry_count", Integer.valueOf(t0Var.mo28945r0()));
            }
            try {
                if (mo26011x().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo25898e().mo25874t().mo25909a("Failed to insert bundle (got -1). appId", C10099k3.m31423a(t0Var.mo28944r()));
                return false;
            } catch (SQLiteException e) {
                mo25898e().mo25874t().mo25910a("Error storing bundle. appId", C10099k3.m31423a(t0Var.mo28944r()), e);
                return false;
            }
        } catch (IOException e2) {
            mo25898e().mo25874t().mo25910a("Data loss. Failed to serialize bundle. appId", C10099k3.m31423a(t0Var.mo28944r()), e2);
            return false;
        }
    }

    /* renamed from: a */
    public final List<Pair<C11310t0, Long>> mo25982a(String str, int i, int i2) {
        mo25662j();
        mo25969t();
        C9908u.m30860a(i > 0);
        C9908u.m30860a(i2 > 0);
        C9908u.m30863b(str);
        Cursor cursor = null;
        try {
            cursor = mo26011x().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            if (!cursor.moveToFirst()) {
                List<Pair<C11310t0, Long>> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            do {
                long j = cursor.getLong(0);
                try {
                    byte[] b = mo25888n().mo26123b(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && b.length + i3 > i2) {
                        break;
                    }
                    try {
                        C11311a C0 = C11310t0.m36137C0();
                        C0.mo28728a(b, C11285r3.m36044d());
                        C11311a aVar = C0;
                        if (!cursor.isNull(2)) {
                            aVar.mo28987h(cursor.getInt(2));
                        }
                        i3 += b.length;
                        arrayList.add(Pair.create((C11310t0) ((C11090e4) aVar.mo28446l0()), Long.valueOf(j)));
                    } catch (IOException e) {
                        mo25898e().mo25874t().mo25910a("Failed to merge queued bundle. appId", C10099k3.m31423a(str), e);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e2) {
                    mo25898e().mo25874t().mo25910a("Failed to unzip queued bundle. appId", C10099k3.m31423a(str), e2);
                }
            } while (i3 <= i2);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e3) {
            mo25898e().mo25874t().mo25910a("Error querying bundles. appId", C10099k3.m31423a(str), e3);
            List<Pair<C11310t0, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25988a(List<Long> list) {
        mo25662j();
        mo25969t();
        C9908u.m30853a(list);
        C9908u.m30852a(list.size());
        if (m31660H()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m31676b(sb3.toString(), (String[]) null) > 0) {
                mo25898e().mo25877w().mo25908a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase x = mo26011x();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                x.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo25898e().mo25874t().mo25909a("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25987a(String str, C11022a1[] a1VarArr) {
        boolean z;
        String str2 = str;
        C11022a1[] a1VarArr2 = a1VarArr;
        String str3 = "app_id=? and audience_id=?";
        String str4 = "event_filters";
        String str5 = "app_id=?";
        String str6 = "property_filters";
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        C9908u.m30853a(a1VarArr);
        SQLiteDatabase x = mo26011x();
        x.beginTransaction();
        try {
            mo25969t();
            mo25662j();
            C9908u.m30863b(str);
            SQLiteDatabase x2 = mo26011x();
            x2.delete(str6, str5, new String[]{str2});
            x2.delete(str4, str5, new String[]{str2});
            for (C11022a1 a1Var : a1VarArr2) {
                mo25969t();
                mo25662j();
                C9908u.m30863b(str);
                C9908u.m30853a(a1Var);
                C9908u.m30853a(a1Var.f26044e);
                C9908u.m30853a(a1Var.f26043d);
                if (a1Var.f26042c == null) {
                    mo25898e().mo25877w().mo25909a("Audience with no ID. appId", C10099k3.m31423a(str));
                } else {
                    int intValue = a1Var.f26042c.intValue();
                    C11035b0[] b0VarArr = a1Var.f26044e;
                    int length = b0VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            C11085e0[] e0VarArr = a1Var.f26043d;
                            int length2 = e0VarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    C11035b0[] b0VarArr2 = a1Var.f26044e;
                                    int length3 = b0VarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!m31673a(str2, intValue, b0VarArr2[i3])) {
                                            z = false;
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        C11085e0[] e0VarArr2 = a1Var.f26043d;
                                        int length4 = e0VarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            } else if (!m31674a(str2, intValue, e0VarArr2[i4])) {
                                                z = false;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        mo25969t();
                                        mo25662j();
                                        C9908u.m30863b(str);
                                        SQLiteDatabase x3 = mo26011x();
                                        x3.delete(str6, str3, new String[]{str2, String.valueOf(intValue)});
                                        x3.delete(str4, str3, new String[]{str2, String.valueOf(intValue)});
                                    }
                                } else if (!e0VarArr[i2].mo28417p()) {
                                    mo25898e().mo25877w().mo25910a("Property filter with no ID. Audience definition ignored. appId, audienceId", C10099k3.m31423a(str), a1Var.f26042c);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        } else if (!b0VarArr[i].mo28298q()) {
                            mo25898e().mo25877w().mo25910a("Event filter with no ID. Audience definition ignored. appId, audienceId", C10099k3.m31423a(str), a1Var.f26042c);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C11022a1 a1Var2 : a1VarArr2) {
                arrayList.add(a1Var2.f26042c);
            }
            m31675a(str2, (List<Integer>) arrayList);
            x.setTransactionSuccessful();
        } finally {
            x.endTransaction();
        }
    }

    /* renamed from: a */
    private final boolean m31673a(String str, int i, C11035b0 b0Var) {
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        C9908u.m30853a(b0Var);
        Integer num = null;
        if (TextUtils.isEmpty(b0Var.mo28296o())) {
            C10121m3 w = mo25898e().mo25877w();
            Object a = C10099k3.m31423a(str);
            Integer valueOf = Integer.valueOf(i);
            if (b0Var.mo28298q()) {
                num = Integer.valueOf(b0Var.mo28295n());
            }
            w.mo25911a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = b0Var.mo28656f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", b0Var.mo28298q() ? Integer.valueOf(b0Var.mo28295n()) : null);
        contentValues.put("event_name", b0Var.mo28296o());
        if (mo25900g().mo25821e(str, C10106l.f23689x0)) {
            contentValues.put("session_scoped", b0Var.mo28304w() ? Boolean.valueOf(b0Var.mo28305x()) : null);
        }
        contentValues.put("data", f);
        try {
            if (mo26011x().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                mo25898e().mo25874t().mo25909a("Failed to insert event filter (got -1). appId", C10099k3.m31423a(str));
            }
            return true;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing event filter. appId", C10099k3.m31423a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m31674a(String str, int i, C11085e0 e0Var) {
        mo25969t();
        mo25662j();
        C9908u.m30863b(str);
        C9908u.m30853a(e0Var);
        Integer num = null;
        if (TextUtils.isEmpty(e0Var.mo28416o())) {
            C10121m3 w = mo25898e().mo25877w();
            Object a = C10099k3.m31423a(str);
            Integer valueOf = Integer.valueOf(i);
            if (e0Var.mo28417p()) {
                num = Integer.valueOf(e0Var.mo28415n());
            }
            w.mo25911a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = e0Var.mo28656f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", e0Var.mo28417p() ? Integer.valueOf(e0Var.mo28415n()) : null);
        contentValues.put("property_name", e0Var.mo28416o());
        if (mo25900g().mo25821e(str, C10106l.f23689x0)) {
            contentValues.put("session_scoped", e0Var.mo28420s() ? Boolean.valueOf(e0Var.mo28421t()) : null);
        }
        contentValues.put("data", f);
        try {
            if (mo26011x().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo25898e().mo25874t().mo25909a("Failed to insert property filter (got -1). appId", C10099k3.m31423a(str));
            return false;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing property filter. appId", C10099k3.m31423a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m31675a(String str, List<Integer> list) {
        C9908u.m30863b(str);
        mo25969t();
        mo25662j();
        SQLiteDatabase x = mo26011x();
        try {
            long b = m31676b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo25900g().mo25814b(str, C10106l.f23626K)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return x.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Database error querying filters. appId", C10099k3.m31423a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    private static void m31672a(ContentValues contentValues, String str, Object obj) {
        C9908u.m30863b(str);
        C9908u.m30853a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    private final Object m31671a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo25898e().mo25874t().mo25908a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo25898e().mo25874t().mo25909a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo25898e().mo25874t().mo25908a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: a */
    public final long mo25977a(C11310t0 t0Var) throws IOException {
        mo25662j();
        mo25969t();
        C9908u.m30853a(t0Var);
        C9908u.m30863b(t0Var.mo28944r());
        byte[] f = t0Var.mo28656f();
        long a = mo25888n().mo26113a(f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t0Var.mo28944r());
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", f);
        try {
            mo26011x().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing raw event metadata. appId", C10099k3.m31423a(t0Var.mo28944r()), e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo25980a(long r5) {
        /*
            r4 = this;
            r4.mo25662j()
            r4.mo25969t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo26011x()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo25869B()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo25908a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.measurement.internal.k3 r1 = r4.mo25898e()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo25909a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25980a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<p163g.p449j.p450a.p451a.p457d.p464g.C11253p0, java.lang.Long> mo25978a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo25662j()
            r7.mo25969t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo26011x()     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006d }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.k3 r8 = r7.mo25898e()     // Catch:{ SQLiteException -> 0x006d }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25869B()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r9 = "Main event not found"
            r8.mo25908a(r9)     // Catch:{ SQLiteException -> 0x006d }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x006d }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x006d }
            g.j.a.a.d.g.r3 r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x0055 }
            g.j.a.a.d.g.p0 r8 = p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.m35876a(r2, r4)     // Catch:{ IOException -> 0x0055 }
            android.util.Pair r8 = android.util.Pair.create(r8, r3)     // Catch:{ SQLiteException -> 0x006d }
            if (r1 == 0) goto L_0x0054
            r1.close()
        L_0x0054:
            return r8
        L_0x0055:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k3 r3 = r7.mo25898e()     // Catch:{ SQLiteException -> 0x006d }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r8)     // Catch:{ SQLiteException -> 0x006d }
            r3.mo25911a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x006d }
            if (r1 == 0) goto L_0x006c
            r1.close()
        L_0x006c:
            return r0
        L_0x006d:
            r8 = move-exception
            goto L_0x0074
        L_0x006f:
            r8 = move-exception
            r1 = r0
            goto L_0x0088
        L_0x0072:
            r8 = move-exception
            r1 = r0
        L_0x0074:
            com.google.android.gms.measurement.internal.k3 r9 = r7.mo25898e()     // Catch:{ all -> 0x0087 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = "Error selecting main event"
            r9.mo25909a(r2, r8)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0086
            r1.close()
        L_0x0086:
            return r0
        L_0x0087:
            r8 = move-exception
        L_0x0088:
            if (r1 == 0) goto L_0x008d
            r1.close()
        L_0x008d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10139n9.mo25978a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo25993a(String str, Long l, long j, C11253p0 p0Var) {
        mo25662j();
        mo25969t();
        C9908u.m30853a(p0Var);
        C9908u.m30863b(str);
        C9908u.m30853a(l);
        byte[] f = p0Var.mo28656f();
        mo25898e().mo25869B().mo25910a("Saving complex main event, appId, data size", mo25902l().mo25795a(str), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", f);
        try {
            if (mo26011x().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo25898e().mo25874t().mo25909a("Failed to insert complex main event (got -1). appId", C10099k3.m31423a(str));
            return false;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing complex main event. appId", C10099k3.m31423a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo25990a(C10051g gVar, long j, boolean z) {
        mo25662j();
        mo25969t();
        C9908u.m30853a(gVar);
        C9908u.m30863b(gVar.f23470a);
        C11254a x = C11253p0.m35894x();
        x.mo28815b(gVar.f23474e);
        Iterator it = gVar.f23475f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C11282a x2 = C11281r0.m35991x();
            x2.mo28858a(str);
            mo25888n().mo26119a(x2, gVar.f23475f.mo25783a(str));
            x.mo28810a(x2);
        }
        byte[] f = ((C11253p0) x.mo28446l0()).mo28656f();
        mo25898e().mo25869B().mo25910a("Saving event, name, data size", mo25902l().mo25795a(gVar.f23471b), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.f23470a);
        contentValues.put("name", gVar.f23471b);
        contentValues.put(StreamSampleTelemetryData.TIMESTAMP_KEY, Long.valueOf(gVar.f23473d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", f);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo26011x().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo25898e().mo25874t().mo25909a("Failed to insert raw event (got -1). appId", C10099k3.m31423a(gVar.f23470a));
            return false;
        } catch (SQLiteException e) {
            mo25898e().mo25874t().mo25910a("Error storing raw event. appId", C10099k3.m31423a(gVar.f23470a), e);
            return false;
        }
    }
}
