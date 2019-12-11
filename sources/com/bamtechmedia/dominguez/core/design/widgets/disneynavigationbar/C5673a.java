package com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.design.widgets.ThemedTintCompatImageView;
import com.bamtechmedia.dominguez.core.p088i.C3832b;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4121a0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u000201B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J:\u0010\u001e\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u0012\u0010#\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"H$J\"\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\f0(J\u001a\u0010*\u001a\u00020\f*\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,H$J\f\u0010-\u001a\u00020\f*\u00020\u0018H$J\u0014\u0010.\u001a\u00020\f*\u00020\u00182\u0006\u0010/\u001a\u00020\u000bH$R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onSelected", "Lkotlin/Function2;", "", "", "getOnSelected", "()Lkotlin/jvm/functions/Function2;", "setOnSelected", "(Lkotlin/jvm/functions/Function2;)V", "value", "selectedMenuItem", "getSelectedMenuItem", "()I", "setSelectedMenuItem", "(I)V", "createMenuView", "Landroid/view/View;", "item", "Lcom/bamtechmedia/dominguez/core/design/widgets/disneynavigationbar/DisneyNavigationBar$DisneyMenuItemView;", "createProfileView", "selectItem", "itemId", "setMenu", "itemViewList", "", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setNavigationBackground", "updateProfile", "profileNameText", "", "loadAvatarImage", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "setPlatformRelatedItem", "onClick", "Lkotlin/Function0;", "setPlatformRelatedProfileItem", "updatePlatformRelatedItem", "isSelected", "DisneyMenuItemType", "DisneyMenuItemView", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a */
/* compiled from: DisneyNavigationBar.kt */
public abstract class C5673a extends ConstraintLayout {

    /* renamed from: r0 */
    private Function2<? super Integer, ? super Boolean, C13145v> f13317r0;

    /* renamed from: s0 */
    private int f13318s0;

    /* renamed from: t0 */
    private HashMap f13319t0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a$a */
    /* compiled from: DisneyNavigationBar.kt */
    public enum C5674a {
        PROFILE,
        OTHER
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a$b */
    /* compiled from: DisneyNavigationBar.kt */
    public static final class C5675b {

        /* renamed from: a */
        private final int f13323a;

        /* renamed from: b */
        private final Integer f13324b;

        /* renamed from: c */
        private final String f13325c;

        /* renamed from: d */
        private final String f13326d;

        /* renamed from: e */
        private final C5674a f13327e;

        /* renamed from: f */
        private final Function0<C13145v> f13328f;

        public C5675b(int i, Integer num, String str, String str2, C5674a aVar, Function0<C13145v> function0) {
            this.f13323a = i;
            this.f13324b = num;
            this.f13325c = str;
            this.f13326d = str2;
            this.f13327e = aVar;
            this.f13328f = function0;
        }

        /* renamed from: a */
        public final String mo17505a() {
            return this.f13326d;
        }

        /* renamed from: b */
        public final Integer mo17506b() {
            return this.f13324b;
        }

        /* renamed from: c */
        public final int mo17507c() {
            return this.f13323a;
        }

        /* renamed from: d */
        public final Function0<C13145v> mo17508d() {
            return this.f13328f;
        }

