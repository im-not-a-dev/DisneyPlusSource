package com.airbnb.lottie.p021v;

import android.graphics.Path.FillType;
import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1276a;
import com.airbnb.lottie.p016t.p017j.C1279d;
import com.airbnb.lottie.p016t.p018k.C1305m;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.e0 */
/* compiled from: ShapeFillParser */
class C1342e0 {
    /* renamed from: a */
    static C1305m m6634a(JsonReader jsonReader, C1182d dVar) throws IOException {
        String str = null;
        C1276a aVar = null;
        C1279d dVar2 = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -396065730) {
                if (hashCode != 99) {
                    if (hashCode != 111) {
                        if (hashCode != 114) {
                            if (hashCode != 3324) {
                                if (hashCode == 3519 && nextName.equals("nm")) {
                                    c = 0;
                                }
                            } else if (nextName.equals("hd")) {
                                c = 5;
                            }
                        } else if (nextName.equals("r")) {
                            c = 4;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("c")) {
                    c = 1;
                }
            } else if (nextName.equals("fillEnabled")) {
                c = 3;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                aVar = C1339d.m6620a(jsonReader, dVar);
            } else if (c == 2) {
                dVar2 = C1339d.m6627d(jsonReader, dVar);
            } else if (c == 3) {
                z = jsonReader.nextBoolean();
            } else if (c == 4) {
                i = jsonReader.nextInt();
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                z2 = jsonReader.nextBoolean();
            }
        }
        C1305m mVar = new C1305m(str, z, i == 1 ? FillType.WINDING : FillType.EVEN_ODD, aVar, dVar2, z2);
        return mVar;
    }
}
