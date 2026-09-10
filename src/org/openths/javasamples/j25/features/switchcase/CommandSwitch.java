package org.openths.javasamples.j25.features.switchcase;

public class CommandSwitch {

  public String getCommandSwitchResponse(Object commandCode) {

    String output = null;
    switch (commandCode) {
      case null:
        output = "No command Provided";
        break;

      case Float f:
        output = "Start Engine";
        break;
      case Integer i:
        output = "Opening Doors";
        break;
      case String str:
        output = "Turning on lighst";
        break;
      default:
        output = "Stop Engine";
    }

    return output;
  }

  // java 17+ yield switch
  public String getCommandYieldResponse(Object commandCode) {

     String output  = switch (commandCode) {
          case null:
              yield "No command Provided";
          case Float f:
              yield "Start Engine";
          case Integer i:
              yield "Opening Doors";
          case String str:
              yield "Turning on lighst";
          default:
              yield "Stop Engine";
      };
    return output;
  }

    public String getCommandSwitchArrowResponse(Object commandCode) {

        return switch (commandCode) {
            case null -> "No command Provided";
            case Float f -> "Start Engine";
            case Integer i -> "Opening Doors";
            case String str -> "Turning on lighst";
            default -> "Stop Engine";
        };

    }
}
