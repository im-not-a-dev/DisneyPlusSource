package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1287l;
import com.airbnb.lottie.p016t.p018k.C1303k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.b0 */
/* compiled from: RepeaterParser */
class C1336b0 {
    /* renamed from: a */
    static C1303k m6610a(JsonReader jsonReader, C1182d dVar) throws IOException {
        String str = null;
        C1277b bVar = null;
        C1277b bVar2 = null;
        C1287l lVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3324) {
                        if (hashCode != 3519) {
                            if (hashCode == 3710 && nextName.equals("tr")) {
                                c = 3;
                            }
                        } else if (nextName.equals("nm")) {
                            c = 0;
                        }
                    } else if (nextName.equals("hd")) {
                        c = 4;
                    }
                } else if (nextName.equals("o")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                bVar = C1339d.m6621a(jsonReader, dVar, false);
            } else if (c == 2) {
                bVar2 = C1339d.m6621a(jsonReader, dVar, false);
            } else if (c == 3) {
                lVar = C1337c.m6611a(jsonReader, dVar);
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        C1303k kVar = new C1303k(str, bVar, bVar2, lVar, z);
        return kVar;
    }
}
