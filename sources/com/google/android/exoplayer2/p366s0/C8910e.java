package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.p366s0.p367r.C8927b;
import com.google.android.exoplayer2.p366s0.p368s.C8930c;
import com.google.android.exoplayer2.p366s0.p369t.C8941e;
import com.google.android.exoplayer2.p366s0.p370u.C8952e;
import com.google.android.exoplayer2.p366s0.p371v.C8972g;
import com.google.android.exoplayer2.p366s0.p371v.C8978j;
import com.google.android.exoplayer2.p366s0.p372w.C8993d;
import com.google.android.exoplayer2.p366s0.p374y.C9022f;
import com.google.android.exoplayer2.p366s0.p374y.C9025g0;
import com.google.android.exoplayer2.p366s0.p374y.C9028h;
import com.google.android.exoplayer2.p366s0.p374y.C9036j;
import com.google.android.exoplayer2.p366s0.p374y.C9060z;
import com.google.android.exoplayer2.p366s0.p375z.C9063b;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.exoplayer2.s0.e */
/* compiled from: DefaultExtractorsFactory */
public final class C8910e implements C8915j {

    /* renamed from: j */
    private static final Constructor<? extends C8912g> f19135j;

    /* renamed from: a */
    private boolean f19136a;

    /* renamed from: b */
    private int f19137b;

    /* renamed from: c */
    private int f19138c;

    /* renamed from: d */
    private int f19139d;

    /* renamed from: e */
    private int f19140e;

    /* renamed from: f */
    private int f19141f;

    /* renamed from: g */
    private int f19142g;

    /* renamed from: h */
    private int f19143h = 1;

    /* renamed from: i */
    private int f19144i;

    static {
        Constructor<? extends C8912g> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C8912g.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f19135j = constructor;
    }

    /* renamed from: a */
    public synchronized C8912g[] mo23301a() {
        C8912g[] gVarArr;
        gVarArr = new C8912g[(f19135j == null ? 13 : 14)];
        gVarArr[0] = new C8941e(this.f19139d);
        int i = 1;
        gVarArr[1] = new C8972g(this.f19141f);
        gVarArr[2] = new C8978j(this.f19140e);
        gVarArr[3] = new C8952e(this.f19142g | (this.f19136a ? 1 : 0));
        gVarArr[4] = new C9036j(0, this.f19137b | (this.f19136a ? 1 : 0));
        gVarArr[5] = new C9022f();
        gVarArr[6] = new C9025g0(this.f19143h, this.f19144i);
        gVarArr[7] = new C8930c();
        gVarArr[8] = new C8993d();
        gVarArr[9] = new C9060z();
        gVarArr[10] = new C9063b();
        int i2 = this.f19138c;
        if (!this.f19136a) {
            i = 0;
        }
        gVarArr[11] = new C8927b(i | i2);
        gVarArr[12] = new C9028h();
        if (f19135j != null) {
            try {
                gVarArr[13] = (C8912g) f19135j.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return gVarArr;
    }
}
