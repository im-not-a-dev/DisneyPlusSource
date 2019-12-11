package com.airbnb.lottie.p021v;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.y */
/* compiled from: PointFParser */
public class C1368y implements C1352j0<PointF> {

    /* renamed from: a */
    public static final C1368y f5031a = new C1368y();

    private C1368y() {
    }

    /* renamed from: a */
    public PointF m6686a(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C1358p.m6662d(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C1358p.m6662d(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot convert json to point. Next token is ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }
}
