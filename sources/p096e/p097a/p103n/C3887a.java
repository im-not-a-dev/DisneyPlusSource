package p096e.p097a.p103n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: e.a.n.a */
/* compiled from: AllCapsTransformationMethod */
public class C3887a implements TransformationMethod {

    /* renamed from: c */
    private Locale f9608c;

    public C3887a(Context context) {
        this.f9608c = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f9608c);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
