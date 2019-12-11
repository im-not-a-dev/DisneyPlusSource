package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.database.SQLiteDatabaseCompat.SQLiteOpenOptions;
import java.io.File;

public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    /* access modifiers changed from: protected */
    @SQLiteOpenOptions
    public int determineOpenOptions(File file) {
        String parent = file.getParent();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-wal");
        return new File(parent, sb.toString()).exists() ? 1 : 0;
    }

    public SQLiteDatabase openDatabase(File file) throws SQLiteException {
        return performOpen(file, determineOpenOptions(file));
    }

    /* access modifiers changed from: protected */
    public SQLiteDatabase performOpen(File file, @SQLiteOpenOptions int i) {
        SQLiteDatabaseCompat instance = SQLiteDatabaseCompat.getInstance();
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, instance.provideOpenFlags(i) | 0);
        instance.enableFeatures(i, openDatabase);
        return openDatabase;
    }
}
