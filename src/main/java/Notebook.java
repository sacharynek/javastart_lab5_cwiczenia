public class Notebook {

    String producer, model;
    int ram;
    double processorSpeed;
    boolean hasOS;

    public Notebook(String producer, String model, int ram, double processorSpeed, boolean hasOS) {
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.processorSpeed = processorSpeed;
        this.hasOS = hasOS;
    }

    public Notebook(String producer, String model, double processorSpeed, boolean hasOS) {
        this.producer = producer;
        this.model = model;
        this.processorSpeed = processorSpeed;
        this.hasOS = hasOS;
    }

    public Notebook(String producer, String model, int ram, double processorSpeed) {
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.processorSpeed = processorSpeed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public boolean isHasOS() {
        return hasOS;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", processorSpeed=" + processorSpeed +
                ", hasOS=" + hasOS +
                '}';
    }
}
