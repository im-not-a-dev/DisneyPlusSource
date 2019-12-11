package p163g.p174d.p178b.p200z;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p174d.p178b.p200z.C5342b.C5343a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u001c\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014JB\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\"J\u0010\u0010$\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010%\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR-\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006-"}, mo31007d2 = {"Lcom/bamtech/player/animation/SlideFadeTranslationAnimation;", "Lcom/bamtech/player/animation/ControlAnimation;", "durationHideMs", "", "durationShowMs", "(JJ)V", "viewFocusableMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getViewFocusableMap", "()Ljava/util/HashMap;", "viewVisibiltyMap", "getViewVisibiltyMap", "viewYPositionMap", "getViewYPositionMap", "animateBottomViewDown", "", "view", "Landroid/view/View;", "animateBottomViewUp", "animateIn", "containerView", "animationGroup", "Lcom/bamtech/player/animation/ControlAnimation$AnimationGroup;", "animateOut", "animateTopViewDown", "animateTopViewUp", "animateTranslation", "from", "to", "durationMs", "startAction", "Lkotlin/Function0;", "endAction", "fadeInWithVisibility", "fadeOutWithVisibility", "getViewHideAnimationDistance", "getViewShowAnimationDistance", "hideAnimationEndedAction", "recordViewProperties", "setup", "showAnimationStartedAction", "SlideFadeTranslationAnimationGroup", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.z.c */
/* compiled from: SlideFadeTranslationAnimation.kt */
public class C5347c extends C5342b {

    /* renamed from: c */
    private final HashMap<Integer, Integer> f12829c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<Integer, Integer> f12830d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<Integer, Boolean> f12831e = new HashMap<>();

    /* renamed from: g.d.b.z.c$a */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    public static final class C5348a implements C5343a {

        /* renamed from: a */
        private final List<View> f12832a;

        /* renamed from: b */
        private final List<View> f12833b;

        /* renamed from: c */
        private final List<View> f12834c;

        public C5348a(List<? extends View> list, List<? extends View> list2, List<? extends View> list3) {
            this.f12832a = list;
            this.f12833b = list2;
            this.f12834c = list3;
        }

        /* renamed from: a */
        public final List<View> mo17124a() {
            return this.f12834c;
        }

        /* renamed from: b */
        public final List<View> mo17125b() {
            return this.f12833b;
        }

        /* renamed from: c */
        public final List<View> mo17126c() {
            return this.f12832a;
        }

        /* renamed from: a */
        public C5342b mo17110a(long j, long j2) {
            return new C5347c(j, j2);
        }
    }

    /* renamed from: g.d.b.z.c$b */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5349b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5349b f12835c = new C5349b();

        C5349b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: g.d.b.z.c$c */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5350c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f12836U;

        /* renamed from: c */
        final /* synthetic */ C5347c f12837c;

        C5350c(C5347c cVar, View view) {
            this.f12837c = cVar;
            this.f12836U = view;
            super(0);
        }

        public final void invoke() {
            this.f12837c.mo17121h(this.f12836U);
        }
    }

    /* renamed from: g.d.b.z.c$d */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5351d extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f12838U;

        /* renamed from: c */
        final /* synthetic */ C5347c f12839c;

        C5351d(C5347c cVar, View view) {
            this.f12839c = cVar;
            this.f12838U = view;
            super(0);
        }

        public final void invoke() {
            this.f12839c.mo17123j(this.f12838U);
        }
    }

    /* renamed from: g.d.b.z.c$e */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5352e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5352e f12840c = new C5352e();

        C5352e() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: g.d.b.z.c$f */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5353f extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f12841U;

        /* renamed from: c */
        final /* synthetic */ C5347c f12842c;

        C5353f(C5347c cVar, View view) {
            this.f12842c = cVar;
            this.f12841U = view;
            super(0);
        }

        public final void invoke() {
            this.f12842c.mo17123j(this.f12841U);
        }
    }

    /* renamed from: g.d.b.z.c$g */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5354g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5354g f12843c = new C5354g();

        C5354g() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: g.d.b.z.c$h */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5355h extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5355h f12844c = new C5355h();

        C5355h() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: g.d.b.z.c$i */
    /* compiled from: SlideFadeTranslationAnimation.kt */
    static final class C5356i extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f12845U;

        /* renamed from: c */
        final /* synthetic */ C5347c f12846c;

        C5356i(C5347c cVar, View view) {
            this.f12846c = cVar;
            this.f12845U = view;
            super(0);
        }

        public final void invoke() {
            this.f12846c.mo17121h(this.f12845U);
        }
    }

    public C5347c(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: k */
    private final int m18092k(View view) {
        return (int) (((float) view.getMeasuredHeight()) + view.getY());
    }

    /* renamed from: l */
    private final int m18093l(View view) {
        int measuredHeight = view.getMeasuredHeight();
        Object obj = this.f12829c.get(Integer.valueOf(view.hashCode()));
        if (obj != null) {
            Intrinsics.checkReturnedValueIsNotNull(obj, "viewYPositionMap[view.hashCode()]!!");
            return measuredHeight + ((Number) obj).intValue();
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: a */
    public void mo17106a(C5343a aVar) {
        C5348a aVar2 = (C5348a) aVar;
        List<View> b = aVar2.mo17125b();
        if (b != null) {
            for (View view : b) {
                mo17103a(view);
                mo17122i(view);
            }
        }
        List<View> c = aVar2.mo17126c();
        if (c != null) {
            for (View view2 : c) {
                mo17103a(view2);
                mo17122i(view2);
            }
        }
        List<View> a = aVar2.mo17124a();
        if (a != null) {
            for (View view3 : a) {
                mo17103a(view3);
                mo17122i(view3);
            }
        }
    }

    /* renamed from: b */
    public void mo17109b(View view, C5343a aVar) {
        super.mo17109b(view, aVar);
        C5348a aVar2 = (C5348a) aVar;
        List<View> b = aVar2.mo17125b();
        if (b != null) {
            for (View g : b) {
                mo17120g(g);
            }
        }
        List<View> c = aVar2.mo17126c();
        if (c != null) {
            for (View e : c) {
                mo17118e(e);
            }
        }
        List<View> a = aVar2.mo17124a();
        if (a != null) {
            for (View b2 : a) {
                mo17115b(b2);
            }
        }
    }

    /* renamed from: c */
    public final void mo17116c(View view) {
        if (view != null) {
            mo17114a(view, m18093l(view), 0, mo17107b(), new C5351d(this, view), C5352e.f12840c);
        }
    }

    /* renamed from: d */
    public final void mo17117d(View view) {
        if (view != null) {
            mo17114a(view, -m18093l(view), 0, mo17107b(), new C5353f(this, view), C5354g.f12843c);
        }
    }

    /* renamed from: e */
    public final void mo17118e(View view) {
        if (view != null) {
            mo17114a(view, 0, -m18092k(view), mo17102a(), C5355h.f12844c, new C5356i(this, view));
        }
    }

    /* renamed from: f */
    public final void mo17119f(View view) {
        Integer num = (Integer) this.f12830d.get(Integer.valueOf(view != null ? view.hashCode() : 0));
        if (num == null) {
            num = Integer.valueOf(0);
        }
        mo17104a(view, num.intValue());
    }

    /* renamed from: g */
    public final void mo17120g(View view) {
        Integer num = (Integer) this.f12830d.get(Integer.valueOf(view != null ? view.hashCode() : 0));
        if (num == null) {
            num = Integer.valueOf(8);
        }
        mo17108b(view, num.intValue());
    }

    /* renamed from: h */
    public final void mo17121h(View view) {
        this.f12831e.put(Integer.valueOf(view != null ? view.hashCode() : 0), Boolean.valueOf(view != null ? view.isFocusable() : false));
        if (view != null) {
            view.setFocusable(false);
        }
    }

    /* renamed from: i */
    public final void mo17122i(View view) {
        this.f12830d.put(Integer.valueOf(view.hashCode()), Integer.valueOf(view.getVisibility()));
        this.f12829c.put(Integer.valueOf(view.hashCode()), Integer.valueOf((int) view.getY()));
        this.f12831e.put(Integer.valueOf(view.hashCode()), Boolean.valueOf(view.isFocusable()));
    }

    /* renamed from: j */
    public final void mo17123j(View view) {
        if (view != null) {
            Boolean bool = (Boolean) this.f12831e.get(Integer.valueOf(view.hashCode()));
            view.setFocusable(bool != null ? bool.booleanValue() : true);
        }
    }

    /* renamed from: b */
    public final void mo17115b(View view) {
        if (view != null) {
            mo17114a(view, 0, m18092k(view), mo17102a(), C5349b.f12835c, new C5350c(this, view));
        }
    }

    /* renamed from: a */
    public void mo17105a(View view, C5343a aVar) {
        super.mo17105a(view, aVar);
        C5348a aVar2 = (C5348a) aVar;
        List<View> b = aVar2.mo17125b();
        if (b != null) {
            for (View f : b) {
                mo17119f(f);
            }
        }
        List<View> c = aVar2.mo17126c();
        if (c != null) {
            for (View d : c) {
                mo17117d(d);
            }
        }
        List<View> a = aVar2.mo17124a();
        if (a != null) {
            for (View c2 : a) {
                mo17116c(c2);
            }
        }
    }

    /* renamed from: a */
    public final void mo17114a(View view, int i, int i2, long j, Function0<C13145v> function0, Function0<C13145v> function02) {
        view.setTranslationY((float) i);
        view.animate().translationY((float) i2).setDuration(j).setStartDelay(0).withStartAction(new C5357d(function0)).withEndAction(new C5357d(function02)).start();
    }
}
