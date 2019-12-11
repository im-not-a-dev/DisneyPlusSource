package com.bamtechmedia.dominguez.ctvactivation.api;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/api/DeviceModel;", "", "deviceName", "", "getDeviceName", "()Ljava/lang/String;", "peerId", "getPeerId", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ctvactivation.api.b */
/* compiled from: DeviceModel.kt */
public interface C5890b {

    /* renamed from: com.bamtechmedia.dominguez.ctvactivation.api.b$a */
    /* compiled from: DeviceModel.kt */
    public static final class C5891a {
        /* renamed from: a */
        public static String m18961a(C5890b bVar) {
            String str = Build.MODEL;
            C12880j.m40222a((Object) str, "Build.MODEL");
            return str;
        }
    }
}
