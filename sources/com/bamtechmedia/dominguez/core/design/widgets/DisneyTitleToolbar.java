package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0513i;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C0500b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5844l0;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ;2\u00020\u0001:\u0003;<=B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nJ \u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fJ\u0010\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u001dJ\u001c\u0010\"\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fJ\u001e\u0010$\u001a\u00020\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&J>\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140,2\b\b\u0002\u0010-\u001a\u00020\u00072\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fJs\u0010(\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000203\u0018\u00010,2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140,2\b\b\u0002\u0010-\u001a\u00020\u00072\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u000203J\u000e\u00106\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u001dJ*\u00109\u001a\u00020\u0007*\u00020/2\u0006\u0010:\u001a\u00020\u00072\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000203\u0018\u00010,H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012¨\u0006>"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAnimatedTitle", "", "maxShelfSize", "", "scrollHeaderSize", "value", "Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar$ToolbarBackButton;", "toolbarBackButton", "setToolbarBackButton", "(Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar$ToolbarBackButton;)V", "animateToolbar", "", "heightTop", "enableActionButton", "isEnabled", "enableBackButton", "hasBackButton", "hasChromeCast", "setActionButton", "title", "", "action", "Lkotlin/Function0;", "setActionTitle", "actionTitle", "setBackButton", "backAction", "setEachContentDescription", "backButtonContentDescription", "", "actionButtonContentDescription", "setInitAction", "scrollViewToAnimate", "Landroidx/core/widget/NestedScrollView;", "otherAnimation", "Lkotlin/Function1;", "delayedPxAnimation", "recyclerViewToAnimate", "Landroidx/recyclerview/widget/RecyclerView;", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "onTitleUpdate", "Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar$DisneyTitle;", "relatedToAnotherView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;)V", "setTitle", "disneyTitle", "titleString", "heightRelatedToAnotherView", "relatedView", "Companion", "DisneyTitle", "ToolbarBackButton", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DisneyTitleToolbar.kt */
public final class DisneyTitleToolbar extends ConstraintLayout {

    /* renamed from: r0 */
    private C5621c f13198r0;

    /* renamed from: s0 */
    private boolean f13199s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public final float f13200t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public final float f13201u0;

    /* renamed from: v0 */
    private HashMap f13202v0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$a */
    /* compiled from: DisneyTitleToolbar.kt */
    public static final class C5619a {
        private C5619a() {
        }

        public /* synthetic */ C5619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$b */
    /* compiled from: DisneyTitleToolbar.kt */
    public static final class C5620b {

        /* renamed from: a */
        private final String f13203a;

        /* renamed from: b */
        private final int f13204b;

        /* renamed from: c */
        private final Function0<C13145v> f13205c;

        public C5620b() {
            this(null, 0, null, 7, null);
        }

        public C5620b(String str, int i, Function0<C13145v> function0) {
            this.f13203a = str;
            this.f13204b = i;
            this.f13205c = function0;
        }

        /* renamed from: a */
        public final Function0<C13145v> mo17384a() {
            return this.f13205c;
        }

        /* renamed from: b */
        public final int mo17385b() {
            return this.f13204b;
        }

