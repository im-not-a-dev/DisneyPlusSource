package com.bamtech.shadow.gson.p050r;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bamtech.shadow.gson.r.c */
/* compiled from: SerializedName */
public @interface C2246c {
    String[] alternate() default {};

    String value();
}
