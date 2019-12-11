package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p001v4.media.session.MediaSessionCompat;
import p096e.p113e.C3926a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C0007a();

    /* renamed from: V */
    static final C3926a<String, Integer> f28V = new C3926a<>();

    /* renamed from: U */
    private MediaMetadata f29U;

    /* renamed from: c */
    final Bundle f30c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0007a implements Creator<MediaMetadataCompat> {
        C0007a() {
        }

        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0008b {

        /* renamed from: a */
        private final Bundle f31a;

        public C0008b() {
            this.f31a = new Bundle();
        }

        /* renamed from: a */
        public C0008b mo53a(String str, CharSequence charSequence) {
            if (!MediaMetadataCompat.f28V.containsKey(str) || ((Integer) MediaMetadataCompat.f28V.get(str)).intValue() == 1) {
                this.f31a.putCharSequence(str, charSequence);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a CharSequence");
            throw new IllegalArgumentException(sb.toString());
        }

        public C0008b(MediaMetadataCompat mediaMetadataCompat) {
            this.f31a = new Bundle(mediaMetadataCompat.f30c);
            MediaSessionCompat.m97a(this.f31a);
        }

        /* renamed from: a */
        public C0008b mo54a(String str, String str2) {
            if (!MediaMetadataCompat.f28V.containsKey(str) || ((Integer) MediaMetadataCompat.f28V.get(str)).intValue() == 1) {
                this.f31a.putCharSequence(str, str2);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a String");
            throw new IllegalArgumentException(sb.toString());
        }

        public C0008b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f31a.keySet()) {
                Object obj = this.f31a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo51a(str, m33a(bitmap, i));
                    }
                }
            }
        }

        /* renamed from: a */
        public C0008b mo50a(String str, long j) {
            if (!MediaMetadataCompat.f28V.containsKey(str) || ((Integer) MediaMetadataCompat.f28V.get(str)).intValue() == 0) {
                this.f31a.putLong(str, j);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a long");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C0008b mo52a(String str, RatingCompat ratingCompat) {
            if (!MediaMetadataCompat.f28V.containsKey(str) || ((Integer) MediaMetadataCompat.f28V.get(str)).intValue() == 3) {
                if (VERSION.SDK_INT >= 19) {
                    this.f31a.putParcelable(str, (Parcelable) ratingCompat.mo62g());
                } else {
                    this.f31a.putParcelable(str, ratingCompat);
                }
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a Rating");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C0008b mo51a(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.f28V.containsKey(str) || ((Integer) MediaMetadataCompat.f28V.get(str)).intValue() == 2) {
                this.f31a.putParcelable(str, bitmap);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The ");
            sb.append(str);
            sb.append(" key cannot be used to put a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public MediaMetadataCompat mo55a() {
            return new MediaMetadataCompat(this.f31a);
        }

        /* renamed from: a */
        private Bitmap m33a(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }
    }

    static {
        C3926a<String, Integer> aVar = f28V;
        Integer valueOf = Integer.valueOf(1);
        aVar.put("android.media.metadata.TITLE", valueOf);
        f28V.put("android.media.metadata.ARTIST", valueOf);
        C3926a<String, Integer> aVar2 = f28V;
        Integer valueOf2 = Integer.valueOf(0);
        aVar2.put("android.media.metadata.DURATION", valueOf2);
        f28V.put("android.media.metadata.ALBUM", valueOf);
        f28V.put("android.media.metadata.AUTHOR", valueOf);
        f28V.put("android.media.metadata.WRITER", valueOf);
        f28V.put("android.media.metadata.COMPOSER", valueOf);
        f28V.put("android.media.metadata.COMPILATION", valueOf);
        f28V.put("android.media.metadata.DATE", valueOf);
        f28V.put("android.media.metadata.YEAR", valueOf2);
        f28V.put("android.media.metadata.GENRE", valueOf);
        f28V.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        f28V.put("android.media.metadata.NUM_TRACKS", valueOf2);
        f28V.put("android.media.metadata.DISC_NUMBER", valueOf2);
        f28V.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        C3926a<String, Integer> aVar3 = f28V;
        Integer valueOf3 = Integer.valueOf(2);
        String str = "android.media.metadata.ART";
        aVar3.put(str, valueOf3);
        String str2 = "android.media.metadata.ART_URI";
        f28V.put(str2, valueOf);
        String str3 = "android.media.metadata.ALBUM_ART";
        f28V.put(str3, valueOf3);
        String str4 = "android.media.metadata.ALBUM_ART_URI";
        f28V.put(str4, valueOf);
        C3926a<String, Integer> aVar4 = f28V;
        Integer valueOf4 = Integer.valueOf(3);
        aVar4.put("android.media.metadata.USER_RATING", valueOf4);
        f28V.put("android.media.metadata.RATING", valueOf4);
        f28V.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        f28V.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        f28V.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        String str5 = "android.media.metadata.DISPLAY_ICON";
        f28V.put(str5, valueOf3);
        String str6 = "android.media.metadata.DISPLAY_ICON_URI";
        f28V.put(str6, valueOf);
        f28V.put("android.media.metadata.MEDIA_ID", valueOf);
        f28V.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        f28V.put("android.media.metadata.MEDIA_URI", valueOf);
        f28V.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        f28V.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        new String[]{str5, str, str3};
        new String[]{str6, str2, str4};
    }

    MediaMetadataCompat(Bundle bundle) {
        this.f30c = new Bundle(bundle);
        MediaSessionCompat.m97a(this.f30c);
    }

    /* renamed from: B */
    public Object mo42B() {
        if (this.f29U == null && VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f29U = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f29U;
    }

    /* renamed from: X */
    public Bundle mo43X() {
        return new Bundle(this.f30c);
    }

    /* renamed from: a */
    public boolean mo44a(String str) {
        return this.f30c.containsKey(str);
    }

    /* renamed from: b */
    public long mo45b(String str) {
        return this.f30c.getLong(str, 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f30c);
    }

    /* renamed from: a */
    public static MediaMetadataCompat m28a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f29U = mediaMetadata;
        return mediaMetadataCompat;
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f30c = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
