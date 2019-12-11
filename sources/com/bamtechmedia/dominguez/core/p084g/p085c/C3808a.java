package com.bamtechmedia.dominguez.core.p084g.p085c;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C0900t;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12865c0;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4187x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b&\u0018\u0000 L2\u00020\u0001:\u0006KLMNOPB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H$J:\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\rH\u0002J0\u0010-\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0016J0\u0010.\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H$J\u001b\u00101\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000503H\u0000¢\u0006\u0002\b4J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\"H\u0002J\u0010\u00109\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u001e\u0010>\u001a\u00020\"2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0@2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010A\u001a\u00020\"2\u0006\u0010,\u001a\u00020\rH\u0002J\u001a\u0010A\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010 \u001a\u00020\u0005H\u0004J\u0010\u0010D\u001a\u00020C2\u0006\u0010 \u001a\u00020\u0005H\u0004J\b\u0010E\u001a\u00020\u001fH\u0016J\u0010\u0010F\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010G\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0014J\u0010\u0010H\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010I\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005H\u0014J\b\u0010J\u001a\u00020\"H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006Q"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/animation/animators/BaseItemAnimator;", "Landroidx/recyclerview/widget/SimpleItemAnimator;", "()V", "addAnimations", "Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getAddAnimations", "()Ljava/util/ArrayList;", "setAddAnimations", "(Ljava/util/ArrayList;)V", "additionsList", "changeAnimations", "changesList", "Lcom/bamtechmedia/dominguez/core/animation/animators/BaseItemAnimator$ChangeInfo;", "interpolator", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "moveAnimations", "movesList", "Lcom/bamtechmedia/dominguez/core/animation/animators/BaseItemAnimator$MoveInfo;", "pendingAdditions", "pendingChanges", "pendingMoves", "pendingRemovals", "removeAnimations", "getRemoveAnimations", "setRemoveAnimations", "animateAdd", "", "holder", "animateAddImpl", "", "animateChange", "oldHolder", "newHolder", "fromX", "", "fromY", "toX", "toY", "animateChangeImpl", "changeInfo", "animateMove", "animateMoveImpl", "animateRemove", "animateRemoveImpl", "cancelAll", "viewHolders", "", "cancelAll$core_utils_release", "clearView", "view", "Landroid/view/View;", "dispatchFinishedWhenDone", "doAnimateAdd", "doAnimateRemove", "endAnimation", "item", "endAnimations", "endChangeAnimation", "infoList", "", "endChangeAnimationIfNecessary", "getAddDelay", "", "getRemoveDelay", "isRunning", "preAnimateAdd", "preAnimateAddImpl", "preAnimateRemove", "preAnimateRemoveImpl", "runPendingAnimations", "ChangeInfo", "Companion", "DefaultAddAnimatorListener", "DefaultRemoveAnimatorListener", "MoveInfo", "VpaListenerAdapter", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.g.c.a */
/* compiled from: BaseItemAnimator.kt */
public abstract class C3808a extends C0900t {

    /* renamed from: s */
    private static final boolean f9457s = false;

    /* renamed from: h */
    private final ArrayList<C0794d0> f9458h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<C0794d0> f9459i = new ArrayList<>();

    /* renamed from: j */
    private final ArrayList<C3813e> f9460j = new ArrayList<>();

    /* renamed from: k */
    private final ArrayList<C3809a> f9461k = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ArrayList<ArrayList<C0794d0>> f9462l = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ArrayList<ArrayList<C3813e>> f9463m = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final ArrayList<ArrayList<C3809a>> f9464n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<C0794d0> f9465o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArrayList<C0794d0> f9466p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C0794d0> f9467q = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final ArrayList<C0794d0> f9468r = new ArrayList<>();

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$a */
    /* compiled from: BaseItemAnimator.kt */
    private static final class C3809a {

        /* renamed from: a */
        private int f9469a;

