public class ProjectTest{
    public static void main(String[] args){
        Project pr = new Project();
        pr.setName("Project1");
        pr.setDescription("This is the first description");
        System.out.println(pr.elevatorPitch());
        Project pr2 = new Project("Project2");
        pr2.setDescription("This is the second description");
        System.out.println(pr2.elevatorPitch());
        Project pr3 = new Project("Project3", "This is the third description");
        System.out.println(pr3.elevatorPitch());
    }
}