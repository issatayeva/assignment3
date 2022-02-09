import java.util.ArrayList;

public class Shape {
    ArrayList<Point> pointArrayList; // we create an array to save points
    ArrayList<Double> pointDistance; // another array to save the distance
    private static int id_gen=0;
    private int id;

    public Shape() {
        id=id_gen++;
        pointArrayList=new ArrayList();
        pointDistance=new ArrayList<>();
    }

    public void addPoint(Point point) {
        pointArrayList.add(point);
    }

    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }

    public Point getPoint(int index) {
        return pointArrayList.get(index);
    }

    public void calculateDistance() { // to find the distance between points
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            pointDistance.add(i, pointArrayList.get(i).distance(pointArrayList.get(i + 1))); // it finds the distance between two elements of the array
        }
        pointDistance.add(pointArrayList.size()-1, pointArrayList.get(pointArrayList.size()-1).distance(pointArrayList.get(0))); // it calculates the distance between the first and the last element of the array
    }

    public double calculatePerimeter() { // to find the perimeter of the shape
        if (pointDistance.size()==0) // to check whether the array is empty or not
            calculateDistance(); // if empty to call this method
        double sum=0;
        for (Double pointDistances : pointDistance) {
            sum+=pointDistances; // perimeter is sum of all distances
        }
        return sum;
    }

    public double longestSide() { // to find the longest side of the shape
        if (pointDistance.size()==0)
            calculateDistance();
        double max=0;
        for (int i=0; i<pointDistance.size()-1; i++) // we create a loop to find max among the array
            if (pointDistance.get(i)>max) { // the formula of the longest side
                max=pointDistance.get(i);
            }
        return max;
    }

    public double average() { // to find the average length of all sides
        double average=0;
        for (int i=0; i<pointDistance.size()-1; i++) {
            average=calculatePerimeter()/pointDistance.size(); // the formula of average
        }
        return average;
    }
}
