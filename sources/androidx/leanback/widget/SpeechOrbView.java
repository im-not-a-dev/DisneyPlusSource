package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView.C0635c;
import p096e.p146l.C4224b;
import p096e.p146l.C4226d;
import p096e.p146l.C4227e;
import p096e.p146l.C4230h;

public class SpeechOrbView extends SearchOrbView {

    /* renamed from: o0 */
    private final float f2747o0;

    /* renamed from: p0 */
    private C0635c f2748p0;

    /* renamed from: q0 */
    private C0635c f2749q0;

    /* renamed from: r0 */
    private int f2750r0;

    /* renamed from: s0 */
    private boolean f2751s0;

    public SpeechOrbView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo3634a() {
        setOrbColors(this.f2748p0);
        setOrbIcon(getResources().getDrawable(C4226d.lb_ic_search_mic));
        mo3595a(true);
        mo3596b(false);
        mo3594a(1.0f);
        this.f2750r0 = 0;
        this.f2751s0 = true;
    }

    /* renamed from: b */
    public void mo3635b() {
        setOrbColors(this.f2749q0);
        setOrbIcon(getResources().getDrawable(C4226d.lb_ic_search_mic_out));
        mo3595a(hasFocus());
        mo3594a(1.0f);
        this.f2751s0 = false;
    }

    /* access modifiers changed from: 0000 */
    public int getLayoutResourceId() {
        return C4230h.lb_speech_orb;
    }

    public void setListeningOrbColors(C0635c cVar) {
        this.f2748p0 = cVar;
    }

    public void setNotListeningOrbColors(C0635c cVar) {
        this.f2749q0 = cVar;
    }

    public void setSoundLevel(int i) {
        if (this.f2751s0) {
            int i2 = this.f2750r0;
            if (i > i2) {
                this.f2750r0 = i2 + ((i - i2) / 2);
            } else {
                this.f2750r0 = (int) (((float) i2) * 0.7f);
            }
            mo3594a((((this.f2747o0 - getFocusedZoom()) * ((float) this.f2750r0)) / 100.0f) + 1.0f);
        }
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2750r0 = 0;
        this.f2751s0 = false;
        Resources resources = context.getResources();
        this.f2747o0 = resources.getFraction(C4227e.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f2749q0 = new C0635c(resources.getColor(C4224b.lb_speech_orb_not_recording), resources.getColor(C4224b.lb_speech_orb_not_recording_pulsed), resources.getColor(C4224b.lb_speech_orb_not_recording_icon));
        this.f2748p0 = new C0635c(resources.getColor(C4224b.lb_speech_orb_recording), resources.getColor(C4224b.lb_speech_orb_recording), 0);
        mo3635b();
    }
}
