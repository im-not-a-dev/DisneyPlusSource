package androidx.room;

import androidx.sqlite.p004db.SupportSQLiteStatement;

public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    public final int handle(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.mo5323k0();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                i += acquire.mo5323k0();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
