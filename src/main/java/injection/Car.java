package injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void DisplayDetails(){
        System.out.println("pecification : " + specification.toString());
    }
}
