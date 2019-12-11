package p163g.p201e.p203b.p277b0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel;
import com.bamtech.sdk4.media.HdrType;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.SupportedCodec;
import com.google.android.exoplayer2.p361p0.C8834j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u0001J\b\u0010\u0013\u001a\u00020\tH\u0002J$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J6\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\tH\u0016J\t\u0010\u001f\u001a\u00020\tH\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/ConfigurableMediaCapabilitiesProvider;", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "mediaCapabilitiesProvider", "context", "Landroid/content/Context;", "config", "Lcom/bamtechmedia/dominguez/sdk/MediaCapabilitiesConfig;", "(Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;Landroid/content/Context;Lcom/bamtechmedia/dominguez/sdk/MediaCapabilitiesConfig;)V", "doesAudioCapabilitiesSupportJOC", "", "doesScreenMeetHDRRequirements", "requiresHDR", "getSupportedCodecs", "", "Lcom/bamtech/sdk4/media/SupportedCodec;", "getSupportedHdrTypes", "Lcom/bamtech/sdk4/media/HdrType;", "getWidevineSecurityLevel", "Lcom/bamtech/sdk4/internal/configuration/WidevineSecurityLevel;", "isAmazonDeviceReportingAtmosSupport", "isSupported", "availableLevel", "Landroid/media/MediaCodecInfo$CodecProfileLevel;", "supportedProfiles", "", "", "supports", "hdrType", "mimeType", "", "supportsAtmos", "supportsMultiCodecMaster", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.b */
/* compiled from: ConfigurableMediaCapabilitiesProvider.kt */
public final class C7191b implements MediaCapabilitiesProvider {

    /* renamed from: a */
    private final MediaCapabilitiesProvider f15897a;

    /* renamed from: b */
    private final Context f15898b;

    /* renamed from: c */
    private final C7223r f15899c;

    /* renamed from: g.e.b.b0.b$a */
    /* compiled from: ConfigurableMediaCapabilitiesProvider.kt */
    private static final class C7192a {
        private C7192a() {
        }

        public /* synthetic */ C7192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7192a(null);
    }

