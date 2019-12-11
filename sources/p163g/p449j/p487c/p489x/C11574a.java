package p163g.p449j.p487c.p489x;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.j.c.x.a */
/* compiled from: Expose */
public @interface C11574a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
