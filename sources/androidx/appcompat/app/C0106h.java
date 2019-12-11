package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p096e.p097a.C3858a;
import p096e.p097a.p104o.C3889b;
import p096e.p097a.p104o.C3889b.C3890a;
import p096e.p121h.p135s.C4141f;
import p096e.p121h.p135s.C4141f.C4142a;

/* renamed from: androidx.appcompat.app.h */
/* compiled from: AppCompatDialog */
public class C0106h extends Dialog implements C0084e {

    /* renamed from: U */
    private final C4142a f392U = new C0107a();

    /* renamed from: c */
    private C0085f f393c;

    /* renamed from: androidx.appcompat.app.h$a */
    /* compiled from: AppCompatDialog */
    class C0107a implements C4142a {
        C0107a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C0106h.this.mo565a(keyEvent);
        }
    }

    public C0106h(Context context, int i) {
        super(context, m624a(context, i));
        C0085f a = mo563a();
        a.mo484d(m624a(context, i));
        a.mo472a((Bundle) null);
    }

    /* renamed from: a */
    public C3889b mo429a(C3890a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo432a(C3889b bVar) {
    }

    /* renamed from: a */
    public boolean mo564a(int i) {
        return mo563a().mo479b(i);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo563a().mo474a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo436b(C3889b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C4141f.m14183a(this.f392U, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo563a().mo469a(i);
    }

    public void invalidateOptionsMenu() {
        mo563a().mo485e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo563a().mo483d();
        super.onCreate(bundle);
        mo563a().mo472a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo563a().mo489i();
    }

    public void setContentView(int i) {
        mo563a().mo481c(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo563a().mo475a(charSequence);
    }

    /* renamed from: a */
    public C0085f mo563a() {
        if (this.f393c == null) {
            this.f393c = C0085f.m483a((Dialog) this, (C0084e) this);
        }
        return this.f393c;
    }

    public void setContentView(View view) {
        mo563a().mo473a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo563a().mo478b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo563a().mo475a((CharSequence) getContext().getString(i));
    }

    /* renamed from: a */
    private static int m624a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3858a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo565a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
