package com.bamtech.sdk4.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClass;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KClass;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ServiceException.kt */
final class ServiceExceptionCase$Companion$getFirstMatch$1 extends C12881k implements Function1<KClass<?>, Boolean> {
    public static final ServiceExceptionCase$Companion$getFirstMatch$1 INSTANCE = new ServiceExceptionCase$Companion$getFirstMatch$1();

    ServiceExceptionCase$Companion$getFirstMatch$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((KClass) obj));
    }

    public final boolean invoke(KClass<?> kClass) {
        return kClass.getObjectInstance() instanceof ServiceExceptionCase;
    }
}
