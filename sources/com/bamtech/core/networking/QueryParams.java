package com.bamtech.core.networking;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0001J\u0011\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H\u0001J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u0001R$\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/core/networking/QueryParams;", "", "", "()V", "map", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "get", "isEmpty", "Builder", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QueryParams.kt */
public final class QueryParams implements Map<String, String>, C12872a {

    /* renamed from: c */
    private final /* synthetic */ Map f5861c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J7\u0010\u000b\u001a\u00020\u00002*\u0010\f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e0\r\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u0015\u0010\u0016\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0004J\u0019\u0010\u0018\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eH\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/core/networking/QueryParams$Builder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "pairs", "", "", "add", "param", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lcom/bamtech/core/networking/QueryParams$Builder;", "params", "", "build", "Lcom/bamtech/core/networking/QueryParams;", "remove", "key", "to", "y", "unaryPlus", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: QueryParams.kt */
    public static final class Builder {

        /* renamed from: a */
        private final Map<String, String> f5862a;

        public Builder() {
            this.f5862a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final QueryParams mo7476a() {
            return new QueryParams(this.f5862a);
        }

        /* renamed from: a */
        public final Builder mo7475a(Map<String, String> map) {
            if (map != null) {
                this.f5862a.putAll(map);
            }
            return this;
        }

        public Builder(Function1<? super Builder, C13145v> function1) {
            this();
            function1.invoke(this);
        }

        /* renamed from: a */
        public final void mo7477a(String str, String str2) {
            this.f5862a.put(str, str2);
        }
    }

    public QueryParams(Map<String, String> map) {
        this.f5861c = map;
    }

    /* renamed from: a */
    public boolean mo7447a(String str) {
        return this.f5861c.containsKey(str);
    }

    /* renamed from: b */
    public Set<Entry<String, String>> mo7448b() {
        return this.f5861c.entrySet();
    }

    /* renamed from: b */
    public boolean mo7449b(String str) {
        return this.f5861c.containsValue(str);
    }

    /* renamed from: c */
    public String mo7450c(String str) {
        return (String) this.f5861c.get(str);
    }

    /* renamed from: c */
    public Set<String> mo7451c() {
        return this.f5861c.keySet();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return mo7447a((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return mo7449b((String) obj);
        }
        return false;
    }

    /* renamed from: d */
    public int mo7458d() {
        return this.f5861c.size();
    }

    /* renamed from: e */
    public Collection<String> mo7459e() {
        return this.f5861c.values();
    }

    public final /* bridge */ Set<Entry<String, String>> entrySet() {
        return mo7448b();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return mo7450c((String) obj);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.f5861c.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return mo7451c();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo7458d();
    }

    public final /* bridge */ Collection<String> values() {
        return mo7459e();
    }
}
