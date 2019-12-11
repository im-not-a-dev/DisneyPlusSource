package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p018k.C1291b;
import com.airbnb.lottie.p016t.p018k.C1306n;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.v.f0 */
/* compiled from: ShapeGroupParser */
class C1344f0 {
    /* renamed from: a */
    static C1306n m6637a(JsonReader jsonReader, C1182d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3371) {
                    if (hashCode == 3519 && nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("it")) {
                    c = 2;
                }
            } else if (nextName.equals("hd")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                z = jsonReader.nextBoolean();
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C1291b a = C1345g.m6638a(jsonReader, dVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                jsonReader.endArray();
            }
        }
        return new C1306n(str, arrayList, z);
    }
}
