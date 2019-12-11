package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo31007d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.p */
/* compiled from: LazyJVM.kt */
final class C12904p<T> implements Lazy<T>, Serializable {

    /* renamed from: V */
    private static final AtomicReferenceFieldUpdater<C12904p<?>, Object> f29542V = AtomicReferenceFieldUpdater.newUpdater(C12904p.class, Object.class, "U");

    /* renamed from: U */
    private volatile Object f29543U = C13143t.f29586a;

    /* renamed from: c */
    private volatile Function0<? extends T> f29544c;

    /* renamed from: kotlin.p$a */
    /* compiled from: LazyJVM.kt */
    public static final class C12905a {
        private C12905a() {
        }

        public /* synthetic */ C12905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C12905a(null);
    }

    public C12904p(Function0<? extends T> function0) {
        this.f29544c = function0;
    }

    /* renamed from: a */
    public boolean mo31243a() {
        return this.f29543U != C13143t.f29586a;
    }

    public T getValue() {
        T t = this.f29543U;
        if (t != C13143t.f29586a) {
            return t;
        }
        Function0<? extends T> function0 = this.f29544c;
        if (function0 != null) {
            T invoke = function0.invoke();
            if (f29542V.compareAndSet(this, C13143t.f29586a, invoke)) {
                this.f29544c = null;
                return invoke;
            }
        }
        return this.f29543U;
    }

    public String toString() {
        return mo31243a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
