package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0436i;
import java.util.HashMap;
import p096e.p114f.p115a.p116a.C3947c;

/* renamed from: androidx.constraintlayout.motion.widget.i */
/* compiled from: KeyPosition */
public class C0344i extends C0346j {

    /* renamed from: g */
    String f1503g = null;

    /* renamed from: h */
    int f1504h = C0321d.f1442e;

    /* renamed from: i */
    int f1505i = 0;

    /* renamed from: j */
    float f1506j = Float.NaN;

    /* renamed from: k */
    float f1507k = Float.NaN;

    /* renamed from: l */
    float f1508l = Float.NaN;

    /* renamed from: m */
    float f1509m = Float.NaN;

    /* renamed from: n */
    float f1510n = Float.NaN;

    /* renamed from: o */
    float f1511o = Float.NaN;

    /* renamed from: p */
    int f1512p = 0;

    /* renamed from: androidx.constraintlayout.motion.widget.i$a */
    /* compiled from: KeyPosition */
    private static class C0345a {

        /* renamed from: a */
        private static SparseIntArray f1513a = new SparseIntArray();

        static {
            f1513a.append(C0436i.KeyPosition_motionTarget, 1);
            f1513a.append(C0436i.KeyPosition_framePosition, 2);
            f1513a.append(C0436i.KeyPosition_transitionEasing, 3);
            f1513a.append(C0436i.KeyPosition_curveFit, 4);
            f1513a.append(C0436i.KeyPosition_drawPath, 5);
            f1513a.append(C0436i.KeyPosition_percentX, 6);
            f1513a.append(C0436i.KeyPosition_percentY, 7);
            f1513a.append(C0436i.KeyPosition_keyPositionType, 9);
            f1513a.append(C0436i.KeyPosition_sizePercent, 8);
            f1513a.append(C0436i.KeyPosition_percentWidth, 11);
            f1513a.append(C0436i.KeyPosition_percentHeight, 12);
            f1513a.append(C0436i.KeyPosition_pathMotionArc, 10);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m1921b(C0344i iVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            int i = 0;
            while (true) {
                String str = "KeyPosition";
                if (i < indexCount) {
                    int index = typedArray.getIndex(i);
                    switch (f1513a.get(index)) {
                        case 1:
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.f1444b = typedArray.getResourceId(index, iVar.f1444b);
                                break;
                            } else {
                                iVar.f1445c = typedArray.getString(index);
                                break;
                            }
                        case 2:
                            iVar.f1443a = typedArray.getInt(index, iVar.f1443a);
                            break;
                        case 3:
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.f1503g = C3947c.f9797c[typedArray.getInteger(index, 0)];
                                break;
                            } else {
                                iVar.f1503g = typedArray.getString(index);
                                break;
                            }
                        case 4:
                            iVar.f1514f = typedArray.getInteger(index, iVar.f1514f);
                            break;
                        case 5:
                            iVar.f1505i = typedArray.getInt(index, iVar.f1505i);
                            break;
                        case 6:
                            iVar.f1508l = typedArray.getFloat(index, iVar.f1508l);
                            break;
                        case 7:
                            iVar.f1509m = typedArray.getFloat(index, iVar.f1509m);
                            break;
                        case 8:
                            float f = typedArray.getFloat(index, iVar.f1507k);
                            iVar.f1506j = f;
                            iVar.f1507k = f;
                            break;
                        case 9:
                            iVar.f1512p = typedArray.getInt(index, iVar.f1512p);
                            break;
                        case 10:
                            iVar.f1504h = typedArray.getInt(index, iVar.f1504h);
                            break;
                        case 11:
                            iVar.f1506j = typedArray.getFloat(index, iVar.f1506j);
                            break;
                        case 12:
                            iVar.f1507k = typedArray.getFloat(index, iVar.f1507k);
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("unused attribute 0x");
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f1513a.get(index));
                            Log.e(str, sb.toString());
                            break;
                    }
                    i++;
                } else if (iVar.f1443a == -1) {
                    Log.e(str, "no frame position");
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2192a(Context context, AttributeSet attributeSet) {
        C0345a.m1921b(this, context.obtainStyledAttributes(attributeSet, C0436i.KeyPosition));
    }

    /* renamed from: a */
    public void mo2193a(HashMap<String, C0363u> hashMap) {
    }
}
