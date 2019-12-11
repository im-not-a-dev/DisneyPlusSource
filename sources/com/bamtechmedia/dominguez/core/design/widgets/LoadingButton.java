package com.bamtechmedia.dominguez.core.design.widgets;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bamtechmedia.dominguez.core.p088i.C3831a;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\b¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "Landroid/widget/ViewFlipper;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setContentDescription", "", "contentDescription", "", "setText", "text", "Landroid/text/Spannable;", "title", "", "start", "stop", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LoadingButton.kt */
public final class LoadingButton extends ViewFlipper {

    /* renamed from: c */
    private HashMap f13244c;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.LoadingButton$a */
    /* compiled from: LoadingButton.kt */
    public static final class C5640a {
        private C5640a() {
        }

        public /* synthetic */ C5640a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5640a(null);
    }

    public LoadingButton(Context context) {
        this(context, null, 2, null);
    }

    public /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* renamed from: a */
    public View mo17424a(int i) {
        if (this.f13244c == null) {
            this.f13244c = new HashMap();
        }
        View view = (View) this.f13244c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13244c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo17425a() {
        setEnabled(false);
        setDisplayedChild(1);
    }

    /* renamed from: b */
    public final void mo17426b() {
        setDisplayedChild(0);
        setEnabled(true);
    }

    public final void setContentDescription(String str) {
        TextView textView = (TextView) mo17424a(C3838h.buttonTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "buttonTextView");
        textView.setContentDescription(str);
    }

    public final void setText(int i) {
        TextView textView = (TextView) mo17424a(C3838h.buttonTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "buttonTextView");
        C5880u.m18941a(textView, i);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C3840j.loading_button, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843087, 16843379}, 0, 0);
        TextView textView = (TextView) mo17424a(C3838h.buttonTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "buttonTextView");
        textView.setText(obtainStyledAttributes.getText(0));
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            setContentDescription(C5880u.m18936a(resourceId));
        }
        obtainStyledAttributes.recycle();
        setBackgroundResource(C5837i.m18843e(context) ? C3836f.profile_button_background_valid : C3836f.primary_button_bg);
        setFocusable(true);
        if (C5837i.m18843e(context)) {
            setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, C3831a.default_button_animator));
        }
    }

    public final void setText(String str) {
        TextView textView = (TextView) mo17424a(C3838h.buttonTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "buttonTextView");
        textView.setText(str);
    }

    public final void setText(Spannable spannable) {
        TextView textView = (TextView) mo17424a(C3838h.buttonTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "buttonTextView");
        textView.setText(spannable);
    }
}
