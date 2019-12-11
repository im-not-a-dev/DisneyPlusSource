package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.p393v0.C9537e;

/* renamed from: com.google.android.exoplayer2.s0.o */
/* compiled from: SeekMap */
public interface C8920o {

    /* renamed from: com.google.android.exoplayer2.s0.o$a */
    /* compiled from: SeekMap */
    public static final class C8921a {

        /* renamed from: a */
        public final C8923p f19164a;

        /* renamed from: b */
        public final C8923p f19165b;

        public C8921a(C8923p pVar) {
            this(pVar, pVar);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C8921a.class != obj.getClass()) {
                return false;
            }
            C8921a aVar = (C8921a) obj;
            if (!this.f19164a.equals(aVar.f19164a) || !this.f19165b.equals(aVar.f19165b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f19164a.hashCode() * 31) + this.f19165b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f19164a);
            if (this.f19164a.equals(this.f19165b)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", ");
                sb2.append(this.f19165b);
                str = sb2.toString();
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C8921a(C8923p pVar, C8923p pVar2) {
            C9537e.m29296a(pVar);
            this.f19164a = pVar;
            C9537e.m29296a(pVar2);
            this.f19165b = pVar2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.o$b */
    /* compiled from: SeekMap */
    public static final class C8922b implements C8920o {

        /* renamed from: a */
        private final long f19166a;

        /* renamed from: b */
        private final C8921a f19167b;

        public C8922b(long j) {
            this(j, 0);
        }

        /* renamed from: b */
        public C8921a mo23277b(long j) {
            return this.f19167b;
        }

        /* renamed from: c */
        public boolean mo23279c() {
            return false;
        }

        /* renamed from: d */
        public long mo23280d() {
            return this.f19166a;
        }

        public C8922b(long j, long j2) {
            this.f19166a = j;
            this.f19167b = new C8921a(j2 == 0 ? C8923p.f19168c : new C8923p(0, j2));
        }
    }

    /* renamed from: b */
    C8921a mo23277b(long j);

    /* renamed from: c */
    boolean mo23279c();

    /* renamed from: d */
    long mo23280d();
}
