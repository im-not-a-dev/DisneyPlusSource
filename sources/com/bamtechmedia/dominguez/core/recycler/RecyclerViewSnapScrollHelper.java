package com.bamtechmedia.dominguez.core.recycler;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.C0888m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import com.bamtechmedia.dominguez.core.p215k.C5758a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.core.utils.C5886z;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J=\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00192%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001eJ\"\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020$H\u0016J\u0018\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006,"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "focusDirectionMapper", "Lcom/bamtechmedia/dominguez/core/focus/FocusDirectionMapper;", "isTelevision", "", "(Lcom/bamtechmedia/dominguez/core/focus/FocusDirectionMapper;Z)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "snapType", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;", "getSnapType", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;", "setSnapType", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;)V", "createSmoothScroller", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;", "context", "Landroid/content/Context;", "targetPosition", "", "createSmoothScroller$core_utils_release", "handleFocusChange", "", "newFocus", "Landroid/view/View;", "handleOnKeyDown", "keyCode", "currentFocus", "pinScrollWindowForPosition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "init", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "owner", "scrollToPosition", "v", "Companion", "SmoothScroller", "SnapType", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RecyclerViewSnapScrollHelper.kt */
public final class RecyclerViewSnapScrollHelper implements C0710d {

    /* renamed from: U */
    private C5805c f13584U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C5758a f13585V;

    /* renamed from: W */
    private final boolean f13586W;

    /* renamed from: c */
    private RecyclerView f13587c;

    /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$a */
    /* compiled from: RecyclerViewSnapScrollHelper.kt */
    public static final class C5802a {
        private C5802a() {
        }

        public /* synthetic */ C5802a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0014J\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "snapType", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;)V", "calculateDtToFit", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateTimeForScrolling", "dx", "getScrollOffset", "scrollOffsetDimenRes", "(Landroid/content/Context;Ljava/lang/Integer;)I", "getVerticalSnapPreference", "Companion", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$b */
    /* compiled from: RecyclerViewSnapScrollHelper.kt */
    public static final class C5803b extends C0888m {

        /* renamed from: o */
        private final Context f13588o;

        /* renamed from: p */
        private final C5805c f13589p;

        /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$b$a */
        /* compiled from: RecyclerViewSnapScrollHelper.kt */
        public static final class C5804a {
            private C5804a() {
            }

            public /* synthetic */ C5804a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C5804a(null);
        }

        public C5803b(Context context, C5805c cVar) {
            super(context);
            this.f13588o = context;
            this.f13589p = cVar;
        }

