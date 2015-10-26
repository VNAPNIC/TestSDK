package mysoha.libary.namit.testsdk;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import vcc.soha.sdk.commons.SConnect;
import vcc.soha.sdk.json.Sson;

public class MainActivity extends AppCompatActivity implements Sson.OnCallList {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Object object = new Object();
        Sson s = new Sson();

        s.setRequestMethod(SConnect.POST);
        s.addConnect("aaaaaaaaa", object);
        s.setOnCallList(this, Mobiadzone.class);
    }

    @Override
    public <T> void OnCallList(List<T> list) {
        MobiadzoneList mlist = new MobiadzoneList();
        mlist.setMobiadzones((List<Mobiadzone>) list);
        for (Mobiadzone mb : mlist.getMobiadzones()) {
            System.out.println(mb.getName());
            System.out.println(mb.getDesc());
            System.out.println(mb.getLink());
            System.out.println(mb.getLogo());
            System.out.println(mb.getPrice());
            System.out.println("//////////////");
        }
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
