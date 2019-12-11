package p163g.p174d.p178b.p196m0;

import android.view.View;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5318s;
import p163g.p174d.p178b.p200z.C5341a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"TAG_FADE_IN", "", "TAG_FADE_OUT", "fadeIn", "", "Landroid/view/View;", "duration", "", "endAction", "Lkotlin/Function1;", "fadeOut", "fadeOutFast", "bamplayer-core_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.m0.e */
/* compiled from: ViewEx.kt */
public final class C5307e {

    /* renamed from: g.d.b.m0.e$a */
    /* compiled from: ViewEx.kt */
    static final class C5308a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f12791c;

        C5308a(View view) {
            this.f12791c = view;
        }

        public final void run() {
            C5341a.m18082b(this.f12791c, 0, null, 4, null);
        }
    }

    /* renamed from: g.d.b.m0.e$b */
    /* compiled from: ViewEx.kt */
    static final class C5309b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Function1 f12792U;

        /* renamed from: c */
        final /* synthetic */ View f12793c;

        C5309b(View view, Function1 function1) {
            this.f12793c = view;
            this.f12792U = function1;
        }

        public final void run() {
            Function1 function1 = this.f12792U;
            if (function1 != null) {
                C13145v vVar = (C13145v) function1.invoke(this.f12793c);
            }
        }
    }

    /* renamed from: g.d.b.m0.e$c */
    /* compiled from: ViewEx.kt */
    static final class C5310c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f12794c;

        C5310c(View view) {
            this.f12794c = view;
        }

        public final void run() {
            C5341a.m18080a(this.f12794c, 0, null, 6, null);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17964a(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m17963a(view, j, function1);
    }

    /* renamed from: a */
    public static final void m17963a(View view, long j, Function1<? super View, C13145v> function1) {
        String str = "FADE_IN";
        if (!Intrinsics.areEqual(view.getTag(C5318s.tag_btmp_fade_animation), (Object) str)) {
            view.setTag(C5318s.tag_btmp_fade_animation, str);
            view.animate().alpha(1.0f).setDuration(j).withStartAction(new C5308a(view)).withEndAction(new C5309b(view, function1)).start();
        }
    }

    /* renamed from: a */
    public static final void m17962a(View view, long j) {
        String str = "FADE_OUT";
        if (!Intrinsics.areEqual(view.getTag(C5318s.tag_btmp_fade_animation), (Object) str)) {
            view.setTag(C5318s.tag_btmp_fade_animation, str);
            view.animate().alpha(0.0f).setDuration(j).withEndAction(new C5310c(view)).start();
        }
    }

    /* renamed from: a */
    public static final void m17961a(View view) {
        view.setTag(C5318s.tag_btmp_fade_animation, "FADE_OUT");
        view.setAlpha(0.0f);
        view.setVisibility(8);
    }
}
