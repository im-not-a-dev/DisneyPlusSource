package androidx.work.impl.p011m;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.m.o */
/* compiled from: WorkTagDao_Impl */
public final class C1128o implements C1127n {

    /* renamed from: a */
    private final RoomDatabase f4313a;

    /* renamed from: b */
    private final EntityInsertionAdapter f4314b;

    /* renamed from: androidx.work.impl.m.o$a */
    /* compiled from: WorkTagDao_Impl */
    class C1129a extends EntityInsertionAdapter<C1126m> {
        C1129a(C1128o oVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C1126m mVar) {
            String str = mVar.f4311a;
            if (str == null) {
                supportSQLiteStatement.mo5235a(1);
            } else {
                supportSQLiteStatement.mo5238a(1, str);
            }
            String str2 = mVar.f4312b;
            if (str2 == null) {
                supportSQLiteStatement.mo5235a(2);
            } else {
                supportSQLiteStatement.mo5238a(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C1128o(RoomDatabase roomDatabase) {
        this.f4313a = roomDatabase;
        this.f4314b = new C1129a(this, roomDatabase);
    }

    /* renamed from: a */
    public void mo5889a(C1126m mVar) {
        this.f4313a.beginTransaction();
        try {
            this.f4314b.insert(mVar);
            this.f4313a.setTransactionSuccessful();
        } finally {
            this.f4313a.endTransaction();
        }
    }

    /* renamed from: a */
    public List<String> mo5888a(String str) {
        RoomSQLiteQuery b = RoomSQLiteQuery.m5112b("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            b.mo5235a(1);
        } else {
            b.mo5238a(1, str);
        }
        Cursor query = this.f4313a.query(b);
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
