package com.bamtech.shadow.gson.p050r;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bamtech.shadow.gson.r.a */
/* compiled from: Expose */
public @interface C2244a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
