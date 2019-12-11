package androidx.room;

import androidx.sqlite.p004db.SupportSQLiteStatement;

public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    public final void insert(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            acquire.mo5324l0();
        } finally {
            release(acquire);
        }
    }

    public final void insert(Iterable<T> iterable) {
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T bind : iterable) {
                bind(acquire, bind);
                acquire.mo5324l0();
            }
        } finally {
            release(acquire);
        }
    }
}
