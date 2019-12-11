package com.google.android.exoplayer2.p391ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9295d.C9302f;
import com.google.android.exoplayer2.trackselection.C9306f.C9307a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: U */
    private final LayoutInflater f21717U;

    /* renamed from: V */
    private final CheckedTextView f21718V;

    /* renamed from: W */
    private final CheckedTextView f21719W;

    /* renamed from: a0 */
    private final C9397b f21720a0;

    /* renamed from: b0 */
    private final SparseArray<C9302f> f21721b0;

    /* renamed from: c */
    private final int f21722c;

    /* renamed from: c0 */
    private boolean f21723c0;

    /* renamed from: d0 */
    private boolean f21724d0;

    /* renamed from: e0 */
    private C9420q f21725e0;

    /* renamed from: f0 */
    private CheckedTextView[][] f21726f0;

    /* renamed from: g0 */
    private C9307a f21727g0;

    /* renamed from: h0 */
    private int f21728h0;

    /* renamed from: i0 */
    private TrackGroupArray f21729i0;

    /* renamed from: j0 */
    private boolean f21730j0;

    /* renamed from: k0 */
    private C9398c f21731k0;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    private class C9397b implements OnClickListener {
        private C9397b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.m28779a(view);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public interface C9398c {
        /* renamed from: a */
        void mo24337a(boolean z, List<C9302f> list);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m28783b() {
        this.f21730j0 = true;
        this.f21721b0.clear();
    }

    /* renamed from: c */
    private boolean m28786c() {
        return this.f21724d0 && this.f21729i0.f20170c > 1;
    }

    /* renamed from: d */
    private void m28787d() {
        this.f21718V.setChecked(this.f21730j0);
        this.f21719W.setChecked(!this.f21730j0 && this.f21721b0.size() == 0);
        for (int i = 0; i < this.f21726f0.length; i++) {
            C9302f fVar = (C9302f) this.f21721b0.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f21726f0;
                if (i2 >= checkedTextViewArr[i].length) {
                    break;
                }
                checkedTextViewArr[i][i2].setChecked(fVar != null && fVar.mo24113a(i2));
                i2++;
            }
        }
    }

    /* renamed from: e */
    private void m28788e() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f21727g0 == null) {
            this.f21718V.setEnabled(false);
            this.f21719W.setEnabled(false);
            return;
        }
        this.f21718V.setEnabled(true);
        this.f21719W.setEnabled(true);
        this.f21729i0 = this.f21727g0.mo24130b(this.f21728h0);
        this.f21726f0 = new CheckedTextView[this.f21729i0.f20170c][];
        boolean c = m28786c();
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f21729i0;
            if (i < trackGroupArray.f20170c) {
                C9199j0 a = trackGroupArray.mo23531a(i);
                boolean a2 = m28781a(i);
                this.f21726f0[i] = new CheckedTextView[a.f20833c];
                for (int i2 = 0; i2 < a.f20833c; i2++) {
                    if (i2 == 0) {
                        addView(this.f21717U.inflate(C9414l.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f21717U.inflate((a2 || c) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.f21722c);
                    checkedTextView.setText(this.f21725e0.mo24376a(a.mo23902a(i2)));
                    if (this.f21727g0.mo24128b(this.f21728h0, i, i2) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                        checkedTextView.setOnClickListener(this.f21720a0);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f21726f0[i][i2] = checkedTextView;
                    addView(checkedTextView);
                }
                i++;
            } else {
                m28787d();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f21730j0;
    }

    public List<C9302f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f21721b0.size());
        for (int i = 0; i < this.f21721b0.size(); i++) {
            arrayList.add(this.f21721b0.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f21723c0 != z) {
            this.f21723c0 = z;
            m28788e();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f21724d0 != z) {
            this.f21724d0 = z;
            if (!z && this.f21721b0.size() > 1) {
                for (int size = this.f21721b0.size() - 1; size > 0; size--) {
                    this.f21721b0.remove(size);
                }
            }
            m28788e();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f21718V.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(C9420q qVar) {
        Assertions.checkNotNull(qVar);
        this.f21725e0 = qVar;
        m28788e();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28779a(View view) {
        if (view == this.f21718V) {
            m28783b();
        } else if (view == this.f21719W) {
            m28778a();
        } else {
            m28784b(view);
        }
        m28787d();
        C9398c cVar = this.f21731k0;
        if (cVar != null) {
            cVar.mo24337a(getIsDisabled(), getOverrides());
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f21721b0 = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.f21722c = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.f21717U = LayoutInflater.from(context);
        this.f21720a0 = new C9397b();
        this.f21725e0 = new C9404f(getResources());
        this.f21729i0 = TrackGroupArray.f20167W;
        this.f21718V = (CheckedTextView) this.f21717U.inflate(17367055, this, false);
        this.f21718V.setBackgroundResource(this.f21722c);
        this.f21718V.setText(C9415m.exo_track_selection_none);
        this.f21718V.setEnabled(false);
        this.f21718V.setFocusable(true);
        this.f21718V.setOnClickListener(this.f21720a0);
        this.f21718V.setVisibility(8);
        addView(this.f21718V);
        addView(this.f21717U.inflate(C9414l.exo_list_divider, this, false));
        this.f21719W = (CheckedTextView) this.f21717U.inflate(17367055, this, false);
        this.f21719W.setBackgroundResource(this.f21722c);
        this.f21719W.setText(C9415m.exo_track_selection_auto);
        this.f21719W.setEnabled(false);
        this.f21719W.setFocusable(true);
        this.f21719W.setOnClickListener(this.f21720a0);
        addView(this.f21719W);
    }

    /* renamed from: b */
    private void m28784b(View view) {
        this.f21730j0 = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        C9302f fVar = (C9302f) this.f21721b0.get(intValue);
        Assertions.checkNotNull(this.f21727g0);
        if (fVar == null) {
            if (!this.f21724d0 && this.f21721b0.size() > 0) {
                this.f21721b0.clear();
            }
            this.f21721b0.put(intValue, new C9302f(intValue, intValue2));
            return;
        }
        int i = fVar.f21272V;
        int[] iArr = fVar.f21271U;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean a = m28781a(intValue);
        boolean z = a || m28786c();
        if (!isChecked || !z) {
            if (isChecked) {
                return;
            }
            if (a) {
                this.f21721b0.put(intValue, new C9302f(intValue, m28782a(iArr, intValue2)));
            } else {
                this.f21721b0.put(intValue, new C9302f(intValue, intValue2));
            }
        } else if (i == 1) {
            this.f21721b0.remove(intValue);
        } else {
            this.f21721b0.put(intValue, new C9302f(intValue, m28785b(iArr, intValue2)));
        }
    }

    /* renamed from: a */
    private void m28778a() {
        this.f21730j0 = false;
        this.f21721b0.clear();
    }

    /* renamed from: a */
    private boolean m28781a(int i) {
        if (!this.f21723c0 || this.f21729i0.mo23531a(i).f20833c <= 1 || this.f21727g0.mo24126a(this.f21728h0, i, false) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m28782a(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: b */
    private static int[] m28785b(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                int i4 = i2 + 1;
                iArr2[i2] = i3;
                i2 = i4;
            }
        }
        return iArr2;
    }
}
