package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1281f;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p016t.p018k.C1290a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.e */
/* compiled from: CircleShapeParser */
class C1341e {
    /* renamed from: a */
    static C1290a m6633a(JsonReader jsonReader, C1182d dVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        C1288m mVar = null;
        C1281f fVar = null;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 100) {
                if (hashCode != 112) {
                    if (hashCode != 115) {
                        if (hashCode != 3324) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 0;
                            }
                        } else if (nextName.equals("hd")) {
                            c = 3;
                        }
                    } else if (nextName.equals("s")) {
                        c = 2;
                    }
                } else if (nextName.equals("p")) {
                    c = 1;
                }
            } else if (nextName.equals("d")) {
                c = 4;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                mVar = C1333a.m6606b(jsonReader, dVar);
            } else if (c == 2) {
                fVar = C1339d.m6628e(jsonReader, dVar);
            } else if (c == 3) {
                z2 = jsonReader.nextBoolean();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        C1290a aVar = new C1290a(str, mVar, fVar, z, z2);
        return aVar;
    }
}
