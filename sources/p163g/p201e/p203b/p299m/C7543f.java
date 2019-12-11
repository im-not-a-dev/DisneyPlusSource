package p163g.p201e.p203b.p299m;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001_B\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010G\u001a\u00020\u0019HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#Jª\u0002\u0010R\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010SJ\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0013\u0010U\u001a\u00020\u00192\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\u0003HÖ\u0001J\t\u0010Y\u001a\u00020\u0005HÖ\u0001J\u0019\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010!R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b*\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b,\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b/\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b1\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b2\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b3\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b7\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b8\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001f¨\u0006`"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "Landroid/os/Parcelable;", "requestId", "", "titleText", "", "titleResId", "messageText", "messageResId", "positiveButtonText", "positiveButtonResId", "positiveButtonAccessibilityText", "positiveButtonAccessibilityResId", "positiveButtonColorResId", "positiveButtonColorBackground", "neutralButtonText", "neutralButtonResId", "neutralButtonAccessibilityText", "neutralButtonAccessibilityResId", "negativeButtonText", "negativeButtonResId", "negativeButtonAccessibilityText", "negativeButtonAccessibilityResId", "theme", "isCancelable", "", "pageLoadTitle", "dialogAnalyticsPositiveAction", "dialogAnalyticsNegativeAction", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDialogAnalyticsNegativeAction", "()Ljava/lang/String;", "getDialogAnalyticsPositiveAction", "()Z", "getMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageText", "getNegativeButtonAccessibilityResId", "getNegativeButtonAccessibilityText", "getNegativeButtonResId", "getNegativeButtonText", "getNeutralButtonAccessibilityResId", "getNeutralButtonAccessibilityText", "getNeutralButtonResId", "getNeutralButtonText", "getPageLoadTitle", "getPositiveButtonAccessibilityResId", "getPositiveButtonAccessibilityText", "getPositiveButtonColorBackground", "getPositiveButtonColorResId", "getPositiveButtonResId", "getPositiveButtonText", "getRequestId", "()I", "getTheme", "getTitleResId", "getTitleText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "dialogsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.m.f */
/* compiled from: DialogArguments.kt */
public final class C7543f implements Parcelable {
    public static final Creator CREATOR = new C7545b();

    /* renamed from: U */
    private final String f16506U;

    /* renamed from: V */
    private final Integer f16507V;

    /* renamed from: W */
    private final String f16508W;

    /* renamed from: X */
    private final Integer f16509X;

    /* renamed from: Y */
    private final String f16510Y;

    /* renamed from: Z */
    private final Integer f16511Z;

    /* renamed from: a0 */
    private final String f16512a0;

    /* renamed from: b0 */
    private final Integer f16513b0;

    /* renamed from: c */
    private final int f16514c;

    /* renamed from: c0 */
    private final Integer f16515c0;

    /* renamed from: d0 */
    private final Integer f16516d0;

    /* renamed from: e0 */
    private final String f16517e0;

    /* renamed from: f0 */
    private final Integer f16518f0;

    /* renamed from: g0 */
    private final String f16519g0;

    /* renamed from: h0 */
    private final Integer f16520h0;

    /* renamed from: i0 */
    private final String f16521i0;

    /* renamed from: j0 */
    private final Integer f16522j0;

    /* renamed from: k0 */
    private final String f16523k0;

    /* renamed from: l0 */
    private final Integer f16524l0;

    /* renamed from: m0 */
    private final Integer f16525m0;

    /* renamed from: n0 */
    private final boolean f16526n0;

    /* renamed from: o0 */
    private final String f16527o0;

    /* renamed from: p0 */
    private final String f16528p0;

    /* renamed from: q0 */
    private final String f16529q0;

    /* renamed from: g.e.b.m.f$a */
    /* compiled from: DialogArguments.kt */
    public static final class C7544a {

        /* renamed from: a */
        private int f16530a;

        /* renamed from: b */
        private String f16531b;

        /* renamed from: c */
        private Integer f16532c;

        /* renamed from: d */
        private String f16533d;

        /* renamed from: e */
        private Integer f16534e;

        /* renamed from: f */
        private String f16535f;

        /* renamed from: g */
        private Integer f16536g;

        /* renamed from: h */
        private String f16537h;

        /* renamed from: i */
        private Integer f16538i;

        /* renamed from: j */
        private Integer f16539j;

        /* renamed from: k */
        private Integer f16540k;

        /* renamed from: l */
        private String f16541l;

