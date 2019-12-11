package p000;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"LDustServerPlayloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "dustServerPayload", "LDustServerPayload;", "(LDustServerPayload;)V", "getDustServerPayload", "()LDustServerPayload;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: DustServerPlayloadException */
/* compiled from: ServiceRequestExtensions.kt */
public final class DustServerPlayloadException extends Exception {
    private final DustServerPayload dustServerPayload;

    public DustServerPlayloadException(DustServerPayload dustServerPayload2) {
        this.dustServerPayload = dustServerPayload2;
    }

    public final DustServerPayload getDustServerPayload() {
        return this.dustServerPayload;
    }
}
