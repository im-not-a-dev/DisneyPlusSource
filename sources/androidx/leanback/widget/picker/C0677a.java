package androidx.leanback.widget.picker;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.C0674o;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p146l.C4225c;
import p096e.p146l.C4228f;
import p096e.p146l.C4230h;

/* renamed from: androidx.leanback.widget.picker.a */
/* compiled from: Picker */
public class C0677a extends FrameLayout {

    /* renamed from: U */
    private ViewGroup f2904U;

    /* renamed from: V */
    final List<VerticalGridView> f2905V = new ArrayList();

    /* renamed from: W */
    ArrayList<C0682b> f2906W;

    /* renamed from: a0 */
    private float f2907a0;

    /* renamed from: b0 */
    private float f2908b0;

    /* renamed from: c */
    private ViewGroup f2909c;

    /* renamed from: c0 */
    private float f2910c0;

    /* renamed from: d0 */
    private float f2911d0;

    /* renamed from: e0 */
    private int f2912e0;

    /* renamed from: f0 */
    private Interpolator f2913f0;

    /* renamed from: g0 */
    private ArrayList<C0680c> f2914g0;

    /* renamed from: h0 */
    private float f2915h0 = 3.0f;

    /* renamed from: i0 */
    private float f2916i0 = 1.0f;

    /* renamed from: j0 */
    private int f2917j0 = 0;

    /* renamed from: k0 */
    private List<CharSequence> f2918k0 = new ArrayList();

    /* renamed from: l0 */
    private int f2919l0 = C4230h.lb_picker_item;

    /* renamed from: m0 */
    private int f2920m0 = 0;

    /* renamed from: n0 */
    private final C0674o f2921n0 = new C0678a();

    /* renamed from: androidx.leanback.widget.picker.a$a */
    /* compiled from: Picker */
    class C0678a extends C0674o {
        C0678a() {
        }

        /* renamed from: a */
        public void mo3989a(RecyclerView recyclerView, C0794d0 d0Var, int i, int i2) {
            C0679b bVar = (C0679b) recyclerView.getAdapter();
            int indexOf = C0677a.this.f2905V.indexOf(recyclerView);
            C0677a.this.mo4009a(indexOf, true);
            if (d0Var != null) {
                C0677a.this.mo3996a(indexOf, ((C0682b) C0677a.this.f2906W.get(indexOf)).mo4046d() + i);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.picker.a$b */
    /* compiled from: Picker */
    class C0679b extends C0797g<C0681d> {

        /* renamed from: a */
        private final int f2923a;

        /* renamed from: b */
        private final int f2924b;

        /* renamed from: c */
        private final int f2925c;

        /* renamed from: d */
        private C0682b f2926d;

        C0679b(Context context, int i, int i2, int i3) {
            this.f2923a = i;
            this.f2924b = i3;
            this.f2925c = i2;
            this.f2926d = (C0682b) C0677a.this.f2906W.get(this.f2924b);
        }

        /* renamed from: a */
        public void onBindViewHolder(C0681d dVar, int i) {
            TextView textView = dVar.f2928a;
            if (textView != null) {
                C0682b bVar = this.f2926d;
                if (bVar != null) {
                    textView.setText(bVar.mo4039a(bVar.mo4046d() + i));
                }
            }
            C0677a aVar = C0677a.this;
            aVar.mo4010a(dVar.itemView, ((VerticalGridView) aVar.f2905V.get(this.f2924b)).getSelectedPosition() == i, this.f2924b, false);
        }

        public int getItemCount() {
            C0682b bVar = this.f2926d;
            if (bVar == null) {
                return 0;
            }
            return bVar.mo4038a();
        }

        public C0681d onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2923a, viewGroup, false);
            int i2 = this.f2925c;
            if (i2 != 0) {
                textView = (TextView) inflate.findViewById(i2);
            } else {
                textView = (TextView) inflate;
            }
            return new C0681d(inflate, textView);
        }

        /* renamed from: a */
        public void onViewAttachedToWindow(C0681d dVar) {
            dVar.itemView.setFocusable(C0677a.this.isActivated());
        }
    }

    /* renamed from: androidx.leanback.widget.picker.a$c */
    /* compiled from: Picker */
    public interface C0680c {
        /* renamed from: a */
        void mo4037a(C0677a aVar, int i);
    }

