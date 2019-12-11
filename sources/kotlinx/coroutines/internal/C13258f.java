package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p581d0.C12731a;
import kotlinx.coroutines.C13412x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u001a1\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00072\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\b\u001a!\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u0010H\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0010\u001a\u0018\u0010\u0015\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0002\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00062\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006¨\u0006\u0018"}, mo31007d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "throwableFields", "", "createConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.internal.f */
/* compiled from: ExceptionsConstuctor.kt */
public final class C13258f {

    /* renamed from: a */
    private static final int f29684a = m40753b(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f29685b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f29686c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.f$a */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C13259a extends C12881k implements Function1<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f29687c;

        public C13259a(Constructor constructor) {
            this.f29687c = constructor;
            super(1);
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C12901a aVar = C12900n.f29540c;
                Object newInstance = this.f29687c.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C12900n.m40236a(obj);
                    if (C12900n.m40238c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C12901a aVar2 = C12900n.f29540c;
                obj = C12903o.m40240a(th2);
                C12900n.m40236a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$b */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C13260b extends C12881k implements Function1<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f29688c;

        public C13260b(Constructor constructor) {
            this.f29688c = constructor;
            super(1);
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C12901a aVar = C12900n.f29540c;
                Object newInstance = this.f29688c.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C12900n.m40236a(obj);
                    if (C12900n.m40238c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C12901a aVar2 = C12900n.f29540c;
                obj = C12903o.m40240a(th2);
                C12900n.m40236a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$c */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C13261c extends C12881k implements Function1<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f29689c;

        public C13261c(Constructor constructor) {
            this.f29689c = constructor;
            super(1);
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C12901a aVar = C12900n.f29540c;
                Object newInstance = this.f29689c.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C12900n.m40236a(th2);
                    obj = th2;
                    if (C12900n.m40238c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C12901a aVar2 = C12900n.f29540c;
                Object obj2 = C12903o.m40240a(th3);
                C12900n.m40236a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$d */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C13262d extends C12881k implements Function1<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f29690c;

        public C13262d(Constructor constructor) {
            this.f29690c = constructor;
            super(1);
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C12901a aVar = C12900n.f29540c;
                Object newInstance = this.f29690c.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C12900n.m40236a(th2);
                    obj = th2;
                    if (C12900n.m40238c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C12901a aVar2 = C12900n.f29540c;
                Object obj2 = C12903o.m40240a(th3);
                C12900n.m40236a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$e */
    /* compiled from: Comparisons.kt */
    public static final class C13263e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            String str = "it";
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor, str);
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor2, str);
            return C13206b.m40622a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$f */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C13264f extends C12881k implements Function1 {

        /* renamed from: c */
        public static final C13264f f29691c = new C13264f();

        C13264f() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$g */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C13265g extends C12881k implements Function1 {

        /* renamed from: c */
        public static final C13265g f29692c = new C13265g();

        C13265g() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m40751a(E e) {
        E e2;
        E e3 = null;
        if (e instanceof C13412x) {
            try {
                C12901a aVar = C12900n.f29540c;
                e2 = ((C13412x) e).mo34511a();
                C12900n.m40236a(e2);
            } catch (Throwable th) {
                C12901a aVar2 = C12900n.f29540c;
                e2 = C12903o.m40240a(th);
                C12900n.m40236a(e2);
            }
            if (C12900n.m40238c(e2)) {
                e2 = null;
            }
            return (Throwable) e2;
        }
        ReadLock readLock = f29685b.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) f29686c.get(e.getClass());
            if (function1 != null) {
                return (Throwable) function1.invoke(e);
            }
            int i = 0;
            if (f29684a != m40753b(e.getClass(), i)) {
                ReentrantReadWriteLock reentrantReadWriteLock = f29685b;
                ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f29686c.put(e.getClass(), C13264f.f29691c);
                    C13145v vVar = C13145v.f29587a;
                    writeLock.unlock();
                    return null;
                } finally {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            } else {
                Constructor[] constructors = e.getClass().getConstructors();
                Intrinsics.checkReturnedValueIsNotNull((Object) constructors, "exception.javaClass.constructors");
                Function1 function12 = null;
                for (Constructor constructor : C13174k.m40400c((T[]) constructors, (Comparator<? super T>) new C13263e<Object>())) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) constructor, "constructor");
                    function12 = m40752a(constructor);
                    if (function12 != null) {
                        break;
                    }
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = f29685b;
                ReadLock readLock3 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount2; i3++) {
                    readLock3.unlock();
                }
                WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    f29686c.put(e.getClass(), function12 != null ? function12 : C13265g.f29692c);
                    C13145v vVar2 = C13145v.f29587a;
                    writeLock2.unlock();
                    if (function12 != null) {
                        e3 = (Throwable) function12.invoke(e);
                    }
                    return e3;
                } finally {
                    while (i < readHoldCount2) {
                        readLock3.lock();
                        i++;
                    }
                    writeLock2.unlock();
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: b */
    private static final int m40753b(Class<?> cls, int i) {
        Object obj;
        C12731a.m39867a(cls);
        try {
            C12901a aVar = C12900n.f29540c;
            obj = Integer.valueOf(m40750a(cls, 0, 1, null));
            C12900n.m40236a(obj);
        } catch (Throwable th) {
            C12901a aVar2 = C12900n.f29540c;
            obj = C12903o.m40240a(th);
            C12900n.m40236a(obj);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C12900n.m40238c(obj)) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }

    /* renamed from: a */
    private static final Function1<Throwable, Throwable> m40752a(Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C13262d(constructor);
        }
        if (length == 1) {
            Class cls = parameterTypes[0];
            if (Intrinsics.areEqual((Object) cls, (Object) Throwable.class)) {
                return new C13260b(constructor);
            }
            if (Intrinsics.areEqual((Object) cls, (Object) String.class)) {
                return new C13261c(constructor);
            }
        } else if (length == 2 && Intrinsics.areEqual((Object) parameterTypes[0], (Object) String.class) && Intrinsics.areEqual((Object) parameterTypes[1], (Object) Throwable.class)) {
            return new C13259a(constructor);
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ int m40750a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m40749a(cls, i);
    }

    /* renamed from: a */
    private static final int m40749a(Class<?> cls, int i) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredFields, "declaredFields");
            int i2 = 0;
            for (Field field : declaredFields) {
                Intrinsics.checkReturnedValueIsNotNull((Object) field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
