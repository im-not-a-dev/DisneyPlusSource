package p163g.p449j.p487c.p489x;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.j.c.x.b */
/* compiled from: JsonAdapter */
public @interface C11575b {
    boolean nullSafe() default true;

    Class<?> value();
}
