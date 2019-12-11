package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: AdditionalClassPartsProvider.kt */
public interface AdditionalClassPartsProvider {

    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class None implements AdditionalClassPartsProvider {
        public static final None INSTANCE = new None();

        private None() {
        }

        public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
            return C13185o.m40513a();
        }

        public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
            return C13185o.m40513a();
        }

        public Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
            return C13185o.m40513a();
        }

        public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
            return C13185o.m40513a();
        }
    }

    Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor);

    Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor);

    Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor);

    Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor);
}
