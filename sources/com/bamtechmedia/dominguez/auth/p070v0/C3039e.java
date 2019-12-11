package com.bamtechmedia.dominguez.auth.p070v0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.TransformFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bamtechmedia.dominguez.auth.C2714g0;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3105e;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import com.bamtechmedia.dominguez.legal.api.MarketingLink;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p203b.p408f0.C10608b;
import p163g.p201e.p203b.p408f0.C10611d;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0007HÂ\u0003J\t\u0010\u001d\u001a\u00020\tHÂ\u0003J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\b\u0010#\u001a\u00020\u0005H\u0016J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/MarketingViewItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "marketingItem", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "accessibilityTextId", "", "webRouter", "Lcom/bamtechmedia/dominguez/web/WebRouter;", "analytics", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "(Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;Ljava/lang/Integer;Lcom/bamtechmedia/dominguez/web/WebRouter;Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;)V", "getAccessibilityTextId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isChecked", "", "()Z", "setChecked", "(Z)V", "getMarketingItem", "()Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "component1", "component2", "component3", "component4", "copy", "(Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;Ljava/lang/Integer;Lcom/bamtechmedia/dominguez/web/WebRouter;Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;)Lcom/bamtechmedia/dominguez/auth/validation/MarketingViewItem;", "equals", "other", "", "getLayout", "hashCode", "toString", "", "URLSpanClickHandler", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.e */
/* compiled from: MarketingViewItem.kt */
public final class C3039e extends C11866a {

    /* renamed from: U */
    private final MarketingEntity f7904U;

    /* renamed from: V */
    private final Integer f7905V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C10611d f7906W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C3105e f7907X;

    /* renamed from: c */
    private boolean f7908c;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$a */
    /* compiled from: MarketingViewItem.kt */
    public final class C3040a extends URLSpan {

        /* renamed from: U */
        private final C10611d f7909U;

        /* renamed from: c */
        private final String f7910c;

        public C3040a(C3039e eVar, String str, C10611d dVar) {
            super(str);
            this.f7910c = str;
            this.f7909U = dVar;
        }

