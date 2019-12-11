package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9941e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.joda.time.DateTimeConstants;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11037b1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.C11311a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11367x0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11367x0.C11368a;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
public class C10126m8 implements C10135n5 {

    /* renamed from: y */
    private static volatile C10126m8 f23732y;

    /* renamed from: a */
    private C10089j4 f23733a;

    /* renamed from: b */
    private C10144o3 f23734b;

    /* renamed from: c */
    private C10139n9 f23735c;

    /* renamed from: d */
    private C10176r3 f23736d;

    /* renamed from: e */
    private C10082i8 f23737e;

    /* renamed from: f */
    private C10050f9 f23738f;

    /* renamed from: g */
    private final C10211u8 f23739g;

    /* renamed from: h */
    private C10209u6 f23740h;

    /* renamed from: i */
    private final C10145o4 f23741i;

    /* renamed from: j */
    private boolean f23742j;

    /* renamed from: k */
    private boolean f23743k;

    /* renamed from: l */
    private boolean f23744l;

    /* renamed from: m */
    private long f23745m;

    /* renamed from: n */
    private List<Runnable> f23746n;

    /* renamed from: o */
    private int f23747o;

    /* renamed from: p */
    private int f23748p;

    /* renamed from: q */
    private boolean f23749q;

    /* renamed from: r */
    private boolean f23750r;

    /* renamed from: s */
    private boolean f23751s;

    /* renamed from: t */
    private FileLock f23752t;

    /* renamed from: u */
    private FileChannel f23753u;

    /* renamed from: v */
    private List<Long> f23754v;

    /* renamed from: w */
    private List<Long> f23755w;

    /* renamed from: x */
    private long f23756x;

    /* renamed from: com.google.android.gms.measurement.internal.m8$a */
    class C10127a implements C10161p9 {

        /* renamed from: a */
        C11310t0 f23757a;

        /* renamed from: b */
        List<Long> f23758b;

        /* renamed from: c */
        List<C11253p0> f23759c;

        /* renamed from: d */
        private long f23760d;

        private C10127a(C10126m8 m8Var) {
        }

        /* renamed from: a */
        public final void mo25948a(C11310t0 t0Var) {
            C9908u.m30853a(t0Var);
            this.f23757a = t0Var;
        }

        /* synthetic */ C10127a(C10126m8 m8Var, C10160p8 p8Var) {
            this(m8Var);
        }

