package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.cache.t */
/* compiled from: SimpleCacheSpan */
final class C9486t extends C9470j {

    /* renamed from: Z */
    private static final Pattern f22084Z = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: a0 */
    private static final Pattern f22085a0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: b0 */
    private static final Pattern f22086b0 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private C9486t(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: a */
    public static File m29187a(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String str = ".";
        sb.append(str);
        sb.append(j);
        sb.append(str);
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }

    /* renamed from: b */
    public static C9486t m29189b(String str, long j) {
        C9486t tVar = new C9486t(str, j, -1, -9223372036854775807L, null);
        return tVar;
    }

    /* renamed from: a */
    public static C9486t m29185a(String str, long j) {
        C9486t tVar = new C9486t(str, j, -1, -9223372036854775807L, null);
        return tVar;
    }

    /* renamed from: a */
    public static C9486t m29186a(String str, long j, long j2) {
        C9486t tVar = new C9486t(str, j, j2, -9223372036854775807L, null);
        return tVar;
    }

    /* renamed from: a */
    public static C9486t m29184a(File file, long j, C9475m mVar) {
        return m29183a(file, j, -9223372036854775807L, mVar);
    }

    /* renamed from: a */
    public static C9486t m29183a(File file, long j, long j2, C9475m mVar) {
        File file2;
        C9475m mVar2 = mVar;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            File file3 = file;
            File a = m29188a(file, mVar2);
            if (a == null) {
                return null;
            }
            file2 = a;
            name = a.getName();
        } else {
            file2 = file;
        }
        Matcher matcher = f22086b0.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        String a2 = mVar2.mo24524a(Integer.parseInt(matcher.group(1)));
        if (a2 == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        C9486t tVar = new C9486t(a2, Long.parseLong(matcher.group(2)), length, j2 == -9223372036854775807L ? Long.parseLong(matcher.group(3)) : j2, file2);
        return tVar;
    }

    /* renamed from: a */
    private static File m29188a(File file, C9475m mVar) {
        String str;
        String name = file.getName();
        Matcher matcher = f22085a0.matcher(name);
        if (matcher.matches()) {
            str = Util.m29459m(matcher.group(1));
            if (str == null) {
                return null;
            }
        } else {
            matcher = f22084Z.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            str = matcher.group(1);
        }
        File a = m29187a(file.getParentFile(), mVar.mo24523a(str), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (!file.renameTo(a)) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public C9486t mo24555a(File file, long j) {
        Assertions.checkState(this.f22032W);
        C9486t tVar = new C9486t(this.f22035c, this.f22030U, this.f22031V, j, file);
        return tVar;
    }
}
