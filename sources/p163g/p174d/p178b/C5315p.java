package p163g.p174d.p178b;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p163g.p174d.p178b.p179a0.C4817a;
import p163g.p174d.p178b.p179a0.C4829e;
import p163g.p174d.p178b.p182d0.C4948h;
import p163g.p174d.p178b.p183e0.C4952a;
import p163g.p174d.p178b.p185g0.C4965a4;
import p163g.p174d.p178b.p185g0.C4966a5;
import p163g.p174d.p178b.p185g0.C4974b4;
import p163g.p174d.p178b.p185g0.C4975b5;
import p163g.p174d.p178b.p185g0.C4981c4;
import p163g.p174d.p178b.p185g0.C4982c5;
import p163g.p174d.p178b.p185g0.C4988d4;
import p163g.p174d.p178b.p185g0.C4989d5;
import p163g.p174d.p178b.p185g0.C4995e4;
import p163g.p174d.p178b.p185g0.C4996e5;
import p163g.p174d.p178b.p185g0.C5003f4;
import p163g.p174d.p178b.p185g0.C5004f5;
import p163g.p174d.p178b.p185g0.C5013g4;
import p163g.p174d.p178b.p185g0.C5016g5;
import p163g.p174d.p178b.p185g0.C5023h4;
import p163g.p174d.p178b.p185g0.C5032i5;
import p163g.p174d.p178b.p185g0.C5039j4;
import p163g.p174d.p178b.p185g0.C5046k4;
import p163g.p174d.p178b.p185g0.C5052k5;
import p163g.p174d.p178b.p185g0.C5058l4;
import p163g.p174d.p178b.p185g0.C5059l5;
import p163g.p174d.p178b.p185g0.C5065m4;
import p163g.p174d.p178b.p185g0.C5066m5;
import p163g.p174d.p178b.p185g0.C5073n4;
import p163g.p174d.p178b.p185g0.C5074n5;
import p163g.p174d.p178b.p185g0.C5080o4;
import p163g.p174d.p178b.p185g0.C5081o5;
import p163g.p174d.p178b.p185g0.C5088p4;
import p163g.p174d.p178b.p185g0.C5089p5;
import p163g.p174d.p178b.p185g0.C5103q4;
import p163g.p174d.p178b.p185g0.C5106q5;
import p163g.p174d.p178b.p185g0.C5128s3;
import p163g.p174d.p178b.p185g0.C5129s4;
import p163g.p174d.p178b.p185g0.C5130s5;
import p163g.p174d.p178b.p185g0.C5136t3;
import p163g.p174d.p178b.p185g0.C5140t4;
import p163g.p174d.p178b.p185g0.C5146t5;
import p163g.p174d.p178b.p185g0.C5160u3;
import p163g.p174d.p178b.p185g0.C5171v4;
import p163g.p174d.p178b.p185g0.C5183w3;
import p163g.p174d.p178b.p185g0.C5195x3;
import p163g.p174d.p178b.p185g0.C5201x4;
import p163g.p174d.p178b.p185g0.C5223y4;
import p163g.p174d.p178b.p185g0.C5271z3;
import p163g.p174d.p178b.p185g0.p186v5.C5175d;
import p163g.p174d.p178b.p185g0.p186v5.C5177f;
import p163g.p174d.p178b.p185g0.p187w5.C5186a;
import p163g.p174d.p178b.p185g0.p188x5.C5216h;
import p163g.p174d.p178b.p185g0.p189y5.C5232d;
import p163g.p174d.p178b.p185g0.p189y5.C5234e;
import p163g.p174d.p178b.p185g0.p189y5.C5252g;
import p163g.p174d.p178b.p185g0.p189y5.C5253h;
import p686n.p687a.Timber;

/* renamed from: g.d.b.p */
/* compiled from: PlayerViewController */
public class C5315p {

    /* renamed from: a */
    final List<C5271z3> f12798a = new ArrayList();

    /* renamed from: b */
    private final C5312n f12799b;

    /* renamed from: c */
    private final C5300m f12800c;

    /* renamed from: d */
    private final C5313o f12801d;

