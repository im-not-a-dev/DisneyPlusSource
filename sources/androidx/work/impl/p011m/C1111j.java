package androidx.work.impl.p011m;

import android.os.Build.VERSION;
import androidx.work.C1024a;
import androidx.work.C1027c;
import androidx.work.C1034h;
import androidx.work.Data;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p096e.p105b.p106a.p109c.C3916a;

/* renamed from: androidx.work.impl.m.j */
/* compiled from: WorkSpec */
public class C1111j {

    /* renamed from: q */
    private static final String f4278q = C1034h.m5551a("WorkSpec");

    /* renamed from: r */
    public static final C3916a<List<C1114c>, List<WorkInfo>> f4279r = new C1112a();

    /* renamed from: a */
    public String f4280a;

    /* renamed from: b */
    public State f4281b = State.ENQUEUED;

    /* renamed from: c */
    public String f4282c;

    /* renamed from: d */
    public String f4283d = OverwritingInputMerger.class.getName();

    /* renamed from: e */
    public Data f4284e;

    /* renamed from: f */
    public Data f4285f;

    /* renamed from: g */
    public long f4286g;

    /* renamed from: h */
    public long f4287h;

    /* renamed from: i */
    public long f4288i;

    /* renamed from: j */
    public C1027c f4289j;

    /* renamed from: k */
    public int f4290k;

    /* renamed from: l */
    public C1024a f4291l;

    /* renamed from: m */
    public long f4292m;

    /* renamed from: n */
    public long f4293n;

    /* renamed from: o */
    public long f4294o;

    /* renamed from: p */
    public long f4295p;

    /* renamed from: androidx.work.impl.m.j$a */
    /* compiled from: WorkSpec */
    static class C1112a implements C3916a<List<C1114c>, List<WorkInfo>> {
        C1112a() {
        }

        /* renamed from: a */
        public List<WorkInfo> apply(List<C1114c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C1114c a : list) {
                arrayList.add(a.mo5863a());
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.work.impl.m.j$b */
    /* compiled from: WorkSpec */
    public static class C1113b {

        /* renamed from: a */
        public String f4296a;

        /* renamed from: b */
        public State f4297b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1113b.class != obj.getClass()) {
                return false;
            }
            C1113b bVar = (C1113b) obj;
            if (this.f4297b != bVar.f4297b) {
                return false;
            }
            return this.f4296a.equals(bVar.f4296a);
        }

        public int hashCode() {
            return (this.f4296a.hashCode() * 31) + this.f4297b.hashCode();
        }
    }

    /* renamed from: androidx.work.impl.m.j$c */
    /* compiled from: WorkSpec */
    public static class C1114c {

        /* renamed from: a */
        public String f4298a;

        /* renamed from: b */
        public State f4299b;

        /* renamed from: c */
        public Data f4300c;

        /* renamed from: d */
        public List<String> f4301d;

        /* renamed from: a */
        public WorkInfo mo5863a() {
            return new WorkInfo(UUID.fromString(this.f4298a), this.f4299b, this.f4300c, this.f4301d);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1114c.class != obj.getClass()) {
                return false;
            }
            C1114c cVar = (C1114c) obj;
            String str = this.f4298a;
            if (str == null ? cVar.f4298a != null : !str.equals(cVar.f4298a)) {
                return false;
            }
            if (this.f4299b != cVar.f4299b) {
                return false;
            }
            Data data = this.f4300c;
            if (data == null ? cVar.f4300c != null : !data.equals(cVar.f4300c)) {
                return false;
            }
            List<String> list = this.f4301d;
            List<String> list2 = cVar.f4301d;
            if (list != null) {
                z = list.equals(list2);
            } else if (list2 != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            String str = this.f4298a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            State state = this.f4299b;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            Data data = this.f4300c;
            int hashCode3 = (hashCode2 + (data != null ? data.hashCode() : 0)) * 31;
            List<String> list = this.f4301d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }
    }

    public C1111j(String str, String str2) {
        Data data = Data.f3998c;
        this.f4284e = data;
        this.f4285f = data;
        this.f4289j = C1027c.f4043i;
        this.f4291l = C1024a.EXPONENTIAL;
        this.f4292m = 30000;
        this.f4295p = -1;
        this.f4280a = str;
        this.f4282c = str2;
    }

