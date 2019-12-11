package androidx.leanback.widget.picker;

/* renamed from: androidx.leanback.widget.picker.b */
/* compiled from: PickerColumn */
public class C0682b {

    /* renamed from: a */
    private int f2929a;

    /* renamed from: b */
    private int f2930b;

    /* renamed from: c */
    private int f2931c;

    /* renamed from: d */
    private CharSequence[] f2932d;

    /* renamed from: e */
    private String f2933e;

    /* renamed from: a */
    public void mo4040a(String str) {
        this.f2933e = str;
    }

    /* renamed from: b */
    public int mo4042b() {
        return this.f2929a;
    }

    /* renamed from: c */
    public int mo4044c() {
        return this.f2931c;
    }

    /* renamed from: d */
    public int mo4046d() {
        return this.f2930b;
    }

    /* renamed from: a */
    public void mo4041a(CharSequence[] charSequenceArr) {
        this.f2932d = charSequenceArr;
    }

    /* renamed from: b */
    public void mo4043b(int i) {
        this.f2929a = i;
    }

    /* renamed from: c */
    public void mo4045c(int i) {
        this.f2931c = i;
    }

    /* renamed from: d */
    public void mo4047d(int i) {
        this.f2930b = i;
    }

    /* renamed from: a */
    public CharSequence mo4039a(int i) {
        CharSequence[] charSequenceArr = this.f2932d;
        if (charSequenceArr != null) {
            return charSequenceArr[i];
        }
        return String.format(this.f2933e, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: a */
    public int mo4038a() {
        return (this.f2931c - this.f2930b) + 1;
    }
}
