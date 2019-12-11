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
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0001J\u0011\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0002H\u0001J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002J\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0003J\t\u0010\u001e\u001a\u00020\u0018H\u0001J\u0006\u0010\u001f\u001a\u00020 R$\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/core/networking/Headers;", "", "", "()V", "map", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "accept", "authorization", "containsKey", "", "key", "containsValue", "value", "contentType", "get", "isEmpty", "toBuilder", "Lcom/bamtech/core/networking/Headers$Builder;", "Builder", "Companion", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Headers.kt */
public final class Headers implements Map<String, String>, C12872a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final String f5847U = "Accept";

    /* renamed from: V */
    public static final C1676a f5848V = new C1676a(null);

    /* renamed from: c */
    private final /* synthetic */ Map f5849c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J7\u0010\u0017\u001a\u00020\u00042*\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001a0\u0019\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u0017\u001a\u00020\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\tJ\u0015\u0010!\u001a\u00020\u0004*\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0004J\u0019\u0010#\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001aH\u0002R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/core/networking/Headers$Builder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "value", "", "accept", "getAccept", "()Ljava/lang/String;", "setAccept", "(Ljava/lang/String;)V", "authorization", "getAuthorization", "setAuthorization", "contentType", "getContentType", "setContentType", "pairs", "", "add", "headers", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "", "build", "Lcom/bamtech/core/networking/Headers;", "remove", "key", "to", "y", "unaryPlus", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Headers.kt */
    public static final class Builder {

        /* renamed from: a */
        private final Map<String, String> f5850a;

        public Builder() {
            this.f5850a = new LinkedHashMap();
        }

        /* renamed from: a */
        public final void mo7410a(String str) {
            if (str != null) {
                String str2 = (String) this.f5850a.put(Headers.f5848V.mo7412a(), str);
            }
        }

        /* renamed from: a */
        public final Headers mo7409a() {
            return new Headers(this.f5850a);
        }

        public Builder(Function1<? super Builder, C13145v> function1) {
            this();
            function1.invoke(this);
        }

        /* renamed from: a */
        public final void mo7411a(Pair<String, String> pair) {
            this.f5850a.put(pair.mo31015c(), pair.mo31016d());
        }

        /* renamed from: a */
        public final Builder mo7408a(Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                this.f5850a.putAll(map);
            }
            return this;
        }
    }

    /* renamed from: com.bamtech.core.networking.Headers$a */
    /* compiled from: Headers.kt */
    public static final class C1676a {
        private C1676a() {
        }

        /* renamed from: a */
        public final String mo7412a() {
            return Headers.f5847U;
        }

        public /* synthetic */ C1676a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Headers(Map<String, String> map) {
        this.f5849c = map;
    }

    /* renamed from: a */
    public boolean mo7380a(String str) {
        return this.f5849c.containsKey(str);
    }

    /* renamed from: b */
    public Set<Entry<String, String>> mo7381b() {
        return this.f5849c.entrySet();
    }

    /* renamed from: b */
    public boolean mo7382b(String str) {
        return this.f5849c.containsValue(str);
    }

    /* renamed from: c */
    public String mo7383c(String str) {
        return (String) this.f5849c.get(str);
    }

    /* renamed from: c */
    public Set<String> mo7384c() {
        return this.f5849c.keySet();
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
            return mo7380a((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return mo7382b((String) obj);
        }
        return false;
    }

    /* renamed from: d */
    public int mo7391d() {
        return this.f5849c.size();
    }

    /* renamed from: e */
    public Collection<String> mo7392e() {
        return this.f5849c.values();
    }

    public final /* bridge */ Set<Entry<String, String>> entrySet() {
        return mo7381b();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return mo7383c((String) obj);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.f5849c.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return mo7384c();
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
        return mo7391d();
    }

    public final /* bridge */ Collection<String> values() {
        return mo7392e();
    }

    public Headers() {
        this(C13173j0.m40350a());
    }
}
