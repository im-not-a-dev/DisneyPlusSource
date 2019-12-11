package com.appboy.p034ui.contentcards.recycler;

import androidx.recyclerview.widget.C0872i.C0878f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0794d0;

/* renamed from: com.appboy.ui.contentcards.recycler.SimpleItemTouchHelperCallback */
public class SimpleItemTouchHelperCallback extends C0878f {
    private final ItemTouchHelperAdapter mAdapter;

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        this.mAdapter = itemTouchHelperAdapter;
    }

    public int getMovementFlags(RecyclerView recyclerView, C0794d0 d0Var) {
        return C0878f.makeMovementFlags(0, this.mAdapter.isItemDismissable(d0Var.getAdapterPosition()) ? 16 : 0);
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public boolean onMove(RecyclerView recyclerView, C0794d0 d0Var, C0794d0 d0Var2) {
        return false;
    }

    public void onSwiped(C0794d0 d0Var, int i) {
        this.mAdapter.onItemDismiss(d0Var.getAdapterPosition());
    }
}
