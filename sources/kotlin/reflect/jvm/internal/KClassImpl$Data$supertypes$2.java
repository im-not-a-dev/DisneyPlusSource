package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$supertypes$2 extends C12881k implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$supertypes$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final List<KTypeImpl> invoke() {
        boolean z;
        TypeConstructor typeConstructor = this.this$0.getDescriptor().getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "descriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(supertypes.size());
        for (KotlinType kotlinType : supertypes) {
            C12880j.m40222a((Object) kotlinType, "kotlinType");
            arrayList.add(new KTypeImpl(kotlinType, new KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(kotlinType, this)));
        }
        if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.this$0.getDescriptor())) {
            boolean z2 = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ClassDescriptor classDescriptorForType = DescriptorUtils.getClassDescriptorForType(((KTypeImpl) it.next()).getType());
                    C12880j.m40222a((Object) classDescriptorForType, "DescriptorUtils.getClassDescriptorForType(it.type)");
                    ClassKind kind = classDescriptorForType.getKind();
                    C12880j.m40222a((Object) kind, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                    if (kind == ClassKind.INTERFACE || kind == ClassKind.ANNOTATION_CLASS) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                SimpleType anyType = DescriptorUtilsKt.getBuiltIns(this.this$0.getDescriptor()).getAnyType();
                C12880j.m40222a((Object) anyType, "descriptor.builtIns.anyType");
                arrayList.add(new KTypeImpl(anyType, C129133.INSTANCE));
            }
        }
        return CollectionsKt.compact(arrayList);
    }
}
