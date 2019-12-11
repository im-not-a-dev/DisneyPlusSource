package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class C13013x2cf49cf1 implements MemberVisitor {
    final /* synthetic */ HashMap $memberAnnotations;
    final /* synthetic */ HashMap $propertyConstants;
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements MethodAnnotationVisitor {
        public AnnotationVisitorForMethod(MemberSignature memberSignature) {
            super(memberSignature);
        }

        public AnnotationArgumentVisitor visitParameterAnnotation(int i, ClassId classId, SourceElement sourceElement) {
            MemberSignature fromMethodSignatureAndParameterIndex = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i);
            List list = (List) C13013x2cf49cf1.this.$memberAnnotations.get(fromMethodSignatureAndParameterIndex);
            if (list == null) {
                list = new ArrayList();
                C13013x2cf49cf1.this.$memberAnnotations.put(fromMethodSignatureAndParameterIndex, list);
            }
            return C13013x2cf49cf1.this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, list);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public class MemberAnnotationVisitor implements AnnotationVisitor {
        private final ArrayList<A> result = new ArrayList<>();
        private final MemberSignature signature;

        public MemberAnnotationVisitor(MemberSignature memberSignature) {
            this.signature = memberSignature;
        }

        /* access modifiers changed from: protected */
        public final MemberSignature getSignature() {
            return this.signature;
        }

        public AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
            return C13013x2cf49cf1.this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, this.result);
        }

        public void visitEnd() {
            if (!this.result.isEmpty()) {
                C13013x2cf49cf1.this.$memberAnnotations.put(this.signature, this.result);
            }
        }
    }

    C13013x2cf49cf1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap hashMap, HashMap hashMap2) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        this.$memberAnnotations = hashMap;
        this.$propertyConstants = hashMap2;
    }

    public AnnotationVisitor visitField(Name name, String str, Object obj) {
        Companion companion = MemberSignature.Companion;
        String asString = name.asString();
        C12880j.m40222a((Object) asString, "name.asString()");
        MemberSignature fromFieldNameAndDesc = companion.fromFieldNameAndDesc(asString, str);
        if (obj != null) {
            Object loadConstant = this.this$0.loadConstant(str, obj);
            if (loadConstant != null) {
                this.$propertyConstants.put(fromFieldNameAndDesc, loadConstant);
            }
        }
        return new MemberAnnotationVisitor(fromFieldNameAndDesc);
    }

    public MethodAnnotationVisitor visitMethod(Name name, String str) {
        Companion companion = MemberSignature.Companion;
        String asString = name.asString();
        C12880j.m40222a((Object) asString, "name.asString()");
        return new AnnotationVisitorForMethod(companion.fromMethodNameAndDesc(asString, str));
    }
}
