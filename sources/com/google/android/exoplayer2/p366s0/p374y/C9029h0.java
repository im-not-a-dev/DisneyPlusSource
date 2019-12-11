package com.google.android.exoplayer2.p366s0.p374y;

import android.util.SparseArray;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.h0 */
/* compiled from: TsPayloadReader */
public interface C9029h0 {

    /* renamed from: com.google.android.exoplayer2.s0.y.h0$a */
    /* compiled from: TsPayloadReader */
    public static final class C9030a {

        /* renamed from: a */
        public final String f19868a;

        /* renamed from: b */
        public final byte[] f19869b;

        public C9030a(String str, int i, byte[] bArr) {
            this.f19868a = str;
            this.f19869b = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.y.h0$b */
    /* compiled from: TsPayloadReader */
    public static final class C9031b {

        /* renamed from: a */
        public final int f19870a;

        /* renamed from: b */
        public final String f19871b;

        /* renamed from: c */
        public final List<C9030a> f19872c;

        /* renamed from: d */
        public final byte[] f19873d;

        public C9031b(int i, String str, List<C9030a> list, byte[] bArr) {
            List<C9030a> list2;
            this.f19870a = i;
            this.f19871b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f19872c = list2;
            this.f19873d = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.y.h0$c */
    /* compiled from: TsPayloadReader */
    public interface C9032c {
        /* renamed from: a */
        SparseArray<C9029h0> mo23439a();

        /* renamed from: a */
        C9029h0 mo23440a(int i, C9031b bVar);
    }

    /* renamed from: com.google.android.exoplayer2.s0.y.h0$d */
    /* compiled from: TsPayloadReader */
    public static final class C9033d {

        /* renamed from: a */
        private final String f19874a;

        /* renamed from: b */
        private final int f19875b;

        /* renamed from: c */
        private final int f19876c;

        /* renamed from: d */
        private int f19877d;

        /* renamed from: e */
        private String f19878e;

        public C9033d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: d */
        private void m26705d() {
            if (this.f19877d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo23441a() {
            int i = this.f19877d;
            this.f19877d = i == Integer.MIN_VALUE ? this.f19875b : i + this.f19876c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19874a);
            sb.append(this.f19877d);
            this.f19878e = sb.toString();
        }

        /* renamed from: b */
        public String mo23442b() {
            m26705d();
            return this.f19878e;
        }

        /* renamed from: c */
        public int mo23443c() {
            m26705d();
            return this.f19877d;
        }

        public C9033d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.f19874a = str;
            this.f19875b = i2;
            this.f19876c = i3;
            this.f19877d = Integer.MIN_VALUE;
        }
    }

    /* renamed from: a */
    void mo23425a();

    /* renamed from: a */
    void mo23426a(C9545h0 h0Var, C8914i iVar, C9033d dVar);

    /* renamed from: a */
    void mo23427a(C9572w wVar, int i) throws C8723g0;
}
