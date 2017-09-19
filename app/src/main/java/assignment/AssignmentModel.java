package assignment;

import android.support.annotation.Nullable;

public class AssignmentModel {

    /* These variables are necessary for any assignment */
    private String mAssignmentName;
    private long mDueDate;


    /* These variables are option information about an assignment */
    private @Nullable String mNotes;
    private @Nullable String mCourseName;
    private long mStartDate;

    public AssignmentModel(String assignmentName, long dueDate) {
        this(assignmentName, dueDate, null, null, -1);
    }

    public AssignmentModel(String assignmentName,
                           long dueDate,
                           @Nullable String notes,
                           @Nullable String courseName,
                           long startDate) {
        mAssignmentName = assignmentName;
        mDueDate = dueDate;
        mNotes = notes;
        mCourseName = courseName;
        mStartDate = startDate;
    }

    public String getAssignmentName() {
        return mAssignmentName;
    }
    public long getDueDate() {
        return mDueDate;
    }
    public String getNotes() {
        return mNotes;
    }
    public String getCourseName() {
        return mCourseName;
    }
    public long getStartDate() {
        return mStartDate;
    }

}
