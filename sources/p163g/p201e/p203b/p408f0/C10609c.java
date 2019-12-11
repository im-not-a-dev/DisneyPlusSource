package p163g.p201e.p203b.p408f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J6\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/web/WebLinkTransformationMethodImpl;", "Landroid/text/method/TransformationMethod;", "webRouter", "Lcom/bamtechmedia/dominguez/web/WebRouter;", "(Lcom/bamtechmedia/dominguez/web/WebRouter;)V", "customURLSpanTransformationMethod", "Lcom/bamtechmedia/dominguez/web/CustomURLSpanTransformationMethod;", "getTransformation", "", "source", "view", "Landroid/view/View;", "onFocusChanged", "", "sourceText", "focused", "", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "web_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.f0.c */
/* compiled from: WebLinkTransformationMethodImpl.kt */
public final class C10609c implements TransformationMethod {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C10611d f25050U;

    /* renamed from: c */
    private final C10606a f25051c = new C10606a(new C10610a(this));

    /* renamed from: g.e.b.f0.c$a */
    /* compiled from: WebLinkTransformationMethodImpl.kt */
    static final class C10610a extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10609c f25052c;

        C10610a(C10609c cVar) {
            this.f25052c = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            C10608b.m33333a(this.f25052c.f25050U, str);
        }
    }

    public C10609c(C10611d dVar) {
        this.f25050U = dVar;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        this.f25051c.getTransformation(charSequence, view);
        return charSequence;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        this.f25051c.onFocusChanged(view, charSequence, z, i, rect);
    }
}
