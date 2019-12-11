package p602m.p606b.p607a.p608f;

/* renamed from: m.b.a.f.c */
/* compiled from: ParseException */
public class C13455c extends Exception {

    /* renamed from: U */
    private Object f29957U;

    /* renamed from: V */
    private int f29958V;

    /* renamed from: c */
    private int f29959c;

    public C13455c(int i, int i2, Object obj) {
        this.f29958V = i;
        this.f29959c = i2;
        this.f29957U = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f29959c;
        String str = ".";
        if (i == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.f29957U);
            stringBuffer.append(") at position ");
            stringBuffer.append(this.f29958V);
            stringBuffer.append(str);
        } else if (i == 1) {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.f29957U);
            stringBuffer.append(" at position ");
            stringBuffer.append(this.f29958V);
            stringBuffer.append(str);
        } else if (i != 2) {
            stringBuffer.append("Unkown error at position ");
            stringBuffer.append(this.f29958V);
            stringBuffer.append(str);
        } else {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.f29958V);
            stringBuffer.append(": ");
            stringBuffer.append(this.f29957U);
        }
        return stringBuffer.toString();
    }
}
