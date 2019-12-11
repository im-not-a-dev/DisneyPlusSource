package androidx.work;

import android.os.Build.VERSION;

/* renamed from: androidx.work.c */
/* compiled from: Constraints */
public final class C1027c {

    /* renamed from: i */
    public static final C1027c f4043i = new C1028a().mo5684a();

    /* renamed from: a */
    private C1036i f4044a = C1036i.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f4045b;

    /* renamed from: c */
    private boolean f4046c;

    /* renamed from: d */
    private boolean f4047d;

    /* renamed from: e */
    private boolean f4048e;

    /* renamed from: f */
    private long f4049f = -1;

    /* renamed from: g */
    private long f4050g = -1;

    /* renamed from: h */
    private C1029d f4051h = new C1029d();

    /* renamed from: androidx.work.c$a */
    /* compiled from: Constraints */
    public static final class C1028a {

        /* renamed from: a */
        boolean f4052a = false;

        /* renamed from: b */
        boolean f4053b = false;

        /* renamed from: c */
        C1036i f4054c = C1036i.NOT_REQUIRED;

        /* renamed from: d */
        boolean f4055d = false;

        /* renamed from: e */
        boolean f4056e = false;

        /* renamed from: f */
        long f4057f = -1;

        /* renamed from: g */
        long f4058g = -1;

        /* renamed from: h */
        C1029d f4059h = new C1029d();

        /* renamed from: a */
        public C1028a mo5682a(C1036i iVar) {
            this.f4054c = iVar;
            return this;
        }

        /* renamed from: b */
        public C1028a mo5685b(boolean z) {
            this.f4052a = z;
            return this;
        }

        /* renamed from: c */
        public C1028a mo5686c(boolean z) {
            this.f4053b = z;
            return this;
        }

        /* renamed from: d */
        public C1028a mo5687d(boolean z) {
            this.f4056e = z;
            return this;
        }

        /* renamed from: a */
        public C1028a mo5683a(boolean z) {
            this.f4055d = z;
            return this;
        }

        /* renamed from: a */
        public C1027c mo5684a() {
            return new C1027c(this);
        }
    }

    public C1027c() {
    }

    /* renamed from: a */
    public void mo5666a(C1036i iVar) {
        this.f4044a = iVar;
    }

    /* renamed from: b */
    public C1036i mo5668b() {
        return this.f4044a;
    }

    /* renamed from: c */
    public void mo5672c(boolean z) {
        this.f4046c = z;
    }

    /* renamed from: d */
    public void mo5674d(boolean z) {
        this.f4048e = z;
    }

    /* renamed from: e */
    public boolean mo5675e() {
        return this.f4051h.mo5690b() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1027c.class != obj.getClass()) {
            return false;
        }
        C1027c cVar = (C1027c) obj;
        if (this.f4045b == cVar.f4045b && this.f4046c == cVar.f4046c && this.f4047d == cVar.f4047d && this.f4048e == cVar.f4048e && this.f4049f == cVar.f4049f && this.f4050g == cVar.f4050g && this.f4044a == cVar.f4044a) {
            return this.f4051h.equals(cVar.f4051h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5677f() {
        return this.f4047d;
    }

    /* renamed from: g */
    public boolean mo5678g() {
        return this.f4045b;
    }

    /* renamed from: h */
    public boolean mo5679h() {
        return this.f4046c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f4044a.hashCode() * 31) + (this.f4045b ? 1 : 0)) * 31) + (this.f4046c ? 1 : 0)) * 31) + (this.f4047d ? 1 : 0)) * 31) + (this.f4048e ? 1 : 0)) * 31;
        long j = this.f4049f;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f4050g;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f4051h.hashCode();
    }

    /* renamed from: i */
    public boolean mo5681i() {
        return this.f4048e;
    }

    /* renamed from: a */
    public void mo5667a(boolean z) {
        this.f4047d = z;
    }

    /* renamed from: b */
    public void mo5670b(boolean z) {
        this.f4045b = z;
    }

    /* renamed from: c */
    public long mo5671c() {
        return this.f4049f;
    }

    /* renamed from: d */
    public long mo5673d() {
        return this.f4050g;
    }

    /* renamed from: a */
    public void mo5664a(long j) {
        this.f4049f = j;
    }

    /* renamed from: b */
    public void mo5669b(long j) {
        this.f4050g = j;
    }

    /* renamed from: a */
    public void mo5665a(C1029d dVar) {
        this.f4051h = dVar;
    }

    /* renamed from: a */
    public C1029d mo5663a() {
        return this.f4051h;
    }

    C1027c(C1028a aVar) {
        this.f4045b = aVar.f4052a;
        this.f4046c = VERSION.SDK_INT >= 23 && aVar.f4053b;
        this.f4044a = aVar.f4054c;
        this.f4047d = aVar.f4055d;
        this.f4048e = aVar.f4056e;
        if (VERSION.SDK_INT >= 24) {
            this.f4051h = aVar.f4059h;
            this.f4049f = aVar.f4057f;
            this.f4050g = aVar.f4058g;
        }
    }

    public C1027c(C1027c cVar) {
        this.f4045b = cVar.f4045b;
        this.f4046c = cVar.f4046c;
        this.f4044a = cVar.f4044a;
        this.f4047d = cVar.f4047d;
        this.f4048e = cVar.f4048e;
        this.f4051h = cVar.f4051h;
    }
}
