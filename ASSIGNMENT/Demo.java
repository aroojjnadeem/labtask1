public class Demo
{
    public class Demo {
        public static void main(String[] args) {

            Computer c1 = new Computer("C001", "LCD-001", 8, 512, true);
            Computer c2 = new Computer("C002", "LCD-002", 16, 1024, false);

            Employee labAttendant = new Employee("E001", "John Doe");

            Lab lab1 = new Lab("L001", new Computer[]{c1, c2}, LabStatus.OPERATIONAL, labAttendant);

            University university = new University();
            university.addLab(lab1);

            university.fetchLabDetails("L001");
            university.fetchComputerDetails("L001", "C001");
        }
}
