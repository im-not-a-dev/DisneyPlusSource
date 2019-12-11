package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import net.danlew.android.joda.DateUtils;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0002\u0010%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006H"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/Services;", "", "()V", "account", "Lcom/bamtech/sdk4/internal/configuration/AccountServiceConfiguration;", "adEngine", "Lcom/bamtech/sdk4/internal/configuration/AdEngineServiceConfiguration;", "bamIdentity", "Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceConfiguration;", "commerce", "Lcom/bamtech/sdk4/internal/configuration/CommerceServiceConfiguration;", "content", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "customerService", "Lcom/bamtech/sdk4/internal/configuration/CustomerServiceConfiguration;", "device", "Lcom/bamtech/sdk4/internal/configuration/DeviceServiceConfiguration;", "drm", "Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "media", "Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "paywall", "Lcom/bamtech/sdk4/internal/configuration/PaywallServiceConfiguration;", "purchase", "Lcom/bamtech/sdk4/internal/configuration/PurchaseServiceConfiguration;", "pushMessaging", "Lcom/bamtech/sdk4/internal/configuration/PushMessagingConfiguration;", "session", "Lcom/bamtech/sdk4/internal/configuration/SessionServiceConfiguration;", "subscription", "Lcom/bamtech/sdk4/internal/configuration/SubscriptionServiceConfiguration;", "telemetry", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "token", "Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "edge", "Lcom/bamtech/sdk4/internal/configuration/EdgeServiceConfiguration;", "(Lcom/bamtech/sdk4/internal/configuration/AccountServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/AdEngineServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/CommerceServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/CustomerServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/DeviceServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/PaywallServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/PurchaseServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/PushMessagingConfiguration;Lcom/bamtech/sdk4/internal/configuration/SessionServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/SubscriptionServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;Lcom/bamtech/sdk4/internal/configuration/EdgeServiceConfiguration;)V", "getAccount", "()Lcom/bamtech/sdk4/internal/configuration/AccountServiceConfiguration;", "getAdEngine", "()Lcom/bamtech/sdk4/internal/configuration/AdEngineServiceConfiguration;", "getBamIdentity", "()Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceConfiguration;", "getCommerce", "()Lcom/bamtech/sdk4/internal/configuration/CommerceServiceConfiguration;", "getContent", "()Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "getCustomerService", "()Lcom/bamtech/sdk4/internal/configuration/CustomerServiceConfiguration;", "getDevice", "()Lcom/bamtech/sdk4/internal/configuration/DeviceServiceConfiguration;", "getDrm", "()Lcom/bamtech/sdk4/internal/configuration/DrmServiceConfiguration;", "getEdge", "()Lcom/bamtech/sdk4/internal/configuration/EdgeServiceConfiguration;", "getMedia", "()Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "getPaywall", "()Lcom/bamtech/sdk4/internal/configuration/PaywallServiceConfiguration;", "getPurchase", "()Lcom/bamtech/sdk4/internal/configuration/PurchaseServiceConfiguration;", "getPushMessaging", "()Lcom/bamtech/sdk4/internal/configuration/PushMessagingConfiguration;", "getSession", "()Lcom/bamtech/sdk4/internal/configuration/SessionServiceConfiguration;", "getSubscription", "()Lcom/bamtech/sdk4/internal/configuration/SubscriptionServiceConfiguration;", "getTelemetry", "()Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "getToken", "()Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Configuration.kt */
public final class Services {
    private final AccountServiceConfiguration account;
    private final AdEngineServiceConfiguration adEngine;
    private final BamIdentityServiceConfiguration bamIdentity;
    private final CommerceServiceConfiguration commerce;
    private final ContentServiceConfiguration content;
    private final CustomerServiceConfiguration customerService;
    private final DeviceServiceConfiguration device;
    private final DrmServiceConfiguration drm;
    private final EdgeServiceConfiguration edge;
    private final MediaServiceConfiguration media;
    private final PaywallServiceConfiguration paywall;
    private final PurchaseServiceConfiguration purchase;
    private final PushMessagingConfiguration pushMessaging;
    private final SessionServiceConfiguration session;
    private final SubscriptionServiceConfiguration subscription;
    private final TelemetryServiceConfiguration telemetry;
    private final TokenServiceConfiguration token;

