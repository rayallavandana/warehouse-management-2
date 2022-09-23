package rit.sse.ptp;

public class Computer {
    private String brandName;
    private String modelName;
    private int hardDriveCapacity;
    private int memory;
    private float cpuSpeed;
    private float price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public float getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(float cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", hardDriveCapacity=" + hardDriveCapacity +
                ", memory=" + memory +
                ", cpuSpeed=" + cpuSpeed +
                ", price=" + price +
                '}';
    }
}

