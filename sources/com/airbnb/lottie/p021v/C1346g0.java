package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1283h;
import com.airbnb.lottie.p016t.p018k.C1307o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.g0 */
/* compiled from: ShapePathParser */
class C1346g0 {
    /* renamed from: a */
    static C1307o m6639a(JsonReader jsonReader, C1182d dVar) throws IOException {
        String str = null;
        C1283h hVar = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3432) {
                    if (hashCode != 3519) {
                        if (hashCode == 104415 && nextName.equals("ind")) {
                            c = 1;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("ks")) {
                    c = 2;
                }
            } else if (nextName.equals("hd")) {
                c = 3;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                i = jsonReader.nextInt();
            } else if (c == 2) {
                hVar = C1339d.m6630g(jsonReader, dVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new C1307o(str, i, hVar, z);
    }
}
