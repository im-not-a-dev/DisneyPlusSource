package p096e.p155q.p156a.p157a;

import android.media.tv.TvContentRating;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: e.q.a.a.i */
/* compiled from: TvContractUtils */
public class C4353i {

    /* renamed from: a */
    static final TvContentRating[] f10807a = new TvContentRating[0];

    /* renamed from: a */
    public static String m15016a(TvContentRating[] tvContentRatingArr) {
        if (tvContentRatingArr == null || tvContentRatingArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(tvContentRatingArr[0].flattenToString());
        for (int i = 1; i < tvContentRatingArr.length; i++) {
            sb.append(",");
            sb.append(tvContentRatingArr[i].flattenToString());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static TvContentRating[] m15019b(String str) {
        TvContentRating[] tvContentRatingArr;
        if (TextUtils.isEmpty(str)) {
            return f10807a;
        }
        String[] split = str.split("\\s*,\\s*", -1);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            try {
                arrayList.add(TvContentRating.unflattenFromString(str2));
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't parse the content rating: '");
                sb.append(str2);
                sb.append("', skipping");
                Log.w("TvContractUtils", sb.toString(), e);
            }
        }
        if (arrayList.size() == 0) {
            tvContentRatingArr = f10807a;
        } else {
            tvContentRatingArr = (TvContentRating[]) arrayList.toArray(new TvContentRating[arrayList.size()]);
        }
        return tvContentRatingArr;
    }

    /* renamed from: a */
    public static String[] m15018a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\s*,\\s*");
    }

    /* renamed from: a */
    public static String m15017a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(",");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }
}
