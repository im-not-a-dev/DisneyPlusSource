package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {
    public static final Factory Factory = new Factory(null);
    private final Name name;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "value", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class Factory {
        private Factory() {
        }

        public final ReflectJavaAnnotationArgument create(Object obj, Name name) {
            if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(obj.getClass())) {
                return new ReflectJavaEnumValueAnnotationArgument(name, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new ReflectJavaArrayAnnotationArgument(name, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new ReflectJavaClassObjectAnnotationArgument(name, (Class) obj);
            }
            return new ReflectJavaLiteralAnnotationArgument(name, obj);
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReflectJavaAnnotationArgument(Name name2) {
        this.name = name2;
    }

    public Name getName() {
        return this.name;
    }
}
