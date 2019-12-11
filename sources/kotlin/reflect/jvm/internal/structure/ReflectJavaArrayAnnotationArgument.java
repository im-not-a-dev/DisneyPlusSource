package kotlin.reflect.jvm.internal.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.Factory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016R\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "values", "", "(Lorg/jetbrains/kotlin/name/Name;[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getElements", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {
    private final Object[] values;

    public ReflectJavaArrayAnnotationArgument(Name name, Object[] objArr) {
        super(name);
        this.values = objArr;
    }

    public List<ReflectJavaAnnotationArgument> getElements() {
        Object[] objArr = this.values;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            Factory factory = ReflectJavaAnnotationArgument.Factory;
            if (obj != null) {
                arrayList.add(factory.create(obj, null));
                i++;
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
        return arrayList;
    }
}
