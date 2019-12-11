package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.converters.shadow.gson.C1689a;
import com.bamtech.core.networking.converters.shadow.gson.JodaTimeTypeAdapter;
import com.bamtech.sdk4.internal.networking.DefaultGsonBuilderFactory;
import com.bamtech.sdk4.subscription.SubscriptionProvider;
import com.bamtech.sdk4.subscription.SubscriptionProviderConverter;
import com.bamtech.sdk4.subscription.SubscriptionSourceType;
import com.bamtech.sdk4.subscription.SubscriptionSourceTypeConverter;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionConverterModule;", "", "()V", "gsonBuilder", "Lcom/bamtech/shadow/gson/GsonBuilder;", "identityConverter", "Lcom/bamtech/core/networking/converters/Converter;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionModule.kt */
public final class SubscriptionConverterModule {
    public final GsonBuilder gsonBuilder() {
        GsonBuilder a = DefaultGsonBuilderFactory.INSTANCE.newBuilderInstance().mo11066a((Type) DateTime.class, (Object) new JodaTimeTypeAdapter()).mo11066a((Type) SubscriptionProvider.class, (Object) new SubscriptionProviderConverter()).mo11066a((Type) SubscriptionSourceType.class, (Object) new SubscriptionSourceTypeConverter());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "DefaultGsonBuilderFactor…ionSourceTypeConverter())");
        return a;
    }

    public final Converter identityConverter(GsonBuilder gsonBuilder) {
        Gson a = gsonBuilder.mo11063a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "gsonBuilder.create()");
        return new C1689a(a);
    }
}