    /* renamed from: a */
    public void mo5850a(long j) {
        if (j > 18000000) {
            C1034h.m5550a().mo5701e(f4278q, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < 10000) {
            C1034h.m5550a().mo5701e(f4278q, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.f4292m = j;
    }

    /* renamed from: b */
    public void mo5852b(long j) {
        if (j < 900000) {
            C1034h.m5550a().mo5701e(f4278q, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(900000)}), new Throwable[0]);
            j = 900000;
        }
        mo5851a(j, j);
    }

    /* renamed from: c */
    public boolean mo5854c() {
        return this.f4281b == State.ENQUEUED && this.f4290k > 0;
    }

    /* renamed from: d */
    public boolean mo5855d() {
        return this.f4287h != 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1111j.class != obj.getClass()) {
            return false;
        }
        C1111j jVar = (C1111j) obj;
        if (this.f4286g != jVar.f4286g || this.f4287h != jVar.f4287h || this.f4288i != jVar.f4288i || this.f4290k != jVar.f4290k || this.f4292m != jVar.f4292m || this.f4293n != jVar.f4293n || this.f4294o != jVar.f4294o || this.f4295p != jVar.f4295p || !this.f4280a.equals(jVar.f4280a) || this.f4281b != jVar.f4281b || !this.f4282c.equals(jVar.f4282c)) {
            return false;
        }
        String str = this.f4283d;
        if (str == null ? jVar.f4283d != null : !str.equals(jVar.f4283d)) {
            return false;
        }
        if (!this.f4284e.equals(jVar.f4284e) || !this.f4285f.equals(jVar.f4285f) || !this.f4289j.equals(jVar.f4289j)) {
            return false;
        }
        if (this.f4291l != jVar.f4291l) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.f4280a.hashCode() * 31) + this.f4281b.hashCode()) * 31) + this.f4282c.hashCode()) * 31;
        String str = this.f4283d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f4284e.hashCode()) * 31) + this.f4285f.hashCode()) * 31;
        long j = this.f4286g;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f4287h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f4288i;
        int hashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f4289j.hashCode()) * 31) + this.f4290k) * 31) + this.f4291l.hashCode()) * 31;
        long j4 = this.f4292m;
        int i3 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f4293n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f4294o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f4295p;
        return i5 + ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{WorkSpec: ");
        sb.append(this.f4280a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo5851a(long j, long j2) {
        if (j < 900000) {
            C1034h.m5550a().mo5701e(f4278q, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(900000)}), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            C1034h.m5550a().mo5701e(f4278q, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(300000)}), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            C1034h.m5550a().mo5701e(f4278q, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)}), new Throwable[0]);
            j2 = j;
        }
        this.f4287h = j;
        this.f4288i = j2;
    }

    /* renamed from: b */
    public boolean mo5853b() {
        return !C1027c.f4043i.equals(this.f4289j);
    }

    public C1111j(C1111j jVar) {
        Data data = Data.f3998c;
        this.f4284e = data;
        this.f4285f = data;
        this.f4289j = C1027c.f4043i;
        this.f4291l = C1024a.EXPONENTIAL;
        this.f4292m = 30000;
        this.f4295p = -1;
        this.f4280a = jVar.f4280a;
        this.f4282c = jVar.f4282c;
        this.f4281b = jVar.f4281b;
        this.f4283d = jVar.f4283d;
        this.f4284e = new Data(jVar.f4284e);
        this.f4285f = new Data(jVar.f4285f);
        this.f4286g = jVar.f4286g;
        this.f4287h = jVar.f4287h;
        this.f4288i = jVar.f4288i;
        this.f4289j = new C1027c(jVar.f4289j);
        this.f4290k = jVar.f4290k;
        this.f4291l = jVar.f4291l;
        this.f4292m = jVar.f4292m;
        this.f4293n = jVar.f4293n;
        this.f4294o = jVar.f4294o;
        this.f4295p = jVar.f4295p;
    }

    /* renamed from: a */
    public long mo5849a() {
        long j;
        boolean z = false;
        if (mo5854c()) {
            if (this.f4291l == C1024a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f4292m * ((long) this.f4290k);
            } else {
                j = (long) Math.scalb((float) this.f4292m, this.f4290k - 1);
            }
            return this.f4293n + Math.min(18000000, j);
        } else if (!mo5855d()) {
            return this.f4293n + this.f4286g;
        } else {
            if (VERSION.SDK_INT > 22) {
                return (this.f4293n + this.f4287h) - this.f4288i;
            }
            if (this.f4288i != this.f4287h) {
                z = true;
            }
            if (!z) {
                return this.f4293n + this.f4287h;
            }
            long j2 = this.f4293n == 0 ? -1 * this.f4288i : 0;
            long j3 = this.f4293n;
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            return j3 + this.f4287h + j2;
        }
    }
}
