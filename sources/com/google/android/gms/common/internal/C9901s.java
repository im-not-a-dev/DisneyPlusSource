package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.s */
public final class C9901s {

    /* renamed from: com.google.android.gms.common.internal.s$a */
    public static final class C9902a {

        /* renamed from: a */
        private final List<String> f23177a;

        /* renamed from: b */
        private final Object f23178b;

        private C9902a(Object obj) {
            C9908u.m30853a(obj);
            this.f23178b = obj;
            this.f23177a = new ArrayList();
        }

        /* renamed from: a */
        public final C9902a mo25435a(String str, Object obj) {
            List<String> list = this.f23177a;
            C9908u.m30853a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f23178b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f23177a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f23177a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m30841a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m30839a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C9902a m30840a(Object obj) {
        return new C9902a(obj);
    }
}