        /* renamed from: m */
        private Integer f16542m;

        /* renamed from: n */
        private String f16543n;

        /* renamed from: o */
        private Integer f16544o;

        /* renamed from: p */
        private String f16545p;

        /* renamed from: q */
        private Integer f16546q;

        /* renamed from: r */
        private String f16547r;

        /* renamed from: s */
        private Integer f16548s;

        /* renamed from: t */
        private Integer f16549t;

        /* renamed from: u */
        private boolean f16550u = true;

        /* renamed from: v */
        private String f16551v;

        /* renamed from: w */
        private String f16552w;

        /* renamed from: x */
        private String f16553x;

        /* renamed from: a */
        public final void mo20466a(int i) {
            this.f16530a = i;
        }

        /* renamed from: b */
        public final void mo20470b(Integer num) {
            this.f16548s = num;
        }

        /* renamed from: c */
        public final void mo20472c(Integer num) {
            this.f16546q = num;
        }

        /* renamed from: d */
        public final void mo20475d(String str) {
            this.f16533d = str;
        }

        /* renamed from: e */
        public final void mo20476e(Integer num) {
            this.f16540k = num;
        }

        /* renamed from: f */
        public final void mo20478f(Integer num) {
            this.f16539j = num;
        }

        /* renamed from: g */
        public final void mo20481g(String str) {
            this.f16535f = str;
        }

        /* renamed from: h */
        public final void mo20483h(String str) {
            this.f16537h = str;
        }

        /* renamed from: i */
        public final void mo20485i(String str) {
            this.f16531b = str;
        }

        /* renamed from: a */
        public final void mo20467a(Integer num) {
            this.f16534e = num;
        }

        /* renamed from: b */
        public final void mo20471b(String str) {
            this.f16553x = str;
        }

        /* renamed from: c */
        public final void mo20473c(String str) {
            this.f16552w = str;
        }

        /* renamed from: d */
        public final void mo20474d(Integer num) {
            this.f16538i = num;
        }

        /* renamed from: e */
        public final void mo20477e(String str) {
            this.f16545p = str;
        }

        /* renamed from: f */
        public final void mo20479f(String str) {
            this.f16547r = str;
        }

        /* renamed from: g */
        public final void mo20480g(Integer num) {
            this.f16536g = num;
        }

        /* renamed from: h */
        public final void mo20482h(Integer num) {
            this.f16549t = num;
        }

        /* renamed from: i */
        public final void mo20484i(Integer num) {
            this.f16532c = num;
        }

        /* renamed from: a */
        public final void mo20469a(boolean z) {
            this.f16550u = z;
        }

        /* renamed from: a */
        public final void mo20468a(String str) {
            this.f16551v = str;
        }

        /* renamed from: a */
        public final C7543f mo20465a() {
            C7543f fVar = new C7543f(this.f16530a, this.f16531b, this.f16532c, this.f16533d, this.f16534e, this.f16535f, this.f16536g, this.f16537h, this.f16538i, this.f16539j, this.f16540k, this.f16541l, this.f16542m, this.f16543n, this.f16544o, this.f16545p, this.f16546q, this.f16547r, this.f16548s, this.f16549t, this.f16550u, this.f16551v, this.f16552w, this.f16553x);
            return fVar;
        }
    }

    /* renamed from: g.e.b.m.f$b */
    public static class C7545b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7543f fVar = new C7543f(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            return fVar;
        }

