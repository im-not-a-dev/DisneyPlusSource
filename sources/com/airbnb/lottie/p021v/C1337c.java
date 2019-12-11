package com.airbnb.lottie.p021v;

import android.graphics.PointF;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1280e;
import com.airbnb.lottie.p016t.p017j.C1282g;
import com.airbnb.lottie.p016t.p017j.C1284i;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1379d;

/* renamed from: com.airbnb.lottie.v.c */
/* compiled from: AnimatableTransformParser */
public class C1337c {
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0171  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.p016t.p017j.C1287l m6611a(android.util.JsonReader r28, com.airbnb.lottie.C1182d r29) throws java.io.IOException {
        /*
            r0 = r28
            r8 = r29
            android.util.JsonToken r1 = r28.peek()
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_OBJECT
            r10 = 0
            if (r1 != r2) goto L_0x000f
            r11 = 1
            goto L_0x0010
        L_0x000f:
            r11 = 0
        L_0x0010:
            if (r11 == 0) goto L_0x0015
            r28.beginObject()
        L_0x0015:
            r1 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0023:
            boolean r2 = r28.hasNext()
            if (r2 == 0) goto L_0x0194
            java.lang.String r2 = r28.nextName()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 97
            if (r4 == r5) goto L_0x00b8
            r5 = 3242(0xcaa, float:4.543E-42)
            if (r4 == r5) goto L_0x00ae
            r5 = 3656(0xe48, float:5.123E-42)
            if (r4 == r5) goto L_0x00a4
            r5 = 3662(0xe4e, float:5.132E-42)
            if (r4 == r5) goto L_0x0099
            r5 = 3672(0xe58, float:5.146E-42)
            if (r4 == r5) goto L_0x008e
            r5 = 3676(0xe5c, float:5.151E-42)
            if (r4 == r5) goto L_0x0084
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 == r5) goto L_0x007a
            r5 = 112(0x70, float:1.57E-43)
            if (r4 == r5) goto L_0x0070
            r5 = 114(0x72, float:1.6E-43)
            if (r4 == r5) goto L_0x0066
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L_0x005c
            goto L_0x00c2
        L_0x005c:
            java.lang.String r4 = "s"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 2
            goto L_0x00c3
        L_0x0066:
            java.lang.String r4 = "r"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 4
            goto L_0x00c3
        L_0x0070:
            java.lang.String r4 = "p"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 1
            goto L_0x00c3
        L_0x007a:
            java.lang.String r4 = "o"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 5
            goto L_0x00c3
        L_0x0084:
            java.lang.String r4 = "so"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 6
            goto L_0x00c3
        L_0x008e:
            java.lang.String r4 = "sk"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 8
            goto L_0x00c3
        L_0x0099:
            java.lang.String r4 = "sa"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 9
            goto L_0x00c3
        L_0x00a4:
            java.lang.String r4 = "rz"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 3
            goto L_0x00c3
        L_0x00ae:
            java.lang.String r4 = "eo"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 7
            goto L_0x00c3
        L_0x00b8:
            java.lang.String r4 = "a"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00c2
            r2 = 0
            goto L_0x00c3
        L_0x00c2:
            r2 = -1
        L_0x00c3:
            switch(r2) {
                case 0: goto L_0x0171;
                case 1: goto L_0x016a;
                case 2: goto L_0x0163;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00f8;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00db;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00cb;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            r28.skipValue()
            goto L_0x0023
        L_0x00cb:
            com.airbnb.lottie.t.j.b r2 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r8, r10)
            r17 = r2
            goto L_0x0023
        L_0x00d3:
            com.airbnb.lottie.t.j.b r2 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r8, r10)
            r16 = r2
            goto L_0x0023
        L_0x00db:
            com.airbnb.lottie.t.j.b r2 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r8, r10)
            r25 = r2
            goto L_0x0023
        L_0x00e3:
            com.airbnb.lottie.t.j.b r2 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r8, r10)
            r24 = r2
            goto L_0x0023
        L_0x00eb:
            com.airbnb.lottie.t.j.d r2 = com.airbnb.lottie.p021v.C1339d.m6627d(r28, r29)
            r23 = r2
            goto L_0x0023
        L_0x00f3:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.mo6030a(r1)
        L_0x00f8:
            com.airbnb.lottie.t.j.b r18 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r8, r10)
            java.util.List r1 = r18.mo6224b()
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0130
            java.util.List r7 = r18.mo6224b()
            com.airbnb.lottie.x.a r6 = new com.airbnb.lottie.x.a
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r5 = 0
            r19 = 0
            float r1 = r29.mo6038e()
            java.lang.Float r20 = java.lang.Float.valueOf(r1)
            r1 = r6
            r2 = r29
            r9 = r6
            r6 = r19
            r12 = r7
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.add(r9)
            goto L_0x015f
        L_0x0130:
            java.util.List r1 = r18.mo6224b()
            java.lang.Object r1 = r1.get(r10)
            com.airbnb.lottie.x.a r1 = (com.airbnb.lottie.p023x.C1376a) r1
            T r1 = r1.f5053b
            if (r1 != 0) goto L_0x015f
            java.util.List r9 = r18.mo6224b()
            com.airbnb.lottie.x.a r12 = new com.airbnb.lottie.x.a
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r5 = 0
            r6 = 0
            float r1 = r29.mo6038e()
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r1 = r12
            r2 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.set(r10, r12)
        L_0x015f:
            r1 = r18
            goto L_0x0023
        L_0x0163:
            com.airbnb.lottie.t.j.g r2 = com.airbnb.lottie.p021v.C1339d.m6629f(r28, r29)
            r15 = r2
            goto L_0x0023
        L_0x016a:
            com.airbnb.lottie.t.j.m r2 = com.airbnb.lottie.p021v.C1333a.m6606b(r28, r29)
            r14 = r2
            goto L_0x0023
        L_0x0171:
            r28.beginObject()
        L_0x0174:
            boolean r2 = r28.hasNext()
            if (r2 == 0) goto L_0x018f
            java.lang.String r2 = r28.nextName()
            java.lang.String r3 = "k"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x018b
            com.airbnb.lottie.t.j.e r13 = com.airbnb.lottie.p021v.C1333a.m6605a(r28, r29)
            goto L_0x0174
        L_0x018b:
            r28.skipValue()
            goto L_0x0174
        L_0x018f:
            r28.endObject()
            goto L_0x0023
        L_0x0194:
            if (r11 == 0) goto L_0x0199
            r28.endObject()
        L_0x0199:
            boolean r0 = m6613a(r13)
            if (r0 == 0) goto L_0x01a0
            r13 = 0
        L_0x01a0:
            boolean r0 = m6615a(r14)
            if (r0 == 0) goto L_0x01a9
            r20 = 0
            goto L_0x01ab
        L_0x01a9:
            r20 = r14
        L_0x01ab:
            boolean r0 = m6612a(r1)
            if (r0 == 0) goto L_0x01b4
            r22 = 0
            goto L_0x01b6
        L_0x01b4:
            r22 = r1
        L_0x01b6:
            boolean r0 = m6614a(r15)
            if (r0 == 0) goto L_0x01bf
            r21 = 0
            goto L_0x01c1
        L_0x01bf:
            r21 = r15
        L_0x01c1:
            boolean r0 = m6617c(r16)
            if (r0 == 0) goto L_0x01ca
            r26 = 0
            goto L_0x01cc
        L_0x01ca:
            r26 = r16
        L_0x01cc:
            boolean r0 = m6616b(r17)
            if (r0 == 0) goto L_0x01d5
            r27 = 0
            goto L_0x01d7
        L_0x01d5:
            r27 = r17
        L_0x01d7:
            com.airbnb.lottie.t.j.l r0 = new com.airbnb.lottie.t.j.l
            r18 = r0
            r19 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1337c.m6611a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.t.j.l");
    }

    /* renamed from: b */
    private static boolean m6616b(C1277b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C1376a) bVar.mo6224b().get(0)).f5053b).floatValue() == 0.0f);
    }

    /* renamed from: c */
    private static boolean m6617c(C1277b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C1376a) bVar.mo6224b().get(0)).f5053b).floatValue() == 0.0f);
    }

    /* renamed from: a */
    private static boolean m6613a(C1280e eVar) {
        return eVar == null || (eVar.isStatic() && ((PointF) ((C1376a) eVar.mo6224b().get(0)).f5053b).equals(0.0f, 0.0f));
    }

    /* renamed from: a */
    private static boolean m6615a(C1288m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C1284i) && mVar.isStatic() && ((PointF) ((C1376a) mVar.mo6224b().get(0)).f5053b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m6612a(C1277b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C1376a) bVar.mo6224b().get(0)).f5053b).floatValue() == 0.0f);
    }

    /* renamed from: a */
    private static boolean m6614a(C1282g gVar) {
        return gVar == null || (gVar.isStatic() && ((C1379d) ((C1376a) gVar.mo6224b().get(0)).f5053b).mo6433a(1.0f, 1.0f));
    }
}
