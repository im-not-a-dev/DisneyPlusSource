package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$simpleName$2 extends C12881k implements Function0<String> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$simpleName$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final String invoke() {
        String str;
        if (KClassImpl.this.getJClass().isAnonymousClass()) {
            return null;
        }
        ClassId access$getClassId$p = KClassImpl.this.getClassId();
        if (access$getClassId$p.isLocal()) {
            Data data = this.this$0;
            str = data.calculateLocalClassName(KClassImpl.this.getJClass());
        } else {
            str = access$getClassId$p.getShortClassName().asString();
            C12880j.m40222a((Object) str, "classId.shortClassName.asString()");
        }
        return str;
    }
}
