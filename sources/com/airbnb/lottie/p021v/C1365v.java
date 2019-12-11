package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.p016t.p018k.C1298h;
import com.airbnb.lottie.p016t.p018k.C1298h.C1299a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.v */
/* compiled from: MergePathsParser */
class C1365v {
    /* renamed from: a */
    static C1298h m6681a(JsonReader jsonReader) throws IOException {
        String str = null;
        C1299a aVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3488) {
                    if (hashCode == 3519 && nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("mm")) {
                    c = 1;
                }
            } else if (nextName.equals("hd")) {
                c = 2;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                aVar = C1299a.m6437a(jsonReader.nextInt());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new C1298h(str, aVar, z);
    }
}
