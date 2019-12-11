package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p016t.p017j.C1276a;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1278c;
import com.airbnb.lottie.p016t.p017j.C1279d;
import com.airbnb.lottie.p016t.p017j.C1281f;
import com.airbnb.lottie.p016t.p017j.C1282g;
import com.airbnb.lottie.p016t.p017j.C1283h;
import com.airbnb.lottie.p016t.p017j.C1285j;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1376a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.d */
/* compiled from: AnimatableValueParser */
public class C1339d {
    /* renamed from: a */
    public static C1277b m6621a(JsonReader jsonReader, C1182d dVar, boolean z) throws IOException {
        return new C1277b(m6623a(jsonReader, z ? C1375f.m6732a() : 1.0f, dVar, C1349i.f5024a));
    }

    /* renamed from: b */
    static C1285j m6625b(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1285j(m6624a(jsonReader, dVar, (C1352j0<T>) C1347h.f5023a));
    }

    /* renamed from: c */
    public static C1277b m6626c(JsonReader jsonReader, C1182d dVar) throws IOException {
        return m6621a(jsonReader, dVar, true);
    }

    /* renamed from: d */
    static C1279d m6627d(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1279d(m6624a(jsonReader, dVar, (C1352j0<T>) C1357o.f5026a));
    }

    /* renamed from: e */
    static C1281f m6628e(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1281f(m6623a(jsonReader, C1375f.m6732a(), dVar, C1368y.f5031a));
    }

    /* renamed from: f */
    static C1282g m6629f(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1282g(m6624a(jsonReader, dVar, (C1352j0<T>) C1338c0.f5020a));
    }

    /* renamed from: g */
    static C1283h m6630g(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1283h(m6623a(jsonReader, C1375f.m6732a(), dVar, C1340d0.f5021a));
    }

    /* renamed from: a */
    static C1276a m6620a(JsonReader jsonReader, C1182d dVar) throws IOException {
        return new C1276a(m6624a(jsonReader, dVar, (C1352j0<T>) C1343f.f5022a));
    }

    /* renamed from: a */
    static C1278c m6622a(JsonReader jsonReader, C1182d dVar, int i) throws IOException {
        return new C1278c(m6624a(jsonReader, dVar, (C1352j0<T>) new C1354l<T>(i)));
    }

    /* renamed from: a */
    private static <T> List<C1376a<T>> m6624a(JsonReader jsonReader, C1182d dVar, C1352j0<T> j0Var) throws IOException {
        return C1361r.m6670a(jsonReader, dVar, 1.0f, j0Var);
    }

    /* renamed from: a */
    private static <T> List<C1376a<T>> m6623a(JsonReader jsonReader, float f, C1182d dVar, C1352j0<T> j0Var) throws IOException {
        return C1361r.m6670a(jsonReader, dVar, f, j0Var);
    }
}
