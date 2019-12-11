package com.bamtech.sdk4.media.drm;

import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J2\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/drm/DrmProvider;", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "executeKeyRequest", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "licenseUrl", "", "data", "playbackSessionId", "isOffline", "", "executeProvisionRequest", "url", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DrmProvider.kt */
public interface DrmProvider extends NetworkConfigurationProvider {
    byte[] executeKeyRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z);

    byte[] executeProvisionRequest(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z);

    UUID getUuid();
}
