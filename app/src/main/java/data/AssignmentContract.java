package data;

import android.provider.BaseColumns;

public class AssignmentContract {

    private AssignmentContract() {}

    public static class AssignmentEntries implements BaseColumns {
        public static final String TABLE_NAME = "assignment";
        public static final String ASSIGNMENT_TITLE = "title";
        public static final String START_DATE = "start";
        public static final String END_DATE = "end";
        public static final String COURSES = "courses";
        public static final String NOTES = "notes";
    }

}
