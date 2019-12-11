package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.C0081c;
import androidx.appcompat.app.C0081c.C0082a;
import androidx.appcompat.view.menu.C0148n.C0149a;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3864g;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuDialogHelper */
class C0135h implements OnKeyListener, OnClickListener, OnDismissListener, C0149a {

    /* renamed from: U */
    private C0081c f597U;

    /* renamed from: V */
    C0129e f598V;

    /* renamed from: W */
    private C0149a f599W;

    /* renamed from: c */
    private C0132g f600c;

    public C0135h(C0132g gVar) {
        this.f600c = gVar;
    }

    /* renamed from: a */
    public void mo841a(IBinder iBinder) {
        C0132g gVar = this.f600c;
        C0082a aVar = new C0082a(gVar.mo810e());
        this.f598V = new C0129e(aVar.mo427b(), C3864g.abc_list_menu_item_layout);
        this.f598V.mo712a((C0149a) this);
        this.f600c.mo777a((C0148n) this.f598V);
        aVar.mo422a(this.f598V.mo750b(), (OnClickListener) this);
        View i = gVar.mo818i();
        if (i != null) {
            aVar.mo420a(i);
        } else {
            aVar.mo419a(gVar.mo814g());
            aVar.mo423a(gVar.mo816h());
        }
        aVar.mo418a((OnKeyListener) this);
        this.f597U = aVar.mo426a();
        this.f597U.setOnDismissListener(this);
        LayoutParams attributes = this.f597U.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= DateUtils.FORMAT_NUMERIC_DATE;
        this.f597U.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f600c.mo781a((MenuItem) (C0137j) this.f598V.mo750b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f598V.mo710a(this.f600c, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f597U.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f597U.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f600c.mo780a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f600c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo840a() {
        C0081c cVar = this.f597U;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo533a(C0132g gVar, boolean z) {
        if (z || gVar == this.f600c) {
            mo840a();
        }
        C0149a aVar = this.f599W;
        if (aVar != null) {
            aVar.mo533a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo534a(C0132g gVar) {
        C0149a aVar = this.f599W;
        if (aVar != null) {
            return aVar.mo534a(gVar);
        }
        return false;
    }
}
