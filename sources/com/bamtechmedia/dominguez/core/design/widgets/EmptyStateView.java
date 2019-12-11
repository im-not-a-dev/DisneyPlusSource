package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.p124d.C4043g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJG\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\u0014\u0010\u0016\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J\u0010\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010 \u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/EmptyStateView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTextFromResource", "", "typedArray", "Landroid/content/res/TypedArray;", "styleableRes", "shouldThrow", "", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "setButtonClickListener", "clickListener", "Lkotlin/Function0;", "setButtonText", "buttonText", "setDescription", "descriptionText", "setImageDrawable", "res", "setImageResource", "drawableRes", "setTitleText", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EmptyStateView.kt */
public final class EmptyStateView extends LinearLayout {

    /* renamed from: c */
    private HashMap f13238c;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.EmptyStateView$a */
    /* compiled from: EmptyStateView.kt */
    static final class C5636a extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ EmptyStateView f13239c;

        C5636a(EmptyStateView emptyStateView) {
            this.f13239c = emptyStateView;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f13239c.setTitleText(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.EmptyStateView$b */
    /* compiled from: EmptyStateView.kt */
    static final class C5637b extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ EmptyStateView f13240c;

        C5637b(EmptyStateView emptyStateView) {
            this.f13240c = emptyStateView;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            if (str != null) {
                this.f13240c.setDescription(str);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.EmptyStateView$c */
    /* compiled from: EmptyStateView.kt */
    static final class C5638c extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ EmptyStateView f13241c;

        C5638c(EmptyStateView emptyStateView) {
            this.f13241c = emptyStateView;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f13241c.setButtonText(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.EmptyStateView$d */
    /* compiled from: EmptyStateView.kt */
    static final class C5639d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13242c;

        C5639d(Function0 function0) {
            this.f13242c = function0;
        }

        public final void onClick(View view) {
            this.f13242c.invoke();
        }
    }

    public EmptyStateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EmptyStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    static /* synthetic */ void m18472a(EmptyStateView emptyStateView, TypedArray typedArray, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        emptyStateView.m18471a(typedArray, i, z, function1);
    }

    /* renamed from: a */
    public View mo17408a(int i) {
        if (this.f13238c == null) {
            this.f13238c = new HashMap();
        }
        View view = (View) this.f13238c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13238c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setButtonClickListener(Function0<C13145v> function0) {
        ((Button) mo17408a(C3838h.emptyStateButton)).setOnClickListener(new C5639d(function0));
    }

    public final void setButtonText(String str) {
        Button button = (Button) mo17408a(C3838h.emptyStateButton);
        String str2 = "emptyStateButton";
        C12880j.m40222a((Object) button, str2);
        button.setText(str);
        Button button2 = (Button) mo17408a(C3838h.emptyStateButton);
        C12880j.m40222a((Object) button2, str2);
        int i = 0;
        if (!(!(str == null || str.length() == 0))) {
            i = 8;
        }
        button2.setVisibility(i);
    }

    public final void setDescription(String str) {
        TextView textView = (TextView) mo17408a(C3838h.emptyStateTvDetails);
        C12880j.m40222a((Object) textView, "emptyStateTvDetails");
        textView.setText(str);
    }

    public final void setImageDrawable(int i) {
        ((ImageView) mo17408a(C3838h.emptyStateImage)).setImageResource(i);
    }

    public final void setImageResource(int i) {
        ((ImageView) mo17408a(C3838h.emptyStateImage)).setImageResource(i);
    }

    public final void setTitleText(String str) {
        TextView textView = (TextView) mo17408a(C3838h.emptyStateTvTitle);
        String str2 = "emptyStateTvTitle";
        C12880j.m40222a((Object) textView, str2);
        textView.setText(str);
        TextView textView2 = (TextView) mo17408a(C3838h.emptyStateTvTitle);
        C12880j.m40222a((Object) textView2, str2);
        int i = 0;
        if (!(!(str == null || str.length() == 0))) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C3840j.view_empty_state, this, true);
        setOrientation(1);
        setGravity(17);
        int[] iArr = C3843m.EmptyStateView;
        C12880j.m40222a((Object) iArr, "R.styleable.EmptyStateView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        m18471a(obtainStyledAttributes, C3843m.EmptyStateView_titleText, false, new C5636a(this));
        setImageDrawable(obtainStyledAttributes.getResourceId(C3843m.EmptyStateView_imgSrc, 0));
        m18471a(obtainStyledAttributes, C3843m.EmptyStateView_descriptionText, true, new C5637b(this));
        m18472a(this, obtainStyledAttributes, C3843m.EmptyStateView_buttonText, false, new C5638c(this), 4, null);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m18471a(TypedArray typedArray, int i, boolean z, Function1<? super String, C13145v> function1) {
        int i2;
        if (z) {
            i2 = C4043g.m13858b(typedArray, i);
        } else {
            i2 = typedArray.getResourceId(i, -1);
        }
        if (i2 > -1) {
            Context context = getContext();
            C12880j.m40222a((Object) context, "context");
            function1.invoke(C5880u.m18938a(context, i2));
        }
    }
}
