package com.bamtech.player.exo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0732u;
import com.bamtech.player.exo.p043k.C1726a;
import com.bamtech.player.exo.p044l.C1728a;
import com.bamtech.player.exo.p044l.C1729b;
import com.bamtech.player.exo.p044l.C1731c;
import com.bamtech.player.exo.p044l.C1732d;
import com.bamtech.player.exo.p046n.C1739a;
import com.google.android.exoplayer2.C9319u.C9320a;
import com.google.android.exoplayer2.C9577w;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.p361p0.C8842n;
import com.google.android.exoplayer2.p394w0.C9603r;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.C9287b.C9291d;
import com.google.android.exoplayer2.trackselection.C9295d.C9299d;
import com.google.android.exoplayer2.trackselection.C9295d.C9301e;
import com.google.android.exoplayer2.trackselection.C9311j.C9313b;
import com.google.android.exoplayer2.upstream.C9510p;
import com.google.android.exoplayer2.upstream.C9510p.C9512b;
import com.google.android.exoplayer2.upstream.C9515r;
import com.google.android.exoplayer2.upstream.C9517t;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.C5284j;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p163g.p174d.p178b.C5312n;
import p163g.p174d.p178b.C5313o;
import p163g.p174d.p178b.C5315p;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p179a0.C4831f;
import p163g.p174d.p178b.p183e0.C4952a;
import p163g.p174d.p178b.p185g0.p189y5.C5226b;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p196m0.C5304b;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.subjects.PublishSubject;
import p686n.p687a.Timber;

public class ExoPlaybackEngine implements C5280i, C0721l {

    /* renamed from: Y */
    public static final Function<MediaSource, MediaSource> f5891Y = C1703b.f5943c;

    /* renamed from: Z */
    public static final C9510p f5892Z = new C9510p();

    /* renamed from: U */
    protected C1706e f5893U;

    /* renamed from: V */
    protected C5300m f5894V;

    /* renamed from: W */
    private C5313o f5895W;

    /* renamed from: X */
    C5226b f5896X;

    /* renamed from: c */
    List<C5284j> f5897c = new ArrayList();

    /* renamed from: com.bamtech.player.exo.ExoPlaybackEngine$a */
    public static class C1700a {

        /* renamed from: A */
        private boolean f5898A = false;

        /* renamed from: B */
        private Boolean f5899B;

        /* renamed from: C */
        private boolean f5900C;

        /* renamed from: D */
        private Integer f5901D = null;

        /* renamed from: a */
        protected final Context f5902a;

        /* renamed from: b */
        protected final C5313o f5903b;

        /* renamed from: c */
        protected final C4952a f5904c;

        /* renamed from: d */
        protected final String f5905d;

        /* renamed from: e */
        protected final C5300m f5906e;

        /* renamed from: f */
        protected C5315p f5907f;

        /* renamed from: g */
        protected C1706e f5908g;

        /* renamed from: h */
        protected C9510p f5909h;

        /* renamed from: i */
        protected C9313b f5910i;

        /* renamed from: j */
        protected C1739a f5911j;

        /* renamed from: k */
        protected C1732d f5912k;

        /* renamed from: l */
        protected RenderersFactory f5913l;

        /* renamed from: m */
        protected Handler f5914m;

        /* renamed from: n */
        protected C1731c f5915n;

        /* renamed from: o */
        protected C1728a f5916o;

        /* renamed from: p */
        protected CookieManager f5917p;

        /* renamed from: q */
        protected C9435a f5918q;

        /* renamed from: r */
        protected C5304b f5919r;

        /* renamed from: s */
        protected C1708g f5920s;

        /* renamed from: t */
        protected C5312n f5921t;

        /* renamed from: u */
        protected boolean f5922u = true;

        /* renamed from: v */
        protected Integer f5923v;

        /* renamed from: w */
        protected Integer f5924w;

        /* renamed from: x */
        protected Integer f5925x;

        /* renamed from: y */
        private C9299d f5926y;

        /* renamed from: z */
        protected C8710l f5927z;

        public C1700a(String str, Context context, C4952a aVar, C5313o oVar) {
            this.f5902a = context;
            this.f5903b = oVar;
            this.f5904c = aVar;
            this.f5905d = str;
            this.f5906e = new C5300m();
            this.f5921t = new C5312n(context);
        }

        /* renamed from: e */
        private void mo7818e() {
            if (this.f5909h != null) {
                return;
            }
            if (this.f5924w != null) {
                C9512b bVar = new C9512b(this.f5902a);
                bVar.mo24578a((long) this.f5924w.intValue());
                this.f5909h = bVar.mo24579a();
                return;
            }
            this.f5909h = ExoPlaybackEngine.f5892Z;
        }

