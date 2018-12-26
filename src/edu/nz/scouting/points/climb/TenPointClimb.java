package edu.nz.scouting.points.climb;

import edu.nz.scouting.Scouter;
import edu.nz0.scouting.points.Points;

public class TenPointClimb extends Points.ClimbPoints {

    private static final long serialVersionUID = Scouter.serialVersionUID;

    public TenPointClimb(double climbTime) {
        super(10, climbTime);
    }
}