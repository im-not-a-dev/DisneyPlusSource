package com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.C0358s.C0360b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout.C0317d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0513i;
import com.bamtechmedia.dominguez.core.design.widgets.ThemedTintCompatImageView;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3842l;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4121a0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0002J\u001a\u0010\u001a\u001a\u00020\u0010*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0014J\f\u0010\u001e\u001a\u00020\u0010*\u00020\u001bH\u0014J\u0014\u0010\u001f\u001a\u00020\u0010*\u00020\u001b2\u0006\u0010 \u001a\u00020\nH\u0014R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\f\u001a\u00020\u0007*\u00020\u00078Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyTvNavigationBar;", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isExpanded", "", "()Z", "accessibilityImportanceState", "getAccessibilityImportanceState", "(I)I", "registerAccessibilityDelegate", "", "setNavigationBackground", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setState", "navState", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyTvNavigationBar$NavState;", "translateNavState", "state", "animate", "setPlatformRelatedItem", "Landroid/view/View;", "onClick", "Lkotlin/Function0;", "setPlatformRelatedProfileItem", "updatePlatformRelatedItem", "isSelected", "NavState", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DisneyTvNavigationBar.kt */
public final class DisneyTvNavigationBar extends C5673a {

    /* renamed from: u0 */
    private HashMap f13304u0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar$a */
    /* compiled from: DisneyTvNavigationBar.kt */
    public static final class C5668a implements C0317d {

        /* renamed from: a */
        private Integer f13305a;

        /* renamed from: b */
        private boolean f13306b;

        /* renamed from: c */
        final /* synthetic */ DisneyTvNavigationBar f13307c;

        C5668a(DisneyTvNavigationBar disneyTvNavigationBar) {
            this.f13307c = disneyTvNavigationBar;
        }

        /* renamed from: a */
        public void mo2188a(MotionLayout motionLayout, int i, int i2) {
            this.f13305a = Integer.valueOf(i2);
        }

        /* renamed from: a */
        public void mo2190a(MotionLayout motionLayout, int i, boolean z, float f) {
        }

        /* renamed from: a */
        public boolean mo2191a(C0360b bVar) {
            return true;
        }

        /* renamed from: a */
        public void mo2189a(MotionLayout motionLayout, int i, int i2, float f) {
            Integer num = this.f13305a;
            if (num == null || num.intValue() != i2) {
                this.f13306b = true;
            }
        }

