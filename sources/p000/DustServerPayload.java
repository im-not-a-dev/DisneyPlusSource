package p000;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo31007d2 = {"LDustServerPayload;", "", "host", "", "path", "method", "statusCode", "", "requestId", "roundTripTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getHost", "()Ljava/lang/String;", "getMethod", "getPath", "getRequestId", "getRoundTripTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toString", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: DustServerPayload */
/* compiled from: ServiceRequestExtensions.kt */
public class DustServerPayload {
    private final String host;
    private final String method;
    private final String path;
    private final String requestId;
    private final Long roundTripTime;
    private final Integer statusCode;

    public DustServerPayload(String str, String str2, String str3, Integer num, String str4, Long l) {
        this.host = str;
        this.path = str2;
        this.method = str3;
        this.statusCode = num;
        this.requestId = str4;
        this.roundTripTime = l;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getMethod() {
        return this.method;
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

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResponseStatistics(");
        sb.append("host='");
        sb.append(this.host);
        String str = "', ";
        sb.append(str);
        sb.append("path='");
        sb.append(this.path);
        sb.append(str);
        sb.append("method='");
        sb.append(this.method);
        sb.append(str);
        sb.append("statusCode=");
        sb.append(this.statusCode);
        String str2 = ", ";
        sb.append(str2);
        sb.append("requestId=");
        sb.append(this.requestId);
        sb.append(str2);
        sb.append("roundTripTime=");
        sb.append(this.roundTripTime);
        sb.append(" )");
        return sb.toString();
    }
}
