package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: methodSignatureBuilding.kt */
public final class SignatureBuildingComponents {
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* access modifiers changed from: private */
    public final String escapeClassName(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    public final String[] constructors(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("<init>(");
            sb.append(str);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final LinkedHashSet<String> inClass(String str, String... strArr) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str2 : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            linkedHashSet.add(sb.toString());
        }
        return linkedHashSet;
    }

    public final LinkedHashSet<String> inJavaLang(String str, String... strArr) {
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> inJavaUtil(String str, String... strArr) {
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String javaFunction(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/function/");
        sb.append(str);
        return sb.toString();
    }

    public final String javaLang(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("java/lang/");
        sb.append(str);
        return sb.toString();
    }

    public final String javaUtil(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/");
        sb.append(str);
        return sb.toString();
    }

    public final String jvmDescriptor(String str, List<String> list, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        List<String> list2 = list;
        sb.append(C13199w.m40559a(list2, "", null, null, 0, null, SignatureBuildingComponents$jvmDescriptor$1.INSTANCE, 30, null));
        sb.append(')');
        sb.append(escapeClassName(str2));
        return sb.toString();
    }

    public final String signature(ClassDescriptor classDescriptor, String str) {
        return signature(MethodSignatureMappingKt.getInternalName(classDescriptor), str);
    }

    public final String signature(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        return sb.toString();
    }
}