        public final Object[] newArray(int i) {
            return new C7543f[i];
        }
    }

    public C7543f(int i, String str, Integer num, String str2, Integer num2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, String str5, Integer num7, String str6, Integer num8, String str7, Integer num9, String str8, Integer num10, Integer num11, boolean z, String str9, String str10, String str11) {
        this.f16514c = i;
        this.f16506U = str;
        this.f16507V = num;
        this.f16508W = str2;
        this.f16509X = num2;
        this.f16510Y = str3;
        this.f16511Z = num3;
        this.f16512a0 = str4;
        this.f16513b0 = num4;
        this.f16515c0 = num5;
        this.f16516d0 = num6;
        this.f16517e0 = str5;
        this.f16518f0 = num7;
        this.f16519g0 = str6;
        this.f16520h0 = num8;
        this.f16521i0 = str7;
        this.f16522j0 = num9;
        this.f16523k0 = str8;
        this.f16524l0 = num10;
        this.f16525m0 = num11;
        this.f16526n0 = z;
        this.f16527o0 = str9;
        this.f16528p0 = str10;
        this.f16529q0 = str11;
    }

    /* renamed from: X */
    public final String mo20441X() {
        return this.f16529q0;
    }

    /* renamed from: Y */
    public final String mo20442Y() {
        return this.f16528p0;
    }

    /* renamed from: Z */
    public final Integer mo20443Z() {
        return this.f16509X;
    }

    /* renamed from: a0 */
    public final String mo20444a0() {
        return this.f16508W;
    }

    /* renamed from: b0 */
    public final Integer mo20445b0() {
        return this.f16524l0;
    }

    /* renamed from: c0 */
    public final String mo20446c0() {
        return this.f16523k0;
    }

    /* renamed from: d0 */
    public final Integer mo20447d0() {
        return this.f16522j0;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public final String mo20449e0() {
        return this.f16521i0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7543f) {
                C7543f fVar = (C7543f) obj;
                if ((this.f16514c == fVar.f16514c) && Intrinsics.areEqual((Object) this.f16506U, (Object) fVar.f16506U) && Intrinsics.areEqual((Object) this.f16507V, (Object) fVar.f16507V) && Intrinsics.areEqual((Object) this.f16508W, (Object) fVar.f16508W) && Intrinsics.areEqual((Object) this.f16509X, (Object) fVar.f16509X) && Intrinsics.areEqual((Object) this.f16510Y, (Object) fVar.f16510Y) && Intrinsics.areEqual((Object) this.f16511Z, (Object) fVar.f16511Z) && Intrinsics.areEqual((Object) this.f16512a0, (Object) fVar.f16512a0) && Intrinsics.areEqual((Object) this.f16513b0, (Object) fVar.f16513b0) && Intrinsics.areEqual((Object) this.f16515c0, (Object) fVar.f16515c0) && Intrinsics.areEqual((Object) this.f16516d0, (Object) fVar.f16516d0) && Intrinsics.areEqual((Object) this.f16517e0, (Object) fVar.f16517e0) && Intrinsics.areEqual((Object) this.f16518f0, (Object) fVar.f16518f0) && Intrinsics.areEqual((Object) this.f16519g0, (Object) fVar.f16519g0) && Intrinsics.areEqual((Object) this.f16520h0, (Object) fVar.f16520h0) && Intrinsics.areEqual((Object) this.f16521i0, (Object) fVar.f16521i0) && Intrinsics.areEqual((Object) this.f16522j0, (Object) fVar.f16522j0) && Intrinsics.areEqual((Object) this.f16523k0, (Object) fVar.f16523k0) && Intrinsics.areEqual((Object) this.f16524l0, (Object) fVar.f16524l0) && Intrinsics.areEqual((Object) this.f16525m0, (Object) fVar.f16525m0)) {
                    if (!(this.f16526n0 == fVar.f16526n0) || !Intrinsics.areEqual((Object) this.f16527o0, (Object) fVar.f16527o0) || !Intrinsics.areEqual((Object) this.f16528p0, (Object) fVar.f16528p0) || !Intrinsics.areEqual((Object) this.f16529q0, (Object) fVar.f16529q0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final Integer mo20451f0() {
        return this.f16518f0;
    }

    /* renamed from: g0 */
    public final String mo20452g0() {
        return this.f16517e0;
    }

    /* renamed from: h0 */
    public final String mo20453h0() {
        return this.f16527o0;
    }

    public int hashCode() {
        int i = this.f16514c * 31;
        String str = this.f16506U;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f16507V;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f16508W;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.f16509X;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str3 = this.f16510Y;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num3 = this.f16511Z;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str4 = this.f16512a0;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num4 = this.f16513b0;
        int hashCode8 = (hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f16515c0;
        int hashCode9 = (hashCode8 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.f16516d0;
        int hashCode10 = (hashCode9 + (num6 != null ? num6.hashCode() : 0)) * 31;
        String str5 = this.f16517e0;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num7 = this.f16518f0;
        int hashCode12 = (hashCode11 + (num7 != null ? num7.hashCode() : 0)) * 31;
        String str6 = this.f16519g0;
        int hashCode13 = (hashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num8 = this.f16520h0;
        int hashCode14 = (hashCode13 + (num8 != null ? num8.hashCode() : 0)) * 31;
        String str7 = this.f16521i0;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num9 = this.f16522j0;
        int hashCode16 = (hashCode15 + (num9 != null ? num9.hashCode() : 0)) * 31;
        String str8 = this.f16523k0;
        int hashCode17 = (hashCode16 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num10 = this.f16524l0;
        int hashCode18 = (hashCode17 + (num10 != null ? num10.hashCode() : 0)) * 31;
        Integer num11 = this.f16525m0;
        int hashCode19 = (hashCode18 + (num11 != null ? num11.hashCode() : 0)) * 31;
        boolean z = this.f16526n0;
        if (z) {
            z = true;
        }
        int i3 = (hashCode19 + (z ? 1 : 0)) * 31;
        String str9 = this.f16527o0;
        int hashCode20 = (i3 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f16528p0;
        int hashCode21 = (hashCode20 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f16529q0;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode21 + i2;
    }

    /* renamed from: i0 */
    public final Integer mo20455i0() {
        return this.f16513b0;
    }

    /* renamed from: j0 */
    public final Integer mo20456j0() {
        return this.f16516d0;
    }

    /* renamed from: k0 */
    public final Integer mo20457k0() {
        return this.f16511Z;
    }

    /* renamed from: l0 */
    public final String mo20458l0() {
        return this.f16510Y;
    }

    /* renamed from: m0 */
    public final int mo20459m0() {
        return this.f16514c;
    }

    /* renamed from: n0 */
    public final Integer mo20460n0() {
        return this.f16525m0;
    }

    /* renamed from: o0 */
    public final Integer mo20461o0() {
        return this.f16507V;
    }

    /* renamed from: p0 */
    public final String mo20462p0() {
        return this.f16506U;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DialogArguments(requestId=");
        sb.append(this.f16514c);
        sb.append(", titleText=");
        sb.append(this.f16506U);
        sb.append(", titleResId=");
        sb.append(this.f16507V);
        sb.append(", messageText=");
        sb.append(this.f16508W);
        sb.append(", messageResId=");
        sb.append(this.f16509X);
        sb.append(", positiveButtonText=");
        sb.append(this.f16510Y);
        sb.append(", positiveButtonResId=");
        sb.append(this.f16511Z);
        sb.append(", positiveButtonAccessibilityText=");
        sb.append(this.f16512a0);
        sb.append(", positiveButtonAccessibilityResId=");
        sb.append(this.f16513b0);
        sb.append(", positiveButtonColorResId=");
        sb.append(this.f16515c0);
        sb.append(", positiveButtonColorBackground=");
        sb.append(this.f16516d0);
        sb.append(", neutralButtonText=");
        sb.append(this.f16517e0);
        sb.append(", neutralButtonResId=");
        sb.append(this.f16518f0);
        sb.append(", neutralButtonAccessibilityText=");
        sb.append(this.f16519g0);
        sb.append(", neutralButtonAccessibilityResId=");
        sb.append(this.f16520h0);
        sb.append(", negativeButtonText=");
        sb.append(this.f16521i0);
        sb.append(", negativeButtonResId=");
        sb.append(this.f16522j0);
        sb.append(", negativeButtonAccessibilityText=");
        sb.append(this.f16523k0);
        sb.append(", negativeButtonAccessibilityResId=");
        sb.append(this.f16524l0);
        sb.append(", theme=");
        sb.append(this.f16525m0);
        sb.append(", isCancelable=");
        sb.append(this.f16526n0);
        sb.append(", pageLoadTitle=");
        sb.append(this.f16527o0);
        sb.append(", dialogAnalyticsPositiveAction=");
        sb.append(this.f16528p0);
        sb.append(", dialogAnalyticsNegativeAction=");
        sb.append(this.f16529q0);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16514c);
        parcel.writeString(this.f16506U);
        Integer num = this.f16507V;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16508W);
        Integer num2 = this.f16509X;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16510Y);
        Integer num3 = this.f16511Z;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16512a0);
        Integer num4 = this.f16513b0;
        if (num4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num5 = this.f16515c0;
        if (num5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num6 = this.f16516d0;
        if (num6 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16517e0);
        Integer num7 = this.f16518f0;
        if (num7 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16519g0);
        Integer num8 = this.f16520h0;
        if (num8 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16521i0);
        Integer num9 = this.f16522j0;
        if (num9 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f16523k0);
        Integer num10 = this.f16524l0;
        if (num10 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num11 = this.f16525m0;
        if (num11 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f16526n0 ? 1 : 0);
        parcel.writeString(this.f16527o0);
        parcel.writeString(this.f16528p0);
        parcel.writeString(this.f16529q0);
    }
}
