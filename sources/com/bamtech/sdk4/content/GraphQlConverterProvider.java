package com.bamtech.sdk4.content;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000*\u0001\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\tR\u0012\u0010\u0004\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0012\u0010\u0013\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0012\u0010\u0015\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0012\u0010\u0017\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0012\u0010\u0019\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007R\u0012\u0010\u001b\u001a\u00020\u0005X\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/GraphQlConverterProvider;", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "converters", "(Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "byte", "Lcom/bamtech/core/networking/converters/Converter;", "getByte", "()Lcom/bamtech/core/networking/converters/Converter;", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "getConverter", "()Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "setConverter", "(Lcom/bamtech/sdk4/content/GraphQlResponseConverter;)V", "defaultConverter", "com/bamtech/sdk4/content/GraphQlConverterProvider$defaultConverter$1", "Lcom/bamtech/sdk4/content/GraphQlConverterProvider$defaultConverter$1;", "dustEventConverter", "getDustEventConverter", "identity", "getIdentity", "identityConverterWithNulls", "getIdentityConverterWithNulls", "identityForStorage", "getIdentityForStorage", "snake", "getSnake", "string", "getString", "registerConverter", "", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlConverterProvider.kt */
public final class GraphQlConverterProvider implements ConverterProvider {
    private GraphQlResponseConverter converter = this.defaultConverter;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    private final GraphQlConverterProvider$defaultConverter$1 defaultConverter = new GraphQlConverterProvider$defaultConverter$1(this);

    public GraphQlConverterProvider(ConverterProvider converterProvider) {
        this.converters = converterProvider;
    }

    public Converter getByte() {
        return this.converters.getByte();
    }

    public final GraphQlResponseConverter getConverter() {
        return this.converter;
    }

    public Converter getDustEventConverter() {
        return this.converters.getDustEventConverter();
    }

    public Converter getIdentity() {
        return this.converters.getIdentity();
    }

    public Converter getIdentityConverterWithNulls() {
        return this.converters.getIdentityConverterWithNulls();
    }

    public Converter getSnake() {
        return this.converters.getSnake();
    }

    public Converter getString() {
        return this.converters.getString();
    }

    public final void registerConverter(GraphQlResponseConverter graphQlResponseConverter) {
        this.converter = graphQlResponseConverter;
    }
}
