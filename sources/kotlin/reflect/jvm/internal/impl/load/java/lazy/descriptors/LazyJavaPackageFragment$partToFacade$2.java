package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.WhenMappings;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* compiled from: LazyJavaPackageFragment.kt */
final class LazyJavaPackageFragment$partToFacade$2 extends C12881k implements Function0<HashMap<JvmClassName, JvmClassName>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.this$0 = lazyJavaPackageFragment;
        super(0);
    }

    public final HashMap<JvmClassName, JvmClassName> invoke() {
        HashMap<JvmClassName, JvmClassName> hashMap = new HashMap<>();
        for (Entry entry : this.this$0.getBinaryClasses$descriptors_jvm().entrySet()) {
            String str = (String) entry.getKey();
            KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) entry.getValue();
            JvmClassName byInternalName = JvmClassName.byInternalName(str);
            C12880j.m40222a((Object) byInternalName, "JvmClassName.byInternalName(partInternalName)");
            KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
            int i = WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
            if (i == 1) {
                String multifileClassName = classHeader.getMultifileClassName();
                if (multifileClassName != null) {
                    JvmClassName byInternalName2 = JvmClassName.byInternalName(multifileClassName);
                    C12880j.m40222a((Object) byInternalName2, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    hashMap.put(byInternalName, byInternalName2);
                }
            } else if (i == 2) {
                hashMap.put(byInternalName, byInternalName);
            }
        }
        return hashMap;
    }
}
