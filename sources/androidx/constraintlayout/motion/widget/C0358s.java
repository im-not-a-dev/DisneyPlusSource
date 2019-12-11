package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.C0436i;
import androidx.constraintlayout.widget.C0437j;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p096e.p114f.p115a.p116a.C3947c;

/* renamed from: androidx.constraintlayout.motion.widget.s */
/* compiled from: MotionScene */
public class C0358s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MotionLayout f1635a;

    /* renamed from: b */
    C0437j f1636b = null;

    /* renamed from: c */
    C0360b f1637c = null;

    /* renamed from: d */
    private ArrayList<C0360b> f1638d = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SparseArray<C0425d> f1639e = new SparseArray<>();

    /* renamed from: f */
    private SparseIntArray f1640f = new SparseIntArray();

    /* renamed from: g */
    private boolean f1641g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1642h = 100;

    /* renamed from: i */
    private MotionEvent f1643i;

    /* renamed from: j */
    private boolean f1644j = false;

    /* renamed from: k */
    private VelocityTracker f1645k;

    /* renamed from: l */
    float f1646l;

    /* renamed from: m */
    float f1647m;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    /* compiled from: MotionScene */
    class C0359a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C3947c f1648a;

        C0359a(C0358s sVar, C3947c cVar) {
            this.f1648a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f1648a.mo14199a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    /* compiled from: MotionScene */
    public static class C0360b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f1649a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f1650b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1651c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f1652d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f1653e = -1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f1654f = 400;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f1655g = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C0358s f1656h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public ArrayList<C0343h> f1657i = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C0409x f1658j = null;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ArrayList<C0361a> f1659k = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f1660l = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.s$b$a */
        /* compiled from: MotionScene */
        static class C0361a implements OnClickListener {

            /* renamed from: U */
            int f1661U = -1;

            /* renamed from: V */
            int f1662V = 17;

            /* renamed from: c */
            private final C0360b f1663c;

            public C0361a(Context context, C0360b bVar, XmlPullParser xmlPullParser) {
                this.f1663c = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0436i.OnClick_targetId) {
                        this.f1661U = obtainStyledAttributes.getResourceId(index, this.f1661U);
                    } else if (index == C0436i.OnClick_clickAction) {
                        this.f1662V = obtainStyledAttributes.getInt(index, this.f1662V);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
            /* JADX WARNING: type inference failed for: r3v4, types: [android.view.View] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo2293a(androidx.constraintlayout.motion.widget.MotionLayout r3) {
                /*
                    r2 = this;
                    int r0 = r2.f1661U
                    r1 = -1
                    if (r0 != r1) goto L_0x0006
                    goto L_0x000a
                L_0x0006:
                    android.view.View r3 = r3.findViewById(r0)
                L_0x000a:
                    if (r3 != 0) goto L_0x0025
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r0 = " (*)  could not find id "
                    r3.append(r0)
                    int r0 = r2.f1661U
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r0 = "MotionScene"
                    android.util.Log.e(r0, r3)
                    return
                L_0x0025:
                    r3.setOnClickListener(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0358s.C0360b.C0361a.mo2293a(androidx.constraintlayout.motion.widget.MotionLayout):void");
            }

            /* renamed from: b */
            public void mo2295b(MotionLayout motionLayout) {
                View findViewById = motionLayout.findViewById(this.f1661U);
                if (findViewById == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" (*)  could not find id ");
                    sb.append(this.f1661U);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            public void onClick(View view) {
                MotionLayout a = this.f1663c.f1656h.f1635a;
                C0360b bVar = this.f1663c.f1656h.f1637c;
                int i = this.f1662V;
                boolean z = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                int i2 = this.f1662V;
                boolean z2 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                if (z && z2) {
                    C0360b bVar2 = this.f1663c.f1656h.f1637c;
                    C0360b bVar3 = this.f1663c;
                    if (bVar2 != bVar3) {
                        a.setTransition(bVar3);
                    }
                    if (a.getCurrentState() == a.getEndState() || a.getProgress() > 0.5f) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                if (z) {
                    if (!mo2294a(bVar, true, a) || (this.f1662V & 1) == 0) {
                        a.setProgress(1.0f);
                    } else {
                        a.mo2146d();
                    }
                } else if (!z2) {
                } else {
                    if (!mo2294a(bVar, false, a) || (this.f1662V & 16) == 0) {
                        a.setProgress(0.0f);
                    } else {
                        a.mo2148e();
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo2294a(C0360b bVar, boolean z, MotionLayout motionLayout) {
                C0360b bVar2 = this.f1663c;
                boolean z2 = true;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = z ? bVar2.f1649a : bVar2.f1650b;
                int b = z ? this.f1663c.f1650b : this.f1663c.f1649a;
                if (motionLayout.getProgress() == 0.0f) {
                    if (motionLayout.f1408v0 != b) {
                        z2 = false;
                    }
                    return z2;
                } else if (motionLayout.getProgress() != 1.0f) {
                    return false;
                } else {
                    if (motionLayout.f1408v0 != a) {
                        z2 = false;
                    }
                    return z2;
                }
            }
        }

        C0360b(C0358s sVar) {
            this.f1656h = sVar;
        }

        /* renamed from: a */
        public void mo2292a(Context context, XmlPullParser xmlPullParser) {
            this.f1659k.add(new C0361a(context, this, xmlPullParser));
        }

        /* renamed from: a */
        public void mo2291a(int i) {
            this.f1654f = i;
        }

        /* renamed from: a */
        private void m2114a(C0358s sVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.Transition);
            m2113a(sVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m2113a(C0358s sVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                String str = "layout";
                if (index == C0436i.Transition_constraintSetEnd) {
                    this.f1649a = typedArray.getResourceId(index, this.f1649a);
                    if (str.equals(context.getResources().getResourceTypeName(this.f1649a))) {
                        C0425d dVar = new C0425d();
                        dVar.mo2426b(context, this.f1649a);
                        sVar.f1639e.append(this.f1649a, dVar);
                    }
                } else if (index == C0436i.Transition_constraintSetStart) {
                    this.f1650b = typedArray.getResourceId(index, this.f1650b);
                    if (str.equals(context.getResources().getResourceTypeName(this.f1650b))) {
                        C0425d dVar2 = new C0425d();
                        dVar2.mo2426b(context, this.f1650b);
                        sVar.f1639e.append(this.f1650b, dVar2);
                    }
                } else if (index == C0436i.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        this.f1653e = typedArray.getResourceId(index, -1);
                        if (this.f1653e != -1) {
                            this.f1651c = -2;
                        }
                    } else if (i2 == 3) {
                        this.f1652d = typedArray.getString(index);
                        if (this.f1652d.indexOf("/") > 0) {
                            this.f1653e = typedArray.getResourceId(index, -1);
                            this.f1651c = -2;
                        } else {
                            this.f1651c = -1;
                        }
                    } else {
                        this.f1651c = typedArray.getInteger(index, this.f1651c);
                    }
                } else if (index == C0436i.Transition_duration) {
                    this.f1654f = typedArray.getInt(index, this.f1654f);
                } else if (index == C0436i.Transition_staggered) {
                    this.f1655g = typedArray.getFloat(index, this.f1655g);
                } else if (index == C0436i.Transition_autoTransition) {
                    this.f1660l = typedArray.getInteger(index, this.f1660l);
                }
            }
        }

        C0360b(C0358s sVar, Context context, XmlPullParser xmlPullParser) {
            this.f1654f = sVar.f1642h;
            this.f1656h = sVar;
            m2114a(sVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    C0358s(Context context, MotionLayout motionLayout, int i) {
        this.f1635a = motionLayout;
        m2076a(context, i);
    }

    /* renamed from: d */
    private int m2081d(int i) {
        C0437j jVar = this.f1636b;
        if (jVar != null) {
            int a = jVar.mo2460a(i, -1, -1);
            if (a != -1) {
                return a;
            }
        }
        return i;
    }

    /* renamed from: m */
    private boolean m2083m() {
        return this.f1645k != null;
    }

    /* renamed from: e */
    public Interpolator mo2282e() {
        switch (this.f1637c.f1651c) {
            case -2:
                return AnimationUtils.loadInterpolator(this.f1635a.getContext(), this.f1637c.f1653e);
            case -1:
                return new C0359a(this, C3947c.m13295a(this.f1637c.f1652d));
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new AnticipateInterpolator();
            case 5:
                return new BounceInterpolator();
            default:
                return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo2283f() {
        C0360b bVar = this.f1637c;
        if (bVar == null || bVar.f1658j == null) {
            return 0.0f;
        }
        return this.f1637c.f1658j.mo2329a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo2284g() {
        C0360b bVar = this.f1637c;
        if (bVar == null || bVar.f1658j == null) {
            return 0.0f;
        }
        return this.f1637c.f1658j.mo2333b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo2285h() {
        C0360b bVar = this.f1637c;
        if (bVar == null || bVar.f1658j == null) {
            return false;
        }
        return this.f1637c.f1658j.mo2336c();
    }

    /* renamed from: i */
    public float mo2286i() {
        C0360b bVar = this.f1637c;
        if (bVar != null) {
            return bVar.f1655g;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo2287j() {
        C0360b bVar = this.f1637c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1650b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2288k() {
        C0360b bVar = this.f1637c;
        if (bVar != null && bVar.f1658j != null) {
            this.f1637c.f1658j.mo2337d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo2289l() {
        Iterator it = this.f1638d.iterator();
        do {
            boolean z = true;
            if (!it.hasNext()) {
                C0360b bVar = this.f1637c;
                if (bVar == null || bVar.f1658j == null) {
                    z = false;
                }
                return z;
            }
        } while (((C0360b) it.next()).f1658j == null);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2268a(int r6, int r7) {
        /*
            r5 = this;
            androidx.constraintlayout.widget.j r0 = r5.f1636b
            if (r0 == 0) goto L_0x0016
            r1 = -1
            int r0 = r0.mo2460a(r6, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r6
        L_0x000d:
            androidx.constraintlayout.widget.j r2 = r5.f1636b
            int r2 = r2.mo2460a(r7, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r6
        L_0x0017:
            r2 = r7
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r1 = r5.f1638d
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.s$b r3 = (androidx.constraintlayout.motion.widget.C0358s.C0360b) r3
            int r4 = r3.f1649a
            if (r4 != r2) goto L_0x0036
            int r4 = r3.f1650b
            if (r4 == r0) goto L_0x0042
        L_0x0036:
            int r4 = r3.f1649a
            if (r4 != r7) goto L_0x001e
            int r4 = r3.f1650b
            if (r4 != r6) goto L_0x001e
        L_0x0042:
            r5.f1637c = r3
            return
        L_0x0045:
            androidx.constraintlayout.motion.widget.s$b r6 = new androidx.constraintlayout.motion.widget.s$b
            r6.<init>(r5)
            r6.f1650b = r0
            r6.f1649a = r2
            int r7 = r5.f1642h
            r6.f1654f = r7
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r7 = r5.f1638d
            r7.add(r6)
            r5.f1637c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0358s.mo2268a(int, int):void");
    }

    /* renamed from: b */
    public List<C0360b> mo2276b(int i) {
        int d = m2081d(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1638d.iterator();
        while (it.hasNext()) {
            C0360b bVar = (C0360b) it.next();
            if (bVar.f1650b == d || bVar.f1649a == d) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int mo2279c() {
        C0360b bVar = this.f1637c;
        if (bVar != null) {
            return bVar.f1654f;
        }
        return this.f1642h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2281d() {
        C0360b bVar = this.f1637c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1649a;
    }

    /* renamed from: c */
    public void mo2280c(int i) {
        C0360b bVar = this.f1637c;
        if (bVar != null) {
            bVar.mo2291a(i);
        } else {
            this.f1642h = i;
        }
    }

    /* renamed from: b */
    public ArrayList<C0360b> mo2275b() {
        return this.f1638d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2278b(MotionLayout motionLayout, int i) {
        if (m2083m()) {
            return false;
        }
        Iterator it = this.f1638d.iterator();
        while (it.hasNext()) {
            C0360b bVar = (C0360b) it.next();
            if (bVar.f1650b != 0) {
                if (i == bVar.f1650b && (bVar.f1660l == 4 || bVar.f1660l == 2)) {
                    motionLayout.setTransition(bVar);
                    if (bVar.f1660l == 4) {
                        motionLayout.mo2146d();
                    } else {
                        motionLayout.setProgress(1.0f);
                    }
                    return true;
                } else if (i == bVar.f1649a && (bVar.f1660l == 3 || bVar.f1660l == 1)) {
                    motionLayout.setTransition(bVar);
                    if (bVar.f1660l == 3) {
                        motionLayout.mo2148e();
                    } else {
                        motionLayout.setProgress(0.0f);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m2082e(int i) {
        int i2 = this.f1640f.get(i);
        if (i2 > 0) {
            m2082e(this.f1640f.get(i));
            ((C0425d) this.f1639e.get(i)).mo2421a((C0425d) this.f1639e.get(i2));
            this.f1640f.put(i, -1);
        }
    }

    /* renamed from: a */
    public void mo2273a(C0360b bVar) {
        this.f1637c = bVar;
    }

    /* renamed from: a */
    public void mo2271a(MotionLayout motionLayout, int i) {
        Iterator it = this.f1638d.iterator();
        while (it.hasNext()) {
            C0360b bVar = (C0360b) it.next();
            if (bVar.f1659k.size() > 0) {
                Iterator it2 = bVar.f1659k.iterator();
                while (it2.hasNext()) {
                    C0361a aVar = (C0361a) it2.next();
                    if (i == bVar.f1650b || i == bVar.f1649a) {
                        aVar.mo2293a(motionLayout);
                    } else {
                        aVar.mo2295b(motionLayout);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m2079b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0436i.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0436i.MotionScene_defaultDuration) {
                this.f1642h = obtainStyledAttributes.getInt(index, this.f1642h);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public C0360b mo2264a(int i, float f, float f2, MotionEvent motionEvent) {
        C0360b bVar = null;
        if (i != -1) {
            List<C0360b> b = mo2276b(i);
            float f3 = 0.0f;
            RectF rectF = new RectF();
            for (C0360b bVar2 : b) {
                if (this.f1635a.mo2140a(bVar2) && bVar2.f1658j != null) {
                    RectF a = bVar2.f1658j.mo2331a((ViewGroup) this.f1635a, rectF);
                    if (a == null || a.contains(motionEvent.getX(), motionEvent.getY())) {
                        float a2 = bVar2.f1658j.mo2330a(f, f2);
                        if (bVar2.f1649a == i) {
                            a2 *= -1.0f;
                        }
                        if (a2 > f3) {
                            bVar = bVar2;
                            f3 = a2;
                        }
                    }
                }
            }
            return bVar;
        } else if (!this.f1635a.mo2140a(this.f1637c)) {
            return null;
        } else {
            return this.f1637c;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2277b(float f, float f2) {
        C0360b bVar = this.f1637c;
        if (bVar != null && bVar.f1658j != null) {
            this.f1637c.f1658j.mo2335c(f, f2);
        }
    }

    /* renamed from: a */
    public int[] mo2274a() {
        int[] iArr = new int[this.f1639e.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.f1639e.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2076a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.content.res.Resources r0 = r10.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r11)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0120
            if (r2 == 0) goto L_0x010e
            r4 = 3
            r5 = 2
            if (r2 == r5) goto L_0x0018
            goto L_0x0111
        L_0x0018:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            boolean r6 = r9.f1641g     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r6 == 0) goto L_0x0036
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r8 = "parsing = "
            r7.append(r8)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r7.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r7 = r7.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r6.println(r7)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0036:
            r6 = -1
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r8 = "MotionScene"
            switch(r7) {
                case -1349929691: goto L_0x007a;
                case -1239391468: goto L_0x0070;
                case 269306229: goto L_0x0067;
                case 312750793: goto L_0x005d;
                case 327855227: goto L_0x0053;
                case 793277014: goto L_0x004b;
                case 1382829617: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0084
        L_0x0041:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 4
            goto L_0x0085
        L_0x004b:
            boolean r3 = r2.equals(r8)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 0
            goto L_0x0085
        L_0x0053:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 2
            goto L_0x0085
        L_0x005d:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 3
            goto L_0x0085
        L_0x0067:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r4 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0070:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 6
            goto L_0x0085
        L_0x007a:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 5
            goto L_0x0085
        L_0x0084:
            r3 = -1
        L_0x0085:
            switch(r3) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009d;
                case 5: goto L_0x0098;
                case 6: goto L_0x008a;
                default: goto L_0x0088;
            }     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0088:
            goto L_0x00f9
        L_0x008a:
            androidx.constraintlayout.motion.widget.h r2 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.util.ArrayList r3 = r1.f1657i     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x0098:
            r9.m2077a(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x009d:
            androidx.constraintlayout.widget.j r2 = new androidx.constraintlayout.widget.j     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r9.f1636b = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00a5:
            r1.mo2292a(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00a9:
            if (r1 != 0) goto L_0x00d8
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r2.getResourceEntryName(r11)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            android.util.Log.v(r8, r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x00d8:
            androidx.constraintlayout.motion.widget.x r2 = new androidx.constraintlayout.motion.widget.x     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r9.f1635a     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r3, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r1.f1658j = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00e3:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.s$b> r1 = r9.f1638d     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.s$b r2 = new androidx.constraintlayout.motion.widget.s$b     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r9, r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.s$b r1 = r9.f1637c     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r1 != 0) goto L_0x00f3
            r9.f1637c = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x00f3:
            r1 = r2
            goto L_0x0111
        L_0x00f5:
            r9.m2079b(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00f9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            android.util.Log.v(r8, r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x010e:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0111:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x000d
        L_0x0117:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0120
        L_0x011c:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0358s.m2076a(android.content.Context, int):void");
    }

    /* renamed from: a */
    private int m2074a(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1641g) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("id getMap res = ");
                sb.append(i);
                printStream.println(sb.toString());
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2077a(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            r12 = this;
            androidx.constraintlayout.widget.d r0 = new androidx.constraintlayout.widget.d
            r0.<init>()
            r1 = 0
            r0.mo2423a(r1)
            int r2 = r14.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            if (r4 >= r2) goto L_0x006a
            java.lang.String r7 = r14.getAttributeName(r4)
            java.lang.String r8 = r14.getAttributeValue(r4)
            boolean r9 = r12.f1641g
            if (r9 == 0) goto L_0x0035
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "id string = "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
        L_0x0035:
            int r9 = r7.hashCode()
            r10 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            r11 = 1
            if (r9 == r10) goto L_0x004e
            r10 = 3355(0xd1b, float:4.701E-42)
            if (r9 == r10) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0058
            r7 = 0
            goto L_0x0059
        L_0x004e:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r7 = -1
        L_0x0059:
            if (r7 == 0) goto L_0x0063
            if (r7 == r11) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            int r6 = r12.m2074a(r13, r8)
            goto L_0x0067
        L_0x0063:
            int r5 = r12.m2074a(r13, r8)
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x006a:
            if (r5 == r3) goto L_0x007b
            r0.mo2417a(r13, r14)
            if (r6 == r3) goto L_0x0076
            android.util.SparseIntArray r13 = r12.f1640f
            r13.put(r5, r6)
        L_0x0076:
            android.util.SparseArray<androidx.constraintlayout.widget.d> r13 = r12.f1639e
            r13.put(r5, r0)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0358s.m2077a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0425d mo2265a(int i) {
        return mo2266a(i, -1, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0425d mo2266a(int i, int i2, int i3) {
        if (this.f1641g) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("id ");
            sb.append(i);
            printStream.println(sb.toString());
            PrintStream printStream2 = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("size ");
            sb2.append(this.f1639e.size());
            printStream2.println(sb2.toString());
        }
        C0437j jVar = this.f1636b;
        if (jVar != null) {
            int a = jVar.mo2460a(i, i2, i3);
            if (a != -1) {
                i = a;
            }
        }
        if (this.f1639e.get(i) != null) {
            return (C0425d) this.f1639e.get(i);
        }
        SparseArray<C0425d> sparseArray = this.f1639e;
        return (C0425d) sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: a */
    public void mo2272a(C0354o oVar) {
        C0360b bVar = this.f1637c;
        if (bVar != null) {
            Iterator it = bVar.f1657i.iterator();
            while (it.hasNext()) {
                ((C0343h) it.next()).mo2213a(oVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2269a(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        RectF rectF = new RectF();
        if (this.f1645k == null) {
            this.f1645k = VelocityTracker.obtain();
        }
        this.f1645k.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f1646l = motionEvent.getRawX();
                this.f1647m = motionEvent.getRawY();
                this.f1643i = motionEvent;
                if (this.f1637c.f1658j != null) {
                    RectF a = this.f1637c.f1658j.mo2331a((ViewGroup) this.f1635a, rectF);
                    if (a == null || a.contains(this.f1643i.getX(), this.f1643i.getY())) {
                        this.f1644j = false;
                    } else {
                        this.f1644j = true;
                    }
                    this.f1637c.f1658j.mo2338d(this.f1646l, this.f1647m);
                }
                return;
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f1647m;
                float rawX = motionEvent.getRawX() - this.f1646l;
                if (((double) rawX) != 0.0d || ((double) rawY) != 0.0d) {
                    C0360b a2 = mo2264a(i, rawX, rawY, this.f1643i);
                    if (a2 != null) {
                        motionLayout.setTransition(a2);
                        RectF a3 = this.f1637c.f1658j.mo2331a((ViewGroup) this.f1635a, rectF);
                        if (a3 != null && !a3.contains(this.f1643i.getX(), this.f1643i.getY())) {
                            z = true;
                        }
                        this.f1644j = z;
                        this.f1637c.f1658j.mo2339e(this.f1646l, this.f1647m);
                    }
                } else {
                    return;
                }
            }
        }
        C0360b bVar = this.f1637c;
        if (!(bVar == null || bVar.f1658j == null || this.f1644j)) {
            this.f1637c.f1658j.mo2332a(motionEvent, this.f1645k, i, this);
        }
        this.f1646l = motionEvent.getRawX();
        this.f1647m = motionEvent.getRawY();
        if (motionEvent.getAction() == 1) {
            VelocityTracker velocityTracker = this.f1645k;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1645k = null;
                int i2 = motionLayout.f1408v0;
                if (i2 != -1) {
                    mo2278b(motionLayout, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2267a(float f, float f2) {
        C0360b bVar = this.f1637c;
        if (bVar != null && bVar.f1658j != null) {
            this.f1637c.f1658j.mo2334b(f, f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2270a(MotionLayout motionLayout) {
        for (int i = 0; i < this.f1639e.size(); i++) {
            m2082e(this.f1639e.keyAt(i));
        }
        for (int i2 = 0; i2 < this.f1639e.size(); i2++) {
            ((C0425d) this.f1639e.valueAt(i2)).mo2433d((ConstraintLayout) motionLayout);
        }
    }
}
