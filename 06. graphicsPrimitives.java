package com.example.drawshapes;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.view.View;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Kughan(this));
    }
    class Kughan extends View {
        public Kughan(Context context) {
            super(context);
        }
        Paint paint = new Paint();
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(6);
            canvas.drawCircle(100, 100, 50, paint);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(250, 250, 50, paint);
            canvas.drawRect(150, 400, 300, 500, paint);
        }
    }
}