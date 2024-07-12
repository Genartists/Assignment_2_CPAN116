import java.util.*;

class PCSetup {
    ArrayList<PCComponent> components = new ArrayList<>();
    String caseSize;
    boolean isRGBLight;
    boolean isLiquidCooling;

    public void addComponent(PCComponent component) {
        components.add(component);
    }

    double calculateTotalCost() {
        double totalCost = 0.0;
        for (PCComponent component : components) {
            System.out.println(component + ": " + "$" + component.getPrice());
            totalCost += component.getPrice();
        }

        // check the size of the case
        if (caseSize.equals("large")) {
            totalCost += 50.0; // extra money for large size
            System.out.println("Case size large: $50");
        } else if (caseSize.equals("medium")) {
            totalCost += 25.0; // extra money for medium size
            System.out.println("Case size medium: $25");
        } else if (caseSize.equals("small")) {
            return totalCost; // no extra money for small size
        }

        if (isRGBLight) {
            totalCost += 30.0; // RGB lighting cost
            System.out.println("RGB lighting cost: $30");
        }

        if (isLiquidCooling) {
            totalCost += 100.0; // liquid cooling cost
            System.out.println("Liquid cooling cost: $100");
        }

        return totalCost;
    }
}
