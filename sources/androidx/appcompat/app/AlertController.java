package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0224f0.C0225a;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C0500b;
import java.lang.ref.WeakReference;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3858a;
import p096e.p097a.C3863f;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

class AlertController {

    /* renamed from: A */
    NestedScrollView f172A;

    /* renamed from: B */
    private int f173B = 0;

    /* renamed from: C */
    private Drawable f174C;

    /* renamed from: D */
    private ImageView f175D;

    /* renamed from: E */
    private TextView f176E;

    /* renamed from: F */
    private TextView f177F;

    /* renamed from: G */
    private View f178G;

    /* renamed from: H */
    ListAdapter f179H;

    /* renamed from: I */
    int f180I = -1;

    /* renamed from: J */
    private int f181J;

    /* renamed from: K */
    private int f182K;

    /* renamed from: L */
    int f183L;

    /* renamed from: M */
    int f184M;

    /* renamed from: N */
    int f185N;

    /* renamed from: O */
    int f186O;

    /* renamed from: P */
    private boolean f187P;

    /* renamed from: Q */
    private int f188Q = 0;

    /* renamed from: R */
    Handler f189R;

    /* renamed from: S */
    private final OnClickListener f190S = new C0062a();

    /* renamed from: a */
    private final Context f191a;

    /* renamed from: b */
    final C0106h f192b;

    /* renamed from: c */
    private final Window f193c;

    /* renamed from: d */
    private final int f194d;

    /* renamed from: e */
    private CharSequence f195e;

    /* renamed from: f */
    private CharSequence f196f;

    /* renamed from: g */
    ListView f197g;

    /* renamed from: h */
    private View f198h;

    /* renamed from: i */
    private int f199i;

    /* renamed from: j */
    private int f200j;

    /* renamed from: k */
    private int f201k;

    /* renamed from: l */
    private int f202l;

    /* renamed from: m */
    private int f203m;

    /* renamed from: n */
    private boolean f204n = false;

    /* renamed from: o */
    Button f205o;

    /* renamed from: p */
    private CharSequence f206p;

    /* renamed from: q */
    Message f207q;

    /* renamed from: r */
    private Drawable f208r;

    /* renamed from: s */
    Button f209s;

    /* renamed from: t */
    private CharSequence f210t;

    /* renamed from: u */
    Message f211u;

    /* renamed from: v */
    private Drawable f212v;

    /* renamed from: w */
    Button f213w;

    /* renamed from: x */
    private CharSequence f214x;

    /* renamed from: y */
    Message f215y;

    /* renamed from: z */
    private Drawable f216z;

    public static class RecycleListView extends ListView {

        /* renamed from: U */
        private final int f217U;

