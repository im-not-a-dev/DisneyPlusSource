package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses {
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes = this.storageManager.createMemoizedFunction(new NotFoundClasses$classes$1(this));
    /* access modifiers changed from: private */
    public final ModuleDescriptor module;
    /* access modifiers changed from: private */
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments = this.storageManager.createMemoizedFunction(new NotFoundClasses$packageFragments$1(this));
    /* access modifiers changed from: private */
    public final StorageManager storageManager;

    /* compiled from: NotFoundClasses.kt */
    private static final class ClassRequest {
        private final ClassId classId;
        private final List<Integer> typeParametersCount;

        public ClassRequest(ClassId classId2, List<Integer> list) {
            this.classId = classId2;
            this.typeParametersCount = list;
        }

        public final ClassId component1() {
            return this.classId;
        }

        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.typeParametersCount, (java.lang.Object) r3.typeParametersCount) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest
                if (r0 == 0) goto L_0x001d
                kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$ClassRequest r3 = (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest) r3
                kotlin.reflect.jvm.internal.impl.name.ClassId r0 = r2.classId
                kotlin.reflect.jvm.internal.impl.name.ClassId r1 = r3.classId
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<java.lang.Integer> r0 = r2.typeParametersCount
                java.util.List<java.lang.Integer> r3 = r3.typeParametersCount
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ClassId classId2 = this.classId;
            int i = 0;
            int hashCode = (classId2 != null ? classId2.hashCode() : 0) * 31;
            List<Integer> list = this.typeParametersCount;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassRequest(classId=");
            sb.append(this.classId);
            sb.append(", typeParametersCount=");
            sb.append(this.typeParametersCount);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: NotFoundClasses.kt */
    public static final class MockClassDescriptor extends ClassDescriptorBase {
        private final boolean isInner;
        private final ClassTypeConstructorImpl typeConstructor;
        private final List<TypeParameterDescriptor> typeParameters;

        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.NO_SOURCE, false);
            this.isInner = z;
            C12757d d = C12762h.m39920d(0, i);
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                int b = ((C13162e0) it).mo31079b();
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(b);
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, Name.identifier(sb.toString()), b));
            }
            this.typeParameters = arrayList;
            this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeParameters, C13186o0.m40524a(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        public ClassDescriptor getCompanionObjectDescriptor() {
            return null;
        }

        public Collection<ClassConstructorDescriptor> getConstructors() {
            return C13188p0.m40531a();
        }

        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.typeParameters;
        }

        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        public Modality getModality() {
            return Modality.FINAL;
        }

        public Collection<ClassDescriptor> getSealedSubclasses() {
            return C13185o.m40513a();
        }

        public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
            return null;
        }

        public Visibility getVisibility() {
            Visibility visibility = Visibilities.PUBLIC;
            Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "Visibilities.PUBLIC");
            return visibility;
        }

        public boolean isActual() {
            return false;
        }

        public boolean isCompanionObject() {
            return false;
        }

        public boolean isData() {
            return false;
        }

        public boolean isExpect() {
            return false;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public boolean isInner() {
            return this.isInner;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ");
            sb.append(getName());
            sb.append(" (not found)");
            return sb.toString();
        }

        public Empty getStaticScope() {
            return Empty.INSTANCE;
        }

        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        public Empty getUnsubstitutedMemberScope() {
            return Empty.INSTANCE;
        }
    }

    public NotFoundClasses(StorageManager storageManager2, ModuleDescriptor moduleDescriptor) {
        this.storageManager = storageManager2;
        this.module = moduleDescriptor;
    }

    public final ClassDescriptor getClass(ClassId classId, List<Integer> list) {
        return (ClassDescriptor) this.classes.invoke(new ClassRequest(classId, list));
    }
}
