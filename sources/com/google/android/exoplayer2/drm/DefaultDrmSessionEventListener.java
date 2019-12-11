package com.google.android.exoplayer2.drm;

/* renamed from: com.google.android.exoplayer2.drm.k */
/* compiled from: DefaultDrmSessionEventListener */
public interface DefaultDrmSessionEventListener {
    /* renamed from: b */
    void mo9515b();

    /* renamed from: c */
    void mo9516c();

    void onDrmKeysLoaded();

    void onDrmKeysRestored();

    void onDrmSessionManagerError(Exception exc);
}
