package com.bamtech.sdk4.service;

import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClass;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "it", "Lkotlin/reflect/KClass;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ServiceException.kt */
final class ServiceExceptionCase$Companion$getFirstMatch$2 extends C12881k implements Function1<KClass<?>, ServiceExceptionCase> {
    public static final ServiceExceptionCase$Companion$getFirstMatch$2 INSTANCE = new ServiceExceptionCase$Companion$getFirstMatch$2();

    ServiceExceptionCase$Companion$getFirstMatch$2() {
        super(1);
    }

    public final ServiceExceptionCase invoke(KClass<?> kClass) {
        Object objectInstance = kClass.getObjectInstance();
        if (objectInstance != null) {
            return (ServiceExceptionCase) objectInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.service.ServiceExceptionCase");
    }
}
