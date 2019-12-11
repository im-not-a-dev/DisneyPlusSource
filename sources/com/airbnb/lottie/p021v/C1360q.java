package com.airbnb.lottie.p021v;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p023x.C1376a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p096e.p113e.C3942j;

/* renamed from: com.airbnb.lottie.v.q */
/* compiled from: KeyframeParser */
class C1360q {

    /* renamed from: a */
    private static final Interpolator f5028a = new LinearInterpolator();

    /* renamed from: b */
    private static C3942j<WeakReference<Interpolator>> f5029b;

    C1360q() {
    }

    /* renamed from: a */
    private static C3942j<WeakReference<Interpolator>> m6667a() {
        if (f5029b == null) {
            f5029b = new C3942j<>();
        }
        return f5029b;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m6668a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C1360q.class) {
            weakReference = (WeakReference) m6667a().mo14172a(i);
        }
        return weakReference;
    }

    /* renamed from: a */
    private static void m6669a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1360q.class) {
            f5029b.mo14179c(i, weakReference);
        }
    }

    /* renamed from: a */
    static <T> C1376a<T> m6665a(JsonReader jsonReader, C1182d dVar, float f, C1352j0<T> j0Var, boolean z) throws IOException {
        if (z) {
            return m6666a(dVar, jsonReader, f, j0Var);
        }
        return m6664a(jsonReader, f, j0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.airbnb.lottie.p023x.C1376a<T> m6666a(com.airbnb.lottie.C1182d r17, android.util.JsonReader r18, float r19, com.airbnb.lottie.p021v.C1352j0<T> r20) throws java.io.IOException {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r18.beginObject()
            r5 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0012:
            boolean r10 = r18.hasNext()
            if (r10 == 0) goto L_0x00d9
            java.lang.String r10 = r18.nextName()
            r11 = -1
            int r13 = r10.hashCode()
            r3 = 101(0x65, float:1.42E-43)
            r4 = 1
            if (r13 == r3) goto L_0x0089
            r3 = 111(0x6f, float:1.56E-43)
            if (r13 == r3) goto L_0x007f
            r3 = 3701(0xe75, float:5.186E-42)
            if (r13 == r3) goto L_0x0075
            r3 = 3707(0xe7b, float:5.195E-42)
            if (r13 == r3) goto L_0x006b
            r3 = 104(0x68, float:1.46E-43)
            if (r13 == r3) goto L_0x0061
            r3 = 105(0x69, float:1.47E-43)
            if (r13 == r3) goto L_0x0057
            r3 = 115(0x73, float:1.61E-43)
            if (r13 == r3) goto L_0x004d
            r3 = 116(0x74, float:1.63E-43)
            if (r13 == r3) goto L_0x0043
            goto L_0x0093
        L_0x0043:
            java.lang.String r3 = "t"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 0
            goto L_0x0094
        L_0x004d:
            java.lang.String r3 = "s"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 1
            goto L_0x0094
        L_0x0057:
            java.lang.String r3 = "i"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 4
            goto L_0x0094
        L_0x0061:
            java.lang.String r3 = "h"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 5
            goto L_0x0094
        L_0x006b:
            java.lang.String r3 = "to"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 6
            goto L_0x0094
        L_0x0075:
            java.lang.String r3 = "ti"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 7
            goto L_0x0094
        L_0x007f:
            java.lang.String r3 = "o"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 3
            goto L_0x0094
        L_0x0089:
            java.lang.String r3 = "e"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0093
            r3 = 2
            goto L_0x0094
        L_0x0093:
            r3 = -1
        L_0x0094:
            switch(r3) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a3;
                case 7: goto L_0x009c;
                default: goto L_0x0097;
            }
        L_0x0097:
            r18.skipValue()
            goto L_0x0012
        L_0x009c:
            android.graphics.PointF r3 = com.airbnb.lottie.p021v.C1358p.m6662d(r18, r19)
            r15 = r3
            goto L_0x0012
        L_0x00a3:
            android.graphics.PointF r3 = com.airbnb.lottie.p021v.C1358p.m6662d(r18, r19)
            r14 = r3
            goto L_0x0012
        L_0x00aa:
            int r3 = r18.nextInt()
            if (r3 != r4) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            r5 = r4
            goto L_0x0012
        L_0x00b5:
            android.graphics.PointF r3 = com.airbnb.lottie.p021v.C1358p.m6662d(r18, r19)
            r7 = r3
            goto L_0x0012
        L_0x00bc:
            android.graphics.PointF r3 = com.airbnb.lottie.p021v.C1358p.m6662d(r18, r19)
            r6 = r3
            goto L_0x0012
        L_0x00c3:
            java.lang.Object r3 = r2.mo6375a(r0, r1)
            r8 = r3
            goto L_0x0012
        L_0x00ca:
            java.lang.Object r3 = r2.mo6375a(r0, r1)
            r9 = r3
            goto L_0x0012
        L_0x00d1:
            double r3 = r18.nextDouble()
            float r3 = (float) r3
            r12 = r3
            goto L_0x0012
        L_0x00d9:
            r18.endObject()
            if (r5 == 0) goto L_0x00e4
            android.view.animation.Interpolator r0 = f5028a
            r11 = r0
            r10 = r9
            goto L_0x0151
        L_0x00e4:
            if (r6 == 0) goto L_0x014d
            if (r7 == 0) goto L_0x014d
            float r0 = r6.x
            float r2 = -r1
            float r0 = com.airbnb.lottie.p022w.C1374e.m6721a(r0, r2, r1)
            r6.x = r0
            float r0 = r6.y
            r3 = 1120403456(0x42c80000, float:100.0)
            r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = com.airbnb.lottie.p022w.C1374e.m6721a(r0, r4, r3)
            r6.y = r0
            float r0 = r7.x
            float r0 = com.airbnb.lottie.p022w.C1374e.m6721a(r0, r2, r1)
            r7.x = r0
            float r0 = r7.y
            float r0 = com.airbnb.lottie.p022w.C1374e.m6721a(r0, r4, r3)
            r7.y = r0
            float r0 = r6.x
            float r2 = r6.y
            float r3 = r7.x
            float r4 = r7.y
            int r0 = com.airbnb.lottie.p022w.C1375f.m6734a(r0, r2, r3, r4)
            java.lang.ref.WeakReference r2 = m6668a(r0)
            if (r2 == 0) goto L_0x0129
            java.lang.Object r3 = r2.get()
            r4 = r3
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            r16 = r4
            goto L_0x012b
        L_0x0129:
            r16 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x012f
            if (r16 != 0) goto L_0x0149
        L_0x012f:
            float r2 = r6.x
            float r2 = r2 / r1
            float r3 = r6.y
            float r3 = r3 / r1
            float r4 = r7.x
            float r4 = r4 / r1
            float r5 = r7.y
            float r5 = r5 / r1
            android.view.animation.Interpolator r1 = p096e.p121h.p135s.p137j0.C4173b.m14300a(r2, r3, r4, r5)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0147 }
            r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0147 }
            m6669a(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0147 }
        L_0x0147:
            r16 = r1
        L_0x0149:
            r10 = r8
            r11 = r16
            goto L_0x0151
        L_0x014d:
            android.view.animation.Interpolator r0 = f5028a
            r11 = r0
            r10 = r8
        L_0x0151:
            com.airbnb.lottie.x.a r0 = new com.airbnb.lottie.x.a
            r13 = 0
            r7 = r0
            r8 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.f5064m = r14
            r0.f5065n = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1360q.m6666a(com.airbnb.lottie.d, android.util.JsonReader, float, com.airbnb.lottie.v.j0):com.airbnb.lottie.x.a");
    }

    /* renamed from: a */
    private static <T> C1376a<T> m6664a(JsonReader jsonReader, float f, C1352j0<T> j0Var) throws IOException {
        return new C1376a<>(j0Var.mo6375a(jsonReader, f));
    }
}
