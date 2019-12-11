package com.bamtechmedia.dominguez.p331ui.pagingbehaviour;

import android.view.KeyEvent;
import android.view.View;
import com.bamtechmedia.dominguez.collections.C3323f0;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11969r;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/BaseAutoPagingBehaviour;", "focusableView", "Landroid/view/View;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "listener", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour$Listener;", "autoPagingSession", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "(Landroid/view/View;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour$Listener;Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;)V", "onFocusChanged", "", "gainFocus", "", "onKey", "v", "keyCode", "", "event", "Landroid/view/KeyEvent;", "selectNextItem", "Listener", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.b */
/* compiled from: FullBleedAutoPagingBehaviour.kt */
public final class C8092b extends C8087a {

    /* renamed from: X */
    private final C8093a f17325X;

    /* renamed from: Y */
    private final C3323f0 f17326Y;

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.b$a */
    /* compiled from: FullBleedAutoPagingBehaviour.kt */
    public interface C8093a {
        /* renamed from: a */
        void mo21065a();

        /* renamed from: b */
        void mo21067b();
    }

    public /* synthetic */ C8092b(View view, C11969r rVar, C8093a aVar, C3323f0 f0Var, C3441g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            rVar = C11992a.m38600a();
            C12880j.m40222a((Object) rVar, "AndroidSchedulers.mainThread()");
        }
        this(view, rVar, aVar, f0Var, gVar);
    }

    /* renamed from: b */
    public void mo21083b() {
        this.f17325X.mo21065a();
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        Boolean valueOf = Boolean.valueOf(true);
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        if (keyEvent.getKeyCode() == 22) {
            mo21088a(false, valueOf);
            mo21083b();
        } else if (keyEvent.getKeyCode() != 21) {
            return super.onKey(view, i, keyEvent);
        } else {
            mo21088a(false, valueOf);
            this.f17325X.mo21067b();
        }
        return true;
    }

    public C8092b(View view, C11969r rVar, C8093a aVar, C3323f0 f0Var, C3441g gVar) {
        super(f0Var, gVar, rVar);
        this.f17325X = aVar;
        this.f17326Y = f0Var;
        view.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void mo21096b(boolean z) {
        boolean z2 = this.f17326Y.mo12378t() == null;
        boolean w = this.f17326Y.mo12380w();
        if (z && z2 && w) {
            mo12600a();
        }
    }
}
