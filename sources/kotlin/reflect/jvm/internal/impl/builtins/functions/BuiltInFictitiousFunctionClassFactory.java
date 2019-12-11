package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {
    public static final Companion Companion = new Companion(null);
    private final ModuleDescriptor module;
    private final StorageManager storageManager;

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final KindWithArity parseClassName(String str, FqName fqName) {
            Kind byClassNamePrefix = Kind.Companion.byClassNamePrefix(fqName, str);
            KindWithArity kindWithArity = null;
            if (byClassNamePrefix == null) {
                return null;
            }
            int length = byClassNamePrefix.getClassNamePrefix().length();
            if (str != null) {
                String substring = str.substring(length);
                C12880j.m40222a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                Integer num = toInt(substring);
                if (num != null) {
                    kindWithArity = new KindWithArity(byClassNamePrefix, num.intValue());
                }
                return kindWithArity;
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        }

        private final Integer toInt(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || 9 < charAt) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }

        public final Kind getFunctionalClassKind(String str, FqName fqName) {
            KindWithArity parseClassName = parseClassName(str, fqName);
            if (parseClassName != null) {
                return parseClassName.getKind();
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class KindWithArity {
        private final int arity;
        private final Kind kind;

        public KindWithArity(Kind kind2, int i) {
            this.kind = kind2;
            this.arity = i;
        }

        public final Kind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof KindWithArity) {
                    KindWithArity kindWithArity = (KindWithArity) obj;
                    if (C12880j.m40224a((Object) this.kind, (Object) kindWithArity.kind)) {
                        if (this.arity == kindWithArity.arity) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final Kind getKind() {
            return this.kind;
        }

        public int hashCode() {
            Kind kind2 = this.kind;
            return ((kind2 != null ? kind2.hashCode() : 0) * 31) + this.arity;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("KindWithArity(kind=");
            sb.append(this.kind);
            sb.append(", arity=");
            sb.append(this.arity);
            sb.append(")");
            return sb.toString();
        }
    }

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager2, ModuleDescriptor moduleDescriptor) {
        this.storageManager = storageManager2;
        this.module = moduleDescriptor;
    }

    public ClassDescriptor createClass(ClassId classId) {
        if (!classId.isLocal() && !classId.isNestedClass()) {
            String asString = classId.getRelativeClassName().asString();
            C12880j.m40222a((Object) asString, "classId.relativeClassName.asString()");
            if (!C12833x.m40154a((CharSequence) asString, (CharSequence) "Function", false, 2, (Object) null)) {
                return null;
            }
            FqName packageFqName = classId.getPackageFqName();
            C12880j.m40222a((Object) packageFqName, "classId.packageFqName");
            KindWithArity access$parseClassName = Companion.parseClassName(asString, packageFqName);
            if (access$parseClassName != null) {
                Kind component1 = access$parseClassName.component1();
                int component2 = access$parseClassName.component2();
                List fragments = this.module.getPackage(packageFqName).getFragments();
                ArrayList arrayList = new ArrayList();
                for (Object next : fragments) {
                    if (next instanceof BuiltInsPackageFragment) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (next2 instanceof FunctionInterfacePackageFragment) {
                        arrayList2.add(next2);
                    }
                }
                PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) C13199w.m40591g((List) arrayList2);
                if (packageFragmentDescriptor == null) {
                    packageFragmentDescriptor = (BuiltInsPackageFragment) C13199w.m40589f((List) arrayList);
                }
                return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, component1, component2);
            }
        }
        return null;
    }

    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName) {
        return C13188p0.m40531a();
    }

    public boolean shouldCreateClass(FqName fqName, Name name) {
        String asString = name.asString();
        C12880j.m40222a((Object) asString, "name.asString()");
        if ((C12832w.m40123b(asString, "Function", false, 2, null) || C12832w.m40123b(asString, "KFunction", false, 2, null) || C12832w.m40123b(asString, "SuspendFunction", false, 2, null) || C12832w.m40123b(asString, "KSuspendFunction", false, 2, null)) && Companion.parseClassName(asString, fqName) != null) {
            return true;
        }
        return false;
    }
}
