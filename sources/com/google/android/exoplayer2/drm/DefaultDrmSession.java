package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.DrmInitData.C8692b;
import com.google.android.exoplayer2.drm.DrmSession.C8694a;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9557m;
import com.google.android.exoplayer2.p393v0.C9557m.C9558a;
import com.google.android.exoplayer2.p393v0.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
/* renamed from: com.google.android.exoplayer2.drm.i */
/* compiled from: DefaultDrmSession */
class DefaultDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {

    /* renamed from: a */
    public final List<C8692b> f18483a;

    /* renamed from: b */
    private final ExoMediaDrm<T> f18484b;

    /* renamed from: c */
    private final C8707c<T> f18485c;

    /* renamed from: d */
    private final int f18486d;

    /* renamed from: e */
    private final HashMap<String, String> f18487e;

    /* renamed from: f */
    private final C9557m<C8709k> f18488f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f18489g;

    /* renamed from: h */
    final C8715q f18490h;

    /* renamed from: i */
    final UUID f18491i;

    /* renamed from: j */
    final C8706b f18492j;

    /* renamed from: k */
    private int f18493k;

    /* renamed from: l */
    private int f18494l;

    /* renamed from: m */
    private HandlerThread f18495m;

    /* renamed from: n */
    private PostResponseHandler f18496n;

    /* renamed from: o */
    private T f18497o;

    /* renamed from: p */
    private C8694a f18498p;

    /* renamed from: q */
    private byte[] f18499q;

    /* renamed from: r */
    private byte[] f18500r;

    /* renamed from: s */
    private KeyRequest f18501s;

    /* renamed from: t */
    private ProvisionRequest f18502t;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.i$a */
    /* compiled from: DefaultDrmSession */
    private class PostResponseHandler extends Handler {
        public PostResponseHandler(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void post(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = DefaultDrmSession.this.f18490h.executeProvisionRequest(DefaultDrmSession.this.f18491i, (ProvisionRequest) obj);
                } else if (i == 1) {
                    e = DefaultDrmSession.this.f18490h.executeKeyRequest(DefaultDrmSession.this.f18491i, (KeyRequest) obj);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (maybeRetryRequest(message)) {
                    return;
                }
            }
            DefaultDrmSession.this.f18492j.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }

        /* renamed from: a */
        private boolean maybeRetryRequest(Message message) {
            if (!(message.arg1 == 1)) {
                return false;
            }
            int i = message.arg2 + 1;
            if (i > DefaultDrmSession.this.f18489g) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i;
            sendMessageDelayed(obtain, getRetryDelayMillis(i));
            return true;
        }

