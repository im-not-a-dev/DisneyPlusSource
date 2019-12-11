package p163g.p201e.p203b.p305n;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import com.bamtechmedia.dominguez.core.p088i.p089n.C3844a;
import com.bamtechmedia.dominguez.core.utils.C5846m0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\u0018J$\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\"H\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper;", "", "fragment", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageFragment;", "blurConfig", "Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;", "(Lcom/bamtechmedia/dominguez/editorial/EditorialPageFragment;Lcom/bamtechmedia/dominguez/core/design/blur/BlurConfig;)V", "backgroundImageOverlay", "Landroid/view/View;", "getBackgroundImageOverlay", "()Landroid/view/View;", "backgroundImageView", "getBackgroundImageView", "currentTransitionState", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper$TransitionState;", "logoImageView", "getLogoImageView", "logoTextView", "getLogoTextView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "animateTransition", "", "transitionState", "duration", "", "applyTransition", "onFocusedCollectionTileChanged", "newFocus", "restoreState", "transitionToState", "force", "", "TransitionState", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.n.j */
/* compiled from: EditorialPageTvTransitionHelper.kt */
public final class C7603j {

    /* renamed from: a */
    private C7604a f16615a;

    /* renamed from: b */
    private final C7588b f16616b;

    /* renamed from: c */
    private final C3844a f16617c;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper$TransitionState;", "", "()V", "Default", "Scrolled", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper$TransitionState$Default;", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper$TransitionState$Scrolled;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.n.j$a */
    /* compiled from: EditorialPageTvTransitionHelper.kt */
    public static abstract class C7604a {

        /* renamed from: g.e.b.n.j$a$a */
        /* compiled from: EditorialPageTvTransitionHelper.kt */
        public static final class C7605a extends C7604a {

            /* renamed from: a */
            public static final C7605a f16618a = new C7605a();

            private C7605a() {
                super(null);
            }
        }

        /* renamed from: g.e.b.n.j$a$b */
        /* compiled from: EditorialPageTvTransitionHelper.kt */
        public static final class C7606b extends C7604a {

            /* renamed from: a */
            public static final C7606b f16619a = new C7606b();

            private C7606b() {
                super(null);
            }
        }

        private C7604a() {
        }

        public /* synthetic */ C7604a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7603j(C7588b bVar, C3844a aVar) {
        this.f16616b = bVar;
        this.f16617c = aVar;
    }

    /* renamed from: b */
    private final View m22576b() {
        return this.f16616b._$_findCachedViewById(C5363f.editorialBackgroundOverlay);
    }

    /* renamed from: c */
    private final View m22577c() {
        View _$_findCachedViewById = this.f16616b._$_findCachedViewById(C5363f.editorialBackgroundImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "fragment.editorialBackgroundImageView");
        return _$_findCachedViewById;
    }

    /* renamed from: d */
    private final View m22578d() {
        ImageView imageView = (ImageView) this.f16616b._$_findCachedViewById(C5363f.editorialLogoImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "fragment.editorialLogoImageView");
        return imageView;
    }

    /* renamed from: e */
    private final View m22579e() {
        TextView textView = (TextView) this.f16616b._$_findCachedViewById(C5363f.editorialLogoTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "fragment.editorialLogoTextView");
        return textView;
    }

    /* renamed from: f */
    private final RecyclerView m22580f() {
        RecyclerView recyclerView = (RecyclerView) this.f16616b._$_findCachedViewById(C5363f.editorialRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "fragment.editorialRecyclerView");
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo20533a() {
        C7604a aVar = this.f16615a;
        if (aVar == null) {
            aVar = C7605a.f16618a;
        }
        m22575a(this, aVar, 0, true, 2, null);
    }

    /* renamed from: a */
    public final void mo20534a(View view) {
        C0794d0 d = m22580f().mo4419d(view);
        if (d == null || d.getAdapterPosition() != 0) {
            m22575a(this, C7606b.f16619a, 300, false, 4, null);
            return;
        }
        m22575a(this, C7605a.f16618a, 300, false, 4, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m22575a(C7603j jVar, C7604a aVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        jVar.m22574a(aVar, j, z);
    }

    /* renamed from: a */
    private final void m22574a(C7604a aVar, long j, boolean z) {
        if (!Intrinsics.areEqual((Object) this.f16615a, (Object) aVar) || z) {
            this.f16615a = aVar;
            if (j > 0) {
                m22573a(aVar, j);
            } else {
                m22572a(aVar);
            }
        }
    }

    /* renamed from: a */
    private final void m22573a(C7604a aVar, long j) {
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual((Object) aVar, (Object) C7605a.f16618a)) {
            RecyclerView f = m22580f();
            TextView textView = (TextView) this.f16616b._$_findCachedViewById(C5363f.editorialLogoTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "fragment.editorialLogoTextView");
            arrayList.add(C5846m0.m18868a(f, (float) textView.getBottom(), j, 0, 0.0f, null, 28, null));
            if (this.f16617c.mo13753a()) {
                arrayList.add(C5846m0.m18870a(m22577c(), 300, 0, 0.0f, null, 14, null));
            }
            arrayList.add(C5846m0.m18870a(m22578d(), 300, 0, 0.0f, null, 14, null));
            arrayList.add(C5846m0.m18870a(m22579e(), 300, 0, 0.0f, null, 14, null));
            View b = m22576b();
            if (b != null) {
                ValueAnimator b2 = C5846m0.m18872b(b, 300, 0, 0.0f, null, 14, null);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C7606b.f16619a)) {
            arrayList.add(C5846m0.m18868a(m22580f(), 0.0f, j, 0, 0.0f, null, 28, null));
            if (this.f16617c.mo13753a()) {
                arrayList.add(C5846m0.m18872b(m22577c(), 300, 0, 0.0f, null, 14, null));
            }
            arrayList.add(C5846m0.m18872b(m22578d(), 300, 0, 0.0f, null, 14, null));
            arrayList.add(C5846m0.m18872b(m22579e(), 300, 0, 0.0f, null, 14, null));
            View b3 = m22576b();
            if (b3 != null) {
                ValueAnimator a = C5846m0.m18870a(b3, 300, 0, 0.0f, null, 14, null);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    /* renamed from: a */
    private final void m22572a(C7604a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C7605a.f16618a)) {
            RecyclerView f = m22580f();
            TextView textView = (TextView) this.f16616b._$_findCachedViewById(C5363f.editorialLogoTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "fragment.editorialLogoTextView");
            f.setTranslationY((float) textView.getBottom());
            if (this.f16617c.mo13753a()) {
                m22577c().setAlpha(1.0f);
            }
            m22578d().setAlpha(1.0f);
            m22579e().setAlpha(1.0f);
            View b = m22576b();
            if (b != null) {
                b.setAlpha(0.0f);
            }
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C7606b.f16619a)) {
            m22580f().setTranslationY(0.0f);
            if (this.f16617c.mo13753a()) {
                m22577c().setAlpha(0.0f);
            }
            m22578d().setAlpha(0.0f);
            m22579e().setAlpha(0.0f);
            View b2 = m22576b();
            if (b2 != null) {
                b2.setAlpha(1.0f);
            }
        }
    }
}
