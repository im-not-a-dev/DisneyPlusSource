package p096e.p121h.p122j.p124d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: e.h.j.d.b */
/* compiled from: ComplexColorCompat */
public final class C4030b {

    /* renamed from: a */
    private final Shader f10227a;

    /* renamed from: b */
    private final ColorStateList f10228b;

    /* renamed from: c */
    private int f10229c;

    private C4030b(Shader shader, ColorStateList colorStateList, int i) {
        this.f10227a = shader;
        this.f10228b = colorStateList;
        this.f10229c = i;
    }

    /* renamed from: a */
    static C4030b m13812a(Shader shader) {
        return new C4030b(shader, null, 0);
    }

    /* renamed from: b */
    static C4030b m13813b(int i) {
        return new C4030b(null, null, i);
    }

    /* renamed from: c */
    public boolean mo14544c() {
        return this.f10227a != null;
    }

    /* renamed from: d */
    public boolean mo14545d() {
        if (this.f10227a == null) {
            ColorStateList colorStateList = this.f10228b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo14546e() {
        return mo14544c() || this.f10229c != 0;
    }

    /* renamed from: a */
    static C4030b m13810a(ColorStateList colorStateList) {
        return new C4030b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: b */
    public Shader mo14543b() {
        return this.f10227a;
    }

    /* renamed from: b */
    public static C4030b m13814b(Resources resources, int i, Theme theme) {
        try {
            return m13811a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo14540a() {
        return this.f10229c;
    }

    /* renamed from: a */
    public void mo14541a(int i) {
        this.f10229c = i;
    }

    /* renamed from: a */
    public boolean mo14542a(int[] iArr) {
        if (mo14545d()) {
            ColorStateList colorStateList = this.f10228b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f10229c) {
                this.f10229c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C4030b m13811a(Resources resources, int i, Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m13810a(C4029a.m13807a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m13812a(C4036d.m13841a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
