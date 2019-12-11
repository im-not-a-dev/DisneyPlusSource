package p096e.p121h.p132q;

import android.os.Build.VERSION;
import android.text.PrecomputedText.Params;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p096e.p121h.p134r.C4111c;

/* renamed from: e.h.q.d */
/* compiled from: PrecomputedTextCompat */
public class C4092d implements Spannable {

    /* renamed from: U */
    private final C4093a f10339U;

    /* renamed from: c */
    private final Spannable f10340c;

    /* renamed from: e.h.q.d$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C4093a {

        /* renamed from: a */
        private final TextPaint f10341a;

        /* renamed from: b */
        private final TextDirectionHeuristic f10342b;

        /* renamed from: c */
        private final int f10343c;

        /* renamed from: d */
        private final int f10344d;

        /* renamed from: e */
        final Params f10345e = null;

        /* renamed from: e.h.q.d$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C4094a {

            /* renamed from: a */
            private final TextPaint f10346a;

            /* renamed from: b */
            private TextDirectionHeuristic f10347b;

            /* renamed from: c */
            private int f10348c;

            /* renamed from: d */
            private int f10349d;

            public C4094a(TextPaint textPaint) {
                this.f10346a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f10348c = 1;
                    this.f10349d = 1;
                } else {
                    this.f10349d = 0;
                    this.f10348c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f10347b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f10347b = null;
                }
            }

            /* renamed from: a */
            public C4094a mo14650a(int i) {
                this.f10348c = i;
                return this;
            }

            /* renamed from: b */
            public C4094a mo14653b(int i) {
                this.f10349d = i;
                return this;
            }

            /* renamed from: a */
            public C4094a mo14651a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f10347b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C4093a mo14652a() {
                return new C4093a(this.f10346a, this.f10347b, this.f10348c, this.f10349d);
            }
        }

        C4093a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f10341a = textPaint;
            this.f10342b = textDirectionHeuristic;
            this.f10343c = i;
            this.f10344d = i2;
        }

        /* renamed from: a */
        public int mo14642a() {
            return this.f10343c;
        }

        /* renamed from: b */
        public int mo14644b() {
            return this.f10344d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo14645c() {
            return this.f10342b;
        }

        /* renamed from: d */
        public TextPaint mo14646d() {
            return this.f10341a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4093a)) {
                return false;
            }
            C4093a aVar = (C4093a) obj;
            if (!mo14643a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.f10342b == aVar.mo14645c();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return C4111c.m14085a(Float.valueOf(this.f10341a.getTextSize()), Float.valueOf(this.f10341a.getTextScaleX()), Float.valueOf(this.f10341a.getTextSkewX()), Float.valueOf(this.f10341a.getLetterSpacing()), Integer.valueOf(this.f10341a.getFlags()), this.f10341a.getTextLocales(), this.f10341a.getTypeface(), Boolean.valueOf(this.f10341a.isElegantTextHeight()), this.f10342b, Integer.valueOf(this.f10343c), Integer.valueOf(this.f10344d));
            } else if (i >= 21) {
                return C4111c.m14085a(Float.valueOf(this.f10341a.getTextSize()), Float.valueOf(this.f10341a.getTextScaleX()), Float.valueOf(this.f10341a.getTextSkewX()), Float.valueOf(this.f10341a.getLetterSpacing()), Integer.valueOf(this.f10341a.getFlags()), this.f10341a.getTextLocale(), this.f10341a.getTypeface(), Boolean.valueOf(this.f10341a.isElegantTextHeight()), this.f10342b, Integer.valueOf(this.f10343c), Integer.valueOf(this.f10344d));
            } else if (i >= 18) {
                return C4111c.m14085a(Float.valueOf(this.f10341a.getTextSize()), Float.valueOf(this.f10341a.getTextScaleX()), Float.valueOf(this.f10341a.getTextSkewX()), Integer.valueOf(this.f10341a.getFlags()), this.f10341a.getTextLocale(), this.f10341a.getTypeface(), this.f10342b, Integer.valueOf(this.f10343c), Integer.valueOf(this.f10344d));
            } else if (i >= 17) {
                return C4111c.m14085a(Float.valueOf(this.f10341a.getTextSize()), Float.valueOf(this.f10341a.getTextScaleX()), Float.valueOf(this.f10341a.getTextSkewX()), Integer.valueOf(this.f10341a.getFlags()), this.f10341a.getTextLocale(), this.f10341a.getTypeface(), this.f10342b, Integer.valueOf(this.f10343c), Integer.valueOf(this.f10344d));
            } else {
                return C4111c.m14085a(Float.valueOf(this.f10341a.getTextSize()), Float.valueOf(this.f10341a.getTextScaleX()), Float.valueOf(this.f10341a.getTextSkewX()), Integer.valueOf(this.f10341a.getFlags()), this.f10341a.getTypeface(), this.f10342b, Integer.valueOf(this.f10343c), Integer.valueOf(this.f10344d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.f10341a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f10341a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f10341a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.f10341a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.f10341a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            int i = VERSION.SDK_INT;
            String str = ", textLocale=";
            if (i >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.f10341a.getTextLocales());
                sb.append(sb7.toString());
            } else if (i >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.f10341a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.f10341a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.f10341a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.f10342b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.f10343c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.f10344d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a */
        public boolean mo14643a(C4093a aVar) {
            Params params = this.f10345e;
            if (params != null) {
                return params.equals(aVar.f10345e);
            }
            if ((VERSION.SDK_INT >= 23 && (this.f10343c != aVar.mo14642a() || this.f10344d != aVar.mo14644b())) || this.f10341a.getTextSize() != aVar.mo14646d().getTextSize() || this.f10341a.getTextScaleX() != aVar.mo14646d().getTextScaleX() || this.f10341a.getTextSkewX() != aVar.mo14646d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f10341a.getLetterSpacing() != aVar.mo14646d().getLetterSpacing() || !TextUtils.equals(this.f10341a.getFontFeatureSettings(), aVar.mo14646d().getFontFeatureSettings()))) || this.f10341a.getFlags() != aVar.mo14646d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f10341a.getTextLocales().equals(aVar.mo14646d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f10341a.getTextLocale().equals(aVar.mo14646d().getTextLocale())) {
                return false;
            }
            if (this.f10341a.getTypeface() == null) {
                if (aVar.mo14646d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f10341a.getTypeface().equals(aVar.mo14646d().getTypeface())) {
                return false;
            }
            return true;
        }

        public C4093a(Params params) {
            this.f10341a = params.getTextPaint();
            this.f10342b = params.getTextDirection();
            this.f10343c = params.getBreakStrategy();
            this.f10344d = params.getHyphenationFrequency();
        }
    }

    /* renamed from: a */
    public C4093a mo14630a() {
        return this.f10339U;
    }

    public char charAt(int i) {
        return this.f10340c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f10340c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f10340c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f10340c.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f10340c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f10340c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10340c.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f10340c.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f10340c.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f10340c.subSequence(i, i2);
    }

    public String toString() {
        return this.f10340c.toString();
    }
}
