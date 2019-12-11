package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.core.content.C3693o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.i */
/* compiled from: DmcPlayable.kt */
public abstract class C3635i extends C3633g implements C3693o {

    /* renamed from: b0 */
    private final Float f9139b0;

    /* renamed from: c0 */
    private final C3638l f9140c0;

    /* renamed from: d0 */
    private final List<Language> f9141d0;

    /* renamed from: e0 */
    private final transient List<PlaybackUrl> f9142e0;

    /* renamed from: f0 */
    private final transient List<Milestone> f9143f0;

    /* renamed from: g0 */
    private final transient DmcVideoMeta f9144g0;

    /* renamed from: h0 */
    private final transient List<DmcDisclaimerLabel> f9145h0;

    public /* synthetic */ C3635i(List list, List list2, List list3, List list4, List list5, DmcMediaMetadata dmcMediaMetadata, List list6, List list7, List list8, DmcVideoMeta dmcVideoMeta, MediaRights mediaRights, List list9, String str, List list10, List list11, List list12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(list, list2, list3, list4, list5, dmcMediaMetadata, list6, list7, list8, dmcVideoMeta, mediaRights, list9, (i2 & 4096) != 0 ? null : str, (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? null : list10, list11, list12);
    }

    /* renamed from: A */
    public Integer mo13270A() {
        DmcVideoMeta dmcVideoMeta = this.f9144g0;
        if (dmcVideoMeta != null) {
            UserMediaMeta X = dmcVideoMeta.mo13065X();
            if (X != null) {
                return X.mo13224A();
            }
        }
        return null;
    }

    /* renamed from: B */
    public C3638l mo13271B() {
        return this.f9140c0;
    }

    public Long getPlayhead() {
        DmcVideoMeta dmcVideoMeta = this.f9144g0;
        if (dmcVideoMeta != null) {
            UserMediaMeta X = dmcVideoMeta.mo13065X();
            if (X != null) {
                return Long.valueOf(X.getPlayhead());
            }
        }
        return null;
    }

    /* renamed from: k */
    public Long mo13272k() {
        return C3641o.m12394d(this.f9143f0);
    }

    /* renamed from: l */
    public List<Language> mo13273l() {
        return this.f9141d0;
    }

    /* renamed from: m */
    public Integer mo13274m() {
        DmcVideoMeta dmcVideoMeta = this.f9144g0;
        if (dmcVideoMeta != null) {
            UserMediaMeta X = dmcVideoMeta.mo13065X();
            if (X != null) {
                return X.mo13235m();
            }
        }
        return null;
    }

    /* renamed from: n */
    public Float mo13275n() {
        return this.f9139b0;
    }

    /* renamed from: o */
    public Long mo13276o() {
        return C3641o.m12389a(this.f9143f0);
    }

    /* renamed from: p */
    public Long mo13277p() {
        return C3641o.m12393c(this.f9143f0);
    }

    /* renamed from: q */
    public String mo13278q() {
        return ((PlaybackUrl) C13199w.m40589f((List) this.f9142e0)).getUrl();
    }

    /* renamed from: t */
    public Long mo13279t() {
        return C3641o.m12392b(this.f9143f0);
    }

    /* renamed from: v */
    public List<String> mo13280v() {
        List<DmcDisclaimerLabel> list = this.f9145h0;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (DmcDisclaimerLabel X : list) {
            arrayList.add(X.mo12863X());
        }
        return arrayList;
    }

    /* renamed from: y */
    public Long mo13281y() {
        return C3641o.m12395e(this.f9143f0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3635i(java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r15, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Image> r16, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Participant> r17, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Release> r18, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Rating> r19, com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r20, java.util.List<com.bamtechmedia.dominguez.core.content.assets.PlaybackUrl> r21, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Milestone> r22, java.util.List<com.bamtechmedia.dominguez.core.content.GenreMeta> r23, com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta r24, com.bamtechmedia.dominguez.core.content.assets.MediaRights r25, java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel> r26, java.lang.String r27, java.util.List<java.lang.String> r28, java.util.List<? extends com.bamtechmedia.dominguez.core.content.collections.C3680n> r29, java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcTag> r30) {
        /*
            r14 = this;
            r12 = r14
            r13 = r20
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r21
            r12.f9142e0 = r0
            r0 = r22
            r12.f9143f0 = r0
            r0 = r24
            r12.f9144g0 = r0
            r0 = r26
            r12.f9145h0 = r0
            if (r13 == 0) goto L_0x0033
            java.lang.Float r0 = r20.mo12957n()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r12.f9139b0 = r0
            r12.f9140c0 = r13
            if (r13 == 0) goto L_0x0041
            java.util.List r0 = r20.mo12956l()
            if (r0 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.util.List r0 = kotlin.p590y.C13185o.m40513a()
        L_0x0045:
            r12.f9141d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.C3635i.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata, java.util.List, java.util.List, java.util.List, com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta, com.bamtechmedia.dominguez.core.content.assets.MediaRights, java.util.List, java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }
}
