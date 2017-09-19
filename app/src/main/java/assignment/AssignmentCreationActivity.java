package assignment;

import android.graphics.Color;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        setStartTimeExpansion();
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
                final TextInputLayout assignmentNameField
                        = (TextInputLayout) findViewById(R.id.assignment_name_layout);
                String assignmentName = assignmentNameField.getEditText().getText().toString();
                if (!assignmentName.equals("")) {
                    //TODO: Fill in model with available data, pass model to controller, go to ManagementActivity
                    //Remember to double check that the assignment name is unique (i.e. doesn't currently
                    //exist in the db)
                } else {
                    assignmentNameField.setError(getApplicationContext().getResources()
                            .getString(R.string.error_assignment_title));
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setStartTimeExpansion() {
        ImageButton expandButton = (ImageButton) findViewById(R.id.start_date_expand);
        final LinearLayout startDate = (LinearLayout) findViewById(R.id.start_date_layout);
        expandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startDate.getVisibility() == View.GONE) {
                    startDate.setVisibility(View.VISIBLE);
                } else {
                    startDate.setVisibility(View.GONE);

                }
            }
        });
    }

}
