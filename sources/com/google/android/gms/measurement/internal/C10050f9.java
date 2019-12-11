package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11035b0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11050c0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11069d0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11085e0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11105f0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11105f0.C11106a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11239o0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11239o0.C11240a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11367x0;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
final class C10050f9 extends C10138n8 {
    C10050f9(C10126m8 m8Var) {
        super(m8Var);
    }

    /* renamed from: b */
    private static void m31297b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0cec, code lost:
        if (r0.mo28417p() == false) goto L_0x0cf7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0cee, code lost:
        r8 = java.lang.Integer.valueOf(r0.mo28415n());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0cf7, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0cf8, code lost:
        r1.mo25910a("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r8));
        r14.add(java.lang.Integer.valueOf(r5));
        r11 = r72;
        r1 = r73;
        r46 = r4;
        r47 = r7;
        r0 = r16;
        r3 = r17;
        r15 = r37;
        r68 = r43;
        r24 = r44;
        r69 = r48;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x09dd  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0d5a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p163g.p449j.p450a.p451a.p457d.p464g.C11225n0> mo25759a(java.lang.String r72, java.util.List<p163g.p449j.p450a.p451a.p457d.p464g.C11253p0> r73, java.util.List<p163g.p449j.p450a.p451a.p457d.p464g.C11367x0> r74) {
        /*
            r71 = this;
            r7 = r71
            r9 = r72
            com.google.android.gms.common.internal.C9908u.m30863b(r72)
            com.google.android.gms.common.internal.C9908u.m30853a(r73)
            com.google.android.gms.common.internal.C9908u.m30853a(r74)
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            e.e.a r13 = new e.e.a
            r13.<init>()
            e.e.a r14 = new e.e.a
            r14.<init>()
            e.e.a r11 = new e.e.a
            r11.<init>()
            e.e.a r12 = new e.e.a
            r12.<init>()
            e.e.a r10 = new e.e.a
            r10.<init>()
            com.google.android.gms.measurement.internal.i9 r0 = r71.mo25900g()
            boolean r25 = r0.mo25825i(r9)
            com.google.android.gms.measurement.internal.i9 r0 = r71.mo25900g()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C10106l.f23675q0
            boolean r26 = r0.mo25819d(r9, r1)
            com.google.android.gms.measurement.internal.i9 r0 = r71.mo25900g()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C10106l.f23689x0
            boolean r27 = r0.mo25819d(r9, r1)
            com.google.android.gms.measurement.internal.i9 r0 = r71.mo25900g()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C10106l.f23691y0
            boolean r28 = r0.mo25819d(r9, r1)
            if (r27 != 0) goto L_0x0055
            if (r28 == 0) goto L_0x007c
        L_0x0055:
            java.util.Iterator r0 = r73.iterator()
        L_0x0059:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r0.next()
            g.j.a.a.d.g.p0 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r1
            java.lang.String r2 = r1.mo28799o()
            java.lang.String r3 = "_s"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0059
            long r0 = r1.mo28800p()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r29 = r0
            goto L_0x007e
        L_0x007c:
            r29 = 0
        L_0x007e:
            r6 = 1
            r4 = 0
            if (r29 == 0) goto L_0x00c1
            if (r28 == 0) goto L_0x00c1
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            r1.mo25969t()
            r1.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r72)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r3 = "current_session_count"
            r0.put(r3, r2)
            android.database.sqlite.SQLiteDatabase r2 = r1.mo26011x()     // Catch:{ SQLiteException -> 0x00af }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id = ?"
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00af }
            r8[r4] = r9     // Catch:{ SQLiteException -> 0x00af }
            r2.update(r3, r0, r5, r8)     // Catch:{ SQLiteException -> 0x00af }
            goto L_0x00c1
        L_0x00af:
            r0 = move-exception
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)
            java.lang.String r3 = "Error resetting session-scoped event counts. appId"
            r1.mo25910a(r3, r2, r0)
        L_0x00c1:
            com.google.android.gms.measurement.internal.n9 r0 = r71.mo25890p()
            java.util.Map r0 = r0.mo26004f(r9)
            if (r0 == 0) goto L_0x0347
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0347
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r2 = r0.keySet()
            r1.<init>(r2)
            if (r27 == 0) goto L_0x01cf
            if (r29 == 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.f9 r2 = r71.mo25889o()
            com.google.android.gms.common.internal.C9908u.m30863b(r72)
            com.google.android.gms.common.internal.C9908u.m30853a(r0)
            e.e.a r3 = new e.e.a
            r3.<init>()
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.n9 r5 = r2.mo25890p()
            java.util.Map r5 = r5.mo26002e(r9)
            java.util.Set r8 = r0.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0103:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x01d0
            java.lang.Object r17 = r8.next()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r17 = r17.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            java.lang.Object r6 = r0.get(r6)
            g.j.a.a.d.g.v0 r6 = (p163g.p449j.p450a.p451a.p457d.p464g.C11339v0) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Object r4 = r5.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x01b8
            boolean r20 = r4.isEmpty()
            if (r20 == 0) goto L_0x0131
            goto L_0x01b8
        L_0x0131:
            r20 = r5
            com.google.android.gms.measurement.internal.u8 r5 = r2.mo25888n()
            r21 = r8
            java.util.List r8 = r6.mo29056p()
            java.util.List r5 = r5.mo26118a(r8, r4)
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x01b3
            g.j.a.a.d.g.e4$a r8 = r6.mo28436j()
            g.j.a.a.d.g.v0$a r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11339v0.C11340a) r8
            r8.mo29069j()
            r8.mo29065b(r5)
            com.google.android.gms.measurement.internal.u8 r5 = r2.mo25888n()
            r22 = r2
            java.util.List r2 = r6.mo29054n()
            java.util.List r2 = r5.mo26118a(r2, r4)
            r8.mo29068i()
            r8.mo29063a(r2)
            r2 = 0
        L_0x0168:
            int r5 = r6.mo29059s()
            if (r2 >= r5) goto L_0x0186
            g.j.a.a.d.g.o0 r5 = r6.mo29052b(r2)
            int r5 = r5.mo28738n()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x0183
            r8.mo29062a(r2)
        L_0x0183:
            int r2 = r2 + 1
            goto L_0x0168
        L_0x0186:
            r2 = 0
        L_0x0187:
            int r5 = r6.mo29061u()
            if (r2 >= r5) goto L_0x01a5
            g.j.a.a.d.g.w0 r5 = r6.mo29053c(r2)
            int r5 = r5.mo29081n()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x01a2
            r8.mo29064b(r2)
        L_0x01a2:
            int r2 = r2 + 1
            goto L_0x0187
        L_0x01a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            g.j.a.a.d.g.p5 r4 = r8.mo28446l0()
            g.j.a.a.d.g.v0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11339v0) r4
            r3.put(r2, r4)
            goto L_0x01c5
        L_0x01b3:
            r5 = r20
            r8 = r21
            goto L_0x01cb
        L_0x01b8:
            r22 = r2
            r20 = r5
            r21 = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r3.put(r2, r6)
        L_0x01c5:
            r5 = r20
            r8 = r21
            r2 = r22
        L_0x01cb:
            r4 = 0
            r6 = 1
            goto L_0x0103
        L_0x01cf:
            r3 = r0
        L_0x01d0:
            java.util.Iterator r1 = r1.iterator()
        L_0x01d4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r3.get(r4)
            g.j.a.a.d.g.v0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11339v0) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r14.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r6 = r11.get(r6)
            java.util.BitSet r6 = (java.util.BitSet) r6
            if (r25 == 0) goto L_0x0267
            e.e.a r8 = new e.e.a
            r8.<init>()
            if (r4 == 0) goto L_0x025b
            int r17 = r4.mo29059s()
            if (r17 != 0) goto L_0x0212
            goto L_0x025b
        L_0x0212:
            java.util.List r17 = r4.mo29058r()
            java.util.Iterator r17 = r17.iterator()
        L_0x021a:
            boolean r20 = r17.hasNext()
            if (r20 == 0) goto L_0x025b
            java.lang.Object r20 = r17.next()
            g.j.a.a.d.g.o0 r20 = (p163g.p449j.p450a.p451a.p457d.p464g.C11239o0) r20
            boolean r21 = r20.mo28739o()
            if (r21 == 0) goto L_0x0252
            int r21 = r20.mo28738n()
            r22 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            boolean r21 = r20.mo28740p()
            if (r21 == 0) goto L_0x024b
            long r20 = r20.mo28741q()
            java.lang.Long r20 = java.lang.Long.valueOf(r20)
            r70 = r20
            r20 = r3
            r3 = r70
            goto L_0x024e
        L_0x024b:
            r20 = r3
            r3 = 0
        L_0x024e:
            r8.put(r1, r3)
            goto L_0x0256
        L_0x0252:
            r22 = r1
            r20 = r3
        L_0x0256:
            r3 = r20
            r1 = r22
            goto L_0x021a
        L_0x025b:
            r22 = r1
            r20 = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r12.put(r1, r8)
            goto L_0x026c
        L_0x0267:
            r22 = r1
            r20 = r3
            r8 = 0
        L_0x026c:
            if (r5 != 0) goto L_0x0286
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r14.put(r1, r5)
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r11.put(r1, r6)
        L_0x0286:
            if (r4 == 0) goto L_0x02e3
            r1 = 0
        L_0x0289:
            int r3 = r4.mo29055o()
            int r3 = r3 << 6
            if (r1 >= r3) goto L_0x02e3
            java.util.List r3 = r4.mo29054n()
            boolean r3 = com.google.android.gms.measurement.internal.C10211u8.m31858a(r3, r1)
            if (r3 == 0) goto L_0x02c8
            com.google.android.gms.measurement.internal.k3 r3 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25869B()
            r17 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r21 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r23 = r14
            java.lang.String r14 = "Filter already evaluated. audience ID, filter ID"
            r3.mo25910a(r14, r11, r12)
            r6.set(r1)
            java.util.List r3 = r4.mo29056p()
            boolean r3 = com.google.android.gms.measurement.internal.C10211u8.m31858a(r3, r1)
            if (r3 == 0) goto L_0x02ce
            r5.set(r1)
            r3 = 1
            goto L_0x02cf
        L_0x02c8:
            r17 = r11
            r21 = r12
            r23 = r14
        L_0x02ce:
            r3 = 0
        L_0x02cf:
            if (r8 == 0) goto L_0x02da
            if (r3 != 0) goto L_0x02da
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.remove(r3)
        L_0x02da:
            int r1 = r1 + 1
            r11 = r17
            r12 = r21
            r14 = r23
            goto L_0x0289
        L_0x02e3:
            r17 = r11
            r21 = r12
            r23 = r14
            g.j.a.a.d.g.n0$a r1 = p163g.p449j.p450a.p451a.p457d.p464g.C11225n0.m35756u()
            r3 = 0
            r1.mo28724a(r3)
            if (r27 == 0) goto L_0x0301
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.get(r3)
            g.j.a.a.d.g.v0 r3 = (p163g.p449j.p450a.p451a.p457d.p464g.C11339v0) r3
            r1.mo28723a(r3)
            goto L_0x0304
        L_0x0301:
            r1.mo28723a(r4)
        L_0x0304:
            g.j.a.a.d.g.v0$a r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11339v0.m36504z()
            java.util.List r4 = com.google.android.gms.measurement.internal.C10211u8.m31850a(r5)
            r3.mo29065b(r4)
            java.util.List r4 = com.google.android.gms.measurement.internal.C10211u8.m31850a(r6)
            r3.mo29063a(r4)
            if (r25 == 0) goto L_0x032b
            java.util.List r4 = m31295a(r8)
            r3.mo29066c(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            e.e.a r5 = new e.e.a
            r5.<init>()
            r10.put(r4, r5)
        L_0x032b:
            r1.mo28722a(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            g.j.a.a.d.g.p5 r1 = r1.mo28446l0()
            g.j.a.a.d.g.n0 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r1
            r13.put(r2, r1)
            r11 = r17
            r3 = r20
            r12 = r21
            r1 = r22
            r14 = r23
            goto L_0x01d4
        L_0x0347:
            r17 = r11
            r21 = r12
            r23 = r14
            boolean r0 = r73.isEmpty()
            java.lang.String r14 = "Filter definition"
            java.lang.String r8 = "Skipping failed audience ID"
            java.lang.String r30 = "null"
            if (r0 != 0) goto L_0x09c8
            e.e.a r6 = new e.e.a
            r6.<init>()
            java.util.Iterator r31 = r73.iterator()
            r32 = 0
            r2 = r32
            r0 = 0
            r1 = 0
        L_0x0368:
            boolean r4 = r31.hasNext()
            if (r4 == 0) goto L_0x09c8
            java.lang.Object r4 = r31.next()
            g.j.a.a.d.g.p0 r4 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r4
            java.lang.String r5 = r4.mo28799o()
            java.util.List r20 = r4.mo28801q()
            r71.mo25888n()
            java.lang.String r11 = "_eid"
            java.lang.Object r24 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r4, r11)
            r12 = r24
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L_0x038e
            r24 = 1
            goto L_0x0390
        L_0x038e:
            r24 = 0
        L_0x0390:
            r35 = r2
            if (r24 == 0) goto L_0x039e
            java.lang.String r2 = "_ep"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x039e
            r2 = 1
            goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            r37 = 1
            if (r2 == 0) goto L_0x04e0
            r71.mo25888n()
            java.lang.String r2 = "_en"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r4, r2)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x03c8
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            r2.mo25909a(r3, r12)
            r41 = r6
            r18 = r8
            goto L_0x04d8
        L_0x03c8:
            if (r0 == 0) goto L_0x03df
            if (r1 == 0) goto L_0x03df
            long r2 = r12.longValue()
            long r39 = r1.longValue()
            int r24 = (r2 > r39 ? 1 : (r2 == r39 ? 0 : -1))
            if (r24 == 0) goto L_0x03d9
            goto L_0x03df
        L_0x03d9:
            r11 = r0
            r24 = r1
            r0 = r35
            goto L_0x0405
        L_0x03df:
            com.google.android.gms.measurement.internal.n9 r2 = r71.mo25890p()
            android.util.Pair r2 = r2.mo25978a(r9, r12)
            if (r2 == 0) goto L_0x04c6
            java.lang.Object r3 = r2.first
            if (r3 != 0) goto L_0x03ef
            goto L_0x04c6
        L_0x03ef:
            g.j.a.a.d.g.p0 r3 = (p163g.p449j.p450a.p451a.p457d.p464g.C11253p0) r3
            java.lang.Object r0 = r2.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r71.mo25888n()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r3, r11)
            java.lang.Long r2 = (java.lang.Long) r2
            r24 = r2
            r11 = r3
        L_0x0405:
            long r35 = r0 - r37
            int r0 = (r35 > r32 ? 1 : (r35 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x044c
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            r1.mo25662j()
            com.google.android.gms.measurement.internal.k3 r0 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()
            java.lang.String r2 = "Clearing complex main event info. appId"
            r0.mo25909a(r2, r9)
            android.database.sqlite.SQLiteDatabase r0 = r1.mo26011x()     // Catch:{ SQLiteException -> 0x0434 }
            java.lang.String r2 = "delete from main_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0432 }
            r18 = 0
            r12[r18] = r9     // Catch:{ SQLiteException -> 0x0430 }
            r0.execSQL(r2, r12)     // Catch:{ SQLiteException -> 0x0430 }
            goto L_0x0445
        L_0x0430:
            r0 = move-exception
            goto L_0x0438
        L_0x0432:
            r0 = move-exception
            goto L_0x0436
        L_0x0434:
            r0 = move-exception
            r3 = 1
        L_0x0436:
            r18 = 0
        L_0x0438:
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25874t()
            java.lang.String r2 = "Error clearing complex main event"
            r1.mo25909a(r2, r0)
        L_0x0445:
            r12 = r4
            r41 = r6
            r18 = r8
            r8 = r5
            goto L_0x0464
        L_0x044c:
            r3 = 1
            r18 = 0
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            r2 = r72
            r19 = 1
            r3 = r12
            r12 = r4
            r18 = r8
            r8 = r5
            r4 = r35
            r41 = r6
            r6 = r11
            r1.mo25993a(r2, r3, r4, r6)
        L_0x0464:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r11.mo28801q()
            java.util.Iterator r1 = r1.iterator()
        L_0x0471:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x048e
            java.lang.Object r2 = r1.next()
            g.j.a.a.d.g.r0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r2
            r71.mo25888n()
            java.lang.String r3 = r2.mo28849n()
            g.j.a.a.d.g.r0 r3 = com.google.android.gms.measurement.internal.C10211u8.m31848a(r12, r3)
            if (r3 != 0) goto L_0x0471
            r0.add(r2)
            goto L_0x0471
        L_0x048e:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04af
            java.util.Iterator r1 = r20.iterator()
        L_0x0498:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x04a8
            java.lang.Object r2 = r1.next()
            g.j.a.a.d.g.r0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11281r0) r2
            r0.add(r2)
            goto L_0x0498
        L_0x04a8:
            r42 = r0
            r0 = r8
            r39 = r11
            r11 = r12
            goto L_0x04c2
        L_0x04af:
            com.google.android.gms.measurement.internal.k3 r0 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()
            java.lang.String r1 = "No unique parameters in main event. eventName"
            r0.mo25909a(r1, r8)
            r0 = r8
            r39 = r11
            r11 = r12
            r42 = r20
        L_0x04c2:
            r40 = r24
            goto L_0x052d
        L_0x04c6:
            r41 = r6
            r18 = r8
            r8 = r5
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.String r3 = "Extra parameter without existing main event. eventName, eventId"
            r2.mo25910a(r3, r8, r12)
        L_0x04d8:
            r8 = r18
            r2 = r35
            r6 = r41
            goto L_0x0368
        L_0x04e0:
            r11 = r4
            r41 = r6
            r18 = r8
            if (r24 == 0) goto L_0x0525
            r71.mo25888n()
            java.lang.Long r0 = java.lang.Long.valueOf(r32)
            java.lang.String r1 = "_epc"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C10211u8.m31859b(r11, r1)
            if (r1 != 0) goto L_0x04f7
            goto L_0x04f8
        L_0x04f7:
            r0 = r1
        L_0x04f8:
            java.lang.Long r0 = (java.lang.Long) r0
            long r35 = r0.longValue()
            int r0 = (r35 > r32 ? 1 : (r35 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x0511
            com.google.android.gms.measurement.internal.k3 r0 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()
            java.lang.String r1 = "Complex event with zero extra param count. eventName"
            r0.mo25909a(r1, r5)
            r8 = r5
            goto L_0x051f
        L_0x0511:
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            r2 = r72
            r3 = r12
            r8 = r5
            r4 = r35
            r6 = r11
            r1.mo25993a(r2, r3, r4, r6)
        L_0x051f:
            r0 = r8
            r39 = r11
            r40 = r12
            goto L_0x052b
        L_0x0525:
            r8 = r5
            r39 = r0
            r40 = r1
            r0 = r8
        L_0x052b:
            r42 = r20
        L_0x052d:
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            java.lang.String r2 = r11.mo28799o()
            com.google.android.gms.measurement.internal.f r1 = r1.mo25995b(r9, r2)
            if (r1 != 0) goto L_0x05be
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25877w()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)
            com.google.android.gms.measurement.internal.i3 r3 = r71.mo25902l()
            java.lang.String r3 = r3.mo25795a(r0)
            java.lang.String r4 = "Event aggregate wasn't created during raw event logging. appId, event"
            r1.mo25910a(r4, r2, r3)
            if (r28 == 0) goto L_0x058a
            com.google.android.gms.measurement.internal.f r1 = new com.google.android.gms.measurement.internal.f
            r5 = r18
            r6 = 0
            r8 = r1
            java.lang.String r2 = r11.mo28799o()
            r4 = r10
            r10 = r2
            r2 = 1
            r34 = r11
            r43 = r17
            r44 = r21
            r11 = r2
            r46 = r13
            r48 = r14
            r47 = r23
            r13 = r2
            r49 = r15
            r15 = r2
            long r17 = r34.mo28800p()
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r3 = r9
            r9 = r72
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x05bb
        L_0x058a:
            r3 = r9
            r4 = r10
            r34 = r11
            r46 = r13
            r48 = r14
            r49 = r15
            r43 = r17
            r5 = r18
            r44 = r21
            r47 = r23
            r6 = 0
            com.google.android.gms.measurement.internal.f r1 = new com.google.android.gms.measurement.internal.f
            java.lang.String r10 = r34.mo28799o()
            r11 = 1
            r13 = 1
            long r15 = r34.mo28800p()
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r8 = r1
            r9 = r72
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
        L_0x05bb:
            r7 = r1
            goto L_0x0635
        L_0x05be:
            r3 = r9
            r4 = r10
            r34 = r11
            r46 = r13
            r48 = r14
            r49 = r15
            r43 = r17
            r5 = r18
            r44 = r21
            r47 = r23
            r6 = 0
            if (r28 == 0) goto L_0x0607
            com.google.android.gms.measurement.internal.f r2 = new com.google.android.gms.measurement.internal.f
            r50 = r2
            java.lang.String r8 = r1.f23413a
            r51 = r8
            java.lang.String r8 = r1.f23414b
            r52 = r8
            long r8 = r1.f23415c
            long r53 = r8 + r37
            long r8 = r1.f23416d
            long r55 = r8 + r37
            long r8 = r1.f23417e
            long r57 = r8 + r37
            long r8 = r1.f23418f
            r59 = r8
            long r8 = r1.f23419g
            r61 = r8
            java.lang.Long r8 = r1.f23420h
            r63 = r8
            java.lang.Long r8 = r1.f23421i
            r64 = r8
            java.lang.Long r8 = r1.f23422j
            r65 = r8
            java.lang.Boolean r1 = r1.f23423k
            r66 = r1
            r50.<init>(r51, r52, r53, r55, r57, r59, r61, r63, r64, r65, r66)
            goto L_0x0634
        L_0x0607:
            com.google.android.gms.measurement.internal.f r2 = new com.google.android.gms.measurement.internal.f
            r8 = r2
            java.lang.String r9 = r1.f23413a
            java.lang.String r10 = r1.f23414b
            long r11 = r1.f23415c
            long r11 = r11 + r37
            long r13 = r1.f23416d
            long r13 = r13 + r37
            long r6 = r1.f23417e
            r15 = r6
            long r6 = r1.f23418f
            r17 = r6
            long r6 = r1.f23419g
            r19 = r6
            java.lang.Long r6 = r1.f23420h
            r21 = r6
            java.lang.Long r6 = r1.f23421i
            r22 = r6
            java.lang.Long r6 = r1.f23422j
            r23 = r6
            java.lang.Boolean r1 = r1.f23423k
            r24 = r1
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24)
        L_0x0634:
            r7 = r2
        L_0x0635:
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            r1.mo25986a(r7)
            long r8 = r7.f23415c
            r10 = r41
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x065a
            com.google.android.gms.measurement.internal.n9 r1 = r71.mo25890p()
            java.util.Map r1 = r1.mo26006g(r3, r0)
            if (r1 != 0) goto L_0x0657
            e.e.a r1 = new e.e.a
            r1.<init>()
        L_0x0657:
            r10.put(r0, r1)
        L_0x065a:
            r11 = r1
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x0663:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x09ae
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r13 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = r49
            boolean r1 = r14.contains(r1)
            if (r1 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo25909a(r5, r2)
            r49 = r14
            goto L_0x0663
        L_0x0691:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r15 = r47
            java.lang.Object r1 = r15.get(r1)
            java.util.BitSet r1 = (java.util.BitSet) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r6 = r43
            java.lang.Object r2 = r6.get(r2)
            java.util.BitSet r2 = (java.util.BitSet) r2
            r16 = r1
            if (r25 == 0) goto L_0x06c8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r17 = r8
            r8 = r44
            java.lang.Object r1 = r8.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r4.get(r9)
            java.util.Map r9 = (java.util.Map) r9
            r19 = r1
            goto L_0x06cf
        L_0x06c8:
            r17 = r8
            r8 = r44
            r9 = 0
            r19 = 0
        L_0x06cf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r20 = r9
            r9 = r46
            java.lang.Object r1 = r9.get(r1)
            g.j.a.a.d.g.n0 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r1
            if (r1 != 0) goto L_0x073b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            g.j.a.a.d.g.n0$a r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11225n0.m35756u()
            r41 = r10
            r10 = 1
            r2.mo28724a(r10)
            g.j.a.a.d.g.p5 r2 = r2.mo28446l0()
            g.j.a.a.d.g.n0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r2
            r9.put(r1, r2)
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r15.put(r2, r1)
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r6.put(r10, r2)
            if (r25 == 0) goto L_0x0736
            e.e.a r10 = new e.e.a
            r10.<init>()
            r16 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8.put(r1, r10)
            e.e.a r1 = new e.e.a
            r1.<init>()
            r21 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r4.put(r2, r1)
            r19 = r10
            r10 = r16
            r2 = r21
            r16 = r12
            r12 = r1
            goto L_0x0743
        L_0x0736:
            r16 = r1
            r21 = r2
            goto L_0x073d
        L_0x073b:
            r41 = r10
        L_0x073d:
            r10 = r16
            r16 = r12
            r12 = r20
        L_0x0743:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r20 = r1.iterator()
        L_0x0751:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x099c
            java.lang.Object r1 = r20.next()
            g.j.a.a.d.g.b0 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11035b0) r1
            if (r28 == 0) goto L_0x076e
            if (r27 == 0) goto L_0x076e
            boolean r21 = r1.mo28305x()
            if (r21 == 0) goto L_0x076e
            r21 = r2
            long r2 = r7.f23417e
            r22 = r2
            goto L_0x0772
        L_0x076e:
            r21 = r2
            r22 = r17
        L_0x0772:
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            r3 = 2
            boolean r2 = r2.mo25873a(r3)
            if (r2 == 0) goto L_0x07ce
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            boolean r24 = r1.mo28298q()
            if (r24 == 0) goto L_0x07a0
            int r24 = r1.mo28295n()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r37 = r5
            r70 = r24
            r24 = r4
            r4 = r70
            goto L_0x07a5
        L_0x07a0:
            r24 = r4
            r37 = r5
            r4 = 0
        L_0x07a5:
            com.google.android.gms.measurement.internal.i3 r5 = r71.mo25902l()
            r43 = r6
            java.lang.String r6 = r1.mo28296o()
            java.lang.String r5 = r5.mo25795a(r6)
            java.lang.String r6 = "Evaluating filter. audience, filter, event"
            r2.mo25911a(r6, r3, r4, r5)
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            com.google.android.gms.measurement.internal.u8 r3 = r71.mo25888n()
            java.lang.String r3 = r3.mo26115a(r1)
            r5 = r48
            r2.mo25909a(r5, r3)
            goto L_0x07d6
        L_0x07ce:
            r24 = r4
            r37 = r5
            r43 = r6
            r5 = r48
        L_0x07d6:
            boolean r2 = r1.mo28298q()
            if (r2 == 0) goto L_0x0946
            int r2 = r1.mo28295n()
            r6 = 256(0x100, float:3.59E-43)
            if (r2 <= r6) goto L_0x07e6
            goto L_0x0946
        L_0x07e6:
            java.lang.String r4 = "Event filter result"
            if (r25 == 0) goto L_0x08c1
            boolean r2 = r1.mo28302u()
            boolean r38 = r1.mo28303v()
            if (r27 == 0) goto L_0x07fc
            boolean r3 = r1.mo28305x()
            if (r3 == 0) goto L_0x07fc
            r3 = 1
            goto L_0x07fd
        L_0x07fc:
            r3 = 0
        L_0x07fd:
            if (r2 != 0) goto L_0x0807
            if (r38 != 0) goto L_0x0807
            if (r3 == 0) goto L_0x0804
            goto L_0x0807
        L_0x0804:
            r44 = 0
            goto L_0x0809
        L_0x0807:
            r44 = 1
        L_0x0809:
            int r2 = r1.mo28295n()
            boolean r2 = r10.get(r2)
            if (r2 == 0) goto L_0x0844
            if (r44 != 0) goto L_0x0844
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            boolean r4 = r1.mo28298q()
            if (r4 == 0) goto L_0x0830
            int r1 = r1.mo28295n()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0831
        L_0x0830:
            r1 = 0
        L_0x0831:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r2.mo25910a(r4, r3, r1)
            r3 = r72
            r48 = r5
            r2 = r21
            r4 = r24
            r5 = r37
            r6 = r43
            goto L_0x0751
        L_0x0844:
            r3 = r19
            r19 = r1
            r1 = r71
            r45 = r7
            r7 = r21
            r2 = r19
            r46 = r9
            r21 = r11
            r11 = r72
            r9 = r3
            r3 = r0
            r67 = r24
            r24 = r8
            r8 = r4
            r4 = r42
            r69 = r5
            r47 = r15
            r15 = r37
            r68 = r43
            r5 = r22
            java.lang.Boolean r1 = r1.m31288a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            if (r1 != 0) goto L_0x087a
            r3 = r30
            goto L_0x087b
        L_0x087a:
            r3 = r1
        L_0x087b:
            r2.mo25909a(r8, r3)
            if (r1 != 0) goto L_0x0889
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14.add(r1)
            goto L_0x0985
        L_0x0889:
            int r2 = r19.mo28295n()
            r7.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0985
            int r1 = r19.mo28295n()
            r10.set(r1)
            if (r44 == 0) goto L_0x0985
            boolean r1 = r34.mo28803s()
            if (r1 == 0) goto L_0x0985
            if (r38 == 0) goto L_0x08b4
            int r1 = r19.mo28295n()
            long r2 = r34.mo28800p()
            m31297b(r12, r1, r2)
            goto L_0x0985
        L_0x08b4:
            int r1 = r19.mo28295n()
            long r2 = r34.mo28800p()
            m31296a(r9, r1, r2)
            goto L_0x0985
        L_0x08c1:
            r69 = r5
            r45 = r7
            r46 = r9
            r47 = r15
            r9 = r19
            r7 = r21
            r67 = r24
            r15 = r37
            r68 = r43
            r19 = r1
            r24 = r8
            r21 = r11
            r11 = r72
            r8 = r4
            int r1 = r19.mo28295n()
            boolean r1 = r10.get(r1)
            if (r1 == 0) goto L_0x0909
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            boolean r3 = r19.mo28298q()
            if (r3 == 0) goto L_0x0901
            int r3 = r19.mo28295n()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x0902
        L_0x0901:
            r8 = 0
        L_0x0902:
            java.lang.String r3 = "Event filter already evaluated true. audience ID, filter ID"
            r1.mo25910a(r3, r2, r8)
            goto L_0x0985
        L_0x0909:
            r1 = r71
            r2 = r19
            r3 = r0
            r4 = r42
            r5 = r22
            java.lang.Boolean r1 = r1.m31288a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.k3 r2 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            if (r1 != 0) goto L_0x0923
            r3 = r30
            goto L_0x0924
        L_0x0923:
            r3 = r1
        L_0x0924:
            r2.mo25909a(r8, r3)
            if (r1 != 0) goto L_0x0931
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14.add(r1)
            goto L_0x0985
        L_0x0931:
            int r2 = r19.mo28295n()
            r7.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0985
            int r1 = r19.mo28295n()
            r10.set(r1)
            goto L_0x0985
        L_0x0946:
            r69 = r5
            r45 = r7
            r46 = r9
            r47 = r15
            r9 = r19
            r7 = r21
            r67 = r24
            r15 = r37
            r68 = r43
            r19 = r1
            r24 = r8
            r21 = r11
            r11 = r72
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25877w()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)
            boolean r3 = r19.mo28298q()
            if (r3 == 0) goto L_0x097b
            int r3 = r19.mo28295n()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x097c
        L_0x097b:
            r8 = 0
        L_0x097c:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo25910a(r4, r2, r3)
        L_0x0985:
            r2 = r7
            r19 = r9
            r3 = r11
            r5 = r15
            r11 = r21
            r8 = r24
            r7 = r45
            r9 = r46
            r15 = r47
            r4 = r67
            r6 = r68
            r48 = r69
            goto L_0x0751
        L_0x099c:
            r43 = r6
            r44 = r8
            r46 = r9
            r49 = r14
            r47 = r15
            r12 = r16
            r8 = r17
            r10 = r41
            goto L_0x0663
        L_0x09ae:
            r7 = r71
            r9 = r3
            r8 = r5
            r6 = r10
            r2 = r35
            r0 = r39
            r1 = r40
            r17 = r43
            r21 = r44
            r13 = r46
            r23 = r47
            r14 = r48
            r15 = r49
            r10 = r4
            goto L_0x0368
        L_0x09c8:
            r11 = r9
            r67 = r10
            r46 = r13
            r69 = r14
            r14 = r15
            r68 = r17
            r24 = r21
            r47 = r23
            r15 = r8
            boolean r0 = r74.isEmpty()
            if (r0 != 0) goto L_0x0d3d
            e.e.a r0 = new e.e.a
            r0.<init>()
            java.util.Iterator r1 = r74.iterator()
        L_0x09e6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0d3d
            java.lang.Object r2 = r1.next()
            g.j.a.a.d.g.x0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11367x0) r2
            java.lang.String r3 = r2.mo29128n()
            java.lang.Object r3 = r0.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0a18
            com.google.android.gms.measurement.internal.n9 r3 = r71.mo25890p()
            java.lang.String r4 = r2.mo29128n()
            java.util.Map r3 = r3.mo26007h(r11, r4)
            if (r3 != 0) goto L_0x0a11
            e.e.a r3 = new e.e.a
            r3.<init>()
        L_0x0a11:
            java.lang.String r4 = r2.mo29128n()
            r0.put(r4, r3)
        L_0x0a18:
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0a20:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0d37
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r6 = r14.contains(r6)
            if (r6 == 0) goto L_0x0a4a
            com.google.android.gms.measurement.internal.k3 r6 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo25869B()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo25909a(r15, r5)
            goto L_0x0a20
        L_0x0a4a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = r47
            java.lang.Object r6 = r7.get(r6)
            java.util.BitSet r6 = (java.util.BitSet) r6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = r68
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            if (r25 == 0) goto L_0x0a81
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r12 = r24
            java.lang.Object r10 = r12.get(r10)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r73 = r1
            r1 = r67
            java.lang.Object r13 = r1.get(r13)
            java.util.Map r13 = (java.util.Map) r13
            r16 = r0
            goto L_0x0a8b
        L_0x0a81:
            r73 = r1
            r12 = r24
            r1 = r67
            r16 = r0
            r10 = 0
            r13 = 0
        L_0x0a8b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r74 = r4
            r4 = r46
            java.lang.Object r0 = r4.get(r0)
            g.j.a.a.d.g.n0 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r0
            if (r0 != 0) goto L_0x0ae2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            g.j.a.a.d.g.n0$a r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11225n0.m35756u()
            r8 = 1
            r6.mo28724a(r8)
            g.j.a.a.d.g.p5 r6 = r6.mo28446l0()
            g.j.a.a.d.g.n0 r6 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r6
            r4.put(r0, r6)
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.put(r0, r6)
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9.put(r0, r8)
            if (r25 == 0) goto L_0x0ae2
            e.e.a r10 = new e.e.a
            r10.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r12.put(r0, r10)
            e.e.a r13 = new e.e.a
            r13.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r0, r13)
        L_0x0ae2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r3.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0af0:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0d1d
            java.lang.Object r17 = r0.next()
            r18 = r0
            r0 = r17
            g.j.a.a.d.g.e0 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11085e0) r0
            r17 = r3
            com.google.android.gms.measurement.internal.k3 r3 = r71.mo25898e()
            r37 = r15
            r15 = 2
            boolean r3 = r3.mo25873a(r15)
            if (r3 == 0) goto L_0x0b5a
            com.google.android.gms.measurement.internal.k3 r3 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25869B()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            boolean r19 = r0.mo28417p()
            if (r19 == 0) goto L_0x0b2e
            int r19 = r0.mo28415n()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r67 = r1
            r11 = r19
            goto L_0x0b31
        L_0x0b2e:
            r67 = r1
            r11 = 0
        L_0x0b31:
            com.google.android.gms.measurement.internal.i3 r1 = r71.mo25902l()
            r44 = r12
            java.lang.String r12 = r0.mo28416o()
            java.lang.String r1 = r1.mo25797c(r12)
            java.lang.String r12 = "Evaluating filter. audience, filter, property"
            r3.mo25911a(r12, r15, r11, r1)
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            com.google.android.gms.measurement.internal.u8 r3 = r71.mo25888n()
            java.lang.String r3 = r3.mo26116a(r0)
            r11 = r69
            r1.mo25909a(r11, r3)
            goto L_0x0b60
        L_0x0b5a:
            r67 = r1
            r44 = r12
            r11 = r69
        L_0x0b60:
            boolean r1 = r0.mo28417p()
            if (r1 == 0) goto L_0x0cd6
            int r1 = r0.mo28415n()
            r3 = 256(0x100, float:3.59E-43)
            if (r1 <= r3) goto L_0x0b70
            goto L_0x0cd6
        L_0x0b70:
            java.lang.String r1 = "Property filter result"
            if (r25 == 0) goto L_0x0c5f
            boolean r12 = r0.mo28418q()
            boolean r15 = r0.mo28419r()
            if (r27 == 0) goto L_0x0b87
            boolean r19 = r0.mo28421t()
            if (r19 == 0) goto L_0x0b87
            r19 = 1
            goto L_0x0b89
        L_0x0b87:
            r19 = 0
        L_0x0b89:
            if (r12 != 0) goto L_0x0b92
            if (r15 != 0) goto L_0x0b92
            if (r19 == 0) goto L_0x0b90
            goto L_0x0b92
        L_0x0b90:
            r12 = 0
            goto L_0x0b93
        L_0x0b92:
            r12 = 1
        L_0x0b93:
            int r3 = r0.mo28415n()
            boolean r3 = r6.get(r3)
            if (r3 == 0) goto L_0x0bd0
            if (r12 != 0) goto L_0x0bd0
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r12 = r0.mo28417p()
            if (r12 == 0) goto L_0x0bba
            int r0 = r0.mo28415n()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0bbb
        L_0x0bba:
            r0 = 0
        L_0x0bbb:
            java.lang.String r12 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo25910a(r12, r3, r0)
            r69 = r11
            r3 = r17
            r0 = r18
            r15 = r37
            r12 = r44
            r1 = r67
            r11 = r72
            goto L_0x0af0
        L_0x0bd0:
            r3 = r71
            java.lang.Boolean r20 = r3.m31289a(r0, r2)
            com.google.android.gms.measurement.internal.k3 r21 = r71.mo25898e()
            r48 = r11
            com.google.android.gms.measurement.internal.m3 r11 = r21.mo25869B()
            r43 = r9
            if (r20 != 0) goto L_0x0be7
            r9 = r30
            goto L_0x0be9
        L_0x0be7:
            r9 = r20
        L_0x0be9:
            r11.mo25909a(r1, r9)
            if (r20 != 0) goto L_0x0bf7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r14.add(r0)
            goto L_0x0c90
        L_0x0bf7:
            int r1 = r0.mo28415n()
            r8.set(r1)
            if (r27 == 0) goto L_0x0c08
            if (r19 == 0) goto L_0x0c08
            boolean r1 = r20.booleanValue()
            if (r1 == 0) goto L_0x0c90
        L_0x0c08:
            if (r26 == 0) goto L_0x0c26
            int r1 = r0.mo28415n()
            boolean r1 = r6.get(r1)
            if (r1 == 0) goto L_0x0c1a
            boolean r1 = r0.mo28418q()
            if (r1 == 0) goto L_0x0c31
        L_0x0c1a:
            int r1 = r0.mo28415n()
            boolean r9 = r20.booleanValue()
            r6.set(r1, r9)
            goto L_0x0c31
        L_0x0c26:
            int r1 = r0.mo28415n()
            boolean r9 = r20.booleanValue()
            r6.set(r1, r9)
        L_0x0c31:
            boolean r1 = r20.booleanValue()
            if (r1 == 0) goto L_0x0c90
            if (r12 == 0) goto L_0x0c90
            boolean r1 = r2.mo29135u()
            if (r1 == 0) goto L_0x0c90
            long r11 = r2.mo29136v()
            if (r27 == 0) goto L_0x0c4d
            if (r19 == 0) goto L_0x0c4d
            if (r29 == 0) goto L_0x0c4d
            long r11 = r29.longValue()
        L_0x0c4d:
            if (r15 == 0) goto L_0x0c57
            int r0 = r0.mo28415n()
            m31297b(r13, r0, r11)
            goto L_0x0c90
        L_0x0c57:
            int r0 = r0.mo28415n()
            m31296a(r10, r0, r11)
            goto L_0x0c90
        L_0x0c5f:
            r3 = r71
            r43 = r9
            r48 = r11
            int r9 = r0.mo28415n()
            boolean r9 = r6.get(r9)
            if (r9 == 0) goto L_0x0ca2
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25869B()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r11 = r0.mo28417p()
            if (r11 == 0) goto L_0x0c8a
            int r0 = r0.mo28415n()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0c8b
        L_0x0c8a:
            r0 = 0
        L_0x0c8b:
            java.lang.String r11 = "Property filter already evaluated true. audience ID, filter ID"
            r1.mo25910a(r11, r9, r0)
        L_0x0c90:
            r11 = r72
            r3 = r17
            r0 = r18
            r15 = r37
            r9 = r43
            r12 = r44
            r69 = r48
            r1 = r67
            goto L_0x0af0
        L_0x0ca2:
            java.lang.Boolean r9 = r3.m31289a(r0, r2)
            com.google.android.gms.measurement.internal.k3 r11 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo25869B()
            if (r9 != 0) goto L_0x0cb3
            r12 = r30
            goto L_0x0cb4
        L_0x0cb3:
            r12 = r9
        L_0x0cb4:
            r11.mo25909a(r1, r12)
            if (r9 != 0) goto L_0x0cc1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r14.add(r0)
            goto L_0x0c90
        L_0x0cc1:
            int r1 = r0.mo28415n()
            r8.set(r1)
            boolean r1 = r9.booleanValue()
            if (r1 == 0) goto L_0x0c90
            int r0 = r0.mo28415n()
            r6.set(r0)
            goto L_0x0c90
        L_0x0cd6:
            r3 = r71
            r43 = r9
            r48 = r11
            com.google.android.gms.measurement.internal.k3 r1 = r71.mo25898e()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo25877w()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)
            boolean r8 = r0.mo28417p()
            if (r8 == 0) goto L_0x0cf7
            int r0 = r0.mo28415n()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0cf8
        L_0x0cf7:
            r8 = 0
        L_0x0cf8:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r1.mo25910a(r8, r6, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r14.add(r0)
            r11 = r72
            r1 = r73
            r46 = r4
            r47 = r7
            r0 = r16
            r3 = r17
            r15 = r37
            r68 = r43
            r24 = r44
            r69 = r48
            goto L_0x0d33
        L_0x0d1d:
            r17 = r3
            r3 = r71
            r11 = r72
            r67 = r1
            r46 = r4
            r47 = r7
            r68 = r9
            r24 = r12
            r0 = r16
            r3 = r17
            r1 = r73
        L_0x0d33:
            r4 = r74
            goto L_0x0a20
        L_0x0d37:
            r3 = r71
            r11 = r72
            goto L_0x09e6
        L_0x0d3d:
            r3 = r71
            r44 = r24
            r4 = r46
            r7 = r47
            r43 = r68
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0d54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0fe7
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            boolean r5 = r14.contains(r5)
            if (r5 != 0) goto L_0x0fdd
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r4.get(r5)
            g.j.a.a.d.g.n0 r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r5
            if (r5 != 0) goto L_0x0d7f
            g.j.a.a.d.g.n0$a r5 = p163g.p449j.p450a.p451a.p457d.p464g.C11225n0.m35756u()
            goto L_0x0d85
        L_0x0d7f:
            g.j.a.a.d.g.e4$a r5 = r5.mo28436j()
            g.j.a.a.d.g.n0$a r5 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0.C11226a) r5
        L_0x0d85:
            r5.mo28721a(r0)
            g.j.a.a.d.g.v0$a r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11339v0.m36504z()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r7.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            java.util.List r8 = com.google.android.gms.measurement.internal.C10211u8.m31850a(r8)
            r6.mo29065b(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = r43
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            java.util.List r8 = com.google.android.gms.measurement.internal.C10211u8.m31850a(r8)
            r6.mo29063a(r8)
            if (r25 == 0) goto L_0x0f45
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = r44
            java.lang.Object r8 = r10.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            java.util.List r8 = m31295a(r8)
            r6.mo29066c(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = r67
            java.lang.Object r8 = r11.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0dde
            java.util.List r8 = java.util.Collections.emptyList()
            r73 = r2
            r47 = r7
            r12 = r8
            goto L_0x0e4d
        L_0x0dde:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r8.size()
            r12.<init>(r13)
            java.util.Set r13 = r8.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0def:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0e49
            java.lang.Object r15 = r13.next()
            java.lang.Integer r15 = (java.lang.Integer) r15
            r73 = r2
            g.j.a.a.d.g.w0$a r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11353w0.m36596t()
            int r3 = r15.intValue()
            r2.mo29085a(r3)
            java.lang.Object r3 = r8.get(r15)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0e33
            java.util.Collections.sort(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0e17:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x0e33
            java.lang.Object r15 = r3.next()
            java.lang.Long r15 = (java.lang.Long) r15
            r47 = r7
            r74 = r8
            long r7 = r15.longValue()
            r2.mo29086a(r7)
            r8 = r74
            r7 = r47
            goto L_0x0e17
        L_0x0e33:
            r47 = r7
            r74 = r8
            g.j.a.a.d.g.p5 r2 = r2.mo28446l0()
            g.j.a.a.d.g.w0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0) r2
            r12.add(r2)
            r3 = r71
            r2 = r73
            r8 = r74
            r7 = r47
            goto L_0x0def
        L_0x0e49:
            r73 = r2
            r47 = r7
        L_0x0e4d:
            if (r26 == 0) goto L_0x0e63
            boolean r2 = r5.mo28726j()
            if (r2 == 0) goto L_0x0e63
            g.j.a.a.d.g.v0 r2 = r5.mo28727k()
            java.util.List r2 = r2.mo29060t()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0e66
        L_0x0e63:
            r15 = 0
            goto L_0x0f41
        L_0x0e66:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r12)
            e.e.a r7 = new e.e.a
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0e74:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0ea8
            java.lang.Object r8 = r2.next()
            g.j.a.a.d.g.w0 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0) r8
            boolean r12 = r8.mo29082o()
            if (r12 == 0) goto L_0x0ea6
            int r12 = r8.mo29084q()
            if (r12 <= 0) goto L_0x0ea6
            int r12 = r8.mo29081n()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r8.mo29084q()
            r15 = 1
            int r13 = r13 - r15
            long r16 = r8.mo29080b(r13)
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            r7.put(r12, r8)
            goto L_0x0e74
        L_0x0ea6:
            r15 = 1
            goto L_0x0e74
        L_0x0ea8:
            r15 = 1
            r2 = 0
        L_0x0eaa:
            int r8 = r3.size()
            if (r2 >= r8) goto L_0x0f05
            java.lang.Object r8 = r3.get(r2)
            g.j.a.a.d.g.w0 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0) r8
            boolean r12 = r8.mo29082o()
            if (r12 == 0) goto L_0x0ec5
            int r12 = r8.mo29081n()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0ec6
        L_0x0ec5:
            r12 = 0
        L_0x0ec6:
            java.lang.Object r12 = r7.remove(r12)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L_0x0f00
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            long r16 = r12.longValue()
            r15 = 0
            long r18 = r8.mo29080b(r15)
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0ee3
            r13.add(r12)
        L_0x0ee3:
            java.util.List r12 = r8.mo29083p()
            r13.addAll(r12)
            g.j.a.a.d.g.e4$a r8 = r8.mo28436j()
            g.j.a.a.d.g.w0$a r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0.C11354a) r8
            r8.mo29088i()
            r8.mo29087a(r13)
            g.j.a.a.d.g.p5 r8 = r8.mo28446l0()
            g.j.a.a.d.g.w0 r8 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0) r8
            r3.set(r2, r8)
            goto L_0x0f01
        L_0x0f00:
            r15 = 0
        L_0x0f01:
            int r2 = r2 + 1
            r15 = 1
            goto L_0x0eaa
        L_0x0f05:
            r15 = 0
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0f0e:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0f40
            java.lang.Object r8 = r2.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            g.j.a.a.d.g.w0$a r12 = p163g.p449j.p450a.p451a.p457d.p464g.C11353w0.m36596t()
            int r13 = r8.intValue()
            r12.mo29085a(r13)
            java.lang.Object r8 = r7.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            r74 = r7
            long r7 = r8.longValue()
            r12.mo29086a(r7)
            g.j.a.a.d.g.p5 r7 = r12.mo28446l0()
            g.j.a.a.d.g.w0 r7 = (p163g.p449j.p450a.p451a.p457d.p464g.C11353w0) r7
            r3.add(r7)
            r7 = r74
            goto L_0x0f0e
        L_0x0f40:
            r12 = r3
        L_0x0f41:
            r6.mo29067d(r12)
            goto L_0x0f4e
        L_0x0f45:
            r73 = r2
            r47 = r7
            r10 = r44
            r11 = r67
            r15 = 0
        L_0x0f4e:
            r5.mo28722a(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            g.j.a.a.d.g.p5 r3 = r5.mo28446l0()
            g.j.a.a.d.g.n0 r3 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r3
            r4.put(r2, r3)
            g.j.a.a.d.g.p5 r2 = r5.mo28446l0()
            g.j.a.a.d.g.n0 r2 = (p163g.p449j.p450a.p451a.p457d.p464g.C11225n0) r2
            r1.add(r2)
            com.google.android.gms.measurement.internal.n9 r2 = r71.mo25890p()
            g.j.a.a.d.g.v0 r3 = r5.mo28725i()
            r2.mo25969t()
            r2.mo25662j()
            com.google.android.gms.common.internal.C9908u.m30863b(r72)
            com.google.android.gms.common.internal.C9908u.m30853a(r3)
            byte[] r3 = r3.mo28656f()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "app_id"
            r7 = r72
            r5.put(r6, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "audience_id"
            r5.put(r6, r0)
            java.lang.String r0 = "current_results"
            r5.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo26011x()     // Catch:{ SQLiteException -> 0x0fbf }
            java.lang.String r3 = "audience_filter_values"
            r6 = 5
            r8 = 0
            long r5 = r0.insertWithOnConflict(r3, r8, r5, r6)     // Catch:{ SQLiteException -> 0x0fbd }
            r12 = -1
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0fd2
            com.google.android.gms.measurement.internal.k3 r0 = r2.mo25898e()     // Catch:{ SQLiteException -> 0x0fbd }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()     // Catch:{ SQLiteException -> 0x0fbd }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)     // Catch:{ SQLiteException -> 0x0fbd }
            r0.mo25909a(r3, r5)     // Catch:{ SQLiteException -> 0x0fbd }
            goto L_0x0fd2
        L_0x0fbd:
            r0 = move-exception
            goto L_0x0fc1
        L_0x0fbf:
            r0 = move-exception
            r8 = 0
        L_0x0fc1:
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r72)
            java.lang.String r5 = "Error storing filter results. appId"
            r2.mo25910a(r5, r3, r0)
        L_0x0fd2:
            r3 = r71
            r2 = r73
            r43 = r9
            r44 = r10
            r67 = r11
            goto L_0x0fe3
        L_0x0fdd:
            r47 = r7
            r7 = r72
            r3 = r71
        L_0x0fe3:
            r7 = r47
            goto L_0x0d54
        L_0x0fe7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10050f9.mo25759a(java.lang.String, java.util.List, java.util.List):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo25760u() {
        return false;
    }

    /* renamed from: a */
    private final Boolean m31288a(C11035b0 b0Var, String str, List<C11281r0> list, long j) {
        Boolean bool;
        boolean s = b0Var.mo28300s();
        Boolean valueOf = Boolean.valueOf(false);
        if (s) {
            Boolean a = m31287a(j, b0Var.mo28301t());
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return valueOf;
            }
        }
        HashSet hashSet = new HashSet();
        for (C11050c0 c0Var : b0Var.mo28299r()) {
            if (c0Var.mo28338t().isEmpty()) {
                mo25898e().mo25877w().mo25909a("null or empty param name in filter. event", mo25902l().mo25795a(str));
                return null;
            }
            hashSet.add(c0Var.mo28338t());
        }
        C3926a aVar = new C3926a();
        for (C11281r0 r0Var : list) {
            if (hashSet.contains(r0Var.mo28849n())) {
                if (r0Var.mo28852q()) {
                    aVar.put(r0Var.mo28849n(), r0Var.mo28852q() ? Long.valueOf(r0Var.mo28853r()) : null);
                } else if (r0Var.mo28854s()) {
                    aVar.put(r0Var.mo28849n(), r0Var.mo28854s() ? Double.valueOf(r0Var.mo28855t()) : null);
                } else if (r0Var.mo28850o()) {
                    aVar.put(r0Var.mo28849n(), r0Var.mo28851p());
                } else {
                    mo25898e().mo25877w().mo25910a("Unknown value for param. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(r0Var.mo28849n()));
                    return null;
                }
            }
        }
        Iterator it = b0Var.mo28299r().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return Boolean.valueOf(true);
            }
            C11050c0 c0Var2 = (C11050c0) it.next();
            if (!c0Var2.mo28336r() || !c0Var2.mo28337s()) {
                z = false;
            }
            String t = c0Var2.mo28338t();
            if (t.isEmpty()) {
                mo25898e().mo25877w().mo25909a("Event has empty param name. event", mo25902l().mo25795a(str));
                return null;
            }
            Object obj = aVar.get(t);
            if (obj instanceof Long) {
                if (!c0Var2.mo28334p()) {
                    mo25898e().mo25877w().mo25910a("No number filter for long param. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                    return null;
                }
                Boolean a2 = m31287a(((Long) obj).longValue(), c0Var2.mo28335q());
                if (a2 == null) {
                    return null;
                }
                if (a2.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj instanceof Double) {
                if (!c0Var2.mo28334p()) {
                    mo25898e().mo25877w().mo25910a("No number filter for double param. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                    return null;
                }
                Boolean a3 = m31286a(((Double) obj).doubleValue(), c0Var2.mo28335q());
                if (a3 == null) {
                    return null;
                }
                if (a3.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj instanceof String) {
                if (c0Var2.mo28332n()) {
                    bool = m31293a((String) obj, c0Var2.mo28333o());
                } else if (c0Var2.mo28334p()) {
                    String str2 = (String) obj;
                    if (C10211u8.m31857a(str2)) {
                        bool = m31291a(str2, c0Var2.mo28335q());
                    } else {
                        mo25898e().mo25877w().mo25910a("Invalid param value for number filter. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                        return null;
                    }
                } else {
                    mo25898e().mo25877w().mo25910a("No filter for String param. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if (bool.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj == null) {
                mo25898e().mo25869B().mo25910a("Missing param for filter. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                return valueOf;
            } else {
                mo25898e().mo25877w().mo25910a("Unknown param type. event, param", mo25902l().mo25795a(str), mo25902l().mo25796b(t));
                return null;
            }
        }
    }

    /* renamed from: a */
    private final Boolean m31289a(C11085e0 e0Var, C11367x0 x0Var) {
        C11050c0 u = e0Var.mo28422u();
        boolean s = u.mo28337s();
        if (x0Var.mo29131q()) {
            if (u.mo28334p()) {
                return m31290a(m31287a(x0Var.mo29132r(), u.mo28335q()), s);
            }
            mo25898e().mo25877w().mo25909a("No number filter for long property. property", mo25902l().mo25797c(x0Var.mo29128n()));
            return null;
        } else if (x0Var.mo29133s()) {
            if (u.mo28334p()) {
                return m31290a(m31286a(x0Var.mo29134t(), u.mo28335q()), s);
            }
            mo25898e().mo25877w().mo25909a("No number filter for double property. property", mo25902l().mo25797c(x0Var.mo29128n()));
            return null;
        } else if (!x0Var.mo29129o()) {
            mo25898e().mo25877w().mo25909a("User property has no value, property", mo25902l().mo25797c(x0Var.mo29128n()));
            return null;
        } else if (u.mo28332n()) {
            return m31290a(m31293a(x0Var.mo29130p(), u.mo28333o()), s);
        } else {
            if (!u.mo28334p()) {
                mo25898e().mo25877w().mo25909a("No string or number filter defined. property", mo25902l().mo25797c(x0Var.mo29128n()));
            } else if (C10211u8.m31857a(x0Var.mo29130p())) {
                return m31290a(m31291a(x0Var.mo29130p(), u.mo28335q()), s);
            } else {
                mo25898e().mo25877w().mo25910a("Invalid user property value for Numeric number filter. property, value", mo25902l().mo25797c(x0Var.mo29128n()), x0Var.mo29130p());
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m31290a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    private final Boolean m31293a(String str, C11105f0 f0Var) {
        String str2;
        List list;
        C9908u.m30853a(f0Var);
        if (str == null || !f0Var.mo28497n() || f0Var.mo28498o() == C11106a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (f0Var.mo28498o() == C11106a.IN_LIST) {
            if (f0Var.mo28504u() == 0) {
                return null;
            }
        } else if (!f0Var.mo28499p()) {
            return null;
        }
        C11106a o = f0Var.mo28498o();
        boolean s = f0Var.mo28502s();
        if (s || o == C11106a.REGEXP || o == C11106a.IN_LIST) {
            str2 = f0Var.mo28500q();
        } else {
            str2 = f0Var.mo28500q().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (f0Var.mo28504u() == 0) {
            list = null;
        } else {
            List<String> t = f0Var.mo28503t();
            if (!s) {
                ArrayList arrayList = new ArrayList(t.size());
                for (String upperCase : t) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                t = Collections.unmodifiableList(arrayList);
            }
            list = t;
        }
        return m31292a(str, o, s, str3, list, o == C11106a.REGEXP ? str3 : null);
    }

    /* renamed from: a */
    private final Boolean m31292a(String str, C11106a aVar, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (aVar == C11106a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != C11106a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C10039e9.f23411a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo25898e().mo25877w().mo25909a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final Boolean m31287a(long j, C11069d0 d0Var) {
        try {
            return m31294a(new BigDecimal(j), d0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m31286a(double d, C11069d0 d0Var) {
        try {
            return m31294a(new BigDecimal(d), d0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m31291a(String str, C11069d0 d0Var) {
        if (!C10211u8.m31857a(str)) {
            return null;
        }
        try {
            return m31294a(new BigDecimal(str), d0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m31294a(java.math.BigDecimal r9, p163g.p449j.p450a.p451a.p457d.p464g.C11069d0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.C9908u.m30853a(r10)
            boolean r0 = r10.mo28370n()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            g.j.a.a.d.g.d0$b r0 = r10.mo28371o()
            g.j.a.a.d.g.d0$b r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11069d0.C11071b.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            g.j.a.a.d.g.d0$b r0 = r10.mo28371o()
            g.j.a.a.d.g.d0$b r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11069d0.C11071b.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.mo28376t()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.mo28378v()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.mo28374r()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            g.j.a.a.d.g.d0$b r0 = r10.mo28371o()
            g.j.a.a.d.g.d0$b r2 = r10.mo28371o()
            g.j.a.a.d.g.d0$b r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11069d0.C11071b.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.mo28377u()
            boolean r2 = com.google.android.gms.measurement.internal.C10211u8.m31857a(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.mo28379w()
            boolean r2 = com.google.android.gms.measurement.internal.C10211u8.m31857a(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.mo28377u()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.mo28379w()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.mo28375s()
            boolean r2 = com.google.android.gms.measurement.internal.C10211u8.m31857a(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.mo28375s()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            g.j.a.a.d.g.d0$b r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11069d0.C11071b.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.C10039e9.f23412b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10050f9.m31294a(java.math.BigDecimal, g.j.a.a.d.g.d0, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static List<C11239o0> m31295a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            C11240a r = C11239o0.m35806r();
            r.mo28742a(intValue2);
            r.mo28743a(((Long) map.get(Integer.valueOf(intValue2))).longValue());
            arrayList.add((C11239o0) r.mo28446l0());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m31296a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }
}
