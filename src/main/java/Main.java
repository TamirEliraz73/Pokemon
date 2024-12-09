import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;

/**
 * Class Main
 *
 * @author Tamir Eliraz
 */
public class Main {
    public static void main(String[] args) {
        new Lwjgl3Application(new ApplicationAdapter() {
            @Override
            public void create() {
                super.create();
            }
        });
    }
}
