// (x1, y1) → (x2, y2)
// dx = |x2 - x1|, dy = |y2 - y1|
// Number of diagonal moves = min(dx, dy) (as diagonal moves reduces both x and y distances)
// Remaining distance = Number of horizontal or vertical moves = |dx - dy|
// Time required =  Number of total moves = min(dx, dy) + |dx - dy| = max(dx, dy)

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0 ;
        for(int i = 0; i < points.length - 1; i ++)
            time += Math.max(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1])) ;
        return time;
    }
}
