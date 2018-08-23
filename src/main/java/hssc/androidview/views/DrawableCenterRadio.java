package hssc.androidview.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.RadioButton;

/**
 * hssc.androidview.views.DrawableCenterRadio
 * Created by Administrator on 2016/4/13.
 */
public class DrawableCenterRadio extends RadioButton{
    public DrawableCenterRadio(Context context) {
        super(context);
    }

    public DrawableCenterRadio(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawableCenterRadio(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
//        Drawable[] drawables = getCompoundDrawables();
//        if (drawables != null) {
//            Drawable drawableLeft = drawables[0];
//            if (drawableLeft != null) {
//                float textWidth =0;
//                if (!TextUtils.isEmpty(getText().toString())){
//                    textWidth =  getPaint().measureText(getText().toString());
//                }
//                int drawablePadding = getCompoundDrawablePadding();
//                int drawableWidth = 0;
//                drawableWidth = drawableLeft.getIntrinsicWidth();
//                float bodyWidth = textWidth + drawableWidth + drawablePadding;
//                canvas.translate((getWidth() - bodyWidth) / 2, 0);
//            }
//        }
//        super.onDraw(canvas);
        Drawable[] drawables = getCompoundDrawables();
        if (drawables != null) {
            Drawable drawableLeft = drawables[2];
            if (drawableLeft != null) {

                float textWidth = getPaint().measureText(getText().toString());
                int drawablePadding = getCompoundDrawablePadding();
                int drawableWidth = 0;
                drawableWidth = drawableLeft.getIntrinsicWidth();
                float bodyWidth = textWidth + drawableWidth + drawablePadding;
                setPadding(0, 0, (int)(getWidth() - bodyWidth), 0);
                canvas.translate((getWidth() - bodyWidth) / 2, 0);
            }
        }
        super.onDraw(canvas);
    }
}
