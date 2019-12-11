package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.work.impl.utils.C1138e;

/* renamed from: androidx.work.impl.g */
/* compiled from: WorkDatabaseMigrations */
public class C1063g {

    /* renamed from: a */
    public static Migration f4175a = new C1064a(1, 2);

    /* renamed from: b */
    public static Migration f4176b = new C1065b(3, 4);

    /* renamed from: c */
    public static Migration f4177c = new C1066c(4, 5);

    /* renamed from: androidx.work.impl.g$a */
    /* compiled from: WorkDatabaseMigrations */
    static class C1064a extends Migration {
        C1064a(int i, int i2) {
            super(i, i2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo5306b("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.mo5306b("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.g$b */
    /* compiled from: WorkDatabaseMigrations */
    static class C1065b extends Migration {
        C1065b(int i, int i2) {
            super(i, i2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (VERSION.SDK_INT >= 23) {
                supportSQLiteDatabase.mo5306b("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.g$c */
    /* compiled from: WorkDatabaseMigrations */
    static class C1066c extends Migration {
        C1066c(int i, int i2) {
            super(i, i2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.mo5306b("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.g$d */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1067d extends Migration {

        /* renamed from: a */
        final Context f4178a;

        public C1067d(Context context, int i, int i2) {
            super(i, i2);
            this.f4178a = context;
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            new C1138e(this.f4178a).mo5906a(true);
        }
    }
}
