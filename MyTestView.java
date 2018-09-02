package com.bwie.xiaqin.zhoukaol0901;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2018/9/1.
 */

public class MyTestView extends View {
    private Paint mPaint;

    public MyTestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
// TODO Auto-generated constructor stub
    }


    public MyTestView(Context context, AttributeSet attrs) {
        super(context, attrs);
// TODO Auto-generated constructor stub
    }


    public MyTestView(Context context) {
        super(context);
// TODO Auto-generated constructor stub
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint=new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(18);
//绘制标题


        canvas.drawText("步行+跑步距离", 20,90, mPaint);
        mPaint.setTextSize(10);
//绘制线
        canvas.drawLine(50, 100, 50, 500, mPaint);//纵坐标
        canvas.drawLine(50, 500, 400, 500, mPaint);//横坐标
//纵坐标的值
        int[] array = { 0, 50, 100, 150, 200, 250, 300, 350 };
        for(int i=0;i<array.length;i++){
//首先绘制分割线
            canvas.drawLine(50, 500-array[i], 54, 500-array[i], mPaint);
//绘制值
            canvas.drawText(array[i]+"", 20, 500-array[i], mPaint);
        }

//横坐标
        String[] array2 = { "周日", "周一", "周二", "周三","周四","周五","周六" };
        for(int i=0;i<array2.length;i++){
            canvas.drawText(array2[i]+"", array[i]+85, 520, mPaint);
        }
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new Rect(90, 500 - 56, 110, 500), mPaint);
        canvas.drawRect(new Rect(140, 500 - 98, 160, 500), mPaint);
        canvas.drawRect(new Rect(190, 500 - 207, 210, 500), mPaint);
        canvas.drawRect(new Rect(240, 500 - 318, 260, 500), mPaint);
        canvas.drawRect(new Rect(290, 500 - 56, 310, 500), mPaint);
        canvas.drawRect(new Rect(340, 500 - 98, 360, 500), mPaint);
        canvas.drawRect(new Rect(390, 500 - 207, 410, 500), mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("56", 88, 500 - 58, mPaint);
        canvas.drawText("90", 138, 500 - 100, mPaint);
        canvas.drawText("207", 188, 500 - 209, mPaint);
        canvas.drawText("318", 238, 500 - 320, mPaint);
        canvas.drawText("100", 138, 500 - 100, mPaint);
        canvas.drawText("60", 88, 500 - 58, mPaint);
        canvas.drawText("320", 238, 500 - 320, mPaint);
        mPaint.setColor(Color.RED);
        mPaint.setTextSize(16);


    }
}