        /* renamed from: a */
        public void mo2187a(MotionLayout motionLayout, int i) {
            if (!this.f13306b) {
                Integer num = this.f13305a;
                if (num != null && num.intValue() == i) {
                    return;
                }
            }
            this.f13307c.m18518a(i, false);
            this.f13305a = null;
            this.f13306b = false;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar$b */
    /* compiled from: DisneyTvNavigationBar.kt */
    public enum C5669b {
        HIDDEN,
        DISABLED,
        COLLAPSED,
        EXPANDED
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar$c */
    /* compiled from: DisneyTvNavigationBar.kt */
    public static final class C5670c extends AccessibilityDelegate {

        /* renamed from: a */
        final /* synthetic */ DisneyTvNavigationBar f13313a;

        C5670c(DisneyTvNavigationBar disneyTvNavigationBar) {
            this.f13313a = disneyTvNavigationBar;
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            boolean onRequestSendAccessibilityEvent = super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 32768 && !this.f13313a.m18522c()) {
                DisneyTvNavigationBar.m18521a(this.f13313a, C3838h.expanded, false, 2, null);
            }
            return onRequestSendAccessibilityEvent;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar$d */
    /* compiled from: DisneyTvNavigationBar.kt */
    static final class C5671d implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ Function0 f13314U;

        /* renamed from: c */
        final /* synthetic */ DisneyTvNavigationBar f13315c;

        C5671d(DisneyTvNavigationBar disneyTvNavigationBar, Function0 function0) {
            this.f13315c = disneyTvNavigationBar;
            this.f13314U = function0;
        }

        public final void onClick(View view) {
            this.f13314U.invoke();
            this.f13315c.mo17493a(C5669b.COLLAPSED);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar$e */
    /* compiled from: DisneyTvNavigationBar.kt */
    static final class C5672e implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ View f13316c;

        C5672e(View view) {
            this.f13316c = view;
        }

        public final void onFocusChange(View view, boolean z) {
            ImageView imageView = (ImageView) this.f13316c.findViewById(C3838h.profileImageFocus);
            C12880j.m40222a((Object) imageView, "profileImageFocus");
            float f = 1.0f;
            imageView.setAlpha(z ? 1.0f : 0.0f);
            ImageView imageView2 = (ImageView) this.f13316c.findViewById(C3838h.profileImage);
            C12880j.m40222a((Object) imageView2, "profileImage");
            if (!z) {
                f = 0.6f;
            }
            imageView2.setAlpha(f);
        }
    }

    public DisneyTvNavigationBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public DisneyTvNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DisneyTvNavigationBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m18522c() {
        MotionLayout motionLayout = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
        return motionLayout != null && motionLayout.getCurrentState() == C3838h.expanded;
    }

    /* renamed from: d */
    private final void m18523d() {
        setAccessibilityDelegate(new C5670c(this));
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13304u0 == null) {
            this.f13304u0 = new HashMap();
        }
        View view = (View) this.f13304u0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13304u0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void setNavigationBackground(C3848a aVar) {
        if (aVar != null) {
            View c = mo2145c(C3838h.sideMenuGradientBackground);
            C12880j.m40222a((Object) c, "sideMenuGradientBackground");
            aVar.mo13764a(c);
        }
    }

    /* access modifiers changed from: protected */
    public void setPlatformRelatedProfileItem(View view) {
        view.setOnFocusChangeListener(new C5672e(view));
    }

    public DisneyTvNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C3840j.disney_tv_navigation_view, this);
        setImportantForAccessibility(4);
        ((MotionLayout) mo2145c(C3838h.sideMenuAnimation)).setTransitionListener(new C5668a(this));
        if (C5837i.m18836a(context)) {
            m18523d();
        }
    }

    /* renamed from: a */
    public final boolean mo17493a(C5669b bVar) {
        Object obj;
        Context context = getContext();
        C12880j.m40222a((Object) context, "context");
        if (C5837i.m18843e(context)) {
            int i = C5680c.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i == 1) {
                return m18521a(this, C3838h.hidden, false, 2, null);
            }
            if (i == 2) {
                return m18521a(this, C3838h.disabled, false, 2, null);
            }
            if (i == 3) {
                return m18521a(this, C3838h.collapsed, false, 2, null);
            }
            if (i != 4) {
                throw new C12898l();
            } else if (!m18522c()) {
                m18521a(this, C3838h.expanded, false, 2, null);
                LinearLayout linearLayout = (LinearLayout) mo2145c(C3838h.iconLayout);
                C12880j.m40222a((Object) linearLayout, "iconLayout");
                Iterator it = C4121a0.m14117a(linearLayout).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C12880j.m40224a(((View) obj).getTag(), (Object) Integer.valueOf(getSelectedMenuItem()))) {
                        break;
                    }
                }
                View view = (View) obj;
                if (view == null) {
                    return true;
                }
                C5852n0.m18886a(view, 0, 1, (Object) null);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17491a(View view, Function0<C13145v> function0) {
        view.setOnClickListener(new C5671d(this, function0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17492a(View view, boolean z) {
        int i;
        if (((ThemedTintCompatImageView) view.findViewById(C3838h.menuIcon)) != null) {
            TextView textView = (TextView) view.findViewById(C3838h.menuTitle);
            if (textView != null) {
                if (z) {
                    i = C3842l.Disney_TextView_GlobalNav_PageNavFocused;
                } else {
                    i = C3842l.Disney_TextView_GlobalNav_PageNavUnfocused;
                }
                C0513i.m2778d(textView, i);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m18521a(DisneyTvNavigationBar disneyTvNavigationBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return disneyTvNavigationBar.m18518a(i, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m18518a(int i, boolean z) {
        LinearLayout linearLayout = (LinearLayout) mo2145c(C3838h.iconLayout);
        C12880j.m40222a((Object) linearLayout, "iconLayout");
        Iterator it = C4121a0.m14117a(linearLayout).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            view.setFocusable(i == C3838h.expanded);
            if (i == C3838h.expanded) {
                z2 = true;
            }
            view.setEnabled(z2);
        }
        setImportantForAccessibility(i == C3838h.expanded ? 1 : 4);
        float f = 0.6f;
        if (z) {
            MotionLayout motionLayout = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
            if (motionLayout != null) {
                motionLayout.mo2145c(i);
            }
            ViewPropertyAnimator animate = ((ImageView) mo2145c(C3838h.profileImage)).animate();
            if (i != C3838h.expanded) {
                f = 0.0f;
            }
            animate.alpha(f).setDuration(200).start();
        } else {
            MotionLayout motionLayout2 = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
            if (motionLayout2 != null) {
                MotionLayout motionLayout3 = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
                C12880j.m40222a((Object) motionLayout3, "sideMenuAnimation");
                motionLayout2.mo2142b(motionLayout3.getCurrentState(), i);
            }
            MotionLayout motionLayout4 = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
            if (motionLayout4 != null) {
                motionLayout4.setTransitionDuration(0);
            }
            MotionLayout motionLayout5 = (MotionLayout) mo2145c(C3838h.sideMenuAnimation);
            if (motionLayout5 != null) {
                motionLayout5.mo2146d();
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) mo2145c(C3838h.sideMenu);
            C12880j.m40222a((Object) constraintLayout, "sideMenu");
            constraintLayout.setAlpha((i == C3838h.expanded || i == C3838h.collapsed) ? 1.0f : 0.0f);
            ImageView imageView = (ImageView) mo2145c(C3838h.profileImage);
            C12880j.m40222a((Object) imageView, "profileImage");
            if (i != C3838h.expanded) {
                f = 0.0f;
            }
            imageView.setAlpha(f);
        }
        return true;
    }
}
