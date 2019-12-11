package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;
import com.google.android.exoplayer2.offline.C8808b;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9229o;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.C9257u;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.dash.C9098c.C9099a;
import com.google.android.exoplayer2.source.dash.C9105h.C9106a;
import com.google.android.exoplayer2.source.dash.C9110j.C9112b;
import com.google.android.exoplayer2.source.dash.p376k.C9114a;
import com.google.android.exoplayer2.source.dash.p376k.C9115b;
import com.google.android.exoplayer2.source.dash.p376k.C9116c;
import com.google.android.exoplayer2.source.dash.p376k.C9120f;
import com.google.android.exoplayer2.source.dash.p376k.C9123i;
import com.google.android.exoplayer2.source.dash.p376k.C9135m;
import com.google.android.exoplayer2.source.p378l0.C9207c;
import com.google.android.exoplayer2.upstream.C9442a0;
import com.google.android.exoplayer2.upstream.C9442a0.C9444b;
import com.google.android.exoplayer2.upstream.C9442a0.C9445c;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.C9452b0.C9453a;
import com.google.android.exoplayer2.upstream.C9455c0;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9518u;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DashMediaSource extends C9229o {

    /* renamed from: A0 */
    private long f20281A0;

    /* renamed from: B0 */
    private int f20282B0;

    /* renamed from: C0 */
    private long f20283C0;

    /* renamed from: D0 */
    private int f20284D0;

    /* renamed from: Y */
    private final boolean f20285Y;

    /* renamed from: Z */
    private final C9435a f20286Z;

    /* renamed from: a0 */
    private final C9099a f20287a0;

    /* renamed from: b0 */
    private final C9256t f20288b0;

    /* renamed from: c0 */
    private final C9524z f20289c0;

    /* renamed from: d0 */
    private final long f20290d0;

    /* renamed from: e0 */
    private final boolean f20291e0;

    /* renamed from: f0 */
    private final C9068a f20292f0;

    /* renamed from: g0 */
    private final C9456a<? extends C9115b> f20293g0;

    /* renamed from: h0 */
    private final C9091e f20294h0;

    /* renamed from: i0 */
    private final Object f20295i0;

    /* renamed from: j0 */
    private final SparseArray<C9101e> f20296j0;

    /* renamed from: k0 */
    private final Runnable f20297k0;

    /* renamed from: l0 */
    private final Runnable f20298l0;

    /* renamed from: m0 */
    private final C9112b f20299m0;

    /* renamed from: n0 */
    private final C9452b0 f20300n0;

    /* renamed from: o0 */
    private final Object f20301o0;

    /* renamed from: p0 */
    private DataSource f20302p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C9442a0 f20303q0;

    /* renamed from: r0 */
    private TransferListener f20304r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public IOException f20305s0;

    /* renamed from: t0 */
    private Handler f20306t0;

    /* renamed from: u0 */
    private Uri f20307u0;

    /* renamed from: v0 */
    private Uri f20308v0;

    /* renamed from: w0 */
    private C9115b f20309w0;

    /* renamed from: x0 */
    private boolean f20310x0;

    /* renamed from: y0 */
    private long f20311y0;

    /* renamed from: z0 */
    private long f20312z0;

    public static final class Factory implements C9207c {

        /* renamed from: a */
        private final C9099a f20313a;

        /* renamed from: b */
        private final C9435a f20314b;

        /* renamed from: c */
        private C9456a<? extends C9115b> f20315c;

        /* renamed from: d */
        private List<StreamKey> f20316d;

        /* renamed from: e */
        private C9256t f20317e;

        /* renamed from: f */
        private C9524z f20318f;

        /* renamed from: g */
        private long f20319g;

        /* renamed from: h */
        private boolean f20320h;

        /* renamed from: i */
        private boolean f20321i;

        /* renamed from: j */
        private Object f20322j;

        public Factory(C9435a aVar) {
            this(new C9106a(aVar), aVar);
        }

        public DashMediaSource createMediaSource(Uri uri) {
            this.f20321i = true;
            if (this.f20315c == null) {
                this.f20315c = new C9116c();
            }
            List<StreamKey> list = this.f20316d;
            if (list != null) {
                this.f20315c = new C8808b(this.f20315c, list);
            }
            C9537e.m29296a(uri);
            DashMediaSource dashMediaSource = new DashMediaSource(null, uri, this.f20314b, this.f20315c, this.f20313a, this.f20317e, this.f20318f, this.f20319g, this.f20320h, this.f20322j);
            return dashMediaSource;
        }

        public Factory setStreamKeys(List<StreamKey> list) {
            C9537e.m29301b(!this.f20321i);
            this.f20316d = list;
            return this;
        }

        public Factory(C9099a aVar, C9435a aVar2) {
            C9537e.m29296a(aVar);
            this.f20313a = aVar;
            this.f20314b = aVar2;
            this.f20318f = new C9518u();
            this.f20319g = 30000;
            this.f20317e = new C9257u();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    private static final class C9088b extends Timeline {

        /* renamed from: b */
        private final long f20323b;

        /* renamed from: c */
        private final long f20324c;

        /* renamed from: d */
        private final int f20325d;

        /* renamed from: e */
        private final long f20326e;

        /* renamed from: f */
        private final long f20327f;

        /* renamed from: g */
        private final long f20328g;

        /* renamed from: h */
        private final C9115b f20329h;

        /* renamed from: i */
        private final Object f20330i;

        public C9088b(long j, long j2, int i, long j3, long j4, long j5, C9115b bVar, Object obj) {
            this.f20323b = j;
            this.f20324c = j2;
            this.f20325d = i;
            this.f20326e = j3;
            this.f20327f = j4;
            this.f20328g = j5;
            this.f20329h = bVar;
            this.f20330i = obj;
        }

        /* renamed from: a */
        public int mo22653a() {
            return this.f20329h.mo23674a();
        }

        /* renamed from: b */
        public int mo22667b() {
            return 1;
        }

        /* renamed from: a */
        public C8669b mo22661a(int i, C8669b bVar, boolean z) {
            C9537e.m29295a(i, 0, mo22653a());
            Integer num = null;
            Object obj = z ? this.f20329h.mo23675a(i).f20453a : null;
            if (z) {
                num = Integer.valueOf(this.f20325d + i);
            }
            bVar.mo22676a(obj, num, 0, this.f20329h.mo23677c(i), C8883r.msToUs(this.f20329h.mo23675a(i).f20454b - this.f20329h.mo23675a(0).f20454b) - this.f20326e);
            return bVar;
        }

        /* renamed from: a */
        public C8670c mo22665a(int i, C8670c cVar, boolean z, long j) {
            C9537e.m29295a(i, 0, 1);
            long a = m27108a(j);
            Object obj = z ? this.f20330i : null;
            C9115b bVar = this.f20329h;
            cVar.mo22690a(obj, this.f20323b, this.f20324c, true, bVar.f20426d && bVar.f20427e != -9223372036854775807L && bVar.f20424b == -9223372036854775807L, a, this.f20327f, 0, mo22653a() - 1, this.f20326e);
            return cVar;
        }

        /* renamed from: a */
        public int mo22656a(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int intValue = ((Integer) obj).intValue() - this.f20325d;
            if (intValue < 0 || intValue >= mo22653a()) {
                intValue = -1;
            }
            return intValue;
        }

        /* renamed from: a */
        private long m27108a(long j) {
            long j2 = this.f20328g;
            if (!this.f20329h.f20426d) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f20327f) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f20326e + j2;
            long c = this.f20329h.mo23677c(0);
            long j4 = j3;
            int i = 0;
            while (i < this.f20329h.mo23674a() - 1 && j4 >= c) {
                j4 -= c;
                i++;
                c = this.f20329h.mo23677c(i);
            }
            C9120f a = this.f20329h.mo23675a(i);
            int a2 = a.mo23721a(2);
            if (a2 == -1) {
                return j2;
            }
            C9103f d = ((C9123i) ((C9114a) a.f20455c.get(a2)).f20420c.get(0)).mo23731d();
            if (!(d == null || d.mo23641c(c) == 0)) {
                j2 = (j2 + d.mo23635a(d.mo23639b(j4, c))) - j4;
            }
            return j2;
        }

        /* renamed from: a */
        public Object mo22666a(int i) {
            C9537e.m29295a(i, 0, mo22653a());
            return Integer.valueOf(this.f20325d + i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    private final class C9089c implements C9112b {
        private C9089c() {
        }

        /* renamed from: a */
        public void mo23616a() {
            DashMediaSource.this.mo23613d();
        }

        /* renamed from: a */
        public void mo23617a(long j) {
            DashMediaSource.this.mo23608a(j);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    static final class C9090d implements C9456a<Long> {

        /* renamed from: a */
        private static final Pattern f20332a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        C9090d() {
        }

        /* renamed from: a */
        public Long m27118a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(Utf8Charset.NAME))).readLine();
            try {
                Matcher matcher = f20332a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't parse timestamp: ");
                sb.append(readLine);
                throw new C8723g0(sb.toString());
            } catch (ParseException e) {
                throw new C8723g0((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    private final class C9091e implements C9444b<C9455c0<C9115b>> {
        private C9091e() {
        }

        /* renamed from: a */
        public void mo23559a(C9455c0<C9115b> c0Var, long j, long j2) {
            DashMediaSource.this.mo23610b(c0Var, j, j2);
        }

        /* renamed from: a */
        public void mo23560a(C9455c0<C9115b> c0Var, long j, long j2, boolean z) {
            DashMediaSource.this.mo23609a(c0Var, j, j2);
        }

        /* renamed from: a */
        public C9445c mo23555a(C9455c0<C9115b> c0Var, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo23607a(c0Var, j, j2, iOException, i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    final class C9092f implements C9452b0 {
        C9092f() {
        }

        /* renamed from: b */
        private void m27125b() throws IOException {
            if (DashMediaSource.this.f20305s0 != null) {
                throw DashMediaSource.this.f20305s0;
            }
        }

        /* renamed from: a */
        public void mo23621a() throws IOException {
            DashMediaSource.this.f20303q0.mo23621a();
            m27125b();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    private static final class C9093g {

        /* renamed from: a */
        public final boolean f20335a;

        /* renamed from: b */
        public final long f20336b;

        /* renamed from: c */
        public final long f20337c;

        private C9093g(boolean z, long j, long j2) {
            this.f20335a = z;
            this.f20336b = j;
            this.f20337c = j2;
        }

        /* renamed from: a */
        public static C9093g m27127a(C9120f fVar, long j) {
            boolean z;
            int i;
            boolean z2;
            C9120f fVar2 = fVar;
            long j2 = j;
            int size = fVar2.f20455c.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                int i4 = ((C9114a) fVar2.f20455c.get(i3)).f20419b;
                if (i4 == 1 || i4 == 2) {
                    z = true;
                } else {
                    i3++;
                }
            }
            long j3 = Long.MAX_VALUE;
            int i5 = 0;
            boolean z3 = false;
            boolean z4 = false;
            long j4 = 0;
            while (i5 < size) {
                C9114a aVar = (C9114a) fVar2.f20455c.get(i5);
                if (!z || aVar.f20419b != 3) {
                    C9103f d = ((C9123i) aVar.f20420c.get(i2)).mo23731d();
                    if (d == null) {
                        C9093g gVar = new C9093g(true, 0, j);
                        return gVar;
                    }
                    boolean a = d.mo23637a() | z4;
                    int c = d.mo23641c(j2);
                    if (c == 0) {
                        i = size;
                        z2 = z;
                        z4 = a;
                        z3 = true;
                        j4 = 0;
                        j3 = 0;
                    } else {
                        if (!z3) {
                            z2 = z;
                            long b = d.mo23638b();
                            i = size;
                            long max = Math.max(j4, d.mo23635a(b));
                            if (c != -1) {
                                long j5 = (b + ((long) c)) - 1;
                                j4 = max;
                                j3 = Math.min(j3, d.mo23635a(j5) + d.mo23636a(j5, j2));
                            } else {
                                j4 = max;
                            }
                        } else {
                            i = size;
                            z2 = z;
                        }
                        z4 = a;
                    }
                } else {
                    i = size;
                    z2 = z;
                }
                i5++;
                i2 = 0;
                fVar2 = fVar;
                z = z2;
                size = i;
            }
            C9093g gVar2 = new C9093g(z4, j4, j3);
            return gVar2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    private final class C9094h implements C9444b<C9455c0<Long>> {
        private C9094h() {
        }

        /* renamed from: a */
        public void mo23559a(C9455c0<Long> c0Var, long j, long j2) {
            DashMediaSource.this.mo23612c(c0Var, j, j2);
        }

        /* renamed from: a */
        public void mo23560a(C9455c0<Long> c0Var, long j, long j2, boolean z) {
            DashMediaSource.this.mo23609a(c0Var, j, j2);
        }

        /* renamed from: a */
        public C9445c mo23555a(C9455c0<Long> c0Var, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo23606a(c0Var, j, j2, iOException);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$i */
    private static final class C9095i implements C9456a<Long> {
        private C9095i() {
        }

        /* renamed from: a */
        public Long m27135a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.m29454h(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C8672a0.m24990a("goog.exo.dash");
    }

    /* renamed from: e */
    private long m27092e() {
        return (long) Math.min((this.f20282B0 - 1) * 1000, 5000);
    }

    /* renamed from: f */
    private long m27093f() {
        if (this.f20281A0 != 0) {
            return C8883r.msToUs(SystemClock.elapsedRealtime() + this.f20281A0);
        }
        return C8883r.msToUs(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m27094g() {
        Uri uri;
        this.f20306t0.removeCallbacks(this.f20297k0);
        if (!this.f20303q0.mo24460d()) {
            if (this.f20303q0.mo24461e()) {
                this.f20310x0 = true;
                return;
            }
            synchronized (this.f20295i0) {
                uri = this.f20308v0;
            }
            this.f20310x0 = false;
            m27084a(new C9455c0<>(this.f20302p0, uri, 4, this.f20293g0), (C9444b<C9455c0<T>>) this.f20294h0, this.f20289c0.getMinimumLoadableRetryCount(4));
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo23611c() {
        m27086a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo23613d() {
        this.f20306t0.removeCallbacks(this.f20298l0);
        m27094g();
    }

    private DashMediaSource(C9115b bVar, Uri uri, C9435a aVar, C9456a<? extends C9115b> aVar2, C9099a aVar3, C9256t tVar, C9524z zVar, long j, boolean z, Object obj) {
        this.f20307u0 = uri;
        this.f20309w0 = bVar;
        this.f20308v0 = uri;
        this.f20286Z = aVar;
        this.f20293g0 = aVar2;
        this.f20287a0 = aVar3;
        this.f20289c0 = zVar;
        this.f20290d0 = j;
        this.f20291e0 = z;
        this.f20288b0 = tVar;
        this.f20301o0 = obj;
        this.f20285Y = bVar != null;
        this.f20292f0 = mo23959a((MediaPeriodId) null);
        this.f20295i0 = new Object();
        this.f20296j0 = new SparseArray<>();
        this.f20299m0 = new C9089c();
        this.f20283C0 = -9223372036854775807L;
        if (this.f20285Y) {
            C9537e.m29301b(!bVar.f20426d);
            this.f20294h0 = null;
            this.f20297k0 = null;
            this.f20298l0 = null;
            this.f20300n0 = new C9453a();
            return;
        }
        this.f20294h0 = new C9091e();
        this.f20300n0 = new C9092f();
        this.f20297k0 = new C9096a(this);
        this.f20298l0 = new C9097b(this);
    }

    /* renamed from: a */
    public void mo23580a(TransferListener transferListener) {
        this.f20304r0 = transferListener;
        if (this.f20285Y) {
            m27086a(false);
            return;
        }
        this.f20302p0 = this.f20286Z.mo24448a();
        this.f20303q0 = new C9442a0("Loader:DashMediaSource");
        this.f20306t0 = new Handler();
        m27094g();
    }

    /* renamed from: b */
    public void mo23581b() {
        this.f20310x0 = false;
        this.f20302p0 = null;
        C9442a0 a0Var = this.f20303q0;
        if (a0Var != null) {
            a0Var.mo24462f();
            this.f20303q0 = null;
        }
        this.f20311y0 = 0;
        this.f20312z0 = 0;
        this.f20309w0 = this.f20285Y ? this.f20309w0 : null;
        this.f20308v0 = this.f20307u0;
        this.f20305s0 = null;
        Handler handler = this.f20306t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f20306t0 = null;
        }
        this.f20281A0 = 0;
        this.f20282B0 = 0;
        this.f20283C0 = -9223372036854775807L;
        this.f20284D0 = 0;
        this.f20296j0.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23612c(C9455c0<Long> c0Var, long j, long j2) {
        C9455c0<Long> c0Var2 = c0Var;
        this.f20292f0.mo23524b(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b());
        m27088b(((Long) c0Var.mo24473d()).longValue() - j);
    }

    /* renamed from: c */
    private void m27090c(long j) {
        this.f20306t0.postDelayed(this.f20297k0, j);
    }

    /* renamed from: a */
    public void mo23487a() throws IOException {
        this.f20300n0.mo23621a();
    }

    /* renamed from: a */
    public C9072a0 mo23486a(MediaPeriodId mediaPeriodId, C9491f fVar, long j) {
        MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        int intValue = ((Integer) mediaPeriodId2.f20147a).intValue() - this.f20284D0;
        C9068a a = mo23960a(mediaPeriodId2, this.f20309w0.mo23675a(intValue).f20454b);
        C9101e eVar = new C9101e(this.f20284D0 + intValue, this.f20309w0, intValue, this.f20287a0, this.f20304r0, this.f20289c0, a, this.f20281A0, this.f20300n0, fVar, this.f20288b0, this.f20299m0);
        this.f20296j0.put(eVar.f20350c, eVar);
        return eVar;
    }

    /* renamed from: a */
    public void mo23492a(C9072a0 a0Var) {
        C9101e eVar = (C9101e) a0Var;
        eVar.mo23633b();
        this.f20296j0.remove(eVar.f20350c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23608a(long j) {
        long j2 = this.f20283C0;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f20283C0 = j;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9445c mo23607a(C9455c0<C9115b> c0Var, long j, long j2, IOException iOException, int i) {
        C9445c cVar;
        C9455c0<C9115b> c0Var2 = c0Var;
        long retryDelayMsFor = this.f20289c0.getRetryDelayMsFor(4, j2, iOException, i);
        if (retryDelayMsFor == -9223372036854775807L) {
            cVar = C9442a0.f21955e;
        } else {
            cVar = C9442a0.m28955a(false, retryDelayMsFor);
        }
        this.f20292f0.mo23517a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b(), iOException, !cVar.mo24463a());
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23610b(com.google.android.exoplayer2.upstream.C9455c0<com.google.android.exoplayer2.source.dash.p376k.C9115b> r18, long r19, long r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r13 = r19
            com.google.android.exoplayer2.source.MediaSourceEventListener$a r2 = r1.f20292f0
            com.google.android.exoplayer2.upstream.DataSpec r3 = r0.f21975a
            android.net.Uri r4 = r18.mo24474e()
            java.util.Map r5 = r18.mo24472c()
            int r6 = r0.f21976b
            long r11 = r18.mo24471b()
            r7 = r19
            r9 = r21
            r2.mo23524b(r3, r4, r5, r6, r7, r9, r11)
            java.lang.Object r2 = r18.mo24473d()
            com.google.android.exoplayer2.source.dash.k.b r2 = (com.google.android.exoplayer2.source.dash.p376k.C9115b) r2
            com.google.android.exoplayer2.source.dash.k.b r3 = r1.f20309w0
            r4 = 0
            if (r3 != 0) goto L_0x002c
            r3 = 0
            goto L_0x0030
        L_0x002c:
            int r3 = r3.mo23674a()
        L_0x0030:
            com.google.android.exoplayer2.source.dash.k.f r5 = r2.mo23675a(r4)
            long r5 = r5.f20454b
            r7 = 0
        L_0x0037:
            if (r7 >= r3) goto L_0x0048
            com.google.android.exoplayer2.source.dash.k.b r8 = r1.f20309w0
            com.google.android.exoplayer2.source.dash.k.f r8 = r8.mo23675a(r7)
            long r8 = r8.f20454b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0048
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0048:
            boolean r5 = r2.f20426d
            r6 = 1
            if (r5 == 0) goto L_0x00bb
            int r5 = r3 - r7
            int r8 = r2.mo23674a()
            if (r5 <= r8) goto L_0x005e
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            com.google.android.exoplayer2.p393v0.Log.m29500d(r5, r8)
        L_0x005c:
            r5 = 1
            goto L_0x0097
        L_0x005e:
            long r8 = r1.f20283C0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0096
            long r10 = r2.f20430h
            r15 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r15
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0096
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Loaded stale dynamic manifest: "
            r5.append(r8)
            long r8 = r2.f20430h
            r5.append(r8)
            java.lang.String r8 = ", "
            r5.append(r8)
            long r8 = r1.f20283C0
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "DashMediaSource"
            com.google.android.exoplayer2.p393v0.Log.m29500d(r8, r5)
            goto L_0x005c
        L_0x0096:
            r5 = 0
        L_0x0097:
            if (r5 == 0) goto L_0x00b9
            int r2 = r1.f20282B0
            int r3 = r2 + 1
            r1.f20282B0 = r3
            com.google.android.exoplayer2.upstream.z r3 = r1.f20289c0
            int r0 = r0.f21976b
            int r0 = r3.getMinimumLoadableRetryCount(r0)
            if (r2 >= r0) goto L_0x00b1
            long r2 = r17.m27092e()
            r1.m27090c(r2)
            goto L_0x00b8
        L_0x00b1:
            com.google.android.exoplayer2.source.dash.d r0 = new com.google.android.exoplayer2.source.dash.d
            r0.<init>()
            r1.f20305s0 = r0
        L_0x00b8:
            return
        L_0x00b9:
            r1.f20282B0 = r4
        L_0x00bb:
            r1.f20309w0 = r2
            boolean r2 = r1.f20310x0
            com.google.android.exoplayer2.source.dash.k.b r5 = r1.f20309w0
            boolean r8 = r5.f20426d
            r2 = r2 & r8
            r1.f20310x0 = r2
            long r8 = r13 - r21
            r1.f20311y0 = r8
            r1.f20312z0 = r13
            android.net.Uri r2 = r5.f20432j
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r1.f20295i0
            monitor-enter(r2)
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.f21975a     // Catch:{ all -> 0x00e6 }
            android.net.Uri r0 = r0.f21938a     // Catch:{ all -> 0x00e6 }
            android.net.Uri r5 = r1.f20308v0     // Catch:{ all -> 0x00e6 }
            if (r0 != r5) goto L_0x00dc
            r4 = 1
        L_0x00dc:
            if (r4 == 0) goto L_0x00e4
            com.google.android.exoplayer2.source.dash.k.b r0 = r1.f20309w0     // Catch:{ all -> 0x00e6 }
            android.net.Uri r0 = r0.f20432j     // Catch:{ all -> 0x00e6 }
            r1.f20308v0 = r0     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            throw r0
        L_0x00e9:
            if (r3 != 0) goto L_0x00fd
            com.google.android.exoplayer2.source.dash.k.b r0 = r1.f20309w0
            boolean r2 = r0.f20426d
            if (r2 == 0) goto L_0x00f9
            com.google.android.exoplayer2.source.dash.k.m r0 = r0.f20431i
            if (r0 == 0) goto L_0x00f9
            r1.m27082a(r0)
            goto L_0x0105
        L_0x00f9:
            r1.m27086a(r6)
            goto L_0x0105
        L_0x00fd:
            int r0 = r1.f20284D0
            int r0 = r0 + r7
            r1.f20284D0 = r0
            r1.m27086a(r6)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.mo23610b(com.google.android.exoplayer2.upstream.c0, long, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9445c mo23606a(C9455c0<Long> c0Var, long j, long j2, IOException iOException) {
        C9455c0<Long> c0Var2 = c0Var;
        C9068a aVar = this.f20292f0;
        DataSpec dataSpec = c0Var2.f21975a;
        Uri e = c0Var.mo24474e();
        Map c = c0Var.mo24472c();
        int i = c0Var2.f21976b;
        aVar.mo23517a(dataSpec, e, c, i, j, j2, c0Var.mo24471b(), iOException, true);
        m27085a(iOException);
        return C9442a0.f21954d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23609a(C9455c0<?> c0Var, long j, long j2) {
        C9455c0<?> c0Var2 = c0Var;
        this.f20292f0.mo23516a(c0Var2.f21975a, c0Var.mo24474e(), c0Var.mo24472c(), c0Var2.f21976b, j, j2, c0Var.mo24471b());
    }

    /* renamed from: a */
    private void m27082a(C9135m mVar) {
        String str = mVar.f20494a;
        if (Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
            m27089b(mVar);
        } else if (Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
            m27083a(mVar, new C9090d());
        } else if (Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || Util.m29414a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m27083a(mVar, new C9095i());
        } else {
            m27085a(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: a */
    private void m27083a(C9135m mVar, C9456a<Long> aVar) {
        m27084a(new C9455c0<>(this.f20302p0, Uri.parse(mVar.f20495b), 5, aVar), (C9444b<C9455c0<T>>) new C9094h<C9455c0<T>>(), 1);
    }

    /* renamed from: a */
    private void m27085a(IOException iOException) {
        Log.m29496a("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        m27086a(true);
    }

    /* renamed from: b */
    private void m27089b(C9135m mVar) {
        try {
            m27088b(Util.m29454h(mVar.f20495b) - this.f20312z0);
        } catch (C8723g0 e) {
            m27085a((IOException) e);
        }
    }

    /* renamed from: a */
    private void m27086a(boolean z) {
        long j;
        boolean z2;
        long j2;
        long j3;
        for (int i = 0; i < this.f20296j0.size(); i++) {
            int keyAt = this.f20296j0.keyAt(i);
            if (keyAt >= this.f20284D0) {
                ((C9101e) this.f20296j0.valueAt(i)).mo23630a(this.f20309w0, keyAt - this.f20284D0);
            }
        }
        int a = this.f20309w0.mo23674a() - 1;
        C9093g a2 = C9093g.m27127a(this.f20309w0.mo23675a(0), this.f20309w0.mo23677c(0));
        C9093g a3 = C9093g.m27127a(this.f20309w0.mo23675a(a), this.f20309w0.mo23677c(a));
        long j4 = a2.f20336b;
        long j5 = a3.f20337c;
        if (!this.f20309w0.f20426d || a3.f20335a) {
            j = j4;
            z2 = false;
        } else {
            j5 = Math.min((m27093f() - C8883r.msToUs(this.f20309w0.f20423a)) - C8883r.msToUs(this.f20309w0.mo23675a(a).f20454b), j5);
            long j6 = this.f20309w0.f20428f;
            if (j6 != -9223372036854775807L) {
                long a4 = j5 - C8883r.msToUs(j6);
                while (a4 < 0 && a > 0) {
                    a--;
                    a4 += this.f20309w0.mo23677c(a);
                }
                if (a == 0) {
                    j3 = Math.max(j4, a4);
                } else {
                    j3 = this.f20309w0.mo23677c(0);
                }
                j4 = j3;
            }
            j = j4;
            z2 = true;
        }
        long j7 = j5 - j;
        for (int i2 = 0; i2 < this.f20309w0.mo23674a() - 1; i2++) {
            j7 += this.f20309w0.mo23677c(i2);
        }
        C9115b bVar = this.f20309w0;
        if (bVar.f20426d) {
            long j8 = this.f20290d0;
            if (!this.f20291e0) {
                long j9 = bVar.f20429g;
                if (j9 != -9223372036854775807L) {
                    j8 = j9;
                }
            }
            long a5 = j7 - C8883r.msToUs(j8);
            if (a5 < 5000000) {
                a5 = Math.min(5000000, j7 / 2);
            }
            j2 = a5;
        } else {
            j2 = 0;
        }
        C9115b bVar2 = this.f20309w0;
        long b = bVar2.f20423a + bVar2.mo23675a(0).f20454b + C8883r.usToMs(j);
        C9115b bVar3 = this.f20309w0;
        C9088b bVar4 = new C9088b(bVar3.f20423a, b, this.f20284D0, j, j7, j2, bVar3, this.f20301o0);
        mo23961a((Timeline) bVar4, (Object) this.f20309w0);
        if (!this.f20285Y) {
            this.f20306t0.removeCallbacks(this.f20298l0);
            if (z2) {
                this.f20306t0.postDelayed(this.f20298l0, 5000);
            }
            if (this.f20310x0) {
                m27094g();
            } else if (z) {
                C9115b bVar5 = this.f20309w0;
                if (bVar5.f20426d) {
                    long j10 = bVar5.f20427e;
                    if (j10 != -9223372036854775807L) {
                        if (j10 == 0) {
                            j10 = 5000;
                        }
                        m27090c(Math.max(0, (this.f20311y0 + j10) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m27088b(long j) {
        this.f20281A0 = j;
        m27086a(true);
    }

    /* renamed from: a */
    private <T> void m27084a(C9455c0<T> c0Var, C9444b<C9455c0<T>> bVar, int i) {
        this.f20292f0.mo23513a(c0Var.f21975a, c0Var.f21976b, this.f20303q0.mo24455a(c0Var, bVar, i));
    }
}
