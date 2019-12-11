package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.C9832i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.danlew.android.joda.DateUtils;
import p163g.p449j.p450a.p451a.p457d.p464g.C11108f1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11298s1;
import p163g.p449j.p450a.p451a.p457d.p464g.C11348v8;
import p163g.p449j.p450a.p451a.p457d.p464g.C11382y1;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C10106l {

    /* renamed from: A */
    public static C10245y2<Long> f23610A;

    /* renamed from: A0 */
    public static C10245y2<Boolean> f23611A0;

    /* renamed from: B */
    public static C10245y2<Long> f23612B;

    /* renamed from: B0 */
    public static C10245y2<Boolean> f23613B0;

    /* renamed from: C */
    public static C10245y2<Long> f23614C;

    /* renamed from: C0 */
    public static C10245y2<Boolean> f23615C0;

    /* renamed from: D */
    public static C10245y2<Long> f23616D;

    /* renamed from: D0 */
    public static C10245y2<Boolean> f23617D0;

    /* renamed from: E */
    public static C10245y2<Long> f23618E;

    /* renamed from: E0 */
    public static C10245y2<Boolean> f23619E0;

    /* renamed from: F */
    public static C10245y2<Long> f23620F;

    /* renamed from: F0 */
    public static C10245y2<Boolean> f23621F0;

    /* renamed from: G */
    public static C10245y2<Long> f23622G;

    /* renamed from: H */
    public static C10245y2<Integer> f23623H;

    /* renamed from: I */
    public static C10245y2<Long> f23624I;

    /* renamed from: J */
    public static C10245y2<Integer> f23625J;

    /* renamed from: K */
    public static C10245y2<Integer> f23626K;

    /* renamed from: L */
    public static C10245y2<Long> f23627L;

    /* renamed from: M */
    public static C10245y2<Boolean> f23628M;

    /* renamed from: N */
    public static C10245y2<String> f23629N;

    /* renamed from: O */
    public static C10245y2<Long> f23630O;

    /* renamed from: P */
    public static C10245y2<Integer> f23631P;

    /* renamed from: Q */
    public static C10245y2<Double> f23632Q;

    /* renamed from: R */
    public static C10245y2<Integer> f23633R;

    /* renamed from: S */
    public static C10245y2<Boolean> f23634S;

    /* renamed from: T */
    public static C10245y2<Boolean> f23635T;

    /* renamed from: U */
    public static C10245y2<Boolean> f23636U;

    /* renamed from: V */
    public static C10245y2<Boolean> f23637V;

    /* renamed from: W */
    public static C10245y2<Boolean> f23638W;

    /* renamed from: X */
    public static C10245y2<Boolean> f23639X;

    /* renamed from: Y */
    public static C10245y2<Boolean> f23640Y;

    /* renamed from: Z */
    public static C10245y2<Boolean> f23641Z;

    /* renamed from: a */
    static C10072h9 f23642a;

    /* renamed from: a0 */
    public static C10245y2<Boolean> f23643a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static List<C10245y2<?>> f23644b = Collections.synchronizedList(new ArrayList());

    /* renamed from: b0 */
    public static C10245y2<Boolean> f23645b0;

    /* renamed from: c */
    private static volatile C10145o4 f23646c;

    /* renamed from: c0 */
    public static C10245y2<Boolean> f23647c0;

    /* renamed from: d */
    private static Boolean f23648d;

    /* renamed from: d0 */
    public static C10245y2<Boolean> f23649d0;

    /* renamed from: e */
    public static C10245y2<Boolean> f23650e;

    /* renamed from: e0 */
    public static C10245y2<Boolean> f23651e0;

    /* renamed from: f */
    public static C10245y2<String> f23652f = m31489a("measurement.log_tag", "FA", "FA-SVC", C10064h1.f23508a);

    /* renamed from: f0 */
    public static C10245y2<Boolean> f23653f0;

    /* renamed from: g */
    public static C10245y2<Long> f23654g;

    /* renamed from: g0 */
    public static C10245y2<Boolean> f23655g0;

    /* renamed from: h */
    public static C10245y2<Long> f23656h;

    /* renamed from: h0 */
    public static C10245y2<Boolean> f23657h0;

    /* renamed from: i */
    public static C10245y2<Long> f23658i;

    /* renamed from: i0 */
    public static C10245y2<Boolean> f23659i0;

    /* renamed from: j */
    public static C10245y2<String> f23660j;

    /* renamed from: j0 */
    public static C10245y2<Boolean> f23661j0;

    /* renamed from: k */
    public static C10245y2<String> f23662k;

    /* renamed from: k0 */
    public static C10245y2<Boolean> f23663k0;

    /* renamed from: l */
    public static C10245y2<Integer> f23664l;

    /* renamed from: l0 */
    public static C10245y2<Boolean> f23665l0;

    /* renamed from: m */
    public static C10245y2<Integer> f23666m;

    /* renamed from: m0 */
    public static C10245y2<Boolean> f23667m0;

    /* renamed from: n */
    public static C10245y2<Integer> f23668n;

    /* renamed from: n0 */
    public static C10245y2<Boolean> f23669n0;

    /* renamed from: o */
    public static C10245y2<Integer> f23670o;

    /* renamed from: o0 */
    public static C10245y2<Boolean> f23671o0;

    /* renamed from: p */
    public static C10245y2<Integer> f23672p;

    /* renamed from: p0 */
    public static C10245y2<Boolean> f23673p0;

    /* renamed from: q */
    public static C10245y2<Integer> f23674q;

    /* renamed from: q0 */
    public static C10245y2<Boolean> f23675q0;

    /* renamed from: r */
    public static C10245y2<Integer> f23676r;

    /* renamed from: r0 */
    public static C10245y2<Boolean> f23677r0;

    /* renamed from: s */
    public static C10245y2<Integer> f23678s;

    /* renamed from: s0 */
    public static C10245y2<Boolean> f23679s0;

    /* renamed from: t */
    public static C10245y2<Integer> f23680t;

    /* renamed from: t0 */
    public static C10245y2<Boolean> f23681t0;

    /* renamed from: u */
    public static C10245y2<Integer> f23682u;

    /* renamed from: u0 */
    public static C10245y2<Boolean> f23683u0;

    /* renamed from: v */
    public static C10245y2<String> f23684v;

    /* renamed from: v0 */
    public static C10245y2<Boolean> f23685v0;

    /* renamed from: w */
    public static C10245y2<Long> f23686w;

    /* renamed from: w0 */
    public static C10245y2<Boolean> f23687w0;

    /* renamed from: x */
    public static C10245y2<Long> f23688x;

    /* renamed from: x0 */
    public static C10245y2<Boolean> f23689x0;

    /* renamed from: y */
    public static C10245y2<Long> f23690y;

    /* renamed from: y0 */
    public static C10245y2<Boolean> f23691y0;

    /* renamed from: z */
    public static C10245y2<Long> f23692z;

    /* renamed from: z0 */
    public static C10245y2<Boolean> f23693z0;

    static {
        Collections.synchronizedSet(new HashSet());
        new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        Boolean valueOf = Boolean.valueOf(false);
        m31489a("measurement.log_third_party_store_events_enabled", valueOf, valueOf, C10140o.f23788a);
        m31489a("measurement.log_installs_enabled", valueOf, valueOf, C10129n.f23766a);
        m31489a("measurement.log_upgrades_enabled", valueOf, valueOf, C9986a0.f23269a);
        m31489a("measurement.log_androidId_enabled", valueOf, valueOf, C10096k0.f23588a);
        f23650e = m31489a("measurement.upload_dsid_enabled", valueOf, valueOf, C10233x0.f24025a);
        Long valueOf2 = Long.valueOf(10000);
        f23654g = m31489a("measurement.ad_id_cache_time", valueOf2, valueOf2, C10204u1.f23968a);
        Long valueOf3 = Long.valueOf(86400000);
        f23656h = m31489a("measurement.monitoring.sample_period_millis", valueOf3, valueOf3, C10032e2.f23396a);
        Long valueOf4 = Long.valueOf(3600000);
        f23658i = m31489a("measurement.config.cache_time", valueOf3, valueOf4, C10175r2.f23880a);
        String str = "https";
        f23660j = m31489a("measurement.config.url_scheme", str, str, C10235x2.f24027a);
        String str2 = "app-measurement.com";
        f23662k = m31489a("measurement.config.url_authority", str2, str2, C10162q.f23861a);
        Integer valueOf5 = Integer.valueOf(100);
        f23664l = m31489a("measurement.upload.max_bundles", valueOf5, valueOf5, C10151p.f23838a);
        Integer valueOf6 = Integer.valueOf(DateUtils.FORMAT_ABBREV_MONTH);
        f23666m = m31489a("measurement.upload.max_batch_size", valueOf6, valueOf6, C10182s.f23897a);
        f23668n = m31489a("measurement.upload.max_bundle_size", valueOf6, valueOf6, C10172r.f23877a);
        Integer valueOf7 = Integer.valueOf(1000);
        f23670o = m31489a("measurement.upload.max_events_per_bundle", valueOf7, valueOf7, C10202u.f23966a);
        Integer valueOf8 = Integer.valueOf(100000);
        f23672p = m31489a("measurement.upload.max_events_per_day", valueOf8, valueOf8, C10192t.f23926a);
        f23674q = m31489a("measurement.upload.max_error_events_per_day", valueOf7, valueOf7, C10222w.f24009a);
        Integer valueOf9 = Integer.valueOf(50000);
        f23676r = m31489a("measurement.upload.max_public_events_per_day", valueOf9, valueOf9, C10212v.f23979a);
        Integer valueOf10 = Integer.valueOf(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        f23678s = m31489a("measurement.upload.max_conversions_per_day", valueOf10, valueOf10, C10242y.f24053a);
        Integer valueOf11 = Integer.valueOf(10);
        f23680t = m31489a("measurement.upload.max_realtime_events_per_day", valueOf11, valueOf11, C10232x.f24024a);
        Integer valueOf12 = Integer.valueOf(100000);
        f23682u = m31489a("measurement.store.max_stored_events_per_app", valueOf12, valueOf12, C10252z.f24084a);
        String str3 = "https://app-measurement.com/a";
        f23684v = m31489a("measurement.upload.url", str3, str3, C10019d0.f23356a);
        Long valueOf13 = Long.valueOf(43200000);
        f23686w = m31489a("measurement.upload.backoff_period", valueOf13, valueOf13, C10008c0.f23324a);
        f23688x = m31489a("measurement.upload.window_interval", valueOf4, valueOf4, C10041f0.f23424a);
        f23690y = m31489a("measurement.upload.interval", valueOf4, valueOf4, C10030e0.f23394a);
        f23692z = m31489a("measurement.upload.realtime_upload_interval", valueOf2, valueOf2, C10063h0.f23507a);
        Long valueOf14 = Long.valueOf(1000);
        f23610A = m31489a("measurement.upload.debug_upload_interval", valueOf14, valueOf14, C10052g0.f23476a);
        Long valueOf15 = Long.valueOf(500);
        f23612B = m31489a("measurement.upload.minimum_delay", valueOf15, valueOf15, C10085j0.f23563a);
        Long valueOf16 = Long.valueOf(60000);
        f23614C = m31489a("measurement.alarm_manager.minimum_interval", valueOf16, valueOf16, C10074i0.f23528a);
        f23616D = m31489a("measurement.upload.stale_data_deletion_interval", valueOf3, valueOf3, C10107l0.f23694a);
        Long valueOf17 = Long.valueOf(604800000);
        f23618E = m31489a("measurement.upload.refresh_blacklisted_config_interval", valueOf17, valueOf17, C10130n0.f23767a);
        Long valueOf18 = Long.valueOf(15000);
        f23620F = m31489a("measurement.upload.initial_upload_delay_time", valueOf18, valueOf18, C10118m0.f23713a);
        Long valueOf19 = Long.valueOf(1800000);
        f23622G = m31489a("measurement.upload.retry_time", valueOf19, valueOf19, C10152p0.f23839a);
        Integer valueOf20 = Integer.valueOf(6);
        f23623H = m31489a("measurement.upload.retry_count", valueOf20, valueOf20, C10141o0.f23789a);
        Long valueOf21 = Long.valueOf(2419200000L);
        f23624I = m31489a("measurement.upload.max_queue_time", valueOf21, valueOf21, C10173r0.f23878a);
        Integer valueOf22 = Integer.valueOf(4);
        f23625J = m31489a("measurement.lifetimevalue.max_currency_tracked", valueOf22, valueOf22, C10163q0.f23862a);
        Integer valueOf23 = Integer.valueOf(HttpStatus.HTTP_OK);
        f23626K = m31489a("measurement.audience.filter_result_max_count", valueOf23, valueOf23, C10193t0.f23927a);
        Long valueOf24 = Long.valueOf(5000);
        f23627L = m31489a("measurement.service_client.idle_disconnect_millis", valueOf24, valueOf24, C10183s0.f23898a);
        f23628M = m31489a("measurement.test.boolean_flag", valueOf, valueOf, C10213v0.f23980a);
        String str4 = "---";
        f23629N = m31489a("measurement.test.string_flag", str4, str4, C10203u0.f23967a);
        Long valueOf25 = Long.valueOf(-1);
        f23630O = m31489a("measurement.test.long_flag", valueOf25, valueOf25, C10223w0.f24010a);
        Integer valueOf26 = Integer.valueOf(-2);
        f23631P = m31489a("measurement.test.int_flag", valueOf26, valueOf26, C10253z0.f24085a);
        Double valueOf27 = Double.valueOf(-3.0d);
        f23632Q = m31489a("measurement.test.double_flag", valueOf27, valueOf27, C10243y0.f24054a);
        Integer valueOf28 = Integer.valueOf(50);
        f23633R = m31489a("measurement.experiment.max_ids", valueOf28, valueOf28, C9998b1.f23301a);
        f23634S = m31489a("measurement.validation.internal_limits_internal_event_params", valueOf, valueOf, C9987a1.f23270a);
        Boolean valueOf29 = Boolean.valueOf(true);
        f23635T = m31489a("measurement.audience.dynamic_filters", valueOf29, valueOf29, C10031e1.f23395a);
        f23636U = m31489a("measurement.reset_analytics.persist_time", valueOf, valueOf, C10020d1.f23357a);
        f23637V = m31489a("measurement.validation.value_and_currency_params", valueOf29, valueOf29, C10053g1.f23477a);
        f23638W = m31489a("measurement.sampling.time_zone_offset_enabled", valueOf, valueOf, C10042f1.f23425a);
        f23639X = m31489a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", valueOf, valueOf, C10075i1.f23529a);
        f23640Y = m31489a("measurement.fetch_config_with_admob_app_id", valueOf29, valueOf29, C10097k1.f23589a);
        f23641Z = m31489a("measurement.client.sessions.session_id_enabled", valueOf, valueOf, C10086j1.f23564a);
        f23643a0 = m31489a("measurement.service.sessions.session_number_enabled", valueOf, valueOf, C10119m1.f23714a);
        f23645b0 = m31489a("measurement.client.sessions.immediate_start_enabled_foreground", valueOf, valueOf, C10108l1.f23695a);
        f23647c0 = m31489a("measurement.client.sessions.background_sessions_enabled", valueOf, valueOf, C10142o1.f23790a);
        f23649d0 = m31489a("measurement.client.sessions.remove_expired_session_properties_enabled", valueOf, valueOf, C10131n1.f23768a);
        f23651e0 = m31489a("measurement.service.sessions.session_number_backfill_enabled", valueOf, valueOf, C10164q1.f23863a);
        f23653f0 = m31489a("measurement.service.sessions.remove_disabled_session_number", valueOf, valueOf, C10153p1.f23840a);
        f23655g0 = m31489a("measurement.collection.firebase_global_collection_flag_enabled", valueOf29, valueOf29, C10184s1.f23899a);
        f23657h0 = m31489a("measurement.collection.efficient_engagement_reporting_enabled", valueOf, valueOf, C10174r1.f23879a);
        f23659i0 = m31489a("measurement.collection.redundant_engagement_removal_enabled", valueOf, valueOf, C10194t1.f23928a);
        f23661j0 = m31489a("measurement.personalized_ads_signals_collection_enabled", valueOf29, valueOf29, C10224w1.f24011a);
        f23663k0 = m31489a("measurement.personalized_ads_property_translation_enabled", valueOf29, valueOf29, C10214v1.f23981a);
        f23665l0 = m31489a("measurement.collection.init_params_control_enabled", valueOf29, valueOf29, C10244y1.f24055a);
        f23667m0 = m31489a("measurement.upload.disable_is_uploader", valueOf29, valueOf29, C10234x1.f24026a);
        f23669n0 = m31489a("measurement.experiment.enable_experiment_reporting", valueOf29, valueOf29, C9988a2.f23271a);
        f23671o0 = m31489a("measurement.collection.log_event_and_bundle_v2", valueOf29, valueOf29, C10254z1.f24086a);
        f23673p0 = m31489a("measurement.collection.null_empty_event_name_fix", valueOf29, valueOf29, C10010c2.f23328a);
        f23675q0 = m31489a("measurement.audience.sequence_filters", valueOf, valueOf, C9999b2.f23302a);
        m31489a("measurement.audience.sequence_filters_bundle_timestamp", valueOf, valueOf, C10043f2.f23426a);
        f23677r0 = m31489a("measurement.quality.checksum", valueOf, valueOf, null);
        f23679s0 = m31489a("measurement.module.collection.conditionally_omit_admob_app_id", valueOf29, valueOf29, C10065h2.f23509a);
        f23681t0 = m31489a("measurement.sdk.dynamite.use_dynamite2", valueOf, valueOf, C10054g2.f23478a);
        f23683u0 = m31489a("measurement.sdk.dynamite.allow_remote_dynamite", valueOf, valueOf, C10087j2.f23565a);
        f23685v0 = m31489a("measurement.sdk.collection.validate_param_names_alphabetical", valueOf, valueOf, C10076i2.f23530a);
        f23687w0 = m31489a("measurement.collection.event_safelist", valueOf, valueOf, C10109l2.f23696a);
        f23689x0 = m31489a("measurement.service.audience.scoped_filters_v27", valueOf, valueOf, C10098k2.f23590a);
        f23691y0 = m31489a("measurement.service.audience.session_scoped_event_aggregates", valueOf, valueOf, C10132n2.f23769a);
        f23693z0 = m31489a("measurement.service.audience.session_scoped_user_engagement", valueOf, valueOf, C10120m2.f23715a);
        f23611A0 = m31489a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", valueOf, valueOf, C10154p2.f23841a);
        f23613B0 = m31489a("measurement.sdk.collection.retrieve_deeplink_from_bow", valueOf, valueOf, C10143o2.f23791a);
        f23615C0 = m31489a("measurement.app_launch.event_ordering_fix", valueOf, valueOf, C10165q2.f23864a);
        f23617D0 = m31489a("measurement.sdk.collection.last_deep_link_referrer", valueOf, valueOf, C10195t2.f23929a);
        m31489a("measurement.sdk.collection.last_deep_link_referrer_campaign", valueOf, valueOf, C10185s2.f23900a);
        f23619E0 = m31489a("measurement.sdk.collection.last_gclid_from_referrer", valueOf, valueOf, C10215v2.f23982a);
        f23621F0 = m31489a("measurement.upload.file_lock_state_check", valueOf, valueOf, C10205u2.f23969a);
    }

    /* renamed from: C0 */
    static final /* synthetic */ String m31459C0() {
        return m31494a() ? C11348v8.m36573r() : C11348v8.m36558c();
    }

    /* renamed from: a */
    public static Map<String, String> m31490a(Context context) {
        C11108f1 a = C11108f1.m35126a(context.getContentResolver(), C11298s1.m36065a("com.google.android.gms.measurement"));
        return a == null ? Collections.emptyMap() : a.mo28506a();
    }

    /* renamed from: z0 */
    static final /* synthetic */ Long m31545z0() {
        long j;
        if (m31494a()) {
            j = C11348v8.m36571p();
        } else {
            j = C11348v8.m36557b();
        }
        return Long.valueOf(j);
    }

    /* renamed from: a */
    static void m31492a(C10145o4 o4Var) {
        f23646c = o4Var;
    }

    /* renamed from: a */
    static void m31493a(Exception exc) {
        if (f23646c != null) {
            Context b = f23646c.mo25895b();
            if (f23648d == null) {
                f23648d = Boolean.valueOf(C9826e.m30607a().mo24977a(b, (int) C9832i.f23040a) == 0);
            }
            if (f23648d.booleanValue()) {
                f23646c.mo25898e().mo25874t().mo25909a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    /* renamed from: a */
    private static <V> C10245y2<V> m31489a(String str, V v, V v2, C10255z2<V> z2Var) {
        C10245y2 y2Var = new C10245y2(str, v, v2, z2Var);
        f23644b.add(y2Var);
        return y2Var;
    }

    /* renamed from: a */
    static void m31491a(C10072h9 h9Var) {
        f23642a = h9Var;
    }

    /* renamed from: a */
    private static boolean m31494a() {
        if (f23642a != null) {
        }
        return false;
    }
}
