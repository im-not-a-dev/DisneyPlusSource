package p096e.p110c.p111b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.C0472e;
import java.util.ArrayList;
import p096e.p121h.p122j.C4025a;

/* renamed from: e.c.b.a */
/* compiled from: CustomTabsIntent */
public final class C3918a {

    /* renamed from: a */
    public final Intent f9702a;

    /* renamed from: b */
    public final Bundle f9703b;

    /* renamed from: e.c.b.a$a */
    /* compiled from: CustomTabsIntent */
    public static final class C3919a {

        /* renamed from: a */
        private final Intent f9704a;

        /* renamed from: b */
        private ArrayList<Bundle> f9705b;

        /* renamed from: c */
        private Bundle f9706c;

        /* renamed from: d */
        private ArrayList<Bundle> f9707d;

        /* renamed from: e */
        private boolean f9708e;

        public C3919a() {
            this(null);
        }

        /* renamed from: a */
        public C3919a mo14006a(int i) {
            this.f9704a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        public C3919a(C3920b bVar) {
            this.f9704a = new Intent("android.intent.action.VIEW");
            this.f9705b = null;
            this.f9706c = null;
            this.f9707d = null;
            this.f9708e = true;
            if (bVar == null) {
                Bundle bundle = new Bundle();
                if (bVar == null) {
                    C0472e.m2510a(bundle, "android.support.customtabs.extra.SESSION", null);
                    this.f9704a.putExtras(bundle);
                    return;
                }
                bVar.mo14008a();
                throw null;
            }
            bVar.mo14009b();
            throw null;
        }

        /* renamed from: a */
        public C3918a mo14007a() {
            ArrayList<Bundle> arrayList = this.f9705b;
            if (arrayList != null) {
                this.f9704a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f9707d;
            if (arrayList2 != null) {
                this.f9704a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f9704a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f9708e);
            return new C3918a(this.f9704a, this.f9706c);
        }
    }

    C3918a(Intent intent, Bundle bundle) {
        this.f9702a = intent;
        this.f9703b = bundle;
    }

    /* renamed from: a */
    public void mo14005a(Context context, Uri uri) {
        this.f9702a.setData(uri);
        C4025a.m13793a(context, this.f9702a, this.f9703b);
    }
}
