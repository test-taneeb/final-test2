package wedding.Planner;

import java.util.ArrayList;
import java.util.List;

public class PackageList {

    private  List<Package> packages;

    public PackageList() {
        packages = new ArrayList<>();
    }

    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    // Method to search packages by exact cost
    public void searchBelowCost(double cost) {
        System.out.println("Searching for packages below the cost of " + cost + ":");
        boolean found = false; // Flag to track if any packages are found
        for (Package pkg : packages) {
            if (pkg.getCost() <= cost) {
                System.out.println(pkg);
                found = true; // Set flag to true if a package is found
            }
        }
        // Check the flag after the loop; if no packages were found, print the message
        if (!found) {
            System.out.println("There's No Available Packages For This Budget");
        }
    }



    // Method to search packages within a cost range
    public void searchByCostRange(double minCost, double maxCost) {
        System.out.println("Searching for packages with a cost between " + minCost + " and " + maxCost + ":");
        for (Package pkg : packages) {
            if (pkg.getCost() >= minCost && pkg.getCost() <= maxCost) {
                System.out.println(pkg);
            }
        }
    }

}

