package p163g.p413f.p414a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.p334n.C8227j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p163g.p413f.p414a.p420u.C10723a;
import p163g.p413f.p414a.p420u.C10725c;
import p163g.p413f.p414a.p420u.C10726d;
import p163g.p413f.p414a.p420u.C10727e;
import p163g.p413f.p414a.p420u.C10728f;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;
import p163g.p413f.p414a.p420u.C10733j;
import p163g.p413f.p414a.p420u.C10736k;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p420u.p421l.C10748j;
import p163g.p413f.p414a.p424w.C10767e;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.m */
/* compiled from: RequestBuilder */
public class C10665m<TranscodeType> extends C10723a<C10665m<TranscodeType>> implements Cloneable, C10656i<C10665m<TranscodeType>> {

    /* renamed from: A0 */
    private C10665m<TranscodeType> f25176A0;

    /* renamed from: B0 */
    private C10665m<TranscodeType> f25177B0;

    /* renamed from: C0 */
    private Float f25178C0;

    /* renamed from: D0 */
    private boolean f25179D0 = true;

    /* renamed from: E0 */
    private boolean f25180E0;

    /* renamed from: F0 */
    private boolean f25181F0;

    /* renamed from: t0 */
    private final Context f25182t0;

    /* renamed from: u0 */
    private final C10667n f25183u0;

    /* renamed from: v0 */
    private final Class<TranscodeType> f25184v0;

    /* renamed from: w0 */
    private final C10654g f25185w0;

    /* renamed from: x0 */
    private C10670o<?, ? super TranscodeType> f25186x0;

    /* renamed from: y0 */
    private Object f25187y0;

    /* renamed from: z0 */
    private List<C10730g<TranscodeType>> f25188z0;

    /* renamed from: g.f.a.m$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C10666a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25189a = new int[ScaleType.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f25190b = new int[C10657j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        static {
            /*
                g.f.a.j[] r0 = p163g.p413f.p414a.C10657j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25190b = r0
                r0 = 1
                int[] r1 = f25190b     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.f.a.j r2 = p163g.p413f.p414a.C10657j.LOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f25190b     // Catch:{ NoSuchFieldError -> 0x001f }
                g.f.a.j r3 = p163g.p413f.p414a.C10657j.NORMAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f25190b     // Catch:{ NoSuchFieldError -> 0x002a }
                g.f.a.j r4 = p163g.p413f.p414a.C10657j.HIGH     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f25190b     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.f.a.j r5 = p163g.p413f.p414a.C10657j.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f25189a = r4
                int[] r4 = f25189a     // Catch:{ NoSuchFieldError -> 0x0048 }
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x0052 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x005c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x0066 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x0071 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x007c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x0087 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f25189a     // Catch:{ NoSuchFieldError -> 0x0093 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.C10665m.C10666a.<clinit>():void");
        }
    }

    static {
        C10731h hVar = (C10731h) ((C10731h) ((C10731h) new C10731h().mo19928a(C8227j.f17608b)).mo19930a(C10657j.LOW)).mo19933a(true);
    }

    @SuppressLint({"CheckResult"})
    protected C10665m(C10652e eVar, C10667n nVar, Class<TranscodeType> cls, Context context) {
        this.f25183u0 = nVar;
        this.f25184v0 = cls;
        this.f25182t0 = context;
        this.f25186x0 = nVar.mo27569b(cls);
        this.f25185w0 = eVar.mo27526f();
        m33468a(nVar.mo27573g());
        m33481a((C10723a<?>) nVar.mo27574h());
    }

    /* renamed from: b */
    private C10665m<TranscodeType> m33471b(Object obj) {
        this.f25187y0 = obj;
        this.f25180E0 = true;
        return this;
    }

