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

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* compiled from: KeyAttributes */
public class C0322e extends C0321d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1447f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1448g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f1449h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1450i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1451j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1452k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1453l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1454m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1455n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1456o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1457p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1458q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1459r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1460s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1461t = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.e$a */
    /* compiled from: KeyAttributes */
    private static class C0323a {

        /* renamed from: a */
        private static SparseIntArray f1462a = new SparseIntArray();

        static {
            f1462a.append(C0436i.KeyAttribute_android_alpha, 1);
            f1462a.append(C0436i.KeyAttribute_android_elevation, 2);
            f1462a.append(C0436i.KeyAttribute_android_rotation, 4);
            f1462a.append(C0436i.KeyAttribute_android_rotationX, 5);
            f1462a.append(C0436i.KeyAttribute_android_rotationY, 6);
            f1462a.append(C0436i.KeyAttribute_android_scaleX, 7);
            f1462a.append(C0436i.KeyAttribute_transitionPathRotate, 8);
            f1462a.append(C0436i.KeyAttribute_transitionEasing, 9);
            f1462a.append(C0436i.KeyAttribute_motionTarget, 10);
            f1462a.append(C0436i.KeyAttribute_framePosition, 12);
            f1462a.append(C0436i.KeyAttribute_curveFit, 13);
            f1462a.append(C0436i.KeyAttribute_android_visibility, 14);
            f1462a.append(C0436i.KeyAttribute_android_scaleY, 15);
            f1462a.append(C0436i.KeyAttribute_android_translationX, 16);
            f1462a.append(C0436i.KeyAttribute_android_translationY, 17);
            f1462a.append(C0436i.KeyAttribute_android_translationZ, 18);
            f1462a.append(C0436i.KeyAttribute_motionProgress, 19);
        }

        /* renamed from: a */
        public static void m1847a(C0322e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1462a.get(index)) {
                    case 1:
                        eVar.f1450i = typedArray.getFloat(index, eVar.f1450i);
                        break;
                    case 2:
                        eVar.f1451j = typedArray.getDimension(index, eVar.f1451j);
                        break;
                    case 4:
                        eVar.f1452k = typedArray.getFloat(index, eVar.f1452k);
                        break;
                    case 5:
                        eVar.f1453l = typedArray.getFloat(index, eVar.f1453l);
                        break;
                    case 6:
                        eVar.f1454m = typedArray.getFloat(index, eVar.f1454m);
                        break;
                    case 7:
                        eVar.f1456o = typedArray.getFloat(index, eVar.f1456o);
                        break;
                    case 8:
                        eVar.f1455n = typedArray.getFloat(index, eVar.f1455n);
                        break;
                    case 9:
                        eVar.f1447f = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type != 3) {
                            eVar.f1444b = typedArray.getResourceId(index, eVar.f1444b);
                            break;
                        } else {
                            eVar.f1445c = typedArray.getString(index);
                            break;
                        }
                    case 12:
                        eVar.f1443a = typedArray.getInt(index, eVar.f1443a);
                        break;
                    case 13:
                        eVar.f1448g = typedArray.getInteger(index, eVar.f1448g);
                        break;
                    case 14:
                        eVar.f1449h = typedArray.getBoolean(index, eVar.f1449h);
                        break;
                    case 15:
                        eVar.f1457p = typedArray.getFloat(index, eVar.f1457p);
                        break;
                    case 16:
                        eVar.f1458q = typedArray.getDimension(index, eVar.f1458q);
                        break;
                    case 17:
                        eVar.f1459r = typedArray.getDimension(index, eVar.f1459r);
                        break;
                    case 18:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            eVar.f1460s = typedArray.getDimension(index, eVar.f1460s);
                            break;
                        }
                    case 19:
                        eVar.f1461t = typedArray.getFloat(index, eVar.f1461t);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1462a.get(index));
                        Log.e("KeyAttribute", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2196b(HashMap<String, Integer> hashMap) {
        if (this.f1448g != -1) {
            if (!Float.isNaN(this.f1450i)) {
                hashMap.put("alpha", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1451j)) {
                hashMap.put("elevation", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1452k)) {
                hashMap.put("rotation", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1453l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1454m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1458q)) {
                hashMap.put("translationX", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1459r)) {
                hashMap.put("translationY", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1460s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1455n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1456o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1457p)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1448g));
            }
            if (!Float.isNaN(this.f1461t)) {
                hashMap.put("progress", Integer.valueOf(this.f1448g));
            }
            if (this.f1446d.size() > 0) {
                for (String str : this.f1446d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1448g));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0323a.m1847a(this, context.obtainStyledAttributes(attributeSet, C0436i.KeyAttribute));
    }

    /* renamed from: a */
    public void mo2194a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1450i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1451j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1452k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1453l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1454m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1458q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1459r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1460s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1455n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1456o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1456o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1461t)) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00c1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2193a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0363u> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ad
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.u r2 = (androidx.constraintlayout.motion.widget.C0363u) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f1446d
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0418a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.widget.u$b r2 = (androidx.constraintlayout.motion.widget.C0363u.C0365b) r2
            int r3 = r6.f1443a
            r2.mo2303a(r3, r1)
            goto L_0x0008
        L_0x0039:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00b6;
                case -1249320805: goto L_0x00ac;
                case -1225497657: goto L_0x00a1;
                case -1225497656: goto L_0x0096;
                case -1225497655: goto L_0x008b;
                case -1001078227: goto L_0x0080;
                case -908189618: goto L_0x0076;
                case -908189617: goto L_0x006d;
                case -40300674: goto L_0x0063;
                case -4379043: goto L_0x0059;
                case 37232917: goto L_0x004e;
                case 92909918: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x00c0
        L_0x0043:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 0
            goto L_0x00c1
        L_0x004e:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 5
            goto L_0x00c1
        L_0x0059:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x0063:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 2
            goto L_0x00c1
        L_0x006d:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x0076:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 6
            goto L_0x00c1
        L_0x0080:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 11
            goto L_0x00c1
        L_0x008b:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 10
            goto L_0x00c1
        L_0x0096:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 9
            goto L_0x00c1
        L_0x00a1:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 8
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 4
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 3
            goto L_0x00c1
        L_0x00c0:
            r4 = -1
        L_0x00c1:
            switch(r4) {
                case 0: goto L_0x019c;
                case 1: goto L_0x018b;
                case 2: goto L_0x017a;
                case 3: goto L_0x0169;
                case 4: goto L_0x0158;
                case 5: goto L_0x0147;
                case 6: goto L_0x0136;
                case 7: goto L_0x0125;
                case 8: goto L_0x0114;
                case 9: goto L_0x0103;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00e1;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyAttributes"
            android.util.Log.v(r2, r1)
            goto L_0x0008
        L_0x00e1:
            float r1 = r6.f1461t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1461t
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.f1460s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1460s
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.f1459r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1459r
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.f1458q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1458q
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.f1457p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1457p
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.f1456o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1456o
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.f1455n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1455n
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.f1454m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1454m
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.f1453l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1453l
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.f1452k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1452k
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.f1451j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1451j
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.f1450i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1443a
            float r3 = r6.f1450i
            r2.mo2299a(r1, r3)
            goto L_0x0008
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0322e.mo2193a(java.util.HashMap):void");
    }
}
