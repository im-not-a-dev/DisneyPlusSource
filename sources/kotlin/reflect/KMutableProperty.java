package kotlin.reflect;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.reflect.KProperty.Accessor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0007R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lkotlin/reflect/KMutableProperty;", "R", "Lkotlin/reflect/KProperty;", "setter", "Lkotlin/reflect/KMutableProperty$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty$Setter;", "Setter", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KProperty.kt */
public interface KMutableProperty<R> extends KProperty<R> {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, mo31007d2 = {"Lkotlin/reflect/KMutableProperty$Setter;", "R", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KProperty.kt */
    public interface Setter<R> extends Accessor<R>, KFunction<C13145v> {
    }

    Setter<R> getSetter();
}
