public class Main {
    public static void main(String[] args) {
        PCSetup setup1 = new PCSetup();
        setup1.addComponent(new CPU("Intel i7", 300.0));
        setup1.addComponent(new GPU("Nvidia RTX 3080", 700.0));
        setup1.addComponent(new RAM("Corsair Vengeance 16GB", 80.0));
        setup1.addComponent(new Storage("Samsung SSD 1TB", 100.0));
        setup1.caseSize = "large";
        setup1.isRGBLight = true;
        setup1.isLiquidCooling = false;
        System.out.println("Your chosen configurations are: " + setup1.components);
        System.out.println("Your total cost for the setup is: $" + setup1.calculateTotalCost());

        System.out.println();
        PCSetup setup2 = new PCSetup();
        setup2.addComponent(new CPU("AMD Ryzen 7", 330.0));
        setup2.addComponent(new GPU("AMD Radeon RX 6800", 580.0));
        setup2.addComponent(new RAM("G.Skill TridentZ RGB 32GB", 150.0));
        setup2.addComponent(new Storage("Seagate HDD 2TB", 60.0));
        setup2.caseSize = "medium";
        setup2.isRGBLight = false;
        setup2.isLiquidCooling = true;
        System.out.println("Your chosen configurations are: " + setup2.components);
        System.out.println("Your total cost for the setup is: $" + setup2.calculateTotalCost());

        System.out.println();
        PCSetup setup3 = new PCSetup();
        setup3.addComponent(new CPU("Intel i9", 500.0));
        setup3.addComponent(new GPU("Nvidia RTX 3090", 1500.0));
        setup3.addComponent(new RAM("Kingston HyperX 64GB", 300.0));
        setup3.addComponent(new Storage("Western Digital HDD 4TB", 120.0));
        setup3.caseSize = "small";
        setup3.isRGBLight = true;
        setup3.isLiquidCooling = true;
        System.out.println("Your chosen configurations are: " + setup3.components);
        System.out.println("Your total cost for the setup is: $" + setup3.calculateTotalCost());
    }
}
