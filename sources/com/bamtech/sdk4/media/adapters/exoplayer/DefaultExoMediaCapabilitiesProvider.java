package com.bamtech.sdk4.media.adapters.exoplayer;

import android.content.Context;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.Display.HdrCapabilities;
import android.view.WindowManager;
import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel;
import com.bamtech.sdk4.media.HdrType;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.SupportedCodec;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.p381t0.C9270a;
import com.google.android.exoplayer2.p381t0.C9275d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/DefaultExoMediaCapabilitiesProvider;", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getSupportedCodecs", "", "Lcom/bamtech/sdk4/media/SupportedCodec;", "getSupportedHdrTypes", "Lcom/bamtech/sdk4/media/HdrType;", "getWidevineSecurityLevel", "Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;", "supportsAtmos", "", "supportsMultiCodecMaster", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExoMediaCapabilitiesProvider.kt */
public final class DefaultExoMediaCapabilitiesProvider implements MediaCapabilitiesProvider {
    private final Context context;

    public DefaultExoMediaCapabilitiesProvider(Context context2) {
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public List<SupportedCodec> getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        List b = C9275d.m28139b("video/hevc", true, false);
        C12880j.m40222a((Object) b, "MediaCodecUtil.getDecode….VIDEO_H265, true, false)");
        if (((C9270a) C13199w.m40591g(b)) != null) {
            arrayList.add(SupportedCodec.h265);
        }
        List b2 = C9275d.m28139b("video/avc", true, false);
        C12880j.m40222a((Object) b2, "MediaCodecUtil.getDecode….VIDEO_H264, true, false)");
        if (((C9270a) C13199w.m40591g(b2)) != null) {
            arrayList.add(SupportedCodec.h264);
        }
        return C13199w.m40606q(arrayList);
    }

    public List<HdrType> getSupportedHdrTypes() {
        ArrayList arrayList = new ArrayList();
        if (VERSION.SDK_INT >= 24) {
            Context context2 = this.context;
            HdrCapabilities hdrCapabilities = null;
            Object systemService = context2 != null ? context2.getSystemService("window") : null;
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            WindowManager windowManager = (WindowManager) systemService;
            Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                hdrCapabilities = defaultDisplay.getHdrCapabilities();
            }
            if (hdrCapabilities != null) {
                int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                if (supportedHdrTypes != null && C13174k.m40380a(supportedHdrTypes, 2)) {
                    List<C9270a> b = C9275d.m28139b("video/hevc", true, false);
                    C12880j.m40222a((Object) b, "MediaCodecUtil.getDecode….VIDEO_H265, true, false)");
                    for (C9270a aVar : b) {
                        if (!arrayList.contains(HdrType.HDR10) && aVar != null) {
                            CodecProfileLevel[] a = aVar.mo24013a();
                            if (a != null) {
                                for (CodecProfileLevel codecProfileLevel : a) {
                                    if (codecProfileLevel != null && codecProfileLevel.profile == 4096) {
                                        arrayList.add(HdrType.HDR10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (hdrCapabilities != null) {
                int[] supportedHdrTypes2 = hdrCapabilities.getSupportedHdrTypes();
                if (supportedHdrTypes2 != null && C13174k.m40380a(supportedHdrTypes2, 1)) {
                    List<C9270a> b2 = C9275d.m28139b("video/dolby-vision", true, false);
                    C12880j.m40222a((Object) b2, "MediaCodecUtil.getDecode…OLBY_VISION, true, false)");
                    for (C9270a aVar2 : b2) {
                        if (!arrayList.contains(HdrType.DOLBY_VISION) && aVar2 != null) {
                            CodecProfileLevel[] a2 = aVar2.mo24013a();
                            if (a2 != null) {
                                for (CodecProfileLevel codecProfileLevel2 : a2) {
                                    if (codecProfileLevel2 != null && codecProfileLevel2.profile == 32 && codecProfileLevel2.level >= 32) {
                                        arrayList.add(HdrType.DOLBY_VISION);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return C13199w.m40606q(arrayList);
    }

    public WidevineSecurityLevel getWidevineSecurityLevel() {
        WidevineSecurityLevel widevineSecurityLevel;
        if (VERSION.SDK_INT >= 18) {
            try {
                MediaDrm mediaDrm = new MediaDrm(C8883r.f19045d);
                String propertyString = mediaDrm.getPropertyString("securityLevel");
                mediaDrm.release();
                if ("L1".equals(propertyString)) {
                    widevineSecurityLevel = WidevineSecurityLevel.level1;
                } else {
                    widevineSecurityLevel = WidevineSecurityLevel.level3;
                }
                return widevineSecurityLevel;
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return WidevineSecurityLevel.level3;
    }

    public boolean supportsAtmos() {
        List b = C9275d.m28139b("audio/eac3", true, false);
        C12880j.m40222a((Object) b, "MediaCodecUtil.getDecode…AUDIO_E_AC3, true, false)");
        return true ^ b.isEmpty();
    }

    public boolean supportsMultiCodecMaster() {
        return false;
    }
}
