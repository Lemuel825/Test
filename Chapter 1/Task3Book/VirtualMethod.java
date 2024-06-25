public abstract class VirtualMethod {
    private void fly(){
        
        System.out.println("asdasd is flying");
    }

    public String getName(){
        return "unkown";
    }
    public static void main(String[] args) {
        VirtualMethod bird = new Peacock();
        bird.fly();
        // Peacock bird3 = new Adarana(); //error
    }
}


class Peacock extends VirtualMethod{
    public String getName(){
        return "Peacock";
    }
}  
