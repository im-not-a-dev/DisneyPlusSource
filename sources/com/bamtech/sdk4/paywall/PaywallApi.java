package com.bamtech.sdk4.paywall;

import com.bamtech.sdk4.plugin.PluginApi;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/paywall/PaywallApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "getPaywall", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/paywall/Paywall;", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PaywallApi.kt */
public interface PaywallApi extends PluginApi {
    Single<Paywall> getPaywall();
}
