package com.bamtech.sdk4.content;

import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001b\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "", "deserialize", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "json", "", "type", "Ljava/lang/reflect/Type;", "serialize", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlResponseConverter.kt */
public interface GraphQlResponseConverter {
    <T> GraphQlResponse<T> deserialize(String str, Type type);

    <T> String serialize(T t);
}
