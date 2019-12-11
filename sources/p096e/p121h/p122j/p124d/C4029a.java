package p096e.p121h.p122j.p124d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p096e.p121h.C4016a;
import p096e.p121h.C4024i;

/* renamed from: e.h.j.d.a */
/* compiled from: ColorStateListInflaterCompat */
public final class C4029a {
    /* renamed from: a */
    public static ColorStateList m13805a(Resources resources, int i, Theme theme) {
        try {
            return m13806a(resources, (XmlPullParser) resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* renamed from: b */
    private static ColorStateList m13809b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        AttributeSet attributeSet2 = attributeSet;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next != 2 || depth2 > depth || !xmlPullParser.getName().equals("item")) {
                Resources resources2 = resources;
                Theme theme2 = theme;
            } else {
                TypedArray a = m13808a(resources, theme, attributeSet2, C4024i.ColorStateListItem);
                int color = a.getColor(C4024i.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (a.hasValue(C4024i.ColorStateListItem_android_alpha)) {
                    f = a.getFloat(C4024i.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(C4024i.ColorStateListItem_alpha)) {
                    f = a.getFloat(C4024i.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C4016a.alpha)) {
                        int i5 = i3 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i3);
                iArr2 = C4038e.m13845a(iArr2, i2, m13804a(color, f));
                iArr = (int[][]) C4038e.m13846a((T[]) iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr4 = new int[i2];
        int[][] iArr5 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: a */
    public static ColorStateList m13806a(Resources resources, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m13807a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static ColorStateList m13807a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m13809b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: a */
    private static TypedArray m13808a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    private static int m13804a(int i, float f) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
