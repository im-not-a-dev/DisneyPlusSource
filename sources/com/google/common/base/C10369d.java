package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.d */
/* compiled from: MoreObjects */
public final class C10369d {

    /* renamed from: com.google.common.base.d$b */
    /* compiled from: MoreObjects */
    public static final class C10371b {

        /* renamed from: a */
        private final String f24672a;

        /* renamed from: b */
        private final C10372a f24673b;

        /* renamed from: c */
        private C10372a f24674c;

        /* renamed from: d */
        private boolean f24675d;

        /* renamed from: com.google.common.base.d$b$a */
        /* compiled from: MoreObjects */
        private static final class C10372a {

            /* renamed from: a */
            String f24676a;

            /* renamed from: b */
            Object f24677b;

            /* renamed from: c */
            C10372a f24678c;

            private C10372a() {
            }
        }

        /* renamed from: b */
        private C10371b m32804b(Object obj) {
            m32803a().f24677b = obj;
            return this;
        }

        /* renamed from: a */
        public C10371b mo27112a(Object obj) {
            m32804b(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f24675d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f24672a);
            sb.append('{');
            String str = "";
            for (C10372a aVar = this.f24673b.f24678c; aVar != null; aVar = aVar.f24678c) {
                Object obj = aVar.f24677b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f24676a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C10371b(String str) {
            this.f24673b = new C10372a();
            this.f24674c = this.f24673b;
            this.f24675d = false;
            C10374f.m32809a(str);
            this.f24672a = str;
        }

        /* renamed from: a */
        private C10372a m32803a() {
            C10372a aVar = new C10372a();
            this.f24674c.f24678c = aVar;
            this.f24674c = aVar;
            return aVar;
        }
    }

    /* renamed from: a */
    public static C10371b m32802a(Object obj) {
        return new C10371b(obj.getClass().getSimpleName());
    }
}
