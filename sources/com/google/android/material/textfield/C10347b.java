package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0293w;
import androidx.core.widget.C0513i;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p135s.C4187x;
import p096e.p147m.p149b.C4236a;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11462f;
import p163g.p449j.p450a.p468b.p469l.C11468a;
import p163g.p449j.p450a.p468b.p469l.C11469b;

/* renamed from: com.google.android.material.textfield.b */
/* compiled from: IndicatorViewController */
final class C10347b {

    /* renamed from: a */
    private final Context f24561a;

    /* renamed from: b */
    private final C10349c f24562b;

    /* renamed from: c */
    private LinearLayout f24563c;

    /* renamed from: d */
    private int f24564d;

    /* renamed from: e */
    private FrameLayout f24565e;

    /* renamed from: f */
    private int f24566f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f24567g;

    /* renamed from: h */
    private final float f24568h = ((float) this.f24561a.getResources().getDimensionPixelSize(C11460d.design_textinput_caption_translate_y));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f24569i;

    /* renamed from: j */
    private int f24570j;

    /* renamed from: k */
    private CharSequence f24571k;

    /* renamed from: l */
    private boolean f24572l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f24573m;

    /* renamed from: n */
    private int f24574n;

    /* renamed from: o */
    private CharSequence f24575o;

    /* renamed from: p */
    private boolean f24576p;

    /* renamed from: q */
    private TextView f24577q;

    /* renamed from: r */
    private int f24578r;

    /* renamed from: s */
    private Typeface f24579s;

    /* renamed from: com.google.android.material.textfield.b$a */
    /* compiled from: IndicatorViewController */
    class C10348a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f24580a;

        /* renamed from: b */
        final /* synthetic */ TextView f24581b;

        /* renamed from: c */
        final /* synthetic */ int f24582c;

        /* renamed from: d */
        final /* synthetic */ TextView f24583d;

