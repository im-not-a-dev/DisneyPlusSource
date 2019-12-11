package com.bamtech.sdk4.internal.device;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.configuration.DeviceType;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 22\u00020\u0001:\u00012B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003JE\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\b\u00101\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\rR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\rR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\r¨\u00063"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/device/Device;", "", "brand", "", "manufacturer", "model", "product", "os", "deviceType", "Lcom/bamtech/sdk4/configuration/DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/configuration/DeviceType;)V", "applicationRuntime", "getApplicationRuntime", "()Ljava/lang/String;", "attributes", "", "getAttributes", "()Ljava/util/Map;", "getBrand", "deviceFamily", "getDeviceFamily", "deviceProfile", "getDeviceProfile", "getDeviceType", "()Lcom/bamtech/sdk4/configuration/DeviceType;", "formFactor", "getFormFactor", "getManufacturer", "getModel", "getOs", "platform", "getPlatform", "getProduct", "sdkPlatform", "getSdkPlatform", "tokenExchangePlatform", "getTokenExchangePlatform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Device.kt */
public final class Device {
    public static final String ATTRIBUTE_UNAVAILABLE = "unavailable";
    public static final Companion Companion = new Companion(null);
    private final String applicationRuntime;
    private final Map<String, String> attributes;
    private final transient String brand;
    private final String deviceFamily;
    private final String deviceProfile;
    private final transient DeviceType deviceType;
    private final transient String formFactor;
    private final transient String manufacturer;
    private final transient StringMODEL;

    /* renamed from: os */
    private final transient String f6072os;
    private final transient String platform;
    private final transient String product;
    private final transient String sdkPlatform;
    private final transient String tokenExchangePlatform;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u000e\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/device/Device$Companion;", "", "()V", "ATTRIBUTE_UNAVAILABLE", "", "init", "Lcom/bamtech/sdk4/internal/device/Device;", "brand", "manufacturer", "model", "product", "os", "deviceType", "Lcom/bamtech/sdk4/configuration/DeviceType;", "unavailableIfEmpty", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Device.kt */
    public static final class Companion {
        private Companion() {
        }

        private final String unavailableIfEmpty(String str) {
            if (str == null || C12832w.m40118a(str)) {
                return Device.ATTRIBUTE_UNAVAILABLE;
            }
            if (str != null) {
                return str;
            }
            Intrinsics.throwNpe();
            throw null;
        }

