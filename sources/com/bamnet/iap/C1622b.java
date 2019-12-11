package com.bamnet.iap;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamnet/iap/MarketOptions;", "", "autoAcknowledge", "", "(Z)V", "getAutoAcknowledge", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "base-iap_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamnet.iap.b */
/* compiled from: MarketOptions.kt */
public final class C1622b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C1622b f5737b = new C1622b(false);

    /* renamed from: c */
    public static final C1623a f5738c = new C1623a(null);

    /* renamed from: a */
    private final boolean f5739a;

    /* renamed from: com.bamnet.iap.b$a */
    /* compiled from: MarketOptions.kt */
    public static final class C1623a {
        private C1623a() {
        }

        /* renamed from: a */
        public final C1622b mo7233a() {
            return C1622b.f5737b;
        }

        public /* synthetic */ C1623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1622b() {
        this(false, 1, null);
    }

    public C1622b(boolean z) {
        this.f5739a = z;
    }

    /* renamed from: a */
    public final boolean mo7229a() {
        return this.f5739a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1622b) {
                if (this.f5739a == ((C1622b) obj).f5739a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f5739a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketOptions(autoAcknowledge=");
        sb.append(this.f5739a);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C1622b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }
}
