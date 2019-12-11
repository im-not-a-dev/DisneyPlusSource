package com.google.android.material.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0238i;
import p163g.p449j.p450a.p468b.C11458b;

public class TextInputEditText extends C0238i {
    public TextInputEditText(Context context) {
        this(context, null);
    }

    private CharSequence getHintFromLayout() {
        C10349c textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private C10349c getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C10349c) {
                return (C10349c) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        C10349c textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo27022b()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11458b.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
