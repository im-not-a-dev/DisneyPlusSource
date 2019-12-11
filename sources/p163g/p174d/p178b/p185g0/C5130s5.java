package p163g.p174d.p178b.p185g0;

import android.app.Activity;
import android.media.AudioManager;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.s5 */
/* compiled from: VolumeSeekBarDelegate */
public class C5130s5 implements C5271z3 {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public AudioManager f12443U;

    /* renamed from: V */
    private final SeekBar f12444V;

    /* renamed from: c */
    final OnSeekBarChangeListener f12445c;

    /* renamed from: g.d.b.g0.s5$a */
    /* compiled from: VolumeSeekBarDelegate */
    class C5131a implements OnSeekBarChangeListener {
        C5131a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C5130s5.this.f12443U.setStreamVolume(3, i, 0);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public C5130s5(Activity activity, SeekBar seekBar, C5300m mVar) {
        this(activity, (AudioManager) activity.getSystemService("audio"), seekBar, mVar);
    }

    C5130s5(Activity activity, AudioManager audioManager, SeekBar seekBar, C5300m mVar) {
        this.f12445c = new C5131a();
        this.f12443U = audioManager;
        this.f12444V = seekBar;
        if (seekBar != null) {
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5168v1<Object>(this));
            mVar.mo17000a(25, 24);
            m17437a();
        }
    }

    /* renamed from: a */
    private void m17437a() {
        this.f12444V.setMax(this.f12443U.getStreamMaxVolume(3));
        this.f12444V.setProgress(this.f12443U.getStreamVolume(3));
        this.f12444V.setOnSeekBarChangeListener(this.f12445c);
    }

    /* renamed from: a */
    public void mo16622a(int i) {
        int i2;
        if (i == 24) {
            i2 = 1;
        } else if (i == 25) {
            i2 = -1;
        } else {
            return;
        }
        int streamVolume = this.f12443U.getStreamVolume(3) + i2;
        this.f12443U.setStreamVolume(3, streamVolume, 0);
        this.f12444V.setProgress(streamVolume);
    }
}
