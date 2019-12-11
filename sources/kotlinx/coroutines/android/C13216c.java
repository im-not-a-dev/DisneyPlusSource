package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.android.c */
/* compiled from: HandlerDispatcher.kt */
public final class C13216c {
    static {
        Object obj;
        try {
            C12901a aVar = C12900n.f29540c;
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkReturnedValueIsNotNull((Object) mainLooper, "Looper.getMainLooper()");
            obj = new C13214a(m40649a(mainLooper, true), "Main");
            C12900n.m40236a(obj);
        } catch (Throwable th) {
            C12901a aVar2 = C12900n.f29540c;
            obj = C12903o.m40240a(th);
            C12900n.m40236a(obj);
        }
        if (C12900n.m40238c(obj)) {
            obj = null;
        }
        C13215b bVar = (C13215b) obj;
    }

    /* renamed from: a */
    public static final Handler m40649a(Looper looper, boolean z) {
        if (z) {
            int i = VERSION.SDK_INT;
            if (i >= 16) {
                if (i >= 28) {
                    Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
                    if (invoke != null) {
                        return (Handler) invoke;
                    }
                    throw new C13142s("null cannot be cast to non-null type android.os.Handler");
                }
                try {
                    Constructor declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE});
                    Intrinsics.checkReturnedValueIsNotNull((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
                    Object newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
                    Intrinsics.checkReturnedValueIsNotNull(newInstance, "constructor.newInstance(this, null, true)");
                    return (Handler) newInstance;
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
        }
        return new Handler(looper);
    }
}
