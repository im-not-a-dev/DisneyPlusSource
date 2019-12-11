package p163g.p201e.p203b.p299m.p300y.p301h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p203b.p299m.C7559q;
import p163g.p201e.p203b.p299m.C7562t;
import p163g.p201e.p203b.p299m.C7564v;
import p163g.p201e.p203b.p299m.p300y.C7575f;
import p163g.p201e.p203b.p299m.p300y.C7576g;
import p163g.p201e.p203b.p299m.p300y.p303j.C7581b;
import p520io.reactivex.subjects.C11978b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier0/customview/AbstractTier0MessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bamtechmedia/dominguez/dialogs/tier0/Tier0Launcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "launchAllToastAnimations", "", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "launchWithIconAndText", "tier0MessageIcon", "Lcom/bamtechmedia/dominguez/dialogs/tier0/Tier0MessageIcon;", "title", "", "messageTextSize", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.m.y.h.a */
/* compiled from: AbstractTier0MessageView.kt */
public abstract class C7577a extends ConstraintLayout implements C7575f {

    /* renamed from: r0 */
    private HashMap f16584r0;

    /* renamed from: g.e.b.m.y.h.a$a */
    /* compiled from: View.kt */
    public static final class C7578a implements OnPreDrawListener {

        /* renamed from: U */
        final /* synthetic */ ViewTreeObserver f16585U;

        /* renamed from: V */
        final /* synthetic */ C7577a f16586V;

        /* renamed from: W */
        final /* synthetic */ C11978b f16587W;

        /* renamed from: c */
        final /* synthetic */ View f16588c;

        public C7578a(View view, ViewTreeObserver viewTreeObserver, C7577a aVar, C11978b bVar) {
            this.f16588c = view;
            this.f16585U = viewTreeObserver;
            this.f16586V = aVar;
            this.f16587W = bVar;
        }

        public boolean onPreDraw() {
            this.f16586V.mo18304a(this.f16587W);
            ViewTreeObserver viewTreeObserver = this.f16585U;
            Intrinsics.checkReturnedValueIsNotNull((Object) viewTreeObserver, "vto");
            if (viewTreeObserver.isAlive()) {
                this.f16585U.removeOnPreDrawListener(this);
            } else {
                this.f16588c.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    public /* synthetic */ C7577a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo20512a(C7576g gVar, String str, int i, C11978b bVar) {
        ((ImageView) mo2145c(C7562t.messageIcon)).setImageDrawable(C4025a.m13798c(getContext(), C7581b.m22540a(gVar)));
        TextView textView = (TextView) mo2145c(C7562t.messageText);
        if (textView != null) {
            textView.setText(str);
            textView.setTextSize((float) i);
        }
        setVisibility(0);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new C7578a(this, viewTreeObserver, this, bVar));
    }

    /* renamed from: a */
    public abstract void mo18304a(C11978b bVar);

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f16584r0 == null) {
            this.f16584r0 = new HashMap();
        }
        View view = (View) this.f16584r0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f16584r0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C7577a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C7564v.custom_view_tier0, this);
        setLayoutParams(new LayoutParams(-2, context.getResources().getDimensionPixelSize(C7559q.container_height)));
        setVisibility(8);
    }
}
