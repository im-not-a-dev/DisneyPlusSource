package com.airbnb.lottie.p021v;

import android.graphics.Rect;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1287l;
import com.airbnb.lottie.p016t.p019l.C1320d;
import com.airbnb.lottie.p016t.p019l.C1320d.C1321a;
import com.airbnb.lottie.p016t.p019l.C1320d.C1322b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.s */
/* compiled from: LayerParser */
public class C1362s {
    /* renamed from: a */
    public static C1320d m6673a(C1182d dVar) {
        C1182d dVar2 = dVar;
        Rect a = dVar.mo6026a();
        List emptyList = Collections.emptyList();
        C1321a aVar = C1321a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C1287l lVar = r4;
        C1287l lVar2 = new C1287l();
        C1320d dVar3 = new C1320d(emptyList, dVar2, "__container", -1, aVar, -1, null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, a.width(), a.height(), null, null, Collections.emptyList(), C1322b.NONE, null, false);
        return dVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0281  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.p016t.p019l.C1320d m6672a(android.util.JsonReader r39, com.airbnb.lottie.C1182d r40) throws java.io.IOException {
        /*
            r7 = r40
            com.airbnb.lottie.t.l.d$b r0 = com.airbnb.lottie.p016t.p019l.C1320d.C1322b.NONE
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r39.beginObject()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            r2 = 0
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r3 = 0
            java.lang.String r4 = "UNSET"
            r5 = 0
            r13 = -1
            r28 = r0
            r16 = r2
            r17 = r16
            r30 = r17
            r31 = r30
            r32 = r31
            r33 = r32
            r18 = r5
            r25 = r13
            r0 = 0
            r1 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r29 = 0
            r14 = r33
            r13 = r4
        L_0x004b:
            boolean r2 = r39.hasNext()
            if (r2 == 0) goto L_0x0347
            java.lang.String r2 = r39.nextName()
            int r4 = r2.hashCode()
            java.lang.String r5 = "nm"
            r6 = 1
            switch(r4) {
                case -995424086: goto L_0x0158;
                case -903568142: goto L_0x014d;
                case 104: goto L_0x0142;
                case 116: goto L_0x0137;
                case 119: goto L_0x012c;
                case 3177: goto L_0x0121;
                case 3233: goto L_0x0116;
                case 3324: goto L_0x010b;
                case 3367: goto L_0x0100;
                case 3432: goto L_0x00f4;
                case 3519: goto L_0x00eb;
                case 3553: goto L_0x00df;
                case 3664: goto L_0x00d4;
                case 3669: goto L_0x00c9;
                case 3679: goto L_0x00bd;
                case 3681: goto L_0x00b1;
                case 3684: goto L_0x00a6;
                case 3705: goto L_0x009a;
                case 3712: goto L_0x008e;
                case 3717: goto L_0x0083;
                case 104415: goto L_0x0078;
                case 108390670: goto L_0x006d;
                case 1441620890: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0162
        L_0x0061:
            java.lang.String r4 = "masksProperties"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 10
            goto L_0x0163
        L_0x006d:
            java.lang.String r4 = "refId"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 2
            goto L_0x0163
        L_0x0078:
            java.lang.String r4 = "ind"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 1
            goto L_0x0163
        L_0x0083:
            java.lang.String r4 = "ty"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 3
            goto L_0x0163
        L_0x008e:
            java.lang.String r4 = "tt"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 9
            goto L_0x0163
        L_0x009a:
            java.lang.String r4 = "tm"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 20
            goto L_0x0163
        L_0x00a6:
            java.lang.String r4 = "sw"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 5
            goto L_0x0163
        L_0x00b1:
            java.lang.String r4 = "st"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 15
            goto L_0x0163
        L_0x00bd:
            java.lang.String r4 = "sr"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 14
            goto L_0x0163
        L_0x00c9:
            java.lang.String r4 = "sh"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 6
            goto L_0x0163
        L_0x00d4:
            java.lang.String r4 = "sc"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 7
            goto L_0x0163
        L_0x00df:
            java.lang.String r4 = "op"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 19
            goto L_0x0163
        L_0x00eb:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0162
            r2 = 0
            goto L_0x0163
        L_0x00f4:
            java.lang.String r4 = "ks"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 8
            goto L_0x0163
        L_0x0100:
            java.lang.String r4 = "ip"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 18
            goto L_0x0163
        L_0x010b:
            java.lang.String r4 = "hd"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 22
            goto L_0x0163
        L_0x0116:
            java.lang.String r4 = "ef"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 13
            goto L_0x0163
        L_0x0121:
            java.lang.String r4 = "cl"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 21
            goto L_0x0163
        L_0x012c:
            java.lang.String r4 = "w"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 16
            goto L_0x0163
        L_0x0137:
            java.lang.String r4 = "t"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 12
            goto L_0x0163
        L_0x0142:
            java.lang.String r4 = "h"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 17
            goto L_0x0163
        L_0x014d:
            java.lang.String r4 = "shapes"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 11
            goto L_0x0163
        L_0x0158:
            java.lang.String r4 = "parent"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0162
            r2 = 4
            goto L_0x0163
        L_0x0162:
            r2 = -1
        L_0x0163:
            switch(r2) {
                case 0: goto L_0x033d;
                case 1: goto L_0x0333;
                case 2: goto L_0x032c;
                case 3: goto L_0x0314;
                case 4: goto L_0x030a;
                case 5: goto L_0x02f9;
                case 6: goto L_0x02e8;
                case 7: goto L_0x02dd;
                case 8: goto L_0x02d5;
                case 9: goto L_0x02c4;
                case 10: goto L_0x02a5;
                case 11: goto L_0x028b;
                case 12: goto L_0x022b;
                case 13: goto L_0x01cd;
                case 14: goto L_0x01c4;
                case 15: goto L_0x01b9;
                case 16: goto L_0x01a7;
                case 17: goto L_0x0195;
                case 18: goto L_0x018c;
                case 19: goto L_0x0183;
                case 20: goto L_0x017b;
                case 21: goto L_0x0172;
                case 22: goto L_0x016d;
                default: goto L_0x0166;
            }
        L_0x0166:
            r2 = r39
            r39.skipValue()
            goto L_0x0343
        L_0x016d:
            boolean r29 = r39.nextBoolean()
            goto L_0x0177
        L_0x0172:
            java.lang.String r2 = r39.nextString()
            r14 = r2
        L_0x0177:
            r2 = r39
            goto L_0x0343
        L_0x017b:
            r2 = r39
            com.airbnb.lottie.t.j.b r33 = com.airbnb.lottie.p021v.C1339d.m6621a(r2, r7, r3)
            goto L_0x0343
        L_0x0183:
            r2 = r39
            double r4 = r39.nextDouble()
            float r1 = (float) r4
            goto L_0x0343
        L_0x018c:
            r2 = r39
            double r4 = r39.nextDouble()
            float r0 = (float) r4
            goto L_0x0343
        L_0x0195:
            r2 = r39
            int r4 = r39.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.p022w.C1375f.m6732a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r24 = r4
            goto L_0x0343
        L_0x01a7:
            r2 = r39
            int r4 = r39.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.p022w.C1375f.m6732a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r23 = r4
            goto L_0x0343
        L_0x01b9:
            r2 = r39
            double r4 = r39.nextDouble()
            float r4 = (float) r4
            r27 = r4
            goto L_0x0343
        L_0x01c4:
            r2 = r39
            double r4 = r39.nextDouble()
            float r15 = (float) r4
            goto L_0x0343
        L_0x01cd:
            r2 = r39
            r39.beginArray()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01d7:
            boolean r6 = r39.hasNext()
            if (r6 == 0) goto L_0x0212
            r39.beginObject()
        L_0x01e0:
            boolean r6 = r39.hasNext()
            if (r6 == 0) goto L_0x020c
            java.lang.String r6 = r39.nextName()
            int r3 = r6.hashCode()
            r11 = 3519(0xdbf, float:4.931E-42)
            if (r3 == r11) goto L_0x01f3
            goto L_0x01fb
        L_0x01f3:
            boolean r3 = r6.equals(r5)
            if (r3 == 0) goto L_0x01fb
            r3 = 0
            goto L_0x01fc
        L_0x01fb:
            r3 = -1
        L_0x01fc:
            if (r3 == 0) goto L_0x0202
            r39.skipValue()
            goto L_0x0209
        L_0x0202:
            java.lang.String r3 = r39.nextString()
            r4.add(r3)
        L_0x0209:
            r3 = 0
            r11 = 0
            goto L_0x01e0
        L_0x020c:
            r39.endObject()
            r3 = 0
            r11 = 0
            goto L_0x01d7
        L_0x0212:
            r39.endArray()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r7.mo6030a(r3)
            goto L_0x0343
        L_0x022b:
            r2 = r39
            r39.beginObject()
        L_0x0230:
            boolean r3 = r39.hasNext()
            if (r3 == 0) goto L_0x0286
            java.lang.String r3 = r39.nextName()
            int r4 = r3.hashCode()
            r5 = 97
            if (r4 == r5) goto L_0x0251
            r5 = 100
            if (r4 == r5) goto L_0x0247
            goto L_0x025b
        L_0x0247:
            java.lang.String r4 = "d"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x025b
            r3 = 0
            goto L_0x025c
        L_0x0251:
            java.lang.String r4 = "a"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x025b
            r3 = 1
            goto L_0x025c
        L_0x025b:
            r3 = -1
        L_0x025c:
            if (r3 == 0) goto L_0x0281
            if (r3 == r6) goto L_0x0264
            r39.skipValue()
            goto L_0x0230
        L_0x0264:
            r39.beginArray()
            boolean r3 = r39.hasNext()
            if (r3 == 0) goto L_0x0273
            com.airbnb.lottie.t.j.k r3 = com.airbnb.lottie.p021v.C1335b.m6608a(r39, r40)
            r32 = r3
        L_0x0273:
            boolean r3 = r39.hasNext()
            if (r3 == 0) goto L_0x027d
            r39.skipValue()
            goto L_0x0273
        L_0x027d:
            r39.endArray()
            goto L_0x0230
        L_0x0281:
            com.airbnb.lottie.t.j.j r31 = com.airbnb.lottie.p021v.C1339d.m6625b(r39, r40)
            goto L_0x0230
        L_0x0286:
            r39.endObject()
            goto L_0x0343
        L_0x028b:
            r2 = r39
            r39.beginArray()
        L_0x0290:
            boolean r3 = r39.hasNext()
            if (r3 == 0) goto L_0x02a0
            com.airbnb.lottie.t.k.b r3 = com.airbnb.lottie.p021v.C1345g.m6638a(r39, r40)
            if (r3 == 0) goto L_0x0290
            r8.add(r3)
            goto L_0x0290
        L_0x02a0:
            r39.endArray()
            goto L_0x0343
        L_0x02a5:
            r2 = r39
            r39.beginArray()
        L_0x02aa:
            boolean r3 = r39.hasNext()
            if (r3 == 0) goto L_0x02b8
            com.airbnb.lottie.t.k.g r3 = com.airbnb.lottie.p021v.C1364u.m6680a(r39, r40)
            r10.add(r3)
            goto L_0x02aa
        L_0x02b8:
            int r3 = r10.size()
            r7.mo6028a(r3)
            r39.endArray()
            goto L_0x0343
        L_0x02c4:
            r2 = r39
            com.airbnb.lottie.t.l.d$b[] r3 = com.airbnb.lottie.p016t.p019l.C1320d.C1322b.values()
            int r4 = r39.nextInt()
            r28 = r3[r4]
            r7.mo6028a(r6)
            goto L_0x0343
        L_0x02d5:
            r2 = r39
            com.airbnb.lottie.t.j.l r30 = com.airbnb.lottie.p021v.C1337c.m6611a(r39, r40)
            goto L_0x0343
        L_0x02dd:
            r2 = r39
            java.lang.String r3 = r39.nextString()
            int r22 = android.graphics.Color.parseColor(r3)
            goto L_0x0343
        L_0x02e8:
            r2 = r39
            int r3 = r39.nextInt()
            float r3 = (float) r3
            float r4 = com.airbnb.lottie.p022w.C1375f.m6732a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r21 = r3
            goto L_0x0343
        L_0x02f9:
            r2 = r39
            int r3 = r39.nextInt()
            float r3 = (float) r3
            float r4 = com.airbnb.lottie.p022w.C1375f.m6732a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r20 = r3
            goto L_0x0343
        L_0x030a:
            r2 = r39
            int r3 = r39.nextInt()
            long r3 = (long) r3
            r25 = r3
            goto L_0x0343
        L_0x0314:
            r2 = r39
            int r3 = r39.nextInt()
            com.airbnb.lottie.t.l.d$a r4 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.UNKNOWN
            int r4 = r4.ordinal()
            if (r3 >= r4) goto L_0x0329
            com.airbnb.lottie.t.l.d$a[] r4 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.values()
            r16 = r4[r3]
            goto L_0x0343
        L_0x0329:
            com.airbnb.lottie.t.l.d$a r16 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.UNKNOWN
            goto L_0x0343
        L_0x032c:
            r2 = r39
            java.lang.String r17 = r39.nextString()
            goto L_0x0343
        L_0x0333:
            r2 = r39
            int r3 = r39.nextInt()
            long r3 = (long) r3
            r18 = r3
            goto L_0x0343
        L_0x033d:
            r2 = r39
            java.lang.String r13 = r39.nextString()
        L_0x0343:
            r3 = 0
            r11 = 0
            goto L_0x004b
        L_0x0347:
            r2 = r39
            r39.endObject()
            float r11 = r0 / r15
            float r34 = r1 / r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x037a
            com.airbnb.lottie.x.a r5 = new com.airbnb.lottie.x.a
            r4 = 0
            r35 = 0
            java.lang.Float r37 = java.lang.Float.valueOf(r11)
            r0 = r5
            r1 = r40
            r2 = r12
            r3 = r12
            r38 = r5
            r5 = r35
            r35 = r15
            r15 = r6
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r38
            r15.add(r0)
            goto L_0x037d
        L_0x037a:
            r35 = r15
            r15 = r6
        L_0x037d:
            r0 = 0
            int r0 = (r34 > r0 ? 1 : (r34 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0383
            goto L_0x0389
        L_0x0383:
            float r0 = r40.mo6038e()
            r34 = r0
        L_0x0389:
            com.airbnb.lottie.x.a r6 = new com.airbnb.lottie.x.a
            r4 = 0
            java.lang.Float r36 = java.lang.Float.valueOf(r34)
            r0 = r6
            r1 = r40
            r2 = r9
            r3 = r9
            r5 = r11
            r9 = r6
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r9)
            com.airbnb.lottie.x.a r9 = new com.airbnb.lottie.x.a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r2 = r12
            r3 = r12
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x03c3
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x03c8
        L_0x03c3:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.mo6030a(r0)
        L_0x03c8:
            com.airbnb.lottie.t.l.d r34 = new com.airbnb.lottie.t.l.d
            r0 = r34
            r1 = r8
            r2 = r40
            r3 = r13
            r4 = r18
            r6 = r16
            r7 = r25
            r9 = r17
            r11 = r30
            r12 = r20
            r13 = r21
            r14 = r22
            r21 = r15
            r15 = r35
            r16 = r27
            r17 = r23
            r18 = r24
            r19 = r31
            r20 = r32
            r22 = r28
            r23 = r33
            r24 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1362s.m6672a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.t.l.d");
    }
}
