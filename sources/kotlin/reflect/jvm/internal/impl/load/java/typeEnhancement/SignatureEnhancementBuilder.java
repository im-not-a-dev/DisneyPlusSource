package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.p590y.C13152b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: predefinedEnhancementInfo.kt */
final class SignatureEnhancementBuilder {
    /* access modifiers changed from: private */
    public final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class ClassEnhancementBuilder {
        private final String className;

        /* compiled from: predefinedEnhancementInfo.kt */
        public final class FunctionEnhancementBuilder {
            private final String functionName;
            private final List<Pair<String, TypeEnhancementInfo>> parameters = new ArrayList();
            private Pair<String, TypeEnhancementInfo> returnType = C12907r.m40244a("V", null);

            public FunctionEnhancementBuilder(String str) {
                this.functionName = str;
            }

            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = ClassEnhancementBuilder.this.getClassName();
                String str = this.functionName;
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
                for (Pair c : list) {
                    arrayList.add((String) c.mo31015c());
                }
                String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, (String) this.returnType.mo31015c()));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.mo31016d();
                List<Pair<String, TypeEnhancementInfo>> list2 = this.parameters;
                ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list2, 10));
                for (Pair d : list2) {
                    arrayList2.add((TypeEnhancementInfo) d.mo31016d());
                }
                return C12907r.m40244a(signature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList2));
            }

            public final void parameter(String str, JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<C13152b0> o = C13174k.m40415o(javaTypeQualifiersArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) o, 10)), 16));
                    for (C13152b0 b0Var : o) {
                        linkedHashMap.put(Integer.valueOf(b0Var.mo34196c()), (JavaTypeQualifiers) b0Var.mo34197d());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(C12907r.m40244a(str, typeEnhancementInfo));
            }

            public final void returns(String str, JavaTypeQualifiers... javaTypeQualifiersArr) {
                Iterable<C13152b0> o = C13174k.m40415o(javaTypeQualifiersArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) o, 10)), 16));
                for (C13152b0 b0Var : o) {
                    linkedHashMap.put(Integer.valueOf(b0Var.mo34196c()), (JavaTypeQualifiers) b0Var.mo34197d());
                }
                this.returnType = C12907r.m40244a(str, new TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(JvmPrimitiveType jvmPrimitiveType) {
                this.returnType = C12907r.m40244a(jvmPrimitiveType.getDesc(), null);
            }
        }

        public ClassEnhancementBuilder(String str) {
            this.className = str;
        }

        public final void function(String str, Function1<? super FunctionEnhancementBuilder, C13145v> function1) {
            Map access$getSignatures$p = SignatureEnhancementBuilder.this.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(str);
            function1.invoke(functionEnhancementBuilder);
            Pair build = functionEnhancementBuilder.build();
            access$getSignatures$p.put(build.mo31015c(), build.mo31016d());
        }

        public final String getClassName() {
            return this.className;
        }
    }

    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }
}
