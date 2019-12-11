package androidx.constraintlayout.motion.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0418a;
import androidx.constraintlayout.widget.C0418a.C0420b;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.C0425d.C0428c;
import androidx.constraintlayout.widget.C0425d.C0429d;
import androidx.constraintlayout.widget.C0425d.C0430e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p096e.p114f.p115a.p116a.C3947c;
import p096e.p114f.p117b.p118j.C3973f;

/* renamed from: androidx.constraintlayout.motion.widget.n */
/* compiled from: MotionConstrainedPoint */
class C0353n implements Comparable<C0353n> {

    /* renamed from: U */
    int f1573U = 0;

    /* renamed from: V */
    int f1574V;

    /* renamed from: W */
    private float f1575W = 0.0f;

    /* renamed from: X */
    private float f1576X = 0.0f;

    /* renamed from: Y */
    private float f1577Y = 0.0f;

    /* renamed from: Z */
    public float f1578Z = 0.0f;

    /* renamed from: a0 */
    private float f1579a0 = 1.0f;

    /* renamed from: b0 */
    private float f1580b0 = 1.0f;

    /* renamed from: c */
    private float f1581c = 1.0f;

    /* renamed from: c0 */
    private float f1582c0 = 0.0f;

    /* renamed from: d0 */
    private float f1583d0 = 0.0f;

    /* renamed from: e0 */
    private float f1584e0 = 0.0f;

    /* renamed from: f0 */
    private float f1585f0;

    /* renamed from: g0 */
    private float f1586g0 = Float.NaN;

    /* renamed from: h0 */
    private float f1587h0 = Float.NaN;

    /* renamed from: i0 */
    LinkedHashMap<String, C0418a> f1588i0 = new LinkedHashMap<>();

