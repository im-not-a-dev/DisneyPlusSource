package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C12895y;

/* compiled from: ClassicTypeCheckerContext.kt */
public final class ClassicTypeCheckerContextKt {
    /* access modifiers changed from: private */
    public static final String errorMessage(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassicTypeCheckerContext couldn't handle ");
        sb.append(C12895y.m40230a(obj.getClass()));
        sb.append(' ');
        sb.append(obj);
        return sb.toString();
    }
}
