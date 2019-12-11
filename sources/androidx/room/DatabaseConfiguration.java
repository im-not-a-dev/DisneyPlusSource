package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase.C0916b;
import androidx.room.RoomDatabase.C0917c;
import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0961c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class DatabaseConfiguration {

    /* renamed from: a */
    public final C0961c f3652a;

    /* renamed from: b */
    public final Context f3653b;

    /* renamed from: c */
    public final String f3654c;

    /* renamed from: d */
    public final C0917c f3655d;

    /* renamed from: e */
    public final List<Callback> f3656e;

    /* renamed from: f */
    public final boolean f3657f;

    /* renamed from: g */
    public final C0916b f3658g;

    /* renamed from: h */
    public final Executor f3659h;

    /* renamed from: i */
    public final Executor f3660i;

    /* renamed from: j */
    public final boolean f3661j;

    /* renamed from: k */
    public final boolean f3662k;

    /* renamed from: l */
    public final boolean f3663l;

    /* renamed from: m */
    private final Set<Integer> f3664m;

    public DatabaseConfiguration(Context context, String str, C0961c cVar, C0917c cVar2, List<Callback> list, boolean z, C0916b bVar, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this.f3652a = cVar;
        this.f3653b = context;
        this.f3654c = str;
        this.f3655d = cVar2;
        this.f3656e = list;
        this.f3657f = z;
        this.f3658g = bVar;
        this.f3659h = executor;
        this.f3660i = executor2;
        this.f3661j = z2;
        this.f3662k = z3;
        this.f3663l = z4;
        this.f3664m = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r3)) != false) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5174a(int r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 <= r4) goto L_0x0006
            r4 = 1
            goto L_0x0007
        L_0x0006:
            r4 = 0
        L_0x0007:
            if (r4 == 0) goto L_0x000e
            boolean r4 = r2.f3663l
            if (r4 == 0) goto L_0x000e
            return r1
        L_0x000e:
            boolean r4 = r2.f3662k
            if (r4 == 0) goto L_0x0021
            java.util.Set<java.lang.Integer> r4 = r2.f3664m
            if (r4 == 0) goto L_0x0022
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.mo5174a(int, int):boolean");
    }
}
