package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final Mode f2190j = Mode.SRC_IN;

    /* renamed from: a */
    public int f2191a = -1;

    /* renamed from: b */
    Object f2192b;

    /* renamed from: c */
    public byte[] f2193c = null;

    /* renamed from: d */
    public Parcelable f2194d = null;

    /* renamed from: e */
    public int f2195e = 0;

    /* renamed from: f */
    public int f2196f = 0;

    /* renamed from: g */
    public ColorStateList f2197g = null;

    /* renamed from: h */
    Mode f2198h = f2190j;

    /* renamed from: i */
    public String f2199i = null;

    /* renamed from: a */
    private static String m2629a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: a */
    public int mo2704a() {
        if (this.f2191a == -1 && VERSION.SDK_INT >= 23) {
            return m2628a((Icon) this.f2192b);
        }
        if (this.f2191a == 2) {
            return this.f2195e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public String mo2706b() {
        if (this.f2191a == -1 && VERSION.SDK_INT >= 23) {
            return m2630b((Icon) this.f2192b);
        }
        if (this.f2191a == 2) {
            return ((String) this.f2192b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo2707c() {
        this.f2198h = Mode.valueOf(this.f2199i);
        int i = this.f2191a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f2192b = this.f2193c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f2192b = new String(this.f2193c, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f2194d;
            if (parcelable != null) {
                this.f2192b = parcelable;
                return;
            }
            byte[] bArr = this.f2193c;
            this.f2192b = bArr;
            this.f2191a = 3;
            this.f2195e = 0;
            this.f2196f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f2194d;
        if (parcelable2 != null) {
            this.f2192b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f2191a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f2192b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f2191a
            java.lang.String r1 = m2629a(r1)
            r0.append(r1)
            int r1 = r4.f2191a
            r2 = 1
            if (r1 == r2) goto L_0x007a
            r3 = 2
            if (r1 == r3) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x007a
            goto L_0x009a
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f2192b
            r0.append(r1)
            goto L_0x009a
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f2195e
            r0.append(r1)
            int r1 = r4.f2196f
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f2196f
            r0.append(r1)
            goto L_0x009a
        L_0x0052:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo2706b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo2704a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f2192b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f2192b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009a:
            android.content.res.ColorStateList r1 = r4.f2197g
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f2197g
            r0.append(r1)
        L_0x00a8:
            android.graphics.PorterDuff$Mode r1 = r4.f2198h
            android.graphics.PorterDuff$Mode r2 = f2190j
            if (r1 == r2) goto L_0x00b8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f2198h
            r0.append(r1)
        L_0x00b8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: b */
    private static String m2630b(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    /* renamed from: a */
    public void mo2705a(boolean z) {
        this.f2199i = this.f2198h.name();
        int i = this.f2191a;
        if (i != -1) {
            if (i != 1) {
                String str = "UTF-16";
                if (i == 2) {
                    this.f2193c = ((String) this.f2192b).getBytes(Charset.forName(str));
                    return;
                } else if (i == 3) {
                    this.f2193c = (byte[]) this.f2192b;
                    return;
                } else if (i == 4) {
                    this.f2193c = this.f2192b.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f2192b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2193c = byteArrayOutputStream.toByteArray();
                return;
            }
            this.f2194d = (Parcelable) this.f2192b;
        } else if (!z) {
            this.f2194d = (Parcelable) this.f2192b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: a */
    private static int m2628a(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }
}
