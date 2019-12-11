package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "p1", "Ljava/lang/reflect/Member;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
final /* synthetic */ class ReflectJavaClass$fields$1 extends C12879i implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    ReflectJavaClass$fields$1() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Member) obj));
    }

    public final boolean invoke(Member member) {
        return member.isSynthetic();
    }
}
