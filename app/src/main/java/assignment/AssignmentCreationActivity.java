package assignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.thisisanapp.companion.R;

public class AssignmentCreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_creation);
        Toolbar checkBar = (Toolbar) findViewById(R.id.assignment_toolbar);
        checkBar.setTitleTextColor(Color.WHITE);
        checkBar.setSubtitleTextColor(Color.WHITE);
        setSupportActionBar(checkBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_confirm:
                //TODO: Check to make sure form is filled, then store is SQLite Database
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
