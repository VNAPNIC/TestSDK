package mysoha.libary.namit.testsdk;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.List;
import vcc.soha.sdk.controller.RequestThreadPool;
import vcc.soha.sdk.entities.SObjects;
import vcc.soha.sdk.json.Sson;

public class MainActivity extends AppCompatActivity implements Sson.OnRequestCallBack{
    Sson s = new Sson(Sson.HTTPS);
    private static final String TAG = "test tag";
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        img = (ImageView) findViewById(R.id.img);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Object object = new Object();
        RequestThreadPool threadPool = new RequestThreadPool(s);
        
        threadPool.setReferences(TAG, object);
        threadPool.setOnRequestCallBack(this, Mobiadzone.class);
        //get
        threadPool.getReferences(TAG);
        threadPool.run();

        //------------------------------------------------------------
//        s.setPram(SubBaseSson.Company.CHAT,"pram","pram","pram");
//        s.requestAction();
//        s.setReferences(TAG, object);
//        s.setOnRequestCallBack(this, Mobiadzone.class);
//        //get
//        s.getReferences(TAG);

        //--------------------------------------------------------------
        //        s.setPram(SubBaseSson.Company.CHAT,"pram","pram","pram");
//        s.requestAction();
//        s.setReferences(TAG, object);
//        s.setOnRequestCallBack(this, Mobiadzone.class);
//        //get
//        s.getReferences(TAG);
        //--------------------------------------------------------------

//        String url = "http://1.bp.blogspot.com/-IVEdLnEJ6OY/Uw1ptWW-hoI/AAAAAAAAH64/vBat8mGYWLU/s1600/2-thu-thach-giup-ban-manh-me-h-2712-7304-1391390203.gif";
//        ImagesLoader il = new ImagesLoader(this);
//        il.SimpleTarget(500,500).ConverGIF(img, ImagesConver.ConverResourcesToDrawable(R.mipmap.ic_launcher, this), url);

    }

    @Override
    public void OnRequestCallBack(SObjects list) {
        MobiadzoneList mlist = new MobiadzoneList();
        mlist.setElements((List<Mobiadzone>) list.gettList());
        for (Mobiadzone mb : mlist.getElements()) {
            System.out.println(mb.getName());
            System.out.println(mb.getDesc());
            System.out.println(mb.getLink());
            System.out.println(mb.getLogo());
            System.out.println(mb.getPrice());
            System.out.println("//////////////");
        }
    }

    @Override
    public void onError(String error) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
