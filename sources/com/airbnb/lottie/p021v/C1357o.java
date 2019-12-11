package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.v.o */
/* compiled from: IntegerParser */
public class C1357o implements C1352j0<Integer> {

    /* renamed from: a */
    public static final C1357o f5026a = new C1357o();

    private C1357o() {
    }

    /* renamed from: a */
    public Integer m6656a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C1358p.m6659b(jsonReader) * f));
    }
}
