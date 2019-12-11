package kotlin.p573a0.p575i.p576a;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.a0.i.a.g */
/* compiled from: DebugMetadata.kt */
public final class C12707g {
    /* renamed from: a */
    private static final C12706f m39841a(C12701a aVar) {
        return (C12706f) aVar.getClass().getAnnotation(C12706f.class);
    }

    /* renamed from: b */
    private static final int m39843b(C12701a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C12880j.m40222a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final StackTraceElement m39844c(C12701a aVar) {
        int i;
        String str;
        C12706f a = m39841a(aVar);
        if (a == null) {
            return null;
        }
        m39842a(1, a.mo31056v());
        int b = m39843b(aVar);
        if (b < 0) {
            i = -1;
        } else {
            i = a.mo31054l()[b];
        }
        String a2 = C12709i.f29398c.mo31057a(aVar);
        if (a2 == null) {
            str = a.mo31052c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append('/');
            sb.append(a.mo31052c());
            str = sb.toString();
        }
        return new StackTraceElement(str, a.mo31055m(), a.mo31053f(), i);
    }

    /* renamed from: a */
    private static final void m39842a(int i, int i2) {
        if (i2 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Debug metadata version mismatch. Expected: ");
            sb.append(i);
            sb.append(", got ");
            sb.append(i2);
            sb.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
