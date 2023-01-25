package svjat.test;


public class StartPoint {
    public static void main(String[] args) {

        Man man = new Man();
        man.speak();

        Woman woman = new Woman();
        woman.speak();
        System.out.println(man.equals(woman));
        boolean manWomen = (man.equals(woman) );
        System.out.println(manWomen);

        if (man instanceof Human){
            System.out.println("I'm Human");
        }
        if (woman instanceof Human){
            System.out.println("I'm not Man");
        }
    }

}
