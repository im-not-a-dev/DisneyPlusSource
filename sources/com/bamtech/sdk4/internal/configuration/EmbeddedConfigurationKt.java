package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration.EmbeddedConfigurationBuilder;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"embeddedConfiguration", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "init", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration$EmbeddedConfigurationBuilder;", "", "Lkotlin/ExtensionFunctionType;", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: EmbeddedConfiguration.kt */
public final class EmbeddedConfigurationKt {
    public static final EmbeddedConfiguration embeddedConfiguration(Function1<? super EmbeddedConfigurationBuilder, C13145v> function1) {
        return new EmbeddedConfigurationBuilder(function1).build();
    }
}
