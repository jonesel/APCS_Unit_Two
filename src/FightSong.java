public class FightSong {


    /*
    This method is static, which means you don't need to make a new instance of FightSong in order to use it.
    It is also void, which means it does not return any information. It should be marked private so that it can
    only be used in this class. Since I need to access it for testing purposes, it must be public.
     */
    public static void goTeam() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void theBest() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
    public static void space()
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        goTeam();
        space();
        goTeam();
        theBest();
        goTeam();
        space();
        goTeam();
        theBest();
        goTeam();
        space();
        goTeam();


    }
}






