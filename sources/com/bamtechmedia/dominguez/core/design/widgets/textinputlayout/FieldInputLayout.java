package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/FieldInputLayout;", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomTextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "errorView", "Landroid/widget/TextView;", "getErrorView", "()Landroid/widget/TextView;", "inputEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "getInputEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "inputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "getInputLayout", "()Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "title", "getTitle", "onChildFocusChangeAction", "", "hasFocus", "", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: FieldInputLayout.kt */
public final class FieldInputLayout extends C5704a {

    /* renamed from: A0 */
    private final TextInputEditText f13393A0;

    /* renamed from: B0 */
    private final TextView f13394B0;

    /* renamed from: C0 */
    private final TextView f13395C0;

    /* renamed from: D0 */
    private HashMap f13396D0;

    /* renamed from: z0 */
    private final CustomInternalTextInputLayout f13397z0;

    public FieldInputLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FieldInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FieldInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    public void mo17564b(boolean z) {
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13396D0 == null) {
            this.f13396D0 = new HashMap();
        }
        View view = (View) this.f13396D0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13396D0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public TextView getErrorView() {
        return this.f13395C0;
    }

    public TextInputEditText getInputEditText() {
        return this.f13393A0;
    }

    public CustomInternalTextInputLayout getInputLayout() {
        return this.f13397z0;
    }

    public TextView getTitle() {
        return this.f13394B0;
    }

    public FieldInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C3840j.field_input_layout, this);
        this.f13397z0 = (CustomInternalTextInputLayout) mo2145c(C3838h.customInternTextInputLayout);
        TextInputEditText textInputEditText = (TextInputEditText) mo2145c(C3838h.inputText);
        String str = "inputText";
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText, str);
        this.f13393A0 = textInputEditText;
        this.f13394B0 = (TextView) mo2145c(C3838h.titleText);
        TextView textView = (TextView) mo2145c(C3838h.errorTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "errorTextView");
        this.f13395C0 = textView;
        int[] iArr = C3843m.FieldInputLayout;
        Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.FieldInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        TextInputEditText textInputEditText2 = (TextInputEditText) mo2145c(C3838h.inputText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText2, str);
        textInputEditText2.setInputType(obtainStyledAttributes.getBoolean(C3843m.FieldInputLayout_flagCapSentences, false) ? DateUtils.FORMAT_ABBREV_TIME : 33);
        TextInputEditText textInputEditText3 = (TextInputEditText) mo2145c(C3838h.inputText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText3, str);
        textInputEditText3.setImeOptions(obtainStyledAttributes.getInt(C3843m.FieldInputLayout_imeOptions, 2));
        obtainStyledAttributes.recycle();
        mo17573a(context, attributeSet);
        if (C5837i.m18836a(context)) {
            mo2146d();
        }
    }
}
