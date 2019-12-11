package com.bamtech.sdk4.content;

import java.lang.reflect.Type;
import kotlin.Metadata;
import okio.BufferedSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/BufferedGraphQlResponseConverter;", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "()V", "deserialize", "", "T", "json", "", "type", "Ljava/lang/reflect/Type;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "source", "Lokio/BufferedSource;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BufferedGraphQlResponseConverter.kt */
public abstract class BufferedGraphQlResponseConverter implements GraphQlResponseConverter {
    public abstract <T> GraphQlResponse<T> deserialize(BufferedSource bufferedSource, Type type);

    public final <T> Void deserialize(String str, Type type) {
        throw new UnsupportedOperationException("This method should never be called. Instead call the methods which takes a BufferedSource");
    }
}
