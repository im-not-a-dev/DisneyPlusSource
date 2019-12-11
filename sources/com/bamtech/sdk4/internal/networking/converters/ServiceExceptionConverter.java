package com.bamtech.sdk4.internal.networking.converters;

import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonObject;
import com.bamtech.shadow.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0002¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/converters/ServiceExceptionConverter;", "Lcom/bamtech/shadow/gson/JsonSerializer;", "Lcom/bamtech/sdk4/service/ServiceException;", "()V", "serialize", "Lcom/bamtech/shadow/gson/JsonElement;", "exception", "type", "Ljava/lang/reflect/Type;", "context", "Lcom/bamtech/shadow/gson/JsonSerializationContext;", "hasServiceExceptionCase", "", "Companion", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceExceptionConverter.kt */
public final class ServiceExceptionConverter implements C2236m<ServiceException> {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/converters/ServiceExceptionConverter$Companion;", "", "()V", "KEY_ERRORS", "", "KEY_STACK_TRACE", "KEY_TRANSLATABLE", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceExceptionConverter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    private final boolean hasServiceExceptionCase(ServiceException serviceException) {
        return ServiceExceptionCase.Companion.getFirstMatch(serviceException) != null;
    }

    public JsonElement serialize(ServiceException serviceException, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.mo11082a("translatable", Boolean.valueOf(hasServiceExceptionCase(serviceException)));
        jsonObject.mo11081a("errors", jsonSerializationContext.serialize(serviceException.getErrors()));
        StackTraceElement[] stackTrace = serviceException.getStackTrace();
        C12880j.m40222a((Object) stackTrace, "exception.stackTrace");
        if (!(stackTrace.length == 0)) {
            jsonObject.mo11081a("stackTrace", jsonSerializationContext.serialize(serviceException.getStackTrace()));
        }
        return jsonObject;
    }
}
