package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtech.sdk4.internal.subscription.SubscriptionExpiryType;
import com.bamtech.sdk4.internal.subscription.SubscriptionStatus;
import com.bamtech.sdk4.internal.subscription.SubscriptionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 N2\u00020\u0001:\u0002MNB\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001cJ\t\u00101\u001a\u00020\u0004HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0017HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0002\u00109J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010?\u001a\u00020\u0010HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010A\u001a\u00020\u000bHÂ\u0003JÈ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\u0014\u0010H\u001a\u00020\u00042\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0007J\u0006\u0010K\u001a\u00020\u0004J\t\u0010L\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0004\n\u0002\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010)R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/Subscription;", "", "()V", "isActive", "", "products", "", "Lcom/bamtech/sdk4/subscription/Product;", "source", "Lcom/bamtech/sdk4/subscription/SubscriptionSource;", "accountId", "", "deviceId", "expirationDate", "Lorg/joda/time/DateTime;", "expiryType", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionExpiryType;", "externalIdentity", "id", "lastSyncDate", "nextRenewalDate", "startDate", "status", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatus;", "type", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionType;", "purchaseDate", "bundle", "(ZLjava/util/List;Lcom/bamtech/sdk4/subscription/SubscriptionSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/bamtech/sdk4/internal/subscription/SubscriptionExpiryType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatus;Lcom/bamtech/sdk4/internal/subscription/SubscriptionType;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "accountId$annotations", "getAccountId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "bundleStatus", "Lcom/bamtech/sdk4/subscription/BundleStatus;", "getBundleStatus", "()Lcom/bamtech/sdk4/subscription/BundleStatus;", "deviceId$annotations", "getDeviceId", "getExpirationDate", "()Lorg/joda/time/DateTime;", "()Z", "getNextRenewalDate", "getProducts", "()Ljava/util/List;", "getPurchaseDate", "getSource", "()Lcom/bamtech/sdk4/subscription/SubscriptionSource;", "getStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/util/List;Lcom/bamtech/sdk4/subscription/SubscriptionSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/bamtech/sdk4/internal/subscription/SubscriptionExpiryType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatus;Lcom/bamtech/sdk4/internal/subscription/SubscriptionType;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lcom/bamtech/sdk4/subscription/Subscription;", "equals", "other", "hashCode", "", "isBoundToAccount", "account", "Lcom/bamtech/sdk4/account/Account;", "isBoundToDevice", "toString", "Collection", "Companion", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class Subscription {
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final Boolean bundle;
    private final String deviceId;
    private final DateTime expirationDate;
    private final SubscriptionExpiryType expiryType;
    private final String externalIdentity;

    /* renamed from: id */
    private final String f6088id;
    private final boolean isActive;
    private final DateTime lastSyncDate;
    private final DateTime nextRenewalDate;
    private final List<Product> products;
    private final DateTime purchaseDate;
    private final SubscriptionSource source;
    private final DateTime startDate;
    private final SubscriptionStatus status;
    private final SubscriptionType type;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/Subscription$Collection;", "Ljava/util/ArrayList;", "Lcom/bamtech/sdk4/subscription/Subscription;", "()V", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class Collection extends ArrayList<Subscription> {
        public /* bridge */ boolean contains(Subscription subscription) {
            return super.contains(subscription);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(Subscription subscription) {
            return super.indexOf(subscription);
        }

        public /* bridge */ int lastIndexOf(Subscription subscription) {
            return super.lastIndexOf(subscription);
        }

        public /* bridge */ boolean remove(Subscription subscription) {
            return super.remove(subscription);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Subscription) {
                return contains((Subscription) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Subscription) {
                return indexOf((Subscription) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Subscription) {
                return lastIndexOf((Subscription) obj);
            }
            return -1;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof Subscription) {
                return remove((Subscription) obj);
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/Subscription$Companion;", "", "()V", "toBundleStatus", "Lcom/bamtech/sdk4/subscription/BundleStatus;", "", "toBundleStatus$extension_iap", "(Ljava/lang/Boolean;)Lcom/bamtech/sdk4/subscription/BundleStatus;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Subscription.kt */
    public static final class Companion {
        private Companion() {
        }

        public final BundleStatus toBundleStatus$extension_iap(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) Boolean.valueOf(true))) {
                return BundleStatus.Bundle;
            }
            if (Intrinsics.areEqual((Object) bool, (Object) Boolean.valueOf(false))) {
                return BundleStatus.NotBundle;
            }
            return BundleStatus.Unknown;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Subscription(boolean z, List<Product> list, SubscriptionSource subscriptionSource, String str, String str2, DateTime dateTime, SubscriptionExpiryType subscriptionExpiryType, String str3, String str4, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, SubscriptionStatus subscriptionStatus, SubscriptionType subscriptionType, DateTime dateTime5, Boolean bool) {
        this.isActive = z;
        this.products = list;
        this.source = subscriptionSource;
        this.accountId = str;
        this.deviceId = str2;
        this.expirationDate = dateTime;
        this.expiryType = subscriptionExpiryType;
        this.externalIdentity = str3;
        this.f6088id = str4;
        this.lastSyncDate = dateTime2;
        this.nextRenewalDate = dateTime3;
        this.startDate = dateTime4;
        this.status = subscriptionStatus;
        this.type = subscriptionType;
        this.purchaseDate = dateTime5;
        this.bundle = bool;
    }

    public static /* synthetic */ void accountId$annotations() {
    }

    private final DateTime component10() {
        return this.lastSyncDate;
    }

    private final SubscriptionStatus component13() {
        return this.status;
    }

    private final SubscriptionType component14() {
        return this.type;
    }

    private final Boolean component16() {
        return this.bundle;
    }

    private final SubscriptionExpiryType component7() {
        return this.expiryType;
    }

    private final String component8() {
        return this.externalIdentity;
    }

    private final String component9() {
        return this.f6088id;
    }

    public static /* synthetic */ Subscription copy$default(Subscription subscription, boolean z, List list, SubscriptionSource subscriptionSource, String str, String str2, DateTime dateTime, SubscriptionExpiryType subscriptionExpiryType, String str3, String str4, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, SubscriptionStatus subscriptionStatus, SubscriptionType subscriptionType, DateTime dateTime5, Boolean bool, int i, Object obj) {
        Subscription subscription2 = subscription;
        int i2 = i;
        return subscription.copy((i2 & 1) != 0 ? subscription2.isActive : z, (i2 & 2) != 0 ? subscription2.products : list, (i2 & 4) != 0 ? subscription2.source : subscriptionSource, (i2 & 8) != 0 ? subscription2.accountId : str, (i2 & 16) != 0 ? subscription2.deviceId : str2, (i2 & 32) != 0 ? subscription2.expirationDate : dateTime, (i2 & 64) != 0 ? subscription2.expiryType : subscriptionExpiryType, (i2 & 128) != 0 ? subscription2.externalIdentity : str3, (i2 & 256) != 0 ? subscription2.f6088id : str4, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? subscription2.lastSyncDate : dateTime2, (i2 & 1024) != 0 ? subscription2.nextRenewalDate : dateTime3, (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? subscription2.startDate : dateTime4, (i2 & 4096) != 0 ? subscription2.status : subscriptionStatus, (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? subscription2.type : subscriptionType, (i2 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? subscription2.purchaseDate : dateTime5, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? subscription2.bundle : bool);
    }

    public static /* synthetic */ void deviceId$annotations() {
    }

    public static /* synthetic */ boolean isBoundToAccount$default(Subscription subscription, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            account = null;
        }
        return subscription.isBoundToAccount(account);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final DateTime component11() {
        return this.nextRenewalDate;
    }

    public final DateTime component12() {
        return this.startDate;
    }

    public final DateTime component15() {
        return this.purchaseDate;
    }

    public final List<Product> component2() {
        return this.products;
    }

    public final SubscriptionSource component3() {
        return this.source;
    }

    public final String component4() {
        return this.accountId;
    }

    public final String component5() {
        return this.deviceId;
    }

    public final DateTime component6() {
        return this.expirationDate;
    }

    public final Subscription copy(boolean z, List<Product> list, SubscriptionSource subscriptionSource, String str, String str2, DateTime dateTime, SubscriptionExpiryType subscriptionExpiryType, String str3, String str4, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, SubscriptionStatus subscriptionStatus, SubscriptionType subscriptionType, DateTime dateTime5, Boolean bool) {
        Subscription subscription = new Subscription(z, list, subscriptionSource, str, str2, dateTime, subscriptionExpiryType, str3, str4, dateTime2, dateTime3, dateTime4, subscriptionStatus, subscriptionType, dateTime5, bool);
        return subscription;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Subscription) {
                Subscription subscription = (Subscription) obj;
                if (!(this.isActive == subscription.isActive) || !Intrinsics.areEqual((Object) this.products, (Object) subscription.products) || !Intrinsics.areEqual((Object) this.source, (Object) subscription.source) || !Intrinsics.areEqual((Object) this.accountId, (Object) subscription.accountId) || !Intrinsics.areEqual((Object) this.deviceId, (Object) subscription.deviceId) || !Intrinsics.areEqual((Object) this.expirationDate, (Object) subscription.expirationDate) || !Intrinsics.areEqual((Object) this.expiryType, (Object) subscription.expiryType) || !Intrinsics.areEqual((Object) this.externalIdentity, (Object) subscription.externalIdentity) || !Intrinsics.areEqual((Object) this.f6088id, (Object) subscription.f6088id) || !Intrinsics.areEqual((Object) this.lastSyncDate, (Object) subscription.lastSyncDate) || !Intrinsics.areEqual((Object) this.nextRenewalDate, (Object) subscription.nextRenewalDate) || !Intrinsics.areEqual((Object) this.startDate, (Object) subscription.startDate) || !Intrinsics.areEqual((Object) this.status, (Object) subscription.status) || !Intrinsics.areEqual((Object) this.type, (Object) subscription.type) || !Intrinsics.areEqual((Object) this.purchaseDate, (Object) subscription.purchaseDate) || !Intrinsics.areEqual((Object) this.bundle, (Object) subscription.bundle)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final BundleStatus getBundleStatus() {
        return Companion.toBundleStatus$extension_iap(this.bundle);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final DateTime getExpirationDate() {
        return this.expirationDate;
    }

    public final DateTime getNextRenewalDate() {
        return this.nextRenewalDate;
    }

    public final List<Product> getProducts() {
        return this.products;
    }

    public final DateTime getPurchaseDate() {
        return this.purchaseDate;
    }

    public final SubscriptionSource getSource() {
        return this.source;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        boolean z = this.isActive;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<Product> list = this.products;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        SubscriptionSource subscriptionSource = this.source;
        int hashCode2 = (hashCode + (subscriptionSource != null ? subscriptionSource.hashCode() : 0)) * 31;
        String str = this.accountId;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.deviceId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.expirationDate;
        int hashCode5 = (hashCode4 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        SubscriptionExpiryType subscriptionExpiryType = this.expiryType;
        int hashCode6 = (hashCode5 + (subscriptionExpiryType != null ? subscriptionExpiryType.hashCode() : 0)) * 31;
        String str3 = this.externalIdentity;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6088id;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DateTime dateTime2 = this.lastSyncDate;
        int hashCode9 = (hashCode8 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
        DateTime dateTime3 = this.nextRenewalDate;
        int hashCode10 = (hashCode9 + (dateTime3 != null ? dateTime3.hashCode() : 0)) * 31;
        DateTime dateTime4 = this.startDate;
        int hashCode11 = (hashCode10 + (dateTime4 != null ? dateTime4.hashCode() : 0)) * 31;
        SubscriptionStatus subscriptionStatus = this.status;
        int hashCode12 = (hashCode11 + (subscriptionStatus != null ? subscriptionStatus.hashCode() : 0)) * 31;
        SubscriptionType subscriptionType = this.type;
        int hashCode13 = (hashCode12 + (subscriptionType != null ? subscriptionType.hashCode() : 0)) * 31;
        DateTime dateTime5 = this.purchaseDate;
        int hashCode14 = (hashCode13 + (dateTime5 != null ? dateTime5.hashCode() : 0)) * 31;
        Boolean bool = this.bundle;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode14 + i2;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isBoundToAccount() {
        return isBoundToAccount$default(this, null, 1, null);
    }

    public final boolean isBoundToAccount(Account account) {
        if (account != null && Intrinsics.areEqual((Object) account.getAccountId(), (Object) this.accountId)) {
            return true;
        }
        if (account != null || this.accountId == null) {
            return false;
        }
        return true;
    }

    public final boolean isBoundToDevice() {
        return this.deviceId != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subscription(isActive=");
        sb.append(this.isActive);
        sb.append(", products=");
        sb.append(this.products);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", accountId=");
        sb.append(this.accountId);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", expirationDate=");
        sb.append(this.expirationDate);
        sb.append(", expiryType=");
        sb.append(this.expiryType);
        sb.append(", externalIdentity=");
        sb.append(this.externalIdentity);
        sb.append(", id=");
        sb.append(this.f6088id);
        sb.append(", lastSyncDate=");
        sb.append(this.lastSyncDate);
        sb.append(", nextRenewalDate=");
        sb.append(this.nextRenewalDate);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", purchaseDate=");
        sb.append(this.purchaseDate);
        sb.append(", bundle=");
        sb.append(this.bundle);
        sb.append(")");
        return sb.toString();
    }

    public Subscription() {
        List a = C13185o.m40513a();
        SubscriptionSource subscriptionSource = r1;
        SubscriptionSource subscriptionSource2 = new SubscriptionSource();
        SubscriptionExpiryType subscriptionExpiryType = SubscriptionExpiryType.UNKNOWN;
        SubscriptionStatus subscriptionStatus = r1;
        SubscriptionStatus subscriptionStatus2 = new SubscriptionStatus();
        this(false, a, subscriptionSource, null, null, null, subscriptionExpiryType, null, "MISSING", null, null, null, subscriptionStatus, null, null, null);
    }
}
