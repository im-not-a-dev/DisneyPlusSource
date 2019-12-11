package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatButton;
import p163g.p449j.p450a.p468b.p470m.C11478a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new C11478a(context, attributeSet);
    }
}
