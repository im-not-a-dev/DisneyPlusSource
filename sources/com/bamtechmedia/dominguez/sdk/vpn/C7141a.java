package com.bamtechmedia.dominguez.sdk.vpn;

import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceExceptionCase.LocationNotAllowed;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11907a;
import p520io.reactivex.Flowable;
import p520io.reactivex.subjects.C11976a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u001b\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0010J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0000¢\u0006\u0002\b\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking;", "", "()V", "vpnBlockedMethods", "", "Ljava/lang/reflect/Method;", "vpnDetectedSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking$VpnStatus;", "onSdkCallSuccess", "", "method", "onSdkException", "throwable", "", "vpnStatusStream", "Lio/reactivex/Flowable;", "vpnStatusStream$sdk_release", "VpnStatus", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.sdk.vpn.a */
/* compiled from: VpnBlocking.kt */
public final class C7141a {

    /* renamed from: a */
    private final C11976a<C7142a> f15791a;

    /* renamed from: b */
    private final Set<Method> f15792b = new LinkedHashSet();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking$VpnStatus;", "", "()V", "Blocked", "NotBlocked", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking$VpnStatus$Blocked;", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking$VpnStatus$NotBlocked;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.sdk.vpn.a$a */
    /* compiled from: VpnBlocking.kt */
    public static abstract class C7142a {

        /* renamed from: com.bamtechmedia.dominguez.sdk.vpn.a$a$a */
        /* compiled from: VpnBlocking.kt */
        public static final class C7143a extends C7142a {

            /* renamed from: a */
            private final ServiceException f15793a;

            public C7143a(ServiceException serviceException) {
                super(null);
                this.f15793a = serviceException;
            }

            /* renamed from: a */
            public final ServiceException mo19967a() {
                return this.f15793a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15793a, (java.lang.Object) ((com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7143a) r2).f15793a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7143a
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.sdk.vpn.a$a$a r2 = (com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7143a) r2
                    com.bamtech.sdk4.service.ServiceException r0 = r1.f15793a
                    com.bamtech.sdk4.service.ServiceException r2 = r2.f15793a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7143a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                ServiceException serviceException = this.f15793a;
                if (serviceException != null) {
                    return serviceException.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Blocked(exception=");
                sb.append(this.f15793a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.sdk.vpn.a$a$b */
        /* compiled from: VpnBlocking.kt */
        public static final class C7144b extends C7142a {

            /* renamed from: a */
            public static final C7144b f15794a = new C7144b();

            private C7144b() {
                super(null);
            }
        }

        private C7142a() {
        }

        public /* synthetic */ C7142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7141a() {
        C11976a<C7142a> p = C11976a.m38563p();
        Intrinsics.checkReturnedValueIsNotNull((Object) p, "BehaviorSubject.create()");
        this.f15791a = p;
    }

    /* renamed from: a */
    public final Flowable<C7142a> mo19964a() {
        Flowable<C7142a> a = this.f15791a.mo30164b().mo30135a(C11907a.LATEST);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "vpnDetectedSubject.disti…nged().toFlowable(LATEST)");
        return a;
    }

    /* renamed from: a */
    public final void mo19966a(Method method, Throwable th) {
        while (true) {
            if (th instanceof ServiceException) {
                ServiceException serviceException = (ServiceException) th;
                if (LocationNotAllowed.INSTANCE.isInstance(serviceException)) {
                    this.f15791a.onNext(new C7143a(serviceException));
                    this.f15792b.add(method);
                    return;
                }
            }
            if ((th != null ? th.getCause() : null) != null) {
                th = th.getCause();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo19965a(Method method) {
        if (this.f15792b.contains(method)) {
            this.f15791a.onNext(C7144b.f15794a);
        }
    }
}
