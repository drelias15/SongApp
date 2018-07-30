
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        Song s = new Song();
        s.setName("1999");
        s.setAlbum("1999");
        s.setArtist("Prince");
        s.setRating(10);


          System.out.printf("The song name was %s\n", s.getName());
          System.out.printf("The artist name is %s\n", s.getArtist());
          System.out.printf("The album name is %s\n", s.getAlbum());
          System.out.printf("The rating was %s and the year it came out was %s\n",s.getRating(), s.getYear() +"\n");

        ArrayList<Song> mySongs = new ArrayList<>();
        mySongs.add(s);

        Song s2 = new Song();
        s2.setName("1990");
        s2.setAlbum("1990");
        s2.setArtist("MJ");
        s2.setRating(10);

        mySongs.add(s2);

        for(Song str: mySongs){
            System.out.println(str);
        }

    }
}
