package com.bamtech.sdk4.purchase;

import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.ServiceException;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/ActivationFailedException;", "Lcom/bamtech/sdk4/service/ServiceException;", "transactionId", "Ljava/util/UUID;", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "cause", "", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/Throwable;)V", "Companion", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PurchaseActivationResult.kt */
public final class ActivationFailedException extends ServiceException {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/ActivationFailedException$Companion;", "", "()V", "create", "Lcom/bamtech/sdk4/purchase/ActivationFailedException;", "transactionId", "Ljava/util/UUID;", "code", "", "description", "cause", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PurchaseActivationResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ActivationFailedException create$default(Companion companion, UUID uuid, String str, String str2, Throwable th, int i, Object obj) {
            if ((i & 8) != 0) {
                th = null;
            }
            return companion.create(uuid, str, str2, th);
        }

        public final ActivationFailedException create(UUID uuid, String str, String str2, Throwable th) {
            return new ActivationFailedException(uuid, C13183n.m40498a(new ServiceError(str, str2)), th);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ActivationFailedException(UUID uuid, List<? extends ErrorReason> list, Throwable th) {
        super(uuid, list, th);
    }
}
