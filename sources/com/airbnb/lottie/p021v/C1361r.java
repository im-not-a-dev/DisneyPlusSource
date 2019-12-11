package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p012r.p014c.C1255h;
import com.airbnb.lottie.p023x.C1376a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.r */
/* compiled from: KeyframesParser */
class C1361r {
    /* renamed from: a */
    static <T> List<C1376a<T>> m6670a(JsonReader jsonReader, C1182d dVar, float f, C1352j0<T> j0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            dVar.mo6030a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C1360q.m6665a(jsonReader, dVar, f, j0Var, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C1360q.m6665a(jsonReader, dVar, f, j0Var, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C1360q.m6665a(jsonReader, dVar, f, j0Var, false));
            }
        }
        jsonReader.endObject();
        m6671a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> void m6671a(List<? extends C1376a<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1376a aVar = (C1376a) list.get(i2);
            i2++;
            C1376a aVar2 = (C1376a) list.get(i2);
            aVar.f5057f = Float.valueOf(aVar2.f5056e);
            if (aVar.f5054c == null) {
                T t = aVar2.f5053b;
                if (t != null) {
                    aVar.f5054c = t;
                    if (aVar instanceof C1255h) {
                        ((C1255h) aVar).mo6179h();
                    }
                }
            }
        }
        C1376a aVar3 = (C1376a) list.get(i);
        if ((aVar3.f5053b == null || aVar3.f5054c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
