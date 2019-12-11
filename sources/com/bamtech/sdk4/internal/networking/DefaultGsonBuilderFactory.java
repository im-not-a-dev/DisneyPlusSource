package com.bamtech.sdk4.internal.networking;

import com.bamtech.sdk4.configuration.DeviceType;
import com.bamtech.sdk4.internal.networking.converters.DeviceTypeConverter;
import com.bamtech.shadow.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/DefaultGsonBuilderFactory;", "", "()V", "newBuilderInstance", "Lcom/bamtech/shadow/gson/GsonBuilder;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultGsonBuilderFactory.kt */
public final class DefaultGsonBuilderFactory {
    public static final DefaultGsonBuilderFactory INSTANCE = new DefaultGsonBuilderFactory();

    private DefaultGsonBuilderFactory() {
    }

    public final GsonBuilder newBuilderInstance() {
        GsonBuilder a = new GsonBuilder().mo11069d().mo11067b().mo11066a((Type) DeviceType.class, (Object) new DeviceTypeConverter());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "GsonBuilder()\n          …a, DeviceTypeConverter())");
        return a;
    }
}
