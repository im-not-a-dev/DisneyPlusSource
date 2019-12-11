package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/RegistrationClient;", "", "register", "Lio/reactivex/Completable;", "T", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/identity/bam/RegistrationRequest;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RegistrationClient.kt */
public interface RegistrationClient {
    <T> Completable register(ServiceTransaction serviceTransaction, RegistrationRequest<T> registrationRequest, Map<String, String> map);
}
