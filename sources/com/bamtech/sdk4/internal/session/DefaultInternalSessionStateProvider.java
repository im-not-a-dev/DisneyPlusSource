package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.account.legacy.LegacyContextExtension;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.session.InternalSessionState.Legacy;
import com.bamtech.sdk4.token.AccessContext;
import com.jakewharton.rxrelay2.BehaviorRelay;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B5\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/DefaultInternalSessionStateProvider;", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "legacyContextExtension", "Lcom/bamtech/sdk4/account/legacy/LegacyContextExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/core/Storage;Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Ljavax/inject/Provider;)V", "currentInternalSessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "getCurrentInternalSessionState", "()Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "relay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "resumed", "", "removeLegacyAccountContext", "", "resume", "resume$sdk_core_api_release", "setInternalSessionState", "state", "watchInternalSessionState", "Lio/reactivex/Observable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: InternalSessionStateProvider.kt */
public final class DefaultInternalSessionStateProvider implements InternalSessionStateProvider {
    private final BootstrapConfiguration bootstrapConfiguration;
    private final Provider<LegacyContextExtension> legacyContextExtension;
    private final BehaviorRelay<InternalSessionState> relay;
    private boolean resumed;
    private final Storage storage;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultInternalSessionStateProvider(Provider<ServiceTransaction> provider, Storage storage2, BootstrapConfiguration bootstrapConfiguration2, Provider<LegacyContextExtension> provider2) {
        this.transactionProvider = provider;
        this.storage = storage2;
        this.bootstrapConfiguration = bootstrapConfiguration2;
        this.legacyContextExtension = provider2;
        BehaviorRelay<InternalSessionState> o = BehaviorRelay.m33217o();
        C12880j.m40222a((Object) o, "BehaviorRelay.create<InternalSessionState>()");
        this.relay = o;
    }

    public InternalSessionState getCurrentInternalSessionState() {
        resume$sdk_core_api_release();
        Object n = this.relay.mo27410n();
        if (n != null) {
            return (InternalSessionState) n;
        }
        C12880j.m40220a();
        throw null;
    }

    public void removeLegacyAccountContext() {
        resume$sdk_core_api_release();
        ((LegacyContextExtension) this.legacyContextExtension.get()).removeLegacyContext(this.bootstrapConfiguration.getClientId(), this.bootstrapConfiguration.getEnvironment());
    }

    public final void resume$sdk_core_api_release() {
        Object obj;
        if (!this.resumed) {
            AccessContext legacyContext = ((LegacyContextExtension) this.legacyContextExtension.get()).getLegacyContext(this.bootstrapConfiguration.getClientId(), this.bootstrapConfiguration.getEnvironment());
            if (legacyContext == null) {
                Storage storage2 = this.storage;
                Object obj2 = this.transactionProvider.get();
                C12880j.m40222a(obj2, "transactionProvider.get()");
                obj = SessionStateExtensionsKt.getSessionState(storage2, (ServiceTransaction) obj2);
            } else {
                obj = new Legacy(legacyContext);
            }
            this.relay.accept(obj);
        }
        this.resumed = true;
    }

    public void setInternalSessionState(InternalSessionState internalSessionState) {
        resume$sdk_core_api_release();
        SessionStateExtensionsKt.saveSessionState(this.storage, internalSessionState);
        this.relay.accept(internalSessionState);
    }

    public Observable<InternalSessionState> watchInternalSessionState() {
        resume$sdk_core_api_release();
        return this.relay;
    }
}
