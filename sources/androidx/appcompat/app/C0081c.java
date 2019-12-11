package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController.C0067f;
import p096e.p097a.C3858a;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: AlertDialog */
public class C0081c extends C0106h implements DialogInterface {

    /* renamed from: V */
    final AlertController f289V = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: AlertDialog */
    public static class C0082a {

        /* renamed from: a */
        private final C0067f f290a;

        /* renamed from: b */
        private final int f291b;

        public C0082a(Context context) {
            this(context, C0081c.m451a(context, 0));
        }

        /* renamed from: a */
        public C0082a mo417a(int i) {
            C0067f fVar = this.f290a;
            fVar.f250f = fVar.f245a.getText(i);
            return this;
        }

        /* renamed from: b */
        public Context mo427b() {
            return this.f290a.f245a;
        }

        /* renamed from: c */
        public C0081c mo428c() {
            C0081c a = mo426a();
            a.show();
            return a;
        }

        public C0082a(Context context, int i) {
            this.f290a = new C0067f(new ContextThemeWrapper(context, C0081c.m451a(context, i)));
            this.f291b = i;
        }

        /* renamed from: a */
        public C0082a mo423a(CharSequence charSequence) {
            this.f290a.f250f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0082a mo420a(View view) {
            this.f290a.f251g = view;
            return this;
        }

        /* renamed from: a */
        public C0082a mo419a(Drawable drawable) {
            this.f290a.f248d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0082a mo418a(OnKeyListener onKeyListener) {
            this.f290a.f265u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0082a mo425a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            C0067f fVar = this.f290a;
            fVar.f266v = charSequenceArr;
            fVar.f268x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0082a mo422a(ListAdapter listAdapter, OnClickListener onClickListener) {
            C0067f fVar = this.f290a;
            fVar.f267w = listAdapter;
            fVar.f268x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0082a mo424a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            C0067f fVar = this.f290a;
            fVar.f266v = charSequenceArr;
            fVar.f268x = onClickListener;
            fVar.f238I = i;
            fVar.f237H = true;
            return this;
        }

        /* renamed from: a */
        public C0082a mo421a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
            C0067f fVar = this.f290a;
            fVar.f267w = listAdapter;
            fVar.f268x = onClickListener;
            fVar.f238I = i;
            fVar.f237H = true;
            return this;
        }

        /* renamed from: a */
        public C0081c mo426a() {
            C0081c cVar = new C0081c(this.f290a.f245a, this.f291b);
            this.f290a.mo363a(cVar.f289V);
            cVar.setCancelable(this.f290a.f262r);
            if (this.f290a.f262r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f290a.f263s);
            cVar.setOnDismissListener(this.f290a.f264t);
            OnKeyListener onKeyListener = this.f290a.f265u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }
    }

    protected C0081c(Context context, int i) {
        super(context, m451a(context, i));
    }

    /* renamed from: a */
    static int m451a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3858a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView mo412b() {
        return this.f289V.mo343a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f289V.mo350b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f289V.mo349a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f289V.mo354b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f289V.mo353b(charSequence);
    }
}
