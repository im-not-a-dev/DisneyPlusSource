package p163g.p201e.p203b.p204d.p206w0;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p204d.C5409m0;
import p163g.p201e.p203b.p204d.C5411n0;
import p163g.p201e.p203b.p204d.C5413o0;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0017\u001a\u00020\bHÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b\u001aJO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0016\u0010!\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"H\u0016J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/item/EditItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "itemId", "", "value", "textColor", "", "hasPassword", "", "accessibilityValue", "onEditClicked", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getOnEditClicked$account_release", "()Lkotlin/jvm/functions/Function0;", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "component1", "component2", "component3", "component4", "component5", "component6", "component6$account_release", "copy", "equals", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.w0.c */
/* compiled from: EditItem.kt */
public final class C5496c extends C11866a {

    /* renamed from: U */
    private final String f13031U;

    /* renamed from: V */
    private final int f13032V;

    /* renamed from: W */
    private final boolean f13033W;

    /* renamed from: X */
    private final String f13034X;

    /* renamed from: Y */
    private final Function0<C13145v> f13035Y;

    /* renamed from: c */
    private final String f13036c;

    /* renamed from: g.e.b.d.w0.c$a */
    /* compiled from: EditItem.kt */
    static final class C5497a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13037c;

        C5497a(Function0 function0) {
            this.f13037c = function0;
        }

        public final void onClick(View view) {
            this.f13037c.invoke();
        }
    }

    public /* synthetic */ C5496c(String str, String str2, int i, boolean z, String str3, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            i = C5409m0.vader_white;
        }
        this(str, str2, i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5496c)) {
            return false;
        }
        C5496c cVar = (C5496c) obj;
        return !(Intrinsics.areEqual((Object) this.f13036c, (Object) cVar.f13036c) ^ true) && !(Intrinsics.areEqual((Object) this.f13031U, (Object) cVar.f13031U) ^ true);
    }

    public int getLayout() {
        return C5413o0.account_setting_editable;
    }

    public int hashCode() {
        return (this.f13036c.hashCode() * 31) + this.f13031U.hashCode();
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C5496c) && Intrinsics.areEqual((Object) ((C5496c) eVar).f13036c, (Object) this.f13036c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EditItem(itemId=");
        sb.append(this.f13036c);
        sb.append(", value=");
        sb.append(this.f13031U);
        sb.append(", textColor=");
        sb.append(this.f13032V);
        sb.append(", hasPassword=");
        sb.append(this.f13033W);
        sb.append(", accessibilityValue=");
        sb.append(this.f13034X);
        sb.append(", onEditClicked=");
        sb.append(this.f13035Y);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C5411n0.accountSettingValue);
        String str = "accountSettingValue";
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, str);
        int a = C4025a.m13788a(textView.getContext(), this.f13032V);
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C5411n0.accountSettingValue);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str);
        textView2.setText(this.f13031U);
        TextView textView3 = (TextView) bVar.mo20994a().findViewById(C5411n0.accountSettingValue);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView3, str);
        textView3.setContentDescription(this.f13034X);
        TextView textView4 = (TextView) bVar.mo20994a().findViewById(C5411n0.accountSettingValue);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView4, str);
        Context context = textView4.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "accountSettingValue.context");
        if (!C5837i.m18843e(context)) {
            ((TextView) bVar.mo20994a().findViewById(C5411n0.accountSettingValue)).setTextColor(a);
        }
        View c = bVar.mo30014c();
        TextView textView5 = (TextView) bVar.mo20994a().findViewById(C5411n0.changeCtaLabel);
        if (textView5 != null) {
            C4127b0.m14131b(textView5, this.f13033W);
        }
        Function0<C13145v> function0 = this.f13035Y;
        if (function0 != null) {
            c.setEnabled(true);
            c.setOnClickListener(new C5497a(function0));
            c.setFocusable(true);
            return;
        }
        c.setOnClickListener(null);
        c.setEnabled(false);
        c.setFocusable(false);
    }

    public C5496c(String str, String str2, int i, boolean z, String str3, Function0<C13145v> function0) {
        this.f13036c = str;
        this.f13031U = str2;
        this.f13032V = i;
        this.f13033W = z;
        this.f13034X = str3;
        this.f13035Y = function0;
    }
}
