package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.internal.d */
/* compiled from: Concurrent.kt */
public final class C13256d {

    /* renamed from: a */
    private static final Method f29682a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f29682a = method;
    }

    /* renamed from: a */
    public static final <E> Set<E> m40746a(int i) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i));
        Intrinsics.checkReturnedValueIsNotNull((Object) newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        return newSetFromMap;
    }

    /* renamed from: a */
    public static final boolean m40747a(Executor executor) {
        try {
            if (!(executor instanceof ScheduledExecutorService)) {
                executor = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executor;
            if (scheduledExecutorService != null) {
                Method method = f29682a;
                if (method != null) {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.valueOf(true)});
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }
}
