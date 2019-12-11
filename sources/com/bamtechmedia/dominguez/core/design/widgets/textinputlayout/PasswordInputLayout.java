package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.Group;
import com.bamtechmedia.dominguez.core.p088i.C3837g;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3841k;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p122j.p124d.C4039f;
import p096e.p121h.p135s.C4127b0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0002-.B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\nH\u0002J\n\u0010!\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&J\b\u0010'\u001a\u00020\u001eH\u0002J+\u0010(\u001a\u00020\u001e2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010,R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000e¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomTextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityString", "", "errorView", "Landroid/widget/TextView;", "getErrorView", "()Landroid/widget/TextView;", "hasPasswordRestriction", "", "hidePasswordString", "inputEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "getInputEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "inputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "getInputLayout", "()Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "showPasswordString", "title", "getTitle", "enable", "", "enabled", "getShowPasswordAccessibility", "getShowPasswordText", "onChildFocusChangeAction", "hasFocus", "setPasswordAction", "actionOnClick", "Lkotlin/Function0;", "setPasswordShowButton", "setPasswordStrength", "colorRes", "percent", "text", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Companion", "PasswordVisibility", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordInputLayout.kt */
public final class PasswordInputLayout extends C5704a {

    /* renamed from: A0 */
    private final TextInputEditText f13398A0;

    /* renamed from: B0 */
    private final TextView f13399B0;

    /* renamed from: C0 */
    private final TextView f13400C0;

    /* renamed from: D0 */
    private final String f13401D0;

    /* renamed from: E0 */
    private final String f13402E0;

    /* renamed from: F0 */
    private final String f13403F0;

    /* renamed from: G0 */
    private boolean f13404G0;

    /* renamed from: H0 */
    private HashMap f13405H0;

    /* renamed from: z0 */
    private final CustomInternalTextInputLayout f13406z0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout$a */
    /* compiled from: PasswordInputLayout.kt */
    public static final class C5701a {
        private C5701a() {
        }

        public /* synthetic */ C5701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout$b */
    /* compiled from: PasswordInputLayout.kt */
    public enum C5702b {
        SHOW,
        HIDE
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout$c */
    /* compiled from: PasswordInputLayout.kt */
    static final class C5703c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ Function0 f13410U;

        /* renamed from: c */
        final /* synthetic */ PasswordInputLayout f13411c;

        C5703c(PasswordInputLayout passwordInputLayout, Function0 function0) {
            this.f13411c = passwordInputLayout;
            this.f13410U = function0;
        }

        public final void onClick(View view) {
            this.f13410U.invoke();
            this.f13411c.m18590e();
        }
    }

    static {
        new C5701a(null);
    }

