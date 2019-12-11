package com.google.android.exoplayer2.source;

/* renamed from: com.google.android.exoplayer2.source.h0 */
/* compiled from: ShuffleOrder */
public interface C9146h0 {

    /* renamed from: com.google.android.exoplayer2.source.h0$a */
    /* compiled from: ShuffleOrder */
    public static final class C9147a implements C9146h0 {

        /* renamed from: a */
        private final int f20529a;

        public C9147a(int i) {
            this.f20529a = i;
        }

        /* renamed from: a */
        public int mo23777a() {
            return this.f20529a;
        }

        /* renamed from: a */
        public int mo23778a(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        /* renamed from: b */
        public int mo23780b(int i) {
            int i2 = i + 1;
            if (i2 < this.f20529a) {
                return i2;
            }
            return -1;
        }

        /* renamed from: c */
        public int mo23781c() {
            int i = this.f20529a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        /* renamed from: b */
        public int mo23779b() {
            return this.f20529a > 0 ? 0 : -1;
        }
    }

    /* renamed from: a */
    int mo23777a();

    /* renamed from: a */
    int mo23778a(int i);

    /* renamed from: b */
    int mo23779b();

    /* renamed from: b */
    int mo23780b(int i);

    /* renamed from: c */
    int mo23781c();
}
