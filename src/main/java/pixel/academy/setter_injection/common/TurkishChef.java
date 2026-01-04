package pixel.academy.setter_injection.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class TurkishChef implements Chef {

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab";
    }
}
