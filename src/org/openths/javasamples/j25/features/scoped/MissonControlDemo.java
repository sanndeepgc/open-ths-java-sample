package org.openths.javasamples.j25.features.scoped;

import java.util.concurrent.CompletableFuture;

public class MissonControlDemo {
  void main() {

    MissionControl indianMissionControl = new MissionControl("INDIA", "ISRO");
    MissionControl ussrMissionControl = new MissionControl("USSR", "TsUP");
    MissionControl usaMissionControl = new MissionControl("USA", "MCC-H");

    CompletableFuture<Void> usaFuture =
        CompletableFuture.runAsync(
                () -> {
                  ScopedValue.where(usaMissionControl.CLEARANCE, "TOP SECRET")
                      .run(
                          () -> {
                            System.out.println("USA MCC-H  clearance will be ready in 5 seconds.");
                            try {
                              Thread.sleep(5000);
                              usaMissionControl.launchRocket("USA-TSEC-1", 10000);

                            } catch (InterruptedException e) {
                              throw new RuntimeException(e);
                            }
                          });
                })
            .thenRun(
                () -> {
                  System.out.println("usaMissionControl is complete");
                });

    CompletableFuture<Void> indiaFuture =
        CompletableFuture.runAsync(
                () -> {
                  ScopedValue.where(indianMissionControl.CLEARANCE, "PUBLIC")
                      .run(
                          () -> {
                            indianMissionControl.launchRocket("MISSION-MANGAL", 5000);
                          });
                  ScopedValue.where(indianMissionControl.CLEARANCE, "SECRET")
                      .run(
                          () -> {
                            indianMissionControl.launchRocket("CHANDRAYAAN-I", 25000);
                          });
                  ScopedValue.where(indianMissionControl.CLEARANCE, "SECRET")
                      .run(
                          () -> {
                            indianMissionControl.launchRocket("CHANDRAYAAN-II", 25000);
                          });
                })
            .thenRun(
                () -> {
                  System.out.println(
                      String.format(
                          "%s is complete", indianMissionControl.getMissionControlName()));
                });

    CompletableFuture<Void> ussrFuture =
        CompletableFuture.runAsync(
                () -> {
                  ScopedValue.where(ussrMissionControl.CLEARANCE, "USSR PUBLIC")
                      .run(
                          () -> {
                            ussrMissionControl.launchRocket("CONFIDENTIAL-01", 5000);
                          });
                })
            .thenRun(
                () -> {
                  System.out.println("ussrMissionControl is complete");
                });

    CompletableFuture.allOf(ussrFuture, usaFuture, indiaFuture).join();
  }
}
