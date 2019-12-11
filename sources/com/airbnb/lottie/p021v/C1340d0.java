package com.airbnb.lottie.p021v;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p016t.C1266a;
import com.airbnb.lottie.p016t.p018k.C1304l;
import com.airbnb.lottie.p022w.C1374e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.d0 */
/* compiled from: ShapeDataParser */
public class C1340d0 implements C1352j0<C1304l> {

    /* renamed from: a */
    public static final C1340d0 f5021a = new C1340d0();

    private C1340d0() {
    }

    /* renamed from: a */
    public C1304l m6632a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 111) {
                        if (hashCode == 118 && nextName.equals("v")) {
                            c = 1;
                        }
                    } else if (nextName.equals("o")) {
                        c = 3;
                    }
                } else if (nextName.equals("i")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 0;
            }
            if (c == 0) {
                z = jsonReader.nextBoolean();
            } else if (c == 1) {
                list = C1358p.m6663e(jsonReader, f);
            } else if (c == 2) {
                list2 = C1358p.m6663e(jsonReader, f);
            } else if (c == 3) {
                list3 = C1358p.m6663e(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C1304l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new C1266a(C1374e.m6726a((PointF) list.get(i2), (PointF) list3.get(i2)), C1374e.m6726a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new C1266a(C1374e.m6726a((PointF) list.get(i3), (PointF) list3.get(i3)), C1374e.m6726a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C1304l(pointF, z, arrayList);
        }
    }
}
