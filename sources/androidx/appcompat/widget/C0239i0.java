package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0131f;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.i0 */
/* compiled from: MenuPopupWindow */
public class C0239i0 extends C0227g0 implements C0237h0 {

    /* renamed from: C0 */
    private static Method f1107C0;

    /* renamed from: B0 */
    private C0237h0 f1108B0;

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* compiled from: MenuPopupWindow */
    public static class C0240a extends C0213c0 {

        /* renamed from: k0 */
        final int f1109k0;

        /* renamed from: l0 */
        final int f1110l0;

        /* renamed from: m0 */
        private C0237h0 f1111m0;

        /* renamed from: n0 */
        private MenuItem f1112n0;

        public C0240a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1109k0 = 22;
                this.f1110l0 = 21;
                return;
            }
            this.f1109k0 = 21;
            this.f1110l0 = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0131f fVar;
            if (this.f1111m0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0131f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0131f) adapter;
                }
                C0137j jVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            jVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f1112n0;
                if (menuItem != jVar) {
                    C0132g b = fVar.mo760b();
                    if (menuItem != null) {
                        this.f1111m0.mo746b(b, menuItem);
                    }
                    this.f1112n0 = jVar;
                    if (jVar != null) {
                        this.f1111m0.mo745a(b, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1109k0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1110l0) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0131f) getAdapter()).mo760b().mo780a(false);
                return true;
            }
        }

        public void setHoverListener(C0237h0 h0Var) {
            this.f1111m0 = h0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                f1107C0 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0239i0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0213c0 mo1632a(Context context, boolean z) {
        C0240a aVar = new C0240a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: b */
    public void mo1687b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f1087x0.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo1688c(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1107C0;
            if (method != null) {
                try {
                    method.invoke(this.f1087x0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1087x0.setTouchModal(z);
        }
    }

    /* renamed from: a */
    public void mo1686a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f1087x0.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo746b(C0132g gVar, MenuItem menuItem) {
        C0237h0 h0Var = this.f1108B0;
        if (h0Var != null) {
            h0Var.mo746b(gVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo1685a(C0237h0 h0Var) {
        this.f1108B0 = h0Var;
    }

    /* renamed from: a */
    public void mo745a(C0132g gVar, MenuItem menuItem) {
        C0237h0 h0Var = this.f1108B0;
        if (h0Var != null) {
            h0Var.mo745a(gVar, menuItem);
        }
    }
}
