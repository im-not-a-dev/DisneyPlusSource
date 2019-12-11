package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnFocusChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.design.widgets.C5664b;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4127b0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 L2\u00020\u0001:\u0002LMB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010)\u001a\u00020*J\u001c\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0.H\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0016J\r\u00102\u001a\u00020*H\u0000¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000201H&JR\u00106\u001a\u00020*2\u0016\b\u0002\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020*0.2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0.2\u0012\b\u0002\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u0001092\b\b\u0002\u0010;\u001a\u000201J\u001f\u0010<\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b=J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\u0007H\u0002J\u0010\u0010@\u001a\u00020*2\b\u0010A\u001a\u0004\u0018\u00010\nJ\b\u0010B\u001a\u00020*H\u0002J\u0010\u0010C\u001a\u00020*2\b\u0010D\u001a\u0004\u0018\u00010\nJ\u0010\u0010E\u001a\u00020*2\b\u0010F\u001a\u0004\u0018\u00010\nJ\u0006\u0010G\u001a\u00020*J\u001c\u0010H\u001a\u00020**\u00020\u00112\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0002J\u0014\u0010K\u001a\u00020**\u00020\u00112\u0006\u00105\u001a\u000201H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020!@BX\u000e¢\u0006\b\n\u0000\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR\u000e\u0010'\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomTextInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "bottomPadding", "errorView", "Landroid/widget/TextView;", "getErrorView", "()Landroid/widget/TextView;", "inputEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "getInputEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "inputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "getInputLayout", "()Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "value", "inputTextValue", "getInputTextValue", "()Ljava/lang/String;", "setInputTextValue", "(Ljava/lang/String;)V", "littleBottomPadding", "littleBottomPaddingWithHint", "mediumPadding", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomTextInputLayout$State;", "state", "setState", "(Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomTextInputLayout$State;)V", "title", "getTitle", "topPadding", "topPaddingWithHint", "clearError", "", "createCustomWatcher", "Lcom/bamtechmedia/dominguez/core/design/widgets/CustomTextWatcher;", "onTextChanged", "Lkotlin/Function1;", "enable", "enabled", "", "installAccessibilityDelegate", "installAccessibilityDelegate$lib_release", "onChildFocusChangeAction", "hasFocus", "setActions", "validation", "parent", "", "Landroid/view/View;", "shouldHideKeyboard", "setCustomStyle", "setCustomStyle$lib_release", "setGravity", "gravityValue", "setHint", "newHintMessage", "setInputBackground", "setTitle", "titleValue", "showError", "error", "showValidation", "setInputTextPadding", "top", "bottom", "updateInputTextPadding", "Companion", "State", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a */
/* compiled from: CustomTextInputLayout.kt */
public abstract class C5704a extends ConstraintLayout {

    /* renamed from: r0 */
    private final int f13412r0;

    /* renamed from: s0 */
    private final int f13413s0;

    /* renamed from: t0 */
    private final int f13414t0;

    /* renamed from: u0 */
    private final int f13415u0;

    /* renamed from: v0 */
    private final int f13416v0;

    /* renamed from: w0 */
    private final int f13417w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public String f13418x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C5706b f13419y0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$a */
    /* compiled from: CustomTextInputLayout.kt */
    public static final class C5705a {
        private C5705a() {
        }

        public /* synthetic */ C5705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$b */
    /* compiled from: CustomTextInputLayout.kt */
    private enum C5706b {
        ERROR(C3836f.input_layout_unfocused_error),
        ERROR_FOCUS(C3836f.input_layout_focused_error),
        VALID(C3836f.input_layout_unfocused_valid),
        VALID_FOCUS(C3836f.input_layout_focused_valid),
        NONE(C3836f.input_layout_unfocused),
        NONE_FOCUS(C3836f.input_layout_focused);
        

        /* renamed from: c */
        private final int f13427c;

        private C5706b(int i) {
            this.f13427c = i;
        }

        /* renamed from: a */
        public final int mo17580a() {
            return this.f13427c;
        }

        /* renamed from: b */
        public final C5706b mo17582b(boolean z) {
            return z ? NONE_FOCUS : NONE;
        }

        /* renamed from: c */
        public final C5706b mo17583c(boolean z) {
            switch (C5713b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return mo17581a(z);
                case 3:
                case 4:
                    return mo17584d(z);
                case 5:
                case 6:
                    return mo17582b(z);
                default:
                    throw new C12898l();
            }
        }

        /* renamed from: d */
        public final C5706b mo17584d(boolean z) {
            return z ? VALID_FOCUS : VALID;
        }

        /* renamed from: a */
        public final C5706b mo17581a(boolean z) {
            return z ? ERROR_FOCUS : ERROR;
        }