        /* renamed from: f */
        private void m7834f() {
            if (this.f5917p == null) {
                this.f5917p = new CookieManager();
                this.f5917p.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
            }
            CookieHandler cookieHandler = CookieHandler.getDefault();
            CookieManager cookieManager = this.f5917p;
            if (cookieHandler != cookieManager) {
                CookieHandler.setDefault(cookieManager);
            }
            if (this.f5919r != null) {
                CookieHandler cookieHandler2 = CookieHandler.getDefault();
                if (!(cookieHandler2 instanceof CookieManager)) {
                    Timber.m44526b("Trying to set authCookie but CookieHandler.getDefault() is not a CookieManager", new Object[0]);
                    return;
                }
                ((CookieManager) cookieHandler2).getCookieStore();
                this.f5919r.mo17082a();
                throw null;
            }
        }

        /* renamed from: g */
        private void m7835g() {
            m7834f();
            m7836h();
        }

        /* renamed from: h */
        private void m7836h() {
            mo7818e();
            m7837i();
            if (this.f5915n == null) {
                this.f5915n = new C1731c(this.f5902a, this.f5911j);
            }
            if (this.f5914m == null) {
                this.f5914m = new Handler();
            }
            if (this.f5918q == null) {
                this.f5918q = new C9515r(this.f5902a, (TransferListener) this.f5909h, (C9435a) new C9517t(this.f5905d, this.f5909h));
            }
            if (this.f5916o == null) {
                this.f5916o = new C1728a(this.f5906e, new C1726a(null));
            }
            if (this.f5912k == null) {
                this.f5912k = new C1732d(this.f5918q, this.f5914m, this.f5916o, this.f5922u);
            }
            if (this.f5913l == null) {
                this.f5913l = new C9577w(this.f5902a);
            }
            C9320a aVar = new C9320a();
            Integer num = this.f5925x;
            if (num != null) {
                aVar.mo24138a(num.intValue());
            }
            if (this.f5920s == null) {
                C1708g gVar = new C1708g(this.f5902a, this.f5913l, this.f5911j, new C1729b(this.f5906e, aVar.mo24139a()), this.f5909h, this.f5927z, Looper.getMainLooper());
                this.f5920s = gVar;
                this.f5920s.addListener(this.f5915n);
                this.f5920s.mo23003b((C8842n) this.f5915n);
                this.f5920s.mo23004b((C9603r) this.f5915n);
            }
        }

        /* renamed from: i */
        private void m7837i() {
            this.f5910i = new C9291d();
            if (this.f5911j == null) {
                this.f5911j = new C1739a(this.f5910i, mo7551a(), this.f5906e);
            }
            if (this.f5926y == null) {
                C9301e eVar = new C9301e();
                Integer num = this.f5923v;
                if (num != null) {
                    eVar.mo24109b(Math.min(2147483, num.intValue()) * 1000);
                    eVar.mo24111b(true);
                }
                eVar.mo24107a(this.f5921t.mo17092b());
                if (this.f5921t.mo17091a()) {
                    eVar.mo24110b(this.f5921t.mo17094c());
                }
                if (this.f5900C) {
                    eVar.mo24106a(this.f5902a, true);
                }
                Integer num2 = this.f5901D;
                if (num2 != null) {
                    eVar.mo24103a(num2.intValue());
                }
                this.f5911j.mo24084a(eVar.mo24102a());
                this.f5926y = eVar.mo24102a();
            }
            this.f5911j.mo24084a(this.f5926y);
        }

        /* renamed from: a */
        public C1700a mo7549a(C9510p pVar) {
            this.f5909h = pVar;
            return this;
        }

