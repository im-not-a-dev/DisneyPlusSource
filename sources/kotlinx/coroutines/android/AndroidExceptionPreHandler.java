package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import androidx.annotation.Keep;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12680a;
import kotlin.p573a0.C12688f;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo31007d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/Function0;", "Ljava/lang/reflect/Method;", "()V", "preHandler", "getPreHandler", "()Ljava/lang/reflect/Method;", "preHandler$delegate", "Lkotlin/Lazy;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "invoke", "kotlinx-coroutines-android"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@Keep
/* compiled from: AndroidExceptionPreHandler.kt */
public final class AndroidExceptionPreHandler extends C12680a implements CoroutineExceptionHandler, Function0<Method> {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;"))};
    private final Lazy preHandler$delegate = C12763i.m39921a(this);

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f29643d);
    }

    private final Method getPreHandler() {
        Lazy lazy = this.preHandler$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public void handleException(C12688f fVar, Throwable th) {
        Thread currentThread = Thread.currentThread();
        if (VERSION.SDK_INT >= 28) {
            C12880j.m40222a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        if (!(invoke instanceof UncaughtExceptionHandler)) {
            invoke = null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) invoke;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C12880j.m40222a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
