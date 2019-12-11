package com.bamtechmedia.dominguez.auth.p064p0;

import com.bamtechmedia.dominguez.config.C3558l;
import java.net.PasswordAuthentication;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/autologin/DevConfigAutoLogin;", "", "devConfig", "Lcom/bamtechmedia/dominguez/config/DevConfig;", "(Lcom/bamtechmedia/dominguez/config/DevConfig;)V", "credentialsMaybe", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLoginCredentials;", "DevConfigCredentials", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.p0.e */
/* compiled from: DevConfigAutoLogin.kt */
public final class C2771e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3558l f7523a;

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.e$a */
    /* compiled from: DevConfigAutoLogin.kt */
    private static final class C2772a implements C2770d {

        /* renamed from: a */
        private final String f7524a;

        /* renamed from: b */
        private final String f7525b;

        /* renamed from: c */
        private final PasswordAuthentication f7526c;

        public C2772a(PasswordAuthentication passwordAuthentication) {
            this.f7526c = passwordAuthentication;
            String userName = this.f7526c.getUserName();
            C12880j.m40222a((Object) userName, "passwordAuthentication.userName");
            this.f7524a = userName;
            char[] password = this.f7526c.getPassword();
            C12880j.m40222a((Object) password, "passwordAuthentication.password");
            this.f7525b = new String(password);
        }

        /* renamed from: a */
        public String mo11784a() {
            return this.f7524a;
        }

        /* renamed from: b */
        public String mo11785b() {
            return this.f7525b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f7526c, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p064p0.C2771e.C2772a) r2).f7526c) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p064p0.C2771e.C2772a
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.auth.p0.e$a r2 = (com.bamtechmedia.dominguez.auth.p064p0.C2771e.C2772a) r2
                java.net.PasswordAuthentication r0 = r1.f7526c
                java.net.PasswordAuthentication r2 = r2.f7526c
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p064p0.C2771e.C2772a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            PasswordAuthentication passwordAuthentication = this.f7526c;
            if (passwordAuthentication != null) {
                return passwordAuthentication.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DevConfigCredentials(passwordAuthentication=");
            sb.append(this.f7526c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.p0.e$b */
    /* compiled from: DevConfigAutoLogin.kt */
    static final class C2773b<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2771e f7527c;

        C2773b(C2771e eVar) {
            this.f7527c = eVar;
        }

        public final C2772a call() {
            PasswordAuthentication c = this.f7527c.f7523a.mo12766c();
            if (c != null) {
                return new C2772a(c);
            }
            return null;
        }
    }

    public C2771e(C3558l lVar) {
        this.f7523a = lVar;
    }

    /* renamed from: a */
    public final Maybe<C2770d> mo11786a() {
        Maybe<C2770d> b = Maybe.m38257b((Callable<? extends T>) new C2773b<Object>(this));
        C12880j.m40222a((Object) b, "Maybe.fromCallable {\n   …igCredentials(it) }\n    }");
        return b;
    }
}
