package com.airbnb.lottie.p021v;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1280e;
import com.airbnb.lottie.p016t.p017j.C1284i;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1376a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.v.a */
/* compiled from: AnimatablePathValueParser */
public class C1333a {
    /* renamed from: a */
    public static C1280e m6605a(JsonReader jsonReader, C1182d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C1366w.m6682a(jsonReader, dVar));
            }
            jsonReader.endArray();
            C1361r.m6671a(arrayList);
        } else {
            arrayList.add(new C1376a(C1358p.m6662d(jsonReader, C1375f.m6732a())));
        }
        return new C1280e(arrayList);
    }

    /* renamed from: b */
    static C1288m<PointF, PointF> m6606b(JsonReader jsonReader, C1182d dVar) throws IOException {
        jsonReader.beginObject();
        C1288m<PointF, PointF> mVar = null;
        C1277b bVar = null;
        C1277b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                if (hashCode != 120) {
                    if (hashCode == 121 && nextName.equals("y")) {
                        c = 2;
                    }
                } else if (nextName.equals("x")) {
                    c = 1;
                }
            } else if (nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        jsonReader.skipValue();
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                    } else {
                        bVar2 = C1339d.m6626c(jsonReader, dVar);
                    }
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    jsonReader.skipValue();
                } else {
                    bVar = C1339d.m6626c(jsonReader, dVar);
                }
                z = true;
            } else {
                mVar = m6605a(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            dVar.mo6030a("Lottie doesn't support expressions.");
        }
        if (mVar != null) {
            return mVar;
        }
        return new C1284i(bVar, bVar2);
    }
}
