package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "", "()V", "AMAZON", "APPLE", "BAMTECH", "Companion", "GOOGLE", "HULU", "OTHER", "ROKU", "SAMSUNG", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$BAMTECH;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$APPLE;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$GOOGLE;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$AMAZON;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$ROKU;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$SAMSUNG;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$HULU;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider$OTHER;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public abstract class SubscriptionProvider {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$AMAZON;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class AMAZON extends SubscriptionProvider {
        public AMAZON() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof AMAZON;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$APPLE;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class APPLE extends SubscriptionProvider {
        public APPLE() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof APPLE;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$BAMTECH;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class BAMTECH extends SubscriptionProvider {
        public BAMTECH() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof BAMTECH;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$Companion;", "", "()V", "toString", "", "type", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "toType", "value", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String toString(SubscriptionProvider subscriptionProvider) {
            if (subscriptionProvider instanceof BAMTECH) {
                return "BAMTECH";
            }
            if (subscriptionProvider instanceof APPLE) {
                return "APPLE";
            }
            if (subscriptionProvider instanceof AMAZON) {
                return "AMAZON";
            }
            if (subscriptionProvider instanceof GOOGLE) {
                return "GOOGLE";
            }
            if (subscriptionProvider instanceof ROKU) {
                return "ROKU";
            }
            if (subscriptionProvider instanceof SAMSUNG) {
                return "SAMSUNG";
            }
            if (subscriptionProvider instanceof HULU) {
                return "HULU";
            }
            return ((OTHER) subscriptionProvider).getValue();
        }

        public final SubscriptionProvider toType(String str) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            switch (upperCase.hashCode()) {
                case -1712043046:
                    if (upperCase.equals("SAMSUNG")) {
                        return new SAMSUNG();
                    }
                    break;
                case 2229078:
                    if (upperCase.equals("HULU")) {
                        return new HULU();
                    }
                    break;
                case 2521191:
                    if (upperCase.equals("ROKU")) {
                        return new ROKU();
                    }
                    break;
                case 62491450:
                    if (upperCase.equals("APPLE")) {
                        return new APPLE();
                    }
                    break;
                case 380277636:
                    if (upperCase.equals("BAMTECH")) {
                        return new BAMTECH();
                    }
                    break;
                case 1934031364:
                    if (upperCase.equals("AMAZON")) {
                        return new AMAZON();
                    }
                    break;
                case 2108052025:
                    if (upperCase.equals("GOOGLE")) {
                        return new GOOGLE();
                    }
                    break;
            }
            return new OTHER(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$GOOGLE;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class GOOGLE extends SubscriptionProvider {
        public GOOGLE() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof GOOGLE;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$HULU;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class HULU extends SubscriptionProvider {
        public HULU() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof HULU;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$OTHER;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class OTHER extends SubscriptionProvider {
        private final String value;

        public OTHER(String str) {
            super(null);
            this.value = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof OTHER) && Intrinsics.areEqual((Object) ((OTHER) obj).value, (Object) this.value);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$ROKU;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class ROKU extends SubscriptionProvider {
        public ROKU() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof ROKU;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionProvider$SAMSUNG;", "Lcom/bamtech/sdk4/subscription/SubscriptionProvider;", "()V", "equals", "", "other", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class SAMSUNG extends SubscriptionProvider {
        public SAMSUNG() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof SAMSUNG;
        }
    }

    private SubscriptionProvider() {
    }

    public /* synthetic */ SubscriptionProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
