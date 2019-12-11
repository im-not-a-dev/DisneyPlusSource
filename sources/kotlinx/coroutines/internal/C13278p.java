package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12705e;
import kotlinx.coroutines.C13292j0;

/* renamed from: kotlinx.coroutines.internal.p */
/* compiled from: StackTraceRecovery.kt */
public final class C13278p {

    /* renamed from: a */
    private static final String f29711a;

    /* renamed from: b */
    private static final String f29712b;

    static {
        Object obj;
        Object obj2;
        try {
            C12901a aVar = C12900n.f29540c;
            Class cls = Class.forName("kotlin.a0.i.a.a");
            Intrinsics.checkReturnedValueIsNotNull((Object) cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            C12900n.m40236a(obj);
        } catch (Throwable th) {
            C12901a aVar2 = C12900n.f29540c;
            obj = C12903o.m40240a(th);
            C12900n.m40236a(obj);
        }
        if (C12900n.m40237b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f29711a = (String) obj;
        try {
            C12901a aVar3 = C12900n.f29540c;
            Class cls2 = Class.forName("kotlinx.coroutines.internal.p");
            Intrinsics.checkReturnedValueIsNotNull((Object) cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
            C12900n.m40236a(obj2);
        } catch (Throwable th2) {
            C12901a aVar4 = C12900n.f29540c;
            obj2 = C12903o.m40240a(th2);
            C12900n.m40236a(obj2);
        }
        if (C12900n.m40237b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f29712b = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m40811a(E e, C12683c<?> cVar) {
        return (!C13292j0.m40866d() || !(cVar instanceof C12705e)) ? e : m40812a(e, (C12705e) cVar);
    }

    /* renamed from: b */
    public static final <E extends Throwable> E m40818b(E e) {
        if (!C13292j0.m40866d()) {
            return e;
        }
        E a = C13258f.m40751a(e);
        if (a == null) {
            return e;
        }
        m40819c(a);
        return a;
    }

    /* renamed from: c */
    private static final <E extends Throwable> E m40819c(E e) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        Intrinsics.checkReturnedValueIsNotNull((Object) stackTrace, "stackTrace");
        String str = f29712b;
        Intrinsics.checkReturnedValueIsNotNull((Object) str, "stackTraceRecoveryClassName");
        int a = m40808a(stackTrace, str);
        int i = a + 1;
        String str2 = f29711a;
        Intrinsics.checkReturnedValueIsNotNull((Object) str2, "baseContinuationImplClassName");
        int a2 = m40808a(stackTrace, str2);
        int i2 = (length - a) - (a2 == -1 ? 0 : length - a2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = m40809a("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* renamed from: d */
    public static final <E extends Throwable> E m40820d(E e) {
        if (!C13292j0.m40866d()) {
            return e;
        }
        E cause = e.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!Intrinsics.areEqual((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                Intrinsics.checkReturnedValueIsNotNull((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    Intrinsics.checkReturnedValueIsNotNull((Object) stackTraceElement, "it");
                    if (m40816a(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m40812a(E e, C12705e eVar) {
        Pair a = m40814a(e);
        E e2 = (Throwable) a.mo31013a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a.mo31014b();
        E a2 = C13258f.m40751a(e2);
        if (a2 == null) {
            return e;
        }
        ArrayDeque a3 = m40813a(eVar);
        if (a3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m40815a(stackTraceElementArr, a3);
        }
        m40810a(e2, a2, a3);
        return a2;
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m40810a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m40809a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.checkReturnedValueIsNotNull((Object) stackTrace, "causeTrace");
        String str = f29711a;
        Intrinsics.checkReturnedValueIsNotNull((Object) str, "baseContinuationImplClassName");
        int a = m40808a(stackTrace, str);
        int i = 0;
        if (a == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: a */
    private static final <E extends Throwable> Pair<E, StackTraceElement[]> m40814a(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !Intrinsics.areEqual((Object) cause.getClass(), (Object) e.getClass())) {
            return C12907r.m40244a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.checkReturnedValueIsNotNull((Object) stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            Intrinsics.checkReturnedValueIsNotNull((Object) stackTraceElement, "it");
            if (m40816a(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return C12907r.m40244a(cause, stackTrace);
        }
        return C12907r.m40244a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m40813a(C12705e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement g = eVar.mo31048g();
        if (g != null) {
            arrayDeque.add(g);
        }
        while (true) {
            if (!(eVar instanceof C12705e)) {
                eVar = null;
            }
            if (eVar == null) {
                break;
            }
            eVar = eVar.mo31047f();
            if (eVar == null) {
                break;
            }
            StackTraceElement g2 = eVar.mo31048g();
            if (g2 != null) {
                arrayDeque.add(g2);
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    public static final StackTraceElement m40809a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("\b\b\b(");
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = "\b";
        return new StackTraceElement(sb2, str2, str2, -1);
    }

    /* renamed from: a */
    public static final boolean m40816a(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkReturnedValueIsNotNull((Object) className, "className");
        return C12832w.m40123b(className, "\b\b\b", false, 2, null);
    }

    /* renamed from: a */
    private static final boolean m40817a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && Intrinsics.areEqual((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && Intrinsics.areEqual((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: a */
    private static final void m40815a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m40816a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                Object last = arrayDeque.getLast();
                Intrinsics.checkReturnedValueIsNotNull(last, "result.last");
                if (m40817a(stackTraceElement, (StackTraceElement) last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static final int m40808a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
