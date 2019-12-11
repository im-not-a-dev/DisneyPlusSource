package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0436i;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.k */
/* compiled from: KeySpring */
public class C0347k extends C0321d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f1515f = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f1516g = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1517h = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1518i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1519j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1520k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1521l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1522m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1523n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1524o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1525p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1526q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1527r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1528s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1529t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1530u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1531v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f1532w = -1;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f1533x = C0321d.f1442e;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f1534y = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    /* compiled from: KeySpring */
    private static class C0348a {

        /* renamed from: a */
        private static SparseIntArray f1535a = new SparseIntArray();

        static {
            f1535a.append(C0436i.KeySpring_android_alpha, 4);
            f1535a.append(C0436i.KeySpring_android_elevation, 5);
            f1535a.append(C0436i.KeySpring_android_rotation, 6);
            f1535a.append(C0436i.KeySpring_android_rotationX, 7);
            f1535a.append(C0436i.KeySpring_android_rotationY, 8);
            f1535a.append(C0436i.KeySpring_android_scaleX, 10);
            f1535a.append(C0436i.KeySpring_transitionPathRotate, 9);
            f1535a.append(C0436i.KeySpring_motionTarget, 1);
            f1535a.append(C0436i.KeySpring_curveFit, 3);
            f1535a.append(C0436i.KeySpring_motionTriggerId, 22);
            f1535a.append(C0436i.KeySpring_framePosition, 2);
            f1535a.append(C0436i.KeySpring_android_scaleY, 11);
            f1535a.append(C0436i.KeySpring_android_translationX, 12);
            f1535a.append(C0436i.KeySpring_android_translationY, 13);
            f1535a.append(C0436i.KeySpring_android_translationZ, 14);
            f1535a.append(C0436i.KeySpring_motionProgress, 15);
            f1535a.append(C0436i.KeySpring_springPeriod, 16);
            f1535a.append(C0436i.KeySpring_springImpulse, 17);
            f1535a.append(C0436i.KeySpring_springFactor, 18);
            f1535a.append(C0436i.KeySpring_springTracks, 19);
            f1535a.append(C0436i.KeySpring_springDecay, 20);
            f1535a.append(C0436i.KeySpring_springReverseTrack, 21);
        }

        /* renamed from: a */
        public static void m1968a(C0347k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1535a.get(index)) {
                    case 1:
                        if (typedArray.peekValue(index).type == 3) {
                            kVar.f1445c = typedArray.getString(index);
                            break;
                        } else {
                            kVar.f1444b = typedArray.getResourceId(index, kVar.f1444b);
                            continue;
                        }
                    case 2:
                        kVar.f1443a = typedArray.getInt(index, kVar.f1443a);
                        continue;
                    case 3:
                        kVar.f1532w = typedArray.getInteger(index, kVar.f1532w);
                        break;
                    case 4:
                        break;
                    case 5:
                        kVar.f1516g = typedArray.getDimension(index, kVar.f1516g);
                        continue;
                    case 6:
                        kVar.f1517h = typedArray.getFloat(index, kVar.f1517h);
                        continue;
                    case 7:
                        kVar.f1518i = typedArray.getFloat(index, kVar.f1518i);
                        continue;
                    case 8:
                        kVar.f1519j = typedArray.getFloat(index, kVar.f1519j);
                        continue;
                    case 9:
                        kVar.f1520k = typedArray.getFloat(index, kVar.f1520k);
                        continue;
                    case 10:
                        kVar.f1521l = typedArray.getFloat(index, kVar.f1521l);
                        continue;
                    case 11:
                        kVar.f1522m = typedArray.getFloat(index, kVar.f1522m);
                        continue;
                    case 12:
                        kVar.f1523n = typedArray.getDimension(index, kVar.f1523n);
                        continue;
                    case 13:
                        kVar.f1524o = typedArray.getDimension(index, kVar.f1524o);
                        continue;
                    case 14:
                        if (VERSION.SDK_INT >= 21) {
                            kVar.f1525p = typedArray.getDimension(index, kVar.f1525p);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        kVar.f1526q = typedArray.getFloat(index, kVar.f1526q);
                        continue;
                    case 16:
                        kVar.f1528s = typedArray.getFloat(index, kVar.f1528s);
                        continue;
                    case 17:
                        if (typedArray.peekValue(index).type != 5) {
                            kVar.f1529t = typedArray.getFloat(index, kVar.f1529t);
                            break;
                        } else {
                            kVar.f1529t = typedArray.getDimension(index, kVar.f1529t);
                            continue;
                        }
                    case 18:
                        kVar.f1534y = typedArray.getFloat(index, kVar.f1534y);
                        continue;
                    case 19:
                        kVar.f1530u = typedArray.getInt(index, kVar.f1530u);
                        continue;
                    case 20:
                        kVar.f1527r = typedArray.getFloat(index, kVar.f1527r);
                        continue;
                    case 21:
                        kVar.f1531v = typedArray.getBoolean(index, kVar.f1531v);
                        continue;
                    case 22:
                        kVar.f1533x = typedArray.getResourceId(index, kVar.f1533x);
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1535a.get(index));
                        Log.e("KeySpring", sb.toString());
                        continue;
                }
                kVar.f1515f = typedArray.getFloat(index, kVar.f1515f);
            }
        }
    }

    /* renamed from: b */
    public void mo2196b(HashMap<String, Integer> hashMap) {
        if (this.f1532w != -1) {
            if (!Float.isNaN(this.f1515f)) {
                hashMap.put("alpha", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1516g)) {
                hashMap.put("elevation", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1517h)) {
                hashMap.put("rotation", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1518i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1519j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1523n)) {
                hashMap.put("translationX", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1524o)) {
                hashMap.put("translationY", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1525p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1520k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1521l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1521l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1532w));
            }
            if (!Float.isNaN(this.f1526q)) {
                hashMap.put("progress", Integer.valueOf(this.f1532w));
            }
            if (this.f1446d.size() > 0) {
                for (String str : this.f1446d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1532w));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00d0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2214c(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0378v> r14) {
        /*
            r13 = this;
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x024c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.v r3 = (androidx.constraintlayout.motion.widget.C0378v) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0048
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r13.f1446d
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0418a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.v$b r4 = (androidx.constraintlayout.motion.widget.C0378v.C0380b) r4
            int r5 = r13.f1443a
            float r7 = r13.f1528s
            float r8 = r13.f1527r
            float r9 = r13.f1534y
            int r10 = r13.f1530u
            boolean r11 = r13.f1531v
            float r12 = r13.f1529t
            r4.mo2312a(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0008
        L_0x0048:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00c5;
                case -1249320805: goto L_0x00bb;
                case -1225497657: goto L_0x00b0;
                case -1225497656: goto L_0x00a5;
                case -1225497655: goto L_0x009a;
                case -1001078227: goto L_0x008f;
                case -908189618: goto L_0x0085;
                case -908189617: goto L_0x007c;
                case -40300674: goto L_0x0072;
                case -4379043: goto L_0x0068;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x00cf
        L_0x0052:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 0
            goto L_0x00d0
        L_0x005d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 5
            goto L_0x00d0
        L_0x0068:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 1
            goto L_0x00d0
        L_0x0072:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 2
            goto L_0x00d0
        L_0x007c:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x0085:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 6
            goto L_0x00d0
        L_0x008f:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 11
            goto L_0x00d0
        L_0x009a:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 10
            goto L_0x00d0
        L_0x00a5:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 9
            goto L_0x00d0
        L_0x00b0:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 8
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 4
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 3
            goto L_0x00d0
        L_0x00cf:
            r4 = -1
        L_0x00d0:
            switch(r4) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0212;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01bb;
                case 5: goto L_0x019e;
                case 6: goto L_0x0181;
                case 7: goto L_0x0164;
                case 8: goto L_0x0147;
                case 9: goto L_0x012a;
                case 10: goto L_0x010d;
                case 11: goto L_0x00f0;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeySprings"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f0:
            float r1 = r13.f1526q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1526q
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x010d:
            float r1 = r13.f1525p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1525p
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x012a:
            float r1 = r13.f1524o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1524o
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0147:
            float r1 = r13.f1523n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1523n
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0164:
            float r1 = r13.f1522m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1522m
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0181:
            float r1 = r13.f1521l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1521l
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x019e:
            float r1 = r13.f1520k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1520k
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01bb:
            float r1 = r13.f1519j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1519j
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01d8:
            float r1 = r13.f1518i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1518i
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01f5:
            float r1 = r13.f1517h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1517h
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0212:
            float r1 = r13.f1516g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1516g
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x022f:
            float r1 = r13.f1515f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1443a
            float r5 = r13.f1515f
            float r6 = r13.f1528s
            float r7 = r13.f1527r
            float r8 = r13.f1534y
            int r9 = r13.f1530u
            boolean r10 = r13.f1531v
            float r11 = r13.f1529t
            r3.mo2307a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0347k.mo2214c(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0348a.m1968a(this, context.obtainStyledAttributes(attributeSet, C0436i.KeySpring));
    }

    /* renamed from: a */
    public void mo2194a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1515f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1516g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1517h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1518i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1519j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1523n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1524o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1525p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1520k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1521l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1522m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1526q)) {
            hashSet.add("progress");
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
        throw new IllegalArgumentException(" KeySprings do not support SplineSet");
    }
}
