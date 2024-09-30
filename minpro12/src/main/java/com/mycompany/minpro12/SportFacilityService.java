package com.mycompany.minpro12;

import java.util.ArrayList;
import model.SportFacility;

public class SportFacilityService {
    private static final ArrayList<SportFacility> facilities = new ArrayList<>();

    // Method to add a new facility
    public static void addFacility(SportFacility facility) {
        facilities.add(facility);
        System.out.println("Facility added successfully!");
    }

    // Method to view all facilities
    public static void viewFacilities() {
        if (facilities.isEmpty()) {
            System.out.println("No facilities available.");
        } else {
            for (SportFacility facility : facilities) {
                facility.displayFacility();
            }
        }
    }

    // Method to update an existing facility by name
    public static void updateFacility(String name, String newName, String newType, int newCapacity) {
        boolean found = false;
        for (SportFacility facility : facilities) {
            if (facility.getName().equalsIgnoreCase(name)) {
                facility.setName(newName);
                facility.setType(newType);
                facility.setCapacity(newCapacity);
                System.out.println("Facility updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Facility not found.");
        }
    }

    // Method to delete a facility by name
    public static void deleteFacility(String name) {
        boolean found = false;
        for (SportFacility facility : facilities) {
            if (facility.getName().equalsIgnoreCase(name)) {
                facilities.remove(facility);
                System.out.println("Facility deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Facility not found.");
        }
    }
}
