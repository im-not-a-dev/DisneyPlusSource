package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.core.content.C3693o;
import java.util.Map;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.e */
/* compiled from: PlaybackAnalytics.kt */
public final class C6391e {

    /* renamed from: a */
    private String f14511a = "user";

    /* renamed from: b */
    private String f14512b;

    /* renamed from: c */
    private final C2348e f14513c;

    /* renamed from: d */
    private final C2436p f14514d;

    /* renamed from: e */
    private final C2476z f14515e;

    public C6391e(C2348e eVar, C2436p pVar, C2476z zVar) {
        this.f14513c = eVar;
        this.f14514d = pVar;
        this.f14515e = zVar;
    }

    /* renamed from: a */
    private final void m20027a(C3693o oVar) {
        C2349a.m8853a(this.f14513c, "Video Player : Video Start", C13173j0.m40354a(C13173j0.m40354a(m20028e(), C12907r.m40244a("internalTitle", C6390d.m20023a(oVar))), C12907r.m40244a("contentMediaId", oVar.getMediaId())), false, 4, null);
    }

    /* renamed from: e */
    private final Map<String, String> m20028e() {
        String str = this.f14512b;
        if (str == null) {
            str = "";
        }
        return C13170i0.m40332a(C12907r.m40244a("contentViewingStatus", str));
    }

    /* renamed from: b */
    public final void mo19040b() {
        C2349a.m8853a(this.f14513c, "Video Player : Player Initiated", m20028e(), false, 4, null);
    }

    /* renamed from: c */
    public final void mo19042c() {
        C2349a.m8854a(this.f14513c, null, null, 3, null);
    }

    /* renamed from: d */
    public final void mo19043d() {
        C2349a.m8853a(this.f14513c, "Video Player : Rebuffering", null, false, 6, null);
    }

    /* renamed from: b */
    public final void mo19041b(boolean z) {
        C2348e eVar = this.f14513c;
        StringBuilder sb = new StringBuilder();
        sb.append("Video Player : 10s Skip ");
        sb.append(z ? "Forward" : "Back");
        sb.append(" Click");
        C2349a.m8853a(eVar, sb.toString(), m20028e(), false, 4, null);
    }

    /* renamed from: a */
    public final void mo19035a(int i) {
        String str = " Percent Complete";
        String str2 = "Video Player : Video ";
        if (!(i == 10 || i == 25 || i == 50 || i == 75)) {
            if (i == 90) {
                C2348e eVar = this.f14513c;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i);
                sb.append(str);
                C2349a.m8853a(eVar, sb.toString(), m20028e(), false, 4, null);
                C2436p pVar = this.f14514d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(i);
                sb2.append(str);
                pVar.mo11567a(sb2.toString(), m20028e());
                return;
            } else if (i != 100) {
                return;
            }
        }
        C2348e eVar2 = this.f14513c;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(i);
        sb3.append(str);
        C2349a.m8853a(eVar2, sb3.toString(), null, false, 6, null);
    }

    /* renamed from: a */
    public final void mo19037a(C3693o oVar, String str) {
        this.f14512b = str;
        m20027a(oVar);
    }

    /* renamed from: a */
    public final void mo19039a(boolean z) {
        C2348e eVar = this.f14513c;
        StringBuilder sb = new StringBuilder();
        sb.append("Video Player : Video ");
        sb.append(z ? "Play" : "Pause");
        sb.append(" Click");
        C2349a.m8853a(eVar, sb.toString(), m20028e(), false, 4, null);
    }

    /* renamed from: a */
    public final void mo19034a() {
        C2349a.m8853a(this.f14513c, "Video Player : Audio and Subtitle Menu Click", m20028e(), false, 4, null);
    }

    /* renamed from: a */
    public final void mo19038a(String str) {
        C2349a.m8853a(this.f14513c, "Video Player : Scrubber Click", C13173j0.m40354a(m20028e(), C12907r.m40244a("videoScrubberDirection", str)), false, 4, null);
    }

    /* renamed from: a */
    public final void mo19036a(MediaItem mediaItem, C3693o oVar, String str) {
        C2476z zVar = this.f14515e;
        Object obj = mediaItem.getTrackingData(MediaAnalyticsKey.AD_ENGINE).get("fguid");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        zVar.mo11537a(str2, str, oVar.mo12903f(), oVar.getMediaId());
    }
}
