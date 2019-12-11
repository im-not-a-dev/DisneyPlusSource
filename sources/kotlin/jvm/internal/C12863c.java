package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.p581d0.C12732b;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

/* renamed from: kotlin.jvm.internal.c */
/* compiled from: CallableReference */
public abstract class C12863c implements KCallable, Serializable {
    public static final Object NO_RECEIVER = C12864a.f29516c;
    protected final Object receiver;
    private transient KCallable reflected;

    /* renamed from: kotlin.jvm.internal.c$a */
    /* compiled from: CallableReference */
    private static class C12864a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final C12864a f29516c = new C12864a();

        private C12864a() {
        }
    }

    public C12863c() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract KCallable computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public KDeclarationContainer getOwner() {
        throw new AbstractMethodError();
    }

    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public KCallable getReflected() {
        KCallable compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C12732b();
    }

    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C12863c(Object obj) {
        this.receiver = obj;
    }
}
