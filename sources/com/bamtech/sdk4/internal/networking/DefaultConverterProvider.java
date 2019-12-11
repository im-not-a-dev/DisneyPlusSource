package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/DefaultConverterProvider;", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "identity", "Lcom/bamtech/core/networking/converters/Converter;", "snake", "string", "byte", "identityConverterWithNulls", "identityForStorage", "dustEventConverter", "(Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;Lcom/bamtech/core/networking/converters/Converter;)V", "getByte", "()Lcom/bamtech/core/networking/converters/Converter;", "getDustEventConverter", "getIdentity", "getIdentityConverterWithNulls", "getIdentityForStorage", "getSnake", "getString", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConverterProvider.kt */
public final class DefaultConverterProvider implements ConverterProvider {

    /* renamed from: byte reason: not valid java name */
    private final Converter f31946byte;
    private final Converter dustEventConverter;
    private final Converter identity;
    private final Converter identityConverterWithNulls;
    private final Converter identityForStorage;
    private final Converter snake;
    private final Converter string;

    public DefaultConverterProvider(Converter converter, Converter converter2, Converter converter3, Converter converter4, Converter converter5, Converter converter6, Converter converter7) {
        this.identity = converter;
        this.snake = converter2;
        this.string = converter3;
        this.f31946byte = converter4;
        this.identityConverterWithNulls = converter5;
        this.identityForStorage = converter6;
        this.dustEventConverter = converter7;
    }

    public Converter getByte() {
        return this.f31946byte;
    }

    public Converter getDustEventConverter() {
        return this.dustEventConverter;
    }

    public Converter getIdentity() {
        return this.identity;
    }

    public Converter getIdentityConverterWithNulls() {
        return this.identityConverterWithNulls;
    }

    public Converter getIdentityForStorage() {
        return this.identityForStorage;
    }

    public Converter getSnake() {
        return this.snake;
    }

    public Converter getString() {
        return this.string;
    }
}