    public Services(AccountServiceConfiguration accountServiceConfiguration, AdEngineServiceConfiguration adEngineServiceConfiguration, BamIdentityServiceConfiguration bamIdentityServiceConfiguration, CommerceServiceConfiguration commerceServiceConfiguration, ContentServiceConfiguration contentServiceConfiguration, CustomerServiceConfiguration customerServiceConfiguration, DeviceServiceConfiguration deviceServiceConfiguration, DrmServiceConfiguration drmServiceConfiguration, MediaServiceConfiguration mediaServiceConfiguration, PaywallServiceConfiguration paywallServiceConfiguration, PurchaseServiceConfiguration purchaseServiceConfiguration, PushMessagingConfiguration pushMessagingConfiguration, SessionServiceConfiguration sessionServiceConfiguration, SubscriptionServiceConfiguration subscriptionServiceConfiguration, TelemetryServiceConfiguration telemetryServiceConfiguration, TokenServiceConfiguration tokenServiceConfiguration, EdgeServiceConfiguration edgeServiceConfiguration) {
        this.account = accountServiceConfiguration;
        this.adEngine = adEngineServiceConfiguration;
        this.bamIdentity = bamIdentityServiceConfiguration;
        this.commerce = commerceServiceConfiguration;
        this.content = contentServiceConfiguration;
        this.customerService = customerServiceConfiguration;
        this.device = deviceServiceConfiguration;
        this.drm = drmServiceConfiguration;
        this.media = mediaServiceConfiguration;
        this.paywall = paywallServiceConfiguration;
        this.purchase = purchaseServiceConfiguration;
        this.pushMessaging = pushMessagingConfiguration;
        this.session = sessionServiceConfiguration;
        this.subscription = subscriptionServiceConfiguration;
        this.telemetry = telemetryServiceConfiguration;
        this.token = tokenServiceConfiguration;
        this.edge = edgeServiceConfiguration;
    }

    public final AccountServiceConfiguration getAccount() {
        return this.account;
    }

    public final AdEngineServiceConfiguration getAdEngine() {
        return this.adEngine;
    }

    public final BamIdentityServiceConfiguration getBamIdentity() {
        return this.bamIdentity;
    }

    public final CommerceServiceConfiguration getCommerce() {
        return this.commerce;
    }

    public final ContentServiceConfiguration getContent() {
        return this.content;
    }

    public final CustomerServiceConfiguration getCustomerService() {
        return this.customerService;
    }

    public final DeviceServiceConfiguration getDevice() {
        return this.device;
    }

    public final DrmServiceConfiguration getDrm() {
        return this.drm;
    }

    public final EdgeServiceConfiguration getEdge() {
        return this.edge;
    }

    public final MediaServiceConfiguration getMedia() {
        return this.media;
    }

    public final PaywallServiceConfiguration getPaywall() {
        return this.paywall;
    }

    public final PurchaseServiceConfiguration getPurchase() {
        return this.purchase;
    }

    public final PushMessagingConfiguration getPushMessaging() {
        return this.pushMessaging;
    }

    public final SessionServiceConfiguration getSession() {
        return this.session;
    }

    public final SubscriptionServiceConfiguration getSubscription() {
        return this.subscription;
    }

    public final TelemetryServiceConfiguration getTelemetry() {
        return this.telemetry;
    }

    public final TokenServiceConfiguration getToken() {
        return this.token;
    }