        public final Device init(String str, String str2, String str3, String str4, String str5, DeviceType deviceType) {
            Device device = new Device(unavailableIfEmpty(str), unavailableIfEmpty(str2), unavailableIfEmpty(str3), unavailableIfEmpty(str4), unavailableIfEmpty(str5), deviceType, null);
            return device;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[DeviceType.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[DeviceType.values().length];

        static {
            $EnumSwitchMapping$0[DeviceType.TV.ordinal()] = 1;
            $EnumSwitchMapping$1[DeviceType.TV.ordinal()] = 1;
        }
    }

    private Device(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2) {
        String str6;
        this.brand = str;
        this.manufacturer = str2;
        this.model = str3;
        this.product = str4;
        this.f6072os = str5;
        this.deviceType = deviceType2;
        String str7 = "android";
        this.deviceFamily = str7;
        String str8 = this.manufacturer;
        String str9 = "null cannot be cast to non-null type java.lang.String";
        if (str8 != null) {
            String lowerCase = str8.toLowerCase();
            String str10 = "(this as java.lang.String).toLowerCase()";
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, str10);
            String str11 = "amazon";
            this.applicationRuntime = (lowerCase.hashCode() == -1414265340 && lowerCase.equals(str11)) ? str11 : str7;
            this.deviceProfile = this.deviceType.toString();
            this.attributes = C13173j0.m40356a(C12907r.m40244a("manufacturer", this.manufacturer), C12907r.m40244a("model", this.model), C12907r.m40244a("brand", this.brand), C12907r.m40244a("product", this.product));
            String str12 = this.manufacturer;
            if (str12 != null) {
                String lowerCase2 = str12.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase2, str10);
                this.platform = (lowerCase2.hashCode() == -1414265340 && lowerCase2.equals(str11)) ? str11 : "google";
                this.formFactor = WhenMappings.$EnumSwitchMapping$0[this.deviceType.ordinal()] != 1 ? "handset" : "tv";
                String str13 = WhenMappings.$EnumSwitchMapping$1[this.deviceType.ordinal()] != 1 ? "" : "-tv";
                String str14 = this.manufacturer;
                if (str14 != null) {
                    String lowerCase3 = str14.toLowerCase();
                    Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase3, str10);
                    if (lowerCase3.hashCode() == -1414265340 && lowerCase3.equals(str11)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str11);
                        sb.append(str13);
                        str6 = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str7);
                        sb2.append(str13);
                        str6 = sb2.toString();
                    }
                    this.tokenExchangePlatform = str6;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.applicationRuntime);
                    sb3.append('-');
                    sb3.append(this.deviceProfile);
                    this.sdkPlatform = sb3.toString();
                    return;
                }
                throw new C13142s(str9);
            }
            throw new C13142s(str9);
        }
        throw new C13142s(str9);
    }

    public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, String str4, String str5, DeviceType deviceType2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = device.brand;
        }
        if ((i & 2) != 0) {
            str2 = device.manufacturer;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = device.model;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = device.product;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = device.f6072os;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            deviceType2 = device.deviceType;
        }
        return device.copy(str, str6, str7, str8, str9, deviceType2);
    }

    public static final Device init(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2) {
        return Companion.init(str, str2, str3, str4, str5, deviceType2);
    }

    public final String component1() {
        return this.brand;
    }

    public final String component2() {
        return this.manufacturer;
    }

    public final String component3() {
        return this.model;
    }

    public final String component4() {
        return this.product;
    }

    public final String component5() {
        return this.f6072os;
    }

    public final DeviceType component6() {
        return this.deviceType;
    }

    public final Device copy(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2) {
        Device device = new Device(str, str2, str3, str4, str5, deviceType2);
        return device;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.deviceType, (java.lang.Object) r3.deviceType) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.device.Device
            if (r0 == 0) goto L_0x0045
            com.bamtech.sdk4.internal.device.Device r3 = (com.bamtech.sdk4.internal.device.Device) r3
            java.lang.String r0 = r2.brand
            java.lang.String r1 = r3.brand
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.manufacturer
            java.lang.String r1 = r3.manufacturer
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.model
            java.lang.String r1 = r3.model
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.product
            java.lang.String r1 = r3.product
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f6072os
            java.lang.String r1 = r3.f6072os
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtech.sdk4.configuration.DeviceType r0 = r2.deviceType
            com.bamtech.sdk4.configuration.DeviceType r3 = r3.deviceType
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.device.Device.equals(java.lang.Object):boolean");
    }

    public final String getApplicationRuntime() {
        return this.applicationRuntime;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getDeviceFamily() {
        return this.deviceFamily;
    }

    public final String getDeviceProfile() {
        return this.deviceProfile;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getFormFactor() {
        return this.formFactor;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.f6072os;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSdkPlatform() {
        return this.sdkPlatform;
    }

    public final String getTokenExchangePlatform() {
        return this.tokenExchangePlatform;
    }

    public int hashCode() {
        String str = this.brand;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.manufacturer;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.model;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.product;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f6072os;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        DeviceType deviceType2 = this.deviceType;
        if (deviceType2 != null) {
            i = deviceType2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Device(brand='");
        sb.append(this.brand);
        sb.append("', manufacturer='");
        sb.append(this.manufacturer);
        sb.append("',MODEL='");
        sb.append(this.model);
        sb.append("', product='");
        sb.append(this.product);
        sb.append("', os='");
        sb.append(this.f6072os);
        sb.append("', deviceType=");
        sb.append(this.deviceType);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, deviceType2);
    }
}
