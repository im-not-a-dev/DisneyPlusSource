package p163g.p174d.p178b.p185g0.p186v5;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;

/* renamed from: g.d.b.g0.v5.f */
/* compiled from: AudioFocusFlowFactory */
public class C5177f {

    /* renamed from: a */
    private AudioManager f12503a;

    public C5177f(AudioManager audioManager) {
        this.f12503a = audioManager;
    }

    /* renamed from: a */
    private boolean m17499a() {
        return VERSION.SDK_INT >= 26;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5176e mo16681a(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return m17499a() ? new C5178g(this.f12503a, onAudioFocusChangeListener) : new C5176e(this.f12503a, onAudioFocusChangeListener);
    }
}