        /* renamed from: c */
        public final String mo17386c() {
            return this.f13203a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5620b) {
                    C5620b bVar = (C5620b) obj;
                    if (C12880j.m40224a((Object) this.f13203a, (Object) bVar.f13203a)) {
                        if (!(this.f13204b == bVar.f13204b) || !C12880j.m40224a((Object) this.f13205c, (Object) bVar.f13205c)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f13203a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f13204b) * 31;
            Function0<C13145v> function0 = this.f13205c;
            if (function0 != null) {
                i = function0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DisneyTitle(text=");
            sb.append(this.f13203a);
            sb.append(", drawableEnd=");
            sb.append(this.f13204b);
            sb.append(", clickAction=");
            sb.append(this.f13205c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C5620b(String str, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                function0 = null;
            }
            this(str, i, function0);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$c */
    /* compiled from: DisneyTitleToolbar.kt */
    public enum C5621c {
        BACK_BUTTON(C3838h.backButton),
        CLOSE_BUTTON(C3838h.closeButton),
        BLACK_BACK_BUTTON(C3838h.blackBackButton);
        

        /* renamed from: c */
        private final int f13210c;

        private C5621c(int i) {
            this.f13210c = i;
        }

        /* renamed from: a */
        public final int mo17390a() {
            return this.f13210c;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$d */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5622d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13211c;

        C5622d(Function0 function0) {
            this.f13211c = function0;
        }

        public final void onClick(View view) {
            this.f13211c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$e */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5623e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13212c;

        C5623e(Function0 function0) {
            this.f13212c = function0;
        }

        public final void onClick(View view) {
            this.f13212c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$f */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5624f extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: c */
        public static final C5624f f13213c = new C5624f();

        C5624f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$g */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5625g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5625g f13214c = new C5625g();

        C5625g() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$h */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5626h extends C12881k implements Function1<WindowInsets, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C3848a f13215U;

        /* renamed from: c */
        final /* synthetic */ DisneyTitleToolbar f13216c;

        C5626h(DisneyTitleToolbar disneyTitleToolbar, C3848a aVar) {
            this.f13216c = disneyTitleToolbar;
            this.f13215U = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17394a(WindowInsets windowInsets) {
            C3848a aVar = this.f13215U;
            if (aVar != null) {
                View c = this.f13216c.mo2145c(C3838h.toolbarBackground);
                String str = "toolbarBackground";
                C12880j.m40222a((Object) c, str);
                View c2 = this.f13216c.mo2145c(C3838h.toolbarBackground);
                C12880j.m40222a((Object) c2, str);
                aVar.mo13765a(c, c2.getHeight());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17394a((WindowInsets) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$i */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5627i implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13217c;

        C5627i(Function0 function0) {
            this.f13217c = function0;
        }

        public final void onClick(View view) {
            this.f13217c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$j */
    /* compiled from: DisneyTitleToolbar.kt */
    public static final class C5628j extends C0817t {

        /* renamed from: a */
        final /* synthetic */ DisneyTitleToolbar f13218a;

        /* renamed from: b */
        final /* synthetic */ Integer f13219b;

        /* renamed from: c */
        final /* synthetic */ int f13220c;

        /* renamed from: d */
        final /* synthetic */ Function1 f13221d;

        /* renamed from: e */
        final /* synthetic */ Function1 f13222e;

        C5628j(DisneyTitleToolbar disneyTitleToolbar, Integer num, int i, Function1 function1, Function1 function12) {
            this.f13218a = disneyTitleToolbar;
            this.f13219b = num;
            this.f13220c = i;
            this.f13221d = function1;
            this.f13222e = function12;
        }

        /* renamed from: a */
        public void mo4784a(RecyclerView recyclerView, int i, int i2) {
            Integer num = this.f13219b;
            if (num == null) {
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() - this.f13220c;
                DisneyTitleToolbar disneyTitleToolbar = this.f13218a;
                disneyTitleToolbar.m18442a(computeVerticalScrollOffset, disneyTitleToolbar.f13201u0);
                this.f13221d.invoke(Integer.valueOf(computeVerticalScrollOffset));
                return;
            }
            int a = this.f13218a.m18440a(recyclerView, num.intValue(), this.f13222e) - this.f13220c;
            DisneyTitleToolbar disneyTitleToolbar2 = this.f13218a;
            disneyTitleToolbar2.m18442a(a, disneyTitleToolbar2.f13200t0);
            this.f13221d.invoke(Integer.valueOf(a));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$k */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5629k extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: c */
        public static final C5629k f13223c = new C5629k();

        C5629k() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$l */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5630l extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5630l f13224c = new C5630l();

        C5630l() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$m */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5631m implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13225c;

        C5631m(Function0 function0) {
            this.f13225c = function0;
        }

        public final void onClick(View view) {
            this.f13225c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$n */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5632n implements C0500b {

        /* renamed from: a */
        final /* synthetic */ DisneyTitleToolbar f13226a;

        /* renamed from: b */
        final /* synthetic */ NestedScrollView f13227b;

        /* renamed from: c */
        final /* synthetic */ int f13228c;

        /* renamed from: d */
        final /* synthetic */ Function1 f13229d;

        C5632n(DisneyTitleToolbar disneyTitleToolbar, NestedScrollView nestedScrollView, int i, Function1 function1) {
            this.f13226a = disneyTitleToolbar;
            this.f13227b = nestedScrollView;
            this.f13228c = i;
            this.f13229d = function1;
        }

        /* renamed from: a */
        public final void mo358a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            int computeVerticalScrollOffset = this.f13227b.computeVerticalScrollOffset() - this.f13228c;
            DisneyTitleToolbar disneyTitleToolbar = this.f13226a;
            disneyTitleToolbar.m18442a(computeVerticalScrollOffset, disneyTitleToolbar.f13201u0);
            this.f13229d.invoke(Integer.valueOf(computeVerticalScrollOffset));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar$o */
    /* compiled from: DisneyTitleToolbar.kt */
    static final class C5633o implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13230c;

        C5633o(Function0 function0) {
            this.f13230c = function0;
        }

        public final void onClick(View view) {
            this.f13230c.invoke();
        }
    }

    static {
        new C5619a(null);
    }

    public DisneyTitleToolbar(Context context) {
        this(context, null, 0, 6, null);
    }

    public DisneyTitleToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DisneyTitleToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final void setToolbarBackButton(C5621c cVar) {
        View c = mo2145c(C3838h.closeButtonLayout);
        C12880j.m40222a((Object) c, "closeButtonLayout");
        boolean z = true;
        int i = 0;
        c.setVisibility(cVar != C5621c.CLOSE_BUTTON ? 4 : 0);
        View c2 = mo2145c(C3838h.backButtonLayout);
        C12880j.m40222a((Object) c2, "backButtonLayout");
        c2.setVisibility(cVar != C5621c.BACK_BUTTON ? 4 : 0);
        View c3 = mo2145c(C3838h.blackBackButtonLayout);
        C12880j.m40222a((Object) c3, "blackBackButtonLayout");
        if (cVar == C5621c.BLACK_BACK_BUTTON) {
            z = false;
        }
        if (z) {
            i = 4;
        }
        c3.setVisibility(i);
        this.f13198r0 = cVar;
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13202v0 == null) {
            this.f13202v0 = new HashMap();
        }
        View view = (View) this.f13202v0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13202v0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final void mo17380c(boolean z) {
        View c = mo2145c(C3838h.spacingNoButton);
        C12880j.m40222a((Object) c, "spacingNoButton");
        int i = 0;
        c.setVisibility(z ^ true ? 0 : 8);
        String str = "blackBackButtonLayout";
        String str2 = "backButtonLayout";
        String str3 = "closeButtonLayout";
        if (z) {
            View c2 = mo2145c(C3838h.closeButtonLayout);
            C12880j.m40222a((Object) c2, str3);
            boolean z2 = true;
            c2.setVisibility(this.f13198r0 != C5621c.CLOSE_BUTTON ? 4 : 0);
            View c3 = mo2145c(C3838h.backButtonLayout);
            C12880j.m40222a((Object) c3, str2);
            c3.setVisibility(this.f13198r0 != C5621c.BACK_BUTTON ? 4 : 0);
            View c4 = mo2145c(C3838h.blackBackButtonLayout);
            C12880j.m40222a((Object) c4, str);
            if (this.f13198r0 == C5621c.BLACK_BACK_BUTTON) {
                z2 = false;
            }
            if (z2) {
                i = 4;
            }
            c4.setVisibility(i);
            return;
        }
        View c5 = mo2145c(C3838h.closeButtonLayout);
        C12880j.m40222a((Object) c5, str3);
        c5.setVisibility(8);
        View c6 = mo2145c(C3838h.backButtonLayout);
        C12880j.m40222a((Object) c6, str2);
        c6.setVisibility(8);
        View c7 = mo2145c(C3838h.blackBackButtonLayout);
        C12880j.m40222a((Object) c7, str);
        c7.setVisibility(8);
    }

    public final void setActionTitle(String str) {
        TextView textView = (TextView) mo2145c(C3838h.actionButton);
        C12880j.m40222a((Object) textView, "actionButton");
        textView.setText(str);
    }

    public final void setTitle(String str) {
        TextView textView = (TextView) mo2145c(C3838h.title);
        String str2 = "title";
        C12880j.m40222a((Object) textView, str2);
        textView.setText(str);
        TextView textView2 = (TextView) mo2145c(C3838h.title);
        C12880j.m40222a((Object) textView2, str2);
        C5844l0.m18863a(textView2, 0, 0, 0, 0, 11, null);
        ((TextView) mo2145c(C3838h.title)).setOnClickListener(null);
    }

    public DisneyTitleToolbar(Context context, AttributeSet attributeSet, int i) {
        C5621c cVar;
        super(context, attributeSet, i);
        this.f13198r0 = C5621c.BACK_BUTTON;
        this.f13200t0 = context.getResources().getDimension(C3835e.toolbar_max_shelf_size);
        this.f13201u0 = context.getResources().getDimension(C3835e.toolbar_height);
        ViewGroup.inflate(context, C3840j.disney_title_toolbar, this);
        int[] iArr = C3843m.DisneyTitleToolbar;
        C12880j.m40222a((Object) iArr, "R.styleable.DisneyTitleToolbar");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        TextView textView = (TextView) mo2145c(C3838h.title);
        String str = "title";
        C12880j.m40222a((Object) textView, str);
        textView.setText(C5880u.m18939a(obtainStyledAttributes, C3843m.DisneyTitleToolbar_toolbarTitleText, isInEditMode()));
        TextView textView2 = (TextView) mo2145c(C3838h.actionButton);
        C12880j.m40222a((Object) textView2, "actionButton");
        textView2.setText(C5880u.m18939a(obtainStyledAttributes, C3843m.DisneyTitleToolbar_toolbarActionText, isInEditMode()));
        int i2 = obtainStyledAttributes.getInt(C3843m.DisneyTitleToolbar_toolbarBackButtonStyle, 0);
        if (i2 == 0) {
            cVar = C5621c.BACK_BUTTON;
        } else if (i2 == 1) {
            cVar = C5621c.CLOSE_BUTTON;
        } else if (i2 != 2) {
            cVar = C5621c.BACK_BUTTON;
        } else {
            cVar = C5621c.BLACK_BACK_BUTTON;
        }
        setToolbarBackButton(cVar);
        this.f13199s0 = obtainStyledAttributes.getBoolean(C3843m.DisneyTitleToolbar_toolbarIsTitleAnimate, false);
        int resourceId = obtainStyledAttributes.getResourceId(C3843m.DisneyTitleToolbar_toolbarTitleTextAppearance, 0);
        if (resourceId != 0) {
            C0513i.m2778d((TextView) mo2145c(C3838h.title), resourceId);
        }
        obtainStyledAttributes.recycle();
        View c = mo2145c(C3838h.toolbarBackground);
        C12880j.m40222a((Object) c, "toolbarBackground");
        float f = 0.0f;
        c.setAlpha(0.0f);
        View c2 = mo2145c(C3838h.separator);
        C12880j.m40222a((Object) c2, "separator");
        c2.setAlpha(0.0f);
        TextView textView3 = (TextView) mo2145c(C3838h.title);
        C12880j.m40222a((Object) textView3, str);
        if (!this.f13199s0) {
            f = 1.0f;
        }
        textView3.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo17379b(boolean z) {
        View findViewById = findViewById(this.f13198r0.mo17390a());
        C12880j.m40222a((Object) findViewById, "findViewById<View>(toolbarBackButton.buttonId)");
        findViewById.setEnabled(z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18445a(DisneyTitleToolbar disneyTitleToolbar, RecyclerView recyclerView, C3848a aVar, Function1 function1, Integer num, Function1 function12, int i, Function0 function0, int i2, Object obj) {
        Integer num2 = null;
        C3848a aVar2 = (i2 & 2) != 0 ? null : aVar;
        Function1 function13 = (i2 & 4) != 0 ? null : function1;
        if ((i2 & 8) == 0) {
            num2 = num;
        }
        disneyTitleToolbar.mo17374a(recyclerView, aVar2, function13, num2, (i2 & 16) != 0 ? C5624f.f13213c : function12, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? C5625g.f13214c : function0);
    }

    public final void setTitle(C5620b bVar) {
        TextView textView = (TextView) mo2145c(C3838h.title);
        String str = "title";
        C12880j.m40222a((Object) textView, str);
        if (!C12880j.m40224a((Object) textView.getText(), (Object) bVar.mo17386c())) {
            TextView textView2 = (TextView) mo2145c(C3838h.title);
            C12880j.m40222a((Object) textView2, str);
            textView2.setText(bVar.mo17386c());
            TextView textView3 = (TextView) mo2145c(C3838h.title);
            C12880j.m40222a((Object) textView3, str);
            C5844l0.m18863a(textView3, 0, 0, bVar.mo17385b(), 0, 11, null);
            Function0 a = bVar.mo17384a();
            if (a != null) {
                ((TextView) mo2145c(C3838h.title)).setOnClickListener(new C5633o(a));
            } else {
                ((TextView) mo2145c(C3838h.title)).setOnClickListener(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo17374a(RecyclerView recyclerView, C3848a aVar, Function1<? super Integer, C5620b> function1, Integer num, Function1<? super Integer, C13145v> function12, int i, Function0<C13145v> function0) {
        if (aVar != null) {
            View c = mo2145c(C3838h.toolbarBackground);
            C12880j.m40222a((Object) c, "toolbarBackground");
            c.setBackground(null);
        }
        LinearLayout linearLayout = (LinearLayout) mo2145c(C3838h.contentToolbarLayout);
        C12880j.m40222a((Object) linearLayout, "contentToolbarLayout");
        C5852n0.m18884a(linearLayout, false, false, new C5626h(this, aVar), 1, null);
        findViewById(this.f13198r0.mo17390a()).setOnClickListener(new C5627i(function0));
        if (function1 != null) {
            C5620b bVar = (C5620b) function1.invoke(Integer.valueOf(0));
        }
        C5628j jVar = new C5628j(this, num, i, function12, function1);
        recyclerView.mo4385a((C0817t) jVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18444a(DisneyTitleToolbar disneyTitleToolbar, NestedScrollView nestedScrollView, Function1 function1, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = C5629k.f13223c;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            function0 = C5630l.f13224c;
        }
        disneyTitleToolbar.mo17373a(nestedScrollView, function1, i, function0);
    }

    /* renamed from: a */
    public final void mo17373a(NestedScrollView nestedScrollView, Function1<? super Integer, C13145v> function1, int i, Function0<C13145v> function0) {
        LinearLayout linearLayout = (LinearLayout) mo2145c(C3838h.contentToolbarLayout);
        C12880j.m40222a((Object) linearLayout, "contentToolbarLayout");
        C5852n0.m18884a(linearLayout, false, false, null, 5, null);
        findViewById(this.f13198r0.mo17390a()).setOnClickListener(new C5631m(function0));
        nestedScrollView.setOnScrollChangeListener(new C5632n(this, nestedScrollView, i, function1));
    }

    /* renamed from: a */
    public static /* synthetic */ void m18447a(DisneyTitleToolbar disneyTitleToolbar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        disneyTitleToolbar.mo17377a(str, function0);
    }

    /* renamed from: a */
    public final void mo17377a(String str, Function0<C13145v> function0) {
        String str2 = "actionButton";
        if (str != null) {
            TextView textView = (TextView) mo2145c(C3838h.actionButton);
            C12880j.m40222a((Object) textView, str2);
            textView.setText(str);
        }
        TextView textView2 = (TextView) mo2145c(C3838h.actionButton);
        C12880j.m40222a((Object) textView2, str2);
        textView2.setVisibility(0);
        ((TextView) mo2145c(C3838h.actionButton)).setOnClickListener(new C5622d(function0));
    }

    /* renamed from: a */
    public final void mo17375a(C5621c cVar, Function0<C13145v> function0) {
        setToolbarBackButton(cVar);
        findViewById(cVar.mo17390a()).setOnClickListener(new C5623e(function0));
    }

    /* renamed from: a */
    public final void mo17378a(boolean z) {
        TextView textView = (TextView) mo2145c(C3838h.actionButton);
        C12880j.m40222a((Object) textView, "actionButton");
        textView.setEnabled(z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18446a(DisneyTitleToolbar disneyTitleToolbar, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        disneyTitleToolbar.mo17376a(charSequence, charSequence2);
    }

    /* renamed from: a */
    public final void mo17376a(CharSequence charSequence, CharSequence charSequence2) {
        View c = mo2145c(C3838h.backButtonLayout);
        C12880j.m40222a((Object) c, "backButtonLayout");
        c.setContentDescription(charSequence);
        View c2 = mo2145c(C3838h.blackBackButtonLayout);
        C12880j.m40222a((Object) c2, "blackBackButtonLayout");
        c2.setContentDescription(charSequence);
        View c3 = mo2145c(C3838h.closeButtonLayout);
        C12880j.m40222a((Object) c3, "closeButtonLayout");
        c3.setContentDescription(charSequence);
        TextView textView = (TextView) mo2145c(C3838h.actionButton);
        C12880j.m40222a((Object) textView, "actionButton");
        textView.setContentDescription(charSequence2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18442a(int i, float f) {
        float a = C12762h.m39912a(((float) i) / f, 1.0f);
        View c = mo2145c(C3838h.toolbarBackground);
        C12880j.m40222a((Object) c, "toolbarBackground");
        c.setAlpha(a);
        View c2 = mo2145c(C3838h.separator);
        C12880j.m40222a((Object) c2, "separator");
        c2.setAlpha(a);
        if (this.f13199s0) {
            TextView textView = (TextView) mo2145c(C3838h.title);
            C12880j.m40222a((Object) textView, "title");
            textView.setAlpha(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m18440a(RecyclerView recyclerView, int i, Function1<? super Integer, C5620b> function1) {
        C0808o layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int I = linearLayoutManager != null ? linearLayoutManager.mo4319I() : 0;
        if (function1 != null) {
            setTitle((C5620b) function1.invoke(Integer.valueOf(I)));
        }
        View findViewById = recyclerView.findViewById(i);
        int a = findViewById != null ? C5852n0.m18876a(findViewById, (View) recyclerView) : 0;
        if (I < 0) {
            return 0;
        }
        if (I > 0) {
            return (int) this.f13200t0;
        }
        float f = (float) a;
        float f2 = this.f13200t0;
        if (f >= f2) {
            return 0;
        }
        if (f < f2) {
            f2 = (f2 - f) * ((float) 2);
        }
        return (int) f2;
    }
}
