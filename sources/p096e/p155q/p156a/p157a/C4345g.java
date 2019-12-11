package p096e.p155q.p156a.p157a;

import android.content.ContentUris;
import android.content.Context;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.BaseColumns;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.q.a.a.g */
/* compiled from: TvContractCompat */
public final class C4345g {

    /* renamed from: e.q.a.a.g$a */
    /* compiled from: TvContractCompat */
    public interface C4346a extends BaseColumns {
    }

    /* renamed from: e.q.a.a.g$b */
    /* compiled from: TvContractCompat */
    public static final class C4347b implements C4346a {

        /* renamed from: a */
        public static final Uri f10801a = Uri.parse("content://android.media.tv/channel");

        /* renamed from: b */
        private static final Map<String, String> f10802b = new HashMap();

        static {
            String str = "VIDEO_RESOLUTION_SD";
            f10802b.put("VIDEO_FORMAT_480I", str);
            String str2 = "VIDEO_RESOLUTION_ED";
            f10802b.put("VIDEO_FORMAT_480P", str2);
            f10802b.put("VIDEO_FORMAT_576I", str);
            f10802b.put("VIDEO_FORMAT_576P", str2);
            String str3 = "VIDEO_RESOLUTION_HD";
            f10802b.put("VIDEO_FORMAT_720P", str3);
            f10802b.put("VIDEO_FORMAT_1080I", str3);
            f10802b.put("VIDEO_FORMAT_1080P", "VIDEO_RESOLUTION_FHD");
            String str4 = "VIDEO_RESOLUTION_UHD";
            f10802b.put("VIDEO_FORMAT_2160P", str4);
            f10802b.put("VIDEO_FORMAT_4320P", str4);
        }
    }

    /* renamed from: e.q.a.a.g$c */
    /* compiled from: TvContractCompat */
    public interface C4348c {
    }

    /* renamed from: e.q.a.a.g$d */
    /* compiled from: TvContractCompat */
    public static final class C4349d implements C4346a, C4350e, C4348c {

        /* renamed from: a */
        public static final Uri f10803a = Uri.parse("content://android.media.tv/preview_program");
    }

    /* renamed from: e.q.a.a.g$e */
    /* compiled from: TvContractCompat */
    interface C4350e {
    }

    /* renamed from: e.q.a.a.g$f */
    /* compiled from: TvContractCompat */
    public static final class C4351f implements C4346a, C4350e, C4348c {

        /* renamed from: a */
        public static final Uri f10804a = Uri.parse("content://android.media.tv/watch_next_program");
    }

    /* renamed from: a */
    public static Uri m15007a(long j) {
        return TvContract.buildChannelLogoUri(j);
    }

    /* renamed from: b */
    public static Uri m15009b(long j) {
        return TvContract.buildChannelUri(j);
    }

    /* renamed from: c */
    public static Uri m15010c(long j) {
        return ContentUris.withAppendedId(C4349d.f10803a, j);
    }

    /* renamed from: d */
    public static Uri m15011d(long j) {
        return C4349d.f10803a.buildUpon().appendQueryParameter("channel", String.valueOf(j)).build();
    }

    /* renamed from: e */
    public static Uri m15012e(long j) {
        return ContentUris.withAppendedId(C4351f.f10804a, j);
    }

    /* renamed from: a */
    public static void m15008a(Context context, long j) {
        if (VERSION.SDK_INT >= 26) {
            TvContract.requestChannelBrowsable(context, j);
        }
    }
}
