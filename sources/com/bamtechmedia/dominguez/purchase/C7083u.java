package com.bamtechmedia.dominguez.purchase;

import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p163g.p201e.p203b.p319v.p320a0.C7823d;

/* renamed from: com.bamtechmedia.dominguez.purchase.u */
/* compiled from: PaywallViewModel.kt */
public final class C7083u {

    /* renamed from: a */
    private final PaywallError f15700a;

    /* renamed from: b */
    private final boolean f15701b;

    /* renamed from: c */
    private final boolean f15702c;

    /* renamed from: d */
    private final C7820a f15703d;

    /* renamed from: e */
    private final boolean f15704e;

    public C7083u() {
        this(null, false, false, null, false, 31, null);
    }

    public C7083u(PaywallError paywallError, boolean z, boolean z2, C7820a aVar, boolean z3) {
        this.f15700a = paywallError;
        this.f15701b = z;
        this.f15702c = z2;
        this.f15703d = aVar;
        this.f15704e = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C7083u m21456a(C7083u uVar, PaywallError paywallError, boolean z, boolean z2, C7820a aVar, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            paywallError = uVar.f15700a;
        }
        if ((i & 2) != 0) {
            z = uVar.f15701b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = uVar.f15702c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            aVar = uVar.f15703d;
        }
        C7820a aVar2 = aVar;
        if ((i & 16) != 0) {
            z3 = uVar.f15704e;
        }
        return uVar.mo19864a(paywallError, z4, z5, aVar2, z3);
    }

    /* renamed from: a */
    public final C7083u mo19864a(PaywallError paywallError, boolean z, boolean z2, C7820a aVar, boolean z3) {
        C7083u uVar = new C7083u(paywallError, z, z2, aVar, z3);
        return uVar;
    }

    /* renamed from: a */
    public final boolean mo19865a() {
        return this.f15704e;
    }

    /* renamed from: b */
    public final boolean mo19866b() {
        return this.f15701b;
    }

    /* renamed from: c */
    public final C7820a mo19867c() {
        return this.f15703d;
    }

    /* renamed from: d */
    public final boolean mo19868d() {
        return this.f15702c;
    }

    /* renamed from: e */
    public final List<C7823d> mo19869e() {
        C7820a aVar = this.f15703d;
        if (aVar != null) {
            return aVar.mo20724b();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7083u) {
                C7083u uVar = (C7083u) obj;
                if (Intrinsics.areEqual((Object) this.f15700a, (Object) uVar.f15700a)) {
                    if (this.f15701b == uVar.f15701b) {
                        if ((this.f15702c == uVar.f15702c) && Intrinsics.areEqual((Object) this.f15703d, (Object) uVar.f15703d)) {
                            if (this.f15704e == uVar.f15704e) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        PaywallError paywallError = this.f15700a;
        int i = 0;
        int hashCode = (paywallError != null ? paywallError.hashCode() : 0) * 31;
        boolean z = this.f15701b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.f15702c;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        C7820a aVar = this.f15703d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z3 = this.f15704e;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaywallState(error=");
        sb.append(this.f15700a);
        sb.append(", blockPaymentButtons=");
        sb.append(this.f15701b);
        sb.append(", paywallLoading=");
        sb.append(this.f15702c);
        sb.append(", paywall=");
        sb.append(this.f15703d);
        sb.append(", accessGranted=");
        sb.append(this.f15704e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C7083u(PaywallError paywallError, boolean z, boolean z2, C7820a aVar, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C7820a aVar2 = null;
        PaywallError paywallError2 = (i & 1) != 0 ? null : paywallError;
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) == 0) {
            aVar2 = aVar;
        }
        this(paywallError2, z4, z5, aVar2, (i & 16) != 0 ? false : z3);
    }
}
