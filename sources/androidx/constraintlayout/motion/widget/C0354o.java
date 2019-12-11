package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.C0418a;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p096e.p114f.p115a.p116a.C3945b;
import p096e.p114f.p115a.p116a.C3947c;
import p096e.p114f.p117b.p118j.C3973f;

/* renamed from: androidx.constraintlayout.motion.widget.o */
/* compiled from: MotionController */
public class C0354o {

    /* renamed from: A */
    private C0351m[] f1589A;

    /* renamed from: a */
    View f1590a;

    /* renamed from: b */
    int f1591b;

    /* renamed from: c */
    private int f1592c = -1;

    /* renamed from: d */
    private C0357r f1593d = new C0357r();

    /* renamed from: e */
    private C0357r f1594e = new C0357r();

    /* renamed from: f */
    private C0353n f1595f = new C0353n();

    /* renamed from: g */
    private C0353n f1596g = new C0353n();

    /* renamed from: h */
    private C3945b[] f1597h;

    /* renamed from: i */
    private C3945b f1598i;

    /* renamed from: j */
    float f1599j = Float.NaN;

    /* renamed from: k */
    float f1600k = 0.0f;

    /* renamed from: l */
    float f1601l = 1.0f;

    /* renamed from: m */
    private int[] f1602m;

    /* renamed from: n */
    private double[] f1603n;

    /* renamed from: o */
    private double[] f1604o;

    /* renamed from: p */
    private String[] f1605p;

    /* renamed from: q */
    private int[] f1606q;

    /* renamed from: r */
    private int f1607r = 4;

    /* renamed from: s */
    private float[] f1608s = new float[this.f1607r];

    /* renamed from: t */
    private ArrayList<C0357r> f1609t = new ArrayList<>();

    /* renamed from: u */
    private float[] f1610u = new float[1];

    /* renamed from: v */
    private ArrayList<C0321d> f1611v = new ArrayList<>();

    /* renamed from: w */
    private HashMap<String, C0394w> f1612w;

    /* renamed from: x */
    private HashMap<String, C0378v> f1613x;

    /* renamed from: y */
    private HashMap<String, C0363u> f1614y;

    /* renamed from: z */
    private HashMap<String, C0326g> f1615z;

    C0354o(View view) {
        mo2239b(view);
    }