        /* renamed from: e */
        public final String mo17509e() {
            return this.f13325c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5675b) {
                    C5675b bVar = (C5675b) obj;
                    if (!(this.f13323a == bVar.f13323a) || !Intrinsics.areEqual((Object) this.f13324b, (Object) bVar.f13324b) || !Intrinsics.areEqual((Object) this.f13325c, (Object) bVar.f13325c) || !Intrinsics.areEqual((Object) this.f13326d, (Object) bVar.f13326d) || !Intrinsics.areEqual((Object) this.f13327e, (Object) bVar.f13327e) || !Intrinsics.areEqual((Object) this.f13328f, (Object) bVar.f13328f)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final C5674a mo17511f() {
            return this.f13327e;
        }

        public int hashCode() {
            int i = this.f13323a * 31;
            Integer num = this.f13324b;
            int i2 = 0;
            int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f13325c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13326d;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            C5674a aVar = this.f13327e;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            Function0<C13145v> function0 = this.f13328f;
            if (function0 != null) {
                i2 = function0.hashCode();
            }
            return hashCode4 + i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DisneyMenuItemView(id=");
            sb.append(this.f13323a);
            sb.append(", icon=");
            sb.append(this.f13324b);
            sb.append(", text=");
            sb.append(this.f13325c);
            sb.append(", contentDescription=");
            sb.append(this.f13326d);
            sb.append(", type=");
            sb.append(this.f13327e);
            sb.append(", onClick=");
            sb.append(this.f13328f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a$c */
    /* compiled from: DisneyNavigationBar.kt */
    static final class C5676c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C5675b f13329U;

        /* renamed from: c */
        final /* synthetic */ C5673a f13330c;

        C5676c(C5673a aVar, C5675b bVar) {
            this.f13330c = aVar;
            this.f13329U = bVar;
            super(0);
        }

        public final void invoke() {
            this.f13330c.m18536d(this.f13329U.mo17507c());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a$d */
    /* compiled from: DisneyNavigationBar.kt */
    static final class C5677d implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C5675b f13331U;

        /* renamed from: c */
        final /* synthetic */ C5673a f13332c;

        C5677d(C5673a aVar, C5675b bVar) {
            this.f13332c = aVar;
            this.f13331U = bVar;
        }

        public final void onClick(View view) {
            Function0 d = this.f13331U.mo17508d();
            if (d != null) {
                d.invoke();
            } else {
                this.f13332c.m18536d(this.f13331U.mo17507c());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.a$e */
    /* compiled from: DisneyNavigationBar.kt */
    static final class C5678e extends C12881k implements Function2<Integer, Boolean, C13145v> {

        /* renamed from: c */
        public static final C5678e f13333c = new C5678e();

        C5678e() {
            super(2);
        }

        /* renamed from: a */
        public final void mo17515a(int i, boolean z) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo17515a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C13145v.f29587a;
        }
    }

    public C5673a(Context context) {
        this(context, null, 0, 6, null);
    }

    public C5673a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ C5673a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final View m18535b(C5675b bVar) {
        Context context = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C5837i.m18839b(context, C3832b.navBarProfileLayout, null, false, 6, null), (LinearLayout) mo2145c(C3838h.iconLayout), false);
        inflate.setTag(Integer.valueOf(bVar.mo17507c()));
        inflate.setTag(C3838h.focusHelperGlobalNavItem, Boolean.valueOf(true));
        inflate.setContentDescription(bVar.mo17505a());
        inflate.setOnClickListener(new C5677d(this, bVar));
        setPlatformRelatedProfileItem(inflate);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "LayoutInflater.from(cont…edProfileItem()\n        }");
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m18536d(int i) {
        this.f13317r0.invoke(Integer.valueOf(i), Boolean.valueOf(this.f13318s0 == i));
        setSelectedMenuItem(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17491a(View view, Function0<C13145v> function0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17492a(View view, boolean z);

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13319t0 == null) {
            this.f13319t0 = new HashMap();
        }
        View view = (View) this.f13319t0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13319t0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final Function2<Integer, Boolean, C13145v> getOnSelected() {
        return this.f13317r0;
    }

    public final int getSelectedMenuItem() {
        return this.f13318s0;
    }

    /* access modifiers changed from: protected */
    public abstract void setNavigationBackground(C3848a aVar);

    /* access modifiers changed from: protected */
    public final void setOnSelected(Function2<? super Integer, ? super Boolean, C13145v> function2) {
        this.f13317r0 = function2;
    }

    /* access modifiers changed from: protected */
    public abstract void setPlatformRelatedProfileItem(View view);

    public final void setSelectedMenuItem(int i) {
        if (i != this.f13318s0) {
            LinearLayout linearLayout = (LinearLayout) mo2145c(C3838h.iconLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "iconLayout");
            for (View view : C4121a0.m14117a(linearLayout)) {
                Object tag = view.getTag();
                boolean z = (tag instanceof Integer) && i == ((Integer) tag).intValue();
                view.setSelected(z);
                ImageView imageView = (ThemedTintCompatImageView) view.findViewById(C3838h.menuIcon);
                if (imageView == null) {
                    imageView = (ImageView) view.findViewById(C3838h.profileImage);
                }
                if (imageView != null) {
                    imageView.setSelected(z);
                }
                TextView textView = (TextView) view.findViewById(C3838h.menuTitle);
                if (textView == null) {
                    textView = (TextView) view.findViewById(C3838h.profileName);
                }
                if (textView != null) {
                    textView.setSelected(z);
                }
                mo17492a(view, z);
            }
            this.f13318s0 = i;
        }
    }

    public C5673a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13317r0 = C5678e.f13333c;
    }

    /* renamed from: a */
    public final void mo17499a(String str, Function1<? super ImageView, C13145v> function1) {
        TextView textView = (TextView) mo2145c(C3838h.profileName);
        if (!Intrinsics.areEqual((Object) str, (Object) textView != null ? textView.getText() : null)) {
            TextView textView2 = (TextView) mo2145c(C3838h.profileName);
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        ImageView imageView = (ImageView) mo2145c(C3838h.profileImage);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "profileImage");
        function1.invoke(imageView);
    }

    /* renamed from: a */
    private final View m18533a(C5675b bVar) {
        Context context = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C5837i.m18839b(context, C3832b.navBarItemLayout, null, false, 6, null), (LinearLayout) mo2145c(C3838h.iconLayout), false);
        inflate.setTag(Integer.valueOf(bVar.mo17507c()));
        inflate.setTag(C3838h.focusHelperGlobalNavItem, Boolean.valueOf(true));
        inflate.setContentDescription(bVar.mo17505a());
        Integer b = bVar.mo17506b();
        if (b != null) {
            ((ThemedTintCompatImageView) inflate.findViewById(C3838h.menuIcon)).setImageDrawable(C4025a.m13798c(inflate.getContext(), b.intValue()));
        }
        TextView textView = (TextView) inflate.findViewById(C3838h.menuTitle);
        if (textView != null) {
            textView.setText(bVar.mo17509e());
        }
        mo17491a(inflate, (Function0<C13145v>) new C5676c<C13145v>(this, bVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "LayoutInflater.from(cont…Item(item.id) }\n        }");
        return inflate;
    }

    /* renamed from: a */
    public final void mo17500a(List<C5675b> list, C3848a aVar, Function2<? super Integer, ? super Boolean, C13145v> function2) {
        View view;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (C5675b bVar : list) {
            int i = C5679b.$EnumSwitchMapping$0[bVar.mo17511f().ordinal()];
            if (i == 1) {
                view = m18535b(bVar);
            } else if (i == 2) {
                view = m18533a(bVar);
            } else {
                throw new C12898l();
            }
            arrayList.add(view);
        }
        setNavigationBackground(aVar);
        int size = arrayList.size() / 2;
        ((LinearLayout) mo2145c(C3838h.iconLayout)).removeAllViews();
        for (View addView : C13199w.m40583d((Collection) C13199w.m40563a((Collection) arrayList.subList(0, size), (Object) LayoutInflater.from(getContext()).inflate(C3840j.disney_empty_item_view, (LinearLayout) mo2145c(C3838h.iconLayout), false)), (Iterable) arrayList.subList(size, arrayList.size()))) {
            ((LinearLayout) mo2145c(C3838h.iconLayout)).addView(addView);
        }
        this.f13317r0 = function2;
    }
}
