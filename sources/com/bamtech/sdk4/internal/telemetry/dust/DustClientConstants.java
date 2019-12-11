package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.configuration.DeviceType;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "", "application", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "getApplication", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "correlationIds", "", "", "correlationIds$annotations", "()V", "getCorrelationIds", "()Ljava/util/Map;", "device", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "getDevice", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "sdk", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "getSdk", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "Application", "Device", "Sdk", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustClientConstants.kt */
public interface DustClientConstants {

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "", "id", "", "version", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DustClientConstants.kt */
    public static final class Application {

        /* renamed from: id */
        private final String f6080id;
        private final String name;
        private final String version;

        public Application(String str, String str2, String str3) {
            this.f6080id = str;
            this.version = str2;
            this.name = str3;
        }

        public static /* synthetic */ Application copy$default(Application application, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.f6080id;
            }
            if ((i & 2) != 0) {
                str2 = application.version;
            }
            if ((i & 4) != 0) {
                str3 = application.name;
            }
            return application.copy(str, str2, str3);
        }

        public final String component1() {
            return this.f6080id;
        }

        public final String component2() {
            return this.version;
        }

        public final String component3() {
            return this.name;
        }

        public final Application copy(String str, String str2, String str3) {
            return new Application(str, str2, str3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application
                if (r0 == 0) goto L_0x0027
                com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Application r3 = (com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application) r3
                java.lang.String r0 = r2.f6080id
                java.lang.String r1 = r3.f6080id
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.version
                java.lang.String r1 = r3.version
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application.equals(java.lang.Object):boolean");
        }

        public final String getId() {
            return this.f6080id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.f6080id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.version;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Application(id=");
            sb.append(this.f6080id);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(")");
            return sb.toString();
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "", "brand", "", "manufacturer", "model", "product", "os", "deviceType", "Lcom/bamtech/sdk4/configuration/DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/configuration/DeviceType;)V", "getBrand", "()Ljava/lang/String;", "getDeviceType", "()Lcom/bamtech/sdk4/configuration/DeviceType;", "getManufacturer", "getModel", "getOs", "getProduct", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DustClientConstants.kt */
    public static final class Device {
        private final String brand;
        private final DeviceType deviceType;
        private final String manufacturer;
        private final String model;

        /* renamed from: os */
        private final String f6081os;
        private final String product;

        public Device(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2) {
            this.brand = str;
            this.manufacturer = str2;
            this.model = str3;
            this.product = str4;
            this.f6081os = str5;
            this.deviceType = deviceType2;
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
                str5 = device.f6081os;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                deviceType2 = device.deviceType;
            }
            return device.copy(str, str6, str7, str8, str9, deviceType2);
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
            return this.f6081os;
        }

        public final DeviceType component6() {
            return this.deviceType;
        }

        public final Device copy(String str, String str2, String str3, String str4, String str5, DeviceType deviceType2) {
            Device device = new Device(str, str2, str3, str4, str5, deviceType2);
            return device;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.deviceType, (java.lang.Object) r3.deviceType) != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0047
                boolean r0 = r3 instanceof com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device
                if (r0 == 0) goto L_0x0045
                com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Device r3 = (com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device) r3
                java.lang.String r0 = r2.brand
                java.lang.String r1 = r3.brand
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.manufacturer
                java.lang.String r1 = r3.manufacturer
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.model
                java.lang.String r1 = r3.model
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.product
                java.lang.String r1 = r3.product
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f6081os
                java.lang.String r1 = r3.f6081os
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                com.bamtech.sdk4.configuration.DeviceType r0 = r2.deviceType
                com.bamtech.sdk4.configuration.DeviceType r3 = r3.deviceType
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r3 = 0
                return r3
            L_0x0047:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device.equals(java.lang.Object):boolean");
        }

        public final String getBrand() {
            return this.brand;
        }

        public final DeviceType getDeviceType() {
            return this.deviceType;
        }

        public final String getManufacturer() {
            return this.manufacturer;
        }

        public final String getModel() {
            return this.model;
        }

        public final String getOs() {
            return this.f6081os;
        }

        public final String getProduct() {
            return this.product;
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
            String str5 = this.f6081os;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            DeviceType deviceType2 = this.deviceType;
            if (deviceType2 != null) {
                i = deviceType2.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Device(brand=");
            sb.append(this.brand);
            sb.append(", manufacturer=");
            sb.append(this.manufacturer);
            sb.append(", model=");
            sb.append(this.model);
            sb.append(", product=");
            sb.append(this.product);
            sb.append(", os=");
            sb.append(this.f6081os);
            sb.append(", deviceType=");
            sb.append(this.deviceType);
            sb.append(")");
            return sb.toString();
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "", "version", "", "platform", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DustClientConstants.kt */
    public static final class Sdk {
        private final String platform;
        private final String version;

        public Sdk(String str, String str2) {
            this.version = str;
            this.platform = str2;
        }

        public static /* synthetic */ Sdk copy$default(Sdk sdk, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sdk.version;
            }
            if ((i & 2) != 0) {
                str2 = sdk.platform;
            }
            return sdk.copy(str, str2);
        }

        public final String component1() {
            return this.version;
        }

        public final String component2() {
            return this.platform;
        }

        public final Sdk copy(String str, String str2) {
            return new Sdk(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.platform, (java.lang.Object) r3.platform) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk
                if (r0 == 0) goto L_0x001d
                com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Sdk r3 = (com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk) r3
                java.lang.String r0 = r2.version
                java.lang.String r1 = r3.version
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.platform
                java.lang.String r3 = r3.platform
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk.equals(java.lang.Object):boolean");
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.version;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.platform;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Sdk(version=");
            sb.append(this.version);
            sb.append(", platform=");
            sb.append(this.platform);
            sb.append(")");
            return sb.toString();
        }
    }

    Application getApplication();

    Map<String, String> getCorrelationIds();

    Device getDevice();

    Sdk getSdk();
}
