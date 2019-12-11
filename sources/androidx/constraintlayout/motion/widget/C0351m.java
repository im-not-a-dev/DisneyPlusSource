package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0436i;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* compiled from: KeyTrigger */
public class C0351m extends C0321d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1554f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1555g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f1556h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1557i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f1558j;

    /* renamed from: k */
    private View f1559k;

    /* renamed from: l */
    float f1560l;

    /* renamed from: m */
    private boolean f1561m;

    /* renamed from: n */
    private boolean f1562n;

    /* renamed from: o */
    private boolean f1563o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1564p;

    /* renamed from: q */
    private Method f1565q;

    /* renamed from: r */
    private Method f1566r;

    /* renamed from: s */
    private Method f1567s;

    /* renamed from: t */
    private float f1568t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f1569u;

    /* renamed from: v */
    RectF f1570v;

    /* renamed from: w */
    RectF f1571w;

    /* renamed from: androidx.constraintlayout.motion.widget.m$a */
    /* compiled from: KeyTrigger */
    private static class C0352a {

        /* renamed from: a */
        private static SparseIntArray f1572a = new SparseIntArray();

        static {
            f1572a.append(C0436i.KeyTrigger_framePosition, 8);
            f1572a.append(C0436i.KeyTrigger_onCross, 4);
            f1572a.append(C0436i.KeyTrigger_onNegativeCross, 1);
            f1572a.append(C0436i.KeyTrigger_onPositiveCross, 2);
            f1572a.append(C0436i.KeyTrigger_motionTarget, 7);
            f1572a.append(C0436i.KeyTrigger_triggerId, 6);
            f1572a.append(C0436i.KeyTrigger_triggerSlack, 5);
            f1572a.append(C0436i.KeyTrigger_motion_triggerOnCollision, 9);
            f1572a.append(C0436i.KeyTrigger_motion_postLayoutCollision, 10);
        }

        /* renamed from: a */
        public static void m2023a(C0351m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1572a.get(index)) {
                    case 1:
                        mVar.f1555g = typedArray.getString(index);
                        break;
                    case 2:
                        mVar.f1556h = typedArray.getString(index);
                        break;
                    case 4:
                        mVar.f1554f = typedArray.getString(index);
                        break;
                    case 5:
                        mVar.f1560l = typedArray.getFloat(index, mVar.f1560l);
                        break;
                    case 6:
                        mVar.f1557i = typedArray.getResourceId(index, mVar.f1557i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 3) {
                            mVar.f1444b = typedArray.getResourceId(index, mVar.f1444b);
                            break;
                        } else {
                            mVar.f1445c = typedArray.getString(index);
                            break;
                        }
                    case 8:
                        mVar.f1443a = typedArray.getInteger(index, mVar.f1443a);
                        mVar.f1564p = (((float) mVar.f1443a) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        mVar.f1558j = typedArray.getResourceId(index, mVar.f1558j);
                        break;
                    case 10:
                        mVar.f1569u = typedArray.getBoolean(index, mVar.f1569u);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1572a.get(index));
                        Log.e("KeyTrigger", sb.toString());
                        break;
                }
            }
        }
    }

    public C0351m() {
        int i = C0321d.f1442e;
        this.f1557i = i;
        this.f1558j = i;
        this.f1559k = null;
        this.f1560l = 0.1f;
        this.f1561m = true;
        this.f1562n = true;
        this.f1563o = true;
        this.f1564p = Float.NaN;
        this.f1569u = false;
        this.f1570v = new RectF();
        this.f1571w = new RectF();
        this.f1446d = new HashMap<>();
    }

    /* renamed from: a */
    public void mo2193a(HashMap<String, C0363u> hashMap) {
    }

    /* renamed from: a */
    public void mo2194a(HashSet<String> hashSet) {
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0352a.m2023a(this, context.obtainStyledAttributes(attributeSet, C0436i.KeyTrigger), context);
    }

    /* renamed from: a */
    private void m2012a(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2216a(float r11, android.view.View r12) {
        /*
            r10 = this;
            int r0 = r10.f1558j
            int r1 = androidx.constraintlayout.motion.widget.C0321d.f1442e
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            android.view.View r0 = r10.f1559k
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r12.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r10.f1558j
            android.view.View r0 = r0.findViewById(r1)
            r10.f1559k = r0
        L_0x001a:
            android.graphics.RectF r0 = r10.f1570v
            android.view.View r1 = r10.f1559k
            boolean r4 = r10.f1569u
            r10.m2012a(r0, r1, r4)
            android.graphics.RectF r0 = r10.f1571w
            boolean r1 = r10.f1569u
            r10.m2012a(r0, r12, r1)
            android.graphics.RectF r0 = r10.f1570v
            android.graphics.RectF r1 = r10.f1571w
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r10.f1561m
            if (r0 == 0) goto L_0x003c
            r10.f1561m = r3
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r10.f1563o
            if (r1 == 0) goto L_0x0045
            r10.f1563o = r3
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r10.f1562n = r2
            r2 = r1
            r1 = 0
            goto L_0x0060
        L_0x004b:
            boolean r0 = r10.f1561m
            if (r0 != 0) goto L_0x0053
            r10.f1561m = r2
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            boolean r1 = r10.f1562n
            if (r1 == 0) goto L_0x005c
            r10.f1562n = r3
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r10.f1563o = r2
            r2 = 0
        L_0x0060:
            r4 = r1
            goto L_0x00dd
        L_0x0063:
            boolean r0 = r10.f1561m
            r1 = 0
            if (r0 == 0) goto L_0x0079
            float r0 = r10.f1564p
            float r4 = r11 - r0
            float r5 = r10.f1568t
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            r10.f1561m = r3
            r0 = 1
            goto L_0x008a
        L_0x0079:
            float r0 = r10.f1564p
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.f1560l
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            r10.f1561m = r2
        L_0x0089:
            r0 = 0
        L_0x008a:
            boolean r4 = r10.f1562n
            if (r4 == 0) goto L_0x00a3
            float r4 = r10.f1564p
            float r5 = r11 - r4
            float r6 = r10.f1568t
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            r10.f1562n = r3
            r4 = 1
            goto L_0x00b4
        L_0x00a3:
            float r4 = r10.f1564p
            float r4 = r11 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r10.f1560l
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b3
            r10.f1562n = r2
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            boolean r5 = r10.f1563o
            if (r5 == 0) goto L_0x00cc
            float r5 = r10.f1564p
            float r6 = r11 - r5
            float r7 = r10.f1568t
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            r10.f1563o = r3
            goto L_0x00dd
        L_0x00cc:
            float r1 = r10.f1564p
            float r1 = r11 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r10.f1560l
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            r10.f1563o = r2
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            r10.f1568t = r11
            if (r4 != 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00f0
        L_0x00e5:
            android.view.ViewParent r1 = r12.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r10.f1557i
            r1.mo2138a(r5, r2, r11)
        L_0x00f0:
            java.lang.String r11 = "Could not find method \""
            java.lang.String r1 = "Exception in call \""
            java.lang.String r5 = " "
            java.lang.String r6 = "\"on class "
            java.lang.String r7 = "KeyTrigger"
            if (r4 == 0) goto L_0x0173
            java.lang.String r4 = r10.f1555g
            if (r4 == 0) goto L_0x0173
            java.lang.reflect.Method r4 = r10.f1566r
            if (r4 != 0) goto L_0x013f
            java.lang.Class r4 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.String r8 = r10.f1555g     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.reflect.Method r4 = r4.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0113 }
            r10.f1566r = r4     // Catch:{ NoSuchMethodException -> 0x0113 }
            goto L_0x013f
        L_0x0113:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r8 = r10.f1555g
            r4.append(r8)
            r4.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r7, r4)
        L_0x013f:
            java.lang.reflect.Method r4 = r10.f1566r     // Catch:{ Exception -> 0x0147 }
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0147 }
            r4.invoke(r12, r8)     // Catch:{ Exception -> 0x0147 }
            goto L_0x0173
        L_0x0147:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r8 = r10.f1555g
            r4.append(r8)
            r4.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r7, r4)
        L_0x0173:
            if (r2 == 0) goto L_0x01ec
            java.lang.String r2 = r10.f1556h
            if (r2 == 0) goto L_0x01ec
            java.lang.reflect.Method r2 = r10.f1567s
            if (r2 != 0) goto L_0x01b8
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.String r4 = r10.f1556h     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r8)     // Catch:{ NoSuchMethodException -> 0x018c }
            r10.f1567s = r2     // Catch:{ NoSuchMethodException -> 0x018c }
            goto L_0x01b8
        L_0x018c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r4 = r10.f1556h
            r2.append(r4)
            r2.append(r6)
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r7, r2)
        L_0x01b8:
            java.lang.reflect.Method r2 = r10.f1567s     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c0 }
            r2.invoke(r12, r4)     // Catch:{ Exception -> 0x01c0 }
            goto L_0x01ec
        L_0x01c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = r10.f1556h
            r2.append(r4)
            r2.append(r6)
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r7, r2)
        L_0x01ec:
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r10.f1554f
            if (r0 == 0) goto L_0x0265
            java.lang.reflect.Method r0 = r10.f1565q
            if (r0 != 0) goto L_0x0231
            java.lang.Class r0 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.String r2 = r10.f1554f     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x0205 }
            r10.f1565q = r0     // Catch:{ NoSuchMethodException -> 0x0205 }
            goto L_0x0231
        L_0x0205:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = r10.f1554f
            r0.append(r11)
            r0.append(r6)
            java.lang.Class r11 = r12.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.e(r7, r11)
        L_0x0231:
            java.lang.reflect.Method r11 = r10.f1565q     // Catch:{ Exception -> 0x0239 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0239 }
            r11.invoke(r12, r0)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0265
        L_0x0239:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r0 = r10.f1554f
            r11.append(r0)
            r11.append(r6)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            r11.append(r5)
            java.lang.String r12 = androidx.constraintlayout.motion.widget.C0319b.m1806a(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r7, r11)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0351m.mo2216a(float, android.view.View):void");
    }
}