    public PasswordInputLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PasswordInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PasswordInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m18590e() {
        TextView textView = (TextView) mo2145c(C3838h.showPassword);
        Object tag = textView.getTag();
        C5702b bVar = C5702b.HIDE;
        if (tag == bVar) {
            bVar = C5702b.SHOW;
        }
        textView.setTag(bVar);
        textView.setText(getShowPasswordText());
        textView.setContentDescription(getShowPasswordAccessibility());
        textView.announceForAccessibility(getShowPasswordAccessibility());
        TextInputEditText textInputEditText = (TextInputEditText) mo2145c(C3838h.inputText);
        String str = "inputText";
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText, str);
        TextView textView2 = (TextView) mo2145c(C3838h.showPassword);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "showPassword");
        textInputEditText.setInputType((textView2.getTag() == C5702b.HIDE ? 128 : 144) | 1);
        TextInputEditText textInputEditText2 = (TextInputEditText) mo2145c(C3838h.inputText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText2, str);
        textInputEditText2.setTypeface(C4039f.m13847a(getContext(), C3837g.avenir55_roman));
        ((TextInputEditText) mo2145c(C3838h.inputText)).setSelection(((TextInputEditText) mo2145c(C3838h.inputText)).length());
    }

    private final String getShowPasswordAccessibility() {
        TextView textView = (TextView) mo2145c(C3838h.showPassword);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "showPassword");
        return textView.getTag() == C5702b.HIDE ? this.f13403F0 : C5880u.m18936a(C3841k.a11y_pw_btn_hidepassword);
    }

    private final String getShowPasswordText() {
        TextView textView = (TextView) mo2145c(C3838h.showPassword);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "showPassword");
        return textView.getTag() == C5702b.HIDE ? this.f13401D0 : this.f13402E0;
    }

    /* renamed from: b */
    public void mo17564b(boolean z) {
        int i;
        ViewFlipper viewFlipper = (ViewFlipper) mo2145c(C3838h.passwordHeader);
        Intrinsics.checkReturnedValueIsNotNull((Object) viewFlipper, "passwordHeader");
        if (!z) {
            Context context = getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
            if (C5837i.m18843e(context)) {
                i = 2;
                viewFlipper.setDisplayedChild(i);
            }
        }
        i = this.f13404G0 ? 1 : 0;
        viewFlipper.setDisplayedChild(i);
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13405H0 == null) {
            this.f13405H0 = new HashMap();
        }
        View view = (View) this.f13405H0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13405H0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public TextView getErrorView() {
        return this.f13400C0;
    }

    public TextInputEditText getInputEditText() {
        return this.f13398A0;
    }

    public CustomInternalTextInputLayout getInputLayout() {
        return this.f13406z0;
    }

    public TextView getTitle() {
        return this.f13399B0;
    }

    public PasswordInputLayout(Context context, AttributeSet attributeSet, int i) {
        CharSequence charSequence;
        Object obj;
        super(context, attributeSet, i);
        this.f13403F0 = C5880u.m18936a(C3841k.a11y_onboardingpw_btn_showpassword);
        ViewGroup.inflate(context, C3840j.password_input_layout, this);
        this.f13406z0 = (CustomInternalTextInputLayout) mo2145c(C3838h.customInternTextInputLayout);
        TextInputEditText textInputEditText = (TextInputEditText) mo2145c(C3838h.inputText);
        String str = "inputText";
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText, str);
        this.f13398A0 = textInputEditText;
        this.f13399B0 = (TextView) mo2145c(C3838h.titleText);
        TextView textView = (TextView) mo2145c(C3838h.errorTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "errorTextView");
        this.f13400C0 = textView;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3843m.PasswordInputLayout, 0, 0);
        Intrinsics.checkReturnedValueIsNotNull((Object) obtainStyledAttributes, "typedArray");
        this.f13401D0 = C5880u.m18939a(obtainStyledAttributes, C3843m.PasswordInputLayout_customShowText, isInEditMode());
        this.f13402E0 = C5880u.m18939a(obtainStyledAttributes, C3843m.PasswordInputLayout_customHideText, isInEditMode());
        obtainStyledAttributes.recycle();
        mo17573a(context, attributeSet);
        TextInputEditText textInputEditText2 = (TextInputEditText) mo2145c(C3838h.inputText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText2, str);
        textInputEditText2.setInputType(129);
        if (!isInEditMode()) {
            TextInputEditText textInputEditText3 = (TextInputEditText) mo2145c(C3838h.inputText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textInputEditText3, str);
            textInputEditText3.setTypeface(C4039f.m13847a(context, C3837g.avenir55_roman));
        }
        TextView textView2 = (TextView) mo2145c(C3838h.showPassword);
        textView2.setText(this.f13401D0);
        textView2.setVisibility(0);
        textView2.setTag(C5702b.HIDE);
        textView2.setContentDescription(this.f13403F0);
        TextView textView3 = (TextView) mo2145c(C3838h.ghostViewPassword);
        if (textView3 != null) {
            C4127b0.m14130a(textView3, true);
        }
        TextView textView4 = (TextView) mo2145c(C3838h.passwordLongStrengthText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView4, "passwordLongStrengthText");
        if (isInEditMode()) {
            charSequence = getResources().getString(C3841k.password_rating_fair);
        } else {
            Iterator it = C13185o.m40520c(C5880u.m18936a(C3841k.password_rating_fair), C5880u.m18936a(C3841k.password_rating_good), C5880u.m18936a(C3841k.password_rating_great)).iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int length = ((String) obj).length();
                    do {
                        Object next = it.next();
                        int length2 = ((String) next).length();
                        if (length < length2) {
                            obj = next;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            charSequence = (CharSequence) obj;
        }
        textView4.setText(charSequence);
        if (C5837i.m18836a(context)) {
            mo2146d();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18589a(PasswordInputLayout passwordInputLayout, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        passwordInputLayout.mo17571a(z, function0);
    }

    /* renamed from: a */
    public final void mo17571a(boolean z, Function0<C13145v> function0) {
        ((TextView) mo2145c(C3838h.showPassword)).setOnClickListener(new C5703c(this, function0));
        this.f13404G0 = z;
        mo17564b(getInputEditText().hasFocus());
    }

    /* renamed from: a */
    public final void mo17569a(Integer num, Integer num2, String str) {
        TextView textView = (TextView) mo2145c(C3838h.passwordStrengthText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "passwordStrengthText");
        textView.setText(str);
        ProgressBar progressBar = (ProgressBar) mo2145c(C3838h.passwordStrength);
        String str2 = "passwordStrength";
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, str2);
        boolean z = false;
        progressBar.setProgress(num2 != null ? num2.intValue() : 0);
        if (num != null) {
            int a = C4025a.m13788a(getContext(), num.intValue());
            ((TextView) mo2145c(C3838h.passwordStrengthText)).setTextColor(a);
            ProgressBar progressBar2 = (ProgressBar) mo2145c(C3838h.passwordStrength);
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar2, str2);
            Drawable progressDrawable = progressBar2.getProgressDrawable();
            if (progressDrawable != null) {
                ((LayerDrawable) progressDrawable).findDrawableByLayerId(16908301).setColorFilter(a, Mode.SRC_IN);
            } else {
                throw new C13142s("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            }
        }
        Group group = (Group) mo2145c(C3838h.groupPasswordStrength);
        if (group != null) {
            if (!(num2 == null || num2.intValue() == 0)) {
                z = true;
            }
            C4127b0.m14131b(group, z);
        }
    }

    /* renamed from: a */
    public void mo17570a(boolean z) {
        super.mo17570a(z);
        TextView textView = (TextView) mo2145c(C3838h.showPassword);
        if (textView != null) {
            textView.setEnabled(z);
        }
    }
}
