package p096e.p097a.p104o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.C0139k;
import androidx.appcompat.widget.C0204b0;
import androidx.appcompat.widget.C0284t0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p097a.C3867j;
import p096e.p121h.p126l.p127a.C4059a;
import p096e.p121h.p135s.C4124b;
import p096e.p121h.p135s.C4148i;

/* renamed from: e.a.o.g */
/* compiled from: SupportMenuInflater */
public class C3896g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f9629e = {Context.class};

    /* renamed from: f */
    static final Class<?>[] f9630f = f9629e;

    /* renamed from: a */
    final Object[] f9631a;

    /* renamed from: b */
    final Object[] f9632b = this.f9631a;

    /* renamed from: c */
    Context f9633c;

    /* renamed from: d */
    private Object f9634d;

    /* renamed from: e.a.o.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C3897a implements OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f9635c = {MenuItem.class};

        /* renamed from: a */
        private Object f9636a;

        /* renamed from: b */
        private Method f9637b;

        public C3897a(Object obj, String str) {
            this.f9636a = obj;
            Class cls = obj.getClass();
            try {
                this.f9637b = cls.getMethod(str, f9635c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f9637b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f9637b.invoke(this.f9636a, new Object[]{menuItem})).booleanValue();
                }
                this.f9637b.invoke(this.f9636a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: e.a.o.g$b */
    /* compiled from: SupportMenuInflater */
    private class C3898b {

        /* renamed from: A */
        C4124b f9638A;

        /* renamed from: B */
        private CharSequence f9639B;

        /* renamed from: C */
        private CharSequence f9640C;

        /* renamed from: D */
        private ColorStateList f9641D = null;

        /* renamed from: E */
        private Mode f9642E = null;

        /* renamed from: a */
        private Menu f9644a;

        /* renamed from: b */
        private int f9645b;

        /* renamed from: c */
        private int f9646c;

        /* renamed from: d */
        private int f9647d;

        /* renamed from: e */
        private int f9648e;

        /* renamed from: f */
        private boolean f9649f;

        /* renamed from: g */
        private boolean f9650g;

        /* renamed from: h */
        private boolean f9651h;

        /* renamed from: i */
        private int f9652i;

        /* renamed from: j */
        private int f9653j;

        /* renamed from: k */
        private CharSequence f9654k;

        /* renamed from: l */
        private CharSequence f9655l;

        /* renamed from: m */
        private int f9656m;

        /* renamed from: n */
        private char f9657n;

        /* renamed from: o */
        private int f9658o;

        /* renamed from: p */
        private char f9659p;

        /* renamed from: q */
        private int f9660q;

        /* renamed from: r */
        private int f9661r;

        /* renamed from: s */
        private boolean f9662s;

        /* renamed from: t */
        private boolean f9663t;

        /* renamed from: u */
        private boolean f9664u;

        /* renamed from: v */
        private int f9665v;

        /* renamed from: w */
        private int f9666w;

        /* renamed from: x */
        private String f9667x;

        /* renamed from: y */
        private String f9668y;

        /* renamed from: z */
        private String f9669z;

        public C3898b(Menu menu) {
            this.f9644a = menu;
            mo13945d();
        }

        /* renamed from: a */
        public void mo13941a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3896g.this.f9633c.obtainStyledAttributes(attributeSet, C3867j.MenuGroup);
            this.f9645b = obtainStyledAttributes.getResourceId(C3867j.MenuGroup_android_id, 0);
            this.f9646c = obtainStyledAttributes.getInt(C3867j.MenuGroup_android_menuCategory, 0);
            this.f9647d = obtainStyledAttributes.getInt(C3867j.MenuGroup_android_orderInCategory, 0);
            this.f9648e = obtainStyledAttributes.getInt(C3867j.MenuGroup_android_checkableBehavior, 0);
            this.f9649f = obtainStyledAttributes.getBoolean(C3867j.MenuGroup_android_visible, true);
            this.f9650g = obtainStyledAttributes.getBoolean(C3867j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo13943b(AttributeSet attributeSet) {
            C0284t0 a = C0284t0.m1485a(C3896g.this.f9633c, attributeSet, C3867j.MenuItem);
            this.f9652i = a.mo1921g(C3867j.MenuItem_android_id, 0);
            this.f9653j = (a.mo1915d(C3867j.MenuItem_android_menuCategory, this.f9646c) & -65536) | (a.mo1915d(C3867j.MenuItem_android_orderInCategory, this.f9647d) & 65535);
            this.f9654k = a.mo1918e(C3867j.MenuItem_android_title);
            this.f9655l = a.mo1918e(C3867j.MenuItem_android_titleCondensed);
            this.f9656m = a.mo1921g(C3867j.MenuItem_android_icon, 0);
            this.f9657n = m13090a(a.mo1916d(C3867j.MenuItem_android_alphabeticShortcut));
            this.f9658o = a.mo1915d(C3867j.MenuItem_alphabeticModifiers, 4096);
            this.f9659p = m13090a(a.mo1916d(C3867j.MenuItem_android_numericShortcut));
            this.f9660q = a.mo1915d(C3867j.MenuItem_numericModifiers, 4096);
            if (a.mo1922g(C3867j.MenuItem_android_checkable)) {
                this.f9661r = a.mo1909a(C3867j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f9661r = this.f9648e;
            }
            this.f9662s = a.mo1909a(C3867j.MenuItem_android_checked, false);
            this.f9663t = a.mo1909a(C3867j.MenuItem_android_visible, this.f9649f);
            this.f9664u = a.mo1909a(C3867j.MenuItem_android_enabled, this.f9650g);
            this.f9665v = a.mo1915d(C3867j.MenuItem_showAsAction, -1);
            this.f9669z = a.mo1916d(C3867j.MenuItem_android_onClick);
            this.f9666w = a.mo1921g(C3867j.MenuItem_actionLayout, 0);
            this.f9667x = a.mo1916d(C3867j.MenuItem_actionViewClass);
            this.f9668y = a.mo1916d(C3867j.MenuItem_actionProviderClass);
            boolean z = this.f9668y != null;
            if (z && this.f9666w == 0 && this.f9667x == null) {
                this.f9638A = (C4124b) m13091a(this.f9668y, C3896g.f9630f, C3896g.this.f9632b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f9638A = null;
            }
            this.f9639B = a.mo1918e(C3867j.MenuItem_contentDescription);
            this.f9640C = a.mo1918e(C3867j.MenuItem_tooltipText);
            if (a.mo1922g(C3867j.MenuItem_iconTintMode)) {
                this.f9642E = C0204b0.m1171a(a.mo1915d(C3867j.MenuItem_iconTintMode, -1), this.f9642E);
            } else {
                this.f9642E = null;
            }
            if (a.mo1922g(C3867j.MenuItem_iconTint)) {
                this.f9641D = a.mo1906a(C3867j.MenuItem_iconTint);
            } else {
                this.f9641D = null;
            }
            a.mo1908a();
            this.f9651h = false;
        }

        /* renamed from: c */
        public boolean mo13944c() {
            return this.f9651h;
        }

        /* renamed from: d */
        public void mo13945d() {
            this.f9645b = 0;
            this.f9646c = 0;
            this.f9647d = 0;
            this.f9648e = 0;
            this.f9649f = true;
            this.f9650g = true;
        }

        /* renamed from: a */
        private char m13090a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m13092a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f9662s).setVisible(this.f9663t).setEnabled(this.f9664u).setCheckable(this.f9661r >= 1).setTitleCondensed(this.f9655l).setIcon(this.f9656m);
            int i = this.f9665v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f9669z != null) {
                if (!C3896g.this.f9633c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C3897a(C3896g.this.mo13937a(), this.f9669z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0137j;
            if (z2) {
                C0137j jVar = (C0137j) menuItem;
            }
            if (this.f9661r >= 2) {
                if (z2) {
                    ((C0137j) menuItem).mo852c(true);
                } else if (menuItem instanceof C0139k) {
                    ((C0139k) menuItem).mo901a(true);
                }
            }
            String str = this.f9667x;
            if (str != null) {
                menuItem.setActionView((View) m13091a(str, C3896g.f9629e, C3896g.this.f9631a));
                z = true;
            }
            int i2 = this.f9666w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C4124b bVar = this.f9638A;
            if (bVar != null) {
                C4148i.m14201a(menuItem, bVar);
            }
            C4148i.m14205a(menuItem, this.f9639B);
            C4148i.m14207b(menuItem, this.f9640C);
            C4148i.m14202a(menuItem, this.f9657n, this.f9658o);
            C4148i.m14206b(menuItem, this.f9659p, this.f9660q);
            Mode mode = this.f9642E;
            if (mode != null) {
                C4148i.m14204a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f9641D;
            if (colorStateList != null) {
                C4148i.m14203a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public SubMenu mo13942b() {
            this.f9651h = true;
            SubMenu addSubMenu = this.f9644a.addSubMenu(this.f9645b, this.f9652i, this.f9653j, this.f9654k);
            m13092a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public void mo13940a() {
            this.f9651h = true;
            m13092a(this.f9644a.add(this.f9645b, this.f9652i, this.f9653j, this.f9654k));
        }

        /* renamed from: a */
        private <T> T m13091a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, C3896g.this.f9633c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }
    }

    public C3896g(Context context) {
        super(context);
        this.f9633c = context;
        this.f9631a = new Object[]{context};
    }

    /* renamed from: a */
    private void m13088a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String str;
        C3898b bVar = new C3898b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo13945d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo13944c()) {
                                C4124b bVar2 = bVar.f9638A;
                                if (bVar2 == null || !bVar2.mo957b()) {
                                    bVar.mo13940a();
                                } else {
                                    bVar.mo13942b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo13941a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo13943b(attributeSet);
                    } else if (name3.equals(str)) {
                        m13088a(xmlPullParser, attributeSet, bVar.mo13942b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C4059a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f9633c.getResources().getLayout(i);
            m13088a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo13937a() {
        if (this.f9634d == null) {
            this.f9634d = m13087a(this.f9633c);
        }
        return this.f9634d;
    }

    /* renamed from: a */
    private Object m13087a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m13087a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }
}
