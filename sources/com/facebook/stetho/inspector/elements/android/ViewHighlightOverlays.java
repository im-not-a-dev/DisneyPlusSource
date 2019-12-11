package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

abstract class ViewHighlightOverlays {

    private static class NoOpViewHighlightOverlays extends ViewHighlightOverlays {
        private NoOpViewHighlightOverlays() {
        }

        /* access modifiers changed from: 0000 */
        public void highlightView(View view, Rect rect, int i) {
        }

        /* access modifiers changed from: 0000 */
        public void removeHighlight(View view) {
        }
    }

    @TargetApi(18)
    private static class ViewHighlightOverlaysJellybeanMR2 extends ViewHighlightOverlays {
        private static final int MARGIN_OVERLAY_COLOR = -1426797922;
        private static final int PADDING_OVERLAY_COLOR = -1430332746;
        private final HighlightDrawable[] mHighlightDrawables = {this.mMainHighlightDrawable, new PaddingTopHighlightDrawable(), new PaddingBottomHighlightDrawable(), new PaddingRightHighlightDrawable(), new PaddingLeftHighlightDrawable(), new MarginTopHighlightDrawable(), new MarginBottomHighlightDrawable(), new MarginRightHighlightDrawable(), new MarginLeftHighlightDrawable()};
        private final MainHighlightDrawable mMainHighlightDrawable = new MainHighlightDrawable();

        static abstract class HighlightDrawable extends ColorDrawable {
            protected final Rect mMargins = new Rect();
            protected final Rect mPaddings = new Rect();

            HighlightDrawable(int i) {
                super(i);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    Rect rect = this.mMargins;
                    rect.left = marginLayoutParams.leftMargin;
                    rect.top = marginLayoutParams.topMargin;
                    rect.right = marginLayoutParams.rightMargin;
                    rect.bottom = marginLayoutParams.bottomMargin;
                } else {
                    Rect rect2 = this.mMargins;
                    rect2.left = 0;
                    rect2.top = 0;
                    rect2.right = 0;
                    rect2.bottom = 0;
                }
                this.mPaddings.left = view.getPaddingLeft();
                this.mPaddings.top = view.getPaddingTop();
                this.mPaddings.right = view.getPaddingRight();
                this.mPaddings.bottom = view.getPaddingBottom();
            }

            public HighlightDrawable() {
            }
        }

        static class MainHighlightDrawable extends HighlightDrawable {
            MainHighlightDrawable() {
            }

            public void draw(Canvas canvas) {
                Rect clipBounds = canvas.getClipBounds();
                Rect rect = this.mMargins;
                clipBounds.inset(-(rect.right + rect.left), -(rect.top + rect.bottom));
                canvas.clipRect(clipBounds, Op.REPLACE);
                super.draw(canvas);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
            }
        }

        static class MarginBottomHighlightDrawable extends HighlightDrawable {
            MarginBottomHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            public void draw(Canvas canvas) {
                Rect rect = this.mMargins;
                canvas.translate(0.0f, (float) (rect.bottom + rect.top));
                super.draw(canvas);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, view.getHeight() - this.mMargins.bottom, view.getWidth(), view.getHeight());
            }
        }

        static class MarginLeftHighlightDrawable extends HighlightDrawable {
            MarginLeftHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            public void draw(Canvas canvas) {
                Rect rect = this.mMargins;
                canvas.translate((float) (-(rect.left + rect.right)), 0.0f);
                super.draw(canvas);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                int i = this.mMargins.left;
                int height = view.getHeight();
                Rect rect = this.mMargins;
                setBounds(0, 0, i, height + rect.top + rect.bottom);
            }
        }

        static class MarginRightHighlightDrawable extends HighlightDrawable {
            MarginRightHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            public void draw(Canvas canvas) {
                Rect rect = this.mMargins;
                canvas.translate((float) rect.right, (float) (-(rect.top + rect.bottom)));
                super.draw(canvas);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                int width = view.getWidth() - this.mMargins.right;
                int width2 = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.mMargins;
                setBounds(width, 0, width2, height + rect.top + rect.bottom);
            }
        }

        static class MarginTopHighlightDrawable extends HighlightDrawable {
            MarginTopHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            public void draw(Canvas canvas) {
                canvas.translate(0.0f, (float) (-this.mMargins.top));
                super.draw(canvas);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, 0, view.getWidth(), this.mMargins.top);
            }
        }

        static class PaddingBottomHighlightDrawable extends HighlightDrawable {
            PaddingBottomHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(this.mPaddings.left, view.getHeight() - this.mPaddings.bottom, view.getWidth() - this.mPaddings.right, view.getHeight());
            }
        }

        static class PaddingLeftHighlightDrawable extends HighlightDrawable {
            PaddingLeftHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, 0, this.mPaddings.left, view.getHeight());
            }
        }

        static class PaddingRightHighlightDrawable extends HighlightDrawable {
            PaddingRightHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(view.getWidth() - this.mPaddings.right, 0, view.getWidth(), view.getHeight());
            }
        }

        static class PaddingTopHighlightDrawable extends HighlightDrawable {
            PaddingTopHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: 0000 */
            public void highlightView(View view) {
                super.highlightView(view);
                int i = this.mPaddings.left;
                int width = view.getWidth();
                Rect rect = this.mPaddings;
                setBounds(i, 0, width - rect.right, rect.top);
            }
        }

        ViewHighlightOverlaysJellybeanMR2() {
        }

        /* access modifiers changed from: 0000 */
        public void highlightView(View view, Rect rect, int i) {
            this.mMainHighlightDrawable.setColor(i);
            if (rect.isEmpty()) {
                this.mMainHighlightDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            } else {
                this.mMainHighlightDrawable.setBounds(rect);
            }
            for (HighlightDrawable highlightDrawable : this.mHighlightDrawables) {
                highlightDrawable.highlightView(view);
                view.getOverlay().add(highlightDrawable);
            }
        }

        /* access modifiers changed from: 0000 */
        public void removeHighlight(View view) {
            for (HighlightDrawable remove : this.mHighlightDrawables) {
                view.getOverlay().remove(remove);
            }
        }
    }

    ViewHighlightOverlays() {
    }

    static ViewHighlightOverlays newInstance() {
        if (VERSION.SDK_INT >= 18) {
            return new ViewHighlightOverlaysJellybeanMR2();
        }
        return new NoOpViewHighlightOverlays();
    }

    /* access modifiers changed from: 0000 */
    public abstract void highlightView(View view, Rect rect, int i);

    /* access modifiers changed from: 0000 */
    public abstract void removeHighlight(View view);
}
