import java.util.Locale;
import java.util.ResourceBundle;

public class DemoInternationalization {

	public static void main(String[] args) {
		// i18n demo
		Locale Loc = new Locale("hi","in"); 
		ResourceBundle bundle = ResourceBundle.getBundle("Greeting",Loc);
		System.out.println(bundle.getString("message"));

	}

}
