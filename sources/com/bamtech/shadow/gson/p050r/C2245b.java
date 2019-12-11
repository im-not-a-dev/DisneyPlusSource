package com.bamtech.shadow.gson.p050r;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bamtech.shadow.gson.r.b */
/* compiled from: JsonAdapter */
public @interface C2245b {
    boolean nullSafe() default true;

    Class<?> value();
}
