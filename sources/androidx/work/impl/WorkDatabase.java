package androidx.work.impl;

import android.content.Context;
import androidx.room.C0934f;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.C0915a;
import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.work.impl.C1063g.C1067d;
import androidx.work.impl.p011m.C1099b;
import androidx.work.impl.p011m.C1103e;
import androidx.work.impl.p011m.C1108h;
import androidx.work.impl.p011m.C1115k;
import androidx.work.impl.p011m.C1127n;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: a */
    private static final long f4080a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    static class C1037a extends Callback {
        C1037a() {
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            super.onOpen(supportSQLiteDatabase);
            supportSQLiteDatabase.mo5311m0();
            try {
                supportSQLiteDatabase.mo5306b("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
                supportSQLiteDatabase.mo5306b(WorkDatabase.m5566h());
                supportSQLiteDatabase.mo5313o0();
            } finally {
                supportSQLiteDatabase.mo5314p0();
            }
        }
    }

    /* renamed from: a */
    public static WorkDatabase m5563a(Context context, boolean z) {
        C0915a aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C0934f.m5136a(context, cls);
            aVar.mo5226a();
        } else {
            aVar = C0934f.m5137a(context, cls, "androidx.work.workdb");
        }
        aVar.mo5227a(m5564f());
        aVar.mo5228a(C1063g.f4175a);
        aVar.mo5228a(new C1067d(context, 2, 3));
        aVar.mo5228a(C1063g.f4176b);
        aVar.mo5228a(C1063g.f4177c);
        aVar.mo5230c();
        return (WorkDatabase) aVar.mo5229b();
    }

    /* renamed from: f */
    static Callback m5564f() {
        return new C1037a();
    }

    /* renamed from: g */
    static long m5565g() {
        return System.currentTimeMillis() - f4080a;
    }

    /* renamed from: h */
    static String m5566h() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(m5565g());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    /* renamed from: a */
    public abstract C1099b mo5702a();

    /* renamed from: b */
    public abstract C1103e mo5703b();

    /* renamed from: c */
    public abstract C1108h mo5704c();

    /* renamed from: d */
    public abstract C1115k mo5705d();

    /* renamed from: e */
    public abstract C1127n mo5706e();
}
