package p163g.p201e.p203b.p319v;

import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "", "()V", "Cancelled", "Error", "GrantAccessFromTempAccess", "ProductQuerySuccess", "PurchaseSuccess", "Reset", "RestoreSuccess", "SetupSuccess", "SubscriptionActivated", "SubscriptionActive", "TempAccessGranted", "TempAccessResolved", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$SetupSuccess;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$PurchaseSuccess;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$SubscriptionActive;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$SubscriptionActivated;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$ProductQuerySuccess;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$RestoreSuccess;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$Cancelled;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$Error;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$Reset;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$TempAccessGranted;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$TempAccessResolved;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$GrantAccessFromTempAccess;", "paywallApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.p */
/* compiled from: PaywallServiceEvent.kt */
public abstract class C7887p {

    /* renamed from: g.e.b.v.p$a */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7888a extends C7887p {

        /* renamed from: a */
        public static final C7888a f17014a = new C7888a();

        private C7888a() {
            super(null);
        }
    }

    /* renamed from: g.e.b.v.p$b */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7889b extends C7887p {

        /* renamed from: a */
        private final PaywallError f17015a;

        /* renamed from: b */
        private final String f17016b;

        public C7889b(PaywallError paywallError, String str) {
            super(null);
            this.f17015a = paywallError;
            this.f17016b = str;
        }

        /* renamed from: a */
        public final PaywallError mo20804a() {
            return this.f17015a;
        }

        /* renamed from: b */
        public final String mo20805b() {
            return this.f17016b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f17016b, (java.lang.Object) r3.f17016b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p163g.p201e.p203b.p319v.C7887p.C7889b
                if (r0 == 0) goto L_0x001d
                g.e.b.v.p$b r3 = (p163g.p201e.p203b.p319v.C7887p.C7889b) r3
                com.bamtechmedia.dominguez.paywall.exceptions.PaywallError r0 = r2.f17015a
                com.bamtechmedia.dominguez.paywall.exceptions.PaywallError r1 = r3.f17015a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.f17016b
                java.lang.String r3 = r3.f17016b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7887p.C7889b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            PaywallError paywallError = this.f17015a;
            int i = 0;
            int hashCode = (paywallError != null ? paywallError.hashCode() : 0) * 31;
            String str = this.f17016b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error(errorType=");
            sb.append(this.f17015a);
            sb.append(", message=");
            sb.append(this.f17016b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$c */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7890c extends C7887p {

        /* renamed from: a */
        public static final C7890c f17017a = new C7890c();

        private C7890c() {
            super(null);
        }
    }

    /* renamed from: g.e.b.v.p$d */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7891d extends C7887p {

        /* renamed from: a */
        private final Map<String, BamnetIAPProduct> f17018a;

        public C7891d(Map<String, ? extends BamnetIAPProduct> map) {
            super(null);
            this.f17018a = map;
        }

        /* renamed from: a */
        public final Map<String, BamnetIAPProduct> mo20809a() {
            return this.f17018a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17018a, (java.lang.Object) ((p163g.p201e.p203b.p319v.C7887p.C7891d) r2).f17018a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p319v.C7887p.C7891d
                if (r0 == 0) goto L_0x0013
                g.e.b.v.p$d r2 = (p163g.p201e.p203b.p319v.C7887p.C7891d) r2
                java.util.Map<java.lang.String, com.bamnet.iap.BamnetIAPProduct> r0 = r1.f17018a
                java.util.Map<java.lang.String, com.bamnet.iap.BamnetIAPProduct> r2 = r2.f17018a
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
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7887p.C7891d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Map<String, BamnetIAPProduct> map = this.f17018a;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ProductQuerySuccess(products=");
            sb.append(this.f17018a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$e */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7892e extends C7887p {

        /* renamed from: a */
        private final BamnetIAPPurchase f17019a;

        public C7892e(BamnetIAPPurchase bamnetIAPPurchase) {
            super(null);
            this.f17019a = bamnetIAPPurchase;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17019a, (java.lang.Object) ((p163g.p201e.p203b.p319v.C7887p.C7892e) r2).f17019a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p319v.C7887p.C7892e
                if (r0 == 0) goto L_0x0013
                g.e.b.v.p$e r2 = (p163g.p201e.p203b.p319v.C7887p.C7892e) r2
                com.bamnet.iap.BamnetIAPPurchase r0 = r1.f17019a
                com.bamnet.iap.BamnetIAPPurchase r2 = r2.f17019a
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
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7887p.C7892e.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            BamnetIAPPurchase bamnetIAPPurchase = this.f17019a;
            if (bamnetIAPPurchase != null) {
                return bamnetIAPPurchase.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PurchaseSuccess(purchase=");
            sb.append(this.f17019a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$f */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7893f extends C7887p {

        /* renamed from: a */
        private final boolean f17020a;

        public C7893f(boolean z) {
            super(null);
            this.f17020a = z;
        }

        /* renamed from: a */
        public final boolean mo20816a() {
            return this.f17020a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7893f) {
                    if (this.f17020a == ((C7893f) obj).f17020a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f17020a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Reset(iabReady=");
            sb.append(this.f17020a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$g */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7894g extends C7887p {

        /* renamed from: a */
        private final AccessStatus f17021a;

        public C7894g(AccessStatus accessStatus) {
            super(null);
            this.f17021a = accessStatus;
        }

        /* renamed from: a */
        public final AccessStatus mo20820a() {
            return this.f17021a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17021a, (java.lang.Object) ((p163g.p201e.p203b.p319v.C7887p.C7894g) r2).f17021a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p319v.C7887p.C7894g
                if (r0 == 0) goto L_0x0013
                g.e.b.v.p$g r2 = (p163g.p201e.p203b.p319v.C7887p.C7894g) r2
                com.bamtech.sdk4.purchase.AccessStatus r0 = r1.f17021a
                com.bamtech.sdk4.purchase.AccessStatus r2 = r2.f17021a
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
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7887p.C7894g.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            AccessStatus accessStatus = this.f17021a;
            if (accessStatus != null) {
                return accessStatus.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RestoreSuccess(accessStatus=");
            sb.append(this.f17021a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$h */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7895h extends C7887p {

        /* renamed from: a */
        public static final C7895h f17022a = new C7895h();

        private C7895h() {
            super(null);
        }
    }

    /* renamed from: g.e.b.v.p$i */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7896i extends C7887p {

        /* renamed from: a */
        public static final C7896i f17023a = new C7896i();

        private C7896i() {
            super(null);
        }
    }

    /* renamed from: g.e.b.v.p$j */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7897j extends C7887p {

        /* renamed from: a */
        private final AccessStatus f17024a;

        public C7897j(AccessStatus accessStatus) {
            super(null);
            this.f17024a = accessStatus;
        }

        /* renamed from: a */
        public final AccessStatus mo20824a() {
            return this.f17024a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17024a, (java.lang.Object) ((p163g.p201e.p203b.p319v.C7887p.C7897j) r2).f17024a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p319v.C7887p.C7897j
                if (r0 == 0) goto L_0x0013
                g.e.b.v.p$j r2 = (p163g.p201e.p203b.p319v.C7887p.C7897j) r2
                com.bamtech.sdk4.purchase.AccessStatus r0 = r1.f17024a
                com.bamtech.sdk4.purchase.AccessStatus r2 = r2.f17024a
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
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7887p.C7897j.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            AccessStatus accessStatus = this.f17024a;
            if (accessStatus != null) {
                return accessStatus.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SubscriptionActive(accessStatus=");
            sb.append(this.f17024a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.e.b.v.p$k */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7898k extends C7887p {

        /* renamed from: a */
        public static final C7898k f17025a = new C7898k();

        private C7898k() {
            super(null);
        }
    }

    /* renamed from: g.e.b.v.p$l */
    /* compiled from: PaywallServiceEvent.kt */
    public static final class C7899l extends C7887p {

        /* renamed from: a */
        private final AccessStatus f17026a;

        /* renamed from: b */
        private final boolean f17027b;

        public C7899l(AccessStatus accessStatus, boolean z) {
            super(null);
            this.f17026a = accessStatus;
            this.f17027b = z;
        }

        /* renamed from: a */
        public final AccessStatus mo20828a() {
            return this.f17026a;
        }

        /* renamed from: b */
        public final boolean mo20829b() {
            return this.f17027b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7899l) {
                    C7899l lVar = (C7899l) obj;
                    if (Intrinsics.areEqual((Object) this.f17026a, (Object) lVar.f17026a)) {
                        if (this.f17027b == lVar.f17027b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AccessStatus accessStatus = this.f17026a;
            int hashCode = (accessStatus != null ? accessStatus.hashCode() : 0) * 31;
            boolean z = this.f17027b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TempAccessResolved(accessStatus=");
            sb.append(this.f17026a);
            sb.append(", linkSubscriptions=");
            sb.append(this.f17027b);
            sb.append(")");
            return sb.toString();
        }
    }

    private C7887p() {
    }

    public /* synthetic */ C7887p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
