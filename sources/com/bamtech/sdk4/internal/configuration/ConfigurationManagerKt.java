package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.Storage.DefaultImpls;
import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\t\u001a\u00020\n*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\f"}, mo31007d2 = {"CONFIGURATION_FETCH", "", "getCONFIGURATION_FETCH", "()Ljava/lang/String;", "getConfiguration", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "Lcom/bamtech/sdk4/internal/core/Storage;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "saveConfiguration", "", "configuration", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationManager.kt */
public final class ConfigurationManagerKt {
    /* access modifiers changed from: private */
    public static final String getCONFIGURATION_FETCH() {
        return "urn:bamtech:dust:bamsdk:service:configuration:loadRemote";
    }

    public static final Configuration getConfiguration(Storage storage, Converter converter) {
        Storage storage2 = storage;
        String str = (String) DefaultImpls.get$default(storage2, "CONFIGURATION", C12895y.m40230a(String.class), null, 4, null);
        if (str != null) {
            return (Configuration) converter.mo7495a(str, Configuration.class);
        }
        return null;
    }

    public static final void saveConfiguration(Storage storage, Configuration configuration, Converter converter) {
        Storage storage2 = storage;
        DefaultImpls.save$default(storage2, "CONFIGURATION", converter.serialize(configuration), null, 4, null);
    }
}
