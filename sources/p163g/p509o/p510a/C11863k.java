package p163g.p509o.p510a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import androidx.recyclerview.widget.RecyclerView.C0794d0;

/* renamed from: g.o.a.k */
/* compiled from: ViewHolder */
public class C11863k extends C0794d0 {

    /* renamed from: a */
    private C11853e f27524a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11857g f27525b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11858h f27526c;

    /* renamed from: d */
    private OnClickListener f27527d = new C11864a();

    /* renamed from: e */
    private OnLongClickListener f27528e = new C11865b();

    /* renamed from: g.o.a.k$a */
    /* compiled from: ViewHolder */
    class C11864a implements OnClickListener {
        C11864a() {
        }

        public void onClick(View view) {
            if (C11863k.this.f27525b != null && C11863k.this.getAdapterPosition() != -1) {
                C11863k.this.f27525b.mo30006a(C11863k.this.mo30013b(), view);
            }
        }
    }

    /* renamed from: g.o.a.k$b */
    /* compiled from: ViewHolder */
    class C11865b implements OnLongClickListener {
        C11865b() {
        }

        public boolean onLongClick(View view) {
            if (C11863k.this.f27526c == null || C11863k.this.getAdapterPosition() == -1) {
                return false;
            }
            return C11863k.this.f27526c.mo30007a(C11863k.this.mo30013b(), view);
        }
    }

    public C11863k(View view) {
        super(view);
    }

    /* renamed from: c */
    public View mo30014c() {
        return this.itemView;
    }

    /* renamed from: d */
    public void mo30015d() {
        if (this.f27525b != null && this.f27524a.isClickable()) {
            this.itemView.setOnClickListener(null);
        }
        if (this.f27526c != null && this.f27524a.isLongClickable()) {
            this.itemView.setOnLongClickListener(null);
        }
        this.f27524a = null;
        this.f27525b = null;
        this.f27526c = null;
    }

    /* renamed from: a */
    public void mo30012a(C11853e eVar, C11857g gVar, C11858h hVar) {
        this.f27524a = eVar;
        if (gVar != null && eVar.isClickable()) {
            this.itemView.setOnClickListener(this.f27527d);
            this.f27525b = gVar;
        }
        if (hVar != null && eVar.isLongClickable()) {
            this.itemView.setOnLongClickListener(this.f27528e);
            this.f27526c = hVar;
        }
    }

    /* renamed from: b */
    public C11853e mo30013b() {
        return this.f27524a;
    }
}
