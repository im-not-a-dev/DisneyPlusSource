package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.p004db.C0962a;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p096e.p105b.p106a.p108b.C3909b;
import p096e.p113e.C3926a;
import p096e.p113e.C3928b;

public class InvalidationTracker {

    /* renamed from: k */
    private static final String[] f3665k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final C3926a<String, Integer> f3666a;

    /* renamed from: b */
    final String[] f3667b;

    /* renamed from: c */
    private Map<String, Set<String>> f3668c;

    /* renamed from: d */
    final RoomDatabase f3669d;

    /* renamed from: e */
    AtomicBoolean f3670e;

    /* renamed from: f */
    private volatile boolean f3671f;

    /* renamed from: g */
    volatile SupportSQLiteStatement f3672g;

    /* renamed from: h */
    private C0910b f3673h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    final C3909b<C0911c, C0912d> f3674i;

    /* renamed from: j */
    Runnable f3675j;

    /* renamed from: androidx.room.InvalidationTracker$a */
    class C0909a implements Runnable {
        C0909a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m5089a() {
            C3928b bVar = new C3928b();
            Cursor query = InvalidationTracker.this.f3669d.query(new C0962a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    bVar.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!bVar.isEmpty()) {
                InvalidationTracker.this.f3672g.mo5323k0();
            }
            return bVar;
        }

