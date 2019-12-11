package com.bamtech.sdk4.internal.device;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.token.Grant;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/device/DefaultDeviceManager;", "Lcom/bamtech/sdk4/internal/device/DeviceManager;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "client", "Lcom/bamtech/sdk4/internal/device/DeviceClient;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "(Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;Lcom/bamtech/sdk4/internal/device/DeviceClient;Lcom/bamtech/sdk4/internal/core/Storage;)V", "getDeviceGrant", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/token/Grant;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "registerDevice", "resetDeviceGrant", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceManager.kt */
public final class DefaultDeviceManager implements DeviceManager {
    private final BootstrapConfiguration bootstrapConfiguration;
    private final DeviceClient client;
    /* access modifiers changed from: private */
    public final Storage storage;

    public DefaultDeviceManager(BootstrapConfiguration bootstrapConfiguration2, DeviceClient deviceClient, Storage storage2) {
        this.bootstrapConfiguration = bootstrapConfiguration2;
        this.client = deviceClient;
        this.storage = storage2;
    }

    private final Single<? extends Grant> registerDevice(ServiceTransaction serviceTransaction) {
        Single<? extends Grant> b = this.client.register(serviceTransaction, this.bootstrapConfiguration.getDevice(), C13170i0.m40332a(C12907r.m40244a("{apiKey}", this.bootstrapConfiguration.getApiKey()))).mo30222c((Consumer<? super Disposable>) new DefaultDeviceManager$registerDevice$1<Object>(serviceTransaction)).mo30223c((C11945a) new DefaultDeviceManager$registerDevice$2(this, serviceTransaction)).mo30227d((Consumer<? super T>) new DefaultDeviceManager$registerDevice$3<Object>(this)).mo30218b((Consumer<? super Throwable>) new DefaultDeviceManager$registerDevice$4<Object>(serviceTransaction));
        C12880j.m40222a((Object) b, "client.register(transact….ERROR)\n                }");
        return b;
    }

    public Single<? extends Grant> getDeviceGrant(ServiceTransaction serviceTransaction) {
        DeviceGrant existingDeviceGrant = DeviceGrantKt.getExistingDeviceGrant(this.storage);
        if (existingDeviceGrant == null) {
            return registerDevice(serviceTransaction);
        }
        DefaultImpls.d$default(serviceTransaction, this, "SavedDeviceGrantFound", false, 4, null);
        Single<? extends Grant> b = Single.m38399b(existingDeviceGrant);
        C12880j.m40222a((Object) b, "Single.just(deviceGrant)");
        return b;
    }

    public Single<? extends Grant> resetDeviceGrant(ServiceTransaction serviceTransaction) {
        Single<? extends Grant> b = Completable.m38166c((C11945a) new DefaultDeviceManager$resetDeviceGrant$1(this)).mo30044a((SingleSource<T>) getDeviceGrant(serviceTransaction)).mo30222c((Consumer<? super Disposable>) new DefaultDeviceManager$resetDeviceGrant$2<Object>(serviceTransaction)).mo30218b((Consumer<? super Throwable>) new DefaultDeviceManager$resetDeviceGrant$3<Object>(serviceTransaction));
        C12880j.m40222a((Object) b, "Completable.fromAction {…      )\n                }");
        return b;
    }
}
