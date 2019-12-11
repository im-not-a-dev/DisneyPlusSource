package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.C0492a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p096e.p097a.p100l.p101a.C3870a;
import p096e.p097a.p102m.C3885a;
import p096e.p113e.C3926a;
import p096e.p113e.C3933f;
import p096e.p113e.C3934g;
import p096e.p113e.C3942j;
import p096e.p121h.p122j.C4025a;
import p096e.p158r.p159a.p160a.C4359c;
import p096e.p158r.p159a.p160a.C4369i;

/* renamed from: androidx.appcompat.widget.j0 */
/* compiled from: ResourceManagerInternal */
public final class C0242j0 {

    /* renamed from: h */
    private static final Mode f1113h = Mode.SRC_IN;

    /* renamed from: i */
    private static C0242j0 f1114i;

    /* renamed from: j */
    private static final C0245c f1115j = new C0245c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C3942j<ColorStateList>> f1116a;

    /* renamed from: b */
    private C3926a<String, C0246d> f1117b;

    /* renamed from: c */
    private C3942j<String> f1118c;

    /* renamed from: d */
    private final WeakHashMap<Context, C3933f<WeakReference<ConstantState>>> f1119d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1120e;

    /* renamed from: f */
    private boolean f1121f;

    /* renamed from: g */
    private C0247e f1122g;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* compiled from: ResourceManagerInternal */
    static class C0243a implements C0246d {
        C0243a() {
        }

