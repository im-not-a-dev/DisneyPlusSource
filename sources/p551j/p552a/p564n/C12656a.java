package p551j.p552a.p564n;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j.a.n.a */
/* compiled from: Frame */
public final class C12656a {

    /* renamed from: a */
    private Method f29344a;

    /* renamed from: b */
    private final C12657a[] f29345b;

    /* renamed from: j.a.n.a$a */
    /* compiled from: Frame */
    public static final class C12657a {
        /* renamed from: a */
        public String mo30977a() {
            throw null;
        }
    }

    /* renamed from: a */
    public Map<String, Object> mo30974a() {
        C12657a[] aVarArr = this.f29345b;
        if (aVarArr == null || aVarArr.length == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        C12657a[] aVarArr2 = this.f29345b;
        int length = aVarArr2.length;
        int i = 0;
        while (i < length) {
            C12657a aVar = aVarArr2[i];
            if (aVar == null) {
                i++;
            } else {
                aVar.mo30977a();
                throw null;
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public Method mo30975b() {
        return this.f29344a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frame{, locals=");
        sb.append(Arrays.toString(this.f29345b));
        sb.append('}');
        return sb.toString();
    }
}
