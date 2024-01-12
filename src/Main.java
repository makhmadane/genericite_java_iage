import enumumeration.ClasseEnum;
import model.Etudiant;
import model.Note;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
         Etudiant etudiant = new Etudiant("FALL","Abdou",
                 1998,"abdou@gmail.com", ClasseEnum.M1);

        List<Integer> list = new ArrayList<Integer>();

        Note<Double> note = new Note<>();
    }
}