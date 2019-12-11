package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.C12730d;
import kotlin.jvm.functions.C12840a;
import kotlin.jvm.functions.C12841b;
import kotlin.jvm.functions.C12842c;
import kotlin.jvm.functions.C12843d;
import kotlin.jvm.functions.C12844e;
import kotlin.jvm.functions.C12845f;
import kotlin.jvm.functions.C12846g;
import kotlin.jvm.functions.C12847h;
import kotlin.jvm.functions.C12848i;
import kotlin.jvm.functions.C12849j;
import kotlin.jvm.functions.C12850k;
import kotlin.jvm.functions.C12851l;
import kotlin.jvm.functions.C12852m;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.C12854o;
import kotlin.jvm.functions.C12855p;
import kotlin.jvm.functions.C12856q;
import kotlin.jvm.functions.C12857r;
import kotlin.jvm.functions.C12858s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.jvm.internal.p589f0.C12873b;
import kotlin.jvm.internal.p589f0.C12876e;

/* renamed from: kotlin.jvm.internal.c0 */
/* compiled from: TypeIntrinsics */
public class C12865c0 {
    /* renamed from: a */
    private static <T extends Throwable> T m40198a(T t) {
        Intrinsics.sanitizeStackTrace(t, C12865c0.class.getName());
        return t;
    }

    /* renamed from: b */
    public static List m40202b(Object obj) {
        if (!(obj instanceof C12872a) || (obj instanceof C12876e)) {
            return m40206e(obj);
        }
        m40200a(obj, "kotlin.collections.MutableList");
        throw null;
    }

    /* renamed from: c */
    public static Set m40204c(Object obj) {
        if (!(obj instanceof C12872a)) {
            return m40207f(obj);
        }
        m40200a(obj, "kotlin.collections.MutableSet");
        throw null;
    }

    /* renamed from: d */
    public static Collection m40205d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            m40196a(e);
            throw null;
        }
    }

    /* renamed from: e */
    public static List m40206e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            m40196a(e);
            throw null;
        }
    }

    /* renamed from: f */
    public static Set m40207f(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            m40196a(e);
            throw null;
        }
    }

    /* renamed from: g */
    public static int m40208g(Object obj) {
        if (obj instanceof C12878h) {
            return ((C12878h) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof C12853n) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof C12854o) {
            return 5;
        }
        if (obj instanceof C12855p) {
            return 6;
        }
        if (obj instanceof C12856q) {
            return 7;
        }
        if (obj instanceof C12857r) {
            return 8;
        }
        if (obj instanceof C12858s) {
            return 9;
        }
        if (obj instanceof C12840a) {
            return 10;
        }
        if (obj instanceof C12841b) {
            return 11;
        }
        if (obj instanceof C12842c) {
            return 12;
        }
        if (obj instanceof C12843d) {
            return 13;
        }
        if (obj instanceof C12844e) {
            return 14;
        }
        if (obj instanceof C12845f) {
            return 15;
        }
        if (obj instanceof C12846g) {
            return 16;
        }
        if (obj instanceof C12847h) {
            return 17;
        }
        if (obj instanceof C12848i) {
            return 18;
        }
        if (obj instanceof C12849j) {
            return 19;
        }
        if (obj instanceof C12850k) {
            return 20;
        }
        if (obj instanceof C12851l) {
            return 21;
        }
        return obj instanceof C12852m ? 22 : -1;
    }

    /* renamed from: a */
    public static void m40200a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m40201a(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void m40201a(String str) {
        m40196a(new ClassCastException(str));
        throw null;
    }

    /* renamed from: b */
    public static boolean m40203b(Object obj, int i) {
        return (obj instanceof C12730d) && m40208g(obj) == i;
    }

    /* renamed from: a */
    public static ClassCastException m40196a(ClassCastException classCastException) {
        m40198a((T) classCastException);
        throw classCastException;
    }

    /* renamed from: a */
    public static Collection m40199a(Object obj) {
        if (!(obj instanceof C12872a) || (obj instanceof C12873b)) {
            return m40205d(obj);
        }
        m40200a(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    /* renamed from: a */
    public static Object m40197a(Object obj, int i) {
        if (obj == null || m40203b(obj, i)) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin.jvm.functions.Function");
        sb.append(i);
        m40200a(obj, sb.toString());
        throw null;
    }
}