        /* renamed from: b */
        private final boolean m18614b() {
            return this == ERROR_FOCUS || this == VALID_FOCUS || this == NONE_FOCUS;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$c */
    /* compiled from: CustomTextInputLayout.kt */
    static final class C5707c extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5704a f13428c;

        C5707c(C5704a aVar) {
            this.f13428c = aVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f13428c.mo2144c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$d */
    /* compiled from: CustomTextInputLayout.kt */
    public static final class C5708d extends AccessibilityDelegate {

        /* renamed from: a */
        final /* synthetic */ C5704a f13429a;

        C5708d(C5704a aVar) {
            this.f13429a = aVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setText(this.f13429a.f13418x0);
            }
            if (VERSION.SDK_INT >= 26 && accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setHintText(null);
            }
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setPassword(false);
            }
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setEditable(false);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$e */
    /* compiled from: EditTextExt.kt */
    public static final class C5709e implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C5704a f13430a;

        /* renamed from: b */
        final /* synthetic */ Function1 f13431b;

        public C5709e(C5704a aVar, Function1 function1) {
            this.f13430a = aVar;
            this.f13431b = function1;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 2) {
                return false;
            }
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "view");
            this.f13431b.invoke(this.f13430a.getInputTextValue());
            return true;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$f */
    /* compiled from: CustomTextInputLayout.kt */
    static final class C5710f extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        public static final C5710f f13432c = new C5710f();

        C5710f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$g */
    /* compiled from: CustomTextInputLayout.kt */
    static final class C5711g extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        public static final C5711g f13433c = new C5711g();

        C5711g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.a$h */
    /* compiled from: CustomTextInputLayout.kt */
    static final class C5712h implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ List f13434U;

        /* renamed from: c */
        final /* synthetic */ C5704a f13435c;

        C5712h(C5704a aVar, List list) {
            this.f13435c = aVar;
            this.f13434U = list;
        }

        public final void onFocusChange(View view, boolean z) {
            C5704a aVar = this.f13435c;
            aVar.setState(aVar.f13419y0.mo17583c(z));
            TextView title = this.f13435c.getTitle();
            if (title != null) {
                title.setSelected(z);
            }
            C5704a aVar2 = this.f13435c;
            aVar2.m18602a(aVar2.getInputEditText(), z);
            this.f13435c.mo17564b(z);
            Context context = this.f13435c.getContext();
            String str = "context";
            Intrinsics.checkReturnedValueIsNotNull((Object) context, str);
            if (!C5837i.m18843e(context)) {
                List<View> list = this.f13434U;
                if (list != null) {
                    for (View view2 : list) {
                        if (view2 != null) {
                            view2.setClickable(z);
                        }
                        if (view2 != null) {
                            view2.setFocusable(z);
                        }
                        if (view2 != null) {
                            view2.setFocusableInTouchMode(z);
                        }
                    }
                }
            }
            if (z) {
                Context context2 = this.f13435c.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context2, str);
                if (!C5837i.m18843e(context2)) {
                    C5843l.f13627a.mo17744b(this.f13435c.getInputEditText());
                    return;
                }
            }
            C5843l.f13627a.mo17743a(this.f13435c.getInputEditText());
            CustomInternalTextInputLayout inputLayout = this.f13435c.getInputLayout();
            if (inputLayout != null) {
                inputLayout.mo17546f();
            }
        }
    }

    static {
        new C5705a(null);
    }

    public C5704a(Context context) {
        this(context, null, 0, 6, null);
    }

    public C5704a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ C5704a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: e */
    private final void m18604e() {
        Context context = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        if (C5837i.m18843e(context)) {
            TextInputEditText inputEditText = getInputEditText();
            inputEditText.setBackground(C4025a.m13798c(inputEditText.getContext(), this.f13419y0.mo17580a()));
        }
    }

    private final void setGravity(int i) {
        TextInputEditText inputEditText = getInputEditText();
        int i2 = i != 0 ? i != 1 ? 8388613 : 17 : 8388611;
        inputEditText.setGravity(i2);
    }

    /* access modifiers changed from: private */
    public final void setState(C5706b bVar) {
        this.f13419y0 = bVar;
        m18604e();
    }

    /* renamed from: b */
    public abstract void mo17564b(boolean z);

    /* renamed from: c */
    public final void mo2144c() {
        C5706b bVar = this.f13419y0;
        if (bVar == C5706b.ERROR || bVar == C5706b.ERROR_FOCUS) {
            setState(C5706b.m18613b(this.f13419y0, false, 1, null));
            getErrorView().setVisibility(8);
            CustomInternalTextInputLayout inputLayout = getInputLayout();
            if (inputLayout != null) {
                inputLayout.mo17545e();
            }
        }
    }

    /* renamed from: d */
    public final void mo2146d() {
        getInputEditText().setAccessibilityDelegate(new C5708d(this));
    }

    public abstract TextView getErrorView();

    public abstract TextInputEditText getInputEditText();

    public abstract CustomInternalTextInputLayout getInputLayout();

