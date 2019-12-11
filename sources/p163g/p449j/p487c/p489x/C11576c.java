package p163g.p449j.p487c.p489x;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.j.c.x.c */
/* compiled from: SerializedName */
public @interface C11576c {
    String[] alternate() default {};

    String value();
}
