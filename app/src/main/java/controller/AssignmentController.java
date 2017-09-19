package controller;

import android.content.Context;

import assignment.AssignmentModel;
import data.AssignmentReaderDbHelper;

public class AssignmentController {

    private static AssignmentController controller;
    private AssignmentReaderDbHelper mDatabaseHelper;

    private AssignmentController(Context context) {
        mDatabaseHelper = new AssignmentReaderDbHelper(context);
    }

    public static AssignmentController getAssignmentController(Context context) {
        if (controller == null) {
            controller = new AssignmentController(context);
        }
        return controller;
    }

    public void updateAssignmentDatabase(AssignmentModel model) {
        //TODO: take model information using getters and store them into writable database
    }

}
