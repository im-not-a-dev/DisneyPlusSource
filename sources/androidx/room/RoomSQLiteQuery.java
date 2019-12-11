package androidx.room;

import androidx.sqlite.p004db.C0963b;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RoomSQLiteQuery implements SupportSQLiteQuery, C0963b {

    /* renamed from: b0 */
    static final TreeMap<Integer, RoomSQLiteQuery> f3713b0 = new TreeMap<>();

    /* renamed from: U */
    final long[] f3714U;

    /* renamed from: V */
    final double[] f3715V;

    /* renamed from: W */
    final String[] f3716W;

    /* renamed from: X */
    final byte[][] f3717X;

    /* renamed from: Y */
    private final int[] f3718Y;

    /* renamed from: Z */
    final int f3719Z;

    /* renamed from: a0 */
    int f3720a0;

    /* renamed from: c */
    private volatile String f3721c;

    private RoomSQLiteQuery(int i) {
        this.f3719Z = i;
        int i2 = i + 1;
        this.f3718Y = new int[i2];
        this.f3714U = new long[i2];
        this.f3715V = new double[i2];
        this.f3716W = new String[i2];
        this.f3717X = new byte[i2][];
    }

    /* renamed from: b */
    public static RoomSQLiteQuery m5112b(String str, int i) {
        synchronized (f3713b0) {
            Entry ceilingEntry = f3713b0.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f3713b0.remove(ceilingEntry.getKey());
                RoomSQLiteQuery roomSQLiteQuery = (RoomSQLiteQuery) ceilingEntry.getValue();
                roomSQLiteQuery.mo5241a(str, i);
                return roomSQLiteQuery;
            }
            RoomSQLiteQuery roomSQLiteQuery2 = new RoomSQLiteQuery(i);
            roomSQLiteQuery2.mo5241a(str, i);
            return roomSQLiteQuery2;
        }
    }

    /* renamed from: c */
    private static void m5113c() {
        if (f3713b0.size() > 15) {
            int size = f3713b0.size() - 10;
            Iterator it = f3713b0.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5241a(String str, int i) {
        this.f3721c = str;
        this.f3720a0 = i;
    }

    public void close() {
    }

    /* renamed from: a */
    public String mo5234a() {
        return this.f3721c;
    }

    /* renamed from: a */
    public void mo5240a(C0963b bVar) {
        for (int i = 1; i <= this.f3720a0; i++) {
            int i2 = this.f3718Y[i];
            if (i2 == 1) {
                bVar.mo5235a(i);
            } else if (i2 == 2) {
                bVar.mo5237a(i, this.f3714U[i]);
            } else if (i2 == 3) {
                bVar.mo5236a(i, this.f3715V[i]);
            } else if (i2 == 4) {
                bVar.mo5238a(i, this.f3716W[i]);
            } else if (i2 == 5) {
                bVar.mo5239a(i, this.f3717X[i]);
            }
        }
    }

    /* renamed from: a */
    public void mo5235a(int i) {
        this.f3718Y[i] = 1;
    }

    /* renamed from: a */
    public void mo5237a(int i, long j) {
        this.f3718Y[i] = 2;
        this.f3714U[i] = j;
    }

    /* renamed from: b */
    public void mo5242b() {
        synchronized (f3713b0) {
            f3713b0.put(Integer.valueOf(this.f3719Z), this);
            m5113c();
        }
    }

    /* renamed from: a */
    public void mo5236a(int i, double d) {
        this.f3718Y[i] = 3;
        this.f3715V[i] = d;
    }

    /* renamed from: a */
    public void mo5238a(int i, String str) {
        this.f3718Y[i] = 4;
        this.f3716W[i] = str;
    }

    /* renamed from: a */
    public void mo5239a(int i, byte[] bArr) {
        this.f3718Y[i] = 5;
        this.f3717X[i] = bArr;
    }
}