        /* renamed from: b */
        private int f9470b;

        /* renamed from: c */
        private int f9471c;

        /* renamed from: d */
        private int f9472d;

        /* renamed from: e */
        private C0794d0 f9473e;

        /* renamed from: f */
        private C0794d0 f9474f;

        private C3809a(C0794d0 d0Var, C0794d0 d0Var2) {
            this.f9473e = d0Var;
            this.f9474f = d0Var2;
        }

        /* renamed from: a */
        public final void mo13721a(C0794d0 d0Var) {
            this.f9474f = d0Var;
        }

        /* renamed from: b */
        public final void mo13723b(C0794d0 d0Var) {
            this.f9473e = d0Var;
        }

        /* renamed from: c */
        public final C0794d0 mo13724c() {
            return this.f9474f;
        }

        /* renamed from: d */
        public final C0794d0 mo13725d() {
            return this.f9473e;
        }

        /* renamed from: e */
        public final int mo13726e() {
            return this.f9471c;
        }

        /* renamed from: f */
        public final int mo13727f() {
            return this.f9472d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f9473e);
            sb.append(", newHolder=");
            sb.append(this.f9474f);
            sb.append(", fromX=");
            sb.append(this.f9469a);
            sb.append(", fromY=");
            sb.append(this.f9470b);
            sb.append(", toX=");
            sb.append(this.f9471c);
            sb.append(", toY=");
            sb.append(this.f9472d);
            sb.append("}");
            return sb.toString();
        }

        public C3809a(C0794d0 d0Var, C0794d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f9469a = i;
            this.f9470b = i2;
            this.f9471c = i3;
            this.f9472d = i4;
        }

        /* renamed from: a */
        public final int mo13720a() {
            return this.f9469a;
        }

