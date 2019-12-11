package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.p088i.C3841k;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4127b0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002 !B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u001dJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initialized", "", "retryListener", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "getRetryListener", "()Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "setRetryListener", "(Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;)V", "value", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type;", "type", "setType", "(Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type;)V", "bindResources", "", "initView", "removeRetryListener", "setVisibility", "visibility", "show", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type$CustomError;", "isOnline", "toggleLoading", "RetryListener", "Type", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NoConnectionView.kt */
public final class NoConnectionView extends ConstraintLayout {

    /* renamed from: r0 */
    private C5641a f13245r0;

    /* renamed from: s0 */
    private boolean f13246s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C5642b f13247t0;

    /* renamed from: u0 */
    private HashMap f13248u0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$a */
    /* compiled from: NoConnectionView.kt */
    public interface C5641a {
        void onRetryClicked(boolean z);
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B3\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type;", "", "imageId", "", "titleId", "messageId", "buttonLabelId", "(ILjava/lang/Integer;Ljava/lang/Integer;I)V", "getButtonLabelId", "()I", "getImageId", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleId", "CustomError", "NetworkError", "ServerError", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type$NetworkError;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type$ServerError;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$Type$CustomError;", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$b */
    /* compiled from: NoConnectionView.kt */
    public static abstract class C5642b {

        /* renamed from: a */
        private final int f13249a;

        /* renamed from: b */
        private final Integer f13250b;

        /* renamed from: c */
        private final Integer f13251c;

        /* renamed from: d */
        private final int f13252d;

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$b$a */
        /* compiled from: NoConnectionView.kt */
        public static final class C5643a extends C5642b {

            /* renamed from: e */
            private final int f13253e;

            /* renamed from: f */
            private final Integer f13254f;

            /* renamed from: g */
            private final Integer f13255g;

            /* renamed from: h */
            private final String f13256h;

            public /* synthetic */ C5643a(int i, Integer num, Integer num2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 2) != 0) {
                    num = null;
                }
                if ((i2 & 4) != 0) {
                    num2 = null;
                }
                if ((i2 & 8) != 0) {
                    str = null;
                }
                this(i, num, num2, str);
            }

