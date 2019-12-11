package com.bamtechmedia.dominguez.playback.common.contentrating;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0513i;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.assets.Rating;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.playback.C6325d;
import com.bamtechmedia.dominguez.playback.C6326e;
import com.bamtechmedia.dominguez.playback.C6330i;
import com.bamtechmedia.dominguez.playback.C6331j;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6493a;
import java.util.List;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.p590y.C13180m;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.C11969r;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0002;<B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J \u0010\u0016\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J \u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020\u000fJ&\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u000204H\u0016J\"\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u00152\u0006\u00107\u001a\u000208H\u0002J\u0015\u00109\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b:R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingPresenter;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "resources", "Landroid/content/res/Resources;", "ratingFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "ratingsDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "stringDictionary", "mainScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/res/Resources;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lio/reactivex/Scheduler;)V", "ratingDisposable", "Lio/reactivex/disposables/Disposable;", "addAdvisories", "", "rating", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "elements", "Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingPresenter$ContentRatingElements;", "graphicContent", "", "addDisclaimers", "disclaimerIds", "", "disclaimerContainer", "Landroid/widget/LinearLayout;", "addRating", "ratingIdText", "Landroid/widget/TextView;", "applyPaddingAndBorder", "textView", "createDisclaimerTextView", "parent", "Landroid/view/View;", "text", "index", "", "dismissContentRatingTimer", "displayContentRatingOverlay", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "secondDuration", "contentRatingListeners", "Lcom/bamtechmedia/dominguez/playback/common/listeners/ContentRatingListeners;", "getRatingAdvisory", "getRatingString", "hideContentRatingOverlay", "contentRatingParent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setupRatingLine", "view", "hasPredecessor", "", "showContentRatingOverlay", "showContentRatingOverlay$playback_release", "Companion", "ContentRatingElements", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentRatingPresenter.kt */
public final class ContentRatingPresenter implements C0710d {

    /* renamed from: U */
    private final Resources f14339U;

    /* renamed from: V */
    private final C3716q f14340V;

    /* renamed from: W */
    private final C3572r0 f14341W;

    /* renamed from: X */
    private final C3572r0 f14342X;

    /* renamed from: Y */
    private final C11969r f14343Y;

    /* renamed from: c */
    private Disposable f14344c;

    /* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$a */
    /* compiled from: ContentRatingPresenter.kt */
    public static final class C6279a {
        private C6279a() {
        }

        public /* synthetic */ C6279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$b */
    /* compiled from: ContentRatingPresenter.kt */
    public static final class C6280b {

        /* renamed from: a */
        private final TextView f14345a;

        /* renamed from: b */
        private final TextView f14346b;

        /* renamed from: c */
        private final LinearLayout f14347c;

        /* renamed from: d */
        private final ConstraintLayout f14348d;

        public C6280b(TextView textView, TextView textView2, LinearLayout linearLayout, ConstraintLayout constraintLayout) {
            this.f14345a = textView;
            this.f14346b = textView2;
            this.f14347c = linearLayout;
            this.f14348d = constraintLayout;
        }

        /* renamed from: a */
        public final ConstraintLayout mo18882a() {
            return this.f14348d;
        }

        /* renamed from: b */
        public final LinearLayout mo18883b() {
            return this.f14347c;
        }

        /* renamed from: c */
        public final TextView mo18884c() {
            return this.f14346b;
        }

