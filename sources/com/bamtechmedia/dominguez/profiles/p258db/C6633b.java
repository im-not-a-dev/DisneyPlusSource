package com.bamtechmedia.dominguez.profiles.p258db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.p003k.C0945a;
import androidx.room.p003k.C0946b;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.bamtechmedia.dominguez.profiles.C6669h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.db.b */
/* compiled from: AvatarsDao_Impl */
public final class C6633b extends C6632a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f14961a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter f14962b;

    /* renamed from: c */
    private final EntityInsertionAdapter f14963c;

    /* renamed from: d */
    private final SharedSQLiteStatement f14964d;

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.b$a */
    /* compiled from: AvatarsDao_Impl */
    class C6634a extends EntityInsertionAdapter<C6669h> {
        C6634a(C6633b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C6669h hVar) {
            if (hVar.mo19333j() == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, hVar.mo19333j());
            }
            if (hVar.mo19332V() == null) {
                supportSQLiteStatement.mo5235a(2);
            } else {
                supportSQLiteStatement.mo5238a(2, hVar.mo19332V());
            }
            if (hVar.mo19384a() == null) {
                supportSQLiteStatement.mo5235a(3);
            } else {
                supportSQLiteStatement.mo5238a(3, hVar.mo19384a());
            }
            if (hVar.mo19331U() == null) {
                supportSQLiteStatement.mo5235a(4);
            } else {
                supportSQLiteStatement.mo5238a(4, hVar.mo19331U());
            }
            if (hVar.mo19385b() == null) {
                supportSQLiteStatement.mo5235a(5);
            } else {
                supportSQLiteStatement.mo5237a(5, (long) hVar.mo19385b().intValue());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `AvatarImpl`(`avatarId`,`avatarTitle`,`imageUrl`,`masterId`,`masterWidth`) VALUES (?,?,?,?,?)";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.b$b */
    /* compiled from: AvatarsDao_Impl */
    class C6635b extends EntityInsertionAdapter<C6669h> {
        C6635b(C6633b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C6669h hVar) {
            if (hVar.mo19333j() == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, hVar.mo19333j());
            }
            if (hVar.mo19332V() == null) {
                supportSQLiteStatement.mo5235a(2);
            } else {
                supportSQLiteStatement.mo5238a(2, hVar.mo19332V());
            }
            if (hVar.mo19384a() == null) {
                supportSQLiteStatement.mo5235a(3);
            } else {
                supportSQLiteStatement.mo5238a(3, hVar.mo19384a());
            }
            if (hVar.mo19331U() == null) {
                supportSQLiteStatement.mo5235a(4);
            } else {
                supportSQLiteStatement.mo5238a(4, hVar.mo19331U());
            }
            if (hVar.mo19385b() == null) {
                supportSQLiteStatement.mo5235a(5);
            } else {
                supportSQLiteStatement.mo5237a(5, (long) hVar.mo19385b().intValue());
            }
        }

        public String createQuery() {
            return "INSERT OR ABORT INTO `AvatarImpl`(`avatarId`,`avatarTitle`,`imageUrl`,`masterId`,`masterWidth`) VALUES (?,?,?,?,?)";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.b$c */
    /* compiled from: AvatarsDao_Impl */
    class C6636c extends SharedSQLiteStatement {
        C6636c(C6633b bVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM AvatarImpl";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.b$d */
    /* compiled from: AvatarsDao_Impl */
    class C6637d implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C6669h f14966c;

        C6637d(C6669h hVar) {
            this.f14966c = hVar;
        }

        public Void call() throws Exception {
            C6633b.this.f14961a.beginTransaction();
            try {
                C6633b.this.f14962b.insert(this.f14966c);
                C6633b.this.f14961a.setTransactionSuccessful();
                return null;
            } finally {
                C6633b.this.f14961a.endTransaction();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.db.b$e */
    /* compiled from: AvatarsDao_Impl */
    class C6638e implements Callable<List<C6669h>> {

        /* renamed from: c */
        final /* synthetic */ RoomSQLiteQuery f14968c;

        C6638e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f14968c = roomSQLiteQuery;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f14968c.mo5242b();
        }

        public List<C6669h> call() throws Exception {
            Integer valueOf;
            Cursor a = C0946b.m5157a(C6633b.this.f14961a, this.f14968c, false);
            try {
                int a2 = C0945a.m5155a(a, "avatarId");
                int a3 = C0945a.m5155a(a, "avatarTitle");
                int a4 = C0945a.m5155a(a, "imageUrl");
                int a5 = C0945a.m5155a(a, "masterId");
                int a6 = C0945a.m5155a(a, "masterWidth");
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a2);
                    String string2 = a.getString(a3);
                    String string3 = a.getString(a4);
                    String string4 = a.getString(a5);
                    if (a.isNull(a6)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(a.getInt(a6));
                    }
                    C6669h hVar = new C6669h(string, string2, string3, string4, valueOf);
                    arrayList.add(hVar);
                }
                return arrayList;
            } finally {
                a.close();
            }
        }
    }

    public C6633b(RoomDatabase roomDatabase) {
        this.f14961a = roomDatabase;
        this.f14962b = new C6634a(this, roomDatabase);
        this.f14963c = new C6635b(this, roomDatabase);
        this.f14964d = new C6636c(this, roomDatabase);
    }

    /* renamed from: b */
    public void mo19306b(List<C6669h> list) {
        this.f14961a.beginTransaction();
        try {
            super.mo19306b(list);
            this.f14961a.setTransactionSuccessful();
        } finally {
            this.f14961a.endTransaction();
        }
    }

    /* renamed from: a */
    public Completable mo19302a(C6669h hVar) {
        return Completable.m38168c((Callable<?>) new C6637d<Object>(hVar));
    }

    /* renamed from: a */
    public void mo19304a(List<C6669h> list) {
        this.f14961a.assertNotSuspendingTransaction();
        this.f14961a.beginTransaction();
        try {
            this.f14963c.insert((Iterable<T>) list);
            this.f14961a.setTransactionSuccessful();
        } finally {
            this.f14961a.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo19305b() {
        this.f14961a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14964d.acquire();
        this.f14961a.beginTransaction();
        try {
            acquire.mo5323k0();
            this.f14961a.setTransactionSuccessful();
        } finally {
            this.f14961a.endTransaction();
            this.f14964d.release(acquire);
        }
    }

    /* renamed from: a */
    public Single<List<C6669h>> mo19303a() {
        return Single.m38401c((Callable<? extends T>) new C6638e<Object>(RoomSQLiteQuery.m5112b("SELECT * FROM AvatarImpl", 0)));
    }
}
