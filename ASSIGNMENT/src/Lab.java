public class Lab {
    private String labID;
    String[] computer={"one","two","three"};
    private Labstatus status;
private Employee labattendant;

Lab(String labID,Labstatus status,Employee labattendant){
    this.labID=labID;
    this.status=status;
    this.labattendant=labattendant;
}

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Employee getLabattendant() {
        return labattendant;
    }

    public Labstatus getStatus() {
        return status;
    }

    public void setComputer(Computer[] computer) {
        this.computer = computer;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabattendant(Employee labattendant) {
        this.labattendant = labattendant;
    }

    public void setStatus(Labstatus status) {
        this.status = status;
    }
    public void addComputer(Computer computer) {

        if (computer == null) {
            computer = new Computer[5];
            computer[0] = computer;
        } else {
            for (int i = 0; i < computer.length; i++) {
                if (computer[i] == null) {
                    computer[i] = computer;
                    break;
                }
            }
        }

    }
    }
}