    static {
        new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    /* renamed from: a */
    private boolean m2024a(float f, float f2) {
        boolean z = true;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                z = false;
            }
            return z;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2218a(float f, float f2, float f3, float f4) {
    }

    /* renamed from: b */
    public void mo2224b(View view) {
        mo2218a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo2219a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2220a(C0353n nVar, HashSet<String> hashSet) {
        String str = "alpha";
        if (m2024a(this.f1581c, nVar.f1581c)) {
            hashSet.add(str);
        }
        if (m2024a(this.f1575W, nVar.f1575W)) {
            hashSet.add("elevation");
        }
        int i = this.f1574V;
        int i2 = nVar.f1574V;
        if (i != i2 && this.f1573U == 0 && (i == 0 || i2 == 0)) {
            hashSet.add(str);
        }
        if (m2024a(this.f1576X, nVar.f1576X)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1586g0) || !Float.isNaN(nVar.f1586g0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1587h0) || !Float.isNaN(nVar.f1587h0)) {
            hashSet.add("progress");
        }
        if (m2024a(this.f1577Y, nVar.f1577Y)) {
            hashSet.add("rotationX");
        }
        if (m2024a(this.f1578Z, nVar.f1578Z)) {
            hashSet.add("rotationY");
        }
        if (m2024a(this.f1579a0, nVar.f1579a0)) {
            hashSet.add("scaleX");
        }
        if (m2024a(this.f1580b0, nVar.f1580b0)) {
            hashSet.add("scaleY");
        }
        if (m2024a(this.f1582c0, nVar.f1582c0)) {
            hashSet.add("translationX");
        }
        if (m2024a(this.f1583d0, nVar.f1583d0)) {
            hashSet.add("translationY");
        }
        if (m2024a(this.f1584e0, nVar.f1584e0)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: a */
    public int compareTo(C0353n nVar) {
        return Float.compare(this.f1585f0, nVar.f1585f0);
    }

    /* renamed from: a */
    public void mo2219a(View view) {
        this.f1574V = view.getVisibility();
        this.f1581c = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        if (VERSION.SDK_INT >= 21) {
            this.f1575W = view.getElevation();
        }
        this.f1576X = view.getRotation();
        this.f1577Y = view.getRotationX();
        this.f1578Z = view.getRotationY();
        this.f1579a0 = view.getScaleX();
        this.f1580b0 = view.getScaleY();
        view.getPivotX();
        view.getPivotY();
        this.f1582c0 = view.getTranslationX();
        this.f1583d0 = view.getTranslationY();
        if (VERSION.SDK_INT >= 21) {
            this.f1584e0 = view.getTranslationZ();
        }
    }

    /* renamed from: a */
    public void mo2221a(C0426a aVar) {
        C0429d dVar = aVar.f1877b;
        this.f1573U = dVar.f1955c;
        int i = dVar.f1954b;
        this.f1574V = i;
        this.f1581c = (i == 0 || this.f1573U != 0) ? aVar.f1877b.f1956d : 0.0f;
        C0430e eVar = aVar.f1880e;
        boolean z = eVar.f1970l;
        this.f1575W = eVar.f1971m;
        this.f1576X = eVar.f1960b;
        this.f1577Y = eVar.f1961c;
        this.f1578Z = eVar.f1962d;
        this.f1579a0 = eVar.f1963e;
        this.f1580b0 = eVar.f1964f;
        float f = eVar.f1965g;
        float f2 = eVar.f1966h;
        this.f1582c0 = eVar.f1967i;
        this.f1583d0 = eVar.f1968j;
        this.f1584e0 = eVar.f1969k;
        C3947c.m13295a(aVar.f1878c.f1948c);
        C0428c cVar = aVar.f1878c;
        this.f1586g0 = cVar.f1952g;
        int i2 = cVar.f1950e;
        this.f1587h0 = aVar.f1877b.f1957e;
        for (String str : aVar.f1881f.keySet()) {
            C0418a aVar2 = (C0418a) aVar.f1881f.get(str);
            if (aVar2.mo2392a() != C0420b.STRING_TYPE) {
                this.f1588i0.put(str, aVar2);
            }
        }
    }

    /* renamed from: a */
    public void mo2223a(HashMap<String, C0363u> hashMap, int i) {
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
                        c = 9;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 8;
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
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f1581c)) {
                        f = this.f1581c;
                    }
                    uVar.mo2299a(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1575W)) {
                        f2 = this.f1575W;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1576X)) {
                        f2 = this.f1576X;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1577Y)) {
                        f2 = this.f1577Y;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1578Z)) {
                        f2 = this.f1578Z;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1586g0)) {
                        f2 = this.f1586g0;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f1587h0)) {
                        f2 = this.f1587h0;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1579a0)) {
                        f = this.f1579a0;
                    }
                    uVar.mo2299a(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f1580b0)) {
                        f = this.f1580b0;
                    }
                    uVar.mo2299a(i, f);
                    break;
                case 9:
                    if (!Float.isNaN(this.f1582c0)) {
                        f2 = this.f1582c0;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f1583d0)) {
                        f2 = this.f1583d0;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1584e0)) {
                        f2 = this.f1584e0;
                    }
                    uVar.mo2299a(i, f2);
                    break;
                default:
                    String str2 = "MotionPaths";
                    if (!str.startsWith("CUSTOM")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN spline ");
                        sb.append(str);
                        Log.e(str2, sb.toString());
                        break;
                    } else {
                        String str3 = str.split(",")[1];
                        if (!this.f1588i0.containsKey(str3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("UNKNOWN customName ");
                            sb2.append(str3);
                            Log.e(str2, sb2.toString());
                            break;
                        } else {
                            C0418a aVar = (C0418a) this.f1588i0.get(str3);
                            if (!(uVar instanceof C0365b)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(" splineSet not a CustomSet frame = ");
                                sb3.append(i);
                                sb3.append(", value");
                                sb3.append(aVar.mo2396b());
                                sb3.append(uVar);
                                Log.e(str2, sb3.toString());
                                break;
                            } else {
                                ((C0365b) uVar).mo2303a(i, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo2222a(C3973f fVar, C0425d dVar, int i) {
        mo2218a((float) fVar.mo14319E(), (float) fVar.mo14320F(), (float) fVar.mo14316B(), (float) fVar.mo14381l());
        mo2221a(dVar.mo2424b(i));
    }
}
