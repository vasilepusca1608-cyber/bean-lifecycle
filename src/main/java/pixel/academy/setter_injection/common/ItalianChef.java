package pixel.academy.setter_injection.common;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    public ItalianChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pompdoro with fresh tomatoes and basil!";
    }
}
