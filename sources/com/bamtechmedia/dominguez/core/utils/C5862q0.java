package com.bamtechmedia.dominguez.core.utils;

import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build.VERSION;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;", "", "()V", "deviceDetails", "Lcom/bamtechmedia/dominguez/core/utils/WidevineDeviceDetails;", "getDeviceDetails", "()Lcom/bamtechmedia/dominguez/core/utils/WidevineDeviceDetails;", "deviceDetails$delegate", "Lkotlin/Lazy;", "matchesSecurityProfile", "", "getMatchesSecurityProfile", "()Z", "releaseMediaDrm", "", "mediaDrm", "Landroid/media/MediaDrm;", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"WrongConstant"})
/* renamed from: com.bamtechmedia.dominguez.core.utils.q0 */
/* compiled from: WidevineUtils.kt */
public final class C5862q0 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f13647b = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C5862q0.class), "deviceDetails", "getDeviceDetails()Lcom/bamtechmedia/dominguez/core/utils/WidevineDeviceDetails;"))};

    /* renamed from: a */
    private final Lazy f13648a = C12763i.m39921a(new C5863a(this));

    /* renamed from: com.bamtechmedia.dominguez.core.utils.q0$a */
    /* compiled from: WidevineUtils.kt */
    static final class C5863a extends C12881k implements Function0<C5860p0> {

        /* renamed from: c */
        final /* synthetic */ C5862q0 f13649c;

        C5863a(C5862q0 q0Var) {
            this.f13649c = q0Var;
            super(0);
        }

        public final C5860p0 invoke() {
            String str = "deviceUniqueId";
            String str2 = "systemId";
            String str3 = "securityLevel";
            String str4 = "maxHdcpLevel";
            try {
                MediaDrm mediaDrm = new MediaDrm(C.WIDEVINE_UUID);
                String propertyString = mediaDrm.getPropertyString(str4);
                String propertyString2 = mediaDrm.getPropertyString(str3);
                String propertyString3 = mediaDrm.getPropertyString(str2);
                String encodeToString = Base64.encodeToString(mediaDrm.getPropertyByteArray(str), 2);
                this.f13649c.m18907a(mediaDrm);
                Intrinsics.checkReturnedValueIsNotNull((Object) propertyString2, str3);
                Intrinsics.checkReturnedValueIsNotNull((Object) propertyString, str4);
                Intrinsics.checkReturnedValueIsNotNull((Object) encodeToString, str);
                Intrinsics.checkReturnedValueIsNotNull((Object) propertyString3, str2);
                return new C5860p0(propertyString2, propertyString, encodeToString, propertyString3);
            } catch (UnsupportedSchemeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Widevine DRM scheme not supported: ");
                sb.append(e.getMessage());
                Timber.m44528b(e, sb.toString(), new Object[0]);
                return null;
            } catch (IllegalStateException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error while checking for hdcp protection: ");
                sb2.append(e2.getMessage());
                Timber.m44528b(e2, sb2.toString(), new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final C5860p0 mo17767a() {
        Lazy lazy = this.f13648a;
        KProperty kProperty = f13647b[0];
        return (C5860p0) lazy.getValue();
    }

    /* renamed from: b */
    public final boolean mo17768b() {
        C5860p0 a = mo17767a();
        return Intrinsics.areEqual((Object) a != null ? a.mo17762b() : null, (Object) "L1");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18907a(MediaDrm mediaDrm) {
        if (VERSION.SDK_INT >= 28) {
            mediaDrm.close();
        } else {
            mediaDrm.release();
        }
    }
}
