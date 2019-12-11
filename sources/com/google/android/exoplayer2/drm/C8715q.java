package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.q */
/* compiled from: MediaDrmCallback */
public interface C8715q {
    byte[] executeKeyRequest(UUID uuid, KeyRequest keyRequest) throws Exception;

    byte[] executeProvisionRequest(UUID uuid, ProvisionRequest provisionRequest) throws Exception;
}
