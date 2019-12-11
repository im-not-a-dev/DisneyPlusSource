package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "", "getSupportedCodecs", "", "Lcom/bamtech/sdk4/media/SupportedCodec;", "getSupportedHdrTypes", "Lcom/bamtech/sdk4/media/HdrType;", "getWidevineSecurityLevel", "Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;", "supportsAtmos", "", "supportsMultiCodecMaster", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaCapabilitiesProvider.kt */
public interface MediaCapabilitiesProvider {
    List<SupportedCodec> getSupportedCodecs();

    List<HdrType> getSupportedHdrTypes();

    WidevineSecurityLevel getWidevineSecurityLevel();

    boolean supportsAtmos();

    boolean supportsMultiCodecMaster();
}