    /* renamed from: androidx.leanback.widget.picker.a$d */
    /* compiled from: Picker */
    static class C0681d extends C0794d0 {

        /* renamed from: a */
        final TextView f2928a;

        C0681d(View view, TextView textView) {
            super(view);
            this.f2928a = textView;
        }
    }

    public C0677a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEnabled(true);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        this.f2908b0 = 1.0f;
        this.f2907a0 = 1.0f;
        this.f2910c0 = 0.5f;
        this.f2911d0 = 0.0f;
        this.f2912e0 = HttpStatus.HTTP_OK;
        this.f2913f0 = new DecelerateInterpolator(2.5f);
        new AccelerateInterpolator(2.5f);
        this.f2909c = (ViewGroup) LayoutInflater.from(getContext()).inflate(C4230h.lb_picker, this, true);
        this.f2904U = (ViewGroup) this.f2909c.findViewById(C4228f.picker);
    }

    /* renamed from: b */
    private void m3603b(int i) {
        ArrayList<C0680c> arrayList = this.f2914g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0680c) this.f2914g0.get(size)).mo4037a(this, i);
            }
        }
    }

    /* renamed from: a */
    public C0682b mo4006a(int i) {
        ArrayList<C0682b> arrayList = this.f2906W;
        if (arrayList == null) {
            return null;
        }
        return (C0682b) arrayList.get(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public float getActivatedVisibleItemCount() {
        return this.f2915h0;
    }

    public int getColumnsCount() {
        ArrayList<C0682b> arrayList = this.f2906W;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(C4225c.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.f2919l0;
    }

    public final int getPickerItemTextViewId() {
        return this.f2920m0;
    }

    public int getSelectedColumn() {
        return this.f2917j0;
    }

    public final CharSequence getSeparator() {
        return (CharSequence) this.f2918k0.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f2918k0;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f2905V.size()) {
            return ((VerticalGridView) this.f2905V.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i = 0; i < this.f2905V.size(); i++) {
            if (((VerticalGridView) this.f2905V.get(i)).hasFocus()) {
                setSelectedColumn(i);
            }
        }
    }

    public void setActivated(boolean z) {
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
        if (!z && hasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i = 0; i < getColumnsCount(); i++) {
            ((VerticalGridView) this.f2905V.get(i)).setFocusable(z);
        }
        mo3995a();
        m3602b();
        if (z && hasFocus && selectedColumn >= 0) {
            ((VerticalGridView) this.f2905V.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f2915h0 != f) {
            this.f2915h0 = f;
            if (isActivated()) {
                mo3995a();
            }
        }
    }

    public void setColumns(List<C0682b> list) {
        if (this.f2918k0.size() != 0) {
            if (this.f2918k0.size() == 1) {
                CharSequence charSequence = (CharSequence) this.f2918k0.get(0);
                this.f2918k0.clear();
                String str = "";
                this.f2918k0.add(str);
                for (int i = 0; i < list.size() - 1; i++) {
                    this.f2918k0.add(charSequence);
                }
                this.f2918k0.add(str);
            } else if (this.f2918k0.size() != list.size() + 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Separators size: ");
                sb.append(this.f2918k0.size());
                sb.append(" must");
                sb.append("equal the size of columns: ");
                sb.append(list.size());
                sb.append(" + 1");
                throw new IllegalStateException(sb.toString());
            }
            this.f2905V.clear();
            this.f2904U.removeAllViews();
            this.f2906W = new ArrayList<>(list);
            if (this.f2917j0 > this.f2906W.size() - 1) {
                this.f2917j0 = this.f2906W.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty((CharSequence) this.f2918k0.get(0))) {
                TextView textView = (TextView) from.inflate(C4230h.lb_picker_separator, this.f2904U, false);
                textView.setText((CharSequence) this.f2918k0.get(0));
                this.f2904U.addView(textView);
            }
            int i2 = 0;
            while (i2 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(C4230h.lb_picker_column, this.f2904U, false);
                m3601a(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                this.f2905V.add(verticalGridView);
                this.f2904U.addView(verticalGridView);
                int i3 = i2 + 1;
                if (!TextUtils.isEmpty((CharSequence) this.f2918k0.get(i3))) {
                    TextView textView2 = (TextView) from.inflate(C4230h.lb_picker_separator, this.f2904U, false);
                    textView2.setText((CharSequence) this.f2918k0.get(i3));
                    this.f2904U.addView(textView2);
                }
                C0679b bVar = new C0679b(getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i2);
                verticalGridView.setAdapter(bVar);
                verticalGridView.setOnChildViewHolderSelectedListener(this.f2921n0);
                i2 = i3;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Separators size is: ");
        sb2.append(this.f2918k0.size());
        sb2.append(". At least one separator must be provided");
        throw new IllegalStateException(sb2.toString());
    }

    public final void setPickerItemTextViewId(int i) {
        this.f2920m0 = i;
    }

    public void setSelectedColumn(int i) {
        if (this.f2917j0 != i) {
            this.f2917j0 = i;
            for (int i2 = 0; i2 < this.f2905V.size(); i2++) {
                mo4009a(i2, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(new CharSequence[]{charSequence}));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.f2918k0.clear();
        this.f2918k0.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f2916i0 != f) {
            this.f2916i0 = f;
            if (!isActivated()) {
                mo3995a();
            }
        }
    }

    /* renamed from: a */
    public void mo4008a(int i, C0682b bVar) {
        this.f2906W.set(i, bVar);
        VerticalGridView verticalGridView = (VerticalGridView) this.f2905V.get(i);
        C0679b bVar2 = (C0679b) verticalGridView.getAdapter();
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
        verticalGridView.setSelectedPosition(bVar.mo4042b() - bVar.mo4046d());
    }

    /* renamed from: b */
    private void m3602b() {
        boolean isActivated = isActivated();
        for (int i = 0; i < getColumnsCount(); i++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.f2905V.get(i);
            for (int i2 = 0; i2 < verticalGridView.getChildCount(); i2++) {
                verticalGridView.getChildAt(i2).setFocusable(isActivated);
            }
        }
    }

    /* renamed from: a */
    public void mo4007a(int i, int i2, boolean z) {
        C0682b bVar = (C0682b) this.f2906W.get(i);
        if (bVar.mo4042b() != i2) {
            bVar.mo4043b(i2);
            m3603b(i);
            VerticalGridView verticalGridView = (VerticalGridView) this.f2905V.get(i);
            if (verticalGridView != null) {
                int d = i2 - ((C0682b) this.f2906W.get(i)).mo4046d();
                if (z) {
                    verticalGridView.setSelectedPositionSmooth(d);
                } else {
                    verticalGridView.setSelectedPosition(d);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4009a(int i, boolean z) {
        VerticalGridView verticalGridView = (VerticalGridView) this.f2905V.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().getItemCount()) {
            View c = verticalGridView.getLayoutManager().mo4337c(i2);
            if (c != null) {
                mo4010a(c, selectedPosition == i2, i, z);
            }
            i2++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4010a(View view, boolean z, int i, boolean z2) {
        boolean z3 = i == this.f2917j0 || !hasFocus();
        if (z) {
            if (z3) {
                m3600a(view, z2, this.f2908b0, -1.0f, this.f2913f0);
            } else {
                m3600a(view, z2, this.f2907a0, -1.0f, this.f2913f0);
            }
        } else if (z3) {
            m3600a(view, z2, this.f2910c0, -1.0f, this.f2913f0);
        } else {
            m3600a(view, z2, this.f2911d0, -1.0f, this.f2913f0);
        }
    }

    /* renamed from: a */
    private void m3600a(View view, boolean z, float f, float f2, Interpolator interpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f);
            return;
        }
        if (f2 >= 0.0f) {
            view.setAlpha(f2);
        }
        view.animate().alpha(f).setDuration((long) this.f2912e0).setInterpolator(interpolator).start();
    }

    /* renamed from: a */
    public void mo3996a(int i, int i2) {
        C0682b bVar = (C0682b) this.f2906W.get(i);
        if (bVar.mo4042b() != i2) {
            bVar.mo4043b(i2);
            m3603b(i);
        }
    }

    /* renamed from: a */
    private void mo3995a() {
        for (int i = 0; i < getColumnsCount(); i++) {
            m3601a((VerticalGridView) this.f2905V.get(i));
        }
    }

    /* renamed from: a */
    private void m3601a(VerticalGridView verticalGridView) {
        LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((((float) getPickerItemHeightPixels()) * activatedVisibleItemCount) + (((float) verticalGridView.getVerticalSpacing()) * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }
}