        /* renamed from: b */
        public final int mo13722b() {
            return this.f9470b;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$b */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C3810b {
        private C3810b() {
        }

        public /* synthetic */ C3810b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$c */
    /* compiled from: BaseItemAnimator.kt */
    protected final class C3811c implements AnimatorListener {

        /* renamed from: a */
        private final C0794d0 f9475a;

        public C3811c(C0794d0 d0Var) {
            this.f9475a = d0Var;
        }

        public void onAnimationCancel(Animator animator) {
            C3808a aVar = C3808a.this;
            View view = this.f9475a.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "vh.itemView");
            aVar.m12837a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C3808a aVar = C3808a.this;
            View view = this.f9475a.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "vh.itemView");
            aVar.m12837a(view);
            C3808a.this.mo5136h(this.f9475a);
            C3808a.this.mo13714j().remove(this.f9475a);
            C3808a.this.m12853l();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C3808a.this.mo5137i(this.f9475a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$d */
    /* compiled from: BaseItemAnimator.kt */
    protected final class C3812d implements AnimatorListener {

        /* renamed from: a */
        private final C0794d0 f9477a;

        public C3812d(C0794d0 d0Var) {
            this.f9477a = d0Var;
        }

        public void onAnimationCancel(Animator animator) {
            C3808a aVar = C3808a.this;
            View view = this.f9477a.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "vh.itemView");
            aVar.m12837a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C3808a aVar = C3808a.this;
            View view = this.f9477a.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "vh.itemView");
            aVar.m12837a(view);
            C3808a.this.mo5140l(this.f9477a);
            C3808a.this.mo13715k().remove(this.f9477a);
            C3808a.this.m12853l();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C3808a.this.mo5141m(this.f9477a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$e */
    /* compiled from: BaseItemAnimator.kt */
    private static final class C3813e {

        /* renamed from: a */
        private C0794d0 f9479a;

        /* renamed from: b */
        private int f9480b;

        /* renamed from: c */
        private int f9481c;

        /* renamed from: d */
        private int f9482d;

        /* renamed from: e */
        private int f9483e;

        public C3813e(C0794d0 d0Var, int i, int i2, int i3, int i4) {
            this.f9479a = d0Var;
            this.f9480b = i;
            this.f9481c = i2;
            this.f9482d = i3;
            this.f9483e = i4;
        }

        /* renamed from: a */
        public final int mo13737a() {
            return this.f9480b;
        }

        /* renamed from: b */
        public final int mo13738b() {
            return this.f9481c;
        }

        /* renamed from: c */
        public final C0794d0 mo13739c() {
            return this.f9479a;
        }

        /* renamed from: d */
        public final int mo13740d() {
            return this.f9482d;
        }

        /* renamed from: e */
        public final int mo13741e() {
            return this.f9483e;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$f */
    /* compiled from: BaseItemAnimator.kt */
    protected static class C3814f implements C4140e0 {
        /* renamed from: a */
        public void mo1483a(View view) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$g */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C3815g extends C3814f {

        /* renamed from: a */
        final /* synthetic */ C3808a f9484a;

        /* renamed from: b */
        final /* synthetic */ C3809a f9485b;

        /* renamed from: c */
        final /* synthetic */ C4135d0 f9486c;

        C3815g(C3808a aVar, C3809a aVar2, C4135d0 d0Var) {
            this.f9484a = aVar;
            this.f9485b = aVar2;
            this.f9486c = d0Var;
        }

        /* renamed from: b */
        public void mo531b(View view) {
            this.f9486c.mo14707a((C4140e0) null);
            C4187x.m14351a(view, 1.0f);
            C4187x.m14378c(view, 0.0f);
            C4187x.m14382d(view, 0.0f);
            C0794d0 d = this.f9485b.mo13725d();
            this.f9484a.mo5131a(d, true);
            ArrayList c = this.f9484a.f9468r;
            if (c != null) {
                C12865c0.m40199a((Object) c).remove(d);
                this.f9484a.m12853l();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }

        /* renamed from: c */
        public void mo532c(View view) {
            this.f9484a.mo5133b(this.f9485b.mo13725d(), true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$h */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C3816h extends C3814f {

        /* renamed from: a */
        final /* synthetic */ C3808a f9487a;

        /* renamed from: b */
        final /* synthetic */ C3809a f9488b;

        /* renamed from: c */
        final /* synthetic */ C4135d0 f9489c;

        /* renamed from: d */
        final /* synthetic */ View f9490d;

        C3816h(C3808a aVar, C3809a aVar2, C4135d0 d0Var, View view) {
            this.f9487a = aVar;
            this.f9488b = aVar2;
            this.f9489c = d0Var;
            this.f9490d = view;
        }

        /* renamed from: b */
        public void mo531b(View view) {
            this.f9489c.mo14707a((C4140e0) null);
            C4187x.m14351a(this.f9490d, 1.0f);
            C4187x.m14378c(this.f9490d, 0.0f);
            C4187x.m14382d(this.f9490d, 0.0f);
            C0794d0 c = this.f9488b.mo13724c();
            this.f9487a.mo5131a(c, false);
            ArrayList c2 = this.f9487a.f9468r;
            if (c2 != null) {
                C12865c0.m40199a((Object) c2).remove(c);
                this.f9487a.m12853l();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }

        /* renamed from: c */
        public void mo532c(View view) {
            this.f9487a.mo5133b(this.f9488b.mo13724c(), false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$i */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C3817i extends C3814f {

        /* renamed from: a */
        final /* synthetic */ C3808a f9491a;

        /* renamed from: b */
        final /* synthetic */ C0794d0 f9492b;

        /* renamed from: c */
        final /* synthetic */ int f9493c;

        /* renamed from: d */
        final /* synthetic */ int f9494d;

        /* renamed from: e */
        final /* synthetic */ C4135d0 f9495e;

        C3817i(C3808a aVar, C0794d0 d0Var, int i, int i2, C4135d0 d0Var2) {
            this.f9491a = aVar;
            this.f9492b = d0Var;
            this.f9493c = i;
            this.f9494d = i2;
            this.f9495e = d0Var2;
        }

        /* renamed from: a */
        public void mo1483a(View view) {
            if (this.f9493c != 0) {
                C4187x.m14378c(view, 0.0f);
            }
            if (this.f9494d != 0) {
                C4187x.m14382d(view, 0.0f);
            }
        }

        /* renamed from: b */
        public void mo531b(View view) {
            this.f9495e.mo14707a((C4140e0) null);
            this.f9491a.mo5138j(this.f9492b);
            this.f9491a.f9466p.remove(this.f9492b);
            this.f9491a.m12853l();
        }

        /* renamed from: c */
        public void mo532c(View view) {
            this.f9491a.mo5139k(this.f9492b);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$j */
    /* compiled from: BaseItemAnimator.kt */
    static final class C3818j implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ArrayList f9496U;

        /* renamed from: c */
        final /* synthetic */ C3808a f9497c;

        C3818j(C3808a aVar, ArrayList arrayList) {
            this.f9497c = aVar;
            this.f9496U = arrayList;
        }

        public final void run() {
            if (this.f9497c.f9462l.remove(this.f9496U)) {
                Iterator it = this.f9496U.iterator();
                while (it.hasNext()) {
                    C0794d0 d0Var = (C0794d0) it.next();
                    C3808a aVar = this.f9497c;
                    Intrinsics.checkReturnedValueIsNotNull((Object) d0Var, "holder");
                    aVar.m12854x(d0Var);
                }
                this.f9496U.clear();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$k */
    /* compiled from: BaseItemAnimator.kt */
    static final class C3819k implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ArrayList f9498U;

        /* renamed from: c */
        final /* synthetic */ C3808a f9499c;

        C3819k(C3808a aVar, ArrayList arrayList) {
            this.f9499c = aVar;
            this.f9498U = arrayList;
        }

        public final void run() {
            if (this.f9499c.f9464n.remove(this.f9498U)) {
                Iterator it = this.f9498U.iterator();
                while (it.hasNext()) {
                    C3809a aVar = (C3809a) it.next();
                    C3808a aVar2 = this.f9499c;
                    Intrinsics.checkReturnedValueIsNotNull((Object) aVar, "change");
                    aVar2.m12838a(aVar);
                }
                this.f9498U.clear();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.c.a$l */
    /* compiled from: BaseItemAnimator.kt */
    static final class C3820l implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ArrayList f9500U;

        /* renamed from: c */
        final /* synthetic */ C3808a f9501c;

        C3820l(C3808a aVar, ArrayList arrayList) {
            this.f9501c = aVar;
            this.f9500U = arrayList;
        }

        public final void run() {
            if (this.f9501c.f9463m.remove(this.f9500U)) {
                Iterator it = this.f9500U.iterator();
                while (it.hasNext()) {
                    C3813e eVar = (C3813e) it.next();
                    this.f9501c.m12847b(eVar.mo13739c(), eVar.mo13737a(), eVar.mo13738b(), eVar.mo13740d(), eVar.mo13741e());
                }
                this.f9500U.clear();
            }
        }
    }

    static {
        new C3810b(null);
    }

    public C3808a() {
        new DecelerateInterpolator();
        mo5132a(false);
    }

    /* renamed from: A */
    private final void m12836A(C0794d0 d0Var) {
        View view = d0Var.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        m12837a(view);
        mo13719w(d0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m12853l() {
        if (!mo4672g()) {
            mo4653a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m12854x(C0794d0 d0Var) {
        mo13716t(d0Var);
        this.f9465o.add(d0Var);
    }

    /* renamed from: y */
    private final void m12855y(C0794d0 d0Var) {
        mo13717u(d0Var);
        this.f9467q.add(d0Var);
    }

    /* renamed from: z */
    private final void m12856z(C0794d0 d0Var) {
        View view = d0Var.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        m12837a(view);
        mo13718v(d0Var);
    }

    /* renamed from: g */
    public boolean mo4986g(C0794d0 d0Var) {
        mo4666c(d0Var);
        m12836A(d0Var);
        this.f9458h.add(d0Var);
        return true;
    }

    /* renamed from: i */
    public void mo4674i() {
        boolean z = !this.f9458h.isEmpty();
        boolean z2 = !this.f9460j.isEmpty();
        boolean z3 = !this.f9461k.isEmpty();
        boolean z4 = !this.f9459i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f9458h.iterator();
            while (it.hasNext()) {
                C0794d0 d0Var = (C0794d0) it.next();
                Intrinsics.checkReturnedValueIsNotNull((Object) d0Var, "holder");
                m12855y(d0Var);
            }
            this.f9458h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f9460j);
                this.f9463m.add(arrayList);
                this.f9460j.clear();
                C3820l lVar = new C3820l(this, arrayList);
                if (z) {
                    View view = ((C3813e) arrayList.get(0)).mo13739c().itemView;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view, "moves[0].holder.itemView");
                    C4187x.m14364a(view, (Runnable) lVar, mo4671f());
                } else {
                    lVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f9461k);
                this.f9464n.add(arrayList2);
                this.f9461k.clear();
                C3819k kVar = new C3819k(this, arrayList2);
                if (z) {
                    C0794d0 d = ((C3809a) arrayList2.get(0)).mo13725d();
                    if (d != null) {
                        C4187x.m14364a(d.itemView, (Runnable) kVar, mo4671f());
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else {
                    kVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f9459i);
                this.f9462l.add(arrayList3);
                this.f9459i.clear();
                C3818j jVar = new C3818j(this, arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo4671f() : 0;
                    long e = z2 ? mo4670e() : 0;
                    if (z3) {
                        j = mo4668d();
                    }
                    long max = f + Math.max(e, j);
                    View view2 = ((C0794d0) arrayList3.get(0)).itemView;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view2, "additions[0].itemView");
                    C4187x.m14364a(view2, (Runnable) jVar, max);
                } else {
                    jVar.run();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ArrayList<C0794d0> mo13714j() {
        return this.f9465o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final ArrayList<C0794d0> mo13715k() {
        return this.f9467q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo13716t(C0794d0 d0Var);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo13717u(C0794d0 d0Var);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo13718v(C0794d0 d0Var);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo13719w(C0794d0 d0Var);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12847b(C0794d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            C4187x.m14348a(view).mo14711b(0.0f);
        }
        if (i6 != 0) {
            C4187x.m14348a(view).mo14713c(0.0f);
        }
        this.f9466p.add(d0Var);
        C4135d0 a = C4187x.m14348a(view);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "ViewCompat.animate(view)");
        a.mo14705a(mo4670e());
        C3817i iVar = new C3817i(this, d0Var, i5, i6, a);
        a.mo14707a((C4140e0) iVar);
        a.mo14714c();
    }

    /* renamed from: c */
    public void mo4666c(C0794d0 d0Var) {
        View view = d0Var.itemView;
        String str = "item.itemView";
        Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
        C4187x.m14348a(view).mo14709a();
        int size = this.f9460j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = this.f9460j.get(size);
            Intrinsics.checkReturnedValueIsNotNull(obj, "pendingMoves[i]");
            if (((C3813e) obj).mo13739c() == d0Var) {
                C4187x.m14382d(view, 0.0f);
                C4187x.m14378c(view, 0.0f);
                mo5138j(d0Var);
                this.f9460j.remove(size);
            }
        }
        m12844a((List<C3809a>) this.f9461k, d0Var);
        if (this.f9458h.remove(d0Var)) {
            View view2 = d0Var.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
            m12837a(view2);
            mo5140l(d0Var);
        }
        if (this.f9459i.remove(d0Var)) {
            View view3 = d0Var.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view3, str);
            m12837a(view3);
            mo5136h(d0Var);
        }
        int size2 = this.f9464n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Object obj2 = this.f9464n.get(size2);
            Intrinsics.checkReturnedValueIsNotNull(obj2, "changesList[i]");
            ArrayList arrayList = (ArrayList) obj2;
            m12844a((List<C3809a>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f9464n.remove(size2);
            }
        }
        int size3 = this.f9463m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Object obj3 = this.f9463m.get(size3);
            Intrinsics.checkReturnedValueIsNotNull(obj3, "movesList[i]");
            ArrayList arrayList2 = (ArrayList) obj3;
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                Object obj4 = arrayList2.get(size4);
                Intrinsics.checkReturnedValueIsNotNull(obj4, "moves[j]");
                if (((C3813e) obj4).mo13739c() == d0Var) {
                    C4187x.m14382d(view, 0.0f);
                    C4187x.m14378c(view, 0.0f);
                    mo5138j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9463m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f9462l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            Object obj5 = this.f9462l.get(size5);
            Intrinsics.checkReturnedValueIsNotNull(obj5, "additionsList[i]");
            ArrayList arrayList3 = (ArrayList) obj5;
            if (arrayList3.remove(d0Var)) {
                View view4 = d0Var.itemView;
                Intrinsics.checkReturnedValueIsNotNull((Object) view4, str);
                m12837a(view4);
                mo5136h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f9462l.remove(size5);
                }
            }
        }
        if (this.f9467q.remove(d0Var) && f9457s) {
            throw new IllegalStateException("after animation is cancelled, item should not be in removeAnimations list");
        } else if (this.f9465o.remove(d0Var) && f9457s) {
            throw new IllegalStateException("after animation is cancelled, item should not be in addAnimations list");
        } else if (this.f9468r.remove(d0Var) && f9457s) {
            throw new IllegalStateException("after animation is cancelled, item should not be in changeAnimations list");
        } else if (!this.f9466p.remove(d0Var) || !f9457s) {
            m12853l();
        } else {
            throw new IllegalStateException("after animation is cancelled, item should not be in moveAnimations list");
        }
    }

    /* renamed from: f */
    public boolean mo4985f(C0794d0 d0Var) {
        mo4666c(d0Var);
        m12856z(d0Var);
        this.f9459i.add(d0Var);
        return true;
    }

    /* renamed from: g */
    public boolean mo4672g() {
        return !this.f9459i.isEmpty() || !this.f9461k.isEmpty() || !this.f9460j.isEmpty() || !this.f9458h.isEmpty() || !this.f9466p.isEmpty() || !this.f9467q.isEmpty() || !this.f9465o.isEmpty() || !this.f9468r.isEmpty() || !this.f9463m.isEmpty() || !this.f9462l.isEmpty() || !this.f9464n.isEmpty();
    }

    /* renamed from: a */
    public boolean mo4982a(C0794d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        int u = i + ((int) C4187x.m14406u(d0Var.itemView));
        int v = i2 + ((int) C4187x.m14407v(d0Var.itemView));
        mo4666c(d0Var);
        int i5 = i3 - u;
        int i6 = i4 - v;
        if (i5 == 0 && i6 == 0) {
            mo5138j(d0Var);
            return false;
        }
        if (i5 != 0) {
            C4187x.m14378c(view, (float) (-i5));
        }
        if (i6 != 0) {
            C4187x.m14382d(view, (float) (-i6));
        }
        ArrayList<C3813e> arrayList = this.f9460j;
        C3813e eVar = new C3813e(d0Var, u, v, i3, i4);
        arrayList.add(eVar);
        return true;
    }

    /* renamed from: b */
    private final void m12848b(C3809a aVar) {
        if (aVar.mo13725d() != null) {
            m12845a(aVar, aVar.mo13725d());
        }
        if (aVar.mo13724c() != null) {
            m12845a(aVar, aVar.mo13724c());
        }
    }

    /* renamed from: b */
    public void mo4661b() {
        String str;
        int size = this.f9460j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = this.f9460j.get(size);
            Intrinsics.checkReturnedValueIsNotNull(obj, "pendingMoves[i]");
            C3813e eVar = (C3813e) obj;
            View view = eVar.mo13739c().itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "item.holder.itemView");
            C4187x.m14382d(view, 0.0f);
            C4187x.m14378c(view, 0.0f);
            mo5138j(eVar.mo13739c());
            this.f9460j.remove(size);
        }
        for (int size2 = this.f9458h.size() - 1; size2 >= 0; size2--) {
            Object obj2 = this.f9458h.get(size2);
            Intrinsics.checkReturnedValueIsNotNull(obj2, "pendingRemovals[i]");
            mo5140l((C0794d0) obj2);
            this.f9458h.remove(size2);
        }
        int size3 = this.f9459i.size();
        while (true) {
            size3--;
            str = "item.itemView";
            if (size3 < 0) {
                break;
            }
            Object obj3 = this.f9459i.get(size3);
            Intrinsics.checkReturnedValueIsNotNull(obj3, "pendingAdditions[i]");
            C0794d0 d0Var = (C0794d0) obj3;
            View view2 = d0Var.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
            m12837a(view2);
            mo5136h(d0Var);
            this.f9459i.remove(size3);
        }
        for (int size4 = this.f9461k.size() - 1; size4 >= 0; size4--) {
            Object obj4 = this.f9461k.get(size4);
            Intrinsics.checkReturnedValueIsNotNull(obj4, "pendingChanges[i]");
            m12848b((C3809a) obj4);
        }
        this.f9461k.clear();
        if (mo4672g()) {
            for (int size5 = this.f9463m.size() - 1; size5 >= 0; size5--) {
                Object obj5 = this.f9463m.get(size5);
                Intrinsics.checkReturnedValueIsNotNull(obj5, "movesList[i]");
                ArrayList arrayList = (ArrayList) obj5;
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    Object obj6 = arrayList.get(size6);
                    Intrinsics.checkReturnedValueIsNotNull(obj6, "moves[j]");
                    C3813e eVar2 = (C3813e) obj6;
                    View view3 = eVar2.mo13739c().itemView;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view3, str);
                    C4187x.m14382d(view3, 0.0f);
                    C4187x.m14378c(view3, 0.0f);
                    mo5138j(eVar2.mo13739c());
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9463m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9462l.size() - 1; size7 >= 0; size7--) {
                Object obj7 = this.f9462l.get(size7);
                Intrinsics.checkReturnedValueIsNotNull(obj7, "additionsList[i]");
                ArrayList arrayList2 = (ArrayList) obj7;
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    Object obj8 = arrayList2.get(size8);
                    Intrinsics.checkReturnedValueIsNotNull(obj8, "additions[j]");
                    C0794d0 d0Var2 = (C0794d0) obj8;
                    View view4 = d0Var2.itemView;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view4, str);
                    C4187x.m14351a(view4, 1.0f);
                    mo5136h(d0Var2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f9462l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9464n.size() - 1; size9 >= 0; size9--) {
                Object obj9 = this.f9464n.get(size9);
                Intrinsics.checkReturnedValueIsNotNull(obj9, "changesList[i]");
                ArrayList arrayList3 = (ArrayList) obj9;
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Object obj10 = arrayList3.get(size10);
                    Intrinsics.checkReturnedValueIsNotNull(obj10, "changes[j]");
                    m12848b((C3809a) obj10);
                    if (arrayList3.isEmpty()) {
                        this.f9464n.remove(arrayList3);
                    }
                }
            }
            mo13713a((List<? extends C0794d0>) this.f9467q);
            mo13713a((List<? extends C0794d0>) this.f9466p);
            mo13713a((List<? extends C0794d0>) this.f9465o);
            mo13713a((List<? extends C0794d0>) this.f9468r);
            mo4653a();
        }
    }

    /* renamed from: a */
    public boolean mo4983a(C0794d0 d0Var, C0794d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo4982a(d0Var, i, i2, i3, i4);
        }
        float u = C4187x.m14406u(d0Var.itemView);
        float v = C4187x.m14407v(d0Var.itemView);
        float e = C4187x.m14384e(d0Var.itemView);
        mo4666c(d0Var);
        int i5 = (int) ((((float) i3) - ((float) i)) - u);
        int i6 = (int) ((((float) i4) - ((float) i2)) - v);
        C4187x.m14378c(d0Var.itemView, u);
        C4187x.m14382d(d0Var.itemView, v);
        C4187x.m14351a(d0Var.itemView, e);
        if (!(d0Var2 == null || d0Var2.itemView == null)) {
            mo4666c(d0Var2);
            C4187x.m14378c(d0Var2.itemView, (float) (-i5));
            C4187x.m14382d(d0Var2.itemView, (float) (-i6));
            C4187x.m14351a(d0Var2.itemView, 0.0f);
        }
        ArrayList<C3809a> arrayList = this.f9461k;
        C3809a aVar = new C3809a(d0Var, d0Var2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12838a(C3809a aVar) {
        C0794d0 d = aVar.mo13725d();
        View view = null;
        View view2 = d != null ? d.itemView : null;
        C0794d0 c = aVar.mo13724c();
        if (c != null) {
            view = c.itemView;
        }
        if (view2 != null) {
            this.f9468r.add(d);
            C4135d0 a = C4187x.m14348a(view2);
            a.mo14705a(mo4668d());
            a.mo14711b((float) (aVar.mo13726e() - aVar.mo13720a()));
            a.mo14713c((float) (aVar.mo13727f() - aVar.mo13722b()));
            a.mo14704a(0.0f);
            a.mo14707a((C4140e0) new C3815g(this, aVar, a));
            a.mo14714c();
        }
        if (view != null) {
            this.f9468r.add(c);
            C4135d0 a2 = C4187x.m14348a(view);
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "ViewCompat.animate(newView)");
            a2.mo14711b(0.0f);
            a2.mo14713c(0.0f);
            a2.mo14705a(mo4668d());
            a2.mo14704a(1.0f);
            a2.mo14707a((C4140e0) new C3816h(this, aVar, a2, view));
            a2.mo14714c();
        }
    }

    /* renamed from: a */
    private final void m12844a(List<C3809a> list, C0794d0 d0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3809a aVar = (C3809a) list.get(size);
                if (m12845a(aVar, d0Var) && aVar.mo13725d() == null && aVar.mo13724c() == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m12845a(C3809a aVar, C0794d0 d0Var) {
        boolean z = false;
        if (aVar.mo13724c() == d0Var) {
            aVar.mo13721a(null);
        } else if (aVar.mo13725d() != d0Var) {
            return false;
        } else {
            aVar.mo13723b(null);
            z = true;
        }
        if (d0Var != null) {
            C4187x.m14351a(d0Var.itemView, 1.0f);
            C4187x.m14378c(d0Var.itemView, 0.0f);
            C4187x.m14382d(d0Var.itemView, 0.0f);
            mo5131a(d0Var, z);
            return true;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: a */
    public final void mo13713a(List<? extends C0794d0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4187x.m14348a(((C0794d0) list.get(size)).itemView).mo14709a();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12837a(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        ViewPropertyAnimator interpolator = view.animate().setInterpolator(null);
        Intrinsics.checkReturnedValueIsNotNull((Object) interpolator, "view.animate().setInterpolator(null)");
        interpolator.setStartDelay(0);
    }
}