        public void onClick(View view) {
            C10608b.m33333a(this.f7909U, this.f7910c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$b */
    /* compiled from: MarketingViewItem.kt */
    static final class C3041b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3039e f7911a;

        C3041b(C3039e eVar) {
            this.f7911a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7911a.mo12050a(z);
            this.f7911a.f7907X.mo12141a(this.f7911a.mo12051b());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$c */
    /* compiled from: MarketingViewItem.kt */
    static final class C3042c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C11867b f7912c;

        C3042c(C11867b bVar) {
            this.f7912c = bVar;
        }

        public final void onClick(View view) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f7912c.mo20994a().findViewById(C2716h0.optInCheckbox);
            String str = "viewHolder.optInCheckbox";
            C12880j.m40222a((Object) appCompatCheckBox, str);
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f7912c.mo20994a().findViewById(C2716h0.optInCheckbox);
            C12880j.m40222a((Object) appCompatCheckBox2, str);
            appCompatCheckBox.setChecked(!appCompatCheckBox2.isChecked());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$d */
    /* compiled from: MarketingViewItem.kt */
    static final class C3043d implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C11867b f7913c;

        C3043d(C11867b bVar) {
            this.f7913c = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            Drawable drawable;
            LinearLayout linearLayout = (LinearLayout) this.f7913c.mo20994a().findViewById(C2716h0.optInCheckboxBackground);
            if (linearLayout != null) {
                if (z) {
                    View view2 = this.f7913c.itemView;
                    C12880j.m40222a((Object) view2, "viewHolder.itemView");
                    drawable = C4025a.m13798c(view2.getContext(), C2714g0.background_marketing_item);
                } else {
                    drawable = null;
                }
                linearLayout.setBackground(drawable);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$e */
    /* compiled from: MarketingViewItem.kt */
    static final class C3044e implements TransformFilter {

        /* renamed from: a */
        final /* synthetic */ MarketingLink f7914a;

        C3044e(MarketingLink marketingLink) {
            this.f7914a = marketingLink;
        }

        public final String transformUrl(Matcher matcher, String str) {
            return this.f7914a.getHref();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.e$f */
    /* compiled from: MarketingViewItem.kt */
    static final class C3045f extends C12881k implements Function1<String, C3040a> {

        /* renamed from: c */
        final /* synthetic */ C3039e f7915c;

        C3045f(C3039e eVar) {
            this.f7915c = eVar;
            super(1);
        }

        public final C3040a invoke(String str) {
            C3039e eVar = this.f7915c;
            return new C3040a(eVar, str, eVar.f7906W);
        }
    }

    public C3039e(MarketingEntity marketingEntity, Integer num, C10611d dVar, C3105e eVar) {
        this.f7904U = marketingEntity;
        this.f7905V = num;
        this.f7906W = dVar;
        this.f7907X = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f7907X, (java.lang.Object) r3.f7907X) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.auth.p070v0.C3039e
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.auth.v0.e r3 = (com.bamtechmedia.dominguez.auth.p070v0.C3039e) r3
            com.bamtechmedia.dominguez.legal.api.MarketingEntity r0 = r2.f7904U
            com.bamtechmedia.dominguez.legal.api.MarketingEntity r1 = r3.f7904U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f7905V
            java.lang.Integer r1 = r3.f7905V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            g.e.b.f0.d r0 = r2.f7906W
            g.e.b.f0.d r1 = r3.f7906W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.auth.v0.h.e r0 = r2.f7907X
            com.bamtechmedia.dominguez.auth.v0.h.e r3 = r3.f7907X
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.C3039e.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C2718i0.item_marketing;
    }

    public int hashCode() {
        MarketingEntity marketingEntity = this.f7904U;
        int i = 0;
        int hashCode = (marketingEntity != null ? marketingEntity.hashCode() : 0) * 31;
        Integer num = this.f7905V;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        C10611d dVar = this.f7906W;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C3105e eVar = this.f7907X;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketingViewItem(marketingItem=");
        sb.append(this.f7904U);
        sb.append(", accessibilityTextId=");
        sb.append(this.f7905V);
        sb.append(", webRouter=");
        sb.append(this.f7906W);
        sb.append(", analytics=");
        sb.append(this.f7907X);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final MarketingEntity mo12049a() {
        return this.f7904U;
    }

    /* renamed from: b */
    public final boolean mo12051b() {
        return this.f7908c;
    }

    public void bind(C11867b bVar, int i) {
        this.f7908c = this.f7904U.getChecked();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) bVar.mo20994a().findViewById(C2716h0.optInCheckbox);
        String str = "viewHolder.optInCheckbox";
        C12880j.m40222a((Object) appCompatCheckBox, str);
        appCompatCheckBox.setChecked(this.f7904U.getChecked());
        ((AppCompatCheckBox) bVar.mo20994a().findViewById(C2716h0.optInCheckbox)).setOnCheckedChangeListener(new C3041b(this));
        Integer num = this.f7905V;
        if (num != null) {
            num.intValue();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) bVar.mo20994a().findViewById(C2716h0.optInCheckbox);
            C12880j.m40222a((Object) appCompatCheckBox2, str);
            appCompatCheckBox2.setContentDescription(C5880u.m18936a(this.f7905V.intValue()));
        }
        TextView textView = (TextView) bVar.mo20994a().findViewById(C2716h0.optInText);
        if (textView != null) {
            textView.setOnClickListener(new C3042c(bVar));
        }
        View view = bVar.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        Context context = view.getContext();
        C12880j.m40222a((Object) context, "viewHolder.itemView.context");
        if (C5837i.m18843e(context)) {
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) bVar.mo20994a().findViewById(C2716h0.optInCheckbox);
            C12880j.m40222a((Object) appCompatCheckBox3, str);
            appCompatCheckBox3.setText(this.f7904U.getText());
            ((AppCompatCheckBox) bVar.mo20994a().findViewById(C2716h0.optInCheckbox)).setOnFocusChangeListener(new C3043d(bVar));
            return;
        }
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C2716h0.optInText);
        if (textView2 != null) {
            textView2.setText(this.f7904U.getText());
        }
        for (MarketingLink marketingLink : this.f7904U.getLinks()) {
            Linkify.addLinks((TextView) bVar.mo20994a().findViewById(C2716h0.optInText), Pattern.compile(marketingLink.getText()), null, null, new C3044e(marketingLink));
        }
        TextView textView3 = (TextView) bVar.mo20994a().findViewById(C2716h0.optInText);
        if (textView3 != null) {
            textView3.setTransformationMethod(new C3038d(new C3045f(this), 0, 2, null));
        }
    }

    /* renamed from: a */
    public final void mo12050a(boolean z) {
        this.f7908c = z;
    }
}
