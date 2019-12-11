package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class AnnotationTypeQualifierResolver {
    private final boolean disabled = this.jsr305State.getDisabled();
    private final Jsr305State jsr305State;
    private final MemoizedFunctionToNullable<ClassDescriptor, AnnotationDescriptor> resolvedNicknames;

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum QualifierApplicabilityType {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class TypeQualifierWithApplicability {
        private final int applicability;
        private final AnnotationDescriptor typeQualifier;

        public TypeQualifierWithApplicability(AnnotationDescriptor annotationDescriptor, int i) {
            this.typeQualifier = annotationDescriptor;
            this.applicability = i;
        }

        private final boolean isApplicableConsideringMask(QualifierApplicabilityType qualifierApplicabilityType) {
            return ((1 << qualifierApplicabilityType.ordinal()) & this.applicability) != 0;
        }

        private final boolean isApplicableTo(QualifierApplicabilityType qualifierApplicabilityType) {
            return isApplicableConsideringMask(QualifierApplicabilityType.TYPE_USE) || isApplicableConsideringMask(qualifierApplicabilityType);
        }

        public final AnnotationDescriptor component1() {
            return this.typeQualifier;
        }

        public final List<QualifierApplicabilityType> component2() {
            QualifierApplicabilityType[] values = QualifierApplicabilityType.values();
            ArrayList arrayList = new ArrayList();
            for (QualifierApplicabilityType qualifierApplicabilityType : values) {
                if (isApplicableTo(qualifierApplicabilityType)) {
                    arrayList.add(qualifierApplicabilityType);
                }
            }
            return arrayList;
        }
    }

    public AnnotationTypeQualifierResolver(StorageManager storageManager, Jsr305State jsr305State2) {
        this.jsr305State = jsr305State2;
        this.resolvedNicknames = storageManager.createMemoizedFunctionWithNullableValues(new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    /* access modifiers changed from: private */
    public final AnnotationDescriptor computeTypeQualifierNickname(ClassDescriptor classDescriptor) {
        AnnotationDescriptor annotationDescriptor;
        if (!classDescriptor.getAnnotations().hasAnnotation(AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
            return null;
        }
        Iterator it = classDescriptor.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                annotationDescriptor = null;
                break;
            }
            annotationDescriptor = resolveTypeQualifierAnnotation((AnnotationDescriptor) it.next());
            if (annotationDescriptor != null) {
                break;
            }
        }
        return annotationDescriptor;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> mapConstantToQualifierApplicabilityTypes(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue
            if (r0 == 0) goto L_0x0029
            kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r1
            java.util.List r1 = r2.mapConstantToQualifierApplicabilityTypes(r1)
            kotlin.p590y.C13196t.m40545a(r0, r1)
            goto L_0x0015
        L_0x0029:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue
            if (r0 == 0) goto L_0x0071
            kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) r3
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r3.getEnumEntryName()
            java.lang.String r3 = r3.getIdentifier()
            int r0 = r3.hashCode()
            switch(r0) {
                case -2024225567: goto L_0x0060;
                case 66889946: goto L_0x0055;
                case 107598562: goto L_0x004a;
                case 446088073: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x006b
        L_0x003f:
            java.lang.String r0 = "PARAMETER"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER
            goto L_0x006c
        L_0x004a:
            java.lang.String r0 = "TYPE_USE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.TYPE_USE
            goto L_0x006c
        L_0x0055:
            java.lang.String r0 = "FIELD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD
            goto L_0x006c
        L_0x0060:
            java.lang.String r0 = "METHOD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r3 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            java.util.List r0 = kotlin.p590y.C13185o.m40517b(r3)
            goto L_0x0075
        L_0x0071:
            java.util.List r0 = kotlin.p590y.C13185o.m40513a()
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.mapConstantToQualifierApplicabilityTypes(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue):java.util.List");
    }

    private final ReportLevel migrationAnnotationStatus(ClassDescriptor classDescriptor) {
        AnnotationDescriptor findAnnotation = classDescriptor.getAnnotations().findAnnotation(AnnotationTypeQualifierResolverKt.getMIGRATION_ANNOTATION_FQNAME());
        ReportLevel reportLevel = null;
        ConstantValue firstArgument = findAnnotation != null ? DescriptorUtilsKt.firstArgument(findAnnotation) : null;
        if (!(firstArgument instanceof EnumValue)) {
            firstArgument = null;
        }
        EnumValue enumValue = (EnumValue) firstArgument;
        if (enumValue != null) {
            ReportLevel migration = this.jsr305State.getMigration();
            if (migration != null) {
                return migration;
            }
            String asString = enumValue.getEnumEntryName().asString();
            int hashCode = asString.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode == 2656902 && asString.equals("WARN")) {
                        reportLevel = ReportLevel.WARN;
                    }
                } else if (asString.equals("STRICT")) {
                    reportLevel = ReportLevel.STRICT;
                }
            } else if (asString.equals("IGNORE")) {
                reportLevel = ReportLevel.IGNORE;
            }
        }
        return reportLevel;
    }

    private final AnnotationDescriptor resolveTypeQualifierNickname(ClassDescriptor classDescriptor) {
        if (classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return (AnnotationDescriptor) this.resolvedNicknames.invoke(classDescriptor);
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final ReportLevel resolveJsr305AnnotationState(AnnotationDescriptor annotationDescriptor) {
        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(annotationDescriptor);
        if (resolveJsr305CustomState != null) {
            return resolveJsr305CustomState;
        }
        return this.jsr305State.getGlobal();
    }

    public final ReportLevel resolveJsr305CustomState(AnnotationDescriptor annotationDescriptor) {
        Map user = this.jsr305State.getUser();
        FqName fqName = annotationDescriptor.getFqName();
        ReportLevel reportLevel = null;
        ReportLevel reportLevel2 = (ReportLevel) user.get(fqName != null ? fqName.asString() : null);
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass != null) {
            reportLevel = migrationAnnotationStatus(annotationClass);
        }
        return reportLevel;
    }

    public final NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation(AnnotationDescriptor annotationDescriptor) {
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = (NullabilityQualifierWithApplicability) AnnotationTypeQualifierResolverKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(annotationDescriptor.getFqName());
        if (nullabilityQualifierWithApplicability != null) {
            NullabilityQualifierWithMigrationStatus component1 = nullabilityQualifierWithApplicability.component1();
            Collection component2 = nullabilityQualifierWithApplicability.component2();
            ReportLevel resolveJsr305AnnotationState = resolveJsr305AnnotationState(annotationDescriptor);
            if (!(resolveJsr305AnnotationState != ReportLevel.IGNORE)) {
                resolveJsr305AnnotationState = null;
            }
            if (resolveJsr305AnnotationState != null) {
                return new NullabilityQualifierWithApplicability(NullabilityQualifierWithMigrationStatus.copy$default(component1, null, resolveJsr305AnnotationState.isWarning(), 1, null), component2);
            }
        }
        return null;
    }

    public final AnnotationDescriptor resolveTypeQualifierAnnotation(AnnotationDescriptor annotationDescriptor) {
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null) {
            return null;
        }
        if (AnnotationTypeQualifierResolverKt.isAnnotatedWithTypeQualifier(annotationClass)) {
            return annotationDescriptor;
        }
        return resolveTypeQualifierNickname(annotationClass);
    }

    public final TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation(AnnotationDescriptor annotationDescriptor) {
        Object obj;
        boolean z;
        List list;
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass != null) {
            if (!annotationClass.getAnnotations().hasAnnotation(AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                ClassDescriptor annotationClass2 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
                if (annotationClass2 != null) {
                    AnnotationDescriptor findAnnotation = annotationClass2.getAnnotations().findAnnotation(AnnotationTypeQualifierResolverKt.getTYPE_QUALIFIER_DEFAULT_FQNAME());
                    if (findAnnotation != null) {
                        Map allValueArguments = findAnnotation.getAllValueArguments();
                        ArrayList<QualifierApplicabilityType> arrayList = new ArrayList<>();
                        for (Entry entry : allValueArguments.entrySet()) {
                            Name name = (Name) entry.getKey();
                            ConstantValue constantValue = (ConstantValue) entry.getValue();
                            if (Intrinsics.areEqual((Object) name, (Object) JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                                list = mapConstantToQualifierApplicabilityTypes(constantValue);
                            } else {
                                list = C13185o.m40513a();
                            }
                            C13196t.m40545a((Collection) arrayList, (Iterable) list);
                        }
                        int i = 0;
                        for (QualifierApplicabilityType ordinal : arrayList) {
                            i |= 1 << ordinal.ordinal();
                        }
                        Iterator it = annotationClass.getAnnotations().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (resolveTypeQualifierAnnotation((AnnotationDescriptor) obj) != null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        AnnotationDescriptor annotationDescriptor2 = (AnnotationDescriptor) obj;
                        if (annotationDescriptor2 != null) {
                            return new TypeQualifierWithApplicability(annotationDescriptor2, i);
                        }
                        return null;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                }
                Intrinsics.throwNpe();
                throw null;
            }
        }
        return null;
    }
}
