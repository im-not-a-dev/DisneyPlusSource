package androidx.work.impl.p011m;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.p003k.C0947c;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import androidx.work.C1027c;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import androidx.work.impl.p011m.C1111j.C1113b;
import androidx.work.impl.p011m.C1111j.C1114c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p096e.p113e.C3926a;

/* renamed from: androidx.work.impl.m.l */
/* compiled from: WorkSpecDao_Impl */
public final class C1116l implements C1115k {

    /* renamed from: a */
    private final RoomDatabase f4302a;

    /* renamed from: b */
    private final EntityInsertionAdapter f4303b;

    /* renamed from: c */
    private final SharedSQLiteStatement f4304c;

    /* renamed from: d */
    private final SharedSQLiteStatement f4305d;

    /* renamed from: e */
    private final SharedSQLiteStatement f4306e;

    /* renamed from: f */
    private final SharedSQLiteStatement f4307f;

    /* renamed from: g */
    private final SharedSQLiteStatement f4308g;

    /* renamed from: h */
    private final SharedSQLiteStatement f4309h;

    /* renamed from: i */
    private final SharedSQLiteStatement f4310i;

    /* renamed from: androidx.work.impl.m.l$a */
    /* compiled from: WorkSpecDao_Impl */
    class C1117a extends EntityInsertionAdapter<C1111j> {
        C1117a(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C1111j jVar) {
            String str = jVar.f4280a;
            if (str == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, str);
            }
            supportSQLiteStatement.mo5237a(2, (long) C1130p.m5881a(jVar.f4281b));
            String str2 = jVar.f4282c;
            if (str2 == null) {
                supportSQLiteStatement.mo5235a(3);
            } else {
                supportSQLiteStatement.mo5238a(3, str2);
            }
            String str3 = jVar.f4283d;
            if (str3 == null) {
                supportSQLiteStatement.mo5235a(4);
            } else {
                supportSQLiteStatement.mo5238a(4, str3);
            }
            byte[] a = Data.m5451a(jVar.f4284e);
            if (a == null) {
                supportSQLiteStatement.mo5235a(5);
            } else {
                supportSQLiteStatement.mo5239a(5, a);
            }
            byte[] a2 = Data.m5451a(jVar.f4285f);
            if (a2 == null) {
                supportSQLiteStatement.mo5235a(6);
            } else {
                supportSQLiteStatement.mo5239a(6, a2);
            }
            supportSQLiteStatement.mo5237a(7, jVar.f4286g);
            supportSQLiteStatement.mo5237a(8, jVar.f4287h);
            supportSQLiteStatement.mo5237a(9, jVar.f4288i);
            supportSQLiteStatement.mo5237a(10, (long) jVar.f4290k);
            supportSQLiteStatement.mo5237a(11, (long) C1130p.m5882a(jVar.f4291l));
            supportSQLiteStatement.mo5237a(12, jVar.f4292m);
            supportSQLiteStatement.mo5237a(13, jVar.f4293n);
            supportSQLiteStatement.mo5237a(14, jVar.f4294o);
            supportSQLiteStatement.mo5237a(15, jVar.f4295p);
            C1027c cVar = jVar.f4289j;
            if (cVar != null) {
                supportSQLiteStatement.mo5237a(16, (long) C1130p.m5883a(cVar.mo5668b()));
                supportSQLiteStatement.mo5237a(17, cVar.mo5678g() ? 1 : 0);
                supportSQLiteStatement.mo5237a(18, cVar.mo5679h() ? 1 : 0);
                supportSQLiteStatement.mo5237a(19, cVar.mo5677f() ? 1 : 0);
                supportSQLiteStatement.mo5237a(20, cVar.mo5681i() ? 1 : 0);
                supportSQLiteStatement.mo5237a(21, cVar.mo5671c());
                supportSQLiteStatement.mo5237a(22, cVar.mo5673d());
                byte[] a3 = C1130p.m5886a(cVar.mo5663a());
                if (a3 == null) {
                    supportSQLiteStatement.mo5235a(23);
                } else {
                    supportSQLiteStatement.mo5239a(23, a3);
                }
            } else {
                supportSQLiteStatement.mo5235a(16);
                supportSQLiteStatement.mo5235a(17);
                supportSQLiteStatement.mo5235a(18);
                supportSQLiteStatement.mo5235a(19);
                supportSQLiteStatement.mo5235a(20);
                supportSQLiteStatement.mo5235a(21);
                supportSQLiteStatement.mo5235a(22);
                supportSQLiteStatement.mo5235a(23);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: androidx.work.impl.m.l$b */
    /* compiled from: WorkSpecDao_Impl */
    class C1118b extends SharedSQLiteStatement {
        C1118b(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$c */
    /* compiled from: WorkSpecDao_Impl */
    class C1119c extends SharedSQLiteStatement {
        C1119c(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$d */
    /* compiled from: WorkSpecDao_Impl */
    class C1120d extends SharedSQLiteStatement {
        C1120d(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$e */
    /* compiled from: WorkSpecDao_Impl */
    class C1121e extends SharedSQLiteStatement {
        C1121e(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$f */
    /* compiled from: WorkSpecDao_Impl */
    class C1122f extends SharedSQLiteStatement {
        C1122f(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$g */
    /* compiled from: WorkSpecDao_Impl */
    class C1123g extends SharedSQLiteStatement {
        C1123g(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.m.l$h */
    /* compiled from: WorkSpecDao_Impl */
    class C1124h extends SharedSQLiteStatement {
        C1124h(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.m.l$i */
    /* compiled from: WorkSpecDao_Impl */
    class C1125i extends SharedSQLiteStatement {
        C1125i(C1116l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C1116l(RoomDatabase roomDatabase) {
        this.f4302a = roomDatabase;
        this.f4303b = new C1117a(this, roomDatabase);
        this.f4304c = new C1118b(this, roomDatabase);
        this.f4305d = new C1119c(this, roomDatabase);
        this.f4306e = new C1120d(this, roomDatabase);
        this.f4307f = new C1121e(this, roomDatabase);
        this.f4308g = new C1122f(this, roomDatabase);
        this.f4309h = new C1123g(this, roomDatabase);
        this.f4310i = new C1124h(this, roomDatabase);
        new C1125i(this, roomDatabase);
    }

    /* renamed from: a */
    public void mo5870a(C1111j jVar) {
        this.f4302a.beginTransaction();
        try {
            this.f4303b.insert(jVar);
            this.f4302a.setTransactionSuccessful();
        } finally {
            this.f4302a.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo5875b(String str, long j) {
        SupportSQLiteStatement acquire = this.f4306e.acquire();
        this.f4302a.beginTransaction();
        try {
            acquire.mo5237a(1, j);
            if (str == null) {
                acquire.mo5235a(2);
            } else {
                acquire.mo5238a(2, str);
            }
            acquire.mo5323k0();
            this.f4302a.setTransactionSuccessful();
        } finally {
            this.f4302a.endTransaction();
            this.f4306e.release(acquire);
        }
    }

    /* renamed from: c */
    public List<String> mo5877c(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4302a.query(b);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: d */
    public int mo5878d() {
        SupportSQLiteStatement acquire = this.f4310i.acquire();
        this.f4302a.beginTransaction();
        try {
            int k0 = acquire.mo5323k0();
            this.f4302a.setTransactionSuccessful();
            return k0;
        } finally {
            this.f4302a.endTransaction();
            this.f4310i.release(acquire);
        }
    }

    /* renamed from: e */
    public State mo5880e(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4302a.query(b);
        try {
            return query.moveToFirst() ? C1130p.m5888c(query.getInt(0)) : null;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: f */
    public C1111j mo5881f(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        C1111j jVar;
        String str2 = str;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str2);
        }
        Cursor query = this.f4302a.query(b);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = b;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow);
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i8 = columnIndexOrThrow7;
                    C1027c cVar = new C1027c();
                    cVar.mo5666a(C1130p.m5887b(query.getInt(columnIndexOrThrow16)));
                    int i9 = query.getInt(columnIndexOrThrow17);
                    boolean z = false;
                    cVar.mo5670b(i9 != 0);
                    cVar.mo5672c(query.getInt(columnIndexOrThrow18) != 0);
                    cVar.mo5667a(query.getInt(columnIndexOrThrow19) != 0);
                    if (query.getInt(columnIndexOrThrow20) != 0) {
                        z = true;
                    }
                    cVar.mo5674d(z);
                    cVar.mo5664a(query.getLong(columnIndexOrThrow21));
                    cVar.mo5669b(query.getLong(columnIndexOrThrow22));
                    cVar.mo5665a(C1130p.m5885a(query.getBlob(columnIndexOrThrow23)));
                    jVar = new C1111j(string, string2);
                    jVar.f4281b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                    jVar.f4283d = query.getString(columnIndexOrThrow4);
                    jVar.f4284e = Data.m5450a(query.getBlob(columnIndexOrThrow5));
                    jVar.f4285f = Data.m5450a(query.getBlob(columnIndexOrThrow6));
                    jVar.f4286g = query.getLong(i8);
                    jVar.f4287h = query.getLong(i7);
                    jVar.f4288i = query.getLong(i6);
                    jVar.f4290k = query.getInt(i5);
                    jVar.f4291l = C1130p.m5884a(query.getInt(i4));
                    jVar.f4292m = query.getLong(i3);
                    jVar.f4293n = query.getLong(i2);
                    jVar.f4294o = query.getLong(i);
                    jVar.f4295p = query.getLong(columnIndexOrThrow15);
                    jVar.f4289j = cVar;
                } else {
                    jVar = null;
                }
                query.close();
                roomSQLiteQuery.mo5242b();
                return jVar;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            query.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    /* renamed from: g */
    public int mo5882g(String str) {
        SupportSQLiteStatement acquire = this.f4308g.acquire();
        this.f4302a.beginTransaction();
        if (str == null) {
            try {
                acquire.mo5235a(1);
            } catch (Throwable th) {
                this.f4302a.endTransaction();
                this.f4308g.release(acquire);
                throw th;
            }
        } else {
            acquire.mo5238a(1, str);
        }
        int k0 = acquire.mo5323k0();
        this.f4302a.setTransactionSuccessful();
        this.f4302a.endTransaction();
        this.f4308g.release(acquire);
        return k0;
    }

    /* renamed from: h */
    public List<C1114c> mo5883h(String str) {
        Cursor query;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        this.f4302a.beginTransaction();
        try {
            query = this.f4302a.query(b);
            C3926a aVar = new C3926a();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C1114c cVar = new C1114c();
                cVar.f4298a = query.getString(columnIndexOrThrow);
                cVar.f4299b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                cVar.f4300c = Data.m5450a(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList2 = (ArrayList) aVar.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        aVar.put(string, arrayList2);
                    }
                    cVar.f4301d = arrayList2;
                }
                arrayList.add(cVar);
            }
            m5853a(aVar);
            this.f4302a.setTransactionSuccessful();
            query.close();
            b.mo5242b();
            this.f4302a.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.f4302a.endTransaction();
            throw th;
        }
    }

    /* renamed from: i */
    public List<Data> mo5884i(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4302a.query(b);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(Data.m5450a(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: j */
    public int mo5885j(String str) {
        SupportSQLiteStatement acquire = this.f4307f.acquire();
        this.f4302a.beginTransaction();
        if (str == null) {
            try {
                acquire.mo5235a(1);
            } catch (Throwable th) {
                this.f4302a.endTransaction();
                this.f4307f.release(acquire);
                throw th;
            }
        } else {
            acquire.mo5238a(1, str);
        }
        int k0 = acquire.mo5323k0();
        this.f4302a.setTransactionSuccessful();
        this.f4302a.endTransaction();
        this.f4307f.release(acquire);
        return k0;
    }

    /* renamed from: k */
    public List<C1114c> mo5886k(String str) {
        Cursor query;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        this.f4302a.beginTransaction();
        try {
            query = this.f4302a.query(b);
            C3926a aVar = new C3926a();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C1114c cVar = new C1114c();
                cVar.f4298a = query.getString(columnIndexOrThrow);
                cVar.f4299b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                cVar.f4300c = Data.m5450a(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList2 = (ArrayList) aVar.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        aVar.put(string, arrayList2);
                    }
                    cVar.f4301d = arrayList2;
                }
                arrayList.add(cVar);
            }
            m5853a(aVar);
            this.f4302a.setTransactionSuccessful();
            query.close();
            b.mo5242b();
            this.f4302a.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.f4302a.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo5871a(String str) {
        SupportSQLiteStatement acquire = this.f4304c.acquire();
        this.f4302a.beginTransaction();
        if (str == null) {
            try {
                acquire.mo5235a(1);
            } catch (Throwable th) {
                this.f4302a.endTransaction();
                this.f4304c.release(acquire);
                throw th;
            }
        } else {
            acquire.mo5238a(1, str);
        }
        acquire.mo5323k0();
        this.f4302a.setTransactionSuccessful();
        this.f4302a.endTransaction();
        this.f4304c.release(acquire);
    }

    /* renamed from: d */
    public C1114c mo5879d(String str) {
        Cursor query;
        C1114c cVar;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id, state, output FROM workspec WHERE id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        this.f4302a.beginTransaction();
        try {
            query = this.f4302a.query(b);
            C3926a aVar = new C3926a();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            if (query.moveToFirst()) {
                cVar = new C1114c();
                cVar.f4298a = query.getString(columnIndexOrThrow);
                cVar.f4299b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                cVar.f4300c = Data.m5450a(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList = (ArrayList) aVar.get(string);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        aVar.put(string, arrayList);
                    }
                    cVar.f4301d = arrayList;
                }
            } else {
                cVar = null;
            }
            m5853a(aVar);
            this.f4302a.setTransactionSuccessful();
            query.close();
            b.mo5242b();
            this.f4302a.endTransaction();
            return cVar;
        } catch (Throwable th) {
            this.f4302a.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    public List<C1113b> mo5874b(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4302a.query(b);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C1113b bVar = new C1113b();
                bVar.f4296a = query.getString(columnIndexOrThrow);
                bVar.f4297b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: c */
    public List<String> mo5876c() {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor query = this.f4302a.query(b);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: a */
    public void mo5872a(String str, Data data) {
        SupportSQLiteStatement acquire = this.f4305d.acquire();
        this.f4302a.beginTransaction();
        try {
            byte[] a = Data.m5451a(data);
            if (a == null) {
                acquire.mo5235a(1);
            } else {
                acquire.mo5239a(1, a);
            }
            if (str == null) {
                acquire.mo5235a(2);
            } else {
                acquire.mo5238a(2, str);
            }
            acquire.mo5323k0();
            this.f4302a.setTransactionSuccessful();
        } finally {
            this.f4302a.endTransaction();
            this.f4305d.release(acquire);
        }
    }

    /* renamed from: a */
    public int mo5867a(String str, long j) {
        SupportSQLiteStatement acquire = this.f4309h.acquire();
        this.f4302a.beginTransaction();
        try {
            acquire.mo5237a(1, j);
            if (str == null) {
                acquire.mo5235a(2);
            } else {
                acquire.mo5238a(2, str);
            }
            int k0 = acquire.mo5323k0();
            this.f4302a.setTransactionSuccessful();
            return k0;
        } finally {
            this.f4302a.endTransaction();
            this.f4309h.release(acquire);
        }
    }

    /* renamed from: b */
    public List<C1111j> mo5873b() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM workspec WHERE state=0", 0);
        Cursor query = this.f4302a.query(b);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = b;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    C1027c cVar = new C1027c();
                    int i12 = columnIndexOrThrow16;
                    cVar.mo5666a(C1130p.m5887b(query.getInt(columnIndexOrThrow16)));
                    cVar.mo5670b(query.getInt(columnIndexOrThrow17) != 0);
                    cVar.mo5672c(query.getInt(columnIndexOrThrow18) != 0);
                    cVar.mo5667a(query.getInt(columnIndexOrThrow19) != 0);
                    cVar.mo5674d(query.getInt(columnIndexOrThrow20) != 0);
                    int i13 = columnIndexOrThrow18;
                    cVar.mo5664a(query.getLong(columnIndexOrThrow21));
                    cVar.mo5669b(query.getLong(columnIndexOrThrow22));
                    cVar.mo5665a(C1130p.m5885a(query.getBlob(columnIndexOrThrow23)));
                    C1111j jVar = new C1111j(string, string2);
                    jVar.f4281b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                    jVar.f4283d = query.getString(columnIndexOrThrow4);
                    jVar.f4284e = Data.m5450a(query.getBlob(columnIndexOrThrow5));
                    int i14 = i9;
                    jVar.f4285f = Data.m5450a(query.getBlob(i14));
                    i9 = i14;
                    int i15 = columnIndexOrThrow17;
                    int i16 = i8;
                    jVar.f4286g = query.getLong(i16);
                    i8 = i16;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i7;
                    jVar.f4287h = query.getLong(i18);
                    i7 = i18;
                    int i19 = i17;
                    int i20 = i6;
                    jVar.f4288i = query.getLong(i20);
                    int i21 = i5;
                    jVar.f4290k = query.getInt(i21);
                    int i22 = i4;
                    i5 = i21;
                    jVar.f4291l = C1130p.m5884a(query.getInt(i22));
                    i6 = i20;
                    int i23 = i3;
                    int i24 = i19;
                    jVar.f4292m = query.getLong(i23);
                    int i25 = i23;
                    i4 = i22;
                    int i26 = i2;
                    jVar.f4293n = query.getLong(i26);
                    i2 = i26;
                    int i27 = i25;
                    int i28 = i;
                    jVar.f4294o = query.getLong(i28);
                    i = i28;
                    int i29 = i27;
                    int i30 = columnIndexOrThrow15;
                    jVar.f4295p = query.getLong(i30);
                    jVar.f4289j = cVar;
                    arrayList.add(jVar);
                    columnIndexOrThrow15 = i30;
                    columnIndexOrThrow17 = i15;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow16 = i12;
                    int i31 = i24;
                    i3 = i29;
                    columnIndexOrThrow2 = i31;
                }
                query.close();
                roomSQLiteQuery.mo5242b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            query.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    /* renamed from: a */
    public List<C1111j> mo5869a(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        b.mo5237a(1, (long) i);
        Cursor query = this.f4302a.query(b);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = b;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                int i10 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    C1027c cVar = new C1027c();
                    int i13 = columnIndexOrThrow16;
                    cVar.mo5666a(C1130p.m5887b(query.getInt(columnIndexOrThrow16)));
                    cVar.mo5670b(query.getInt(columnIndexOrThrow17) != 0);
                    cVar.mo5672c(query.getInt(columnIndexOrThrow18) != 0);
                    cVar.mo5667a(query.getInt(columnIndexOrThrow19) != 0);
                    cVar.mo5674d(query.getInt(columnIndexOrThrow20) != 0);
                    int i14 = columnIndexOrThrow18;
                    cVar.mo5664a(query.getLong(columnIndexOrThrow21));
                    cVar.mo5669b(query.getLong(columnIndexOrThrow22));
                    cVar.mo5665a(C1130p.m5885a(query.getBlob(columnIndexOrThrow23)));
                    C1111j jVar = new C1111j(string, string2);
                    jVar.f4281b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                    jVar.f4283d = query.getString(columnIndexOrThrow4);
                    jVar.f4284e = Data.m5450a(query.getBlob(columnIndexOrThrow5));
                    int i15 = i10;
                    jVar.f4285f = Data.m5450a(query.getBlob(i15));
                    i10 = i15;
                    int i16 = columnIndexOrThrow17;
                    int i17 = i9;
                    jVar.f4286g = query.getLong(i17);
                    i9 = i17;
                    int i18 = columnIndexOrThrow2;
                    int i19 = i8;
                    jVar.f4287h = query.getLong(i19);
                    i8 = i19;
                    int i20 = i18;
                    int i21 = i7;
                    jVar.f4288i = query.getLong(i21);
                    int i22 = i6;
                    jVar.f4290k = query.getInt(i22);
                    int i23 = i5;
                    i6 = i22;
                    jVar.f4291l = C1130p.m5884a(query.getInt(i23));
                    i7 = i21;
                    int i24 = i4;
                    int i25 = i20;
                    jVar.f4292m = query.getLong(i24);
                    int i26 = i24;
                    i5 = i23;
                    int i27 = i3;
                    jVar.f4293n = query.getLong(i27);
                    i3 = i27;
                    int i28 = i26;
                    int i29 = i2;
                    jVar.f4294o = query.getLong(i29);
                    int i30 = columnIndexOrThrow15;
                    i2 = i29;
                    int i31 = i28;
                    jVar.f4295p = query.getLong(i30);
                    jVar.f4289j = cVar;
                    arrayList.add(jVar);
                    columnIndexOrThrow15 = i30;
                    columnIndexOrThrow17 = i16;
                    columnIndexOrThrow = i11;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow18 = i14;
                    columnIndexOrThrow16 = i13;
                    int i32 = i25;
                    i4 = i31;
                    columnIndexOrThrow2 = i32;
                }
                query.close();
                roomSQLiteQuery.mo5242b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            query.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    /* renamed from: a */
    public List<C1111j> mo5868a() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor query = this.f4302a.query(b);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = b;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    C1027c cVar = new C1027c();
                    int i12 = columnIndexOrThrow16;
                    cVar.mo5666a(C1130p.m5887b(query.getInt(columnIndexOrThrow16)));
                    cVar.mo5670b(query.getInt(columnIndexOrThrow17) != 0);
                    cVar.mo5672c(query.getInt(columnIndexOrThrow18) != 0);
                    cVar.mo5667a(query.getInt(columnIndexOrThrow19) != 0);
                    cVar.mo5674d(query.getInt(columnIndexOrThrow20) != 0);
                    int i13 = columnIndexOrThrow18;
                    cVar.mo5664a(query.getLong(columnIndexOrThrow21));
                    cVar.mo5669b(query.getLong(columnIndexOrThrow22));
                    cVar.mo5665a(C1130p.m5885a(query.getBlob(columnIndexOrThrow23)));
                    C1111j jVar = new C1111j(string, string2);
                    jVar.f4281b = C1130p.m5888c(query.getInt(columnIndexOrThrow2));
                    jVar.f4283d = query.getString(columnIndexOrThrow4);
                    jVar.f4284e = Data.m5450a(query.getBlob(columnIndexOrThrow5));
                    int i14 = i9;
                    jVar.f4285f = Data.m5450a(query.getBlob(i14));
                    i9 = i14;
                    int i15 = columnIndexOrThrow17;
                    int i16 = i8;
                    jVar.f4286g = query.getLong(i16);
                    i8 = i16;
                    int i17 = columnIndexOrThrow2;
                    int i18 = i7;
                    jVar.f4287h = query.getLong(i18);
                    i7 = i18;
                    int i19 = i17;
                    int i20 = i6;
                    jVar.f4288i = query.getLong(i20);
                    int i21 = i5;
                    jVar.f4290k = query.getInt(i21);
                    int i22 = i4;
                    i5 = i21;
                    jVar.f4291l = C1130p.m5884a(query.getInt(i22));
                    i6 = i20;
                    int i23 = i3;
                    int i24 = i19;
                    jVar.f4292m = query.getLong(i23);
                    int i25 = i23;
                    i4 = i22;
                    int i26 = i2;
                    jVar.f4293n = query.getLong(i26);
                    i2 = i26;
                    int i27 = i25;
                    int i28 = i;
                    jVar.f4294o = query.getLong(i28);
                    i = i28;
                    int i29 = i27;
                    int i30 = columnIndexOrThrow15;
                    jVar.f4295p = query.getLong(i30);
                    jVar.f4289j = cVar;
                    arrayList.add(jVar);
                    columnIndexOrThrow15 = i30;
                    columnIndexOrThrow17 = i15;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow16 = i12;
                    int i31 = i24;
                    i3 = i29;
                    columnIndexOrThrow2 = i31;
                }
                query.close();
                roomSQLiteQuery.mo5242b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.mo5242b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = b;
            query.close();
            roomSQLiteQuery.mo5242b();
            throw th;
        }
    }

    /* renamed from: a */
    public int mo5866a(State state, String... strArr) {
        StringBuilder a = C0947c.m5159a();
        a.append("UPDATE workspec SET state=");
        a.append("?");
        a.append(" WHERE id IN (");
        C0947c.m5160a(a, strArr.length);
        a.append(")");
        SupportSQLiteStatement compileStatement = this.f4302a.compileStatement(a.toString());
        compileStatement.mo5237a(1, (long) C1130p.m5881a(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.mo5235a(i);
            } else {
                compileStatement.mo5238a(i, str);
            }
            i++;
        }
        this.f4302a.beginTransaction();
        try {
            int k0 = compileStatement.mo5323k0();
            this.f4302a.setTransactionSuccessful();
            return k0;
        } finally {
            this.f4302a.endTransaction();
        }
    }

    /* renamed from: a */
    private void m5853a(C3926a<String, ArrayList<String>> aVar) {
        int i;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C3926a aVar2 = new C3926a(999);
                int size = aVar.size();
                C3926a aVar3 = aVar2;
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        aVar3.put(aVar.mo14151b(i2), aVar.mo14157d(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            m5853a(aVar3);
                            aVar3 = new C3926a(999);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    m5853a(aVar3);
                }
                return;
            }
            StringBuilder a = C0947c.m5159a();
            a.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C0947c.m5160a(a, size2);
            a.append(")");
            RoomSQLiteQuery b = RoomSQLiteQuery.m5112b(a.toString(), size2 + 0);
            int i3 = 1;
            for (String str : keySet) {
                if (str == null) {
                    b.mo5235a(i3);
                } else {
                    b.mo5238a(i3, str);
                }
                i3++;
            }
            Cursor query = this.f4302a.query(b);
            try {
                int columnIndex = query.getColumnIndex("work_spec_id");
                if (columnIndex != -1) {
                    while (query.moveToNext()) {
                        if (!query.isNull(columnIndex)) {
                            ArrayList arrayList = (ArrayList) aVar.get(query.getString(columnIndex));
                            if (arrayList != null) {
                                arrayList.add(query.getString(0));
                            }
                        }
                    }
                    query.close();
                }
            } finally {
                query.close();
            }
        }
    }
}
