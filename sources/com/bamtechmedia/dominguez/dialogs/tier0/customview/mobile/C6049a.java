package com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import p163g.p201e.p203b.p299m.C7559q;
import p163g.p201e.p203b.p299m.C7563u;
import p163g.p201e.p203b.p299m.p300y.C7567a;
import p163g.p201e.p203b.p299m.p300y.C7569c;
import p520io.reactivex.subjects.C11978b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier0/customview/mobile/Tier0AnimatorSetFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "flashAnimatorSet", "Landroid/animation/AnimatorSet;", "createFadeOut", "", "Landroid/animation/Animator;", "fadeOutViews", "Landroid/view/View;", "createIconInitialRotationFade", "messageIcon", "Landroid/widget/ImageView;", "leftEndBackground", "rightEndBackground", "createSlideAndShow", "messageText", "Landroid/widget/TextView;", "createSlideOut", "middleBackground", "prepareAnimatorSet", "flashViewElements", "Lcom/bamtechmedia/dominguez/dialogs/tier0/FlashViewElements;", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "Companion", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile.a */
/* compiled from: Tier0AnimatorSetFactory.kt */
public final class C6049a {

    /* renamed from: a */
    private AnimatorSet f13938a = new AnimatorSet();

    /* renamed from: b */
    private final Context f13939b;

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile.a$a */
    /* compiled from: Tier0AnimatorSetFactory.kt */
    public static final class C6050a {
        private C6050a() {
        }

        public /* synthetic */ C6050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier0.customview.mobile.a$b */
    /* compiled from: Tier0AnimatorSetFactory.kt */
    public static final class C6051b extends C7567a {

        /* renamed from: a */
        final /* synthetic */ C11978b f13940a;

        C6051b(List list, List list2, List list3, List list4, C6049a aVar, C11978b bVar) {
            this.f13940a = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            C11978b bVar = this.f13940a;
            if (bVar != null) {
                bVar.onComplete();
            }
        }
    }

    static {
        new C6050a(null);
    }

    public C6049a(Context context) {
        this.f13939b = context;
    }

    /* renamed from: a */
    public final AnimatorSet mo18305a(C7569c cVar, C11978b bVar) {
        List a = m19387a(cVar.mo20500c(), cVar.mo20499b(), cVar.mo20502e());
        List a2 = m19388a(cVar.mo20500c(), cVar.mo20499b(), cVar.mo20502e(), cVar.mo20498a());
        List a3 = m19389a(cVar.mo20501d());
        List a4 = m19390a(C13185o.m40520c(cVar.mo20501d(), cVar.mo20500c(), cVar.mo20499b(), cVar.mo20502e(), cVar.mo20498a()));
        AnimatorSet animatorSet = this.f13938a;
        C6051b bVar2 = new C6051b(a, a2, a3, a4, this, bVar);
        animatorSet.addListener(bVar2);
        animatorSet.playTogether(C13199w.m40583d((Collection) C13199w.m40583d((Collection) C13199w.m40583d((Collection) a, (Iterable) a2), (Iterable) a3), (Iterable) a4));
        return animatorSet;
    }

    /* renamed from: a */
    private final List<Animator> m19387a(ImageView imageView, View view, View view2) {
        long integer = (long) this.f13939b.getResources().getInteger(C7563u.icon_rotation_duration);
        long integer2 = (long) this.f13939b.getResources().getInteger(C7563u.icon_start_delay);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ROTATION, new float[]{-45.0f, 0.0f});
        ofFloat.setDuration(integer);
        ofFloat.setStartDelay(integer2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.ALPHA, new float[]{1.0f});
        ofFloat2.setDuration(integer);
        ofFloat2.setStartDelay(integer2);
        long integer3 = (long) this.f13939b.getResources().getInteger(C7563u.end_cap_scale_duration);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f});
        ofFloat3.setDuration(integer3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f});
        ofFloat4.setDuration(integer3);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, View.SCALE_X, new float[]{1.0f});
        ofFloat5.setDuration(integer3);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, new float[]{1.0f});
        ofFloat6.setDuration(integer3);
        return C13185o.m40520c(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
    }

    /* renamed from: a */
    private final List<Animator> m19388a(ImageView imageView, View view, View view2, View view3) {
        long integer = (long) this.f13939b.getResources().getInteger(C7563u.container_scale_delay);
        long integer2 = (long) this.f13939b.getResources().getInteger(C7563u.duration3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, View.SCALE_X, new float[]{1.0f});
        ofFloat.setDuration(integer2);
        ofFloat.setStartDelay(integer);
        List<View> c = C13185o.m40520c(view, view2, imageView);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (View ofFloat2 : c) {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ofFloat2, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat3.setDuration(integer2);
            ofFloat3.setStartDelay(integer);
            arrayList.add(ofFloat3);
        }
        return C13199w.m40563a((Collection) arrayList, (Object) ofFloat);
    }

    /* renamed from: a */
    private final List<Animator> m19389a(TextView textView) {
        long integer = (long) this.f13939b.getResources().getInteger(C7563u.duration3);
        long integer2 = (long) this.f13939b.getResources().getInteger(C7563u.text_shift_duration);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_X, new float[]{0.0f});
        ofFloat.setDuration(integer2);
        ofFloat.setStartDelay(integer);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{1.0f});
        ofFloat2.setDuration(integer2);
        ofFloat2.setStartDelay(integer);
        return C13185o.m40520c(ofFloat, ofFloat2);
    }

    /* renamed from: a */
    private final List<Animator> m19390a(List<? extends View> list) {
        long integer = (long) this.f13939b.getResources().getInteger(C7563u.fade_out_start);
        long integer2 = (long) this.f13939b.getResources().getInteger(C7563u.duration3);
        float dimension = this.f13939b.getResources().getDimension(C7559q.fade_out_y_displacement);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (View ofFloat : list) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ofFloat, View.ALPHA, new float[]{0.0f});
            ofFloat2.setDuration(integer2);
            ofFloat2.setStartDelay(integer);
            arrayList.add(ofFloat2);
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (View ofFloat3 : list) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ofFloat3, View.TRANSLATION_Y, new float[]{dimension});
            ofFloat4.setDuration(integer2);
            ofFloat4.setStartDelay(integer);
            arrayList2.add(ofFloat4);
        }
        return C13199w.m40583d((Collection) arrayList, (Iterable) arrayList2);
    }
}
