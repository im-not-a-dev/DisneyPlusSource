package com.bamtech.sdk4.content;

import com.bamtech.core.networking.converters.C1684a;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001b\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, mo31007d2 = {"com/bamtech/sdk4/content/GraphQlConverterProvider$defaultConverter$1", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "identity", "Lcom/bamtech/core/networking/converters/Converter;", "getIdentity", "()Lcom/bamtech/core/networking/converters/Converter;", "deserialize", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "json", "", "type", "Ljava/lang/reflect/Type;", "serialize", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlConverterProvider.kt */
public final class GraphQlConverterProvider$defaultConverter$1 implements GraphQlResponseConverter {
    private final Converter identity;

    GraphQlConverterProvider$defaultConverter$1(GraphQlConverterProvider graphQlConverterProvider) {
        this.identity = graphQlConverterProvider.converters.getIdentity();
    }

    public <T> GraphQlResponse<T> deserialize(String str, Type type) {
        TypeToken parameterized = TypeToken.getParameterized(GraphQlResponse.class, type);
        C12880j.m40222a((Object) parameterized, "TypeToken.getParameteriz…sponse::class.java, type)");
        Type type2 = parameterized.getType();
        Converter converter = this.identity;
        if (converter != null) {
            C1684a aVar = (C1684a) converter;
            C12880j.m40222a((Object) type2, "parameterizedType");
            return (GraphQlResponse) aVar.deserialize(str, type2);
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtech.core.networking.converters.JsonTypeConverter");
    }

    public <T> String serialize(T t) {
        return this.identity.serialize(t);
    }
}
