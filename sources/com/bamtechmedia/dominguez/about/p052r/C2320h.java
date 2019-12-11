package com.bamtechmedia.dominguez.about.p052r;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.widget.DatePicker;
import com.bamtechmedia.dominguez.about.C2258d;
import com.bamtechmedia.dominguez.about.C2279k;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/TimeTravelHelper;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "persistedDebugOverrides", "Lcom/bamtechmedia/dominguez/about/PersistedDebugOverrides;", "invalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "fragment", "Lcom/bamtechmedia/dominguez/about/AboutFragment;", "(Lcom/bamtechmedia/dominguez/about/PersistedDebugOverrides;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/about/AboutFragment;)V", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "", "month", "day", "onTimeTravelClicked", "valueAsString", "", "Companion", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.h */
/* compiled from: TimeTravelHelper.kt */
public final class C2320h implements OnDateSetListener {

    /* renamed from: a */
    private final C2279k f6475a;

    /* renamed from: b */
    private final C3419l f6476b;

    /* renamed from: c */
    private final C2258d f6477c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.h$a */
    /* compiled from: TimeTravelHelper.kt */
    public static final class C2321a {
        private C2321a() {
        }

        public /* synthetic */ C2321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.r.h$b */
    /* compiled from: TimeTravelHelper.kt */
    static final class C2322b extends C12881k implements Function0<Boolean> {

        /* renamed from: U */
        final /* synthetic */ int f6478U;

        /* renamed from: V */
        final /* synthetic */ int f6479V;

        /* renamed from: c */
        final /* synthetic */ int f6480c;

        C2322b(int i, int i2, int i3) {
            this.f6480c = i;
            this.f6478U = i2;
            this.f6479V = i3;
            super(0);
        }

        public final boolean invoke() {
            DateTime now = DateTime.now();
            int i = this.f6480c;
            C12880j.m40222a((Object) now, "date");
            return i == now.getYear() && this.f6479V + 1 == now.getMonthOfYear() && this.f6478U == now.getDayOfMonth();
        }
    }

    static {
        new C2321a(null);
    }

    public C2320h(C2279k kVar, C3419l lVar, C2258d dVar) {
        this.f6475a = kVar;
        this.f6476b = lVar;
        this.f6477c = dVar;
    }

    /* renamed from: a */
    public final void mo11347a() {
        DateTime b = this.f6475a.mo11328b();
        if (b == null) {
            b = DateTime.now();
        }
        Context requireContext = this.f6477c.requireContext();
        C12880j.m40222a((Object) b, "date");
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext, this, b.getYear(), b.getMonthOfYear() - 1, b.getDayOfMonth());
        datePickerDialog.show();
    }

    /* renamed from: b */
    public final String mo11348b() {
        DateTime b = this.f6475a.mo11328b();
        if (b != null) {
            String abstractDateTime = b.toString();
            if (abstractDateTime != null) {
                return abstractDateTime;
            }
        }
        return "Present Day";
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (new C2322b(i, i3, i2).invoke()) {
            this.f6475a.mo11327a((DateTime) null);
        } else {
            DateTime dateTime = new DateTime(i, i2 + 1, i3, 0, 0);
            this.f6475a.mo11327a(dateTime);
        }
        C3724a.f9310a.mo13579a(Long.valueOf(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(20)));
        this.f6476b.mo12598d();
        this.f6477c.mo11301p();
    }
}
