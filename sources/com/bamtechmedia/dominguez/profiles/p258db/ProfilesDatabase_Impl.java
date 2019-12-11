package com.bamtechmedia.dominguez.profiles.p258db;

import androidx.room.C0936h;
import androidx.room.C0936h.C0937a;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase.Callback;
import androidx.room.p003k.C0946b;
import androidx.room.p003k.C0948d;
import androidx.room.p003k.C0948d.C0949a;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0959b.C0960a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.ProfilesDatabase_Impl */
public final class ProfilesDatabase_Impl extends ProfilesDatabase {

    /* renamed from: a */
    private volatile C6639c f14958a;

    /* renamed from: b */
    private volatile C6632a f14959b;

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.ProfilesDatabase_Impl$a */
    class C6631a extends C0937a {
        C6631a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `ProfileImpl` (`profileId` TEXT NOT NULL, `profileName` TEXT NOT NULL, `active` INTEGER NOT NULL, `isKidsModeEnabled` INTEGER NOT NULL, `isAutoPlayEnabled` INTEGER NOT NULL, `isDefault` INTEGER NOT NULL, `avatarId` TEXT NOT NULL, `avatarUserSelected` INTEGER NOT NULL, `backgroundVideo` INTEGER NOT NULL, `appLanguage` TEXT, `playbackLanguage` TEXT, `preferAudioDescription` INTEGER, `preferSDH` INTEGER, `subtitleLanguage` TEXT, `subtitlesEnabled` INTEGER, PRIMARY KEY(`profileId`))");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS `AvatarImpl` (`avatarId` TEXT NOT NULL, `avatarTitle` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `masterId` TEXT, `masterWidth` INTEGER, PRIMARY KEY(`avatarId`))");
            supportSQLiteDatabase.mo5306b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.mo5306b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '14d7333ffca962e7a307a15e39cbb4f0')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `ProfileImpl`");
            supportSQLiteDatabase.mo5306b("DROP TABLE IF EXISTS `AvatarImpl`");
        }

        /* access modifiers changed from: protected */
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (ProfilesDatabase_Impl.this.mCallbacks != null) {
                int size = ProfilesDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((Callback) ProfilesDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ProfilesDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            ProfilesDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (ProfilesDatabase_Impl.this.mCallbacks != null) {
                int size = ProfilesDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((Callback) ProfilesDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C0946b.m5158a(supportSQLiteDatabase);
        }

        /* access modifiers changed from: protected */
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(15);
            String str = "profileId";
            String str2 = "TEXT";
            hashMap.put(str, new C0949a(str, str2, true, 1));
            String str3 = "profileName";
            hashMap.put(str3, new C0949a(str3, str2, true, 0));
            String str4 = "active";
            String str5 = "INTEGER";
            hashMap.put(str4, new C0949a(str4, str5, true, 0));
            String str6 = "isKidsModeEnabled";
            hashMap.put(str6, new C0949a(str6, str5, true, 0));
            String str7 = "isAutoPlayEnabled";
            hashMap.put(str7, new C0949a(str7, str5, true, 0));
            String str8 = "isDefault";
            hashMap.put(str8, new C0949a(str8, str5, true, 0));
            String str9 = "avatarId";
            hashMap.put(str9, new C0949a(str9, str2, true, 0));
            String str10 = "avatarUserSelected";
            hashMap.put(str10, new C0949a(str10, str5, true, 0));
            String str11 = "backgroundVideo";
            hashMap.put(str11, new C0949a(str11, str5, true, 0));
            String str12 = "appLanguage";
            hashMap.put(str12, new C0949a(str12, str2, false, 0));
            String str13 = "playbackLanguage";
            hashMap.put(str13, new C0949a(str13, str2, false, 0));
            hashMap.put("preferAudioDescription", new C0949a("preferAudioDescription", str5, false, 0));
            hashMap.put("preferSDH", new C0949a("preferSDH", str5, false, 0));
            hashMap.put("subtitleLanguage", new C0949a("subtitleLanguage", str2, false, 0));
            hashMap.put("subtitlesEnabled", new C0949a("subtitlesEnabled", str5, false, 0));
            C0948d dVar = new C0948d("ProfileImpl", hashMap, new HashSet(0), new HashSet(0));
            C0948d a = C0948d.m5162a(supportSQLiteDatabase, "ProfileImpl");
            if (dVar.equals(a)) {
                HashMap hashMap2 = new HashMap(5);
                hashMap2.put(str9, new C0949a(str9, str2, true, 1));
                hashMap2.put("avatarTitle", new C0949a("avatarTitle", str2, true, 0));
                hashMap2.put("imageUrl", new C0949a("imageUrl", str2, true, 0));
                hashMap2.put("masterId", new C0949a("masterId", str2, false, 0));
                hashMap2.put("masterWidth", new C0949a("masterWidth", str5, false, 0));
                C0948d dVar2 = new C0948d("AvatarImpl", hashMap2, new HashSet(0), new HashSet(0));
                C0948d a2 = C0948d.m5162a(supportSQLiteDatabase, "AvatarImpl");
                if (!dVar2.equals(a2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Migration didn't properly handle AvatarImpl(com.bamtechmedia.dominguez.profiles.AvatarImpl).\n Expected:\n");
                    sb.append(dVar2);
                    sb.append("\n Found:\n");
                    sb.append(a2);
                    throw new IllegalStateException(sb.toString());
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Migration didn't properly handle ProfileImpl(com.bamtechmedia.dominguez.profiles.ProfileImpl).\n Expected:\n");
            sb2.append(dVar);
            sb2.append("\n Found:\n");
            sb2.append(a);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void clearAllTables() {
        String str = "VACUUM";
        String str2 = "PRAGMA wal_checkpoint(FULL)";
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.mo5306b("DELETE FROM `ProfileImpl`");
            writableDatabase.mo5306b("DELETE FROM `AvatarImpl`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.mo5308d(str2).close();
            if (!writableDatabase.mo5315q0()) {
                writableDatabase.mo5306b(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "ProfileImpl", "AvatarImpl");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        C0936h hVar = new C0936h(databaseConfiguration, new C6631a(1), "14d7333ffca962e7a307a15e39cbb4f0", "dcd5e674c22f97ae3bbb2aeddc532086");
        C0960a a = C0959b.m5202a(databaseConfiguration.f3653b);
        a.mo5320a(databaseConfiguration.f3654c);
        a.mo5319a((C0958a) hVar);
        return databaseConfiguration.f3652a.mo5322a(a.mo5321a());
    }

    /* renamed from: a */
    public C6632a mo19300a() {
        C6632a aVar;
        if (this.f14959b != null) {
            return this.f14959b;
        }
        synchronized (this) {
            if (this.f14959b == null) {
                this.f14959b = new C6633b(this);
            }
            aVar = this.f14959b;
        }
        return aVar;
    }

    /* renamed from: b */
    public C6639c mo19301b() {
        C6639c cVar;
        if (this.f14958a != null) {
            return this.f14958a;
        }
        synchronized (this) {
            if (this.f14958a == null) {
                this.f14958a = new C6640d(this);
            }
            cVar = this.f14958a;
        }
        return cVar;
    }
}
