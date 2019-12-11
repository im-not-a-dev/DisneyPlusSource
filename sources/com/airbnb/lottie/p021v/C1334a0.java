package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1281f;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p016t.p018k.C1302j;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.a0 */
/* compiled from: RectangleShapeParser */
class C1334a0 {
    /* renamed from: a */
    static C1302j m6607a(JsonReader jsonReader, C1182d dVar) throws IOException {
        String str = null;
        C1288m mVar = null;
        C1281f fVar = null;
        C1277b bVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3324) {
                    if (hashCode != 3519) {
                        if (hashCode != 114) {
                            if (hashCode == 115 && nextName.equals("s")) {
                                c = 2;
                            }
                        } else if (nextName.equals("r")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("hd")) {
                    c = 4;
                }
            } else if (nextName.equals("p")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                mVar = C1333a.m6606b(jsonReader, dVar);
            } else if (c == 2) {
                fVar = C1339d.m6628e(jsonReader, dVar);
            } else if (c == 3) {
                bVar = C1339d.m6626c(jsonReader, dVar);
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        C1302j jVar = new C1302j(str, mVar, fVar, bVar, z);
        return jVar;
    }
}
