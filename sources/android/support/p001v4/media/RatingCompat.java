package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C0009a();

    /* renamed from: U */
    private final float f32U;

    /* renamed from: V */
    private Object f33V;

    /* renamed from: c */
    private final int f34c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0009a implements Creator<RatingCompat> {
        C0009a() {
        }

        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f34c = i;
        this.f32U = f;
    }

    /* renamed from: a */
    public static RatingCompat m41a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static RatingCompat m45b(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: X */
    public float mo56X() {
        if (this.f34c != 6 || !mo59a0()) {
            return -1.0f;
        }
        return this.f32U;
    }

    /* renamed from: Y */
    public float mo57Y() {
        int i = this.f34c;
        if ((i == 3 || i == 4 || i == 5) && mo59a0()) {
            return this.f32U;
        }
        return -1.0f;
    }

    /* renamed from: Z */
    public boolean mo58Z() {
        boolean z = false;
        if (this.f34c != 1) {
            return false;
        }
        if (this.f32U == 1.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: a0 */
    public boolean mo59a0() {
        return this.f32U >= 0.0f;
    }

    /* renamed from: b0 */
    public boolean mo60b0() {
        boolean z = false;
        if (this.f34c != 2) {
            return false;
        }
        if (this.f32U == 1.0f) {
            z = true;
        }
        return z;
    }

    public int describeContents() {
        return this.f34c;
    }

    /* renamed from: g */
    public Object mo62g() {
        if (this.f33V == null && VERSION.SDK_INT >= 19) {
            if (mo59a0()) {
                int i = this.f34c;
                switch (i) {
                    case 1:
                        this.f33V = Rating.newHeartRating(mo58Z());
                        break;
                    case 2:
                        this.f33V = Rating.newThumbRating(mo60b0());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f33V = Rating.newStarRating(i, mo57Y());
                        break;
                    case 6:
                        this.f33V = Rating.newPercentageRating(mo56X());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f33V = Rating.newUnratedRating(this.f34c);
            }
        }
        return this.f33V;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f34c);
        sb.append(" rating=");
        float f = this.f32U;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34c);
        parcel.writeFloat(this.f32U);
    }

    /* renamed from: a */
    public static RatingCompat m44a(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: a */
    public static RatingCompat m42a(int i, float f) {
        float f2;
        String str = "Rating";
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid rating style (");
            sb.append(i);
            sb.append(") for a star rating");
            Log.e(str, sb.toString());
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e(str, "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: a */
    public static RatingCompat m40a(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: a */
    public static RatingCompat m43a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m44a(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m45b(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m42a(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m40a(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m41a(ratingStyle);
            }
            ratingCompat.f33V = obj;
        }
        return ratingCompat;
    }
}
