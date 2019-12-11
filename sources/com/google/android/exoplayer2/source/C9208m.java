package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;

/* renamed from: com.google.android.exoplayer2.source.m */
/* compiled from: AbstractConcatenatedTimeline */
abstract class C9208m extends Timeline {

    /* renamed from: b */
    private final int f20846b;

    /* renamed from: c */
    private final C9146h0 f20847c;

    /* renamed from: d */
    private final boolean f20848d;

    public C9208m(boolean z, C9146h0 h0Var) {
        this.f20848d = z;
        this.f20847c = h0Var;
        this.f20846b = h0Var.mo23777a();
    }

    /* renamed from: a */
    public static Object m27729a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: c */
    public static Object m27731c(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: d */
    public static Object m27732d(Object obj) {
        return ((Pair) obj).first;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo23920b(int i);

    /* renamed from: b */
    public int mo22668b(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f20848d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c = mo23922c(i);
        int f = mo23925f(c);
        Timeline g = mo23926g(c);
        int i4 = i - f;
        if (i2 != 2) {
            i3 = i2;
        }
        int b = g.mo22668b(i4, i3, z);
        if (b != -1) {
            return f + b;
        }
        int b2 = m27730b(c, z);
        while (b2 != -1 && mo23926g(b2).mo22671c()) {
            b2 = m27730b(b2, z);
        }
        if (b2 != -1) {
            return mo23925f(b2) + mo23926g(b2).mo22669b(z);
        }
        if (i2 == 2) {
            return mo22669b(z);
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo23921b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo23922c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo23923d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo23924e(int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo23925f(int i);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract Timeline mo23926g(int i);

    /* renamed from: a */
    public int mo22654a(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f20848d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c = mo23922c(i);
        int f = mo23925f(c);
        Timeline g = mo23926g(c);
        int i4 = i - f;
        if (i2 != 2) {
            i3 = i2;
        }
        int a = g.mo22654a(i4, i3, z);
        if (a != -1) {
            return f + a;
        }
        int a2 = m27728a(c, z);
        while (a2 != -1 && mo23926g(a2).mo22671c()) {
            a2 = m27728a(a2, z);
        }
        if (a2 != -1) {
            return mo23925f(a2) + mo23926g(a2).mo22657a(z);
        }
        if (i2 == 2) {
            return mo22657a(z);
        }
        return -1;
    }

    /* renamed from: b */
    public int mo22669b(boolean z) {
        if (this.f20846b == 0) {
            return -1;
        }
        if (this.f20848d) {
            z = false;
        }
        int c = z ? this.f20847c.mo23781c() : this.f20846b - 1;
        while (mo23926g(c).mo22671c()) {
            c = m27730b(c, z);
            if (c == -1) {
                return -1;
            }
        }
        return mo23925f(c) + mo23926g(c).mo22669b(z);
    }

    /* renamed from: a */
    public int mo22657a(boolean z) {
        if (this.f20846b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f20848d) {
            z = false;
        }
        if (z) {
            i = this.f20847c.mo23779b();
        }
        while (mo23926g(i).mo22671c()) {
            i = m27728a(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo23925f(i) + mo23926g(i).mo22657a(z);
    }

    /* renamed from: b */
    private int m27730b(int i, boolean z) {
        if (z) {
            return this.f20847c.mo23778a(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final C8670c mo22665a(int i, C8670c cVar, boolean z, long j) {
        int c = mo23922c(i);
        int f = mo23925f(c);
        int e = mo23924e(c);
        mo23926g(c).mo22665a(i - f, cVar, z, j);
        cVar.f18401c += e;
        cVar.f18402d += e;
        return cVar;
    }

    /* renamed from: a */
    public final C8669b mo22662a(Object obj, C8669b bVar) {
        Object d = m27732d(obj);
        Object c = m27731c(obj);
        int b = mo23921b(d);
        int f = mo23925f(b);
        mo23926g(b).mo22662a(c, bVar);
        bVar.f18395b += f;
        bVar.f18394a = obj;
        return bVar;
    }

    /* renamed from: a */
    public final C8669b mo22661a(int i, C8669b bVar, boolean z) {
        int b = mo23920b(i);
        int f = mo23925f(b);
        mo23926g(b).mo22661a(i - mo23924e(b), bVar, z);
        bVar.f18395b += f;
        if (z) {
            bVar.f18394a = m27729a(mo23923d(b), bVar.f18394a);
        }
        return bVar;
    }

    /* renamed from: a */
    public final int mo22656a(Object obj) {
        int i = -1;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object d = m27732d(obj);
        Object c = m27731c(obj);
        int b = mo23921b(d);
        if (b == -1) {
            return -1;
        }
        int a = mo23926g(b).mo22656a(c);
        if (a != -1) {
            i = mo23924e(b) + a;
        }
        return i;
    }

    /* renamed from: a */
    public final Object mo22666a(int i) {
        int b = mo23920b(i);
        return m27729a(mo23923d(b), mo23926g(b).mo22666a(i - mo23924e(b)));
    }

    /* renamed from: a */
    private int m27728a(int i, boolean z) {
        if (z) {
            return this.f20847c.mo23780b(i);
        }
        if (i < this.f20846b - 1) {
            return i + 1;
        }
        return -1;
    }
}
