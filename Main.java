import java.io.*;
public class Main {

    public static void main(String[] args) {
        Cviews cv = new Cviews();

        CModels cm = new CModels();

        new cController(cm, cv);
    }
}
