package com.bamtechmedia.dominguez.main.p235x;

import com.bamtechmedia.dominguez.profiles.C6626c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B%\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0000H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0001\u000e\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/state/MainActivityState;", "", "startIapConnection", "", "stopIapConnection", "isLoggedIn", "(ZZZ)V", "()Z", "getStartIapConnection", "getStopIapConnection", "canChangeTo", "newState", "BadState", "Expired", "InitFailed", "Loading", "LoggedIn", "LoggedOut", "NeverSubscribed", "NewUser", "OldVersion", "PickProfile", "PreviouslySubscribed", "RetryInit", "StartGlobalNav", "Subscribed", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$LoggedOut;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$Loading;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$RetryInit;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$InitFailed;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$OldVersion;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$BadState;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$Expired;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$LoggedIn;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$NewUser;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$NeverSubscribed;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$PreviouslySubscribed;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$Subscribed;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$PickProfile;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState$StartGlobalNav;", "mainAppApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.x.d */
/* compiled from: MainActivityState.kt */
public abstract class C6219d {

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$a */
    /* compiled from: MainActivityState.kt */
    public static final class C6220a extends C6219d {

        /* renamed from: a */
        private final String f14256a;

        public C6220a(String str) {
            super(false, false, false, 2, null);
            this.f14256a = str;
        }

        /* renamed from: a */
        public final String mo18813a() {
            return this.f14256a;
        }

        /* renamed from: a */
        public boolean mo18812a(C6219d dVar) {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f14256a, (java.lang.Object) ((com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a) r2).f14256a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.main.x.d$a r2 = (com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a) r2
                java.lang.String r0 = r1.f14256a
                java.lang.String r2 = r2.f14256a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f14256a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BadState(message=");
            sb.append(this.f14256a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$b */
    /* compiled from: MainActivityState.kt */
    public static final class C6221b extends C6219d {

        /* renamed from: a */
        public static final C6221b f14257a = new C6221b();

        private C6221b() {
            super(false, false, false, 3, null);
        }

        /* renamed from: a */
        public boolean mo18812a(C6219d dVar) {
            return C12880j.m40224a((Object) dVar, (Object) C6225f.f14262a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$c */
    /* compiled from: MainActivityState.kt */
    public static final class C6222c extends C6219d {

        /* renamed from: a */
        public static final C6222c f14258a = new C6222c();

        private C6222c() {
            super(false, false, false, 2, null);
        }

        /* renamed from: a */
        public boolean mo18812a(C6219d dVar) {
            return (dVar instanceof C6231l) || (dVar instanceof C6228i);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$d */
    /* compiled from: MainActivityState.kt */
    public static final class C6223d extends C6219d {

        /* renamed from: a */
        private final C6219d f14259a;

        /* renamed from: b */
        private final boolean f14260b;

        public C6223d() {
            this(null, false, 3, null);
        }

        public /* synthetic */ C6223d(C6219d dVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                dVar = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            this(dVar, z);
        }

        /* renamed from: a */
        public static /* synthetic */ C6223d m19715a(C6223d dVar, C6219d dVar2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                dVar2 = dVar.f14259a;
            }
            if ((i & 2) != 0) {
                z = dVar.f14260b;
            }
            return dVar.mo18817a(dVar2, z);
        }

        /* renamed from: a */
        public final C6223d mo18817a(C6219d dVar, boolean z) {
            return new C6223d(dVar, z);
        }

        /* renamed from: a */
        public final boolean mo18818a() {
            return this.f14260b;
        }

        /* renamed from: b */
        public final C6219d mo18819b() {
            return this.f14259a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6223d) {
                    C6223d dVar = (C6223d) obj;
                    if (C12880j.m40224a((Object) this.f14259a, (Object) dVar.f14259a)) {
                        if (this.f14260b == dVar.f14260b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6219d dVar = this.f14259a;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            boolean z = this.f14260b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Loading(nextState=");
            sb.append(this.f14259a);
            sb.append(", animationCompleted=");
            sb.append(this.f14260b);
            sb.append(")");
            return sb.toString();
        }

        public C6223d(C6219d dVar, boolean z) {
            super(false, false, false, 3, null);
            this.f14259a = dVar;
            this.f14260b = z;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$e */
    /* compiled from: MainActivityState.kt */
    public static final class C6224e extends C6219d {

        /* renamed from: a */
        public static final C6224e f14261a = new C6224e();

        private C6224e() {
            super(true, false, false, 6, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$f */
    /* compiled from: MainActivityState.kt */
    public static final class C6225f extends C6219d {

        /* renamed from: a */
        public static final C6225f f14262a = new C6225f();

        private C6225f() {
            super(true, false, false, 2, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$g */
    /* compiled from: MainActivityState.kt */
    public static final class C6226g extends C6219d {

        /* renamed from: a */
        public static final C6226g f14263a = new C6226g();

        private C6226g() {
            super(true, false, false, 6, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$h */
    /* compiled from: MainActivityState.kt */
    public static final class C6227h extends C6219d {

        /* renamed from: a */
        public static final C6227h f14264a = new C6227h();

        private C6227h() {
            super(true, false, false, 6, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$i */
    /* compiled from: MainActivityState.kt */
    public static final class C6228i extends C6219d {

        /* renamed from: a */
        public static final C6228i f14265a = new C6228i();

        private C6228i() {
            super(false, false, false, 2, null);
        }

        /* renamed from: a */
        public boolean mo18812a(C6219d dVar) {
            return false;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$j */
    /* compiled from: MainActivityState.kt */
    public static final class C6229j extends C6219d {

        /* renamed from: a */
        public static final C6229j f14266a = new C6229j();

        private C6229j() {
            super(false, true, false, 5, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$k */
    /* compiled from: MainActivityState.kt */
    public static final class C6230k extends C6219d {

        /* renamed from: a */
        public static final C6230k f14267a = new C6230k();

        private C6230k() {
            super(true, false, false, 6, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$l */
    /* compiled from: MainActivityState.kt */
    public static final class C6231l extends C6219d {

        /* renamed from: a */
        public static final C6231l f14268a = new C6231l();

        private C6231l() {
            super(false, false, false, 7, null);
        }

        /* renamed from: a */
        public boolean mo18812a(C6219d dVar) {
            return dVar instanceof C6223d;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$m */
    /* compiled from: MainActivityState.kt */
    public static final class C6232m extends C6219d {

        /* renamed from: a */
        private final C6626c0 f14269a;

        public C6232m(C6626c0 c0Var) {
            super(false, true, false, 5, null);
            this.f14269a = c0Var;
        }

        /* renamed from: a */
        public final C6626c0 mo18823a() {
            return this.f14269a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f14269a, (java.lang.Object) ((com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m) r2).f14269a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.main.x.d$m r2 = (com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m) r2
                com.bamtechmedia.dominguez.profiles.c0 r0 = r1.f14269a
                com.bamtechmedia.dominguez.profiles.c0 r2 = r2.f14269a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C6626c0 c0Var = this.f14269a;
            if (c0Var != null) {
                return c0Var.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StartGlobalNav(profile=");
            sb.append(this.f14269a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.x.d$n */
    /* compiled from: MainActivityState.kt */
    public static final class C6233n extends C6219d {

        /* renamed from: a */
        public static final C6233n f14270a = new C6233n();

        private C6233n() {
            super(false, true, false, 5, null);
        }
    }

    private C6219d(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: a */
    public boolean mo18812a(C6219d dVar) {
        return true;
    }

    /* synthetic */ C6219d(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        this(z, z2, z3);
    }
}
