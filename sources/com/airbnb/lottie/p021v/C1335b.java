package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1276a;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1286k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.b */
/* compiled from: AnimatableTextPropertiesParser */
public class C1335b {
    /* renamed from: a */
    public static C1286k m6608a(JsonReader jsonReader, C1182d dVar) throws IOException {
        jsonReader.beginObject();
        C1286k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 97 && nextName.equals("a")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                kVar = m6609b(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        return kVar == null ? new C1286k(null, null, null, null) : kVar;
    }

    /* renamed from: b */
    private static C1286k m6609b(JsonReader jsonReader, C1182d dVar) throws IOException {
        jsonReader.beginObject();
        C1276a aVar = null;
        C1276a aVar2 = null;
        C1277b bVar = null;
        C1277b bVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName.equals("sw")) {
                            c = 2;
                        }
                    } else if (nextName.equals("sc")) {
                        c = 1;
                    }
                } else if (nextName.equals("fc")) {
                    c = 0;
                }
            } else if (nextName.equals("t")) {
                c = 3;
            }
            if (c == 0) {
                aVar = C1339d.m6620a(jsonReader, dVar);
            } else if (c == 1) {
                aVar2 = C1339d.m6620a(jsonReader, dVar);
            } else if (c == 2) {
                bVar = C1339d.m6626c(jsonReader, dVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                bVar2 = C1339d.m6626c(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        return new C1286k(aVar, aVar2, bVar, bVar2);
    }
}
