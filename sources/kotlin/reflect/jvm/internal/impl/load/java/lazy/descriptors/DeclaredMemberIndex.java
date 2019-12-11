package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: DeclaredMemberIndex.kt */
public interface DeclaredMemberIndex {

    /* compiled from: DeclaredMemberIndex.kt */
    public static final class Empty implements DeclaredMemberIndex {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public JavaField findFieldByName(Name name) {
            return null;
        }

        public Set<Name> getFieldNames() {
            return C13188p0.m40531a();
        }

        public Set<Name> getMethodNames() {
            return C13188p0.m40531a();
        }

        public List<JavaMethod> findMethodsByName(Name name) {
            return C13185o.m40513a();
        }
    }

    JavaField findFieldByName(Name name);

    Collection<JavaMethod> findMethodsByName(Name name);

    Set<Name> getFieldNames();

    Set<Name> getMethodNames();
}
