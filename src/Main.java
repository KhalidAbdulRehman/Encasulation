
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot Here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot()
    {
        return "Sharks eats people";
    }
}
class Independence extends Movie{
    public Independence() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Some Aliens story my online professor likes";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Another Alien crazy movie i do not know about";
    }
}
class Forgettable extends Movie{
    public Forgettable()
    {
        super("Forgettable");
    }
    //No plot method
}
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " +movie.getName() + "\n" + " Plot: " + movie.plot() + "\n" );

        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5)+1;
        // random() generates number between 0.1 to 0.9 multiplying with 5 gives a number between 1 & 4 thus adding 1 to make it between 1 & 5
        System.out.println("Random number was generated : "+randomNumber);
        switch (randomNumber) {
            case 1:
                return new Independence();
            case 2:
                return new Jaws();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
        }
    }



