package sanndag;

public class Persona {
    private final String name;
    private final String lastname;


    public Persona(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int nameLength(String name){
        int lenght = name.length();
        return lenght;
    }
}
