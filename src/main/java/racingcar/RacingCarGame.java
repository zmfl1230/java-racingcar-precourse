package racingcar;
import java.util.ArrayList;
import java.util.StringTokenizer;

import camp.nextstep.edu.missionutils.Console;
public class RacingCarGame  implements Game {
    ArrayList<Car> racingCars;
    int numberOfTrial;

    final int MAXIMUM_LENGTH = 5;

    @Override
    public void play() {

    }

    private String getRacingCarsNameFromUser() {
        return Console.readLine();
    }

    private StringTokenizer splitByMark(String neededToSplit, String delimiter) {
        return new StringTokenizer(neededToSplit, delimiter);
    }

    private boolean checkMoreThanMaximumLength(String neededToCheck) {
        return neededToCheck.length() <= MAXIMUM_LENGTH;
    }

    private Car createRacingCarEntity(String carName) {
        return new Car(carName);
    }

    private void addRacingCarEntity(Car car) {
        racingCars.add(car);
    }

    private int getNumberOfTrialFromUser() {
        return Integer.parseInt(Console.readLine());
    }

    private boolean checkValidTrialNumber(String trial) {
        for (int index = 0; index < trial.length(); index++) {
            if (!Character.isDigit(trial.charAt(index))) {
                // TODO: 예러 발생
                return false;
            }
        }
        return true;
    }

    private void setNumberOfTrial(int trial) {
        numberOfTrial = trial;
    }


}
