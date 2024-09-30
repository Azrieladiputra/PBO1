package model;

public class SportFacility {
    private String name;
    private String type;
    private int capacity;

    // Constructor
    public SportFacility(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Method to display facility details
    public void displayFacility() {
        System.out.println("Name: " + name + ", Type: " + type + ", Capacity: " + capacity);
    }
}
