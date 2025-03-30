package Transport;

public abstract class Transport {
    private String name;

    public Transport(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Название транспорта: " + name;
    }

    public interface People {
        static void displayPeopleTransport() {
            System.out.println("Является пассажирским");
        }
    }
}
