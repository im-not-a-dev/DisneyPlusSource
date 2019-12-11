package p096e.p121h.p135s;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.s.f */
/* compiled from: KeyEventDispatcher */
public class C4141f {

    /* renamed from: a */
    private static boolean f10441a = false;

    /* renamed from: b */
    private static Method f10442b = null;

    /* renamed from: c */
    private static boolean f10443c = false;

    /* renamed from: d */
    private static Field f10444d;

    /* renamed from: e.h.s.f$a */
    /* compiled from: KeyEventDispatcher */
    public interface C4142a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m14182a(View view, KeyEvent keyEvent) {
        return C4187x.m14375b(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m14183a(C4142a aVar, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m14180a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m14181a((Dialog) callback, keyEvent);
        }
        if ((view != null && C4187x.m14368a(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m14179a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f10441a) {
            try {
                f10442b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f10441a = true;
        }
        Method method = f10442b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m14180a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m14179a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C4187x.m14368a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static OnKeyListener m14178a(Dialog dialog) {
        if (!f10443c) {
            try {
                f10444d = Dialog.class.getDeclaredField("mOnKeyListener");
                f10444d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10443c = true;
        }
        Field field = f10444d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m14181a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m14178a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C4187x.m14368a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
