package pixel.academy.setter_injection.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection.common.Chef;

@RestController
public class DemoController {

    private Chef myChef;
    private Chef secondChef;
    //constructor injection
    @Autowired
    public DemoController(@Qualifier("frenchChef") Chef theChef,
                          @Qualifier("frenchChef") Chef theSecondChef) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myChef = theChef;
        secondChef =theSecondChef;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);
    }
    //setter injection
//
//    @Autowired
//    public void setMyChef(Chef theChef){
//        myChef = theChef;
//    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
