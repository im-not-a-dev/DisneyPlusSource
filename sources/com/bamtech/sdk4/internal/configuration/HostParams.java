package com.bamtech.sdk4.internal.configuration;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0001J\u0011\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0001J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u0016H\u0001R$\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/HostParams;", "", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "", "map", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "get", "getDev", "getProd", "isEmpty", "HostParamsBuilder", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EmbeddedConfiguration.kt */
public final class HostParams implements Map<ConfigurationHostName, String>, C12872a {
    private final Map<ConfigurationHostName, String> map;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/HostParams$HostParamsBuilder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "dev", "", "getDev", "()Ljava/lang/String;", "setDev", "(Ljava/lang/String;)V", "prod", "getProd", "setProd", "build", "Lcom/bamtech/sdk4/internal/configuration/HostParams;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: EmbeddedConfiguration.kt */
    public static final class HostParamsBuilder {
        public String dev;
        public String prod;

        public HostParamsBuilder() {
        }

        public final HostParams build() {
            Pair[] pairArr = new Pair[2];
            ConfigurationHostName configurationHostName = ConfigurationHostName.DEV;
            String str = this.dev;
            if (str != null) {
                pairArr[0] = C12907r.m40244a(configurationHostName, str);
                ConfigurationHostName configurationHostName2 = ConfigurationHostName.PROD;
                String str2 = this.prod;
                if (str2 != null) {
                    pairArr[1] = C12907r.m40244a(configurationHostName2, str2);
                    return new HostParams(C13173j0.m40356a(pairArr));
                }
                Intrinsics.throwUninitializedPropertyAccessException("prod");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("dev");
            throw null;
        }

        public final void setDev(String str) {
            this.dev = str;
        }

        public final void setProd(String str) {
            this.prod = str;
        }

        public HostParamsBuilder(Function1<? super HostParamsBuilder, C13145v> function1) {
            this();
            function1.invoke(this);
        }
    }

    public HostParams(Map<ConfigurationHostName, String> map2) {
        this.map = map2;
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

    public boolean containsKey(ConfigurationHostName configurationHostName) {
        return this.map.containsKey(configurationHostName);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ConfigurationHostName) {
            return containsKey((ConfigurationHostName) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    public boolean containsValue(String str) {
        return this.map.containsValue(str);
    }

    public final /* bridge */ Set<Entry<ConfigurationHostName, String>> entrySet() {
        return getEntries();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ConfigurationHostName) {
            return get((ConfigurationHostName) obj);
        }
        return null;
    }

    public String get(ConfigurationHostName configurationHostName) {
        return (String) this.map.get(configurationHostName);
    }

    public Set<Entry<ConfigurationHostName, String>> getEntries() {
        return this.map.entrySet();
    }

    public Set<ConfigurationHostName> getKeys() {
        return this.map.keySet();
    }

    public int getSize() {
        return this.map.size();
    }

    public Collection<String> getValues() {
        return this.map.values();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final /* bridge */ Set<ConfigurationHostName> keySet() {
        return getKeys();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends ConfigurationHostName, ? extends String> map2) {
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

    public void replaceAll(BiFunction<? super ConfigurationHostName, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<String> values() {
        return getValues();
    }
}
