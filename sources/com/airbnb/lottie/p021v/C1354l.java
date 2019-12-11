package com.airbnb.lottie.p021v;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p016t.p018k.C1292c;
import com.airbnb.lottie.p022w.C1374e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.l */
/* compiled from: GradientColorParser */
public class C1354l implements C1352j0<C1292c> {

    /* renamed from: a */
    private int f5025a;

    public C1354l(int i) {
        this.f5025a = i;
    }

    /* renamed from: a */
    public C1292c m6652a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f5025a == -1) {
            this.f5025a = arrayList.size() / 4;
        }
        int i = this.f5025a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f5025a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C1292c cVar = new C1292c(fArr, iArr);
        m6650a(cVar, (List<Float>) arrayList);
        return cVar;
    }

    /* renamed from: a */
    private void m6650a(C1292c cVar, List<Float> list) {
        int i = this.f5025a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) ((Float) list.get(i)).floatValue();
                } else {
                    dArr2[i2] = (double) ((Float) list.get(i)).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo6246c(); i3++) {
                int i4 = cVar.mo6244a()[i3];
                cVar.mo6244a()[i3] = Color.argb(m6649a((double) cVar.mo6245b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: a */
    private int m6649a(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C1374e.m6720a(dArr4[i2], dArr4[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }
}
