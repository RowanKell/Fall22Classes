public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] pointsArray = new int[matches.length];
        //Loop through home teams
        // i is home team
        for (int i = 0; i < matches.length; i++) {
            //Loop through home team's home games
            // j is away team
            for (int j = 0; j < matches[i].length(); j++) {
                if(i == j) {
                    continue;
                }
                else if(matches[i].charAt(j) == 'W') {
                    pointsArray[i] += 3;
                }
                else if(matches[i].charAt(j) == 'L') {
                    pointsArray[j] += 3;
                }
                else if(matches[i].charAt(j) == 'D') {
                    pointsArray[i] += 1;
                    pointsArray[j] += 1;
                }
            }
        }
        return pointsArray;
    }
}
