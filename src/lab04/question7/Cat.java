package lab04.question7;

public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void upWeight(double w) {
        if (w < 0) {
            System.out.println("Error");
            return;
        }

        this.setWeight(w);
    }

    public void downWeight(double w) {
        if (w < 0) {
            System.out.println("Error");
            return;
        }

        this.setWeight(-w);
    }

    public void upHeight(double h) {
        if (h < 0) {
            System.out.println("Error");
            return;
        }

        this.setHeight(h);
    }

    public void defineCat(String n, String c) {
        this.setName(n);
        this.setColor(c);
    }

    public void speak() {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
    }
}