    /* renamed from: d */
    private float m2036d() {
        float[] fArr = new float[2];
        float f = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = ((float) i) * f;
            double d3 = (double) f3;
            C3947c cVar = this.f1593d.f1629c;
            float f4 = Float.NaN;
            Iterator it = this.f1609t.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                C0357r rVar = (C0357r) it.next();
                C3947c cVar2 = rVar.f1629c;
                float f6 = f;
                if (cVar2 != null) {
                    float f7 = rVar.f1622V;
                    if (f7 < f3) {
                        f5 = f7;
                        cVar = cVar2;
                    } else if (Float.isNaN(f4)) {
                        f4 = rVar.f1622V;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (cVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f9 = f4 - f5;
                d3 = (double) ((((float) cVar.mo14199a((double) ((f3 - f5) / f9))) * f9) + f5);
            }
            this.f1597h[0].mo14185a(d3, this.f1603n);
            this.f1593d.mo2259a(this.f1602m, this.f1603n, fArr, 0);
            if (i > 0) {
                f2 = (float) (((double) f2) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
            i++;
            f = f8;
        }
        return f2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0357r mo2228a(int i) {
        return (C0357r) this.f1609t.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2238b() {
        return this.f1594e.f1624X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo2241c() {
        return this.f1594e.f1625Y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" start: x: ");
        sb.append(this.f1593d.f1624X);
        String str = " y: ";
        sb.append(str);
        sb.append(this.f1593d.f1625Y);
        sb.append(" end: x: ");
        sb.append(this.f1594e.f1624X);
        sb.append(str);
        sb.append(this.f1594e.f1625Y);
        return sb.toString();
    }

    /* renamed from: b */
    private void m2035b(C0357r rVar) {
        rVar.mo2251a((float) ((int) this.f1590a.getX()), (float) ((int) this.f1590a.getY()), (float) this.f1590a.getWidth(), (float) this.f1590a.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2236a(float[] fArr, int i) {
        float[] fArr2 = fArr;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, C0363u> hashMap = this.f1614y;
        String str = "translationX";
        C0326g gVar = null;
        C0363u uVar = hashMap == null ? null : (C0363u) hashMap.get(str);
        HashMap<String, C0363u> hashMap2 = this.f1614y;
        String str2 = "translationY";
        C0363u uVar2 = hashMap2 == null ? null : (C0363u) hashMap2.get(str2);
        HashMap<String, C0326g> hashMap3 = this.f1615z;
        C0326g gVar2 = hashMap3 == null ? null : (C0326g) hashMap3.get(str);
        HashMap<String, C0326g> hashMap4 = this.f1615z;
        if (hashMap4 != null) {
            gVar = (C0326g) hashMap4.get(str2);
        }
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = 0.0f;
            if (this.f1601l != f) {
                if (f3 < this.f1600k) {
                    f3 = 0.0f;
                }
                float f5 = this.f1600k;
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = (f3 - f5) * this.f1601l;
                }
            }
            double d = (double) f3;
            C3947c cVar = this.f1593d.f1629c;
            float f6 = Float.NaN;
            Iterator it = this.f1609t.iterator();
            while (it.hasNext()) {
                C0357r rVar = (C0357r) it.next();
                C3947c cVar2 = rVar.f1629c;
                if (cVar2 != null) {
                    C3947c cVar3 = cVar2;
                    float f7 = rVar.f1622V;
                    if (f7 < f3) {
                        f4 = f7;
                        cVar = cVar3;
                    } else if (Float.isNaN(f6)) {
                        f6 = rVar.f1622V;
                    }
                }
                int i4 = i;
            }
            if (cVar != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) cVar.mo14199a((double) ((f3 - f4) / f8))) * f8) + f4);
            }
            this.f1597h[0].mo14185a(d, this.f1603n);
            C3945b bVar = this.f1598i;
            if (bVar != null) {
                double[] dArr = this.f1603n;
                if (dArr.length > 0) {
                    bVar.mo14185a(d, dArr);
                }
            }
            int i5 = i3 * 2;
            this.f1593d.mo2259a(this.f1602m, this.f1603n, fArr2, i5);
            if (gVar2 != null) {
                fArr2[i5] = fArr2[i5] + gVar2.mo2199a(f3);
            } else if (uVar != null) {
                fArr2[i5] = fArr2[i5] + uVar.mo2297a(f3);
            }
            if (gVar != null) {
                int i6 = i5 + 1;
                fArr2[i6] = fArr2[i6] + gVar.mo2199a(f3);
            } else if (uVar2 != null) {
                int i7 = i5 + 1;
                fArr2[i7] = fArr2[i7] + uVar2.mo2297a(f3);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    /* renamed from: b */
    public void mo2239b(View view) {
        this.f1590a = view;
        this.f1591b = view.getId();
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0415c) {
            ((C0415c) layoutParams).mo2377a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2240b(C3973f fVar, C0425d dVar) {
        C0357r rVar = this.f1593d;
        rVar.f1622V = 0.0f;
        rVar.f1623W = 0.0f;
        m2035b(rVar);
        this.f1593d.mo2251a((float) fVar.mo14319E(), (float) fVar.mo14320F(), (float) fVar.mo14316B(), (float) fVar.mo14381l());
        C0426a b = dVar.mo2424b(this.f1591b);
        this.f1593d.mo2257a(b);
        this.f1599j = b.f1878c.f1951f;
        this.f1595f.mo2222a(fVar, dVar, this.f1591b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2227a(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] a = this.f1597h[0].mo14187a();
        if (iArr != null) {
            Iterator it = this.f1609t.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                iArr[i] = ((C0357r) it.next()).f1632e0;
                i = i2;
            }
        }
        int i3 = 0;
        for (double a2 : a) {
            this.f1597h[0].mo14185a(a2, this.f1603n);
            this.f1593d.mo2259a(this.f1602m, this.f1603n, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2230a(float f, float[] fArr, int i) {
        this.f1597h[0].mo14185a((double) m2033a(f, (float[]) null), this.f1603n);
        this.f1593d.mo2261b(this.f1602m, this.f1603n, fArr, i);
    }

    /* renamed from: a */
    private void m2034a(C0357r rVar) {
        int binarySearch = Collections.binarySearch(this.f1609t, rVar);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath positon \"");
            sb.append(rVar.f1623W);
            sb.append("\" outside of range");
            Log.e("MotionController", sb.toString());
        }
        this.f1609t.add((-binarySearch) - 1, rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2235a(ArrayList<C0321d> arrayList) {
        this.f1611v.addAll(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2233a(C0321d dVar) {
        this.f1611v.add(dVar);
    }

    /* renamed from: a */
    public void mo2231a(int i, int i2, float f) {
        ArrayList arrayList;
        C0378v vVar;
        C0394w wVar;
        C0363u uVar;
        Class<double> cls = double.class;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashMap hashMap = new HashMap();
        this.f1595f.mo2220a(this.f1596g, hashSet3);
        ArrayList<C0321d> arrayList2 = this.f1611v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                C0321d dVar = (C0321d) it.next();
                if (dVar instanceof C0344i) {
                    C0344i iVar = (C0344i) dVar;
                    C0357r rVar = new C0357r(i, i2, iVar, this.f1593d, this.f1594e);
                    m2034a(rVar);
                    int i3 = iVar.f1514f;
                    if (i3 != C0321d.f1442e) {
                        this.f1592c = i3;
                    }
                } else if (dVar instanceof C0324f) {
                    dVar.mo2194a(hashSet4);
                } else if (dVar instanceof C0349l) {
                    dVar.mo2194a(hashSet2);
                } else if (dVar instanceof C0347k) {
                    dVar.mo2194a(hashSet);
                } else if (dVar instanceof C0351m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C0351m) dVar);
                } else {
                    dVar.mo2196b(hashMap);
                    dVar.mo2194a(hashSet3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f1589A = (C0351m[]) arrayList.toArray(new C0351m[0]);
        }
        String str = ",";
        String str2 = "CUSTOM,";
        char c = 1;
        if (!hashSet3.isEmpty()) {
            this.f1614y = new HashMap<>();
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str3.startsWith(str2)) {
                    SparseArray sparseArray = new SparseArray();
                    String str4 = str3.split(str)[c];
                    Iterator it3 = this.f1611v.iterator();
                    while (it3.hasNext()) {
                        C0321d dVar2 = (C0321d) it3.next();
                        HashMap<String, C0418a> hashMap2 = dVar2.f1446d;
                        if (hashMap2 != null) {
                            C0418a aVar = (C0418a) hashMap2.get(str4);
                            if (aVar != null) {
                                sparseArray.append(dVar2.f1443a, aVar);
                            }
                        }
                    }
                    uVar = C0363u.m2133a(str3, sparseArray);
                } else {
                    uVar = C0363u.m2134b(str3);
                }
                if (uVar != null) {
                    uVar.mo2301a(str3);
                    this.f1614y.put(str3, uVar);
                }
                c = 1;
            }
            ArrayList<C0321d> arrayList3 = this.f1611v;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C0321d dVar3 = (C0321d) it4.next();
                    if (dVar3 instanceof C0322e) {
                        dVar3.mo2193a(this.f1614y);
                    }
                }
            }
            this.f1595f.mo2223a(this.f1614y, 0);
            this.f1596g.mo2223a(this.f1614y, 100);
            for (String str5 : this.f1614y.keySet()) {
                ((C0363u) this.f1614y.get(str5)).mo2298a(hashMap.containsKey(str5) ? ((Integer) hashMap.get(str5)).intValue() : 0);
            }
        }
        if (!hashSet2.isEmpty()) {
            this.f1612w = new HashMap<>();
            Iterator it5 = hashSet2.iterator();
            while (it5.hasNext()) {
                String str6 = (String) it5.next();
                if (str6.startsWith(str2)) {
                    SparseArray sparseArray2 = new SparseArray();
                    String str7 = str6.split(str)[1];
                    Iterator it6 = this.f1611v.iterator();
                    while (it6.hasNext()) {
                        C0321d dVar4 = (C0321d) it6.next();
                        HashMap<String, C0418a> hashMap3 = dVar4.f1446d;
                        if (hashMap3 != null) {
                            C0418a aVar2 = (C0418a) hashMap3.get(str7);
                            if (aVar2 != null) {
                                sparseArray2.append(dVar4.f1443a, aVar2);
                            }
                        }
                    }
                    wVar = C0394w.m2194a(str6, sparseArray2);
                } else {
                    wVar = C0394w.m2195b(str6);
                }
                if (wVar != null) {
                    wVar.mo2324a(str6);
                    this.f1612w.put(str6, wVar);
                }
            }
            ArrayList<C0321d> arrayList4 = this.f1611v;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C0321d dVar5 = (C0321d) it7.next();
                    if (dVar5 instanceof C0349l) {
                        ((C0349l) dVar5).mo2215c(this.f1612w);
                    }
                }
            }
            for (String str8 : this.f1612w.keySet()) {
                ((C0394w) this.f1612w.get(str8)).mo2322a(hashMap.containsKey(str8) ? ((Integer) hashMap.get(str8)).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            this.f1613x = new HashMap<>();
            Iterator it8 = hashSet.iterator();
            while (it8.hasNext()) {
                String str9 = (String) it8.next();
                if (str9.startsWith(str2)) {
                    SparseArray sparseArray3 = new SparseArray();
                    String str10 = str9.split(str)[1];
                    Iterator it9 = this.f1611v.iterator();
                    while (it9.hasNext()) {
                        C0321d dVar6 = (C0321d) it9.next();
                        HashMap<String, C0418a> hashMap4 = dVar6.f1446d;
                        if (hashMap4 != null) {
                            C0418a aVar3 = (C0418a) hashMap4.get(str10);
                            if (aVar3 != null) {
                                sparseArray3.append(dVar6.f1443a, aVar3);
                            }
                        }
                    }
                    vVar = C0378v.m2161a(str9, sparseArray3);
                } else {
                    vVar = C0378v.m2162b(str9);
                }
                if (vVar != null) {
                    vVar.mo2309a(str9);
                    this.f1613x.put(str9, vVar);
                }
            }
            ArrayList<C0321d> arrayList5 = this.f1611v;
            if (arrayList5 != null) {
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    C0321d dVar7 = (C0321d) it10.next();
                    if (dVar7 instanceof C0347k) {
                        ((C0347k) dVar7).mo2214c(this.f1613x);
                    }
                }
            }
            for (String str11 : this.f1613x.keySet()) {
                ((C0378v) this.f1613x.get(str11)).mo2306a(hashMap.containsKey(str11) ? ((Integer) hashMap.get(str11)).intValue() : 0);
            }
        }
        C0357r[] rVarArr = new C0357r[(this.f1609t.size() + 2)];
        rVarArr[0] = this.f1593d;
        rVarArr[rVarArr.length - 1] = this.f1594e;
        if (this.f1609t.size() > 0 && this.f1592c == -1) {
            this.f1592c = 0;
        }
        Iterator it11 = this.f1609t.iterator();
        int i4 = 1;
        while (it11.hasNext()) {
            int i5 = i4 + 1;
            rVarArr[i4] = (C0357r) it11.next();
            i4 = i5;
        }
        HashSet hashSet5 = new HashSet();
        for (String str12 : this.f1594e.f1631d0.keySet()) {
            if (this.f1593d.f1631d0.containsKey(str12)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str12);
                if (!hashSet3.contains(sb.toString())) {
                    hashSet5.add(str12);
                }
            }
        }
        this.f1605p = (String[]) hashSet5.toArray(new String[0]);
        this.f1606q = new int[this.f1605p.length];
        int i6 = 0;
        while (true) {
            String[] strArr = this.f1605p;
            if (i6 >= strArr.length) {
                break;
            }
            String str13 = strArr[i6];
            this.f1606q[i6] = 1;
            int i7 = 0;
            while (true) {
                if (i7 >= rVarArr.length) {
                    break;
                } else if (rVarArr[i6].f1631d0.containsKey(str13)) {
                    this.f1606q[i6] = ((C0418a) rVarArr[i6].f1631d0.get(str13)).mo2397c();
                    break;
                } else {
                    i7++;
                }
            }
            i6++;
        }
        boolean z = rVarArr[0].f1630c0 != C0321d.f1442e;
        boolean[] zArr = new boolean[(18 + this.f1605p.length)];
        for (int i8 = 1; i8 < rVarArr.length; i8++) {
            rVarArr[i8].mo2256a(rVarArr[i8 - 1], zArr, this.f1605p, z);
        }
        int i9 = 0;
        for (int i10 = 1; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                i9++;
            }
        }
        this.f1602m = new int[i9];
        int[] iArr = this.f1602m;
        this.f1603n = new double[iArr.length];
        this.f1604o = new double[iArr.length];
        int i11 = 0;
        for (int i12 = 1; i12 < zArr.length; i12++) {
            if (zArr[i12]) {
                int i13 = i11 + 1;
                this.f1602m[i11] = i12;
                i11 = i13;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(cls, new int[]{rVarArr.length, this.f1602m.length});
        double[] dArr2 = new double[rVarArr.length];
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            rVarArr[i14].mo2258a(dArr[i14], this.f1602m);
            dArr2[i14] = (double) rVarArr[i14].f1622V;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.f1602m;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < C0357r.f1620h0.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0357r.f1620h0[this.f1602m[i15]]);
                sb2.append(" [");
                String sb3 = sb2.toString();
                for (int i16 = 0; i16 < rVarArr.length; i16++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(dArr[i16][i15]);
                    sb3 = sb4.toString();
                }
            }
            i15++;
        }
        this.f1597h = new C3945b[(this.f1605p.length + 1)];
        int i17 = 0;
        while (true) {
            String[] strArr2 = this.f1605p;
            if (i17 >= strArr2.length) {
                break;
            }
            String str14 = strArr2[i17];
            double[] dArr3 = null;
            int i18 = 0;
            double[][] dArr4 = null;
            for (int i19 = 0; i19 < rVarArr.length; i19++) {
                if (rVarArr[i19].mo2262b(str14)) {
                    if (dArr4 == null) {
                        dArr3 = new double[rVarArr.length];
                        dArr4 = (double[][]) Array.newInstance(cls, new int[]{rVarArr.length, rVarArr[i19].mo2249a(str14)});
                    }
                    dArr3[i18] = (double) rVarArr[i19].f1622V;
                    rVarArr[i19].mo2250a(str14, dArr4[i18], 0);
                    i18++;
                }
            }
            i17++;
            this.f1597h[i17] = C3945b.m13283a(this.f1592c, Arrays.copyOf(dArr3, i18), (double[][]) Arrays.copyOf(dArr4, i18));
        }
        this.f1597h[0] = C3945b.m13283a(this.f1592c, dArr2, dArr);
        if (rVarArr[0].f1630c0 != C0321d.f1442e) {
            int length = rVarArr.length;
            int[] iArr3 = new int[length];
            double[] dArr5 = new double[length];
            double[][] dArr6 = (double[][]) Array.newInstance(cls, new int[]{length, 2});
            for (int i20 = 0; i20 < length; i20++) {
                iArr3[i20] = rVarArr[i20].f1630c0;
                dArr5[i20] = (double) rVarArr[i20].f1622V;
                dArr6[i20][0] = (double) rVarArr[i20].f1624X;
                dArr6[i20][1] = (double) rVarArr[i20].f1625Y;
            }
            this.f1598i = C3945b.m13284a(iArr3, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.f1615z = new HashMap<>();
        if (this.f1611v != null) {
            Iterator it12 = hashSet4.iterator();
            while (it12.hasNext()) {
                String str15 = (String) it12.next();
                C0326g b = C0326g.m1890b(str15);
                if (b != null) {
                    if (b.mo2204a() && Float.isNaN(f2)) {
                        f2 = m2036d();
                    }
                    b.mo2203a(str15);
                    this.f1615z.put(str15, b);
                }
            }
            Iterator it13 = this.f1611v.iterator();
            while (it13.hasNext()) {
                C0321d dVar8 = (C0321d) it13.next();
                if (dVar8 instanceof C0324f) {
                    ((C0324f) dVar8).mo2198c(this.f1615z);
                }
            }
            for (C0326g b2 : this.f1615z.values()) {
                b2.mo2205b(f2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2232a(View view) {
        C0357r rVar = this.f1593d;
        rVar.f1622V = 0.0f;
        rVar.f1623W = 0.0f;
        rVar.mo2251a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f1595f.mo2224b(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2234a(C3973f fVar, C0425d dVar) {
        C0357r rVar = this.f1594e;
        rVar.f1622V = 1.0f;
        rVar.f1623W = 1.0f;
        m2035b(rVar);
        this.f1594e.mo2251a((float) fVar.mo14319E(), (float) fVar.mo14320F(), (float) fVar.mo14316B(), (float) fVar.mo14381l());
        this.f1594e.mo2257a(dVar.mo2424b(this.f1591b));
        this.f1596g.mo2222a(fVar, dVar, this.f1591b);
    }

    /* renamed from: a */
    private float m2033a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (((double) this.f1601l) != 1.0d) {
            if (f < this.f1600k) {
                f = 0.0f;
            }
            float f4 = this.f1600k;
            if (f > f4 && ((double) f) < 1.0d) {
                f = (f - f4) * this.f1601l;
            }
        }
        C3947c cVar = this.f1593d.f1629c;
        float f5 = Float.NaN;
        Iterator it = this.f1609t.iterator();
        while (it.hasNext()) {
            C0357r rVar = (C0357r) it.next();
            C3947c cVar2 = rVar.f1629c;
            if (cVar2 != null) {
                float f6 = rVar.f1622V;
                if (f6 < f) {
                    cVar = cVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = rVar.f1622V;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f5)) {
                f3 = f5;
            }
            float f7 = f3 - f2;
            double d = (double) ((f - f2) / f7);
            f = (((float) cVar.mo14199a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo14200b(d);
            }
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118 A[LOOP:4: B:47:0x0113->B:49:0x0118, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139 A[EDGE_INSN: B:96:0x0139->B:50:0x0139 ?: BREAK  
    EDGE_INSN: B:96:0x0139->B:50:0x0139 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2237a(android.view.View r23, float r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r10 = r23
            r8 = r25
            r1 = 0
            r2 = r24
            float r11 = r0.m2033a(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.u> r2 = r0.f1614y
            if (r2 == 0) goto L_0x0029
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.u r3 = (androidx.constraintlayout.motion.widget.C0363u) r3
            r3.mo2300a(r10, r11)
            goto L_0x0019
        L_0x0029:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.w> r2 = r0.f1612w
            r12 = 0
            if (r2 == 0) goto L_0x0054
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            r4 = r1
            r3 = 0
        L_0x0038:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.motion.widget.w r5 = (androidx.constraintlayout.motion.widget.C0394w) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.motion.widget.C0394w.C0398d
            if (r6 == 0) goto L_0x004c
            r4 = r5
            androidx.constraintlayout.motion.widget.w$d r4 = (androidx.constraintlayout.motion.widget.C0394w.C0398d) r4
            goto L_0x0038
        L_0x004c:
            boolean r5 = r5.mo2325a(r10, r11, r8)
            r3 = r3 | r5
            goto L_0x0038
        L_0x0052:
            r13 = r4
            goto L_0x0056
        L_0x0054:
            r13 = r1
            r3 = 0
        L_0x0056:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.v> r2 = r0.f1613x
            if (r2 == 0) goto L_0x007c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0062:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.v r4 = (androidx.constraintlayout.motion.widget.C0378v) r4
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.C0378v.C0382d
            if (r5 == 0) goto L_0x0076
            r1 = r4
            androidx.constraintlayout.motion.widget.v$d r1 = (androidx.constraintlayout.motion.widget.C0378v.C0382d) r1
            goto L_0x0062
        L_0x0076:
            boolean r4 = r4.mo2310a(r10, r11, r8)
            r3 = r3 | r4
            goto L_0x0062
        L_0x007c:
            r14 = r1
            r15 = r3
            e.f.a.a.b[] r1 = r0.f1597h
            r16 = 1
            if (r1 == 0) goto L_0x0175
            r1 = r1[r12]
            double r6 = (double) r11
            double[] r2 = r0.f1603n
            r1.mo14185a(r6, r2)
            e.f.a.a.b[] r1 = r0.f1597h
            r1 = r1[r12]
            double[] r2 = r0.f1604o
            r1.mo14188b(r6, r2)
            e.f.a.a.b r1 = r0.f1598i
            if (r1 == 0) goto L_0x00a8
            double[] r2 = r0.f1603n
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00a8
            r1.mo14185a(r6, r2)
            e.f.a.a.b r1 = r0.f1598i
            double[] r2 = r0.f1604o
            r1.mo14188b(r6, r2)
        L_0x00a8:
            androidx.constraintlayout.motion.widget.r r1 = r0.f1593d
            int[] r3 = r0.f1602m
            double[] r4 = r0.f1603n
            double[] r5 = r0.f1604o
            r17 = 0
            r2 = r23
            r18 = r6
            r6 = r17
            r1.mo2254a(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.u> r1 = r0.f1614y
            if (r1 == 0) goto L_0x00e6
            java.util.Collection r1 = r1.values()
            java.util.Iterator r17 = r1.iterator()
        L_0x00c7:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r17.next()
            androidx.constraintlayout.motion.widget.u r1 = (androidx.constraintlayout.motion.widget.C0363u) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0363u.C0367d
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.motion.widget.u$d r1 = (androidx.constraintlayout.motion.widget.C0363u.C0367d) r1
            double[] r2 = r0.f1604o
            r4 = r2[r12]
            r6 = r2[r16]
            r2 = r23
            r3 = r11
            r1.mo2304a(r2, r3, r4, r6)
            goto L_0x00c7
        L_0x00e6:
            if (r13 == 0) goto L_0x00fd
            double[] r1 = r0.f1604o
            r6 = r1[r12]
            r20 = r1[r16]
            r1 = r13
            r2 = r23
            r3 = r11
            r4 = r25
            r8 = r20
            boolean r1 = r1.mo2328a(r2, r3, r4, r6, r8)
        L_0x00fa:
            r1 = r1 | r15
            r15 = r1
            goto L_0x0112
        L_0x00fd:
            if (r14 == 0) goto L_0x0112
            double[] r1 = r0.f1604o
            r6 = r1[r12]
            r20 = r1[r16]
            r1 = r14
            r2 = r23
            r3 = r11
            r4 = r25
            r8 = r20
            boolean r1 = r1.mo2313a(r2, r3, r4, r6, r8)
            goto L_0x00fa
        L_0x0112:
            r1 = 1
        L_0x0113:
            e.f.a.a.b[] r2 = r0.f1597h
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0139
            r2 = r2[r1]
            float[] r3 = r0.f1608s
            r4 = r18
            r2.mo14186a(r4, r3)
            androidx.constraintlayout.motion.widget.r r2 = r0.f1593d
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.f1631d0
            java.lang.String[] r3 = r0.f1605p
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.a r2 = (androidx.constraintlayout.widget.C0418a) r2
            float[] r3 = r0.f1608s
            r2.mo2393a(r10, r3)
            int r1 = r1 + 1
            goto L_0x0113
        L_0x0139:
            androidx.constraintlayout.motion.widget.n r1 = r0.f1595f
            int r2 = r1.f1573U
            if (r2 != 0) goto L_0x0163
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x014a
            int r1 = r1.f1574V
            r10.setVisibility(r1)
            goto L_0x0163
        L_0x014a:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0158
            androidx.constraintlayout.motion.widget.n r1 = r0.f1596g
            int r1 = r1.f1574V
            r10.setVisibility(r1)
            goto L_0x0163
        L_0x0158:
            androidx.constraintlayout.motion.widget.n r2 = r0.f1596g
            int r2 = r2.f1574V
            int r1 = r1.f1574V
            if (r2 == r1) goto L_0x0163
            r10.setVisibility(r12)
        L_0x0163:
            androidx.constraintlayout.motion.widget.m[] r1 = r0.f1589A
            if (r1 == 0) goto L_0x01c1
            r1 = 0
        L_0x0168:
            androidx.constraintlayout.motion.widget.m[] r2 = r0.f1589A
            int r3 = r2.length
            if (r1 >= r3) goto L_0x01c1
            r2 = r2[r1]
            r2.mo2216a(r11, r10)
            int r1 = r1 + 1
            goto L_0x0168
        L_0x0175:
            androidx.constraintlayout.motion.widget.r r1 = r0.f1593d
            float r2 = r1.f1624X
            androidx.constraintlayout.motion.widget.r r3 = r0.f1594e
            float r4 = r3.f1624X
            float r4 = r4 - r2
            float r4 = r4 * r11
            float r2 = r2 + r4
            float r4 = r1.f1625Y
            float r5 = r3.f1625Y
            float r5 = r5 - r4
            float r5 = r5 * r11
            float r4 = r4 + r5
            float r5 = r1.f1626Z
            float r6 = r3.f1626Z
            float r7 = r6 - r5
            float r7 = r7 * r11
            float r7 = r7 + r5
            float r1 = r1.f1627a0
            float r3 = r3.f1627a0
            float r8 = r3 - r1
            float r8 = r8 * r11
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r13 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r13
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01b1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01be
        L_0x01b1:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r10.measure(r3, r1)
        L_0x01be:
            r10.layout(r13, r9, r2, r4)
        L_0x01c1:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.g> r1 = r0.f1615z
            if (r1 == 0) goto L_0x01f0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x01cd:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01f0
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.g r1 = (androidx.constraintlayout.motion.widget.C0326g) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0326g.C0332f
            if (r2 == 0) goto L_0x01ec
            androidx.constraintlayout.motion.widget.g$f r1 = (androidx.constraintlayout.motion.widget.C0326g.C0332f) r1
            double[] r2 = r0.f1604o
            r4 = r2[r12]
            r6 = r2[r16]
            r2 = r23
            r3 = r11
            r1.mo2212a(r2, r3, r4, r6)
            goto L_0x01cd
        L_0x01ec:
            r1.mo2202a(r10, r11)
            goto L_0x01cd
        L_0x01f0:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0354o.mo2237a(android.view.View, float, long):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2229a(float f, float f2, float f3, float[] fArr) {
        int i = 0;
        if (this.f1597h != null) {
            double a = (double) m2033a(f, this.f1610u);
            this.f1597h[0].mo14188b(a, this.f1604o);
            this.f1597h[0].mo14185a(a, this.f1603n);
            float f4 = this.f1610u[0];
            while (true) {
                double[] dArr = this.f1604o;
                if (i < dArr.length) {
                    dArr[i] = dArr[i] * ((double) f4);
                    i++;
                } else {
                    this.f1593d.mo2252a(f2, f3, fArr, this.f1602m, dArr, this.f1603n);
                    return;
                }
            }
        } else {
            C0357r rVar = this.f1594e;
            float f5 = rVar.f1624X;
            C0357r rVar2 = this.f1593d;
            float f6 = f5 - rVar2.f1624X;
            float f7 = rVar.f1625Y - rVar2.f1625Y;
            float f8 = (rVar.f1627a0 - rVar2.f1627a0) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (((rVar.f1626Z - rVar2.f1626Z) + f6) * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f8 * f3);
        }
    }

    /* renamed from: a */
    public int mo2226a() {
        int i = this.f1593d.f1621U;
        Iterator it = this.f1609t.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((C0357r) it.next()).f1621U);
        }
        return Math.max(i, this.f1594e.f1621U);
    }
}
