package kotlinx.coroutines;

import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.jvm.internal.C12880j;
import kotlin.p573a0.C12683c;

/* renamed from: kotlinx.coroutines.k0 */
/* compiled from: DebugStrings.kt */
public final class C13323k0 {
    /* renamed from: a */
    public static final String m40938a(C12683c<?> cVar) {
        Object obj;
        if (cVar instanceof C13364n0) {
            return cVar.toString();
        }
        try {
            C12901a aVar = C12900n.f29540c;
            StringBuilder sb = new StringBuilder();
            sb.append(cVar);
            sb.append('@');
            sb.append(m40939b(cVar));
            obj = sb.toString();
            C12900n.m40236a(obj);
        } catch (Throwable th) {
            C12901a aVar2 = C12900n.f29540c;
            obj = C12903o.m40240a(th);
            C12900n.m40236a(obj);
        }
        if (C12900n.m40237b(obj) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar.getClass().getName());
            sb2.append('@');
            sb2.append(m40939b(cVar));
            obj = sb2.toString();
        }
        return (String) obj;
    }

    /* renamed from: b */
    public static final String m40939b(Object obj) {
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C12880j.m40222a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    /* renamed from: a */
    public static final String m40937a(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        C12880j.m40222a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }
}