        /* renamed from: a */
        private long getRetryDelayMillis(int i) {
            return (long) Math.min((i - 1) * 1000, 5000);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.i$b */
    /* compiled from: DefaultDrmSession */
    private class C8706b extends Handler {
        public C8706b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.m25230b(obj, obj2);
            } else if (i == 1) {
                DefaultDrmSession.this.m25225a(obj, obj2);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.i$c */
    /* compiled from: DefaultDrmSession */
    public interface C8707c<T extends ExoMediaCrypto> {
        /* renamed from: a */
        void mo22742a();

        /* renamed from: a */
        void mo22745a(DefaultDrmSession<T> iVar);

        /* renamed from: a */
        void mo22746a(Exception exc);
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm<T> exoMediaDrm, C8707c<T> cVar, List<C8692b> list, int i, byte[] bArr, HashMap<String, String> hashMap, C8715q qVar, Looper looper, C9557m<C8709k> mVar, int i2) {
        if (i == 1 || i == 3) {
            C9537e.m29296a(bArr);
        }
        this.f18491i = uuid;
        this.f18485c = cVar;
        this.f18484b = exoMediaDrm;
        this.f18486d = i;
        if (bArr != null) {
            this.f18500r = bArr;
            this.f18483a = null;
        } else {
            C9537e.m29296a(list);
            this.f18483a = Collections.unmodifiableList(list);
        }
        this.f18487e = hashMap;
        this.f18490h = qVar;
        this.f18489g = i2;
        this.f18488f = mVar;
        this.f18493k = 2;
        this.f18492j = new C8706b<>(looper);
        this.f18495m = new HandlerThread("DrmRequestHandler");
        this.f18495m.start();
        this.f18496n = new PostResponseHandler<>(this.f18495m.getLooper());
    }

    /* renamed from: i */
    private long m25233i() {
        if (!C8883r.WIDEVINE_UUID.equals(this.f18491i)) {
            return Long.MAX_VALUE;
        }
        Pair a = C8717s.m25263a(this);
        C9537e.m29296a(a);
        Pair pair = a;
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: j */
    private boolean m25234j() {
        int i = this.f18493k;
        return i == 3 || i == 4;
    }

    /* renamed from: k */
    private void m25235k() {
        if (this.f18486d == 0 && this.f18493k == 4) {
            Util.castNonNull(this.f18499q);
            m25226a(false);
        }
    }

    /* renamed from: l */
    private boolean restoreKeys() {
        try {
			// mediaDrm.restoreKeys(sessionId, offlineLicenseKeySetId);
            this.f18484b.mo22780a(this.f18499q, this.f18500r);
            return true;
        } catch (Exception e) {
            Log.m29496a("DefaultDrmSession", "Error trying to restore Widevine keys.", e);
            m25229b(e);
            return false;
        }
    }

    /* renamed from: c */
    public byte[] mo22772c() {
        return this.f18500r;
    }

    /* renamed from: d */
    public final int mo22773d() {
        return this.f18493k;
    }

    /* renamed from: e */
    public void mo22797e() {
        int i = this.f18494l + 1;
        this.f18494l = i;
        if (i == 1 && this.f18493k != 1 && m25231b(true)) {
            m25226a(true);
        }
    }

    /* renamed from: f */
    public void mo22798f() {
        if (m25231b(false)) {
            m25226a(true);
        }
    }

    /* renamed from: g */
    public void mo22799g() {
        this.f18502t = this.f18484b.mo22776a();
        this.f18496n.post(0, this.f18502t, true);
    }

    public final C8694a getError() {
        if (this.f18493k == 1) {
            return this.f18498p;
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo22800h() {
        int i = this.f18494l - 1;
        this.f18494l = i;
        if (i != 0) {
            return false;
        }
        this.f18493k = 0;
        this.f18492j.removeCallbacksAndMessages(null);
        this.f18496n.removeCallbacksAndMessages(null);
        this.f18496n = null;
        this.f18495m.quit();
        this.f18495m = null;
        this.f18497o = null;
        this.f18498p = null;
        this.f18501s = null;
        this.f18502t = null;
        byte[] bArr = this.f18499q;
        if (bArr != null) {
            this.f18484b.mo22784c(bArr);
            this.f18499q = null;
            this.f18488f.mo24648a((C9558a<T>) C8696a.f18475a);
        }
        return true;
    }

    /* renamed from: c */
    private void m25232c(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f18485c.mo22745a(this);
        } else {
            m25229b(exc);
        }
    }

    /* renamed from: b */
    public final T mo22771b() {
        return this.f18497o;
    }

    /* renamed from: b */
    private boolean m25231b(boolean z) {
        if (m25234j()) {
            return true;
        }
        try {
            this.f18499q = this.f18484b.mo22782b();
            this.f18488f.mo24648a((C9558a<T>) C8700e.f18480a);
            this.f18497o = this.f18484b.mo22781b(this.f18499q);
            this.f18493k = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f18485c.mo22745a(this);
            } else {
                m25229b((Exception) e);
            }
            return false;
        } catch (Exception e2) {
            m25229b(e2);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo22796a(byte[] bArr) {
        return Arrays.equals(this.f18499q, bArr);
    }

    /* renamed from: a */
    public void mo22794a(int i) {
        if (i == 2) {
            m25235k();
        }
    }

    /* renamed from: a */
    public void mo22795a(Exception exc) {
        m25229b(exc);
    }

    /* renamed from: a */
    public Map<String, String> mo22770a() {
        byte[] bArr = this.f18499q;
        if (bArr == null) {
            return null;
        }
        return this.f18484b.mo22777a(bArr);
    }

    /* renamed from: a */
    private void m25226a(boolean z) {
        int i = this.f18486d;
        if (i == 0 || i == 1) {
            if (this.f18500r == null) {
                m25227a(this.f18499q, 1, z);
            } else if (this.f18493k == 4 || restoreKeys()) {
                long i2 = m25233i();
                if (this.f18486d == 0 && i2 <= 60) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                    sb.append(i2);
                    Log.m29495a("DefaultDrmSession", sb.toString());
                    m25227a(this.f18499q, 2, z);
                } else if (i2 <= 0) {
                    m25229b((Exception) new C8714p());
                } else {
                    this.f18493k = 4;
                    this.f18488f.mo24648a((C9558a<T>) C8701f.f18481a);
                }
            }
        } else if (i != 2) {
            if (i == 3) {
                C9537e.m29296a(this.f18500r);
                if (restoreKeys()) {
                    m25227a(this.f18500r, 3, z);
                }
            }
        } else if (this.f18500r == null) {
            m25227a(this.f18499q, 2, z);
        } else if (restoreKeys()) {
            m25227a(this.f18499q, 2, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25230b(Object obj, Object obj2) {
        if (obj == this.f18502t && (this.f18493k == 2 || m25234j())) {
            this.f18502t = null;
            if (obj2 instanceof Exception) {
                this.f18485c.mo22746a((Exception) obj2);
                return;
            }
            try {
                this.f18484b.mo22785d((byte[]) obj2);
                this.f18485c.mo22742a();
            } catch (Exception e) {
                this.f18485c.mo22746a(e);
            }
        }
    }

    /* renamed from: b */
    private void m25229b(Exception exc) {
        this.f18498p = new C8694a(exc);
        this.f18488f.mo24648a((C9558a<T>) new C8697b<T>(exc));
        if (this.f18493k != 4) {
            this.f18493k = 1;
        }
    }

    /* renamed from: a */
    private void m25227a(byte[] bArr, int i, boolean z) {
        try {
            this.f18501s = this.f18484b.mo22775a(bArr, this.f18483a, i, this.f18487e);
            this.f18496n.post(1, this.f18501s, z);
        } catch (Exception e) {
            m25232c(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25225a(Object obj, Object obj2) {
        if (obj == this.f18501s && m25234j()) {
            this.f18501s = null;
            if (obj2 instanceof Exception) {
                m25232c((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f18486d == 3) {
                    ExoMediaDrm<T> exoMediaDrm = this.f18484b;
                    byte[] bArr2 = this.f18500r;
                    Util.castNonNull(bArr2);
                    exoMediaDrm.mo22783b(bArr2, bArr);
                    this.f18488f.mo24648a((C9558a<T>) C8701f.f18481a);
                } else {
                    byte[] b = this.f18484b.mo22783b(this.f18499q, bArr);
                    if (!((this.f18486d != 2 && (this.f18486d != 0 || this.f18500r == null)) || b == null || b.length == 0)) {
                        this.f18500r = b;
                    }
                    this.f18493k = 4;
                    this.f18488f.mo24648a((C9558a<T>) C8702g.f18482a);
                }
            } catch (Exception e) {
                m25232c(e);
            }
        }
    }
}
