package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.DFS.VisitedWithSet;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\u001a+\u0010S\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010U\u001a!\u0010V\u001a\u0002H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u0002H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010W\u001a\u000203*\u0006\u0012\u0002\b\u00030\u00022\n\u0010X\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007\u001a\u001c\u0010Y\u001a\u000203*\u0006\u0012\u0002\b\u00030\u00022\n\u0010Z\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007\u001a-\u0010[\u001a\u0004\u0018\u0001H\u001d\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010U\",\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"(\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e\"$\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013\",\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\",\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"B\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u001d\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c0\u0001\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\",\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\">\u0010#\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002H\u001d\u0012\u0002\b\u00030$0\u0001\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00028FX\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\",\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\"\u0010+\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010.\",\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006\"\u001c\u00102\u001a\u000203*\u0006\u0012\u0002\b\u0003048BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00105\"\u001c\u00106\u001a\u000203*\u0006\u0012\u0002\b\u0003048BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00105\",\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"B\u0010:\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u001d\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c0\u0001\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00028FX\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006\",\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006\">\u0010@\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002H\u001d\u0012\u0002\b\u00030$0\u0001\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00028FX\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006\"6\u0010C\u001a\n\u0012\u0004\u0012\u0002H\u001d\u0018\u00010\u0015\"\b\b\u0000\u0010\u001d*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u001d0\u00028FX\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010F\",\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006\",\u0010J\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030K0\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006\",\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020O*\u0006\u0012\u0002\b\u00030\u00028FX\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010R¨\u0006\\"}, mo31007d2 = {"allSuperclasses", "", "Lkotlin/reflect/KClass;", "allSuperclasses$annotations", "(Lkotlin/reflect/KClass;)V", "getAllSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/Collection;", "allSupertypes", "Lkotlin/reflect/KType;", "allSupertypes$annotations", "getAllSupertypes", "companionObject", "companionObject$annotations", "getCompanionObject", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "companionObjectInstance", "", "companionObjectInstance$annotations", "getCompanionObjectInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "declaredFunctions", "Lkotlin/reflect/KFunction;", "declaredFunctions$annotations", "getDeclaredFunctions", "declaredMemberExtensionFunctions", "declaredMemberExtensionFunctions$annotations", "getDeclaredMemberExtensionFunctions", "declaredMemberExtensionProperties", "Lkotlin/reflect/KProperty2;", "T", "declaredMemberExtensionProperties$annotations", "getDeclaredMemberExtensionProperties", "declaredMemberFunctions", "declaredMemberFunctions$annotations", "getDeclaredMemberFunctions", "declaredMemberProperties", "Lkotlin/reflect/KProperty1;", "declaredMemberProperties$annotations", "getDeclaredMemberProperties", "declaredMembers", "Lkotlin/reflect/KCallable;", "declaredMembers$annotations", "getDeclaredMembers", "defaultType", "defaultType$annotations", "getDefaultType", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "functions", "functions$annotations", "getFunctions", "isExtension", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;)Z", "isNotExtension", "memberExtensionFunctions", "memberExtensionFunctions$annotations", "getMemberExtensionFunctions", "memberExtensionProperties", "memberExtensionProperties$annotations", "getMemberExtensionProperties", "memberFunctions", "memberFunctions$annotations", "getMemberFunctions", "memberProperties", "memberProperties$annotations", "getMemberProperties", "primaryConstructor", "primaryConstructor$annotations", "getPrimaryConstructor", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;", "staticFunctions", "staticFunctions$annotations", "getStaticFunctions", "staticProperties", "Lkotlin/reflect/KProperty0;", "staticProperties$annotations", "getStaticProperties", "superclasses", "", "superclasses$annotations", "getSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "cast", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "createInstance", "isSubclassOf", "base", "isSuperclassOf", "derived", "safeCast", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
public final class KClasses {
    public static /* synthetic */ void allSuperclasses$annotations(KClass kClass) {
    }

    public static /* synthetic */ void allSupertypes$annotations(KClass kClass) {
    }

    public static final <T> T cast(KClass<T> kClass, Object obj) {
        if (!kClass.isInstance(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value cannot be cast to ");
            sb.append(kClass.getQualifiedName());
            throw new C13142s(sb.toString());
        } else if (obj != null) {
            return obj;
        } else {
            throw new C13142s("null cannot be cast to non-null type T");
        }
    }

    public static /* synthetic */ void companionObject$annotations(KClass kClass) {
    }

    public static /* synthetic */ void companionObjectInstance$annotations(KClass kClass) {
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: []
      uses: []
      mth insns count: 43
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x000c A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T createInstance(kotlin.reflect.KClass<T> r9) {
        /*
            java.util.Collection r0 = r9.getConstructors()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x000c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r0.next()
            r6 = r5
            kotlin.reflect.KFunction r6 = (kotlin.reflect.KFunction) r6
            java.util.List r6 = r6.getParameters()
            boolean r7 = r6 instanceof java.util.Collection
            r8 = 1
            if (r7 == 0) goto L_0x002a
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x002a
        L_0x0028:
            r6 = 1
            goto L_0x0041
        L_0x002a:
            java.util.Iterator r6 = r6.iterator()
        L_0x002e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0028
            java.lang.Object r7 = r6.next()
            kotlin.reflect.KParameter r7 = (kotlin.reflect.KParameter) r7
            boolean r7 = r7.isOptional()
            if (r7 != 0) goto L_0x002e
            r6 = 0
        L_0x0041:
            if (r6 == 0) goto L_0x000c
            if (r3 == 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r4 = r5
            r3 = 1
            goto L_0x000c
        L_0x0049:
            if (r3 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            if (r2 == 0) goto L_0x005a
            java.util.Map r9 = kotlin.p590y.C13173j0.m40350a()
            java.lang.Object r9 = r2.callBy(r9)
            return r9
        L_0x005a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class should have a single no-arg constructor: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.KClasses.createInstance(kotlin.reflect.KClass):java.lang.Object");
    }

    public static /* synthetic */ void declaredFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void declaredMemberExtensionFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void declaredMemberExtensionProperties$annotations(KClass kClass) {
    }

    public static /* synthetic */ void declaredMemberFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void declaredMemberProperties$annotations(KClass kClass) {
    }

    public static /* synthetic */ void declaredMembers$annotations(KClass kClass) {
    }

    public static /* synthetic */ void defaultType$annotations(KClass kClass) {
    }

    public static /* synthetic */ void functions$annotations(KClass kClass) {
    }

    public static final Collection<KClass<?>> getAllSuperclasses(KClass<?> kClass) {
        Collection<KType> allSupertypes = getAllSupertypes(kClass);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) allSupertypes, 10));
        for (KType kType : allSupertypes) {
            KClassifier classifier = kType.getClassifier();
            if (!(classifier instanceof KClass)) {
                classifier = null;
            }
            KClass kClass2 = (KClass) classifier;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Supertype not a class: ");
                sb.append(kType);
                throw new KotlinReflectionInternalError(sb.toString());
            }
        }
        return arrayList;
    }

    public static final Collection<KType> getAllSupertypes(KClass<?> kClass) {
        Object dfs = DFS.dfs(kClass.getSupertypes(), KClasses$allSupertypes$1.INSTANCE, new VisitedWithSet(), new KClasses$allSupertypes$2());
        Intrinsics.checkReturnedValueIsNotNull(dfs, "DFS.dfs(\n            sup…    }\n            }\n    )");
        return (Collection) dfs;
    }

    public static final KClass<?> getCompanionObject(KClass<?> kClass) {
        Object obj;
        Iterator it = kClass.getNestedClasses().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KClass kClass2 = (KClass) obj;
            if (kClass2 != null) {
                if (((KClassImpl) kClass2).getDescriptor().isCompanionObject()) {
                    break;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        return (KClass) obj;
    }

    public static final Object getCompanionObjectInstance(KClass<?> kClass) {
        KClass companionObject = getCompanionObject(kClass);
        if (companionObject != null) {
            return companionObject.getObjectInstance();
        }
        return null;
    }

    public static final Collection<KFunction<?>> getDeclaredFunctions(KClass<?> kClass) {
        Collection declaredMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : declaredMembers) {
            if (next instanceof KFunction) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KFunction<?>> getDeclaredMemberExtensionFunctions(KClass<?> kClass) {
        Collection declaredNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<KProperty2<T, ?, ?>> getDeclaredMemberExtensionProperties(KClass<T> kClass) {
        Collection declaredNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KFunction<?>> getDeclaredMemberFunctions(KClass<?> kClass) {
        Collection declaredNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<KProperty1<T, ?>> getDeclaredMemberProperties(KClass<T> kClass) {
        Collection declaredNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KCallable<?>> getDeclaredMembers(KClass<?> kClass) {
        return ((Data) ((KClassImpl) kClass).getData().invoke()).getDeclaredMembers();
    }

    public static final KType getDefaultType(KClass<?> kClass) {
        SimpleType defaultType = ((KClassImpl) kClass).getDescriptor().getDefaultType();
        Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "(this as KClassImpl<*>).descriptor.defaultType");
        return new KTypeImpl(defaultType, new KClasses$defaultType$1(kClass));
    }

    public static final Collection<KFunction<?>> getFunctions(KClass<?> kClass) {
        Collection members = kClass.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : members) {
            if (next instanceof KFunction) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KFunction<?>> getMemberExtensionFunctions(KClass<?> kClass) {
        Collection allNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<KProperty2<T, ?, ?>> getMemberExtensionProperties(KClass<T> kClass) {
        Collection allNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KFunction<?>> getMemberFunctions(KClass<?> kClass) {
        Collection allNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<KProperty1<T, ?>> getMemberProperties(KClass<T> kClass) {
        Collection allNonStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> KFunction<T> getPrimaryConstructor(KClass<T> kClass) {
        Object obj;
        Iterator it = ((KClassImpl) kClass).getConstructors().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KFunction kFunction = (KFunction) obj;
            if (kFunction != null) {
                FunctionDescriptor descriptor = ((KFunctionImpl) kFunction).getDescriptor();
                if (descriptor != null) {
                    if (((ConstructorDescriptor) descriptor).isPrimary()) {
                        break;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            }
        }
        return (KFunction) obj;
    }

    public static final Collection<KFunction<?>> getStaticFunctions(KClass<?> kClass) {
        Collection allStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allStaticMembers) {
            if (next instanceof KFunction) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Collection<KProperty0<?>> getStaticProperties(KClass<?> kClass) {
        Collection allStaticMembers = ((Data) ((KClassImpl) kClass).getData().invoke()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object next : allStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) next;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty0)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List<KClass<?>> getSuperclasses(KClass<?> kClass) {
        List<KType> supertypes = kClass.getSupertypes();
        ArrayList arrayList = new ArrayList();
        for (KType classifier : supertypes) {
            KClassifier classifier2 = classifier.getClassifier();
            if (!(classifier2 instanceof KClass)) {
                classifier2 = null;
            }
            KClass kClass2 = (KClass) classifier2;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    private static final boolean isExtension(KCallableImpl<?> kCallableImpl) {
        return kCallableImpl.getDescriptor().getExtensionReceiverParameter() != null;
    }

    private static final boolean isNotExtension(KCallableImpl<?> kCallableImpl) {
        return !isExtension(kCallableImpl);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.full.KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isSubclassOf(kotlin.reflect.KClass<?> r2, kotlin.reflect.KClass<?> r3) {
        /*
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r0 != 0) goto L_0x002d
            java.util.List r2 = kotlin.p590y.C13183n.m40498a(r2)
            kotlin.reflect.KProperty1 r0 = kotlin.reflect.full.KClasses$isSubclassOf$1.INSTANCE
            if (r0 == 0) goto L_0x0014
            kotlin.reflect.full.KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0 r1 = new kotlin.reflect.full.KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0
            r1.<init>(r0)
            r0 = r1
        L_0x0014:
            kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors r0 = (kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors) r0
            kotlin.reflect.full.KClasses$isSubclassOf$2 r1 = new kotlin.reflect.full.KClasses$isSubclassOf$2
            r1.<init>(r3)
            java.lang.Boolean r2 = kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(r2, r0, r1)
            java.lang.String r3 = "DFS.ifAny(listOf(this), …erclasses) { it == base }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = 0
            goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.KClasses.isSubclassOf(kotlin.reflect.KClass, kotlin.reflect.KClass):boolean");
    }

    public static final boolean isSuperclassOf(KClass<?> kClass, KClass<?> kClass2) {
        return isSubclassOf(kClass2, kClass);
    }

    public static /* synthetic */ void memberExtensionFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void memberExtensionProperties$annotations(KClass kClass) {
    }

    public static /* synthetic */ void memberFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void memberProperties$annotations(KClass kClass) {
    }

    public static /* synthetic */ void primaryConstructor$annotations(KClass kClass) {
    }

    public static final <T> T safeCast(KClass<T> kClass, Object obj) {
        if (!kClass.isInstance(obj)) {
            return null;
        }
        if (obj != null) {
            return obj;
        }
        throw new C13142s("null cannot be cast to non-null type T");
    }

    public static /* synthetic */ void staticFunctions$annotations(KClass kClass) {
    }

    public static /* synthetic */ void staticProperties$annotations(KClass kClass) {
    }

    public static /* synthetic */ void superclasses$annotations(KClass kClass) {
    }
}