        /* renamed from: a */
        public final boolean mo25949a(long j, C11253p0 p0Var) {
            C9908u.m30853a(p0Var);
            if (this.f23759c == null) {
                this.f23759c = new ArrayList();
            }
            if (this.f23758b == null) {
                this.f23758b = new ArrayList();
            }
            if (this.f23759c.size() > 0 && m31634a((C11253p0) this.f23759c.get(0)) != m31634a(p0Var)) {
                return false;
            }
            long b = this.f23760d + ((long) p0Var.mo28427b());
            if (b >= ((long) Math.max(0, ((Integer) C10106l.f23668n.mo26194a(null)).intValue()))) {
                return false;
            }
            this.f23760d = b;
            this.f23759c.add(p0Var);
            this.f23758b.add(Long.valueOf(j));
            if (this.f23759c.size() >= Math.max(1, ((Integer) C10106l.f23670o.mo26194a(null)).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m31634a(C11253p0 p0Var) {
            return ((p0Var.mo28800p() / 1000) / 60) / 60;
        }
    }

    private C10126m8(C10191s8 s8Var) {
        this(s8Var, null);
    }

    /* renamed from: A */
    private final boolean m31570A() {
        m31572C();
        String str = "Storage concurrent access okay";
        if (this.f23741i.mo26031i().mo25813a(C10106l.f23621F0)) {
            FileLock fileLock = this.f23752t;
            if (fileLock != null && fileLock.isValid()) {
                this.f23741i.mo25898e().mo25869B().mo25908a(str);
                return true;
            }
        }
        try {
            this.f23753u = new RandomAccessFile(new File(this.f23741i.mo25895b().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f23752t = this.f23753u.tryLock();
            if (this.f23752t != null) {
                this.f23741i.mo25898e().mo25869B().mo25908a(str);
                return true;
            }
            this.f23741i.mo25898e().mo25874t().mo25908a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f23741i.mo25898e().mo25874t().mo25909a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f23741i.mo25898e().mo25874t().mo25909a("Failed to access storage lock file", e2);
        } catch (OverlappingFileLockException e3) {
            this.f23741i.mo25898e().mo25877w().mo25909a("Storage lock already acquired", e3);
        }
    }

    /* renamed from: B */
    private final boolean m31571B() {
        m31572C();
        mo25941n();
        return this.f23743k;
    }

    /* renamed from: C */
    private final void m31572C() {
        this.f23741i.mo25897d().mo25662j();
    }

    /* renamed from: a */
    public static C10126m8 m31577a(Context context) {
        C9908u.m30853a(context);
        C9908u.m30853a(context.getApplicationContext());
        if (f23732y == null) {
            synchronized (C10126m8.class) {
                if (f23732y == null) {
                    f23732y = new C10126m8(new C10191s8(context));
                }
            }
        }
        return f23732y;
    }

    /* renamed from: u */
    private final C10176r3 m31591u() {
        C10176r3 r3Var = this.f23736d;
        if (r3Var != null) {
            return r3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: v */
    private final C10082i8 m31592v() {
        m31589b((C10138n8) this.f23737e);
        return this.f23737e;
    }

    /* renamed from: w */
    private final long m31593w() {
        long c = this.f23741i.mo25896c().mo25474c();
        C10196t3 h = this.f23741i.mo26030h();
        h.mo25884p();
        h.mo25662j();
        long a = h.f23937i.mo26196a();
        if (a == 0) {
            a = 1 + ((long) h.mo25903m().mo26241u().nextInt(DateTimeConstants.MILLIS_PER_DAY));
            h.f23937i.mo26197a(a);
        }
        return ((((c + a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: x */
    private final boolean m31594x() {
        m31572C();
        mo25941n();
        return mo25937j().mo25974E() || !TextUtils.isEmpty(mo25937j().mo26013z());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c0  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31595y() {
        /*
            r21 = this;
            r0 = r21
            r21.m31572C()
            r21.mo25941n()
            boolean r1 = r21.m31571B()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.i9 r1 = r1.mo26031i()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C10106l.f23667m0
            boolean r1 = r1.mo25813a(r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.f23745m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.common.util.e r1 = r1.mo25896c()
            long r1 = r1.mo25472a()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f23745m
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo25909a(r3, r2)
            com.google.android.gms.measurement.internal.r3 r1 = r21.m31591u()
            r1.mo26072a()
            com.google.android.gms.measurement.internal.i8 r1 = r21.m31592v()
            r1.mo25809v()
            return
        L_0x0060:
            r0.f23745m = r3
        L_0x0062:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            boolean r1 = r1.mo26043u()
            if (r1 == 0) goto L_0x026b
            boolean r1 = r21.m31594x()
            if (r1 != 0) goto L_0x0072
            goto L_0x026b
        L_0x0072:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.common.util.e r1 = r1.mo25896c()
            long r1 = r1.mo25474c()
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C10106l.f23620F
            r6 = 0
            java.lang.Object r5 = r5.mo26194a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.n9 r5 = r21.mo25937j()
            boolean r5 = r5.mo25975F()
            if (r5 != 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.n9 r5 = r21.mo25937j()
            boolean r5 = r5.mo25970A()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r5 = 0
            goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            if (r5 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.o4 r10 = r0.f23741i
            com.google.android.gms.measurement.internal.i9 r10 = r10.mo26031i()
            java.lang.String r10 = r10.mo25840s()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00d0
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C10106l.f23610A
            java.lang.Object r10 = r10.mo26194a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00f1
        L_0x00d0:
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C10106l.f23692z
            java.lang.Object r10 = r10.mo26194a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00f1
        L_0x00e1:
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C10106l.f23690y
            java.lang.Object r10 = r10.mo26194a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00f1:
            com.google.android.gms.measurement.internal.o4 r12 = r0.f23741i
            com.google.android.gms.measurement.internal.t3 r12 = r12.mo26030h()
            com.google.android.gms.measurement.internal.y3 r12 = r12.f23933e
            long r12 = r12.mo26196a()
            com.google.android.gms.measurement.internal.o4 r14 = r0.f23741i
            com.google.android.gms.measurement.internal.t3 r14 = r14.mo26030h()
            com.google.android.gms.measurement.internal.y3 r14 = r14.f23934f
            long r14 = r14.mo26196a()
            com.google.android.gms.measurement.internal.n9 r16 = r21.mo25937j()
            r17 = r10
            long r9 = r16.mo25972C()
            com.google.android.gms.measurement.internal.n9 r11 = r21.mo25937j()
            r19 = r7
            long r6 = r11.mo25973D()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0128
        L_0x0125:
            r8 = r3
            goto L_0x019e
        L_0x0128:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x014e
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x014e
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x014e:
            com.google.android.gms.measurement.internal.u8 r5 = r21.mo25935h()
            r12 = r17
            boolean r5 = r5.mo26121a(r8, r12)
            if (r5 != 0) goto L_0x015c
            long r8 = r8 + r12
            goto L_0x015d
        L_0x015c:
            r8 = r10
        L_0x015d:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x019e
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x019e
            r5 = 0
        L_0x0166:
            r6 = 20
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C10106l.f23623H
            r10 = 0
            java.lang.Object r7 = r7.mo26194a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0125
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C10106l.f23622G
            java.lang.Object r12 = r12.mo26194a(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r8 = r8 + r12
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x019b
            goto L_0x019e
        L_0x019b:
            int r5 = r5 + 1
            goto L_0x0166
        L_0x019e:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01c0
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo25908a(r2)
            com.google.android.gms.measurement.internal.r3 r1 = r21.m31591u()
            r1.mo26072a()
            com.google.android.gms.measurement.internal.i8 r1 = r21.m31592v()
            r1.mo25809v()
            return
        L_0x01c0:
            com.google.android.gms.measurement.internal.o3 r1 = r21.mo25939l()
            boolean r1 = r1.mo26015v()
            if (r1 != 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.String r2 = "No network"
            r1.mo25908a(r2)
            com.google.android.gms.measurement.internal.r3 r1 = r21.m31591u()
            r1.mo26073b()
            com.google.android.gms.measurement.internal.i8 r1 = r21.m31592v()
            r1.mo25809v()
            return
        L_0x01e8:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.t3 r1 = r1.mo26030h()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f23935g
            long r1 = r1.mo26196a()
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C10106l.f23686w
            r6 = 0
            java.lang.Object r5 = r5.mo26194a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.u8 r7 = r21.mo25935h()
            boolean r7 = r7.mo26121a(r1, r5)
            if (r7 != 0) goto L_0x0214
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0214:
            com.google.android.gms.measurement.internal.r3 r1 = r21.m31591u()
            r1.mo26072a()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.common.util.e r1 = r1.mo25896c()
            long r1 = r1.mo25474c()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0250
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C10106l.f23612B
            r2 = 0
            java.lang.Object r1 = r1.mo26194a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.t3 r1 = r1.mo26030h()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f23933e
            com.google.android.gms.measurement.internal.o4 r2 = r0.f23741i
            com.google.android.gms.common.util.e r2 = r2.mo25896c()
            long r2 = r2.mo25474c()
            r1.mo26197a(r2)
        L_0x0250:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo25909a(r3, r2)
            com.google.android.gms.measurement.internal.i8 r1 = r21.m31592v()
            r1.mo25808a(r8)
            return
        L_0x026b:
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23741i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo25908a(r2)
            com.google.android.gms.measurement.internal.r3 r1 = r21.m31591u()
            r1.mo26072a()
            com.google.android.gms.measurement.internal.i8 r1 = r21.m31592v()
            r1.mo25809v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.m31595y():void");
    }

    /* renamed from: z */
    private final void m31596z() {
        m31572C();
        if (this.f23749q || this.f23750r || this.f23751s) {
            this.f23741i.mo25898e().mo25869B().mo25911a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f23749q), Boolean.valueOf(this.f23750r), Boolean.valueOf(this.f23751s));
            return;
        }
        this.f23741i.mo25898e().mo25869B().mo25908a("Stopping uploading service(s)");
        List<Runnable> list = this.f23746n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f23746n.clear();
        }
    }

    /* renamed from: b */
    public final Context mo25895b() {
        return this.f23741i.mo25895b();
    }

    /* renamed from: c */
    public final C9941e mo25896c() {
        return this.f23741i.mo25896c();
    }

    /* renamed from: d */
    public final C10078i4 mo25897d() {
        return this.f23741i.mo25897d();
    }

    /* renamed from: e */
    public final C10099k3 mo25898e() {
        return this.f23741i.mo25898e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25933f() {
        this.f23741i.mo25897d().mo25662j();
        mo25937j().mo25971B();
        if (this.f23741i.mo26030h().f23933e.mo26196a() == 0) {
            this.f23741i.mo26030h().f23933e.mo26197a(this.f23741i.mo25896c().mo25474c());
        }
        m31595y();
    }

    /* renamed from: g */
    public final C10083i9 mo25934g() {
        return this.f23741i.mo26031i();
    }

    /* renamed from: h */
    public final C10211u8 mo25935h() {
        m31589b((C10138n8) this.f23739g);
        return this.f23739g;
    }

    /* renamed from: i */
    public final C10050f9 mo25936i() {
        m31589b((C10138n8) this.f23738f);
        return this.f23738f;
    }

    /* renamed from: j */
    public final C10139n9 mo25937j() {
        m31589b((C10138n8) this.f23735c);
        return this.f23735c;
    }

    /* renamed from: k */
    public final C10089j4 mo25938k() {
        m31589b((C10138n8) this.f23733a);
        return this.f23733a;
    }

    /* renamed from: l */
    public final C10144o3 mo25939l() {
        m31589b((C10138n8) this.f23734b);
        return this.f23734b;
    }

    /* renamed from: m */
    public final C10209u6 mo25940m() {
        m31589b((C10138n8) this.f23740h);
        return this.f23740h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo25941n() {
        if (!this.f23742j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1.f23741i.mo25898e().mo25874t().mo25910a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C10099k3.m31423a(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x02c2 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25942o() {
        /*
            r17 = this;
            r1 = r17
            r17.m31572C()
            r17.mo25941n()
            r0 = 1
            r1.f23751s = r0
            r2 = 0
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x02fe }
            r3.mo25894a()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.a7 r3 = r3.mo26016A()     // Catch:{ all -> 0x02fe }
            java.lang.Boolean r3 = r3.mo25590H()     // Catch:{ all -> 0x02fe }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.mo25908a(r3)     // Catch:{ all -> 0x02fe }
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02fe }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.mo25908a(r3)     // Catch:{ all -> 0x02fe }
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x004d:
            long r3 = r1.f23745m     // Catch:{ all -> 0x02fe }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005e
            r17.m31595y()     // Catch:{ all -> 0x02fe }
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x005e:
            r17.m31572C()     // Catch:{ all -> 0x02fe }
            java.util.List<java.lang.Long> r3 = r1.f23754v     // Catch:{ all -> 0x02fe }
            if (r3 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.mo25908a(r3)     // Catch:{ all -> 0x02fe }
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.o3 r3 = r17.mo25939l()     // Catch:{ all -> 0x02fe }
            boolean r3 = r3.mo26015v()     // Catch:{ all -> 0x02fe }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo25908a(r3)     // Catch:{ all -> 0x02fe }
            r17.m31595y()     // Catch:{ all -> 0x02fe }
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x00a1:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.common.util.e r3 = r3.mo25896c()     // Catch:{ all -> 0x02fe }
            long r3 = r3.mo25474c()     // Catch:{ all -> 0x02fe }
            long r7 = com.google.android.gms.measurement.internal.C10083i9.m31363x()     // Catch:{ all -> 0x02fe }
            long r7 = r3 - r7
            r9 = 0
            r1.m31586a(r9, r7)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.t3 r7 = r7.mo26030h()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f23933e     // Catch:{ all -> 0x02fe }
            long r7 = r7.mo26196a()     // Catch:{ all -> 0x02fe }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25868A()     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02fe }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02fe }
            r5.mo25909a(r6, r7)     // Catch:{ all -> 0x02fe }
        L_0x00de:
            com.google.android.gms.measurement.internal.n9 r5 = r17.mo25937j()     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = r5.mo26013z()     // Catch:{ all -> 0x02fe }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02fe }
            r7 = -1
            if (r6 != 0) goto L_0x02d6
            long r10 = r1.f23756x     // Catch:{ all -> 0x02fe }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.n9 r6 = r17.mo25937j()     // Catch:{ all -> 0x02fe }
            long r6 = r6.mo25976G()     // Catch:{ all -> 0x02fe }
            r1.f23756x = r6     // Catch:{ all -> 0x02fe }
        L_0x00fe:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C10106l.f23664l     // Catch:{ all -> 0x02fe }
            int r6 = r6.mo25814b(r5, r7)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.i9 r7 = r7.mo26031i()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C10106l.f23666m     // Catch:{ all -> 0x02fe }
            int r7 = r7.mo25814b(r5, r8)     // Catch:{ all -> 0x02fe }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.n9 r8 = r17.mo25937j()     // Catch:{ all -> 0x02fe }
            java.util.List r6 = r8.mo25982a(r5, r6, r7)     // Catch:{ all -> 0x02fe }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02fe }
            if (r7 != 0) goto L_0x02f8
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02fe }
        L_0x012c:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02fe }
            if (r8 == 0) goto L_0x014b
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02fe }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02fe }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.t0 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r8     // Catch:{ all -> 0x02fe }
            java.lang.String r10 = r8.mo28920W()     // Catch:{ all -> 0x02fe }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02fe }
            if (r10 != 0) goto L_0x012c
            java.lang.String r7 = r8.mo28920W()     // Catch:{ all -> 0x02fe }
            goto L_0x014c
        L_0x014b:
            r7 = r9
        L_0x014c:
            if (r7 == 0) goto L_0x017b
            r8 = 0
        L_0x014f:
            int r10 = r6.size()     // Catch:{ all -> 0x02fe }
            if (r8 >= r10) goto L_0x017b
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02fe }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02fe }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.t0 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r10     // Catch:{ all -> 0x02fe }
            java.lang.String r11 = r10.mo28920W()     // Catch:{ all -> 0x02fe }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02fe }
            if (r11 != 0) goto L_0x0178
            java.lang.String r10 = r10.mo28920W()     // Catch:{ all -> 0x02fe }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02fe }
            if (r10 != 0) goto L_0x0178
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02fe }
            goto L_0x017b
        L_0x0178:
            int r8 = r8 + 1
            goto L_0x014f
        L_0x017b:
            g.j.a.a.d.g.s0$a r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11296s0.m36058o()     // Catch:{ all -> 0x02fe }
            int r8 = r6.size()     // Catch:{ all -> 0x02fe }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02fe }
            int r11 = r6.size()     // Catch:{ all -> 0x02fe }
            r10.<init>(r11)     // Catch:{ all -> 0x02fe }
            boolean r11 = com.google.android.gms.measurement.internal.C10083i9.m31364y()     // Catch:{ all -> 0x02fe }
            if (r11 == 0) goto L_0x01a0
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.i9 r11 = r11.mo26031i()     // Catch:{ all -> 0x02fe }
            boolean r11 = r11.mo25818d(r5)     // Catch:{ all -> 0x02fe }
            if (r11 == 0) goto L_0x01a0
            r11 = 1
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            r12 = 0
        L_0x01a2:
            if (r12 >= r8) goto L_0x0209
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x02fe }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02fe }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.t0 r13 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r13     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.e4$a r13 = r13.mo28436j()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.t0$a r13 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.C11311a) r13     // Catch:{ all -> 0x02fe }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x02fe }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x02fe }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x02fe }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x02fe }
            r10.add(r14)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.o4 r14 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.i9 r14 = r14.mo26031i()     // Catch:{ all -> 0x02fe }
            long r14 = r14.mo25830n()     // Catch:{ all -> 0x02fe }
            r13.mo28985g(r14)     // Catch:{ all -> 0x02fe }
            r13.mo28959a(r3)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.o4 r14 = r1.f23741i     // Catch:{ all -> 0x02fe }
            r14.mo25894a()     // Catch:{ all -> 0x02fe }
            r13.mo28970b(r2)     // Catch:{ all -> 0x02fe }
            if (r11 != 0) goto L_0x01de
            r13.mo29014v()     // Catch:{ all -> 0x02fe }
        L_0x01de:
            com.google.android.gms.measurement.internal.o4 r14 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.i9 r14 = r14.mo26031i()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C10106l.f23677r0     // Catch:{ all -> 0x02fe }
            boolean r14 = r14.mo25821e(r5, r15)     // Catch:{ all -> 0x02fe }
            if (r14 == 0) goto L_0x0203
            g.j.a.a.d.g.p5 r14 = r13.mo28446l0()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.e4 r14 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r14     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.t0 r14 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r14     // Catch:{ all -> 0x02fe }
            byte[] r14 = r14.mo28656f()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.u8 r15 = r17.mo25935h()     // Catch:{ all -> 0x02fe }
            long r14 = r15.mo26113a(r14)     // Catch:{ all -> 0x02fe }
            r13.mo29000l(r14)     // Catch:{ all -> 0x02fe }
        L_0x0203:
            r7.mo28879a(r13)     // Catch:{ all -> 0x02fe }
            int r12 = r12 + 1
            goto L_0x01a2
        L_0x0209:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r6 = r6.mo25898e()     // Catch:{ all -> 0x02fe }
            r11 = 2
            boolean r6 = r6.mo25873a(r11)     // Catch:{ all -> 0x02fe }
            if (r6 == 0) goto L_0x0227
            com.google.android.gms.measurement.internal.u8 r6 = r17.mo25935h()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.p5 r11 = r7.mo28446l0()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.e4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r11     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.s0 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11296s0) r11     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = r6.mo26117a(r11)     // Catch:{ all -> 0x02fe }
            goto L_0x0228
        L_0x0227:
            r6 = r9
        L_0x0228:
            r17.mo25935h()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.p5 r11 = r7.mo28446l0()     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.e4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r11     // Catch:{ all -> 0x02fe }
            g.j.a.a.d.g.s0 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11296s0) r11     // Catch:{ all -> 0x02fe }
            byte[] r14 = r11.mo28656f()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.y2<java.lang.String> r11 = com.google.android.gms.measurement.internal.C10106l.f23684v     // Catch:{ all -> 0x02fe }
            java.lang.Object r9 = r11.mo26194a(r9)     // Catch:{ all -> 0x02fe }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02fe }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02c2 }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02c2 }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02c2 }
            if (r11 != 0) goto L_0x024c
            r11 = 1
            goto L_0x024d
        L_0x024c:
            r11 = 0
        L_0x024d:
            com.google.android.gms.common.internal.C9908u.m30860a(r11)     // Catch:{ MalformedURLException -> 0x02c2 }
            java.util.List<java.lang.Long> r11 = r1.f23754v     // Catch:{ MalformedURLException -> 0x02c2 }
            if (r11 == 0) goto L_0x0264
            com.google.android.gms.measurement.internal.o4 r10 = r1.f23741i     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.k3 r10 = r10.mo25898e()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo25874t()     // Catch:{ MalformedURLException -> 0x02c2 }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.mo25908a(r11)     // Catch:{ MalformedURLException -> 0x02c2 }
            goto L_0x026b
        L_0x0264:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02c2 }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02c2 }
            r1.f23754v = r11     // Catch:{ MalformedURLException -> 0x02c2 }
        L_0x026b:
            com.google.android.gms.measurement.internal.o4 r10 = r1.f23741i     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.t3 r10 = r10.mo26030h()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.f23934f     // Catch:{ MalformedURLException -> 0x02c2 }
            r10.mo26197a(r3)     // Catch:{ MalformedURLException -> 0x02c2 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x0282
            g.j.a.a.d.g.t0 r3 = r7.mo28880a(r2)     // Catch:{ MalformedURLException -> 0x02c2 }
            java.lang.String r3 = r3.mo28944r()     // Catch:{ MalformedURLException -> 0x02c2 }
        L_0x0282:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25869B()     // Catch:{ MalformedURLException -> 0x02c2 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02c2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02c2 }
            r4.mo25911a(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02c2 }
            r1.f23750r = r0     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.o3 r11 = r17.mo25939l()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.o8 r0 = new com.google.android.gms.measurement.internal.o8     // Catch:{ MalformedURLException -> 0x02c2 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02c2 }
            r11.mo25662j()     // Catch:{ MalformedURLException -> 0x02c2 }
            r11.mo25969t()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.common.internal.C9908u.m30853a(r13)     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.common.internal.C9908u.m30853a(r14)     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.common.internal.C9908u.m30853a(r0)     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.i4 r3 = r11.mo25897d()     // Catch:{ MalformedURLException -> 0x02c2 }
            com.google.android.gms.measurement.internal.s3 r4 = new com.google.android.gms.measurement.internal.s3     // Catch:{ MalformedURLException -> 0x02c2 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02c2 }
            r3.mo25802b(r4)     // Catch:{ MalformedURLException -> 0x02c2 }
            goto L_0x02f8
        L_0x02c2:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r5)     // Catch:{ all -> 0x02fe }
            r0.mo25910a(r3, r4, r9)     // Catch:{ all -> 0x02fe }
            goto L_0x02f8
        L_0x02d6:
            r1.f23756x = r7     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.n9 r0 = r17.mo25937j()     // Catch:{ all -> 0x02fe }
            long r5 = com.google.android.gms.measurement.internal.C10083i9.m31363x()     // Catch:{ all -> 0x02fe }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo25980a(r3)     // Catch:{ all -> 0x02fe }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02fe }
            if (r3 != 0) goto L_0x02f8
            com.google.android.gms.measurement.internal.n9 r3 = r17.mo25937j()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.f4 r0 = r3.mo25994b(r0)     // Catch:{ all -> 0x02fe }
            if (r0 == 0) goto L_0x02f8
            r1.m31578a(r0)     // Catch:{ all -> 0x02fe }
        L_0x02f8:
            r1.f23751s = r2
            r17.m31596z()
            return
        L_0x02fe:
            r0 = move-exception
            r1.f23751s = r2
            r17.m31596z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.mo25942o():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo25943p() {
        m31572C();
        mo25941n();
        if (!this.f23744l) {
            this.f23744l = true;
            m31572C();
            mo25941n();
            if ((this.f23741i.mo26031i().mo25813a(C10106l.f23667m0) || m31571B()) && m31570A()) {
                int a = m31573a(this.f23753u);
                int F = this.f23741i.mo26048z().mo25644F();
                m31572C();
                if (a > F) {
                    this.f23741i.mo25898e().mo25874t().mo25910a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(F));
                } else if (a < F) {
                    if (m31584a(F, this.f23753u)) {
                        this.f23741i.mo25898e().mo25869B().mo25910a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(F));
                    } else {
                        this.f23741i.mo25898e().mo25874t().mo25910a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(F));
                    }
                }
            }
        }
        if (!this.f23743k && !this.f23741i.mo26031i().mo25813a(C10106l.f23667m0)) {
            this.f23741i.mo25898e().mo25880z().mo25908a("This instance being marked as an uploader");
            this.f23743k = true;
            m31595y();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final void mo25944q() {
        this.f23748p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final C10145o4 mo25945r() {
        return this.f23741i;
    }

    /* renamed from: s */
    public final C10077i3 mo25946s() {
        return this.f23741i.mo26021F();
    }

    /* renamed from: t */
    public final C10251y8 mo25947t() {
        return this.f23741i.mo26022G();
    }

    private C10126m8(C10191s8 s8Var, C10145o4 o4Var) {
        this.f23742j = false;
        C9908u.m30853a(s8Var);
        this.f23741i = C10145o4.m31729a(s8Var.f23925a, (C11161ic) null);
        this.f23756x = -1;
        C10211u8 u8Var = new C10211u8(this);
        u8Var.mo25967r();
        this.f23739g = u8Var;
        C10144o3 o3Var = new C10144o3(this);
        o3Var.mo25967r();
        this.f23734b = o3Var;
        C10089j4 j4Var = new C10089j4(this);
        j4Var.mo25967r();
        this.f23733a = j4Var;
        this.f23741i.mo25897d().mo25800a((Runnable) new C10160p8(this, s8Var));
    }

    /* renamed from: b */
    private static void m31589b(C10138n8 n8Var) {
        if (n8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!n8Var.mo25968s()) {
            String valueOf = String.valueOf(n8Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0188  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10045f4 m31590e(com.google.android.gms.measurement.internal.C10028d9 r11) {
        /*
            r10 = this;
            r10.m31572C()
            r10.mo25941n()
            com.google.android.gms.common.internal.C9908u.m30853a(r11)
            java.lang.String r0 = r11.f23379c
            com.google.android.gms.common.internal.C9908u.m30863b(r0)
            com.google.android.gms.measurement.internal.n9 r0 = r10.mo25937j()
            java.lang.String r1 = r11.f23379c
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo25994b(r1)
            com.google.android.gms.measurement.internal.o4 r1 = r10.f23741i
            com.google.android.gms.measurement.internal.t3 r1 = r1.mo26030h()
            java.lang.String r2 = r11.f23379c
            java.lang.String r1 = r1.mo26091b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.f4 r0 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.o4 r3 = r10.f23741i
            java.lang.String r4 = r11.f23379c
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.o4 r3 = r10.f23741i
            com.google.android.gms.measurement.internal.y8 r3 = r3.mo26022G()
            java.lang.String r3 = r3.mo26243w()
            r0.mo25700a(r3)
            r0.mo25712d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo25723h()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo25712d(r1)
            com.google.android.gms.measurement.internal.o4 r1 = r10.f23741i
            com.google.android.gms.measurement.internal.y8 r1 = r1.mo26022G()
            java.lang.String r1 = r1.mo26243w()
            r0.mo25700a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r11.f23371U
            java.lang.String r4 = r0.mo25707c()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r11.f23371U
            r0.mo25705b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r11.f23388k0
            java.lang.String r4 = r0.mo25720g()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r11.f23388k0
            r0.mo25709c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r11.f23381d0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r11.f23381d0
            java.lang.String r4 = r0.mo25703b()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r11.f23381d0
            r0.mo25716e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r11.f23374X
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b2
            long r7 = r0.mo25736n()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x00b2
            long r3 = r11.f23374X
            r0.mo25711d(r3)
            r1 = 1
        L_0x00b2:
            java.lang.String r3 = r11.f23372V
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = r11.f23372V
            java.lang.String r4 = r0.mo25730k()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r1 = r11.f23372V
            r0.mo25719f(r1)
            r1 = 1
        L_0x00cc:
            long r3 = r11.f23380c0
            long r7 = r0.mo25732l()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x00dc
            long r3 = r11.f23380c0
            r0.mo25708c(r3)
            r1 = 1
        L_0x00dc:
            java.lang.String r3 = r11.f23373W
            if (r3 == 0) goto L_0x00f0
            java.lang.String r4 = r0.mo25734m()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f0
            java.lang.String r1 = r11.f23373W
            r0.mo25722g(r1)
            r1 = 1
        L_0x00f0:
            long r3 = r11.f23375Y
            long r7 = r0.mo25738o()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0100
            long r3 = r11.f23375Y
            r0.mo25715e(r3)
            r1 = 1
        L_0x0100:
            boolean r3 = r11.f23377a0
            boolean r4 = r0.mo25713d()
            if (r3 == r4) goto L_0x010e
            boolean r1 = r11.f23377a0
            r0.mo25702a(r1)
            r1 = 1
        L_0x010e:
            java.lang.String r3 = r11.f23376Z
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0128
            java.lang.String r3 = r11.f23376Z
            java.lang.String r4 = r0.mo25690A()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0128
            java.lang.String r1 = r11.f23376Z
            r0.mo25725h(r1)
            r1 = 1
        L_0x0128:
            long r3 = r11.f23382e0
            long r7 = r0.mo25692C()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0138
            long r3 = r11.f23382e0
            r0.mo25741p(r3)
            r1 = 1
        L_0x0138:
            boolean r3 = r11.f23385h0
            boolean r4 = r0.mo25693D()
            if (r3 == r4) goto L_0x0146
            boolean r1 = r11.f23385h0
            r0.mo25706b(r1)
            r1 = 1
        L_0x0146:
            boolean r3 = r11.f23386i0
            boolean r4 = r0.mo25694E()
            if (r3 == r4) goto L_0x0154
            boolean r1 = r11.f23386i0
            r0.mo25710c(r1)
            r1 = 1
        L_0x0154:
            com.google.android.gms.measurement.internal.o4 r3 = r10.f23741i
            com.google.android.gms.measurement.internal.i9 r3 = r3.mo26031i()
            java.lang.String r4 = r11.f23379c
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C10106l.f23661j0
            boolean r3 = r3.mo25821e(r4, r7)
            if (r3 == 0) goto L_0x0172
            java.lang.Boolean r3 = r11.f23389l0
            java.lang.Boolean r4 = r0.mo25695F()
            if (r3 == r4) goto L_0x0172
            java.lang.Boolean r1 = r11.f23389l0
            r0.mo25699a(r1)
            r1 = 1
        L_0x0172:
            long r3 = r11.f23390m0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0186
            long r5 = r0.mo25740p()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0186
            long r3 = r11.f23390m0
            r0.mo25718f(r3)
            r1 = 1
        L_0x0186:
            if (r1 == 0) goto L_0x018f
            com.google.android.gms.measurement.internal.n9 r11 = r10.mo25937j()
            r11.mo25985a(r0)
        L_0x018f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.m31590e(com.google.android.gms.measurement.internal.d9):com.google.android.gms.measurement.internal.f4");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a7 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0266 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0273 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0285 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d2 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25931c(com.google.android.gms.measurement.internal.C10028d9 r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sys"
            java.lang.String r4 = "_pfo"
            java.lang.String r5 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m31572C()
            r21.mo25941n()
            com.google.android.gms.common.internal.C9908u.m30853a(r22)
            java.lang.String r6 = r2.f23379c
            com.google.android.gms.common.internal.C9908u.m30863b(r6)
            java.lang.String r6 = r2.f23371U
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x002b
            java.lang.String r6 = r2.f23388k0
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.n9 r6 = r21.mo25937j()
            java.lang.String r7 = r2.f23379c
            com.google.android.gms.measurement.internal.f4 r6 = r6.mo25994b(r7)
            r7 = 0
            if (r6 == 0) goto L_0x005e
            java.lang.String r9 = r6.mo25707c()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x005e
            java.lang.String r9 = r2.f23371U
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x005e
            r6.mo25724h(r7)
            com.google.android.gms.measurement.internal.n9 r9 = r21.mo25937j()
            r9.mo25985a(r6)
            com.google.android.gms.measurement.internal.j4 r6 = r21.mo25938k()
            java.lang.String r9 = r2.f23379c
            r6.mo25853d(r9)
        L_0x005e:
            boolean r6 = r2.f23377a0
            if (r6 != 0) goto L_0x0066
            r21.m31590e(r22)
            return
        L_0x0066:
            long r9 = r2.f23383f0
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i
            com.google.android.gms.common.util.e r6 = r6.mo25896c()
            long r9 = r6.mo25474c()
        L_0x0076:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()
            java.lang.String r11 = r2.f23379c
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C10106l.f23661j0
            boolean r6 = r6.mo25821e(r11, r12)
            if (r6 == 0) goto L_0x008f
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()
            r6.mo25659w()
        L_0x008f:
            int r6 = r2.f23384g0
            r15 = 0
            r13 = 1
            if (r6 == 0) goto L_0x00b1
            if (r6 == r13) goto L_0x00b1
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo25898e()
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo25877w()
            java.lang.String r12 = r2.f23379c
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r11.mo25910a(r14, r12, r6)
            r6 = 0
        L_0x00b1:
            com.google.android.gms.measurement.internal.n9 r11 = r21.mo25937j()
            r11.mo26009v()
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r11 = r11.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C10106l.f23661j0     // Catch:{ all -> 0x04d2 }
            boolean r11 = r11.mo25821e(r12, r14)     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x0131
            com.google.android.gms.measurement.internal.n9 r11 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.v8 r14 = r11.mo25999d(r12, r14)     // Catch:{ all -> 0x04d2 }
            if (r14 == 0) goto L_0x00e0
            java.lang.String r11 = "auto"
            java.lang.String r12 = r14.f24005b     // Catch:{ all -> 0x04d2 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x0131
        L_0x00e0:
            java.lang.Boolean r11 = r2.f23389l0     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x011b
            com.google.android.gms.measurement.internal.t8 r12 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x04d2 }
            java.lang.String r16 = "_npa"
            java.lang.Boolean r11 = r2.f23389l0     // Catch:{ all -> 0x04d2 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x00f3
            r17 = 1
            goto L_0x00f5
        L_0x00f3:
            r17 = 0
        L_0x00f5:
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x04d2 }
            java.lang.String r18 = "auto"
            r11 = r12
            r7 = r12
            r12 = r16
            r19 = r3
            r8 = r14
            r3 = 1
            r13 = r9
            r15 = r17
            r16 = r18
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d2 }
            if (r8 == 0) goto L_0x0117
            java.lang.Object r8 = r8.f24008e     // Catch:{ all -> 0x04d2 }
            java.lang.Long r11 = r7.f23961W     // Catch:{ all -> 0x04d2 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x04d2 }
            if (r8 != 0) goto L_0x0134
        L_0x0117:
            r1.mo25923a(r7, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0134
        L_0x011b:
            r19 = r3
            r8 = r14
            r3 = 1
            if (r8 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.t8 r7 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d2 }
            r1.mo25930b(r7, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0134
        L_0x0131:
            r19 = r3
            r3 = 1
        L_0x0134:
            com.google.android.gms.measurement.internal.n9 r7 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r8 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.f4 r7 = r7.mo25994b(r8)     // Catch:{ all -> 0x04d2 }
            if (r7 == 0) goto L_0x01f2
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            r11.mo26022G()     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = r2.f23371U     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = r7.mo25707c()     // Catch:{ all -> 0x04d2 }
            java.lang.String r13 = r2.f23388k0     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = r7.mo25720g()     // Catch:{ all -> 0x04d2 }
            boolean r11 = com.google.android.gms.measurement.internal.C10251y8.m31976a(r11, r12, r13, r14)     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x01f2
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo25898e()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo25877w()     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r7.mo25717f()     // Catch:{ all -> 0x04d2 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ all -> 0x04d2 }
            r11.mo25909a(r12, r13)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.n9 r11 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = r7.mo25717f()     // Catch:{ all -> 0x04d2 }
            r11.mo25969t()     // Catch:{ all -> 0x04d2 }
            r11.mo25662j()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.common.internal.C9908u.m30863b(r7)     // Catch:{ all -> 0x04d2 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo26011x()     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01dd }
            r15 = 0
            r13[r15] = r7     // Catch:{ SQLiteException -> 0x01db }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r15
            java.lang.String r8 = "user_attributes"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "conditional_properties"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "apps"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events_metadata"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "event_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "property_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "audience_filter_values"
            int r0 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01f0
            com.google.android.gms.measurement.internal.k3 r0 = r11.mo25898e()     // Catch:{ SQLiteException -> 0x01db }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()     // Catch:{ SQLiteException -> 0x01db }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01db }
            r0.mo25910a(r8, r7, r12)     // Catch:{ SQLiteException -> 0x01db }
            goto L_0x01f0
        L_0x01db:
            r0 = move-exception
            goto L_0x01df
        L_0x01dd:
            r0 = move-exception
            r15 = 0
        L_0x01df:
            com.google.android.gms.measurement.internal.k3 r8 = r11.mo25898e()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25874t()     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = "Error deleting application data. appId, error"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x04d2 }
            r8.mo25910a(r11, r7, r0)     // Catch:{ all -> 0x04d2 }
        L_0x01f0:
            r7 = 0
            goto L_0x01f3
        L_0x01f2:
            r15 = 0
        L_0x01f3:
            if (r7 == 0) goto L_0x0260
            long r11 = r7.mo25732l()     // Catch:{ all -> 0x04d2 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r0 = "_pv"
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x022d
            long r11 = r7.mo25732l()     // Catch:{ all -> 0x04d2 }
            long r13 = r2.f23380c0     // Catch:{ all -> 0x04d2 }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0260
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r8.<init>()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = r7.mo25730k()     // Catch:{ all -> 0x04d2 }
            r8.putString(r0, r7)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.j r0 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r8)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r0
            r8 = 0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r0, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0261
        L_0x022d:
            r8 = 0
            java.lang.String r11 = r7.mo25730k()     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x0261
            java.lang.String r11 = r7.mo25730k()     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = r2.f23372V     // Catch:{ all -> 0x04d2 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04d2 }
            if (r11 != 0) goto L_0x0261
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r11.<init>()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = r7.mo25730k()     // Catch:{ all -> 0x04d2 }
            r11.putString(r0, r7)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.j r0 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r11)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r0, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0261
        L_0x0260:
            r8 = 0
        L_0x0261:
            r21.m31590e(r22)     // Catch:{ all -> 0x04d2 }
            if (r6 != 0) goto L_0x0273
            com.google.android.gms.measurement.internal.n9 r0 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = "_f"
            com.google.android.gms.measurement.internal.f r0 = r0.mo25995b(r7, r11)     // Catch:{ all -> 0x04d2 }
            goto L_0x0283
        L_0x0273:
            if (r6 != r3) goto L_0x0282
            com.google.android.gms.measurement.internal.n9 r0 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = "_v"
            com.google.android.gms.measurement.internal.f r0 = r0.mo25995b(r7, r11)     // Catch:{ all -> 0x04d2 }
            goto L_0x0283
        L_0x0282:
            r0 = 0
        L_0x0283:
            if (r0 != 0) goto L_0x04a7
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r9 / r11
            r15 = 1
            long r13 = r13 + r15
            long r13 = r13 * r11
            java.lang.String r0 = "_dac"
            java.lang.String r7 = "_r"
            java.lang.String r15 = "_c"
            java.lang.String r12 = "_et"
            if (r6 != 0) goto L_0x040a
            com.google.android.gms.measurement.internal.t8 r6 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x04d2 }
            java.lang.String r16 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04d2 }
            java.lang.String r20 = "auto"
            r11 = r6
            r13 = r12
            r12 = r16
            r3 = r13
            r13 = r9
            r8 = r15
            r15 = r18
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d2 }
            r1.mo25923a(r6, r2)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = r2.f23371U     // Catch:{ all -> 0x04d2 }
            boolean r6 = r6.mo25828l(r11)     // Catch:{ all -> 0x04d2 }
            if (r6 == 0) goto L_0x02d0
            r21.m31572C()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo26033k()     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            r6.mo26245a(r11)     // Catch:{ all -> 0x04d2 }
        L_0x02d0:
            r21.m31572C()     // Catch:{ all -> 0x04d2 }
            r21.mo25941n()     // Catch:{ all -> 0x04d2 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r6.<init>()     // Catch:{ all -> 0x04d2 }
            r11 = 1
            r6.putLong(r8, r11)     // Catch:{ all -> 0x04d2 }
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04d2 }
            r7 = 0
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04d2 }
            r6.putLong(r4, r7)     // Catch:{ all -> 0x04d2 }
            r15 = r19
            r6.putLong(r15, r7)     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = "_sysu"
            r6.putLong(r11, r7)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r7 = r7.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r8 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            boolean r7 = r7.mo25839r(r8)     // Catch:{ all -> 0x04d2 }
            if (r7 == 0) goto L_0x0309
            r7 = 1
            r6.putLong(r3, r7)     // Catch:{ all -> 0x04d2 }
            goto L_0x030b
        L_0x0309:
            r7 = 1
        L_0x030b:
            boolean r11 = r2.f23387j0     // Catch:{ all -> 0x04d2 }
            if (r11 == 0) goto L_0x0312
            r6.putLong(r0, r7)     // Catch:{ all -> 0x04d2 }
        L_0x0312:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            android.content.Context r0 = r0.mo25895b()     // Catch:{ all -> 0x04d2 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04d2 }
            if (r0 != 0) goto L_0x0335
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo25898e()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()     // Catch:{ all -> 0x04d2 }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r7 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x04d2 }
            r0.mo25909a(r5, r7)     // Catch:{ all -> 0x04d2 }
            goto L_0x03d8
        L_0x0335:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ NameNotFoundException -> 0x0347 }
            android.content.Context r0 = r0.mo25895b()     // Catch:{ NameNotFoundException -> 0x0347 }
            com.google.android.gms.common.p.b r0 = com.google.android.gms.common.p400p.C9931c.m30956a(r0)     // Catch:{ NameNotFoundException -> 0x0347 }
            java.lang.String r7 = r2.f23379c     // Catch:{ NameNotFoundException -> 0x0347 }
            r8 = 0
            android.content.pm.PackageInfo r0 = r0.mo25464b(r7, r8)     // Catch:{ NameNotFoundException -> 0x0347 }
            goto L_0x035e
        L_0x0347:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()     // Catch:{ all -> 0x04d2 }
            java.lang.String r8 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r11)     // Catch:{ all -> 0x04d2 }
            r7.mo25910a(r8, r11, r0)     // Catch:{ all -> 0x04d2 }
            r0 = 0
        L_0x035e:
            if (r0 == 0) goto L_0x0394
            long r7 = r0.firstInstallTime     // Catch:{ all -> 0x04d2 }
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0394
            long r7 = r0.firstInstallTime     // Catch:{ all -> 0x04d2 }
            long r11 = r0.lastUpdateTime     // Catch:{ all -> 0x04d2 }
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0377
            r7 = 1
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04d2 }
            r0 = 0
            goto L_0x0378
        L_0x0377:
            r0 = 1
        L_0x0378:
            com.google.android.gms.measurement.internal.t8 r5 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_fi"
            if (r0 == 0) goto L_0x0381
            r7 = 1
            goto L_0x0383
        L_0x0381:
            r7 = 0
        L_0x0383:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04d2 }
            java.lang.String r16 = "auto"
            r11 = r5
            r13 = r9
            r7 = r15
            r15 = r0
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d2 }
            r1.mo25923a(r5, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0395
        L_0x0394:
            r7 = r15
        L_0x0395:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ NameNotFoundException -> 0x03a7 }
            android.content.Context r0 = r0.mo25895b()     // Catch:{ NameNotFoundException -> 0x03a7 }
            com.google.android.gms.common.p.b r0 = com.google.android.gms.common.p400p.C9931c.m30956a(r0)     // Catch:{ NameNotFoundException -> 0x03a7 }
            java.lang.String r5 = r2.f23379c     // Catch:{ NameNotFoundException -> 0x03a7 }
            r8 = 0
            android.content.pm.ApplicationInfo r8 = r0.mo25459a(r5, r8)     // Catch:{ NameNotFoundException -> 0x03a7 }
            goto L_0x03be
        L_0x03a7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ all -> 0x04d2 }
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r11)     // Catch:{ all -> 0x04d2 }
            r5.mo25910a(r8, r11, r0)     // Catch:{ all -> 0x04d2 }
            r8 = 0
        L_0x03be:
            if (r8 == 0) goto L_0x03d8
            int r0 = r8.flags     // Catch:{ all -> 0x04d2 }
            r5 = 1
            r0 = r0 & r5
            if (r0 == 0) goto L_0x03cb
            r11 = 1
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04d2 }
        L_0x03cb:
            int r0 = r8.flags     // Catch:{ all -> 0x04d2 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03d8
            java.lang.String r0 = "_sysu"
            r7 = 1
            r6.putLong(r0, r7)     // Catch:{ all -> 0x04d2 }
        L_0x03d8:
            com.google.android.gms.measurement.internal.n9 r0 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            java.lang.String r5 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.common.internal.C9908u.m30863b(r5)     // Catch:{ all -> 0x04d2 }
            r0.mo25662j()     // Catch:{ all -> 0x04d2 }
            r0.mo25969t()     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = "first_open_count"
            long r7 = r0.mo26008i(r5, r7)     // Catch:{ all -> 0x04d2 }
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x03f6
            r6.putLong(r4, r7)     // Catch:{ all -> 0x04d2 }
        L_0x03f6:
            com.google.android.gms.measurement.internal.j r0 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_f"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r6)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r0, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x0464
        L_0x040a:
            r3 = r12
            r8 = r15
            r4 = 1
            if (r6 != r4) goto L_0x0464
            com.google.android.gms.measurement.internal.t8 r4 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_fvt"
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04d2 }
            java.lang.String r16 = "auto"
            r11 = r4
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d2 }
            r1.mo25923a(r4, r2)     // Catch:{ all -> 0x04d2 }
            r21.m31572C()     // Catch:{ all -> 0x04d2 }
            r21.mo25941n()     // Catch:{ all -> 0x04d2 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r4.<init>()     // Catch:{ all -> 0x04d2 }
            r5 = 1
            r4.putLong(r8, r5)     // Catch:{ all -> 0x04d2 }
            r4.putLong(r7, r5)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r5 = r5.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r6 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            boolean r5 = r5.mo25839r(r6)     // Catch:{ all -> 0x04d2 }
            if (r5 == 0) goto L_0x0448
            r5 = 1
            r4.putLong(r3, r5)     // Catch:{ all -> 0x04d2 }
            goto L_0x044a
        L_0x0448:
            r5 = 1
        L_0x044a:
            boolean r7 = r2.f23387j0     // Catch:{ all -> 0x04d2 }
            if (r7 == 0) goto L_0x0451
            r4.putLong(r0, r5)     // Catch:{ all -> 0x04d2 }
        L_0x0451:
            com.google.android.gms.measurement.internal.j r0 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_v"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r4)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r0, r2)     // Catch:{ all -> 0x04d2 }
        L_0x0464:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r4 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C10106l.f23659i0     // Catch:{ all -> 0x04d2 }
            boolean r0 = r0.mo25821e(r4, r5)     // Catch:{ all -> 0x04d2 }
            if (r0 != 0) goto L_0x04c3
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r0.<init>()     // Catch:{ all -> 0x04d2 }
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.i9 r3 = r3.mo26031i()     // Catch:{ all -> 0x04d2 }
            java.lang.String r4 = r2.f23379c     // Catch:{ all -> 0x04d2 }
            boolean r3 = r3.mo25839r(r4)     // Catch:{ all -> 0x04d2 }
            if (r3 == 0) goto L_0x0493
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04d2 }
        L_0x0493:
            com.google.android.gms.measurement.internal.j r3 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_e"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r3, r2)     // Catch:{ all -> 0x04d2 }
            goto L_0x04c3
        L_0x04a7:
            boolean r0 = r2.f23378b0     // Catch:{ all -> 0x04d2 }
            if (r0 == 0) goto L_0x04c3
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04d2 }
            r0.<init>()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.j r3 = new com.google.android.gms.measurement.internal.j     // Catch:{ all -> 0x04d2 }
            java.lang.String r12 = "_cd"
            com.google.android.gms.measurement.internal.i r13 = new com.google.android.gms.measurement.internal.i     // Catch:{ all -> 0x04d2 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d2 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d2 }
            r1.mo25920a(r3, r2)     // Catch:{ all -> 0x04d2 }
        L_0x04c3:
            com.google.android.gms.measurement.internal.n9 r0 = r21.mo25937j()     // Catch:{ all -> 0x04d2 }
            r0.mo26012y()     // Catch:{ all -> 0x04d2 }
            com.google.android.gms.measurement.internal.n9 r0 = r21.mo25937j()
            r0.mo26010w()
            return
        L_0x04d2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n9 r2 = r21.mo25937j()
            r2.mo26010w()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.mo25931c(com.google.android.gms.measurement.internal.d9):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo25932d(C10028d9 d9Var) {
        try {
            return (String) this.f23741i.mo25897d().mo25799a((Callable<V>) new C10171q8<V>(this, d9Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f23741i.mo25898e().mo25874t().mo25910a("Failed to get app instance id. appId", C10099k3.m31423a(d9Var.f23379c), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25927b(C10028d9 d9Var) {
        m31572C();
        mo25941n();
        C9908u.m30863b(d9Var.f23379c);
        m31590e(d9Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:247:0x0848 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0878 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026f A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a6 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f4 A[Catch:{ SQLiteException -> 0x0237, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0321  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31588b(com.google.android.gms.measurement.internal.C10084j r28, com.google.android.gms.measurement.internal.C10028d9 r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "_s"
            com.google.android.gms.common.internal.C9908u.m30853a(r29)
            java.lang.String r5 = r3.f23379c
            com.google.android.gms.common.internal.C9908u.m30863b(r5)
            long r5 = java.lang.System.nanoTime()
            r27.m31572C()
            r27.mo25941n()
            java.lang.String r15 = r3.f23379c
            com.google.android.gms.measurement.internal.u8 r7 = r27.mo25935h()
            boolean r7 = r7.mo26122a(r2, r3)
            if (r7 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r7 = r3.f23377a0
            if (r7 != 0) goto L_0x002f
            r1.m31590e(r3)
            return
        L_0x002f:
            com.google.android.gms.measurement.internal.j4 r7 = r27.mo25938k()
            java.lang.String r8 = r2.f23562c
            boolean r7 = r7.mo25849b(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            r12 = 1
            if (r7 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25877w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r15)
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i
            com.google.android.gms.measurement.internal.i3 r5 = r5.mo26021F()
            java.lang.String r6 = r2.f23562c
            java.lang.String r5 = r5.mo25795a(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo25910a(r6, r4, r5)
            com.google.android.gms.measurement.internal.j4 r3 = r27.mo25938k()
            boolean r3 = r3.mo25856g(r15)
            if (r3 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.j4 r3 = r27.mo25938k()
            boolean r3 = r3.mo25857h(r15)
            if (r3 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            if (r3 != 0) goto L_0x0091
            java.lang.String r4 = r2.f23562c
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i
            com.google.android.gms.measurement.internal.y8 r7 = r4.mo26022G()
            r9 = 11
            java.lang.String r11 = r2.f23562c
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.mo26229a(r8, r9, r10, r11, r12)
        L_0x0091:
            if (r3 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            com.google.android.gms.measurement.internal.f4 r2 = r2.mo25994b(r15)
            if (r2 == 0) goto L_0x00da
            long r3 = r2.mo25744s()
            long r5 = r2.mo25743r()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i
            com.google.android.gms.common.util.e r5 = r5.mo25896c()
            long r5 = r5.mo25474c()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.y2<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C10106l.f23618E
            java.lang.Object r5 = r5.mo26194a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00da
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25868A()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo25908a(r4)
            r1.m31578a(r2)
        L_0x00da:
            return
        L_0x00db:
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()
            r10 = 2
            boolean r7 = r7.mo25873a(r10)
            if (r7 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25869B()
            com.google.android.gms.measurement.internal.o4 r8 = r1.f23741i
            com.google.android.gms.measurement.internal.i3 r8 = r8.mo26021F()
            java.lang.String r8 = r8.mo25794a(r2)
            java.lang.String r9 = "Logging event"
            r7.mo25909a(r9, r8)
        L_0x0101:
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()
            r7.mo26009v()
            r1.m31590e(r3)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = "_iap"
            java.lang.String r8 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "ecommerce_purchase"
            if (r7 != 0) goto L_0x0125
            java.lang.String r7 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r23 = r5
            r6 = 0
            goto L_0x02b5
        L_0x0125:
            com.google.android.gms.measurement.internal.i r7 = r2.f23559U     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = "currency"
            java.lang.String r7 = r7.mo25786c(r9)     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = "value"
            if (r8 == 0) goto L_0x0189
            com.google.android.gms.measurement.internal.i r8 = r2.f23559U     // Catch:{ all -> 0x08bd }
            java.lang.Double r8 = r8.mo25787d(r9)     // Catch:{ all -> 0x08bd }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x08bd }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r8 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r8 != 0) goto L_0x015b
            com.google.android.gms.measurement.internal.i r8 = r2.f23559U     // Catch:{ all -> 0x08bd }
            java.lang.Long r8 = r8.mo25784b(r9)     // Catch:{ all -> 0x08bd }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08bd }
            double r8 = (double) r8     // Catch:{ all -> 0x08bd }
            double r16 = r8 * r18
        L_0x015b:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 > 0) goto L_0x016c
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 < 0) goto L_0x016c
            long r8 = java.lang.Math.round(r16)     // Catch:{ all -> 0x08bd }
            goto L_0x0193
        L_0x016c:
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25877w()     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r15)     // Catch:{ all -> 0x08bd }
            java.lang.Double r10 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x08bd }
            r7.mo25910a(r8, r9, r10)     // Catch:{ all -> 0x08bd }
            r23 = r5
            r6 = 0
            r11 = 0
            goto L_0x02a4
        L_0x0189:
            com.google.android.gms.measurement.internal.i r8 = r2.f23559U     // Catch:{ all -> 0x08bd }
            java.lang.Long r8 = r8.mo25784b(r9)     // Catch:{ all -> 0x08bd }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08bd }
        L_0x0193:
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08bd }
            if (r10 != 0) goto L_0x02a0
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r7.toUpperCase(r10)     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r7.matches(r10)     // Catch:{ all -> 0x08bd }
            if (r10 == 0) goto L_0x02a0
            java.lang.String r10 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x08bd }
            int r16 = r7.length()     // Catch:{ all -> 0x08bd }
            if (r16 == 0) goto L_0x01b8
            java.lang.String r7 = r10.concat(r7)     // Catch:{ all -> 0x08bd }
            goto L_0x01bd
        L_0x01b8:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x08bd }
            r7.<init>(r10)     // Catch:{ all -> 0x08bd }
        L_0x01bd:
            r10 = r7
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r7 = r7.mo25999d(r15, r10)     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x01fe
            java.lang.Object r11 = r7.f24008e     // Catch:{ all -> 0x08bd }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x08bd }
            if (r11 != 0) goto L_0x01cf
            goto L_0x01fe
        L_0x01cf:
            java.lang.Object r7 = r7.f24008e     // Catch:{ all -> 0x08bd }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x08bd }
            long r19 = r7.longValue()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r17 = new com.google.android.gms.measurement.internal.v8     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = r2.f23560V     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.util.e r7 = r7.mo25896c()     // Catch:{ all -> 0x08bd }
            long r21 = r7.mo25474c()     // Catch:{ all -> 0x08bd }
            long r19 = r19 + r8
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x08bd }
            r7 = r17
            r8 = r15
            r9 = r11
            r11 = 2
            r23 = r5
            r5 = 1
            r6 = 0
            r11 = r21
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x08bd }
            r5 = r17
            goto L_0x0265
        L_0x01fe:
            r23 = r5
            r5 = 1
            r6 = 0
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r11 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r11 = r11.mo26031i()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C10106l.f23625J     // Catch:{ all -> 0x08bd }
            int r11 = r11.mo25814b(r15, r12)     // Catch:{ all -> 0x08bd }
            int r11 = r11 - r5
            com.google.android.gms.common.internal.C9908u.m30863b(r15)     // Catch:{ all -> 0x08bd }
            r7.mo25662j()     // Catch:{ all -> 0x08bd }
            r7.mo25969t()     // Catch:{ all -> 0x08bd }
            android.database.sqlite.SQLiteDatabase r12 = r7.mo26011x()     // Catch:{ SQLiteException -> 0x0237 }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0237 }
            r5[r6] = r15     // Catch:{ SQLiteException -> 0x0237 }
            r16 = 1
            r5[r16] = r15     // Catch:{ SQLiteException -> 0x0237 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0237 }
            r16 = 2
            r5[r16] = r11     // Catch:{ SQLiteException -> 0x0237 }
            r12.execSQL(r13, r5)     // Catch:{ SQLiteException -> 0x0237 }
            goto L_0x024a
        L_0x0237:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r15)     // Catch:{ all -> 0x08bd }
            r7.mo25910a(r11, r12, r5)     // Catch:{ all -> 0x08bd }
        L_0x024a:
            com.google.android.gms.measurement.internal.v8 r5 = new com.google.android.gms.measurement.internal.v8     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = r2.f23560V     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.util.e r7 = r7.mo25896c()     // Catch:{ all -> 0x08bd }
            long r12 = r7.mo25474c()     // Catch:{ all -> 0x08bd }
            java.lang.Long r16 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x08bd }
            r7 = r5
            r8 = r15
            r9 = r11
            r11 = r12
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x08bd }
        L_0x0265:
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            boolean r7 = r7.mo25991a(r5)     // Catch:{ all -> 0x08bd }
            if (r7 != 0) goto L_0x02a3
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r15)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r10 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i3 r10 = r10.mo26021F()     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = r5.f24006c     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r10.mo25797c(r11)     // Catch:{ all -> 0x08bd }
            java.lang.Object r5 = r5.f24008e     // Catch:{ all -> 0x08bd }
            r7.mo25911a(r8, r9, r10, r5)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r5.mo26022G()     // Catch:{ all -> 0x08bd }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.mo26229a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08bd }
            goto L_0x02a3
        L_0x02a0:
            r23 = r5
            r6 = 0
        L_0x02a3:
            r11 = 1
        L_0x02a4:
            if (r11 != 0) goto L_0x02b5
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo26012y()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            return
        L_0x02b5:
            java.lang.String r5 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r5 = com.google.android.gms.measurement.internal.C10251y8.m31984e(r5)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r16 = r14.equals(r7)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            long r8 = r27.m31593w()     // Catch:{ all -> 0x08bd }
            r11 = 1
            r13 = 0
            r17 = 0
            r10 = r15
            r12 = r5
            r14 = r16
            r18 = r15
            r15 = r17
            com.google.android.gms.measurement.internal.m9 r7 = r7.mo25979a(r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x08bd }
            long r8 = r7.f23762b     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C10106l.f23672p     // Catch:{ all -> 0x08bd }
            r14 = 0
            java.lang.Object r10 = r10.mo26194a(r14)     // Catch:{ all -> 0x08bd }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x08bd }
            int r10 = r10.intValue()     // Catch:{ all -> 0x08bd }
            long r10 = (long) r10     // Catch:{ all -> 0x08bd }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 1
            r14 = 0
            int r17 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0321
            long r8 = r8 % r10
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r18)     // Catch:{ all -> 0x08bd }
            long r5 = r7.f23762b     // Catch:{ all -> 0x08bd }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x08bd }
            r2.mo25910a(r3, r4, r5)     // Catch:{ all -> 0x08bd }
        L_0x0312:
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo26012y()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            return
        L_0x0321:
            if (r5 == 0) goto L_0x0379
            long r8 = r7.f23761a     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.C10106l.f23676r     // Catch:{ all -> 0x08bd }
            r12 = 0
            java.lang.Object r6 = r6.mo26194a(r12)     // Catch:{ all -> 0x08bd }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x08bd }
            int r6 = r6.intValue()     // Catch:{ all -> 0x08bd }
            long r12 = (long) r6     // Catch:{ all -> 0x08bd }
            long r8 = r8 - r12
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0379
            long r8 = r8 % r10
            r3 = 1
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0358
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r18)     // Catch:{ all -> 0x08bd }
            long r6 = r7.f23761a     // Catch:{ all -> 0x08bd }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x08bd }
            r3.mo25910a(r4, r5, r6)     // Catch:{ all -> 0x08bd }
        L_0x0358:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r3.mo26022G()     // Catch:{ all -> 0x08bd }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f23562c     // Catch:{ all -> 0x08bd }
            r12 = 0
            r8 = r18
            r7.mo26229a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo26012y()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            return
        L_0x0379:
            if (r16 == 0) goto L_0x03cb
            long r8 = r7.f23764d     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r3.f23379c     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.C10106l.f23674q     // Catch:{ all -> 0x08bd }
            int r6 = r6.mo25814b(r10, r11)     // Catch:{ all -> 0x08bd }
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = java.lang.Math.min(r10, r6)     // Catch:{ all -> 0x08bd }
            r12 = 0
            int r6 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x08bd }
            long r10 = (long) r6     // Catch:{ all -> 0x08bd }
            long r8 = r8 - r10
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x03cc
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x03bc
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r18)     // Catch:{ all -> 0x08bd }
            long r5 = r7.f23764d     // Catch:{ all -> 0x08bd }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x08bd }
            r2.mo25910a(r3, r4, r5)     // Catch:{ all -> 0x08bd }
        L_0x03bc:
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo26012y()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            return
        L_0x03cb:
            r12 = 0
        L_0x03cc:
            com.google.android.gms.measurement.internal.i r6 = r2.f23559U     // Catch:{ all -> 0x08bd }
            android.os.Bundle r6 = r6.mo25785c()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r7.mo26022G()     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f23560V     // Catch:{ all -> 0x08bd }
            r7.mo26221a(r6, r8, r9)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r7.mo26022G()     // Catch:{ all -> 0x08bd }
            r13 = r18
            boolean r7 = r7.mo26238d(r13)     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x040d
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r7.mo26022G()     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "_dbg"
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08bd }
            r7.mo26221a(r6, r8, r12)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r7.mo26022G()     // Catch:{ all -> 0x08bd }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08bd }
            r7.mo26221a(r6, r11, r8)     // Catch:{ all -> 0x08bd }
        L_0x040d:
            java.lang.String r7 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x08bd }
            java.lang.String r8 = "_sno"
            if (r7 == 0) goto L_0x0442
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r7 = r7.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = r3.f23379c     // Catch:{ all -> 0x08bd }
            boolean r7 = r7.mo25833o(r9)     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x0442
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = r3.f23379c     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r7 = r7.mo25999d(r9, r8)     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x0442
            java.lang.Object r9 = r7.f24008e     // Catch:{ all -> 0x08bd }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x08bd }
            if (r9 == 0) goto L_0x0442
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r9 = r9.mo26022G()     // Catch:{ all -> 0x08bd }
            java.lang.Object r7 = r7.f24008e     // Catch:{ all -> 0x08bd }
            r9.mo26221a(r6, r8, r7)     // Catch:{ all -> 0x08bd }
        L_0x0442:
            java.lang.String r7 = r2.f23562c     // Catch:{ all -> 0x08bd }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x08bd }
            if (r4 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23379c     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C10106l.f23653f0     // Catch:{ all -> 0x08bd }
            boolean r4 = r4.mo25821e(r7, r9)     // Catch:{ all -> 0x08bd }
            if (r4 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23379c     // Catch:{ all -> 0x08bd }
            boolean r4 = r4.mo25833o(r7)     // Catch:{ all -> 0x08bd }
            if (r4 != 0) goto L_0x0472
            com.google.android.gms.measurement.internal.t8 r4 = new com.google.android.gms.measurement.internal.t8     // Catch:{ all -> 0x08bd }
            r12 = 0
            r4.<init>(r8, r14, r12)     // Catch:{ all -> 0x08bd }
            r1.mo25930b(r4, r3)     // Catch:{ all -> 0x08bd }
            goto L_0x0473
        L_0x0472:
            r12 = 0
        L_0x0473:
            com.google.android.gms.measurement.internal.n9 r4 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            long r7 = r4.mo25997c(r13)     // Catch:{ all -> 0x08bd }
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0496
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25877w()     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r13)     // Catch:{ all -> 0x08bd }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x08bd }
            r4.mo25910a(r9, r10, r7)     // Catch:{ all -> 0x08bd }
        L_0x0496:
            com.google.android.gms.measurement.internal.g r4 = new com.google.android.gms.measurement.internal.g     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r8 = r1.f23741i     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = r2.f23560V     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r2.f23562c     // Catch:{ all -> 0x08bd }
            long r14 = r2.f23561W     // Catch:{ all -> 0x08bd }
            r19 = 0
            r7 = r4
            r2 = r10
            r10 = r13
            r26 = r11
            r11 = r2
            r16 = r12
            r2 = r13
            r25 = 0
            r12 = r14
            r28 = r16
            r14 = r19
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r6 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r4.f23471b     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.f r6 = r6.mo25995b(r2, r7)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x0529
            com.google.android.gms.measurement.internal.n9 r6 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            long r6 = r6.mo26005g(r2)     // Catch:{ all -> 0x08bd }
            r8 = 500(0x1f4, double:2.47E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x050f
            if (r5 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r2)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i3 r7 = r7.mo26021F()     // Catch:{ all -> 0x08bd }
            java.lang.String r4 = r4.f23471b     // Catch:{ all -> 0x08bd }
            java.lang.String r4 = r7.mo25795a(r4)     // Catch:{ all -> 0x08bd }
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x08bd }
            r3.mo25911a(r5, r6, r4, r7)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r3.mo26022G()     // Catch:{ all -> 0x08bd }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.mo26229a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            return
        L_0x050f:
            com.google.android.gms.measurement.internal.f r5 = new com.google.android.gms.measurement.internal.f     // Catch:{ all -> 0x08bd }
            java.lang.String r9 = r4.f23471b     // Catch:{ all -> 0x08bd }
            r10 = 0
            r12 = 0
            long r14 = r4.f23473d     // Catch:{ all -> 0x08bd }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r5
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x08bd }
            goto L_0x0537
        L_0x0529:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i     // Catch:{ all -> 0x08bd }
            long r7 = r6.f23418f     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.g r4 = r4.mo25761a(r2, r7)     // Catch:{ all -> 0x08bd }
            long r7 = r4.f23473d     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.f r5 = r6.mo25682a(r7)     // Catch:{ all -> 0x08bd }
        L_0x0537:
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo25986a(r5)     // Catch:{ all -> 0x08bd }
            r27.m31572C()     // Catch:{ all -> 0x08bd }
            r27.mo25941n()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.internal.C9908u.m30853a(r4)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.internal.C9908u.m30853a(r29)     // Catch:{ all -> 0x08bd }
            java.lang.String r2 = r4.f23470a     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.internal.C9908u.m30863b(r2)     // Catch:{ all -> 0x08bd }
            java.lang.String r2 = r4.f23470a     // Catch:{ all -> 0x08bd }
            java.lang.String r5 = r3.f23379c     // Catch:{ all -> 0x08bd }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.common.internal.C9908u.m30860a(r2)     // Catch:{ all -> 0x08bd }
            g.j.a.a.d.g.t0$a r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.m36137C0()     // Catch:{ all -> 0x08bd }
            r5 = 1
            r2.mo28956a(r5)     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = "android"
            r2.mo28964a(r6)     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = r3.f23379c     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x0574
            java.lang.String r6 = r3.f23379c     // Catch:{ all -> 0x08bd }
            r2.mo28983f(r6)     // Catch:{ all -> 0x08bd }
        L_0x0574:
            java.lang.String r6 = r3.f23373W     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x0581
            java.lang.String r6 = r3.f23373W     // Catch:{ all -> 0x08bd }
            r2.mo28980e(r6)     // Catch:{ all -> 0x08bd }
        L_0x0581:
            java.lang.String r6 = r3.f23372V     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x058e
            java.lang.String r6 = r3.f23372V     // Catch:{ all -> 0x08bd }
            r2.mo28986g(r6)     // Catch:{ all -> 0x08bd }
        L_0x058e:
            long r6 = r3.f23380c0     // Catch:{ all -> 0x08bd }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x059d
            long r6 = r3.f23380c0     // Catch:{ all -> 0x08bd }
            int r7 = (int) r6     // Catch:{ all -> 0x08bd }
            r2.mo28984g(r7)     // Catch:{ all -> 0x08bd }
        L_0x059d:
            long r6 = r3.f23374X     // Catch:{ all -> 0x08bd }
            r2.mo28982f(r6)     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = r3.f23371U     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x05af
            java.lang.String r6 = r3.f23371U     // Catch:{ all -> 0x08bd }
            r2.mo28997k(r6)     // Catch:{ all -> 0x08bd }
        L_0x05af:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C10106l.f23679s0     // Catch:{ all -> 0x08bd }
            boolean r6 = r6.mo25813a(r7)     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x05d5
            java.lang.String r6 = r2.mo28992i()     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x05e2
            java.lang.String r6 = r3.f23388k0     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x05e2
            java.lang.String r6 = r3.f23388k0     // Catch:{ all -> 0x08bd }
            r2.mo29007o(r6)     // Catch:{ all -> 0x08bd }
            goto L_0x05e2
        L_0x05d5:
            java.lang.String r6 = r3.f23388k0     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x05e2
            java.lang.String r6 = r3.f23388k0     // Catch:{ all -> 0x08bd }
            r2.mo29007o(r6)     // Catch:{ all -> 0x08bd }
        L_0x05e2:
            long r6 = r3.f23375Y     // Catch:{ all -> 0x08bd }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x05ef
            long r6 = r3.f23375Y     // Catch:{ all -> 0x08bd }
            r2.mo28988h(r6)     // Catch:{ all -> 0x08bd }
        L_0x05ef:
            long r6 = r3.f23390m0     // Catch:{ all -> 0x08bd }
            r2.mo28996k(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23379c     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C10106l.f23669n0     // Catch:{ all -> 0x08bd }
            boolean r6 = r6.mo25821e(r7, r10)     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x0611
            com.google.android.gms.measurement.internal.u8 r6 = r27.mo25935h()     // Catch:{ all -> 0x08bd }
            java.util.List r6 = r6.mo26125v()     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x0611
            r2.mo28973c(r6)     // Catch:{ all -> 0x08bd }
        L_0x0611:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.t3 r6 = r6.mo26030h()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23379c     // Catch:{ all -> 0x08bd }
            android.util.Pair r6 = r6.mo26088a(r7)     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x0644
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x08bd }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x08bd }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08bd }
            if (r7 != 0) goto L_0x0644
            boolean r7 = r3.f23385h0     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x06a6
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x08bd }
            r2.mo28989h(r7)     // Catch:{ all -> 0x08bd }
            java.lang.Object r7 = r6.second     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x06a6
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x08bd }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x08bd }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x08bd }
            r2.mo28965a(r6)     // Catch:{ all -> 0x08bd }
            goto L_0x06a6
        L_0x0644:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            android.content.Context r7 = r7.mo25895b()     // Catch:{ all -> 0x08bd }
            boolean r6 = r6.mo25654a(r7)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x06a6
            boolean r6 = r3.f23386i0     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x06a6
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            android.content.Context r6 = r6.mo25895b()     // Catch:{ all -> 0x08bd }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r7)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x0686
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r6 = r6.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo25877w()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r10 = r2.mo28995j()     // Catch:{ all -> 0x08bd }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r10)     // Catch:{ all -> 0x08bd }
            r6.mo25909a(r7, r10)     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = "null"
            goto L_0x06a3
        L_0x0686:
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x06a3
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25877w()     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = "empty secure ID. appId"
            java.lang.String r11 = r2.mo28995j()     // Catch:{ all -> 0x08bd }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r11)     // Catch:{ all -> 0x08bd }
            r7.mo25909a(r10, r11)     // Catch:{ all -> 0x08bd }
        L_0x06a3:
            r2.mo29003m(r6)     // Catch:{ all -> 0x08bd }
        L_0x06a6:
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()     // Catch:{ all -> 0x08bd }
            r6.mo25884p()     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x08bd }
            r2.mo28974c(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()     // Catch:{ all -> 0x08bd }
            r6.mo25884p()     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x08bd }
            r2.mo28969b(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()     // Catch:{ all -> 0x08bd }
            long r6 = r6.mo25656t()     // Catch:{ all -> 0x08bd }
            int r7 = (int) r6     // Catch:{ all -> 0x08bd }
            r2.mo28978e(r7)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.d r6 = r6.mo26020E()     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = r6.mo25657u()     // Catch:{ all -> 0x08bd }
            r2.mo28976d(r6)     // Catch:{ all -> 0x08bd }
            long r6 = r3.f23382e0     // Catch:{ all -> 0x08bd }
            r2.mo28993j(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x08bd }
            boolean r6 = r6.mo26028f()     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x06fe
            boolean r6 = com.google.android.gms.measurement.internal.C10083i9.m31364y()     // Catch:{ all -> 0x08bd }
            if (r6 == 0) goto L_0x06fe
            r2.mo28995j()     // Catch:{ all -> 0x08bd }
            boolean r6 = android.text.TextUtils.isEmpty(r28)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x06fe
            r6 = r28
            r2.mo29004n(r6)     // Catch:{ all -> 0x08bd }
        L_0x06fe:
            com.google.android.gms.measurement.internal.n9 r6 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23379c     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.f4 r6 = r6.mo25994b(r7)     // Catch:{ all -> 0x08bd }
            if (r6 != 0) goto L_0x0771
            com.google.android.gms.measurement.internal.f4 r6 = new com.google.android.gms.measurement.internal.f4     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r3.f23379c     // Catch:{ all -> 0x08bd }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.y8 r7 = r7.mo26022G()     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r7.mo26243w()     // Catch:{ all -> 0x08bd }
            r6.mo25700a(r7)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23381d0     // Catch:{ all -> 0x08bd }
            r6.mo25716e(r7)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23371U     // Catch:{ all -> 0x08bd }
            r6.mo25705b(r7)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.t3 r7 = r7.mo26030h()     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r3.f23379c     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r7.mo26091b(r10)     // Catch:{ all -> 0x08bd }
            r6.mo25712d(r7)     // Catch:{ all -> 0x08bd }
            r6.mo25721g(r8)     // Catch:{ all -> 0x08bd }
            r6.mo25698a(r8)     // Catch:{ all -> 0x08bd }
            r6.mo25704b(r8)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23372V     // Catch:{ all -> 0x08bd }
            r6.mo25719f(r7)     // Catch:{ all -> 0x08bd }
            long r10 = r3.f23380c0     // Catch:{ all -> 0x08bd }
            r6.mo25708c(r10)     // Catch:{ all -> 0x08bd }
            java.lang.String r7 = r3.f23373W     // Catch:{ all -> 0x08bd }
            r6.mo25722g(r7)     // Catch:{ all -> 0x08bd }
            long r10 = r3.f23374X     // Catch:{ all -> 0x08bd }
            r6.mo25711d(r10)     // Catch:{ all -> 0x08bd }
            long r10 = r3.f23375Y     // Catch:{ all -> 0x08bd }
            r6.mo25715e(r10)     // Catch:{ all -> 0x08bd }
            boolean r7 = r3.f23377a0     // Catch:{ all -> 0x08bd }
            r6.mo25702a(r7)     // Catch:{ all -> 0x08bd }
            long r10 = r3.f23382e0     // Catch:{ all -> 0x08bd }
            r6.mo25741p(r10)     // Catch:{ all -> 0x08bd }
            long r10 = r3.f23390m0     // Catch:{ all -> 0x08bd }
            r6.mo25718f(r10)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r7 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r7.mo25985a(r6)     // Catch:{ all -> 0x08bd }
        L_0x0771:
            java.lang.String r7 = r6.mo25697a()     // Catch:{ all -> 0x08bd }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08bd }
            if (r7 != 0) goto L_0x0782
            java.lang.String r7 = r6.mo25697a()     // Catch:{ all -> 0x08bd }
            r2.mo28991i(r7)     // Catch:{ all -> 0x08bd }
        L_0x0782:
            java.lang.String r7 = r6.mo25703b()     // Catch:{ all -> 0x08bd }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08bd }
            if (r7 != 0) goto L_0x0793
            java.lang.String r6 = r6.mo25703b()     // Catch:{ all -> 0x08bd }
            r2.mo29001l(r6)     // Catch:{ all -> 0x08bd }
        L_0x0793:
            com.google.android.gms.measurement.internal.n9 r6 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            java.lang.String r3 = r3.f23379c     // Catch:{ all -> 0x08bd }
            java.util.List r3 = r6.mo25981a(r3)     // Catch:{ all -> 0x08bd }
            r6 = 0
        L_0x079e:
            int r7 = r3.size()     // Catch:{ all -> 0x08bd }
            if (r6 >= r7) goto L_0x07d3
            g.j.a.a.d.g.x0$a r7 = p163g.p449j.p450a.p451a.p457d.p464g.C11367x0.m36683z()     // Catch:{ all -> 0x08bd }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r10 = (com.google.android.gms.measurement.internal.C10221v8) r10     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r10.f24006c     // Catch:{ all -> 0x08bd }
            r7.mo29139a(r10)     // Catch:{ all -> 0x08bd }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r10 = (com.google.android.gms.measurement.internal.C10221v8) r10     // Catch:{ all -> 0x08bd }
            long r10 = r10.f24007d     // Catch:{ all -> 0x08bd }
            r7.mo29138a(r10)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.u8 r10 = r27.mo25935h()     // Catch:{ all -> 0x08bd }
            java.lang.Object r11 = r3.get(r6)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.v8 r11 = (com.google.android.gms.measurement.internal.C10221v8) r11     // Catch:{ all -> 0x08bd }
            java.lang.Object r11 = r11.f24008e     // Catch:{ all -> 0x08bd }
            r10.mo26120a(r7, r11)     // Catch:{ all -> 0x08bd }
            r2.mo28961a(r7)     // Catch:{ all -> 0x08bd }
            int r6 = r6 + 1
            goto L_0x079e
        L_0x07d3:
            com.google.android.gms.measurement.internal.n9 r3 = r27.mo25937j()     // Catch:{ IOException -> 0x084b }
            g.j.a.a.d.g.p5 r6 = r2.mo28446l0()     // Catch:{ IOException -> 0x084b }
            g.j.a.a.d.g.e4 r6 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r6     // Catch:{ IOException -> 0x084b }
            g.j.a.a.d.g.t0 r6 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r6     // Catch:{ IOException -> 0x084b }
            long r2 = r3.mo25977a(r6)     // Catch:{ IOException -> 0x084b }
            com.google.android.gms.measurement.internal.n9 r6 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i r7 = r4.f23475f     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x0841
            com.google.android.gms.measurement.internal.i r7 = r4.f23475f     // Catch:{ all -> 0x08bd }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x08bd }
        L_0x07f1:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x08bd }
            if (r10 == 0) goto L_0x0809
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x08bd }
            r11 = r26
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x08bd }
            if (r10 == 0) goto L_0x0806
            goto L_0x0842
        L_0x0806:
            r26 = r11
            goto L_0x07f1
        L_0x0809:
            com.google.android.gms.measurement.internal.j4 r7 = r27.mo25938k()     // Catch:{ all -> 0x08bd }
            java.lang.String r10 = r4.f23470a     // Catch:{ all -> 0x08bd }
            java.lang.String r11 = r4.f23471b     // Catch:{ all -> 0x08bd }
            boolean r7 = r7.mo25851c(r10, r11)     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.n9 r10 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            long r11 = r27.m31593w()     // Catch:{ all -> 0x08bd }
            java.lang.String r13 = r4.f23470a     // Catch:{ all -> 0x08bd }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.m9 r10 = r10.mo25979a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x08bd }
            if (r7 == 0) goto L_0x0841
            long r10 = r10.f23765e     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r7 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i9 r7 = r7.mo26031i()     // Catch:{ all -> 0x08bd }
            java.lang.String r12 = r4.f23470a     // Catch:{ all -> 0x08bd }
            int r7 = r7.mo25810a(r12)     // Catch:{ all -> 0x08bd }
            long r12 = (long) r7     // Catch:{ all -> 0x08bd }
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x0841
            goto L_0x0842
        L_0x0841:
            r5 = 0
        L_0x0842:
            boolean r2 = r6.mo25990a(r4, r2, r5)     // Catch:{ all -> 0x08bd }
            if (r2 == 0) goto L_0x0864
            r1.f23745m = r8     // Catch:{ all -> 0x08bd }
            goto L_0x0864
        L_0x084b:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ all -> 0x08bd }
            java.lang.String r6 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo28995j()     // Catch:{ all -> 0x08bd }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r2)     // Catch:{ all -> 0x08bd }
            r5.mo25910a(r6, r2, r3)     // Catch:{ all -> 0x08bd }
        L_0x0864:
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()     // Catch:{ all -> 0x08bd }
            r2.mo26012y()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()     // Catch:{ all -> 0x08bd }
            r3 = 2
            boolean r2 = r2.mo25873a(r3)     // Catch:{ all -> 0x08bd }
            if (r2 == 0) goto L_0x0891
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()     // Catch:{ all -> 0x08bd }
            java.lang.String r3 = "Event recorded"
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x08bd }
            com.google.android.gms.measurement.internal.i3 r5 = r5.mo26021F()     // Catch:{ all -> 0x08bd }
            java.lang.String r4 = r5.mo25793a(r4)     // Catch:{ all -> 0x08bd }
            r2.mo25909a(r3, r4)     // Catch:{ all -> 0x08bd }
        L_0x0891:
            com.google.android.gms.measurement.internal.n9 r2 = r27.mo25937j()
            r2.mo26010w()
            r27.m31595y()
            com.google.android.gms.measurement.internal.o4 r2 = r1.f23741i
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo25909a(r4, r3)
            return
        L_0x08bd:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.n9 r3 = r27.mo25937j()
            r3.mo26010w()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.m31588b(com.google.android.gms.measurement.internal.j, com.google.android.gms.measurement.internal.d9):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31580a(C10191s8 s8Var) {
        this.f23741i.mo25897d().mo25662j();
        C10139n9 n9Var = new C10139n9(this);
        n9Var.mo25967r();
        this.f23735c = n9Var;
        this.f23741i.mo26031i().mo25812a((C10105k9) this.f23733a);
        C10050f9 f9Var = new C10050f9(this);
        f9Var.mo25967r();
        this.f23738f = f9Var;
        C10209u6 u6Var = new C10209u6(this);
        u6Var.mo25967r();
        this.f23740h = u6Var;
        C10082i8 i8Var = new C10082i8(this);
        i8Var.mo25967r();
        this.f23737e = i8Var;
        this.f23736d = new C10176r3(this);
        if (this.f23747o != this.f23748p) {
            this.f23741i.mo25898e().mo25874t().mo25910a("Not all upload components initialized", Integer.valueOf(this.f23747o), Integer.valueOf(this.f23748p));
        }
        this.f23742j = true;
    }

    /* renamed from: a */
    public final C10072h9 mo25894a() {
        return this.f23741i.mo25894a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25921a(C10084j jVar, String str) {
        C10084j jVar2 = jVar;
        String str2 = str;
        C10045f4 b = mo25937j().mo25994b(str2);
        if (b == null || TextUtils.isEmpty(b.mo25730k())) {
            this.f23741i.mo25898e().mo25868A().mo25909a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m31587b(b);
        if (b2 == null) {
            if (!"_ui".equals(jVar2.f23562c)) {
                this.f23741i.mo25898e().mo25877w().mo25909a("Could not find package. appId", C10099k3.m31423a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f23741i.mo25898e().mo25874t().mo25909a("App version does not match; dropping event. appId", C10099k3.m31423a(str));
            return;
        }
        C10028d9 d9Var = r2;
        C10045f4 f4Var = b;
        C10028d9 d9Var2 = new C10028d9(str, b.mo25707c(), b.mo25730k(), b.mo25732l(), b.mo25734m(), b.mo25736n(), b.mo25738o(), (String) null, b.mo25713d(), false, f4Var.mo25703b(), f4Var.mo25692C(), 0, 0, f4Var.mo25693D(), f4Var.mo25694E(), false, f4Var.mo25720g(), f4Var.mo25695F(), f4Var.mo25740p(), f4Var.mo25696G());
        mo25920a(jVar2, d9Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25920a(C10084j jVar, C10028d9 d9Var) {
        List<C10061g9> list;
        List<C10061g9> list2;
        List<C10061g9> list3;
        C10084j jVar2 = jVar;
        C10028d9 d9Var2 = d9Var;
        C9908u.m30853a(d9Var);
        C9908u.m30863b(d9Var2.f23379c);
        m31572C();
        mo25941n();
        String str = d9Var2.f23379c;
        long j = jVar2.f23561W;
        if (mo25935h().mo26122a(jVar2, d9Var2)) {
            if (!d9Var2.f23377a0) {
                m31590e(d9Var2);
                return;
            }
            if (this.f23741i.mo26031i().mo25821e(str, C10106l.f23687w0)) {
                List<String> list4 = d9Var2.f23391n0;
                if (list4 != null) {
                    if (list4.contains(jVar2.f23562c)) {
                        Bundle c = jVar2.f23559U.mo25785c();
                        c.putLong("ga_safelisted", 1);
                        C10084j jVar3 = new C10084j(jVar2.f23562c, new C10073i(c), jVar2.f23560V, jVar2.f23561W);
                        jVar2 = jVar3;
                    } else {
                        this.f23741i.mo25898e().mo25868A().mo25911a("Dropping non-safelisted event. appId, event name, origin", str, jVar2.f23562c, jVar2.f23560V);
                        return;
                    }
                }
            }
            mo25937j().mo26009v();
            try {
                C10139n9 j2 = mo25937j();
                C9908u.m30863b(str);
                j2.mo25662j();
                j2.mo25969t();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    j2.mo25898e().mo25877w().mo25910a("Invalid time querying timed out conditional properties", C10099k3.m31423a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = j2.mo25984a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (C10061g9 g9Var : list) {
                    if (g9Var != null) {
                        this.f23741i.mo25898e().mo25868A().mo25911a("User property timed out", g9Var.f23502c, this.f23741i.mo26021F().mo25797c(g9Var.f23495V.f23959U), g9Var.f23495V.mo26106c());
                        if (g9Var.f23499Z != null) {
                            m31588b(new C10084j(g9Var.f23499Z, j), d9Var2);
                        }
                        mo25937j().mo26003f(str, g9Var.f23495V.f23959U);
                    }
                }
                C10139n9 j3 = mo25937j();
                C9908u.m30863b(str);
                j3.mo25662j();
                j3.mo25969t();
                if (i < 0) {
                    j3.mo25898e().mo25877w().mo25910a("Invalid time querying expired conditional properties", C10099k3.m31423a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = j3.mo25984a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C10061g9 g9Var2 : list2) {
                    if (g9Var2 != null) {
                        this.f23741i.mo25898e().mo25868A().mo25911a("User property expired", g9Var2.f23502c, this.f23741i.mo26021F().mo25797c(g9Var2.f23495V.f23959U), g9Var2.f23495V.mo26106c());
                        mo25937j().mo25998c(str, g9Var2.f23495V.f23959U);
                        if (g9Var2.f23504d0 != null) {
                            arrayList.add(g9Var2.f23504d0);
                        }
                        mo25937j().mo26003f(str, g9Var2.f23495V.f23959U);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m31588b(new C10084j((C10084j) obj, j), d9Var2);
                }
                C10139n9 j4 = mo25937j();
                String str2 = jVar2.f23562c;
                C9908u.m30863b(str);
                C9908u.m30863b(str2);
                j4.mo25662j();
                j4.mo25969t();
                if (i < 0) {
                    j4.mo25898e().mo25877w().mo25911a("Invalid time querying triggered conditional properties", C10099k3.m31423a(str), j4.mo25902l().mo25795a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = j4.mo25984a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C10061g9 g9Var3 : list3) {
                    if (g9Var3 != null) {
                        C10201t8 t8Var = g9Var3.f23495V;
                        C10221v8 v8Var = r4;
                        C10221v8 v8Var2 = new C10221v8(g9Var3.f23502c, g9Var3.f23494U, t8Var.f23959U, j, t8Var.mo26106c());
                        if (mo25937j().mo25991a(v8Var)) {
                            this.f23741i.mo25898e().mo25868A().mo25911a("User property triggered", g9Var3.f23502c, this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                        } else {
                            this.f23741i.mo25898e().mo25874t().mo25911a("Too many active user properties, ignoring", C10099k3.m31423a(g9Var3.f23502c), this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                        }
                        if (g9Var3.f23501b0 != null) {
                            arrayList2.add(g9Var3.f23501b0);
                        }
                        g9Var3.f23495V = new C10201t8(v8Var);
                        g9Var3.f23497X = true;
                        mo25937j().mo25989a(g9Var3);
                    }
                }
                m31588b(jVar2, d9Var2);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    m31588b(new C10084j((C10084j) obj2, j), d9Var2);
                }
                mo25937j().mo26012y();
            } finally {
                mo25937j().mo26010w();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r6 = r1;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0266, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0267, code lost:
        r5 = r3;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r5 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c4d, code lost:
        if (r26 != r14) goto L_0x0c4f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v50 android.database.Cursor) = (r3v45 android.database.Cursor), (r3v45 android.database.Cursor), (r3v45 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v53 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:45:0x00d8, B:51:0x00e5, B:52:?, B:23:0x007b, B:29:0x0088, B:31:0x008c, B:32:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0289 A[SYNTHETIC, Splitter:B:153:0x0289] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0290 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x029e A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03cf A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03da A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03db A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05e1 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x060e A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x06aa A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0752 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0768 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0782 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0aa9 A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0abc A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0abf A[Catch:{ IOException -> 0x0231, all -> 0x0f02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ae6 A[SYNTHETIC, Splitter:B:451:0x0ae6] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0b96 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0b98 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0ba0 A[SYNTHETIC, Splitter:B:470:0x0ba0] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0bce A[SYNTHETIC, Splitter:B:481:0x0bce] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0c6b A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0cb3 A[Catch:{ all -> 0x0ee0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0ee4  */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0efc A[SYNTHETIC, Splitter:B:604:0x0efc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m31586a(java.lang.String r63, long r64) {
        /*
            r62 = this;
            r1 = r62
            com.google.android.gms.measurement.internal.n9 r2 = r62.mo25937j()
            r2.mo26009v()
            com.google.android.gms.measurement.internal.m8$a r2 = new com.google.android.gms.measurement.internal.m8$a     // Catch:{ all -> 0x0f02 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.n9 r4 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            long r5 = r1.f23756x     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.common.internal.C9908u.m30853a(r2)     // Catch:{ all -> 0x0f02 }
            r4.mo25662j()     // Catch:{ all -> 0x0f02 }
            r4.mo25969t()     // Catch:{ all -> 0x0f02 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo26011x()     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            if (r13 == 0) goto L_0x009b
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004c
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r16 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r14[r11] = r16     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r16 = java.lang.String.valueOf(r64)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r14[r12] = r16     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r0 = move-exception
            r6 = r1
            r22 = r3
            goto L_0x026f
        L_0x0046:
            r0 = move-exception
            r5 = r3
            r7 = r5
        L_0x0049:
            r3 = r0
            goto L_0x0276
        L_0x004c:
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r16 = java.lang.String.valueOf(r64)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r14[r11] = r16     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
        L_0x0054:
            if (r13 == 0) goto L_0x0059
            java.lang.String r13 = "rowid <= ? and "
            goto L_0x005b
        L_0x0059:
            java.lang.String r13 = ""
        L_0x005b:
            int r7 = r13.length()     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r3.append(r13)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            android.database.Cursor r3 = r15.rawQuery(r3, r14)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0040 }
            if (r7 != 0) goto L_0x0088
            if (r3 == 0) goto L_0x028c
            r3.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x0088:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0098, all -> 0x0040 }
            r23 = r3
            r3 = r7
            r7 = r13
            goto L_0x00f0
        L_0x0098:
            r0 = move-exception
            r5 = r3
            goto L_0x0049
        L_0x009b:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00ac
            java.lang.String[] r7 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r13 = 0
            r7[r11] = r13     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r13 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r7[r12] = r13     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r13 = r7
            goto L_0x00b1
        L_0x00ac:
            r7 = 0
            java.lang.String[] r13 = new java.lang.String[]{r7}     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
        L_0x00b1:
            if (r3 == 0) goto L_0x00b6
            java.lang.String r3 = " and rowid <= ?"
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r3 = ""
        L_0x00b8:
            int r7 = r3.length()     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            int r7 = r7 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r14.<init>(r7)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            r14.append(r3)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r3 = " order by rowid limit 1;"
            r14.append(r3)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            java.lang.String r3 = r14.toString()     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0272, all -> 0x026b }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0040 }
            if (r7 != 0) goto L_0x00e5
            if (r3 == 0) goto L_0x028c
            r3.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x00e5:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0040 }
            r23 = r3
            r7 = r13
            r3 = 0
        L_0x00f0:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0260, all -> 0x025b }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0260, all -> 0x025b }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x0260, all -> 0x025b }
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x0260, all -> 0x025b }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r24 = r13
            r13 = r15
            r25 = r15
            r15 = r16
            r16 = r17
            r17 = r24
            android.database.Cursor r15 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0260, all -> 0x025b }
            boolean r13 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            if (r13 != 0) goto L_0x0140
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r5.mo25909a(r6, r7)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r15 == 0) goto L_0x028c
            r15.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x0135:
            r0 = move-exception
            r6 = r1
            r22 = r15
            goto L_0x026f
        L_0x013b:
            r0 = move-exception
            r7 = r3
            r5 = r15
            goto L_0x0049
        L_0x0140:
            byte[] r13 = r15.getBlob(r11)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            g.j.a.a.d.g.r3 r14 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x0231 }
            g.j.a.a.d.g.t0 r13 = p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.m36139a(r13, r14)     // Catch:{ IOException -> 0x0231 }
            boolean r14 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            if (r14 == 0) goto L_0x0163
            com.google.android.gms.measurement.internal.k3 r14 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            com.google.android.gms.measurement.internal.m3 r14 = r14.mo25877w()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r10 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r14.mo25909a(r10, r12)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
        L_0x0163:
            r15.close()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r2.mo25948a(r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0183
            java.lang.String r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r12 = 1
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r6 = 2
            r13[r6] = r5     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r16 = r10
            r17 = r13
            goto L_0x0191
        L_0x0183:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            r6 = 2
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r10[r11] = r3     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r6 = 1
            r10[r6] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r16 = r5
            r17 = r10
        L_0x0191:
            java.lang.String r14 = "raw_events"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r7 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r10}     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r25
            r6 = r15
            r15 = r5
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x024d, all -> 0x024b }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            if (r6 != 0) goto L_0x01cd
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo25877w()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r3)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r6.mo25909a(r7, r10)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            if (r5 == 0) goto L_0x028c
            r5.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x01cd:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r10 = 3
            byte[] r12 = r5.getBlob(r10)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            g.j.a.a.d.g.p0$a r10 = p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.m35894x()     // Catch:{ IOException -> 0x0208 }
            g.j.a.a.d.g.r3 r13 = p163g.p449j.p450a.p451a.p457d.p464g.C11285r3.m36044d()     // Catch:{ IOException -> 0x0208 }
            r10.mo28728a(r12, r13)     // Catch:{ IOException -> 0x0208 }
            g.j.a.a.d.g.p0$a r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a) r10     // Catch:{ IOException -> 0x0208 }
            r12 = 1
            java.lang.String r13 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r10.mo28812a(r13)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r12 = 2
            long r13 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r10.mo28809a(r13)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            g.j.a.a.d.g.p5 r10 = r10.mo28446l0()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            g.j.a.a.d.g.e4 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r10     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            g.j.a.a.d.g.p0 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r10     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            boolean r6 = r2.mo25949a(r6, r10)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            if (r6 != 0) goto L_0x021b
            if (r5 == 0) goto L_0x028c
            r5.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x0208:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.k3 r7 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r3)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            r7.mo25910a(r10, r12, r6)     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
        L_0x021b:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022d, all -> 0x0228 }
            if (r6 != 0) goto L_0x01cd
            if (r5 == 0) goto L_0x028c
            r5.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x0228:
            r0 = move-exception
            r6 = r1
            r22 = r5
            goto L_0x026f
        L_0x022d:
            r0 = move-exception
            r7 = r3
            goto L_0x0049
        L_0x0231:
            r0 = move-exception
            r6 = r15
            r5 = r0
            com.google.android.gms.measurement.internal.k3 r7 = r4.mo25898e()     // Catch:{ SQLiteException -> 0x024d, all -> 0x024b }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()     // Catch:{ SQLiteException -> 0x024d, all -> 0x024b }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r3)     // Catch:{ SQLiteException -> 0x024d, all -> 0x024b }
            r7.mo25910a(r10, r12, r5)     // Catch:{ SQLiteException -> 0x024d, all -> 0x024b }
            if (r6 == 0) goto L_0x028c
            r6.close()     // Catch:{ all -> 0x0f02 }
            goto L_0x028c
        L_0x024b:
            r0 = move-exception
            goto L_0x0251
        L_0x024d:
            r0 = move-exception
            goto L_0x0257
        L_0x024f:
            r0 = move-exception
            r6 = r15
        L_0x0251:
            r22 = r6
            r6 = r1
            goto L_0x026f
        L_0x0255:
            r0 = move-exception
            r6 = r15
        L_0x0257:
            r7 = r3
            r5 = r6
            goto L_0x0049
        L_0x025b:
            r0 = move-exception
            r6 = r1
            r22 = r23
            goto L_0x026f
        L_0x0260:
            r0 = move-exception
            r7 = r3
            r5 = r23
            goto L_0x0049
        L_0x0266:
            r0 = move-exception
            r5 = r3
            r7 = 0
            goto L_0x0049
        L_0x026b:
            r0 = move-exception
            r6 = r1
            r22 = 0
        L_0x026f:
            r1 = r0
            goto L_0x0efa
        L_0x0272:
            r0 = move-exception
            r3 = r0
            r5 = 0
            r7 = 0
        L_0x0276:
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0ef5 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ all -> 0x0ef5 }
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x0ef5 }
            r4.mo25910a(r6, r7, r3)     // Catch:{ all -> 0x0ef5 }
            if (r5 == 0) goto L_0x028c
            r5.close()     // Catch:{ all -> 0x0f02 }
        L_0x028c:
            java.util.List<g.j.a.a.d.g.p0> r3 = r2.f23759c     // Catch:{ all -> 0x0f02 }
            if (r3 == 0) goto L_0x029b
            java.util.List<g.j.a.a.d.g.p0> r3 = r2.f23759c     // Catch:{ all -> 0x0f02 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0f02 }
            if (r3 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r3 = 0
            goto L_0x029c
        L_0x029b:
            r3 = 1
        L_0x029c:
            if (r3 != 0) goto L_0x0ee4
            g.j.a.a.d.g.t0 r3 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r3 = r3.mo28436j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0$a r3 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.C11311a) r3     // Catch:{ all -> 0x0f02 }
            r3.mo29002m()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r5 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r5.mo28944r()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C10106l.f23659i0     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25821e(r5, r6)     // Catch:{ all -> 0x0f02 }
            r7 = 0
            r8 = -1
            r9 = -1
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
        L_0x02c6:
            java.util.List<g.j.a.a.d.g.p0> r11 = r2.f23759c     // Catch:{ all -> 0x0f02 }
            int r11 = r11.size()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = "_et"
            java.lang.String r6 = "_e"
            r21 = r12
            r26 = r13
            if (r7 >= r11) goto L_0x07d5
            java.util.List<g.j.a.a.d.g.p0> r11 = r2.f23759c     // Catch:{ all -> 0x0f02 }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r11     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r11 = r11.mo28436j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0$a r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a) r11     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.j4 r14 = r62.mo25938k()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r10 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r10 = r10.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r10 = r14.mo25849b(r10, r12)     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L_0x0376
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            g.j.a.a.d.g.t0 r10 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r10 = r10.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r10)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r13 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i3 r13 = r13.mo26021F()     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r13 = r13.mo25795a(r14)     // Catch:{ all -> 0x0f02 }
            r5.mo25910a(r6, r10, r13)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.j4 r5 = r62.mo25938k()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r6 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo28944r()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo25856g(r6)     // Catch:{ all -> 0x0f02 }
            if (r5 != 0) goto L_0x0344
            com.google.android.gms.measurement.internal.j4 r5 = r62.mo25938k()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r6 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo28944r()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo25857h(r6)     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r5 = 0
            goto L_0x0345
        L_0x0344:
            r5 = 1
        L_0x0345:
            if (r5 != 0) goto L_0x036a
            java.lang.String r5 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0f02 }
            if (r5 != 0) goto L_0x036a
            com.google.android.gms.measurement.internal.o4 r5 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y8 r28 = r5.mo26022G()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r5 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r29 = r5.mo28944r()     // Catch:{ all -> 0x0f02 }
            r30 = 11
            java.lang.String r31 = "_ev"
            java.lang.String r32 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            r33 = 0
            r28.mo26229a(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0f02 }
        L_0x036a:
            r31 = r4
            r6 = r9
            r12 = r21
            r13 = r26
            r5 = -1
            r10 = 3
            r9 = r7
            goto L_0x07ce
        L_0x0376:
            com.google.android.gms.measurement.internal.j4 r10 = r62.mo25938k()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r13 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r13 = r13.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r10 = r10.mo25851c(r13, r14)     // Catch:{ all -> 0x0f02 }
            java.lang.String r13 = "_c"
            if (r10 != 0) goto L_0x03e5
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.common.internal.C9908u.m30863b(r14)     // Catch:{ all -> 0x0f02 }
            r25 = r15
            int r15 = r14.hashCode()     // Catch:{ all -> 0x0f02 }
            r30 = r7
            r7 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r7) goto L_0x03c2
            r7 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r7) goto L_0x03b8
            r7 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r7) goto L_0x03ae
            goto L_0x03cc
        L_0x03ae:
            java.lang.String r7 = "_ui"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f02 }
            if (r7 == 0) goto L_0x03cc
            r7 = 1
            goto L_0x03cd
        L_0x03b8:
            java.lang.String r7 = "_ug"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f02 }
            if (r7 == 0) goto L_0x03cc
            r7 = 2
            goto L_0x03cd
        L_0x03c2:
            java.lang.String r7 = "_in"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f02 }
            if (r7 == 0) goto L_0x03cc
            r7 = 0
            goto L_0x03cd
        L_0x03cc:
            r7 = -1
        L_0x03cd:
            if (r7 == 0) goto L_0x03d7
            r14 = 1
            if (r7 == r14) goto L_0x03d7
            r14 = 2
            if (r7 == r14) goto L_0x03d7
            r7 = 0
            goto L_0x03d8
        L_0x03d7:
            r7 = 1
        L_0x03d8:
            if (r7 == 0) goto L_0x03db
            goto L_0x03e9
        L_0x03db:
            r31 = r4
            r7 = r5
            r32 = r8
            r33 = r9
            r9 = r6
            goto L_0x05bb
        L_0x03e5:
            r30 = r7
            r25 = r15
        L_0x03e9:
            r31 = r4
            r7 = 0
            r14 = 0
            r15 = 0
        L_0x03ee:
            int r4 = r11.mo28819l()     // Catch:{ all -> 0x0f02 }
            r32 = r8
            java.lang.String r8 = "_r"
            if (r7 >= r4) goto L_0x0456
            g.j.a.a.d.g.r0 r4 = r11.mo28813a(r7)     // Catch:{ all -> 0x0f02 }
            java.lang.String r4 = r4.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r13.equals(r4)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0424
            g.j.a.a.d.g.r0 r4 = r11.mo28813a(r7)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r4 = r4.mo28436j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a) r4     // Catch:{ all -> 0x0f02 }
            r33 = r9
            r8 = 1
            r4.mo28857a(r8)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r4.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r4     // Catch:{ all -> 0x0f02 }
            r11.mo28808a(r7, r4)     // Catch:{ all -> 0x0f02 }
            r14 = 1
            goto L_0x044f
        L_0x0424:
            r33 = r9
            g.j.a.a.d.g.r0 r4 = r11.mo28813a(r7)     // Catch:{ all -> 0x0f02 }
            java.lang.String r4 = r4.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x044f
            g.j.a.a.d.g.r0 r4 = r11.mo28813a(r7)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r4 = r4.mo28436j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a) r4     // Catch:{ all -> 0x0f02 }
            r8 = 1
            r4.mo28857a(r8)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r4.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r4     // Catch:{ all -> 0x0f02 }
            r11.mo28808a(r7, r4)     // Catch:{ all -> 0x0f02 }
            r15 = 1
        L_0x044f:
            int r7 = r7 + 1
            r8 = r32
            r9 = r33
            goto L_0x03ee
        L_0x0456:
            r33 = r9
            if (r14 != 0) goto L_0x048b
            if (r10 == 0) goto L_0x048b
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25869B()     // Catch:{ all -> 0x0f02 }
            java.lang.String r7 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i3 r9 = r9.mo26021F()     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r9 = r9.mo25795a(r14)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r7, r9)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.m35991x()     // Catch:{ all -> 0x0f02 }
            r4.mo28858a(r13)     // Catch:{ all -> 0x0f02 }
            r7 = r5
            r9 = r6
            r5 = 1
            r4.mo28857a(r5)     // Catch:{ all -> 0x0f02 }
            r11.mo28810a(r4)     // Catch:{ all -> 0x0f02 }
            goto L_0x048d
        L_0x048b:
            r7 = r5
            r9 = r6
        L_0x048d:
            if (r15 != 0) goto L_0x04bb
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25869B()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i3 r6 = r6.mo26021F()     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo25795a(r14)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r5, r6)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.m35991x()     // Catch:{ all -> 0x0f02 }
            r4.mo28858a(r8)     // Catch:{ all -> 0x0f02 }
            r5 = 1
            r4.mo28857a(r5)     // Catch:{ all -> 0x0f02 }
            r11.mo28810a(r4)     // Catch:{ all -> 0x0f02 }
        L_0x04bb:
            com.google.android.gms.measurement.internal.n9 r34 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            long r35 = r62.m31593w()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r4 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r37 = r4.mo28944r()     // Catch:{ all -> 0x0f02 }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            com.google.android.gms.measurement.internal.m9 r4 = r34.mo25979a(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f02 }
            long r4 = r4.f23765e     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r14 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r14 = r14.mo28944r()     // Catch:{ all -> 0x0f02 }
            int r6 = r6.mo25810a(r14)     // Catch:{ all -> 0x0f02 }
            long r14 = (long) r6     // Catch:{ all -> 0x0f02 }
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x04f2
            m31582a(r11, r8)     // Catch:{ all -> 0x0f02 }
            goto L_0x04f4
        L_0x04f2:
            r21 = 1
        L_0x04f4:
            java.lang.String r4 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r4 = com.google.android.gms.measurement.internal.C10251y8.m31984e(r4)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x05bb
            if (r10 == 0) goto L_0x05bb
            com.google.android.gms.measurement.internal.n9 r34 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            long r35 = r62.m31593w()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r4 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r37 = r4.mo28944r()     // Catch:{ all -> 0x0f02 }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            com.google.android.gms.measurement.internal.m9 r4 = r34.mo25979a(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f02 }
            long r4 = r4.f23763c     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r8 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r8 = r8.mo28944r()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C10106l.f23678s     // Catch:{ all -> 0x0f02 }
            int r6 = r6.mo25814b(r8, r14)     // Catch:{ all -> 0x0f02 }
            long r14 = (long) r6     // Catch:{ all -> 0x0f02 }
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x05bb
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            g.j.a.a.d.g.t0 r6 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r6)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r5, r6)     // Catch:{ all -> 0x0f02 }
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = -1
        L_0x0552:
            int r14 = r11.mo28819l()     // Catch:{ all -> 0x0f02 }
            if (r4 >= r14) goto L_0x057c
            g.j.a.a.d.g.r0 r14 = r11.mo28813a(r4)     // Catch:{ all -> 0x0f02 }
            java.lang.String r15 = r14.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r15 = r13.equals(r15)     // Catch:{ all -> 0x0f02 }
            if (r15 == 0) goto L_0x056e
            g.j.a.a.d.g.e4$a r6 = r14.mo28436j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r6 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a) r6     // Catch:{ all -> 0x0f02 }
            r8 = r4
            goto L_0x0579
        L_0x056e:
            java.lang.String r14 = r14.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r14 = r12.equals(r14)     // Catch:{ all -> 0x0f02 }
            if (r14 == 0) goto L_0x0579
            r5 = 1
        L_0x0579:
            int r4 = r4 + 1
            goto L_0x0552
        L_0x057c:
            if (r5 == 0) goto L_0x0584
            if (r6 == 0) goto L_0x0584
            r11.mo28814b(r8)     // Catch:{ all -> 0x0f02 }
            goto L_0x05bb
        L_0x0584:
            if (r6 == 0) goto L_0x05a2
            java.lang.Object r4 = r6.clone()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a) r4     // Catch:{ all -> 0x0f02 }
            r4.mo28858a(r12)     // Catch:{ all -> 0x0f02 }
            r5 = 10
            r4.mo28857a(r5)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r4.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r4     // Catch:{ all -> 0x0f02 }
            r11.mo28808a(r8, r4)     // Catch:{ all -> 0x0f02 }
            goto L_0x05bb
        L_0x05a2:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            g.j.a.a.d.g.t0 r6 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r6)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r5, r6)     // Catch:{ all -> 0x0f02 }
        L_0x05bb:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r5 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r5.mo28944r()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25827k(r5)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0694
            if (r10 == 0) goto L_0x0694
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0f02 }
            java.util.List r5 = r11.mo28818k()     // Catch:{ all -> 0x0f02 }
            r4.<init>(r5)     // Catch:{ all -> 0x0f02 }
            r5 = 0
            r6 = -1
            r8 = -1
        L_0x05db:
            int r10 = r4.size()     // Catch:{ all -> 0x0f02 }
            if (r5 >= r10) goto L_0x060b
            java.lang.String r10 = "value"
            java.lang.Object r12 = r4.get(r5)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r12 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r12     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = r12.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f02 }
            if (r10 == 0) goto L_0x05f5
            r6 = r5
            goto L_0x0608
        L_0x05f5:
            java.lang.String r10 = "currency"
            java.lang.Object r12 = r4.get(r5)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r12 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r12     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = r12.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f02 }
            if (r10 == 0) goto L_0x0608
            r8 = r5
        L_0x0608:
            int r5 = r5 + 1
            goto L_0x05db
        L_0x060b:
            r5 = -1
            if (r6 == r5) goto L_0x0695
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r5     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo28852q()     // Catch:{ all -> 0x0f02 }
            if (r5 != 0) goto L_0x0643
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r5     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo28854s()     // Catch:{ all -> 0x0f02 }
            if (r5 != 0) goto L_0x0643
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25879y()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r4.mo25908a(r5)     // Catch:{ all -> 0x0f02 }
            r11.mo28814b(r6)     // Catch:{ all -> 0x0f02 }
            m31582a(r11, r13)     // Catch:{ all -> 0x0f02 }
            r4 = 18
            java.lang.String r5 = "value"
            m31581a(r11, r4, r5)     // Catch:{ all -> 0x0f02 }
            goto L_0x0694
        L_0x0643:
            r5 = -1
            if (r8 != r5) goto L_0x0649
            r4 = 1
            r10 = 3
            goto L_0x0675
        L_0x0649:
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r4     // Catch:{ all -> 0x0f02 }
            java.lang.String r4 = r4.mo28851p()     // Catch:{ all -> 0x0f02 }
            int r8 = r4.length()     // Catch:{ all -> 0x0f02 }
            r10 = 3
            if (r8 == r10) goto L_0x065c
        L_0x065a:
            r4 = 1
            goto L_0x0675
        L_0x065c:
            r8 = 0
        L_0x065d:
            int r12 = r4.length()     // Catch:{ all -> 0x0f02 }
            if (r8 >= r12) goto L_0x0674
            int r12 = r4.codePointAt(r8)     // Catch:{ all -> 0x0f02 }
            boolean r14 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0f02 }
            if (r14 != 0) goto L_0x066e
            goto L_0x065a
        L_0x066e:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0f02 }
            int r8 = r8 + r12
            goto L_0x065d
        L_0x0674:
            r4 = 0
        L_0x0675:
            if (r4 == 0) goto L_0x0696
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25879y()     // Catch:{ all -> 0x0f02 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r4.mo25908a(r8)     // Catch:{ all -> 0x0f02 }
            r11.mo28814b(r6)     // Catch:{ all -> 0x0f02 }
            m31582a(r11, r13)     // Catch:{ all -> 0x0f02 }
            r4 = 19
            java.lang.String r6 = "currency"
            m31581a(r11, r4, r6)     // Catch:{ all -> 0x0f02 }
            goto L_0x0696
        L_0x0694:
            r5 = -1
        L_0x0695:
            r10 = 3
        L_0x0696:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r6 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r6.mo28944r()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C10106l.f23657h0     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25821e(r6, r8)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0752
            java.lang.String r4 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0700
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r11.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r4     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "_fr"
            g.j.a.a.d.g.r0 r4 = com.google.android.gms.measurement.internal.C10211u8.m31848a(r4, r6)     // Catch:{ all -> 0x0f02 }
            if (r4 != 0) goto L_0x06fd
            if (r19 == 0) goto L_0x06f6
            long r12 = r19.mo28817j()     // Catch:{ all -> 0x0f02 }
            long r14 = r11.mo28817j()     // Catch:{ all -> 0x0f02 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f02 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x06f6
            java.lang.Object r4 = r19.clone()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a) r4     // Catch:{ all -> 0x0f02 }
            boolean r6 = r1.m31585a(r11, r4)     // Catch:{ all -> 0x0f02 }
            if (r6 == 0) goto L_0x06f6
            r6 = r33
            r3.mo28957a(r6, r4)     // Catch:{ all -> 0x0f02 }
            r8 = r32
        L_0x06f1:
            r18 = 0
            r19 = 0
            goto L_0x0756
        L_0x06f6:
            r6 = r33
            r18 = r11
            r8 = r25
            goto L_0x0756
        L_0x06fd:
            r6 = r33
            goto L_0x074f
        L_0x0700:
            r6 = r33
            java.lang.String r4 = "_vs"
            java.lang.String r8 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x074f
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r11.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r4 = com.google.android.gms.measurement.internal.C10211u8.m31848a(r4, r7)     // Catch:{ all -> 0x0f02 }
            if (r4 != 0) goto L_0x074f
            if (r18 == 0) goto L_0x0748
            long r12 = r18.mo28817j()     // Catch:{ all -> 0x0f02 }
            long r14 = r11.mo28817j()     // Catch:{ all -> 0x0f02 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f02 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0748
            java.lang.Object r4 = r18.clone()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0$a r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a) r4     // Catch:{ all -> 0x0f02 }
            boolean r8 = r1.m31585a(r4, r11)     // Catch:{ all -> 0x0f02 }
            if (r8 == 0) goto L_0x0748
            r8 = r32
            r3.mo28957a(r8, r4)     // Catch:{ all -> 0x0f02 }
            goto L_0x06f1
        L_0x0748:
            r8 = r32
            r19 = r11
            r6 = r25
            goto L_0x0756
        L_0x074f:
            r8 = r32
            goto L_0x0756
        L_0x0752:
            r8 = r32
            r6 = r33
        L_0x0756:
            if (r31 != 0) goto L_0x07b6
            java.lang.String r4 = r11.mo28816i()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x07b6
            int r4 = r11.mo28819l()     // Catch:{ all -> 0x0f02 }
            if (r4 != 0) goto L_0x0782
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r7 = "Engagement event does not contain any parameters. appId"
            g.j.a.a.d.g.t0 r9 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r9 = r9.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r9)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r7, r9)     // Catch:{ all -> 0x0f02 }
            goto L_0x07b6
        L_0x0782:
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r11.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r4     // Catch:{ all -> 0x0f02 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r4, r7)     // Catch:{ all -> 0x0f02 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0f02 }
            if (r4 != 0) goto L_0x07af
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r7 = "Engagement event does not include duration. appId"
            g.j.a.a.d.g.t0 r9 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r9 = r9.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r9)     // Catch:{ all -> 0x0f02 }
            r4.mo25909a(r7, r9)     // Catch:{ all -> 0x0f02 }
            goto L_0x07b6
        L_0x07af:
            long r12 = r4.longValue()     // Catch:{ all -> 0x0f02 }
            long r13 = r26 + r12
            goto L_0x07b8
        L_0x07b6:
            r13 = r26
        L_0x07b8:
            java.util.List<g.j.a.a.d.g.p0> r4 = r2.f23759c     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r7 = r11.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r7 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r7     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r7 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r7     // Catch:{ all -> 0x0f02 }
            r9 = r30
            r4.set(r9, r7)     // Catch:{ all -> 0x0f02 }
            int r15 = r25 + 1
            r3.mo28960a(r11)     // Catch:{ all -> 0x0f02 }
            r12 = r21
        L_0x07ce:
            int r7 = r9 + 1
            r9 = r6
            r4 = r31
            goto L_0x02c6
        L_0x07d5:
            r31 = r4
            r7 = r5
            r9 = r6
            r25 = r15
            if (r31 == 0) goto L_0x0832
            r5 = r25
            r13 = r26
            r4 = 0
        L_0x07e2:
            if (r4 >= r5) goto L_0x0834
            g.j.a.a.d.g.p0 r6 = r3.mo28966b(r4)     // Catch:{ all -> 0x0f02 }
            java.lang.String r8 = r6.mo28799o()     // Catch:{ all -> 0x0f02 }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0f02 }
            if (r8 == 0) goto L_0x0805
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            java.lang.String r8 = "_fr"
            g.j.a.a.d.g.r0 r8 = com.google.android.gms.measurement.internal.C10211u8.m31848a(r6, r8)     // Catch:{ all -> 0x0f02 }
            if (r8 == 0) goto L_0x0805
            r3.mo28971c(r4)     // Catch:{ all -> 0x0f02 }
            int r5 = r5 + -1
            int r4 = r4 + -1
            goto L_0x082f
        L_0x0805:
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r6 = com.google.android.gms.measurement.internal.C10211u8.m31848a(r6, r7)     // Catch:{ all -> 0x0f02 }
            if (r6 == 0) goto L_0x082f
            boolean r8 = r6.mo28852q()     // Catch:{ all -> 0x0f02 }
            if (r8 == 0) goto L_0x081d
            long r10 = r6.mo28853r()     // Catch:{ all -> 0x0f02 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0f02 }
            goto L_0x081e
        L_0x081d:
            r6 = 0
        L_0x081e:
            if (r6 == 0) goto L_0x082f
            long r10 = r6.longValue()     // Catch:{ all -> 0x0f02 }
            r18 = 0
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x082f
            long r10 = r6.longValue()     // Catch:{ all -> 0x0f02 }
            long r13 = r13 + r10
        L_0x082f:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x07e2
        L_0x0832:
            r13 = r26
        L_0x0834:
            r4 = 0
            r1.m31583a(r3, r13, r4)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C10106l.f23693z0     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25821e(r5, r6)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0881
            java.util.List r4 = r3.mo28998k()     // Catch:{ all -> 0x0f02 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0f02 }
        L_0x0852:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x086c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r5     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "_s"
            java.lang.String r5 = r5.mo28799o()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0852
            r4 = 1
            goto L_0x086d
        L_0x086c:
            r4 = 0
        L_0x086d:
            if (r4 == 0) goto L_0x087c
            com.google.android.gms.measurement.internal.n9 r4 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "_se"
            r4.mo25998c(r5, r6)     // Catch:{ all -> 0x0f02 }
        L_0x087c:
            r4 = 1
            r1.m31583a(r3, r13, r4)     // Catch:{ all -> 0x0f02 }
            goto L_0x08a0
        L_0x0881:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C10106l.f23611A0     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25821e(r5, r6)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x08a0
            com.google.android.gms.measurement.internal.n9 r4 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "_se"
            r4.mo25998c(r5, r6)     // Catch:{ all -> 0x0f02 }
        L_0x08a0:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C10106l.f23661j0     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25821e(r5, r6)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0942
            com.google.android.gms.measurement.internal.u8 r4 = r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25869B()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r5.mo25908a(r6)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.j4 r5 = r4.mo25891q()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo25854e(r6)     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0942
            com.google.android.gms.measurement.internal.n9 r5 = r4.mo25890p()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.f4 r5 = r5.mo25994b(r6)     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0942
            boolean r5 = r5.mo25693D()     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0942
            com.google.android.gms.measurement.internal.d r5 = r4.mo25901k()     // Catch:{ all -> 0x0f02 }
            boolean r5 = r5.mo25660x()     // Catch:{ all -> 0x0f02 }
            if (r5 == 0) goto L_0x0942
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25868A()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r5.mo25908a(r6)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.x0$a r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11367x0.m36683z()     // Catch:{ all -> 0x0f02 }
            java.lang.String r6 = "_npa"
            r5.mo29139a(r6)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo25901k()     // Catch:{ all -> 0x0f02 }
            long r6 = r4.mo25658v()     // Catch:{ all -> 0x0f02 }
            r5.mo29138a(r6)     // Catch:{ all -> 0x0f02 }
            r6 = 1
            r5.mo29140b(r6)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r4 = r5.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r4     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.x0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11367x0) r4     // Catch:{ all -> 0x0f02 }
            r5 = 0
        L_0x091e:
            int r6 = r3.mo29006o()     // Catch:{ all -> 0x0f02 }
            if (r5 >= r6) goto L_0x093c
            java.lang.String r6 = "_npa"
            g.j.a.a.d.g.x0 r7 = r3.mo28977d(r5)     // Catch:{ all -> 0x0f02 }
            java.lang.String r7 = r7.mo29128n()     // Catch:{ all -> 0x0f02 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0f02 }
            if (r6 == 0) goto L_0x0939
            r3.mo28958a(r5, r4)     // Catch:{ all -> 0x0f02 }
            r5 = 1
            goto L_0x093d
        L_0x0939:
            int r5 = r5 + 1
            goto L_0x091e
        L_0x093c:
            r5 = 0
        L_0x093d:
            if (r5 != 0) goto L_0x0942
            r3.mo28962a(r4)     // Catch:{ all -> 0x0f02 }
        L_0x0942:
            r3.mo29013u()     // Catch:{ all -> 0x0f02 }
            java.lang.String r4 = r3.mo28995j()     // Catch:{ all -> 0x0f02 }
            java.util.List r5 = r3.mo29005n()     // Catch:{ all -> 0x0f02 }
            java.util.List r6 = r3.mo28998k()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.common.internal.C9908u.m30863b(r4)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.f9 r7 = r62.mo25936i()     // Catch:{ all -> 0x0f02 }
            java.util.List r4 = r7.mo25759a(r4, r6, r5)     // Catch:{ all -> 0x0f02 }
            r3.mo28968b(r4)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r4 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r5 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r5 = r5.mo28944r()     // Catch:{ all -> 0x0f02 }
            boolean r4 = r4.mo25820e(r5)     // Catch:{ all -> 0x0f02 }
            if (r4 == 0) goto L_0x0d0d
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0ee0 }
            r4.<init>()     // Catch:{ all -> 0x0ee0 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0ee0 }
            r5.<init>()     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.y8 r6 = r6.mo26022G()     // Catch:{ all -> 0x0ee0 }
            java.security.SecureRandom r6 = r6.mo26241u()     // Catch:{ all -> 0x0ee0 }
            r7 = 0
        L_0x0986:
            int r8 = r3.mo28999l()     // Catch:{ all -> 0x0ee0 }
            if (r7 >= r8) goto L_0x0cd9
            g.j.a.a.d.g.p0 r8 = r3.mo28966b(r7)     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.e4$a r8 = r8.mo28436j()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p0$a r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a) r8     // Catch:{ all -> 0x0ee0 }
            java.lang.String r9 = r8.mo28816i()     // Catch:{ all -> 0x0ee0 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0ee0 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0a19
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r9 = r8.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r9     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r9     // Catch:{ all -> 0x0f02 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r9, r11)     // Catch:{ all -> 0x0f02 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f02 }
            java.lang.Object r11 = r4.get(r9)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.f r11 = (com.google.android.gms.measurement.internal.C10040f) r11     // Catch:{ all -> 0x0f02 }
            if (r11 != 0) goto L_0x09d0
            com.google.android.gms.measurement.internal.n9 r11 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r12 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = r12.mo28944r()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.f r11 = r11.mo25995b(r12, r9)     // Catch:{ all -> 0x0f02 }
            r4.put(r9, r11)     // Catch:{ all -> 0x0f02 }
        L_0x09d0:
            java.lang.Long r9 = r11.f23421i     // Catch:{ all -> 0x0f02 }
            if (r9 != 0) goto L_0x0a0d
            java.lang.Long r9 = r11.f23422j     // Catch:{ all -> 0x0f02 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0f02 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x09e8
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            java.lang.Long r9 = r11.f23422j     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.C10211u8.m31851a(r8, r10, r9)     // Catch:{ all -> 0x0f02 }
        L_0x09e8:
            java.lang.Boolean r9 = r11.f23423k     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0a02
            java.lang.Boolean r9 = r11.f23423k     // Catch:{ all -> 0x0f02 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0a02
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.C10211u8.m31851a(r8, r9, r12)     // Catch:{ all -> 0x0f02 }
        L_0x0a02:
            g.j.a.a.d.g.p5 r9 = r8.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r9     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r9     // Catch:{ all -> 0x0f02 }
            r5.add(r9)     // Catch:{ all -> 0x0f02 }
        L_0x0a0d:
            r3.mo28957a(r7, r8)     // Catch:{ all -> 0x0f02 }
        L_0x0a10:
            r1 = r3
            r63 = r6
            r3 = r2
            r2 = r7
            r6 = 1
            goto L_0x0cce
        L_0x0a19:
            com.google.android.gms.measurement.internal.j4 r9 = r62.mo25938k()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0ee0 }
            java.lang.String r11 = r11.mo28944r()     // Catch:{ all -> 0x0ee0 }
            long r11 = r9.mo25855f(r11)     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x0ee0 }
            r9.mo26022G()     // Catch:{ all -> 0x0ee0 }
            long r13 = r8.mo28817j()     // Catch:{ all -> 0x0ee0 }
            long r13 = com.google.android.gms.measurement.internal.C10251y8.m31965a(r13, r11)     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p5 r9 = r8.mo28446l0()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.e4 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r9     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p0 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r9     // Catch:{ all -> 0x0ee0 }
            java.lang.String r15 = "_dbg"
            r26 = r11
            r18 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ee0 }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0ee0 }
            if (r12 != 0) goto L_0x0aa6
            if (r11 != 0) goto L_0x0a4f
            goto L_0x0aa6
        L_0x0a4f:
            java.util.List r9 = r9.mo28801q()     // Catch:{ all -> 0x0f02 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f02 }
        L_0x0a57:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0f02 }
            if (r12 == 0) goto L_0x0aa6
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.r0 r12 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r12     // Catch:{ all -> 0x0f02 }
            r63 = r9
            java.lang.String r9 = r12.mo28849n()     // Catch:{ all -> 0x0f02 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0aa3
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0a81
            long r18 = r12.mo28853r()     // Catch:{ all -> 0x0f02 }
            java.lang.Long r9 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0f02 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f02 }
            if (r9 != 0) goto L_0x0aa1
        L_0x0a81:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0a8f
            java.lang.String r9 = r12.mo28851p()     // Catch:{ all -> 0x0f02 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f02 }
            if (r9 != 0) goto L_0x0aa1
        L_0x0a8f:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0aa6
            double r18 = r12.mo28855t()     // Catch:{ all -> 0x0f02 }
            java.lang.Double r9 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0f02 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0aa6
        L_0x0aa1:
            r9 = 1
            goto L_0x0aa7
        L_0x0aa3:
            r9 = r63
            goto L_0x0a57
        L_0x0aa6:
            r9 = 0
        L_0x0aa7:
            if (r9 != 0) goto L_0x0abc
            com.google.android.gms.measurement.internal.j4 r9 = r62.mo25938k()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r11 = r11.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r12 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            int r12 = r9.mo25852d(r11, r12)     // Catch:{ all -> 0x0f02 }
            goto L_0x0abd
        L_0x0abc:
            r12 = 1
        L_0x0abd:
            if (r12 > 0) goto L_0x0ae6
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r9 = r9.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0f02 }
            r9.mo25910a(r10, r11, r12)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r9 = r8.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r9     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r9 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r9     // Catch:{ all -> 0x0f02 }
            r5.add(r9)     // Catch:{ all -> 0x0f02 }
            r3.mo28957a(r7, r8)     // Catch:{ all -> 0x0f02 }
            goto L_0x0a10
        L_0x0ae6:
            java.lang.String r9 = r8.mo28816i()     // Catch:{ all -> 0x0ee0 }
            java.lang.Object r9 = r4.get(r9)     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.f r9 = (com.google.android.gms.measurement.internal.C10040f) r9     // Catch:{ all -> 0x0ee0 }
            if (r9 != 0) goto L_0x0b7f
            com.google.android.gms.measurement.internal.n9 r9 = r62.mo25937j()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r11 = r11.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r15 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.f r9 = r9.mo25995b(r11, r15)     // Catch:{ all -> 0x0f02 }
            if (r9 != 0) goto L_0x0b7f
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.k3 r9 = r9.mo25898e()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25877w()     // Catch:{ all -> 0x0f02 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            g.j.a.a.d.g.t0 r15 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r15 = r15.mo28944r()     // Catch:{ all -> 0x0f02 }
            r18 = r13
            java.lang.String r13 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            r9.mo25910a(r11, r15, r13)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.o4 r9 = r1.f23741i     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.i9 r9 = r9.mo26031i()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r11 = r11.mo28944r()     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C10106l.f23691y0     // Catch:{ all -> 0x0f02 }
            boolean r9 = r9.mo25821e(r11, r13)     // Catch:{ all -> 0x0f02 }
            if (r9 == 0) goto L_0x0b5b
            com.google.android.gms.measurement.internal.f r9 = new com.google.android.gms.measurement.internal.f     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r31 = r11.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r32 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r8.mo28817j()     // Catch:{ all -> 0x0f02 }
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r30 = r9
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch:{ all -> 0x0f02 }
            goto L_0x0b81
        L_0x0b5b:
            com.google.android.gms.measurement.internal.f r9 = new com.google.android.gms.measurement.internal.f     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.t0 r11 = r2.f23757a     // Catch:{ all -> 0x0f02 }
            java.lang.String r48 = r11.mo28944r()     // Catch:{ all -> 0x0f02 }
            java.lang.String r49 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            r50 = 1
            r52 = 1
            long r54 = r8.mo28817j()     // Catch:{ all -> 0x0f02 }
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r47 = r9
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r59, r60, r61)     // Catch:{ all -> 0x0f02 }
            goto L_0x0b81
        L_0x0b7f:
            r18 = r13
        L_0x0b81:
            r62.mo25935h()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p5 r11 = r8.mo28446l0()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.e4 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r11     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p0 r11 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r11     // Catch:{ all -> 0x0ee0 }
            java.lang.String r13 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r11, r13)     // Catch:{ all -> 0x0ee0 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0ee0 }
            if (r11 == 0) goto L_0x0b98
            r13 = 1
            goto L_0x0b99
        L_0x0b98:
            r13 = 0
        L_0x0b99:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0ee0 }
            r14 = 1
            if (r12 != r14) goto L_0x0bce
            g.j.a.a.d.g.p5 r10 = r8.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r10     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r10     // Catch:{ all -> 0x0f02 }
            r5.add(r10)     // Catch:{ all -> 0x0f02 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0f02 }
            if (r10 == 0) goto L_0x0bc9
            java.lang.Long r10 = r9.f23421i     // Catch:{ all -> 0x0f02 }
            if (r10 != 0) goto L_0x0bbd
            java.lang.Long r10 = r9.f23422j     // Catch:{ all -> 0x0f02 }
            if (r10 != 0) goto L_0x0bbd
            java.lang.Boolean r10 = r9.f23423k     // Catch:{ all -> 0x0f02 }
            if (r10 == 0) goto L_0x0bc9
        L_0x0bbd:
            r10 = 0
            com.google.android.gms.measurement.internal.f r9 = r9.mo25684a(r10, r10, r10)     // Catch:{ all -> 0x0f02 }
            java.lang.String r10 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            r4.put(r10, r9)     // Catch:{ all -> 0x0f02 }
        L_0x0bc9:
            r3.mo28957a(r7, r8)     // Catch:{ all -> 0x0f02 }
            goto L_0x0a10
        L_0x0bce:
            int r14 = r6.nextInt(r12)     // Catch:{ all -> 0x0ee0 }
            if (r14 != 0) goto L_0x0c13
            r62.mo25935h()     // Catch:{ all -> 0x0f02 }
            long r11 = (long) r12     // Catch:{ all -> 0x0f02 }
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f02 }
            com.google.android.gms.measurement.internal.C10211u8.m31851a(r8, r10, r14)     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p5 r10 = r8.mo28446l0()     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.e4 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r10     // Catch:{ all -> 0x0f02 }
            g.j.a.a.d.g.p0 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r10     // Catch:{ all -> 0x0f02 }
            r5.add(r10)     // Catch:{ all -> 0x0f02 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0f02 }
            if (r10 == 0) goto L_0x0bf9
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f02 }
            r11 = 0
            com.google.android.gms.measurement.internal.f r9 = r9.mo25684a(r11, r10, r11)     // Catch:{ all -> 0x0f02 }
        L_0x0bf9:
            java.lang.String r10 = r8.mo28816i()     // Catch:{ all -> 0x0f02 }
            long r11 = r8.mo28817j()     // Catch:{ all -> 0x0f02 }
            r14 = r18
            com.google.android.gms.measurement.internal.f r9 = r9.mo25683a(r11, r14)     // Catch:{ all -> 0x0f02 }
            r4.put(r10, r9)     // Catch:{ all -> 0x0f02 }
            r1 = r3
            r63 = r6
            r3 = r2
            r2 = r7
            r6 = 1
            goto L_0x0ccb
        L_0x0c13:
            r63 = r6
            r14 = r18
            com.google.android.gms.measurement.internal.o4 r6 = r1.f23741i     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.i9 r6 = r6.mo26031i()     // Catch:{ all -> 0x0ee0 }
            r18 = r3
            g.j.a.a.d.g.t0 r3 = r2.f23757a     // Catch:{ all -> 0x0ee0 }
            java.lang.String r3 = r3.mo28944r()     // Catch:{ all -> 0x0ee0 }
            boolean r3 = r6.mo25829m(r3)     // Catch:{ all -> 0x0ee0 }
            if (r3 == 0) goto L_0x0c53
            java.lang.Long r3 = r9.f23420h     // Catch:{ all -> 0x0ee0 }
            if (r3 == 0) goto L_0x0c39
            java.lang.Long r3 = r9.f23420h     // Catch:{ all -> 0x0f02 }
            long r26 = r3.longValue()     // Catch:{ all -> 0x0f02 }
            r3 = r2
            r19 = r7
            goto L_0x0c4b
        L_0x0c39:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f23741i     // Catch:{ all -> 0x0ee0 }
            r3.mo26022G()     // Catch:{ all -> 0x0ee0 }
            r3 = r2
            long r1 = r8.mo28820m()     // Catch:{ all -> 0x0ee0 }
            r19 = r7
            r6 = r26
            long r26 = com.google.android.gms.measurement.internal.C10251y8.m31965a(r1, r6)     // Catch:{ all -> 0x0ee0 }
        L_0x0c4b:
            int r1 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0c51
        L_0x0c4f:
            r1 = 1
            goto L_0x0c69
        L_0x0c51:
            r1 = 0
            goto L_0x0c69
        L_0x0c53:
            r3 = r2
            r19 = r7
            long r1 = r9.f23419g     // Catch:{ all -> 0x0ee0 }
            long r6 = r8.mo28817j()     // Catch:{ all -> 0x0ee0 }
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0ee0 }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r23 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r23 < 0) goto L_0x0c51
            goto L_0x0c4f
        L_0x0c69:
            if (r1 == 0) goto L_0x0cb3
            r62.mo25935h()     // Catch:{ all -> 0x0ee0 }
            java.lang.String r1 = "_efs"
            r6 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.C10211u8.m31851a(r8, r1, r2)     // Catch:{ all -> 0x0ee0 }
            r62.mo25935h()     // Catch:{ all -> 0x0ee0 }
            long r1 = (long) r12     // Catch:{ all -> 0x0ee0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.C10211u8.m31851a(r8, r10, r11)     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p5 r10 = r8.mo28446l0()     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.e4 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r10     // Catch:{ all -> 0x0ee0 }
            g.j.a.a.d.g.p0 r10 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r10     // Catch:{ all -> 0x0ee0 }
            r5.add(r10)     // Catch:{ all -> 0x0ee0 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0ee0 }
            if (r10 == 0) goto L_0x0ca3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ee0 }
            r2 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0ee0 }
            r2 = 0
            com.google.android.gms.measurement.internal.f r9 = r9.mo25684a(r2, r1, r10)     // Catch:{ all -> 0x0ee0 }
        L_0x0ca3:
            java.lang.String r1 = r8.mo28816i()     // Catch:{ all -> 0x0ee0 }
            long r10 = r8.mo28817j()     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.f r2 = r9.mo25683a(r10, r14)     // Catch:{ all -> 0x0ee0 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0ee0 }
            goto L_0x0cc7
        L_0x0cb3:
            r6 = 1
            boolean r1 = r13.booleanValue()     // Catch:{ all -> 0x0ee0 }
            if (r1 == 0) goto L_0x0cc7
            java.lang.String r1 = r8.mo28816i()     // Catch:{ all -> 0x0ee0 }
            r2 = 0
            com.google.android.gms.measurement.internal.f r9 = r9.mo25684a(r11, r2, r2)     // Catch:{ all -> 0x0ee0 }
            r4.put(r1, r9)     // Catch:{ all -> 0x0ee0 }
        L_0x0cc7:
            r1 = r18
            r2 = r19
        L_0x0ccb:
            r1.mo28957a(r2, r8)     // Catch:{ all -> 0x0ee0 }
        L_0x0cce:
            int r2 = r2 + 1
            r6 = r63
            r7 = r2
            r2 = r3
            r3 = r1
            r1 = r62
            goto L_0x0986
        L_0x0cd9:
            r1 = r3
            r3 = r2
            int r2 = r5.size()     // Catch:{ all -> 0x0ee0 }
            int r6 = r1.mo28999l()     // Catch:{ all -> 0x0ee0 }
            if (r2 >= r6) goto L_0x0ceb
            r1.mo29002m()     // Catch:{ all -> 0x0ee0 }
            r1.mo28963a(r5)     // Catch:{ all -> 0x0ee0 }
        L_0x0ceb:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0ee0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ee0 }
        L_0x0cf3:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ee0 }
            if (r4 == 0) goto L_0x0d0f
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ee0 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.n9 r5 = r62.mo25937j()     // Catch:{ all -> 0x0ee0 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.f r4 = (com.google.android.gms.measurement.internal.C10040f) r4     // Catch:{ all -> 0x0ee0 }
            r5.mo25986a(r4)     // Catch:{ all -> 0x0ee0 }
            goto L_0x0cf3
        L_0x0d0d:
            r1 = r3
            r3 = r2
        L_0x0d0f:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.mo28967b(r4)     // Catch:{ all -> 0x0ee0 }
            r4 = -9223372036854775808
            r1.mo28972c(r4)     // Catch:{ all -> 0x0ee0 }
            r2 = 0
        L_0x0d1d:
            int r4 = r1.mo28999l()     // Catch:{ all -> 0x0ee0 }
            if (r2 >= r4) goto L_0x0d50
            g.j.a.a.d.g.p0 r4 = r1.mo28966b(r2)     // Catch:{ all -> 0x0ee0 }
            long r5 = r4.mo28800p()     // Catch:{ all -> 0x0ee0 }
            long r7 = r1.mo29008p()     // Catch:{ all -> 0x0ee0 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0d3a
            long r5 = r4.mo28800p()     // Catch:{ all -> 0x0ee0 }
            r1.mo28967b(r5)     // Catch:{ all -> 0x0ee0 }
        L_0x0d3a:
            long r5 = r4.mo28800p()     // Catch:{ all -> 0x0ee0 }
            long r7 = r1.mo29009q()     // Catch:{ all -> 0x0ee0 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0d4d
            long r4 = r4.mo28800p()     // Catch:{ all -> 0x0ee0 }
            r1.mo28972c(r4)     // Catch:{ all -> 0x0ee0 }
        L_0x0d4d:
            int r2 = r2 + 1
            goto L_0x0d1d
        L_0x0d50:
            g.j.a.a.d.g.t0 r2 = r3.f23757a     // Catch:{ all -> 0x0ee0 }
            java.lang.String r2 = r2.mo28944r()     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.n9 r4 = r62.mo25937j()     // Catch:{ all -> 0x0ee0 }
            com.google.android.gms.measurement.internal.f4 r4 = r4.mo25994b(r2)     // Catch:{ all -> 0x0ee0 }
            if (r4 != 0) goto L_0x0d7c
            r6 = r62
            com.google.android.gms.measurement.internal.o4 r4 = r6.f23741i     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            g.j.a.a.d.g.t0 r7 = r3.f23757a     // Catch:{ all -> 0x0f00 }
            java.lang.String r7 = r7.mo28944r()     // Catch:{ all -> 0x0f00 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x0f00 }
            r4.mo25909a(r5, r7)     // Catch:{ all -> 0x0f00 }
            goto L_0x0dd9
        L_0x0d7c:
            r6 = r62
            int r5 = r1.mo28999l()     // Catch:{ all -> 0x0f00 }
            if (r5 <= 0) goto L_0x0dd9
            long r7 = r4.mo25728j()     // Catch:{ all -> 0x0f00 }
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0d92
            r1.mo28979e(r7)     // Catch:{ all -> 0x0f00 }
            goto L_0x0d95
        L_0x0d92:
            r1.mo29011s()     // Catch:{ all -> 0x0f00 }
        L_0x0d95:
            long r9 = r4.mo25726i()     // Catch:{ all -> 0x0f00 }
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0da0
            goto L_0x0da1
        L_0x0da0:
            r7 = r9
        L_0x0da1:
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0da9
            r1.mo28975d(r7)     // Catch:{ all -> 0x0f00 }
            goto L_0x0dac
        L_0x0da9:
            r1.mo29010r()     // Catch:{ all -> 0x0f00 }
        L_0x0dac:
            r4.mo25745t()     // Catch:{ all -> 0x0f00 }
            long r7 = r4.mo25742q()     // Catch:{ all -> 0x0f00 }
            int r5 = (int) r7     // Catch:{ all -> 0x0f00 }
            r1.mo28981f(r5)     // Catch:{ all -> 0x0f00 }
            long r7 = r1.mo29008p()     // Catch:{ all -> 0x0f00 }
            r4.mo25698a(r7)     // Catch:{ all -> 0x0f00 }
            long r7 = r1.mo29009q()     // Catch:{ all -> 0x0f00 }
            r4.mo25704b(r7)     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = r4.mo25691B()     // Catch:{ all -> 0x0f00 }
            if (r5 == 0) goto L_0x0dcf
            r1.mo28994j(r5)     // Catch:{ all -> 0x0f00 }
            goto L_0x0dd2
        L_0x0dcf:
            r1.mo29012t()     // Catch:{ all -> 0x0f00 }
        L_0x0dd2:
            com.google.android.gms.measurement.internal.n9 r5 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            r5.mo25985a(r4)     // Catch:{ all -> 0x0f00 }
        L_0x0dd9:
            int r4 = r1.mo28999l()     // Catch:{ all -> 0x0f00 }
            if (r4 <= 0) goto L_0x0e3f
            com.google.android.gms.measurement.internal.o4 r4 = r6.f23741i     // Catch:{ all -> 0x0f00 }
            r4.mo25894a()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.j4 r4 = r62.mo25938k()     // Catch:{ all -> 0x0f00 }
            g.j.a.a.d.g.t0 r5 = r3.f23757a     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = r5.mo28944r()     // Catch:{ all -> 0x0f00 }
            g.j.a.a.d.g.b1 r4 = r4.mo25845a(r5)     // Catch:{ all -> 0x0f00 }
            if (r4 == 0) goto L_0x0e03
            java.lang.Long r5 = r4.f26066c     // Catch:{ all -> 0x0f00 }
            if (r5 != 0) goto L_0x0df9
            goto L_0x0e03
        L_0x0df9:
            java.lang.Long r4 = r4.f26066c     // Catch:{ all -> 0x0f00 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0f00 }
            r1.mo28990i(r4)     // Catch:{ all -> 0x0f00 }
            goto L_0x0e2e
        L_0x0e03:
            g.j.a.a.d.g.t0 r4 = r3.f23757a     // Catch:{ all -> 0x0f00 }
            java.lang.String r4 = r4.mo28940p()     // Catch:{ all -> 0x0f00 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f00 }
            if (r4 == 0) goto L_0x0e15
            r4 = -1
            r1.mo28990i(r4)     // Catch:{ all -> 0x0f00 }
            goto L_0x0e2e
        L_0x0e15:
            com.google.android.gms.measurement.internal.o4 r4 = r6.f23741i     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25877w()     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            g.j.a.a.d.g.t0 r7 = r3.f23757a     // Catch:{ all -> 0x0f00 }
            java.lang.String r7 = r7.mo28944r()     // Catch:{ all -> 0x0f00 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x0f00 }
            r4.mo25909a(r5, r7)     // Catch:{ all -> 0x0f00 }
        L_0x0e2e:
            com.google.android.gms.measurement.internal.n9 r4 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            g.j.a.a.d.g.p5 r1 = r1.mo28446l0()     // Catch:{ all -> 0x0f00 }
            g.j.a.a.d.g.e4 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11090e4) r1     // Catch:{ all -> 0x0f00 }
            g.j.a.a.d.g.t0 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11310t0) r1     // Catch:{ all -> 0x0f00 }
            r12 = r21
            r4.mo25992a(r1, r12)     // Catch:{ all -> 0x0f00 }
        L_0x0e3f:
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            java.util.List<java.lang.Long> r3 = r3.f23758b     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.common.internal.C9908u.m30853a(r3)     // Catch:{ all -> 0x0f00 }
            r1.mo25662j()     // Catch:{ all -> 0x0f00 }
            r1.mo25969t()     // Catch:{ all -> 0x0f00 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0f00 }
            r5 = 0
        L_0x0e56:
            int r7 = r3.size()     // Catch:{ all -> 0x0f00 }
            if (r5 >= r7) goto L_0x0e73
            if (r5 == 0) goto L_0x0e63
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0f00 }
        L_0x0e63:
            java.lang.Object r7 = r3.get(r5)     // Catch:{ all -> 0x0f00 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f00 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f00 }
            r4.append(r7)     // Catch:{ all -> 0x0f00 }
            int r5 = r5 + 1
            goto L_0x0e56
        L_0x0e73:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0f00 }
            android.database.sqlite.SQLiteDatabase r5 = r1.mo26011x()     // Catch:{ all -> 0x0f00 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0f00 }
            r8 = 0
            int r4 = r5.delete(r7, r4, r8)     // Catch:{ all -> 0x0f00 }
            int r5 = r3.size()     // Catch:{ all -> 0x0f00 }
            if (r4 == r5) goto L_0x0ea6
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x0f00 }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0f00 }
            int r3 = r3.size()     // Catch:{ all -> 0x0f00 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0f00 }
            r1.mo25910a(r5, r4, r3)     // Catch:{ all -> 0x0f00 }
        L_0x0ea6:
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            android.database.sqlite.SQLiteDatabase r3 = r1.mo26011x()     // Catch:{ all -> 0x0f00 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0ebd }
            r7 = 0
            r5[r7] = r2     // Catch:{ SQLiteException -> 0x0ebd }
            r7 = 1
            r5[r7] = r2     // Catch:{ SQLiteException -> 0x0ebd }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0ebd }
            goto L_0x0ed0
        L_0x0ebd:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()     // Catch:{ all -> 0x0f00 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r2)     // Catch:{ all -> 0x0f00 }
            r1.mo25910a(r4, r2, r3)     // Catch:{ all -> 0x0f00 }
        L_0x0ed0:
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            r1.mo26012y()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()
            r1.mo26010w()
            r1 = 1
            return r1
        L_0x0ee0:
            r0 = move-exception
            r6 = r62
            goto L_0x0f04
        L_0x0ee4:
            r6 = r1
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()     // Catch:{ all -> 0x0f00 }
            r1.mo26012y()     // Catch:{ all -> 0x0f00 }
            com.google.android.gms.measurement.internal.n9 r1 = r62.mo25937j()
            r1.mo26010w()
            r1 = 0
            return r1
        L_0x0ef5:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r22 = r5
        L_0x0efa:
            if (r22 == 0) goto L_0x0eff
            r22.close()     // Catch:{ all -> 0x0f00 }
        L_0x0eff:
            throw r1     // Catch:{ all -> 0x0f00 }
        L_0x0f00:
            r0 = move-exception
            goto L_0x0f04
        L_0x0f02:
            r0 = move-exception
            r6 = r1
        L_0x0f04:
            r1 = r0
            com.google.android.gms.measurement.internal.n9 r2 = r62.mo25937j()
            r2.mo26010w()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.m31586a(java.lang.String, long):boolean");
    }

    /* renamed from: b */
    private final Boolean m31587b(C10045f4 f4Var) {
        try {
            if (f4Var.mo25732l() != -2147483648L) {
                if (f4Var.mo25732l() == ((long) C9931c.m30956a(this.f23741i.mo25895b()).mo25464b(f4Var.mo25717f(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C9931c.m30956a(this.f23741i.mo25895b()).mo25464b(f4Var.mo25717f(), 0).versionName;
                if (f4Var.mo25730k() != null && f4Var.mo25730k().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25930b(C10201t8 t8Var, C10028d9 d9Var) {
        m31572C();
        mo25941n();
        if (TextUtils.isEmpty(d9Var.f23371U) && TextUtils.isEmpty(d9Var.f23388k0)) {
            return;
        }
        if (!d9Var.f23377a0) {
            m31590e(d9Var);
            return;
        }
        String str = "User property removed";
        String str2 = "Removing user property";
        if (this.f23741i.mo26031i().mo25821e(d9Var.f23379c, C10106l.f23661j0)) {
            if (!"_npa".equals(t8Var.f23959U) || d9Var.f23389l0 == null) {
                this.f23741i.mo25898e().mo25868A().mo25909a(str2, this.f23741i.mo26021F().mo25797c(t8Var.f23959U));
                mo25937j().mo26009v();
                try {
                    m31590e(d9Var);
                    mo25937j().mo25998c(d9Var.f23379c, t8Var.f23959U);
                    mo25937j().mo26012y();
                    this.f23741i.mo25898e().mo25868A().mo25909a(str, this.f23741i.mo26021F().mo25797c(t8Var.f23959U));
                } finally {
                    mo25937j().mo26010w();
                }
            } else {
                this.f23741i.mo25898e().mo25868A().mo25908a("Falling back to manifest metadata value for ad personalization");
                C10201t8 t8Var2 = new C10201t8("_npa", this.f23741i.mo25896c().mo25474c(), Long.valueOf(d9Var.f23389l0.booleanValue() ? 1 : 0), "auto");
                mo25923a(t8Var2, d9Var);
            }
        } else {
            this.f23741i.mo25898e().mo25868A().mo25909a(str2, this.f23741i.mo26021F().mo25797c(t8Var.f23959U));
            mo25937j().mo26009v();
            try {
                m31590e(d9Var);
                mo25937j().mo25998c(d9Var.f23379c, t8Var.f23959U);
                mo25937j().mo26012y();
                this.f23741i.mo25898e().mo25868A().mo25909a(str, this.f23741i.mo26021F().mo25797c(t8Var.f23959U));
            } finally {
                mo25937j().mo26010w();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25928b(C10061g9 g9Var) {
        C10028d9 a = m31575a(g9Var.f23502c);
        if (a != null) {
            mo25929b(g9Var, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo25929b(C10061g9 g9Var, C10028d9 d9Var) {
        C9908u.m30853a(g9Var);
        C9908u.m30863b(g9Var.f23502c);
        C9908u.m30853a(g9Var.f23495V);
        C9908u.m30863b(g9Var.f23495V.f23959U);
        m31572C();
        mo25941n();
        if (TextUtils.isEmpty(d9Var.f23371U) && TextUtils.isEmpty(d9Var.f23388k0)) {
            return;
        }
        if (!d9Var.f23377a0) {
            m31590e(d9Var);
            return;
        }
        mo25937j().mo26009v();
        try {
            m31590e(d9Var);
            C10061g9 e = mo25937j().mo26001e(g9Var.f23502c, g9Var.f23495V.f23959U);
            if (e != null) {
                this.f23741i.mo25898e().mo25868A().mo25910a("Removing conditional user property", g9Var.f23502c, this.f23741i.mo26021F().mo25797c(g9Var.f23495V.f23959U));
                mo25937j().mo26003f(g9Var.f23502c, g9Var.f23495V.f23959U);
                if (e.f23497X) {
                    mo25937j().mo25998c(g9Var.f23502c, g9Var.f23495V.f23959U);
                }
                if (g9Var.f23504d0 != null) {
                    Bundle bundle = null;
                    if (g9Var.f23504d0.f23559U != null) {
                        bundle = g9Var.f23504d0.f23559U.mo25785c();
                    }
                    Bundle bundle2 = bundle;
                    m31588b(this.f23741i.mo26022G().mo26216a(g9Var.f23502c, g9Var.f23504d0.f23562c, bundle2, e.f23494U, g9Var.f23504d0.f23561W, true, false), d9Var);
                }
            } else {
                this.f23741i.mo25898e().mo25877w().mo25910a("Conditional user property doesn't exist", C10099k3.m31423a(g9Var.f23502c), this.f23741i.mo26021F().mo25797c(g9Var.f23495V.f23959U));
            }
            mo25937j().mo26012y();
        } finally {
            mo25937j().mo26010w();
        }
    }

    /* renamed from: a */
    private final void m31583a(C11311a aVar, long j, boolean z) {
        C10221v8 v8Var;
        String str = z ? "_se" : "_lte";
        C10221v8 d = mo25937j().mo25999d(aVar.mo28995j(), str);
        if (d == null || d.f24008e == null) {
            v8Var = new C10221v8(aVar.mo28995j(), "auto", str, this.f23741i.mo25896c().mo25474c(), Long.valueOf(j));
        } else {
            v8Var = new C10221v8(aVar.mo28995j(), "auto", str, this.f23741i.mo25896c().mo25474c(), Long.valueOf(((Long) d.f24008e).longValue() + j));
        }
        C11368a z2 = C11367x0.m36683z();
        z2.mo29139a(str);
        z2.mo29138a(this.f23741i.mo25896c().mo25474c());
        z2.mo29140b(((Long) v8Var.f24008e).longValue());
        C11367x0 x0Var = (C11367x0) z2.mo28446l0();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= aVar.mo29006o()) {
                break;
            } else if (str.equals(aVar.mo28977d(i).mo29128n())) {
                aVar.mo28958a(i, x0Var);
                z3 = true;
                break;
            } else {
                i++;
            }
        }
        if (!z3) {
            aVar.mo28962a(x0Var);
        }
        if (j > 0) {
            mo25937j().mo25991a(v8Var);
            this.f23741i.mo25898e().mo25868A().mo25910a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", v8Var.f24008e);
        }
    }

    /* renamed from: a */
    private final boolean m31585a(C11254a aVar, C11254a aVar2) {
        Object obj;
        C9908u.m30860a("_e".equals(aVar.mo28816i()));
        mo25935h();
        C11281r0 a = C10211u8.m31848a((C11253p0) aVar.mo28446l0(), "_sc");
        String str = null;
        if (a == null) {
            obj = null;
        } else {
            obj = a.mo28851p();
        }
        mo25935h();
        C11281r0 a2 = C10211u8.m31848a((C11253p0) aVar2.mo28446l0(), "_pc");
        if (a2 != null) {
            str = a2.mo28851p();
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo25935h();
        String str2 = "_et";
        C11281r0 a3 = C10211u8.m31848a((C11253p0) aVar.mo28446l0(), str2);
        if (a3.mo28852q() && a3.mo28853r() > 0) {
            long r = a3.mo28853r();
            mo25935h();
            C11281r0 a4 = C10211u8.m31848a((C11253p0) aVar2.mo28446l0(), str2);
            if (a4 != null && a4.mo28853r() > 0) {
                r += a4.mo28853r();
            }
            mo25935h();
            C10211u8.m31851a(aVar2, str2, (Object) Long.valueOf(r));
            mo25935h();
            C10211u8.m31851a(aVar, "_fr", (Object) Long.valueOf(1));
        }
        return true;
    }

    /* renamed from: a */
    private static void m31582a(C11254a aVar, String str) {
        List k = aVar.mo28818k();
        for (int i = 0; i < k.size(); i++) {
            if (str.equals(((C11281r0) k.get(i)).mo28849n())) {
                aVar.mo28814b(i);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m31581a(C11254a aVar, int i, String str) {
        List k = aVar.mo28818k();
        int i2 = 0;
        while (true) {
            String str2 = "_err";
            if (i2 >= k.size()) {
                C11282a x = C11281r0.m35991x();
                x.mo28858a(str2);
                x.mo28857a(Long.valueOf((long) i).longValue());
                C11281r0 r0Var = (C11281r0) x.mo28446l0();
                C11282a x2 = C11281r0.m35991x();
                x2.mo28858a("_ev");
                x2.mo28859b(str);
                C11281r0 r0Var2 = (C11281r0) x2.mo28446l0();
                aVar.mo28811a(r0Var);
                aVar.mo28811a(r0Var2);
                return;
            } else if (!str2.equals(((C11281r0) k.get(i2)).mo28849n())) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25916a(int i, Throwable th, byte[] bArr, String str) {
        C10139n9 j;
        m31572C();
        mo25941n();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f23750r = false;
                m31596z();
                throw th2;
            }
        }
        List<Long> list = this.f23754v;
        this.f23754v = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f23741i.mo26030h().f23933e.mo26197a(this.f23741i.mo25896c().mo25474c());
                this.f23741i.mo26030h().f23934f.mo26197a(0);
                m31595y();
                this.f23741i.mo25898e().mo25869B().mo25910a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo25937j().mo26009v();
                try {
                    for (Long l : list) {
                        try {
                            j = mo25937j();
                            long longValue = l.longValue();
                            j.mo25662j();
                            j.mo25969t();
                            if (j.mo26011x().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            j.mo25898e().mo25874t().mo25909a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f23755w == null || !this.f23755w.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo25937j().mo26012y();
                    mo25937j().mo26010w();
                    this.f23755w = null;
                    if (!mo25939l().mo26015v() || !m31594x()) {
                        this.f23756x = -1;
                        m31595y();
                    } else {
                        mo25942o();
                    }
                    this.f23745m = 0;
                } catch (Throwable th3) {
                    mo25937j().mo26010w();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f23741i.mo25898e().mo25874t().mo25909a("Database error while trying to delete uploaded bundles", e3);
                this.f23745m = this.f23741i.mo25896c().mo25472a();
                this.f23741i.mo25898e().mo25869B().mo25909a("Disable upload, time", Long.valueOf(this.f23745m));
            }
        } else {
            this.f23741i.mo25898e().mo25869B().mo25910a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f23741i.mo26030h().f23934f.mo26197a(this.f23741i.mo25896c().mo25474c());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f23741i.mo26030h().f23935g.mo26197a(this.f23741i.mo25896c().mo25474c());
            }
            mo25937j().mo25988a(list);
            m31595y();
        }
        this.f23750r = false;
        m31596z();
    }

    /* renamed from: a */
    private final void m31578a(C10045f4 f4Var) {
        m31572C();
        if (!TextUtils.isEmpty(f4Var.mo25707c()) || (C10083i9.m31365z() && !TextUtils.isEmpty(f4Var.mo25720g()))) {
            C10083i9 i = this.f23741i.mo26031i();
            Builder builder = new Builder();
            String c = f4Var.mo25707c();
            if (TextUtils.isEmpty(c) && C10083i9.m31365z()) {
                c = f4Var.mo25720g();
            }
            C3926a aVar = null;
            Builder encodedAuthority = builder.scheme((String) C10106l.f23660j.mo26194a(null)).encodedAuthority((String) C10106l.f23662k.mo26194a(null));
            String str = "config/app/";
            String valueOf = String.valueOf(c);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", f4Var.mo25697a()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(i.mo25830n()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f23741i.mo25898e().mo25869B().mo25909a("Fetching remote configuration", f4Var.mo25717f());
                C11037b1 a = mo25938k().mo25845a(f4Var.mo25717f());
                String b = mo25938k().mo25848b(f4Var.mo25717f());
                if (a != null && !TextUtils.isEmpty(b)) {
                    aVar = new C3926a();
                    aVar.put("If-Modified-Since", b);
                }
                C3926a aVar2 = aVar;
                this.f23749q = true;
                C10144o3 l = mo25939l();
                String f = f4Var.mo25717f();
                C10181r8 r8Var = new C10181r8(this);
                l.mo25662j();
                l.mo25969t();
                C9908u.m30853a(url);
                C9908u.m30853a(r8Var);
                C10078i4 d = l.mo25897d();
                C10186s3 s3Var = new C10186s3(l, f, url, null, aVar2, r8Var);
                d.mo25802b((Runnable) s3Var);
            } catch (MalformedURLException unused) {
                this.f23741i.mo25898e().mo25874t().mo25910a("Failed to parse config URL. Not fetching. appId", C10099k3.m31423a(f4Var.mo25717f()), uri);
            }
        } else {
            mo25925a(f4Var.mo25717f(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25925a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m31572C()
            r6.mo25941n()
            com.google.android.gms.common.internal.C9908u.m30863b(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.o4 r1 = r6.f23741i     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.mo25909a(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.n9 r1 = r6.mo25937j()     // Catch:{ all -> 0x0196 }
            r1.mo26009v()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.n9 r1 = r6.mo25937j()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.f4 r1 = r1.mo25994b(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.o4 r8 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo25898e()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25877w()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r7)     // Catch:{ all -> 0x018d }
            r8.mo25909a(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.o4 r10 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r10 = r10.mo25896c()     // Catch:{ all -> 0x018d }
            long r10 = r10.mo25474c()     // Catch:{ all -> 0x018d }
            r1.mo25727i(r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.n9 r10 = r6.mo25937j()     // Catch:{ all -> 0x018d }
            r10.mo25985a(r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.o4 r10 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r10 = r10.mo25898e()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo25869B()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.mo25910a(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.j4 r9 = r6.mo25938k()     // Catch:{ all -> 0x018d }
            r9.mo25850c(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.o4 r7 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.t3 r7 = r7.mo26030h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f23934f     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.o4 r9 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r9 = r9.mo25896c()     // Catch:{ all -> 0x018d }
            long r9 = r9.mo25474c()     // Catch:{ all -> 0x018d }
            r7.mo26197a(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.o4 r7 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.t3 r7 = r7.mo26030h()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f23935g     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.o4 r8 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r8 = r8.mo25896c()     // Catch:{ all -> 0x018d }
            long r8 = r8.mo25474c()     // Catch:{ all -> 0x018d }
            r7.mo26197a(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.m31595y()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.j4 r9 = r6.mo25938k()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.mo25847a(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.n9 r7 = r6.mo25937j()     // Catch:{ all -> 0x0196 }
            r7.mo26010w()     // Catch:{ all -> 0x0196 }
            r6.f23749q = r0
            r6.m31596z()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.j4 r11 = r6.mo25938k()     // Catch:{ all -> 0x018d }
            g.j.a.a.d.g.b1 r11 = r11.mo25845a(r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.j4 r11 = r6.mo25938k()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.mo25847a(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.n9 r7 = r6.mo25937j()     // Catch:{ all -> 0x0196 }
            r7.mo26010w()     // Catch:{ all -> 0x0196 }
            r6.f23749q = r0
            r6.m31596z()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.o4 r9 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r9 = r9.mo25896c()     // Catch:{ all -> 0x018d }
            long r2 = r9.mo25474c()     // Catch:{ all -> 0x018d }
            r1.mo25724h(r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.n9 r9 = r6.mo25937j()     // Catch:{ all -> 0x018d }
            r9.mo25985a(r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.o4 r8 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo25898e()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25879y()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo25909a(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.o4 r7 = r6.f23741i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo25898e()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25869B()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.mo25910a(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.o3 r7 = r6.mo25939l()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.mo26015v()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.m31594x()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.mo25942o()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.m31595y()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.n9 r7 = r6.mo25937j()     // Catch:{ all -> 0x018d }
            r7.mo26012y()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.n9 r7 = r6.mo25937j()     // Catch:{ all -> 0x0196 }
            r7.mo26010w()     // Catch:{ all -> 0x0196 }
            r6.f23749q = r0
            r6.m31596z()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.n9 r8 = r6.mo25937j()     // Catch:{ all -> 0x0196 }
            r8.mo26010w()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.f23749q = r0
            r6.m31596z()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10126m8.mo25925a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25924a(Runnable runnable) {
        m31572C();
        if (this.f23746n == null) {
            this.f23746n = new ArrayList();
        }
        this.f23746n.add(runnable);
    }

    /* renamed from: a */
    private final int m31573a(FileChannel fileChannel) {
        m31572C();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f23741i.mo25898e().mo25874t().mo25908a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f23741i.mo25898e().mo25877w().mo25909a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f23741i.mo25898e().mo25874t().mo25909a("Failed to read from channel", e);
        }
    }

    /* renamed from: a */
    private final boolean m31584a(int i, FileChannel fileChannel) {
        m31572C();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f23741i.mo25898e().mo25874t().mo25908a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f23741i.mo25898e().mo25874t().mo25909a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f23741i.mo25898e().mo25874t().mo25909a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25917a(C10028d9 d9Var) {
        String str = "app_id=?";
        if (this.f23754v != null) {
            this.f23755w = new ArrayList();
            this.f23755w.addAll(this.f23754v);
        }
        C10139n9 j = mo25937j();
        String str2 = d9Var.f23379c;
        C9908u.m30863b(str2);
        j.mo25662j();
        j.mo25969t();
        try {
            SQLiteDatabase x = j.mo26011x();
            String[] strArr = {str2};
            int delete = x.delete("apps", str, strArr) + 0 + x.delete("events", str, strArr) + x.delete("user_attributes", str, strArr) + x.delete("conditional_properties", str, strArr) + x.delete("raw_events", str, strArr) + x.delete("raw_events_metadata", str, strArr) + x.delete("queue", str, strArr) + x.delete("audience_filter_values", str, strArr) + x.delete("main_event_params", str, strArr);
            if (delete > 0) {
                j.mo25898e().mo25869B().mo25910a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            j.mo25898e().mo25874t().mo25910a("Error resetting analytics data. appId, error", C10099k3.m31423a(str2), e);
        }
        C10028d9 a = m31574a(this.f23741i.mo25895b(), d9Var.f23379c, d9Var.f23371U, d9Var.f23377a0, d9Var.f23385h0, d9Var.f23386i0, d9Var.f23383f0, d9Var.f23388k0);
        if (d9Var.f23377a0) {
            mo25931c(a);
        }
    }

    /* renamed from: a */
    private final C10028d9 m31574a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        String str5;
        int i;
        String str6 = str;
        String str7 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f23741i.mo25898e().mo25874t().mo25908a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str6);
        } catch (IllegalArgumentException unused) {
            this.f23741i.mo25898e().mo25874t().mo25909a("Error retrieving installer package name. appId", C10099k3.m31423a(str));
            str4 = str7;
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str8 = str4;
        try {
            PackageInfo b = C9931c.m30956a(context).mo25464b(str6, 0);
            if (b != null) {
                CharSequence b2 = C9931c.m30956a(context).mo25465b(str6);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                String str9 = b.versionName;
                i = b.versionCode;
                str5 = str9;
            } else {
                i = Integer.MIN_VALUE;
                str5 = str7;
            }
            this.f23741i.mo25894a();
            C10028d9 d9Var = new C10028d9(str, str2, str5, (long) i, str8, this.f23741i.mo26031i().mo25830n(), this.f23741i.mo26022G().mo26212a(context, str6), (String) null, z, false, "", 0, this.f23741i.mo26031i().mo25826j(str6) ? j : 0, 0, z2, z3, false, str3, (Boolean) null, 0, null);
            return d9Var;
        } catch (NameNotFoundException unused2) {
            this.f23741i.mo25898e().mo25874t().mo25910a("Error retrieving newly installed package info. appId, appName", C10099k3.m31423a(str), str7);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25923a(C10201t8 t8Var, C10028d9 d9Var) {
        m31572C();
        mo25941n();
        if (TextUtils.isEmpty(d9Var.f23371U) && TextUtils.isEmpty(d9Var.f23388k0)) {
            return;
        }
        if (!d9Var.f23377a0) {
            m31590e(d9Var);
            return;
        }
        int b = this.f23741i.mo26022G().mo26232b(t8Var.f23959U);
        if (b != 0) {
            this.f23741i.mo26022G();
            String a = C10251y8.m31969a(t8Var.f23959U, 24, true);
            String str = t8Var.f23959U;
            this.f23741i.mo26022G().mo26229a(d9Var.f23379c, b, "_ev", a, str != null ? str.length() : 0);
            return;
        }
        int b2 = this.f23741i.mo26022G().mo26233b(t8Var.f23959U, t8Var.mo26106c());
        if (b2 != 0) {
            this.f23741i.mo26022G();
            String a2 = C10251y8.m31969a(t8Var.f23959U, 24, true);
            Object c = t8Var.mo26106c();
            this.f23741i.mo26022G().mo26229a(d9Var.f23379c, b2, "_ev", a2, (c == null || (!(c instanceof String) && !(c instanceof CharSequence))) ? 0 : String.valueOf(c).length());
            return;
        }
        Object c2 = this.f23741i.mo26022G().mo26235c(t8Var.f23959U, t8Var.mo26106c());
        if (c2 != null) {
            if ("_sid".equals(t8Var.f23959U) && this.f23741i.mo26031i().mo25833o(d9Var.f23379c)) {
                long j = t8Var.f23960V;
                String str2 = t8Var.f23963Y;
                long j2 = 0;
                C10221v8 d = mo25937j().mo25999d(d9Var.f23379c, "_sno");
                if (d != null) {
                    Object obj = d.f24008e;
                    if (obj instanceof Long) {
                        j2 = ((Long) obj).longValue();
                        C10201t8 t8Var2 = new C10201t8("_sno", j, Long.valueOf(j2 + 1), str2);
                        mo25923a(t8Var2, d9Var);
                    }
                }
                if (d != null) {
                    this.f23741i.mo25898e().mo25877w().mo25909a("Retrieved last session number from database does not contain a valid (long) value", d.f24008e);
                }
                if (this.f23741i.mo26031i().mo25821e(d9Var.f23379c, C10106l.f23651e0)) {
                    C10040f b3 = mo25937j().mo25995b(d9Var.f23379c, "_s");
                    if (b3 != null) {
                        j2 = b3.f23415c;
                        this.f23741i.mo25898e().mo25869B().mo25909a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                }
                C10201t8 t8Var22 = new C10201t8("_sno", j, Long.valueOf(j2 + 1), str2);
                mo25923a(t8Var22, d9Var);
            }
            C10221v8 v8Var = new C10221v8(d9Var.f23379c, t8Var.f23963Y, t8Var.f23959U, t8Var.f23960V, c2);
            this.f23741i.mo25898e().mo25868A().mo25910a("Setting user property", this.f23741i.mo26021F().mo25797c(v8Var.f24006c), c2);
            mo25937j().mo26009v();
            try {
                m31590e(d9Var);
                boolean a3 = mo25937j().mo25991a(v8Var);
                mo25937j().mo26012y();
                if (a3) {
                    this.f23741i.mo25898e().mo25868A().mo25910a("User property set", this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                } else {
                    this.f23741i.mo25898e().mo25874t().mo25910a("Too many unique user properties are set. Ignoring user property", this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                    this.f23741i.mo26022G().mo26229a(d9Var.f23379c, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo25937j().mo26010w();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25922a(C10138n8 n8Var) {
        this.f23747o++;
    }

    /* renamed from: a */
    private final C10028d9 m31575a(String str) {
        String str2 = str;
        C10045f4 b = mo25937j().mo25994b(str2);
        if (b == null || TextUtils.isEmpty(b.mo25730k())) {
            this.f23741i.mo25898e().mo25868A().mo25909a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m31587b(b);
        if (b2 == null || b2.booleanValue()) {
            C10045f4 f4Var = b;
            C10028d9 d9Var = new C10028d9(str, b.mo25707c(), b.mo25730k(), b.mo25732l(), b.mo25734m(), b.mo25736n(), b.mo25738o(), (String) null, b.mo25713d(), false, b.mo25703b(), f4Var.mo25692C(), 0, 0, f4Var.mo25693D(), f4Var.mo25694E(), false, f4Var.mo25720g(), f4Var.mo25695F(), f4Var.mo25740p(), f4Var.mo25696G());
            return d9Var;
        }
        this.f23741i.mo25898e().mo25874t().mo25909a("App version does not match; dropping. appId", C10099k3.m31423a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25918a(C10061g9 g9Var) {
        C10028d9 a = m31575a(g9Var.f23502c);
        if (a != null) {
            mo25919a(g9Var, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25919a(C10061g9 g9Var, C10028d9 d9Var) {
        C9908u.m30853a(g9Var);
        C9908u.m30863b(g9Var.f23502c);
        C9908u.m30853a(g9Var.f23494U);
        C9908u.m30853a(g9Var.f23495V);
        C9908u.m30863b(g9Var.f23495V.f23959U);
        m31572C();
        mo25941n();
        if (TextUtils.isEmpty(d9Var.f23371U) && TextUtils.isEmpty(d9Var.f23388k0)) {
            return;
        }
        if (!d9Var.f23377a0) {
            m31590e(d9Var);
            return;
        }
        C10061g9 g9Var2 = new C10061g9(g9Var);
        boolean z = false;
        g9Var2.f23497X = false;
        mo25937j().mo26009v();
        try {
            C10061g9 e = mo25937j().mo26001e(g9Var2.f23502c, g9Var2.f23495V.f23959U);
            if (e != null && !e.f23494U.equals(g9Var2.f23494U)) {
                this.f23741i.mo25898e().mo25877w().mo25911a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f23741i.mo26021F().mo25797c(g9Var2.f23495V.f23959U), g9Var2.f23494U, e.f23494U);
            }
            if (e != null && e.f23497X) {
                g9Var2.f23494U = e.f23494U;
                g9Var2.f23496W = e.f23496W;
                g9Var2.f23500a0 = e.f23500a0;
                g9Var2.f23498Y = e.f23498Y;
                g9Var2.f23501b0 = e.f23501b0;
                g9Var2.f23497X = e.f23497X;
                C10201t8 t8Var = new C10201t8(g9Var2.f23495V.f23959U, e.f23495V.f23960V, g9Var2.f23495V.mo26106c(), e.f23495V.f23963Y);
                g9Var2.f23495V = t8Var;
            } else if (TextUtils.isEmpty(g9Var2.f23498Y)) {
                C10201t8 t8Var2 = new C10201t8(g9Var2.f23495V.f23959U, g9Var2.f23496W, g9Var2.f23495V.mo26106c(), g9Var2.f23495V.f23963Y);
                g9Var2.f23495V = t8Var2;
                g9Var2.f23497X = true;
                z = true;
            }
            if (g9Var2.f23497X) {
                C10201t8 t8Var3 = g9Var2.f23495V;
                C10221v8 v8Var = new C10221v8(g9Var2.f23502c, g9Var2.f23494U, t8Var3.f23959U, t8Var3.f23960V, t8Var3.mo26106c());
                if (mo25937j().mo25991a(v8Var)) {
                    this.f23741i.mo25898e().mo25868A().mo25911a("User property updated immediately", g9Var2.f23502c, this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                } else {
                    this.f23741i.mo25898e().mo25874t().mo25911a("(2)Too many active user properties, ignoring", C10099k3.m31423a(g9Var2.f23502c), this.f23741i.mo26021F().mo25797c(v8Var.f24006c), v8Var.f24008e);
                }
                if (z && g9Var2.f23501b0 != null) {
                    m31588b(new C10084j(g9Var2.f23501b0, g9Var2.f23496W), d9Var);
                }
            }
            if (mo25937j().mo25989a(g9Var2)) {
                this.f23741i.mo25898e().mo25868A().mo25911a("Conditional property added", g9Var2.f23502c, this.f23741i.mo26021F().mo25797c(g9Var2.f23495V.f23959U), g9Var2.f23495V.mo26106c());
            } else {
                this.f23741i.mo25898e().mo25874t().mo25911a("Too many conditional properties, ignoring", C10099k3.m31423a(g9Var2.f23502c), this.f23741i.mo26021F().mo25797c(g9Var2.f23495V.f23959U), g9Var2.f23495V.mo26106c());
            }
            mo25937j().mo26012y();
        } finally {
            mo25937j().mo26010w();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25926a(boolean z) {
        m31595y();
    }
}
