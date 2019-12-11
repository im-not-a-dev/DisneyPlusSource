package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C13142s;
import kotlin.jvm.internal.C12861b;
import kotlin.jvm.internal.C12865c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12875d;

/* compiled from: SmartSet.kt */
public final class SmartSet<T> extends AbstractSet<T> {
    public static final Companion Companion = new Companion(null);
    private Object data;
    private int size;

    /* compiled from: SmartSet.kt */
    private static final class ArrayIterator<T> implements Iterator<T>, C12875d {
        private final Iterator<T> arrayIterator;

        public ArrayIterator(T[] tArr) {
            this.arrayIterator = C12861b.m40194a(tArr);
        }

        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        public T next() {
            return this.arrayIterator.next();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class Companion {
        private Companion() {
        }

        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> SmartSet<T> create(Collection<? extends T> collection) {
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }
    }

    /* compiled from: SmartSet.kt */
    private static final class SingletonIterator<T> implements Iterator<T>, C12875d {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t) {
            this.element = t;
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            throw new NoSuchElementException();
        }

        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private SmartSet() {
    }

    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.data = t;
        } else if (size() == 1) {
            if (Intrinsics.areEqual(this.data, (Object) t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        } else if (size() < 5) {
            Object obj2 = this.data;
            if (obj2 != null) {
                Object[] objArr = (Object[]) obj2;
                if (C13174k.m40393b(objArr, (Object) t)) {
                    return false;
                }
                if (size() == 4) {
                    LinkedHashSet a = C13188p0.m40530a(Arrays.copyOf(objArr, objArr.length));
                    a.add(t);
                    obj = a;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
                    Intrinsics.checkReturnedValueIsNotNull((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    copyOf[copyOf.length - 1] = t;
                    obj = copyOf;
                }
                this.data = obj;
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            Object obj3 = this.data;
            if (obj3 == null) {
                throw new C13142s("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!C12865c0.m40204c(obj3).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    public void clear() {
        this.data = null;
        setSize(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.areEqual(this.data, obj);
        }
        if (size() < 5) {
            Object obj2 = this.data;
            if (obj2 != null) {
                return C13174k.m40393b((Object[]) obj2, obj);
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.data;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    public int getSize() {
        return this.size;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new SingletonIterator(this.data);
        }
        if (size() < 5) {
            Object obj = this.data;
            if (obj != null) {
                return new ArrayIterator((Object[]) obj);
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            return C12865c0.m40204c(obj2).iterator();
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public void setSize(int i) {
        this.size = i;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
