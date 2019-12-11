package com.bamtech.sdk4.internal.networking.converters;

import com.bamtech.sdk4.configuration.DeviceType;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/converters/DeviceTypeConverter;", "Lcom/bamtech/shadow/gson/JsonSerializer;", "Lcom/bamtech/sdk4/configuration/DeviceType;", "()V", "serialize", "Lcom/bamtech/shadow/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "context", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceTypeConverter.kt */
public final class DeviceTypeConverter implements C2236m<DeviceType> {
    public JsonElement serialize(DeviceType deviceType, Type type, JsonSerializationContext jsonSerializationContext) {
        return new C2235l(String.valueOf(deviceType));
    }
}
