package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.leanback.widget.picker.C0683c.C0684a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p096e.p146l.C4234l;

public class DatePicker extends C0677a {

    /* renamed from: B0 */
    private static final int[] f2888B0 = {5, 2, 1};

    /* renamed from: A0 */
    Calendar f2889A0;

    /* renamed from: o0 */
    private String f2890o0;

    /* renamed from: p0 */
    C0682b f2891p0;

    /* renamed from: q0 */
    C0682b f2892q0;

    /* renamed from: r0 */
    C0682b f2893r0;

    /* renamed from: s0 */
    int f2894s0;

    /* renamed from: t0 */
    int f2895t0;

    /* renamed from: u0 */
    int f2896u0;

    /* renamed from: v0 */
    final DateFormat f2897v0;

    /* renamed from: w0 */
    C0684a f2898w0;

    /* renamed from: x0 */
    Calendar f2899x0;

    /* renamed from: y0 */
    Calendar f2900y0;

    /* renamed from: z0 */
    Calendar f2901z0;

    /* renamed from: androidx.leanback.widget.picker.DatePicker$a */
    class C0676a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f2903c;

        C0676a(boolean z) {
            this.f2903c = z;
        }

        public void run() {
            DatePicker.this.mo3997a(this.f2903c);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m3591a(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f2897v0.parse(str));
            return true;
        } catch (ParseException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Date: ");
            sb.append(str);
            sb.append(" not in format: ");
            sb.append("MM/dd/yyyy");
            Log.w("DatePicker", sb.toString());
            return false;
        }
    }

    /* renamed from: b */
    private void m3592b() {
        this.f2898w0 = C0683c.m3624a(Locale.getDefault(), getContext().getResources());
        this.f2889A0 = C0683c.m3625a(this.f2889A0, this.f2898w0.f2935a);
        this.f2899x0 = C0683c.m3625a(this.f2899x0, this.f2898w0.f2935a);
        this.f2900y0 = C0683c.m3625a(this.f2900y0, this.f2898w0.f2935a);
        this.f2901z0 = C0683c.m3625a(this.f2901z0, this.f2898w0.f2935a);
        C0682b bVar = this.f2891p0;
        if (bVar != null) {
            bVar.mo4041a((CharSequence[]) this.f2898w0.f2936b);
            mo4008a(this.f2894s0, this.f2891p0);
        }
    }

    public long getDate() {
        return this.f2901z0.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f2890o0;
    }

    public long getMaxDate() {
        return this.f2900y0.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f2899x0.getTimeInMillis();
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (!TextUtils.equals(this.f2890o0, str)) {
            this.f2890o0 = str;
            List a = mo3995a();
            if (a.size() == str.length() + 1) {
                setSeparators(a);
                this.f2892q0 = null;
                this.f2891p0 = null;
                this.f2893r0 = null;
                this.f2894s0 = -1;
                this.f2895t0 = -1;
                this.f2896u0 = -1;
                String upperCase = str.toUpperCase();
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < upperCase.length(); i++) {
                    char charAt = upperCase.charAt(i);
                    String str2 = "datePicker format error";
                    if (charAt != 'D') {
                        if (charAt != 'M') {
                            if (charAt != 'Y') {
                                throw new IllegalArgumentException(str2);
                            } else if (this.f2893r0 == null) {
                                C0682b bVar = new C0682b();
                                this.f2893r0 = bVar;
                                arrayList.add(bVar);
                                this.f2896u0 = i;
                                this.f2893r0.mo4040a("%d");
                            } else {
                                throw new IllegalArgumentException(str2);
                            }
                        } else if (this.f2891p0 == null) {
                            C0682b bVar2 = new C0682b();
                            this.f2891p0 = bVar2;
                            arrayList.add(bVar2);
                            this.f2891p0.mo4041a((CharSequence[]) this.f2898w0.f2936b);
                            this.f2894s0 = i;
                        } else {
                            throw new IllegalArgumentException(str2);
                        }
                    } else if (this.f2892q0 == null) {
                        C0682b bVar3 = new C0682b();
                        this.f2892q0 = bVar3;
                        arrayList.add(bVar3);
                        this.f2892q0.mo4040a("%02d");
                        this.f2895t0 = i;
                    } else {
                        throw new IllegalArgumentException(str2);
                    }
                }
                setColumns(arrayList);
                m3593b(false);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Separators size: ");
            sb.append(a.size());
            sb.append(" must equal");
            sb.append(" the size of datePickerFormat: ");
            sb.append(str.length());
            sb.append(" + 1");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setMaxDate(long j) {
        this.f2889A0.setTimeInMillis(j);
        if (this.f2889A0.get(1) != this.f2900y0.get(1) || this.f2889A0.get(6) == this.f2900y0.get(6)) {
            this.f2900y0.setTimeInMillis(j);
            if (this.f2901z0.after(this.f2900y0)) {
                this.f2901z0.setTimeInMillis(this.f2900y0.getTimeInMillis());
            }
            m3593b(false);
        }
    }

    public void setMinDate(long j) {
        this.f2889A0.setTimeInMillis(j);
        if (this.f2889A0.get(1) != this.f2899x0.get(1) || this.f2889A0.get(6) == this.f2899x0.get(6)) {
            this.f2899x0.setTimeInMillis(j);
            if (this.f2901z0.before(this.f2899x0)) {
                this.f2901z0.setTimeInMillis(this.f2899x0.getTimeInMillis());
            }
            m3593b(false);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2897v0 = new SimpleDateFormat("MM/dd/yyyy");
        m3592b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbDatePicker);
        String string = obtainStyledAttributes.getString(C4234l.lbDatePicker_android_minDate);
        String string2 = obtainStyledAttributes.getString(C4234l.lbDatePicker_android_maxDate);
        this.f2889A0.clear();
        if (TextUtils.isEmpty(string)) {
            this.f2889A0.set(1900, 0, 1);
        } else if (!m3591a(string, this.f2889A0)) {
            this.f2889A0.set(1900, 0, 1);
        }
        this.f2899x0.setTimeInMillis(this.f2889A0.getTimeInMillis());
        this.f2889A0.clear();
        if (TextUtils.isEmpty(string2)) {
            this.f2889A0.set(2100, 0, 1);
        } else if (!m3591a(string2, this.f2889A0)) {
            this.f2889A0.set(2100, 0, 1);
        }
        this.f2900y0.setTimeInMillis(this.f2889A0.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(C4234l.lbDatePicker_datePickerFormat);
        if (TextUtils.isEmpty(string3)) {
            string3 = new String(android.text.format.DateFormat.getDateFormatOrder(context));
        }
        setDatePickerFormat(string3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo3994a(String str) {
        String str2;
        String str3 = "MM/dd/yyyy";
        if (C0683c.f2934a) {
            str2 = android.text.format.DateFormat.getBestDateTimePattern(this.f2898w0.f2935a, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            str2 = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : str3;
        }
        return TextUtils.isEmpty(str2) ? str3 : str2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<CharSequence> mo3995a() {
        String a = mo3994a(this.f2890o0);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < a.length(); i++) {
            char charAt = a.charAt(i);
            if (charAt != ' ') {
                if (charAt != '\'') {
                    if (z) {
                        sb.append(charAt);
                    } else if (!m3589a(charAt, cArr)) {
                        sb.append(charAt);
                    } else if (charAt != c) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c = charAt;
                } else if (!z) {
                    sb.setLength(0);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m3594b(C0682b bVar, int i) {
        if (i == bVar.mo4046d()) {
            return false;
        }
        bVar.mo4047d(i);
        return true;
    }

    /* renamed from: b */
    private void m3593b(boolean z) {
        post(new C0676a(z));
    }

    /* renamed from: a */
    private static boolean m3589a(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3996a(int i, int i2) {
        this.f2889A0.setTimeInMillis(this.f2901z0.getTimeInMillis());
        int b = mo4006a(i).mo4042b();
        if (i == this.f2895t0) {
            this.f2889A0.add(5, i2 - b);
        } else if (i == this.f2894s0) {
            this.f2889A0.add(2, i2 - b);
        } else if (i == this.f2896u0) {
            this.f2889A0.add(1, i2 - b);
        } else {
            throw new IllegalArgumentException();
        }
        m3588a(this.f2889A0.get(1), this.f2889A0.get(2), this.f2889A0.get(5));
        m3593b(false);
    }

    /* renamed from: a */
    private void m3588a(int i, int i2, int i3) {
        this.f2901z0.set(i, i2, i3);
        if (this.f2901z0.before(this.f2899x0)) {
            this.f2901z0.setTimeInMillis(this.f2899x0.getTimeInMillis());
        } else if (this.f2901z0.after(this.f2900y0)) {
            this.f2901z0.setTimeInMillis(this.f2900y0.getTimeInMillis());
        }
    }

    /* renamed from: a */
    private static boolean m3590a(C0682b bVar, int i) {
        if (i == bVar.mo4044c()) {
            return false;
        }
        bVar.mo4045c(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3997a(boolean z) {
        boolean z2;
        boolean z3;
        int[] iArr = {this.f2895t0, this.f2894s0, this.f2896u0};
        boolean z4 = true;
        boolean z5 = true;
        for (int length = f2888B0.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i = f2888B0[length];
                C0682b a = mo4006a(iArr[length]);
                if (z4) {
                    z2 = m3594b(a, this.f2899x0.get(i));
                } else {
                    z2 = m3594b(a, this.f2901z0.getActualMinimum(i));
                }
                boolean z6 = z2 | false;
                if (z5) {
                    z3 = m3590a(a, this.f2900y0.get(i));
                } else {
                    z3 = m3590a(a, this.f2901z0.getActualMaximum(i));
                }
                z4 &= this.f2901z0.get(i) == this.f2899x0.get(i);
                z5 &= this.f2901z0.get(i) == this.f2900y0.get(i);
                if (z6 || z3) {
                    mo4008a(iArr[length], a);
                }
                mo4007a(iArr[length], this.f2901z0.get(i), z);
            }
        }
    }
}
