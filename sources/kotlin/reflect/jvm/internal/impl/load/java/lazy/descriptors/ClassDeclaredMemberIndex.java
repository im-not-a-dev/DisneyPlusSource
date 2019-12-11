package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.p587i0.C12775h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeclaredMemberIndex.kt */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    private final Map<Name, JavaField> fields;
    private final JavaClass jClass;
    /* access modifiers changed from: private */
    public final Function1<JavaMember, Boolean> memberFilter;
    private final Function1<JavaMethod, Boolean> methodFilter = new ClassDeclaredMemberIndex$methodFilter$1(this);
    private final Map<Name, List<JavaMethod>> methods;

    public ClassDeclaredMemberIndex(JavaClass javaClass, Function1<? super JavaMember, Boolean> function1) {
        this.jClass = javaClass;
        this.memberFilter = function1;
        C12775h a = C12788p.m39989a(C13199w.m40577c((Iterable) this.jClass.getMethods()), this.methodFilter);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : a) {
            Name name = ((JavaMethod) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.methods = linkedHashMap;
        C12775h a2 = C12788p.m39989a(C13199w.m40577c((Iterable) this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : a2) {
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
    }

    public JavaField findFieldByName(Name name) {
        return (JavaField) this.fields.get(name);
    }

    public Collection<JavaMethod> findMethodsByName(Name name) {
        List list = (List) this.methods.get(name);
        return list != null ? list : C13185o.m40513a();
    }

    public Set<Name> getFieldNames() {
        C12775h<JavaField> a = C12788p.m39989a(C13199w.m40577c((Iterable) this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaField name : a) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Set<Name> getMethodNames() {
        C12775h<JavaMethod> a = C12788p.m39989a(C13199w.m40577c((Iterable) this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaMethod name : a) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }
}
