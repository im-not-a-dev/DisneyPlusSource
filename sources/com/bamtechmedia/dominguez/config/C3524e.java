package com.bamtechmedia.dominguez.config;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0017¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0017¢\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0017¢\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H&¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "", "map", "", "", "getMap", "()Ljava/util/Map;", "doubleValue", "", "rootPath", "path", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Double;", "intValue", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;", "longValue", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;", "value", "T", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;", "configApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.e */
/* compiled from: AppConfigMap.kt */
public interface C3524e {

    /* renamed from: com.bamtechmedia.dominguez.config.e$a */
    /* compiled from: AppConfigMap.kt */
    public static final class C3525a {
        @SuppressLint({"ConfigDocs"})
        /* renamed from: a */
        public static Double m11938a(C3524e eVar, String str, String... strArr) {
            Number number = (Number) eVar.mo12720d(str, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (number != null) {
                return Double.valueOf(number.doubleValue());
            }
            return null;
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: b */
        public static Integer m11939b(C3524e eVar, String str, String... strArr) {
            Number number = (Number) eVar.mo12720d(str, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            return null;
        }

        @SuppressLint({"ConfigDocs"})
        /* renamed from: c */
        public static Long m11940c(C3524e eVar, String str, String... strArr) {
            Number number = (Number) eVar.mo12720d(str, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }
    }

    @SuppressLint({"ConfigDocs"})
    /* renamed from: a */
    Long mo12716a(String str, String... strArr);

    /* renamed from: a */
    Map<String, ?> mo12717a();

    @SuppressLint({"ConfigDocs"})
    /* renamed from: b */
    Double mo12718b(String str, String... strArr);

    @SuppressLint({"ConfigDocs"})
    /* renamed from: c */
    Integer mo12719c(String str, String... strArr);

    /* renamed from: d */
    <T> T mo12720d(String str, String... strArr);
}
