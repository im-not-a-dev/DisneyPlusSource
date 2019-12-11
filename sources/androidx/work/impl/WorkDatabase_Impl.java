package androidx.work.impl;

import androidx.room.C0936h;
import androidx.room.C0936h.C0937a;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase.Callback;
import androidx.room.p003k.C0948d;
import androidx.room.p003k.C0948d.C0949a;
import androidx.room.p003k.C0948d.C0950b;
import androidx.room.p003k.C0948d.C0952d;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b.C0960a;
import androidx.work.impl.p011m.C1099b;
import androidx.work.impl.p011m.C1100c;
import androidx.work.impl.p011m.C1103e;
import androidx.work.impl.p011m.C1104f;
import androidx.work.impl.p011m.C1108h;
import androidx.work.impl.p011m.C1109i;
import androidx.work.impl.p011m.C1115k;
import androidx.work.impl.p011m.C1116l;
import androidx.work.impl.p011m.C1127n;
import androidx.work.impl.p011m.C1128o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b */
    private volatile C1115k f4081b;

    /* renamed from: c */
    private volatile C1099b f4082c;

    /* renamed from: d */
    private volatile C1127n f4083d;

    /* renamed from: e */
    private volatile C1103e f4084e;

    /* renamed from: f */
    private volatile C1108h f4085f;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1038a extends C0937a {
        C1038a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo5306b("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            supportSQLiteDatabase.mo5306b("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.mo5306b("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo5306b("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.mo5306b("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.mo5306b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `Dependency`");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `WorkSpec`");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `WorkTag`");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `SystemIdInfo`");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `WorkName`");
        }

        /* access modifiers changed from: protected */
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((Callback) WorkDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            supportSQLiteDatabase.mo5306b("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((Callback) WorkDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            HashMap hashMap = new HashMap(2);
            String str = "TEXT";
            String str2 = "work_spec_id";
            hashMap.put(str2, new C0949a(str2, str, true, 1));
            String str3 = "prerequisite_id";
            hashMap.put(str3, new C0949a(str3, str, true, 2));
            HashSet hashSet = new HashSet(2);
            String str4 = "id";
            C0950b bVar = new C0950b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
            hashSet.add(bVar);
            C0950b bVar2 = new C0950b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str4}));
            hashSet.add(bVar2);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0952d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{str2})));
            hashSet2.add(new C0952d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{str3})));
            String str5 = "Dependency";
            C0948d dVar = new C0948d(str5, hashMap, hashSet, hashSet2);
            C0948d a = C0948d.m5162a(supportSQLiteDatabase2, str5);
            String str6 = "\n Found:\n";
            if (dVar.equals(a)) {
                HashMap hashMap2 = new HashMap(23);
                hashMap2.put(str4, new C0949a(str4, str, true, 1));
                String str7 = "state";
                String str8 = "INTEGER";
                hashMap2.put(str7, new C0949a(str7, str8, true, 0));
                String str9 = "worker_class_name";
                hashMap2.put(str9, new C0949a(str9, str, true, 0));
                String str10 = "input_merger_class_name";
                hashMap2.put(str10, new C0949a(str10, str, false, 0));
                String str11 = "BLOB";
                hashMap2.put("input", new C0949a("input", str11, true, 0));
                hashMap2.put("output", new C0949a("output", str11, true, 0));
                hashMap2.put("initial_delay", new C0949a("initial_delay", str8, true, 0));
                hashMap2.put("interval_duration", new C0949a("interval_duration", str8, true, 0));
                hashMap2.put("flex_duration", new C0949a("flex_duration", str8, true, 0));
                hashMap2.put("run_attempt_count", new C0949a("run_attempt_count", str8, true, 0));
                hashMap2.put("backoff_policy", new C0949a("backoff_policy", str8, true, 0));
                hashMap2.put("backoff_delay_duration", new C0949a("backoff_delay_duration", str8, true, 0));
                hashMap2.put("period_start_time", new C0949a("period_start_time", str8, true, 0));
                hashMap2.put("minimum_retention_duration", new C0949a("minimum_retention_duration", str8, true, 0));
                String str12 = "schedule_requested_at";
                hashMap2.put(str12, new C0949a(str12, str8, true, 0));
                hashMap2.put("required_network_type", new C0949a("required_network_type", str8, false, 0));
                hashMap2.put("requires_charging", new C0949a("requires_charging", str8, true, 0));
                hashMap2.put("requires_device_idle", new C0949a("requires_device_idle", str8, true, 0));
                hashMap2.put("requires_battery_not_low", new C0949a("requires_battery_not_low", str8, true, 0));
                hashMap2.put("requires_storage_not_low", new C0949a("requires_storage_not_low", str8, true, 0));
                hashMap2.put("trigger_content_update_delay", new C0949a("trigger_content_update_delay", str8, true, 0));
                hashMap2.put("trigger_max_content_delay", new C0949a("trigger_max_content_delay", str8, true, 0));
                hashMap2.put("content_uri_triggers", new C0949a("content_uri_triggers", str11, false, 0));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new C0952d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{str12})));
                C0948d dVar2 = new C0948d("WorkSpec", hashMap2, hashSet3, hashSet4);
                C0948d a2 = C0948d.m5162a(supportSQLiteDatabase2, "WorkSpec");
                if (dVar2.equals(a2)) {
                    HashMap hashMap3 = new HashMap(2);
                    hashMap3.put("tag", new C0949a("tag", str, true, 1));
                    hashMap3.put(str2, new C0949a(str2, str, true, 2));
                    HashSet hashSet5 = new HashSet(1);
                    C0950b bVar3 = new C0950b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                    hashSet5.add(bVar3);
                    HashSet hashSet6 = new HashSet(1);
                    hashSet6.add(new C0952d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{str2})));
                    C0948d dVar3 = new C0948d("WorkTag", hashMap3, hashSet5, hashSet6);
                    C0948d a3 = C0948d.m5162a(supportSQLiteDatabase2, "WorkTag");
                    if (dVar3.equals(a3)) {
                        HashMap hashMap4 = new HashMap(2);
                        hashMap4.put(str2, new C0949a(str2, str, true, 1));
                        hashMap4.put("system_id", new C0949a("system_id", str8, true, 0));
                        HashSet hashSet7 = new HashSet(1);
                        C0950b bVar4 = new C0950b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                        hashSet7.add(bVar4);
                        C0948d dVar4 = new C0948d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                        C0948d a4 = C0948d.m5162a(supportSQLiteDatabase2, "SystemIdInfo");
                        if (dVar4.equals(a4)) {
                            HashMap hashMap5 = new HashMap(2);
                            hashMap5.put("name", new C0949a("name", str, true, 1));
                            hashMap5.put(str2, new C0949a(str2, str, true, 2));
                            HashSet hashSet8 = new HashSet(1);
                            C0950b bVar5 = new C0950b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                            hashSet8.add(bVar5);
                            HashSet hashSet9 = new HashSet(1);
                            hashSet9.add(new C0952d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{str2})));
                            C0948d dVar5 = new C0948d("WorkName", hashMap5, hashSet8, hashSet9);
                            C0948d a5 = C0948d.m5162a(supportSQLiteDatabase2, "WorkName");
                            if (!dVar5.equals(a5)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                sb.append(dVar5);
                                sb.append(str6);
                                sb.append(a5);
                                throw new IllegalStateException(sb.toString());
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                        sb2.append(dVar4);
                        sb2.append(str6);
                        sb2.append(a4);
                        throw new IllegalStateException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    sb3.append(dVar3);
                    sb3.append(str6);
                    sb3.append(a3);
                    throw new IllegalStateException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                sb4.append(dVar2);
                sb4.append(str6);
                sb4.append(a2);
                throw new IllegalStateException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb5.append(dVar);
            sb5.append(str6);
            sb5.append(a);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        C0936h hVar = new C0936h(databaseConfiguration, new C1038a(5), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        C0960a a = C0959b.m5202a(databaseConfiguration.f3653b);
        a.mo5320a(databaseConfiguration.f3654c);
        a.mo5319a((C0958a) hVar);
        return databaseConfiguration.f3652a.mo5322a(a.mo5321a());
    }

    /* renamed from: c */
    public C1108h mo5704c() {
        C1108h hVar;
        if (this.f4085f != null) {
            return this.f4085f;
        }
        synchronized (this) {
            if (this.f4085f == null) {
                this.f4085f = new C1109i(this);
            }
            hVar = this.f4085f;
        }
        return hVar;
    }

    /* renamed from: d */
    public C1115k mo5705d() {
        C1115k kVar;
        if (this.f4081b != null) {
            return this.f4081b;
        }
        synchronized (this) {
            if (this.f4081b == null) {
                this.f4081b = new C1116l(this);
            }
            kVar = this.f4081b;
        }
        return kVar;
    }

    /* renamed from: e */
    public C1127n mo5706e() {
        C1127n nVar;
        if (this.f4083d != null) {
            return this.f4083d;
        }
        synchronized (this) {
            if (this.f4083d == null) {
                this.f4083d = new C1128o(this);
            }
            nVar = this.f4083d;
        }
        return nVar;
    }

    /* renamed from: a */
    public C1099b mo5702a() {
        C1099b bVar;
        if (this.f4082c != null) {
            return this.f4082c;
        }
        synchronized (this) {
            if (this.f4082c == null) {
                this.f4082c = new C1100c(this);
            }
            bVar = this.f4082c;
        }
        return bVar;
    }

    /* renamed from: b */
    public C1103e mo5703b() {
        C1103e eVar;
        if (this.f4084e != null) {
            return this.f4084e;
        }
        synchronized (this) {
            if (this.f4084e == null) {
                this.f4084e = new C1104f(this);
            }
            eVar = this.f4084e;
        }
        return eVar;
    }
}