    public final String getInputTextValue() {
        Editable text = getInputEditText().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public abstract TextView getTitle();

    public final void setHint(String str) {
        if (str != null) {
            Context context = getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
            if (C5837i.m18843e(context)) {
                getInputEditText().setHint(str);
            } else {
                CustomInternalTextInputLayout inputLayout = getInputLayout();
                if (inputLayout != null) {
                    inputLayout.setHint(str);
                }
            }
        }
    }

    public final void setInputTextValue(String str) {
        getInputEditText().setText(str);
        getInputEditText().setSelection(str != null ? str.length() : 0);
        if (!hasFocus()) {
            m18602a(getInputEditText(), false);
        }
    }

    public final void setTitle(String str) {
        Context context = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        if (C5837i.m18843e(context)) {
            TextView title = getTitle();
            if (title != null) {
                C4127b0.m14131b(title, str != null);
            }
            TextView title2 = getTitle();
            if (title2 != null) {
                title2.setText(str);
            }
        } else if (str != null) {
            CustomInternalTextInputLayout inputLayout = getInputLayout();
            if (inputLayout != null) {
                inputLayout.setHint(str);
            }
        }
    }

    public C5704a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        String str = "resources";
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, str);
        this.f13412r0 = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        Resources resources2 = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources2, str);
        this.f13413s0 = (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics());
        Resources resources3 = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources3, str);
        this.f13414t0 = (int) TypedValue.applyDimension(1, 18.0f, resources3.getDisplayMetrics());
        Resources resources4 = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources4, str);
        this.f13415u0 = (int) TypedValue.applyDimension(1, 36.0f, resources4.getDisplayMetrics());
        Resources resources5 = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources5, str);
        this.f13416v0 = (int) TypedValue.applyDimension(1, 32.0f, resources5.getDisplayMetrics());
        Resources resources6 = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources6, str);
        this.f13417w0 = (int) TypedValue.applyDimension(1, 28.0f, resources6.getDisplayMetrics());
        this.f13419y0 = C5706b.NONE;
    }

    /* renamed from: a */
    public final void mo17573a(Context context, AttributeSet attributeSet) {
        int[] iArr = C3843m.CustomTextInputLayout;
        Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.CustomTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setHint(C5880u.m18939a(obtainStyledAttributes, C3843m.CustomTextInputLayout_customHint, isInEditMode()));
        setTitle(C5880u.m18939a(obtainStyledAttributes, C3843m.CustomTextInputLayout_customTitle, isInEditMode()));
        setGravity(obtainStyledAttributes.getInt(C3843m.CustomTextInputLayout_customGravity, 0));
        this.f13418x0 = C5880u.m18939a(obtainStyledAttributes, C3843m.CustomTextInputLayout_customAccessibilityDescription, isInEditMode());
        obtainStyledAttributes.recycle();
        m18602a(getInputEditText(), false);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18600a(C5704a aVar, Function1 function1, Function1 function12, List list, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = C5710f.f13432c;
            }
            if ((i & 2) != 0) {
                function12 = C5711g.f13433c;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            aVar.mo17575a(function1, function12, list, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setActions");
    }

    /* renamed from: a */
    public final void mo17575a(Function1<? super String, C13145v> function1, Function1<? super String, C13145v> function12, List<? extends View> list, boolean z) {
        getInputEditText().setOnEditorActionListener(new C5709e(this, function1));
        getInputEditText().addTextChangedListener(m18596a(function12));
        getInputEditText().setOnFocusChangeListener(new C5712h(this, list));
        if (!z) {
            CustomInternalTextInputLayout inputLayout = getInputLayout();
            if (inputLayout != null) {
                inputLayout.requestFocus();
            } else {
                getInputEditText().requestFocus();
            }
        }
    }

    /* renamed from: a */
    private final C5664b m18596a(Function1<? super String, C13145v> function1) {
        return new C5664b(function1, new C5707c(this));
    }

    /* renamed from: a */
    public final void mo17574a(String str) {
        boolean z = true;
        int i = 0;
        setState(C5706b.m18612a(this.f13419y0, false, 1, null));
        getErrorView().setText(str);
        TextView errorView = getErrorView();
        if (str == null) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        errorView.setVisibility(i);
        CustomInternalTextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.mo17543a(getErrorView());
        }
    }

    /* renamed from: a */
    public void mo17570a(boolean z) {
        getInputEditText().setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18602a(TextInputEditText textInputEditText, boolean z) {
        if (getInputLayout() != null) {
            if (!z) {
                String inputTextValue = getInputTextValue();
                if (inputTextValue == null || C12832w.m40118a(inputTextValue)) {
                    textInputEditText.setCursorVisible(false);
                    m18601a(textInputEditText, 0, this.f13415u0);
                    return;
                }
            }
            Context context = textInputEditText.getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
            if (!C5837i.m18843e(context)) {
                CharSequence hint = textInputEditText.getHint();
                if (hint != null && (!C12832w.m40118a(hint))) {
                    m18601a(textInputEditText, this.f13414t0, this.f13417w0);
                    textInputEditText.setCursorVisible(true);
                }
            }
            m18601a(textInputEditText, this.f13413s0, this.f13416v0);
            textInputEditText.setCursorVisible(true);
        }
    }

    /* renamed from: a */
    private final void m18601a(TextInputEditText textInputEditText, int i, int i2) {
        int i3 = this.f13412r0;
        textInputEditText.setPadding(i3, i, i3, i2);
    }
}
