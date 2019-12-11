package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J.\u0010+\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030-2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0002J+\u0010/\u001a\u00020,*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030-2\u0006\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0002R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/AdEnginePayload;", "", "xny", "", "lat", "", "devid", "cdn", "corigin", "ssess", "trk", "sdkver", "adTargeting", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdTargeting", "()Ljava/util/Map;", "getCdn", "()Ljava/lang/String;", "getCorigin", "getDevid", "getLat", "()I", "getSdkver", "getSsess", "getTrk", "getXny", "asMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "putAll", "", "", "values", "set", "key", "value", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEnginePayload.kt */
public final class AdEnginePayload {
    private final Map<String, String> adTargeting;
    private final String cdn;
    private final String corigin;
    private final String devid;
    private final int lat;
    private final String sdkver;
    private final String ssess;
    private final String trk;
    private final String xny;

    public AdEnginePayload(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        this.xny = str;
        this.lat = i;
        this.devid = str2;
        this.cdn = str3;
        this.corigin = str4;
        this.ssess = str5;
        this.trk = str6;
        this.sdkver = str7;
        this.adTargeting = map;
    }

    public static /* synthetic */ AdEnginePayload copy$default(AdEnginePayload adEnginePayload, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i2, Object obj) {
        AdEnginePayload adEnginePayload2 = adEnginePayload;
        int i3 = i2;
        return adEnginePayload.copy((i3 & 1) != 0 ? adEnginePayload2.xny : str, (i3 & 2) != 0 ? adEnginePayload2.lat : i, (i3 & 4) != 0 ? adEnginePayload2.devid : str2, (i3 & 8) != 0 ? adEnginePayload2.cdn : str3, (i3 & 16) != 0 ? adEnginePayload2.corigin : str4, (i3 & 32) != 0 ? adEnginePayload2.ssess : str5, (i3 & 64) != 0 ? adEnginePayload2.trk : str6, (i3 & 128) != 0 ? adEnginePayload2.sdkver : str7, (i3 & 256) != 0 ? adEnginePayload2.adTargeting : map);
    }

    private final void putAll(Map<String, String> map, Map<String, String> map2) {
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    private final void set(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    public final Map<String, String> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        putAll(linkedHashMap, this.adTargeting);
        set(linkedHashMap, "xny", this.xny);
        set(linkedHashMap, "lat", String.valueOf(this.lat));
        set(linkedHashMap, "devid", this.devid);
        set(linkedHashMap, "cdn", this.cdn);
        set(linkedHashMap, "corigin", this.corigin);
        set(linkedHashMap, "ssess", this.ssess);
        set(linkedHashMap, "trk", this.trk);
        set(linkedHashMap, "sdkver", this.sdkver);
        return C13173j0.m40364d(linkedHashMap);
    }

    public final String component1() {
        return this.xny;
    }

    public final int component2() {
        return this.lat;
    }

    public final String component3() {
        return this.devid;
    }

    public final String component4() {
        return this.cdn;
    }

    public final String component5() {
        return this.corigin;
    }

    public final String component6() {
        return this.ssess;
    }

    public final String component7() {
        return this.trk;
    }

    public final String component8() {
        return this.sdkver;
    }

    public final Map<String, String> component9() {
        return this.adTargeting;
    }

    public final AdEnginePayload copy(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        AdEnginePayload adEnginePayload = new AdEnginePayload(str, i, str2, str3, str4, str5, str6, str7, map);
        return adEnginePayload;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdEnginePayload) {
                AdEnginePayload adEnginePayload = (AdEnginePayload) obj;
                if (Intrinsics.areEqual((Object) this.xny, (Object) adEnginePayload.xny)) {
                    if (!(this.lat == adEnginePayload.lat) || !Intrinsics.areEqual((Object) this.devid, (Object) adEnginePayload.devid) || !Intrinsics.areEqual((Object) this.cdn, (Object) adEnginePayload.cdn) || !Intrinsics.areEqual((Object) this.corigin, (Object) adEnginePayload.corigin) || !Intrinsics.areEqual((Object) this.ssess, (Object) adEnginePayload.ssess) || !Intrinsics.areEqual((Object) this.trk, (Object) adEnginePayload.trk) || !Intrinsics.areEqual((Object) this.sdkver, (Object) adEnginePayload.sdkver) || !Intrinsics.areEqual((Object) this.adTargeting, (Object) adEnginePayload.adTargeting)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, String> getAdTargeting() {
        return this.adTargeting;
    }

    public final String getCdn() {
        return this.cdn;
    }

    public final String getCorigin() {
        return this.corigin;
    }

    public final String getDevid() {
        return this.devid;
    }

    public final int getLat() {
        return this.lat;
    }

    public final String getSdkver() {
        return this.sdkver;
    }

    public final String getSsess() {
        return this.ssess;
    }

    public final String getTrk() {
        return this.trk;
    }

    public final String getXny() {
        return this.xny;
    }

    public int hashCode() {
        String str = this.xny;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.lat) * 31;
        String str2 = this.devid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cdn;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.corigin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.ssess;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.trk;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.sdkver;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, String> map = this.adTargeting;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdEnginePayload(xny=");
        sb.append(this.xny);
        sb.append(", lat=");
        sb.append(this.lat);
        sb.append(", devid=");
        sb.append(this.devid);
        sb.append(", cdn=");
        sb.append(this.cdn);
        sb.append(", corigin=");
        sb.append(this.corigin);
        sb.append(", ssess=");
        sb.append(this.ssess);
        sb.append(", trk=");
        sb.append(this.trk);
        sb.append(", sdkver=");
        sb.append(this.sdkver);
        sb.append(", adTargeting=");
        sb.append(this.adTargeting);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AdEnginePayload(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        this((i3 & 1) != 0 ? null : str, i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : str7, map);
    }
}
