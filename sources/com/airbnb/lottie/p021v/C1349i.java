package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.i */
/* compiled from: FloatParser */
public class C1349i implements C1352j0<Float> {

    /* renamed from: a */
    public static final C1349i f5024a = new C1349i();

    private C1349i() {
    }

    /* renamed from: a */
    public Float m6644a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(C1358p.m6659b(jsonReader) * f);
    }
}
