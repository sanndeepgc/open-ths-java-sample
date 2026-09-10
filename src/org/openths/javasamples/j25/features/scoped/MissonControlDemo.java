package org.openths.javasamples.j25.features.scoped;

public class MissonControlDemo {
    void main(){

        MissionControl missionControl = new MissionControl("INDIA","ISRO");

        ScopedValue.where(MissionControl.CLEARANCE, "PUBLIC").run(() ->{
            missionControl.launchRocket(5000);
        });

        ScopedValue.where(MissionControl.CLEARANCE, "CONFIDENTIAL").run(() ->{
            missionControl.launchRocket(1000);
        });

        System.out.println(MissionControl.CLEARANCE.orElse("No launches"));

        ScopedValue.where(MissionControl.CLEARANCE, "SECRET").run(() ->{
            missionControl.launchRocket(2000);
        });

        ScopedValue.where(MissionControl.CLEARANCE, "TOP_SECRET").run(() ->{
            missionControl.launchRocket(500);
        });

    }
}
