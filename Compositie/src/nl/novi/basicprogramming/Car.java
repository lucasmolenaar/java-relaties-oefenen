package nl.novi.basicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brandName;
    private String modelName;
    private List<Part> parts;

    public Car(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
        parts = new ArrayList<>();
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public void addPart(String partName) {
        Part part = new Part(partName);
        parts.add(part);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("The ");
        stringBuilder.append(brandName).append(" ").append(modelName);
        if(parts.size() > 0) {
            stringBuilder.append(" has the following parts: ");
            for (Part part : parts) {
                stringBuilder.append("\n\r").append(part);
            }
        } else {
            stringBuilder.append(" has no parts.");
        }
        return stringBuilder.toString();
    }
}
