package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.f6 */
final class C11113f6 {

    /* renamed from: a */
    private static final Class<?> f26200a = m35190d();

    /* renamed from: b */
    private static final C11360w6<?, ?> f26201b = m35165a(false);

    /* renamed from: c */
    private static final C11360w6<?, ?> f26202c = m35165a(true);

    /* renamed from: d */
    private static final C11360w6<?, ?> f26203d = new C11387y6();

    /* renamed from: a */
    public static void m35174a(Class<?> cls) {
        if (!C11090e4.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f26200a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: b */
    public static void m35183b(int i, List<Float> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28784n(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m35187c(int i, List<Long> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28771d(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m35191d(int i, List<Long> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28781k(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m35195e(int i, List<Long> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28780j(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m35198f(int i, List<Long> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28779i(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m35201g(int i, List<Long> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28774e(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m35204h(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28765b(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m35207i(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28777g(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m35210j(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28782l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m35211k(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28776f(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m35212l(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28778h(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m35213m(int i, List<Integer> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28768c(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m35214n(int i, List<Boolean> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28757a(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m35181b(int i, List<C11342v2> list, C11333u7 u7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28755a(i, list);
        }
    }

    /* renamed from: c */
    static int m35184c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35200g(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: d */
    static int m35188d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35203h(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: e */
    static int m35193e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35565d(d5Var.mo28389b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35565d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m35197f(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35569e(d5Var.mo28389b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35569e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m35200g(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35573f(d5Var.mo28389b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35573f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    static int m35203h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35587k(h4Var.mo28534f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35587k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: i */
    static int m35206i(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35570f(h4Var.mo28534f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35570f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    static int m35209j(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35574g(h4Var.mo28534f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35574g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m35170a(int i, List<Double> list, C11333u7 u7Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28783m(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m35182b(int i, List<?> list, C11333u7 u7Var, C11077d6 d6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28764b(i, list, d6Var);
        }
    }

    /* renamed from: a */
    public static void m35168a(int i, List<String> list, C11333u7 u7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28763b(i, list);
        }
    }

    /* renamed from: c */
    static int m35185c(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: d */
    static int m35189d(List<?> list) {
        return list.size();
    }

    /* renamed from: b */
    static int m35178b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35197f(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: c */
    public static C11360w6<?, ?> m35186c() {
        return f26203d;
    }

    /* renamed from: d */
    private static Class<?> m35190d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m35169a(int i, List<?> list, C11333u7 u7Var, C11077d6 d6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            u7Var.mo28756a(i, list, d6Var);
        }
    }

    /* renamed from: e */
    static int m35192e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35206i(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: f */
    static int m35196f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35209j(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: g */
    static int m35199g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35163a(list) + (size * C11197l3.m35567e(i));
    }

    /* renamed from: h */
    static int m35202h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C11197l3.m35583i(i, 0);
    }

    /* renamed from: i */
    static int m35205i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C11197l3.m35576g(i, 0);
    }

    /* renamed from: j */
    static int m35208j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C11197l3.m35555b(i, true);
    }

    /* renamed from: a */
    static int m35162a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m35193e(list) + (list.size() * C11197l3.m35567e(i));
    }

    /* renamed from: b */
    static int m35179b(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: b */
    static int m35176b(int i, List<C11342v2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C11197l3.m35567e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C11197l3.m35544a((C11342v2) list.get(i2));
        }
        return e;
    }

    /* renamed from: e */
    private static Class<?> m35194e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static int m35163a(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            i = 0;
            while (i2 < size) {
                i += C11197l3.m35578h(h4Var.mo28534f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C11197l3.m35578h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m35177b(int i, List<C11259p5> list, C11077d6 d6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C11197l3.m35560c(i, (C11259p5) list.get(i3), d6Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static C11360w6<?, ?> m35180b() {
        return f26202c;
    }

    /* renamed from: a */
    static int m35160a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C11197l3.m35567e(i) * size;
        if (list instanceof C11358w4) {
            C11358w4 w4Var = (C11358w4) list;
            while (i4 < size) {
                Object e2 = w4Var.mo28322e(i4);
                if (e2 instanceof C11342v2) {
                    i3 = C11197l3.m35544a((C11342v2) e2);
                } else {
                    i3 = C11197l3.m35545a((String) e2);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C11342v2) {
                    i2 = C11197l3.m35544a((C11342v2) obj);
                } else {
                    i2 = C11197l3.m35545a((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m35159a(int i, Object obj, C11077d6 d6Var) {
        if (obj instanceof C11330u4) {
            return C11197l3.m35540a(i, (C11330u4) obj);
        }
        return C11197l3.m35552b(i, (C11259p5) obj, d6Var);
    }

    /* renamed from: a */
    static int m35161a(int i, List<?> list, C11077d6 d6Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C11197l3.m35567e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C11330u4) {
                i2 = C11197l3.m35543a((C11330u4) obj);
            } else {
                i2 = C11197l3.m35542a((C11259p5) obj, d6Var);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: a */
    public static C11360w6<?, ?> m35164a() {
        return f26201b;
    }

    /* renamed from: a */
    private static C11360w6<?, ?> m35165a(boolean z) {
        try {
            Class e = m35194e();
            if (e == null) {
                return null;
            }
            return (C11360w6) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m35175a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T> void m35171a(C11154i5 i5Var, T t, T t2, long j) {
        C11058c7.m34854a((Object) t, j, i5Var.mo28576a(C11058c7.m34877f(t, j), C11058c7.m34877f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends C11357w3<FT>> void m35172a(C11314t3<FT> t3Var, T t, T t2) {
        C11329u3 a = t3Var.mo28882a((Object) t2);
        if (!a.f26557a.isEmpty()) {
            t3Var.mo28889b(t).mo29037a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m35173a(C11360w6<UT, UB> w6Var, T t, T t2) {
        w6Var.mo29105a((Object) t, w6Var.mo29113c(w6Var.mo29114d(t), w6Var.mo29114d(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m35167a(int i, List<Integer> list, C11203l4 l4Var, UB ub, C11360w6<UT, UB> w6Var) {
        UB ub2;
        if (l4Var == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!l4Var.mo28530a(intValue)) {
                        ub = m35166a(i, intValue, ub2, w6Var);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (l4Var.mo28530a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m35166a(i, intValue2, ub2, w6Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m35166a(int i, int i2, UB ub, C11360w6<UT, UB> w6Var) {
        if (ub == null) {
            ub = w6Var.mo29098a();
        }
        w6Var.mo29101a(ub, i, (long) i2);
        return ub;
    }
}
