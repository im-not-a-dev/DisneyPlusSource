package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SeekBarPreference extends Preference {

    /* renamed from: m0 */
    int f3093m0;

    /* renamed from: n0 */
    int f3094n0;

    /* renamed from: o0 */
    private int f3095o0;

    /* renamed from: p0 */
    private int f3096p0;

    /* renamed from: q0 */
    boolean f3097q0;

    /* renamed from: r0 */
    SeekBar f3098r0;

    /* renamed from: s0 */
    private TextView f3099s0;

    /* renamed from: t0 */
    boolean f3100t0;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C0767a implements OnSeekBarChangeListener {
        C0767a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (!seekBarPreference.f3097q0) {
                    seekBarPreference.mo4258a(seekBar);
                }
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3097q0 = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3097q0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3094n0 != seekBarPreference.f3093m0) {
                seekBarPreference.mo4258a(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C0768b implements OnKeyListener {
        C0768b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if ((!SeekBarPreference.this.f3100t0 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = SeekBarPreference.this.f3098r0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new C0767a();
        new C0768b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.SeekBarPreference, i, i2);
        this.f3094n0 = obtainStyledAttributes.getInt(C0778f.SeekBarPreference_min, 0);
        mo4259c(obtainStyledAttributes.getInt(C0778f.SeekBarPreference_android_max, 100));
        mo4260d(obtainStyledAttributes.getInt(C0778f.SeekBarPreference_seekBarIncrement, 0));
        this.f3100t0 = obtainStyledAttributes.getBoolean(C0778f.SeekBarPreference_adjustable, true);
        obtainStyledAttributes.getBoolean(C0778f.SeekBarPreference_showSeekBarValue, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: c */
    public final void mo4259c(int i) {
        int i2 = this.f3094n0;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f3095o0) {
            this.f3095o0 = i;
            mo4212l();
        }
    }

    /* renamed from: d */
    public final void mo4260d(int i) {
        if (i != this.f3096p0) {
            this.f3096p0 = Math.min(this.f3095o0 - this.f3094n0, Math.abs(i));
            mo4212l();
        }
    }

    /* renamed from: a */
    private void m3896a(int i, boolean z) {
        int i2 = this.f3094n0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f3095o0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f3093m0) {
            this.f3093m0 = i;
            TextView textView = this.f3099s0;
            if (textView != null) {
                textView.setText(String.valueOf(this.f3093m0));
            }
            mo4235b(i);
            if (z) {
                mo4212l();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4258a(SeekBar seekBar) {
        int progress = this.f3094n0 + seekBar.getProgress();
        if (progress == this.f3093m0) {
            return;
        }
        if (mo4230a((Object) Integer.valueOf(progress))) {
            m3896a(progress, false);
        } else {
            seekBar.setProgress(this.f3093m0 - this.f3094n0);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0775c.seekBarPreferenceStyle);
    }
}
