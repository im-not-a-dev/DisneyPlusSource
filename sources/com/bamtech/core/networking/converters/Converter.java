package com.bamtech.core.networking.converters;

import kotlin.Metadata;
import okio.BufferedSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&¢\u0006\u0002\u0010\fJ)\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&¢\u0006\u0002\u0010\u000eJ)\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H&¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/core/networking/converters/Converter;", "", "mediaType", "Lokhttp3/MediaType;", "getMediaType", "()Lokhttp3/MediaType;", "deserialize", "T", "value", "Ljava/io/InputStream;", "type", "Ljava/lang/Class;", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/lang/Class;)Ljava/lang/Object;", "serialize", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Converter.kt */
public interface Converter {
    /* renamed from: a */
    <T> T mo7495a(String str, Class<?> cls);

    /* renamed from: a */
    <T> T mo7496a(BufferedSource bufferedSource, Class<?> cls);

    <T> String serialize(T t);
}
