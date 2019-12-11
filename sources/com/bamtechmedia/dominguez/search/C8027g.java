package com.bamtechmedia.dominguez.search;

import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import p096e.p121h.p122j.p124d.C4039f;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0014\u0010\u0012\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/KeyboardSearchResultItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "resultText", "", "clickListener", "Lcom/bamtechmedia/dominguez/search/KeyboardSearchSuggestionClickListener;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/search/KeyboardSearchSuggestionClickListener;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "", "getLayout", "setFocusStyle", "Landroid/widget/TextView;", "hasFocus", "", "Companion", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.g */
/* compiled from: KeyboardSearchResultItem.kt */
public final class C8027g extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C8032h f17222U;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f17223c;

    /* renamed from: com.bamtechmedia.dominguez.search.g$a */
    /* compiled from: KeyboardSearchResultItem.kt */
    public static final class C8028a {
        private C8028a() {
        }

        public /* synthetic */ C8028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.g$b */
    /* compiled from: KeyboardSearchResultItem.kt */
    static final class C8029b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C8027g f17224c;

        C8029b(C8027g gVar, C11867b bVar, int i) {
            this.f17224c = gVar;
        }

        public final void onClick(View view) {
            this.f17224c.f17222U.mo20996a(this.f17224c.f17223c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.g$c */
    /* compiled from: KeyboardSearchResultItem.kt */
    static final class C8030c implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ C8027g f17225U;

        /* renamed from: c */
        final /* synthetic */ TextView f17226c;

        C8030c(TextView textView, C8027g gVar, C11867b bVar, int i) {
            this.f17226c = textView;
            this.f17225U = gVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f17225U.m23341a(this.f17226c, z);
        }
    }

    static {
        new C8028a(null);
    }

    public C8027g(String str, C8032h hVar) {
        this.f17223c = str;
        this.f17222U = hVar;
    }

    public void bind(C11867b bVar, int i) {
    }

    public int getLayout() {
        return C8050p.keyboard_result_item;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23341a(TextView textView, boolean z) {
        textView.setTypeface(Typeface.create(C4039f.m13847a(textView.getContext(), z ? C8047m.avenir85_heavy : C8047m.avenir55_roman), 0));
        textView.setTextSize(z ? 13.0f : 12.0f);
    }

    public void bind(C11867b bVar, int i, List<? extends Object> list) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C8048n.keyboardResultTextView);
        textView.setText(this.f17223c);
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C8048n.heightDeterminingTextView);
        if (textView2 != null) {
            textView2.setText(this.f17223c);
        }
        TextView textView3 = (TextView) bVar.mo20994a().findViewById(C8048n.heightDeterminingTextView);
        if (textView3 != null) {
            textView3.setTextSize(13.0f);
        }
        m23341a(textView, true);
        boolean z = false;
        textView.measure(0, 0);
        textView.getLayoutParams().width = textView.getMeasuredWidth();
        m23341a(textView, false);
        textView.setOnClickListener(new C8029b(this, bVar, i));
        textView.setOnFocusChangeListener(new C8030c(textView, this, bVar, i));
        int i2 = C8048n.focusHelperExpandNavOnFocusSearchLeft;
        if (i == 0) {
            z = true;
        }
        textView.setTag(i2, Boolean.valueOf(z));
        textView.setTag(C8048n.focusHelperHorizontalFocusSearchWithinParent, Boolean.valueOf(true));
    }
}
