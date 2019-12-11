package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "", "()V", "CST", "Companion", "D2C", "EXT", "IAP", "MVPD", "OTHER", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$D2C;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$MVPD;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$IAP;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$CST;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$EXT;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$OTHER;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public abstract class SubscriptionSourceType {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$CST;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "()V", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class CST extends SubscriptionSourceType {
        public CST() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof CST;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$Companion;", "", "()V", "toString", "", "type", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "toType", "value", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String toString(SubscriptionSourceType subscriptionSourceType) {
            if (subscriptionSourceType instanceof D2C) {
                return "D2C";
            }
            if (subscriptionSourceType instanceof MVPD) {
                return "MVPD";
            }
            if (subscriptionSourceType instanceof IAP) {
                return "IAP";
            }
            if (subscriptionSourceType instanceof CST) {
                return "CST";
            }
            if (subscriptionSourceType instanceof EXT) {
                return "EXT";
            }
            return ((OTHER) subscriptionSourceType).getValue();
        }

        public final SubscriptionSourceType toType(String str) {
            String upperCase = str.toUpperCase();
            C12880j.m40222a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            switch (upperCase.hashCode()) {
                case 66965:
                    if (upperCase.equals("D2C")) {
                        return new D2C();
                    }
                    break;
                case 67044:
                    if (upperCase.equals("CST")) {
                        return new CST();
                    }
                    break;
                case 69121:
                    if (upperCase.equals("EXT")) {
                        return new EXT();
                    }
                    break;
                case 72248:
                    if (upperCase.equals("IAP")) {
                        return new IAP();
                    }
                    break;
                case 2379101:
                    if (upperCase.equals("MVPD")) {
                        return new MVPD();
                    }
                    break;
            }
            return new OTHER(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$D2C;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "()V", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class D2C extends SubscriptionSourceType {
        public D2C() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof D2C;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$EXT;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "()V", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class EXT extends SubscriptionSourceType {
        public EXT() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof EXT;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$IAP;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "()V", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class IAP extends SubscriptionSourceType {
        public IAP() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof IAP;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$MVPD;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "()V", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class MVPD extends SubscriptionSourceType {
        public MVPD() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof MVPD;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionSourceType$OTHER;", "Lcom/bamtech/sdk4/subscription/SubscriptionSourceType;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class OTHER extends SubscriptionSourceType {
        private final String value;

        public OTHER(String str) {
            super(null);
            this.value = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof OTHER) && C12880j.m40224a((Object) this.value, (Object) ((OTHER) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    private SubscriptionSourceType() {
    }

    public /* synthetic */ SubscriptionSourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
