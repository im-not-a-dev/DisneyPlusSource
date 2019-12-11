package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.metadata.C8743e;
import com.google.android.exoplayer2.metadata.C8744f;
import com.google.android.exoplayer2.p361p0.C8840m;
import com.google.android.exoplayer2.p361p0.C8842n;
import com.google.android.exoplayer2.p381t0.C9273c;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p382u0.C9333l;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.p394w0.C9593m;
import com.google.android.exoplayer2.p394w0.C9603r;
import com.google.android.exoplayer2.p394w0.p395s.C9606b;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.w */
/* compiled from: DefaultRenderersFactory */
public class C9577w implements RenderersFactory {

    /* renamed from: a */
    private final Context f22343a;

    /* renamed from: b */
    private DrmSessionManager<FrameworkMediaCrypto> f22344b;

    /* renamed from: c */
    private int f22345c = 0;

    /* renamed from: d */
    private long f22346d = 5000;

    /* renamed from: e */
    private boolean f22347e;

    /* renamed from: f */
    private boolean f22348f;

    /* renamed from: g */
    private C9273c f22349g = C9273c.f21152a;

    public C9577w(Context context) {
        this.f22343a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24732a(Context context, Handler handler, int i, ArrayList<C8733l0> arrayList) {
    }

    /* renamed from: a */
    public C8733l0[] mo22650a(Handler handler, C9603r rVar, C8842n nVar, C9332k kVar, C8743e eVar, DrmSessionManager<FrameworkMediaCrypto> lVar) {
        DrmSessionManager<FrameworkMediaCrypto> lVar2 = lVar == null ? this.f22344b : lVar;
        ArrayList arrayList = new ArrayList();
        DrmSessionManager<FrameworkMediaCrypto> lVar3 = lVar2;
        mo24729a(this.f22343a, this.f22345c, this.f22349g, lVar3, this.f22347e, this.f22348f, handler, rVar, this.f22346d, arrayList);
        mo24730a(this.f22343a, this.f22345c, this.f22349g, lVar3, this.f22347e, this.f22348f, mo24735a(), handler, nVar, arrayList);
        ArrayList arrayList2 = arrayList;
        mo24734a(this.f22343a, kVar, handler.getLooper(), this.f22345c, arrayList2);
        mo24733a(this.f22343a, eVar, handler.getLooper(), this.f22345c, arrayList2);
        mo24731a(this.f22343a, this.f22345c, arrayList);
        mo24732a(this.f22343a, handler, this.f22345c, arrayList);
        return (C8733l0[]) arrayList.toArray(new C8733l0[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8840m[] mo24735a() {
        return new C8840m[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24729a(Context context, int i, C9273c cVar, DrmSessionManager<FrameworkMediaCrypto> lVar, boolean z, boolean z2, Handler handler, C9603r rVar, long j, ArrayList<C8733l0> arrayList) {
        int i2 = i;
        ArrayList<C8733l0> arrayList2 = arrayList;
        C9593m mVar = new C9593m(context, cVar, j, lVar, z, z2, handler, rVar, 50);
        arrayList2.add(mVar);
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (C8733l0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, C9603r.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j), handler, rVar, Integer.valueOf(50)}));
                Log.m29499c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068 A[ExcHandler: Exception (r0v16 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f A[ExcHandler: Exception (r0v10 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:19:0x0074] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24730a(android.content.Context r17, int r18, com.google.android.exoplayer2.p381t0.C9273c r19, com.google.android.exoplayer2.drm.DrmSessionManager<com.google.android.exoplayer2.drm.FrameworkMediaCrypto> r20, boolean r21, boolean r22, com.google.android.exoplayer2.p361p0.C8840m[] r23, android.os.Handler r24, com.google.android.exoplayer2.p361p0.C8842n r25, java.util.ArrayList<com.google.android.exoplayer2.C8733l0> r26) {
        /*
            r16 = this;
            r0 = r18
            r1 = r23
            r11 = r26
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<com.google.android.exoplayer2.p0.m[]> r13 = com.google.android.exoplayer2.p361p0.C8840m[].class
            java.lang.Class<com.google.android.exoplayer2.p0.n> r14 = com.google.android.exoplayer2.p361p0.C8842n.class
            com.google.android.exoplayer2.p0.x r15 = new com.google.android.exoplayer2.p0.x
            com.google.android.exoplayer2.p0.u r10 = new com.google.android.exoplayer2.p0.u
            com.google.android.exoplayer2.p0.j r2 = com.google.android.exoplayer2.p361p0.C8834j.m25613a(r17)
            r10.<init>(r2, r1)
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r24
            r9 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.add(r15)
            if (r0 != 0) goto L_0x002f
            return
        L_0x002f:
            int r2 = r26.size()
            r3 = 2
            if (r0 != r3) goto L_0x0038
            int r2 = r2 + -1
        L_0x0038:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            r4 = 0
            r5 = 3
            r6 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r4] = r8     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            r7[r6] = r14     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            r7[r4] = r24     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            r7[r6] = r25     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            r7[r3] = r1     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            com.google.android.exoplayer2.l0 r0 = (com.google.android.exoplayer2.C8733l0) r0     // Catch:{ ClassNotFoundException -> 0x0071, Exception -> 0x0068 }
            int r7 = r2 + 1
            r11.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0068 }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            com.google.android.exoplayer2.util.Log.m29499c(r12, r0)     // Catch:{ ClassNotFoundException -> 0x0072, Exception -> 0x0068 }
            goto L_0x0072
        L_0x0068:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0071:
            r7 = r2
        L_0x0072:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r2[r4] = r8     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            r2[r6] = r14     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            r2[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            r2[r4] = r24     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            r2[r6] = r25     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            r2[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            com.google.android.exoplayer2.l0 r0 = (com.google.android.exoplayer2.C8733l0) r0     // Catch:{ ClassNotFoundException -> 0x00a8, Exception -> 0x009f }
            int r2 = r7 + 1
            r11.add(r7, r0)     // Catch:{ ClassNotFoundException -> 0x00a9, Exception -> 0x009f }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            com.google.android.exoplayer2.util.Log.m29499c(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00a9, Exception -> 0x009f }
            goto L_0x00a9
        L_0x009f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a8:
            r2 = r7
        L_0x00a9:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r4] = r8     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r7[r6] = r14     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r5[r4] = r24     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r5[r6] = r25     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r5[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.Object r0 = r0.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            com.google.android.exoplayer2.l0 r0 = (com.google.android.exoplayer2.C8733l0) r0     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            r11.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            com.google.android.exoplayer2.util.Log.m29499c(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00dd, Exception -> 0x00d4 }
            goto L_0x00dd
        L_0x00d4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C9577w.mo24730a(android.content.Context, int, com.google.android.exoplayer2.t0.c, com.google.android.exoplayer2.drm.l, boolean, boolean, com.google.android.exoplayer2.p0.m[], android.os.Handler, com.google.android.exoplayer2.p0.n, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24734a(Context context, C9332k kVar, Looper looper, int i, ArrayList<C8733l0> arrayList) {
        arrayList.add(new C9333l(kVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24733a(Context context, C8743e eVar, Looper looper, int i, ArrayList<C8733l0> arrayList) {
        arrayList.add(new C8744f(eVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24731a(Context context, int i, ArrayList<C8733l0> arrayList) {
        arrayList.add(new C9606b());
    }
}