    /* renamed from: F */
    public C10725c<TranscodeType> mo27561F() {
        return mo27565b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m33468a(List<C10730g<Object>> list) {
        for (C10730g a : list) {
            mo19941a(a);
        }
    }

    /* renamed from: b */
    private <Y extends C10747i<TranscodeType>> Y m33473b(Y y, C10730g<TranscodeType> gVar, C10723a<?> aVar, Executor executor) {
        C10774j.m34012a(y);
        if (this.f25180E0) {
            C10726d a = m33466a(y, gVar, aVar, executor);
            C10726d d = y.mo27742d();
            if (!a.mo27720a(d) || m33469a(aVar, d)) {
                this.f25183u0.mo27567a((C10747i<?>) y);
                y.mo27734a(a);
                this.f25183u0.mo27568a(y, a);
                return y;
            }
            a.mo27718a();
            C10774j.m34012a(d);
            if (!d.isRunning()) {
                d.mo27723c();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public C10665m<TranscodeType> clone() {
        C10665m<TranscodeType> mVar = (C10665m) super.clone();
        mVar.f25186x0 = mVar.f25186x0.clone();
        return mVar;
    }

    /* renamed from: a */
    public C10665m<TranscodeType> m33481a(C10723a<?> aVar) {
        C10774j.m34012a(aVar);
        return (C10665m) super.mo19931a(aVar);
    }

    /* renamed from: a */
    public C10665m<TranscodeType> mo19940a(C10670o<?, ? super TranscodeType> oVar) {
        C10774j.m34012a(oVar);
        this.f25186x0 = oVar;
        this.f25179D0 = false;
        return this;
    }

    /* renamed from: a */
    public C10665m<TranscodeType> mo19941a(C10730g<TranscodeType> gVar) {
        if (gVar != null) {
            if (this.f25188z0 == null) {
                this.f25188z0 = new ArrayList();
            }
            this.f25188z0.add(gVar);
        }
        return this;
    }

    /* renamed from: a */
    public C10665m<TranscodeType> mo19942a(Object obj) {
        m33471b(obj);
        return this;
    }

    /* renamed from: a */
    public C10665m<TranscodeType> mo19943a(String str) {
        m33471b((Object) str);
        return this;
    }

    /* renamed from: a */
    public C10665m<TranscodeType> mo19939a(Uri uri) {
        m33471b((Object) uri);
        return this;
    }

    /* renamed from: a */
    public <Y extends C10747i<TranscodeType>> Y mo27562a(Y y) {
        mo27563a(y, null, C10767e.m33997b());
        return y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y extends C10747i<TranscodeType>> Y mo27563a(Y y, C10730g<TranscodeType> gVar, Executor executor) {
        m33473b(y, gVar, this, executor);
        return y;
    }

    /* renamed from: a */
    private boolean m33469a(C10723a<?> aVar, C10726d dVar) {
        return !aVar.mo27712u() && dVar.isComplete();
    }

    /* renamed from: b */
    public C10725c<TranscodeType> mo27565b(int i, int i2) {
        C10728f fVar = new C10728f(i, i2);
        mo27563a(fVar, fVar, C10767e.m33996a());
        return fVar;
    }

    /* renamed from: a */
    public C10748j<ImageView, TranscodeType> mo27564a(ImageView imageView) {
        C10723a aVar;
        C10775k.m34031b();
        C10774j.m34012a(imageView);
        if (!mo27717z() && mo27715x() && imageView.getScaleType() != null) {
            switch (C10666a.f25189a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo19916C();
                    break;
                case 2:
                    aVar = clone().mo19917D();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo19918E();
                    break;
                case 6:
                    aVar = clone().mo19917D();
                    break;
            }
        }
        aVar = this;
        C10748j<ImageView, TranscodeType> a = this.f25185w0.mo27536a(imageView, this.f25184v0);
        m33473b(a, null, aVar, C10767e.m33997b());
        return a;
    }

    /* renamed from: b */
    private C10657j m33470b(C10657j jVar) {
        int i = C10666a.f25190b[jVar.ordinal()];
        if (i == 1) {
            return C10657j.NORMAL;
        }
        if (i == 2) {
            return C10657j.HIGH;
        }
        if (i == 3 || i == 4) {
            return C10657j.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown priority: ");
        sb.append(mo27704m());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private C10726d m33472b(C10747i<TranscodeType> iVar, C10730g<TranscodeType> gVar, C10727e eVar, C10670o<?, ? super TranscodeType> oVar, C10657j jVar, int i, int i2, C10723a<?> aVar, Executor executor) {
        C10727e eVar2 = eVar;
        C10657j jVar2 = jVar;
        C10665m<TranscodeType> mVar = this.f25176A0;
        if (mVar != null) {
            if (!this.f25181F0) {
                C10670o<?, ? super TranscodeType> oVar2 = mVar.f25179D0 ? oVar : mVar.f25186x0;
                C10657j m = this.f25176A0.mo27713v() ? this.f25176A0.mo27704m() : m33470b(jVar2);
                int j = this.f25176A0.mo27701j();
                int i3 = this.f25176A0.mo27700i();
                if (C10775k.m34033b(i, i2) && !this.f25176A0.mo27686A()) {
                    j = aVar.mo27701j();
                    i3 = aVar.mo27700i();
                }
                int i4 = j;
                int i5 = i3;
                C10736k kVar = new C10736k(eVar2);
                C10726d a = m33465a(iVar, gVar, aVar, (C10727e) kVar, oVar, jVar, i, i2, executor);
                this.f25181F0 = true;
                C10665m<TranscodeType> mVar2 = this.f25176A0;
                C10736k kVar2 = kVar;
                C10726d a2 = mVar2.m33467a(iVar, gVar, (C10727e) kVar, oVar2, m, i4, i5, (C10723a<?>) mVar2, executor);
                this.f25181F0 = false;
                kVar2.mo27752a(a, a2);
                return kVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f25178C0 == null) {
            return m33465a(iVar, gVar, aVar, eVar, oVar, jVar, i, i2, executor);
        } else {
            C10736k kVar3 = new C10736k(eVar2);
            C10730g<TranscodeType> gVar2 = gVar;
            C10736k kVar4 = kVar3;
            C10670o<?, ? super TranscodeType> oVar3 = oVar;
            int i6 = i;
            int i7 = i2;
            Executor executor2 = executor;
            kVar3.mo27752a(m33465a(iVar, gVar2, aVar, (C10727e) kVar4, oVar3, jVar, i6, i7, executor2), m33465a(iVar, gVar2, aVar.clone().mo19920a(this.f25178C0.floatValue()), (C10727e) kVar4, oVar3, m33470b(jVar2), i6, i7, executor2));
            return kVar3;
        }
    }

    /* renamed from: a */
    private C10726d m33466a(C10747i<TranscodeType> iVar, C10730g<TranscodeType> gVar, C10723a<?> aVar, Executor executor) {
        return m33467a(iVar, gVar, (C10727e) null, this.f25186x0, aVar.mo27704m(), aVar.mo27701j(), aVar.mo27700i(), aVar, executor);
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.f.a.u.e] */
    /* JADX WARNING: type inference failed for: r14v0, types: [g.f.a.u.e] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r0v4, types: [g.f.a.u.b] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p163g.p413f.p414a.p420u.C10726d m33467a(p163g.p413f.p414a.p420u.p421l.C10747i<TranscodeType> r22, p163g.p413f.p414a.p420u.C10730g<TranscodeType> r23, p163g.p413f.p414a.p420u.C10727e r24, p163g.p413f.p414a.C10670o<?, ? super TranscodeType> r25, p163g.p413f.p414a.C10657j r26, int r27, int r28, p163g.p413f.p414a.p420u.C10723a<?> r29, java.util.concurrent.Executor r30) {
        /*
            r21 = this;
            r10 = r21
            g.f.a.m<TranscodeType> r0 = r10.f25177B0
            if (r0 == 0) goto L_0x0010
            g.f.a.u.b r0 = new g.f.a.u.b
            r1 = r24
            r0.<init>(r1)
            r3 = r0
            r15 = r3
            goto L_0x0015
        L_0x0010:
            r1 = r24
            r0 = 0
            r15 = r0
            r3 = r1
        L_0x0015:
            r0 = r21
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            g.f.a.u.d r0 = r0.m33472b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r15 != 0) goto L_0x002e
            return r0
        L_0x002e:
            g.f.a.m<TranscodeType> r1 = r10.f25177B0
            int r1 = r1.mo27701j()
            g.f.a.m<TranscodeType> r2 = r10.f25177B0
            int r2 = r2.mo27700i()
            boolean r3 = p163g.p413f.p414a.p424w.C10775k.m34033b(r27, r28)
            if (r3 == 0) goto L_0x0050
            g.f.a.m<TranscodeType> r3 = r10.f25177B0
            boolean r3 = r3.mo27686A()
            if (r3 != 0) goto L_0x0050
            int r1 = r29.mo27701j()
            int r2 = r29.mo27700i()
        L_0x0050:
            r17 = r1
            r18 = r2
            g.f.a.m<TranscodeType> r11 = r10.f25177B0
            g.f.a.o<?, ? super TranscodeType> r1 = r11.f25186x0
            g.f.a.j r16 = r11.mo27704m()
            g.f.a.m<TranscodeType> r2 = r10.f25177B0
            r12 = r22
            r13 = r23
            r14 = r15
            r3 = r15
            r15 = r1
            r19 = r2
            r20 = r30
            g.f.a.u.d r1 = r11.m33467a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.mo27719a(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.C10665m.m33467a(g.f.a.u.l.i, g.f.a.u.g, g.f.a.u.e, g.f.a.o, g.f.a.j, int, int, g.f.a.u.a, java.util.concurrent.Executor):g.f.a.u.d");
    }

    /* renamed from: a */
    private C10726d m33465a(C10747i<TranscodeType> iVar, C10730g<TranscodeType> gVar, C10723a<?> aVar, C10727e eVar, C10670o<?, ? super TranscodeType> oVar, C10657j jVar, int i, int i2, Executor executor) {
        Context context = this.f25182t0;
        C10654g gVar2 = this.f25185w0;
        return C10733j.m33844b(context, gVar2, this.f25187y0, this.f25184v0, aVar, i, i2, jVar, iVar, gVar, this.f25188z0, eVar, gVar2.mo27539d(), oVar.mo27581a(), executor);
    }
}
