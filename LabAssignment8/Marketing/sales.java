package LabAssignment8.Marketing;
import LabAssignment8.General.*;

public class sales extends employee {
    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }
    public double tallowance() {
        return 0.05 * earnings();
    }
}
