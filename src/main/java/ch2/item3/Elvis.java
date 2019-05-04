package ch2.item3;

// Enum singleton - the preferred approach
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Leaving the building");
    }
}
