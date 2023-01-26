package svjat.test;


public class StartPoint {
    public static void main(String[] args) {
        Human man = new Man();
        man.speak();
        Human woman = new Woman();
        woman.speak();

        //  System.out.println(man.equals(woman));  тренировка не более того
        boolean manWomen = (man.equals(woman));
        System.out.println(manWomen);

        if (man instanceof Human) {
            System.out.println("I'm Human");
        }
        if (woman instanceof Man) {
        } else {
            System.out.println("I'm not Man");
        }
        if (!man.getClass().equals(woman.getClass())){
            System.out.println("I'm ");
        }
    }

}