        /* renamed from: a */
        public Drawable mo1699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C3870a.m12950b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0244b implements C0246d {
        C0244b() {
        }

        /* renamed from: a */
        public Drawable mo1699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C4359c.m15029a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0245c extends C3934g<Integer, PorterDuffColorFilter> {
        public C0245c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1367b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo1700a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo14079b(Integer.valueOf(m1367b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo1701a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo14073a(Integer.valueOf(m1367b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    /* compiled from: ResourceManagerInternal */
    private interface C0246d {
        /* renamed from: a */
        Drawable mo1699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.j0$e */
    /* compiled from: ResourceManagerInternal */
    interface C0247e {
        /* renamed from: a */
        ColorStateList mo1671a(Context context, int i);

        /* renamed from: a */
        Mode mo1672a(int i);

        /* renamed from: a */
        Drawable mo1673a(C0242j0 j0Var, Context context, int i);

        /* renamed from: a */
        boolean mo1674a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo1675b(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.j0$f */
    /* compiled from: ResourceManagerInternal */
    private static class C0248f implements C0246d {
        C0248f() {
        }

        /* renamed from: a */
        public Drawable mo1699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C4369i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0242j0 m1346a() {
        C0242j0 j0Var;
        synchronized (C0242j0.class) {
            if (f1114i == null) {
                f1114i = new C0242j0();
                m1349a(f1114i);
            }
            j0Var = f1114i;
        }
        return j0Var;
    }

    /* renamed from: c */
    private Drawable m1354c(Context context, int i) {
        Drawable drawable;
        if (this.f1120e == null) {
            this.f1120e = new TypedValue();
        }
        TypedValue typedValue = this.f1120e;
        context.getResources().getValue(i, typedValue, true);
        long a = m1341a(typedValue);
        Drawable a2 = m1345a(context, a);
        if (a2 != null) {
            return a2;
        }
        C0247e eVar = this.f1122g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo1673a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1351a(context, a, drawable);
        }
        return drawable;
    }

    /* renamed from: d */
    private ColorStateList m1355d(Context context, int i) {
        WeakHashMap<Context, C3942j<ColorStateList>> weakHashMap = this.f1116a;
        if (weakHashMap == null) {
            return null;
        }
        C3942j jVar = (C3942j) weakHashMap.get(context);
        if (jVar != null) {
            return (ColorStateList) jVar.mo14172a(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1356e(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.e.a<java.lang.String, androidx.appcompat.widget.j0$d> r0 = r10.f1117b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            e.e.j<java.lang.String> r0 = r10.f1118c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo14172a(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.a<java.lang.String, androidx.appcompat.widget.j0$d> r3 = r10.f1117b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.e.j r0 = new e.e.j
            r0.<init>()
            r10.f1118c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1120e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1120e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1120e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1341a(r0)
            android.graphics.drawable.Drawable r6 = r10.m1345a(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            e.e.j<java.lang.String> r8 = r10.f1118c     // Catch:{ Exception -> 0x00a2 }
            r8.mo14174a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            e.e.a<java.lang.String, androidx.appcompat.widget.j0$d> r8 = r10.f1117b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.j0$d r3 = (androidx.appcompat.widget.C0242j0.C0246d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1699a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1351a(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            e.e.j<java.lang.String> r11 = r10.f1118c
            r11.mo14174a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0242j0.m1356e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo1698b(Context context, int i) {
        ColorStateList d;
        d = m1355d(context, i);
        if (d == null) {
            d = this.f1122g == null ? null : this.f1122g.mo1671a(context, i);
            if (d != null) {
                m1347a(context, i, d);
            }
        }
        return d;
    }

    /* renamed from: a */
    private static void m1349a(C0242j0 j0Var) {
        if (VERSION.SDK_INT < 24) {
            j0Var.m1350a("vector", (C0246d) new C0248f());
            j0Var.m1350a("animated-vector", (C0246d) new C0244b());
            j0Var.m1350a("animated-selector", (C0246d) new C0243a());
        }
    }

    /* renamed from: b */
    private void m1353b(Context context) {
        if (!this.f1121f) {
            this.f1121f = true;
            Drawable a = mo1692a(context, C3885a.abc_vector_test);
            if (a == null || !m1352a(a)) {
                this.f1121f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo1696a(C0247e eVar) {
        this.f1122g = eVar;
    }

    /* renamed from: a */
    public synchronized Drawable mo1692a(Context context, int i) {
        return mo1693a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1693a(Context context, int i, boolean z) {
        Drawable e;
        m1353b(context);
        e = m1356e(context, i);
        if (e == null) {
            e = m1354c(context, i);
        }
        if (e == null) {
            e = C4025a.m13798c(context, i);
        }
        if (e != null) {
            e = m1344a(context, i, z, e);
        }
        if (e != null) {
            C0204b0.m1173b(e);
        }
        return e;
    }

    /* renamed from: a */
    public synchronized void mo1695a(Context context) {
        C3933f fVar = (C3933f) this.f1119d.get(context);
        if (fVar != null) {
            fVar.mo14058a();
        }
    }

    /* renamed from: a */
    private static long m1341a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private Drawable m1344a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo1698b(context, i);
        if (b != null) {
            if (C0204b0.m1172a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0492a.m2652i(drawable);
            C0492a.m2637a(i2, b);
            Mode a = mo1691a(i);
            if (a == null) {
                return i2;
            }
            C0492a.m2640a(i2, a);
            return i2;
        }
        C0247e eVar = this.f1122g;
        if ((eVar == null || !eVar.mo1675b(context, i, drawable)) && !mo1697a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1345a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.e.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1119d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            e.e.f r0 = (p096e.p113e.C3933f) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo14066c(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo14064b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0242j0.m1345a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private synchronized boolean m1351a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C3933f fVar = (C3933f) this.f1119d.get(context);
        if (fVar == null) {
            fVar = new C3933f();
            this.f1119d.put(context, fVar);
        }
        fVar.mo14067c(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1694a(Context context, C0300y0 y0Var, int i) {
        Drawable e = m1356e(context, i);
        if (e == null) {
            e = y0Var.mo2024a(i);
        }
        if (e == null) {
            return null;
        }
        return m1344a(context, i, false, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1697a(Context context, int i, Drawable drawable) {
        C0247e eVar = this.f1122g;
        return eVar != null && eVar.mo1674a(context, i, drawable);
    }

    /* renamed from: a */
    private void m1350a(String str, C0246d dVar) {
        if (this.f1117b == null) {
            this.f1117b = new C3926a<>();
        }
        this.f1117b.put(str, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Mode mo1691a(int i) {
        C0247e eVar = this.f1122g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1672a(i);
    }

    /* renamed from: a */
    private void m1347a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1116a == null) {
            this.f1116a = new WeakHashMap<>();
        }
        C3942j jVar = (C3942j) this.f1116a.get(context);
        if (jVar == null) {
            jVar = new C3942j();
            this.f1116a.put(context, jVar);
        }
        jVar.mo14174a(i, colorStateList);
    }

    /* renamed from: a */
    static void m1348a(Drawable drawable, C0269r0 r0Var, int[] iArr) {
        if (!C0204b0.m1172a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.f1203d || r0Var.f1202c) {
                drawable.setColorFilter(m1343a(r0Var.f1203d ? r0Var.f1200a : null, r0Var.f1202c ? r0Var.f1201b : f1113h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1343a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1342a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1342a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0242j0.class) {
            a = f1115j.mo1700a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f1115j.mo1701a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m1352a(Drawable drawable) {
        if (!(drawable instanceof C4369i)) {
            if (!"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }
}
