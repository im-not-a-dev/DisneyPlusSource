package com.bamtechmedia.dominguez.detail.common.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/item/DetailSection;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setText", "", "title", "", "description", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DetailSection.kt */
public final class DetailSection extends LinearLayout {

    /* renamed from: c */
    private HashMap f13812c;

    public DetailSection(Context context) {
        this(context, null, 0, 6, null);
    }

    public DetailSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DetailSection(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo17928a(int i) {
        if (this.f13812c == null) {
            this.f13812c = new HashMap();
        }
        View view = (View) this.f13812c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13812c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo17929a(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView = (TextView) mo17928a(C7310d.browsable_section_item_title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "browsable_section_item_title");
        textView.setText(charSequence);
        TextView textView2 = (TextView) mo17928a(C7310d.browsable_section_item_description);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "browsable_section_item_description");
        textView2.setText(charSequence2);
    }

    public DetailSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C7312f.browsable_details_section_item, this);
        setOrientation(1);
    }
}
