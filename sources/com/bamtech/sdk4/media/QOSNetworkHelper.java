package com.bamtech.sdk4.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.service.ForbiddenException;
import com.bamtech.sdk4.service.NetworkException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.C12898l;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "Lcom/bamtech/sdk4/plugin/Extension;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "connectionStatus", "Lcom/bamtech/sdk4/media/ConnectionStatus;", "currentNetworkType", "Lcom/bamtech/sdk4/media/NetworkType;", "getMobileNetworkType", "translateLicenseError", "Lcom/bamtech/sdk4/media/NetworkError;", "error", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSNetworkHelper.kt */
public final class QOSNetworkHelper implements Extension {
    private final Context context;

    public QOSNetworkHelper(Context context2) {
        this.context = context2;
    }

    @SuppressLint({"SwitchIntDef"})
    private final NetworkType getMobileNetworkType() {
        Context context2 = this.context;
        Integer num = null;
        Object systemService = context2 != null ? context2.getSystemService("phone") : null;
        if (!(systemService instanceof TelephonyManager)) {
            systemService = null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (telephonyManager != null) {
            num = Integer.valueOf(telephonyManager.getNetworkType());
        }
        if ((num != null && num.intValue() == 3) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 6) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 9) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 12) || ((num != null && num.intValue() == 14) || ((num != null && num.intValue() == 15) || (num != null && num.intValue() == 17)))))))))) {
            return NetworkType.cellular3g;
        }
        if ((num != null && num.intValue() == 13) || (num != null && num.intValue() == 18)) {
            return NetworkType.cellular4g;
        }
        if (num != null && num.intValue() == 20) {
            return NetworkType.cellular5g;
        }
        return NetworkType.unknown;
    }

    @SuppressLint({"MissingPermission"})
    public final ConnectionStatus connectionStatus() {
        try {
            Context context2 = this.context;
            Boolean bool = null;
            Object systemService = context2 != null ? context2.getSystemService("connectivity") : null;
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    bool = Boolean.valueOf(activeNetworkInfo.isConnected());
                }
                if (bool == null) {
                    return ConnectionStatus.disconnected;
                }
                if (C12880j.m40224a((Object) bool, (Object) Boolean.valueOf(false))) {
                    return ConnectionStatus.disconnected;
                }
                if (C12880j.m40224a((Object) bool, (Object) Boolean.valueOf(true))) {
                    return ConnectionStatus.connected;
                }
                throw new C12898l();
            }
            throw new C13142s("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return ConnectionStatus.unknown;
        }
    }

    public final NetworkType currentNetworkType() {
        NetworkType networkType;
        Context context2 = this.context;
        if (context2 != null) {
            Object systemService = context2.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && !activeNetworkInfo.isConnected()) {
                    networkType = NetworkType.unknown;
                } else if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                    networkType = getMobileNetworkType();
                } else {
                    networkType = NetworkType.wifi;
                }
                if (networkType != null) {
                    return networkType;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }
        return NetworkType.unknown;
    }

    public final NetworkError translateLicenseError(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th instanceof ForbiddenException) {
            return NetworkError.prohibited;
        }
        boolean z = th instanceof NetworkException;
        if (z && connectionStatus() == ConnectionStatus.disconnected) {
            return NetworkError.notConnected;
        }
        if (z && connectionStatus() == ConnectionStatus.unknown) {
            return NetworkError.unknown;
        }
        if (z && (th.getCause() instanceof UnknownHostException)) {
            return NetworkError.dns;
        }
        if (!z || !(th.getCause() instanceof SocketTimeoutException)) {
            return NetworkError.unknown;
        }
        return NetworkError.timeout;
    }
}
