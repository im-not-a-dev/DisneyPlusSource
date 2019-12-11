package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1207g;
import com.airbnb.lottie.p016t.C1269c;
import com.airbnb.lottie.p016t.C1270d;
import com.airbnb.lottie.p016t.C1274h;
import com.airbnb.lottie.p016t.p019l.C1320d;
import com.airbnb.lottie.p016t.p019l.C1320d.C1321a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3933f;
import p096e.p113e.C3942j;

/* renamed from: com.airbnb.lottie.v.t */
/* compiled from: LottieCompositionParser */
public class C1363t {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.C1182d m6674a(android.util.JsonReader r27) throws java.io.IOException {
        /*
            r0 = r27
            float r1 = com.airbnb.lottie.p022w.C1375f.m6732a()
            e.e.f r8 = new e.e.f
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            e.e.j r11 = new e.e.j
            r11.<init>()
            com.airbnb.lottie.d r14 = new com.airbnb.lottie.d
            r14.<init>()
            r27.beginObject()
            r2 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = 0
        L_0x0037:
            boolean r16 = r27.hasNext()
            if (r16 == 0) goto L_0x0167
            java.lang.String r3 = r27.nextName()
            r17 = -1
            int r18 = r3.hashCode()
            r19 = 2
            r20 = 1
            switch(r18) {
                case -1408207997: goto L_0x00d0;
                case -1109732030: goto L_0x00c4;
                case 104: goto L_0x00b8;
                case 118: goto L_0x00ac;
                case 119: goto L_0x00a0;
                case 3276: goto L_0x0094;
                case 3367: goto L_0x0088;
                case 3553: goto L_0x007c;
                case 94623709: goto L_0x006e;
                case 97615364: goto L_0x0060;
                case 839250809: goto L_0x0052;
                default: goto L_0x004e;
            }
        L_0x004e:
            r18 = r15
            goto L_0x00dc
        L_0x0052:
            r18 = r15
            java.lang.String r15 = "markers"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 10
            goto L_0x00dd
        L_0x0060:
            r18 = r15
            java.lang.String r15 = "fonts"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 8
            goto L_0x00dd
        L_0x006e:
            r18 = r15
            java.lang.String r15 = "chars"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 9
            goto L_0x00dd
        L_0x007c:
            r18 = r15
            java.lang.String r15 = "op"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 3
            goto L_0x00dd
        L_0x0088:
            r18 = r15
            java.lang.String r15 = "ip"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 2
            goto L_0x00dd
        L_0x0094:
            r18 = r15
            java.lang.String r15 = "fr"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 4
            goto L_0x00dd
        L_0x00a0:
            r18 = r15
            java.lang.String r15 = "w"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 0
            goto L_0x00dd
        L_0x00ac:
            r18 = r15
            java.lang.String r15 = "v"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 5
            goto L_0x00dd
        L_0x00b8:
            r18 = r15
            java.lang.String r15 = "h"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 1
            goto L_0x00dd
        L_0x00c4:
            r18 = r15
            java.lang.String r15 = "layers"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 6
            goto L_0x00dd
        L_0x00d0:
            r18 = r15
            java.lang.String r15 = "assets"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x00dc
            r3 = 7
            goto L_0x00dd
        L_0x00dc:
            r3 = -1
        L_0x00dd:
            switch(r3) {
                case 0: goto L_0x0159;
                case 1: goto L_0x0150;
                case 2: goto L_0x0147;
                case 3: goto L_0x0139;
                case 4: goto L_0x012e;
                case 5: goto L_0x00fc;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00ec;
                case 10: goto L_0x00e8;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            r15 = r12
            r17 = r13
            r27.skipValue()
            goto L_0x0160
        L_0x00e8:
            m6676a(r0, r14, r13)
            goto L_0x012a
        L_0x00ec:
            m6675a(r0, r14, r11)
            goto L_0x012a
        L_0x00f0:
            m6679a(r0, r12)
            goto L_0x012a
        L_0x00f4:
            m6678a(r0, r14, r9, r10)
            goto L_0x012a
        L_0x00f8:
            m6677a(r0, r14, r7, r8)
            goto L_0x012a
        L_0x00fc:
            java.lang.String r3 = r27.nextString()
            java.lang.String r15 = "\\."
            java.lang.String[] r3 = r3.split(r15)
            r15 = 0
            r17 = r3[r15]
            int r21 = java.lang.Integer.parseInt(r17)
            r15 = r3[r20]
            int r22 = java.lang.Integer.parseInt(r15)
            r3 = r3[r19]
            int r23 = java.lang.Integer.parseInt(r3)
            r24 = 4
            r25 = 4
            r26 = 0
            boolean r3 = com.airbnb.lottie.p022w.C1375f.m6739a(r21, r22, r23, r24, r25, r26)
            if (r3 != 0) goto L_0x012a
            java.lang.String r3 = "Lottie only supports bodymovin >= 4.4.0"
            r14.mo6030a(r3)
        L_0x012a:
            r15 = r12
            r17 = r13
            goto L_0x0160
        L_0x012e:
            r15 = r12
            r17 = r13
            double r12 = r27.nextDouble()
            float r3 = (float) r12
            r18 = r3
            goto L_0x0160
        L_0x0139:
            r15 = r12
            r17 = r13
            double r12 = r27.nextDouble()
            float r3 = (float) r12
            r6 = 1008981770(0x3c23d70a, float:0.01)
            float r6 = r3 - r6
            goto L_0x0160
        L_0x0147:
            r15 = r12
            r17 = r13
            double r12 = r27.nextDouble()
            float r5 = (float) r12
            goto L_0x0160
        L_0x0150:
            r15 = r12
            r17 = r13
            int r3 = r27.nextInt()
            r4 = r3
            goto L_0x0160
        L_0x0159:
            r15 = r12
            r17 = r13
            int r2 = r27.nextInt()
        L_0x0160:
            r12 = r15
            r13 = r17
            r15 = r18
            goto L_0x0037
        L_0x0167:
            r17 = r13
            r18 = r15
            r15 = r12
            r27.endObject()
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (int) r0
            float r2 = (float) r4
            float r2 = r2 * r1
            int r1 = (int) r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            r2 = r14
            r4 = r5
            r5 = r6
            r6 = r18
            r2.mo6029a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1363t.m6674a(android.util.JsonReader):com.airbnb.lottie.d");
    }

    /* renamed from: a */
    private static void m6677a(JsonReader jsonReader, C1182d dVar, List<C1320d> list, C3933f<C1320d> fVar) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            C1320d a = C1362s.m6672a(jsonReader, dVar);
            if (a.mo6349d() == C1321a.IMAGE) {
                i++;
            }
            list.add(a);
            fVar.mo14067c(a.mo6347b(), a);
            if (i > 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                C1181c.m6035d(sb.toString());
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m6678a(JsonReader jsonReader, C1182d dVar, Map<String, List<C1320d>> map, Map<String, C1207g> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C3933f fVar = new C3933f();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1109732030) {
                    if (hashCode != 104) {
                        if (hashCode != 112) {
                            if (hashCode != 117) {
                                if (hashCode != 119) {
                                    if (hashCode == 3355 && nextName.equals("id")) {
                                        c = 0;
                                    }
                                } else if (nextName.equals("w")) {
                                    c = 2;
                                }
                            } else if (nextName.equals("u")) {
                                c = 5;
                            }
                        } else if (nextName.equals("p")) {
                            c = 4;
                        }
                    } else if (nextName.equals("h")) {
                        c = 3;
                    }
                } else if (nextName.equals("layers")) {
                    c = 1;
                }
                if (c == 0) {
                    str = jsonReader.nextString();
                } else if (c == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C1320d a = C1362s.m6672a(jsonReader, dVar);
                        fVar.mo14067c(a.mo6347b(), a);
                        arrayList.add(a);
                    }
                    jsonReader.endArray();
                } else if (c == 2) {
                    i = jsonReader.nextInt();
                } else if (c == 3) {
                    i2 = jsonReader.nextInt();
                } else if (c == 4) {
                    str2 = jsonReader.nextString();
                } else if (c != 5) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                C1207g gVar = new C1207g(i, i2, str, str2, str3);
                map2.put(gVar.mo6122c(), gVar);
                Map<String, List<C1320d>> map3 = map;
            } else {
                Map<String, C1207g> map4 = map2;
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m6679a(JsonReader jsonReader, Map<String, C1269c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 3322014 && nextName.equals("list")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C1269c a = C1353k.m6648a(jsonReader);
                    map.put(a.mo6203b(), a);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: a */
    private static void m6675a(JsonReader jsonReader, C1182d dVar, C3942j<C1270d> jVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C1270d a = C1351j.m6646a(jsonReader, dVar);
            jVar.mo14179c(a.hashCode(), a);
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m6676a(JsonReader jsonReader, C1182d dVar, List<C1274h> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            jsonReader.beginObject();
            float f = 0.0f;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != 3178) {
                    if (hashCode != 3214) {
                        if (hashCode == 3705 && nextName.equals("tm")) {
                            c = 1;
                        }
                    } else if (nextName.equals("dr")) {
                        c = 2;
                    }
                } else if (nextName.equals("cm")) {
                    c = 0;
                }
                if (c == 0) {
                    str = jsonReader.nextString();
                } else if (c == 1) {
                    f = (float) jsonReader.nextDouble();
                } else if (c != 2) {
                    jsonReader.skipValue();
                } else {
                    f2 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.endObject();
            list.add(new C1274h(str, f, f2));
        }
        jsonReader.endArray();
    }
}
