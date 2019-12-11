package p161f.p162a;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: f.a.r2 */
public final class C4568r2 extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final String f11369a = C1557c.m7461a(C4568r2.class);

    /* renamed from: b */
    private static volatile Map<String, C4568r2> f11370b = new HashMap();

    /* renamed from: c */
    private static final String[] f11371c = {"ab_events", "ab_sessions", "sessions", "appboy_events"};

    private C4568r2(Context context, String str) {
        super(context, str, null, 3);
    }

    /* renamed from: a */
    public static C4568r2 m15863a(Context context, String str, String str2) {
        String b = m15865b(context, str, str2);
        if (!f11370b.containsKey(b)) {
            synchronized (C4568r2.class) {
                if (!f11370b.containsKey(b)) {
                    C4568r2 r2Var = new C4568r2(context, b);
                    f11370b.put(b, r2Var);
                    return r2Var;
                }
            }
        }
        return (C4568r2) f11370b.get(b);
    }

    /* renamed from: b */
    static String m15865b(Context context, String str, String str2) {
        String str3 = "appboy.db";
        if (C1563i.m7490d(str)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(C1563i.m7484a(context, str, str2));
        return sb.toString();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1557c.m7469c(f11369a, "Creating ab_events table");
        sQLiteDatabase.execSQL("CREATE TABLE ab_events (_id INTEGER PRIMARY KEY AUTOINCREMENT, session_id TEXT, user_id TEXT, event_type TEXT NOT NULL, event_data TEXT NOT NULL, event_guid TEXT NOT NULL, timestamp INTEGER NOT NULL);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = f11369a;
        StringBuilder sb = new StringBuilder();
        sb.append("Downgrading storage from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(". Dropping all current tables.");
        C1557c.m7469c(str, sb.toString());
        m15864a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    @TargetApi(16)
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = f11369a;
        StringBuilder sb = new StringBuilder();
        sb.append("Upgrading storage from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(". Dropping all current tables.");
        C1557c.m7469c(str, sb.toString());
        m15864a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private static void m15864a(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        for (String str : f11371c) {
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sQLiteDatabase.execSQL(sb.toString());
            String str2 = f11369a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropped table with name: ");
            sb2.append(str);
            C1557c.m7458a(str2, sb2.toString());
        }
    }
}
