package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0319b;
import androidx.constraintlayout.widget.C0431e.C0432a;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p114f.p115a.p116a.C3947c;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3983l;

/* renamed from: androidx.constraintlayout.widget.d */
/* compiled from: ConstraintSet */
public class C0425d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f1871d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f1872e = new SparseIntArray();

    /* renamed from: a */
    private HashMap<String, C0418a> f1873a = new HashMap<>();

    /* renamed from: b */
    private boolean f1874b = true;

    /* renamed from: c */
    private HashMap<Integer, C0426a> f1875c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* compiled from: ConstraintSet */
    public static class C0426a {

        /* renamed from: a */
        int f1876a;

        /* renamed from: b */
        public final C0429d f1877b = new C0429d();

        /* renamed from: c */
        public final C0428c f1878c = new C0428c();

        /* renamed from: d */
        public final C0427b f1879d = new C0427b();

        /* renamed from: e */
        public final C0430e f1880e = new C0430e();

        /* renamed from: f */
        public HashMap<String, C0418a> f1881f = new HashMap<>();

        public C0426a clone() {
            C0426a aVar = new C0426a();
            aVar.f1879d.mo2438a(this.f1879d);
            aVar.f1878c.mo2440a(this.f1878c);
            aVar.f1877b.mo2442a(this.f1877b);
            aVar.f1880e.mo2444a(this.f1880e);
            aVar.f1876a = this.f1876a;
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2338a(C0421b bVar, int i, C0432a aVar) {
            m2337a(i, aVar);
            if (bVar instanceof Barrier) {
                C0427b bVar2 = this.f1879d;
                bVar2.f1916d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1912b0 = barrier.getType();
                this.f1879d.f1918e0 = barrier.getReferencedIds();
                this.f1879d.f1914c0 = barrier.getMargin();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2337a(int i, C0432a aVar) {
            m2336a(i, (C0415c) aVar);
            this.f1877b.f1956d = aVar.f1974o0;
            C0430e eVar = this.f1880e;
            eVar.f1960b = aVar.f1977r0;
            eVar.f1961c = aVar.f1978s0;
            eVar.f1962d = aVar.f1979t0;
            eVar.f1963e = aVar.f1980u0;
            eVar.f1964f = aVar.f1981v0;
            eVar.f1965g = aVar.f1982w0;
            eVar.f1966h = aVar.f1983x0;
            eVar.f1967i = aVar.f1984y0;
            eVar.f1968j = aVar.f1985z0;
            eVar.f1969k = aVar.f1973A0;
            eVar.f1971m = aVar.f1976q0;
            eVar.f1970l = aVar.f1975p0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2336a(int i, C0415c cVar) {
            this.f1876a = i;
            C0427b bVar = this.f1879d;
            bVar.f1923h = cVar.f1794d;
            bVar.f1925i = cVar.f1796e;
            bVar.f1927j = cVar.f1798f;
            bVar.f1929k = cVar.f1800g;
            bVar.f1930l = cVar.f1802h;
            bVar.f1931m = cVar.f1804i;
            bVar.f1932n = cVar.f1806j;
            bVar.f1933o = cVar.f1808k;
            bVar.f1934p = cVar.f1810l;
            bVar.f1935q = cVar.f1817p;
            bVar.f1936r = cVar.f1818q;
            bVar.f1937s = cVar.f1819r;
            bVar.f1938t = cVar.f1820s;
            bVar.f1939u = cVar.f1827z;
            bVar.f1940v = cVar.f1762A;
            bVar.f1941w = cVar.f1763B;
            bVar.f1942x = cVar.f1812m;
            bVar.f1943y = cVar.f1814n;
            bVar.f1944z = cVar.f1816o;
            bVar.f1883A = cVar.f1777P;
            bVar.f1884B = cVar.f1778Q;
            bVar.f1885C = cVar.f1779R;
            bVar.f1921g = cVar.f1792c;
            bVar.f1917e = cVar.f1788a;
            bVar.f1919f = cVar.f1790b;
            bVar.f1913c = cVar.width;
            this.f1879d.f1915d = cVar.height;
            C0427b bVar2 = this.f1879d;
            bVar2.f1886D = cVar.leftMargin;
            bVar2.f1887E = cVar.rightMargin;
            bVar2.f1888F = cVar.topMargin;
            bVar2.f1889G = cVar.bottomMargin;
            bVar2.f1898P = cVar.f1766E;
            bVar2.f1899Q = cVar.f1765D;
            bVar2.f1901S = cVar.f1768G;
            bVar2.f1900R = cVar.f1767F;
            boolean z = cVar.f1780S;
            bVar2.f1924h0 = z;
            bVar2.f1926i0 = cVar.f1781T;
            bVar2.f1902T = cVar.f1769H;
            bVar2.f1903U = cVar.f1770I;
            bVar2.f1924h0 = z;
            bVar2.f1904V = cVar.f1773L;
            bVar2.f1905W = cVar.f1774M;
            bVar2.f1906X = cVar.f1771J;
            bVar2.f1907Y = cVar.f1772K;
            bVar2.f1908Z = cVar.f1775N;
            bVar2.f1910a0 = cVar.f1776O;
            bVar2.f1922g0 = cVar.f1782U;
            bVar2.f1893K = cVar.f1822u;
            bVar2.f1895M = cVar.f1824w;
            bVar2.f1892J = cVar.f1821t;
            bVar2.f1894L = cVar.f1823v;
            bVar2.f1897O = cVar.f1825x;
            bVar2.f1896N = cVar.f1826y;
            if (VERSION.SDK_INT >= 17) {
                bVar2.f1890H = cVar.getMarginEnd();
                this.f1879d.f1891I = cVar.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo2435a(C0415c cVar) {
            C0427b bVar = this.f1879d;
            cVar.f1794d = bVar.f1923h;
            cVar.f1796e = bVar.f1925i;
            cVar.f1798f = bVar.f1927j;
            cVar.f1800g = bVar.f1929k;
            cVar.f1802h = bVar.f1930l;
            cVar.f1804i = bVar.f1931m;
            cVar.f1806j = bVar.f1932n;
            cVar.f1808k = bVar.f1933o;
            cVar.f1810l = bVar.f1934p;
            cVar.f1817p = bVar.f1935q;
            cVar.f1818q = bVar.f1936r;
            cVar.f1819r = bVar.f1937s;
            cVar.f1820s = bVar.f1938t;
            cVar.leftMargin = bVar.f1886D;
            cVar.rightMargin = bVar.f1887E;
            cVar.topMargin = bVar.f1888F;
            cVar.bottomMargin = bVar.f1889G;
            cVar.f1825x = bVar.f1897O;
            cVar.f1826y = bVar.f1896N;
            cVar.f1822u = bVar.f1893K;
            cVar.f1824w = bVar.f1895M;
            cVar.f1827z = bVar.f1939u;
            cVar.f1762A = bVar.f1940v;
            cVar.f1812m = bVar.f1942x;
            cVar.f1814n = bVar.f1943y;
            cVar.f1816o = bVar.f1944z;
            cVar.f1763B = bVar.f1941w;
            cVar.f1777P = bVar.f1883A;
            cVar.f1778Q = bVar.f1884B;
            cVar.f1766E = bVar.f1898P;
            cVar.f1765D = bVar.f1899Q;
            cVar.f1768G = bVar.f1901S;
            cVar.f1767F = bVar.f1900R;
            cVar.f1780S = bVar.f1924h0;
            cVar.f1781T = bVar.f1926i0;
            cVar.f1769H = bVar.f1902T;
            cVar.f1770I = bVar.f1903U;
            cVar.f1773L = bVar.f1904V;
            cVar.f1774M = bVar.f1905W;
            cVar.f1771J = bVar.f1906X;
            cVar.f1772K = bVar.f1907Y;
            cVar.f1775N = bVar.f1908Z;
            cVar.f1776O = bVar.f1910a0;
            cVar.f1779R = bVar.f1885C;
            cVar.f1792c = bVar.f1921g;
            cVar.f1788a = bVar.f1917e;
            cVar.f1790b = bVar.f1919f;
            cVar.width = bVar.f1913c;
            cVar.height = bVar.f1915d;
            String str = bVar.f1922g0;
            if (str != null) {
                cVar.f1782U = str;
            }
            if (VERSION.SDK_INT >= 17) {
                cVar.setMarginStart(this.f1879d.f1891I);
                cVar.setMarginEnd(this.f1879d.f1890H);
            }
            cVar.mo2378b();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* compiled from: ConstraintSet */
    public static class C0427b {

        /* renamed from: k0 */
        private static SparseIntArray f1882k0 = new SparseIntArray();

        /* renamed from: A */
        public int f1883A = -1;

        /* renamed from: B */
        public int f1884B = -1;

        /* renamed from: C */
        public int f1885C = -1;

        /* renamed from: D */
        public int f1886D = -1;

        /* renamed from: E */
        public int f1887E = -1;

        /* renamed from: F */
        public int f1888F = -1;

        /* renamed from: G */
        public int f1889G = -1;

        /* renamed from: H */
        public int f1890H = -1;

        /* renamed from: I */
        public int f1891I = -1;

        /* renamed from: J */
        public int f1892J = -1;

        /* renamed from: K */
        public int f1893K = -1;

        /* renamed from: L */
        public int f1894L = -1;

        /* renamed from: M */
        public int f1895M = -1;

        /* renamed from: N */
        public int f1896N = -1;

        /* renamed from: O */
        public int f1897O = -1;

        /* renamed from: P */
        public float f1898P = -1.0f;

        /* renamed from: Q */
        public float f1899Q = -1.0f;

        /* renamed from: R */
        public int f1900R = 0;

        /* renamed from: S */
        public int f1901S = 0;

        /* renamed from: T */
        public int f1902T = 0;

        /* renamed from: U */
        public int f1903U = 0;

        /* renamed from: V */
        public int f1904V = -1;

        /* renamed from: W */
        public int f1905W = -1;

        /* renamed from: X */
        public int f1906X = -1;

        /* renamed from: Y */
        public int f1907Y = -1;

        /* renamed from: Z */
        public float f1908Z = 1.0f;

        /* renamed from: a */
        public boolean f1909a = false;

        /* renamed from: a0 */
        public float f1910a0 = 1.0f;

        /* renamed from: b */
        public boolean f1911b = false;

        /* renamed from: b0 */
        public int f1912b0 = -1;

        /* renamed from: c */
        public int f1913c;

        /* renamed from: c0 */
        public int f1914c0 = 0;

        /* renamed from: d */
        public int f1915d;

        /* renamed from: d0 */
        public int f1916d0 = -1;

        /* renamed from: e */
        public int f1917e = -1;

        /* renamed from: e0 */
        public int[] f1918e0;

        /* renamed from: f */
        public int f1919f = -1;

        /* renamed from: f0 */
        public String f1920f0;

        /* renamed from: g */
        public float f1921g = -1.0f;

        /* renamed from: g0 */
        public String f1922g0;

        /* renamed from: h */
        public int f1923h = -1;

        /* renamed from: h0 */
        public boolean f1924h0 = false;

        /* renamed from: i */
        public int f1925i = -1;

        /* renamed from: i0 */
        public boolean f1926i0 = false;

        /* renamed from: j */
        public int f1927j = -1;

        /* renamed from: j0 */
        public boolean f1928j0 = true;

        /* renamed from: k */
        public int f1929k = -1;

        /* renamed from: l */
        public int f1930l = -1;

        /* renamed from: m */
        public int f1931m = -1;

        /* renamed from: n */
        public int f1932n = -1;

        /* renamed from: o */
        public int f1933o = -1;

        /* renamed from: p */
        public int f1934p = -1;

        /* renamed from: q */
        public int f1935q = -1;

        /* renamed from: r */
        public int f1936r = -1;

        /* renamed from: s */
        public int f1937s = -1;

        /* renamed from: t */
        public int f1938t = -1;

        /* renamed from: u */
        public float f1939u = 0.5f;

        /* renamed from: v */
        public float f1940v = 0.5f;

        /* renamed from: w */
        public String f1941w = null;

        /* renamed from: x */
        public int f1942x = -1;

        /* renamed from: y */
        public int f1943y = 0;

        /* renamed from: z */
        public float f1944z = 0.0f;

        static {
            f1882k0.append(C0436i.Layout_layout_constraintLeft_toLeftOf, 24);
            f1882k0.append(C0436i.Layout_layout_constraintLeft_toRightOf, 25);
            f1882k0.append(C0436i.Layout_layout_constraintRight_toLeftOf, 28);
            f1882k0.append(C0436i.Layout_layout_constraintRight_toRightOf, 29);
            f1882k0.append(C0436i.Layout_layout_constraintTop_toTopOf, 35);
            f1882k0.append(C0436i.Layout_layout_constraintTop_toBottomOf, 34);
            f1882k0.append(C0436i.Layout_layout_constraintBottom_toTopOf, 4);
            f1882k0.append(C0436i.Layout_layout_constraintBottom_toBottomOf, 3);
            f1882k0.append(C0436i.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f1882k0.append(C0436i.Layout_layout_editor_absoluteX, 6);
            f1882k0.append(C0436i.Layout_layout_editor_absoluteY, 7);
            f1882k0.append(C0436i.Layout_layout_constraintGuide_begin, 17);
            f1882k0.append(C0436i.Layout_layout_constraintGuide_end, 18);
            f1882k0.append(C0436i.Layout_layout_constraintGuide_percent, 19);
            f1882k0.append(C0436i.Layout_android_orientation, 26);
            f1882k0.append(C0436i.Layout_layout_constraintStart_toEndOf, 31);
            f1882k0.append(C0436i.Layout_layout_constraintStart_toStartOf, 32);
            f1882k0.append(C0436i.Layout_layout_constraintEnd_toStartOf, 10);
            f1882k0.append(C0436i.Layout_layout_constraintEnd_toEndOf, 9);
            f1882k0.append(C0436i.Layout_layout_goneMarginLeft, 13);
            f1882k0.append(C0436i.Layout_layout_goneMarginTop, 16);
            f1882k0.append(C0436i.Layout_layout_goneMarginRight, 14);
            f1882k0.append(C0436i.Layout_layout_goneMarginBottom, 11);
            f1882k0.append(C0436i.Layout_layout_goneMarginStart, 15);
            f1882k0.append(C0436i.Layout_layout_goneMarginEnd, 12);
            f1882k0.append(C0436i.Layout_layout_constraintVertical_weight, 38);
            f1882k0.append(C0436i.Layout_layout_constraintHorizontal_weight, 37);
            f1882k0.append(C0436i.Layout_layout_constraintHorizontal_chainStyle, 39);
            f1882k0.append(C0436i.Layout_layout_constraintVertical_chainStyle, 40);
            f1882k0.append(C0436i.Layout_layout_constraintHorizontal_bias, 20);
            f1882k0.append(C0436i.Layout_layout_constraintVertical_bias, 36);
            f1882k0.append(C0436i.Layout_layout_constraintDimensionRatio, 5);
            f1882k0.append(C0436i.Layout_layout_constraintLeft_creator, 76);
            f1882k0.append(C0436i.Layout_layout_constraintTop_creator, 76);
            f1882k0.append(C0436i.Layout_layout_constraintRight_creator, 76);
            f1882k0.append(C0436i.Layout_layout_constraintBottom_creator, 76);
            f1882k0.append(C0436i.Layout_layout_constraintBaseline_creator, 76);
            f1882k0.append(C0436i.Layout_android_layout_marginLeft, 23);
            f1882k0.append(C0436i.Layout_android_layout_marginRight, 27);
            f1882k0.append(C0436i.Layout_android_layout_marginStart, 30);
            f1882k0.append(C0436i.Layout_android_layout_marginEnd, 8);
            f1882k0.append(C0436i.Layout_android_layout_marginTop, 33);
            f1882k0.append(C0436i.Layout_android_layout_marginBottom, 2);
            f1882k0.append(C0436i.Layout_android_layout_width, 22);
            f1882k0.append(C0436i.Layout_android_layout_height, 21);
            f1882k0.append(C0436i.Layout_layout_constraintCircle, 61);
            f1882k0.append(C0436i.Layout_layout_constraintCircleRadius, 62);
            f1882k0.append(C0436i.Layout_layout_constraintCircleAngle, 63);
            f1882k0.append(C0436i.Layout_layout_constraintWidth_percent, 69);
            f1882k0.append(C0436i.Layout_layout_constraintHeight_percent, 70);
            f1882k0.append(C0436i.Layout_chainUseRtl, 71);
            f1882k0.append(C0436i.Layout_barrierDirection, 72);
            f1882k0.append(C0436i.Layout_barrierMargin, 73);
            f1882k0.append(C0436i.Layout_constraint_referenced_ids, 74);
            f1882k0.append(C0436i.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo2438a(C0427b bVar) {
            this.f1909a = bVar.f1909a;
            this.f1913c = bVar.f1913c;
            this.f1911b = bVar.f1911b;
            this.f1915d = bVar.f1915d;
            this.f1917e = bVar.f1917e;
            this.f1919f = bVar.f1919f;
            this.f1921g = bVar.f1921g;
            this.f1923h = bVar.f1923h;
            this.f1925i = bVar.f1925i;
            this.f1927j = bVar.f1927j;
            this.f1929k = bVar.f1929k;
            this.f1930l = bVar.f1930l;
            this.f1931m = bVar.f1931m;
            this.f1932n = bVar.f1932n;
            this.f1933o = bVar.f1933o;
            this.f1934p = bVar.f1934p;
            this.f1935q = bVar.f1935q;
            this.f1936r = bVar.f1936r;
            this.f1937s = bVar.f1937s;
            this.f1938t = bVar.f1938t;
            this.f1939u = bVar.f1939u;
            this.f1940v = bVar.f1940v;
            this.f1941w = bVar.f1941w;
            this.f1942x = bVar.f1942x;
            this.f1943y = bVar.f1943y;
            this.f1944z = bVar.f1944z;
            this.f1883A = bVar.f1883A;
            this.f1884B = bVar.f1884B;
            this.f1885C = bVar.f1885C;
            this.f1886D = bVar.f1886D;
            this.f1887E = bVar.f1887E;
            this.f1888F = bVar.f1888F;
            this.f1889G = bVar.f1889G;
            this.f1890H = bVar.f1890H;
            this.f1891I = bVar.f1891I;
            this.f1892J = bVar.f1892J;
            this.f1893K = bVar.f1893K;
            this.f1894L = bVar.f1894L;
            this.f1895M = bVar.f1895M;
            this.f1896N = bVar.f1896N;
            this.f1897O = bVar.f1897O;
            this.f1898P = bVar.f1898P;
            this.f1899Q = bVar.f1899Q;
            this.f1900R = bVar.f1900R;
            this.f1901S = bVar.f1901S;
            this.f1902T = bVar.f1902T;
            this.f1903U = bVar.f1903U;
            this.f1904V = bVar.f1904V;
            this.f1905W = bVar.f1905W;
            this.f1906X = bVar.f1906X;
            this.f1907Y = bVar.f1907Y;
            this.f1908Z = bVar.f1908Z;
            this.f1910a0 = bVar.f1910a0;
            this.f1912b0 = bVar.f1912b0;
            this.f1914c0 = bVar.f1914c0;
            this.f1916d0 = bVar.f1916d0;
            this.f1922g0 = bVar.f1922g0;
            int[] iArr = bVar.f1918e0;
            if (iArr != null) {
                this.f1918e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1918e0 = null;
            }
            this.f1920f0 = bVar.f1920f0;
            this.f1924h0 = bVar.f1924h0;
            this.f1926i0 = bVar.f1926i0;
            this.f1928j0 = bVar.f1928j0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2437a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.Layout);
            this.f1911b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1882k0.get(index);
                switch (i2) {
                    case 1:
                        this.f1934p = C0425d.m2308b(obtainStyledAttributes, index, this.f1934p);
                        break;
                    case 2:
                        this.f1889G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1889G);
                        break;
                    case 3:
                        this.f1933o = C0425d.m2308b(obtainStyledAttributes, index, this.f1933o);
                        break;
                    case 4:
                        this.f1932n = C0425d.m2308b(obtainStyledAttributes, index, this.f1932n);
                        break;
                    case 5:
                        this.f1941w = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f1883A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1883A);
                        break;
                    case 7:
                        this.f1884B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1884B);
                        break;
                    case 8:
                        this.f1890H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1890H);
                        break;
                    case 9:
                        this.f1938t = C0425d.m2308b(obtainStyledAttributes, index, this.f1938t);
                        break;
                    case 10:
                        this.f1937s = C0425d.m2308b(obtainStyledAttributes, index, this.f1937s);
                        break;
                    case 11:
                        this.f1895M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1895M);
                        break;
                    case 12:
                        this.f1896N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1896N);
                        break;
                    case 13:
                        this.f1892J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1892J);
                        break;
                    case 14:
                        this.f1894L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1894L);
                        break;
                    case 15:
                        this.f1897O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1897O);
                        break;
                    case 16:
                        this.f1893K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1893K);
                        break;
                    case 17:
                        this.f1917e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1917e);
                        break;
                    case 18:
                        this.f1919f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1919f);
                        break;
                    case 19:
                        this.f1921g = obtainStyledAttributes.getFloat(index, this.f1921g);
                        break;
                    case 20:
                        this.f1939u = obtainStyledAttributes.getFloat(index, this.f1939u);
                        break;
                    case 21:
                        this.f1915d = obtainStyledAttributes.getLayoutDimension(index, this.f1915d);
                        break;
                    case 22:
                        this.f1913c = obtainStyledAttributes.getLayoutDimension(index, this.f1913c);
                        break;
                    case 23:
                        this.f1886D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1886D);
                        break;
                    case 24:
                        this.f1923h = C0425d.m2308b(obtainStyledAttributes, index, this.f1923h);
                        break;
                    case 25:
                        this.f1925i = C0425d.m2308b(obtainStyledAttributes, index, this.f1925i);
                        break;
                    case 26:
                        this.f1885C = obtainStyledAttributes.getInt(index, this.f1885C);
                        break;
                    case 27:
                        this.f1887E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1887E);
                        break;
                    case 28:
                        this.f1927j = C0425d.m2308b(obtainStyledAttributes, index, this.f1927j);
                        break;
                    case 29:
                        this.f1929k = C0425d.m2308b(obtainStyledAttributes, index, this.f1929k);
                        break;
                    case 30:
                        this.f1891I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1891I);
                        break;
                    case 31:
                        this.f1935q = C0425d.m2308b(obtainStyledAttributes, index, this.f1935q);
                        break;
                    case 32:
                        this.f1936r = C0425d.m2308b(obtainStyledAttributes, index, this.f1936r);
                        break;
                    case 33:
                        this.f1888F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1888F);
                        break;
                    case 34:
                        this.f1931m = C0425d.m2308b(obtainStyledAttributes, index, this.f1931m);
                        break;
                    case 35:
                        this.f1930l = C0425d.m2308b(obtainStyledAttributes, index, this.f1930l);
                        break;
                    case 36:
                        this.f1940v = obtainStyledAttributes.getFloat(index, this.f1940v);
                        break;
                    case 37:
                        this.f1899Q = obtainStyledAttributes.getFloat(index, this.f1899Q);
                        break;
                    case 38:
                        this.f1898P = obtainStyledAttributes.getFloat(index, this.f1898P);
                        break;
                    case 39:
                        this.f1900R = obtainStyledAttributes.getInt(index, this.f1900R);
                        break;
                    case 40:
                        this.f1901S = obtainStyledAttributes.getInt(index, this.f1901S);
                        break;
                    default:
                        switch (i2) {
                            case 56:
                                this.f1904V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1904V);
                                break;
                            case 57:
                                this.f1905W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1905W);
                                break;
                            case 58:
                                this.f1906X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1906X);
                                break;
                            case 59:
                                this.f1907Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1907Y);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f1942x = C0425d.m2308b(obtainStyledAttributes, index, this.f1942x);
                                        break;
                                    case 62:
                                        this.f1943y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1943y);
                                        break;
                                    case 63:
                                        this.f1944z = obtainStyledAttributes.getFloat(index, this.f1944z);
                                        break;
                                    default:
                                        String str = "   ";
                                        String str2 = "ConstraintSet";
                                        switch (i2) {
                                            case 69:
                                                this.f1908Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.f1910a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e(str2, "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.f1912b0 = obtainStyledAttributes.getInt(index, this.f1912b0);
                                                continue;
                                            case 73:
                                                this.f1914c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1914c0);
                                                continue;
                                            case 74:
                                                this.f1920f0 = obtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.f1928j0 = obtainStyledAttributes.getBoolean(index, this.f1928j0);
                                                continue;
                                            case 76:
                                                break;
                                            case 77:
                                                this.f1922g0 = obtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Unknown attribute 0x");
                                                sb.append(Integer.toHexString(index));
                                                sb.append(str);
                                                sb.append(f1882k0.get(index));
                                                Log.w(str2, sb.toString());
                                                continue;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("unused attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append(str);
                                        sb2.append(f1882k0.get(index));
                                        Log.w(str2, sb2.toString());
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* compiled from: ConstraintSet */
    public static class C0428c {

        /* renamed from: h */
        private static SparseIntArray f1945h = new SparseIntArray();

        /* renamed from: a */
        public boolean f1946a = false;

        /* renamed from: b */
        public int f1947b = -1;

        /* renamed from: c */
        public String f1948c = null;

        /* renamed from: d */
        public int f1949d = -1;

        /* renamed from: e */
        public int f1950e = 0;

        /* renamed from: f */
        public float f1951f = Float.NaN;

        /* renamed from: g */
        public float f1952g = Float.NaN;

        static {
            f1945h.append(C0436i.Motion_motionPathRotate, 1);
            f1945h.append(C0436i.Motion_pathMotionArc, 2);
            f1945h.append(C0436i.Motion_transitionEasing, 3);
            f1945h.append(C0436i.Motion_drawPath, 4);
            f1945h.append(C0436i.Motion_animate_relativeTo, 5);
            f1945h.append(C0436i.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public void mo2440a(C0428c cVar) {
            this.f1946a = cVar.f1946a;
            this.f1947b = cVar.f1947b;
            this.f1948c = cVar.f1948c;
            this.f1949d = cVar.f1949d;
            this.f1950e = cVar.f1950e;
            this.f1952g = cVar.f1952g;
            this.f1951f = cVar.f1951f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2439a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.Motion);
            this.f1946a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1945h.get(index)) {
                    case 1:
                        this.f1952g = obtainStyledAttributes.getFloat(index, this.f1952g);
                        break;
                    case 2:
                        this.f1949d = obtainStyledAttributes.getInt(index, this.f1949d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f1948c = C3947c.f9797c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f1948c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f1950e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1947b = C0425d.m2308b(obtainStyledAttributes, index, this.f1947b);
                        break;
                    case 6:
                        this.f1951f = obtainStyledAttributes.getFloat(index, this.f1951f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* compiled from: ConstraintSet */
    public static class C0429d {

        /* renamed from: a */
        public boolean f1953a = false;

        /* renamed from: b */
        public int f1954b = 0;

        /* renamed from: c */
        public int f1955c = 0;

        /* renamed from: d */
        public float f1956d = 1.0f;

        /* renamed from: e */
        public float f1957e = Float.NaN;

        /* renamed from: a */
        public void mo2442a(C0429d dVar) {
            this.f1953a = dVar.f1953a;
            this.f1954b = dVar.f1954b;
            this.f1956d = dVar.f1956d;
            this.f1957e = dVar.f1957e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2441a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.PropertySet);
            this.f1953a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.PropertySet_android_alpha) {
                    this.f1956d = obtainStyledAttributes.getFloat(index, this.f1956d);
                } else if (index == C0436i.PropertySet_android_visibility) {
                    this.f1954b = obtainStyledAttributes.getInt(index, this.f1954b);
                    this.f1954b = C0425d.f1871d[this.f1954b];
                } else if (index == C0436i.PropertySet_visibilityMode) {
                    this.f1955c = obtainStyledAttributes.getInt(index, this.f1955c);
                } else if (index == C0436i.PropertySet_motionProgress) {
                    this.f1957e = obtainStyledAttributes.getFloat(index, this.f1957e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* compiled from: ConstraintSet */
    public static class C0430e {

        /* renamed from: n */
        private static SparseIntArray f1958n = new SparseIntArray();

        /* renamed from: a */
        public boolean f1959a = false;

        /* renamed from: b */
        public float f1960b = 0.0f;

        /* renamed from: c */
        public float f1961c = 0.0f;

        /* renamed from: d */
        public float f1962d = 0.0f;

        /* renamed from: e */
        public float f1963e = 1.0f;

        /* renamed from: f */
        public float f1964f = 1.0f;

        /* renamed from: g */
        public float f1965g = Float.NaN;

        /* renamed from: h */
        public float f1966h = Float.NaN;

        /* renamed from: i */
        public float f1967i = 0.0f;

        /* renamed from: j */
        public float f1968j = 0.0f;

        /* renamed from: k */
        public float f1969k = 0.0f;

        /* renamed from: l */
        public boolean f1970l = false;

        /* renamed from: m */
        public float f1971m = 0.0f;

        static {
            f1958n.append(C0436i.Transform_android_rotation, 1);
            f1958n.append(C0436i.Transform_android_rotationX, 2);
            f1958n.append(C0436i.Transform_android_rotationY, 3);
            f1958n.append(C0436i.Transform_android_scaleX, 4);
            f1958n.append(C0436i.Transform_android_scaleY, 5);
            f1958n.append(C0436i.Transform_android_transformPivotX, 6);
            f1958n.append(C0436i.Transform_android_transformPivotY, 7);
            f1958n.append(C0436i.Transform_android_translationX, 8);
            f1958n.append(C0436i.Transform_android_translationY, 9);
            f1958n.append(C0436i.Transform_android_translationZ, 10);
            f1958n.append(C0436i.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public void mo2444a(C0430e eVar) {
            this.f1960b = eVar.f1960b;
            this.f1961c = eVar.f1961c;
            this.f1962d = eVar.f1962d;
            this.f1963e = eVar.f1963e;
            this.f1964f = eVar.f1964f;
            this.f1965g = eVar.f1965g;
            this.f1966h = eVar.f1966h;
            this.f1967i = eVar.f1967i;
            this.f1968j = eVar.f1968j;
            this.f1969k = eVar.f1969k;
            this.f1970l = eVar.f1970l;
            this.f1971m = eVar.f1971m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2443a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.Transform);
            this.f1959a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1958n.get(index)) {
                    case 1:
                        this.f1960b = obtainStyledAttributes.getFloat(index, this.f1960b);
                        break;
                    case 2:
                        this.f1961c = obtainStyledAttributes.getFloat(index, this.f1961c);
                        break;
                    case 3:
                        this.f1962d = obtainStyledAttributes.getFloat(index, this.f1962d);
                        break;
                    case 4:
                        this.f1963e = obtainStyledAttributes.getFloat(index, this.f1963e);
                        break;
                    case 5:
                        this.f1964f = obtainStyledAttributes.getFloat(index, this.f1964f);
                        break;
                    case 6:
                        this.f1965g = obtainStyledAttributes.getFloat(index, this.f1965g);
                        break;
                    case 7:
                        this.f1966h = obtainStyledAttributes.getFloat(index, this.f1966h);
                        break;
                    case 8:
                        this.f1967i = obtainStyledAttributes.getDimension(index, this.f1967i);
                        break;
                    case 9:
                        this.f1968j = obtainStyledAttributes.getDimension(index, this.f1968j);
                        break;
                    case 10:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1969k = obtainStyledAttributes.getDimension(index, this.f1969k);
                            break;
                        }
                    case 11:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1970l = true;
                            this.f1971m = obtainStyledAttributes.getDimension(index, this.f1971m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1872e.append(C0436i.Constraint_layout_constraintLeft_toLeftOf, 25);
        f1872e.append(C0436i.Constraint_layout_constraintLeft_toRightOf, 26);
        f1872e.append(C0436i.Constraint_layout_constraintRight_toLeftOf, 29);
        f1872e.append(C0436i.Constraint_layout_constraintRight_toRightOf, 30);
        f1872e.append(C0436i.Constraint_layout_constraintTop_toTopOf, 36);
        f1872e.append(C0436i.Constraint_layout_constraintTop_toBottomOf, 35);
        f1872e.append(C0436i.Constraint_layout_constraintBottom_toTopOf, 4);
        f1872e.append(C0436i.Constraint_layout_constraintBottom_toBottomOf, 3);
        f1872e.append(C0436i.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f1872e.append(C0436i.Constraint_layout_editor_absoluteX, 6);
        f1872e.append(C0436i.Constraint_layout_editor_absoluteY, 7);
        f1872e.append(C0436i.Constraint_layout_constraintGuide_begin, 17);
        f1872e.append(C0436i.Constraint_layout_constraintGuide_end, 18);
        f1872e.append(C0436i.Constraint_layout_constraintGuide_percent, 19);
        f1872e.append(C0436i.Constraint_android_orientation, 27);
        f1872e.append(C0436i.Constraint_layout_constraintStart_toEndOf, 32);
        f1872e.append(C0436i.Constraint_layout_constraintStart_toStartOf, 33);
        f1872e.append(C0436i.Constraint_layout_constraintEnd_toStartOf, 10);
        f1872e.append(C0436i.Constraint_layout_constraintEnd_toEndOf, 9);
        f1872e.append(C0436i.Constraint_layout_goneMarginLeft, 13);
        f1872e.append(C0436i.Constraint_layout_goneMarginTop, 16);
        f1872e.append(C0436i.Constraint_layout_goneMarginRight, 14);
        f1872e.append(C0436i.Constraint_layout_goneMarginBottom, 11);
        f1872e.append(C0436i.Constraint_layout_goneMarginStart, 15);
        f1872e.append(C0436i.Constraint_layout_goneMarginEnd, 12);
        f1872e.append(C0436i.Constraint_layout_constraintVertical_weight, 40);
        f1872e.append(C0436i.Constraint_layout_constraintHorizontal_weight, 39);
        f1872e.append(C0436i.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f1872e.append(C0436i.Constraint_layout_constraintVertical_chainStyle, 42);
        f1872e.append(C0436i.Constraint_layout_constraintHorizontal_bias, 20);
        f1872e.append(C0436i.Constraint_layout_constraintVertical_bias, 37);
        f1872e.append(C0436i.Constraint_layout_constraintDimensionRatio, 5);
        f1872e.append(C0436i.Constraint_layout_constraintLeft_creator, 80);
        f1872e.append(C0436i.Constraint_layout_constraintTop_creator, 80);
        f1872e.append(C0436i.Constraint_layout_constraintRight_creator, 80);
        f1872e.append(C0436i.Constraint_layout_constraintBottom_creator, 80);
        f1872e.append(C0436i.Constraint_layout_constraintBaseline_creator, 80);
        f1872e.append(C0436i.Constraint_android_layout_marginLeft, 24);
        f1872e.append(C0436i.Constraint_android_layout_marginRight, 28);
        f1872e.append(C0436i.Constraint_android_layout_marginStart, 31);
        f1872e.append(C0436i.Constraint_android_layout_marginEnd, 8);
        f1872e.append(C0436i.Constraint_android_layout_marginTop, 34);
        f1872e.append(C0436i.Constraint_android_layout_marginBottom, 2);
        f1872e.append(C0436i.Constraint_android_layout_width, 23);
        f1872e.append(C0436i.Constraint_android_layout_height, 21);
        f1872e.append(C0436i.Constraint_android_visibility, 22);
        f1872e.append(C0436i.Constraint_android_alpha, 43);
        f1872e.append(C0436i.Constraint_android_elevation, 44);
        f1872e.append(C0436i.Constraint_android_rotationX, 45);
        f1872e.append(C0436i.Constraint_android_rotationY, 46);
        f1872e.append(C0436i.Constraint_android_rotation, 60);
        f1872e.append(C0436i.Constraint_android_scaleX, 47);
        f1872e.append(C0436i.Constraint_android_scaleY, 48);
        f1872e.append(C0436i.Constraint_android_transformPivotX, 49);
        f1872e.append(C0436i.Constraint_android_transformPivotY, 50);
        f1872e.append(C0436i.Constraint_android_translationX, 51);
        f1872e.append(C0436i.Constraint_android_translationY, 52);
        f1872e.append(C0436i.Constraint_android_translationZ, 53);
        f1872e.append(C0436i.Constraint_layout_constraintWidth_default, 54);
        f1872e.append(C0436i.Constraint_layout_constraintHeight_default, 55);
        f1872e.append(C0436i.Constraint_layout_constraintWidth_max, 56);
        f1872e.append(C0436i.Constraint_layout_constraintHeight_max, 57);
        f1872e.append(C0436i.Constraint_layout_constraintWidth_min, 58);
        f1872e.append(C0436i.Constraint_layout_constraintHeight_min, 59);
        f1872e.append(C0436i.Constraint_layout_constraintCircle, 61);
        f1872e.append(C0436i.Constraint_layout_constraintCircleRadius, 62);
        f1872e.append(C0436i.Constraint_layout_constraintCircleAngle, 63);
        f1872e.append(C0436i.Constraint_animate_relativeTo, 64);
        f1872e.append(C0436i.Constraint_transitionEasing, 65);
        f1872e.append(C0436i.Constraint_drawPath, 66);
        f1872e.append(C0436i.Constraint_transitionPathRotate, 67);
        f1872e.append(C0436i.Constraint_motionStagger, 79);
        f1872e.append(C0436i.Constraint_android_id, 38);
        f1872e.append(C0436i.Constraint_progress, 68);
        f1872e.append(C0436i.Constraint_layout_constraintWidth_percent, 69);
        f1872e.append(C0436i.Constraint_layout_constraintHeight_percent, 70);
        f1872e.append(C0436i.Constraint_chainUseRtl, 71);
        f1872e.append(C0436i.Constraint_barrierDirection, 72);
        f1872e.append(C0436i.Constraint_barrierMargin, 73);
        f1872e.append(C0436i.Constraint_constraint_referenced_ids, 74);
        f1872e.append(C0436i.Constraint_barrierAllowsGoneWidgets, 75);
        f1872e.append(C0436i.Constraint_pathMotionArc, 76);
        f1872e.append(C0436i.Constraint_layout_constraintTag, 77);
        f1872e.append(C0436i.Constraint_visibilityMode, 78);
    }

    /* renamed from: f */
    private C0426a m2309f(int i) {
        if (!this.f1875c.containsKey(Integer.valueOf(i))) {
            this.f1875c.put(Integer.valueOf(i), new C0426a());
        }
        return (C0426a) this.f1875c.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    private String m2310g(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: b */
    public C0426a mo2424b(int i) {
        return m2309f(i);
    }

    /* renamed from: c */
    public void mo2430c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1875c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0415c cVar = (C0415c) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1874b || id != -1) {
                if (!this.f1875c.containsKey(Integer.valueOf(id))) {
                    this.f1875c.put(Integer.valueOf(id), new C0426a());
                }
                C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(id));
                aVar.f1881f = C0418a.m2275a(this.f1873a, childAt);
                aVar.m2336a(id, cVar);
                aVar.f1877b.f1954b = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.f1877b.f1956d = childAt.getAlpha();
                    aVar.f1880e.f1960b = childAt.getRotation();
                    aVar.f1880e.f1961c = childAt.getRotationX();
                    aVar.f1880e.f1962d = childAt.getRotationY();
                    aVar.f1880e.f1963e = childAt.getScaleX();
                    aVar.f1880e.f1964f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0430e eVar = aVar.f1880e;
                        eVar.f1965g = pivotX;
                        eVar.f1966h = pivotY;
                    }
                    aVar.f1880e.f1967i = childAt.getTranslationX();
                    aVar.f1880e.f1968j = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.f1880e.f1969k = childAt.getTranslationZ();
                        C0430e eVar2 = aVar.f1880e;
                        if (eVar2.f1970l) {
                            eVar2.f1971m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1879d.f1928j0 = barrier.mo2342b();
                    aVar.f1879d.f1918e0 = barrier.getReferencedIds();
                    aVar.f1879d.f1912b0 = barrier.getType();
                    aVar.f1879d.f1914c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo2433d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0415c cVar = (C0415c) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1874b || id != -1) {
                if (!this.f1875c.containsKey(Integer.valueOf(id))) {
                    this.f1875c.put(Integer.valueOf(id), new C0426a());
                }
                C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(id));
                if (!aVar.f1879d.f1911b) {
                    aVar.m2336a(id, cVar);
                    if (childAt instanceof C0421b) {
                        aVar.f1879d.f1918e0 = ((C0421b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f1879d.f1928j0 = barrier.mo2342b();
                            aVar.f1879d.f1912b0 = barrier.getType();
                            aVar.f1879d.f1914c0 = barrier.getMargin();
                        }
                    }
                    aVar.f1879d.f1911b = true;
                }
                C0429d dVar = aVar.f1877b;
                if (!dVar.f1953a) {
                    dVar.f1954b = childAt.getVisibility();
                    aVar.f1877b.f1956d = childAt.getAlpha();
                    aVar.f1877b.f1953a = true;
                }
                if (VERSION.SDK_INT >= 17) {
                    C0430e eVar = aVar.f1880e;
                    if (!eVar.f1959a) {
                        eVar.f1959a = true;
                        eVar.f1960b = childAt.getRotation();
                        aVar.f1880e.f1961c = childAt.getRotationX();
                        aVar.f1880e.f1962d = childAt.getRotationY();
                        aVar.f1880e.f1963e = childAt.getScaleX();
                        aVar.f1880e.f1964f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0430e eVar2 = aVar.f1880e;
                            eVar2.f1965g = pivotX;
                            eVar2.f1966h = pivotY;
                        }
                        aVar.f1880e.f1967i = childAt.getTranslationX();
                        aVar.f1880e.f1968j = childAt.getTranslationY();
                        if (VERSION.SDK_INT >= 21) {
                            aVar.f1880e.f1969k = childAt.getTranslationZ();
                            C0430e eVar3 = aVar.f1880e;
                            if (eVar3.f1970l) {
                                eVar3.f1971m = childAt.getElevation();
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: e */
    public int mo2434e(int i) {
        return m2309f(i).f1879d.f1913c;
    }

    /* renamed from: b */
    public void mo2427b(ConstraintLayout constraintLayout) {
        mo2419a(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: a */
    public void mo2421a(C0425d dVar) {
        for (Integer num : dVar.f1875c.keySet()) {
            int intValue = num.intValue();
            C0426a aVar = (C0426a) dVar.f1875c.get(num);
            if (!this.f1875c.containsKey(Integer.valueOf(intValue))) {
                this.f1875c.put(Integer.valueOf(intValue), new C0426a());
            }
            C0426a aVar2 = (C0426a) this.f1875c.get(Integer.valueOf(intValue));
            C0427b bVar = aVar2.f1879d;
            if (!bVar.f1911b) {
                bVar.mo2438a(aVar.f1879d);
            }
            C0429d dVar2 = aVar2.f1877b;
            if (!dVar2.f1953a) {
                dVar2.mo2442a(aVar.f1877b);
            }
            C0430e eVar = aVar2.f1880e;
            if (!eVar.f1959a) {
                eVar.mo2444a(aVar.f1880e);
            }
            C0428c cVar = aVar2.f1878c;
            if (!cVar.f1946a) {
                cVar.mo2440a(aVar.f1878c);
            }
        }
    }

    /* renamed from: b */
    public void mo2425b(int i, int i2) {
        m2309f(i).f1879d.f1915d = i2;
    }

    /* renamed from: b */
    public void mo2426b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0426a a = m2304a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f1879d.f1909a = true;
                    }
                    this.f1875c.put(Integer.valueOf(a.f1876a), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m2308b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public void mo2416a(Context context, int i) {
        mo2430c((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    /* renamed from: a */
    public void mo2422a(C0431e eVar) {
        int childCount = eVar.getChildCount();
        this.f1875c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0432a aVar = (C0432a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1874b || id != -1) {
                if (!this.f1875c.containsKey(Integer.valueOf(id))) {
                    this.f1875c.put(Integer.valueOf(id), new C0426a());
                }
                C0426a aVar2 = (C0426a) this.f1875c.get(Integer.valueOf(id));
                if (childAt instanceof C0421b) {
                    aVar2.m2338a((C0421b) childAt, id, aVar);
                }
                aVar2.m2337a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo2418a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1875c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C0319b.m1806a(childAt));
                Log.v("ConstraintSet", sb.toString());
            } else if (this.f1874b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f1875c.containsKey(Integer.valueOf(id))) {
                C0418a.m2277a(childAt, ((C0426a) this.f1875c.get(Integer.valueOf(id))).f1881f);
            }
        }
    }

    /* renamed from: c */
    public int mo2428c(int i) {
        return m2309f(i).f1877b.f1954b;
    }

    /* renamed from: c */
    public void mo2429c(int i, int i2) {
        m2309f(i).f1879d.f1913c = i2;
    }

    /* renamed from: a */
    public void mo2420a(C0421b bVar, C3973f fVar, C0415c cVar, SparseArray<C3973f> sparseArray) {
        int id = bVar.getId();
        if (this.f1875c.containsKey(Integer.valueOf(id))) {
            C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(id));
            if (fVar instanceof C3983l) {
                bVar.mo2110a(aVar, (C3983l) fVar, cVar, sparseArray);
            }
        }
    }

    /* renamed from: d */
    public void mo2432d(int i, int i2) {
        m2309f(i).f1877b.f1954b = i2;
    }

    /* renamed from: d */
    public int mo2431d(int i) {
        return m2309f(i).f1877b.f1955c;
    }

    /* renamed from: a */
    public void mo2415a(int i, C0415c cVar) {
        if (this.f1875c.containsKey(Integer.valueOf(i))) {
            ((C0426a) this.f1875c.get(Integer.valueOf(i))).mo2435a(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2419a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1875c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            String str = "ConstraintSet";
            if (!this.f1875c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C0319b.m1806a(childAt));
                Log.w(str, sb.toString());
            } else if (this.f1874b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1875c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1879d.f1916d0 = 1;
                    }
                    int i2 = aVar.f1879d.f1916d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1879d.f1912b0);
                        barrier.setMargin(aVar.f1879d.f1914c0);
                        barrier.setAllowsGoneWidget(aVar.f1879d.f1928j0);
                        C0427b bVar = aVar.f1879d;
                        int[] iArr = bVar.f1918e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = bVar.f1920f0;
                            if (str2 != null) {
                                bVar.f1918e0 = m2307a((View) barrier, str2);
                                barrier.setReferencedIds(aVar.f1879d.f1918e0);
                            }
                        }
                    }
                    C0415c cVar = (C0415c) childAt.getLayoutParams();
                    cVar.mo2378b();
                    aVar.mo2435a(cVar);
                    if (z) {
                        C0418a.m2277a(childAt, aVar.f1881f);
                    }
                    childAt.setLayoutParams(cVar);
                    C0429d dVar = aVar.f1877b;
                    if (dVar.f1955c == 0) {
                        childAt.setVisibility(dVar.f1954b);
                    }
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f1877b.f1956d);
                        childAt.setRotation(aVar.f1880e.f1960b);
                        childAt.setRotationX(aVar.f1880e.f1961c);
                        childAt.setRotationY(aVar.f1880e.f1962d);
                        childAt.setScaleX(aVar.f1880e.f1963e);
                        childAt.setScaleY(aVar.f1880e.f1964f);
                        if (!Float.isNaN(aVar.f1880e.f1965g)) {
                            childAt.setPivotX(aVar.f1880e.f1965g);
                        }
                        if (!Float.isNaN(aVar.f1880e.f1966h)) {
                            childAt.setPivotY(aVar.f1880e.f1966h);
                        }
                        childAt.setTranslationX(aVar.f1880e.f1967i);
                        childAt.setTranslationY(aVar.f1880e.f1968j);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f1880e.f1969k);
                            C0430e eVar = aVar.f1880e;
                            if (eVar.f1970l) {
                                childAt.setElevation(eVar.f1971m);
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                    Log.v(str, sb2.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0426a aVar2 = (C0426a) this.f1875c.get(num);
            int i3 = aVar2.f1879d.f1916d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0427b bVar2 = aVar2.f1879d;
                int[] iArr2 = bVar2.f1918e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar2.f1920f0;
                    if (str3 != null) {
                        bVar2.f1918e0 = m2307a((View) barrier2, str3);
                        barrier2.setReferencedIds(aVar2.f1879d.f1918e0);
                    }
                }
                barrier2.setType(aVar2.f1879d.f1912b0);
                barrier2.setMargin(aVar2.f1879d.f1914c0);
                C0415c generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2398a();
                aVar2.mo2435a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f1879d.f1909a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0415c generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2435a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo2414a(int i, int i2, int i3, int i4, int i5) {
        if (!this.f1875c.containsKey(Integer.valueOf(i))) {
            this.f1875c.put(Integer.valueOf(i), new C0426a());
        }
        C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0427b bVar = aVar.f1879d;
                    bVar.f1923h = i3;
                    bVar.f1925i = -1;
                } else if (i4 == 2) {
                    C0427b bVar2 = aVar.f1879d;
                    bVar2.f1925i = i3;
                    bVar2.f1923h = -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Left to ");
                    sb.append(m2310g(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
                aVar.f1879d.f1886D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C0427b bVar3 = aVar.f1879d;
                    bVar3.f1927j = i3;
                    bVar3.f1929k = -1;
                } else if (i4 == 2) {
                    C0427b bVar4 = aVar.f1879d;
                    bVar4.f1929k = i3;
                    bVar4.f1927j = -1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m2310g(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                aVar.f1879d.f1887E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C0427b bVar5 = aVar.f1879d;
                    bVar5.f1930l = i3;
                    bVar5.f1931m = -1;
                    bVar5.f1934p = -1;
                } else if (i4 == 4) {
                    C0427b bVar6 = aVar.f1879d;
                    bVar6.f1931m = i3;
                    bVar6.f1930l = -1;
                    bVar6.f1934p = -1;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m2310g(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
                aVar.f1879d.f1888F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C0427b bVar7 = aVar.f1879d;
                    bVar7.f1933o = i3;
                    bVar7.f1932n = -1;
                    bVar7.f1934p = -1;
                } else if (i4 == 3) {
                    C0427b bVar8 = aVar.f1879d;
                    bVar8.f1932n = i3;
                    bVar8.f1933o = -1;
                    bVar8.f1934p = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m2310g(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
                aVar.f1879d.f1889G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    C0427b bVar9 = aVar.f1879d;
                    bVar9.f1934p = i3;
                    bVar9.f1933o = -1;
                    bVar9.f1932n = -1;
                    bVar9.f1930l = -1;
                    bVar9.f1931m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(m2310g(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    C0427b bVar10 = aVar.f1879d;
                    bVar10.f1936r = i3;
                    bVar10.f1935q = -1;
                } else if (i4 == 7) {
                    C0427b bVar11 = aVar.f1879d;
                    bVar11.f1935q = i3;
                    bVar11.f1936r = -1;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(m2310g(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
                aVar.f1879d.f1891I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C0427b bVar12 = aVar.f1879d;
                    bVar12.f1938t = i3;
                    bVar12.f1937s = -1;
                } else if (i4 == 6) {
                    C0427b bVar13 = aVar.f1879d;
                    bVar13.f1937s = i3;
                    bVar13.f1938t = -1;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(m2310g(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
                aVar.f1879d.f1890H = i5;
                return;
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m2310g(i2));
                sb8.append(" to ");
                sb8.append(m2310g(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    /* renamed from: a */
    public void mo2413a(int i, int i2, int i3, int i4) {
        if (!this.f1875c.containsKey(Integer.valueOf(i))) {
            this.f1875c.put(Integer.valueOf(i), new C0426a());
        }
        C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0427b bVar = aVar.f1879d;
                    bVar.f1923h = i3;
                    bVar.f1925i = -1;
                    return;
                } else if (i4 == 2) {
                    C0427b bVar2 = aVar.f1879d;
                    bVar2.f1925i = i3;
                    bVar2.f1923h = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("left to ");
                    sb.append(m2310g(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    C0427b bVar3 = aVar.f1879d;
                    bVar3.f1927j = i3;
                    bVar3.f1929k = -1;
                    return;
                } else if (i4 == 2) {
                    C0427b bVar4 = aVar.f1879d;
                    bVar4.f1929k = i3;
                    bVar4.f1927j = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m2310g(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    C0427b bVar5 = aVar.f1879d;
                    bVar5.f1930l = i3;
                    bVar5.f1931m = -1;
                    bVar5.f1934p = -1;
                    return;
                } else if (i4 == 4) {
                    C0427b bVar6 = aVar.f1879d;
                    bVar6.f1931m = i3;
                    bVar6.f1930l = -1;
                    bVar6.f1934p = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m2310g(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    C0427b bVar7 = aVar.f1879d;
                    bVar7.f1933o = i3;
                    bVar7.f1932n = -1;
                    bVar7.f1934p = -1;
                    return;
                } else if (i4 == 3) {
                    C0427b bVar8 = aVar.f1879d;
                    bVar8.f1932n = i3;
                    bVar8.f1933o = -1;
                    bVar8.f1934p = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m2310g(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    C0427b bVar9 = aVar.f1879d;
                    bVar9.f1934p = i3;
                    bVar9.f1933o = -1;
                    bVar9.f1932n = -1;
                    bVar9.f1930l = -1;
                    bVar9.f1931m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(m2310g(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    C0427b bVar10 = aVar.f1879d;
                    bVar10.f1936r = i3;
                    bVar10.f1935q = -1;
                    return;
                } else if (i4 == 7) {
                    C0427b bVar11 = aVar.f1879d;
                    bVar11.f1935q = i3;
                    bVar11.f1936r = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(m2310g(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    C0427b bVar12 = aVar.f1879d;
                    bVar12.f1938t = i3;
                    bVar12.f1937s = -1;
                    return;
                } else if (i4 == 6) {
                    C0427b bVar13 = aVar.f1879d;
                    bVar13.f1937s = i3;
                    bVar13.f1938t = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(m2310g(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m2310g(i2));
                sb8.append(" to ");
                sb8.append(m2310g(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    /* renamed from: a */
    public void mo2411a(int i, int i2) {
        if (this.f1875c.containsKey(Integer.valueOf(i))) {
            C0426a aVar = (C0426a) this.f1875c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0427b bVar = aVar.f1879d;
                    bVar.f1925i = -1;
                    bVar.f1923h = -1;
                    bVar.f1886D = -1;
                    bVar.f1892J = -1;
                    return;
                case 2:
                    C0427b bVar2 = aVar.f1879d;
                    bVar2.f1929k = -1;
                    bVar2.f1927j = -1;
                    bVar2.f1887E = -1;
                    bVar2.f1894L = -1;
                    return;
                case 3:
                    C0427b bVar3 = aVar.f1879d;
                    bVar3.f1931m = -1;
                    bVar3.f1930l = -1;
                    bVar3.f1888F = -1;
                    bVar3.f1893K = -1;
                    return;
                case 4:
                    C0427b bVar4 = aVar.f1879d;
                    bVar4.f1932n = -1;
                    bVar4.f1933o = -1;
                    bVar4.f1889G = -1;
                    bVar4.f1895M = -1;
                    return;
                case 5:
                    aVar.f1879d.f1934p = -1;
                    return;
                case 6:
                    C0427b bVar5 = aVar.f1879d;
                    bVar5.f1935q = -1;
                    bVar5.f1936r = -1;
                    bVar5.f1891I = -1;
                    bVar5.f1897O = -1;
                    return;
                case 7:
                    C0427b bVar6 = aVar.f1879d;
                    bVar6.f1937s = -1;
                    bVar6.f1938t = -1;
                    bVar6.f1890H = -1;
                    bVar6.f1896N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: a */
    public void mo2412a(int i, int i2, int i3) {
        C0426a f = m2309f(i);
        switch (i2) {
            case 1:
                f.f1879d.f1886D = i3;
                return;
            case 2:
                f.f1879d.f1887E = i3;
                return;
            case 3:
                f.f1879d.f1888F = i3;
                return;
            case 4:
                f.f1879d.f1889G = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                f.f1879d.f1891I = i3;
                return;
            case 7:
                f.f1879d.f1890H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: a */
    public int mo2410a(int i) {
        return m2309f(i).f1879d.f1915d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017b, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2417a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1875c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.f1876a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0087;
                case -1984451626: goto L_0x007d;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0091
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 0
            goto L_0x0092
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 7
            goto L_0x0092
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 2
            goto L_0x0092
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 1
            goto L_0x0092
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 4
            goto L_0x0092
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 3
            goto L_0x0092
        L_0x007d:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 6
            goto L_0x0092
        L_0x0087:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 5
            goto L_0x0092
        L_0x0091:
            r0 = -1
        L_0x0092:
            java.lang.String r4 = "XML parser error must be within a Constraint "
            switch(r0) {
                case 0: goto L_0x016f;
                case 1: goto L_0x015e;
                case 2: goto L_0x0151;
                case 3: goto L_0x012c;
                case 4: goto L_0x0107;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00bb;
                case 7: goto L_0x0099;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x017b
        L_0x0099:
            if (r2 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f1881f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.C0418a.m2276a(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a2:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00bb:
            if (r2 == 0) goto L_0x00c8
            androidx.constraintlayout.widget.d$c r0 = r2.f1878c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2439a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c8:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e1:
            if (r2 == 0) goto L_0x00ee
            androidx.constraintlayout.widget.d$b r0 = r2.f1879d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2437a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ee:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0107:
            if (r2 == 0) goto L_0x0113
            androidx.constraintlayout.widget.d$e r0 = r2.f1880e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2443a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0113:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012c:
            if (r2 == 0) goto L_0x0138
            androidx.constraintlayout.widget.d$d r0 = r2.f1877b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2441a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0138:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0151:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r2 = r9.m2304a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r0 = r2.f1879d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f1916d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x015e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r2 = r9.m2304a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r0 = r2.f1879d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f1909a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r0 = r2.f1879d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f1911b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x016f:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r2 = r9.m2304a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0425d.mo2417a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    private C0426a m2304a(Context context, AttributeSet attributeSet) {
        C0426a aVar = new C0426a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.Constraint);
        m2305a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m2305a(Context context, C0426a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C0436i.Constraint_android_id) {
                aVar.f1878c.f1946a = true;
                aVar.f1879d.f1911b = true;
                aVar.f1877b.f1953a = true;
                aVar.f1880e.f1959a = true;
            }
            int i2 = f1872e.get(index);
            switch (i2) {
                case 1:
                    C0427b bVar = aVar.f1879d;
                    bVar.f1934p = m2308b(typedArray, index, bVar.f1934p);
                    break;
                case 2:
                    C0427b bVar2 = aVar.f1879d;
                    bVar2.f1889G = typedArray.getDimensionPixelSize(index, bVar2.f1889G);
                    break;
                case 3:
                    C0427b bVar3 = aVar.f1879d;
                    bVar3.f1933o = m2308b(typedArray, index, bVar3.f1933o);
                    break;
                case 4:
                    C0427b bVar4 = aVar.f1879d;
                    bVar4.f1932n = m2308b(typedArray, index, bVar4.f1932n);
                    break;
                case 5:
                    aVar.f1879d.f1941w = typedArray.getString(index);
                    break;
                case 6:
                    C0427b bVar5 = aVar.f1879d;
                    bVar5.f1883A = typedArray.getDimensionPixelOffset(index, bVar5.f1883A);
                    break;
                case 7:
                    C0427b bVar6 = aVar.f1879d;
                    bVar6.f1884B = typedArray.getDimensionPixelOffset(index, bVar6.f1884B);
                    break;
                case 8:
                    C0427b bVar7 = aVar.f1879d;
                    bVar7.f1890H = typedArray.getDimensionPixelSize(index, bVar7.f1890H);
                    break;
                case 9:
                    C0427b bVar8 = aVar.f1879d;
                    bVar8.f1938t = m2308b(typedArray, index, bVar8.f1938t);
                    break;
                case 10:
                    C0427b bVar9 = aVar.f1879d;
                    bVar9.f1937s = m2308b(typedArray, index, bVar9.f1937s);
                    break;
                case 11:
                    C0427b bVar10 = aVar.f1879d;
                    bVar10.f1895M = typedArray.getDimensionPixelSize(index, bVar10.f1895M);
                    break;
                case 12:
                    C0427b bVar11 = aVar.f1879d;
                    bVar11.f1896N = typedArray.getDimensionPixelSize(index, bVar11.f1896N);
                    break;
                case 13:
                    C0427b bVar12 = aVar.f1879d;
                    bVar12.f1892J = typedArray.getDimensionPixelSize(index, bVar12.f1892J);
                    break;
                case 14:
                    C0427b bVar13 = aVar.f1879d;
                    bVar13.f1894L = typedArray.getDimensionPixelSize(index, bVar13.f1894L);
                    break;
                case 15:
                    C0427b bVar14 = aVar.f1879d;
                    bVar14.f1897O = typedArray.getDimensionPixelSize(index, bVar14.f1897O);
                    break;
                case 16:
                    C0427b bVar15 = aVar.f1879d;
                    bVar15.f1893K = typedArray.getDimensionPixelSize(index, bVar15.f1893K);
                    break;
                case 17:
                    C0427b bVar16 = aVar.f1879d;
                    bVar16.f1917e = typedArray.getDimensionPixelOffset(index, bVar16.f1917e);
                    break;
                case 18:
                    C0427b bVar17 = aVar.f1879d;
                    bVar17.f1919f = typedArray.getDimensionPixelOffset(index, bVar17.f1919f);
                    break;
                case 19:
                    C0427b bVar18 = aVar.f1879d;
                    bVar18.f1921g = typedArray.getFloat(index, bVar18.f1921g);
                    break;
                case 20:
                    C0427b bVar19 = aVar.f1879d;
                    bVar19.f1939u = typedArray.getFloat(index, bVar19.f1939u);
                    break;
                case 21:
                    C0427b bVar20 = aVar.f1879d;
                    bVar20.f1915d = typedArray.getLayoutDimension(index, bVar20.f1915d);
                    break;
                case 22:
                    C0429d dVar = aVar.f1877b;
                    dVar.f1954b = typedArray.getInt(index, dVar.f1954b);
                    C0429d dVar2 = aVar.f1877b;
                    dVar2.f1954b = f1871d[dVar2.f1954b];
                    break;
                case 23:
                    C0427b bVar21 = aVar.f1879d;
                    bVar21.f1913c = typedArray.getLayoutDimension(index, bVar21.f1913c);
                    break;
                case 24:
                    C0427b bVar22 = aVar.f1879d;
                    bVar22.f1886D = typedArray.getDimensionPixelSize(index, bVar22.f1886D);
                    break;
                case 25:
                    C0427b bVar23 = aVar.f1879d;
                    bVar23.f1923h = m2308b(typedArray, index, bVar23.f1923h);
                    break;
                case 26:
                    C0427b bVar24 = aVar.f1879d;
                    bVar24.f1925i = m2308b(typedArray, index, bVar24.f1925i);
                    break;
                case 27:
                    C0427b bVar25 = aVar.f1879d;
                    bVar25.f1885C = typedArray.getInt(index, bVar25.f1885C);
                    break;
                case 28:
                    C0427b bVar26 = aVar.f1879d;
                    bVar26.f1887E = typedArray.getDimensionPixelSize(index, bVar26.f1887E);
                    break;
                case 29:
                    C0427b bVar27 = aVar.f1879d;
                    bVar27.f1927j = m2308b(typedArray, index, bVar27.f1927j);
                    break;
                case 30:
                    C0427b bVar28 = aVar.f1879d;
                    bVar28.f1929k = m2308b(typedArray, index, bVar28.f1929k);
                    break;
                case 31:
                    C0427b bVar29 = aVar.f1879d;
                    bVar29.f1891I = typedArray.getDimensionPixelSize(index, bVar29.f1891I);
                    break;
                case 32:
                    C0427b bVar30 = aVar.f1879d;
                    bVar30.f1935q = m2308b(typedArray, index, bVar30.f1935q);
                    break;
                case 33:
                    C0427b bVar31 = aVar.f1879d;
                    bVar31.f1936r = m2308b(typedArray, index, bVar31.f1936r);
                    break;
                case 34:
                    C0427b bVar32 = aVar.f1879d;
                    bVar32.f1888F = typedArray.getDimensionPixelSize(index, bVar32.f1888F);
                    break;
                case 35:
                    C0427b bVar33 = aVar.f1879d;
                    bVar33.f1931m = m2308b(typedArray, index, bVar33.f1931m);
                    break;
                case 36:
                    C0427b bVar34 = aVar.f1879d;
                    bVar34.f1930l = m2308b(typedArray, index, bVar34.f1930l);
                    break;
                case 37:
                    C0427b bVar35 = aVar.f1879d;
                    bVar35.f1940v = typedArray.getFloat(index, bVar35.f1940v);
                    break;
                case 38:
                    aVar.f1876a = typedArray.getResourceId(index, aVar.f1876a);
                    break;
                case 39:
                    C0427b bVar36 = aVar.f1879d;
                    bVar36.f1899Q = typedArray.getFloat(index, bVar36.f1899Q);
                    break;
                case 40:
                    C0427b bVar37 = aVar.f1879d;
                    bVar37.f1898P = typedArray.getFloat(index, bVar37.f1898P);
                    break;
                case 41:
                    C0427b bVar38 = aVar.f1879d;
                    bVar38.f1900R = typedArray.getInt(index, bVar38.f1900R);
                    break;
                case 42:
                    C0427b bVar39 = aVar.f1879d;
                    bVar39.f1901S = typedArray.getInt(index, bVar39.f1901S);
                    break;
                case 43:
                    C0429d dVar3 = aVar.f1877b;
                    dVar3.f1956d = typedArray.getFloat(index, dVar3.f1956d);
                    break;
                case 44:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0430e eVar = aVar.f1880e;
                        eVar.f1970l = true;
                        eVar.f1971m = typedArray.getDimension(index, eVar.f1971m);
                        break;
                    }
                case 45:
                    C0430e eVar2 = aVar.f1880e;
                    eVar2.f1961c = typedArray.getFloat(index, eVar2.f1961c);
                    break;
                case 46:
                    C0430e eVar3 = aVar.f1880e;
                    eVar3.f1962d = typedArray.getFloat(index, eVar3.f1962d);
                    break;
                case 47:
                    C0430e eVar4 = aVar.f1880e;
                    eVar4.f1963e = typedArray.getFloat(index, eVar4.f1963e);
                    break;
                case 48:
                    C0430e eVar5 = aVar.f1880e;
                    eVar5.f1964f = typedArray.getFloat(index, eVar5.f1964f);
                    break;
                case 49:
                    C0430e eVar6 = aVar.f1880e;
                    eVar6.f1965g = typedArray.getFloat(index, eVar6.f1965g);
                    break;
                case 50:
                    C0430e eVar7 = aVar.f1880e;
                    eVar7.f1966h = typedArray.getFloat(index, eVar7.f1966h);
                    break;
                case 51:
                    C0430e eVar8 = aVar.f1880e;
                    eVar8.f1967i = typedArray.getDimension(index, eVar8.f1967i);
                    break;
                case 52:
                    C0430e eVar9 = aVar.f1880e;
                    eVar9.f1968j = typedArray.getDimension(index, eVar9.f1968j);
                    break;
                case 53:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0430e eVar10 = aVar.f1880e;
                        eVar10.f1969k = typedArray.getDimension(index, eVar10.f1969k);
                        break;
                    }
                default:
                    String str = "   ";
                    String str2 = "ConstraintSet";
                    switch (i2) {
                        case 60:
                            C0430e eVar11 = aVar.f1880e;
                            eVar11.f1960b = typedArray.getFloat(index, eVar11.f1960b);
                            break;
                        case 61:
                            C0427b bVar40 = aVar.f1879d;
                            bVar40.f1942x = m2308b(typedArray, index, bVar40.f1942x);
                            break;
                        case 62:
                            C0427b bVar41 = aVar.f1879d;
                            bVar41.f1943y = typedArray.getDimensionPixelSize(index, bVar41.f1943y);
                            break;
                        case 63:
                            C0427b bVar42 = aVar.f1879d;
                            bVar42.f1944z = typedArray.getFloat(index, bVar42.f1944z);
                            break;
                        case 64:
                            C0428c cVar = aVar.f1878c;
                            cVar.f1947b = m2308b(typedArray, index, cVar.f1947b);
                            break;
                        case 65:
                            if (typedArray.peekValue(index).type != 3) {
                                aVar.f1878c.f1948c = C3947c.f9797c[typedArray.getInteger(index, 0)];
                                break;
                            } else {
                                aVar.f1878c.f1948c = typedArray.getString(index);
                                break;
                            }
                        case 66:
                            aVar.f1878c.f1950e = typedArray.getInt(index, 0);
                            break;
                        case 67:
                            C0428c cVar2 = aVar.f1878c;
                            cVar2.f1952g = typedArray.getFloat(index, cVar2.f1952g);
                            break;
                        case 68:
                            C0429d dVar4 = aVar.f1877b;
                            dVar4.f1957e = typedArray.getFloat(index, dVar4.f1957e);
                            break;
                        case 69:
                            aVar.f1879d.f1908Z = typedArray.getFloat(index, 1.0f);
                            break;
                        case 70:
                            aVar.f1879d.f1910a0 = typedArray.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e(str2, "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            C0427b bVar43 = aVar.f1879d;
                            bVar43.f1912b0 = typedArray.getInt(index, bVar43.f1912b0);
                            break;
                        case 73:
                            C0427b bVar44 = aVar.f1879d;
                            bVar44.f1914c0 = typedArray.getDimensionPixelSize(index, bVar44.f1914c0);
                            break;
                        case 74:
                            aVar.f1879d.f1920f0 = typedArray.getString(index);
                            break;
                        case 75:
                            C0427b bVar45 = aVar.f1879d;
                            bVar45.f1928j0 = typedArray.getBoolean(index, bVar45.f1928j0);
                            break;
                        case 76:
                            C0428c cVar3 = aVar.f1878c;
                            cVar3.f1949d = typedArray.getInt(index, cVar3.f1949d);
                            break;
                        case 77:
                            aVar.f1879d.f1922g0 = typedArray.getString(index);
                            break;
                        case 78:
                            C0429d dVar5 = aVar.f1877b;
                            dVar5.f1955c = typedArray.getInt(index, dVar5.f1955c);
                            break;
                        case 79:
                            C0428c cVar4 = aVar.f1878c;
                            cVar4.f1951f = typedArray.getFloat(index, cVar4.f1951f);
                            break;
                        case 80:
                            StringBuilder sb = new StringBuilder();
                            sb.append("unused attribute 0x");
                            sb.append(Integer.toHexString(index));
                            sb.append(str);
                            sb.append(f1872e.get(index));
                            Log.w(str2, sb.toString());
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unknown attribute 0x");
                            sb2.append(Integer.toHexString(index));
                            sb2.append(str);
                            sb2.append(f1872e.get(index));
                            Log.w(str2, sb2.toString());
                            break;
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m2307a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0435h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo2351a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: a */
    public void mo2423a(boolean z) {
        this.f1874b = z;
    }
}