        public void run() {
            SupportSQLiteDatabase writableDatabase;
            Lock closeLock = InvalidationTracker.this.f3669d.getCloseLock();
            Set set = null;
            try {
                closeLock.lock();
                if (!InvalidationTracker.this.mo5185a()) {
                    closeLock.unlock();
                } else if (!InvalidationTracker.this.f3670e.compareAndSet(true, false)) {
                    closeLock.unlock();
                } else if (InvalidationTracker.this.f3669d.inTransaction()) {
                    closeLock.unlock();
                } else {
                    if (InvalidationTracker.this.f3669d.mWriteAheadLoggingEnabled) {
                        writableDatabase = InvalidationTracker.this.f3669d.getOpenHelper().getWritableDatabase();
                        writableDatabase.mo5311m0();
                        set = m5089a();
                        writableDatabase.mo5313o0();
                        writableDatabase.mo5314p0();
                    } else {
                        set = m5089a();
                    }
                    closeLock.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (InvalidationTracker.this.f3674i) {
                            Iterator it = InvalidationTracker.this.f3674i.iterator();
                            while (it.hasNext()) {
                                ((C0912d) ((Entry) it.next()).getValue()).mo5197a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    closeLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                writableDatabase.mo5314p0();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.InvalidationTracker$b */
    static class C0910b {

        /* renamed from: a */
        final long[] f3677a;

        /* renamed from: b */
        final boolean[] f3678b;

        /* renamed from: c */
        final int[] f3679c;

        /* renamed from: d */
        boolean f3680d;

        /* renamed from: e */
        boolean f3681e;

        C0910b(int i) {
            this.f3677a = new long[i];
            this.f3678b = new boolean[i];
            this.f3679c = new int[i];
            Arrays.fill(this.f3677a, 0);
            Arrays.fill(this.f3678b, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5191a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f3677a[i];
                    this.f3677a[i] = 1 + j;
                    if (j == 0) {
                        this.f3680d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5194b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f3677a[i];
                    this.f3677a[i] = j - 1;
                    if (j == 1) {
                        this.f3680d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int[] mo5192a() {
            synchronized (this) {
                if (this.f3680d) {
                    if (!this.f3681e) {
                        int length = this.f3677a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f3677a[i] > 0;
                                if (z != this.f3678b[i]) {
                                    int[] iArr = this.f3679c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f3679c[i] = 0;
                                }
                                this.f3678b[i] = z;
                                i++;
                            } else {
                                this.f3681e = true;
                                this.f3680d = false;
                                int[] iArr2 = this.f3679c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5193b() {
            synchronized (this) {
                this.f3681e = false;
            }
        }
    }

    /* renamed from: androidx.room.InvalidationTracker$c */
    public static abstract class C0911c {

        /* renamed from: a */
        final String[] f3682a;

        public C0911c(String[] strArr) {
            this.f3682a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo5195a(Set<String> set);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5196a() {
            return false;
        }
    }

    /* renamed from: androidx.room.InvalidationTracker$d */
    static class C0912d {

        /* renamed from: a */
        final int[] f3683a;

        /* renamed from: b */
        private final String[] f3684b;

        /* renamed from: c */
        final C0911c f3685c;

        /* renamed from: d */
        private final Set<String> f3686d;

        C0912d(C0911c cVar, int[] iArr, String[] strArr) {
            this.f3685c = cVar;
            this.f3683a = iArr;
            this.f3684b = strArr;
            if (iArr.length == 1) {
                C3928b bVar = new C3928b();
                bVar.add(this.f3684b[0]);
                this.f3686d = Collections.unmodifiableSet(bVar);
                return;
            }
            this.f3686d = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5197a(Set<Integer> set) {
            int length = this.f3683a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f3683a[i]))) {
                    if (length == 1) {
                        set2 = this.f3686d;
                    } else {
                        if (set2 == null) {
                            set2 = new C3928b(length);
                        }
                        set2.add(this.f3684b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f3685c.mo5195a(set2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5198a(String[] strArr) {
            Set set = 0;
            if (this.f3684b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f3684b[0])) {
                        set = this.f3686d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                C3928b bVar = new C3928b();
                for (String str : strArr) {
                    String[] strArr2 = this.f3684b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            bVar.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (bVar.size() > 0) {
                    set = bVar;
                }
            }
            if (set != 0) {
                this.f3685c.mo5195a(set);
            }
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.emptyMap(), strArr);
    }

    /* renamed from: b */
    private void m5078b(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        String str = this.f3667b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f3665k) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m5077a(sb, str, str2);
            supportSQLiteDatabase.mo5306b(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5183a(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            if (this.f3671f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.mo5306b("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.mo5306b("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.mo5306b("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo5188b(supportSQLiteDatabase);
            this.f3672g = supportSQLiteDatabase.mo5307c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f3671f = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5189c() {
        if (this.f3669d.isOpen()) {
            mo5188b(this.f3669d.getOpenHelper().getWritableDatabase());
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f3670e = new AtomicBoolean(false);
        this.f3671f = false;
        this.f3674i = new C3909b<>();
        this.f3675j = new C0909a();
        this.f3669d = roomDatabase;
        this.f3673h = new C0910b(strArr.length);
        this.f3666a = new C3926a<>();
        this.f3668c = map2;
        new C0925d(this.f3669d);
        int length = strArr.length;
        this.f3667b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f3666a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.f3667b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f3667b[i] = lowerCase;
            }
        }
        for (Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.f3666a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                C3926a<String, Integer> aVar = this.f3666a;
                aVar.put(lowerCase3, aVar.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private String[] m5079b(String[] strArr) {
        C3928b bVar = new C3928b();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3668c.containsKey(lowerCase)) {
                bVar.addAll((Collection) this.f3668c.get(lowerCase));
            } else {
                bVar.add(str);
            }
        }
        return (String[]) bVar.toArray(new String[bVar.size()]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5181a(Context context, String str) {
        new C0926e(context, str, this, this.f3669d.getQueryExecutor());
    }

    /* renamed from: a */
    private static void m5077a(StringBuilder sb, String str, String str2) {
        String str3 = "`";
        sb.append(str3);
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(str3);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public void mo5187b(C0911c cVar) {
        C0912d dVar;
        synchronized (this.f3674i) {
            dVar = (C0912d) this.f3674i.remove(cVar);
        }
        if (dVar != null && this.f3673h.mo5194b(dVar.f3683a)) {
            mo5189c();
        }
    }

    /* renamed from: a */
    private void m5076a(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        supportSQLiteDatabase.mo5306b(sb.toString());
        String str = this.f3667b[i];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3665k) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m5077a(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            String str3 = "invalidated";
            sb2.append(str3);
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i);
            sb2.append(" AND ");
            sb2.append(str3);
            sb2.append(" = 0");
            sb2.append("; END");
            supportSQLiteDatabase.mo5306b(sb2.toString());
        }
    }

    /* renamed from: b */
    public void mo5186b() {
        if (this.f3670e.compareAndSet(false, true)) {
            this.f3669d.getQueryExecutor().execute(this.f3675j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5188b(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (!supportSQLiteDatabase.mo5315q0()) {
            while (true) {
                try {
                    Lock closeLock = this.f3669d.getCloseLock();
                    closeLock.lock();
                    try {
                        int[] a = this.f3673h.mo5192a();
                        if (a == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length = a.length;
                        supportSQLiteDatabase.mo5311m0();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m5076a(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                m5078b(supportSQLiteDatabase, i);
                            }
                        }
                        supportSQLiteDatabase.mo5313o0();
                        supportSQLiteDatabase.mo5314p0();
                        this.f3673h.mo5193b();
                        closeLock.unlock();
                    } catch (Throwable th) {
                        closeLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo5182a(C0911c cVar) {
        C0912d dVar;
        String[] b = m5079b(cVar.f3682a);
        int[] iArr = new int[b.length];
        int length = b.length;
        int i = 0;
        while (i < length) {
            Integer num = (Integer) this.f3666a.get(b[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(b[i]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C0912d dVar2 = new C0912d(cVar, iArr, b);
        synchronized (this.f3674i) {
            dVar = (C0912d) this.f3674i.mo13978b(cVar, dVar2);
        }
        if (dVar == null && this.f3673h.mo5191a(iArr)) {
            mo5189c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5185a() {
        if (!this.f3669d.isOpen()) {
            return false;
        }
        if (!this.f3671f) {
            this.f3669d.getOpenHelper().getWritableDatabase();
        }
        if (this.f3671f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: a */
    public void mo5184a(String... strArr) {
        synchronized (this.f3674i) {
            Iterator it = this.f3674i.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!((C0911c) entry.getKey()).mo5196a()) {
                    ((C0912d) entry.getValue()).mo5198a(strArr);
                }
            }
        }
    }
}