        /* renamed from: c */
        private final int f218c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public void mo356a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f218c, getPaddingRight(), z2 ? getPaddingBottom() : this.f217U);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.RecycleListView);
            this.f217U = obtainStyledAttributes.getDimensionPixelOffset(C3867j.RecycleListView_paddingBottomNoButtons, -1);
            this.f218c = obtainStyledAttributes.getDimensionPixelOffset(C3867j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0062a implements OnClickListener {
        C0062a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f205o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f207q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f209s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.f211u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f213w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.f215y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f189R
                r1 = 1
                androidx.appcompat.app.h r3 = r3.f192b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0062a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0063b implements C0500b {

        /* renamed from: a */
        final /* synthetic */ View f220a;

        /* renamed from: b */
        final /* synthetic */ View f221b;

        C0063b(AlertController alertController, View view, View view2) {
            this.f220a = view;
            this.f221b = view2;
        }

        /* renamed from: a */
        public void mo358a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m398a(nestedScrollView, this.f220a, this.f221b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0064c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ View f222U;

        /* renamed from: c */
        final /* synthetic */ View f224c;

        C0064c(View view, View view2) {
            this.f224c = view;
            this.f222U = view2;
        }

        public void run() {
            AlertController.m398a(AlertController.this.f172A, this.f224c, this.f222U);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0065d implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f225a;

        /* renamed from: b */
        final /* synthetic */ View f226b;

        C0065d(AlertController alertController, View view, View view2) {
            this.f225a = view;
            this.f226b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m398a(absListView, this.f225a, this.f226b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0066e implements Runnable {

        /* renamed from: U */
        final /* synthetic */ View f227U;

        /* renamed from: c */
        final /* synthetic */ View f229c;

        C0066e(View view, View view2) {
            this.f229c = view;
            this.f227U = view2;
        }

        public void run() {
            AlertController.m398a(AlertController.this.f197g, this.f229c, this.f227U);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0067f {

        /* renamed from: A */
        public int f230A;

        /* renamed from: B */
        public int f231B;

        /* renamed from: C */
        public int f232C;

        /* renamed from: D */
        public int f233D;

        /* renamed from: E */
        public boolean f234E = false;

        /* renamed from: F */
        public boolean[] f235F;

        /* renamed from: G */
        public boolean f236G;

        /* renamed from: H */
        public boolean f237H;

        /* renamed from: I */
        public int f238I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f239J;

        /* renamed from: K */
        public Cursor f240K;

        /* renamed from: L */
        public String f241L;

        /* renamed from: M */
        public String f242M;

        /* renamed from: N */
        public OnItemSelectedListener f243N;

        /* renamed from: O */
        public C0072e f244O;

        /* renamed from: a */
        public final Context f245a;

        /* renamed from: b */
        public final LayoutInflater f246b;

        /* renamed from: c */
        public int f247c = 0;

        /* renamed from: d */
        public Drawable f248d;

        /* renamed from: e */
        public int f249e = 0;

        /* renamed from: f */
        public CharSequence f250f;

        /* renamed from: g */
        public View f251g;

        /* renamed from: h */
        public CharSequence f252h;

        /* renamed from: i */
        public CharSequence f253i;

        /* renamed from: j */
        public Drawable f254j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f255k;

        /* renamed from: l */
        public CharSequence f256l;

        /* renamed from: m */
        public Drawable f257m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f258n;

        /* renamed from: o */
        public CharSequence f259o;

        /* renamed from: p */
        public Drawable f260p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f261q;

        /* renamed from: r */
        public boolean f262r;

        /* renamed from: s */
        public OnCancelListener f263s;

        /* renamed from: t */
        public OnDismissListener f264t;

        /* renamed from: u */
        public OnKeyListener f265u;

        /* renamed from: v */
        public CharSequence[] f266v;

        /* renamed from: w */
        public ListAdapter f267w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f268x;

        /* renamed from: y */
        public int f269y;

        /* renamed from: z */
        public View f270z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0068a extends ArrayAdapter<CharSequence> {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f272c;

            C0068a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f272c = recycleListView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0067f.this.f235F;
                if (zArr != null && zArr[i]) {
                    this.f272c.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0069b extends CursorAdapter {

            /* renamed from: U */
            private final int f273U;

            /* renamed from: V */
            final /* synthetic */ RecycleListView f274V;

            /* renamed from: W */
            final /* synthetic */ AlertController f275W;

            /* renamed from: c */
            private final int f277c;

            C0069b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                this.f274V = recycleListView;
                this.f275W = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f277c = cursor2.getColumnIndexOrThrow(C0067f.this.f241L);
                this.f273U = cursor2.getColumnIndexOrThrow(C0067f.this.f242M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f277c));
                RecycleListView recycleListView = this.f274V;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f273U) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0067f.this.f246b.inflate(this.f275W.f184M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0070c implements OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ AlertController f279c;

            C0070c(AlertController alertController) {
                this.f279c = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0067f.this.f268x.onClick(this.f279c.f192b, i);
                if (!C0067f.this.f237H) {
                    this.f279c.f192b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0071d implements OnItemClickListener {

            /* renamed from: U */
            final /* synthetic */ AlertController f280U;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f282c;

            C0071d(RecycleListView recycleListView, AlertController alertController) {
                this.f282c = recycleListView;
                this.f280U = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0067f.this.f235F;
                if (zArr != null) {
                    zArr[i] = this.f282c.isItemChecked(i);
                }
                C0067f.this.f239J.onClick(this.f280U.f192b, i, this.f282c.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0072e {
            /* renamed from: a */
            void mo369a(ListView listView);
        }

        public C0067f(Context context) {
            this.f245a = context;
            this.f262r = true;
            this.f246b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.appcompat.app.AlertController$h] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v17, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v18, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v19, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
          assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          mth insns count: 68
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m425b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f246b
                int r1 = r12.f183L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f236G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f240K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f245a
                int r4 = r12.f184M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f266v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f245a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f237H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f185N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f186O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f240K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f245a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f241L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f267w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f245a
                java.lang.CharSequence[] r3 = r11.f266v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f244O
                if (r1 == 0) goto L_0x006e
                r1.mo369a(r0)
            L_0x006e:
                r12.f179H = r9
                int r1 = r11.f238I
                r12.f180I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f268x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r12)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f239J
                if (r1 == 0) goto L_0x008d
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r12)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f243N
                if (r1 == 0) goto L_0x0094
                r0.setOnItemSelectedListener(r1)
            L_0x0094:
                boolean r1 = r11.f237H
                if (r1 == 0) goto L_0x009c
                r0.setChoiceMode(r8)
                goto L_0x00a4
            L_0x009c:
                boolean r1 = r11.f236G
                if (r1 == 0) goto L_0x00a4
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a4:
                r12.f197g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0067f.m425b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo363a(AlertController alertController) {
            View view = this.f251g;
            if (view != null) {
                alertController.mo346a(view);
            } else {
                CharSequence charSequence = this.f250f;
                if (charSequence != null) {
                    alertController.mo353b(charSequence);
                }
                Drawable drawable = this.f248d;
                if (drawable != null) {
                    alertController.mo345a(drawable);
                }
                int i = this.f247c;
                if (i != 0) {
                    alertController.mo351b(i);
                }
                int i2 = this.f249e;
                if (i2 != 0) {
                    alertController.mo351b(alertController.mo342a(i2));
                }
            }
            CharSequence charSequence2 = this.f252h;
            if (charSequence2 != null) {
                alertController.mo348a(charSequence2);
            }
            if (!(this.f253i == null && this.f254j == null)) {
                alertController.mo344a(-1, this.f253i, this.f255k, (Message) null, this.f254j);
            }
            if (!(this.f256l == null && this.f257m == null)) {
                alertController.mo344a(-2, this.f256l, this.f258n, (Message) null, this.f257m);
            }
            if (!(this.f259o == null && this.f260p == null)) {
                alertController.mo344a(-3, this.f259o, this.f261q, (Message) null, this.f260p);
            }
            if (!(this.f266v == null && this.f240K == null && this.f267w == null)) {
                m425b(alertController);
            }
            View view2 = this.f270z;
            if (view2 == null) {
                int i3 = this.f269y;
                if (i3 != 0) {
                    alertController.mo355c(i3);
                }
            } else if (this.f234E) {
                alertController.mo347a(view2, this.f230A, this.f231B, this.f232C, this.f233D);
            } else {
                alertController.mo352b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0073g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f283a;

        public C0073g(DialogInterface dialogInterface) {
            this.f283a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f283a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0074h extends ArrayAdapter<CharSequence> {
        public C0074h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0106h hVar, Window window) {
        this.f191a = context;
        this.f192b = hVar;
        this.f193c = window;
        this.f189R = new C0073g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C3867j.AlertDialog, C3858a.alertDialogStyle, 0);
        this.f181J = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_android_layout, 0);
        this.f182K = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_buttonPanelSideLayout, 0);
        this.f183L = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_listLayout, 0);
        this.f184M = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_multiChoiceItemLayout, 0);
        this.f185N = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_singleChoiceItemLayout, 0);
        this.f186O = obtainStyledAttributes.getResourceId(C3867j.AlertDialog_listItemLayout, 0);
        this.f187P = obtainStyledAttributes.getBoolean(C3867j.AlertDialog_showTitle, true);
        this.f194d = obtainStyledAttributes.getDimensionPixelSize(C3867j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        hVar.mo564a(1);
    }

    /* renamed from: a */
    private static boolean m402a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3858a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static boolean m406c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m406c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m407d() {
        View findViewById = this.f193c.findViewById(C3863f.parentPanel);
        View findViewById2 = findViewById.findViewById(C3863f.topPanel);
        View findViewById3 = findViewById.findViewById(C3863f.contentPanel);
        View findViewById4 = findViewById.findViewById(C3863f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C3863f.customPanel);
        m405c(viewGroup);
        View findViewById5 = viewGroup.findViewById(C3863f.topPanel);
        View findViewById6 = viewGroup.findViewById(C3863f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C3863f.buttonPanel);
        ViewGroup a = m397a(findViewById5, findViewById2);
        ViewGroup a2 = m397a(findViewById6, findViewById3);
        ViewGroup a3 = m397a(findViewById7, findViewById4);
        m403b(a2);
        m399a(a3);
        m408d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C3863f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f172A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f196f == null && this.f197g == null)) {
                view = a.findViewById(C3863f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C3863f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f197g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo356a(z2, z3);
        }
        if (!z) {
            View view2 = this.f197g;
            if (view2 == null) {
                view2 = this.f172A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m400a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f197g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f179H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i = this.f180I;
                if (i > -1) {
                    listView2.setItemChecked(i, true);
                    listView2.setSelection(i);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo350b() {
        this.f192b.setContentView(m404c());
        m407d();
    }

    /* renamed from: a */
    public void mo346a(View view) {
        this.f178G = view;
    }

    /* renamed from: b */
    public void mo353b(CharSequence charSequence) {
        this.f195e = charSequence;
        TextView textView = this.f176E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo348a(CharSequence charSequence) {
        this.f196f = charSequence;
        TextView textView = this.f177F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c */
    private int m404c() {
        int i = this.f182K;
        if (i == 0) {
            return this.f181J;
        }
        if (this.f188Q == 1) {
            return i;
        }
        return this.f181J;
    }

    /* renamed from: b */
    public void mo352b(View view) {
        this.f198h = view;
        this.f199i = 0;
        this.f204n = false;
    }

    /* renamed from: a */
    public void mo347a(View view, int i, int i2, int i3, int i4) {
        this.f198h = view;
        this.f199i = 0;
        this.f204n = true;
        this.f200j = i;
        this.f201k = i2;
        this.f202l = i3;
        this.f203m = i4;
    }

    /* renamed from: b */
    public void mo351b(int i) {
        this.f174C = null;
        this.f173B = i;
        ImageView imageView = this.f175D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f175D.setImageResource(this.f173B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public void mo355c(int i) {
        this.f198h = null;
        this.f199i = i;
        this.f204n = false;
    }

    /* renamed from: c */
    private void m405c(ViewGroup viewGroup) {
        View view = this.f198h;
        boolean z = false;
        if (view == null) {
            view = this.f199i != 0 ? LayoutInflater.from(this.f191a).inflate(this.f199i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m406c(view)) {
            this.f193c.setFlags(DateUtils.FORMAT_NUMERIC_DATE, DateUtils.FORMAT_NUMERIC_DATE);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f193c.findViewById(C3863f.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f204n) {
                frameLayout.setPadding(this.f200j, this.f201k, this.f202l, this.f203m);
            }
            if (this.f197g != null) {
                ((C0225a) viewGroup.getLayoutParams()).f1046a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    public void mo344a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f189R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f214x = charSequence;
            this.f215y = message;
            this.f216z = drawable;
        } else if (i == -2) {
            this.f210t = charSequence;
            this.f211u = message;
            this.f212v = drawable;
        } else if (i == -1) {
            this.f206p = charSequence;
            this.f207q = message;
            this.f208r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public boolean mo354b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f172A;
        return nestedScrollView != null && nestedScrollView.mo2758a(keyEvent);
    }

    /* renamed from: b */
    private void m403b(ViewGroup viewGroup) {
        this.f172A = (NestedScrollView) this.f193c.findViewById(C3863f.scrollView);
        this.f172A.setFocusable(false);
        this.f172A.setNestedScrollingEnabled(false);
        this.f177F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f177F;
        if (textView != null) {
            CharSequence charSequence = this.f196f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f172A.removeView(this.f177F);
                if (this.f197g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f172A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f172A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f197g, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo345a(Drawable drawable) {
        this.f174C = drawable;
        this.f173B = 0;
        ImageView imageView = this.f175D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f175D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public int mo342a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f191a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo343a() {
        return this.f197g;
    }

    /* renamed from: a */
    public boolean mo349a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f172A;
        return nestedScrollView != null && nestedScrollView.mo2758a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m397a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    private void m408d(ViewGroup viewGroup) {
        if (this.f178G != null) {
            viewGroup.addView(this.f178G, 0, new LayoutParams(-1, -2));
            this.f193c.findViewById(C3863f.title_template).setVisibility(8);
            return;
        }
        this.f175D = (ImageView) this.f193c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f195e)) || !this.f187P) {
            this.f193c.findViewById(C3863f.title_template).setVisibility(8);
            this.f175D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f176E = (TextView) this.f193c.findViewById(C3863f.alertTitle);
        this.f176E.setText(this.f195e);
        int i = this.f173B;
        if (i != 0) {
            this.f175D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f174C;
        if (drawable != null) {
            this.f175D.setImageDrawable(drawable);
            return;
        }
        this.f176E.setPadding(this.f175D.getPaddingLeft(), this.f175D.getPaddingTop(), this.f175D.getPaddingRight(), this.f175D.getPaddingBottom());
        this.f175D.setVisibility(8);
    }

    /* renamed from: a */
    private void m400a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f193c.findViewById(C3863f.scrollIndicatorUp);
        View findViewById2 = this.f193c.findViewById(C3863f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C4187x.m14353a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f196f != null) {
                this.f172A.setOnScrollChangeListener(new C0063b(this, findViewById, view2));
                this.f172A.post(new C0064c(findViewById, view2));
                return;
            }
            ListView listView = this.f197g;
            if (listView != null) {
                listView.setOnScrollListener(new C0065d(this, findViewById, view2));
                this.f197g.post(new C0066e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    static void m398a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m399a(ViewGroup viewGroup) {
        boolean z;
        this.f205o = (Button) viewGroup.findViewById(16908313);
        this.f205o.setOnClickListener(this.f190S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f206p) || this.f208r != null) {
            this.f205o.setText(this.f206p);
            Drawable drawable = this.f208r;
            if (drawable != null) {
                int i = this.f194d;
                drawable.setBounds(0, 0, i, i);
                this.f205o.setCompoundDrawables(this.f208r, null, null, null);
            }
            this.f205o.setVisibility(0);
            z = true;
        } else {
            this.f205o.setVisibility(8);
            z = false;
        }
        this.f209s = (Button) viewGroup.findViewById(16908314);
        this.f209s.setOnClickListener(this.f190S);
        if (!TextUtils.isEmpty(this.f210t) || this.f212v != null) {
            this.f209s.setText(this.f210t);
            Drawable drawable2 = this.f212v;
            if (drawable2 != null) {
                int i2 = this.f194d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f209s.setCompoundDrawables(this.f212v, null, null, null);
            }
            this.f209s.setVisibility(0);
            z |= true;
        } else {
            this.f209s.setVisibility(8);
        }
        this.f213w = (Button) viewGroup.findViewById(16908315);
        this.f213w.setOnClickListener(this.f190S);
        if (!TextUtils.isEmpty(this.f214x) || this.f216z != null) {
            this.f213w.setText(this.f214x);
            Drawable drawable3 = this.f208r;
            if (drawable3 != null) {
                int i3 = this.f194d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f205o.setCompoundDrawables(this.f208r, null, null, null);
            }
            this.f213w.setVisibility(0);
            z |= true;
        } else {
            this.f213w.setVisibility(8);
        }
        if (m402a(this.f191a)) {
            if (z) {
                m401a(this.f205o);
            } else if (z) {
                m401a(this.f209s);
            } else if (z) {
                m401a(this.f213w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m401a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
