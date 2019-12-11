package androidx.work.impl.p011m;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.m.c */
/* compiled from: DependencyDao_Impl */
public final class C1100c implements C1099b {

    /* renamed from: a */
    private final RoomDatabase f4267a;

    /* renamed from: b */
    private final EntityInsertionAdapter f4268b;

    /* renamed from: androidx.work.impl.m.c$a */
    /* compiled from: DependencyDao_Impl */
    class C1101a extends EntityInsertionAdapter<C1098a> {
        C1101a(C1100c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C1098a aVar) {
            String str = aVar.f4265a;
            if (str == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, str);
            }
            String str2 = aVar.f4266b;
            if (str2 == null) {
                supportSQLiteStatement.mo5235a(2);
            } else {
                supportSQLiteStatement.mo5238a(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C1100c(RoomDatabase roomDatabase) {
        this.f4267a = roomDatabase;
        this.f4268b = new C1101a(this, roomDatabase);
    }

    /* renamed from: a */
    public void mo5837a(C1098a aVar) {
        this.f4267a.beginTransaction();
        try {
            this.f4268b.insert(aVar);
            this.f4267a.setTransactionSuccessful();
        } finally {
            this.f4267a.endTransaction();
        }
    }

    /* renamed from: b */
    public boolean mo5838b(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4267a.query(b);
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: c */
    public boolean mo5839c(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4267a.query(b);
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
            b.mo5242b();
        }
    }

    /* renamed from: a */
    public List<String> mo5836a(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4267a.query(b);
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
}
