package p163g.p174d.p178b.p185g0.p186v5;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import p686n.p687a.C14100a;

/* renamed from: g.d.b.g0.v5.g */
/* compiled from: OreoAudioFocusFlow */
class C5178g extends C5176e {

    /* renamed from: c */
    private AudioFocusRequest f12504c;

    C5178g(AudioManager audioManager, OnAudioFocusChangeListener onAudioFocusChangeListener) {
        super(audioManager, onAudioFocusChangeListener);
    }

    /* renamed from: b */
    private AudioFocusRequest m17501b() {
        return new Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setOnAudioFocusChangeListener(this.f12502b, new Handler()).build();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16679a(Object obj) {
        this.f12504c = m17501b();
        int requestAudioFocus = this.f12501a.requestAudioFocus(this.f12504c);
        StringBuilder sb = new StringBuilder();
        sb.append("Audio Focus Granted ");
        boolean z = true;
        if (requestAudioFocus != 1) {
            z = false;
        }
        sb.append(z);
        C14100a.m44529c(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16678a() {
        this.f12501a.abandonAudioFocusRequest(this.f12504c);
    }
}
