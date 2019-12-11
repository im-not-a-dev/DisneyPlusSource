package kotlin.reflect.jvm.internal.pcollections;

public final class HashPMap<K, V> {
    private static final HashPMap<Object, Object> EMPTY = new HashPMap<>(IntTreePMap.empty(), 0);
    private final IntTreePMap<ConsPStack<MapEntry<K, V>>> intMap;
    private final int size;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    private HashPMap(IntTreePMap<ConsPStack<MapEntry<K, V>>> intTreePMap, int i) {
        this.intMap = intTreePMap;
        this.size = i;
    }

    public static <K, V> HashPMap<K, V> empty() {
        HashPMap<Object, Object> hashPMap = EMPTY;
        if (hashPMap == null) {
            $$$reportNull$$$0(0);
        }
        return hashPMap;
    }

    private ConsPStack<MapEntry<K, V>> getEntries(int i) {
        ConsPStack<MapEntry<K, V>> consPStack = (ConsPStack) this.intMap.get(i);
        return consPStack == null ? ConsPStack.empty() : consPStack;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>>, code=kotlin.reflect.jvm.internal.pcollections.ConsPStack, for r2v0, types: [kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>>, kotlin.reflect.jvm.internal.pcollections.ConsPStack] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <K, V> int keyIndexIn(kotlin.reflect.jvm.internal.pcollections.ConsPStack r2, java.lang.Object r3) {
        /*
            r0 = 0
        L_0x0001:
            if (r2 == 0) goto L_0x001b
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x001b
            E r1 = r2.first
            kotlin.reflect.jvm.internal.pcollections.MapEntry r1 = (kotlin.reflect.jvm.internal.pcollections.MapEntry) r1
            K r1 = r1.key
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0016
            return r0
        L_0x0016:
            kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> r2 = r2.rest
            int r0 = r0 + 1
            goto L_0x0001
        L_0x001b:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.pcollections.HashPMap.keyIndexIn(kotlin.reflect.jvm.internal.pcollections.ConsPStack, java.lang.Object):int");
    }

    public boolean containsKey(Object obj) {
        return keyIndexIn(getEntries(obj.hashCode()), obj) != -1;
    }

    public V get(Object obj) {
        ConsPStack<E> entries = getEntries(obj.hashCode());
        while (entries != null && entries.size() > 0) {
            MapEntry mapEntry = (MapEntry) entries.first;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
            entries = entries.rest;
        }
        return null;
    }

    public HashPMap<K, V> minus(Object obj) {
        ConsPStack entries = getEntries(obj.hashCode());
        int keyIndexIn = keyIndexIn(entries, obj);
        if (keyIndexIn == -1) {
            return this;
        }
        ConsPStack minus = entries.minus(keyIndexIn);
        if (minus.size() == 0) {
            return new HashPMap<>(this.intMap.minus(obj.hashCode()), this.size - 1);
        }
        return new HashPMap<>(this.intMap.plus(obj.hashCode(), minus), this.size - 1);
    }

    public HashPMap<K, V> plus(K k, V v) {
        ConsPStack entries = getEntries(k.hashCode());
        int size2 = entries.size();
        int keyIndexIn = keyIndexIn(entries, k);
        if (keyIndexIn != -1) {
            entries = entries.minus(keyIndexIn);
        }
        ConsPStack plus = entries.plus(new MapEntry(k, v));
        return new HashPMap<>(this.intMap.plus(k.hashCode(), plus), (this.size - size2) + plus.size());
    }

    public int size() {
        return this.size;
    }
}
