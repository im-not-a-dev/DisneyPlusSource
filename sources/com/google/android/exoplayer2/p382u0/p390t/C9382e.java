package com.google.android.exoplayer2.p382u0.p390t;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p393v0.Log;

/* renamed from: com.google.android.exoplayer2.u0.t.e */
/* compiled from: WebvttCue */
public final class C9382e extends C9322b {

    /* renamed from: i0 */
    public final long f21641i0;

    /* renamed from: j0 */
    public final long f21642j0;

    /* renamed from: com.google.android.exoplayer2.u0.t.e$a */
    /* compiled from: WebvttCue */
    static /* synthetic */ class C9383a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21643a = new int[Alignment.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21643a = r0
                int[] r0 = f21643a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21643a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f21643a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p382u0.p390t.C9382e.C9383a.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.u0.t.e$b */
    /* compiled from: WebvttCue */
    public static class C9384b {

        /* renamed from: a */
        private long f21644a;

        /* renamed from: b */
        private long f21645b;

        /* renamed from: c */
        private SpannableStringBuilder f21646c;

        /* renamed from: d */
        private Alignment f21647d;

        /* renamed from: e */
        private float f21648e;

        /* renamed from: f */
        private int f21649f;

        /* renamed from: g */
        private int f21650g;

        /* renamed from: h */
        private float f21651h;

        /* renamed from: i */
        private int f21652i;

        /* renamed from: j */
        private float f21653j;

        public C9384b() {
            mo24255b();
        }

        /* renamed from: a */
        public C9382e mo24251a() {
            if (this.f21651h != Float.MIN_VALUE && this.f21652i == Integer.MIN_VALUE) {
                m28680c();
            }
            C9382e eVar = new C9382e(this.f21644a, this.f21645b, this.f21646c, this.f21647d, this.f21648e, this.f21649f, this.f21650g, this.f21651h, this.f21652i, this.f21653j);
            return eVar;
        }

        /* renamed from: b */
        public void mo24255b() {
            this.f21644a = 0;
            this.f21645b = 0;
            this.f21646c = null;
            this.f21647d = null;
            this.f21648e = Float.MIN_VALUE;
            this.f21649f = Integer.MIN_VALUE;
            this.f21650g = Integer.MIN_VALUE;
            this.f21651h = Float.MIN_VALUE;
            this.f21652i = Integer.MIN_VALUE;
            this.f21653j = Float.MIN_VALUE;
        }

        /* renamed from: c */
        public C9384b mo24257c(int i) {
            this.f21652i = i;
            return this;
        }

        /* renamed from: c */
        public C9384b mo24256c(float f) {
            this.f21653j = f;
            return this;
        }

        /* renamed from: c */
        private C9384b m28680c() {
            Alignment alignment = this.f21647d;
            if (alignment == null) {
                this.f21652i = Integer.MIN_VALUE;
            } else {
                int i = C9383a.f21643a[alignment.ordinal()];
                if (i == 1) {
                    this.f21652i = 0;
                } else if (i == 2) {
                    this.f21652i = 1;
                } else if (i != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized alignment: ");
                    sb.append(this.f21647d);
                    Log.m29500d("WebvttCueBuilder", sb.toString());
                    this.f21652i = 0;
                } else {
                    this.f21652i = 2;
                }
            }
            return this;
        }

        /* renamed from: a */
        public C9384b mo24248a(long j) {
            this.f21645b = j;
            return this;
        }

        /* renamed from: a */
        public C9384b mo24250a(SpannableStringBuilder spannableStringBuilder) {
            this.f21646c = spannableStringBuilder;
            return this;
        }

        /* renamed from: a */
        public C9384b mo24249a(Alignment alignment) {
            this.f21647d = alignment;
            return this;
        }

        /* renamed from: a */
        public C9384b mo24246a(float f) {
            this.f21648e = f;
            return this;
        }

        /* renamed from: a */
        public C9384b mo24247a(int i) {
            this.f21650g = i;
            return this;
        }

        /* renamed from: b */
        public C9384b mo24254b(long j) {
            this.f21644a = j;
            return this;
        }

        /* renamed from: b */
        public C9384b mo24253b(int i) {
            this.f21649f = i;
            return this;
        }

        /* renamed from: b */
        public C9384b mo24252b(float f) {
            this.f21651h = f;
            return this;
        }
    }

    public C9382e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    /* renamed from: a */
    public boolean mo24245a() {
        return this.f21348W == Float.MIN_VALUE && this.f21351Z == Float.MIN_VALUE;
    }

    public C9382e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C9382e(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f21641i0 = j;
        this.f21642j0 = j2;
    }
}
