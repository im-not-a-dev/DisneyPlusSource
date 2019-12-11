package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C0005a();

    /* renamed from: U */
    private final CharSequence f11U;

    /* renamed from: V */
    private final CharSequence f12V;

    /* renamed from: W */
    private final CharSequence f13W;

    /* renamed from: X */
    private final Bitmap f14X;

    /* renamed from: Y */
    private final Uri f15Y;

    /* renamed from: Z */
    private final Bundle f16Z;

    /* renamed from: a0 */
    private final Uri f17a0;

    /* renamed from: b0 */
    private MediaDescription f18b0;

    /* renamed from: c */
    private final String f19c;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0005a implements Creator<MediaDescriptionCompat> {
        C0005a() {
        }

        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m11a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0006b {

        /* renamed from: a */
        private String f20a;

        /* renamed from: b */
        private CharSequence f21b;

        /* renamed from: c */
        private CharSequence f22c;

        /* renamed from: d */
        private CharSequence f23d;

        /* renamed from: e */
        private Bitmap f24e;

        /* renamed from: f */
        private Uri f25f;

        /* renamed from: g */
        private Bundle f26g;

        /* renamed from: h */
        private Uri f27h;

        /* renamed from: a */
        public C0006b mo37a(String str) {
            this.f20a = str;
            return this;
        }

        /* renamed from: b */
        public C0006b mo40b(CharSequence charSequence) {
            this.f22c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0006b mo41c(CharSequence charSequence) {
            this.f21b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0006b mo36a(CharSequence charSequence) {
            this.f23d = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0006b mo39b(Uri uri) {
            this.f27h = uri;
            return this;
        }

        /* renamed from: a */
        public C0006b mo33a(Bitmap bitmap) {
            this.f24e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0006b mo34a(Uri uri) {
            this.f25f = uri;
            return this;
        }

        /* renamed from: a */
        public C0006b mo35a(Bundle bundle) {
            this.f26g = bundle;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo38a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f20a, this.f21b, this.f22c, this.f23d, this.f24e, this.f25f, this.f26g, this.f27h);
            return mediaDescriptionCompat;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f19c = str;
        this.f11U = charSequence;
        this.f12V = charSequence2;
        this.f13W = charSequence3;
        this.f14X = bitmap;
        this.f15Y = uri;
        this.f16Z = bundle;
        this.f17a0 = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m11a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0082
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0082
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.mo37a(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.mo41c(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.mo40b(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.mo36a(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.mo33a(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.mo34a(r2)
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004c
            android.support.p001v4.media.session.MediaSessionCompat.m97a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004d
        L_0x004c:
            r4 = r0
        L_0x004d:
            if (r4 == 0) goto L_0x0065
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005f
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0065:
            r0 = r2
        L_0x0066:
            r1.mo35a(r0)
            if (r4 == 0) goto L_0x006f
            r1.mo39b(r4)
            goto L_0x007c
        L_0x006f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007c
            android.net.Uri r0 = r8.getMediaUri()
            r1.mo39b(r0)
        L_0x007c:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo38a()
            r0.f18b0 = r8
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m11a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: X */
    public Bundle mo19X() {
        return this.f16Z;
    }

    /* renamed from: Y */
    public Bitmap mo20Y() {
        return this.f14X;
    }

    /* renamed from: Z */
    public Uri mo21Z() {
        return this.f15Y;
    }

    /* renamed from: a0 */
    public Object mo22a0() {
        if (this.f18b0 != null || VERSION.SDK_INT < 21) {
            return this.f18b0;
        }
        Builder builder = new Builder();
        builder.setMediaId(this.f19c);
        builder.setTitle(this.f11U);
        builder.setSubtitle(this.f12V);
        builder.setDescription(this.f13W);
        builder.setIconBitmap(this.f14X);
        builder.setIconUri(this.f15Y);
        Bundle bundle = this.f16Z;
        if (VERSION.SDK_INT < 23 && this.f17a0 != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f17a0);
        }
        builder.setExtras(bundle);
        if (VERSION.SDK_INT >= 23) {
            builder.setMediaUri(this.f17a0);
        }
        this.f18b0 = builder.build();
        return this.f18b0;
    }

    /* renamed from: b0 */
    public Uri mo23b0() {
        return this.f17a0;
    }

    /* renamed from: c0 */
    public CharSequence mo24c0() {
        return this.f12V;
    }

    /* renamed from: d0 */
    public CharSequence mo25d0() {
        return this.f11U;
    }

    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.f13W;
    }

    public String getMediaId() {
        return this.f19c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11U);
        String str = ", ";
        sb.append(str);
        sb.append(this.f12V);
        sb.append(str);
        sb.append(this.f13W);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f19c);
            TextUtils.writeToParcel(this.f11U, parcel, i);
            TextUtils.writeToParcel(this.f12V, parcel, i);
            TextUtils.writeToParcel(this.f13W, parcel, i);
            parcel.writeParcelable(this.f14X, i);
            parcel.writeParcelable(this.f15Y, i);
            parcel.writeBundle(this.f16Z);
            parcel.writeParcelable(this.f17a0, i);
            return;
        }
        ((MediaDescription) mo22a0()).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f19c = parcel.readString();
        this.f11U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13W = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f14X = (Bitmap) parcel.readParcelable(classLoader);
        this.f15Y = (Uri) parcel.readParcelable(classLoader);
        this.f16Z = parcel.readBundle(classLoader);
        this.f17a0 = (Uri) parcel.readParcelable(classLoader);
    }
}
