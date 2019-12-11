package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, mo31007d2 = {"toRuntimeFqName", "", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptors.runtime"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ReflectKotlinClassFinder.kt */
public final class ReflectKotlinClassFinderKt {
    /* access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String asString = classId.getRelativeClassName().asString();
        C12880j.m40222a((Object) asString, "relativeClassName.asString()");
        String a = C12832w.m40115a(asString, '.', '$', false, 4, (Object) null);
        FqName packageFqName = classId.getPackageFqName();
        C12880j.m40222a((Object) packageFqName, "packageFqName");
        if (packageFqName.isRoot()) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(classId.getPackageFqName());
        sb.append('.');
        sb.append(a);
        return sb.toString();
    }
}