    /* renamed from: e */
    private final C4952a f12802e;

    /* renamed from: f */
    private final C5326w f12803f;

    public C5315p(Context context, C5313o oVar, C4952a aVar, C5326w wVar, C5300m mVar, C5312n nVar) {
        this.f12801d = oVar;
        oVar.mo16818m();
        this.f12800c = mVar;
        this.f12803f = wVar;
        this.f12802e = aVar;
        this.f12799b = nVar;
        if (context instanceof Activity) {
            m18018a((Activity) context);
        } else if (!(context instanceof Service)) {
            Timber.m44523a(new Throwable("Context provided to PlayerViewController was not an Activity.Activity context is required for certain controls"));
        }
        m18019a(context);
    }

    /* renamed from: a */
    private void m18018a(Activity activity) {
        Activity activity2 = activity;
        C5271z3[] z3VarArr = new C5271z3[39];
        C5003f4 f4Var = new C5003f4(this.f12801d.mo16830y(), this.f12802e.mo16360f(), new C5186a(activity2, this.f12800c), activity, this.f12800c);
        boolean z = false;
        z3VarArr[0] = f4Var;
        z3VarArr[1] = new C5171v4(this.f12801d.mo16809d(), this.f12802e.mo16367l(), this.f12803f, this.f12800c);
        z3VarArr[2] = new C5088p4(this.f12801d.mo16797C(), this.f12803f, this.f12800c);
        z3VarArr[3] = new C4996e5(this.f12801d.mo16801G(), this.f12803f, this.f12800c);
        z3VarArr[4] = new C5195x3(this.f12801d.mo16819n(), this.f12803f, this.f12800c, this.f12799b);
        z3VarArr[5] = new C5046k4(this.f12803f, this.f12800c);
        z3VarArr[6] = new C5058l4(this.f12801d.mo16800F(), this.f12802e.mo16361g(), this.f12800c);
        z3VarArr[7] = new C5039j4(this.f12801d.mo16813h(), this.f12802e.mo16361g(), this.f12800c);
        C5216h hVar = new C5216h(this.f12801d.mo16821p(), this.f12802e.mo16357d(), this.f12802e.mo16361g(), this.f12802e.mo16379w(), this.f12800c);
        z3VarArr[8] = hVar;
        z3VarArr[9] = new C4995e4(this.f12801d.mo16816k(), this.f12800c);
        z3VarArr[10] = new C4982c5(this.f12801d.mo16822q(), this.f12800c);
        z3VarArr[11] = new C5183w3(this.f12801d.mo16810e(), activity2, this.f12800c);
        C5136t3 t3Var = new C5136t3(this.f12801d.mo16808c(), this.f12802e.mo16358e(), new C5186a(activity2, this.f12800c), activity, this.f12800c);
        z3VarArr[12] = t3Var;
        z3VarArr[13] = new C5066m5(this.f12801d.mo16823r(), this.f12803f, this.f12800c);
        z3VarArr[14] = new C5059l5(this.f12801d.mo16820o(), this.f12803f, this.f12800c);
        z3VarArr[15] = new C5130s5(activity2, this.f12801d.mo16803I(), this.f12800c);
        z3VarArr[16] = new C5080o4(this.f12801d.mo16795A(), this.f12802e.mo16377u(), this.f12803f, this.f12800c);
        z3VarArr[17] = new C4989d5(this.f12801d.mo16804J(), this.f12802e.mo16373r(), this.f12800c);
        z3VarArr[18] = new C5089p5(this.f12801d.mo16807b(), this.f12802e.mo16373r(), this.f12800c);
        z3VarArr[19] = new C4975b5(this.f12801d.mo16796B(), this.f12802e.mo16373r(), this.f12800c);
        z3VarArr[20] = new C5073n4(this.f12801d.mo16799E(), this.f12800c);
        z3VarArr[21] = new C5065m4(this.f12801d.mo16811f(), this.f12801d.mo16802H(), this.f12800c);
        C4974b4 b4Var = new C4974b4(this.f12801d.mo16798D(), this.f12802e.mo16354a(), this.f12802e.mo16355b(), this.f12801d.mo16829x(), this.f12802e.mo16375t(), this.f12802e.mo16370o(), activity, this.f12800c);
        z3VarArr[22] = b4Var;
        z3VarArr[23] = new C5074n5(this.f12801d.mo16831z(), this.f12800c);
        z3VarArr[24] = new C5004f5(this.f12801d.mo16815j(), this.f12800c);
        z3VarArr[25] = new C5160u3(this.f12801d.mo16827v(), this.f12800c);
        C5016g5 g5Var = new C5016g5(this.f12801d.mo16814i(), this.f12802e.mo16354a(), this.f12802e.mo16355b(), this.f12803f, this.f12800c);
        z3VarArr[26] = g5Var;
        C5032i5 i5Var = new C5032i5(this.f12801d.mo16805K(), this.f12802e.mo16354a(), this.f12802e.mo16355b(), this.f12803f, this.f12800c);
        z3VarArr[27] = i5Var;
        z3VarArr[28] = new C5140t4(this.f12801d.mo16826u(), this.f12803f, activity2, this.f12800c);
        C5023h4 h4Var = new C5023h4(this.f12801d.mo16824s(), this.f12802e.mo16354a(), this.f12802e.mo16355b(), this.f12800c);
        z3VarArr[29] = h4Var;
        z3VarArr[30] = new C4965a4(this.f12802e.mo16356c(), this.f12800c);
        z3VarArr[31] = new C5128s3(this.f12803f, activity2, this.f12800c);
        C5081o5 o5Var = new C5081o5(activity, this.f12802e.mo16378v(), this.f12802e.mo16368m(), this.f12802e.mo16362h(), this.f12800c);
        z3VarArr[32] = o5Var;
        C5252g gVar = new C5252g(this.f12801d.mo16812g(), this.f12801d.mo16806a(), this.f12802e.mo16373r(), this.f12801d.mo16828w(), this.f12801d.mo16825t(), this.f12802e.mo16366k(), this.f12801d.mo16817l(), C5232d.f12582d.mo16745a(activity.getResources()), this.f12802e.mo16354a(), this.f12802e.mo16355b(), this.f12801d.mo16823r() == null ? this.f12801d.mo16820o() : this.f12801d.mo16823r());
        C5253h hVar2 = new C5253h(gVar, new C4829e(), new C4817a(), this.f12803f, this.f12800c);
        z3VarArr[33] = hVar2;
        C4988d4 d4Var = new C4988d4(this.f12802e.mo16366k(), this.f12802e.mo16364i(), this.f12801d.mo16812g() != null, this.f12803f, this.f12800c);
        z3VarArr[34] = d4Var;
        C5294k k = this.f12802e.mo16366k();
        if (this.f12801d.mo16812g() != null) {
            z = true;
        }
        z3VarArr[35] = new C5234e(k, z, this.f12803f, this.f12800c);
        z3VarArr[36] = new C5223y4(this.f12800c, this.f12799b);
        z3VarArr[37] = new C5146t5(activity.getWindow(), this.f12802e.mo16371p(), this.f12800c);
        z3VarArr[38] = new C5013g4(activity2, this.f12803f, this.f12800c);
        m18020a(z3VarArr);
    }

    /* renamed from: a */
    private void m18019a(Context context) {
        C5300m mVar = this.f12800c;
        m18020a(new C5052k5(this.f12803f, this.f12800c, this.f12802e.mo16369n()), new C4981c4(this.f12800c), new C5129s4(this.f12802e.mo16365j(), this.f12800c), new C5106q5(mVar, mVar.mo16974U0()), new C4948h(this.f12803f, this.f12800c), new C5201x4(this.f12803f, this.f12800c), new C5175d(new C5177f((AudioManager) context.getSystemService("audio")), this.f12802e.mo16374s(), this.f12803f, this.f12800c), new C4966a5(context, this.f12803f, this.f12800c), new C5103q4(this.f12802e.mo16372q(), this.f12803f, this.f12800c));
    }

    /* renamed from: a */
    private void m18020a(C5271z3... z3VarArr) {
        Collections.addAll(this.f12798a, z3VarArr);
    }
}
