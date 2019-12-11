package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0418a;
import androidx.constraintlayout.widget.C0418a.C0420b;
import androidx.constraintlayout.widget.C0436i;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.f */
/* compiled from: KeyCycle */
public class C0324f extends C0321d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1463f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1464g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1465h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1466i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1467j = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1468k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1469l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1470m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1471n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1472o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1473p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1474q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1475r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1476s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1477t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1478u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1479v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1480w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    /* compiled from: KeyCycle */
    private static class C0325a {

        /* renamed from: a */
        private static SparseIntArray f1481a = new SparseIntArray();

        static {
            f1481a.append(C0436i.KeyCycle_motionTarget, 1);
            f1481a.append(C0436i.KeyCycle_framePosition, 2);
            f1481a.append(C0436i.KeyCycle_transitionEasing, 3);
            f1481a.append(C0436i.KeyCycle_curveFit, 4);
            f1481a.append(C0436i.KeyCycle_waveShape, 5);
            f1481a.append(C0436i.KeyCycle_wavePeriod, 6);
            f1481a.append(C0436i.KeyCycle_waveOffset, 7);
            f1481a.append(C0436i.KeyCycle_waveVariesBy, 8);
            f1481a.append(C0436i.KeyCycle_android_alpha, 9);
            f1481a.append(C0436i.KeyCycle_android_elevation, 10);
            f1481a.append(C0436i.KeyCycle_android_rotation, 11);
            f1481a.append(C0436i.KeyCycle_android_rotationX, 12);
            f1481a.append(C0436i.KeyCycle_android_rotationY, 13);
            f1481a.append(C0436i.KeyCycle_transitionPathRotate, 14);
            f1481a.append(C0436i.KeyCycle_android_scaleX, 15);
            f1481a.append(C0436i.KeyCycle_android_scaleY, 16);
            f1481a.append(C0436i.KeyCycle_android_translationX, 17);
            f1481a.append(C0436i.KeyCycle_android_translationY, 18);
            f1481a.append(C0436i.KeyCycle_android_translationZ, 19);
            f1481a.append(C0436i.KeyCycle_motionProgress, 20);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m1889b(C0324f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1481a.get(index)) {
                    case 1:
                        if (typedArray.peekValue(index).type != 3) {
                            fVar.f1444b = typedArray.getResourceId(index, fVar.f1444b);
                            break;
                        } else {
                            fVar.f1445c = typedArray.getString(index);
                            break;
                        }
                    case 2:
                        fVar.f1443a = typedArray.getInt(index, fVar.f1443a);
                        break;
                    case 3:
                        fVar.f1463f = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.f1464g = typedArray.getInteger(index, fVar.f1464g);
                        break;
                    case 5:
                        fVar.f1465h = typedArray.getInt(index, fVar.f1465h);
                        break;
                    case 6:
                        fVar.f1466i = typedArray.getFloat(index, fVar.f1466i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            fVar.f1467j = typedArray.getFloat(index, fVar.f1467j);
                            break;
                        } else {
                            fVar.f1467j = typedArray.getDimension(index, fVar.f1467j);
                            break;
                        }
                    case 8:
                        fVar.f1469l = typedArray.getInt(index, fVar.f1469l);
                        break;
                    case 9:
                        fVar.f1470m = typedArray.getFloat(index, fVar.f1470m);
                        break;
                    case 10:
                        fVar.f1471n = typedArray.getDimension(index, fVar.f1471n);
                        break;
                    case 11:
                        fVar.f1472o = typedArray.getFloat(index, fVar.f1472o);
                        break;
                    case 12:
                        fVar.f1474q = typedArray.getFloat(index, fVar.f1474q);
                        break;
                    case 13:
                        fVar.f1475r = typedArray.getFloat(index, fVar.f1475r);
                        break;
                    case 14:
                        fVar.f1473p = typedArray.getFloat(index, fVar.f1473p);
                        break;
                    case 15:
                        fVar.f1476s = typedArray.getFloat(index, fVar.f1476s);
                        break;
                    case 16:
                        fVar.f1477t = typedArray.getFloat(index, fVar.f1477t);
                        break;
                    case 17:
                        fVar.f1478u = typedArray.getDimension(index, fVar.f1478u);
                        break;
                    case 18:
                        fVar.f1479v = typedArray.getDimension(index, fVar.f1479v);
                        break;
                    case 19:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            fVar.f1480w = typedArray.getDimension(index, fVar.f1480w);
                            break;
                        }
                    case 20:
                        fVar.f1468k = typedArray.getFloat(index, fVar.f1468k);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1481a.get(index));
                        Log.e("KeyCycle", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float mo2197b(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0089;
                case -1249320805: goto L_0x007f;
                case -1225497657: goto L_0x0074;
                case -1225497656: goto L_0x0069;
                case -1225497655: goto L_0x005e;
                case -1001078227: goto L_0x0053;
                case -908189618: goto L_0x0049;
                case -908189617: goto L_0x003f;
                case -40300674: goto L_0x0035;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0093
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 11
            goto L_0x0094
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 0
            goto L_0x0094
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 5
            goto L_0x0094
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0035:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 2
            goto L_0x0094
        L_0x003f:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 7
            goto L_0x0094
        L_0x0049:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 6
            goto L_0x0094
        L_0x0053:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 12
            goto L_0x0094
        L_0x005e:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 10
            goto L_0x0094
        L_0x0069:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 9
            goto L_0x0094
        L_0x0074:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 8
            goto L_0x0094
        L_0x007f:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 4
            goto L_0x0094
        L_0x0089:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 3
            goto L_0x0094
        L_0x0093:
            r0 = -1
        L_0x0094:
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00bc;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00b3;
                case 12: goto L_0x00b0;
                default: goto L_0x0097;
            }
        L_0x0097:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  UNKNOWN  "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WARNING! KeyCycle"
            android.util.Log.v(r0, r3)
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        L_0x00b0:
            float r3 = r2.f1468k
            return r3
        L_0x00b3:
            float r3 = r2.f1467j
            return r3
        L_0x00b6:
            float r3 = r2.f1480w
            return r3
        L_0x00b9:
            float r3 = r2.f1479v
            return r3
        L_0x00bc:
            float r3 = r2.f1478u
            return r3
        L_0x00bf:
            float r3 = r2.f1477t
            return r3
        L_0x00c2:
            float r3 = r2.f1476s
            return r3
        L_0x00c5:
            float r3 = r2.f1473p
            return r3
        L_0x00c8:
            float r3 = r2.f1475r
            return r3
        L_0x00cb:
            float r3 = r2.f1474q
            return r3
        L_0x00ce:
            float r3 = r2.f1472o
            return r3
        L_0x00d1:
            float r3 = r2.f1471n
            return r3
        L_0x00d4:
            float r3 = r2.f1470m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0324f.mo2197b(java.lang.String):float");
    }

    /* renamed from: c */
    public void mo2198c(HashMap<String, C0326g> hashMap) {
        HashMap<String, C0326g> hashMap2 = hashMap;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C0418a aVar = (C0418a) this.f1446d.get(str.substring(7));
                if (aVar != null && aVar.mo2392a() == C0420b.FLOAT_TYPE) {
                    ((C0326g) hashMap2.get(str)).mo2201a(this.f1443a, this.f1465h, this.f1469l, this.f1466i, this.f1467j, aVar.mo2396b(), aVar);
                }
            }
            float b = mo2197b(str);
            if (!Float.isNaN(b)) {
                ((C0326g) hashMap2.get(str)).mo2200a(this.f1443a, this.f1465h, this.f1469l, this.f1466i, this.f1467j, b);
            }
        }
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0325a.m1889b(this, context.obtainStyledAttributes(attributeSet, C0436i.KeyCycle));
    }

    /* renamed from: a */
    public void mo2194a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1470m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1471n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1472o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1474q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1475r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1476s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1477t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1473p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1478u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1479v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1480w)) {
            hashSet.add("translationZ");
        }
        if (this.f1446d.size() > 0) {
            for (String str : this.f1446d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                hashSet.add(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2193a(HashMap<String, C0363u> hashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("add ");
        sb.append(hashMap.size());
        sb.append(" values");
        C0319b.m1808a("KeyCycle", sb.toString(), 2);
        for (String str : hashMap.keySet()) {
            C0363u uVar = (C0363u) hashMap.get(str);
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 12;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    uVar.mo2299a(this.f1443a, this.f1470m);
                    break;
                case 1:
                    uVar.mo2299a(this.f1443a, this.f1471n);
                    break;
                case 2:
                    uVar.mo2299a(this.f1443a, this.f1472o);
                    break;
                case 3:
                    uVar.mo2299a(this.f1443a, this.f1474q);
                    break;
                case 4:
                    uVar.mo2299a(this.f1443a, this.f1475r);
                    break;
                case 5:
                    uVar.mo2299a(this.f1443a, this.f1473p);
                    break;
                case 6:
                    uVar.mo2299a(this.f1443a, this.f1476s);
                    break;
                case 7:
                    uVar.mo2299a(this.f1443a, this.f1477t);
                    break;
                case 8:
                    uVar.mo2299a(this.f1443a, this.f1478u);
                    break;
                case 9:
                    uVar.mo2299a(this.f1443a, this.f1479v);
                    break;
                case 10:
                    uVar.mo2299a(this.f1443a, this.f1480w);
                    break;
                case 11:
                    uVar.mo2299a(this.f1443a, this.f1467j);
                    break;
                case 12:
                    uVar.mo2299a(this.f1443a, this.f1468k);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  UNKNOWN  ");
                    sb2.append(str);
                    Log.v("WARNING KeyCycle", sb2.toString());
                    break;
            }
        }
    }
}
