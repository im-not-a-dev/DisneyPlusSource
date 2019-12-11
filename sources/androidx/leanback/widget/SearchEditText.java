package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import p096e.p146l.C4233k;

public class SearchEditText extends C0692w {

    /* renamed from: d0 */
    private C0632a f2708d0;

    /* renamed from: androidx.leanback.widget.SearchEditText$a */
    public interface C0632a {
        /* renamed from: a */
        void mo3569a();
    }

    static {
        Class<SearchEditText> cls = SearchEditText.class;
    }

    public SearchEditText(Context context) {
        this(context, null);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i, keyEvent);
        }
        C0632a aVar = this.f2708d0;
        if (aVar != null) {
            aVar.mo3569a();
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(C0632a aVar) {
        this.f2708d0 = aVar;
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4233k.TextAppearance_Leanback_SearchTextEdit);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
