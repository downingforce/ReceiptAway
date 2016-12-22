package downingforce.receiptaway;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.googlecode.tesseract.android.TessBaseAPI;

public class MainActivity extends AppCompatActivity {

    Bitmap image;
    private TessBaseAPI mTess;
    String datapath = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = BitmapFactory.decodeResource(getResources(), R.drawable.test_image);

        datapath = getFilesDir() + "/tesseract/";

        String lang = "eng";
        mTess = new TessBaseAPI();
        mTess.init(datapath, lang);
    }

}
