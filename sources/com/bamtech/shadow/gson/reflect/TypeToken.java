package com.bamtech.shadow.gson.reflect;

import com.bamtech.shadow.gson.internal.C2135a;
import com.bamtech.shadow.gson.internal.C2136b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeToken<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    protected TypeToken() {
        this.type = getSuperclassTypeParameter(getClass());
        this.rawType = C2136b.m8301e(this.type);
        this.hashCode = this.type.hashCode();
    }

    public static TypeToken<?> get(Type type2) {
        return new TypeToken<>(type2);
    }

    public static TypeToken<?> getParameterized(Type type2, Type... typeArr) {
        return new TypeToken<>(C2136b.m8288a((Type) null, type2, typeArr));
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C2136b.m8296b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C2136b.m8295a(this.type, ((TypeToken) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C2136b.m8304h(this.type);
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    TypeToken(Type type2) {
        C2135a.m8282a(type2);
        this.type = C2136b.m8296b(type2);
        this.rawType = C2136b.m8301e(this.type);
        this.hashCode = this.type.hashCode();
    }
}
