package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.C0465b;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0961c;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import androidx.sqlite.p004db.p005c.C0969c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p096e.p105b.p106a.p107a.C3902a;
import p096e.p113e.C3942j;

public abstract class RoomDatabase {
    private boolean mAllowMainThreadQueries;
    @Deprecated
    protected List<Callback> mCallbacks;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    @Deprecated
    protected volatile SupportSQLiteDatabase mDatabase;
    private final InvalidationTracker mInvalidationTracker;
    private SupportSQLiteOpenHelper mOpenHelper;
    private Executor mQueryExecutor;
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;

    public static abstract class Callback {
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    public static class C0915a<T extends RoomDatabase> {

        /* renamed from: a */
        private final Class<T> f3693a;

        /* renamed from: b */
        private final String f3694b;

        /* renamed from: c */
        private final Context f3695c;

        /* renamed from: d */
        private ArrayList<Callback> f3696d;

        /* renamed from: e */
        private Executor f3697e;

        /* renamed from: f */
        private Executor f3698f;

        /* renamed from: g */
        private C0961c f3699g;

        /* renamed from: h */
        private boolean f3700h;

        /* renamed from: i */
        private C0916b f3701i = C0916b.AUTOMATIC;

        /* renamed from: j */
        private boolean f3702j;

        /* renamed from: k */
        private boolean f3703k = true;

        /* renamed from: l */
        private boolean f3704l;

        /* renamed from: m */
        private final C0917c f3705m = new C0917c();

        /* renamed from: n */
        private Set<Integer> f3706n;

        /* renamed from: o */
        private Set<Integer> f3707o;

        C0915a(Context context, Class<T> cls, String str) {
            this.f3695c = context;
            this.f3693a = cls;
            this.f3694b = str;
        }

        /* renamed from: a */
        public C0915a<T> mo5228a(Migration... migrationArr) {
            if (this.f3707o == null) {
                this.f3707o = new HashSet();
            }
            for (Migration migration : migrationArr) {
                this.f3707o.add(Integer.valueOf(migration.startVersion));
                this.f3707o.add(Integer.valueOf(migration.endVersion));
            }
            this.f3705m.mo5233a(migrationArr);
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: b */
        public T mo5229b() {
            if (this.f3695c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f3693a != null) {
                if (this.f3697e == null && this.f3698f == null) {
                    Executor b = C3902a.m13111b();
                    this.f3698f = b;
                    this.f3697e = b;
                } else {
                    Executor executor = this.f3697e;
                    if (executor != null && this.f3698f == null) {
                        this.f3698f = executor;
                    } else if (this.f3697e == null) {
                        Executor executor2 = this.f3698f;
                        if (executor2 != null) {
                            this.f3697e = executor2;
                        }
                    }
                }
                Set<Integer> set = this.f3707o;
                if (!(set == null || this.f3706n == null)) {
                    for (Integer num : set) {
                        if (this.f3706n.contains(num)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                            sb.append(num);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                if (this.f3699g == null) {
                    this.f3699g = new C0969c();
                }
                Context context = this.f3695c;
                DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, this.f3694b, this.f3699g, this.f3705m, this.f3696d, this.f3700h, this.f3701i.mo5231a(context), this.f3697e, this.f3698f, this.f3702j, this.f3703k, this.f3704l, this.f3706n);
                T t = (RoomDatabase) C0934f.m5138a(this.f3693a, "_Impl");
                t.init(databaseConfiguration);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: c */
        public C0915a<T> mo5230c() {
            this.f3703k = false;
            this.f3704l = true;
            return this;
        }

        /* renamed from: a */
        public C0915a<T> mo5226a() {
            this.f3700h = true;
            return this;
        }

        /* renamed from: a */
        public C0915a<T> mo5227a(Callback callback) {
            if (this.f3696d == null) {
                this.f3696d = new ArrayList<>();
            }
            this.f3696d.add(callback);
            return this;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$b */
    public enum C0916b {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: 0000 */
        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C0916b mo5231a(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            if (VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && !C0465b.m2497a(activityManager)) {
                    return WRITE_AHEAD_LOGGING;
                }
            }
            return TRUNCATE;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$c */
    public static class C0917c {

        /* renamed from: a */
        private C3942j<C3942j<Migration>> f3712a = new C3942j<>();

        /* renamed from: a */
        public void mo5233a(Migration... migrationArr) {
            for (Migration a : migrationArr) {
                m5109a(a);
            }
        }

        /* renamed from: a */
        private void m5109a(Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            C3942j jVar = (C3942j) this.f3712a.mo14172a(i);
            if (jVar == null) {
                jVar = new C3942j();
                this.f3712a.mo14179c(i, jVar);
            }
            Migration migration2 = (Migration) jVar.mo14172a(i2);
            if (migration2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(migration2);
                sb.append(" with ");
                sb.append(migration);
                Log.w("ROOM", sb.toString());
            }
            jVar.mo14174a(i2, migration);
        }

        /* renamed from: a */
        public List<Migration> mo5232a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m5108a(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: a */
        private List<Migration> m5108a(List<Migration> list, boolean z, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5 = z ? -1 : 1;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C3942j jVar = (C3942j) this.f3712a.mo14172a(i);
                if (jVar != null) {
                    int b = jVar.mo14175b();
                    z2 = false;
                    if (z) {
                        i4 = b - 1;
                        i3 = -1;
                    } else {
                        i3 = b;
                        i4 = 0;
                    }
                    while (true) {
                        if (i4 == i3) {
                            break;
                        }
                        int c = jVar.mo14178c(i4);
                        if (!z ? !(c < i2 || c >= i) : !(c > i2 || c <= i)) {
                            list.add(jVar.mo14182e(i4));
                            i = c;
                            z2 = true;
                            continue;
                            break;
                        }
                        i4 += i5;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    public RoomDatabase() {
        new ConcurrentHashMap();
        this.mInvalidationTracker = createInvalidationTracker();
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.mo5188b(writableDatabase);
        writableDatabase.mo5311m0();
    }

    public abstract void clearAllTables();

    public SupportSQLiteStatement compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().mo5307c(str);
    }

    /* access modifiers changed from: protected */
    public abstract InvalidationTracker createInvalidationTracker();

    /* access modifiers changed from: protected */
    public abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    @Deprecated
    public void endTransaction() {
        this.mOpenHelper.getWritableDatabase().mo5314p0();
        if (!inTransaction()) {
            this.mInvalidationTracker.mo5186b();
        }
    }

    /* access modifiers changed from: 0000 */
    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().mo5315q0();
    }

    public void init(DatabaseConfiguration databaseConfiguration) {
        this.mOpenHelper = createOpenHelper(databaseConfiguration);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (databaseConfiguration.f3658g == C0916b.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.mOpenHelper.mo5316a(z);
        }
        this.mCallbacks = databaseConfiguration.f3656e;
        this.mQueryExecutor = databaseConfiguration.f3659h;
        this.mTransactionExecutor = new C0943j(databaseConfiguration.f3660i);
        this.mAllowMainThreadQueries = databaseConfiguration.f3657f;
        this.mWriteAheadLoggingEnabled = z;
        if (databaseConfiguration.f3661j) {
            this.mInvalidationTracker.mo5181a(databaseConfiguration.f3653b, databaseConfiguration.f3654c);
        }
    }

    /* access modifiers changed from: protected */
    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.mInvalidationTracker.mo5183a(supportSQLiteDatabase);
    }

    public boolean isOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().mo5305a(supportSQLiteQuery);
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().mo5313o0();
    }
}
