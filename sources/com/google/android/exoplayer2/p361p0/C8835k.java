package com.google.android.exoplayer2.p361p0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;

/* renamed from: com.google.android.exoplayer2.p0.k */
/* compiled from: AudioFocusManager */
public final class C8835k {

    /* renamed from: a */
    private final AudioManager f18837a;

    /* renamed from: b */
    private final C8837b f18838b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8838c f18839c;

    /* renamed from: d */
    private C8831i f18840d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f18841e;

    /* renamed from: f */
    private int f18842f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f18843g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f18844h;

    /* renamed from: i */
    private boolean f18845i;

    /* renamed from: com.google.android.exoplayer2.p0.k$b */
    /* compiled from: AudioFocusManager */
    private class C8837b implements OnAudioFocusChangeListener {
        private C8837b() {
        }

        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i == -2) {
                    C8835k.this.f18841e = 2;
                } else if (i == -1) {
                    C8835k.this.f18841e = -1;
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown focus change type: ");
                    sb.append(i);
                    Log.m29500d("AudioFocusManager", sb.toString());
                    return;
                } else {
                    C8835k.this.f18841e = 1;
                }
            } else if (C8835k.this.m25633i()) {
                C8835k.this.f18841e = 2;
            } else {
                C8835k.this.f18841e = 3;
            }
            int a = C8835k.this.f18841e;
            if (a == -1) {
                C8835k.this.f18839c.mo23011b(-1);
                C8835k.this.m25622b(true);
            } else if (a != 0) {
                if (a == 1) {
                    C8835k.this.f18839c.mo23011b(1);
                } else if (a == 2) {
                    C8835k.this.f18839c.mo23011b(0);
                } else if (a != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown audio focus state: ");
                    sb2.append(C8835k.this.f18841e);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            float f = C8835k.this.f18841e == 3 ? 0.2f : 1.0f;
            if (C8835k.this.f18843g != f) {
                C8835k.this.f18843g = f;
                C8835k.this.f18839c.mo23010a(f);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.k$c */
    /* compiled from: AudioFocusManager */
    public interface C8838c {
        /* renamed from: a */
        void mo23010a(float f);

        /* renamed from: b */
        void mo23011b(int i);
    }

    public C8835k(Context context, C8838c cVar) {
        this.f18837a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f18839c = cVar;
        this.f18838b = new C8837b();
        this.f18841e = 0;
    }

    /* renamed from: c */
    private int m25624c(boolean z) {
        return z ? 1 : -1;
    }

    /* renamed from: e */
    private void m25629e() {
        AudioFocusRequest audioFocusRequest = this.f18844h;
        if (audioFocusRequest != null) {
            this.f18837a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    private int m25630f() {
        int i;
        int i2 = 1;
        if (this.f18842f == 0) {
            if (this.f18841e != 0) {
                m25622b(true);
            }
            return 1;
        }
        if (this.f18841e == 0) {
            if (Util.SDK_INT >= 26) {
                i = m25632h();
            } else {
                i = m25631g();
            }
            this.f18841e = i == 1 ? 1 : 0;
        }
        int i3 = this.f18841e;
        if (i3 == 0) {
            return -1;
        }
        if (i3 == 2) {
            i2 = 0;
        }
        return i2;
    }

    /* renamed from: g */
    private int m25631g() {
        AudioManager audioManager = this.f18837a;
        C8837b bVar = this.f18838b;
        C8831i iVar = this.f18840d;
        C9537e.m29296a(iVar);
        return audioManager.requestAudioFocus(bVar, Util.m29438c(iVar.f18828c), this.f18842f);
    }

    /* renamed from: h */
    private int m25632h() {
        if (this.f18844h == null || this.f18845i) {
            AudioFocusRequest audioFocusRequest = this.f18844h;
            Builder builder = audioFocusRequest == null ? new Builder(this.f18842f) : new Builder(audioFocusRequest);
            boolean i = m25633i();
            C8831i iVar = this.f18840d;
            C9537e.m29296a(iVar);
            this.f18844h = builder.setAudioAttributes(iVar.mo23079a()).setWillPauseWhenDucked(i).setOnAudioFocusChangeListener(this.f18838b).build();
            this.f18845i = false;
        }
        return this.f18837a.requestAudioFocus(this.f18844h);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m25633i() {
        C8831i iVar = this.f18840d;
        return iVar != null && iVar.f18826a == 1;
    }

    /* renamed from: c */
    private void m25626c() {
        m25622b(false);
    }

    /* renamed from: d */
    private void m25628d() {
        this.f18837a.abandonAudioFocus(this.f18838b);
    }

    /* renamed from: b */
    public void mo23091b() {
        m25622b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25622b(boolean z) {
        if (this.f18842f != 0 || this.f18841e != 0) {
            if (this.f18842f != 1 || this.f18841e == -1 || z) {
                if (Util.SDK_INT >= 26) {
                    m25629e();
                } else {
                    m25628d();
                }
                this.f18841e = 0;
            }
        }
    }

    /* renamed from: a */
    public float mo23088a() {
        return this.f18843g;
    }

    /* renamed from: a */
    public int mo23089a(boolean z) {
        if (z) {
            return m25630f();
        }
        return -1;
    }

    /* renamed from: a */
    public int mo23090a(boolean z, int i) {
        if (!z) {
            m25626c();
            return -1;
        }
        return i == 1 ? m25624c(z) : m25630f();
    }
}