    public C7191b(MediaCapabilitiesProvider mediaCapabilitiesProvider, Context context, C7223r rVar) {
        this.f15897a = mediaCapabilitiesProvider;
        this.f15898b = context;
        this.f15899c = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[LOOP:0: B:8:0x0028->B:20:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098 A[LOOP:1: B:33:0x0090->B:35:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0079 A[EDGE_INSN: B:52:0x0079->B:31:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2 A[EDGE_INSN: B:54:0x00b2->B:36:0x00b2 ?: BREAK  
    EDGE_INSN: B:54:0x00b2->B:36:0x00b2 ?: BREAK  
    EDGE_INSN: B:54:0x00b2->B:36:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2 A[EDGE_INSN: B:54:0x00b2->B:36:0x00b2 ?: BREAK  
    EDGE_INSN: B:54:0x00b2->B:36:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m21768a(int r7, java.lang.String r8, java.util.Map<java.lang.Integer, java.lang.Integer> r9, boolean r10) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            g.e.b.b0.r r0 = r6.f15899c
            boolean r0 = r0.mo20054b()
            r2 = 1
            if (r0 == 0) goto L_0x0053
            android.content.Context r0 = r6.f15898b
            java.lang.String r3 = "display"
            java.lang.Object r0 = r0.getSystemService(r3)
            if (r0 == 0) goto L_0x004b
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            java.lang.String r3 = "displayManager.displays"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            int r3 = r0.length
            r4 = 0
        L_0x0028:
            if (r4 >= r3) goto L_0x0049
            r5 = r0[r4]
            if (r5 == 0) goto L_0x0042
            android.view.Display$HdrCapabilities r5 = r5.getHdrCapabilities()
            if (r5 == 0) goto L_0x0042
            int[] r5 = r5.getSupportedHdrTypes()
            if (r5 == 0) goto L_0x0042
            boolean r5 = kotlin.p590y.C13174k.m40380a(r5, r7)
            if (r5 != r2) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 != 0) goto L_0x0046
            goto L_0x0079
        L_0x0046:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0049:
            r7 = 1
            goto L_0x007a
        L_0x004b:
            kotlin.s r7 = new kotlin.s
            java.lang.String r8 = "null cannot be cast to non-null type android.hardware.display.DisplayManager"
            r7.<init>(r8)
            throw r7
        L_0x0053:
            android.content.Context r0 = r6.f15898b
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            if (r0 == 0) goto L_0x00dc
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            java.lang.String r3 = "windowManager.defaultDisplay"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
            android.view.Display$HdrCapabilities r0 = r0.getHdrCapabilities()
            if (r0 == 0) goto L_0x0079
            int[] r0 = r0.getSupportedHdrTypes()
            if (r0 == 0) goto L_0x0079
            boolean r7 = kotlin.p590y.C13174k.m40380a(r0, r7)
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            boolean r10 = r6.m21770a(r10)
            java.util.List r8 = com.google.android.exoplayer2.p381t0.C9275d.m28139b(r8, r2, r1)
            java.lang.String r0 = "MediaCodecUtil.getDecode…os(mimeType, true, false)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0090:
            boolean r3 = r8.hasNext()
            java.lang.String r4 = "it"
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r8.next()
            com.google.android.exoplayer2.t0.a r3 = (com.google.android.exoplayer2.p381t0.C9270a) r3
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = r3.mo24013a()
            java.lang.String r4 = "it.profileLevels"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            java.util.List r3 = kotlin.p590y.C13174k.m40412l(r3)
            kotlin.p590y.C13196t.m40545a(r0, r3)
            goto L_0x0090
        L_0x00b2:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x00ba
        L_0x00b8:
            r8 = 0
            goto L_0x00d4
        L_0x00ba:
            java.util.Iterator r8 = r0.iterator()
        L_0x00be:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r8.next()
            android.media.MediaCodecInfo$CodecProfileLevel r0 = (android.media.MediaCodecInfo.CodecProfileLevel) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            boolean r0 = r6.m21769a(r0, r9)
            if (r0 == 0) goto L_0x00be
            r8 = 1
        L_0x00d4:
            if (r7 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x00db
            if (r8 == 0) goto L_0x00db
            r1 = 1
        L_0x00db:
            return r1
        L_0x00dc:
            kotlin.s r7 = new kotlin.s
            java.lang.String r8 = "null cannot be cast to non-null type android.view.WindowManager"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p277b0.C7191b.m21768a(int, java.lang.String, java.util.Map, boolean):boolean");
    }

    /* renamed from: b */
    private final boolean m21771b() {
        Object systemService = this.f15898b.getSystemService("audio");
        if (systemService != null) {
            String parameters = ((AudioManager) systemService).getParameters("hdmi_encodings");
            Intrinsics.checkReturnedValueIsNotNull((Object) parameters, "manager.getParameters(AMAZON_HDMI_ENCODINGS)");
            return C12833x.m40154a((CharSequence) parameters, (CharSequence) "atmos", false, 2, (Object) null);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
    }

    public List<SupportedCodec> getSupportedCodecs() {
        return this.f15897a.getSupportedCodecs();
    }

    public List<HdrType> getSupportedHdrTypes() {
        HdrType[] hdrTypeArr = new HdrType[2];
        HdrType hdrType = HdrType.HDR10;
        if (!m21768a(2, "video/hevc", this.f15899c.mo20056d(), true)) {
            hdrType = null;
        }
        hdrTypeArr[0] = hdrType;
        HdrType hdrType2 = HdrType.DOLBY_VISION;
        if (!m21768a(1, "video/dolby-vision", this.f15899c.mo20055c(), true)) {
            hdrType2 = null;
        }
        hdrTypeArr[1] = hdrType2;
        List d = C13185o.m40522d(hdrTypeArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            if (this.f15899c.mo20057e().contains(((HdrType) next).getType())) {
                arrayList.add(next);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Supported HDR types: ");
        sb.append(arrayList);
        Timber.m44522a(sb.toString(), new Object[0]);
        return arrayList;
    }

    public WidevineSecurityLevel getWidevineSecurityLevel() {
        return this.f15897a.getWidevineSecurityLevel();
    }

    public boolean supportsAtmos() {
        boolean z;
        boolean z2;
        List supportedHdrTypes = getSupportedHdrTypes();
        if (!(supportedHdrTypes instanceof Collection) || !supportedHdrTypes.isEmpty()) {
            Iterator it = supportedHdrTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HdrType hdrType = (HdrType) it.next();
                if (Intrinsics.areEqual((Object) hdrType, (Object) HdrType.HDR10) || Intrinsics.areEqual((Object) hdrType, (Object) HdrType.DOLBY_VISION)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z3 = m21771b() || m21767a();
        if (!z || !z3 || !this.f15899c.mo20053a()) {
            return false;
        }
        return true;
    }

    public boolean supportsMultiCodecMaster() {
        return this.f15897a.supportsMultiCodecMaster();
    }

    /* renamed from: a */
    private final boolean m21767a() {
        return VERSION.SDK_INT >= 28 && C8834j.m25613a(this.f15898b).mo23084a(18);
    }

    /* renamed from: a */
    private final boolean m21770a(boolean z) {
        if (VERSION.SDK_INT < 26 || !z) {
            return true;
        }
        Resources resources = this.f15898b.getResources();
        String str = "context.resources";
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, str);
        Configuration configuration = resources.getConfiguration();
        if (configuration != null && configuration.isScreenHdr()) {
            return true;
        }
        Resources resources2 = this.f15898b.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources2, str);
        Configuration configuration2 = resources2.getConfiguration();
        if (configuration2 == null || !configuration2.isScreenWideColorGamut()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m21769a(CodecProfileLevel codecProfileLevel, Map<Integer, Integer> map) {
        boolean z;
        if (map.isEmpty()) {
            return false;
        }
        for (Entry entry : map.entrySet()) {
            if (codecProfileLevel.profile != ((Number) entry.getKey()).intValue() || codecProfileLevel.level < ((Number) entry.getValue()).intValue()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
