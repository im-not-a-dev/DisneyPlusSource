package p096e.p121h.p122j.p124d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e.h.j.d.h */
/* compiled from: TypedArrayUtils */
public class C4044h {
    /* renamed from: a */
    public static boolean m13871a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m13873b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m13871a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: c */
    public static int m13876c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m13871a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: d */
    public static CharSequence[] m13878d(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: a */
    public static float m13859a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m13871a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static TypedValue m13874b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m13871a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static CharSequence m13877c(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: a */
    public static boolean m13870a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m13871a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m13872b(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: a */
    public static int m13862a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m13871a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static String m13875b(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: a */
    public static C4030b m13867a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m13871a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C4030b.m13813b(typedValue.data);
            }
            C4030b b = C4030b.m13814b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C4030b.m13813b(i2);
    }

    /* renamed from: a */
    public static ColorStateList m13863a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i) {
        if (!m13871a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        } else if (i2 < 28 || i2 > 31) {
            return C4029a.m13805a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m13864a(typedValue);
        }
    }

    /* renamed from: a */
    private static ColorStateList m13864a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static String m13868a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m13871a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static TypedArray m13865a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static boolean m13869a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: a */
    public static Drawable m13866a(TypedArray typedArray, int i, int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: a */
    public static int m13861a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: a */
    public static int m13860a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
