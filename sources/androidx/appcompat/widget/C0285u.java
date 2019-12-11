package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p096e.p121h.p134r.C4117i;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: AppCompatTextClassifierHelper */
final class C0285u {

    /* renamed from: a */
    private TextView f1242a;

    /* renamed from: b */
    private TextClassifier f1243b;

    C0285u(TextView textView) {
        C4117i.m14095a(textView);
        this.f1242a = textView;
    }

    /* renamed from: a */
    public void mo1924a(TextClassifier textClassifier) {
        this.f1243b = textClassifier;
    }

    /* renamed from: a */
    public TextClassifier mo1923a() {
        TextClassifier textClassifier = this.f1243b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1242a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}
