package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p163g.p449j.p450a.p451a.p457d.p464g.C11035b0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11050c0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11069d0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11085e0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11105f0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11225n0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11239o0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11253p0.C11254a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11296s0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11339v0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11353w0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11367x0;
import p163g.p449j.p450a.p451a.p457d.p464g.C11367x0.C11368a;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
public final class C10211u8 extends C10138n8 {
    C10211u8(C10126m8 m8Var) {
        super(m8Var);
    }

    /* renamed from: b */
    static Object m31859b(C11253p0 p0Var, String str) {
        C11281r0 a = m31848a(p0Var, str);
        if (a != null) {
            if (a.mo28850o()) {
                return a.mo28851p();
            }
            if (a.mo28852q()) {
                return Long.valueOf(a.mo28853r());
            }
            if (a.mo28854s()) {
                return Double.valueOf(a.mo28855t());
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26120a(C11368a aVar, Object obj) {
        C9908u.m30853a(obj);
        aVar.mo29142i();
        aVar.mo29143j();
        aVar.mo29144k();
        if (obj instanceof String) {
            aVar.mo29141b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo29140b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo29137a(((Double) obj).doubleValue());
        } else {
            mo25898e().mo25874t().mo25909a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo26124c(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo25898e().mo25874t().mo25909a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo25760u() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final List<Integer> mo26125v() {
        Map a = C10106l.m31490a(this.f23609b.mo25895b());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C10106l.f23633R.mo26194a(null)).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo25898e().mo25877w().mo25909a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo25898e().mo25877w().mo25909a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo26123b(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo25898e().mo25874t().mo25909a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26119a(C11282a aVar, Object obj) {
        C9908u.m30853a(obj);
        aVar.mo28860i();
        aVar.mo28861j();
        aVar.mo28862k();
        if (obj instanceof String) {
            aVar.mo28859b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo28857a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo28856a(((Double) obj).doubleValue());
        } else {
            mo25898e().mo25874t().mo25909a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: a */
    static C11281r0 m31848a(C11253p0 p0Var, String str) {
        for (C11281r0 r0Var : p0Var.mo28801q()) {
            if (r0Var.mo28849n().equals(str)) {
                return r0Var;
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m31851a(C11254a aVar, String str, Object obj) {
        List k = aVar.mo28818k();
        int i = 0;
        while (true) {
            if (i >= k.size()) {
                i = -1;
                break;
            } else if (str.equals(((C11281r0) k.get(i)).mo28849n())) {
                break;
            } else {
                i++;
            }
        }
        C11282a x = C11281r0.m35991x();
        x.mo28858a(str);
        if (obj instanceof Long) {
            x.mo28857a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            x.mo28859b((String) obj);
        } else if (obj instanceof Double) {
            x.mo28856a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.mo28807a(i, x);
        } else {
            aVar.mo28810a(x);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26117a(C11296s0 s0Var) {
        if (s0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        Iterator it = s0Var.mo28878n().iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                C11310t0 t0Var = (C11310t0) it.next();
                if (t0Var != null) {
                    m31852a(sb, 1);
                    sb.append("bundle {\n");
                    if (t0Var.mo28903F()) {
                        m31856a(sb, 1, "protocol_version", (Object) Integer.valueOf(t0Var.mo28904G()));
                    }
                    m31856a(sb, 1, "platform", (Object) t0Var.mo28913P());
                    if (t0Var.mo28917T()) {
                        m31856a(sb, 1, "gmp_version", (Object) Long.valueOf(t0Var.mo28950u()));
                    }
                    if (t0Var.mo28918U()) {
                        m31856a(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(t0Var.mo28919V()));
                    }
                    if (t0Var.mo28949t0()) {
                        m31856a(sb, 1, "dynamite_version", (Object) Long.valueOf(t0Var.mo28952w()));
                    }
                    if (t0Var.mo28935m0()) {
                        m31856a(sb, 1, "config_version", (Object) Long.valueOf(t0Var.mo28937n0()));
                    }
                    m31856a(sb, 1, "gmp_app_id", (Object) t0Var.mo28940p());
                    m31856a(sb, 1, "admob_app_id", (Object) t0Var.mo28947s0());
                    m31856a(sb, 1, "app_id", (Object) t0Var.mo28944r());
                    m31856a(sb, 1, "app_version", (Object) t0Var.mo28946s());
                    if (t0Var.mo28932g0()) {
                        m31856a(sb, 1, "app_version_major", (Object) Integer.valueOf(t0Var.mo28933h0()));
                    }
                    m31856a(sb, 1, "firebase_instance_id", (Object) t0Var.mo28938o());
                    if (t0Var.mo28923Z()) {
                        m31856a(sb, 1, "dev_cert_hash", (Object) Long.valueOf(t0Var.mo28951v()));
                    }
                    m31856a(sb, 1, "app_store", (Object) t0Var.mo28948t());
                    if (t0Var.mo28905H()) {
                        m31856a(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(t0Var.mo28906I()));
                    }
                    if (t0Var.mo28907J()) {
                        m31856a(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(t0Var.mo28901D()));
                    }
                    if (t0Var.mo28908K()) {
                        m31856a(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(t0Var.mo28902E()));
                    }
                    if (t0Var.mo28909L()) {
                        m31856a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(t0Var.mo28910M()));
                    }
                    if (t0Var.mo28911N()) {
                        m31856a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(t0Var.mo28912O()));
                    }
                    m31856a(sb, 1, "app_instance_id", (Object) t0Var.mo28936n());
                    m31856a(sb, 1, "resettable_device_id", (Object) t0Var.mo28920W());
                    m31856a(sb, 1, "device_id", (Object) t0Var.mo28934i0());
                    m31856a(sb, 1, "ds_id", (Object) t0Var.mo28941p0());
                    if (t0Var.mo28921X()) {
                        m31856a(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(t0Var.mo28922Y()));
                    }
                    m31856a(sb, 1, "os_version", (Object) t0Var.mo28942q());
                    m31856a(sb, 1, "device_model", (Object) t0Var.mo28914Q());
                    m31856a(sb, 1, "user_default_language", (Object) t0Var.mo28954y());
                    if (t0Var.mo28915R()) {
                        m31856a(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(t0Var.mo28916S()));
                    }
                    if (t0Var.mo28924a0()) {
                        m31856a(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(t0Var.mo28926b0()));
                    }
                    if (t0Var.mo28929d0()) {
                        m31856a(sb, 1, "service_upload", (Object) Boolean.valueOf(t0Var.mo28930e0()));
                    }
                    m31856a(sb, 1, "health_monitor", (Object) t0Var.mo28928c0());
                    if (t0Var.mo28939o0() && t0Var.mo28953x() != 0) {
                        m31856a(sb, 1, "android_id", (Object) Long.valueOf(t0Var.mo28953x()));
                    }
                    if (t0Var.mo28943q0()) {
                        m31856a(sb, 1, "retry_counter", (Object) Integer.valueOf(t0Var.mo28945r0()));
                    }
                    List<C11367x0> B = t0Var.mo28899B();
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = "name";
                    int i = 2;
                    if (B != null) {
                        for (C11367x0 x0Var : B) {
                            if (x0Var != null) {
                                m31852a(sb, 2);
                                sb.append("user_property {\n");
                                m31856a(sb, 2, "set_timestamp_millis", (Object) x0Var.mo29135u() ? Long.valueOf(x0Var.mo29136v()) : null);
                                m31856a(sb, 2, str5, (Object) mo25902l().mo25797c(x0Var.mo29128n()));
                                m31856a(sb, 2, str4, (Object) x0Var.mo29130p());
                                m31856a(sb, 2, str3, (Object) x0Var.mo29131q() ? Long.valueOf(x0Var.mo29132r()) : null);
                                m31856a(sb, 2, str2, (Object) x0Var.mo29133s() ? Double.valueOf(x0Var.mo29134t()) : null);
                                m31852a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<C11225n0> f0 = t0Var.mo28931f0();
                    String r = t0Var.mo28944r();
                    if (f0 != null) {
                        for (C11225n0 n0Var : f0) {
                            if (n0Var != null) {
                                m31852a(sb, i);
                                sb.append("audience_membership {\n");
                                if (n0Var.mo28717q()) {
                                    m31856a(sb, i, "audience_id", (Object) Integer.valueOf(n0Var.mo28718r()));
                                }
                                if (n0Var.mo28719s()) {
                                    m31856a(sb, i, "new_audience", (Object) Boolean.valueOf(n0Var.mo28720t()));
                                }
                                StringBuilder sb2 = sb;
                                String str6 = r;
                                m31855a(sb2, 2, "current_data", n0Var.mo28714n(), str6);
                                m31855a(sb2, 2, "previous_data", n0Var.mo28716p(), str6);
                                m31852a(sb, 2);
                                sb.append(str);
                                i = 2;
                            }
                        }
                    }
                    List<C11253p0> z = t0Var.mo28955z();
                    if (z != null) {
                        for (C11253p0 p0Var : z) {
                            if (p0Var != null) {
                                m31852a(sb, 2);
                                sb.append("event {\n");
                                m31856a(sb, 2, str5, (Object) mo25902l().mo25795a(p0Var.mo28799o()));
                                if (p0Var.mo28803s()) {
                                    m31856a(sb, 2, "timestamp_millis", (Object) Long.valueOf(p0Var.mo28800p()));
                                }
                                if (p0Var.mo28805u()) {
                                    m31856a(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(p0Var.mo28804t()));
                                }
                                if (p0Var.mo28806v()) {
                                    m31856a(sb, 2, "count", (Object) Integer.valueOf(p0Var.mo28798n()));
                                }
                                if (p0Var.mo28802r() != 0) {
                                    List<C11281r0> q = p0Var.mo28801q();
                                    if (q != null) {
                                        for (C11281r0 r0Var : q) {
                                            if (r0Var != null) {
                                                m31852a(sb, 3);
                                                sb.append("param {\n");
                                                m31856a(sb, 3, str5, (Object) mo25902l().mo25796b(r0Var.mo28849n()));
                                                m31856a(sb, 3, str4, (Object) r0Var.mo28851p());
                                                m31856a(sb, 3, str3, (Object) r0Var.mo28852q() ? Long.valueOf(r0Var.mo28853r()) : null);
                                                m31856a(sb, 3, str2, (Object) r0Var.mo28854s() ? Double.valueOf(r0Var.mo28855t()) : null);
                                                m31852a(sb, 3);
                                                sb.append(str);
                                            }
                                        }
                                    }
                                }
                                m31852a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    m31852a(sb, 1);
                    sb.append(str);
                }
            } else {
                sb.append(str);
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26115a(C11035b0 b0Var) {
        if (b0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (b0Var.mo28298q()) {
            m31856a(sb, 0, "filter_id", (Object) Integer.valueOf(b0Var.mo28295n()));
        }
        m31856a(sb, 0, "event_name", (Object) mo25902l().mo25795a(b0Var.mo28296o()));
        String a = m31849a(b0Var.mo28302u(), b0Var.mo28303v(), b0Var.mo28305x());
        if (!a.isEmpty()) {
            m31856a(sb, 0, "filter_type", (Object) a);
        }
        m31854a(sb, 1, "event_count_filter", b0Var.mo28301t());
        sb.append("  filters {\n");
        for (C11050c0 a2 : b0Var.mo28299r()) {
            m31853a(sb, 2, a2);
        }
        m31852a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26116a(C11085e0 e0Var) {
        if (e0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (e0Var.mo28417p()) {
            m31856a(sb, 0, "filter_id", (Object) Integer.valueOf(e0Var.mo28415n()));
        }
        m31856a(sb, 0, "property_name", (Object) mo25902l().mo25797c(e0Var.mo28416o()));
        String a = m31849a(e0Var.mo28418q(), e0Var.mo28419r(), e0Var.mo28421t());
        if (!a.isEmpty()) {
            m31856a(sb, 0, "filter_type", (Object) a);
        }
        m31853a(sb, 1, e0Var.mo28422u());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m31849a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private final void m31855a(StringBuilder sb, int i, String str, C11339v0 v0Var, String str2) {
        if (v0Var != null) {
            m31852a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            String str3 = ", ";
            if (v0Var.mo29057q() != 0) {
                m31852a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : v0Var.mo29056p()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (v0Var.mo29055o() != 0) {
                m31852a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : v0Var.mo29054n()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            boolean i6 = mo25900g().mo25825i(str2);
            String str4 = "}\n";
            if (i6) {
                if (v0Var.mo29059s() != 0) {
                    m31852a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    int i7 = 0;
                    for (C11239o0 o0Var : v0Var.mo29058r()) {
                        int i8 = i7 + 1;
                        if (i7 != 0) {
                            sb.append(str3);
                        }
                        sb.append(o0Var.mo28739o() ? Integer.valueOf(o0Var.mo28738n()) : null);
                        sb.append(":");
                        sb.append(o0Var.mo28740p() ? Long.valueOf(o0Var.mo28741q()) : null);
                        i7 = i8;
                    }
                    sb.append(str4);
                }
                if (v0Var.mo29061u() != 0) {
                    m31852a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    int i9 = 0;
                    for (C11353w0 w0Var : v0Var.mo29060t()) {
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(str3);
                        }
                        sb.append(w0Var.mo29082o() ? Integer.valueOf(w0Var.mo29081n()) : null);
                        sb.append(": [");
                        int i11 = 0;
                        for (Long longValue : w0Var.mo29083p()) {
                            long longValue2 = longValue.longValue();
                            int i12 = i11 + 1;
                            if (i11 != 0) {
                                sb.append(str3);
                            }
                            sb.append(longValue2);
                            i11 = i12;
                        }
                        sb.append("]");
                        i9 = i10;
                    }
                    sb.append(str4);
                }
            }
            m31852a(sb, 3);
            sb.append(str4);
        }
    }

    /* renamed from: a */
    private final void m31854a(StringBuilder sb, int i, String str, C11069d0 d0Var) {
        if (d0Var != null) {
            m31852a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (d0Var.mo28370n()) {
                m31856a(sb, i, "comparison_type", (Object) d0Var.mo28371o().name());
            }
            if (d0Var.mo28372p()) {
                m31856a(sb, i, "match_as_float", (Object) Boolean.valueOf(d0Var.mo28373q()));
            }
            m31856a(sb, i, "comparison_value", (Object) d0Var.mo28375s());
            m31856a(sb, i, "min_comparison_value", (Object) d0Var.mo28377u());
            m31856a(sb, i, "max_comparison_value", (Object) d0Var.mo28379w());
            m31852a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m31853a(StringBuilder sb, int i, C11050c0 c0Var) {
        if (c0Var != null) {
            m31852a(sb, i);
            sb.append("filter {\n");
            if (c0Var.mo28336r()) {
                m31856a(sb, i, "complement", (Object) Boolean.valueOf(c0Var.mo28337s()));
            }
            m31856a(sb, i, "param_name", (Object) mo25902l().mo25796b(c0Var.mo28338t()));
            int i2 = i + 1;
            C11105f0 o = c0Var.mo28333o();
            String str = "}\n";
            if (o != null) {
                m31852a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (o.mo28497n()) {
                    m31856a(sb, i2, "match_type", (Object) o.mo28498o().name());
                }
                m31856a(sb, i2, "expression", (Object) o.mo28500q());
                if (o.mo28501r()) {
                    m31856a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(o.mo28502s()));
                }
                if (o.mo28504u() > 0) {
                    m31852a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : o.mo28503t()) {
                        m31852a(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append(str);
                }
                m31852a(sb, i2);
                sb.append(str);
            }
            m31854a(sb, i2, "number_filter", c0Var.mo28335q());
            m31852a(sb, i);
            sb.append(str);
        }
    }

    /* renamed from: a */
    private static void m31852a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m31856a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m31852a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo25898e().mo25874t().mo25908a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo26114a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo25898e()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo25908a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10211u8.mo26114a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26122a(C10084j jVar, C10028d9 d9Var) {
        C9908u.m30853a(jVar);
        C9908u.m30853a(d9Var);
        if (!TextUtils.isEmpty(d9Var.f23371U) || !TextUtils.isEmpty(d9Var.f23388k0)) {
            return true;
        }
        mo25894a();
        return false;
    }

    /* renamed from: a */
    static boolean m31857a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m31858a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static List<Long> m31850a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<Long> mo26118a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo25898e().mo25877w().mo25909a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo25898e().mo25877w().mo25910a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26121a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo25896c().mo25474c() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo26113a(byte[] bArr) {
        C9908u.m30853a(bArr);
        mo25903m().mo25662j();
        MessageDigest x = C10251y8.m31989x();
        if (x != null) {
            return C10251y8.m31966a(x.digest(bArr));
        }
        mo25898e().mo25874t().mo25908a("Failed to get MD5");
        return 0;
    }
}
