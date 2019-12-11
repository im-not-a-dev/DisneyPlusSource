package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$enumEntryIndex$1 extends C12881k implements Function0<Map<Name, ? extends JavaField>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.this$0 = lazyJavaClassMemberScope;
        super(0);
    }

    public final Map<Name, JavaField> invoke() {
        Collection fields = this.this$0.jClass.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object next : fields) {
            if (((JavaField) next).isEnumEntry()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put(((JavaField) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