        /* renamed from: a */
        public int mo5100a(int i, int i2, int i3, int i4, int i5) {
            int a;
            int i6;
            C5805c cVar = this.f13589p;
            if (cVar instanceof C5806a) {
                a = i3 + ((i4 - i3) / 2);
                i6 = (i2 - i) / 2;
            } else if (cVar instanceof C5807b) {
                int b = i3 - ((C5807b) cVar).mo17713b();
                a = b + (((i4 + ((C5807b) this.f13589p).mo17712a()) - b) / 2);
                i6 = (i2 - i) / 2;
            } else if (cVar instanceof C5808c) {
                return (i3 - i) + m18784a(this.f13588o, ((C5808c) cVar).mo17717a());
            } else {
                return super.mo5100a(i, i2, i3, i4, i5);
            }
            return a - (i + i6);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo3935e(int i) {
            return super.mo3935e(i) * 4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public int mo5105j() {
            if (this.f13589p instanceof C5808c) {
                return -1;
            }
            return super.mo5105j();
        }

        /* renamed from: a */
        private final int m18784a(Context context, Integer num) {
            if (num != null) {
                return context.getResources().getDimensionPixelOffset(num.intValue());
            }
            return 1;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType;", "", "()V", "Center", "CenterNoInsets", "Start", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType$Start;", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType$Center;", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper$SnapType$CenterNoInsets;", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$c */
    /* compiled from: RecyclerViewSnapScrollHelper.kt */
    public static abstract class C5805c {

        /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$c$a */
        /* compiled from: RecyclerViewSnapScrollHelper.kt */
        public static final class C5806a extends C5805c {

            /* renamed from: a */
            public static final C5806a f13590a = new C5806a();

            private C5806a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$c$b */
        /* compiled from: RecyclerViewSnapScrollHelper.kt */
        public static final class C5807b extends C5805c {

            /* renamed from: a */
            private final int f13591a;

            /* renamed from: b */
            private final int f13592b;

            public C5807b() {
                this(0, 0, 3, null);
            }

            public C5807b(int i, int i2) {
                super(null);
                this.f13591a = i;
                this.f13592b = i2;
            }

            /* renamed from: a */
            public final int mo17712a() {
                return this.f13592b;
            }

            /* renamed from: b */
            public final int mo17713b() {
                return this.f13591a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5807b) {
                        C5807b bVar = (C5807b) obj;
                        if (this.f13591a == bVar.f13591a) {
                            if (this.f13592b == bVar.f13592b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (this.f13591a * 31) + this.f13592b;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CenterNoInsets(topInset=");
                sb.append(this.f13591a);
                sb.append(", bottomInset=");
                sb.append(this.f13592b);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C5807b(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i3 & 1) != 0) {
                    i = 0;
                }
                if ((i3 & 2) != 0) {
                    i2 = 0;
                }
                this(i, i2);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$c$c */
        /* compiled from: RecyclerViewSnapScrollHelper.kt */
        public static final class C5808c extends C5805c {

            /* renamed from: a */
            private final Integer f13593a;

            public C5808c() {
                this(null, 1, null);
            }

            public C5808c(Integer num) {
                super(null);
                this.f13593a = num;
            }

            /* renamed from: a */
            public final Integer mo17717a() {
                return this.f13593a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f13593a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c) r2).f13593a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$c$c r2 = (com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c) r2
                    java.lang.Integer r0 = r1.f13593a
                    java.lang.Integer r2 = r2.f13593a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                Integer num = this.f13593a;
                if (num != null) {
                    return num.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Start(scrollOffsetDimenRes=");
                sb.append(this.f13593a);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C5808c(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    num = null;
                }
                this(num);
            }
        }

        private C5805c() {
        }

        public /* synthetic */ C5805c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$d */
    /* compiled from: RecyclerViewSnapScrollHelper.kt */
    static final class C5809d extends C12881k implements Function2<View, Integer, C13145v> {

        /* renamed from: U */
        final /* synthetic */ RecyclerViewSnapScrollHelper f13594U;

        /* renamed from: V */
        final /* synthetic */ View f13595V;

        /* renamed from: W */
        final /* synthetic */ int f13596W;

        /* renamed from: X */
        final /* synthetic */ Function1 f13597X;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f13598c;

        C5809d(RecyclerView recyclerView, RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper, View view, int i, Function1 function1) {
            this.f13598c = recyclerView;
            this.f13594U = recyclerViewSnapScrollHelper;
            this.f13595V = view;
            this.f13596W = i;
            this.f13597X = function1;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
            if (((java.lang.Boolean) r1.invoke(java.lang.Integer.valueOf(r0))).booleanValue() == true) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4 != null ? r4.getTag(com.bamtechmedia.dominguez.core.utils.C5886z.focusHelperPinScrollWindow) : null, (java.lang.Object) java.lang.Boolean.valueOf(true)) != false) goto L_0x0057;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo17721a(android.view.View r7, int r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r6.f13598c
                int r7 = r0.mo4430e(r7)
                com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper r0 = r6.f13594U
                com.bamtechmedia.dominguez.core.k.a r0 = r0.f13585V
                int r1 = r6.f13596W
                int r0 = r0.mo17639b(r1, r7)
                com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper r1 = r6.f13594U
                com.bamtechmedia.dominguez.core.k.a r1 = r1.f13585V
                int r2 = r6.f13596W
                boolean r1 = r1.mo17641c(r2)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x003f
                android.view.View r4 = r6.f13595V
                int r5 = r6.f13596W
                android.view.View r4 = r4.focusSearch(r5)
                if (r4 == 0) goto L_0x0033
                int r5 = com.bamtechmedia.dominguez.core.utils.C5886z.focusHelperPinScrollWindow
                java.lang.Object r4 = r4.getTag(r5)
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 == 0) goto L_0x003f
                goto L_0x0057
            L_0x003f:
                if (r1 == 0) goto L_0x0056
                kotlin.jvm.functions.Function1 r1 = r6.f13597X
                if (r1 == 0) goto L_0x0056
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r1.invoke(r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != r3) goto L_0x0056
                goto L_0x0057
            L_0x0056:
                r3 = 0
            L_0x0057:
                if (r3 == 0) goto L_0x0061
                com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper r7 = r6.f13594U
                androidx.recyclerview.widget.RecyclerView r8 = r6.f13598c
                r7.m18770a(r8, r2)
                goto L_0x006f
            L_0x0061:
                if (r0 >= 0) goto L_0x0064
                goto L_0x006f
            L_0x0064:
                if (r8 <= r0) goto L_0x006f
                if (r0 == r7) goto L_0x006f
                com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper r7 = r6.f13594U
                androidx.recyclerview.widget.RecyclerView r8 = r6.f13598c
                r7.m18770a(r8, r0)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5809d.mo17721a(android.view.View, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo17721a((View) obj, ((Number) obj2).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper$e */
    /* compiled from: RecyclerViewSnapScrollHelper.kt */
    static final class C5810e implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C0808o f13599U;

        /* renamed from: V */
        final /* synthetic */ RecyclerView f13600V;

        /* renamed from: W */
        final /* synthetic */ int f13601W;

        /* renamed from: c */
        final /* synthetic */ RecyclerViewSnapScrollHelper f13602c;

        C5810e(RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper, C0808o oVar, RecyclerView recyclerView, int i) {
            this.f13602c = recyclerViewSnapScrollHelper;
            this.f13599U = oVar;
            this.f13600V = recyclerView;
            this.f13601W = i;
        }

        public final void run() {
            C0808o oVar = this.f13599U;
            RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f13602c;
            Context context = this.f13600V.getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "v.context");
            oVar.mo3877b(recyclerViewSnapScrollHelper.mo17707a(context, this.f13601W));
        }
    }

    static {
        new C5802a(null);
    }

    public RecyclerViewSnapScrollHelper(C5758a aVar, boolean z) {
        this.f13585V = aVar;
        this.f13586W = z;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
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
        this.f13587c = null;
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: a */
    public final void mo17711a(C5805c cVar) {
        this.f13584U = cVar;
    }

    /* renamed from: a */
    public final void mo17710a(C0722m mVar, RecyclerView recyclerView, C5805c cVar) {
        if (this.f13586W) {
            this.f13587c = recyclerView;
            this.f13584U = cVar;
            mVar.getLifecycle().mo4134a(this);
        }
    }

    /* renamed from: a */
    public final void mo17709a(View view) {
        RecyclerView recyclerView = this.f13587c;
        if (recyclerView != null) {
            View c = recyclerView.mo4407c(view);
            if (c != null) {
                int e = recyclerView.mo4430e(c);
                if (Intrinsics.areEqual(view.getTag(C5886z.focusHelperPinScrollWindow), (Object) Boolean.valueOf(true))) {
                    e = 0;
                }
                m18770a(recyclerView, e);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18771a(RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper, int i, View view, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        recyclerViewSnapScrollHelper.mo17708a(i, view, function1);
    }

    /* renamed from: a */
    public final void mo17708a(int i, View view, Function1<? super Integer, Boolean> function1) {
        int d = this.f13585V.mo17642d(i);
        RecyclerView recyclerView = this.f13587c;
        Object obj = null;
        if (recyclerView != null) {
            View c = recyclerView.mo4407c(view);
            C0797g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                obj = Integer.valueOf(adapter.getItemCount());
            }
            C5809d dVar = new C5809d(recyclerView, this, view, d, function1);
            C5884x.m18949a(c, obj, dVar);
            obj = Boolean.valueOf(false);
        }
        C5884x.m18950a(obj, "Make sure RecyclerViewSnapScrollHelper is initialized before invoking handleOnKeyDown()");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18770a(RecyclerView recyclerView, int i) {
        C0808o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            recyclerView.post(new C5810e(this, layoutManager, recyclerView, i));
        }
    }

    /* renamed from: a */
    public final C0825z mo17707a(Context context, int i) {
        C5803b bVar = new C5803b(context, this.f13584U);
        bVar.mo4846c(i);
        return bVar;
    }
}
