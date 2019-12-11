package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import net.danlew.android.joda.DateUtils;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,¨\u0006;"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/ServerRequest;", "", "status", "Lcom/bamtech/sdk4/media/FetchStatus;", "serverIp", "", "cdnName", "networkType", "Lcom/bamtech/sdk4/media/NetworkType;", "timeToFirstByte", "", "error", "Lcom/bamtech/sdk4/media/NetworkError;", "host", "path", "method", "statusCode", "", "requestId", "roundTripTime", "(Lcom/bamtech/sdk4/media/FetchStatus;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/media/NetworkType;Ljava/lang/Long;Lcom/bamtech/sdk4/media/NetworkError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getCdnName", "()Ljava/lang/String;", "setCdnName", "(Ljava/lang/String;)V", "getError", "()Lcom/bamtech/sdk4/media/NetworkError;", "setError", "(Lcom/bamtech/sdk4/media/NetworkError;)V", "getHost", "setHost", "getMethod", "setMethod", "getNetworkType", "()Lcom/bamtech/sdk4/media/NetworkType;", "setNetworkType", "(Lcom/bamtech/sdk4/media/NetworkType;)V", "getPath", "setPath", "getRequestId", "setRequestId", "getRoundTripTime", "()Ljava/lang/Long;", "setRoundTripTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getServerIp", "setServerIp", "getStatus", "()Lcom/bamtech/sdk4/media/FetchStatus;", "setStatus", "(Lcom/bamtech/sdk4/media/FetchStatus;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimeToFirstByte", "setTimeToFirstByte", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class ServerRequest {
    private String cdnName;
    private NetworkError error;
    private String host;
    private String method;
    private NetworkType networkType;
    private String path;
    private String requestId;
    private Long roundTripTime;
    private String serverIp;
    private FetchStatus status;
    private Integer statusCode;
    private Long timeToFirstByte;

    public ServerRequest(FetchStatus fetchStatus, String str, String str2, NetworkType networkType2, Long l, NetworkError networkError, String str3, String str4, String str5, Integer num, String str6, Long l2) {
        this.status = fetchStatus;
        this.serverIp = str;
        this.cdnName = str2;
        this.networkType = networkType2;
        this.timeToFirstByte = l;
        this.error = networkError;
        this.host = str3;
        this.path = str4;
        this.method = str5;
        this.statusCode = num;
        this.requestId = str6;
        this.roundTripTime = l2;
    }

    public final String getCdnName() {
        return this.cdnName;
    }

    public final NetworkError getError() {
        return this.error;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getMethod() {
        return this.method;
    }

    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Long getRoundTripTime() {
        return this.roundTripTime;
    }

    public final String getServerIp() {
        return this.serverIp;
    }

    public final FetchStatus getStatus() {
        return this.status;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final Long getTimeToFirstByte() {
        return this.timeToFirstByte;
    }

    public final void setCdnName(String str) {
        this.cdnName = str;
    }

    public final void setError(NetworkError networkError) {
        this.error = networkError;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setNetworkType(NetworkType networkType2) {
        this.networkType = networkType2;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setRoundTripTime(Long l) {
        this.roundTripTime = l;
    }

    public final void setServerIp(String str) {
        this.serverIp = str;
    }

    public final void setStatus(FetchStatus fetchStatus) {
        this.status = fetchStatus;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setTimeToFirstByte(Long l) {
        this.timeToFirstByte = l;
    }

    public /* synthetic */ ServerRequest(FetchStatus fetchStatus, String str, String str2, NetworkType networkType2, Long l, NetworkError networkError, String str3, String str4, String str5, Integer num, String str6, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(fetchStatus, str, str2, networkType2, l, networkError, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? null : num, (i2 & 1024) != 0 ? null : str6, (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? null : l2);
    }
}
