package com.bamtechmedia.dominguez.detail.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.content.C3693o;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonState", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;", "getButtonState", "()Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;", "setButtonState", "(Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;)V", "setChildViewProperties", "", "setState", "State", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.a */
/* compiled from: BookmarkButton.kt */
public abstract class C5897a extends ConstraintLayout {

    /* renamed from: r0 */
    public C5898a f13687r0;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State;", "", "()V", "Play", "PlayPromo", "Restart", "Resume", "Unavailable", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State$Play;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State$Resume;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State$PlayPromo;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State$Restart;", "Lcom/bamtechmedia/dominguez/detail/common/BookmarkButton$State$Unavailable;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a */
    /* compiled from: BookmarkButton.kt */
    public static abstract class C5898a {

        /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a$a */
        /* compiled from: BookmarkButton.kt */
        public static final class C5899a extends C5898a {

            /* renamed from: a */
            public static final C5899a f13688a = new C5899a();

            private C5899a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a$b */
        /* compiled from: BookmarkButton.kt */
        public static final class C5900b extends C5898a {

            /* renamed from: a */
            private final C3693o f13689a;

            /* renamed from: b */
            private final int f13690b;

            public C5900b(C3693o oVar, int i) {
                super(null);
                this.f13689a = oVar;
                this.f13690b = i;
            }

            /* renamed from: a */
            public final int mo17799a() {
                return this.f13690b;
            }

            /* renamed from: b */
            public final C3693o mo17800b() {
                return this.f13689a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5900b) {
                        C5900b bVar = (C5900b) obj;
                        if (C12880j.m40224a((Object) this.f13689a, (Object) bVar.f13689a)) {
                            if (this.f13690b == bVar.f13690b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C3693o oVar = this.f13689a;
                return ((oVar != null ? oVar.hashCode() : 0) * 31) + this.f13690b;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PlayPromo(playable=");
                sb.append(this.f13689a);
                sb.append(", labelRes=");
                sb.append(this.f13690b);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a$c */
        /* compiled from: BookmarkButton.kt */
        public static final class C5901c extends C5898a {

            /* renamed from: a */
            public static final C5901c f13691a = new C5901c();

            private C5901c() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a$d */
        /* compiled from: BookmarkButton.kt */
        public static final class C5902d extends C5898a {

            /* renamed from: a */
            private final int f13692a;

            /* renamed from: b */
            private final String f13693b;

            public C5902d(int i, String str) {
                super(null);
                this.f13692a = i;
                this.f13693b = str;
            }

            /* renamed from: a */
            public final int mo17804a() {
                return this.f13692a;
            }

            /* renamed from: b */
            public final String mo17805b() {
                return this.f13693b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5902d) {
                        C5902d dVar = (C5902d) obj;
                        if (!(this.f13692a == dVar.f13692a) || !C12880j.m40224a((Object) this.f13693b, (Object) dVar.f13693b)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                int i = this.f13692a * 31;
                String str = this.f13693b;
                return i + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Resume(percentage=");
                sb.append(this.f13692a);
                sb.append(", remainingTime=");
                sb.append(this.f13693b);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.detail.common.a$a$e */
        /* compiled from: BookmarkButton.kt */
        public static final class C5903e extends C5898a {

            /* renamed from: a */
            public static final C5903e f13694a = new C5903e();

            private C5903e() {
                super(null);
            }
        }

        private C5898a() {
        }

        public /* synthetic */ C5898a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C5897a(Context context) {
        this(context, null, 0, 6, null);
    }

    public C5897a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ C5897a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    public abstract void mo2144c();

    public final C5898a getButtonState() {
        C5898a aVar = this.f13687r0;
        if (aVar != null) {
            return aVar;
        }
        C12880j.m40227c("buttonState");
        throw null;
    }

    public final void setButtonState(C5898a aVar) {
        this.f13687r0 = aVar;
    }

    public final void setState(C5898a aVar) {
        this.f13687r0 = aVar;
        setVisibility(C12880j.m40224a((Object) aVar, (Object) C5903e.f13694a) ^ true ? 0 : 8);
        setAlpha(C12880j.m40224a((Object) aVar, (Object) C5903e.f13694a) ^ true ? 1.0f : 0.0f);
        mo2144c();
    }

    public C5897a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
