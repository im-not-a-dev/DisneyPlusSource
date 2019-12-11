package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.drm.C8704i.C8707c;
import com.google.android.exoplayer2.drm.C8712n;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.drm.DrmSession.C8694a;
import com.google.android.exoplayer2.drm.ExoMediaDrm.C8695a;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9557m;
import com.google.android.exoplayer2.p393v0.C9557m.C9558a;
import com.google.android.exoplayer2.p393v0.C9563q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends C8712n> implements C8710l<T>, C8707c<T> {

    /* renamed from: a */
    private final UUID f18444a;

    /* renamed from: b */
    private final ExoMediaDrm<T> f18445b;

    /* renamed from: c */
    private final C8715q f18446c;

    /* renamed from: d */
    private final HashMap<String, String> f18447d;

    /* renamed from: e */
    private final C9557m<C8709k> f18448e = new C9557m<>();

    /* renamed from: f */
    private final boolean f18449f;

    /* renamed from: g */
    private final int f18450g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List<C8704i<T>> f18451h;

    /* renamed from: i */
    private final List<C8704i<T>> f18452i;

    /* renamed from: j */
    private Looper f18453j;

    /* renamed from: k */
    private int f18454k;

    /* renamed from: l */
    private byte[] f18455l;

    /* renamed from: m */
    volatile C8689c f18456m;

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    private class C8688b implements C8695a<T> {
        private C8688b() {
        }

        /* renamed from: a */
        public void mo22747a(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
            C8689c cVar = DefaultDrmSessionManager.this.f18456m;
            C9537e.m29296a(cVar);
            cVar.obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    private class C8689c extends Handler {
        public C8689c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                Iterator it = DefaultDrmSessionManager.this.f18451h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8704i iVar = (C8704i) it.next();
                    if (iVar.mo22796a(bArr)) {
                        iVar.mo22794a(message.what);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    public static final class C8690d extends Exception {
        private C8690d(UUID uuid) {
            StringBuilder sb = new StringBuilder();
            sb.append("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, C8715q qVar, HashMap<String, String> hashMap, boolean z, int i) {
        C9537e.m29296a(uuid);
        C9537e.m29296a(exoMediaDrm);
        C9537e.m29300a(!C8883r.f19043b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f18444a = uuid;
        this.f18445b = exoMediaDrm;
        this.f18446c = qVar;
        this.f18447d = hashMap;
        this.f18449f = z;
        this.f18450g = i;
        this.f18454k = 0;
        this.f18451h = new ArrayList();
        this.f18452i = new ArrayList();
        if (z && C8883r.f19045d.equals(uuid) && C9554k0.f22281a >= 19) {
            exoMediaDrm.mo22779a("sessionSharing", "enable");
        }
        exoMediaDrm.mo22778a((C8695a<? super T>) new C8688b<Object>());
    }

    public DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData) {
        List list;
        C8704i iVar;
        Looper looper2 = this.f18453j;
        C9537e.m29301b(looper2 == null || looper2 == looper);
        if (this.f18451h.isEmpty()) {
            this.f18453j = looper;
            if (this.f18456m == null) {
                this.f18456m = new C8689c<>(looper);
            }
        }
        C8704i iVar2 = null;
        if (this.f18455l == null) {
            List a = m25150a(drmInitData, this.f18444a, false);
            if (a.isEmpty()) {
                C8690d dVar = new C8690d(this.f18444a);
                this.f18448e.mo24648a((C9558a<T>) new C8698c<T>(dVar));
                return new C8711m(new C8694a(dVar));
            }
            list = a;
        } else {
            list = null;
        }
        if (this.f18449f) {
            Iterator it = this.f18451h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8704i iVar3 = (C8704i) it.next();
                if (C9554k0.m29414a((Object) iVar3.f18483a, (Object) list)) {
                    iVar2 = iVar3;
                    break;
                }
            }
        } else if (!this.f18451h.isEmpty()) {
            iVar2 = (C8704i) this.f18451h.get(0);
        }
        if (iVar2 == null) {
            iVar = new C8704i(this.f18444a, this.f18445b, this, list, this.f18454k, this.f18455l, this.f18447d, this.f18446c, looper, this.f18448e, this.f18450g);
            this.f18451h.add(iVar);
        } else {
            iVar = iVar2;
        }
        iVar.mo22797e();
        return iVar;
    }

    public boolean canAcquireSession(DrmInitData drmInitData) {
        boolean z = true;
        if (this.f18455l != null) {
            return true;
        }
        if (m25150a(drmInitData, this.f18444a, true).isEmpty()) {
            if (drmInitData.f18461W != 1 || !drmInitData.mo22750a(0).mo22763a(C8883r.f19043b)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.f18444a);
            C9563q.m29500d("DefaultDrmSessionMgr", sb.toString());
        }
        String str = drmInitData.f18460V;
        if (str != null && !"cenc".equals(str)) {
            if (!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) {
                return true;
            }
            if (C9554k0.f22281a < 25) {
                z = false;
            }
        }
        return z;
    }

    public void releaseSession(DrmSession<T> drmSession) {
        if (!(drmSession instanceof C8711m)) {
            C8704i iVar = (C8704i) drmSession;
            if (iVar.mo22800h()) {
                this.f18451h.remove(iVar);
                if (this.f18452i.size() > 1 && this.f18452i.get(0) == iVar) {
                    ((C8704i) this.f18452i.get(1)).mo22799g();
                }
                this.f18452i.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    public static DefaultDrmSessionManager<C8713o> m25147a(C8715q qVar, HashMap<String, String> hashMap) throws C8716r {
        return m25148a(C8883r.f19045d, qVar, hashMap);
    }

    /* renamed from: a */
    public static DefaultDrmSessionManager<C8713o> m25148a(UUID uuid, C8715q qVar, HashMap<String, String> hashMap) throws C8716r {
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid, FrameworkMediaDrm.m25194b(uuid), qVar, hashMap, false, 3);
        return defaultDrmSessionManager;
    }

    /* renamed from: a */
    public final void mo22744a(Handler handler, C8709k kVar) {
        this.f18448e.mo24647a(handler, kVar);
    }

    /* renamed from: a */
    public void mo22743a(int i, byte[] bArr) {
        C9537e.m29301b(this.f18451h.isEmpty());
        if (i == 1 || i == 3) {
            C9537e.m29296a(bArr);
        }
        this.f18454k = i;
        this.f18455l = bArr;
    }

    /* renamed from: a */
    public void mo22745a(C8704i<T> iVar) {
        if (!this.f18452i.contains(iVar)) {
            this.f18452i.add(iVar);
            if (this.f18452i.size() == 1) {
                iVar.mo22799g();
            }
        }
    }

    /* renamed from: a */
    public void mo22742a() {
        for (C8704i f : this.f18452i) {
            f.mo22798f();
        }
        this.f18452i.clear();
    }

    /* renamed from: a */
    public void mo22746a(Exception exc) {
        for (C8704i a : this.f18452i) {
            a.mo22795a(exc);
        }
        this.f18452i.clear();
    }

    /* renamed from: a */
    private static List<C8692b> m25150a(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f18461W);
        for (int i = 0; i < drmInitData.f18461W; i++) {
            C8692b a = drmInitData.mo22750a(i);
            if ((a.mo22763a(uuid) || (C8883r.f19044c.equals(uuid) && a.mo22763a(C8883r.f19043b))) && (a.f18466X != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
