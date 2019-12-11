package com.bamtechmedia.dominguez.channels.p073tv.p077j;

import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3224c;
import com.bamtechmedia.dominguez.core.content.C3651b;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.google.common.base.C10368c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7166i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/channels/tv/programs/AssetToProgramMapper;", "Lcom/google/common/base/Function;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Lcom/bamtechmedia/dominguez/channels/tv/db/ProgramCandidate;", "ripcutUrlResolver", "Lcom/bamtechmedia/dominguez/ripcut/RipcutUrlResolver;", "(Lcom/bamtechmedia/dominguez/ripcut/RipcutUrlResolver;)V", "addDurationToCandidate", "programCandidate", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "addEpisodeDataToCandidate", "candidate", "episode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "apply", "asset", "getDeeplink", "", "getImage", "getProgramType", "", "(Lcom/bamtechmedia/dominguez/core/content/assets/Asset;)Ljava/lang/Integer;", "channels_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.channels.tv.j.a */
/* compiled from: AssetToProgramMapper.kt */
public final class C3225a implements C10368c<C3626b, C3224c> {

    /* renamed from: c */
    private final C7166i f8207c;

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.j.a$a */
    /* compiled from: AssetToProgramMapper.kt */
    static final class C3226a extends C12881k implements Function2<Integer, Integer, Integer> {

        /* renamed from: c */
        public static final C3226a f8208c = new C3226a();

        C3226a() {
            super(2);
        }

        /* renamed from: a */
        public final int mo12282a(int i, int i2) {
            return ((int) TimeUnit.MINUTES.toMillis((long) i)) + i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(mo12282a(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.channels.tv.j.a$b */
    /* compiled from: AssetToProgramMapper.kt */
    static final class C3227b extends C12881k implements Function2<String, Integer, C3224c> {

        /* renamed from: U */
        final /* synthetic */ C3626b f8209U;

        /* renamed from: V */
        final /* synthetic */ String f8210V;

        /* renamed from: W */
        final /* synthetic */ String f8211W;

        /* renamed from: c */
        final /* synthetic */ String f8212c;

        C3227b(String str, C3626b bVar, String str2, String str3) {
            this.f8212c = str;
            this.f8209U = bVar;
            this.f8210V = str2;
            this.f8211W = str3;
            super(2);
        }

        /* renamed from: a */
        public final C3224c mo12283a(String str, int i) {
            C3224c cVar = new C3224c(this.f8212c, this.f8211W, this.f8209U.getTitle(), this.f8210V, str, i, null, null, null, null, null, null, 4032, null);
            return cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo12283a((String) obj, ((Number) obj2).intValue());
        }
    }

    public C3225a(C7166i iVar) {
        this.f8207c = iVar;
    }

    /* renamed from: b */
    private final String m11197b(C3626b bVar) {
        String str = "?fromChannel";
        if (bVar instanceof C3692n) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://disneyplus.com/movies/");
            C3692n nVar = (C3692n) bVar;
            sb.append(nVar.mo13040b());
            sb.append('/');
            sb.append(nVar.mo13264e());
            sb.append(str);
            return sb.toString();
        }
        String str2 = "https://disneyplus.com/series/";
        if (bVar instanceof C3685g) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            C3685g gVar = (C3685g) bVar;
            sb2.append(gVar.mo13040b());
            sb2.append('/');
            sb2.append(gVar.mo12873C());
            sb2.append(str);
            return sb2.toString();
        } else if (!(bVar instanceof C3791v)) {
            return "https://disneyplus.com/";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            C3791v vVar = (C3791v) bVar;
            sb3.append(vVar.mo13040b());
            sb3.append('/');
            sb3.append(vVar.mo13024C());
            sb3.append(str);
            return sb3.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m11198c(com.bamtechmedia.dominguez.core.content.assets.C3626b r4) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.core.content.j r0 = com.bamtechmedia.dominguez.core.content.C3689k.m12544a(r4)
            com.bamtechmedia.dominguez.core.content.j r1 = com.bamtechmedia.dominguez.core.content.C3688j.TILE
            com.bamtechmedia.dominguez.core.content.assets.a$a r2 = com.bamtechmedia.dominguez.core.content.assets.C3623a.f9125b0
            com.bamtechmedia.dominguez.core.content.assets.a r2 = r2.mo13248a()
            com.bamtechmedia.dominguez.core.content.assets.Image r1 = r4.mo12845a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r1.mo13085U()
            if (r1 == 0) goto L_0x001b
            r4 = r1
            goto L_0x002f
        L_0x001b:
            if (r0 == 0) goto L_0x002e
            com.bamtechmedia.dominguez.core.content.assets.a$a r1 = com.bamtechmedia.dominguez.core.content.assets.C3623a.f9125b0
            com.bamtechmedia.dominguez.core.content.assets.a r1 = r1.mo13248a()
            com.bamtechmedia.dominguez.core.content.assets.Image r4 = r4.mo12845a(r0, r1)
            if (r4 == 0) goto L_0x002e
            java.lang.String r4 = r4.mo13085U()
            goto L_0x002f
        L_0x002e:
            r4 = r2
        L_0x002f:
            if (r4 == 0) goto L_0x0038
            g.e.b.a0.i r0 = r3.f8207c
            r1 = 2
            java.lang.String r2 = p163g.p201e.p203b.p275a0.C7166i.C7167a.m21728a(r0, r4, r2, r1, r2)
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.channels.p073tv.p077j.C3225a.m11198c(com.bamtechmedia.dominguez.core.content.assets.b):java.lang.String");
    }

    /* renamed from: d */
    private final Integer m11199d(C3626b bVar) {
        if (bVar instanceof C3692n) {
            return Integer.valueOf(0);
        }
        if (bVar instanceof C3685g) {
            return Integer.valueOf(3);
        }
        if (bVar instanceof C3791v) {
            return Integer.valueOf(1);
        }
        return null;
    }

    /* renamed from: a */
    public C3224c apply(C3626b bVar) {
        if (bVar == null) {
            return null;
        }
        boolean z = bVar instanceof C3651b;
        C3224c cVar = (C3224c) C5884x.m18949a(m11198c(bVar), m11199d(bVar), new C3227b(z ? ((C3651b) bVar).mo12903f() : "", bVar, z ? ((C3651b) bVar).getDescription() : null, m11197b(bVar)));
        if (cVar == null) {
            return null;
        }
        if (bVar instanceof C3693o) {
            cVar = m11196a(cVar, (C3693o) bVar);
        }
        return bVar instanceof C3685g ? m11195a(cVar, (C3685g) bVar) : cVar;
    }

    /* renamed from: a */
    private final C3224c m11196a(C3224c cVar, C3693o oVar) {
        Integer num;
        Long playhead = oVar.getPlayhead();
        if (playhead != null) {
            num = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(playhead.longValue()));
        } else {
            num = null;
        }
        Integer num2 = num;
        return C3224c.m11182a(cVar, null, null, null, null, null, 0, (Integer) C5884x.m18949a(oVar.mo13274m(), num2, C3226a.f8208c), num2, null, null, null, null, 3903, null);
    }

    /* renamed from: a */
    private final C3224c m11195a(C3224c cVar, C3685g gVar) {
        return C3224c.m11182a(cVar, null, null, null, null, null, 0, null, null, Integer.valueOf(gVar.mo12876F()), gVar.mo12877G(), Integer.valueOf(gVar.mo12878I()), gVar.getTitle(), 255, null);
    }
}
