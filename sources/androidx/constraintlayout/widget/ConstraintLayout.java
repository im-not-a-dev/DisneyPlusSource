package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import p096e.p114f.p117b.C3959f;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3980j;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3995a;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3996b;

public class ConstraintLayout extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ArrayList<C0421b> f1739U = new ArrayList<>(4);

    /* renamed from: V */
    private final ArrayList<C3973f> f1740V = new ArrayList<>(100);
    /* access modifiers changed from: protected */

    /* renamed from: W */
    public C3976g f1741W = new C3976g();
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public int f1742a0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f1743b0 = 0;

    /* renamed from: c */
    SparseArray<View> f1744c = new SparseArray<>();

    /* renamed from: c0 */
    private int f1745c0 = Integer.MAX_VALUE;

    /* renamed from: d0 */
    private int f1746d0 = Integer.MAX_VALUE;

    /* renamed from: e0 */
    protected boolean f1747e0 = true;

    /* renamed from: f0 */
    private int f1748f0 = 7;

    /* renamed from: g0 */
    private C0425d f1749g0 = null;

    /* renamed from: h0 */
    protected C0422c f1750h0 = null;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public int f1751i0 = -1;

    /* renamed from: j0 */
    private HashMap<String, Integer> f1752j0 = new HashMap<>();

    /* renamed from: k0 */
    private int f1753k0 = -1;

    /* renamed from: l0 */
    private int f1754l0 = -1;

    /* renamed from: m0 */
    private SparseArray<C3973f> f1755m0 = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C3959f f1756n0;

    /* renamed from: o0 */
    C0417d f1757o0 = new C0417d(this, this);
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public int f1758p0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f1759q0 = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    class C0413a extends Handler {
        C0413a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            constraintLayout.mo2137a(constraintLayout.f1751i0, message.arg1, message.arg2);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    static /* synthetic */ class C0414b {

        /* renamed from: a */
        static final /* synthetic */ int[] f1761a = new int[C3975b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                e.f.b.j.f$b[] r0 = p096e.p114f.p117b.p118j.C3973f.C3975b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1761a = r0
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1761a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0414b.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    public static class C0415c extends MarginLayoutParams {

        /* renamed from: A */
        public float f1762A = 0.5f;

        /* renamed from: B */
        public String f1763B = null;

        /* renamed from: C */
        int f1764C = 1;

        /* renamed from: D */
        public float f1765D = -1.0f;

        /* renamed from: E */
        public float f1766E = -1.0f;

        /* renamed from: F */
        public int f1767F = 0;

        /* renamed from: G */
        public int f1768G = 0;

        /* renamed from: H */
        public int f1769H = 0;

        /* renamed from: I */
        public int f1770I = 0;

        /* renamed from: J */
        public int f1771J = 0;

        /* renamed from: K */
        public int f1772K = 0;

        /* renamed from: L */
        public int f1773L = 0;

        /* renamed from: M */
        public int f1774M = 0;

        /* renamed from: N */
        public float f1775N = 1.0f;

        /* renamed from: O */
        public float f1776O = 1.0f;

        /* renamed from: P */
        public int f1777P = -1;

        /* renamed from: Q */
        public int f1778Q = -1;

        /* renamed from: R */
        public int f1779R = -1;

        /* renamed from: S */
        public boolean f1780S = false;

        /* renamed from: T */
        public boolean f1781T = false;

        /* renamed from: U */
        public String f1782U = null;

        /* renamed from: V */
        boolean f1783V = true;

        /* renamed from: W */
        boolean f1784W = true;

        /* renamed from: X */
        boolean f1785X = false;

        /* renamed from: Y */
        boolean f1786Y = false;

        /* renamed from: Z */
        boolean f1787Z = false;

        /* renamed from: a */
        public int f1788a = -1;

        /* renamed from: a0 */
        boolean f1789a0 = false;

        /* renamed from: b */
        public int f1790b = -1;

        /* renamed from: b0 */
        boolean f1791b0 = false;

        /* renamed from: c */
        public float f1792c = -1.0f;

        /* renamed from: c0 */
        int f1793c0 = -1;

        /* renamed from: d */
        public int f1794d = -1;

        /* renamed from: d0 */
        int f1795d0 = -1;

        /* renamed from: e */
        public int f1796e = -1;

        /* renamed from: e0 */
        int f1797e0 = -1;

        /* renamed from: f */
        public int f1798f = -1;

        /* renamed from: f0 */
        int f1799f0 = -1;

        /* renamed from: g */
        public int f1800g = -1;

        /* renamed from: g0 */
        int f1801g0 = -1;

        /* renamed from: h */
        public int f1802h = -1;

        /* renamed from: h0 */
        int f1803h0 = -1;

        /* renamed from: i */
        public int f1804i = -1;

        /* renamed from: i0 */
        float f1805i0 = 0.5f;

        /* renamed from: j */
        public int f1806j = -1;

        /* renamed from: j0 */
        int f1807j0;

        /* renamed from: k */
        public int f1808k = -1;

        /* renamed from: k0 */
        int f1809k0;

        /* renamed from: l */
        public int f1810l = -1;

        /* renamed from: l0 */
        float f1811l0;

        /* renamed from: m */
        public int f1812m = -1;

        /* renamed from: m0 */
        C3973f f1813m0 = new C3973f();

        /* renamed from: n */
        public int f1814n = 0;

        /* renamed from: n0 */
        public boolean f1815n0;

        /* renamed from: o */
        public float f1816o = 0.0f;

        /* renamed from: p */
        public int f1817p = -1;

        /* renamed from: q */
        public int f1818q = -1;

        /* renamed from: r */
        public int f1819r = -1;

        /* renamed from: s */
        public int f1820s = -1;

        /* renamed from: t */
        public int f1821t = -1;

        /* renamed from: u */
        public int f1822u = -1;

        /* renamed from: v */
        public int f1823v = -1;

        /* renamed from: w */
        public int f1824w = -1;

        /* renamed from: x */
        public int f1825x = -1;

        /* renamed from: y */
        public int f1826y = -1;

        /* renamed from: z */
        public float f1827z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c$a */
        private static class C0416a {

            /* renamed from: a */
            public static final SparseIntArray f1828a = new SparseIntArray();

            static {
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f1828a.append(C0436i.ConstraintLayout_Layout_android_orientation, 1);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f1828a.append(C0436i.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C0415c(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                String str = "ConstraintLayout";
                switch (C0416a.f1828a.get(index)) {
                    case 1:
                        this.f1779R = obtainStyledAttributes.getInt(index, this.f1779R);
                        break;
                    case 2:
                        this.f1812m = obtainStyledAttributes.getResourceId(index, this.f1812m);
                        if (this.f1812m != -1) {
                            break;
                        } else {
                            this.f1812m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1814n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1814n);
                        break;
                    case 4:
                        this.f1816o = obtainStyledAttributes.getFloat(index, this.f1816o) % 360.0f;
                        float f = this.f1816o;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f1816o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1788a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1788a);
                        break;
                    case 6:
                        this.f1790b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1790b);
                        break;
                    case 7:
                        this.f1792c = obtainStyledAttributes.getFloat(index, this.f1792c);
                        break;
                    case 8:
                        this.f1794d = obtainStyledAttributes.getResourceId(index, this.f1794d);
                        if (this.f1794d != -1) {
                            break;
                        } else {
                            this.f1794d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f1796e = obtainStyledAttributes.getResourceId(index, this.f1796e);
                        if (this.f1796e != -1) {
                            break;
                        } else {
                            this.f1796e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f1798f = obtainStyledAttributes.getResourceId(index, this.f1798f);
                        if (this.f1798f != -1) {
                            break;
                        } else {
                            this.f1798f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f1800g = obtainStyledAttributes.getResourceId(index, this.f1800g);
                        if (this.f1800g != -1) {
                            break;
                        } else {
                            this.f1800g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f1802h = obtainStyledAttributes.getResourceId(index, this.f1802h);
                        if (this.f1802h != -1) {
                            break;
                        } else {
                            this.f1802h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f1804i = obtainStyledAttributes.getResourceId(index, this.f1804i);
                        if (this.f1804i != -1) {
                            break;
                        } else {
                            this.f1804i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f1806j = obtainStyledAttributes.getResourceId(index, this.f1806j);
                        if (this.f1806j != -1) {
                            break;
                        } else {
                            this.f1806j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f1808k = obtainStyledAttributes.getResourceId(index, this.f1808k);
                        if (this.f1808k != -1) {
                            break;
                        } else {
                            this.f1808k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f1810l = obtainStyledAttributes.getResourceId(index, this.f1810l);
                        if (this.f1810l != -1) {
                            break;
                        } else {
                            this.f1810l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f1817p = obtainStyledAttributes.getResourceId(index, this.f1817p);
                        if (this.f1817p != -1) {
                            break;
                        } else {
                            this.f1817p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f1818q = obtainStyledAttributes.getResourceId(index, this.f1818q);
                        if (this.f1818q != -1) {
                            break;
                        } else {
                            this.f1818q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f1819r = obtainStyledAttributes.getResourceId(index, this.f1819r);
                        if (this.f1819r != -1) {
                            break;
                        } else {
                            this.f1819r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f1820s = obtainStyledAttributes.getResourceId(index, this.f1820s);
                        if (this.f1820s != -1) {
                            break;
                        } else {
                            this.f1820s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1821t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1821t);
                        break;
                    case 22:
                        this.f1822u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1822u);
                        break;
                    case 23:
                        this.f1823v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1823v);
                        break;
                    case 24:
                        this.f1824w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1824w);
                        break;
                    case 25:
                        this.f1825x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1825x);
                        break;
                    case 26:
                        this.f1826y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1826y);
                        break;
                    case 27:
                        this.f1780S = obtainStyledAttributes.getBoolean(index, this.f1780S);
                        break;
                    case 28:
                        this.f1781T = obtainStyledAttributes.getBoolean(index, this.f1781T);
                        break;
                    case 29:
                        this.f1827z = obtainStyledAttributes.getFloat(index, this.f1827z);
                        break;
                    case 30:
                        this.f1762A = obtainStyledAttributes.getFloat(index, this.f1762A);
                        break;
                    case 31:
                        this.f1769H = obtainStyledAttributes.getInt(index, 0);
                        if (this.f1769H != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f1770I = obtainStyledAttributes.getInt(index, 0);
                        if (this.f1770I != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f1771J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1771J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1771J) != -2) {
                                break;
                            } else {
                                this.f1771J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1773L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1773L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1773L) != -2) {
                                break;
                            } else {
                                this.f1773L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f1775N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1775N));
                        break;
                    case 36:
                        try {
                            this.f1772K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1772K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1772K) != -2) {
                                break;
                            } else {
                                this.f1772K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1774M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1774M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1774M) != -2) {
                                break;
                            } else {
                                this.f1774M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f1776O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1776O));
                        break;
                    case 44:
                        this.f1763B = obtainStyledAttributes.getString(index);
                        this.f1764C = -1;
                        String str2 = this.f1763B;
                        if (str2 == null) {
                            break;
                        } else {
                            int length = str2.length();
                            int indexOf = this.f1763B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f1763B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.f1764C = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f1764C = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f1763B.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.f1763B.substring(i, indexOf2);
                                String substring3 = this.f1763B.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f1764C != 1) {
                                                Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.f1763B.substring(i);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    Float.parseFloat(substring4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 45:
                        this.f1765D = obtainStyledAttributes.getFloat(index, this.f1765D);
                        break;
                    case 46:
                        this.f1766E = obtainStyledAttributes.getFloat(index, this.f1766E);
                        break;
                    case 47:
                        this.f1767F = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.f1768G = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.f1777P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1777P);
                        break;
                    case 50:
                        this.f1778Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1778Q);
                        break;
                    case 51:
                        this.f1782U = obtainStyledAttributes.getString(index);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            mo2378b();
        }

        /* renamed from: a */
        public String mo2377a() {
            return this.f1782U;
        }

        /* renamed from: b */
        public void mo2378b() {
            this.f1786Y = false;
            this.f1783V = true;
            this.f1784W = true;
            if (this.width == -2 && this.f1780S) {
                this.f1783V = false;
                if (this.f1769H == 0) {
                    this.f1769H = 1;
                }
            }
            if (this.height == -2 && this.f1781T) {
                this.f1784W = false;
                if (this.f1770I == 0) {
                    this.f1770I = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.f1783V = false;
                if (this.width == 0 && this.f1769H == 1) {
                    this.width = -2;
                    this.f1780S = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f1784W = false;
                if (this.height == 0 && this.f1770I == 1) {
                    this.height = -2;
                    this.f1781T = true;
                }
            }
            if (this.f1792c != -1.0f || this.f1788a != -1 || this.f1790b != -1) {
                this.f1786Y = true;
                this.f1783V = true;
                this.f1784W = true;
                if (!(this.f1813m0 instanceof C3980j)) {
                    this.f1813m0 = new C3980j();
                }
                ((C3980j) this.f1813m0).mo14459B(this.f1779R);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 17
                if (r2 < r3) goto L_0x000d
                super.resolveLayoutDirection(r7)
            L_0x000d:
                r7 = -1
                r6.f1797e0 = r7
                r6.f1799f0 = r7
                r6.f1793c0 = r7
                r6.f1795d0 = r7
                r6.f1801g0 = r7
                r6.f1803h0 = r7
                int r2 = r6.f1821t
                r6.f1801g0 = r2
                int r2 = r6.f1823v
                r6.f1803h0 = r2
                float r2 = r6.f1827z
                r6.f1805i0 = r2
                int r2 = r6.f1788a
                r6.f1807j0 = r2
                int r2 = r6.f1790b
                r6.f1809k0 = r2
                float r2 = r6.f1792c
                r6.f1811l0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x003c
                r2 = 1
                goto L_0x003d
            L_0x003c:
                r2 = 0
            L_0x003d:
                if (r2 == 0) goto L_0x00a0
                int r2 = r6.f1817p
                if (r2 == r7) goto L_0x0047
                r6.f1797e0 = r2
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r2 = r6.f1818q
                if (r2 == r7) goto L_0x004e
                r6.f1799f0 = r2
                goto L_0x0045
            L_0x004e:
                int r2 = r6.f1819r
                if (r2 == r7) goto L_0x0055
                r6.f1795d0 = r2
                r3 = 1
            L_0x0055:
                int r2 = r6.f1820s
                if (r2 == r7) goto L_0x005c
                r6.f1793c0 = r2
                r3 = 1
            L_0x005c:
                int r2 = r6.f1825x
                if (r2 == r7) goto L_0x0062
                r6.f1803h0 = r2
            L_0x0062:
                int r2 = r6.f1826y
                if (r2 == r7) goto L_0x0068
                r6.f1801g0 = r2
            L_0x0068:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.f1827z
                float r3 = r2 - r3
                r6.f1805i0 = r3
            L_0x0072:
                boolean r3 = r6.f1786Y
                if (r3 == 0) goto L_0x00c4
                int r3 = r6.f1779R
                if (r3 != r4) goto L_0x00c4
                float r3 = r6.f1792c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r2 = r2 - r3
                r6.f1811l0 = r2
                r6.f1807j0 = r7
                r6.f1809k0 = r7
                goto L_0x00c4
            L_0x008a:
                int r2 = r6.f1788a
                if (r2 == r7) goto L_0x0095
                r6.f1809k0 = r2
                r6.f1807j0 = r7
                r6.f1811l0 = r4
                goto L_0x00c4
            L_0x0095:
                int r2 = r6.f1790b
                if (r2 == r7) goto L_0x00c4
                r6.f1807j0 = r2
                r6.f1809k0 = r7
                r6.f1811l0 = r4
                goto L_0x00c4
            L_0x00a0:
                int r2 = r6.f1817p
                if (r2 == r7) goto L_0x00a6
                r6.f1795d0 = r2
            L_0x00a6:
                int r2 = r6.f1818q
                if (r2 == r7) goto L_0x00ac
                r6.f1793c0 = r2
            L_0x00ac:
                int r2 = r6.f1819r
                if (r2 == r7) goto L_0x00b2
                r6.f1797e0 = r2
            L_0x00b2:
                int r2 = r6.f1820s
                if (r2 == r7) goto L_0x00b8
                r6.f1799f0 = r2
            L_0x00b8:
                int r2 = r6.f1825x
                if (r2 == r7) goto L_0x00be
                r6.f1801g0 = r2
            L_0x00be:
                int r2 = r6.f1826y
                if (r2 == r7) goto L_0x00c4
                r6.f1803h0 = r2
            L_0x00c4:
                int r2 = r6.f1819r
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f1820s
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f1818q
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f1817p
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f1798f
                if (r2 == r7) goto L_0x00e3
                r6.f1797e0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
                goto L_0x00f1
            L_0x00e3:
                int r2 = r6.f1800g
                if (r2 == r7) goto L_0x00f1
                r6.f1799f0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
            L_0x00f1:
                int r1 = r6.f1794d
                if (r1 == r7) goto L_0x0100
                r6.f1793c0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
                goto L_0x010e
            L_0x0100:
                int r1 = r6.f1796e
                if (r1 == r7) goto L_0x010e
                r6.f1795d0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0415c.resolveLayoutDirection(int):void");
        }

        public C0415c(int i, int i2) {
            super(i, i2);
        }

        public C0415c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$d */
    class C0417d implements C3996b {

        /* renamed from: a */
        ConstraintLayout f1829a;

        public C0417d(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f1829a = constraintLayout2;
        }

        /* renamed from: a */
        public final void mo2382a(C3973f fVar, C3995a aVar) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            C3973f fVar2 = fVar;
            C3995a aVar2 = aVar;
            if (fVar2 != null && fVar.mo14315A() != 8) {
                C3975b bVar = aVar2.f10162a;
                C3975b bVar2 = aVar2.f10163b;
                int i6 = aVar2.f10164c;
                int i7 = aVar2.f10165d;
                int paddingTop = this.f1829a.getPaddingTop() + this.f1829a.getPaddingBottom();
                int paddingLeft = this.f1829a.getPaddingLeft() + this.f1829a.getPaddingRight();
                int i8 = C0414b.f1761a[bVar.ordinal()];
                boolean z = true;
                if (i8 == 1) {
                    i = MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else if (i8 == 2) {
                    i = ViewGroup.getChildMeasureSpec(this.f1829a.f1758p0, paddingLeft, -2);
                } else if (i8 == 3) {
                    i = ViewGroup.getChildMeasureSpec(this.f1829a.f1758p0, paddingLeft, -1);
                } else if (i8 != 4) {
                    i = 0;
                } else {
                    i = ViewGroup.getChildMeasureSpec(this.f1829a.f1758p0, paddingLeft, -2);
                }
                int i9 = C0414b.f1761a[bVar2.ordinal()];
                if (i9 == 1) {
                    i2 = MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (i9 == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f1829a.f1759q0, paddingTop, -2);
                } else if (i9 == 3) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f1829a.f1759q0, paddingTop, -1);
                } else if (i9 != 4) {
                    i2 = 0;
                } else {
                    i2 = ViewGroup.getChildMeasureSpec(this.f1829a.f1759q0, paddingTop, -2);
                }
                boolean z2 = bVar == C3975b.MATCH_CONSTRAINT;
                boolean z3 = bVar2 == C3975b.MATCH_CONSTRAINT;
                boolean z4 = bVar2 == C3975b.WRAP_CONTENT || bVar2 == C3975b.MATCH_PARENT || bVar2 == C3975b.FIXED;
                boolean z5 = bVar == C3975b.WRAP_CONTENT || bVar == C3975b.MATCH_PARENT || bVar == C3975b.FIXED;
                boolean z6 = z2 && fVar2.f9989P > 0.0f;
                if (!z3 || fVar2.f9989P <= 0.0f) {
                    z = false;
                }
                View view = (View) fVar.mo14370f();
                if (!z2 || fVar2.f10020k != 0 || !z3 || fVar2.f10022l != 0) {
                    view.measure(i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline = view.getBaseline();
                    int i10 = fVar2.f10026n;
                    i3 = i10 > 0 ? Math.max(i10, measuredWidth) : measuredWidth;
                    int i11 = fVar2.f10028o;
                    if (i11 > 0) {
                        i3 = Math.min(i11, i3);
                    }
                    int i12 = fVar2.f10032q;
                    int max = i12 > 0 ? Math.max(i12, measuredHeight) : measuredHeight;
                    int i13 = fVar2.f10034r;
                    if (i13 > 0) {
                        max = Math.min(i13, max);
                    }
                    if (z6 && z4) {
                        i3 = (int) ((((float) max) * fVar2.f9989P) + 0.5f);
                    } else if (z && z5) {
                        max = (int) ((((float) i3) / fVar2.f9989P) + 0.5f);
                    }
                    if (measuredWidth == i3 && measuredHeight == max) {
                        i5 = max;
                        i4 = baseline;
                    } else {
                        if (measuredWidth != i3) {
                            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        }
                        if (measuredHeight != max) {
                            i2 = MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        view.measure(i, i2);
                        int measuredWidth2 = view.getMeasuredWidth();
                        i5 = view.getMeasuredHeight();
                        i4 = view.getBaseline();
                        i3 = measuredWidth2;
                    }
                } else {
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                }
                aVar2.f10166e = i3;
                aVar2.f10167f = i5;
                aVar2.f10168g = i4;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            if (r11.f10020k == 1) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (r11.f10022l == 1) goto L_0x00a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2381a(p096e.p114f.p117b.p118j.C3973f r11, p096e.p114f.p117b.p118j.C3973f.C3975b r12, int r13, p096e.p114f.p117b.p118j.C3973f.C3975b r14, int r15) {
            /*
                r10 = this;
                if (r11 != 0) goto L_0x0003
                return
            L_0x0003:
                int r0 = r11.mo14315A()
                r1 = 8
                if (r0 != r1) goto L_0x000c
                return
            L_0x000c:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r10.f1829a
                int r0 = r0.getPaddingTop()
                androidx.constraintlayout.widget.ConstraintLayout r1 = r10.f1829a
                int r1 = r1.getPaddingBottom()
                int r0 = r0 + r1
                androidx.constraintlayout.widget.ConstraintLayout r1 = r10.f1829a
                int r1 = r1.getPaddingLeft()
                androidx.constraintlayout.widget.ConstraintLayout r2 = r10.f1829a
                int r2 = r2.getPaddingRight()
                int r1 = r1 + r2
                int[] r2 = androidx.constraintlayout.widget.ConstraintLayout.C0414b.f1761a
                int r12 = r12.ordinal()
                r12 = r2[r12]
                r2 = 1073741824(0x40000000, float:2.0)
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = -1
                r7 = -2
                r8 = 0
                r9 = 1
                if (r12 == r9) goto L_0x0068
                if (r12 == r5) goto L_0x005c
                if (r12 == r4) goto L_0x0051
                if (r12 == r3) goto L_0x0042
                r12 = 0
            L_0x0040:
                r13 = 0
                goto L_0x006d
            L_0x0042:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f1829a
                int r12 = r12.f1758p0
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r7)
                int r13 = r11.f10020k
                if (r13 != r9) goto L_0x0040
                goto L_0x0066
            L_0x0051:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f1829a
                int r12 = r12.f1758p0
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r6)
                goto L_0x0040
            L_0x005c:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f1829a
                int r12 = r12.f1758p0
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r7)
            L_0x0066:
                r13 = 1
                goto L_0x006d
            L_0x0068:
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r2)
                goto L_0x0040
            L_0x006d:
                int[] r1 = androidx.constraintlayout.widget.ConstraintLayout.C0414b.f1761a
                int r14 = r14.ordinal()
                r14 = r1[r14]
                if (r14 == r9) goto L_0x00a6
                if (r14 == r5) goto L_0x0099
                if (r14 == r4) goto L_0x008e
                if (r14 == r3) goto L_0x007f
                r14 = 0
                goto L_0x00aa
            L_0x007f:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f1829a
                int r14 = r14.f1759q0
                int r14 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r7)
                int r15 = r11.f10022l
                if (r15 != r9) goto L_0x00aa
                goto L_0x00a4
            L_0x008e:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f1829a
                int r14 = r14.f1759q0
                int r14 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r6)
                goto L_0x00aa
            L_0x0099:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f1829a
                int r14 = r14.f1759q0
                int r8 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r7)
                r14 = r8
            L_0x00a4:
                r8 = 1
                goto L_0x00aa
            L_0x00a6:
                int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r2)
            L_0x00aa:
                java.lang.Object r15 = r11.mo14370f()
                android.view.View r15 = (android.view.View) r15
                android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$c r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0415c) r0
                boolean r0 = r15 instanceof androidx.constraintlayout.widget.C0440k
                if (r0 == 0) goto L_0x00c8
                boolean r0 = r11 instanceof p096e.p114f.p117b.p118j.C3991s
                if (r0 == 0) goto L_0x00c8
                r0 = r11
                e.f.b.j.s r0 = (p096e.p114f.p117b.p118j.C3991s) r0
                r1 = r15
                androidx.constraintlayout.widget.k r1 = (androidx.constraintlayout.widget.C0440k) r1
                r1.mo2112a(r0, r12, r14)
                goto L_0x00cb
            L_0x00c8:
                r15.measure(r12, r14)
            L_0x00cb:
                int r12 = r15.getMeasuredWidth()
                int r14 = r15.getMeasuredHeight()
                r11.mo14401u(r12)
                r11.mo14384m(r14)
                if (r13 == 0) goto L_0x00de
                r11.mo14405w(r12)
            L_0x00de:
                if (r8 == 0) goto L_0x00e3
                r11.mo14403v(r14)
            L_0x00e3:
                int r12 = r15.getBaseline()
                if (r12 == r6) goto L_0x00ef
                r11.mo14344a(r9)
                r11.mo14378j(r12)
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0417d.mo2381a(e.f.b.j.f, e.f.b.j.f$b, int, e.f.b.j.f$b, int):void");
        }

        /* renamed from: a */
        public boolean mo2383a(C3973f fVar) {
            int i;
            int i2;
            boolean z;
            C3973f fVar2 = fVar;
            View view = (View) fVar.mo14370f();
            C0415c cVar = (C0415c) view.getLayoutParams();
            int a = this.f1829a.f1758p0;
            int b = this.f1829a.f1759q0;
            int paddingTop = this.f1829a.getPaddingTop() + this.f1829a.getPaddingBottom();
            int paddingLeft = this.f1829a.getPaddingLeft() + this.f1829a.getPaddingRight();
            boolean z2 = this.f1829a.f1741W.mo14387o() == C3975b.WRAP_CONTENT;
            boolean z3 = this.f1829a.f1741W.mo14410z() == C3975b.WRAP_CONTENT;
            int max = Math.max(this.f1829a.f1741W.mo14316B(), this.f1829a.f1742a0);
            int max2 = Math.max(this.f1829a.f1741W.mo14381l(), this.f1829a.f1743b0);
            if (cVar.width != -2 || !cVar.f1783V) {
                i = MeasureSpec.makeMeasureSpec(fVar.mo14316B(), 1073741824);
            } else {
                i = ViewGroup.getChildMeasureSpec(a, paddingLeft, cVar.width);
            }
            if (cVar.height != -2 || !cVar.f1784W) {
                i2 = MeasureSpec.makeMeasureSpec(fVar.mo14381l(), 1073741824);
            } else {
                i2 = ViewGroup.getChildMeasureSpec(b, paddingTop, cVar.height);
            }
            view.measure(i, i2);
            if (this.f1829a.f1756n0 != null) {
                C3959f e = this.f1829a.f1756n0;
                e.f9869b++;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth != fVar.mo14316B()) {
                fVar2.mo14401u(measuredWidth);
                if (z2 && fVar.mo14400u() > max) {
                    Math.max(max, fVar.mo14400u() + fVar2.mo14330a(C3972d.RIGHT).mo14304b());
                }
                z = true;
            } else {
                z = false;
            }
            if (measuredHeight != fVar.mo14381l()) {
                fVar2.mo14384m(measuredHeight);
                if (z3 && fVar.mo14367e() > max2) {
                    Math.max(max2, fVar.mo14367e() + fVar2.mo14330a(C3972d.BOTTOM).mo14304b());
                }
                z = true;
            }
            if (!cVar.f1785X) {
                return z;
            }
            fVar2.mo14344a(true);
            int baseline = view.getBaseline();
            if (baseline == -1 || baseline == fVar.mo14363d()) {
                return z;
            }
            fVar2.mo14378j(baseline);
            return true;
        }

        /* renamed from: a */
        public final void mo2380a() {
            int childCount = this.f1829a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1829a.getChildAt(i);
                if (childAt instanceof C0434g) {
                    ((C0434g) childAt).mo2452a(this.f1829a);
                }
            }
            int size = this.f1829a.f1739U.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0421b) this.f1829a.f1739U.get(i2)).mo2401c(this.f1829a);
                }
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        new C0413a(Looper.getMainLooper());
        m2246a((AttributeSet) null, 0, 0);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0415c;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.f1746d0;
    }

    public int getMaxWidth() {
        return this.f1745c0;
    }

    public int getMinHeight() {
        return this.f1743b0;
    }

    public int getMinWidth() {
        return this.f1742a0;
    }

    public int getOptimizationLevel() {
        return this.f1741W.mo14414W();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0415c cVar = (C0415c) childAt.getLayoutParams();
            C3973f fVar = cVar.f1813m0;
            if ((childAt.getVisibility() != 8 || cVar.f1786Y || cVar.f1787Z || cVar.f1791b0 || isInEditMode) && !cVar.f1789a0) {
                int j = fVar.mo14377j();
                int k = fVar.mo14379k();
                int B = fVar.mo14316B() + j;
                int l = fVar.mo14381l() + k;
                childAt.layout(j, k, B, l);
                if (childAt instanceof C0434g) {
                    View content = ((C0434g) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(j, k, B, l);
                    }
                }
            }
        }
        int size = this.f1739U.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((C0421b) this.f1739U.get(i6)).mo2384b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        System.currentTimeMillis();
        this.f1758p0 = i;
        this.f1759q0 = i2;
        MeasureSpec.getMode(i);
        MeasureSpec.getSize(i);
        MeasureSpec.getMode(i2);
        MeasureSpec.getSize(i2);
        if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
                z = false;
            }
            this.f1741W.mo14431f(z);
        }
        mo2352a(i, i2);
        int B = this.f1741W.mo14316B() + getPaddingLeft() + getPaddingRight();
        int l = this.f1741W.mo14381l() + getPaddingTop() + getPaddingBottom();
        if (VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(l, i2, 0) & 16777215;
            int min = Math.min(this.f1745c0, ViewGroup.resolveSizeAndState(B, i, 0) & 16777215);
            int min2 = Math.min(this.f1746d0, resolveSizeAndState);
            if (this.f1741W.mo14424b0()) {
                min |= 16777216;
            }
            if (this.f1741W.mo14417Z()) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f1753k0 = min;
            this.f1754l0 = min2;
            return;
        }
        setMeasuredDimension(B, l);
        this.f1753k0 = B;
        this.f1754l0 = l;
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C3973f a = mo2350a(view);
        if ((view instanceof Guideline) && !(a instanceof C3980j)) {
            C0415c cVar = (C0415c) view.getLayoutParams();
            cVar.f1813m0 = new C3980j();
            cVar.f1786Y = true;
            ((C3980j) cVar.f1813m0).mo14459B(cVar.f1779R);
        }
        if (view instanceof C0421b) {
            C0421b bVar = (C0421b) view;
            bVar.mo2398a();
            ((C0415c) view.getLayoutParams()).f1787Z = true;
            if (!this.f1739U.contains(bVar)) {
                this.f1739U.add(bVar);
            }
        }
        this.f1744c.put(view.getId(), view);
        this.f1747e0 = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1744c.remove(view.getId());
        C3973f a = mo2350a(view);
        this.f1741W.mo14504d(a);
        this.f1739U.remove(view);
        this.f1740V.remove(a);
        this.f1747e0 = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f1747e0 = true;
        this.f1753k0 = -1;
        this.f1754l0 = -1;
    }

    public void setConstraintSet(C0425d dVar) {
        this.f1749g0 = dVar;
    }

    public void setId(int i) {
        this.f1744c.remove(getId());
        super.setId(i);
        this.f1744c.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1746d0) {
            this.f1746d0 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1745c0) {
            this.f1745c0 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1743b0) {
            this.f1743b0 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1742a0) {
            this.f1742a0 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0433f fVar) {
        C0422c cVar = this.f1750h0;
        if (cVar != null) {
            cVar.mo2406a(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1748f0 = i;
        this.f1741W.mo14411A(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: c */
    private void mo2144c() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3973f a = mo2350a(getChildAt(i));
            if (a != null) {
                a.mo14325K();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2353a(0, (Object) resourceName, (Object) Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo2145c(childAt.getId()).mo14343a(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        } else {
            this.f1741W.mo14343a("root");
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                try {
                    String resourceName2 = getResources().getResourceName(childAt2.getId());
                    mo2353a(0, (Object) resourceName2, (Object) Integer.valueOf(childAt2.getId()));
                    int indexOf2 = resourceName2.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName2 = resourceName2.substring(indexOf2 + 1);
                    }
                    mo2145c(childAt2.getId()).mo14343a(resourceName2);
                } catch (NotFoundException unused2) {
                }
            }
        }
        if (this.f1751i0 != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt3 = getChildAt(i4);
                if (childAt3.getId() == this.f1751i0 && (childAt3 instanceof C0431e)) {
                    this.f1749g0 = ((C0431e) childAt3).getConstraintSet();
                }
            }
        }
        C0425d dVar = this.f1749g0;
        if (dVar != null) {
            dVar.mo2419a(this, true);
        }
        this.f1741W.mo14502U();
        int size = this.f1739U.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                ((C0421b) this.f1739U.get(i5)).mo2385d(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            if (childAt4 instanceof C0434g) {
                ((C0434g) childAt4).mo2453b(this);
            }
        }
        this.f1755m0.clear();
        this.f1755m0.put(0, this.f1741W);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            this.f1755m0.put(childAt5.getId(), mo2350a(childAt5));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt6 = getChildAt(i8);
            C3973f a2 = mo2350a(childAt6);
            if (a2 != null) {
                C0415c cVar = (C0415c) childAt6.getLayoutParams();
                this.f1741W.mo14503a(a2);
                mo2354a(isInEditMode, childAt6, a2, cVar, this.f1755m0);
            }
        }
    }

    /* renamed from: d */
    private boolean mo2146d() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f1740V.clear();
            mo2144c();
        }
        return z;
    }

    /* renamed from: a */
    public void mo2353a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1752j0 == null) {
                this.f1752j0 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1752j0.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2141b(int i) {
        this.f1750h0 = new C0422c(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    public C0415c generateDefaultLayoutParams() {
        return new C0415c(-2, -2);
    }

    public C0415c generateLayoutParams(AttributeSet attributeSet) {
        return new C0415c(getContext(), attributeSet);
    }

    /* renamed from: b */
    private void mo2142b(int i, int i2) {
        C3975b bVar;
        int i3;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        C3975b bVar2 = C3975b.FIXED;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = C3975b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f1745c0, size) - paddingLeft2;
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            bVar = C3975b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = C3975b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f1746d0, size2) - paddingTop2;
            }
            size2 = 0;
        } else {
            bVar2 = C3975b.WRAP_CONTENT;
        }
        this.f1741W.mo14407x(paddingLeft);
        this.f1741W.mo14409y(paddingTop);
        this.f1741W.mo14390p(this.f1745c0);
        this.f1741W.mo14388o(this.f1746d0);
        this.f1741W.mo14394r(0);
        this.f1741W.mo14392q(0);
        this.f1741W.mo14340a(bVar);
        this.f1741W.mo14401u(i3);
        this.f1741W.mo14352b(bVar2);
        this.f1741W.mo14384m(size2);
        this.f1741W.mo14394r((this.f1742a0 - getPaddingLeft()) - getPaddingRight());
        this.f1741W.mo14392q((this.f1743b0 - getPaddingTop()) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0415c(layoutParams);
    }

    /* renamed from: a */
    public Object mo2351a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f1752j0;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f1752j0.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m2246a(AttributeSet attributeSet, int i, int i2) {
        this.f1741W.mo14342a((Object) this);
        this.f1741W.mo14421a((C3996b) this.f1757o0);
        this.f1744c.put(getId(), this);
        this.f1749g0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0436i.ConstraintLayout_Layout_android_minWidth) {
                    this.f1742a0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1742a0);
                } else if (index == C0436i.ConstraintLayout_Layout_android_minHeight) {
                    this.f1743b0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1743b0);
                } else if (index == C0436i.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1745c0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1745c0);
                } else if (index == C0436i.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1746d0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1746d0);
                } else if (index == C0436i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1748f0 = obtainStyledAttributes.getInt(index, this.f1748f0);
                } else if (index == C0436i.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2141b(resourceId);
                        } catch (NotFoundException unused) {
                            this.f1750h0 = null;
                        }
                    }
                } else if (index == C0436i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f1749g0 = new C0425d();
                        this.f1749g0.mo2426b(getContext(), resourceId2);
                    } catch (NotFoundException unused2) {
                        this.f1749g0 = null;
                    }
                    this.f1751i0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1741W.mo14411A(this.f1748f0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C0413a(Looper.getMainLooper());
        m2246a(attributeSet, 0, 0);
    }

    /* renamed from: c */
    private final C3973f mo2145c(int i) {
        C3973f fVar;
        if (i == 0) {
            return this.f1741W;
        }
        View view = (View) this.f1744c.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f1741W;
        }
        if (view == null) {
            fVar = null;
        } else {
            fVar = ((C0415c) view.getLayoutParams()).f1813m0;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2354a(boolean r26, android.view.View r27, p096e.p114f.p117b.p118j.C3973f r28, androidx.constraintlayout.widget.ConstraintLayout.C0415c r29, android.util.SparseArray<p096e.p114f.p117b.p118j.C3973f> r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r29.mo2378b()
            r10 = 0
            r8.f1815n0 = r10
            int r2 = r27.getVisibility()
            r7.mo14398t(r2)
            boolean r2 = r8.f1789a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo14355b(r11)
            r2 = 8
            r7.mo14398t(r2)
        L_0x0024:
            r7.mo14342a(r1)
            boolean r2 = r8.f1784W
            if (r2 == 0) goto L_0x002f
            boolean r2 = r8.f1783V
            if (r2 != 0) goto L_0x0034
        L_0x002f:
            java.util.ArrayList<e.f.b.j.f> r2 = r0.f1740V
            r2.add(r7)
        L_0x0034:
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0421b
            if (r2 == 0) goto L_0x0043
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0421b) r1
            e.f.b.j.g r2 = r0.f1741W
            boolean r2 = r2.mo14423a0()
            r1.mo2111a(r7, r2)
        L_0x0043:
            boolean r1 = r8.f1786Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0076
            r1 = r7
            e.f.b.j.j r1 = (p096e.p114f.p117b.p118j.C3980j) r1
            int r3 = r8.f1807j0
            int r4 = r8.f1809k0
            float r5 = r8.f1811l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x005d
            int r3 = r8.f1788a
            int r4 = r8.f1790b
            float r5 = r8.f1792c
        L_0x005d:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            r1.mo14463e(r5)
            goto L_0x02d2
        L_0x0068:
            if (r3 == r12) goto L_0x006f
            r1.mo14294z(r3)
            goto L_0x02d2
        L_0x006f:
            if (r4 == r12) goto L_0x02d2
            r1.mo14458A(r4)
            goto L_0x02d2
        L_0x0076:
            int r1 = r8.f1793c0
            int r3 = r8.f1795d0
            int r4 = r8.f1797e0
            int r5 = r8.f1799f0
            int r6 = r8.f1801g0
            int r13 = r8.f1803h0
            float r14 = r8.f1805i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00bc
            int r1 = r8.f1794d
            int r2 = r8.f1796e
            int r4 = r8.f1798f
            int r5 = r8.f1800g
            int r3 = r8.f1821t
            int r6 = r8.f1823v
            float r14 = r8.f1827z
            if (r1 != r12) goto L_0x00a5
            if (r2 != r12) goto L_0x00a5
            int r13 = r8.f1818q
            if (r13 == r12) goto L_0x00a0
            r1 = r13
            goto L_0x00a5
        L_0x00a0:
            int r13 = r8.f1817p
            if (r13 == r12) goto L_0x00a5
            r2 = r13
        L_0x00a5:
            if (r4 != r12) goto L_0x00b8
            if (r5 != r12) goto L_0x00b8
            int r13 = r8.f1819r
            if (r13 == r12) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            int r13 = r8.f1820s
            if (r13 == r12) goto L_0x00b8
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r13 = r4
            goto L_0x00c4
        L_0x00b8:
            r13 = r4
        L_0x00b9:
            r15 = r6
            r6 = r3
            goto L_0x00bf
        L_0x00bc:
            r2 = r3
            r15 = r13
            r13 = r4
        L_0x00bf:
            r24 = r14
            r14 = r5
            r5 = r24
        L_0x00c4:
            int r3 = r8.f1812m
            if (r3 == r12) goto L_0x00d9
            java.lang.Object r1 = r9.get(r3)
            e.f.b.j.f r1 = (p096e.p114f.p117b.p118j.C3973f) r1
            if (r1 == 0) goto L_0x0211
            float r2 = r8.f1816o
            int r3 = r8.f1814n
            r7.mo14341a(r1, r2, r3)
            goto L_0x0211
        L_0x00d9:
            if (r1 == r12) goto L_0x00f6
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x00f4
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT
            int r2 = r8.leftMargin
            r1 = r28
            r16 = r2
            r2 = r4
            r10 = r5
            r5 = r16
            r1.mo14336a(r2, r3, r4, r5, r6)
            goto L_0x010d
        L_0x00f4:
            r10 = r5
            goto L_0x010d
        L_0x00f6:
            r10 = r5
            if (r2 == r12) goto L_0x010d
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x010d
            e.f.b.j.e$d r2 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT
            int r5 = r8.leftMargin
            r1 = r28
            r1.mo14336a(r2, r3, r4, r5, r6)
        L_0x010d:
            if (r13 == r12) goto L_0x0125
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x013b
            e.f.b.j.e$d r2 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT
            int r5 = r8.rightMargin
            r1 = r28
            r6 = r15
            r1.mo14336a(r2, r3, r4, r5, r6)
            goto L_0x013b
        L_0x0125:
            if (r14 == r12) goto L_0x013b
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x013b
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT
            int r5 = r8.rightMargin
            r1 = r28
            r2 = r4
            r6 = r15
            r1.mo14336a(r2, r3, r4, r5, r6)
        L_0x013b:
            int r1 = r8.f1802h
            if (r1 == r12) goto L_0x0155
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x016f
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1822u
            r1 = r28
            r2 = r4
            r1.mo14336a(r2, r3, r4, r5, r6)
            goto L_0x016f
        L_0x0155:
            int r1 = r8.f1804i
            if (r1 == r12) goto L_0x016f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x016f
            e.f.b.j.e$d r2 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1822u
            r1 = r28
            r1.mo14336a(r2, r3, r4, r5, r6)
        L_0x016f:
            int r1 = r8.f1806j
            if (r1 == r12) goto L_0x018a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x01a3
            e.f.b.j.e$d r2 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1824w
            r1 = r28
            r1.mo14336a(r2, r3, r4, r5, r6)
            goto L_0x01a3
        L_0x018a:
            int r1 = r8.f1808k
            if (r1 == r12) goto L_0x01a3
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            e.f.b.j.f r3 = (p096e.p114f.p117b.p118j.C3973f) r3
            if (r3 == 0) goto L_0x01a3
            e.f.b.j.e$d r4 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1824w
            r1 = r28
            r2 = r4
            r1.mo14336a(r2, r3, r4, r5, r6)
        L_0x01a3:
            int r1 = r8.f1810l
            if (r1 == r12) goto L_0x0200
            android.util.SparseArray<android.view.View> r2 = r0.f1744c
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1810l
            java.lang.Object r2 = r9.get(r2)
            e.f.b.j.f r2 = (p096e.p114f.p117b.p118j.C3973f) r2
            if (r2 == 0) goto L_0x0200
            if (r1 == 0) goto L_0x0200
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0415c
            if (r3 == 0) goto L_0x0200
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$c r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0415c) r1
            r8.f1785X = r11
            r1.f1785X = r11
            e.f.b.j.e$d r3 = p096e.p114f.p117b.p118j.C3968e.C3972d.BASELINE
            e.f.b.j.e r17 = r7.mo14330a(r3)
            e.f.b.j.e$d r3 = p096e.p114f.p117b.p118j.C3968e.C3972d.BASELINE
            e.f.b.j.e r18 = r2.mo14330a(r3)
            r19 = 0
            r20 = -1
            e.f.b.j.e$c r21 = p096e.p114f.p117b.p118j.C3968e.C3971c.STRONG
            r22 = 0
            r23 = 1
            r17.mo14302a(r18, r19, r20, r21, r22, r23)
            r7.mo14344a(r11)
            e.f.b.j.f r1 = r1.f1813m0
            r1.mo14344a(r11)
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            e.f.b.j.e r1 = r7.mo14330a(r1)
            r1.mo14313k()
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            e.f.b.j.e r1 = r7.mo14330a(r1)
            r1.mo14313k()
        L_0x0200:
            r1 = 0
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0208
            r7.mo14331a(r10)
        L_0x0208:
            float r2 = r8.f1762A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0211
            r7.mo14358c(r2)
        L_0x0211:
            if (r26 == 0) goto L_0x0222
            int r1 = r8.f1777P
            if (r1 != r12) goto L_0x021b
            int r1 = r8.f1778Q
            if (r1 == r12) goto L_0x0222
        L_0x021b:
            int r1 = r8.f1777P
            int r2 = r8.f1778Q
            r7.mo14359c(r1, r2)
        L_0x0222:
            boolean r1 = r8.f1783V
            r2 = -2
            if (r1 != 0) goto L_0x024f
            int r1 = r8.width
            if (r1 != r12) goto L_0x0245
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_PARENT
            r7.mo14340a(r1)
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT
            e.f.b.j.e r1 = r7.mo14330a(r1)
            int r3 = r8.leftMargin
            r1.f9942e = r3
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT
            e.f.b.j.e r1 = r7.mo14330a(r1)
            int r3 = r8.rightMargin
            r1.f9942e = r3
            goto L_0x0262
        L_0x0245:
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            r7.mo14340a(r1)
            r1 = 0
            r7.mo14401u(r1)
            goto L_0x0262
        L_0x024f:
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r7.mo14340a(r1)
            int r1 = r8.width
            r7.mo14401u(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0262
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            r7.mo14340a(r1)
        L_0x0262:
            boolean r1 = r8.f1784W
            if (r1 != 0) goto L_0x028e
            int r1 = r8.height
            if (r1 != r12) goto L_0x0284
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_PARENT
            r7.mo14352b(r1)
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            e.f.b.j.e r1 = r7.mo14330a(r1)
            int r2 = r8.topMargin
            r1.f9942e = r2
            e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            e.f.b.j.e r1 = r7.mo14330a(r1)
            int r2 = r8.bottomMargin
            r1.f9942e = r2
            goto L_0x02a1
        L_0x0284:
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            r7.mo14352b(r1)
            r1 = 0
            r7.mo14384m(r1)
            goto L_0x02a1
        L_0x028e:
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r7.mo14352b(r1)
            int r1 = r8.height
            r7.mo14384m(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x02a1
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            r7.mo14352b(r1)
        L_0x02a1:
            java.lang.String r1 = r8.f1763B
            if (r1 == 0) goto L_0x02a8
            r7.mo14354b(r1)
        L_0x02a8:
            float r1 = r8.f1765D
            r7.mo14348b(r1)
            float r1 = r8.f1766E
            r7.mo14365d(r1)
            int r1 = r8.f1767F
            r7.mo14386n(r1)
            int r1 = r8.f1768G
            r7.mo14396s(r1)
            int r1 = r8.f1769H
            int r2 = r8.f1771J
            int r3 = r8.f1773L
            float r4 = r8.f1775N
            r7.mo14333a(r1, r2, r3, r4)
            int r1 = r8.f1770I
            int r2 = r8.f1772K
            int r3 = r8.f1774M
            float r4 = r8.f1776O
            r7.mo14350b(r1, r2, r3, r4)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2354a(boolean, android.view.View, e.f.b.j.f, androidx.constraintlayout.widget.ConstraintLayout$c, android.util.SparseArray):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C0413a(Looper.getMainLooper());
        m2246a(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new C0413a(Looper.getMainLooper());
        m2246a(attributeSet, i, i2);
    }

    /* renamed from: a */
    public final C3973f mo2350a(View view) {
        C3973f fVar;
        if (view == this) {
            return this.f1741W;
        }
        if (view == null) {
            fVar = null;
        } else {
            fVar = ((C0415c) view.getLayoutParams()).f1813m0;
        }
        return fVar;
    }

    /* renamed from: a */
    public void mo2352a(int i, int i2) {
        if (this.f1747e0) {
            this.f1747e0 = false;
            if (mo2146d()) {
                this.f1741W.mo14432f0();
            }
        }
        mo2142b(i, i2);
        this.f1741W.mo14418a(this.f1748f0, MeasureSpec.getMode(i), MeasureSpec.getSize(i), MeasureSpec.getMode(i2), MeasureSpec.getSize(i2), this.f1753k0, this.f1754l0);
    }

    /* renamed from: a */
    public void mo2137a(int i, int i2, int i3) {
        C0422c cVar = this.f1750h0;
        if (cVar != null) {
            cVar.mo2405a(i, (float) i2, (float) i3);
        }
    }

    /* renamed from: a */
    public View mo2349a(int i) {
        return (View) this.f1744c.get(i);
    }
}
