package advanced.oop.story.stefania;

import com.sda.advanced.oop.story.skills.Developer;
import com.sda.advanced.oop.story.women.FinancialSecurity;
import com.sda.advanced.oop.story.women.Love;
import com.sda.advanced.oop.story.women.Woman;

public class Stefania extends Woman implements Developer {

    public Stefania(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    @Override
    public void feel() {
        System.out.println("Feeling: I'm shy and I don't like to be in the spotlight. Stop looking at me!");
    }

    @Override
    public void dream() {
        System.out.println("Dreaming: Some day I will own the prettiest clothing brand.");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing: Is it class time yet? Nah... This bed is so comfy.");
    }

    @Override
    public void develop() {
        System.out.println("Developing: Easy peasy lemon squeezy!");
    }
}
