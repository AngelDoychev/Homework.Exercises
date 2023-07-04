package JavaOOP.Polymorphism.Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;
public abstract Double calculatePerimeter();
public abstract Double calculateArea();
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
