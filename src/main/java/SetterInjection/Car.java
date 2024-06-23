package SetterInjection;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void DisplayDetails(){
        System.out.println("pecification : " + specification.toString());
    }
}
