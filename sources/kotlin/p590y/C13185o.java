package kotlin.p590y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.p586h0.C12757d;

/* renamed from: kotlin.y.o */
/* compiled from: Collections.kt */
class C13185o extends C13183n {
    /* renamed from: a */
    public static <T> List<T> m40513a() {
        return C13203y.f29641c;
    }

    /* renamed from: b */
    public static final <T> Collection<T> m40516b(T[] tArr) {
        return new C13163f(tArr, false);
    }

    /* renamed from: c */
    public static <T> List<T> m40520c(T... tArr) {
        return tArr.length > 0 ? C13171j.m40336a(tArr) : m40513a();
    }

    /* renamed from: d */
    public static <T> List<T> m40522d(T... tArr) {
        return C13174k.m40404d(tArr);
    }

    /* renamed from: e */
    public static <T> List<T> m40523e(T... tArr) {
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C13163f(tArr, true));
    }

    /* renamed from: a */
    public static <T> ArrayList<T> m40512a(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList(new C13163f(tArr, true));
    }

    /* renamed from: b */
    public static <T> List<T> m40517b(T t) {
        return t != null ? C13183n.m40498a(t) : m40513a();
    }

    /* renamed from: c */
    public static void m40521c() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: a */
    public static C12757d m40514a(Collection<?> collection) {
        return new C12757d(0, collection.size() - 1);
    }

    /* renamed from: b */
    public static <T> List<T> m40518b(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return m40513a();
        }
        if (size != 1) {
            return list;
        }
        return C13183n.m40498a(list.get(0));
    }

    /* renamed from: a */
    public static <T> int m40507a(List<? extends T> list) {
        return list.size() - 1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m40509a(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m40508a(list, comparable, i, i2);
    }

    /* renamed from: a */
    public static final <T extends Comparable<? super T>> int m40508a(List<? extends T> list, T t, int i, int i2) {
        m40515a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C13206b.m40622a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public static void m40519b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: a */
    public static /* synthetic */ int m40511a(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return m40510a(list, obj, comparator, i, i2);
    }

    /* renamed from: a */
    public static final <T> int m40510a(List<? extends T> list, T t, Comparator<? super T> comparator, int i, int i2) {
        m40515a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    private static final void m40515a(int i, int i2, int i3) {
        String str = ").";
        String str2 = "fromIndex (";
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            sb.append(") is greater than toIndex (");
            sb.append(i3);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(i2);
            sb2.append(") is less than zero.");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 > i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toIndex (");
            sb3.append(i3);
            sb3.append(") is greater than size (");
            sb3.append(i);
            sb3.append(str);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
