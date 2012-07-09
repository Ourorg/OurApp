package myGraphic.Package;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.os.Bundle;
import android.view.View;

public class Graphics2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));
    }
    
    static public class GraphicsView extends View{
    	public GraphicsView(Context context){
    		super(context);
    	}
    	
    	@Override
    	protected void onDraw(Canvas canvas){
    		//Drawnig commands go here
    		Path circle = new Path();
    		circle.addCircle(150, 150, 100, Direction.CW);
    		Paint cPaint = new Paint();
    		cPaint.setColor(Color.LTGRAY);
    		
    		Paint tPaint = new Paint();
    		tPaint.setColor(Color.BLACK);
    		
    		final String QUOTE = "Now is the time for all" + "good men to come to the aid of their country.";
    		canvas.drawPath(circle, cPaint);
    		canvas.drawTextOnPath(QUOTE, circle, 0, 20, tPaint);
    		setBackgroundResource(R.drawable.background);
    	}
    }
}