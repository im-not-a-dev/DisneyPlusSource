package p163g.p174d.p178b.p195l0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.d.b.l0.a */
/* compiled from: Schedule.kt */
public final class C5298a {

    /* renamed from: a */
    private boolean f12695a;

    /* renamed from: b */
    private final long f12696b;

    /* renamed from: c */
    private final TimeUnit f12697c;

    /* renamed from: d */
    private final long f12698d;

    /* renamed from: e */
    private final TimeUnit f12699e;

    /* renamed from: f */
    private final long f12700f;

    /* renamed from: g */
    private final TimeUnit f12701g;

    public C5298a(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, long j3, TimeUnit timeUnit3) {
        this.f12696b = j;
        this.f12697c = timeUnit;
        this.f12698d = j2;
        this.f12699e = timeUnit2;
        this.f12700f = j3;
        this.f12701g = timeUnit3;
    }

    /* renamed from: a */
    public final void mo16920a(boolean z) {
        this.f12695a = z;
    }

    /* renamed from: b */
    public final long mo16921b() {
        return this.f12701g.toMillis(this.f12700f);
    }

    /* renamed from: c */
    public final boolean mo16922c() {
        return this.f12695a;
    }

    /* renamed from: d */
    public final long mo16923d() {
        return this.f12697c.toMillis(this.f12696b);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5298a) {
                C5298a aVar = (C5298a) obj;
                if ((this.f12696b == aVar.f12696b) && Intrinsics.areEqual((Object) this.f12697c, (Object) aVar.f12697c)) {
                    if ((this.f12698d == aVar.f12698d) && Intrinsics.areEqual((Object) this.f12699e, (Object) aVar.f12699e)) {
                        if (!(this.f12700f == aVar.f12700f) || !Intrinsics.areEqual((Object) this.f12701g, (Object) aVar.f12701g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f12696b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        TimeUnit timeUnit = this.f12697c;
        int i2 = 0;
        int hashCode = (i + (timeUnit != null ? timeUnit.hashCode() : 0)) * 31;
        long j2 = this.f12698d;
        int i3 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        TimeUnit timeUnit2 = this.f12699e;
        int hashCode2 = (i3 + (timeUnit2 != null ? timeUnit2.hashCode() : 0)) * 31;
        long j3 = this.f12700f;
        int i4 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        TimeUnit timeUnit3 = this.f12701g;
        if (timeUnit3 != null) {
            i2 = timeUnit3.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Schedule(startTime=");
        sb.append(this.f12696b);
        sb.append(", startTimeTimeUnit=");
        sb.append(this.f12697c);
        sb.append(", duration=");
        sb.append(this.f12698d);
        sb.append(", durationTimeUnit=");
        sb.append(this.f12699e);
        sb.append(", endTime=");
        sb.append(this.f12700f);
        sb.append(", endTimeTimeUnit=");
        sb.append(this.f12701g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C5298a(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2, long j3, TimeUnit timeUnit3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TimeUnit timeUnit4 = (i & 2) != 0 ? TimeUnit.MILLISECONDS : timeUnit;
        long j4 = (i & 4) != 0 ? 10000 : j2;
        this(j, timeUnit4, j4, (i & 8) != 0 ? TimeUnit.MILLISECONDS : timeUnit2, (i & 16) != 0 ? j + j4 : j3, (i & 32) != 0 ? TimeUnit.MILLISECONDS : timeUnit3);
    }

    /* renamed from: a */
    public final long mo16919a() {
        return this.f12699e.toMillis(this.f12698d);
    }

    public C5298a() {
        this(0, 0, 0);
    }

    public C5298a(long j, long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this(j, timeUnit, j2, timeUnit, 0, null, 48, null);
    }

    public C5298a(long j, long j2, long j3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this(j, timeUnit, j2, timeUnit, j3, timeUnit);
    }
}