        /* renamed from: d */
        public final TextView mo18885d() {
            return this.f14345a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14348d, (java.lang.Object) r3.f14348d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6280b
                if (r0 == 0) goto L_0x0031
                com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$b r3 = (com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6280b) r3
                android.widget.TextView r0 = r2.f14345a
                android.widget.TextView r1 = r3.f14345a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                android.widget.TextView r0 = r2.f14346b
                android.widget.TextView r1 = r3.f14346b
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                android.widget.LinearLayout r0 = r2.f14347c
                android.widget.LinearLayout r1 = r3.f14347c
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f14348d
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.f14348d
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6280b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            TextView textView = this.f14345a;
            int i = 0;
            int hashCode = (textView != null ? textView.hashCode() : 0) * 31;
            TextView textView2 = this.f14346b;
            int hashCode2 = (hashCode + (textView2 != null ? textView2.hashCode() : 0)) * 31;
            LinearLayout linearLayout = this.f14347c;
            int hashCode3 = (hashCode2 + (linearLayout != null ? linearLayout.hashCode() : 0)) * 31;
            ConstraintLayout constraintLayout = this.f14348d;
            if (constraintLayout != null) {
                i = constraintLayout.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContentRatingElements(ratingId=");
            sb.append(this.f14345a);
            sb.append(", ratingAdvisory=");
            sb.append(this.f14346b);
            sb.append(", disclaimerContainer=");
            sb.append(this.f14347c);
            sb.append(", contentRatingParent=");
            sb.append(this.f14348d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$c */
    /* compiled from: ContentRatingPresenter.kt */
    static final class C6281c<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C6493a f14349c;

        C6281c(C6493a aVar) {
            this.f14349c = aVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f14349c.mo19150c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$d */
    /* compiled from: ContentRatingPresenter.kt */
    static final /* synthetic */ class C6282d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6282d f14350c = new C6282d();

        C6282d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18890a(Throwable th) {
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
            mo18890a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$e */
    /* compiled from: ContentRatingPresenter.kt */
    static final class C6283e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ ConstraintLayout f14351c;

        C6283e(ConstraintLayout constraintLayout) {
            this.f14351c = constraintLayout;
            super(0);
        }

        public final void invoke() {
            this.f14351c.setVisibility(8);
        }
    }

    static {
        new C6279a(null);
    }

    public ContentRatingPresenter(Resources resources, C3716q qVar, C3572r0 r0Var, C3572r0 r0Var2, C11969r rVar) {
        this.f14339U = resources;
        this.f14340V = qVar;
        this.f14341W = r0Var;
        this.f14342X = r0Var2;
        this.f14343Y = rVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.bamtechmedia.dominguez.playback.common.contentrating.c] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18879a(com.bamtechmedia.dominguez.core.content.C3693o r8, com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6280b r9, int r10, com.bamtechmedia.dominguez.playback.p237m.p251p.C6493a r11) {
        /*
            r7 = this;
            com.bamtechmedia.dominguez.core.content.assets.Rating r0 = r8.mo13265g()
            if (r0 == 0) goto L_0x0094
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.mo18882a()
            r7.mo18881b(r1)
            android.widget.TextView r1 = r9.mo18885d()
            r7.m19807a(r0, r1)
            java.util.List r8 = r8.mo13280v()
            java.lang.String r1 = "graphic_content_disclaimer"
            r2 = 0
            if (r8 == 0) goto L_0x003f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r8.iterator()
        L_0x0026:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x0026
            r3.add(r5)
            goto L_0x0026
        L_0x003f:
            r3 = r2
        L_0x0040:
            if (r8 == 0) goto L_0x005c
            java.util.Iterator r8 = r8.iterator()
        L_0x0046:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r8.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r5 == 0) goto L_0x0046
            r2 = r4
        L_0x005a:
            java.lang.String r2 = (java.lang.String) r2
        L_0x005c:
            r7.m19808a(r0, r9, r2)
            android.widget.LinearLayout r8 = r9.mo18883b()
            r7.m19809a(r3, r8)
            io.reactivex.disposables.Disposable r8 = r7.f14344c
            if (r8 == 0) goto L_0x006d
            r8.dispose()
        L_0x006d:
            long r8 = (long) r10
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r8 = p520io.reactivex.Observable.m38310c(r8, r10)
            io.reactivex.r r9 = r7.f14343Y
            io.reactivex.Observable r8 = r8.mo30151a(r9)
            com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$c r9 = new com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$c
            r9.<init>(r11)
            com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$d r10 = com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6282d.f14350c
            if (r10 == 0) goto L_0x0089
            com.bamtechmedia.dominguez.playback.common.contentrating.c r0 = new com.bamtechmedia.dominguez.playback.common.contentrating.c
            r0.<init>(r10)
            r10 = r0
        L_0x0089:
            io.reactivex.functions.Consumer r10 = (p520io.reactivex.functions.Consumer) r10
            io.reactivex.disposables.Disposable r8 = r8.mo30157a(r9, r10)
            r7.f14344c = r8
            r11.mo19149b()
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.mo18879a(com.bamtechmedia.dominguez.core.content.o, com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter$b, int, com.bamtechmedia.dominguez.playback.m.p.a):void");
    }

    /* renamed from: b */
    public final void mo18881b(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        ConstraintLayout constraintLayout3 = constraintLayout;
        constraintLayout2.setAlpha(0.0f);
        constraintLayout2.setVisibility(0);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = r1;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = new AccelerateDecelerateInterpolator();
        C3800a.m12829a(constraintLayout3, 0.0f, 1.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, accelerateDecelerateInterpolator, null, null, null, 241660, null);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        Disposable disposable = this.f14344c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: b */
    public final void mo18880b() {
        Disposable disposable = this.f14344c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    private final void m19807a(Rating rating, TextView textView) {
        m19806a(textView, m19803a(rating), false);
        m19805a(textView);
    }

    /* renamed from: a */
    private final void m19808a(Rating rating, C6280b bVar, String str) {
        boolean z = false;
        if (!rating.mo13186X().isEmpty()) {
            TextView c = bVar.mo18884c();
            String a = m19804a(rating, str);
            CharSequence text = bVar.mo18885d().getText();
            if (text == null || text.length() == 0) {
                z = true;
            }
            m19806a(c, a, !z);
            m19805a(bVar.mo18884c());
        } else if (rating.getDescription() != null) {
            TextView c2 = bVar.mo18884c();
            String description = rating.getDescription();
            CharSequence text2 = bVar.mo18885d().getText();
            if (text2 == null || text2.length() == 0) {
                z = true;
            }
            m19806a(c2, description, !z);
            m19805a(bVar.mo18884c());
        }
    }

    /* renamed from: a */
    private final void m19809a(List<String> list, LinearLayout linearLayout) {
        int i = 0;
        if (!(list == null || list.isEmpty()) && linearLayout.getChildCount() == 0) {
            for (Object next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    TextView a = m19802a((View) linearLayout, C3573a.m12037b(this.f14341W, (String) next, null, 2, null), i);
                    m19805a(a);
                    linearLayout.addView(a);
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m19805a(TextView textView) {
        textView.setPadding(this.f14339U.getDimensionPixelOffset(C6325d.content_rating_left_padding), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setBackgroundResource(C6326e.content_rating_border);
    }

    /* renamed from: a */
    private final TextView m19802a(View view, String str, int i) {
        int i2;
        TextView textView = new TextView(view.getContext());
        C0513i.m2778d(textView, C6331j.Disney_TextAppearance_BodyCopy);
        textView.setText(str);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f14339U.getDimensionPixelOffset(C6325d.padding_medium);
        }
        layoutParams.setMargins(0, i2, 0, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: a */
    private final String m19803a(Rating rating) {
        StringBuilder sb = new StringBuilder();
        sb.append(C3573a.m12035a(this.f14342X, C6330i.rated, (Map) null, 2, (Object) null));
        sb.append(' ');
        sb.append(this.f14340V.mo13549b(rating));
        return sb.toString();
    }

    /* renamed from: a */
    private final void m19806a(TextView textView, String str, boolean z) {
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setPadding(0, z ? this.f14339U.getDimensionPixelSize(C6325d.padding_extra_small) : 0, 0, 0);
        textView.setText(str);
    }

    /* renamed from: a */
    private final String m19804a(Rating rating, String str) {
        return C13199w.m40559a(this.f14340V.mo13548a(rating, str), ", ", null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public final void mo18878a(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = r1;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = new AccelerateDecelerateInterpolator();
        C6283e eVar = r1;
        C6283e eVar2 = new C6283e(constraintLayout);
        C3800a.m12829a(constraintLayout2, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, accelerateDecelerateInterpolator, null, eVar, null, 176125, null);
    }
}
