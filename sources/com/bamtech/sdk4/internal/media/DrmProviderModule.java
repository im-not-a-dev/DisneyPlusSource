package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider;
import com.bamtech.sdk4.internal.media.drm.TestWidevineDrmProvider;
import com.bamtech.sdk4.media.drm.DefaultSilkDrmProvider;
import com.bamtech.sdk4.media.drm.DrmProvider;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/DrmProviderModule;", "", "()V", "providers", "", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "silkDrmProvider", "Lcom/bamtech/sdk4/media/drm/DefaultSilkDrmProvider;", "widevineDrmProvider", "Lcom/bamtech/sdk4/internal/media/drm/DefaultWidevineDrmProvider;", "playReadyDrmProvider", "Lcom/bamtech/sdk4/internal/media/drm/DefaultPlayReadyDrmProvider;", "providesTestDrmProviders", "", "Lcom/bamtech/sdk4/internal/media/drm/TestWidevineDrmProvider;", "(Lcom/bamtech/sdk4/media/drm/DefaultSilkDrmProvider;Lcom/bamtech/sdk4/internal/media/drm/TestWidevineDrmProvider;Lcom/bamtech/sdk4/internal/media/drm/DefaultPlayReadyDrmProvider;)[Lcom/bamtech/sdk4/media/drm/DrmProvider;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceModule.kt */
public final class DrmProviderModule {
    public final Set<DrmProvider> providers(DefaultSilkDrmProvider defaultSilkDrmProvider, DefaultWidevineDrmProvider defaultWidevineDrmProvider, DefaultPlayReadyDrmProvider defaultPlayReadyDrmProvider) {
        return C13188p0.m40533b(defaultSilkDrmProvider, defaultWidevineDrmProvider, defaultPlayReadyDrmProvider);
    }

    public final DrmProvider[] providesTestDrmProviders(DefaultSilkDrmProvider defaultSilkDrmProvider, TestWidevineDrmProvider testWidevineDrmProvider, DefaultPlayReadyDrmProvider defaultPlayReadyDrmProvider) {
        return new DrmProvider[]{defaultSilkDrmProvider, testWidevineDrmProvider, defaultPlayReadyDrmProvider};
    }
}
