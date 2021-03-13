package nl.novi.basicprogramming;

public class Part {
    private String partName;

    public Part(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return partName;
    }
}
