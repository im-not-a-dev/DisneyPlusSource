package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: IntegerValueTypeConstructor.kt */
public final class IntegerValueTypeConstructor implements TypeConstructor {
    private final ModuleDescriptor module;
    private final ArrayList<KotlinType> supertypes;
    private final long value;

    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    public Void getDeclarationDescriptor() {
        return null;
    }

    public List<TypeParameterDescriptor> getParameters() {
        return C13185o.m40513a();
    }

    public Collection<KotlinType> getSupertypes() {
        return this.supertypes;
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntegerValueType(");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
