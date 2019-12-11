package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.m5 */
/* compiled from: TimeSeekBarDelegate */
public class C5066m5 extends C5059l5 {

    /* renamed from: a0 */
    OnSeekBarChangeListener f12351a0 = new C5067a();
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C5326w f12352b0;

    /* renamed from: c0 */
    private final SeekBar f12353c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C5300m f12354d0;

    /* renamed from: e0 */
    boolean f12355e0;

    /* renamed from: f0 */
    int f12356f0;

    /* renamed from: g.d.b.g0.m5$a */
    /* compiled from: TimeSeekBarDelegate */
    class C5067a implements OnSeekBarChangeListener {
        C5067a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C5066m5 m5Var = C5066m5.this;
                if (m5Var.f12340X > 0) {
                    long j = (long) i;
                    long j2 = m5Var.f12341Y;
                    if (j >= j2) {
                        i = (int) j2;
                        seekBar.setProgress(i);
                    }
                }
                C5066m5.this.f12354d0.mo17037g((long) i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C5066m5.this.f12356f0 = seekBar.getProgress();
            C5066m5.this.f12354d0.mo17028e(true);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            C5066m5 m5Var = C5066m5.this;
            m5Var.f12352b0.mo7602a(m5Var.f12338V + ((long) progress));
            C5066m5 m5Var2 = C5066m5.this;
            if (progress > m5Var2.f12356f0) {
                m5Var2.f12354d0.mo16968R0();
            } else {
                m5Var2.f12354d0.mo16966Q0();
            }
            C5066m5.this.f12354d0.mo17028e(false);
        }
    }

    @SuppressLint({"CheckResult"})
    public C5066m5(SeekBar seekBar, C5326w wVar, C5300m mVar) {
        super(seekBar, wVar, mVar);
        this.f12353c0 = seekBar;
        this.f12352b0 = wVar;
        this.f12354d0 = mVar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.f12351a0);
            mVar.mo17069t0().mo30192f((Consumer<? super T>) new C5029i2<Object>(this));
            mVar.mo17000a(21, 22);
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5008g<Object>(this));
            mVar.mo16953K().mo30192f((Consumer<? super T>) new C4994e3<Object>(this));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5119r1<Object>(this));
        }
    }

    /* renamed from: c */
    public void mo16549c(Boolean bool) throws Exception {
        C5311f.m17969b(this.f12353c0, bool.booleanValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16538a(Long l) {
        if (!this.f12355e0) {
            super.mo16538a(l);
        }
    }

    /* renamed from: b */
    public void mo16548b(Boolean bool) {
        this.f12355e0 = bool.booleanValue();
    }

    /* renamed from: b */
    public void mo16547b(int i) {
        if ((i == 21 || i == 22) && this.f12353c0.hasFocus()) {
            this.f12351a0.onStopTrackingTouch(this.f12353c0);
        }
    }

    /* renamed from: a */
    public void mo16536a(long j) {
        if (!this.f12355e0) {
            super.mo16536a(j);
        }
    }

    /* renamed from: a */
    public void mo16546a(int i) {
        if ((i == 21 || i == 22) && this.f12353c0.hasFocus()) {
            this.f12351a0.onStartTrackingTouch(this.f12353c0);
        }
    }
}
