package com.bamtech.sdk4.internal.media.adengine;

import android.app.Application;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00018BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/DefaultAdvertisingIdProvider;", "Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "delegate", "getDelegate", "()Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;", "delegate$delegate", "Lkotlin/Lazy;", "getId", "", "limitTracking", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultAdvertisingIdProvider.kt */
public final class DefaultAdvertisingIdProvider implements AdvertisingIdProvider {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(DefaultAdvertisingIdProvider.class), "delegate", "getDelegate()Lcom/bamtech/sdk4/media/adengine/AdvertisingIdProvider;"))};
    private final Lazy delegate$delegate;

    public DefaultAdvertisingIdProvider(Application application) {
        this.delegate$delegate = C12763i.m39921a(new DefaultAdvertisingIdProvider$delegate$2(application));
    }

    private final AdvertisingIdProvider getDelegate() {
        Lazy lazy = this.delegate$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (AdvertisingIdProvider) lazy.getValue();
    }

    public String getId() {
        AdvertisingIdProvider delegate = getDelegate();
        if (delegate != null) {
            return delegate.getId();
        }
        return null;
    }

    public boolean limitTracking() {
        AdvertisingIdProvider delegate = getDelegate();
        if (delegate != null) {
            return delegate.limitTracking();
        }
        return true;
    }
}
