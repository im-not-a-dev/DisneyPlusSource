package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: s0 */
    private final Context f3060s0;

    /* renamed from: t0 */
    private final ArrayAdapter f3061t0;

    /* renamed from: u0 */
    private Spinner f3062u0;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C0761a implements OnItemSelectedListener {
        C0761a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo4223s()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo4224t()) && DropDownPreference.this.mo4230a((Object) charSequence)) {
                    DropDownPreference.this.mo4219d(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0775c.dropdownPreferenceStyle);
    }

    /* renamed from: v */
    private void m3841v() {
        this.f3061t0.clear();
        if (mo4221q() != null) {
            for (CharSequence charSequence : mo4221q()) {
                this.f3061t0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4212l() {
        super.mo4212l();
        this.f3061t0.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4211m() {
        this.f3062u0.performClick();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public ArrayAdapter mo4213u() {
        return new ArrayAdapter(this.f3060s0, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new C0761a();
        this.f3060s0 = context;
        this.f3061t0 = mo4213u();
        m3841v();
    }
}
