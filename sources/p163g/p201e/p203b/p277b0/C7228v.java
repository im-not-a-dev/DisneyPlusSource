package p163g.p201e.p203b.p277b0;

import android.content.SharedPreferences;
import com.bamtech.sdk4.location.GeoLocation;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.sdk4.location.GpsLocation;
import com.bamtech.sdk4.location.UnavailableLocation;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/OverrideGeoProvider;", "Lcom/bamtech/sdk4/location/GeoProvider;", "preferences", "Landroid/content/SharedPreferences;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/SharedPreferences;Lio/reactivex/Scheduler;)V", "value", "Lcom/bamtech/sdk4/location/GeoLocation;", "override", "getOverride", "()Lcom/bamtech/sdk4/location/GeoLocation;", "setOverride", "(Lcom/bamtech/sdk4/location/GeoLocation;)V", "getLocation", "Lio/reactivex/Single;", "timeout", "", "load", "store", "", "gpsLocation", "validate", "location", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.v */
/* compiled from: OverrideGeoProvider.kt */
public final class C7228v implements GeoProvider {

    /* renamed from: a */
    private final SharedPreferences f15954a;

    /* renamed from: b */
    private final C11969r f15955b;

    /* renamed from: g.e.b.b0.v$a */
    /* compiled from: OverrideGeoProvider.kt */
    public static final class C7229a {
        private C7229a() {
        }

        public /* synthetic */ C7229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.b0.v$b */
    /* compiled from: OverrideGeoProvider.kt */
    static final class C7230b<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C7228v f15956c;

        C7230b(C7228v vVar) {
            this.f15956c = vVar;
        }

        public final GeoLocation call() {
            return this.f15956c.mo20058a();
        }
    }

    static {
        new C7229a(null);
    }

    public C7228v(SharedPreferences sharedPreferences, C11969r rVar) {
        this.f15954a = sharedPreferences;
        this.f15955b = rVar;
    }

    /* renamed from: b */
    private final GeoLocation m21841b() {
        SharedPreferences sharedPreferences = this.f15954a;
        String str = "geoOverrideLatitude";
        if (sharedPreferences.contains(str) && sharedPreferences.contains("geoOverrideLongitude")) {
            return new GpsLocation((double) sharedPreferences.getFloat(str, 0.0f), (double) sharedPreferences.getFloat(str, 0.0f));
        }
        if (!sharedPreferences.contains("isUserSetting")) {
            return new GpsLocation(52.368d, 4.9036d);
        }
        return new UnavailableLocation();
    }

    /* renamed from: a */
    public final GeoLocation mo20058a() {
        return m21841b();
    }

    public Single<? extends GeoLocation> getLocation(long j) {
        Single<? extends GeoLocation> a = Single.m38401c((Callable<? extends T>) new C7230b<Object>(this)).mo30220b(this.f15955b).mo30203a(j, TimeUnit.SECONDS, this.f15955b);
        C12880j.m40222a((Object) a, "Single\n        .fromCall…nit.SECONDS, ioScheduler)");
        return a;
    }

    public /* synthetic */ C7228v(SharedPreferences sharedPreferences, C11969r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            rVar = C11934b.m38500b();
            C12880j.m40222a((Object) rVar, "Schedulers.io()");
        }
        this(sharedPreferences, rVar);
    }
}
