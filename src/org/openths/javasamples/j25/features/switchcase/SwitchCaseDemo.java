import org.openths.javasamples.j25.features.switchcase.CommandSwitch;
import static java.lang.IO.*;


void main(){
    println("bbb");
    run();
    this.runMe();
}

void main(String args []){
    println("äaa");
    run();
    this.runMe();
}

void runMe(){
  println("Yes, chalo!");
}
public static void run(){
    System.out.println("Hello Welcome to the Java 25 style of main() demo");

    org.openths.javasamples.j25.features.switchcase.CommandSwitch commandSwitch = new CommandSwitch();
    println(commandSwitch.getCommandSwitchResponse(25));
    println(commandSwitch.getCommandSwitchResponse(25.0f));
    println(commandSwitch.getCommandSwitchResponse("ABC"));
    println(commandSwitch.getCommandSwitchResponse(null));

    println(commandSwitch.getCommandYieldResponse(25));
    println(commandSwitch.getCommandYieldResponse(25.0f));
    println(commandSwitch.getCommandYieldResponse("ABC"));
    println(commandSwitch.getCommandYieldResponse(null));
}