    public /* synthetic */ Services(AccountServiceConfiguration accountServiceConfiguration, AdEngineServiceConfiguration adEngineServiceConfiguration, BamIdentityServiceConfiguration bamIdentityServiceConfiguration, CommerceServiceConfiguration commerceServiceConfiguration, ContentServiceConfiguration contentServiceConfiguration, CustomerServiceConfiguration customerServiceConfiguration, DeviceServiceConfiguration deviceServiceConfiguration, DrmServiceConfiguration drmServiceConfiguration, MediaServiceConfiguration mediaServiceConfiguration, PaywallServiceConfiguration paywallServiceConfiguration, PurchaseServiceConfiguration purchaseServiceConfiguration, PushMessagingConfiguration pushMessagingConfiguration, SessionServiceConfiguration sessionServiceConfiguration, SubscriptionServiceConfiguration subscriptionServiceConfiguration, TelemetryServiceConfiguration telemetryServiceConfiguration, TokenServiceConfiguration tokenServiceConfiguration, EdgeServiceConfiguration edgeServiceConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        AccountServiceConfiguration accountServiceConfiguration2 = (i2 & 1) != 0 ? new AccountServiceConfiguration() : accountServiceConfiguration;
        this(accountServiceConfiguration2, (i2 & 2) != 0 ? new AdEngineServiceConfiguration() : adEngineServiceConfiguration, (i2 & 4) != 0 ? new BamIdentityServiceConfiguration() : bamIdentityServiceConfiguration, (i2 & 8) != 0 ? new CommerceServiceConfiguration() : commerceServiceConfiguration, (i2 & 16) != 0 ? new ContentServiceConfiguration() : contentServiceConfiguration, (i2 & 32) != 0 ? new CustomerServiceConfiguration() : customerServiceConfiguration, (i2 & 64) != 0 ? new DeviceServiceConfiguration() : deviceServiceConfiguration, (i2 & 128) != 0 ? new DrmServiceConfiguration() : drmServiceConfiguration, (i2 & 256) != 0 ? new MediaServiceConfiguration() : mediaServiceConfiguration, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? new PaywallServiceConfiguration() : paywallServiceConfiguration, (i2 & 1024) != 0 ? new PurchaseServiceConfiguration() : purchaseServiceConfiguration, (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? new PushMessagingConfiguration() : pushMessagingConfiguration, (i2 & 4096) != 0 ? new SessionServiceConfiguration() : sessionServiceConfiguration, (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? new SubscriptionServiceConfiguration() : subscriptionServiceConfiguration, (i2 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? new TelemetryServiceConfiguration() : telemetryServiceConfiguration, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? new TokenServiceConfiguration() : tokenServiceConfiguration, (i2 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? new EdgeServiceConfiguration() : edgeServiceConfiguration);
    }

    public Services() {
        AccountServiceConfiguration accountServiceConfiguration = r2;
        AccountServiceConfiguration accountServiceConfiguration2 = new AccountServiceConfiguration();
        AdEngineServiceConfiguration adEngineServiceConfiguration = r3;
        AdEngineServiceConfiguration adEngineServiceConfiguration2 = new AdEngineServiceConfiguration();
        BamIdentityServiceConfiguration bamIdentityServiceConfiguration = r4;
        BamIdentityServiceConfiguration bamIdentityServiceConfiguration2 = new BamIdentityServiceConfiguration();
        CommerceServiceConfiguration commerceServiceConfiguration = r5;
        CommerceServiceConfiguration commerceServiceConfiguration2 = new CommerceServiceConfiguration();
        ContentServiceConfiguration contentServiceConfiguration = r6;
        ContentServiceConfiguration contentServiceConfiguration2 = new ContentServiceConfiguration();
        CustomerServiceConfiguration customerServiceConfiguration = r7;
        CustomerServiceConfiguration customerServiceConfiguration2 = new CustomerServiceConfiguration();
        DeviceServiceConfiguration deviceServiceConfiguration = r8;
        DeviceServiceConfiguration deviceServiceConfiguration2 = new DeviceServiceConfiguration();
        DrmServiceConfiguration drmServiceConfiguration = r9;
        DrmServiceConfiguration drmServiceConfiguration2 = new DrmServiceConfiguration();
        MediaServiceConfiguration mediaServiceConfiguration = r10;
        MediaServiceConfiguration mediaServiceConfiguration2 = new MediaServiceConfiguration();
        PaywallServiceConfiguration paywallServiceConfiguration = r11;
        PaywallServiceConfiguration paywallServiceConfiguration2 = new PaywallServiceConfiguration();
        PurchaseServiceConfiguration purchaseServiceConfiguration = r12;
        PurchaseServiceConfiguration purchaseServiceConfiguration2 = new PurchaseServiceConfiguration();
        PushMessagingConfiguration pushMessagingConfiguration = r13;
        PushMessagingConfiguration pushMessagingConfiguration2 = new PushMessagingConfiguration();
        SessionServiceConfiguration sessionServiceConfiguration = r14;
        SessionServiceConfiguration sessionServiceConfiguration2 = new SessionServiceConfiguration();
        SubscriptionServiceConfiguration subscriptionServiceConfiguration = r15;
        SubscriptionServiceConfiguration subscriptionServiceConfiguration2 = new SubscriptionServiceConfiguration();
        TelemetryServiceConfiguration telemetryServiceConfiguration = r16;
        TelemetryServiceConfiguration telemetryServiceConfiguration2 = new TelemetryServiceConfiguration();
        TokenServiceConfiguration tokenServiceConfiguration = r17;
        TokenServiceConfiguration tokenServiceConfiguration2 = new TokenServiceConfiguration();
        EdgeServiceConfiguration edgeServiceConfiguration = r18;
        EdgeServiceConfiguration edgeServiceConfiguration2 = new EdgeServiceConfiguration();
        this(accountServiceConfiguration, adEngineServiceConfiguration, bamIdentityServiceConfiguration, commerceServiceConfiguration, contentServiceConfiguration, customerServiceConfiguration, deviceServiceConfiguration, drmServiceConfiguration, mediaServiceConfiguration, paywallServiceConfiguration, purchaseServiceConfiguration, pushMessagingConfiguration, sessionServiceConfiguration, subscriptionServiceConfiguration, telemetryServiceConfiguration, tokenServiceConfiguration, edgeServiceConfiguration);
    }
}
