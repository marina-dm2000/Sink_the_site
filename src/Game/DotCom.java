package Game;

public class DotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";
        for (int locationCell : locationCells) {
            //Сравниваем ход пользователя с местоположением клетки
            if (guess == locationCell) {
                numOfHits++;
                //Выясняем, была ли это последняя ячейка
                if (numOfHits == locationCells.length) {
                    result = "Потопил";
                } else {
                    result = "Попал";
                }
                break;
            }
        }

        System.out.println(result);
        return result;
    }
}
