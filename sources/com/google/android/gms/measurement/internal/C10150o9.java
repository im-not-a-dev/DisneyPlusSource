package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
final class C10150o9 extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C10139n9 f23837a;

    C10150o9(C10139n9 n9Var, Context context, String str) {
        this.f23837a = n9Var;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.f23837a.f23787e.mo25862a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f23837a.f23787e.mo25863b();
                this.f23837a.mo25898e().mo25874t().mo25908a("Opening the database failed, dropping and recreating it");
                String str = "google_app_measurement.db";
                if (!this.f23837a.mo25895b().getDatabasePath(str).delete()) {
                    this.f23837a.mo25898e().mo25874t().mo25909a("Failed to delete corrupted db file", str);
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f23837a.f23787e.mo25861a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f23837a.mo25898e().mo25874t().mo25909a("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C10007c.m31162a(this.f23837a.mo25898e(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C10139n9.f23778f);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C10139n9.f23779g);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C10139n9.f23780h);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C10139n9.f23782j);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C10139n9.f23781i);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C10139n9.f23783k);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C10139n9.f23784l);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C10139n9.f23785m);
        C10007c.m31163a(this.f23837a.mo25898e(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
