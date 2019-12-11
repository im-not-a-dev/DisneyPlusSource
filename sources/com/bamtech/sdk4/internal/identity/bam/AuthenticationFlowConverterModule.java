package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.converters.shadow.gson.C1689a;
import com.bamtech.core.networking.converters.shadow.gson.JodaTimeTypeAdapter;
import com.bamtech.sdk4.identity.SecurityAction;
import com.bamtech.sdk4.identity.SecurityActionConverter;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow;
import com.bamtech.sdk4.internal.networking.DefaultGsonBuilderFactory;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationFlowConverterModule;", "", "()V", "getConverter", "Lcom/bamtech/core/networking/converters/Converter;", "getConverter$plugin_identity_bam", "gsonBuilder", "Lcom/bamtech/shadow/gson/GsonBuilder;", "identityConverter", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityPluginComponent.kt */
public final class AuthenticationFlowConverterModule {
    public final GsonBuilder gsonBuilder() {
        GsonBuilder a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11066a((Type) AuthenticationFlow.class, (Object) new AuthenticationFlowProviderConverter()).mo11066a((Type) SecurityAction.class, (Object) new SecurityActionConverter());
        C12880j.m40222a((Object) a, "DefaultGsonBuilderFactor…ecurityActionConverter())");
        return a;
    }

    public final Converter identityConverter(GsonBuilder gsonBuilder) {
        Gson a = gsonBuilder.mo11063a();
        C12880j.m40222a((Object) a, "gsonBuilder.create()");
        return new C1689a(a);
    }
}
