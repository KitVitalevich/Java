package org.babiy;

public class Service {
    public String info() {
        return getClass().getSimpleName();
    }
    
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.info());
    }
}
