import java.util.Objects;

public class Computer {
    private String computerNumber;
    private String IcdModel;
    private int ramSize;
    private int hddSize;
    boolean hasGPU=false;

    Computer(String computerNumber,String IcdModel,int ramSize,int hddSize){
        this.computerNumber=computerNumber;
         this.IcdModel=IcdModel;
         this.ramSize=ramSize;
         this.hddSize=hddSize;

    }

    public int getHddSize() {
        return hddSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ramSize == computer.ramSize && hddSize == computer.hddSize && hasGPU == computer.hasGPU && Objects.equals(computerNumber, computer.computerNumber) && Objects.equals(IcdModel, computer.IcdModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerNumber, IcdModel, ramSize, hddSize, hasGPU);
    }
    public Computer clone(){
        return new Computer(this.getComputerNumber(),this.getIcdModel(),this.getRamSize(),this.getHddSize());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber='" + computerNumber + '\'' +
                ", IcdModel='" + IcdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
    public void compInfo(){
        System.out.println("the computernumber is "+ getComputerNumber());
        System.out.println("the modelno is "+ getIcdModel());
    }

}
