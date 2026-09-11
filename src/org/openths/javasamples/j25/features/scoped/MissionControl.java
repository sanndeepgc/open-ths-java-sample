package org.openths.javasamples.j25.features.scoped;

import java.time.LocalDateTime;

public class MissionControl {

    public  final ScopedValue<String> CLEARANCE = ScopedValue.newInstance();
    private final String missionControlName;
    private final String countryName;

    private String clearanceLevel;
    private LocalDateTime clearanceDateTime;
    private String launchName;

    MissionControl( String countryName, String missionControlName){
        this.countryName = countryName;
        this.missionControlName = missionControlName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getMissionControlName() {
        return missionControlName;
    }

    public String getLaunchName() {
        return launchName;
    }

    public void launchRocket(String launchName, long milliseconds){
        String missionControlNameandCountry = String.format("%s, %s",  missionControlName, countryName);

        try {
            this.launchName = launchName;
            clearanceLevel = CLEARANCE.get();
            clearanceDateTime = LocalDateTime.now();

            IO.println(String.format("%s: Clearance level is: %s, started at %s", missionControlNameandCountry, clearanceLevel, clearanceDateTime));
            System.out.println("%s: ***************************************->");
            Thread.sleep(milliseconds);
            IO.println(String.format("%s: Clearance level is: %s, ended at %s", missionControlNameandCountry, clearanceLevel, clearanceDateTime));
            System.out.println("%s: --------------------------------------->");
        } catch (InterruptedException e) {
            IO.println(String.format("%s: Clearance level is: %s, failure at %s, cause: %s", missionControlNameandCountry, clearanceLevel, clearanceDateTime, e.getMessage()));
            throw new RuntimeException(e);
        }

    }
}
