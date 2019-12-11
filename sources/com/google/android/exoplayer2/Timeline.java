package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.source.p378l0.C9204a;
import com.google.android.exoplayer2.source.p378l0.C9204a.C9205a;

public abstract class Timeline {

    /* renamed from: a */
    public static final Timeline f18393a = new C8668a();

    /* renamed from: com.google.android.exoplayer2.Timeline$a */
    static class C8668a extends Timeline {
        C8668a() {
        }

        /* renamed from: a */
        public int mo22653a() {
            return 0;
        }

        /* renamed from: a */
        public int mo22656a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C8670c mo22665a(int i, C8670c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo22667b() {
            return 0;
        }

        /* renamed from: a */
        public C8669b mo22661a(int i, C8669b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public Object mo22666a(int i) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$b */
    public static final class C8669b {

        /* renamed from: a */
        public Object f18394a;

        /* renamed from: b */
        public int f18395b;

        /* renamed from: c */
        public long f18396c;

        /* renamed from: d */
        private long f18397d;

        /* renamed from: e */
        private C9204a f18398e = C9204a.f20836f;

        /* renamed from: a */
        public C8669b mo22676a(Object obj, Object obj2, int i, long j, long j2) {
            mo22677a(obj, obj2, i, j, j2, C9204a.f20836f);
            return this;
        }

        /* renamed from: b */
        public long mo22681b(int i) {
            return this.f18398e.f20838b[i];
        }

        /* renamed from: c */
        public long mo22683c() {
            return C.usToMs(this.f18396c);
        }

        /* renamed from: d */
        public long mo22685d() {
            return this.f18396c;
        }

        /* renamed from: e */
        public long mo22687e() {
            return C.usToMs(this.f18397d);
        }

        /* renamed from: f */
        public long mo22688f() {
            return this.f18397d;
        }

        /* renamed from: a */
        public C8669b mo22677a(Object obj, Object obj2, int i, long j, long j2, C9204a aVar) {
            this.f18394a = obj2;
            this.f18395b = i;
            this.f18396c = j;
            this.f18397d = j2;
            this.f18398e = aVar;
            return this;
        }

        /* renamed from: b */
        public int mo22678b(int i, int i2) {
            return this.f18398e.f20839c[i].mo23916a(i2);
        }

        /* renamed from: c */
        public int mo22682c(int i) {
            return this.f18398e.f20839c[i].mo23915a();
        }

        /* renamed from: d */
        public boolean mo22686d(int i) {
            return !this.f18398e.f20839c[i].mo23917b();
        }

        /* renamed from: b */
        public int mo22679b(long j) {
            return this.f18398e.mo23911a(j);
        }

        /* renamed from: c */
        public boolean mo22684c(int i, int i2) {
            C9205a aVar = this.f18398e.f20839c[i];
            return (aVar.f20842a == -1 || aVar.f20844c[i2] == 0) ? false : true;
        }

        /* renamed from: b */
        public long mo22680b() {
            return this.f18398e.f20840d;
        }

        /* renamed from: a */
        public int mo22672a() {
            return this.f18398e.f20837a;
        }

        /* renamed from: a */
        public int mo22674a(long j) {
            return this.f18398e.mo23912a(j, this.f18396c);
        }

        /* renamed from: a */
        public int mo22673a(int i) {
            return this.f18398e.f20839c[i].f20842a;
        }

        /* renamed from: a */
        public long mo22675a(int i, int i2) {
            C9205a aVar = this.f18398e.f20839c[i];
            if (aVar.f20842a != -1) {
                return aVar.f20845d[i2];
            }
            return -9223372036854775807L;
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$c */
    public static final class C8670c {

        /* renamed from: a */
        public boolean f18399a;

        /* renamed from: b */
        public boolean f18400b;

        /* renamed from: c */
        public int f18401c;

        /* renamed from: d */
        public int f18402d;

        /* renamed from: e */
        public long f18403e;

        /* renamed from: f */
        public long f18404f;

        /* renamed from: g */
        public long f18405g;

        /* renamed from: a */
        public C8670c mo22690a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f18399a = z;
            this.f18400b = z2;
            this.f18403e = j3;
            this.f18404f = j4;
            this.f18401c = i;
            this.f18402d = i2;
            this.f18405g = j5;
            return this;
        }

        /* renamed from: b */
        public long mo22691b() {
            return this.f18403e;
        }

        /* renamed from: c */
        public long mo22692c() {
            return C.usToMs(this.f18404f);
        }

        /* renamed from: d */
        public long mo22693d() {
            return this.f18405g;
        }

        /* renamed from: a */
        public long mo22689a() {
            return C.usToMs(this.f18403e);
        }
    }

    /* renamed from: a */
    public abstract int mo22653a();

    /* renamed from: a */
    public int mo22654a(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == mo22669b(z) ? -1 : i + 1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == mo22669b(z) ? mo22657a(z) : i + 1;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public abstract int mo22656a(Object obj);

    /* renamed from: a */
    public abstract C8669b mo22661a(int i, C8669b bVar, boolean z);

    /* renamed from: a */
    public abstract C8670c mo22665a(int i, C8670c cVar, boolean z, long j);

    /* renamed from: a */
    public abstract Object mo22666a(int i);

    /* renamed from: b */
    public abstract int mo22667b();

    /* renamed from: b */
    public int mo22668b(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == mo22657a(z) ? -1 : i - 1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == mo22657a(z) ? mo22669b(z) : i - 1;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public final boolean mo22671c() {
        return mo22667b() == 0;
    }

    /* renamed from: a */
    public int mo22657a(boolean z) {
        return mo22671c() ? -1 : 0;
    }

    /* renamed from: b */
    public int mo22669b(boolean z) {
        if (mo22671c()) {
            return -1;
        }
        return mo22667b() - 1;
    }

    /* renamed from: a */
    public final C8670c mo22663a(int i, C8670c cVar) {
        return mo22664a(i, cVar, false);
    }

    /* renamed from: b */
    public final boolean mo22670b(int i, C8669b bVar, C8670c cVar, int i2, boolean z) {
        return mo22655a(i, bVar, cVar, i2, z) == -1;
    }

    /* renamed from: a */
    public final C8670c mo22664a(int i, C8670c cVar, boolean z) {
        return mo22665a(i, cVar, z, 0);
    }

    /* renamed from: a */
    public final int mo22655a(int i, C8669b bVar, C8670c cVar, int i2, boolean z) {
        int i3 = mo22660a(i, bVar).f18395b;
        if (mo22663a(i3, cVar).f18402d != i) {
            return i + 1;
        }
        int a = mo22654a(i3, i2, z);
        if (a == -1) {
            return -1;
        }
        return mo22663a(a, cVar).f18401c;
    }

    /* renamed from: a */
    public final Pair<Object, Long> mo22658a(C8670c cVar, C8669b bVar, int i, long j) {
        Pair<Object, Long> a = mo22659a(cVar, bVar, i, j, 0);
        Assertions.checkNotNull(a);
        return a;
    }

    /* renamed from: a */
    public final Pair<Object, Long> mo22659a(C8670c cVar, C8669b bVar, int i, long j, long j2) {
        Assertions.m29295a(i, 0, mo22667b());
        mo22665a(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.mo22691b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f18401c;
        long d = cVar.mo22693d() + j;
        long d2 = mo22661a(i2, bVar, true).mo22685d();
        while (d2 != -9223372036854775807L && d >= d2 && i2 < cVar.f18402d) {
            d -= d2;
            i2++;
            d2 = mo22661a(i2, bVar, true).mo22685d();
        }
        Object obj = bVar.f18394a;
        Assertions.checkNotNull(obj);
        return Pair.create(obj, Long.valueOf(d));
    }

    /* renamed from: a */
    public C8669b mo22662a(Object obj, C8669b bVar) {
        return mo22661a(mo22656a(obj), bVar, true);
    }

    /* renamed from: a */
    public final C8669b mo22660a(int i, C8669b bVar) {
        return mo22661a(i, bVar, false);
    }
}