        /* renamed from: b */
        public C1700a mo7552b(int i) {
            this.f5925x = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ExoPlaybackEngine mo7554c() {
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1706e mo7555d() {
            m7835g();
            C1706e eVar = new C1706e(this.f5920s, this.f5909h, this.f5912k, this.f5911j, this.f5918q, this.f5906e, this.f5904c);
            m7832a(eVar);
            return eVar;
        }

        /* renamed from: a */
        public C1700a mo7548a(C8710l lVar) {
            this.f5927z = lVar;
            return this;
        }

        /* renamed from: b */
        public ExoPlaybackEngine mo7553b() {
            this.f5908g = mo7555d();
            C5315p pVar = new C5315p(this.f5902a, this.f5903b, this.f5904c, this.f5908g, this.f5906e, this.f5921t);
            this.f5907f = pVar;
            ExoPlaybackEngine c = mo7554c();
            m7831a(c, this.f5903b);
            return c;
        }

        /* renamed from: a */
        public C1700a mo7550a(boolean z) {
            this.f5922u = z;
            return this;
        }

        /* renamed from: a */
        public C1700a mo7547a(int i) {
            this.f5901D = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7551a() {
            String parameters = ((AudioManager) this.f5902a.getSystemService("audio")).getParameters("hdmi_encodings");
            if (parameters != null) {
                return parameters.contains("atmos");
            }
            return false;
        }

        /* renamed from: a */
        private void m7832a(C1706e eVar) {
            ExoSurfaceView exoSurfaceView = (ExoSurfaceView) this.f5903b.mo16821p();
            if (exoSurfaceView != null) {
                eVar.mo7603a(exoSurfaceView);
                Boolean bool = this.f5899B;
                if (bool != null) {
                    exoSurfaceView.mo7557a(bool.booleanValue());
                    return;
                }
                return;
            }
            Timber.m44532e("ExoSurfaceView is missing from PlayerView. Video will not be displayed.", new Object[0]);
        }

        /* renamed from: a */
        private void m7831a(ExoPlaybackEngine exoPlaybackEngine, C5313o oVar) {
            if (this.f5898A) {
                exoPlaybackEngine.mo7528a(this.f5902a, new C1704c());
            } else if (oVar.mo16826u() != null) {
                Timber.m44528b(new RuntimeException(), "Pip was provided but mediasession was not attached. Please set ExoPlaybackEngine.Builder.includeMediaSession = true", new Object[0]);
            }
        }
    }

    protected ExoPlaybackEngine(C5313o oVar, C4952a aVar, C1706e eVar, C5300m mVar, C5315p pVar, C5312n nVar) {
        PublishSubject.m38553q();
        this.f5895W = oVar;
        this.f5893U = eVar;
        this.f5894V = mVar;
    }

    /* renamed from: a */
    static /* synthetic */ MediaSource m7814a(MediaSource mediaSource) throws Exception {
        return mediaSource;
    }

    /* renamed from: a */
    public void mo7530a(long j, long j2, long j3) {
        C5300m mVar = this.f5894V;
        C5298a aVar = new C5298a(j, j2, j3);
        mVar.mo16993a(aVar);
    }

    /* renamed from: b */
    public C5300m mo7537b() {
        return this.f5894V;
    }

    /* renamed from: d */
    public C5326w mo7539d() {
        return this.f5893U;
    }

    /* renamed from: e */
    public void mo7540e() {
        C5226b bVar = this.f5896X;
        if (bVar != null) {
            bVar.mo16738a();
        }
        this.f5894V.mo17035g();
        this.f5893U.mo7594B();
    }

    /* renamed from: f */
    public C5313o mo7541f() {
        return this.f5895W;
    }

    /* renamed from: g */
    public C5226b mo7542g() {
        if (this.f5896X == null) {
            this.f5896X = new C5226b(this.f5894V, C11934b.m38501c());
        }
        return this.f5896X;
    }

    /* renamed from: h */
    public boolean mo7543h() {
        this.f5894V.mo17015c();
        return true;
    }

    @SuppressLint({"CheckResult"})
    @C0732u(C0716a.ON_DESTROY)
    public void lifecycleDestroy() {
        this.f5894V.mo16957M().mo30192f((Consumer<? super T>) new C1702a<Object>(this));
        this.f5894V.mo17056n();
    }

    @C0732u(C0716a.ON_START)
    public void lifecycleStart() {
        this.f5894V.mo17054m();
    }

    @C0732u(C0716a.ON_STOP)
    public void lifecycleStop() {
        this.f5894V.mo17056n();
    }

    /* renamed from: a */
    public <T extends C5284j> T mo7528a(Context context, T t) {
        t.mo7575a(context, this);
        this.f5897c.add(t);
        return t;
    }

    /* renamed from: b */
    public void mo7538b(long j, long j2, long j3) {
        C5300m mVar = this.f5894V;
        C5298a aVar = new C5298a(j, j2, j3);
        mVar.mo17008b(aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7531a(C5302b bVar) throws Exception {
        mo7540e();
    }

    /* renamed from: a */
    public boolean mo7535a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            return this.f5894V.mo17001a(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            return this.f5894V.mo17013b(keyEvent);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo7536a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f5894V.mo16988a(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo7532a(Single<List<Single<C4831f>>> single) {
        mo7542g().mo16739a(single);
    }

    /* renamed from: a */
    public void mo7529a(float f) {
        C5313o oVar = this.f5895W;
        if (oVar != null) {
            View p = oVar.mo16821p();
            if (p instanceof ExoSurfaceView) {
                ((ExoSurfaceView) p).setActiveAspectRatio(f);
            }
        }
    }

    /* renamed from: a */
    public void mo7533a(String str, boolean z) {
        this.f5893U.mo7606a(str);
        this.f5893U.mo7616c(z);
    }

    /* renamed from: a */
    public void mo7534a(String str, boolean z, boolean z2) {
        if (z2) {
            this.f5893U.mo7614b(true);
            this.f5893U.mo7613b(str);
            this.f5893U.mo7608a(z);
            return;
        }
        this.f5893U.mo7614b(false);
        this.f5893U.mo7613b((String) null);
        this.f5893U.mo7608a(false);
    }
}
