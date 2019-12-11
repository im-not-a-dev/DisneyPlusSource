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

/* renamed from: androidx.constraintlayout.motion.widget.l */
/* compiled from: KeyTimeCycle */
public class C0349l extends C0321d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1536f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1537g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1538h = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1539i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1540j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1541k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1542l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1543m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1544n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1545o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1546p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1547q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1548r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1549s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f1550t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1551u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1552v = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    /* compiled from: KeyTimeCycle */
    private static class C0350a {

        /* renamed from: a */
        private static SparseIntArray f1553a = new SparseIntArray();

        static {
            f1553a.append(C0436i.KeyTimeCycle_android_alpha, 1);
            f1553a.append(C0436i.KeyTimeCycle_android_elevation, 2);
            f1553a.append(C0436i.KeyTimeCycle_android_rotation, 4);
            f1553a.append(C0436i.KeyTimeCycle_android_rotationX, 5);
            f1553a.append(C0436i.KeyTimeCycle_android_rotationY, 6);
            f1553a.append(C0436i.KeyTimeCycle_android_scaleX, 7);
            f1553a.append(C0436i.KeyTimeCycle_transitionPathRotate, 8);
            f1553a.append(C0436i.KeyTimeCycle_transitionEasing, 9);
            f1553a.append(C0436i.KeyTimeCycle_motionTarget, 10);
            f1553a.append(C0436i.KeyTimeCycle_framePosition, 12);
            f1553a.append(C0436i.KeyTimeCycle_curveFit, 13);
            f1553a.append(C0436i.KeyTimeCycle_android_scaleY, 14);
            f1553a.append(C0436i.KeyTimeCycle_android_translationX, 15);
            f1553a.append(C0436i.KeyTimeCycle_android_translationY, 16);
            f1553a.append(C0436i.KeyTimeCycle_android_translationZ, 17);
            f1553a.append(C0436i.KeyTimeCycle_motionProgress, 18);
            f1553a.append(C0436i.KeyTimeCycle_wavePeriod, 20);
            f1553a.append(C0436i.KeyTimeCycle_waveOffset, 21);
            f1553a.append(C0436i.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m2007a(C0349l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1553a.get(index)) {
                    case 1:
                        lVar.f1538h = typedArray.getFloat(index, lVar.f1538h);
                        break;
                    case 2:
                        lVar.f1539i = typedArray.getDimension(index, lVar.f1539i);
                        break;
                    case 4:
                        lVar.f1540j = typedArray.getFloat(index, lVar.f1540j);
                        break;
                    case 5:
                        lVar.f1541k = typedArray.getFloat(index, lVar.f1541k);
                        break;
                    case 6:
                        lVar.f1542l = typedArray.getFloat(index, lVar.f1542l);
                        break;
                    case 7:
                        lVar.f1544n = typedArray.getFloat(index, lVar.f1544n);
                        break;
                    case 8:
                        lVar.f1543m = typedArray.getFloat(index, lVar.f1543m);
                        break;
                    case 9:
                        lVar.f1536f = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type != 3) {
                            lVar.f1444b = typedArray.getResourceId(index, lVar.f1444b);
                            break;
                        } else {
                            lVar.f1445c = typedArray.getString(index);
                            break;
                        }
                    case 12:
                        lVar.f1443a = typedArray.getInt(index, lVar.f1443a);
                        break;
                    case 13:
                        lVar.f1537g = typedArray.getInteger(index, lVar.f1537g);
                        break;
                    case 14:
                        lVar.f1545o = typedArray.getFloat(index, lVar.f1545o);
                        break;
                    case 15:
                        lVar.f1546p = typedArray.getDimension(index, lVar.f1546p);
                        break;
                    case 16:
                        lVar.f1547q = typedArray.getDimension(index, lVar.f1547q);
                        break;
                    case 17:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            lVar.f1548r = typedArray.getDimension(index, lVar.f1548r);
                            break;
                        }
                    case 18:
                        lVar.f1549s = typedArray.getFloat(index, lVar.f1549s);
                        break;
                    case 19:
                        lVar.f1550t = typedArray.getInt(index, lVar.f1550t);
                        break;
                    case 20:
                        lVar.f1551u = typedArray.getFloat(index, lVar.f1551u);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            lVar.f1552v = typedArray.getFloat(index, lVar.f1552v);
                            break;
                        } else {
                            lVar.f1552v = typedArray.getDimension(index, lVar.f1552v);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1553a.get(index));
                        Log.e("KeyTimeCycle", sb.toString());
                        break;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00ca;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2215c(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0394w> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.w r3 = (androidx.constraintlayout.motion.widget.C0394w) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f1446d
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0418a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.w$b r4 = (androidx.constraintlayout.motion.widget.C0394w.C0396b) r4
            int r5 = r10.f1443a
            float r7 = r10.f1551u
            int r8 = r10.f1550t
            float r9 = r10.f1552v
            r4.mo2327a(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00bf;
                case -1249320805: goto L_0x00b5;
                case -1225497657: goto L_0x00aa;
                case -1225497656: goto L_0x009f;
                case -1225497655: goto L_0x0094;
                case -1001078227: goto L_0x0089;
                case -908189618: goto L_0x007f;
                case -908189617: goto L_0x0076;
                case -40300674: goto L_0x006c;
                case -4379043: goto L_0x0062;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00c9
        L_0x004c:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 0
            goto L_0x00ca
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 5
            goto L_0x00ca
        L_0x0062:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x006c:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 2
            goto L_0x00ca
        L_0x0076:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x007f:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 6
            goto L_0x00ca
        L_0x0089:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 11
            goto L_0x00ca
        L_0x0094:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 10
            goto L_0x00ca
        L_0x009f:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 9
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 8
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 4
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 3
            goto L_0x00ca
        L_0x00c9:
            r4 = -1
        L_0x00ca:
            switch(r4) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01d0;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01a2;
                case 4: goto L_0x018b;
                case 5: goto L_0x0174;
                case 6: goto L_0x015d;
                case 7: goto L_0x0146;
                case 8: goto L_0x012f;
                case 9: goto L_0x0118;
                case 10: goto L_0x0101;
                case 11: goto L_0x00ea;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00ea:
            float r1 = r10.f1549s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1549s
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0101:
            float r1 = r10.f1548r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1548r
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0118:
            float r1 = r10.f1547q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1547q
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x012f:
            float r1 = r10.f1546p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1546p
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0146:
            float r1 = r10.f1545o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1545o
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x015d:
            float r1 = r10.f1544n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1544n
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0174:
            float r1 = r10.f1543m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1543m
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x018b:
            float r1 = r10.f1542l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1542l
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01a2:
            float r1 = r10.f1541k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1541k
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01b9:
            float r1 = r10.f1540j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1540j
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01d0:
            float r1 = r10.f1539i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1539i
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01e7:
            float r1 = r10.f1538h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1443a
            float r5 = r10.f1538h
            float r6 = r10.f1551u
            int r7 = r10.f1550t
            float r8 = r10.f1552v
            r3.mo2323a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0349l.mo2215c(java.util.HashMap):void");
    }

    /* renamed from: b */
    public void mo2196b(HashMap<String, Integer> hashMap) {
        if (this.f1537g != -1) {
            if (!Float.isNaN(this.f1538h)) {
                hashMap.put("alpha", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1539i)) {
                hashMap.put("elevation", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1540j)) {
                hashMap.put("rotation", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1541k)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1542l)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1546p)) {
                hashMap.put("translationX", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1547q)) {
                hashMap.put("translationY", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1548r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1543m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1544n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1544n)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1537g));
            }
            if (!Float.isNaN(this.f1549s)) {
                hashMap.put("progress", Integer.valueOf(this.f1537g));
            }
            if (this.f1446d.size() > 0) {
                for (String str : this.f1446d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1537g));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0350a.m2007a(this, context.obtainStyledAttributes(attributeSet, C0436i.KeyTimeCycle));
    }

    /* renamed from: a */
    public void mo2194a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1538h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1539i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1540j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1541k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1542l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1546p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1547q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1548r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1543m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1544n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1545o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1549s)) {
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
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }
}
