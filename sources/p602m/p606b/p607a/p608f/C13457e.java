package p602m.p606b.p607a.p608f;

/* renamed from: m.b.a.f.e */
/* compiled from: Yytoken */
public class C13457e {

    /* renamed from: a */
    public int f29978a = 0;

    /* renamed from: b */
    public Object f29979b = null;

    public C13457e(int i, Object obj) {
        this.f29978a = i;
        this.f29979b = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f29978a) {
            case -1:
                stringBuffer.append("END OF FILE");
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.f29979b);
                stringBuffer.append(")");
                break;
            case 1:
                stringBuffer.append("LEFT BRACE({)");
                break;
            case 2:
                stringBuffer.append("RIGHT BRACE(})");
                break;
            case 3:
                stringBuffer.append("LEFT SQUARE([)");
                break;
            case 4:
                stringBuffer.append("RIGHT SQUARE(])");
                break;
            case 5:
                stringBuffer.append("COMMA(,)");
                break;
            case 6:
                stringBuffer.append("COLON(:)");
                break;
        }
        return stringBuffer.toString();
    }
}
