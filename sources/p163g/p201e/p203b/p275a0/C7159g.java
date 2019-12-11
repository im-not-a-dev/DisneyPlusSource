package p163g.p201e.p203b.p275a0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p163g.p201e.p203b.p275a0.C7146a.C7147a;
import p163g.p413f.p414a.C10670o;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018J+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH'J-\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&J5\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&J5\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&J+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH'J+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH'J+\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "", "download", "Lio/reactivex/Completable;", "masterId", "", "parametersBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader$Parameters;", "", "Lkotlin/ExtensionFunctionType;", "getCachedUri", "Landroid/net/Uri;", "loadImage", "imageView", "Landroid/widget/ImageView;", "notificationTarget", "Lcom/bumptech/glide/request/target/NotificationTarget;", "prefetch", "removeDownload", "submit", "Landroid/graphics/drawable/Drawable;", "BlurFilter", "Format", "Parameters", "ripcutApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.g */
/* compiled from: RipcutImageLoader.kt */
public interface C7159g {

    /* renamed from: g.e.b.a0.g$a */
    /* compiled from: RipcutImageLoader.kt */
    public enum C7160a {
        GAUSSIAN("gaussianfilter");
        

        /* renamed from: c */
        private final String f15815c;

        private C7160a(String str) {
            this.f15815c = str;
        }

        /* renamed from: a */
        public final String mo19980a() {
            return this.f15815c;
        }
    }

    /* renamed from: g.e.b.a0.g$b */
    /* compiled from: RipcutImageLoader.kt */
    public enum C7161b {
        PNG("png"),
        JPEG("jpeg"),
        SOURCE("");
        

        /* renamed from: c */
        private final String f15820c;

        private C7161b(String str) {
            this.f15820c = str;
        }

        /* renamed from: a */
        public final String mo19981a() {
            return this.f15820c;
        }
    }

    /* renamed from: g.e.b.a0.g$c */
    /* compiled from: RipcutImageLoader.kt */
    public static final class C7162c {

        /* renamed from: a */
        private Integer f15821a;

        /* renamed from: b */
        private Integer f15822b;

        /* renamed from: c */
        private Integer f15823c;

        /* renamed from: d */
        private Integer f15824d;

        /* renamed from: e */
        private C7160a f15825e;

        /* renamed from: f */
        private Integer f15826f;

        /* renamed from: g */
        private C7161b f15827g = C7161b.SOURCE;

        /* renamed from: h */
        private C7146a f15828h = C7147a.f15798c;

        /* renamed from: i */
        private C10731h f15829i;

        /* renamed from: j */
        private C10670o<?, ? super Drawable> f15830j;

        /* renamed from: k */
        private C10730g<Drawable> f15831k;

        /* renamed from: l */
        private Integer f15832l;

        /* renamed from: m */
        private Drawable f15833m;

        /* renamed from: n */
        private Integer f15834n;

        /* renamed from: o */
        private Drawable f15835o;

        /* renamed from: a */
        public final C7160a mo19982a() {
            return this.f15825e;
        }

        /* renamed from: b */
        public final Integer mo19989b() {
            return this.f15826f;
        }

        /* renamed from: c */
        public final void mo19992c(Integer num) {
            this.f15832l = num;
        }

        /* renamed from: d */
        public final void mo19994d(Integer num) {
            this.f15823c = num;
        }

        /* renamed from: e */
        public final void mo19996e(Integer num) {
            this.f15821a = num;
        }

        /* renamed from: f */
        public final void mo19998f(Integer num) {
            this.f15822b = num;
        }

        /* renamed from: g */
        public final C10731h mo19999g() {
            return this.f15829i;
        }

        /* renamed from: h */
        public final C10670o<?, ? super Drawable> mo20000h() {
            return this.f15830j;
        }

        /* renamed from: i */
        public final Drawable mo20001i() {
            return this.f15833m;
        }

        /* renamed from: j */
        public final Integer mo20002j() {
            return this.f15832l;
        }

        /* renamed from: k */
        public final Integer mo20003k() {
            return this.f15823c;
        }

        /* renamed from: l */
        public final Integer mo20004l() {
            return this.f15824d;
        }

        /* renamed from: m */
        public final C10730g<Drawable> mo20005m() {
            return this.f15831k;
        }

        /* renamed from: n */
        public final Integer mo20006n() {
            return this.f15821a;
        }

        /* renamed from: o */
        public final Integer mo20007o() {
            return this.f15822b;
        }

        /* renamed from: a */
        public final void mo19985a(C7160a aVar) {
            this.f15825e = aVar;
        }

        /* renamed from: b */
        public final void mo19990b(Integer num) {
            this.f15834n = num;
        }

        /* renamed from: c */
        public final Drawable mo19991c() {
            return this.f15835o;
        }

        /* renamed from: d */
        public final Integer mo19993d() {
            return this.f15834n;
        }

        /* renamed from: e */
        public final C7161b mo19995e() {
            return this.f15827g;
        }

        /* renamed from: f */
        public final C7146a mo19997f() {
            return this.f15828h;
        }

        /* renamed from: a */
        public final void mo19988a(Integer num) {
            this.f15826f = num;
        }

        /* renamed from: a */
        public final void mo19986a(C7161b bVar) {
            this.f15827g = bVar;
        }

        /* renamed from: a */
        public final void mo19984a(C7146a aVar) {
            this.f15828h = aVar;
        }

        /* renamed from: a */
        public final void mo19987a(C10731h hVar) {
            this.f15829i = hVar;
        }

        /* renamed from: a */
        public final void mo19983a(Drawable drawable) {
            this.f15835o = drawable;
        }
    }

    /* renamed from: a */
    Drawable mo19956a(String str, Function1<? super C7162c, C13145v> function1);

    /* renamed from: a */
    void mo19957a(ImageView imageView, String str, Function1<? super C7162c, C13145v> function1);

    /* renamed from: b */
    Completable mo19958b(String str, Function1<? super C7162c, C13145v> function1);

    /* renamed from: c */
    Completable mo19959c(String str, Function1<? super C7162c, C13145v> function1);

    /* renamed from: d */
    Uri mo19960d(String str, Function1<? super C7162c, C13145v> function1);
}
