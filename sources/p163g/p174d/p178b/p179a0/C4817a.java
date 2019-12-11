package p163g.p174d.p178b.p179a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.PublishSubject;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000eJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001dJ\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/player/bif/BifBitmapManager;", "", "bifs", "Lcom/bamtech/player/bif/BifEntryList;", "(Lcom/bamtech/player/bif/BifEntryList;)V", "getBifs", "()Lcom/bamtech/player/bif/BifEntryList;", "bitmapQueue", "Ljava/util/Queue;", "Landroid/graphics/Bitmap;", "getBitmapQueue", "()Ljava/util/Queue;", "timestampSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getTimestampSubject", "()Lio/reactivex/subjects/PublishSubject;", "addAll", "", "elements", "", "Lcom/bamtech/player/bif/BifEntry;", "bitmapAtIndex", "index", "", "clear", "loadBitmap", "timestampMs", "onBitmap", "Lio/reactivex/Observable;", "onStart", "onStop", "singleBitmapAtIndex", "Lio/reactivex/Single;", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.a0.a */
/* compiled from: BifBitmapManager.kt */
public final class C4817a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Bitmap f11965d = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Bitmap f11966e = Bitmap.createBitmap(1, 1, Config.ARGB_8888);

    /* renamed from: f */
    public static final C4818a f11967f = new C4818a(null);

    /* renamed from: a */
    private final PublishSubject<Long> f11968a;

    /* renamed from: b */
    private final Queue<Bitmap> f11969b;

    /* renamed from: c */
    private final C4826d f11970c;

    /* renamed from: g.d.b.a0.a$a */
    /* compiled from: BifBitmapManager.kt */
    public static final class C4818a {
        private C4818a() {
        }

        /* renamed from: a */
        public final Bitmap mo16211a() {
            return C4817a.f11966e;
        }

        /* renamed from: b */
        public final Bitmap mo16212b() {
            return C4817a.f11965d;
        }

        public /* synthetic */ C4818a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.d.b.a0.a$b */
    /* compiled from: BifBitmapManager.kt */
    static final class C4819b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C4817a f11971c;

        C4819b(C4817a aVar) {
            this.f11971c = aVar;
        }

        /* renamed from: a */
        public final int mo16213a(Long l) {
            return this.f11971c.mo16207b().mo16228a(l.longValue());
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo16213a((Long) obj));
        }
    }

    /* renamed from: g.d.b.a0.a$c */
    /* compiled from: BifBitmapManager.kt */
    static final class C4820c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C4817a f11972c;

        C4820c(C4817a aVar) {
            this.f11972c = aVar;
        }

        /* renamed from: a */
        public final Observable<Bitmap> apply(Integer num) {
            return this.f11972c.m16758b(num.intValue()).mo30236i();
        }
    }

    /* renamed from: g.d.b.a0.a$d */
    /* compiled from: BifBitmapManager.kt */
    static final class C4821d<V> implements Callable<T> {

        /* renamed from: U */
        final /* synthetic */ int f11973U;

        /* renamed from: c */
        final /* synthetic */ C4817a f11974c;

        C4821d(C4817a aVar, int i) {
            this.f11974c = aVar;
            this.f11973U = i;
        }

        public final Bitmap call() {
            return this.f11974c.mo16203a(this.f11973U);
        }
    }

    /* renamed from: g.d.b.a0.a$e */
    /* compiled from: BifBitmapManager.kt */
    static final /* synthetic */ class C4822e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C4822e f11975c = new C4822e();

        C4822e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo16216a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16216a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.a0.a$f */
    /* compiled from: BifBitmapManager.kt */
    static final class C4823f<T, R> implements Function<Throwable, Bitmap> {

        /* renamed from: c */
        public static final C4823f f11976c = new C4823f();

        C4823f() {
        }

        /* renamed from: a */
        public final Bitmap apply(Throwable th) {
            return C4817a.f11967f.mo16212b();
        }
    }

    public C4817a() {
        this(null, 1, null);
    }

    public C4817a(C4826d dVar) {
        this.f11970c = dVar;
        PublishSubject<Long> q = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create()");
        this.f11968a = q;
        this.f11969b = new LinkedBlockingQueue(10);
    }

    /* renamed from: b */
    public final C4826d mo16207b() {
        return this.f11970c;
    }

    /* renamed from: c */
    public final Observable<Bitmap> mo16208c() {
        Observable<Bitmap> j = this.f11968a.mo30193g(new C4819b(this)).mo30199j(new C4820c(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) j, "timestampSubject\n       …vable()\n                }");
        return j;
    }

    /* renamed from: d */
    public final void mo16209d() {
        this.f11970c.mo16233d();
    }

    /* renamed from: e */
    public final void mo16210e() {
        this.f11970c.mo16231b();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [g.d.b.a0.a$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v0, types: [g.d.b.a0.b] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Single<android.graphics.Bitmap> m16758b(int r3) {
        /*
            r2 = this;
            g.d.b.a0.a$d r0 = new g.d.b.a0.a$d
            r0.<init>(r2, r3)
            io.reactivex.Single r3 = p520io.reactivex.Single.m38401c(r0)
            g.d.b.a0.a$e r0 = p163g.p174d.p178b.p179a0.C4817a.C4822e.f11975c
            if (r0 == 0) goto L_0x0013
            g.d.b.a0.b r1 = new g.d.b.a0.b
            r1.<init>(r0)
            r0 = r1
        L_0x0013:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            io.reactivex.Single r3 = r3.mo30218b(r0)
            g.d.b.a0.a$f r0 = p163g.p174d.p178b.p179a0.C4817a.C4823f.f11976c
            io.reactivex.Single r3 = r3.mo30237i(r0)
            java.lang.String r0 = "Single\n                .…rorReturn { errorBitmap }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p179a0.C4817a.m16758b(int):io.reactivex.Single");
    }

    /* renamed from: a */
    public final Bitmap mo16203a(int i) {
        String str = "emptyBitmap";
        if (i == -1) {
            Bitmap bitmap = f11966e;
            Intrinsics.checkReturnedValueIsNotNull((Object) bitmap, str);
            return bitmap;
        }
        byte[] c = ((C4825c) this.f11970c.mo16232c().get(i)).mo16224c();
        Options options = new Options();
        options.inMutable = true;
        if (this.f11969b.size() >= 4) {
            options.inBitmap = (Bitmap) this.f11969b.poll();
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length, options);
        if (decodeByteArray == null) {
            Bitmap bitmap2 = options.inBitmap;
            if (bitmap2 != null) {
                this.f11969b.offer(bitmap2);
            }
            Bitmap bitmap3 = f11966e;
            Intrinsics.checkReturnedValueIsNotNull((Object) bitmap3, str);
            return bitmap3;
        }
        this.f11969b.offer(decodeByteArray);
        return decodeByteArray;
    }

    public /* synthetic */ C4817a(C4826d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            dVar = new C4826d();
        }
        this(dVar);
    }

    /* renamed from: a */
    public final void mo16205a(long j) {
        this.f11968a.onNext(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo16206a(Collection<C4825c> collection) {
        this.f11970c.mo16230a(collection);
    }

    /* renamed from: a */
    public final void mo16204a() {
        this.f11970c.mo16229a();
    }
}
