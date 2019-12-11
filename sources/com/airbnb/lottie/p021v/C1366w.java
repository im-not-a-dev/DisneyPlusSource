package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p012r.p014c.C1255h;
import com.airbnb.lottie.p022w.C1375f;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.w */
/* compiled from: PathKeyframeParser */
class C1366w {
    /* renamed from: a */
    static C1255h m6682a(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1255h(dVar, C1360q.m6665a(jsonReader, dVar, C1375f.m6732a(), C1367x.f5030a, jsonReader.peek() == JsonToken.BEGIN_OBJECT));
    }
}
