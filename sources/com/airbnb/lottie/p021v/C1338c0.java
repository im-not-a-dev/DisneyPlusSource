package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p023x.C1379d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.c0 */
/* compiled from: ScaleXYParser */
public class C1338c0 implements C1352j0<C1379d> {

    /* renamed from: a */
    public static final C1338c0 f5020a = new C1338c0();

    private C1338c0() {
    }

    /* renamed from: a */
    public C1379d m6619a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C1379d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
