package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "", "byte", "Lcom/bamtech/core/networking/converters/Converter;", "getByte", "()Lcom/bamtech/core/networking/converters/Converter;", "dustEventConverter", "getDustEventConverter", "identity", "getIdentity", "identityConverterWithNulls", "getIdentityConverterWithNulls", "identityForStorage", "getIdentityForStorage", "snake", "getSnake", "string", "getString", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConverterProvider.kt */
public interface ConverterProvider {
    Converter getByte();

    Converter getDustEventConverter();

    Converter getIdentity();

    Converter getIdentityConverterWithNulls();

    Converter getSnake();

    Converter getString();
}
