package com.bamtechmedia.dominguez.detail.common.formats;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display;
import android.view.WindowManager;
import com.bamtech.sdk4.media.HdrType;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtechmedia.dominguez.detail.common.formats.C5941e.C5942a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.playback.p236l.C6335c;
import com.google.android.exoplayer2.p361p0.C8834j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12865c0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/formats/DetailMediaContentMapper;", "", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "context", "Landroid/content/Context;", "playbackOverrideApi", "Lcom/bamtechmedia/dominguez/playback/api/PlaybackOverrideApi;", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;Landroid/content/Context;Lcom/bamtechmedia/dominguez/playback/api/PlaybackOverrideApi;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "audioSupportFiveOne", "", "combineAtmosAndVision", "", "Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeatureData;", "availableFeatureData", "findDeviceCapableFormats", "playableAvailableFeatureData", "isSizeGreaterThanDimensions", "width", "", "height", "firstDimension", "secondDimension", "mapDeviceSupportedFeaturesToAvailableFeatureData", "supports4k", "supportsDolbyVision", "supportsHd", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.formats.d */
/* compiled from: DetailMediaContentMapper.kt */
public final class C5938d {

    /* renamed from: a */
    private final MediaCapabilitiesProvider f13745a;

    /* renamed from: b */
    private final Context f13746b;

    /* renamed from: c */
    private final C6335c f13747c;

    /* renamed from: d */
    private final C5948c f13748d;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.d$a */
    /* compiled from: DetailMediaContentMapper.kt */
    private static final class C5939a {
        private C5939a() {
        }

        public /* synthetic */ C5939a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.d$b */
    /* compiled from: Comparisons.kt */
    public static final class C5940b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a(Integer.valueOf(((C5928a) t).mo17851c().getSortOrder()), Integer.valueOf(((C5928a) t2).mo17851c().getSortOrder()));
        }
    }

    static {
        new C5939a(null);
    }

    public C5938d(MediaCapabilitiesProvider mediaCapabilitiesProvider, Context context, C6335c cVar, C5948c cVar2) {
        this.f13745a = mediaCapabilitiesProvider;
        this.f13746b = context;
        this.f13747c = cVar;
        this.f13748d = cVar2;
    }

    /* renamed from: a */
    private final boolean m19055a() {
        MediaCodecInfo[] codecInfos;
        Integer b = this.f13747c.mo18950b();
        if (b != null && b.intValue() >= 6) {
            if (C8834j.m25613a(this.f13746b).mo23084a(6)) {
                return true;
            }
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                Intrinsics.checkReturnedValueIsNotNull((Object) mediaCodecInfo, "codecInfo");
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkReturnedValueIsNotNull((Object) supportedTypes, "supportedTypes");
                    for (String a : supportedTypes) {
                        if (Intrinsics.areEqual((Object) a, (Object) "audio/eac3")) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m19056a(int i, int i2, int i3, int i4) {
        return (i >= i3 && i2 >= i4) || (i2 >= i3 && i >= i4);
    }

    /* renamed from: c */
    private final boolean m19059c() {
        Object systemService = this.f13746b.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return false;
        }
        C5942a[] b = C5941e.m19069b(this.f13746b, defaultDisplay);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "DisplayCompat.getSupportedModes(context, display)");
        for (C5942a aVar : b) {
            Intrinsics.checkReturnedValueIsNotNull((Object) aVar, "mode");
            if (m19056a(aVar.mo17869b(), aVar.mo17868a(), 720, 1280)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final List<C5928a> mo17866b(List<C5928a> list) {
        List b = m19058b();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C5928a aVar = (C5928a) next;
            boolean z = false;
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual((Object) aVar.mo17850b(), (Object) ((C5928a) it.next()).mo17850b())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return C13199w.m40562a((Iterable) mo17865a(C12865c0.m40202b(arrayList)), (Comparator) new C5940b());
    }

    /* renamed from: b */
    private final List<C5928a> m19058b() {
        boolean z;
        List<HdrType> supportedHdrTypes = this.f13745a.getSupportedHdrTypes();
        ArrayList arrayList = new ArrayList();
        if (!this.f13747c.mo18949a()) {
            z = false;
            for (HdrType hdrType : supportedHdrTypes) {
                if (Intrinsics.areEqual((Object) hdrType, (Object) HdrType.DOLBY_VISION)) {
                    arrayList.add(new C5928a("image_media_feature_dolby_vision", true, "dolby_vision"));
                    z = true;
                }
                if (Intrinsics.areEqual((Object) hdrType, (Object) HdrType.HDR10)) {
                    arrayList.add(new C5928a("media_feature_hdr_10", false, "hdr_10"));
                }
            }
        } else {
            z = false;
        }
        if (this.f13745a.supportsAtmos()) {
            String str = "dolby_atmos";
            arrayList.add(new C5928a(str, true, str));
        }
        if (m19055a()) {
            arrayList.add(new C5928a("media_feature_dolby_51", false, "dolby_51"));
        }
        if (m19059c()) {
            String str2 = "HD";
            arrayList.add(new C5928a(str2, false, str2));
        }
        if (m19057a(z)) {
            arrayList.add(new C5928a("media_format_uhd", false, "UHD"));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m19057a(boolean z) {
        if (!this.f13748d.mo17880i()) {
            return z;
        }
        Object systemService = this.f13746b.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        WindowManager windowManager = (WindowManager) systemService;
        boolean z2 = false;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                C5942a[] b = C5941e.m19069b(this.f13746b, defaultDisplay);
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "DisplayCompat.getSupportedModes(context, display)");
                int length = b.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C5942a aVar = b[i];
                    Intrinsics.checkReturnedValueIsNotNull((Object) aVar, "mode");
                    if (m19056a(aVar.mo17869b(), aVar.mo17868a(), 3840, 2160)) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final List<C5928a> mo17865a(List<C5928a> list) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C5928a b : list) {
            arrayList.add(b.mo17850b());
        }
        String str = "dolby_vision";
        String str2 = "dolby_atmos";
        if (!arrayList.containsAll(C13185o.m40520c(str2, str))) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return C13199w.m40563a((Collection) arrayList2, (Object) new C5928a("image_media_feature_dolby_vision_dolby_atmos", true, "dolby_vision_and_atmos"));
            }
            Object next = it.next();
            C5928a aVar = (C5928a) next;
            if (!(!Intrinsics.areEqual((Object) aVar.mo17850b(), (Object) str2)) || !(!Intrinsics.areEqual((Object) aVar.mo17850b(), (Object) str))) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
    }
}
