package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public interface JavaCallableMemberDescriptor extends CallableMemberDescriptor {
    JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List<ValueParameterData> list, KotlinType kotlinType2, Pair<UserDataKey<?>, ?> pair);
}
