package com.bamtech.sdk4.service;

import com.bamtech.sdk4.internal.service.ServiceError;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/IllegalArgumentException;", "Lcom/bamtech/sdk4/service/ServiceException;", "transactionId", "Ljava/util/UUID;", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "cause", "", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/Throwable;)V", "Companion", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceExceptions.kt */
public final class IllegalArgumentException extends ServiceException {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/IllegalArgumentException$Companion;", "", "()V", "init", "Lcom/bamtech/sdk4/service/IllegalArgumentException;", "code", "", "description", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceExceptions.kt */
    public static final class Companion {
        private Companion() {
        }

        public final IllegalArgumentException init(String str, String str2) {
            IllegalArgumentException$Companion$init$reason$1 illegalArgumentException$Companion$init$reason$1 = new IllegalArgumentException$Companion$init$reason$1(str, str2);
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(randomUUID, C13183n.m40498a(illegalArgumentException$Companion$init$reason$1), null, 4, null);
            return illegalArgumentException;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IllegalArgumentException(UUID uuid, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        this(uuid, list, th);
    }

    public IllegalArgumentException(UUID uuid, List<? extends ErrorReason> list, Throwable th) {
        if (!(!list.isEmpty())) {
            list = C13183n.m40498a(new ServiceError("illegal-argument", th != null ? th.getMessage() : null));
        }
        super(uuid, list, th);
    }
}
