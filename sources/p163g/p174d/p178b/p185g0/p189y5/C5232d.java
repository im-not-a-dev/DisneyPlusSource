package p163g.p174d.p178b.p185g0.p189y5;

import android.content.res.Resources;
import android.graphics.Point;
import kotlin.Metadata;
import p163g.p174d.p178b.C5316q;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/player/delegates/trickplay/TrickPlayDimensions;", "", "resources", "Landroid/content/res/Resources;", "dimen4By3", "Landroid/graphics/Point;", "dimen16By9", "dimen21By9", "(Landroid/content/res/Resources;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V", "getDimensionsFromRatio", "ratio", "", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.y5.d */
/* compiled from: TrickPlayDimensions.kt */
public final class C5232d {

    /* renamed from: d */
    public static final C5233a f12582d = new C5233a(null);

    /* renamed from: a */
    private final Point f12583a;

    /* renamed from: b */
    private final Point f12584b;

    /* renamed from: c */
    private final Point f12585c;

    /* renamed from: g.d.b.g0.y5.d$a */
    /* compiled from: TrickPlayDimensions.kt */
    public static final class C5233a {
        private C5233a() {
        }

        /* renamed from: a */
        public final C5232d mo16745a(Resources resources) {
            C5232d dVar = new C5232d(resources, null, null, null, 14, null);
            return dVar;
        }

        public /* synthetic */ C5233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C5232d(Resources resources, Point point, Point point2, Point point3) {
        this.f12583a = point;
        this.f12584b = point2;
        this.f12585c = point3;
    }

    /* renamed from: a */
    public final Point mo16744a(float f) {
        float abs = Math.abs(f - 1.7777778f);
        Point point = this.f12584b;
        float abs2 = Math.abs(f - 1.3333334f);
        if (abs2 < abs) {
            point = this.f12583a;
            abs = abs2;
        }
        return Math.abs(f - 2.3333333f) < abs ? this.f12585c : point;
    }

    public /* synthetic */ C5232d(Resources resources, Point point, Point point2, Point point3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            point = new Point(resources.getDimensionPixelSize(C5316q.trickplay4By3Width), resources.getDimensionPixelSize(C5316q.trickplay4By3Height));
        }
        if ((i & 4) != 0) {
            point2 = new Point(resources.getDimensionPixelSize(C5316q.trickplay16By9Width), resources.getDimensionPixelSize(C5316q.trickplay16By9Height));
        }
        if ((i & 8) != 0) {
            point3 = new Point(resources.getDimensionPixelSize(C5316q.trickplay21By9Width), resources.getDimensionPixelSize(C5316q.trickplay21By9Height));
        }
        this(resources, point, point2, point3);
    }
}