        C10348a(int i, TextView textView, int i2, TextView textView2) {
            this.f24580a = i;
            this.f24581b = textView;
            this.f24582c = i2;
            this.f24583d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C10347b.this.f24569i = this.f24580a;
            C10347b.this.f24567g = null;
            TextView textView = this.f24581b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f24582c == 1 && C10347b.this.f24573m != null) {
                    C10347b.this.f24573m.setText(null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f24583d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C10347b(C10349c cVar) {
        this.f24561a = cVar.getContext();
        this.f24562b = cVar;
    }

    /* renamed from: d */
    private TextView m32690d(int i) {
        if (i == 1) {
            return this.f24573m;
        }
        if (i != 2) {
            return null;
        }
        return this.f24577q;
    }

    /* renamed from: e */
    private boolean m32691e(int i) {
        if (i != 1 || this.f24573m == null || TextUtils.isEmpty(this.f24571k)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m32692m() {
        return (this.f24563c == null || this.f24562b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26995a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27000b(CharSequence charSequence) {
        mo26996b();
        this.f24575o = charSequence;
        this.f24577q.setText(charSequence);
        if (this.f24569i != 2) {
            this.f24570j = 2;
        }
        m32685a(this.f24569i, this.f24570j, m32689a(this.f24577q, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo27003c() {
        return m32691e(this.f24570j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo27006f() {
        TextView textView = this.f24573m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public CharSequence mo27007g() {
        return this.f24575o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo27008h() {
        TextView textView = this.f24577q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo27009i() {
        this.f24571k = null;
        mo26996b();
        if (this.f24569i == 1) {
            if (!this.f24576p || TextUtils.isEmpty(this.f24575o)) {
                this.f24570j = 0;
            } else {
                this.f24570j = 2;
            }
        }
        m32685a(this.f24569i, this.f24570j, m32689a(this.f24573m, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo27010j() {
        mo26996b();
        if (this.f24569i == 2) {
            this.f24570j = 0;
        }
        m32685a(this.f24569i, this.f24570j, m32689a(this.f24577q, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo27011k() {
        return this.f24572l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo27012l() {
        return this.f24576p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo27002c(int i) {
        this.f24578r = i;
        TextView textView = this.f24577q;
        if (textView != null) {
            C0513i.m2778d(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public CharSequence mo27004d() {
        return this.f24571k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo27005e() {
        TextView textView = this.f24573m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26993a(CharSequence charSequence) {
        mo26996b();
        this.f24571k = charSequence;
        this.f24573m.setText(charSequence);
        if (this.f24569i != 1) {
            this.f24570j = 1;
        }
        m32685a(this.f24569i, this.f24570j, m32689a(this.f24573m, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26996b() {
        Animator animator = this.f24567g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26999b(TextView textView, int i) {
        if (this.f24563c != null) {
            if (mo26995a(i)) {
                FrameLayout frameLayout = this.f24565e;
                if (frameLayout != null) {
                    this.f24566f--;
                    m32686a((ViewGroup) frameLayout, this.f24566f);
                    this.f24565e.removeView(textView);
                    this.f24564d--;
                    m32686a((ViewGroup) this.f24563c, this.f24564d);
                }
            }
            this.f24563c.removeView(textView);
            this.f24564d--;
            m32686a((ViewGroup) this.f24563c, this.f24564d);
        }
    }

    /* renamed from: a */
    private boolean m32689a(TextView textView, CharSequence charSequence) {
        return C4187x.m14340E(this.f24562b) && this.f24562b.isEnabled() && (this.f24570j != this.f24569i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: a */
    private void m32685a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f24567g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m32688a(arrayList2, this.f24576p, this.f24577q, 2, i3, i4);
            m32688a(arrayList2, this.f24572l, this.f24573m, 1, i3, i4);
            C11469b.m36996a(animatorSet, arrayList);
            C10348a aVar = new C10348a(i2, m32690d(i), i, m32690d(i2));
            animatorSet.addListener(aVar);
            animatorSet.start();
        } else {
            m32684a(i, i2);
        }
        this.f24562b.mo27023c();
        this.f24562b.mo27021b(z);
        this.f24562b.mo27024d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27001b(boolean z) {
        if (this.f24576p != z) {
            mo26996b();
            if (z) {
                this.f24577q = new C0293w(this.f24561a);
                this.f24577q.setId(C11462f.textinput_helper_text);
                Typeface typeface = this.f24579s;
                if (typeface != null) {
                    this.f24577q.setTypeface(typeface);
                }
                this.f24577q.setVisibility(4);
                C4187x.m14388f(this.f24577q, 1);
                mo27002c(this.f24578r);
                mo26992a(this.f24577q, 1);
            } else {
                mo27010j();
                mo26999b(this.f24577q, 1);
                this.f24577q = null;
                this.f24562b.mo27023c();
                this.f24562b.mo27024d();
            }
            this.f24576p = z;
        }
    }

    /* renamed from: a */
    private void m32684a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m32690d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m32690d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f24569i = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26997b(int i) {
        this.f24574n = i;
        TextView textView = this.f24573m;
        if (textView != null) {
            this.f24562b.mo27017a(textView, i);
        }
    }

    /* renamed from: a */
    private void m32688a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m32682a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m32681a(textView));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26998b(ColorStateList colorStateList) {
        TextView textView = this.f24577q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    private ObjectAnimator m32682a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C11468a.f26815a);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m32681a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f24568h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C11468a.f26818d);
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26989a() {
        if (m32692m()) {
            C4187x.m14354a(this.f24563c, C4187x.m14403r(this.f24562b.getEditText()), 0, C4187x.m14402q(this.f24562b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26992a(TextView textView, int i) {
        if (this.f24563c == null && this.f24565e == null) {
            this.f24563c = new LinearLayout(this.f24561a);
            this.f24563c.setOrientation(0);
            this.f24562b.addView(this.f24563c, -1, -2);
            this.f24565e = new FrameLayout(this.f24561a);
            this.f24563c.addView(this.f24565e, -1, new LayoutParams(-2, -2));
            this.f24563c.addView(new C4236a(this.f24561a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f24562b.getEditText() != null) {
                mo26989a();
            }
        }
        if (mo26995a(i)) {
            this.f24565e.setVisibility(0);
            this.f24565e.addView(textView);
            this.f24566f++;
        } else {
            this.f24563c.addView(textView, i);
        }
        this.f24563c.setVisibility(0);
        this.f24564d++;
    }

    /* renamed from: a */
    private void m32686a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26994a(boolean z) {
        if (this.f24572l != z) {
            mo26996b();
            if (z) {
                this.f24573m = new C0293w(this.f24561a);
                this.f24573m.setId(C11462f.textinput_error);
                Typeface typeface = this.f24579s;
                if (typeface != null) {
                    this.f24573m.setTypeface(typeface);
                }
                mo26997b(this.f24574n);
                this.f24573m.setVisibility(4);
                C4187x.m14388f(this.f24573m, 1);
                mo26992a(this.f24573m, 0);
            } else {
                mo27009i();
                mo26999b(this.f24573m, 0);
                this.f24573m = null;
                this.f24562b.mo27023c();
                this.f24562b.mo27024d();
            }
            this.f24572l = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26991a(Typeface typeface) {
        if (typeface != this.f24579s) {
            this.f24579s = typeface;
            m32687a(this.f24573m, typeface);
            m32687a(this.f24577q, typeface);
        }
    }

    /* renamed from: a */
    private void m32687a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26990a(ColorStateList colorStateList) {
        TextView textView = this.f24573m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