            /* renamed from: e */
            public final String mo17441e() {
                return this.f13256h;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5643a) {
                        C5643a aVar = (C5643a) obj;
                        if (!(this.f13253e == aVar.f13253e) || !C12880j.m40224a((Object) this.f13254f, (Object) aVar.f13254f) || !C12880j.m40224a((Object) this.f13255g, (Object) aVar.f13255g) || !C12880j.m40224a((Object) this.f13256h, (Object) aVar.f13256h)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public final Integer mo17443f() {
                return this.f13255g;
            }

            /* renamed from: g */
            public final Integer mo17444g() {
                return this.f13254f;
            }

            public int hashCode() {
                int i = this.f13253e * 31;
                Integer num = this.f13254f;
                int i2 = 0;
                int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
                Integer num2 = this.f13255g;
                int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
                String str = this.f13256h;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return hashCode2 + i2;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CustomError(customImageId=");
                sb.append(this.f13253e);
                sb.append(", customTitleId=");
                sb.append(this.f13254f);
                sb.append(", customMessageId=");
                sb.append(this.f13255g);
                sb.append(", customMessage=");
                sb.append(this.f13256h);
                sb.append(")");
                return sb.toString();
            }

            public C5643a(int i, Integer num, Integer num2, String str) {
                super(i, num, num2, 0, 8, null);
                this.f13253e = i;
                this.f13254f = num;
                this.f13255g = num2;
                this.f13256h = str;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$b$b */
        /* compiled from: NoConnectionView.kt */
        public static final class C5644b extends C5642b {

            /* renamed from: e */
            public static final C5644b f13257e = new C5644b();

            private C5644b() {
                super(C3836f.no_internet, Integer.valueOf(C3841k.network_error_header), Integer.valueOf(C3841k.network_error_message), 0, 8, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$b$c */
        /* compiled from: NoConnectionView.kt */
        public static final class C5645c extends C5642b {

            /* renamed from: e */
            public static final C5645c f13258e = new C5645c();

            private C5645c() {
                super(C3836f.no_service, Integer.valueOf(C3841k.server_error_header), Integer.valueOf(C3841k.server_error_message), C3841k.btn_ok, null);
            }
        }

        private C5642b(int i, Integer num, Integer num2, int i2) {
            this.f13249a = i;
            this.f13250b = num;
            this.f13251c = num2;
            this.f13252d = i2;
        }

        /* renamed from: a */
        public final int mo17437a() {
            return this.f13252d;
        }

        /* renamed from: b */
        public final int mo17438b() {
            return this.f13249a;
        }

        /* renamed from: c */
        public final Integer mo17439c() {
            return this.f13251c;
        }

        /* renamed from: d */
        public final Integer mo17440d() {
            return this.f13250b;
        }

        public /* synthetic */ C5642b(int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, num, num2, i2);
        }

        /* synthetic */ C5642b(int i, Integer num, Integer num2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i3 & 2) != 0) {
                num = null;
            }
            if ((i3 & 4) != 0) {
                num2 = null;
            }
            if ((i3 & 8) != 0) {
                i2 = C3841k.btn_retry;
            }
            this(i, num, num2, i2);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$c */
    /* compiled from: NoConnectionView.kt */
    static final class C5646c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ NoConnectionView f13259c;

        C5646c(NoConnectionView noConnectionView) {
            this.f13259c = noConnectionView;
        }

        public final void onClick(View view) {
            this.f13259c.mo17433b(true);
            C5641a retryListener = this.f13259c.getRetryListener();
            if (retryListener != null) {
                retryListener.onRetryClicked(this.f13259c.f13247t0 instanceof C5644b);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView$d */
    /* compiled from: NoConnectionView.kt */
    static final class C5647d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ NoConnectionView f13260c;

        C5647d(NoConnectionView noConnectionView) {
            this.f13260c = noConnectionView;
        }

        public final void onClick(View view) {
            this.f13260c.mo17433b(true);
            C5641a retryListener = this.f13260c.getRetryListener();
            if (retryListener != null) {
                retryListener.onRetryClicked(this.f13260c.f13247t0 instanceof C5644b);
            }
        }
    }

    public NoConnectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NoConnectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NoConnectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: d */
    private final void m18479d() {
        if (!this.f13246s0) {
            this.f13246s0 = true;
            m18478a(this.f13247t0);
            TextView textView = (TextView) mo2145c(C3838h.noConnectionRetry);
            if (textView != null) {
                textView.setOnClickListener(new C5646c(this));
            }
            LoadingButton loadingButton = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
            if (loadingButton != null) {
                loadingButton.setOnClickListener(new C5647d(this));
            }
        }
    }

    private final void setType(C5642b bVar) {
        if (!C12880j.m40224a((Object) this.f13247t0, (Object) bVar)) {
            m18478a(bVar);
        }
        this.f13247t0 = bVar;
    }

    /* renamed from: b */
    public final void mo17433b(boolean z) {
        if (z) {
            ProgressBar progressBar = (ProgressBar) mo2145c(C3838h.noConnectionProgressBar);
            if (progressBar != null) {
                C4127b0.m14131b(progressBar, true);
            }
            LoadingButton loadingButton = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
            if (loadingButton != null) {
                loadingButton.mo17425a();
            }
            TextView textView = (TextView) mo2145c(C3838h.noConnectionRetry);
            if (textView != null) {
                C4127b0.m14131b(textView, false);
            }
        } else {
            ProgressBar progressBar2 = (ProgressBar) mo2145c(C3838h.noConnectionProgressBar);
            if (progressBar2 != null) {
                C4127b0.m14131b(progressBar2, false);
            }
            LoadingButton loadingButton2 = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
            if (loadingButton2 != null) {
                loadingButton2.mo17426b();
            }
            TextView textView2 = (TextView) mo2145c(C3838h.noConnectionRetry);
            if (textView2 != null) {
                C4127b0.m14131b(textView2, true);
            }
        }
        if (!z) {
            Context context = getContext();
            C12880j.m40222a((Object) context, "context");
            if (C5837i.m18843e(context)) {
                LoadingButton loadingButton3 = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
                if (loadingButton3 != null) {
                    loadingButton3.requestFocus();
                }
            }
        }
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13248u0 == null) {
            this.f13248u0 = new HashMap();
        }
        View view = (View) this.f13248u0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13248u0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final void mo2144c() {
        this.f13245r0 = null;
    }

    public final C5641a getRetryListener() {
        return this.f13245r0;
    }

    public final void setRetryListener(C5641a aVar) {
        this.f13245r0 = aVar;
    }

    public void setVisibility(int i) {
        m18479d();
        super.setVisibility(i);
        Context context = getContext();
        C12880j.m40222a((Object) context, "context");
        if (C5837i.m18843e(context) && i == 0) {
            LoadingButton loadingButton = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
            if (loadingButton != null) {
                loadingButton.requestFocus();
            }
        }
    }

    public NoConnectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13247t0 = C5644b.f13257e;
        ViewGroup.inflate(context, C3840j.view_no_connection, this);
        setLayoutParams(new C0415c(context.getResources().getDimensionPixelOffset(C3835e.no_connection_view_width), -2));
        super.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo17432a(boolean z) {
        setType(z ? C5645c.f13258e : C5644b.f13257e);
        mo17433b(false);
        setVisibility(0);
    }

    /* renamed from: a */
    public final void mo17431a(C5643a aVar) {
        setType(aVar);
        mo17433b(false);
        setVisibility(0);
    }

    /* renamed from: a */
    private final void m18478a(C5642b bVar) {
        C13145v vVar;
        C13145v vVar2;
        C13145v vVar3;
        String str = "noConnectionTitle";
        int i = 8;
        boolean z = true;
        C13145v vVar4 = null;
        String str2 = "noConnectionBody";
        if (bVar instanceof C5643a) {
            C5643a aVar = (C5643a) bVar;
            Integer g = aVar.mo17444g();
            if (g != null) {
                int intValue = g.intValue();
                TextView textView = (TextView) mo2145c(C3838h.noConnectionTitle);
                C12880j.m40222a((Object) textView, str);
                C5880u.m18941a(textView, intValue);
                vVar2 = C13145v.f29587a;
            } else {
                vVar2 = null;
            }
            TextView textView2 = (TextView) mo2145c(C3838h.noConnectionTitle);
            C12880j.m40222a((Object) textView2, str);
            textView2.setVisibility(vVar2 != null ? 0 : 8);
            Integer f = aVar.mo17443f();
            if (f != null) {
                int intValue2 = f.intValue();
                TextView textView3 = (TextView) mo2145c(C3838h.noConnectionBody);
                C12880j.m40222a((Object) textView3, str2);
                C5880u.m18941a(textView3, intValue2);
                vVar3 = C13145v.f29587a;
            } else {
                vVar3 = null;
            }
            TextView textView4 = (TextView) mo2145c(C3838h.noConnectionBody);
            C12880j.m40222a((Object) textView4, str2);
            textView4.setVisibility(vVar3 != null ? 0 : 8);
            String e = aVar.mo17441e();
            if (e != null) {
                TextView textView5 = (TextView) mo2145c(C3838h.noConnectionBody);
                C12880j.m40222a((Object) textView5, str2);
                textView5.setText(e);
                vVar4 = C13145v.f29587a;
            }
            TextView textView6 = (TextView) mo2145c(C3838h.noConnectionBody);
            C12880j.m40222a((Object) textView6, str2);
            if (vVar4 == null) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            textView6.setVisibility(i);
        } else {
            Integer d = bVar.mo17440d();
            if (d != null) {
                int intValue3 = d.intValue();
                TextView textView7 = (TextView) mo2145c(C3838h.noConnectionTitle);
                C12880j.m40222a((Object) textView7, str);
                C5880u.m18941a(textView7, intValue3);
                vVar = C13145v.f29587a;
            } else {
                vVar = null;
            }
            TextView textView8 = (TextView) mo2145c(C3838h.noConnectionTitle);
            C12880j.m40222a((Object) textView8, str);
            textView8.setVisibility(vVar != null ? 0 : 8);
            Integer c = bVar.mo17439c();
            if (c != null) {
                int intValue4 = c.intValue();
                TextView textView9 = (TextView) mo2145c(C3838h.noConnectionBody);
                C12880j.m40222a((Object) textView9, str2);
                C5880u.m18941a(textView9, intValue4);
                vVar4 = C13145v.f29587a;
            }
            TextView textView10 = (TextView) mo2145c(C3838h.noConnectionBody);
            C12880j.m40222a((Object) textView10, str2);
            if (vVar4 == null) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            textView10.setVisibility(i);
        }
        ((ImageView) mo2145c(C3838h.noConnectionImage)).setImageResource(bVar.mo17438b());
        TextView textView11 = (TextView) mo2145c(C3838h.noConnectionRetry);
        if (textView11 != null) {
            C5880u.m18941a(textView11, bVar.mo17437a());
        }
        LoadingButton loadingButton = (LoadingButton) mo2145c(C3838h.noConnectionRetryButton);
        if (loadingButton != null) {
            loadingButton.setText(C5880u.m18936a(bVar.mo17437a()));
        }
    }
}
