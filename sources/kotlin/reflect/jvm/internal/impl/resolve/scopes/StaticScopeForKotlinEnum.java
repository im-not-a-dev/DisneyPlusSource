package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: StaticScopeForKotlinEnum.kt */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};
    /* access modifiers changed from: private */
    public final ClassDescriptor containingClass;
    private final NotNullLazyValue functions$delegate;

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor classDescriptor) {
        this.containingClass = classDescriptor;
        boolean z = this.containingClass.getKind() == ClassKind.ENUM_CLASS;
        if (!C13147x.f29590a || z) {
            this.functions$delegate = storageManager.createLazyValue(new StaticScopeForKotlinEnum$functions$2(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class should be an enum: ");
        sb.append(this.containingClass);
        throw new AssertionError(sb.toString());
    }

    private final List<SimpleFunctionDescriptor> getFunctions() {
        return (List) StorageKt.getValue(this.functions$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public Void getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return null;
    }

    public List<SimpleFunctionDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return getFunctions();
    }

    public ArrayList<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        List functions = getFunctions();
        ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList<>(1);
        for (Object next : functions) {
            if (Intrinsics.areEqual((Object) ((SimpleFunctionDescriptor) next).getName(), (Object) name)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
